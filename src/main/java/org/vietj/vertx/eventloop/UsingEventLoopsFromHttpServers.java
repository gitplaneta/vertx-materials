package org.vietj.vertx.eventloop;

import io.vertx.core.Handler;
import io.vertx.core.Vertx;
import io.vertx.core.http.HttpServerRequest;
import io.vertx.docgen.Source;

/**
 * @author <a href="mailto:julien@julienviet.com">Julien Viet</a>
 */
@Source
public class UsingEventLoopsFromHttpServers {

  private static Handler<HttpServerRequest> requestHandler = req -> {};

  public static void main(String[] args) {
    Vertx vertx = Vertx.vertx();
    vertx.runOnContext(v -> {
      vertx.createHttpServer().requestHandler(requestHandler).listen(result -> {
        // This executes in a context
        System.out.println("Current thread is " + Thread.currentThread());
      });
      vertx.createHttpServer().requestHandler(requestHandler).listen(result -> {
        // This executes in the same context
        System.out.println("Current thread is " + Thread.currentThread());
      });
    });
  }
}
