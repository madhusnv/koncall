package com.apollographql.apollo.api.internal;

/* loaded from: classes5.dex */
public class Functions {

    public enum IdentityFunction implements Function<Object, Object> {
        INSTANCE;

        @Override // com.apollographql.apollo.api.internal.Function
        public Object apply(Object obj) {
            return obj;
        }

        @Override // java.lang.Enum
        public String toString() {
            return "Functions.identity()";
        }
    }

    public enum ToStringFunction implements Function<Object, String> {
        INSTANCE;

        @Override // java.lang.Enum
        public String toString() {
            return "Functions.toStringFunction()";
        }

        @Override // com.apollographql.apollo.api.internal.Function
        public String apply(Object obj) {
            Utils.checkNotNull(obj);
            return obj.toString();
        }
    }

    public static <E> Function<E, E> identity() {
        return IdentityFunction.INSTANCE;
    }

    public static Function<Object, String> toStringFunction() {
        return ToStringFunction.INSTANCE;
    }
}
