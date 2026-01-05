package com.amplifyframework.predictions.models;

import com.amplifyframework.predictions.models.Feature;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class Language extends Feature<LanguageType> {

    /* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
    public static final class Builder extends Feature.Builder<Builder, Language, LanguageType> {
        @Override // com.amplifyframework.predictions.models.Feature.Builder
        public Language build() {
            return new Language(this, 0);
        }
    }

    public /* synthetic */ Language(Builder builder, int i10) {
        this(builder);
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
