<!doctype html>
<html lang="en" class="no-js">
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8"/>
    <meta http-equiv="X-UA-Compatible" content="IE=edge"/>
    <title>
        <g:layoutTitle default="5 Rivers Squash"/>
    </title>
    <meta name="viewport" content="width=device-width, initial-scale=1"/>
    <link href="https://fonts.googleapis.com/css?family=Roboto:400i,700" rel="stylesheet">

    <asset:stylesheet src="application.css"/>

    <g:layoutHead/>
</head>
<body>

<nav>

    <header>
        <a href="/#">
            <i id="icon">
                <asset:image src="5rivers/logo.png"/>
            </i> 5 Rivers Squash
        </a>
    </header>
    <button type="button" id="menu" data-toggle="collapse" data-target="#navMenu" aria-controls="navMenu"
            aria-expanded="false" aria-label="Toggle navigation">
        &#9776;
        <span class="sr-only">Toggle navigation</span>s
    </button>

    <div id="navMenu" class="collapse navbar-toggleable-xs">
        <ul class="nav navbar-nav">
            <li class="nav-link active">
                <a href="/">News</a>
                <span id="activeMarker">(current)</span>
            </li>
            <li class="nav-link">
                <a href="/club">Club</a>
            </li>
            <li class="nav-link">
                <a href="#">Events</a>
            </li>
            <li class="nav-link">
                <a href="/teams">Teams</a>
            </li>
            <li>
                <a href="#">Leagues</a>
            </li>
            <li>
                <a href="#">Media</a>
            </li>
            <li>
                <a href="#">Training</a>
            </li>
            <li>
                <a href="#">Sponsors</a>
            </li>
            <li>
                <a href="devforum">Development Forum</a>
            </li>
        </ul>
        </div>

</nav>

    <g:layoutBody/>

    <div class="footer" role="contentinfo"></div>

    <div id="spinner" class="spinner" style="display:none;">
        <g:message code="spinner.alt" default="Loading&hellip;"/>
    </div>

    <asset:javascript src="application.js"/>

</body>
</html>
