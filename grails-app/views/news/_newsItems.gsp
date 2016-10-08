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