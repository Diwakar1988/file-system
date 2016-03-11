package com.hawkmobi.filesystem;

import com.hawkmobi.vfs.Drive;
import com.hawkmobi.vfs.File;
import com.hawkmobi.vfs.Folder;

/**
 * Created by diwakar.mishra on 3/11/2016.
 */
public class FileController {

    public FileController() {

        Drive d = new Drive("c:");
        Folder folder = null;
        try {
            folder = d.addFolder("test");
        } catch (Exception e) {
        }
        if (folder == null) {
            return;
        }
        File file = null;
        try {
            file = folder.addFile("testFile.txt");
        } catch (Exception e) {
        }
    }
}
