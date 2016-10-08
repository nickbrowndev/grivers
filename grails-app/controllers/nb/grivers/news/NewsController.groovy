package nb.grivers.news

class NewsController {

    def newsService
    static final def MAX_NEWS_ITEMS = 2;

    def create() {
    }

    def save() {
        def news = new News(params)
        newsService.save(news)
        redirect action: "index"
    }

    def update() {
        def news = newsService.get(params.id);
        news.properties = params;
        newsService.save(news);
        redirect action: "index"
    }

    def edit() {
        def news = newsService.get(params.id)
        [news: news]
    }

    def show() {
        def news = newsService.get(params.id)
        [news: news]
    }

    def index(int offset) {
        def max = MAX_NEWS_ITEMS;
        def newsItems = newsService.getRecentNews(offset, max)
        def results = []
        for (newsItem in newsItems) {
            def news = new News(
                    content: newsService.convertMarkup(newsItem.content),
                    dateCreated: newsItem.dateCreated,
                    lastUpdated: newsItem.lastUpdated)
            news.id = newsItem.id;
            results << news;
        }
        [newsItems: newsItems, totalNewsItems: newsItems.totalCount, nextOffset: offset + max]
    }

    // Make this use index. Add parameters to Index()?
    def olderNews() {
        def newsItems = newsService.getRecentNews(params.offset, MAX_NEWS_ITEMS)
        render(template: "newsItems", model: [newsItems: newsItems])
    }

    def convertMarkup() {
        def convertedMarkup = params.content != null ? newsService.convertMarkup(params.content) : null

        render convertedMarkup
    }
}
