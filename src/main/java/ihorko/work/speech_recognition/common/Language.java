package ihorko.work.speech_recognition.common;

import lombok.Getter;

@Getter
public enum Language {
    ENGLISH("en-US"),
    UKRAINIAN("uk-UA");

    private final String code;

    Language(String code) {
        this.code = code;
    }
}
