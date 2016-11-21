package fragments;


import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.awu.MainActivity;
import com.awu.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class OrderGuidFragment extends Fragment {


    public OrderGuidFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View ret = inflater.inflate(R.layout.fragment_order_guid, container, false);

        return ret;
    }


}
