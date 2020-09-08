package de.androidnewcomer.saghallo;

import android.os.Bundle;
import android.speech.tts.TextToSpeech;

import androidx.appcompat.app.AppCompatActivity;

import java.util.Locale;

public class MainActivity extends AppCompatActivity implements TextToSpeech.OnInitListener {

    private TextToSpeech textToSpeech;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textToSpeech = new TextToSpeech(this, this);

    }

    @Override
    public void onInit(int i) {
        textToSpeech.speak("Hallo Ulrike wie gehts?", TextToSpeech.QUEUE_FLUSH, null);
        textToSpeech.setLanguage(Locale.GERMAN);
    }
}