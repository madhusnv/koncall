package i7;

import kotlin.jvm.internal.AbstractC4154l;
import tx.InterfaceC7266z;
import tx.c0;
import uw.InterfaceC7564h;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: i7.a */
/* loaded from: classes.dex */
public final class C3178a implements AutoCloseable, InterfaceC7266z {

    /* renamed from: a */
    public final InterfaceC7564h f17100a;

    public C3178a(InterfaceC7564h coroutineContext) {
        AbstractC4154l.m8923f(coroutineContext, "coroutineContext");
        this.f17100a = coroutineContext;
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        c0.m13486i(this.f17100a, null);
    }

    @Override // tx.InterfaceC7266z
    /* renamed from: w */
    public final InterfaceC7564h mo1865w() {
        return this.f17100a;
    }
}
