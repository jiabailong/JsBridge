package com.github.lzyzsd.jsbridge;

public class DefaultHandler implements BridgeHandler {

    static final String TAG = "DefaultHandler";

    @Override
    public void handler(String data, CallBackFunction function) {
        if (function != null) {
            function.onCallBack("DefaultHandler response data");
        }
    }

}
