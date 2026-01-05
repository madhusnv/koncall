package com.amplifyframework.predictions.models;

import android.graphics.RectF;
import com.amplifyframework.util.Immutable;
import java.net.URL;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class CelebrityDetails {
    private final RectF box;
    private final Celebrity celebrity;
    private final List<Landmark> landmarks;
    private final Polygon polygon;
    private final Pose pose;
    private final List<URL> urls;

    /* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
    public static final class Builder {
        private RectF box;
        private Celebrity celebrity;
        private List<Landmark> landmarks;
        private Polygon polygon;
        private Pose pose;
        private List<URL> urls;

        public /* synthetic */ Builder(int i10) {
            this();
        }

        public Builder box(RectF rectF) {
            this.box = rectF;
            return this;
        }

        public CelebrityDetails build() {
            return new CelebrityDetails(this, 0);
        }

        public Builder celebrity(Celebrity celebrity) {
            Objects.requireNonNull(celebrity);
            this.celebrity = celebrity;
            return this;
        }

        public RectF getBox() {
            return this.box;
        }

        public Celebrity getCelebrity() {
            Celebrity celebrity = this.celebrity;
            Objects.requireNonNull(celebrity);
            return celebrity;
        }

        public List<Landmark> getLandmarks() {
            List<Landmark> list = this.landmarks;
            Objects.requireNonNull(list);
            return list;
        }

        public Polygon getPolygon() {
            return this.polygon;
        }

        public Pose getPose() {
            return this.pose;
        }

        public List<URL> getUrls() {
            List<URL> list = this.urls;
            Objects.requireNonNull(list);
            return list;
        }

        public Builder landmarks(List<Landmark> list) {
            Objects.requireNonNull(list);
            this.landmarks = list;
            return this;
        }

        public Builder polygon(Polygon polygon) {
            this.polygon = polygon;
            return this;
        }

        public Builder pose(Pose pose) {
            this.pose = pose;
            return this;
        }

        public Builder urls(List<URL> list) {
            Objects.requireNonNull(list);
            this.urls = list;
            return this;
        }

        private Builder() {
            List list = Collections.EMPTY_LIST;
            this.landmarks = list;
            this.urls = list;
        }
    }

    public /* synthetic */ CelebrityDetails(Builder builder, int i10) {
        this(builder);
    }

    public static Builder builder() {
        return new Builder(0);
    }

    public RectF getBox() {
        return this.box;
    }

    public Celebrity getCelebrity() {
        return this.celebrity;
    }

    public List<Landmark> getLandmarks() {
        return Immutable.of(this.landmarks);
    }

    public Polygon getPolygon() {
        return this.polygon;
    }

    public Pose getPose() {
        return this.pose;
    }

    public List<URL> getUrls() {
        return Immutable.of(this.urls);
    }

    private CelebrityDetails(Builder builder) {
        this.celebrity = builder.getCelebrity();
        this.box = builder.getBox();
        this.polygon = builder.getPolygon();
        this.pose = builder.getPose();
        this.landmarks = builder.getLandmarks();
        this.urls = builder.getUrls();
    }
}
