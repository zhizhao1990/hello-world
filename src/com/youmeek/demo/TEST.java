package com.youmeek.demo;

/**
 * Created by ucmed on 2017/2/22.
 */
public class TEST {
    private static TEST ourInstance = new TEST();

    public static TEST getInstance() {
        return ourInstance;
    }

    private TEST() {
    }
}
