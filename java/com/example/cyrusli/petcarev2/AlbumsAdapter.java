package com.example.cyrusli.petcarev2;

/**
 * Created by cyrusli on 7/1/17.
 */
import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.PopupMenu;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.bumptech.glide.Glide;

import java.util.List;

public class AlbumsAdapter extends RecyclerView.Adapter<AlbumsAdapter.MyViewHolder> {

    private Context mContext;
    private List<Album> albumList;

    public class MyViewHolder extends RecyclerView.ViewHolder {
        public TextView title, count;
        public ImageView thumbnail, overflow;

        public MyViewHolder(View view) {
            super(view);
            title = (TextView) view.findViewById(R.id.title);
            count = (TextView) view.findViewById(R.id.count);
            thumbnail = (ImageView) view.findViewById(R.id.thumbnail);
            overflow = (ImageView) view.findViewById(R.id.overflow);
        }
    }


    public AlbumsAdapter(Context mContext, List<Album> albumList) {
        this.mContext = mContext;
        this.albumList = albumList;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.album_card, parent, false);

        return new MyViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(final MyViewHolder holder, int position) {
        Album album = albumList.get(position);
        holder.title.setText(album.getName());
        holder.count.setText(album.getNumOfSongs());

        // loading backdrop cover using Glide library
        Glide.with(mContext).load(album.getThumbnail()).into(holder.thumbnail);

        switch (position) {
            case 0:
                holder.overflow.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        showPopupMenu(holder.overflow);
                    }
                });
                break;

            case 1:
                holder.overflow.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        showPopupMenu1(holder.overflow);
                    }
                });
                break;
            case 2:
                holder.overflow.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        showPopupMenu2(holder.overflow);
                    }
                });
                break;
            case 3:
                holder.overflow.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        showPopupMenu3(holder.overflow);
                    }
                });
                break;
            case 4:
                holder.overflow.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        showPopupMenu4(holder.overflow);
                    }
                });
                break;
            case 5:
                holder.overflow.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        showPopupMenu5(holder.overflow);
                    }
                });
                break;
            case 6:
                holder.overflow.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        showPopupMenu6(holder.overflow);
                    }
                });
                break;
            case 7:
                holder.overflow.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        showPopupMenu7(holder.overflow);
                    }
                });
                break;
            case 8:
                holder.overflow.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        showPopupMenu8(holder.overflow);
                    }
                });
                break;
            case 9:
                holder.overflow.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        showPopupMenu9(holder.overflow);
                    }
                });
                break;

        }
