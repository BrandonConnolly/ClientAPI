package com.example;

public class Connection {
    private String url;
    private String port;
    private String path;

    public Connection(String url, String port, String path) {
        this.url = url;
        this.port = port;
        this.path = path;


    }

    public void setUrl(String url) {
        this.url = url;
    }

    public void setPort(String port) {
        this.port = port;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public String getUrl() {
        return this.url;
    }

    public String getPort() {
        return this.port;
    }

    public String getPath() {
        return this.path;
    }


}
