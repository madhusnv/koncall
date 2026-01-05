package p3;

import c3.C0847b;
import java.util.ArrayList;
import rw.C6668r;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: p3.q */
/* loaded from: classes.dex */
public final class C5819q {

    /* renamed from: a */
    public final long f28476a;

    /* renamed from: b */
    public final long f28477b;

    /* renamed from: c */
    public final long f28478c;

    /* renamed from: d */
    public final boolean f28479d;

    /* renamed from: e */
    public final float f28480e;

    /* renamed from: f */
    public final long f28481f;

    /* renamed from: g */
    public final long f28482g;

    /* renamed from: h */
    public final boolean f28483h;

    /* renamed from: i */
    public final int f28484i;

    /* renamed from: j */
    public final long f28485j;

    /* renamed from: k */
    public final ArrayList f28486k;

    /* renamed from: l */
    public final long f28487l;

    /* renamed from: m */
    public boolean f28488m;

    /* renamed from: n */
    public boolean f28489n;

    /* renamed from: o */
    public C5819q f28490o;

    public C5819q(long j6, long j10, long j11, boolean z6, float f6, long j12, long j13, boolean z10, boolean z11, int i10, long j14) {
        this.f28476a = j6;
        this.f28477b = j10;
        this.f28478c = j11;
        this.f28479d = z6;
        this.f28480e = f6;
        this.f28481f = j12;
        this.f28482g = j13;
        this.f28483h = z10;
        this.f28484i = i10;
        this.f28485j = j14;
        this.f28487l = 0L;
        this.f28488m = z11;
        this.f28489n = z11;
    }

    /* renamed from: a */
    public final void m11405a() {
        C5819q c5819q = this.f28490o;
        if (c5819q == null) {
            this.f28488m = true;
            this.f28489n = true;
        } else if (c5819q != null) {
            c5819q.m11405a();
        }
    }

    /* renamed from: b */
    public final boolean m11406b() {
        C5819q c5819q = this.f28490o;
        return c5819q != null ? c5819q.m11406b() : this.f28488m || this.f28489n;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("PointerInputChange(id=");
        sb2.append((Object) ("PointerId(value=" + this.f28476a + ')'));
        sb2.append(", uptimeMillis=");
        sb2.append(this.f28477b);
        sb2.append(", position=");
        sb2.append((Object) C0847b.m2278i(this.f28478c));
        sb2.append(", pressed=");
        sb2.append(this.f28479d);
        sb2.append(", pressure=");
        sb2.append(this.f28480e);
        sb2.append(", previousUptimeMillis=");
        sb2.append(this.f28481f);
        sb2.append(", previousPosition=");
        sb2.append((Object) C0847b.m2278i(this.f28482g));
        sb2.append(", previousPressed=");
        sb2.append(this.f28483h);
        sb2.append(", isConsumed=");
        sb2.append(m11406b());
        sb2.append(", type=");
        int i10 = this.f28484i;
        sb2.append((Object) (i10 != 1 ? i10 != 2 ? i10 != 3 ? i10 != 4 ? "Unknown" : "Eraser" : "Stylus" : "Mouse" : "Touch"));
        sb2.append(", historical=");
        Object obj = this.f28486k;
        if (obj == null) {
            obj = C6668r.f31943a;
        }
        sb2.append(obj);
        sb2.append(",scrollDelta=");
        sb2.append((Object) C0847b.m2278i(this.f28485j));
        sb2.append(')');
        return sb2.toString();
    }

    public C5819q(long j6, long j10, long j11, boolean z6, float f6, long j12, long j13, boolean z10, int i10, ArrayList arrayList, long j14, long j15) {
        this(j6, j10, j11, z6, f6, j12, j13, z10, false, i10, j14);
        this.f28486k = arrayList;
        this.f28487l = j15;
    }
}
