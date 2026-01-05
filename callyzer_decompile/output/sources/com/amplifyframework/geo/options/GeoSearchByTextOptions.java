package com.amplifyframework.geo.options;

import com.amplifyframework.geo.models.CountryCode;
import com.amplifyframework.geo.models.SearchArea;
import com.amplifyframework.util.Immutable;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public class GeoSearchByTextOptions {
    private final List<CountryCode> countries;
    private final int maxResults;
    private final SearchArea searchArea;

    /* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
    public static class Builder {
        private static final int DEFAULT_MAX_RESULTS_LIMIT = 50;
        private SearchArea searchArea;
        private int maxResults = 50;
        private List<CountryCode> countries = Collections.singletonList(CountryCode.USA);

        public GeoSearchByTextOptions build() {
            return new GeoSearchByTextOptions(this);
        }

        public Builder countries(List<CountryCode> list) {
            Objects.requireNonNull(list);
            this.countries = list;
            if (list.isEmpty()) {
                throw new IllegalArgumentException("Country filter cannot be empty.");
            }
            return this;
        }

        public Builder maxResults(int i10) {
            this.maxResults = i10;
            return this;
        }

        public Builder searchArea(SearchArea searchArea) {
            Objects.requireNonNull(searchArea);
            this.searchArea = searchArea;
            return this;
        }
    }

    public GeoSearchByTextOptions(Builder builder) {
        this.maxResults = builder.maxResults;
        this.searchArea = builder.searchArea;
        this.countries = builder.countries;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GeoSearchByTextOptions defaults() {
        return builder().build();
    }

    public List<CountryCode> getCountries() {
        return Immutable.of(this.countries);
    }

    public int getMaxResults() {
        return this.maxResults;
    }

    public SearchArea getSearchArea() {
        return this.searchArea;
    }
}
