package expts.service;

import expts.request.TranslateRequest;

public interface TranslateService {
  String translate(TranslateRequest translateRequest);
}
