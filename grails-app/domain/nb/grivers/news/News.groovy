package nb.grivers.news

class News {

    static constraints = {
        //title(blank: false, minSize: 3, maxSize: 40)
        content(blank: false, minSize: 10, maxSize: 500)
        // author(nullable: false)
        //created(nullable: false)
    }

    //String title
    String content
    //User author
    Date dateCreated
    Date lastUpdated

}
