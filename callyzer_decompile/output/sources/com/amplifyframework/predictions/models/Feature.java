package com.amplifyframework.predictions.models;

import java.util.Objects;
import java.util.UUID;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public abstract class Feature<T> implements Comparable<Feature<T>> {
    private final float confidence;

    /* renamed from: id, reason: collision with root package name */
    private final String f43778id;
    private final T value;

    /* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
    public static abstract class Builder<B extends Builder<B, R, T>, R extends Feature<T>, T> {
        private float confidence;

        /* renamed from: id, reason: collision with root package name */
        private String f43779id = UUID.randomUUID().toString();
        private T value;

        public abstract R build();

        public final B confidence(float f6) {
            this.confidence = f6;
            return this;
        }

        public final float getConfidence() {
            return this.confidence;
        }

        public final String getId() {
            String str = this.f43779id;
            Objects.requireNonNull(str);
            return str;
        }

        public final T getValue() {
            T t7 = this.value;
            Objects.requireNonNull(t7);
            return t7;
        }

        public final B id(String str) {
            Objects.requireNonNull(str);
            this.f43779id = str;
            return this;
        }

        public final B value(T t7) {
            Objects.requireNonNull(t7);
            this.value = t7;
            return this;
        }
    }

    public Feature(Builder<?, ? extends Feature<T>, T> builder) {
        this.f43778id = builder.getId();
        this.value = builder.getValue();
        this.confidence = builder.getConfidence();
    }

    public final float getConfidence() {
        return this.confidence;
    }

    public final String getId() {
        return this.f43778id;
    }

    public abstract String getTypeAlias();

    public final T getValue() {
        return this.value;
    }

    @Override // java.lang.Comparable
    public int compareTo(Feature<T> feature) {
        if (feature == null) {
            return -1;
        }
        int iCompareToIgnoreCase = getTypeAlias().compareToIgnoreCase(feature.getTypeAlias());
        return iCompareToIgnoreCase != 0 ? iCompareToIgnoreCase : (int) Math.signum(getConfidence() - feature.getConfidence());
    }
}
