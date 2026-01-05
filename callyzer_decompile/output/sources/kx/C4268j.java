package kx;

import fx.InterfaceC2395a;
import java.util.Iterator;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: kx.j */
/* loaded from: classes3.dex */
public final class C4268j implements Iterable, InterfaceC2395a {

    /* renamed from: a */
    public final long f21658a;

    /* renamed from: b */
    public final long f21659b;

    /* renamed from: c */
    public final long f21660c;

    public C4268j(long j6, long j10) {
        this.f21658a = j6;
        if (j6 < j10) {
            long j11 = j10 % 1;
            long j12 = j6 % 1;
            long j13 = ((j11 < 0 ? j11 + 1 : j11) - (j12 < 0 ? j12 + 1 : j12)) % 1;
            j10 -= j13 < 0 ? j13 + 1 : j13;
        }
        this.f21659b = j10;
        this.f21660c = 1L;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C4268j)) {
            return false;
        }
        if (isEmpty() && ((C4268j) obj).isEmpty()) {
            return true;
        }
        C4268j c4268j = (C4268j) obj;
        return this.f21658a == c4268j.f21658a && this.f21659b == c4268j.f21659b;
    }

    public final int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        long j6 = this.f21658a;
        long j10 = 31 * (j6 ^ (j6 >>> 32));
        long j11 = this.f21659b;
        return (int) (j10 + (j11 ^ (j11 >>> 32)));
    }

    public final boolean isEmpty() {
        return this.f21658a > this.f21659b;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new C4267i(this.f21658a, this.f21659b, this.f21660c);
    }

    public final String toString() {
        return this.f21658a + ".." + this.f21659b;
    }
}
