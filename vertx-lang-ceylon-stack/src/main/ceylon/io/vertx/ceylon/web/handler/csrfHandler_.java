package io.vertx.ceylon.web.handler;

import com.redhat.ceylon.compiler.java.metadata.Ceylon;
import com.redhat.ceylon.compiler.java.metadata.TypeInfo;
import com.redhat.ceylon.compiler.java.metadata.TypeParameter;
import com.redhat.ceylon.compiler.java.metadata.TypeParameters;
import com.redhat.ceylon.compiler.java.metadata.Variance;
import com.redhat.ceylon.compiler.java.metadata.Ignore;
import com.redhat.ceylon.compiler.java.metadata.Name;
import com.redhat.ceylon.compiler.java.runtime.model.TypeDescriptor;
import com.redhat.ceylon.compiler.java.runtime.model.ReifiedType;
import ceylon.language.Callable;
import ceylon.language.DocAnnotation$annotation$;
import io.vertx.ceylon.web.RoutingContext;
import io.vertx.core.Handler;

@Name("csrfHandler")
@com.redhat.ceylon.compiler.java.metadata.Object
public class csrfHandler_ {

  private static final csrfHandler_ instance = new csrfHandler_();

  @Ignore
  @TypeInfo("io.vertx.ceylon.web.handler::csrfHandler")
  public static csrfHandler_ get_() {
    return instance;
  }


  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("io.vertx.ceylon.web.handler::CSRFHandler")
  public static CSRFHandler create(
    final @TypeInfo("ceylon.language::String") @Name("secret") @DocAnnotation$annotation$(description = "todo") ceylon.language.String secret) {
    java.lang.String arg_0 = io.vertx.lang.ceylon.ToJava.String.safeConvert(secret);
    CSRFHandler ret = io.vertx.ceylon.web.handler.CSRFHandler.TO_CEYLON.converter().safeConvert(io.vertx.ext.web.handler.CSRFHandler.create(arg_0));
    return ret;
  }

}