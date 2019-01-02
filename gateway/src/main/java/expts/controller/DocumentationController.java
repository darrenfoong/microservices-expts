package expts.controller;

import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Controller;
import springfox.documentation.swagger.web.SwaggerResource;
import springfox.documentation.swagger.web.SwaggerResourcesProvider;

@Controller
public class DocumentationController implements SwaggerResourcesProvider {
  // For now, Swagger 2 works only with Zuul, not Gateway

  @Override
  public List<SwaggerResource> get() {
    List<SwaggerResource> resources = new ArrayList<>();
    resources.add(swaggerResource("hello-service", "/hello/v2/api-docs", "2.0"));
    resources.add(swaggerResource("translate-service", "/translate/v2/api-docs", "2.0"));
    return resources;
  }

  private SwaggerResource swaggerResource(String name, String location, String version) {
    SwaggerResource swaggerResource = new SwaggerResource();
    swaggerResource.setName(name);
    swaggerResource.setLocation(location);
    swaggerResource.setSwaggerVersion(version);
    return swaggerResource;
  }
}
