package com.example.lonelytwitter;

import java.util.Date;

/** Abstract base class representing a current mood. */
public abstract class Mood {
    // Encapsulated attribute
    private Date date;

    // Constructor: default date = now
    public Mood() {
        this(new Date());
    }

    // Constructor: explicit date
    public Mood(Date date) {
        this.date = date;
    }

    // Getter / Setter (encapsulation)
    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    // Each mood must return a string representing that mood
    public abstract String getMoodString();

    @Override
    public String toString() {
        return "[" + date + "] " + getMoodString();
    }
}
