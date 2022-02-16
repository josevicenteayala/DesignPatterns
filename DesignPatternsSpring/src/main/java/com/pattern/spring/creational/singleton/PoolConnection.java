package com.pattern.spring.creational.singleton;

import java.util.Objects;

public class PoolConnection implements Pool{
    private static PoolConnection poolConnection;

    private PoolConnection(){
        super();
    }

    public static PoolConnection getInstance(){
        if(Objects.isNull(poolConnection)){
            synchronized (PoolConnection.class){
                if(Objects.isNull(poolConnection)){
                    poolConnection = new PoolConnection();
                }
            }
        }
        return poolConnection;
    }

}
