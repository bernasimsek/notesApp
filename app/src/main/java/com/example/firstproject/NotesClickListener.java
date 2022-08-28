package com.example.firstproject;

import androidx.cardview.widget.CardView;

import com.example.firstproject.Models.Notes;

public interface NotesClickListener {
    void onClick(Notes notes);
    void onLongClick(Notes notes, CardView cardView);

}
