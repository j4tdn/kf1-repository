package file.structure;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

import utils.FileUtils;

public class Ex03FileUpload {
	private static String sourcePathname = String.join(File.separator, 
			"storage", "template", "image", "flowerImg.jfif");
	private static String targetPathname = String.join(File.separator, 
			"storage", "template", "upload");
	
	public static void main(String[] args) {
		File sourceFile = new File(sourcePathname);
		File targetFile = FileUtils.createNewDir(targetPathname);
		
		Path source = sourceFile.toPath();
		Path target = targetFile.toPath();
		try {
			Files.copy(source, target.resolve(sourceFile.getName()));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
