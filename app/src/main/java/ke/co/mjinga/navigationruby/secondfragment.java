package ke.co.mjinga.navigationruby;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by emobilis on 4/6/18.
 */

public class secondfragment extends Fragment{
    View ruby;

    /**Layout inflator is a class that is used to instantiate layout XML files to its view objects in java
     *it takes input from XML and builds views from objects*/
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        ruby= inflater.inflate(R.layout.secondlayout,container,false);
        return ruby;
    }
}
