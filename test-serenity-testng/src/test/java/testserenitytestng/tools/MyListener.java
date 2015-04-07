package testserenitytestng.tools;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

/**
 * Created by rusu on 3/20/15.
 */
public class MyListener implements ITestListener {

    @Override
    public void onTestStart(ITestResult iTestResult) {
        System.out.println("I am on test start...");

    }

    @Override
    public void onTestSuccess(ITestResult iTestResult) {
        System.out.println("Started: " + iTestResult.getStartMillis());
        System.out.println("Finished: " + iTestResult.getEndMillis());
    }

    @Override
    public void onTestFailure(ITestResult iTestResult) {
        System.out.println("Failed :(");
    }

    @Override
    public void onTestSkipped(ITestResult iTestResult) {

    }

    @Override
    public void onTestFailedButWithinSuccessPercentage(ITestResult iTestResult) {

    }

    @Override
    public void onStart(ITestContext iTestContext) {
        System.out.println("What's different? " + iTestContext.getSuite().getName());
    }

    @Override
    public void onFinish(ITestContext iTestContext) {
        System.out.println("What's different on finish? " + iTestContext.getAllTestMethods().length);

    }
}
