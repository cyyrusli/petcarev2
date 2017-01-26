package com.example.cyrusli.petcarev2;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

/**
 * Created by cyrusli on 6/1/17.
 */
public class AdoptSites extends Fragment {
    private static WebView browser;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_adopt_sites, container, false);

        browser = (WebView)v.findViewById(R.id.webView);
        browser.loadUrl("http://www.spca.org.sg/services.asp?cat=1");
        WebSettings webSettings = browser.getSettings();
        webSettings.setJavaScriptEnabled(true);
        browser.setWebViewClient(new WebViewClient());


        return v;
    }

}