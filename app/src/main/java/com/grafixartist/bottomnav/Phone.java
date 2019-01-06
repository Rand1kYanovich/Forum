package com.grafixartist.bottomnav;

import android.media.Image;

/**
 * Created by Suleiman on 03/02/17.
 */


public class Phone {

    private String whois;
    private String about;
    private String time;
    private String photo;
    private String quote;

    public Phone(String whois, String about, String time, String photo, String quote){

        this.whois=whois;
        this.about = about;
        this.time = time;
        this.photo = photo;
        this.quote = quote;

    }

    public String getWhoIs() {
        return this.whois;
    }

    public void setWhoIs(String whois) {
        this.whois = whois;
    }

    public String getAbout() {
        return this.about;
    }

    public void setAbout(String about) {
        this.about = about;
    }

    public String getTime() {
        return this.time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getQuote() {
        return this.quote;
    }

    public void setQuote(String quote) {
        this.quote = quote;
    }

    public String getPhoto() {
        return this.photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }
}