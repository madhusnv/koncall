package com.amplifyframework.predictions.models;

import com.amplifyframework.predictions.models.Feature;

/* loaded from: classes5.dex */
public final class Celebrity extends Feature<String> {

    public static final class Builder extends Feature.Builder<Builder, Celebrity, String> {
        @Override // com.amplifyframework.predictions.models.Feature.Builder
        public /* bridge */ /* synthetic */ Feature.Builder confidence(float f) {
            return super.confidence(f);
        }

        @Override // com.amplifyframework.predictions.models.Feature.Builder
        public /* bridge */ /* synthetic */ Feature.Builder id(String str) {
            return super.id(str);
        }

        public Builder name(String str) {
            return (Builder) super.value(str);
        }

        @Override // com.amplifyframework.predictions.models.Feature.Builder
        public /* bridge */ /* synthetic */ Feature.Builder value(String str) {
            return super.value(str);
        }

        @Override // com.amplifyframework.predictions.models.Feature.Builder
        public Celebrity build() {
            return new Celebrity(this);
        }
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
