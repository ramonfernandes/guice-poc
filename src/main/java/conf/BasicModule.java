package conf;

import bean.Book;
import com.google.inject.AbstractModule;
import com.google.inject.Provides;
import com.google.inject.name.Named;
import com.google.inject.name.Names;

public class BasicModule extends AbstractModule {

  @Provides
  @Named("Car")
  public Car getCarObject() {
    return new Car();
  }

  @Override
  protected void configure() {
    bind(Book.class)
        .annotatedWith(Names.named("BookName"))
        .toInstance(new Book());
    bind(Car.class);
  }
}
