package com.amplifyframework.predictions.models;

import com.amplifyframework.predictions.models.Feature;

/* loaded from: classes5.dex */
public final class Sentiment extends Feature<SentimentType> {

    public static final class Builder extends Feature.Builder<Builder, Sentiment, SentimentType> {
        @Override // com.amplifyframework.predictions.models.Feature.Builder
        public /* bridge */ /* synthetic */ Feature.Builder confidence(float f) {
            return super.confidence(f);
        }

        @Override // com.amplifyframework.predictions.models.Feature.Builder
        public /* bridge */ /* synthetic */ Feature.Builder value(SentimentType sentimentType) {
            return super.value(sentimentType);
        }

        @Override // com.amplifyframework.predictions.models.Feature.Builder
        public Sentiment build() {
            return new Sentiment(this);
        }
    }

    public static Builder builder() {
        return new Builder();
    }

    @Override // com.amplifyframework.predictions.models.Feature
    public String getTypeAlias() {
        return FeatureType.SENTIMENT.getAlias();
    }

    private Sentiment(Builder builder) {
        super(builder);
    }
}
