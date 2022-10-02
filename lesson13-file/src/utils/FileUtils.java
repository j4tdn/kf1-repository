package utils;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.Random;
import java.util.function.Function;
import java.util.stream.Collectors;


public class FileUtils {

	private FileUtils() {}
	
	public static <T> List<T> readFile(Path path, Function<String, T> f){
		List<String> lines = readFile(path);
		return lines.stream()
					.map(line -> f.apply(line))
					.collect(Collectors.toList());
	}
	
	public static List<String> readFile(Path path){
		List<String> lines = null;
		try {
			lines = Files.readAllLines(path);
		} catch (IOException e) {
			e.printStackTrace();
		}
		return lines;
	}
	public static <T> void writeObject(File file, List<T> list) {
		FileOutputStream fos = null;
		ObjectOutputStream oos = null;
		
		try {
			fos = new FileOutputStream(file);
			oos = new ObjectOutputStream(fos);
			
			oos.writeObject(list);
		} catch (Exception e) {
			
			e.printStackTrace();
		}
	}
	@SuppressWarnings("unchecked")
	public static <T> List<T> readObject(File file) {
		FileInputStream fis = null;
		ObjectInputStream ois = null;
		
		try {
			fis = new FileInputStream(file);
			ois = new ObjectInputStream(fis);
			
			return (List<T>) ois.readObject();
		} catch (Exception e) {
			
			e.printStackTrace();
		} finally {
			close(ois, fis);
		}
		return null;
	}
	public static <T> void writeFile(File file, List<T> ts,Function<T, String> func) {
		FileWriter fw = null;
		BufferedWriter bw = null;
		try {
			 fw = new FileWriter(file);
			 bw = new BufferedWriter(fw);
			 
			 List<String> lines = ts.stream()
						.map(t -> func.apply(t))
						.collect(Collectors.toList());
			for (String line : lines) {
				bw.write(line);
				bw.newLine();
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (fw != null) {
				close(bw, fw);
			}
		}
	}
	
	public static File createRandomFiles(String dirPath,int nof, String ... extensions) {
		Random rd = new Random();
		File dir = createNewDir(dirPath);
		for (int i = 0; i < nof; i++) {
			String ext = extensions[rd.nextInt(extensions.length)];
			String filename = "f" + System.currentTimeMillis() +rd.nextInt(100) + "e" + "." + ext;
			File file = createNewFile(dir, filename);
			System.out.println(
					file.isFile() ? "File" + file.getName() + "is created ..."
								  : "Cannot create file"
					);
		}
		return dir;
	}
	
	public static Path copy(String sourcePathName, String targetPathName) {
		Path source = Paths.get(sourcePathName);
		Path target = Paths.get(targetPathName);
		
		Path targetPath = null;
		try {
			targetPath = Files.copy(source, target.resolve(renameTo(source)));
		} catch (IOException e) {
			e.printStackTrace();
		}
		return targetPath;
	}
	public static File createNewFile(String pathname) {
		File file = new File(pathname);
		File parent = createNewDir(file.getParent());
		if (parent.isDirectory()) {
			if (!file.exists()) {
				try {
					file.createNewFile();
				} catch (IOException e) {
					e.printStackTrace();
				}
			} 
		
		}
		return file;
	}
	public static Path createNewFileAsPath(String pathname) {
		return createNewFile(pathname).toPath();
	}
	public static File createNewFile(File parent, String child) {
		return createNewFile(parent.getAbsoluteFile() + File.separator + child);
	}
	public static File createNewDir(String pathname) {
		File dir = new File(pathname);
		if (!dir.exists()) {
			boolean flag = dir.mkdirs();
			if (flag) {
				System.out.println("Folder " + dir.getName() + " created successfully");
			} else {
				System.out.println("Folder " + dir.getName() + " already existed");
			}
		}
		return dir;
	}
	public static Path createNewDirAsPath(String pathname) {
		return createNewDir(pathname).toPath();
	}
	public static Path renameTo(Path source) {
		String filename = source.toString();
		String renameTo = "rnf" + System.currentTimeMillis()
								+ new Random().nextInt(100)
								+ filename.substring(filename.lastIndexOf("."));
		return Paths.get(renameTo);
	}
	public static void close (AutoCloseable ... closables) {
		for (AutoCloseable closable : closables) {
			if (closable != null) {
				try {
					closable.close();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		}
	}
	
}
