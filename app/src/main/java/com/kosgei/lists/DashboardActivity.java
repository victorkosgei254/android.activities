package com.kosgei.lists;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import com.kosgei.lists.databinding.ActivityDashboardBinding;
public class DashboardActivity extends AppCompatActivity {
    private ActivityDashboardBinding binding;
    private static final String TAG="DashboardActvity";
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityDashboardBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        binding.button.setOnClickListener(v->{
            Toast.makeText(this,"Switching back",Toast.LENGTH_LONG).show();
            Intent home = new Intent(this,MainActivity.class);
            startActivity(home);
        });

        binding.showList.setOnClickListener(v->{
            Toast.makeText(this,"Swiching to List view",Toast.LENGTH_SHORT).show();
            Intent listView = new Intent(this,Lists.class);
            startActivity(listView);
        });
    }


}
