<!DOCTYPE html>
<html>
<head>
    <meta name="layout" content="main"/>
</head>
<body>

<h1>News</h1>

<g:each var="newsItem" in="${newsItems}">
  <article>
    <header>
      <h2>${newsItem.title}</h2>
    </header>
      <p>${newsItem.content}</p>
    <footer>
      <p>Created by ${newsItem.author} on ${newsItem.createdDate}</p>
    </footer>
  </article>
</g:each>
</body>
</html>

