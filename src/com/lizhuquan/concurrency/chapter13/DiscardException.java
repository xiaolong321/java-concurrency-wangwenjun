package com.lizhuquan.concurrency.chapter13;

/**
 * Created by lizhuquan on 2018/3/20.
 */
public class DiscardException extends RuntimeException {
    public DiscardException(String message) {
        super(message);
    }
}
