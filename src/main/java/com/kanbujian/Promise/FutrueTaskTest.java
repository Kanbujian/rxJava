package com.kanbujian.Promise;

import java.util.concurrent.*;

/**
 * Created by kanbujian on 16-8-8.
 */
public class FutrueTaskTest {
    public static void main (String[] args) throws ExecutionException, InterruptedException {
        // 得到执行器，此处用单线程执行
        ExecutorService executor= Executors.newSingleThreadExecutor();

        // FutrueTask 实现了Callable接口和Future接口,一个产生数据，一个接受数据
        FutureTask<byte[]> picFromNet=new FutureTask<byte[]>(new Callable<byte[]>() {
            @Override
            public byte[] call() throws Exception {
                Thread.sleep(5000);
                return new byte[0];
            }
        });
        executor.submit(picFromNet);
        // 调用Callable 的 call方法，阻塞线程
        System.out.println("msg time --> "+ picFromNet.get());
    }
}
