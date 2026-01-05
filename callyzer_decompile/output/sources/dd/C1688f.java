package dd;

import gx.AbstractC2747a;
import og.bb;
import og.db;
import ox.AbstractC5773d;
import ox.C5770a;
import ox.C5774e;
import ox.EnumC5772c;
import pg.AbstractC5939t;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: dd.f */
/* loaded from: classes.dex */
public final class C1688f {

    /* renamed from: a */
    public final C1684b f8260a;

    /* renamed from: b */
    public C5774e f8261b;

    /* renamed from: c */
    public double f8262c;

    /* renamed from: d */
    public int f8263d;

    /* renamed from: e */
    public final double f8264e;

    public C1688f(C1684b c1684b) {
        C5774e c5774e = new C5774e(AbstractC5773d.m11305c());
        this.f8260a = c1684b;
        this.f8261b = c5774e;
        this.f8262c = 0.0d;
        this.f8263d = 0;
        this.f8264e = 1 / C5770a.m11301l(c1684b.f8234a, EnumC5772c.SECONDS);
    }

    /* renamed from: a */
    public final double m5387a() {
        long jM10550f;
        this.f8263d++;
        long jM11306a = C5774e.m11306a(this.f8261b.f28340a);
        C1684b c1684b = this.f8260a;
        long j6 = c1684b.f8234a;
        EnumC5772c enumC5772c = (EnumC5772c) AbstractC5939t.m11867b(C5770a.m11296g(jM11306a), C5770a.m11296g(j6));
        double dFloor = Math.floor(C5770a.m11301l(jM11306a, enumC5772c) / C5770a.m11301l(j6, enumC5772c));
        if (dFloor >= 1.0d) {
            double d2 = (this.f8263d / dFloor) * this.f8264e;
            double d10 = c1684b.f8238e;
            this.f8262c = ((1 - d10) * this.f8262c) + (d2 * d10);
            C5774e c5774e = this.f8261b;
            long j10 = c1684b.f8234a;
            int iM6746j = AbstractC2747a.m6746j(dFloor);
            if (iM6746j == dFloor) {
                jM10550f = C5770a.m11300k(iM6746j, j10);
            } else {
                EnumC5772c enumC5772cM11296g = C5770a.m11296g(j10);
                jM10550f = bb.m10550f(C5770a.m11301l(j10, enumC5772cM11296g) * dFloor, enumC5772cM11296g);
            }
            long j11 = c5774e.f28340a;
            int i10 = AbstractC5773d.f28339b;
            this.f8261b = new C5774e(db.m10606b(j11, jM10550f, EnumC5772c.NANOSECONDS));
            this.f8263d = 0;
        }
        return this.f8262c;
    }
}
