package expts.service.proxy;

import expts.request.TranslateRequest;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;

@FeignClient(name = "translate-service")
public interface TranslateServiceProxy {
  @PostMapping("/translate")
  public String translate(TranslateRequest translateRequest);
}
