package aqa_hw_6.listeners;

import org.testng.ITestListener;
import org.testng.ITestResult;

public class TestListener implements ITestListener {
    @Override
    public void onTestStart(ITestResult result) {
        System.out.println("The test " + result.getName() + " started");
    }

    @Override
    public void onTestSuccess(ITestResult result) {
        System.out.println("The test " + result.getName() + " has been successfully finished");
    }

    @Override
    public void onTestFailure(ITestResult result) {
        System.out.println("The test " + result.getName() + " has failed");
    }
}
