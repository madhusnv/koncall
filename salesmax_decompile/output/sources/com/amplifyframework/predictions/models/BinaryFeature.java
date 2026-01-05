package com.amplifyframework.predictions.models;

import com.amplifyframework.predictions.models.Feature;
import java.util.Objects;

/* loaded from: classes5.dex */
public final class BinaryFeature extends Feature<Boolean> {

    /* renamed from: type, reason: collision with root package name */
    private final String f58116type;

    public static final class Builder extends Feature.Builder<Builder, BinaryFeature, Boolean> {

        /* renamed from: type, reason: collision with root package name */
        private String f58117type;

        @Override // com.amplifyframework.predictions.models.Feature.Builder
        public /* bridge */ /* synthetic */ Feature.Builder confidence(float f) {
            return super.confidence(f);
        }

        public String getType() {
            String str = this.f58117type;
            Objects.requireNonNull(str);
            return str;
        }

        public Builder type(String str) {
            Objects.requireNonNull(str);
            this.f58117type = str;
            return this;
        }

        @Override // com.amplifyframework.predictions.models.Feature.Builder
        public /* bridge */ /* synthetic */ Feature.Builder value(Boolean bool) {
            return super.value(bool);
        }

        @Override // com.amplifyframework.predictions.models.Feature.Builder
        public BinaryFeature build() {
            return new BinaryFeature(this);
        }
    }

    public static Builder builder() {
        return new Builder();
    }

    @Override // com.amplifyframework.predictions.models.Feature
    public String getTypeAlias() {
        return this.f58116type;
    }

    private BinaryFeature(Builder builder) {
        super(builder);
        this.f58116type = builder.getType();
    }
}
