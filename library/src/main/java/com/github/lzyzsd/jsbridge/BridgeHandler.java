package com.github.lzyzsd.jsbridge;

import android.content.Context;

/**
 * Created on 2019/12/10.
 * Author: smallbuer
 * BridgeHandler
 */
public interface BridgeHandler {

    public void handler(String data, CallBackFunction function);

}