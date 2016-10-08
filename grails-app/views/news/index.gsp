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
    ${max}
        <div id="recentNews">
            <g:render template="newsItems" model="['newsItems': newsItems]"/>
        </div>
        <g:paginate controller="news" action="index" total="${newsItemsCount}" max="2"/>
    </g:else>

</main>
<asset:javascript src="news/index.js"/>
</body>
</html>


