package sg.edu.rp.c346.id21012961.mymodules;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView ModC346;
    TextView ModC203;
    TextView ModC235;
    TextView ModC218;
    TextView ModC206;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ModC346 = findViewById(R.id.textC346);
        ModC203 = findViewById(R.id.textC203);
        ModC235 = findViewById(R.id.textC235);
        ModC218 = findViewById(R.id.textC218);
        ModC206 = findViewById(R.id.textC206);

        //C346
        ModC346.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, ModuleDetailsActivity.class);
                intent.putExtra("module", "C346");
                startActivity(intent);
            }
        });

        //C203
        ModC203.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, ModuleDetailsActivity.class);
                intent.putExtra("module", "C203");
                startActivity(intent);
            }
        });

        //C235
        ModC235.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, ModuleDetailsActivity.class);
                intent.putExtra("module", "C235");
                startActivity(intent);
            }
        });

        //C218
        ModC218.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, ModuleDetailsActivity.class);
                intent.putExtra("module", "C218");
                startActivity(intent);
            }
        });

        //C206
        ModC206.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, ModuleDetailsActivity.class);
                intent.putExtra("module", "C206");
                startActivity(intent);
            }
        });
    }
}