async-checklist-cljs
====================

This is a project to build the canonical checklist application in ClojureScript with the new core.async libraries.

This is more of a "teach myself some stuff" project than a "teach other people anything" project for now. To start with, I'm taking Bruce Hauman's [indispensable exegesis of what core.async means in a ClojureScript context](http://rigsomelight.com/2013/07/18/clojurescript-core-async-todos.html) and stripping out the server-side stuff somewhat, so the result is cljs for the client side and static HTML on the server. (I'm still using [ring](https://github.com/ring-clojure/ring) as a server, since lein will just download the right jars and fire it up.)

In the future I may try to mess around on the server side enough to at least get a [jade](http://jade-lang.com/) compiler working, since for my personal projects I like to live in an alternate timeline where SGML-derived syntax remained confined to some benighted IBM commercial backwater, where it belongs. [Ryan Greenhall's clj-jade library](https://github.com/ryangreenhall/clj-jade) looks like the most promising route to this presently.

Notes
-----

http://squirrel.pl/blog/2013/01/02/get-started-with-clojurescript-with-leiningen-templates/

