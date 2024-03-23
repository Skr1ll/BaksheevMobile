package ru.mirea.baksheevns.dialog;
import android.app.DialogFragment;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.TimePicker;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.fragment.app.FragmentManager;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        findViewById(R.id.timeButton).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MyTimeDialogFragment timeFragment = new MyTimeDialogFragment();
                timeFragment.show(getSupportFragmentManager(), "timePicker");
            }
        });

        findViewById(R.id.dateButton).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MyDateDialogFragment dateFragment = new MyDateDialogFragment();
                dateFragment.show(getSupportFragmentManager(), "datePicker");
            }
        });

        findViewById(R.id.progressButton).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MyProgressDialogFragment progressFragment = new MyProgressDialogFragment();
                progressFragment.show(getSupportFragmentManager(), "progressDialog");
            }
        });
    }

    private void showDialog(String dialogType) {
        FragmentManager fragmentManager = getSupportFragmentManager();
        switch (dialogType) {
            case "time":
                MyTimeDialogFragment timeDialog = new MyTimeDialogFragment();
                timeDialog.show(fragmentManager, "time_dialog");
                break;
            case "date":
                MyDateDialogFragment dateDialog = new MyDateDialogFragment();
                dateDialog.show(fragmentManager, "date_dialog");
                break;
            case "progress":
                MyProgressDialogFragment progressDialog = new MyProgressDialogFragment();
                progressDialog.show(fragmentManager, "progress_dialog");
                break;
        }
    }


    public void onDateSet(DatePicker view, int year, int month, int dayOfMonth) {
        // Обработка установки даты
    }


    public void onTimeSet(TimePicker view, int hourOfDay, int minute) {
        // Обработка установки времени
    }


    Button button;
    Button button2;
    Button button3;

    public void onClickShowDialog(View view) {
        MyDialogFragment dialogFragment = new MyDialogFragment();
        dialogFragment.show(getSupportFragmentManager(), "mirea");
    }

    public void onOkClicked() {
        Toast.makeText(getApplicationContext(), "Вы выбрали кнопку \"Иду дальше\"!",
                Toast.LENGTH_LONG).show();
    }
    public void onCancelClicked() {
        Toast.makeText(getApplicationContext(), "Вы выбрали кнопку \"Нет\"!",
                Toast.LENGTH_LONG).show();
    }
    public void onNeutralClicked() {
        Toast.makeText(getApplicationContext(), "Вы выбрали кнопку \"На паузе\"!",
                Toast.LENGTH_LONG).show();
    }


}