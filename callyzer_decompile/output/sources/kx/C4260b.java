package kx;

import fx.InterfaceC2395a;
import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.AbstractC4154l;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: kx.b */
/* loaded from: classes3.dex */
public final class C4260b implements Iterator, InterfaceC2395a {

    /* renamed from: a */
    public final int f21640a;

    /* renamed from: b */
    public final int f21641b;

    /* renamed from: c */
    public boolean f21642c;

    /* renamed from: d */
    public int f21643d;

    public C4260b(char c2, char c10, int i10) {
        this.f21640a = i10;
        this.f21641b = c10;
        boolean z6 = false;
        if (i10 <= 0 ? AbstractC4154l.m8924g(c2, c10) >= 0 : AbstractC4154l.m8924g(c2, c10) <= 0) {
            z6 = true;
        }
        this.f21642c = z6;
        this.f21643d = z6 ? c2 : c10;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f21642c;
    }

    @Override // java.util.Iterator
    public final Object next() {
        int i10 = this.f21643d;
        if (i10 != this.f21641b) {
            this.f21643d = this.f21640a + i10;
        } else {
            if (!this.f21642c) {
                throw new NoSuchElementException();
            }
            this.f21642c = false;
        }
        return Character.valueOf((char) i10);
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
