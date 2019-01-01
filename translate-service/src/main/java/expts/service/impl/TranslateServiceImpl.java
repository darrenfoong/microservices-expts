package expts.service.impl;

import expts.request.TranslateRequest;
import expts.service.TranslateService;

public class TranslateServiceImpl implements TranslateService {
  @Override
  public String translate(TranslateRequest translateRequest) {
    if (translateRequest.getBody().equals("Hello")) {
      switch (translateRequest.getTargetLanguage()) {
        case "de":
          return "Guten Tag";
        case "en":
          return "Hello";
        case "fr":
          return "Bonjour";
        default:
          return "???";
      }
    } else {
      return "???";
    }
  }
}
