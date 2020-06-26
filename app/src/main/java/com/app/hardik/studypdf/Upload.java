package com.app.hardik.studypdf;

//Model Class for storing information of Uploaded Pdf

public class Upload {
    public String name;
    public String url;
    public String price;

    // Default constructor required for calls to
    // DataSnapshot.getValue(User.class)
    public Upload() {
    }

    public Upload(String name, String url, String price) {
        this.name = name;
        this.url = url;
        this.price = price;
    }

    public String getName() {
        return name;
    }
    public String getUrl() {
        return url;
    }
    public String getPrice(){
        return price;
    }
}
