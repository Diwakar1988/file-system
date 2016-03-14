package com.github.diwakar1988.filesystem;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import com.github.diwakar1988.vfs.Drive;
import com.github.diwakar1988.vfs.File;
import com.github.diwakar1988.vfs.Folder;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Drive d = new Drive("c:");
        Folder folder = null;


        try {
           folder= d.addFolder("A");
        } catch (Exception e) {
            e.printStackTrace();
        }
        if (folder==null){
            return;
        }
        try {
            File file = folder.addFile("log.txt");
        } catch (Exception e) {
            e.printStackTrace();
        }
        Log.d("VFS","Folders= "+d.listFolder());
        Log.d("VFS","Files= "+folder.listFiles());
    }
}
