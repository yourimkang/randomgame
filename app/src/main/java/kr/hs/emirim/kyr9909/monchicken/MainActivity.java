package kr.hs.emirim.kyr9909.monchicken;
        import android.content.Intent;
        import android.support.v7.app.ActionBarActivity;
        import android.os.Bundle;
        import android.view.View;
        import android.widget.Button;
        import android.widget.EditText;
        import android.widget.Toast;

        import kr.hs.emirim.kyr9909.monchicken.R;

public class MainActivity extends ActionBarActivity implements View.OnClickListener {

    EditText mName;
    Button mButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {//객체 이어주는 것, 한번만 처리하는것
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mName = (EditText)findViewById(R.id.name);//id값을 가지고 객체를 찾아서 가져와줌,activity_main에서 찾아서 가져와줌/ mName이 EditText이므로 그에 맞게 타입캐스팅해준다. xml에 있는 EditText를 맘대로 가져올 수 있다.
        mButton = (Button) findViewById(R.id.btn_show_me_the_chicken);
        mButton.setOnClickListener(this);
    }

    @Override
    protected void onResume() { //매번 처리해야 되는 것, 화면이 보여질 때마다
        super.onResume();
        mName.setText(null);//text공간을 비우게 해줌
        overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left);
    }

    /**
     * Called when a view has been clicked.
     *
     * @param v The view that was clicked.
     */
    @Override
    public void onClick(View v) { //누른 순간의 값을 가져와야하는 메서드

        String name = mName.getText().toString(); //문자출력
//        if (name == null) //한번에 치기 -> ctrl+/
//        {
//            Toast.makeText(this, "이름을 입력해 주세요 ! ", Toast.LENGTH_LONG).show();//현재 문맥을 넘겨줌 , duration :기간
//
//        }else {
//
//            Toast.makeText(this, name + "씨, 배고파요!", Toast.LENGTH_LONG).show();//현재 문맥을 넘겨줌 , duration :기간
//            Intent intent = new Intent(this, ResultActivity.class);
//            startActivity(intent);
//        }
//
        try{
            Toast.makeText(this, name + "씨, 배고파요!", Toast.LENGTH_LONG).show();//현재 문맥을 넘겨줌 , duration :기간
            Intent intent = new Intent(this, ResultActivity.class);
            intent.putExtra("name",name);
            intent.putExtra("age",10);
            startActivity(intent);
            overridePendingTransition(R.anim.slide_in_right,R.anim.slide_out_left);
        }catch (NullPointerException e){
            Toast.makeText(this, "이름을 입력해 주세요! ", Toast.LENGTH_LONG).show();//예외인 경우
        }catch (Exception e){
            Toast.makeText(this, "뭔지 모르지만 잘 안되네요! ", Toast.LENGTH_LONG).show();//현재 문맥을 넘겨줌 , duration :기간

        }
    }
}