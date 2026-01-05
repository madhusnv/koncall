package com.amplifyframework.predictions.aws.request;

import com.amplifyframework.predictions.models.LanguageType;
import java.util.Objects;

/* loaded from: classes5.dex */
public final class AWSTranslateRequest {
    private final LanguageType sourceLanguage;
    private final LanguageType targetLanguage;
    private final String text;

    public AWSTranslateRequest(String str, LanguageType languageType, LanguageType languageType2) {
        Objects.requireNonNull(str);
        this.text = str;
        Objects.requireNonNull(languageType);
        this.sourceLanguage = languageType;
        Objects.requireNonNull(languageType2);
        this.targetLanguage = languageType2;
    }

    public LanguageType getSourceLanguage() {
        return this.sourceLanguage;
    }

    public LanguageType getTargetLanguage() {
        return this.targetLanguage;
    }

    /* renamed from: getText */
    public String m68965getText() {
        return this.text;
    }
}
