package cn.crabapples.timepicker;

import android.widget.TimePicker;

/**
 * TODO
 *
 * @author Mr.He
 * 2021/4/28 3:00
 * e-mail crabapples.cn@gmail.com
 * qq 294046317
 * pc-name mrhe
 */
public class TimePickerChangeListener implements TimePicker.OnTimeChangedListener {
    /**
     * @param timePicker timePicker对象
     * @param hour       用户选择的小时[24小时制]
     * @param minute     用户选择的分钟
     */
    @Override
    public void onTimeChanged(TimePicker timePicker, int hour, int minute) {
//        Toast.makeText(MainActivity.this,"",3000).show();
        System.err.println(timePicker);
        System.err.println(hour);
        System.err.println(minute);
    }
}
