package com.example.envoy.criminalintent;

import android.support.v4.app.Fragment;

/**
 * Created by Envoy on 8/8/17.
 */

public class CrimeListActivity extends SingleFragmentActivity {

    @Override
    protected Fragment createFragment() {
        return new CrimeListFragment();
    }

}
