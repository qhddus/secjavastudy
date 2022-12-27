package f.niosecond;

import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.Files;

public class PathsAndFiles {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PathsAndFiles sample = new PathsAndFiles();
		String dir="C:\\develop\\eclipse\\eclipse_work\\secjavastudy";
		//sample.checkPath(dir);
		String dir2="C:\\WINDOWS";
		sample.checkPath2(dir, dir2);
	}
	public void checkPath(String dir) {
		Path path=Paths.get(dir);
		System.out.println(path.toString());
		System.out.println("getFileName():"+path.getFileName());
		System.out.println("getNameCount()"+path.getNameCount());
		System.out.println("getParent()"+path.getParent());
		System.out.println("getroot()"+path.getRoot());
	}
	public void checkPath2(String dir1,String dir2) {
		Path path=Paths.get(dir1);
		Path path2=Paths.get(dir2);
		Path relativized=path.relativize(path2);
		System.out.println("relativized path="+relativized);
		Path absolute=relativized.toAbsolutePath();
		System.out.println("toAbsolutePath path="+absolute);
		Path normalized=absolute.normalize();
		System.out.println("normalized path="+normalized);
		
		Path resolved=path.resolve("godofjava");
		System.out.println("resolved path="+resolved);
	}

}
