import com.google.inject.Guice;
import com.google.inject.Injector;
import conf.BasicModule;
import conf.Service;

public class App {

  public static void main(String[] args) {
    Injector injector = Guice.createInjector(new BasicModule());
    Service service = injector.getInstance(Service.class);
    service.use();
  }

}
