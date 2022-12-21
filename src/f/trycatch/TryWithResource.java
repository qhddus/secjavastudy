package f.trycatch;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class TryWithResource {
	public void scanFile(String fileName, String encoding) {
		Scanner scanner = null;
		try {
			scanner = new Scanner(new File(fileName),encoding);
			System.out.println(scanner.nextLine());
		} catch(IllegalArgumentException iae) {
			iae.printStackTrace();		//인코딩타입이 존재하지않을경우 ( 한글일때 중요)
		} catch(FileNotFoundException ffe) {
			ffe.printStackTrace();		//파일이 존재하지 않을 경우
		} catch(NullPointerException npe) {
			npe.printStackTrace();		//파일명이나 인코딩타입이 NULL일경우
		} catch(Exception e) {
			e.printStackTrace();		//예외가 발생할경우
		} finally {
			if(scanner!=null) {
				scanner.close();
			}
		}
	}
	public void newScanFile(String fileName,String encoding) {
		Scanner scanner = null;
		try {
			scanner = new Scanner(new File(fileName),encoding);
			System.out.println(scanner.nextLine());
		} catch(IllegalArgumentException | FileNotFoundException | NullPointerException exception) {
			exception.printStackTrace();
		} finally {
			if(scanner!=null) {
				scanner.close();
			}
		}
	}
	public void newScanFileTryWithResource(String fileName,String encoding) {
		try(Scanner scanner = new Scanner(new File(fileName),encoding)){
			System.out.println(scanner.nextLine());
		} catch(IllegalArgumentException | FileNotFoundException | NullPointerException exception) {
			exception.printStackTrace();
		}
	}
}
