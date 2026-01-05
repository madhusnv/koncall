package com.amplifyframework.predictions.models;

import android.graphics.RectF;
import com.amplifyframework.predictions.models.Feature;
import com.amplifyframework.predictions.models.ImageFeature;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

/* loaded from: classes5.dex */
public final class Table extends ImageFeature<List<Cell>> {
    private final int columnSize;
    private final int rowSize;

    public static final class Builder extends ImageFeature.Builder<Builder, Table, List<Cell>> {
        private List<Cell> cells;
        private int columnSize;
        private int rowSize;

        @Override // com.amplifyframework.predictions.models.ImageFeature.Builder
        public /* bridge */ /* synthetic */ ImageFeature.Builder box(RectF rectF) {
            return super.box(rectF);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public Builder cells(List<Cell> list) {
            return (Builder) value(list);
        }

        public Builder columnSize(int i) {
            this.columnSize = i;
            return this;
        }

        @Override // com.amplifyframework.predictions.models.Feature.Builder
        public /* bridge */ /* synthetic */ Feature.Builder confidence(float f) {
            return super.confidence(f);
        }

        public List<Cell> getCells() {
            List<Cell> list = this.cells;
            Objects.requireNonNull(list);
            return list;
        }

        public int getColumnSize() {
            return this.columnSize;
        }

        public int getRowSize() {
            return this.rowSize;
        }

        @Override // com.amplifyframework.predictions.models.ImageFeature.Builder
        public /* bridge */ /* synthetic */ ImageFeature.Builder polygon(Polygon polygon) {
            return super.polygon(polygon);
        }

        public Builder rowSize(int i) {
            this.rowSize = i;
            return this;
        }

        private Builder() {
            this.cells = Collections.emptyList();
        }

        @Override // com.amplifyframework.predictions.models.Feature.Builder
        public Table build() {
            return new Table(this);
        }
    }

    public static Builder builder() {
        return new Builder();
    }

    public List<Cell> getCells() {
        return getValue();
    }

    public int getColumnSize() {
        return this.columnSize;
    }

    public int getRowSize() {
        return this.rowSize;
    }

    @Override // com.amplifyframework.predictions.models.Feature
    public String getTypeAlias() {
        return FeatureType.TABLE.getAlias();
    }

    private Table(Builder builder) {
        super(builder);
        this.rowSize = builder.getRowSize();
        this.columnSize = builder.getColumnSize();
    }
}
