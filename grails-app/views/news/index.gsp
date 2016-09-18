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
    <g:each in="${newsItems}">
    <article>
        <g:link action="edit" id="${it.id}">Update</g:link>
        <g:link action="delete" id="${it.id}">Delete</g:link>
        <g:link action="show" id="${it.id}">Show</g:link>
        ${raw(it.content)}
      <footer>
          <p>Created by <%--${it.author.name}--%> on ${it.dateCreated}. Last updated on ${it.lastUpdated}.</p>
      </footer>
    </article>
  </g:each>

</main>
</body>
</html>


