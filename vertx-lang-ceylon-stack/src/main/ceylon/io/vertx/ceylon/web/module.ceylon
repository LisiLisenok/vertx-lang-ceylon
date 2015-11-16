native("jvm")
module io.vertx.ceylon.web "1.0.0-SNAPSHOT" {
  native("jvm") import java.base "7";
  shared import ceylon.json "1.2.0";
  shared import io.vertx.ceylon.core "1.0.0-SNAPSHOT";
  shared import io.vertx.ceylon.auth.jwt "1.0.0-SNAPSHOT";
  shared import "io.vertx.vertx-web" "3.2.0-SNAPSHOT";
  shared optional import "io.vertx.vertx-web-templ-handlebars" "3.2.0-SNAPSHOT";
  shared optional import "io.vertx.vertx-web-templ-thymeleaf" "3.2.0-SNAPSHOT";
  shared optional import "io.vertx.vertx-web-templ-jade" "3.2.0-SNAPSHOT";
  shared optional import "io.vertx.vertx-web-templ-mvel" "3.2.0-SNAPSHOT";
}