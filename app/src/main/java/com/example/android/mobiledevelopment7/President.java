package com.example.android.mobiledevelopment7;

public class President {
    private String mName;
    private String mRemarks;
    private String mPhotoURL;

    /*public President(String name, String remarks, String photoURL) {
        this.setName(name);
        this.setPhotoURL(photoURL);
        this.setRemarks(remarks);
    }*/

    public String getName() {
        return mName;
    }

    public void setName(String name) {
        this.mName = name;
    }

    public String getRemarks() {
        return mRemarks;
    }

    public void setRemarks(String remarks) {
        this.mRemarks = remarks;
    }

    public String getPhotoURL() {
        return mPhotoURL;
    }

    public void setPhotoURL(String photoURL) {
        this.mPhotoURL = photoURL;
    }
}
