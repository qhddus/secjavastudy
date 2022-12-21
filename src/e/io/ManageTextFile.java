package e.io;
import static java.io.File.separator;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Scanner;
import java.io.FileDescriptor;
import java.io.FileNotFoundException;
import java.io.FileReader;
public class ManageTextFile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ManageTextFile manager=new ManageTextFile();
		int numberCount=10;
		String fullPath=separator+"godofjava"+separator+"text"+separator+"numbers.txt";
		//manager.writeFile(fullPath,numberCount);
		//manager.readFile(fullPath);
		manager.readFileWithScanner(fullPath);
		
	}
	
	public void writeFile(String fileName,int numberCount) {
		FileWriter fileWriter=null;
		BufferedWriter bufferedWriter=null;
		try {
			fileWriter=new FileWriter(fileName,false);		//매개변수 true=붙여쓰기, false=덮어쓰기
			bufferedWriter=new BufferedWriter(fileWriter);
			for(int loop=0;loop<=numberCount;loop++) {
				bufferedWriter.write(Integer.toString(loop));
				bufferedWriter.newLine();
			}
			System.out.println("Write success!!!");
		} catch(IOException ioe) {
			ioe.printStackTrace();
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			if(bufferedWriter!=null) {
				try {
					bufferedWriter.close();
				} catch(IOException ioe) {
					ioe.printStackTrace();
				}
			}
			if(fileWriter!=null) {
				try {
					fileWriter.close();
				} catch(IOException ioe) {
					ioe.printStackTrace();
				}
			}
		}
	}
	
	public void readFile(String fileName) {
		FileReader fileReader=null;
		BufferedReader bufferedReader=null;
		try {
			fileReader=new FileReader(fileName);		//매개변수 true=붙여쓰기, false=덮어쓰기
			bufferedReader=new BufferedReader(fileReader);
			String data;
			while((data=bufferedReader.readLine())!=null) {
				System.out.println(data);
			}
			System.out.println("Read success!!!");
		} catch(IOException ioe) {
			ioe.printStackTrace();
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			if(bufferedReader!=null) {
				try {
					bufferedReader.close();
				} catch(IOException ioe) {
					ioe.printStackTrace();
				}
			}
			if(fileReader!=null) {
				try {
					fileReader.close();
				} catch(IOException ioe) {
					ioe.printStackTrace();
				}
			}
		}
	}

	public void readFileWithScanner(String fileName) {
		File file=new File(fileName);
		Scanner scanner=null;
		try {
			scanner=new Scanner(file);
			while(scanner.hasNextLine()) {
				System.out.println(scanner.nextLine());
			}
			System.out.println("read success!!!");
		} catch(FileNotFoundException fnfe) {
			fnfe.printStackTrace();
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			if(scanner!=null) {
				scanner.close();
			}
		}
		//String data = new String(Files.readAllBytes(Paths.get(fileName)));
		//Files클래스를 이용하면 위에 한줄로 파일을 읽을수 있다.
	}
}
