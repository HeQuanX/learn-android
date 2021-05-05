package cn.crabapples.application.activity.demo;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.PopupWindow;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;
import cn.crabapples.application.R;

public class PopupWindowActivity extends AppCompatActivity {
    private final String TAG = "PopupWindowActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_popup_window);
    }

    public void showPopup(View view) {
        printLog("showPopup()");
        View layout = getLayoutInflater().inflate(R.layout.module_popup_window, null);
        PopupWindow popupWindow = new PopupWindow(layout,
                ViewGroup.LayoutParams.WRAP_CONTENT,
                ViewGroup.LayoutParams.WRAP_CONTENT,
                true);
        popupWindow.showAsDropDown(view, view.getLayoutParams().width, view.getLayoutParams().height);
    }

    public void showToast(String content) {
        Toast.makeText(PopupWindowActivity.this, content, Toast.LENGTH_SHORT).show();
    }

    public void printLog(String content) {
        Log.i(TAG, content);
    }

    public void back(View view) {
    }

}
