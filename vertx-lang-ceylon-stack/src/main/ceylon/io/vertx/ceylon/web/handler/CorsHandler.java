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
import io.vertx.ceylon.core.http.HttpMethod;
import io.vertx.ceylon.core.http.HttpMethod;
import io.vertx.ceylon.core.http.HttpMethod;
import io.vertx.ceylon.core.http.HttpMethod;
import io.vertx.ceylon.core.http.HttpMethod;
import io.vertx.ceylon.core.http.HttpMethod;
import io.vertx.ceylon.core.http.HttpMethod;
import io.vertx.ceylon.core.http.HttpMethod;
import io.vertx.ceylon.core.http.HttpMethod;
import io.vertx.ceylon.core.http.HttpMethod;
import java.util.Set;
import io.vertx.ceylon.web.RoutingContext;
import io.vertx.core.Handler;

@Ceylon(major = 8)
@DocAnnotation$annotation$(description = "todo")
public class CorsHandler implements ReifiedType {

  @Ignore
  public static final io.vertx.lang.ceylon.ConverterFactory<io.vertx.ext.web.handler.CorsHandler, CorsHandler> TO_CEYLON = new io.vertx.lang.ceylon.ConverterFactory<io.vertx.ext.web.handler.CorsHandler, CorsHandler>() {
    public io.vertx.lang.ceylon.Converter<io.vertx.ext.web.handler.CorsHandler, CorsHandler> converter(final TypeDescriptor... descriptors) {
      return new io.vertx.lang.ceylon.Converter<io.vertx.ext.web.handler.CorsHandler, CorsHandler>() {
        public CorsHandler convert(io.vertx.ext.web.handler.CorsHandler src) {
          return new CorsHandler(src);
        }
      };
    }
  };

  @Ignore
  public static final io.vertx.lang.ceylon.Converter<CorsHandler, io.vertx.ext.web.handler.CorsHandler> TO_JAVA = new io.vertx.lang.ceylon.Converter<CorsHandler, io.vertx.ext.web.handler.CorsHandler>() {
    public io.vertx.ext.web.handler.CorsHandler convert(CorsHandler src) {
      return src.delegate;
    }
  };

  @Ignore public static final TypeDescriptor $TypeDescriptor$ = TypeDescriptor.klass(CorsHandler.class);
  @Ignore private final io.vertx.ext.web.handler.CorsHandler delegate;

  public CorsHandler(io.vertx.ext.web.handler.CorsHandler delegate) {
    this.delegate = delegate;
  }

  @Ignore 
  public TypeDescriptor $getType$() {
    return $TypeDescriptor$;
  }

  @Ignore
  public Object getDelegate() {
    return delegate;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("ceylon.language::Anything")
  public void handle(
    final @TypeInfo("io.vertx.ceylon.web::RoutingContext") @Name("arg0") @DocAnnotation$annotation$(description = "todo") RoutingContext arg0) {
    io.vertx.ext.web.RoutingContext arg_0 = io.vertx.ceylon.web.RoutingContext.TO_JAVA.safeConvert(arg0);
    delegate.handle(arg_0);
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("io.vertx.ceylon.web.handler::CorsHandler")
  public CorsHandler allowedMethod(
    final @TypeInfo("io.vertx.ceylon.core.http::HttpMethod") @Name("method") @DocAnnotation$annotation$(description = "todo") io.vertx.ceylon.core.http.HttpMethod method) {
    io.vertx.core.http.HttpMethod arg_0 = io.vertx.ceylon.core.http.httpMethod_.get_().getToJava().safeConvert(method);
    CorsHandler ret = io.vertx.ceylon.web.handler.CorsHandler.TO_CEYLON.converter().safeConvert(delegate.allowedMethod(arg_0));
    return this;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("io.vertx.ceylon.web.handler::CorsHandler")
  public CorsHandler allowedHeader(
    final @TypeInfo("ceylon.language::String") @Name("headerName") @DocAnnotation$annotation$(description = "todo") ceylon.language.String headerName) {
    java.lang.String arg_0 = io.vertx.lang.ceylon.ToJava.String.safeConvert(headerName);
    CorsHandler ret = io.vertx.ceylon.web.handler.CorsHandler.TO_CEYLON.converter().safeConvert(delegate.allowedHeader(arg_0));
    return this;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("io.vertx.ceylon.web.handler::CorsHandler")
  public CorsHandler allowedHeaders(
    final @TypeInfo("ceylon.language::Set<ceylon.language::String>") @Name("headerNames") @DocAnnotation$annotation$(description = "todo") ceylon.language.Set<ceylon.language.String> headerNames) {
    java.util.Set<java.lang.String> arg_0 = io.vertx.lang.ceylon.ToJava.convertSet(headerNames, io.vertx.lang.ceylon.ToJava.String);
    CorsHandler ret = io.vertx.ceylon.web.handler.CorsHandler.TO_CEYLON.converter().safeConvert(delegate.allowedHeaders(arg_0));
    return this;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("io.vertx.ceylon.web.handler::CorsHandler")
  public CorsHandler exposedHeader(
    final @TypeInfo("ceylon.language::String") @Name("headerName") @DocAnnotation$annotation$(description = "todo") ceylon.language.String headerName) {
    java.lang.String arg_0 = io.vertx.lang.ceylon.ToJava.String.safeConvert(headerName);
    CorsHandler ret = io.vertx.ceylon.web.handler.CorsHandler.TO_CEYLON.converter().safeConvert(delegate.exposedHeader(arg_0));
    return this;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("io.vertx.ceylon.web.handler::CorsHandler")
  public CorsHandler exposedHeaders(
    final @TypeInfo("ceylon.language::Set<ceylon.language::String>") @Name("headerNames") @DocAnnotation$annotation$(description = "todo") ceylon.language.Set<ceylon.language.String> headerNames) {
    java.util.Set<java.lang.String> arg_0 = io.vertx.lang.ceylon.ToJava.convertSet(headerNames, io.vertx.lang.ceylon.ToJava.String);
    CorsHandler ret = io.vertx.ceylon.web.handler.CorsHandler.TO_CEYLON.converter().safeConvert(delegate.exposedHeaders(arg_0));
    return this;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("io.vertx.ceylon.web.handler::CorsHandler")
  public CorsHandler allowCredentials(
    final @TypeInfo("ceylon.language::Boolean") @Name("allow") @DocAnnotation$annotation$(description = "todo") boolean allow) {
    boolean arg_0 = allow;
    CorsHandler ret = io.vertx.ceylon.web.handler.CorsHandler.TO_CEYLON.converter().safeConvert(delegate.allowCredentials(arg_0));
    return this;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("io.vertx.ceylon.web.handler::CorsHandler")
  public CorsHandler maxAgeSeconds(
    final @TypeInfo("ceylon.language::Integer") @Name("maxAgeSeconds") @DocAnnotation$annotation$(description = "todo") long maxAgeSeconds) {
    int arg_0 = (int)maxAgeSeconds;
    CorsHandler ret = io.vertx.ceylon.web.handler.CorsHandler.TO_CEYLON.converter().safeConvert(delegate.maxAgeSeconds(arg_0));
    return this;
  }

}