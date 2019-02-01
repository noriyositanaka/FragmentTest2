package com.example.fragmenttest2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.example.fragmenttest2.dummy.DummyContent;

public class MainActivity extends AppCompatActivity  implements ItemFragment.OnListFragmentInteractionListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViewById(R.id.buttonSummonFragment).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                ItemFragment itemFragment = new ItemFragment();
                getSupportFragmentManager().beginTransaction().replace(R.id.containerForFragment,itemFragment).commit();

            }
        });



    }

    @Override
    public void onListFragmentInteraction(DummyContent.DummyItem item) {


    }
}
