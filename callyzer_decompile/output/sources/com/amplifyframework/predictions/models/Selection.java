package com.amplifyframework.predictions.models;

import android.graphics.RectF;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class Selection {
    private final RectF box;
    private final Polygon polygon;
    private final boolean selected;

    /* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
    public static final class Builder {
        private RectF box;
        private Polygon polygon;
        private boolean selected;

        public Builder box(RectF rectF) {
            this.box = rectF;
            return this;
        }

        public Selection build() {
            return new Selection(this.box, this.polygon, this.selected, 0);
        }

        public RectF getBox() {
            return this.box;
        }

        public Polygon getPolygon() {
            return this.polygon;
        }

        public boolean isSelected() {
            return this.selected;
        }

        public Builder polygon(Polygon polygon) {
            this.polygon = polygon;
            return this;
        }

        public Builder selected(boolean z6) {
            this.selected = z6;
            return this;
        }
    }

    public /* synthetic */ Selection(RectF rectF, Polygon polygon, boolean z6, int i10) {
        this(rectF, polygon, z6);
    }

    public static Builder builder() {
        return new Builder();
    }

    public RectF getBox() {
        return this.box;
    }

    public Polygon getPolygon() {
        return this.polygon;
    }

    public boolean isSelected() {
        return this.selected;
    }

    private Selection(RectF rectF, Polygon polygon, boolean z6) {
        this.box = rectF;
        this.polygon = polygon;
        this.selected = z6;
    }
}
