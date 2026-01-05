package kx;

import fx.InterfaceC2395a;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: kx.i */
/* loaded from: classes3.dex */
public final class C4267i implements Iterator, InterfaceC2395a {

    /* renamed from: a */
    public final long f21654a;

    /* renamed from: b */
    public final long f21655b;

    /* renamed from: c */
    public boolean f21656c;

    /* renamed from: d */
    public long f21657d;

    public C4267i(long j6, long j10, long j11) {
        this.f21654a = j11;
        this.f21655b = j10;
        boolean z6 = false;
        if (j11 <= 0 ? j6 >= j10 : j6 <= j10) {
            z6 = true;
        }
        this.f21656c = z6;
        this.f21657d = z6 ? j6 : j10;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f21656c;
    }

    @Override // java.util.Iterator
    public final Object next() {
        long j6 = this.f21657d;
        if (j6 != this.f21655b) {
            this.f21657d = this.f21654a + j6;
        } else {
            if (!this.f21656c) {
                throw new NoSuchElementException();
            }
            this.f21656c = false;
        }
        return Long.valueOf(j6);
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
