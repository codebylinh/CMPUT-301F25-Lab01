package com.example.lonelytwitter;

import androidx.annotation.NonNull;
import java.util.Date;

public abstract class Tweet implements Tweetable {
    // Attributes (private)
    private Date date;
    private String message;

    // Constructor 1: only message -> default date = now
    public Tweet(String message) {
        this(new Date(), message); // calls the other constructor
    }

    // Constructor 2: date + message
    public Tweet(Date date, String message) {
        // use 'this.' to assign to fields (message = message does nothing!)
        this.date = date;
        this.message = message;
    }

    // Abstract method (must be overridden by children)
    public abstract Boolean isImportant();

    // Getters/Setters (also required by Tweetable)
    @Override public Date getDate() { return date; }
    public void setDate(Date date) { this.date = date; }

    @Override public String getMessage() { return message; }
    public void setMessage(String message) { this.message = message; }

    @Override @NonNull
    public String toString() {
        return "[" + date + "] " + message + " (important=" + isImportant() + ")";
    }
}
