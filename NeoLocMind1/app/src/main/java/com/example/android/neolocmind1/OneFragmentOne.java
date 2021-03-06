package com.example.android.neolocmind1;


import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;


/**
 * A simple {@link Fragment} subclass.
 */
public class OneFragmentOne extends Fragment implements ForecastAdapter.ForecastAdapterOnClickHandler {
    private String data[] = {"tjrgkg","dfdfdfdfd","dfdfdfdfdf","dfdfdfdfdkkkktktktkt","wewe","ererrrererer","kookok","pepepep","llklklkl",
                            "aazazaa","xcvfvcvc","vbvmbbmv","klklklll","qwqww"};
    private RecyclerView mRecyclerView;
    private ForecastAdapter mForecastAdapter;

    public OneFragmentOne() {
        // Required empty public constructor
    }
    public void onClick(String weatherForDay) {
        Context context = getActivity();
        Toast.makeText(context, weatherForDay, Toast.LENGTH_SHORT)
                .show();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_one1, container, false);
        mRecyclerView = (RecyclerView) view.findViewById(R.id.rcview);
        LinearLayoutManager layoutManager
                = new LinearLayoutManager(getActivity(), LinearLayoutManager.VERTICAL, false);

        mRecyclerView.setLayoutManager(layoutManager);

        /*
         * Use this setting to improve performance if you know that changes in content do not
         * change the child layout size in the RecyclerView
         */
        mRecyclerView.setHasFixedSize(true);

        // COMPLETED (11) Pass in 'this' as the ForecastAdapterOnClickHandler
        /*
         * The ForecastAdapter is responsible for linking our weather data with the Views that
         * will end up displaying our weather data.
         */
        mForecastAdapter = new ForecastAdapter(this);

        /* Setting the adapter attaches it to the RecyclerView in our layout. */
        mRecyclerView.setAdapter(mForecastAdapter);
        mForecastAdapter.setWeatherData(data);
        // Inflate the layout for this fragment
        return view;
    }

}
