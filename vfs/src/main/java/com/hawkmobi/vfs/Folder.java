package com.hawkmobi.vfs;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Iterator;

/**
 * Created by diwakar.mishra on 2/24/2016.
 */
public class Folder extends BaseFile {
    private ArrayList<File> files;
    private ArrayList<Folder> folders;

    protected Folder(String name, Folder parent) {

        super(name, parent);
        files = new ArrayList<>();
        folders = new ArrayList<>();
    }

    public boolean isFileExists(String name) {
        for (File f : files) {
            if (f.getName().equalsIgnoreCase(name)) {
                return true;
            }
        }
        return false;
    }
    public boolean isFolderExists(String name) {
        for (Folder f : folders) {
            if (f.getName().equalsIgnoreCase(name)) {
                return true;
            }
        }
        return false;
    }
    public File addFile(String name) throws Exception {
        if (!isFileExists(name)){
            File f = new File(name, this);
            files.add(f);
            return f;

        }
        throw new Exception("Same name File already exists");
    }

    public Folder addFolder(String name) throws Exception {
        if (!isFolderExists(name)){
            Folder f = new Folder(name, this);
            folders.add(f);
            return f;

        }
        throw new Exception("Same name Folder already exists");
    }

    public boolean renameFile(String oldName, String newName) throws Exception {
        if (!isFileExists(oldName)){
            throw new Exception("File not found!");

        }
        if (isFileExists(newName)){
            throw new Exception("Same name File already exists");
        }
        setName(newName);
        return true;
    }
    public boolean renameFolder(String oldName, String newName) throws Exception {
        if (!isFolderExists(oldName)) {
            throw new Exception("Folder not found!");

        }
        if (isFolderExists(newName)) {
            throw new Exception("Same name Folder already exists");
        }
        setName(newName);
        return true;
    }
    public boolean deleteFile(String name) throws Exception {
        for (int i=0;i<files.size();i++) {
            File f = files.get(i);
            if (f.getName().equalsIgnoreCase(name)) {
                files.remove(i);
                return true;
            }
        }
        throw new Exception("File not found!");
    }
    public boolean deleteFolder(String name) throws Exception {
        for (int i=0;i<folders.size();i++) {
            Folder f = folders.get(i);
            if (f.getName().equalsIgnoreCase(name)) {
                folders.remove(i);
                return true;
            }
        }
        throw new Exception("Folder not found!");
    }
    public Iterator<File> listFiles(){
        return files.iterator();
    }
    public Iterator<Folder> listFolder(){
        return folders.iterator();
    }
}
