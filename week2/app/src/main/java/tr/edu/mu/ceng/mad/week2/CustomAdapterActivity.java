package tr.edu.mu.ceng.mad.week2;

import android.os.Bundle;
import android.widget.ListView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.ArrayList;
import java.util.List;

public class CustomAdapterActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        final List<Animal> animals = new ArrayList<>();
        animals.add(new Animal("Dog",R.mipmap.dog));
        animals.add(new Animal("Cat",R.mipmap.cat));
        setContentView(R.layout.activity_custom_adapter);
        final ListView listView = findViewById(R.id.listView);
        AnimalAdapter animalAdapter = new AnimalAdapter(this,animals);
        listView.setAdapter(animalAdapter);

//        EdgeToEdge.enable(this);
//        setContentView(R.layout.activity_custom_adapter);
//        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
//            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
//            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
//            return insets;
//        });
    }
}