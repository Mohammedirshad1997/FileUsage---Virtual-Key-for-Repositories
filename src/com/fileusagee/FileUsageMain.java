package com.fileusagee;

public class FileUsageMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
      FileOperations.createStorageFolderIfNotPresent("Storage");
		
		FileOptions.printWelcomeScreen("FileUsage", "Mohammed Irshad");
		
		FileHandleOptions.handleWelcomeScreenInput();


	}

}
