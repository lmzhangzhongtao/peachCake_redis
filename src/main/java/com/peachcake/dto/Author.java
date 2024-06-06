package com.peachcake.dto;

import java.util.Date;

public class Author {
    public String id;
    public String runoobTitle;
    public String runoobAuthor;
    public Date submissionDate;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getRunoobTitle() {
        return runoobTitle;
    }

    public void setRunoobTitle(String runoobTitle) {
        this.runoobTitle = runoobTitle;
    }

    public String getRunoobAuthor() {
        return runoobAuthor;
    }

    public void setRunoobAuthor(String runoobAuthor) {
        this.runoobAuthor = runoobAuthor;
    }

    public Date getSubmissionDate() {
        return submissionDate;
    }

    public void setSubmissionDate(Date submissionDate) {
        this.submissionDate = submissionDate;
    }



}
