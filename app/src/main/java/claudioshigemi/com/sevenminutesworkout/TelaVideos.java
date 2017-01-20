package claudioshigemi.com.sevenminutesworkout;

import android.os.Bundle;
import android.speech.tts.TextToSpeech;
import android.widget.EditText;
import android.support.v7.app.AppCompatActivity;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.TextView;
import android.widget.VideoView;


public class TelaVideos extends AppCompatActivity {


    WebView meuWebView;
    TextView meuTitulo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_videos);

        meuWebView = (WebView) findViewById(R.id.meuWebVideos);
        meuTitulo = (TextView) findViewById(R.id.textoNomeExercicio );

        meuWebView.setWebViewClient(new MyBrowser());

        meuWebView.getSettings().setJavaScriptEnabled(true);
//        meuWebView.getSettings().setPluginState(PluginState.ON);
        meuWebView.loadUrl("http://www.youtube.com/embed/" + "watch?v=Bw2w3oCROR8" + "?autoplay=1&vq=small");
        meuWebView.setWebChromeClient(new WebChromeClient());

        String nomeVideo = getIntent().getExtras().getString("nomeVideo");
        meuTitulo.setText(nomeVideo);
    }
    private class MyBrowser extends WebViewClient{
        public  boolean overrideUrlLoading (WebView view, String url){
            view.loadUrl(url);
            return true;
        }
    }
}




