<!DOCTYPE html>
<html>
<head>
    <meta name="layout" content="main"/>
</head>

<body>

<main>
    <h1>Edit News</h1>

    <g:form action="update" id="${news.id}">

        <p class="alert alert-info" role="alert">The news content should be written in Markdown syntax. Please see
            <a href="https://github.com/adam-p/markdown-here/wiki/Markdown-Cheatsheet">Markdown Syntax Help</a>
            for further information.</p>
        <g:textArea class="newsContent" id="content" name="content">${news.content}</g:textArea>
        <button type="button" id="preview"
                data-url="${g.createLink(controller: 'news', action: 'convertMarkup')}">Preview</button>
        <g:actionSubmit value="Update"/>

    </g:form>

    <div class="well" id="convertedMarkup"></div>

</main>
<asset:javascript src="news/create.js"/>
</body>
</html>


