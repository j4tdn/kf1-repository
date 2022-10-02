package file.structure;

import java.io.File;

import utils.FileUtils;

public class Ex01FileCreator {
	private static String separator = File.separator;
	private static String pathname = "storage" 
						+ separator + "data"
						+ separator + "content.txt";

	public static void main(String[] args) {
		File file = FileUtils.createNewFile(pathname);
		
	}
}
