package sg.edu.rp.c346.id21012961.mymodules;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class ModuleDetailsActivity extends AppCompatActivity {

    TextView tvCode;
    TextView tvName;
    TextView tvYear;
    TextView tvSem;
    TextView tvCred;
    TextView tvVen;
    Button rtnbtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_module_details);

        tvCode = findViewById(R.id.textCodeC346);
        tvName = findViewById(R.id.C346Name);
        tvYear = findViewById(R.id.AcadYear);
        tvSem = findViewById(R.id.textSem);
        tvCred = findViewById(R.id.ModCred);
        tvVen = findViewById(R.id.ModVen);
        rtnbtn = findViewById(R.id.returnbtn);

        Intent intentReceived = getIntent();
        String Select = intentReceived.getStringExtra("module");

        switch (Select) {
            case "C346":
                tvCode.setText("Module Code: " + Select);
                tvName.setText("Module Name: Mobile App Development");
                tvYear.setText("Academic Year: 2022");
                tvSem.setText("Semester: 1");
                tvCred.setText("Module Credit: 4");
                tvVen.setText("Venue: E62E");
                break;
            case "C203":
                tvCode.setText("Module Code: " + Select);
                tvName.setText("Module Name: Web AppIn Development in php");
                tvYear.setText("Academic Year: 2022");
                tvSem.setText("Semester: 1");
                tvCred.setText("Module Credit: 4");
                tvVen.setText("Venue: W65H");
                break;
            case "C235":
                tvCode.setText("Module Code: " + Select);
                tvName.setText("Module Name: IT Security and Management");
                tvYear.setText("Academic Year: 2022");
                tvSem.setText("Semester: 1");
                tvCred.setText("Module Credit: 4");
                tvVen.setText("Venue: E66A");
                break;
            case "C218":
                tvCode.setText("Module Code: " + Select);
                tvName.setText("Module Name: UI/UX Design for Apps");
                tvYear.setText("Academic Year: 2022");
                tvSem.setText("Semester: 1");
                tvCred.setText("Module Credit: 4");
                tvVen.setText("Venue: E66B");
                break;
            default:
                tvCode.setText("Module Code: " + Select);
                tvName.setText("Module Name: Software Development Process");
                tvYear.setText("Academic Year: 2022");
                tvSem.setText("Semester: 1");
                tvCred.setText("Module Credit: 4");
                tvVen.setText("Venue: E66K");
                break;
        }

        rtnbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ModuleDetailsActivity.this, MainActivity.class );
                startActivity(intent);
            }
        });
    }
}