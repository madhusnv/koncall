package com.amplifyframework.predictions.models;

import android.graphics.RectF;
import com.amplifyframework.predictions.models.ImageFeature;
import java.util.Objects;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class EntityMatch extends ImageFeature<String> {

    /* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
    public static final class Builder extends ImageFeature.Builder<Builder, EntityMatch, String> {
        @Override // com.amplifyframework.predictions.models.ImageFeature.Builder
        public /* bridge */ /* synthetic */ ImageFeature.Builder box(RectF rectF) {
            return super.box(rectF);
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
            return new EntityMatch(this, 0);
        }
    }

    public /* synthetic */ EntityMatch(Builder builder, int i10) {
        this(builder);
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
