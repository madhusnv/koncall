package com.amplifyframework.predictions.models;

import com.amplifyframework.predictions.models.Feature;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class Sentiment extends Feature<SentimentType> {

    /* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
    public static final class Builder extends Feature.Builder<Builder, Sentiment, SentimentType> {
        @Override // com.amplifyframework.predictions.models.Feature.Builder
        public Sentiment build() {
            return new Sentiment(this, 0);
        }
    }

    public /* synthetic */ Sentiment(Builder builder, int i10) {
        this(builder);
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
