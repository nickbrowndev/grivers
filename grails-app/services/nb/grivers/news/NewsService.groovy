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

    def getRecentNews(int offset, int max) {
        def newsItems = News.list(sort: "dateCreated", order: "desc", max: max, offset: offset)
        newsItems
    }

    String convertMarkup(String markup) {
        Parser parser = Parser.builder().build()
        HtmlRenderer renderer = HtmlRenderer.builder().build()
        Node document = parser.parse(markup)
        renderer.render(document)
    }
}