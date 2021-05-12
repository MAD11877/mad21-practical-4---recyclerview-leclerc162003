package sg.edu.np.practical2;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.content.DialogInterface;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import java.util.Random;

public class UserViewHolder extends RecyclerView.ViewHolder {
    ImageView img;
    TextView name;
    TextView description;
    public UserViewHolder(View itemView) {
        super(itemView);
        name = itemView.findViewById(R.id.name);
        description = itemView.findViewById(R.id.des);
        img = itemView.findViewById(R.id.pfp);



    }

}
