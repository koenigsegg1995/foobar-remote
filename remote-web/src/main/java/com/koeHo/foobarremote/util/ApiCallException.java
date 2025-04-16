package com.koeHo.foobarremote.util;

/**
 * 當 API 呼叫異常
 */
public class ApiCallException extends RuntimeException {

    /**
     * 空建構子
     */
    public ApiCallException(){}

    /**
     * @param message
     *          Stirng 錯誤訊息
     */
    public ApiCallException(String message){
        super(message);
    }

    /**
     *
     * @param message
     *          String 錯誤訊息
     * @param cause
     *          Throwable 例外
     */
    public ApiCallException(String message, Throwable cause){
        super(message, cause);
    }

}
