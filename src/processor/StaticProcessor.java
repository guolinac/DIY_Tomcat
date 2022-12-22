package processor;

import connector.Request;
import connector.Response;

import java.io.IOException;

/**
 * 接受Request，然后将静态资源的请求的Response准备好，再返回给用户
 */
public class StaticProcessor {

  public void process(Request request, Response response) {
    try {
      response.sendStaticResource();
    } catch (IOException e) {
      e.printStackTrace();
    }
  }
}