package com.automation.genericUtility.FileUtility;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertyUtiliy {
public String getPropertyValue(String key) throws Exception
{
	FileInputStream fps=new FileInputStream("./ConfigData/Login.Properties");
	Properties pobj=new Properties();
	pobj.load(fps);
	String data=pobj.getProperty(key);
	return data;
}
}
