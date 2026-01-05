package com.amplifyframework.predictions.result;

import com.amplifyframework.predictions.models.Label;
import com.amplifyframework.util.Immutable;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class IdentifyLabelsResult implements IdentifyResult {
    private final List<Label> labels;
    private final boolean unsafeContent;

    /* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
    public static final class Builder {
        private List<Label> labels;
        private boolean unsafeContent;

        public /* synthetic */ Builder(int i10) {
            this();
        }

        public IdentifyLabelsResult build() {
            return new IdentifyLabelsResult(this, 0);
        }

        public List<Label> getLabels() {
            List<Label> list = this.labels;
            Objects.requireNonNull(list);
            return list;
        }

        public boolean getUnsafeContent() {
            return this.unsafeContent;
        }

        public Builder labels(List<Label> list) {
            Objects.requireNonNull(list);
            this.labels = list;
            return this;
        }

        public Builder unsafeContent(boolean z6) {
            this.unsafeContent = z6;
            return this;
        }

        private Builder() {
            this.labels = Collections.EMPTY_LIST;
        }
    }

    public /* synthetic */ IdentifyLabelsResult(Builder builder, int i10) {
        this(builder);
    }

    public static Builder builder() {
        return new Builder(0);
    }

    public List<Label> getLabels() {
        return Immutable.of(this.labels);
    }

    public boolean isUnsafeContent() {
        return this.unsafeContent;
    }

    private IdentifyLabelsResult(Builder builder) {
        this.labels = builder.getLabels();
        this.unsafeContent = builder.getUnsafeContent();
    }
}
