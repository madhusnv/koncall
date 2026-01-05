package com.amplifyframework.predictions.models;

import com.amplifyframework.predictions.models.Feature;

/* loaded from: classes5.dex */
public final class Gender extends Feature<GenderBinaryType> {

    public static final class Builder extends Feature.Builder<Builder, Gender, GenderBinaryType> {
        @Override // com.amplifyframework.predictions.models.Feature.Builder
        public /* bridge */ /* synthetic */ Feature.Builder confidence(float f) {
            return super.confidence(f);
        }

        @Override // com.amplifyframework.predictions.models.Feature.Builder
        public /* bridge */ /* synthetic */ Feature.Builder value(GenderBinaryType genderBinaryType) {
            return super.value(genderBinaryType);
        }

        @Override // com.amplifyframework.predictions.models.Feature.Builder
        public Gender build() {
            return new Gender(this);
        }
    }

    public static Builder builder() {
        return new Builder();
    }

    @Override // com.amplifyframework.predictions.models.Feature
    public String getTypeAlias() {
        return FeatureType.GENDER.getAlias();
    }

    private Gender(Builder builder) {
        super(builder);
    }
}
