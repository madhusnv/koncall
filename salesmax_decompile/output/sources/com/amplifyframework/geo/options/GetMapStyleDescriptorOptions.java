package com.amplifyframework.geo.options;

import java.util.Objects;

/* loaded from: classes5.dex */
public final class GetMapStyleDescriptorOptions {
    private final String mapName;

    public static final class Builder {
        private String mapName;

        private Builder() {
        }

        public GetMapStyleDescriptorOptions build() {
            return new GetMapStyleDescriptorOptions(this);
        }

        public Builder mapName(String str) {
            Objects.requireNonNull(str);
            this.mapName = str;
            return this;
        }
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetMapStyleDescriptorOptions defaults() {
        return builder().build();
    }

    public String getMapName() {
        return this.mapName;
    }

    private GetMapStyleDescriptorOptions(Builder builder) {
        this.mapName = builder.mapName;
    }
}
