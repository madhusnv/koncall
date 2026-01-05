package p001o;

import p001o.x8b;

/* loaded from: classes2.dex */
public final class y4b {

    /* renamed from: a */
    public final x8b.C18076b f54866a;

    /* renamed from: b */
    public final long f54867b;

    /* renamed from: c */
    public final long f54868c;

    /* renamed from: d */
    public final long f54869d;

    /* renamed from: e */
    public final long f54870e;

    /* renamed from: f */
    public final boolean f54871f;

    /* renamed from: g */
    public final boolean f54872g;

    /* renamed from: h */
    public final boolean f54873h;

    /* renamed from: i */
    public final boolean f54874i;

    public y4b(x8b.C18076b c18076b, long j, long j2, long j3, long j4, boolean z, boolean z2, boolean z3, boolean z4) {
        boolean z5 = false;
        op0.m42511a(!z4 || z2);
        op0.m42511a(!z3 || z2);
        if (!z || (!z2 && !z3 && !z4)) {
            z5 = true;
        }
        op0.m42511a(z5);
        this.f54866a = c18076b;
        this.f54867b = j;
        this.f54868c = j2;
        this.f54869d = j3;
        this.f54870e = j4;
        this.f54871f = z;
        this.f54872g = z2;
        this.f54873h = z3;
        this.f54874i = z4;
    }

    /* renamed from: a */
    public y4b m57199a(long j) {
        return j == this.f54868c ? this : new y4b(this.f54866a, this.f54867b, j, this.f54869d, this.f54870e, this.f54871f, this.f54872g, this.f54873h, this.f54874i);
    }

    /* renamed from: b */
    public y4b m57200b(long j) {
        return j == this.f54867b ? this : new y4b(this.f54866a, j, this.f54868c, this.f54869d, this.f54870e, this.f54871f, this.f54872g, this.f54873h, this.f54874i);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || y4b.class != obj.getClass()) {
            return false;
        }
        y4b y4bVar = (y4b) obj;
        return this.f54867b == y4bVar.f54867b && this.f54868c == y4bVar.f54868c && this.f54869d == y4bVar.f54869d && this.f54870e == y4bVar.f54870e && this.f54871f == y4bVar.f54871f && this.f54872g == y4bVar.f54872g && this.f54873h == y4bVar.f54873h && this.f54874i == y4bVar.f54874i && sqi.m48724c(this.f54866a, y4bVar.f54866a);
    }

    public int hashCode() {
        return ((((((((((((((((527 + this.f54866a.hashCode()) * 31) + ((int) this.f54867b)) * 31) + ((int) this.f54868c)) * 31) + ((int) this.f54869d)) * 31) + ((int) this.f54870e)) * 31) + (this.f54871f ? 1 : 0)) * 31) + (this.f54872g ? 1 : 0)) * 31) + (this.f54873h ? 1 : 0)) * 31) + (this.f54874i ? 1 : 0);
    }
}
