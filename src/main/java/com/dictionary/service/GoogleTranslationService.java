package com.dictionary.service;

public interface GoogleTranslationService {

    String searchForTranslations(String from, String to, String phrase);
}
