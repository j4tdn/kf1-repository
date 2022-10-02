package file.structure;

import java.io.File;

public class Ex02DirCreator {
	private static String pathname = "structure\\data";
	public static void main(String[] args) {
		//structure\\data --> mkdirs
		// data --> mkdir, mkdirs
		File dir = new File(pathname);
		if (!dir.exists()) {
			dir.mkdirs();
		} else {
			System.out.println("Dir " + dir.getName() + " existed !!!");
		}
	}
}
