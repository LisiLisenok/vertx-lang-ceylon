import java.lang {
  String_=String
}
import io.vertx.ceylon.core.buffer {
  Buffer
}
import io.vertx.lang.ceylon {
  Delegating
}
import io.vertx.core.net {
  PemTrustOptions_=PemTrustOptions
}
/* Generated from io.vertx.core.net.PemTrustOptions */
shared class PemTrustOptions(
  shared String certPaths,
  shared Buffer certValues) satisfies
  TrustOptions {
}
