package nb.grivers.news

class NewsController {

    static scaffold = NewsItem

    def newsService

    def recent() {

        def newsItems = []
        newsItems << new NewsItem(author: "Nick", createdDate: new Date(), title: "New news item1", content: "Mucho content goes here1")
        newsItems << new NewsItem(author: "Nick", createdDate: new Date(), title: "New news item2", content: "Mucho content goes here2")
        newsItems << new NewsItem(author: "Nick", createdDate: new Date(), title: "New news item3", content: "Mucho content goes here3")
        [newsItems: newsItems]
    }

    def latest() {
        render(view: "recent")
        [newsItems: NewsItem.list(sort: created, order: desc, max: 5)]
    }

}
