import org.junit.*;
import static org.junit.Assert.*;
import java.util.ArrayList;
import org.fluentlenium.adapter.FluentTest;
import org.junit.ClassRule;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import static org.assertj.core.api.Assertions.assertThat;

public class AppTest extends FluentTest {
  public WebDriver webDriver = new HtmlUnitDriver();

  @Override
  public WebDriver getDefaultDriver() {
      return webDriver;
  }

  @ClassRule
  public static ServerRule server = new ServerRule();

  @Test
  public void rootTest() {
    goTo("http://localhost:4567/");
    assertThat(pageSource()).contains("Triangle finder");
  }

  @Test
  public void triangleTest() {
    goTo("http://localhost:4567/");
    fill("#sideOne").with("5");
    fill("#sideTwo").with("5");
    fill("#sideThree").with("5");
    submit(".btn");
    assertThat(pageSource()).contains("Your triangle is equilateral");
  }
}
