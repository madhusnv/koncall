package com.google.api.client.util;

import p001o.h79;

/* loaded from: classes3.dex */
public final class Joiner {
    private final h79 wrapped;

    private Joiner(h79 h79Var) {
        this.wrapped = h79Var;
    }

    public static Joiner on(char c) {
        return new Joiner(h79.m29889f(c));
    }

    public final String join(Iterable<?> iterable) {
        return this.wrapped.m29894d(iterable);
    }
}
