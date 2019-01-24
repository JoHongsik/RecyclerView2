package com.example.recyclerviewpractice;

import android.support.annotation.NonNull;
import android.support.v7.widget.LinearLayoutCompat;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

public class MyRecyclerViewAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder>{
    int images[] = {R.drawable.image,R.drawable.image2,R.drawable.image3};

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        int width = viewGroup.getResources().getDisplayMetrics().widthPixels/3;

        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.recyclerview_item,viewGroup,false);
        view.setLayoutParams(new LinearLayoutCompat.LayoutParams(width,width));
        //XML 디자인 한 부분 적용
        return new RowCell(view);
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder viewHolder, int i) {
        //XML 디자인한 부분 안의 내용 변경 (이미지를 삽입하는 부분)
        ((RowCell)viewHolder).imageView.setImageResource(images[i]);
    }

    @Override
    public int getItemCount() {
        // 아이템을 측정하는 카운터
        // 아이템이 5개이면 5번 돌게 해줌.
        return images.length;
    }

    private static class RowCell extends RecyclerView.ViewHolder {
        public ImageView imageView;
        public RowCell(View view) {
            super(view);
            imageView = (ImageView)view.findViewById(R.id.recyclerview_item_image);
        }
    }
}
