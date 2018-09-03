package com.inducesmile.androidpayexample;


import android.content.DialogInterface;
import android.graphics.Color;
import android.os.Build;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.app.AlertDialog;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

/**
 * Created by SrikanthBk(ThinkNext)peace on 27-04-2018.
 */

public class SongsStream extends Fragment {
    AlertDialog b;
    boolean connected = false;
    String answer;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        //returning our layout file
        //change R.layout.yourlayoutfilename for each of your fragments
        View v=inflater.inflate(R.layout.stream_songs, container, false);
        //
        String frameAudio = "<i><b><font size=\"5px\" color=\"white\">Yaavanigottu</font></b></i><iframe  width=\"100%\" height=\"55\" " +
                "src=\"https://drive.google.com/file/d/1KERIMHewCm5z2ThzZGlOgchjFnL5Nd_0/preview?usp=sharing" +
                "frameborder=\"0></iframe>";

        String frameAudio1 = "<i><b><font size=\"5px\" color=\"white\">Paravashanaadenu</font></b></i><iframe width=\"100%\" height=\"55\" " +
                "src=\"https://drive.google.com/file/d/16xpJAchxMAgtGpEdkSZHu-lfDIUdz7WO/preview?usp=sharing" +
                "frameborder=\"0></iframe>";

        String frameAudio2 = "<i><b><font size=\"5px\" color=\"white\">Hesaru Poorthi</font></b></i><iframe width=\"100%\" height=\"55\" " +
                "src=\"https://drive.google.com/file/d/1kVfdWzVUnGu1K9Aly09qs1kMt_UoIoBO/preview?usp=sharing" +
                "frameborder=\"0></iframe>";

        String frameAudio3 = "<i><b><font size=\"5px\" color=\"white\">Tanmayalaadenu</font></b></i><iframe width=\"100%\" height=\"55\" " +
                "src=\"https://drive.google.com/file/d/1HatHk_3jPwbjE04THnJD_tcB1EYRD8it/preview?usp=sharing" +
                "frameborder=\"0></iframe>";

        String frameAudio4 = "<i><b><font size=\"5px\" color=\"white\">College Gate</font></b></i><iframe width=\"100%\" height=\"55\" " +
                "src=\"https://drive.google.com/file/d/1vmEDrdioSUxu1jeL1ROkepdsv1Ga8weR/preview?usp=sharing" +
                "frameborder=\"0></iframe>";
        WebView displayAudio = (WebView)v.findViewById(R.id.webView);
        displayAudio.getSettings();
        displayAudio.setBackgroundColor(Color.TRANSPARENT);
        //
        WebView displayAudio1 = (WebView)v.findViewById(R.id.webView1);
        displayAudio1.getSettings();
        displayAudio1.setBackgroundColor(Color.TRANSPARENT);
        //
        WebView displayAudio2 = (WebView)v.findViewById(R.id.webView2);
        displayAudio2.getSettings();
        displayAudio2.setBackgroundColor(Color.TRANSPARENT);
        //
        WebView displayAudio3 = (WebView)v.findViewById(R.id.webView3);
        displayAudio3.getSettings();
        displayAudio3.setBackgroundColor(Color.TRANSPARENT);
        //
        WebView displayAudio4 = (WebView)v.findViewById(R.id.webView4);
        displayAudio4.getSettings();
        displayAudio4.setBackgroundColor(Color.TRANSPARENT);
        //
        displayAudio.setWebViewClient(new WebViewClient(){
            @Override
            public boolean shouldOverrideUrlLoading(WebView view, String url) {
                return false;
            }
        });
        WebSettings webSettings = displayAudio.getSettings();
        webSettings.setJavaScriptEnabled(true);

        displayAudio.loadData(frameAudio, "text/html", "utf-8");
       /* displayAudio.setWebViewClient(new WebViewClient());
        displayAudio.getSettings().setBuiltInZoomControls(true);
        displayAudio.getSettings().setDisplayZoomControls(false);
        displayAudio.getSettings().setRenderPriority(WebSettings.RenderPriority.HIGH);
        displayAudio.getSettings().setCacheMode(WebSettings.LOAD_CACHE_ELSE_NETWORK);
        displayAudio.getSettings().setAppCacheEnabled(true);
        webSettings.setDomStorageEnabled(true);
        webSettings.setLayoutAlgorithm(WebSettings.LayoutAlgorithm.SINGLE_COLUMN);
        webSettings.setUseWideViewPort(true);
        webSettings.setSavePassword(true);
        webSettings.setSaveFormData(true);
        webSettings.setEnableSmoothTransition(true);
        displayAudio.getSettings().setRenderPriority(WebSettings.RenderPriority.HIGH);
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.KITKAT) {
            displayAudio.setLayerType(View.LAYER_TYPE_HARDWARE, null);
        } else {
            displayAudio.setLayerType(View.LAYER_TYPE_SOFTWARE, null);
        }*/
        //
        displayAudio1.setWebViewClient(new WebViewClient(){
            @Override
            public boolean shouldOverrideUrlLoading(WebView view, String url) {
                return false;
            }
        });
        WebSettings webSettings1 = displayAudio1.getSettings();
        webSettings1.setJavaScriptEnabled(true);
        displayAudio1.loadData(frameAudio1, "text/html", "utf-8");
        //
        displayAudio2.setWebViewClient(new WebViewClient(){
            @Override
            public boolean shouldOverrideUrlLoading(WebView view, String url) {
                return false;
            }
        });
        WebSettings webSettings2 = displayAudio2.getSettings();
        webSettings2.setJavaScriptEnabled(true);
        displayAudio2.loadData(frameAudio2, "text/html", "utf-8");
        //
        displayAudio3.setWebViewClient(new WebViewClient(){
            @Override
            public boolean shouldOverrideUrlLoading(WebView view, String url) {
                return false;
            }
        });
        WebSettings webSettings3 = displayAudio3.getSettings();
        webSettings3.setJavaScriptEnabled(true);
        displayAudio3.loadData(frameAudio3, "text/html", "utf-8");
        //
        displayAudio4.setWebViewClient(new WebViewClient(){
            @Override
            public boolean shouldOverrideUrlLoading(WebView view, String url) {
                return false;
            }
        });
        WebSettings webSettings4 = displayAudio4.getSettings();
        webSettings4.setJavaScriptEnabled(true);
        displayAudio4.loadData(frameAudio4, "text/html", "utf-8");
        return v;
    }


    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        //you can set the title for your toolbar here for different fragments different titles
        getActivity().setTitle("Songs");
    }
    //
    private void showAlertDialog(){
        AlertDialog.Builder dialogBuilder = new AlertDialog.Builder(getActivity());
        LayoutInflater inflater = this.getLayoutInflater();
        final View dialogView = inflater.inflate(R.layout.custom_alert_dialog, null);
        dialogBuilder.setView(dialogView);
        dialogBuilder.setPositiveButton("Done", new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialog, int whichButton) {
                //do something with edt.getText().toString();
                b.cancel();
            }
        });
        dialogBuilder.setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialog, int whichButton) {
                //pass
                b.cancel();
            }
        });
        b = dialogBuilder.create();
        b.show();

    }
}
