package com.amplifyframework.predictions.models;

import com.amplifyframework.predictions.models.TextFeature;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class KeyPhrase extends TextFeature<String> {

    /* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
    public static final class Builder extends TextFeature.Builder<Builder, KeyPhrase, String> {
        @Override // com.amplifyframework.predictions.models.Feature.Builder
        public KeyPhrase build() {
            return new KeyPhrase(this, 0);
        }
    }

    public /* synthetic */ KeyPhrase(Builder builder, int i10) {
        this(builder);
    }

    public static Builder builder() {
        return new Builder();
    }

    @Override // com.amplifyframework.predictions.models.Feature
    public String getTypeAlias() {
        return FeatureType.KEY_PHRASE.getAlias();
    }

    private KeyPhrase(Builder builder) {
        super(builder);
    }
}
