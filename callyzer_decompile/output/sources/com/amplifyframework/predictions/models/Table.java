package com.amplifyframework.predictions.models;

import android.graphics.RectF;
import com.amplifyframework.predictions.models.ImageFeature;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class Table extends ImageFeature<List<Cell>> {
    private final int columnSize;
    private final int rowSize;

    /* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
    public static final class Builder extends ImageFeature.Builder<Builder, Table, List<Cell>> {
        private List<Cell> cells;
        private int columnSize;
        private int rowSize;

        public /* synthetic */ Builder(int i10) {
            this();
        }

        @Override // com.amplifyframework.predictions.models.ImageFeature.Builder
        public /* bridge */ /* synthetic */ ImageFeature.Builder box(RectF rectF) {
            return super.box(rectF);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public Builder cells(List<Cell> list) {
            return (Builder) value(list);
        }

        public Builder columnSize(int i10) {
            this.columnSize = i10;
            return this;
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

        public Builder rowSize(int i10) {
            this.rowSize = i10;
            return this;
        }

        private Builder() {
            this.cells = Collections.EMPTY_LIST;
        }

        @Override // com.amplifyframework.predictions.models.Feature.Builder
        public Table build() {
            return new Table(this, 0);
        }
    }

    public /* synthetic */ Table(Builder builder, int i10) {
        this(builder);
    }

    public static Builder builder() {
        return new Builder(0);
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
