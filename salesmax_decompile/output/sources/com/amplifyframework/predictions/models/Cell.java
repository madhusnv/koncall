package com.amplifyframework.predictions.models;

import android.graphics.RectF;
import com.amplifyframework.predictions.models.Feature;
import com.amplifyframework.predictions.models.ImageFeature;

/* loaded from: classes5.dex */
public final class Cell extends ImageFeature<String> {
    private final int column;
    private final int row;
    private final boolean selected;

    public static final class Builder extends ImageFeature.Builder<Builder, Cell, String> {
        private int column;
        private int row;
        private boolean selected;

        @Override // com.amplifyframework.predictions.models.ImageFeature.Builder
        public /* bridge */ /* synthetic */ ImageFeature.Builder box(RectF rectF) {
            return super.box(rectF);
        }

        public Builder column(int i) {
            this.column = i;
            return this;
        }

        @Override // com.amplifyframework.predictions.models.Feature.Builder
        public /* bridge */ /* synthetic */ Feature.Builder confidence(float f) {
            return super.confidence(f);
        }

        public int getColumn() {
            return this.column;
        }

        public int getRow() {
            return this.row;
        }

        public boolean getSelected() {
            return this.selected;
        }

        @Override // com.amplifyframework.predictions.models.ImageFeature.Builder
        public /* bridge */ /* synthetic */ ImageFeature.Builder polygon(Polygon polygon) {
            return super.polygon(polygon);
        }

        public Builder row(int i) {
            this.row = i;
            return this;
        }

        public Builder selected(boolean z) {
            this.selected = z;
            return this;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public Builder text(String str) {
            return (Builder) value(str);
        }

        @Override // com.amplifyframework.predictions.models.Feature.Builder
        public Cell build() {
            return new Cell(this);
        }
    }

    public static Builder builder() {
        return new Builder();
    }

    public int getColumn() {
        return this.column;
    }

    public int getRow() {
        return this.row;
    }

    public String getText() {
        return getValue();
    }

    @Override // com.amplifyframework.predictions.models.Feature
    public String getTypeAlias() {
        return FeatureType.CELL.getAlias();
    }

    public boolean isSelected() {
        return this.selected;
    }

    private Cell(Builder builder) {
        super(builder);
        this.selected = builder.getSelected();
        this.row = builder.getRow();
        this.column = builder.getColumn();
    }
}
