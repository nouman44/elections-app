package com.myapplication;

import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.provider.MediaStore;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Locale;

//import com.google.firebase.database.ChildEventListener;
//import com.google.firebase.database.DataSnapshot;
//import com.google.firebase.database.DatabaseError;
//import com.google.firebase.database.DatabaseReference;
//import com.google.firebase.database.FirebaseDatabase;

public class MainActivity extends AppCompatActivity {

    TextView silsillah, gharaana, blockCode, name, fatherName, cnic, age, address, assignee;
    Button voteCasted;
    EditText phoneNumber;
    ImageView cnicImage;
    private Bitmap picture;
//    DatabaseReference mDatabase;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);
        silsillah = (TextView) findViewById(R.id.silsillah);
        gharaana = (TextView) findViewById(R.id.gharaana);
        blockCode = (TextView) findViewById(R.id.blockCode);
        name = (TextView) findViewById(R.id.name);
        fatherName = (TextView) findViewById(R.id.fatherName);
        cnic = (TextView) findViewById(R.id.cnic);
        age = (TextView) findViewById(R.id.age);
        phoneNumber = (EditText) findViewById(R.id.number);
        address = (TextView) findViewById(R.id.address);
        assignee = (TextView) findViewById(R.id.assignee);
        voteCasted = (Button) findViewById(R.id.voteButton);

        phoneNumber.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

            }

            @Override
            public void afterTextChanged(Editable s) {
                String text = phoneNumber.getText().toString();
                name.setText(text);
            }
        });
    }

    public void takePhoto(View v) {
        Intent takePictureIntent = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
        if (takePictureIntent.resolveActivity(getPackageManager()) != null) {
            startActivityForResult(takePictureIntent, 1);
        }
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        if (requestCode == 1 && resultCode == RESULT_OK) {
            Bundle extras = data.getExtras();
            Bitmap imageBitmap = (Bitmap) extras.get("data");
            picture = imageBitmap;
            ImageView myImageView = (ImageView) findViewById(R.id.cnicImage1);
            myImageView.setImageBitmap(imageBitmap);
        }

    }
}
