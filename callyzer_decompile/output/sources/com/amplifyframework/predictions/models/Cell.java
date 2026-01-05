package com.amplifyframework.predictions.models;

import android.graphics.RectF;
import com.amplifyframework.predictions.models.ImageFeature;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class Cell extends ImageFeature<String> {
    private final int column;
    private final int row;
    private final boolean selected;

    /* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
    public static final class Builder extends ImageFeature.Builder<Builder, Cell, String> {
        private int column;
        private int row;
        private boolean selected;

        @Override // com.amplifyframework.predictions.models.ImageFeature.Builder
        public /* bridge */ /* synthetic */ ImageFeature.Builder box(RectF rectF) {
            return super.box(rectF);
        }

        public Builder column(int i10) {
            this.column = i10;
            return this;
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

        public Builder row(int i10) {
            this.row = i10;
            return this;
        }

        public Builder selected(boolean z6) {
            this.selected = z6;
            return this;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public Builder text(String str) {
            return (Builder) value(str);
        }

        @Override // com.amplifyframework.predictions.models.Feature.Builder
        public Cell build() {
            return new Cell(this, 0);
        }
    }

    public /* synthetic */ Cell(Builder builder, int i10) {
        this(builder);
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
