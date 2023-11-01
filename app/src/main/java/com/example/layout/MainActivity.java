package com.example.layout;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    private ImageView studentImage;
    private TextView studentName;
    private TextView studentID;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Inisialisasi elemen UI
        studentImage = findViewById(R.id.studentImage);
        studentName = findViewById(R.id.studentName);
        studentID = findViewById(R.id.studentID);

        // Setel data kartu mahasiswa
        studentImage.setImageResource(R.drawable.student_image); // Ganti dengan gambar yang sesuai
        studentName.setText("Nama Mahasiswa Anda");
        studentID.setText("NIM: 12345");
    }
}
