package Utilities;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.TestListenerAdapter;

public class Listeners extends TestListenerAdapter implements ITestListener {

    private String getNowDateAndTime() {
        LocalDateTime myDateObj = LocalDateTime.now();
        DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("dd/MM/yy HH:mm:ss");
        return myDateObj.format(myFormatObj);
    }

    public void onTestStart(ITestResult test) {
        System.out.println("--------------- Test: " + test.getName() + ", started at: " + getNowDateAndTime() + " -------------------");
    }

    public void onTestSuccess(ITestResult test) {
        System.out.println("--------------- Test: " + test.getName() + ", ended at: " + getNowDateAndTime() + " and PASSED!-------------------");
    }

    public void onTestFailure(ITestResult test) {
        System.out.println("--------------- Test: " + test.getName() + ", ended at: " + getNowDateAndTime() + " and FAILED!-------------------");
    }
}
