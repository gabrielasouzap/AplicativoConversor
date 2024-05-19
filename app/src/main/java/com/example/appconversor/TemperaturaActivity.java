package com.example.appconversor;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.ViewSwitcher;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;


public class TemperaturaActivity extends AppCompatActivity implements ITemperaturaView {
    private EditText editCelsiusDegrees;
    private EditText editFahrenheitDegrees;
    private EditText editKelvinDegrees;
    private TextView celsiusDegrees;
    private TextView fahrenheitDegrees;
    private TextView kelvinDegrees;
    private ViewSwitcher switcherCelsius;
    private ViewSwitcher switcherFahrenheit;
    private ViewSwitcher switcherKelvin;

    private  TemperaturaPresente present;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        switcherCelsius = findViewById(R.id.switchCelsius);
        celsiusDegrees = findViewById(R.id.disabledCelcius);
        editCelsiusDegrees = findViewById(R.id.enabledCelcius);

        switcherFahrenheit = findViewById(R.id.switchFahrenheit);
        fahrenheitDegrees = findViewById(R.id.disabledFahrenheit);
        editFahrenheitDegrees = findViewById(R.id.enabledFahrenheit);

        switcherKelvin = findViewById(R.id.switchKelvin);
        celsiusDegrees = findViewById(R.id.disabledKelvin);
        editCelsiusDegrees = findViewById(R.id.enabledKelvin);

        editCelsiusDegrees.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {
            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
            }

            @Override
            public void afterTextChanged(Editable s) {
            }
        });

        present = new TemperaturaPresente(this);
    }

    public void setContentView(int activityMain) {
    }


    @Override
    public void enableCelsius() {
        if (switcherCelsius.getCurrentView() == celsiusDegrees)
            switcherCelsius.showNext();
    }
    @Override
    public void disableCelsius() {
        if (switcherCelsius.getCurrentView() == editCelsiusDegrees)
            switcherCelsius.showPrevious();
    }



    @Override
    public void enableFahrenheit() {
        if (switcherFahrenheit.getCurrentView() == fahrenheitDegrees)
            switcherFahrenheit.showNext();
    }
    @Override
    public void disableFahrenheit() {
        if (switcherFahrenheit.getCurrentView() == editFahrenheitDegrees)
            switcherFahrenheit.showPrevious();
    }



    @Override
    public void enableKelvin() {
        if (switcherKelvin.getCurrentView() == kelvinDegrees)
            switcherKelvin.showNext();
    }
    @Override
    public void disableKelvin() {
        if (switcherKelvin.getCurrentView() == editKelvinDegrees)
            switcherKelvin.showPrevious();
    }
}