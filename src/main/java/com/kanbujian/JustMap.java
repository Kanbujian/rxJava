package com.kanbujian;

import rx.Observable;
import rx.Observer;

/**
 * Created by kanbujian on 16-8-8.
 */
public class JustMap {

    public static void main(String[] args){


        // 从几个参数中创建Observable对象，并通过map改变Observable对象，设置Observer的三个函数
        Observable.just("葛莱芬多","赫夫帕夫","斯奈哲林","拉文克劳").map(str->str+="学院")
                .subscribe(new Observer<String>() {
                    @Override
                    public void onCompleted() {
                        System.out.println("分院帽之歌");


                    }

                    @Override
                    public void onError(Throwable throwable) {
                        System.out.println("Thers is something wrong !");
                    }

                    @Override
                    public void onNext(String s) {
                        System.out.println(s);
                    }
                });

    }


}
