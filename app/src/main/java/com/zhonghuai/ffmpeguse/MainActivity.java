package com.zhonghuai.ffmpeguse;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.zhonghuai.ffmpeg.AVToolHelper;

public class MainActivity extends AppCompatActivity {

    private TextView tvFFmpegDesc;

    private Button btGetInfo;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tvFFmpegDesc = findViewById(R.id.tv_ffmpeg_version_info);
        btGetInfo = findViewById(R.id.bt_show_ffmpeg_version_info);
        if (btGetInfo != null) {
            btGetInfo.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    tvFFmpegDesc.setText(AVToolHelper.GetFFmpegVersion());

                }
            });
        }
    }
}