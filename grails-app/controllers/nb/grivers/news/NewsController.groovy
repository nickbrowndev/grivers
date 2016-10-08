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

    def index() {
        int offset = params.int("offset") ?: 0
        int max = params.int("max") ?: 2
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
        [newsItems: results, newsItemsCount: newsItems.totalCount]
    }

    def convertMarkup() {
        def convertedMarkup = params.content ?: newsService.convertMarkup(params.content)

        render convertedMarkup
    }
}
