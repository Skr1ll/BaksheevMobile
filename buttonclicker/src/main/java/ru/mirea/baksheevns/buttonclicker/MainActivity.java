package ru.mirea.baksheevns.buttonclicker;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    private TextView tvOut;
    private Button ButtonWhoIAm;
    private CheckBox Galochka;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvOut = (TextView) findViewById(R.id.tvOut);
        Galochka = (CheckBox) findViewById(R.id.checkBox);
        ButtonWhoIAm = (Button) findViewById(R.id.btnWhoAmI);

        View.OnClickListener clbtnWhoIAm = new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                tvOut.setText("Мой номер по списку 5!");
                Galochka.setChecked(true);

            }
        };
        ButtonWhoIAm.setOnClickListener(clbtnWhoIAm);


    }

    public void SetNumberOnList (View view){

        tvOut.setText("Это не я сделал");
        Galochka.setChecked(false);

    }
}