package com.actitime.testscript;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.actitime.generic.BaseClass;

public class CreateTask {
	@Listeners(com.actitime.generic.ListenerImplementation.class)
	public class TaskModule extends BaseClass{
		
		@Test(invocationCount = 1)
		public void testCreateTasks() throws EncryptedDocumentException, IOException, InterruptedException
		{
			Reporter.log("Create Tasks",true);
			
			HomePage h = new HomePage(driver);
			h.getTimeTrackTab().click();
			
			FileLib f = new FileLib();
			String task1Name = f.getExcel("CreateTasks", 3, 1);
			String task2Name = f.getExcel("CreateTasks", 3, 2);
			String task3Name = f.getExcel("CreateTasks", 3, 3);
			
			TimeTrackPage t = new TimeTrackPage(driver);
			t.getAddNewTaskBtn().click();
			Thread.sleep(1000);
			t.getSelectCustomerDropDown().click();
			t.getHdfcCustomerOption().click();
			t.getSelectProjectDropDown().click();
			t.getBankingProjectOption().click();
			
			t.getTask1Tf().sendKeys(task1Name);
			t.getTask1SetDeadLineCalender().click();
			t.getTask1DeadLineIs().click();
			t.getTask1TypeOfWorkBtn().click();
			t.getTask1WorkTypeIs().click();
			
			/*t.getTask2Tf().sendKeys(task2Name);
			t.getTask2SetDeadLineCalender().click();
			Thread.sleep(1000);
			t.getTask2DeadLineIs().click();
			Thread.sleep(1000);
			t.getTask2TypeOfWorkBtn().click();
			Thread.sleep(1000);
			t.getTask2WorkTypeIs().click();
			
			t.getTask3Tf().sendKeys(task3Name);
			t.getTask3SetDeadLineCalender().click();
			t.getTask3DeadLineIs().click();
			t.getTask3TypeOfWorkbtn().click();
			t.getTask3WorkTypeIs().click();
			*/
			
			t.getCreateTasksButton().click();
			Thread.sleep(1000);
		}
		
		@Test(invocationCount = 0)
		public void testDeleteTasks() throws EncryptedDocumentException, IOException, InterruptedException
		{
			Reporter.log("delete Tasks",true);
			
			HomePage h = new HomePage(driver);
			h.getTimeTrackTab().click();
			
			TimeTrackPage t = new TimeTrackPage(driver);
			t.getOpenAccountTask().click();
			Thread.sleep(1000);
			t.getOpenAccountDeleteBtn().click();
			t.getOpenAccountPermanentDeleteBtn().click();
			Thread.sleep(1000);
			
		}


	}

}
