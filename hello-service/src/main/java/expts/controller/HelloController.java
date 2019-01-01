package expts.controller;

import expts.request.TranslateRequest;
import expts.service.proxy.TranslateServiceProxy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class HelloController {
  @Autowired private TranslateServiceProxy translateServiceProxy;

  @GetMapping("/hello")
  public String getHello() {
    TranslateRequest translateRequest = new TranslateRequest();
    translateRequest.setBody("Hello");
    translateRequest.setSourceLanguage("en");
    translateRequest.setTargetLanguage("fr");
    return translateServiceProxy.translate(translateRequest);
  }
}
