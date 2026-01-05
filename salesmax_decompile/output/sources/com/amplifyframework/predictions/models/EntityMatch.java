package com.amplifyframework.predictions.models;

import android.graphics.RectF;
import com.amplifyframework.predictions.models.Feature;
import com.amplifyframework.predictions.models.ImageFeature;
import java.util.Objects;

/* loaded from: classes5.dex */
public final class EntityMatch extends ImageFeature<String> {

    public static final class Builder extends ImageFeature.Builder<Builder, EntityMatch, String> {
        @Override // com.amplifyframework.predictions.models.ImageFeature.Builder
        public /* bridge */ /* synthetic */ ImageFeature.Builder box(RectF rectF) {
            return super.box(rectF);
        }

        @Override // com.amplifyframework.predictions.models.Feature.Builder
        public /* bridge */ /* synthetic */ Feature.Builder confidence(float f) {
            return super.confidence(f);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public Builder externalImageId(String str) {
            Objects.requireNonNull(str);
            return (Builder) value(str);
        }

        @Override // com.amplifyframework.predictions.models.ImageFeature.Builder
        public /* bridge */ /* synthetic */ ImageFeature.Builder polygon(Polygon polygon) {
            return super.polygon(polygon);
        }

        @Override // com.amplifyframework.predictions.models.Feature.Builder
        public EntityMatch build() {
            return new EntityMatch(this);
        }
    }

    public static Builder builder() {
        return new Builder();
    }

    public String getExternalImageId() {
        return getValue();
    }

    @Override // com.amplifyframework.predictions.models.Feature
    public String getTypeAlias() {
        return FeatureType.ENTITY_MATCH.getAlias();
    }

    private EntityMatch(Builder builder) {
        super(builder);
    }
}
