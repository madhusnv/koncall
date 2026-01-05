package p3;

import c3.C0847b;
import com.sun.mail.util.AbstractC1452a;
import java.util.ArrayList;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: p3.s */
/* loaded from: classes.dex */
public final class C5821s {

    /* renamed from: a */
    public final long f28494a;

    /* renamed from: b */
    public final long f28495b;

    /* renamed from: c */
    public final long f28496c;

    /* renamed from: d */
    public final long f28497d;

    /* renamed from: e */
    public final boolean f28498e;

    /* renamed from: f */
    public final float f28499f;

    /* renamed from: g */
    public final int f28500g;

    /* renamed from: h */
    public final boolean f28501h;

    /* renamed from: i */
    public final ArrayList f28502i;

    /* renamed from: j */
    public final long f28503j;

    /* renamed from: k */
    public final long f28504k;

    public C5821s(long j6, long j10, long j11, long j12, boolean z6, float f6, int i10, boolean z10, ArrayList arrayList, long j13, long j14) {
        this.f28494a = j6;
        this.f28495b = j10;
        this.f28496c = j11;
        this.f28497d = j12;
        this.f28498e = z6;
        this.f28499f = f6;
        this.f28500g = i10;
        this.f28501h = z10;
        this.f28502i = arrayList;
        this.f28503j = j13;
        this.f28504k = j14;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C5821s)) {
            return false;
        }
        C5821s c5821s = (C5821s) obj;
        return AbstractC5818p.m11400d(this.f28494a, c5821s.f28494a) && this.f28495b == c5821s.f28495b && C0847b.m2271b(this.f28496c, c5821s.f28496c) && C0847b.m2271b(this.f28497d, c5821s.f28497d) && this.f28498e == c5821s.f28498e && Float.compare(this.f28499f, c5821s.f28499f) == 0 && this.f28500g == c5821s.f28500g && this.f28501h == c5821s.f28501h && this.f28502i.equals(c5821s.f28502i) && C0847b.m2271b(this.f28503j, c5821s.f28503j) && C0847b.m2271b(this.f28504k, c5821s.f28504k);
    }

    public final int hashCode() {
        return Long.hashCode(this.f28504k) + AbstractC1452a.m4557d((this.f28502i.hashCode() + AbstractC1452a.m4558e(AbstractC1452a.m4556c(this.f28500g, AbstractC1452a.m4555b(this.f28499f, AbstractC1452a.m4558e(AbstractC1452a.m4557d(AbstractC1452a.m4557d(AbstractC1452a.m4557d(Long.hashCode(this.f28494a) * 31, 31, this.f28495b), 31, this.f28496c), 31, this.f28497d), 31, this.f28498e), 31), 31), 31, this.f28501h)) * 31, 31, this.f28503j);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("PointerInputEventData(id=");
        sb2.append((Object) ("PointerId(value=" + this.f28494a + ')'));
        sb2.append(", uptime=");
        sb2.append(this.f28495b);
        sb2.append(", positionOnScreen=");
        sb2.append((Object) C0847b.m2278i(this.f28496c));
        sb2.append(", position=");
        sb2.append((Object) C0847b.m2278i(this.f28497d));
        sb2.append(", down=");
        sb2.append(this.f28498e);
        sb2.append(", pressure=");
        sb2.append(this.f28499f);
        sb2.append(", type=");
        int i10 = this.f28500g;
        sb2.append((Object) (i10 != 1 ? i10 != 2 ? i10 != 3 ? i10 != 4 ? "Unknown" : "Eraser" : "Stylus" : "Mouse" : "Touch"));
        sb2.append(", activeHover=");
        sb2.append(this.f28501h);
        sb2.append(", historical=");
        sb2.append(this.f28502i);
        sb2.append(", scrollDelta=");
        sb2.append((Object) C0847b.m2278i(this.f28503j));
        sb2.append(", originalEventPosition=");
        sb2.append((Object) C0847b.m2278i(this.f28504k));
        sb2.append(')');
        return sb2.toString();
    }
}
