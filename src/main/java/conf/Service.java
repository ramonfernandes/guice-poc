package conf;


import bean.Book;
import com.google.inject.Guice;
import com.google.inject.Inject;
import com.google.inject.Injector;

public class Service extends BasicModule {

  public Service() {
  }

  public void use() {
    Injector injector = Guice.createInjector(new BasicModule());
    Book book = injector.getInstance(Book.class);

    book.use();
  }

}
