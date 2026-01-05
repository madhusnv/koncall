package com.amplifyframework.geo.options;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public class GeoSearchByCoordinatesOptions {
    private final int maxResults;

    /* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
    public static class Builder {
        private static final int DEFAULT_MAX_RESULTS_LIMIT = 50;
        private int maxResults = 50;

        public GeoSearchByCoordinatesOptions build() {
            return new GeoSearchByCoordinatesOptions(this);
        }

        public Builder maxResults(int i10) {
            this.maxResults = i10;
            return this;
        }
    }

    public GeoSearchByCoordinatesOptions(Builder builder) {
        this.maxResults = builder.maxResults;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GeoSearchByCoordinatesOptions defaults() {
        return builder().build();
    }

    public int getMaxResults() {
        return this.maxResults;
    }
}
