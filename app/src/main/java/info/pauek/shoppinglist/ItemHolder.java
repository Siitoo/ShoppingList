package info.pauek.shoppinglist;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.CheckBox;
import android.widget.TextView;

public class ItemHolder extends RecyclerView.ViewHolder {
    private CheckBox name_view;

    public ItemHolder(@NonNull View itemView, final ShoppingListAdapter.OnClickListener onClickListener,final ShoppingListAdapter.OnLongClickListener onLongClickListener) {
        super(itemView);
        name_view = itemView.findViewById(R.id.name_view);
        itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (onClickListener != null) {
                    int pos = getAdapterPosition();
                    onClickListener.onClick(pos);
                }
            }
        });

        itemView.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                if (onLongClickListener != null) {
                    int pos = getAdapterPosition();
                    onLongClickListener.onLongClick(pos);
                    return true;
                }
                return false;
            }
        });
    }

    public void bind(ShoppingItem item) {
        name_view.setText(item.getName());
        name_view.setChecked(item.isChecker());
    }
}
