package com.dictionary.validator;

public interface Validator {
    boolean validateKey(String key);
    String getLanguageName();
}