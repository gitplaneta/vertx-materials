# vertx-material

This is a book effort that aims to document more advanced/internal about Vert.x.

[![Build Status](https://vietj.ci.cloudbees.com/buildStatus/icon?job=vertx-materials)](https://vietj.ci.cloudbees.com/job/vertx-materials/)

- [Asciidoctor](src/main/asciidoc/output/book.adoc)
- [Html](https://vietj.ci.cloudbees.com/job/vertx-materials/ws/target/docs/vertx-material/book.html)

## Building the book

```
> mvn package
> open target/docs/vertx-material/book.html
```

## Project structure

- [Asciidoc sources](src/main/asciidoc/): these contain references to the [Java code](src/main/java/)
- [Java code](src/main/java/): the various code examples included in the Asciidoc sources

The book uses the [Vert.x Docgen](https://github.com/vert-x3/vertx-docgen) project to render Java code
in the Asciidoc files, allowing real source code to be included in the project with Javadoc `{@link}` tags.

## Contributing

I welcome anyone wanting to contribute a chapter to this book. There is no predefined list of chapters, anyone
 is free to contribute content, given that it provides advanced/internal content about Vert.x that can be shared
 freely with the community.

I also welcome any edits, as some are not native English writes (like me), there are often mistakes that a native
English writer can correct.