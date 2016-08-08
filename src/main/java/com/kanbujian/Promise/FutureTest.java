package com.kanbujian.Promise;

import java.util.concurrent.*;

/**
 * Created by kanbujian on 16-8-8.
 */
public class FutureTest {
    public static void main (String[] args) throws ExecutionException, InterruptedException {
        // 得到执行器，此处用单线程执行
        ExecutorService executor= Executors.newSingleThreadExecutor();

        System.out.println("begin time --> "+ System.currentTimeMillis());

        // 执行callable 接口,可以返回值
        Future<String> delayMsg=executor.submit(new Callable<String>() {
            @Override
            public String call() throws Exception {
                Thread.sleep(5000);
                return "I am sleeping(blocking) 5000 seconds";
            }
        });
        // 如果调用future对象的get()方法，将会锁定线程，知道计算完成，数据返回
        System.out.println("msg time --> "+ delayMsg.get());
        System.out.println("enb time --> "+ System.currentTimeMillis());
    }
}
