package nb.grivers.news

class NewsController {

    def newsService

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
        def newsItems = newsService.getRecentNews(0)
        [newsItems: newsItems]
    }

    def convertMarkup() {
        def convertedMarkup = params.content != null ? newsService.convertMarkup(params.content) : null

        render convertedMarkup
    }
}
