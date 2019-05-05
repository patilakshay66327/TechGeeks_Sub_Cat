package com.example.owner.techapp.datamodel;

public class Article
{
    private  String articleName;
    private int photo;

    public Article()
    {
    }

    public Article(String articleName, int photo)
    {
        this.articleName = articleName;
        this.photo = photo;
    }

    public String getArticleName() {
        return articleName;
    }

    public void setArticleName(String articleName) {
        this.articleName = articleName;
    }

    public int getPhoto() {
        return photo;
    }

    public void setPhoto(int photo) {
        this.photo = photo;
    }
}
