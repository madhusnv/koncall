package p001o;

import p001o.inb;

/* loaded from: classes2.dex */
public final class qt3 extends pt3 implements cbf {

    /* renamed from: h */
    public final int f42379h;

    /* renamed from: i */
    public final long f42380i;

    public qt3(long j, long j2, inb.C14334a c14334a, boolean z) {
        this(j, j2, c14334a.f28968f, c14334a.f28965c, z);
    }

    @Override // p001o.cbf
    /* renamed from: b */
    public long mo20725b(long j) {
        return m44138c(j);
    }

    @Override // p001o.cbf
    /* renamed from: g */
    public long mo20726g() {
        return this.f42380i;
    }

    @Override // p001o.cbf
    /* renamed from: j */
    public int mo20727j() {
        return this.f42379h;
    }

    public qt3(long j, long j2, int i, int i2, boolean z) {
        super(j, j2, i, i2, z);
        this.f42379h = i;
        this.f42380i = j == -1 ? -1L : j;
    }
}
