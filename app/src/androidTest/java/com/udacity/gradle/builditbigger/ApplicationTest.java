package com.udacity.gradle.builditbigger;

import android.app.Application;
import android.test.ApplicationTestCase;
import android.text.TextUtils;

import java.util.concurrent.CountDownLatch;

/**
 * <a href="http://d.android.com/tools/testing/testing_android.html">Testing Fundamentals</a>
 */
public class ApplicationTest extends ApplicationTestCase<Application> {
    String mTestJoke=null;
    CountDownLatch mSignal = null;
    public ApplicationTest() {
        super(Application.class);
    }

    @Override
    protected void setUp() throws Exception {
        super.setUp();
        mSignal = new CountDownLatch(1);
    }
    @Override
    protected void tearDown() throws Exception {
        mSignal.countDown();
    }
    public void testEndpointsAsyncTask() throws InterruptedException {

        EndpointsAsyncTask task = new EndpointsAsyncTask(new OnFetchJokeListener() {
            @Override
            public void onJokeFetched(String joke) {
                mTestJoke=joke;
                mSignal.countDown();
            }
        });
        task.execute();
        mSignal.await();
        assertFalse(mTestJoke==null);
        assertFalse(TextUtils.isEmpty(mTestJoke));

    }
}