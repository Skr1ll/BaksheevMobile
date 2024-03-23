package ru.mirea.baksheevns.dialog;

import static android.app.PendingIntent.getActivity;

import android.app.Dialog;
import android.app.ProgressDialog;
import android.os.Bundle;

import androidx.fragment.app.DialogFragment;

public class MyProgressDialogFragment extends DialogFragment {

    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {
        // Создаем новый объект ProgressDialog и возвращаем его
        ProgressDialog progressDialog = new ProgressDialog(getActivity());
        progressDialog.setMessage("Loading...");
        return progressDialog;
    }
}
