package g4;

import c3.C0848c;
import com.skydoves.balloon.internals.DefinitionKt;
import com.sun.mail.util.AbstractC1452a;
import og.yf;
import pg.w9;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: g4.s */
/* loaded from: classes.dex */
public final class C2503s {

    /* renamed from: a */
    public final C2486b f13709a;

    /* renamed from: b */
    public final int f13710b;

    /* renamed from: c */
    public final int f13711c;

    /* renamed from: d */
    public final int f13712d;

    /* renamed from: e */
    public final int f13713e;

    /* renamed from: f */
    public final float f13714f;

    /* renamed from: g */
    public final float f13715g;

    public C2503s(C2486b c2486b, int i10, int i11, int i12, int i13, float f6, float f10) {
        this.f13709a = c2486b;
        this.f13710b = i10;
        this.f13711c = i11;
        this.f13712d = i12;
        this.f13713e = i13;
        this.f13714f = f6;
        this.f13715g = f10;
    }

    /* renamed from: a */
    public final C0848c m6479a(C0848c c0848c) {
        return c0848c.m2287i((Float.floatToRawIntBits(DefinitionKt.NO_Float_VALUE) << 32) | (Float.floatToRawIntBits(this.f13714f) & 4294967295L));
    }

    /* renamed from: b */
    public final long m6480b(boolean z6, long j6) {
        if (z6) {
            long j10 = n0.f13684b;
            if (n0.m6454a(j6, j10)) {
                return j10;
            }
        }
        int i10 = n0.f13685c;
        int i11 = (int) (j6 >> 32);
        int i12 = this.f13710b;
        return yf.m11072a(i11 + i12, ((int) (j6 & 4294967295L)) + i12);
    }

    /* renamed from: c */
    public final C0848c m6481c(C0848c c0848c) {
        float f6 = -this.f13714f;
        return c0848c.m2287i((Float.floatToRawIntBits(DefinitionKt.NO_Float_VALUE) << 32) | (Float.floatToRawIntBits(f6) & 4294967295L));
    }

    /* renamed from: d */
    public final int m6482d(int i10) {
        int i11 = this.f13711c;
        int i12 = this.f13710b;
        return w9.m11912c(i10, i12, i11) - i12;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2503s)) {
            return false;
        }
        C2503s c2503s = (C2503s) obj;
        return this.f13709a.equals(c2503s.f13709a) && this.f13710b == c2503s.f13710b && this.f13711c == c2503s.f13711c && this.f13712d == c2503s.f13712d && this.f13713e == c2503s.f13713e && Float.compare(this.f13714f, c2503s.f13714f) == 0 && Float.compare(this.f13715g, c2503s.f13715g) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f13715g) + AbstractC1452a.m4555b(this.f13714f, AbstractC1452a.m4556c(this.f13713e, AbstractC1452a.m4556c(this.f13712d, AbstractC1452a.m4556c(this.f13711c, AbstractC1452a.m4556c(this.f13710b, this.f13709a.hashCode() * 31, 31), 31), 31), 31), 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ParagraphInfo(paragraph=");
        sb2.append(this.f13709a);
        sb2.append(", startIndex=");
        sb2.append(this.f13710b);
        sb2.append(", endIndex=");
        sb2.append(this.f13711c);
        sb2.append(", startLineIndex=");
        sb2.append(this.f13712d);
        sb2.append(", endLineIndex=");
        sb2.append(this.f13713e);
        sb2.append(", top=");
        sb2.append(this.f13714f);
        sb2.append(", bottom=");
        return AbstractC1452a.m4562i(sb2, this.f13715g, ')');
    }
}
