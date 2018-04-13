package com.Shubham.expensetracker.ui.reminders;

import android.os.Bundle;

import com.Shubham.expensetracker.R;
import com.Shubham.expensetracker.interfaces.IUserActionsMode;
import com.Shubham.expensetracker.ui.BaseActivity;

/**
 * Created by Pedro on 9/26/2015.
 */
public class NewReminderActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_base);
        @IUserActionsMode int mode = getIntent().getIntExtra(IUserActionsMode.MODE_TAG, IUserActionsMode.MODE_CREATE);
        String reminderId = getIntent().getStringExtra(NewReminderFragment.REMINDER_ID_KEY);
        replaceFragment(NewReminderFragment.newInstance(mode, reminderId), false);
    }

}
