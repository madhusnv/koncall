package com.amplifyframework.geo.options;

import java.util.Objects;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class GetMapStyleDescriptorOptions {
    private final String mapName;

    /* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
    public static final class Builder {
        private String mapName;

        public /* synthetic */ Builder(int i10) {
            this();
        }

        public GetMapStyleDescriptorOptions build() {
            return new GetMapStyleDescriptorOptions(this, 0);
        }

        public Builder mapName(String str) {
            Objects.requireNonNull(str);
            this.mapName = str;
            return this;
        }

        private Builder() {
        }
    }

    public /* synthetic */ GetMapStyleDescriptorOptions(Builder builder, int i10) {
        this(builder);
    }

    public static Builder builder() {
        return new Builder(0);
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
