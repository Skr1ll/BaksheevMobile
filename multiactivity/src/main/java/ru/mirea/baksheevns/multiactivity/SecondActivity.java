package ru.mirea.baksheevns.multiactivity;

import android.content.Intent;
import android.os.Bundle;

import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;

import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;

import ru.mirea.baksheevns.multiactivity.databinding.ActivitySecondBinding;

public class SecondActivity extends AppCompatActivity {

    private AppBarConfiguration appBarConfiguration;
    private ActivitySecondBinding binding;
    private TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        textView = findViewById(R.id.textView);

        String receivedText = getIntent().getStringExtra("text");
        textView.setText(receivedText);

        Button back = findViewById(R.id.button3);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onBackPressed();


            }
        });
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        finish();

    }

    protected void onStart() {
        super.onStart();
        // Подготовка к отображению активити
    }

    @Override
    protected void onResume() {
        super.onResume();
        // Активность готова к взаимодействию с пользователем
    }

    Button backButton;





    @Override
    public boolean onSupportNavigateUp() {
        NavController navController = Navigation.findNavController(this, R.id.nav_host_fragment_content_second);
        return NavigationUI.navigateUp(navController, appBarConfiguration)
                || super.onSupportNavigateUp();
    }
}