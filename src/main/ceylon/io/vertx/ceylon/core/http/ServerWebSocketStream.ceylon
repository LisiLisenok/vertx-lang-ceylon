import io.vertx.lang.ceylon {
  Delegating
}
import io.vertx.ceylon.core.http {
  ServerWebSocket
}
import io.vertx.ceylon.core.streams {
  ReadStream
}
import io.vertx.core.http {
  ServerWebSocketStream_=ServerWebSocketStream
}
/* Generated from io.vertx.core.http.ServerWebSocketStream */
shared abstract class ServerWebSocketStream(ServerWebSocketStream_ delegate) satisfies Delegating
  & ReadStream<ServerWebSocket> {
  shared actual formal ServerWebSocketStream(*<[Anything(Throwable)]>) exceptionHandler;
  shared actual formal ServerWebSocketStream(*<[Anything(ServerWebSocket)]>) handler;
  shared actual formal ServerWebSocketStream(*<[]>) pause;
  shared actual formal ServerWebSocketStream(*<[]>) resume;
  shared actual formal ServerWebSocketStream(*<[Anything()]>) endHandler;
}
