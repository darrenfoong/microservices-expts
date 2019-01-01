package expts.service.impl;

import expts.request.TranslateRequest;
import expts.service.TranslateService;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class TranslateServiceImpl implements TranslateService {
  @Value("${service.translate.default.unknown}")
  private String unknown;

  @Value("${server.port}")
  private String port;

  @Override
  public String translate(TranslateRequest translateRequest) {
    String result = port + ": ";

    if (translateRequest.getBody().equals("Hello")) {
      switch (translateRequest.getTargetLanguage()) {
        case "de":
          result += "Guten Tag";
          break;
        case "en":
          result += "Hello";
          break;
        case "fr":
          result += "Bonjour";
          break;
        default:
          result += unknown;
          break;
      }
    } else {
      result += unknown;
    }

    return result;
  }
}
