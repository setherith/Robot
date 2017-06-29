package misc;

import java.io.File;

public class Version {

	public static String GetPackageInfo(String path) {
		String thisPath = Version.class.getProtectionDomain().getCodeSource().getLocation().getPath();
		File thisFolder = new File(thisPath);
		File parentFolder = new File(thisFolder.getParent());
		
		// for-each file in parent folder, find package data file
		
		return "Package";
	}
	
	public static String GetPackageVersion(String module) {
		
		return "unknown";
	}
}
