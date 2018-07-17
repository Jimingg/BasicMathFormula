package sg.edu.rp.c346.basicmathformula;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ListView lvfor;
    ArrayList<ForumlaItem> alforitem;
    CustomAdapter cafor;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        lvfor=findViewById(R.id.ListviewFormula);
        alforitem=new ArrayList<>();
        ForumlaItem item1 = new ForumlaItem("Area of rectangle","Length X Length","Formula type is : Area");
        ForumlaItem item2=new ForumlaItem("Area of Triangle ","(Length of base X Length)/2","Formula type is : Area");
        ForumlaItem item3 = new ForumlaItem("Volume of Cube ","Length X Length X Length","Formula type is : Volume");
        alforitem.add(item1);
        alforitem.add(item2);
        alforitem.add(item3);
        cafor= new CustomAdapter(this,R.layout.mathfor, alforitem);
        lvfor.setAdapter(cafor);
    }
}
