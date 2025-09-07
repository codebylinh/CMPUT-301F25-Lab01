package com.example.lonelytwitter;

import androidx.annotation.NonNull;
import java.util.Date;

public abstract class Tweet implements Tweetable {
    // Attributes (private)
    private Date date;
    private String message;

    
    public Tweet(String message) {
        this(new Date(), message); // calls the other constructor
    }

 
    public Tweet(Date date, String message) {
        this.date = date;
        this.message = message;
    }

    // Abstract method (must be overridden by children)
    public abstract Boolean isImportant();

    
    @Override public Date getDate() { return date; }
    public void setDate(Date date) { this.date = date; }

    @Override public String getMessage() { return message; }
    public void setMessage(String message) { this.message = message; }

    @Override @NonNull
    public String toString() {
        return "[" + date + "] " + message + " (important=" + isImportant() + ")";
    }
}
