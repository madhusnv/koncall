package com.amplifyframework.predictions.models;

import android.graphics.RectF;
import com.amplifyframework.predictions.models.Feature;
import com.amplifyframework.predictions.models.ImageFeature;
import com.amplifyframework.util.Immutable;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/* loaded from: classes5.dex */
public final class Label extends ImageFeature<String> {
    public static final String FEATURE_TYPE = "Label";
    private final List<RectF> boxes;
    private final List<String> parentLabels;

    public static final class Builder extends ImageFeature.Builder<Builder, Label, String> {
        private List<RectF> boxes;
        private List<String> parentLabels;

        @Override // com.amplifyframework.predictions.models.ImageFeature.Builder
        public /* bridge */ /* synthetic */ ImageFeature.Builder box(RectF rectF) {
            return super.box(rectF);
        }

        public Builder boxes(List<RectF> list) {
            Objects.requireNonNull(list);
            this.boxes = list;
            return this;
        }

        @Override // com.amplifyframework.predictions.models.Feature.Builder
        public /* bridge */ /* synthetic */ Feature.Builder confidence(float f) {
            return super.confidence(f);
        }

        public List<RectF> getBoxes() {
            List<RectF> listOf = Immutable.of(this.boxes);
            Objects.requireNonNull(listOf);
            return listOf;
        }

        public List<String> getParentLabels() {
            List<String> listOf = Immutable.of(this.parentLabels);
            Objects.requireNonNull(listOf);
            return listOf;
        }

        public Builder name(String str) {
            return (Builder) super.value(str);
        }

        public Builder parentLabels(List<String> list) {
            Objects.requireNonNull(list);
            this.parentLabels = list;
            return this;
        }

        @Override // com.amplifyframework.predictions.models.ImageFeature.Builder
        public /* bridge */ /* synthetic */ ImageFeature.Builder polygon(Polygon polygon) {
            return super.polygon(polygon);
        }

        @Override // com.amplifyframework.predictions.models.Feature.Builder
        public /* bridge */ /* synthetic */ Feature.Builder value(Object obj) {
            return super.value(obj);
        }

        private Builder() {
            this.parentLabels = new ArrayList();
            this.boxes = new ArrayList();
        }

        @Override // com.amplifyframework.predictions.models.Feature.Builder
        public Label build() {
            return new Label(this);
        }
    }

    public static Builder builder() {
        return new Builder();
    }

    public List<RectF> getBoxes() {
        return this.boxes;
    }

    public String getName() {
        return getValue();
    }

    public List<String> getParentLabels() {
        return this.parentLabels;
    }

    @Override // com.amplifyframework.predictions.models.Feature
    public String getTypeAlias() {
        return FEATURE_TYPE;
    }

    private Label(Builder builder) {
        super(builder);
        this.parentLabels = builder.getParentLabels();
        this.boxes = builder.getBoxes();
    }
}
