package e.io;

import java.io.File;

public class FileFilterSample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FileFilterSample sample = new FileFilterSample();
		String pathName=File.separator+"godofjava"+File.separator+"text";
		sample.checkList(pathName);
	}
	public void checkList(String pathName) {
		File file;
		try {
			file= new File(pathName);
			//File []mainFileList=file.listFiles();					//파일을 객체로 리턴
			File []mainFileList=file.listFiles(new JPGFilenameFilter());	//매개변수로 String만 받아서 .jpg로 끝나는지만 확인 그래서 디렉토리인지 파일인지 확인 불가
			for(File tempFile:mainFileList) {
				System.out.println(tempFile.getName());
			}
		} catch(Exception e) {
			e.printStackTrace();
		}
	}

}
