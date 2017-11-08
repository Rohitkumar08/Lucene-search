package com.LucenePrac;

import java.io.File;
import java.io.FileFilter;

public class TextFileFilter implements FileFilter{

	public boolean accept(File pathname) {
		// TODO Auto-generated method stub
		
		return pathname.getName().endsWith(".txt");
	}

	
	
	
}
