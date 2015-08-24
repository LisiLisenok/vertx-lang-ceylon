package io.vertx.ceylon.core;

import com.redhat.ceylon.compiler.java.metadata.TypeInfo;
import com.redhat.ceylon.compiler.java.metadata.TypeParameter;
import com.redhat.ceylon.compiler.java.metadata.TypeParameters;
import com.redhat.ceylon.compiler.java.metadata.Variance;
import ceylon.language.Callable;
import java.util.List;
import java.util.Map.Entry;
import java.util.Set;

public class MultiMap {

  private final io.vertx.core.MultiMap delegate;

  public MultiMap(io.vertx.core.MultiMap delegate) {
    this.delegate = delegate;
  }

  public Object getDelegate() {
    return delegate;
  }

  @TypeInfo("io.vertx.ceylon.core::MultiMap")
  public static MultiMap caseInsensitiveMultiMap() {
    MultiMap ret = new io.vertx.ceylon.core.MultiMap(io.vertx.core.MultiMap.caseInsensitiveMultiMap());
    return ret;
  }

  @TypeInfo("ceylon.language::String")
  public ceylon.language.String get(
    final @TypeInfo("ceylon.language::String") ceylon.language.String name) {
    java.lang.String arg_0 = name.toString();
    ceylon.language.String ret = new ceylon.language.String(delegate.get(arg_0));
    return ret;
  }

  @TypeInfo("ceylon.language::List<ceylon.language::String>")
  public List<ceylon.language.String> getAll(
    final @TypeInfo("ceylon.language::String") ceylon.language.String name) {
    java.lang.String arg_0 = name.toString();
    List<ceylon.language.String> ret = null;
    return ret;
  }

  @TypeInfo("ceylon.language::Boolean")
  public boolean contains(
    final @TypeInfo("ceylon.language::String") ceylon.language.String name) {
    java.lang.String arg_0 = name.toString();
    boolean ret = delegate.contains(arg_0);
    return ret;
  }

  @TypeInfo("ceylon.language::Boolean")
  public boolean isEmpty() {
    boolean ret = delegate.isEmpty();
    return ret;
  }

  @TypeInfo("ceylon.language::Set<ceylon.language::String>")
  public Set<ceylon.language.String> names() {
    Set<ceylon.language.String> ret = null;
    return ret;
  }

  @TypeInfo("io.vertx.ceylon.core::MultiMap")
  public MultiMap add(
    final @TypeInfo("ceylon.language::String") ceylon.language.String name, 
    final @TypeInfo("ceylon.language::String") ceylon.language.String value) {
    java.lang.String arg_0 = name.toString();
    java.lang.String arg_1 = value.toString();
    MultiMap ret = new io.vertx.ceylon.core.MultiMap(delegate.add(arg_0, arg_1));
    return ret;
  }

  @TypeInfo("io.vertx.ceylon.core::MultiMap")
  public MultiMap addAll(
    final @TypeInfo("io.vertx.ceylon.core::MultiMap") MultiMap map) {
    io.vertx.core.MultiMap arg_0 = (io.vertx.core.MultiMap)map.getDelegate();
    MultiMap ret = new io.vertx.ceylon.core.MultiMap(delegate.addAll(arg_0));
    return ret;
  }

  @TypeInfo("io.vertx.ceylon.core::MultiMap")
  public MultiMap set(
    final @TypeInfo("ceylon.language::String") ceylon.language.String name, 
    final @TypeInfo("ceylon.language::String") ceylon.language.String value) {
    java.lang.String arg_0 = name.toString();
    java.lang.String arg_1 = value.toString();
    MultiMap ret = new io.vertx.ceylon.core.MultiMap(delegate.set(arg_0, arg_1));
    return ret;
  }

  @TypeInfo("io.vertx.ceylon.core::MultiMap")
  public MultiMap setAll(
    final @TypeInfo("io.vertx.ceylon.core::MultiMap") MultiMap map) {
    io.vertx.core.MultiMap arg_0 = (io.vertx.core.MultiMap)map.getDelegate();
    MultiMap ret = new io.vertx.ceylon.core.MultiMap(delegate.setAll(arg_0));
    return ret;
  }

  @TypeInfo("io.vertx.ceylon.core::MultiMap")
  public MultiMap remove(
    final @TypeInfo("ceylon.language::String") ceylon.language.String name) {
    java.lang.String arg_0 = name.toString();
    MultiMap ret = new io.vertx.ceylon.core.MultiMap(delegate.remove(arg_0));
    return ret;
  }

  @TypeInfo("io.vertx.ceylon.core::MultiMap")
  public MultiMap clear() {
    MultiMap ret = new io.vertx.ceylon.core.MultiMap(delegate.clear());
    return ret;
  }

  @TypeInfo("ceylon.language::Integer")
  public long size() {
    long ret = delegate.size();
    return ret;
  }

}