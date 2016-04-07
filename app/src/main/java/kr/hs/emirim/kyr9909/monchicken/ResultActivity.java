package kr.hs.emirim.kyr9909.monchicken;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.util.Log;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Random;

/**
 * Created by appcreator16 on 2016. 3. 28..
 */
public class ResultActivity extends ActionBarActivity {
    static String TAG = "먼치킨 : ResultActivity";
    TextView mResult;
    ImageView mImageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.resultactivity);
        Log.d(TAG, "결과 액티비티 시작!");


        mResult = (TextView) findViewById(R.id.result);
        mImageView = (ImageView) findViewById(R.id.imageView);
        Log.d(TAG,"택스트뷰 연결 성공!");


        Random r= new Random();
        int result = r.nextInt(2);
        Log.d(TAG,"랜덤값 생성! :"+result);

        mImageView.setImageResource(R.drawable.chi+result);

        //if
        /*if(result == 0)
        {
            mImageView.setImageResource(R.drawable.chi);
        }else if(result == 1){
            mImageView.setImageResource(R.drawable.chicken);
        }*/

        /*switch(result){
            case 0:
                mImageView.setImageResource(R.drawable.chi); break;
            case 1:
                mImageView.setImageResource(R.drawable.chicken); break;
        }*/


        Intent intent = getIntent();
        String name = intent.getStringExtra("name");
        Log.d(TAG,"인텐트값 읽기<name> :"+name);


        int age=intent.getIntExtra("age",-1); // -1처럼 불가능한 숫자를 넣어준다
        Log.d(TAG,"인텐트값 읽기<age> :"+age);


        mResult.setText(name + "님, 안녕하세요!");
    }
}

//intent , context , indent
