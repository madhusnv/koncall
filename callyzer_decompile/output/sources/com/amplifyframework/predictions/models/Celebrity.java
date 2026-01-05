package com.amplifyframework.predictions.models;

import com.amplifyframework.predictions.models.Feature;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class Celebrity extends Feature<String> {

    /* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
    public static final class Builder extends Feature.Builder<Builder, Celebrity, String> {
        public Builder name(String str) {
            return value(str);
        }

        @Override // com.amplifyframework.predictions.models.Feature.Builder
        public Celebrity build() {
            return new Celebrity(this, 0);
        }
    }

    public /* synthetic */ Celebrity(Builder builder, int i10) {
        this(builder);
    }

    public static Builder builder() {
        return new Builder();
    }

    public String getName() {
        return getValue();
    }

    @Override // com.amplifyframework.predictions.models.Feature
    public String getTypeAlias() {
        return FeatureType.CELEBRITY.getAlias();
    }

    private Celebrity(Builder builder) {
        super(builder);
    }
}
