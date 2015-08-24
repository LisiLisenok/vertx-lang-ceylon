package io.vertx.ceylon.codegen.testmodel;

import com.redhat.ceylon.compiler.java.metadata.TypeInfo;
import com.redhat.ceylon.compiler.java.metadata.TypeParameter;
import com.redhat.ceylon.compiler.java.metadata.TypeParameters;
import com.redhat.ceylon.compiler.java.metadata.Variance;
import ceylon.language.Callable;

public interface RefedInterface2 {

  Object getDelegate();

  @TypeInfo("ceylon.language::String")
  ceylon.language.String getString();

  @TypeInfo("io.vertx.ceylon.codegen.testmodel::RefedInterface2")
  RefedInterface2 setString(
    final @TypeInfo("ceylon.language::String") ceylon.language.String str);

  public class Impl implements RefedInterface2 {
    private final io.vertx.codegen.testmodel.RefedInterface2 delegate;

    public Impl(io.vertx.codegen.testmodel.RefedInterface2 delegate) {
      this.delegate = delegate;
    }

    public Object getDelegate() {
      return delegate;
    }

    @Override
    public ceylon.language.String getString() {
      ceylon.language.String ret = new ceylon.language.String(delegate.getString());
      return ret;
    }

    @Override
    public RefedInterface2 setString(final ceylon.language.String str) {
      java.lang.String arg_0 = str.toString();
      RefedInterface2 ret = new io.vertx.ceylon.codegen.testmodel.RefedInterface2.Impl(delegate.setString(arg_0));
      return ret;
    }
  }

}