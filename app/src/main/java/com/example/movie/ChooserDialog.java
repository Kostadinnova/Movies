package com.example.movie;
import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.DialogFragment;


public class ChooserDialog extends DialogFragment {
    private DialogChoose listener;

    public ChooserDialog(DialogChoose listener) {

        this.listener = listener;
    }


    @NonNull
    @Override
    public Dialog onCreateDialog(@Nullable Bundle savedInstanceState) {
        AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
        LayoutInflater inflater = getActivity().getLayoutInflater();
        View view = inflater.inflate(R.layout.dialog_layout, null);

        final TextView movieSelected = view.findViewById(R.id.movieSelected);
        Button addToFavorites = view.findViewById(R.id.addToFavorites);
        addToFavorites.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                listener.addFavorites();
            }
        });

        Button removeFromFavorites = view.findViewById(R.id.removeFromFavorites);
        removeFromFavorites.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                listener.removeFromFavorites();
            }
        });

        Button deleteButton = view.findViewById(R.id.deleteButton);
        deleteButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                listener.removeItem();
            }
        });

        builder.setView(view)
                .setNeutralButton("cancel", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                    }
                });


        return builder.create();
    }

    interface DialogChoose {
        void removeItem ();
        void addFavorites();
        void removeFromFavorites();

    }

}


