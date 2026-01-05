package p001o;

import java.util.List;

/* loaded from: classes2.dex */
public final class ycd {

    /* renamed from: a */
    public final long f55238a;

    /* renamed from: b */
    public final long f55239b;

    /* renamed from: c */
    public final long f55240c;

    /* renamed from: d */
    public final long f55241d;

    /* renamed from: e */
    public final boolean f55242e;

    /* renamed from: f */
    public final float f55243f;

    /* renamed from: g */
    public final int f55244g;

    /* renamed from: h */
    public final boolean f55245h;

    /* renamed from: i */
    public final List f55246i;

    /* renamed from: j */
    public final long f55247j;

    public /* synthetic */ ycd(long j, long j2, long j3, long j4, boolean z, float f, int i, boolean z2, List list, long j5, id5 id5Var) {
        this(j, j2, j3, j4, z, f, i, z2, list, j5);
    }

    /* renamed from: a */
    public final boolean m57564a() {
        return this.f55242e;
    }

    /* renamed from: b */
    public final List m57565b() {
        return this.f55246i;
    }

    /* renamed from: c */
    public final long m57566c() {
        return this.f55238a;
    }

    /* renamed from: d */
    public final boolean m57567d() {
        return this.f55245h;
    }

    /* renamed from: e */
    public final long m57568e() {
        return this.f55241d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ycd)) {
            return false;
        }
        ycd ycdVar = (ycd) obj;
        return ucd.m51366d(this.f55238a, ycdVar.f55238a) && this.f55239b == ycdVar.f55239b && s9c.m48050i(this.f55240c, ycdVar.f55240c) && s9c.m48050i(this.f55241d, ycdVar.f55241d) && this.f55242e == ycdVar.f55242e && Float.compare(this.f55243f, ycdVar.f55243f) == 0 && edd.m24806g(this.f55244g, ycdVar.f55244g) && this.f55245h == ycdVar.f55245h && sq8.m48644c(this.f55246i, ycdVar.f55246i) && s9c.m48050i(this.f55247j, ycdVar.f55247j);
    }

    /* renamed from: f */
    public final long m57569f() {
        return this.f55240c;
    }

    /* renamed from: g */
    public final float m57570g() {
        return this.f55243f;
    }

    /* renamed from: h */
    public final long m57571h() {
        return this.f55247j;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int iM51367e = ((((((ucd.m51367e(this.f55238a) * 31) + Long.hashCode(this.f55239b)) * 31) + s9c.m48054m(this.f55240c)) * 31) + s9c.m48054m(this.f55241d)) * 31;
        boolean z = this.f55242e;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        int iHashCode = (((((iM51367e + i) * 31) + Float.hashCode(this.f55243f)) * 31) + edd.m24807h(this.f55244g)) * 31;
        boolean z2 = this.f55245h;
        return ((((iHashCode + (z2 ? 1 : z2 ? 1 : 0)) * 31) + this.f55246i.hashCode()) * 31) + s9c.m48054m(this.f55247j);
    }

    /* renamed from: i */
    public final int m57572i() {
        return this.f55244g;
    }

    /* renamed from: j */
    public final long m57573j() {
        return this.f55239b;
    }

    public String toString() {
        return "PointerInputEventData(id=" + ((Object) ucd.m51368f(this.f55238a)) + ", uptime=" + this.f55239b + ", positionOnScreen=" + ((Object) s9c.m48058q(this.f55240c)) + ", position=" + ((Object) s9c.m48058q(this.f55241d)) + ", down=" + this.f55242e + ", pressure=" + this.f55243f + ", type=" + ((Object) edd.m24808i(this.f55244g)) + ", issuesEnterExit=" + this.f55245h + ", historical=" + this.f55246i + ", scrollDelta=" + ((Object) s9c.m48058q(this.f55247j)) + ')';
    }

    public ycd(long j, long j2, long j3, long j4, boolean z, float f, int i, boolean z2, List list, long j5) {
        sq8.m48649h(list, "historical");
        this.f55238a = j;
        this.f55239b = j2;
        this.f55240c = j3;
        this.f55241d = j4;
        this.f55242e = z;
        this.f55243f = f;
        this.f55244g = i;
        this.f55245h = z2;
        this.f55246i = list;
        this.f55247j = j5;
    }
}
