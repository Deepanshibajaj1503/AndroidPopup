package com.deepanshibajaj.custompopup;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initView();
    }

    private void initView() {
        findViewById(R.id.show_popup_btn).setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.show_popup_btn:
                openPopUpActivity();
                break;
        }
    }

    private void openPopUpActivity() {
        Intent intent = new Intent(getApplicationContext(), PopUpActivity.class);
        startActivity(intent);
    }
}
