package com.keytop.mapsdkdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.keytop.map.ktui.KTMainActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViewById(R.id.tv1).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                /**
                 * context 对象
                 * aMapKey 高德地图key
                 * isRelease 环境参数 isRelease true生产环境；false测试环境 ，可传可不传默认生产环境
                 */
                KTMainActivity.launch(MainActivity.this, "0874b38a760be4463840f3a7b9ba68c9");
            }
        });
    }
}
