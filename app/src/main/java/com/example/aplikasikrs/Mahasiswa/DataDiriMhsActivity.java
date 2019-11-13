package com.example.aplikasikrs.Mahasiswa;

import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Toast;

import com.example.aplikasikrs.Admin.CreateDosenActivity;
import com.example.aplikasikrs.Admin.HomeAdmin;
import com.example.aplikasikrs.R;

public class DataDiriMhsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_data_diri_mhs);
        this.setTitle("SI KRS - Hai Mahasiswa");

//        Button btnDaftarKrs = (Button)findViewById(R.id.btnSimpanDataMhs);
//        btnDaftarKrs.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Intent intent = new Intent(DataDiriMhsActivity.this, HomeDosen.class);
//                startActivity(intent);
//            }
//        });

        Button btnSimpan = (Button)findViewById(R.id.btnSimpanDataMhs);
        btnSimpan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                AlertDialog.Builder builder = new AlertDialog.Builder(DataDiriMhsActivity.this);

                builder.setMessage("Apakah anda yakin untuk menyimpan?")
                        .setNegativeButton("No", new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog, int which) {
                                Toast.makeText(DataDiriMhsActivity.this, "Batal Simpan", Toast.LENGTH_SHORT).show();
                            }
                        })
                        .setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog, int which) {
                                Intent intent = new Intent(DataDiriMhsActivity.this, HomeDosen.class);
                                startActivity(intent);
                            }
                        });

                AlertDialog dialog = builder.create(); dialog.show();
            }
        });

    }
}
