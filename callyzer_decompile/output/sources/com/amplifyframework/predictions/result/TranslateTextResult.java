package com.amplifyframework.predictions.result;

import com.amplifyframework.predictions.models.LanguageType;
import java.util.Objects;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class TranslateTextResult {
    private final LanguageType targetLanguage;
    private final String translatedText;

    /* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
    public static final class Builder {
        private LanguageType targetLanguage;
        private String translatedText;

        public TranslateTextResult build() {
            return new TranslateTextResult(this, 0);
        }

        public LanguageType getTargetLanguage() {
            LanguageType languageType = this.targetLanguage;
            Objects.requireNonNull(languageType);
            return languageType;
        }

        public String getTranslatedText() {
            String str = this.translatedText;
            Objects.requireNonNull(str);
            return str;
        }

        public Builder targetLanguage(LanguageType languageType) {
            Objects.requireNonNull(languageType);
            this.targetLanguage = languageType;
            return this;
        }

        public Builder translatedText(String str) {
            Objects.requireNonNull(str);
            this.translatedText = str;
            return this;
        }
    }

    public /* synthetic */ TranslateTextResult(Builder builder, int i10) {
        this(builder);
    }

    public static Builder builder() {
        return new Builder();
    }

    public LanguageType getTargetLanguage() {
        return this.targetLanguage;
    }

    public String getTranslatedText() {
        return this.translatedText;
    }

    private TranslateTextResult(Builder builder) {
        this.translatedText = builder.getTranslatedText();
        this.targetLanguage = builder.getTargetLanguage();
    }
}
