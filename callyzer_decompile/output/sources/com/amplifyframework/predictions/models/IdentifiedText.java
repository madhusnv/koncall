package com.amplifyframework.predictions.models;

import android.graphics.RectF;
import com.amplifyframework.predictions.models.ImageFeature;
import java.util.Objects;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class IdentifiedText extends ImageFeature<String> {
    private final int page;

    /* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
    public static final class Builder extends ImageFeature.Builder<Builder, IdentifiedText, String> {
        private int page;

        @Override // com.amplifyframework.predictions.models.ImageFeature.Builder
        public /* bridge */ /* synthetic */ ImageFeature.Builder box(RectF rectF) {
            return super.box(rectF);
        }

        public int getPage() {
            return this.page;
        }

        public Builder page(int i10) {
            this.page = i10;
            return this;
        }

        @Override // com.amplifyframework.predictions.models.ImageFeature.Builder
        public /* bridge */ /* synthetic */ ImageFeature.Builder polygon(Polygon polygon) {
            return super.polygon(polygon);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public Builder text(String str) {
            Objects.requireNonNull(str);
            return (Builder) value(str);
        }

        @Override // com.amplifyframework.predictions.models.Feature.Builder
        public IdentifiedText build() {
            return new IdentifiedText(this, 0);
        }
    }

    public /* synthetic */ IdentifiedText(Builder builder, int i10) {
        this(builder);
    }

    public static Builder builder() {
        return new Builder();
    }

    public int getPage() {
        return this.page;
    }

    public String getText() {
        return getValue();
    }

    @Override // com.amplifyframework.predictions.models.Feature
    public String getTypeAlias() {
        return FeatureType.IDENTIFIED_TEXT.getAlias();
    }

    private IdentifiedText(Builder builder) {
        super(builder);
        this.page = builder.getPage();
    }
}
