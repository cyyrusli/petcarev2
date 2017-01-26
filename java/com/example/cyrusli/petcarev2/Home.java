package com.example.cyrusli.petcarev2;

import android.content.res.Resources;
import android.graphics.Rect;
import android.os.Bundle;
import android.support.design.widget.AppBarLayout;
import android.support.design.widget.CollapsingToolbarLayout;
import android.support.v4.app.Fragment;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import com.bumptech.glide.Glide;
import java.util.ArrayList;
import java.util.List;


public class Home extends Fragment {

    private RecyclerView recyclerView;
    private AlbumsAdapter adapter;
    private List<Album> albumList;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_home, container, false);


        recyclerView = (RecyclerView)v.findViewById(R.id.recycler_view);

        albumList = new ArrayList<>();
        adapter = new AlbumsAdapter(getActivity(), albumList);

        setRetainInstance(true);

        RecyclerView.LayoutManager mLayoutManager = new GridLayoutManager(getActivity(), 2);
        recyclerView.setLayoutManager(mLayoutManager);
        recyclerView.addItemDecoration(new GridSpacingItemDecoration(2, dpToPx(10), true));
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        recyclerView.setAdapter(adapter);

        prepareAlbums();

        try {
            Glide.with(this).load(R.drawable.backdrop).into((ImageView)v.findViewById(R.id.backdrop));
        } catch (Exception e) {
            e.printStackTrace();
        }
        return v;
    }

    /**
     * Adding few animals for testing
     */
    public void prepareAlbums() {
        int[] covers = new int[]{
                R.drawable.simba,
                R.drawable.malaski,
                R.drawable.omega,
                R.drawable.cheese,
                R.drawable.rover,
                R.drawable.alibi,
                R.drawable.benji,
                R.drawable.dhoby,
                R.drawable.monica,
                R.drawable.hanis};

        Album a = new Album("Simba", "SPCA", covers[0]);
        albumList.add(a);

        a = new Album("Malaski", "SPCA", covers[1]);
        albumList.add(a);

        a = new Album("Omega", "Cat Welfare", covers[2]);
        albumList.add(a);

        a = new Album("Cheese", "SPCA", covers[3]);
        albumList.add(a);

        a = new Album("Rover", "SoSD", covers[4]);
        albumList.add(a);

        a = new Album("Alibi", "AdoptADog", covers[5]);
        albumList.add(a);

        a = new Album("Benji", "SPCA", covers[6]);
        albumList.add(a);

        a = new Album("Dhoby", "SPCA", covers[7]);
        albumList.add(a);

        a = new Album("Monica", "Purely Adoptions", covers[8]);
        albumList.add(a);

        a = new Album("Hanis", "Causes for Animals Singapore", covers[9]);
        albumList.add(a);

        adapter.notifyDataSetChanged();

    }


    /**
     * RecyclerView item decoration - give equal margin around grid item
     */
    public class GridSpacingItemDecoration extends RecyclerView.ItemDecoration {

        private int spanCount;
        private int spacing;
        private boolean includeEdge;

        public GridSpacingItemDecoration(int spanCount, int spacing, boolean includeEdge) {
            this.spanCount = spanCount;
            this.spacing = spacing;
            this.includeEdge = includeEdge;
        }

        @Override
        public void getItemOffsets(Rect outRect, View view, RecyclerView parent, RecyclerView.State state) {
            int position = parent.getChildAdapterPosition(view); // item position
            int column = position % spanCount; // item column

            if (includeEdge) {
                outRect.left = spacing - column * spacing / spanCount; // spacing - column * ((1f / spanCount) * spacing)
                outRect.right = (column + 1) * spacing / spanCount; // (column + 1) * ((1f / spanCount) * spacing)

                if (position < spanCount) { // top edge
                    outRect.top = spacing;
                }
                outRect.bottom = spacing; // item bottom
            } else {
                outRect.left = column * spacing / spanCount; // column * ((1f / spanCount) * spacing)
                outRect.right = spacing - (column + 1) * spacing / spanCount; // spacing - (column + 1) * ((1f /    spanCount) * spacing)
                if (position >= spanCount) {
                    outRect.top = spacing; // item top
                }
            }
        }
    }

    /**
     * Converting dp to pixel
     */
    private int dpToPx(int dp) {
        Resources r = getResources();
        return Math.round(TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP, dp, r.getDisplayMetrics()));
    }

}