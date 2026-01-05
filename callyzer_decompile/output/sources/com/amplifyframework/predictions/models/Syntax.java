package com.amplifyframework.predictions.models;

import com.amplifyframework.predictions.models.TextFeature;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class Syntax extends TextFeature<SpeechType> {

    /* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
    public static final class Builder extends TextFeature.Builder<Builder, Syntax, SpeechType> {
        @Override // com.amplifyframework.predictions.models.Feature.Builder
        public Syntax build() {
            return new Syntax(this, 0);
        }
    }

    public /* synthetic */ Syntax(Builder builder, int i10) {
        this(builder);
    }

    public static Builder builder() {
        return new Builder();
    }

    @Override // com.amplifyframework.predictions.models.Feature
    public String getTypeAlias() {
        return FeatureType.SYNTAX.getAlias();
    }

    private Syntax(Builder builder) {
        super(builder);
    }
}
