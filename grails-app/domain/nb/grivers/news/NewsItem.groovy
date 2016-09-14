package nb.grivers.news

import nb.grivers.user.User

class NewsItem {

    static constraints = {
    }

    String title
    String content
    User author
    Date created = new Date()

}
