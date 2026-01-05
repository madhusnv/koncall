package com.amplifyframework.predictions.models;

import android.graphics.RectF;
import com.amplifyframework.predictions.models.Feature;
import com.amplifyframework.predictions.models.ImageFeature;
import java.util.Objects;

/* loaded from: classes5.dex */
public final class IdentifiedText extends ImageFeature<String> {
    private final int page;

    public static final class Builder extends ImageFeature.Builder<Builder, IdentifiedText, String> {
        private int page;

        @Override // com.amplifyframework.predictions.models.ImageFeature.Builder
        public /* bridge */ /* synthetic */ ImageFeature.Builder box(RectF rectF) {
            return super.box(rectF);
        }

        @Override // com.amplifyframework.predictions.models.Feature.Builder
        public /* bridge */ /* synthetic */ Feature.Builder confidence(float f) {
            return super.confidence(f);
        }

        public int getPage() {
            return this.page;
        }

        public Builder page(int i) {
            this.page = i;
            return this;
        }

        @Override // com.amplifyframework.predictions.models.ImageFeature.Builder
        public /* bridge */ /* synthetic */ ImageFeature.Builder polygon(Polygon polygon) {
            return super.polygon(polygon);
        }

        public Builder text(String str) {
            Objects.requireNonNull(str);
            return (Builder) super.value(str);
        }

        @Override // com.amplifyframework.predictions.models.Feature.Builder
        public IdentifiedText build() {
            return new IdentifiedText(this);
        }
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
