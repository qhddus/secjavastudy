package f.niosecond;

import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class FilesManager {
	public static void main(String args[]) {
		FilesManager sample=new FilesManager();
		String fileName="AboutThisBook.txt";
		Path fromPath=sample.writeAndRead(fileName);
		sample.copyMoveDelete(fromPath, fileName);
	}
	public List<String> getContents(){
		List<String> contents = new ArrayList<String>();
		contents.add("이 책은 저자의 6번째 책입니다.");
		contents.add("필자의 수년간의 자바 경험을 바탕으로 집필되었습니다.");
		contents.add("많은 분들에게 도움이 되면 좋겠습니다.");
		contents.add("책에대한 질문은 god@godofjava.com으로 문의 주시기 바랍니다.");
		contents.add("Current Date="+new Date());
		return contents;
	}
	//파일 쓰기
	public Path writeFile(Path path) throws Exception{
		Charset charset=Charset.forName("EUC-KR");
		List<String> contents=getContents();
		StandardOpenOption openOption=StandardOpenOption.CREATE;
		return Files.write(path, contents, charset, openOption);
	}
	//파일 읽기
	public void readFile(Path path) throws Exception{
		Charset charset=Charset.forName("EUC-KR");
		System.out.println("Path="+path);
		List<String> fileContents=Files.readAllLines(path,charset);
		for(String tempContents:fileContents) {
			System.out.println(tempContents);
		}
		System.out.println();
	}					//용량이 작은 경우에만 사용 크면 OutOfMemoryError라는 예외 발생
	//파일 읽고 쓰기
	public Path writeAndRead(String fileName) {
		Path returnPath=null;
		try {
			Path path=Paths.get(fileName);
			//Write a text file
			returnPath=writeFile(path);
			//Read written file
			System.out.println("******** Created file contents **********");
			readFile(returnPath);
		} catch(Exception e) {
			e.printStackTrace();
		}
		return returnPath;
	}
	//파일 복사/이동/삭제하기
	public void copyMoveDelete(Path fromPath,String fileName) {
		try {
			Path toPath=fromPath.toAbsolutePath().getParent();
			
			//Make a directory if it is not exist.
			Path copyPath=toPath.resolve("copied");
			if(!Files.exists(copyPath)) {
				Files.createDirectories(copyPath);
			}
			//Copy file
			Path copiedFilePath=copyPath.resolve(fileName);
			StandardCopyOption copyOption = StandardCopyOption.REPLACE_EXISTING;
			Files.copy(fromPath, copiedFilePath,copyOption);
			
			//Read file
			System.out.println("********Copied file contents *******");
			readFile(copiedFilePath);
			
			//Move file
			Path movedFilePath=Files.move(copiedFilePath, copyPath.resolve("moved.txt"), copyOption);
			
			//Delete files
			Files.delete(movedFilePath);
			Files.delete(copyPath);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
