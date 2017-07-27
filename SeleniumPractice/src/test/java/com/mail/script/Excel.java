package com.mail.script;

import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.WorkbookFactory;





public class Excel 
{

	public static void main(String[] args) 
	{
		
	}
	
	public static void setData(String xlpath,String SheetName,int rownum,int colnum,String data)
	{
		try
		{
			FileInputStream fi=new FileInputStream(xlpath);
			//WorkbookFactory.create(fi);
			
		}
		catch(Exception e)
		{
			System.out.println();
		}
	}

}
