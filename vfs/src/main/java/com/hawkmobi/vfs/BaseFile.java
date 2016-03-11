package com.hawkmobi.vfs;

/**
 * Created by diwakar.mishra on 2/24/2016.
 */
public class BaseFile {
    private String name;
    private Folder parent;
    protected BaseFile(String name, Folder parent) {
        this.name = name;
        this.parent = parent;
    }

    public Folder getParent() {
        return parent;
    }

    public String getName() {
        return name;
    }

    protected void setName(String name) {
        this.name = name;
    }
}
