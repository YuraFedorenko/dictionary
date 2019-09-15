package com.dictionary.controller;

import com.dictionary.service.GoogleTranslationService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class TranslationController {

    private final GoogleTranslationService googleTranslationService;

    @GetMapping("/translate")
    public String getTranslation(@RequestParam(name = "phrase") String phrase,
                                 @RequestParam(name = "from") String from,
                                 @RequestParam(name = "to") String to) {
        return googleTranslationService.searchForTranslations(from, to, phrase);
    }
}
