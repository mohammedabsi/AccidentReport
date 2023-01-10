package com.example.accidentreporter;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

public class AccidentActivity extends AppCompatActivity {
//    ImageView backBtnAccident;
//    FrameLayout accident_container ;
//
//    String[] permissions = {
//            Manifest.permission.CAMERA
//    };
//    int PERM_CODE = 11;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_accident);

//        backBtnAccident = findViewById(R.id.backBtnAccident);
//        accident_container = findViewById(R.id.accident_container);
//
//        String sessionId = getIntent().getStringExtra("accident");
//        if (sessionId.equalsIgnoreCase("1")){
//            getSupportFragmentManager().beginTransaction().replace(R.id.accident_container, new ChatFragment()).commit();
//
//        }else {
//            getSupportFragmentManager().beginTransaction().replace(R.id.accident_container, new AddAccidentFragment()).commit();
//
//        }
    }

//    public void ReturnHome(View view) {
//        startActivity(new Intent(this , MainActivity.class));
//        finish();
//
//    }
//
//    private boolean checkpermissions(){
//        List<String> listofpermisssions = new ArrayList<>();
//        for (String perm: permissions){
//            if (ContextCompat.checkSelfPermission(getApplicationContext()  , perm) != PackageManager.PERMISSION_GRANTED){
//                listofpermisssions.add(perm);
//            }
//        }
//        if (!listofpermisssions.isEmpty()){
//            ActivityCompat.requestPermissions(this, listofpermisssions.toArray(new String[listofpermisssions.size()]), PERM_CODE);
//            return false;
//        }
//        return true;
//    }
}
