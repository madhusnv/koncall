package com.amplifyframework.predictions.models;

import com.amplifyframework.predictions.models.Feature;
import java.util.Objects;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class BinaryFeature extends Feature<Boolean> {
    private final String type;

    /* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
    public static final class Builder extends Feature.Builder<Builder, BinaryFeature, Boolean> {
        private String type;

        public String getType() {
            String str = this.type;
            Objects.requireNonNull(str);
            return str;
        }

        public Builder type(String str) {
            Objects.requireNonNull(str);
            this.type = str;
            return this;
        }

        @Override // com.amplifyframework.predictions.models.Feature.Builder
        public BinaryFeature build() {
            return new BinaryFeature(this, 0);
        }
    }

    public /* synthetic */ BinaryFeature(Builder builder, int i10) {
        this(builder);
    }

    public static Builder builder() {
        return new Builder();
    }

    @Override // com.amplifyframework.predictions.models.Feature
    public String getTypeAlias() {
        return this.type;
    }

    private BinaryFeature(Builder builder) {
        super(builder);
        this.type = builder.getType();
    }
}
