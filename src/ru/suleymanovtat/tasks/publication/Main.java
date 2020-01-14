package ru.suleymanovtat.tasks.publication;

public class Main {
    public static void main(String[] args) {
        Publication mPublication = new Publication("The new era");
        System.out.println(mPublication.getInfo());


        Newspaper mNewspaper = new Newspaper("Football results", "Sport news");
        System.out.println(mNewspaper.getInfo());

        Article mArticle = new Article("Why the Sun is hot", " Dr James Smith");
        System.out.println(mArticle.getInfo());

        Announcement mAnnouncement = new Announcement("Will sell a house", 30);
        System.out.println(mAnnouncement.getInfo());
    }
}
