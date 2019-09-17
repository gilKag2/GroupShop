package gilKag.groupshop;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.app.Dialog;
import android.content.res.Resources;
import android.graphics.Color;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.text.Layout;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.ScrollView;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemLongClickListener,
        View.OnClickListener {
    private RecyclerView mRecyclerView;
    private RecyclerView.Adapter mAdapter;
    private RecyclerView.LayoutManager mLayoutManager;

    ArrayList<Product> example = new ArrayList<>();

    private FoodBox mFoodBox;

    private Button mAddButton;


    private Button mRemoveButton;
    private Button mSearchButton;

    private Dialog mDialog;

//    private ProductsAdapter mAdapter;
//    private LinearLayout mProductLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        example.add(new Product(R.drawable.cocacola_img, getString(R.string.cola)));
        example.add(new Product(R.drawable.milk, getString(R.string.milk)));
        mRecyclerView = (RecyclerView) findViewById(R.id.recycler_view);
        mRecyclerView.setHasFixedSize(true);
        mLayoutManager = new LinearLayoutManager(this);
        mAdapter = new ProductsAdapter(example);

        mRecyclerView.setLayoutManager(mLayoutManager);
        mRecyclerView.setAdapter(mAdapter);

        findViewById(R.id.add_button).setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                mDialog = new Dialog(MainActivity.this);
                mDialog.setContentView(R.layout.add_item_dialog);
                mDialog.findViewById(R.id.button_cancel).setOnClickListener(
                        MainActivity.this);
                mDialog.findViewById(R.id.button_ok).setOnClickListener(
                        MainActivity.this);
                mDialog.show();
            }
        });
//
//        findViewById(R.id.remove_button).setOnClickListener(new View.OnClickListener() {
//
//            @Override
//            public void onClick(View v) {
//                mDialog = new Dialog(MainActivity.this);
//                mDialog.setContentView(R.layout.add_item_dialog);
//                mDialog.findViewById(R.id.button_cancel).setOnClickListener(
//                        MainActivity.this);
//                mDialog.findViewById(R.id.button_ok).setOnClickListener(
//                        MainActivity.this);
//                mDialog.show();
//            }
//        });
    }

        /*mAddButton = (Button) findViewById(R.id.add_button);
        mAddButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


            }
        });
        mRemoveButton = (Button) findViewById(R.id.remove_button);*/
    // TextView text = (TextView) findViewById(R.id.text);

       /* mFoodBox = new FoodBox(getResources().getStringArray(R.array.products));
        // mFoodBox.addItem("AXE");

        mProductLayout = (LinearLayout) findViewById(R.id.products_layout);

        for (String product : FoodBox.getItems()) {
            addProductButton(product);
        }*/


    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.button_cancel:
                mDialog.dismiss();
                break;

            case R.id.button_ok:
                String text = ((EditText) mDialog.findViewById(R.id.edit_box))
                        .getText().toString();
                if (!text.equals("")) {
                    Product p = new Product(text);
                    example.add(p);
                    mDialog.dismiss();
                    mAdapter.notifyDataSetChanged();
                }

                break;
        }
    }


    @Override
    public boolean onItemLongClick(AdapterView<?> adapterView, View view, int i, long l) {
        return false;
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

