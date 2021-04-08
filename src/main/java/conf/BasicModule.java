package conf;

import bean.Book;
import bean.Car;
import bean.Interface;
import com.google.inject.AbstractModule;
import com.google.inject.name.Names;

public class BasicModule extends AbstractModule {

  @Override
  protected void configure() {
    bind(Interface.class)
        .annotatedWith(Names.named("BookName"))
        .toInstance(new Book());

    bind(Interface.class)
        .annotatedWith(Names.named("CarName"))
        .toInstance(new Car());
  }
}
