package gilKag.groupshop;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.res.Resources;
import android.graphics.Color;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.text.Layout;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.ScrollView;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView mRecyclerView;
    private RecyclerView.Adapter mAdapter;
    private RecyclerView.LayoutManager mLayoutManager;
    private FoodBox mFoodBox;
//    private ProductsAdapter mAdapter;
//    private LinearLayout mProductLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ArrayList<Product> example = new ArrayList<>();
        example.add(new Product(R.drawable.cocacola_img, getString(R.string.cola)));
        example.add(new Product(R.drawable.milk, getString(R.string.milk)));
        mRecyclerView = (RecyclerView) findViewById(R.id.recycler_view);
        mRecyclerView.setHasFixedSize(true);
        mLayoutManager = new LinearLayoutManager(this);
        mAdapter = new ProductsAdapter(example);

        mRecyclerView.setLayoutManager(mLayoutManager);
        mRecyclerView.setAdapter(mAdapter);
        // TextView text = (TextView) findViewById(R.id.text);

       /* mFoodBox = new FoodBox(getResources().getStringArray(R.array.products));
        // mFoodBox.addItem("AXE");

        mProductLayout = (LinearLayout) findViewById(R.id.products_layout);

        for (String product : FoodBox.getItems()) {
            addProductButton(product);
        }*/
    }

    private void addProductButton(String product) {
        final Button btn = new Button(this);
        btn.setWidth(40);
        btn.setHeight(20);
        btn.setText(product);
        final int colorId = getResources().getColor(R.color.colorPrimary);
        btn.setBackgroundColor(colorId);
        btn.setPadding(0, 5, 0, 5);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                btn.setBackgroundColor(getResources().getColor(R.color.colorAccent));
                new CountDownTimer(100, 100) {
                    @Override
                    public void onTick(long l) {
                    }

                    @Override
                    public void onFinish() {
                        btn.setBackgroundColor(colorId);
                    }
                }.start();
            }
        });
        //mProductLayout.addView(btn);
    }

}

    /*@Override
    protected void onStart() {
        super.onStart();
        mAdapter = new ProductsAdapter()
    }*/

