package com.geekbrains.mvc;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements MainView {

    public static final int BUTTON_ID1 = 1;
    public static final int BUTTON_ID2 = 2;
    public static final int BUTTON_ID3 = 3;
    private TextView tv1;
    private Button btnCounter1;
    private TextView tv2;
    private Button btnCounter2;
    private TextView tv3;
    private Button btnCounter3;

    private Presenter mPresenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tv1 = findViewById(R.id.tv1);
        btnCounter1 = findViewById(R.id.btnCounter1);
        tv2 = findViewById(R.id.tv2);
        btnCounter2 = findViewById(R.id.btnCounter2);
        tv3 = findViewById(R.id.tv3);
        btnCounter3 = findViewById(R.id.btnCounter3);
        mPresenter = new Presenter(this);

        btnCounter1.setOnClickListener(view -> mPresenter.buttonClick(BUTTON_ID1));

        btnCounter2.setOnClickListener(view -> mPresenter.buttonClick(BUTTON_ID2));

        btnCounter3.setOnClickListener(view -> mPresenter.buttonClick(BUTTON_ID3));
    }

    @Override
    public void setButtonText(int btnIndex, int value) {
        switch (btnIndex) {
            case BUTTON_ID1:
                btnCounter1.setText("Количество = " + value);
                break;
            case BUTTON_ID2:
                btnCounter2.setText("Количество = " + value);
                break;
            case BUTTON_ID3:
                btnCounter3.setText("Количество = " + value);
                break;
        }
    }
}
