package com.amplifyframework.predictions.models;

import android.graphics.RectF;
import com.amplifyframework.predictions.models.ImageFeature;
import com.amplifyframework.util.Immutable;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class Label extends ImageFeature<String> {
    public static final String FEATURE_TYPE = "Label";
    private final List<RectF> boxes;
    private final List<String> parentLabels;

    /* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
    public static final class Builder extends ImageFeature.Builder<Builder, Label, String> {
        private List<RectF> boxes;
        private List<String> parentLabels;

        public /* synthetic */ Builder(int i10) {
            this();
        }

        @Override // com.amplifyframework.predictions.models.ImageFeature.Builder
        public /* bridge */ /* synthetic */ ImageFeature.Builder box(RectF rectF) {
            return super.box(rectF);
        }

        public Builder boxes(List<RectF> list) {
            Objects.requireNonNull(list);
            this.boxes = list;
            return this;
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

        /* JADX WARN: Multi-variable type inference failed */
        public Builder name(String str) {
            return (Builder) value(str);
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

        private Builder() {
            this.parentLabels = new ArrayList();
            this.boxes = new ArrayList();
        }

        @Override // com.amplifyframework.predictions.models.Feature.Builder
        public Label build() {
            return new Label(this, 0);
        }
    }

    public /* synthetic */ Label(Builder builder, int i10) {
        this(builder);
    }

    public static Builder builder() {
        return new Builder(0);
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
