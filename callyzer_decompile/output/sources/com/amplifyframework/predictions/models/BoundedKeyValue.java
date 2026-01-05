package com.amplifyframework.predictions.models;

import android.graphics.RectF;
import b6.C0601b;
import com.amplifyframework.predictions.models.ImageFeature;
import java.util.Objects;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class BoundedKeyValue extends ImageFeature<C0601b> {

    /* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
    public static final class Builder extends ImageFeature.Builder<Builder, BoundedKeyValue, C0601b> {
        @Override // com.amplifyframework.predictions.models.ImageFeature.Builder
        public /* bridge */ /* synthetic */ ImageFeature.Builder box(RectF rectF) {
            return super.box(rectF);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public Builder keyValuePair(String str, String str2) {
            Objects.requireNonNull(str);
            Objects.requireNonNull(str2);
            return (Builder) value(new C0601b(str, str2));
        }

        @Override // com.amplifyframework.predictions.models.ImageFeature.Builder
        public /* bridge */ /* synthetic */ ImageFeature.Builder polygon(Polygon polygon) {
            return super.polygon(polygon);
        }

        @Override // com.amplifyframework.predictions.models.Feature.Builder
        public BoundedKeyValue build() {
            Objects.requireNonNull(getValue());
            Objects.requireNonNull((String) getValue().f3985a);
            Objects.requireNonNull((String) getValue().f3986b);
            return new BoundedKeyValue(this, 0);
        }
    }

    public /* synthetic */ BoundedKeyValue(Builder builder, int i10) {
        this(builder);
    }

    public static Builder builder() {
        return new Builder();
    }

    public String getKey() {
        return (String) getValue().f3985a;
    }

    public String getKeyValue() {
        return (String) getValue().f3986b;
    }

    @Override // com.amplifyframework.predictions.models.Feature
    public String getTypeAlias() {
        return FeatureType.BOUNDED_KEY_VALUE.getAlias();
    }

    private BoundedKeyValue(Builder builder) {
        super(builder);
    }
}
