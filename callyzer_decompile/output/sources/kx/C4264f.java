package kx;

import fx.InterfaceC2395a;
import pg.h9;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: kx.f */
/* loaded from: classes3.dex */
public class C4264f implements Iterable, InterfaceC2395a {

    /* renamed from: a */
    public final int f21646a;

    /* renamed from: b */
    public final int f21647b;

    /* renamed from: c */
    public final int f21648c;

    public C4264f(int i10, int i11, int i12) {
        if (i12 == 0) {
            throw new IllegalArgumentException("Step must be non-zero.");
        }
        if (i12 == Integer.MIN_VALUE) {
            throw new IllegalArgumentException("Step must be greater than Int.MIN_VALUE to avoid overflow on negation.");
        }
        this.f21646a = i10;
        this.f21647b = h9.m11687a(i10, i11, i12);
        this.f21648c = i12;
    }

    @Override // java.lang.Iterable
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final C4265g iterator() {
        return new C4265g(this.f21646a, this.f21647b, this.f21648c);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C4264f)) {
            return false;
        }
        if (isEmpty() && ((C4264f) obj).isEmpty()) {
            return true;
        }
        C4264f c4264f = (C4264f) obj;
        return this.f21646a == c4264f.f21646a && this.f21647b == c4264f.f21647b && this.f21648c == c4264f.f21648c;
    }

    public int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (((this.f21646a * 31) + this.f21647b) * 31) + this.f21648c;
    }

    public boolean isEmpty() {
        int i10 = this.f21648c;
        int i11 = this.f21647b;
        int i12 = this.f21646a;
        return i10 > 0 ? i12 > i11 : i12 < i11;
    }

    public String toString() {
        StringBuilder sb2;
        int i10 = this.f21647b;
        int i11 = this.f21646a;
        int i12 = this.f21648c;
        if (i12 > 0) {
            sb2 = new StringBuilder();
            sb2.append(i11);
            sb2.append("..");
            sb2.append(i10);
            sb2.append(" step ");
            sb2.append(i12);
        } else {
            sb2 = new StringBuilder();
            sb2.append(i11);
            sb2.append(" downTo ");
            sb2.append(i10);
            sb2.append(" step ");
            sb2.append(-i12);
        }
        return sb2.toString();
    }
}