//        holder.overflow.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                showPopupMenu(holder.overflow);
//            }
//        });
    }


    // for case 0
    /**
     * Showing popup menu when tapping on 3 dots
     */
    private void showPopupMenu(View view) {
        // inflate menu
        PopupMenu popup = new PopupMenu(mContext, view);
        MenuInflater inflater = popup.getMenuInflater();
        inflater.inflate(R.menu.menu_album, popup.getMenu());
        popup.setOnMenuItemClickListener(new MyMenuItemClickListener());
        popup.show();
    }

    /**
     * Click listener for popup menu items
     */
    public class MyMenuItemClickListener implements PopupMenu.OnMenuItemClickListener {

        public MyMenuItemClickListener() {
        }

        @Override
        public boolean onMenuItemClick(MenuItem menuItem) {
            switch (menuItem.getItemId()) {
                case R.id.action_add_favourite:
                    Toast.makeText(mContext, "Coming Soon!", Toast.LENGTH_SHORT).show();
                    return true;
                case R.id.action_view_more:
                    mContext.startActivity(new Intent(mContext,PetActivity.class));
                    return true;
                default:
            }
            return false;
        }
    }

    // For case 1
    /**
     * Showing popup menu when tapping on 3 dots
     */
    private void showPopupMenu1(View view) {
        // inflate menu
        PopupMenu popup1 = new PopupMenu(mContext, view);
        MenuInflater inflater = popup1.getMenuInflater();
        inflater.inflate(R.menu.menu_album, popup1.getMenu());
        popup1.setOnMenuItemClickListener(new MyMenuItemClickListener1());
        popup1.show();
    }

    /**
     * Click listener for popup menu items
     */
    public class MyMenuItemClickListener1 implements PopupMenu.OnMenuItemClickListener {

        public MyMenuItemClickListener1() {
        }

        @Override
        public boolean onMenuItemClick(MenuItem menuItem) {
            switch (menuItem.getItemId()) {
                case R.id.action_add_favourite:
                    Toast.makeText(mContext, "Coming Soon!", Toast.LENGTH_SHORT).show();
                    return true;
                case R.id.action_view_more:
                    mContext.startActivity(new Intent(mContext,PetActivity1.class));
                    return true;
                default:
            }
            return false;
        }
    }

    // for case 2
    /**
     * Showing popup menu when tapping on 3 dots
     */
    private void showPopupMenu2(View view) {
        // inflate menu
        PopupMenu popup2 = new PopupMenu(mContext, view);
        MenuInflater inflater = popup2.getMenuInflater();
        inflater.inflate(R.menu.menu_album, popup2.getMenu());
        popup2.setOnMenuItemClickListener(new MyMenuItemClickListener2());
        popup2.show();
    }

    /**
     * Click listener for popup menu items
     */
    public class MyMenuItemClickListener2 implements PopupMenu.OnMenuItemClickListener {

        public MyMenuItemClickListener2() {
        }

        @Override
        public boolean onMenuItemClick(MenuItem menuItem) {
            switch (menuItem.getItemId()) {
                case R.id.action_add_favourite:
                    Toast.makeText(mContext, "Coming Soon!", Toast.LENGTH_SHORT).show();
                    return true;
                case R.id.action_view_more:
                    mContext.startActivity(new Intent(mContext,PetActivity2.class));
                    return true;
                default:
            }
            return false;
        }
    }

    // for case 3
    /**
     * Showing popup menu when tapping on 3 dots
     */
    private void showPopupMenu3(View view) {
        // inflate menu
        PopupMenu popup3 = new PopupMenu(mContext, view);
        MenuInflater inflater = popup3.getMenuInflater();
        inflater.inflate(R.menu.menu_album, popup3.getMenu());
        popup3.setOnMenuItemClickListener(new MyMenuItemClickListener3());
        popup3.show();
    }

    /**
     * Click listener for popup menu items
     */
    public class MyMenuItemClickListener3 implements PopupMenu.OnMenuItemClickListener {

        public MyMenuItemClickListener3() {
        }

        @Override
        public boolean onMenuItemClick(MenuItem menuItem) {
            switch (menuItem.getItemId()) {
                case R.id.action_add_favourite:
                    Toast.makeText(mContext, "Coming Soon!", Toast.LENGTH_SHORT).show();
                    return true;
                case R.id.action_view_more:
                    mContext.startActivity(new Intent(mContext,PetActivity3.class));
                    return true;
                default:
            }
            return false;
        }
    }

    // for case 4
    /**
     * Showing popup menu when tapping on 3 dots
     */
    private void showPopupMenu4(View view) {
        // inflate menu
        PopupMenu popup1 = new PopupMenu(mContext, view);
        MenuInflater inflater = popup1.getMenuInflater();
        inflater.inflate(R.menu.menu_album, popup1.getMenu());
        popup1.setOnMenuItemClickListener(new MyMenuItemClickListener4());
        popup1.show();
    }

    /**
     * Click listener for popup menu items
     */
    public class MyMenuItemClickListener4 implements PopupMenu.OnMenuItemClickListener {

        public MyMenuItemClickListener4() {
        }

        @Override
        public boolean onMenuItemClick(MenuItem menuItem) {
            switch (menuItem.getItemId()) {
                case R.id.action_add_favourite:
                    Toast.makeText(mContext, "Coming Soon!", Toast.LENGTH_SHORT).show();
                    return true;
                case R.id.action_view_more:
                    mContext.startActivity(new Intent(mContext,PetActivity4.class));
                    return true;
                default:
            }
            return false;
        }
    }

    // for case 5
    /**
     * Showing popup menu when tapping on 3 dots
     */
    private void showPopupMenu5(View view) {
        // inflate menu
        PopupMenu popup1 = new PopupMenu(mContext, view);
        MenuInflater inflater = popup1.getMenuInflater();
        inflater.inflate(R.menu.menu_album, popup1.getMenu());
        popup1.setOnMenuItemClickListener(new MyMenuItemClickListener5());
        popup1.show();
    }

    /**
     * Click listener for popup menu items
     */
    public class MyMenuItemClickListener5 implements PopupMenu.OnMenuItemClickListener {

        public MyMenuItemClickListener5() {
        }

        @Override
        public boolean onMenuItemClick(MenuItem menuItem) {
            switch (menuItem.getItemId()) {
                case R.id.action_add_favourite:
                    Toast.makeText(mContext, "Coming Soon!", Toast.LENGTH_SHORT).show();
                    return true;
                case R.id.action_view_more:
                    mContext.startActivity(new Intent(mContext,PetActivity5.class));
                    return true;
                default:
            }
            return false;
        }
    }

    // for case 6
    /**
     * Showing popup menu when tapping on 3 dots
     */
    private void showPopupMenu6(View view) {
        // inflate menu
        PopupMenu popup1 = new PopupMenu(mContext, view);
        MenuInflater inflater = popup1.getMenuInflater();
        inflater.inflate(R.menu.menu_album, popup1.getMenu());
        popup1.setOnMenuItemClickListener(new MyMenuItemClickListener6());
        popup1.show();
    }

    /**
     * Click listener for popup menu items
     */
    public class MyMenuItemClickListener6 implements PopupMenu.OnMenuItemClickListener {

        public MyMenuItemClickListener6() {
        }

        @Override
        public boolean onMenuItemClick(MenuItem menuItem) {
            switch (menuItem.getItemId()) {
                case R.id.action_add_favourite:
                    Toast.makeText(mContext, "Coming Soon!", Toast.LENGTH_SHORT).show();
                    return true;
                case R.id.action_view_more:
                    mContext.startActivity(new Intent(mContext,PetActivity6.class));
                    return true;
                default:
            }
            return false;
        }
    }

    // for case 7
    /**
     * Showing popup menu when tapping on 3 dots
     */
    private void showPopupMenu7(View view) {
        // inflate menu
        PopupMenu popup1 = new PopupMenu(mContext, view);
        MenuInflater inflater = popup1.getMenuInflater();
        inflater.inflate(R.menu.menu_album, popup1.getMenu());
        popup1.setOnMenuItemClickListener(new MyMenuItemClickListener7());
        popup1.show();
    }

    /**
     * Click listener for popup menu items
     */
    public class MyMenuItemClickListener7 implements PopupMenu.OnMenuItemClickListener {

        public MyMenuItemClickListener7() {
        }

        @Override
        public boolean onMenuItemClick(MenuItem menuItem) {
            switch (menuItem.getItemId()) {
                case R.id.action_add_favourite:
                    Toast.makeText(mContext, "Coming Soon!", Toast.LENGTH_SHORT).show();
                    return true;
                case R.id.action_view_more:
                    mContext.startActivity(new Intent(mContext,PetActivity7.class));
                    return true;
                default:
            }
            return false;
        }
    }

    // for case 8
    /**
     * Showing popup menu when tapping on 3 dots
     */
    private void showPopupMenu8(View view) {
        // inflate menu
        PopupMenu popup1 = new PopupMenu(mContext, view);
        MenuInflater inflater = popup1.getMenuInflater();
        inflater.inflate(R.menu.menu_album, popup1.getMenu());
        popup1.setOnMenuItemClickListener(new MyMenuItemClickListener8());
        popup1.show();
    }

    /**
     * Click listener for popup menu items
     */
    public class MyMenuItemClickListener8 implements PopupMenu.OnMenuItemClickListener {

        public MyMenuItemClickListener8() {
        }

        @Override
        public boolean onMenuItemClick(MenuItem menuItem) {
            switch (menuItem.getItemId()) {
                case R.id.action_add_favourite:
                    Toast.makeText(mContext, "Coming Soon!", Toast.LENGTH_SHORT).show();
                    return true;
                case R.id.action_view_more:
                    mContext.startActivity(new Intent(mContext,PetActivity8.class));
                    return true;
                default:
            }
            return false;
        }
    }

    // for case 9
    /**
     * Showing popup menu when tapping on 3 dots
     */
    private void showPopupMenu9(View view) {
        // inflate menu
        PopupMenu popup1 = new PopupMenu(mContext, view);
        MenuInflater inflater = popup1.getMenuInflater();
        inflater.inflate(R.menu.menu_album, popup1.getMenu());
        popup1.setOnMenuItemClickListener(new MyMenuItemClickListener9());
        popup1.show();
    }

    /**
     * Click listener for popup menu items
     */
    public class MyMenuItemClickListener9 implements PopupMenu.OnMenuItemClickListener {

        public MyMenuItemClickListener9() {
        }

        @Override
        public boolean onMenuItemClick(MenuItem menuItem) {
            switch (menuItem.getItemId()) {
                case R.id.action_add_favourite:
                    Toast.makeText(mContext, "Coming Soon!", Toast.LENGTH_SHORT).show();
                    return true;
                case R.id.action_view_more:
                    mContext.startActivity(new Intent(mContext,PetActivity9.class));
                    return true;
                default:
            }
            return false;
        }
    }


    @Override
    public int getItemCount() {
        return albumList.size();
    }
}