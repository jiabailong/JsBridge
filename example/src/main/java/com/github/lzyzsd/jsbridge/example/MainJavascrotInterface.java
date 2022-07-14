package com.github.lzyzsd.jsbridge.example;

import android.util.Log;
import android.webkit.JavascriptInterface;

import com.github.lzyzsd.jsbridge.BridgeWebView;
import com.github.lzyzsd.jsbridge.OnBridgeCallback;

import java.util.Map;

/**
 * Created on 2019/7/10.
 * Author: bigwang
 * Description:
 */
public class MainJavascrotInterface extends BridgeWebView.BaseJavascriptInterface {

    private BridgeWebView mWebView;

    public MainJavascrotInterface(Map<String, OnBridgeCallback> callbacks, BridgeWebView webView) {
        super(callbacks);
        mWebView = webView;
    }

    @Override
    public String send(String data) {
        Log.d("@ATI-send","get data from  web"+data);
        return "get data from  web"+data;
    }


    @JavascriptInterface
    public void submitFromWeb(String data, String callbackId) {
        Log.d("chromium data", data + ", callbackId: " + callbackId + " " + Thread.currentThread().getName());
        Log.d("@ATI-submitFromWeb","submitFromWeb-"+callbackId+"-"+data);

        mWebView.sendResponse("submitFromWeb response", callbackId);
    }
}
