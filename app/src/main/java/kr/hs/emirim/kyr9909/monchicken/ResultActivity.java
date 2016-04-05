package kr.hs.emirim.kyr9909.monchicken;

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
        mResult.setText("결과");

    }

}

//intent , context , indent
