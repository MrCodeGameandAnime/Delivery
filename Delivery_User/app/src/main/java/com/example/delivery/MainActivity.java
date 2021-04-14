package com.example.delivery;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.View;
import android.widget.Button;
import com.example.delivery.authentication.LoginActivity;
import com.example.delivery.authentication.RegisterActivity;
import com.example.delivery.menu.ActivityMainMenu;
import com.example.delivery.model.Product;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button mainLoginButton = findViewById(R.id.main_login_button);
        Button mainRegisterButton = findViewById(R.id.main_register_button);
        Button mainMenuButton = findViewById(R.id.mainMenuButton);
        mainMenuButton.setOnClickListener(this);
        mainLoginButton.setOnClickListener(this);
        mainRegisterButton.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch(view.getId()){
            case R.id.main_login_button:
                Intent loginIntent = new Intent(MainActivity.this, LoginActivity.class);
                startActivity(loginIntent);
                break;
            case R.id.main_register_button:
                Intent registerIntent = new Intent(MainActivity.this, RegisterActivity.class);
                startActivity(registerIntent);
                break;
            case R.id.mainMenuButton:
                Intent mainMenuIntent = new Intent(MainActivity.this, ActivityMainMenu.class);
                startActivity(mainMenuIntent);
        }
    }
}