package com.steven.future.demo3;

/**
 * Created by Steven on 2017/6/11.
 */
public class Client {

    public Data request(final String queryStr){
        final FutureData future = new FutureData();
        //开启一个新的线程来构造真实数据
        new Thread(){
            public void run(){
                RealData realData = new RealData(queryStr);
                future.setRealData(realData);           }
        }.start();
        return future;
    }

}
