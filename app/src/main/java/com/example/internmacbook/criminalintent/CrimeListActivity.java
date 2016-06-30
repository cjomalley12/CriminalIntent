package com.example.internmacbook.criminalintent;

import android.support.v4.app.Fragment;

/**
 * Created by internmacbook on 6/30/16.
 */
public class CrimeListActivity extends SingleFragmentActivity {

    @Override
    protected Fragment createFragment() {
        return new CrimeListFragment();
    }
}
