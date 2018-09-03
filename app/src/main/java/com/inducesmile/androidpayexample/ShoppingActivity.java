package com.inducesmile.androidpayexample;

import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.inducesmile.androidpayexample.adapters.ShopRecyclerViewAdapter;
import com.inducesmile.androidpayexample.entities.ProductObject;
import com.inducesmile.androidpayexample.helpers.SpacesItemDecoration;

import java.util.ArrayList;
import java.util.List;

public class ShoppingActivity extends AppCompatActivity {

    private static final String TAG = ShoppingActivity.class.getSimpleName();

    private RecyclerView shoppingRecyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shopping);

        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);

        shoppingRecyclerView = (RecyclerView)findViewById(R.id.product_list);
        GridLayoutManager mGrid = new GridLayoutManager(ShoppingActivity.this, 2);
        shoppingRecyclerView.setLayoutManager(mGrid);
        shoppingRecyclerView.setHasFixedSize(true);
        shoppingRecyclerView.addItemDecoration(new SpacesItemDecoration(2, 12, false));

        ShopRecyclerViewAdapter shopAdapter = new ShopRecyclerViewAdapter(ShoppingActivity.this, getAllProductsOnSale());
        shoppingRecyclerView.setAdapter(shopAdapter);
    }


    private List<ProductObject> getAllProductsOnSale(){
        List<ProductObject> products = new ArrayList<ProductObject>();
        products.add(new ProductObject(1, "Casual half sleeve", R.drawable.costume1, "Handsome formal look", 2, 38, "Black"));
        products.add(new ProductObject(1, "Black shirt", R.drawable.costume2, "Perfect fit black shirt", 3, 38, "Black"));
        products.add(new ProductObject(1, "Leather jacket", R.drawable.costume3, "Best quality leather jacket", 2, 38, "White"));
        products.add(new ProductObject(1, "Blue Swed T-shirt", R.drawable.costume4, "Comfort fit t-shirt", 2, 38, "Dark Blue"));
        products.add(new ProductObject(1, "White jacket", R.drawable.costume5, "Sun shade jacket", 3, 38, "Spotted Green"));
        products.add(new ProductObject(1, "Tuxedo", R.drawable.costume6, "Good looking tuxedo", 5, 38, "Multi-color"));
        return products;
    }
}
