package nb.grivers.news

import grails.transaction.Transactional
import org.commonmark.html.HtmlRenderer
import org.commonmark.node.Node
import org.commonmark.parser.Parser

@Transactional
class NewsService {

    def save(News news) {
        news.save();
    }

    def get(def id) {
        News.get(id);
    }

    List<News> getRecentNews(int offset) {
        def newsItems = News.list(/*sort: "created", order: "desc", max: 5, offset: offset*/)
        def results = []
        for (newsItem in newsItems) {
            def news = new News(
                    content: convertMarkup(newsItem.content),
                    dateCreated: newsItem.dateCreated,
                    lastUpdated: newsItem.lastUpdated)
            news.id = newsItem.id;
            results << news;
        }
        results
    }

    String convertMarkup(String markup) {
        Parser parser = Parser.builder().build()
        HtmlRenderer renderer = HtmlRenderer.builder().build()
        Node document = parser.parse(markup)
        renderer.render(document)
    }
}