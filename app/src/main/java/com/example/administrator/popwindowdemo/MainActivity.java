package com.example.administrator.popwindowdemo;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void show_pop(View view) {
        SelectPhonePopWin takePhotoPopWin = new SelectPhonePopWin(this, onClickListener);
        //showAtLocation(View parent, int gravity, int x, int y)
        takePhotoPopWin.showAtLocation(findViewById(R.id.main_view), Gravity.BOTTOM, 0, 0);
//        takePhotoPopWin.setContentView();
    }

    private View.OnClickListener onClickListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {

            switch (v.getId()) {
                case R.id.btn_take_photo:
                    System.out.println("btn_take_photo");
                    break;
                case R.id.btn_pick_photo:
                    System.out.println("btn_pick_photo");
                    break;
            }
        }
    };
}
