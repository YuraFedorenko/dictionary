package com.dictionary.service;

import com.google.cloud.translate.Translate;
import com.google.cloud.translate.TranslateOptions;
import org.springframework.stereotype.Service;

@Service
public class GoogleTranslationServiceImpl implements GoogleTranslationService {

    @Override
    public String searchForTranslations(String from, String to, String phrase) {

        Translate translate = TranslateOptions.getDefaultInstance().getService();
        return translate.translate(
                phrase,
                Translate.TranslateOption.sourceLanguage(from),
                Translate.TranslateOption.targetLanguage(to)).getTranslatedText();
    }
}
