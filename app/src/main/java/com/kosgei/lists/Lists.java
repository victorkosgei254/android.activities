package com.kosgei.lists;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;

import com.kosgei.lists.databinding.ActivityListBinding;
public class Lists extends AppCompatActivity {
    private ActivityListBinding binding;
    private static final String TAG ="Lists";

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
       binding = ActivityListBinding.inflate(getLayoutInflater());
       setContentView(binding.getRoot());
        super.onCreate(savedInstanceState);
        RViewAdapter adapter = new RViewAdapter(this);
        binding.recyclerView.setAdapter(adapter);
        binding.recyclerView.setLayoutManager(new LinearLayoutManager(this));
    }
}
