package com.kanbujian;


import rx.Observable;
import rx.functions.Action1;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by kanbujian on 16-8-2.
 */
public class HelloRxJava {


    public static void main (String[] args){
        List list=new ArrayList<String>();
        list.add("jay");
        list.add("nick");
        list.add("tom");

        System.out.println("开始设置订阅");
        sayHello(list);

        System.out.println("设置订阅完毕");
        //
        //list.add("new one");

    }

    /**
     * 从数组中创建Observable对象，检测
     * @param names
     */
    public static void sayHello(List names){
        Observable.from(names).subscribe(new Action1<String>() {
            public void call(String s) {
                System.out.println("my name is  " + s);
            }
        }, new Action1<Throwable>() {
            public void call(Throwable throwable) {
                System.out.println("There is some thing wrong ! " );
            }
        });

        //names.add("two one");
    }
}
