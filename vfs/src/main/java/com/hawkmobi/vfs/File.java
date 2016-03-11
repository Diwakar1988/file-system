package com.hawkmobi.vfs;

/**
 * Created by diwakar.mishra on 2/24/2016.
 */
public class File extends BaseFile {
    private byte[] data;

    protected File(String name, Folder parent) {
        super(name, parent);
    }

    public byte[] getData() {
        return data;
    }

    public void setData(byte[] data) {
        this.data = data;
    }

    public long size() {
        return data == null ? 0 : data.length;
    }
}
