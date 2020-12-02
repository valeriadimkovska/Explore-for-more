package com.example.exploreformore;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Toast;

public class AddNewItem extends AppCompatActivity {
    Toolbar toolbar;
    Button btn_save;
    EditText name_txt, address_txt, latitude_txt, longitude_txt, email_txt, tel_txt, web_txt;
    CheckBox services_check, fun_check, industry_check, education_check;
    DatabaseHelper db;
    String category;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_new_item);
        db = new DatabaseHelper(AddNewItem.this);

        toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        toolbar.setLogo(R.drawable.icon);
        toolbar.setTitle(R.string.app_name);

        btn_save = findViewById(R.id.btn_save);
        name_txt = findViewById(R.id.name_txt);
        address_txt = findViewById(R.id.address_txt);
        latitude_txt = findViewById(R.id.latitude_txt);
        longitude_txt = findViewById(R.id.longitude_txt);
        email_txt = findViewById(R.id.email_txt);
        tel_txt = findViewById(R.id.tel_txt);
        web_txt = findViewById(R.id.web_txt);
        services_check = findViewById(R.id.services_check);
        fun_check = findViewById(R.id.fun_check);
        industry_check = findViewById(R.id.industry_check);
        education_check = findViewById(R.id.education_check);
        category=null;
            AddData();
    }

    public String checkCategory() {
        String category;
        if (services_check.isChecked()) {
            category = services_check.getText().toString();
        } else if (fun_check.isChecked()) {
            category = fun_check.getText().toString();
        } else if (industry_check.isChecked()) {
            category = industry_check.getText().toString();
        } else {
            category = education_check.getText().toString();
        }
        return category;
    }

    public void AddData() {
        btn_save.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if((services_check.isChecked()&& !fun_check.isChecked() && !industry_check.isChecked() && !education_check.isChecked())
                        ||(fun_check.isChecked() && !services_check.isChecked() && !industry_check.isChecked() && !education_check.isChecked())
                        ||(industry_check.isChecked() && !services_check.isChecked() && !fun_check.isChecked() && !education_check.isChecked())
                        ||(education_check.isChecked()&& !services_check.isChecked()&& !fun_check.isChecked() && !industry_check.isChecked())){
                    category = checkCategory();
                }
                else{
                    Toast.makeText(AddNewItem.this, "Select only one category!", Toast.LENGTH_SHORT).show();
                    services_check.setChecked(false);
                    fun_check.setChecked(false);
                    industry_check.setChecked(false);
                    education_check.setChecked(false);
                    return;
                }
                String name = name_txt.getText().toString();
                String address = address_txt.getText().toString();
                String latitude = latitude_txt.getText().toString();
                String longitude = longitude_txt.getText().toString();
                String email = email_txt.getText().toString();
                String tel = tel_txt.getText().toString();
                String web = web_txt.getText().toString();

                if(name.length()!=0 && address.length()!=0 && latitude.length()!=0 && longitude.length()!=0 && email.length()!=0 && tel.length()!=0 && web.length()!=0 && category!=null){
                         db.insertPlace(name, address, latitude, longitude, email, tel, web, category);
                         Toast.makeText(AddNewItem.this, "Data Inserted", Toast.LENGTH_SHORT).show();
                        }else{
                    Toast.makeText(AddNewItem.this, "Insert the data first!", Toast.LENGTH_SHORT).show();
                }
                name_txt.setText("");
                address_txt.setText("");
                latitude_txt.setText("");
                longitude_txt.setText("");
                email_txt.setText("");
                tel_txt.setText("");
                web_txt.setText("");
                services_check.setChecked(false);
                fun_check.setChecked(false);
                industry_check.setChecked(false);
                education_check.setChecked(false);
      }});
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater menuInflater = getMenuInflater();
        menuInflater.inflate(R.menu.main_menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        if (item.getItemId() == R.id.action_add) {
            Intent intent = new Intent(this, MainActivity.class);
            this.startActivity(intent);
            return true;
        } else
            return super.onOptionsItemSelected(item);
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
        finish();
    }
}