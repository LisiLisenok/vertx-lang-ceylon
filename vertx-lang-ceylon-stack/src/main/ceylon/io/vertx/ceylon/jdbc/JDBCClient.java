package io.vertx.ceylon.jdbc;

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
import io.vertx.ceylon.sql.SQLConnection;
import io.vertx.ceylon.core.Vertx;
import io.vertx.core.json.JsonObject;
import io.vertx.core.AsyncResult;
import io.vertx.ceylon.sql.SQLClient;
import io.vertx.core.Handler;

@Ceylon(major = 8)
@DocAnnotation$annotation$(description = " An asynchronous client interface for interacting with a JDBC compliant database\n")
public class JDBCClient extends SQLClient implements ReifiedType {

  @Ignore
  public static final io.vertx.lang.ceylon.ConverterFactory<io.vertx.ext.jdbc.JDBCClient, JDBCClient> TO_CEYLON = new io.vertx.lang.ceylon.ConverterFactory<io.vertx.ext.jdbc.JDBCClient, JDBCClient>() {
    public io.vertx.lang.ceylon.Converter<io.vertx.ext.jdbc.JDBCClient, JDBCClient> converter(final TypeDescriptor... descriptors) {
      return new io.vertx.lang.ceylon.Converter<io.vertx.ext.jdbc.JDBCClient, JDBCClient>() {
        public JDBCClient convert(io.vertx.ext.jdbc.JDBCClient src) {
          return new JDBCClient(src);
        }
      };
    }
  };

  @Ignore
  public static final io.vertx.lang.ceylon.Converter<JDBCClient, io.vertx.ext.jdbc.JDBCClient> TO_JAVA = new io.vertx.lang.ceylon.Converter<JDBCClient, io.vertx.ext.jdbc.JDBCClient>() {
    public io.vertx.ext.jdbc.JDBCClient convert(JDBCClient src) {
      return src.delegate;
    }
  };

  @Ignore public static final TypeDescriptor $TypeDescriptor$ = new io.vertx.lang.ceylon.VertxTypeDescriptor(TypeDescriptor.klass(JDBCClient.class), io.vertx.ext.jdbc.JDBCClient.class, TO_JAVA, TO_CEYLON);
  @Ignore private final io.vertx.ext.jdbc.JDBCClient delegate;

  public JDBCClient(io.vertx.ext.jdbc.JDBCClient delegate) {
    super(delegate);
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

}
