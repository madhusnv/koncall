package b00;

import kotlin.jvm.internal.AbstractC4154l;
import rw.AbstractC6662l;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes3.dex */
public final class e0 {

    /* renamed from: a */
    public final byte[] f3607a;

    /* renamed from: b */
    public int f3608b;

    /* renamed from: c */
    public int f3609c;

    /* renamed from: d */
    public boolean f3610d;

    /* renamed from: e */
    public final boolean f3611e;

    /* renamed from: f */
    public e0 f3612f;

    /* renamed from: g */
    public e0 f3613g;

    public e0() {
        this.f3607a = new byte[8192];
        this.f3611e = true;
        this.f3610d = false;
    }

    /* renamed from: a */
    public final e0 m1552a() {
        e0 e0Var = this.f3612f;
        if (e0Var == this) {
            e0Var = null;
        }
        e0 e0Var2 = this.f3613g;
        AbstractC4154l.m8920c(e0Var2);
        e0Var2.f3612f = this.f3612f;
        e0 e0Var3 = this.f3612f;
        AbstractC4154l.m8920c(e0Var3);
        e0Var3.f3613g = this.f3613g;
        this.f3612f = null;
        this.f3613g = null;
        return e0Var;
    }

    /* renamed from: b */
    public final void m1553b(e0 segment) {
        AbstractC4154l.m8923f(segment, "segment");
        segment.f3613g = this;
        segment.f3612f = this.f3612f;
        e0 e0Var = this.f3612f;
        AbstractC4154l.m8920c(e0Var);
        e0Var.f3613g = segment;
        this.f3612f = segment;
    }

    /* renamed from: c */
    public final e0 m1554c() {
        this.f3610d = true;
        return new e0(this.f3607a, this.f3608b, this.f3609c, true, false);
    }

    /* renamed from: d */
    public final void m1555d(e0 sink, int i10) {
        AbstractC4154l.m8923f(sink, "sink");
        byte[] bArr = sink.f3607a;
        if (!sink.f3611e) {
            throw new IllegalStateException("only owner can write");
        }
        int i11 = sink.f3609c;
        int i12 = i11 + i10;
        if (i12 > 8192) {
            if (sink.f3610d) {
                throw new IllegalArgumentException();
            }
            int i13 = sink.f3608b;
            if (i12 - i13 > 8192) {
                throw new IllegalArgumentException();
            }
            AbstractC6662l.m12721k(i13, bArr, i11, bArr, 2);
            sink.f3609c -= sink.f3608b;
            sink.f3608b = 0;
        }
        int i14 = sink.f3609c;
        int i15 = this.f3608b;
        AbstractC6662l.m12716f(i14, this.f3607a, i15, bArr, i15 + i10);
        sink.f3609c += i10;
        this.f3608b += i10;
    }

    public e0(byte[] data, int i10, int i11, boolean z6, boolean z10) {
        AbstractC4154l.m8923f(data, "data");
        this.f3607a = data;
        this.f3608b = i10;
        this.f3609c = i11;
        this.f3610d = z6;
        this.f3611e = z10;
    }
}
