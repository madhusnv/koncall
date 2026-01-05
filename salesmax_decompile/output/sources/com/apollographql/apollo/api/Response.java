package com.apollographql.apollo.api;

import com.apollographql.apollo.api.internal.Utils;
import java.util.Collections;
import java.util.List;
import java.util.Set;

/* loaded from: classes5.dex */
public final class Response<T> {
    private final T data;
    private Set<String> dependentKeys;
    private final List<Error> errors;
    private final boolean fromCache;
    private final Operation operation;

    public static final class Builder<T> {
        private T data;
        private Set<String> dependentKeys;
        private List<Error> errors;
        private boolean fromCache;
        private final Operation operation;

        public Builder(Operation operation) {
            this.operation = (Operation) Utils.checkNotNull(operation, "operation == null");
        }

        public Response<T> build() {
            return new Response<>(this);
        }

        public Builder<T> data(T t) {
            this.data = t;
            return this;
        }

        public Builder<T> dependentKeys(Set<String> set) {
            this.dependentKeys = set;
            return this;
        }

        public Builder<T> errors(List<Error> list) {
            this.errors = list;
            return this;
        }

        public Builder<T> fromCache(boolean z) {
            this.fromCache = z;
            return this;
        }
    }

    public Response(Builder<T> builder) {
        this.operation = (Operation) Utils.checkNotNull(((Builder) builder).operation, "operation == null");
        this.data = (T) ((Builder) builder).data;
        this.errors = ((Builder) builder).errors != null ? Collections.unmodifiableList(((Builder) builder).errors) : Collections.emptyList();
        this.dependentKeys = ((Builder) builder).dependentKeys != null ? Collections.unmodifiableSet(((Builder) builder).dependentKeys) : Collections.emptySet();
        this.fromCache = ((Builder) builder).fromCache;
    }

    public static <T> Builder<T> builder(Operation operation) {
        return new Builder<>(operation);
    }

    public T data() {
        return this.data;
    }

    public Set<String> dependentKeys() {
        return this.dependentKeys;
    }

    public List<Error> errors() {
        return this.errors;
    }

    public boolean fromCache() {
        return this.fromCache;
    }

    public boolean hasErrors() {
        return !this.errors.isEmpty();
    }

    public Operation operation() {
        return this.operation;
    }

    public Builder<T> toBuilder() {
        return new Builder(this.operation).data(this.data).errors(this.errors).dependentKeys(this.dependentKeys).fromCache(this.fromCache);
    }
}
