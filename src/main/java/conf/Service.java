package conf;


import bean.Book;
import bean.Car;
import com.google.inject.Guice;
import com.google.inject.Inject;
import com.google.inject.Injector;

public class Service extends BasicModule {

  private Car car;

  @Inject
  public Service(Car car) {
    this.car = car;
  }

  public void use() {
    Injector injector = Guice.createInjector(new BasicModule());
    Book book = injector.getInstance(Book.class);

    book.use();
    car.use();
  }

}
