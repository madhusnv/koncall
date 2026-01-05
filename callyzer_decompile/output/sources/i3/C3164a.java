package i3;

import com.sun.mail.util.AbstractC1452a;
import d3.C1552f;
import d3.C1559m;
import f3.InterfaceC2198d;
import kotlin.jvm.internal.AbstractC4154l;
import og.ze;
import s4.C6754j;
import s4.C6756l;
import v3.i0;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: i3.a */
/* loaded from: classes.dex */
public final class C3164a extends AbstractC3166c {

    /* renamed from: f */
    public final C1552f f17079f;

    /* renamed from: g */
    public final long f17080g;

    /* renamed from: h */
    public int f17081h = 1;

    /* renamed from: j */
    public final long f17082j;

    /* renamed from: k */
    public float f17083k;

    /* renamed from: l */
    public C1559m f17084l;

    public C3164a(C1552f c1552f, long j6) {
        int i10;
        int i11;
        this.f17079f = c1552f;
        this.f17080g = j6;
        if (((int) 0) < 0 || ((int) 0) < 0 || (i10 = (int) (j6 >> 32)) < 0 || (i11 = (int) (4294967295L & j6)) < 0 || i10 > c1552f.f7745a.getWidth() || i11 > c1552f.f7745a.getHeight()) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        this.f17082j = j6;
        this.f17083k = 1.0f;
    }

    @Override // i3.AbstractC3166c
    /* renamed from: a */
    public final boolean mo7531a(float f6) {
        this.f17083k = f6;
        return true;
    }

    @Override // i3.AbstractC3166c
    /* renamed from: d */
    public final boolean mo7532d(C1559m c1559m) {
        this.f17084l = c1559m;
        return true;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3164a)) {
            return false;
        }
        C3164a c3164a = (C3164a) obj;
        return AbstractC4154l.m8918a(this.f17079f, c3164a.f17079f) && C6754j.m12940a(0L, 0L) && C6756l.m12948a(this.f17080g, c3164a.f17080g) && this.f17081h == c3164a.f17081h;
    }

    @Override // i3.AbstractC3166c
    /* renamed from: h */
    public final long mo7533h() {
        return ze.m11098d(this.f17082j);
    }

    public final int hashCode() {
        return Integer.hashCode(this.f17081h) + AbstractC1452a.m4557d(AbstractC1452a.m4557d(this.f17079f.hashCode() * 31, 31, 0L), 31, this.f17080g);
    }

    @Override // i3.AbstractC3166c
    /* renamed from: i */
    public final void mo7534i(i0 i0Var) {
        InterfaceC2198d.y0(i0Var, this.f17079f, this.f17080g, (Math.round(Float.intBitsToFloat((int) (r1.mo5913e() & 4294967295L))) & 4294967295L) | (Math.round(Float.intBitsToFloat((int) (i0Var.f36917a.mo5913e() >> 32))) << 32), this.f17083k, this.f17084l, this.f17081h, 328);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("BitmapPainter(image=");
        sb2.append(this.f17079f);
        sb2.append(", srcOffset=");
        sb2.append((Object) C6754j.m12943d(0L));
        sb2.append(", srcSize=");
        sb2.append((Object) C6756l.m12949b(this.f17080g));
        sb2.append(", filterQuality=");
        int i10 = this.f17081h;
        sb2.append((Object) (i10 == 0 ? "None" : i10 == 1 ? "Low" : i10 == 2 ? "Medium" : i10 == 3 ? "High" : "Unknown"));
        sb2.append(')');
        return sb2.toString();
    }
}
