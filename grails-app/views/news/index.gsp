<!DOCTYPE html>
<html>
<head>
    <meta name="layout" content="main"/>
</head>
<body>

<main>
    <h1>News</h1>

    <nav>
        <ul>
            <li><g:link action="create">Submit News</g:link></li>
        </ul>
    </nav>

    <g:if test="${!newsItems}">
        <p>No news submitted</p>
    </g:if>
    <g:else>
        <div id="recentNews">
            <g:render template="newsItems" model="['newsItems': newsItems]"/>
        </div>
        <form action="olderNews'>
        <button id="showMoreNews">Older</button>
        </form>
    </g:else>

</main>
<asset:javascript src="news/index.js"/>
</body>
</html>


