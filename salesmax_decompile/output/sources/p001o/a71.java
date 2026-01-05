package p001o;

/* loaded from: classes2.dex */
public final class a71 implements x61 {

    /* renamed from: a */
    public final int f14226a;

    /* renamed from: b */
    public final int f14227b;

    /* renamed from: c */
    public final int f14228c;

    /* renamed from: d */
    public final int f14229d;

    /* renamed from: e */
    public final int f14230e;

    /* renamed from: f */
    public final int f14231f;

    public a71(int i, int i2, int i3, int i4, int i5, int i6) {
        this.f14226a = i;
        this.f14227b = i2;
        this.f14228c = i3;
        this.f14229d = i4;
        this.f14230e = i5;
        this.f14231f = i6;
    }

    /* renamed from: c */
    public static a71 m16532c(zwc zwcVar) {
        int iM60040u = zwcVar.m60040u();
        zwcVar.m60018V(12);
        int iM60040u2 = zwcVar.m60040u();
        int iM60040u3 = zwcVar.m60040u();
        int iM60040u4 = zwcVar.m60040u();
        zwcVar.m60018V(4);
        int iM60040u5 = zwcVar.m60040u();
        int iM60040u6 = zwcVar.m60040u();
        zwcVar.m60018V(8);
        return new a71(iM60040u, iM60040u2, iM60040u3, iM60040u4, iM60040u5, iM60040u6);
    }

    /* renamed from: a */
    public long m16533a() {
        return sqi.a1(this.f14230e, this.f14228c * 1000000, this.f14229d);
    }

    /* renamed from: b */
    public int m16534b() {
        int i = this.f14226a;
        if (i == 1935960438) {
            return 2;
        }
        if (i == 1935963489) {
            return 1;
        }
        if (i == 1937012852) {
            return 3;
        }
        ria.m46824h("AviStreamHeaderChunk", "Found unsupported streamType fourCC: " + Integer.toHexString(this.f14226a));
        return -1;
    }

    @Override // p001o.x61
    public int getType() {
        return 1752331379;
    }
}
