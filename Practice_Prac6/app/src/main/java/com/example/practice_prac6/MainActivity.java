package com.example.practice_prac6;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.ContextMenu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.PopupMenu;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button dialogButton, menuButton, contextButton;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        dialogButton = findViewById(R.id.dialogButton);
        menuButton = findViewById(R.id.menuButton);
        contextButton = findViewById(R.id.contextButton);

        registerForContextMenu(contextButton);
    }

    public void showDialog(View view) {
        AlertDialog.Builder build = new AlertDialog.Builder(this);
        build.setTitle("Dialog Box").setMessage("Click on any one").setPositiveButton("OK", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.dismiss();
                    }
                })
                .setNegativeButton("CANCEL", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.dismiss();
                    }
                });

        AlertDialog dialog = build.create();
        dialog.show();
    }

    public void showPopupMenu(View view) {
        PopupMenu popup = new PopupMenu(this, view);
        popup.getMenuInflater().inflate(R.menu.popup_menu, popup.getMenu());
        popup.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() {
            @Override
            public boolean onMenuItemClick(MenuItem item) {

                if (item.getItemId() == R.id.popup1) {
                    Toast.makeText(MainActivity.this, "go to context menu", Toast.LENGTH_SHORT).show();
                    return true;
                } else if (item.getItemId() == R.id.popup2) {
                    Toast.makeText(MainActivity.this, "go to context menu", Toast.LENGTH_SHORT).show();
                    return true;
                } else if (item.getItemId() == R.id.popup3) {
                    Toast.makeText(MainActivity.this, "go to context menu", Toast.LENGTH_SHORT).show();
                    return true;
                }
                return false;
            }
        });

        popup.show();
    }

    public void onCreateContextMenu(ContextMenu menu, View view, ContextMenu.ContextMenuInfo menuInfo) {
        super.onCreateContextMenu(menu, view, menuInfo);

        menu.add(0, view.getId(), 0, "Pune University");
        menu.add(0, view.getId(), 0, "shivaji university");
        menu.add(0, view.getId(), 0, "mumbai university");
    }

    public boolean onContextItemSelected(MenuItem item) {
        if (item.getTitle() == "Pune University") {
            Intent a = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.unipune.ac.in/"));
            startActivity(a);
        } else if (item.getTitle() == "shivaji university") {
            Intent b = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.unishivaji.ac.in/"));
            startActivity(b);
        } else if (item.getTitle() == "mumbai university") {
            Intent c = new Intent(Intent.ACTION_VIEW, Uri.parse("https://mu.ac.in/"));
            startActivity(c);
        }
        return true;
    }
}




