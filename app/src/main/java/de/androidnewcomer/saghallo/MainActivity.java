package de.androidnewcomer.saghallo;

import android.os.Bundle;
import android.speech.tts.TextToSpeech;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

import java.util.Locale;

public class MainActivity extends AppCompatActivity implements TextToSpeech.OnInitListener, View.OnClickListener {

    private TextToSpeech textToSpeech;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textToSpeech = new TextToSpeech(this, this);

    }

    @Override
    public void onInit(int i) {
        Button button = findViewById(R.id.submitHintButton);
        button.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        textToSpeech.setLanguage(Locale.GERMAN);
        EditText editText = findViewById(R.id.editTextInputHint);
        textToSpeech.speak( editText.getText().toString(), TextToSpeech.QUEUE_FLUSH, null);

    }
}