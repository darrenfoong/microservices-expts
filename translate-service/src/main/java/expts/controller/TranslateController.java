package expts.controller;

import expts.request.TranslateRequest;
import expts.service.TranslateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TranslateController {
  @Autowired private TranslateService translateService;

  @PostMapping("/translate")
  public String translate(@RequestBody TranslateRequest translateRequest) {
    return translateService.translate(translateRequest);
  }
}
