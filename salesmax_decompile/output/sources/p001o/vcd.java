package p001o;

import java.util.List;

/* loaded from: classes2.dex */
public final class vcd {

    /* renamed from: a */
    public final long f50112a;

    /* renamed from: b */
    public final long f50113b;

    /* renamed from: c */
    public final long f50114c;

    /* renamed from: d */
    public final boolean f50115d;

    /* renamed from: e */
    public final float f50116e;

    /* renamed from: f */
    public final long f50117f;

    /* renamed from: g */
    public final long f50118g;

    /* renamed from: h */
    public final boolean f50119h;

    /* renamed from: i */
    public final int f50120i;

    /* renamed from: j */
    public final long f50121j;

    /* renamed from: k */
    public List f50122k;

    /* renamed from: l */
    public eu3 f50123l;

    public /* synthetic */ vcd(long j, long j2, long j3, boolean z, float f, long j4, long j5, boolean z2, boolean z3, int i, long j6, id5 id5Var) {
        this(j, j2, j3, z, f, j4, j5, z2, z3, i, j6);
    }

    /* renamed from: a */
    public final vcd m52522a(long j, long j2, long j3, boolean z, long j4, long j5, boolean z2, int i, List list, long j6) {
        sq8.m48649h(list, "historical");
        return m52523c(j, j2, j3, z, this.f50116e, j4, j5, z2, i, list, j6);
    }

    /* renamed from: c */
    public final vcd m52523c(long j, long j2, long j3, boolean z, float f, long j4, long j5, boolean z2, int i, List list, long j6) {
        sq8.m48649h(list, "historical");
        vcd vcdVar = new vcd(j, j2, j3, z, f, j4, j5, z2, false, i, list, j6, null);
        vcdVar.f50123l = this.f50123l;
        return vcdVar;
    }

    /* renamed from: d */
    public final List m52524d() {
        List list = this.f50122k;
        return list == null ? ch3.m21246k() : list;
    }

    /* renamed from: e */
    public final long m52525e() {
        return this.f50112a;
    }

    /* renamed from: f */
    public final long m52526f() {
        return this.f50114c;
    }

    /* renamed from: g */
    public final boolean m52527g() {
        return this.f50115d;
    }

    /* renamed from: h */
    public final long m52528h() {
        return this.f50118g;
    }

    /* renamed from: i */
    public final boolean m52529i() {
        return this.f50119h;
    }

    /* renamed from: j */
    public final int m52530j() {
        return this.f50120i;
    }

    /* renamed from: k */
    public final boolean m52531k() {
        return this.f50123l.m25608a() || this.f50123l.m25609b();
    }

    public String toString() {
        return "PointerInputChange(id=" + ((Object) ucd.m51368f(this.f50112a)) + ", uptimeMillis=" + this.f50113b + ", position=" + ((Object) s9c.m48058q(this.f50114c)) + ", pressed=" + this.f50115d + ", pressure=" + this.f50116e + ", previousUptimeMillis=" + this.f50117f + ", previousPosition=" + ((Object) s9c.m48058q(this.f50118g)) + ", previousPressed=" + this.f50119h + ", isConsumed=" + m52531k() + ", type=" + ((Object) edd.m24808i(this.f50120i)) + ", historical=" + m52524d() + ",scrollDelta=" + ((Object) s9c.m48058q(this.f50121j)) + ')';
    }

    public /* synthetic */ vcd(long j, long j2, long j3, boolean z, float f, long j4, long j5, boolean z2, boolean z3, int i, List list, long j6, id5 id5Var) {
        this(j, j2, j3, z, f, j4, j5, z2, z3, i, list, j6);
    }

    public vcd(long j, long j2, long j3, boolean z, float f, long j4, long j5, boolean z2, boolean z3, int i, long j6) {
        this.f50112a = j;
        this.f50113b = j2;
        this.f50114c = j3;
        this.f50115d = z;
        this.f50116e = f;
        this.f50117f = j4;
        this.f50118g = j5;
        this.f50119h = z2;
        this.f50120i = i;
        this.f50121j = j6;
        this.f50123l = new eu3(z3, z3);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public vcd(long j, long j2, long j3, boolean z, float f, long j4, long j5, boolean z2, boolean z3, int i, List list, long j6) {
        this(j, j2, j3, z, f, j4, j5, z2, z3, i, j6, (id5) null);
        sq8.m48649h(list, "historical");
        this.f50122k = list;
    }
}
