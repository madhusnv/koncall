package com.amplifyframework.predictions.models;

import com.amplifyframework.predictions.models.Feature;

/* loaded from: classes5.dex */
public final class Emotion extends Feature<EmotionType> {

    public static final class Builder extends Feature.Builder<Builder, Emotion, EmotionType> {
        @Override // com.amplifyframework.predictions.models.Feature.Builder
        public /* bridge */ /* synthetic */ Feature.Builder confidence(float f) {
            return super.confidence(f);
        }

        @Override // com.amplifyframework.predictions.models.Feature.Builder
        public /* bridge */ /* synthetic */ Feature.Builder value(EmotionType emotionType) {
            return super.value(emotionType);
        }

        @Override // com.amplifyframework.predictions.models.Feature.Builder
        public Emotion build() {
            return new Emotion(this);
        }
    }

    public static Builder builder() {
        return new Builder();
    }

    @Override // com.amplifyframework.predictions.models.Feature
    public String getTypeAlias() {
        return FeatureType.EMOTION.getAlias();
    }

    private Emotion(Builder builder) {
        super(builder);
    }
}
