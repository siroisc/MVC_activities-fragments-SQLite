package com.example.nerdranchcriminalintent;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

public class CrimeListActivity extends SingleFragmentActivity {

    @Override
    protected Fragment createFragment() {
        return new CrimeListFragment();
    }
}
