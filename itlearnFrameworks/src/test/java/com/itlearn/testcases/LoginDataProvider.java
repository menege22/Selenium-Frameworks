package com.itlearn.testcases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.itlearn.pages.BaseClass;
import com.itlearn.pages.LoginPage;
import com.itlearn.utilities.Readexcelfile;



public class LoginDataProvider extends BaseClass {
	String fileName=System.getProperty("user.dir")+"\\Data\\TestData.xlsx";
		
	@Test(dataProvider="loginData")
		public void verify(String user,String pass) throws IOException
		{
			LoginPage lp=new LoginPage(driver);
			
			lp.loginPortal(user, pass);
			if(user.equals("Demo12") && pass.equals("Test123456$"))
			{
				Assert.assertTrue(true);
				lp.logout();
			}
			else
			{
				captureScreenShot(driver, "verify");
				Assert.assertTrue(false);
			}
			
		}
		
		@DataProvider
		public String [][] loginData()
		{
			int ttlRows= Readexcelfile.getRowCount(fileName, "Sheet1");
			int ttlColumns= Readexcelfile.getColCount(fileName, "Sheet1");
			
			String data[][]= new String[ttlRows-1][ttlColumns];
			
			for(int i=1;i<ttlRows;i++)
			{
				for(int j=0;j<ttlColumns;j++)
				{
					data[i-1][j]=Readexcelfile.getCellValue(fileName, "Sheet1", i, j);
				}
			}
			return data;
		}
}
