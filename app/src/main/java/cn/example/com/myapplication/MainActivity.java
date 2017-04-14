package cn.example.com.myapplication;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.Button;
import android.widget.ProgressBar;

import cn.example.com.myapplication.view.CBProgressBar;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        CBProgressBar cbProgress = (CBProgressBar) this.findViewById(R.id.my_progress2);
        cbProgress.setMax(100);
        cbProgress.setProgress(100);
        ProgressBar pb_xp = (ProgressBar) this.findViewById(R.id.pb_xp);
        pb_xp.setMax(100);
        pb_xp.setProgress(100);
        //测试改了部分代码，再次提交
        Log.i("MainActivity","onCreate");
        //develop分支上创建的代码
        Button btn_develop = (Button)findViewById(R.id.btn_develop);

    }
}
