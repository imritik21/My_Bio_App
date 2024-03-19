package com.example.bio;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.inputmethod.InputMethodManager;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import com.example.bio.data.Bio;
import com.example.bio.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {
    private ActivityMainBinding binding;
//    private EditText enterHobbies;
//    private TextView hobbies;
    private final Bio bio= new Bio();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_main);
//
//        enterHobbies=findViewById(R.id.enter_hobbies);
//        hobbies=findViewById(R.id.hobbies_text);
        binding = DataBindingUtil.setContentView(this,R.layout.activity_main);

        bio.setName("Ritik Shankar");
        //now bind it
        binding.setBio(bio);

        binding.doneButton.setOnClickListener(this::addHobbies);
    }

    public void addHobbies(View view) {
//        hobbies.setText(String.format("Hobbies: %s", enterHobbies.getText().toString().trim()));
//        hobbies.setVisibility(View.VISIBLE);

        bio.setHobbies(String.format("Hobbies: %s", binding.enterHobbies.getText().toString().trim()));

//        binding.hobbiesText.setText(String.format("Hobbies: %s", binding.enterHobbies.getText().toString().trim()));

        binding.invalidateAll(); // refresh user interface
        binding.hobbiesText.setVisibility(View.VISIBLE);

        // hide keyBoard dynamically after you click done
        InputMethodManager inputMethodManager= (InputMethodManager) getSystemService(Context.INPUT_METHOD_SERVICE);
        inputMethodManager.hideSoftInputFromWindow(view.getWindowToken(),0);
    }
}