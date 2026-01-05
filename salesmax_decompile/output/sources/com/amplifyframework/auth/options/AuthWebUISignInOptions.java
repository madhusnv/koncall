package com.amplifyframework.auth.options;

import com.amplifyframework.util.Immutable;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import p001o.s6c;

/* loaded from: classes5.dex */
public class AuthWebUISignInOptions {
    private final List<String> scopes;

    public static abstract class Builder<T extends Builder<T>> {
        private List<String> scopes = new ArrayList();

        public AuthWebUISignInOptions build() {
            return new AuthWebUISignInOptions(Immutable.of(this.scopes));
        }

        public List<String> getScopes() {
            return this.scopes;
        }

        public abstract T getThis();

        public T scopes(List<String> list) {
            Objects.requireNonNull(list);
            this.scopes.clear();
            this.scopes.addAll(list);
            return (T) getThis();
        }
    }

    public static final class CoreBuilder extends Builder<CoreBuilder> {
        @Override // com.amplifyframework.auth.options.AuthWebUISignInOptions.Builder
        public CoreBuilder getThis() {
            return this;
        }
    }

    public AuthWebUISignInOptions(List<String> list) {
        this.scopes = list;
    }

    public static Builder<?> builder() {
        return new CoreBuilder();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return s6c.m47909a(getScopes(), ((AuthWebUISignInOptions) obj).getScopes());
    }

    public List<String> getScopes() {
        return this.scopes;
    }

    public int hashCode() {
        return s6c.m47910b(getScopes());
    }

    public String toString() {
        return "AuthWebUISignInOptions{scopes=" + getScopes() + '}';
    }
}
