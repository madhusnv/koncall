package com.amplifyframework.predictions.models;

import com.amplifyframework.predictions.models.Feature;

/* loaded from: classes5.dex */
public final class Language extends Feature<LanguageType> {

    public static final class Builder extends Feature.Builder<Builder, Language, LanguageType> {
        @Override // com.amplifyframework.predictions.models.Feature.Builder
        public /* bridge */ /* synthetic */ Feature.Builder confidence(float f) {
            return super.confidence(f);
        }

        @Override // com.amplifyframework.predictions.models.Feature.Builder
        public /* bridge */ /* synthetic */ Feature.Builder value(LanguageType languageType) {
            return super.value(languageType);
        }

        @Override // com.amplifyframework.predictions.models.Feature.Builder
        public Language build() {
            return new Language(this);
        }
    }

    public static Builder builder() {
        return new Builder();
    }

    @Override // com.amplifyframework.predictions.models.Feature
    public String getTypeAlias() {
        return FeatureType.LANGUAGE.getAlias();
    }

    private Language(Builder builder) {
        super(builder);
    }
}
