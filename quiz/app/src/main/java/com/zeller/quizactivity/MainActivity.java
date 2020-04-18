package com.zeller.quizactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.view.View;
import android.widget.Button;
import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private Button mTrueButton;
    private Button mFalseButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        /*
        *   activity子类的实例创建后，onCreate(Bundle)方法会被调用。activity创建后，它需要获取
            并管理用户界面。要获取activity的用户界面，可调用以下Activity方法：
            public void setContentView(int layoutResID)
            * 布局是一种资源。资源是应用非代码形式的内容，如图像文件、音频文件以及XML文件等。
        * */
        setContentView(R.layout.activity_main);
//        赋值前，必须先将返回的View类型转换为Button。
        mTrueButton = (Button) findViewById(R.id.true_button);
        /*
        * 传入setOnClickListener(OnClickListener)方法的参数是一个监听器。它是一个实
          现了OnClickListener接口的对象
        * */
        mTrueButton.setOnClickListener(new View.OnClickListener() {
            /*
            * 匿名内部类实现了OnClickListener接口，因此它也必须实现该接口唯一的onClick(View)
              方法。onClick(View)现在是个空方法。虽然必须实现onClick(View)方法，但具体如何实现取
              决于使用者，因此即使是个空方法，编译器也可以编译通过。
            * */
            public void onClick(View v) {
                /*
                makeText(Context context, int resID, int duration)
                * */
                Toast.makeText(MainActivity.this,
                        R.string.correct_toast,
                        Toast.LENGTH_SHORT).show();
            }
        });
        mFalseButton = (Button) findViewById(R.id.false_button);
        mFalseButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this,R.string.incorrect_toast,Toast.LENGTH_LONG).show();
            }
        });
    }
}
