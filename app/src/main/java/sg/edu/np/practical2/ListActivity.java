package sg.edu.np.practical2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.Random;

public class ListActivity extends AppCompatActivity{
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);

        ArrayList<User> data = new ArrayList<User>();
        for (int i=0 ; i<20; i++){
            User u = new User();
            Random rand = new Random();
            String txt = String.valueOf(rand.nextInt());
            u.setName("Name" + txt);
            u.setDescription("Description" + txt);
            data.add(u);

        }
        RecyclerView rv = findViewById(R.id.rv);
        UsersAdapter adapter = new UsersAdapter(this, data);
        LinearLayoutManager lm = new LinearLayoutManager(this);
        rv.setLayoutManager(lm);
        rv.setAdapter(adapter);



    }
//    public void showAlertDialog(View v) {
//        AlertDialog.Builder builder = new AlertDialog.Builder(this);
//
//        builder.setTitle("Profile");
//        builder.setMessage("MADness");
//        builder.setCancelable(true);
//        builder.setPositiveButton("View", new DialogInterface.OnClickListener(){
//            public void onClick(DialogInterface dialog, int id){
//                Random rand = new Random();
//                String txt = String.valueOf(rand.nextInt());
//                Intent activityName = new Intent(ListActivity.this, MainActivity.class);
//                activityName.putExtra("rand", txt);
//                startActivity(activityName);
//
//
//            }
//        });
//        builder.setNegativeButton("Close", new DialogInterface.OnClickListener(){
//            public void onClick(DialogInterface dialog, int id){
//
//            }
//        });
//        AlertDialog alert = builder.create();
//        alert.show();
//
//
//
//    }

}