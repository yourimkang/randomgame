package kr.hs.emirim.kyr9909.monchicken;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.widget.TextView;

/**
 * Created by appcreator16 on 2016. 3. 28..
 */
public class ResultActivity extends ActionBarActivity {

    TextView mResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.resultactivity);

        mResult = (TextView) findViewById(R.id.result);


        Intent intent = getIntent();
        String name = intent.getStringExtra("name");
        int age=intent.getIntExtra("age",-1); // -1처럼 불가능한 숫자를 넣어준다
        mResult.setText(name + "님, 안녕하세요!");
    }
}

//intent , context , indent
