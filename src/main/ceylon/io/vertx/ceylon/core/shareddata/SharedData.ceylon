import io.vertx.core.shareddata {
  SharedData_=SharedData
}
import io.vertx.ceylon.core.shareddata {
  AsyncMap,
  Lock,
  LocalMap,
  Counter
}
import java.lang {
  String_=String
}
import io.vertx.lang.ceylon {
  Delegating
}
/* Generated from io.vertx.core.shareddata.SharedData */
shared abstract class SharedData(SharedData_ delegate) satisfies Delegating {
  shared formal Anything(*<[String,Anything(Throwable|AsyncMap<Object,Object>)]>) getClusterWideMap;
  shared formal Anything(*<[String,Anything(Throwable|Lock)]>) getLock;
  shared formal Anything(*<[String,Integer,Anything(Throwable|Lock)]>) getLockWithTimeout;
  shared formal Anything(*<[String,Anything(Throwable|Counter)]>) getCounter;
  shared formal LocalMap<Object,Object>(*<[String]>) getLocalMap;
}
