package com.amplifyframework.predictions.models;

import android.graphics.RectF;
import com.amplifyframework.predictions.models.Feature;
import com.amplifyframework.predictions.models.ImageFeature;
import java.util.Objects;
import p001o.iwc;

/* loaded from: classes5.dex */
public final class BoundedKeyValue extends ImageFeature<iwc> {

    public static final class Builder extends ImageFeature.Builder<Builder, BoundedKeyValue, iwc> {
        @Override // com.amplifyframework.predictions.models.ImageFeature.Builder
        public /* bridge */ /* synthetic */ ImageFeature.Builder box(RectF rectF) {
            return super.box(rectF);
        }

        @Override // com.amplifyframework.predictions.models.Feature.Builder
        public /* bridge */ /* synthetic */ Feature.Builder confidence(float f) {
            return super.confidence(f);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public Builder keyValuePair(String str, String str2) {
            Objects.requireNonNull(str);
            Objects.requireNonNull(str2);
            return (Builder) value(iwc.m32868a(str, str2));
        }

        @Override // com.amplifyframework.predictions.models.ImageFeature.Builder
        public /* bridge */ /* synthetic */ ImageFeature.Builder polygon(Polygon polygon) {
            return super.polygon(polygon);
        }

        @Override // com.amplifyframework.predictions.models.Feature.Builder
        public BoundedKeyValue build() {
            Objects.requireNonNull(getValue());
            Objects.requireNonNull((String) getValue().f29291a);
            Objects.requireNonNull((String) getValue().f29292b);
            return new BoundedKeyValue(this);
        }
    }

    public static Builder builder() {
        return new Builder();
    }

    public String getKey() {
        return (String) getValue().f29291a;
    }

    public String getKeyValue() {
        return (String) getValue().f29292b;
    }

    @Override // com.amplifyframework.predictions.models.Feature
    public String getTypeAlias() {
        return FeatureType.BOUNDED_KEY_VALUE.getAlias();
    }

    private BoundedKeyValue(Builder builder) {
        super(builder);
    }
}
