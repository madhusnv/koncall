package ug;

import sf.AbstractC6840z;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class p1 implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ int f35752a;

    /* renamed from: b */
    public final /* synthetic */ n4 f35753b;

    /* renamed from: c */
    public final /* synthetic */ s1 f35754c;

    public /* synthetic */ p1(s1 s1Var, n4 n4Var, int i10) {
        this.f35752a = i10;
        this.f35753b = n4Var;
        this.f35754c = s1Var;
    }

    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        switch (this.f35752a) {
            case 0:
                s1 s1Var = this.f35754c;
                s1Var.f35819e.m13947B();
                h4 h4Var = s1Var.f35819e;
                h4Var.mo327b().mo325M();
                h4Var.l0();
                n4 n4Var = this.f35753b;
                AbstractC6840z.m13036g(n4Var);
                String str = n4Var.f35697a;
                AbstractC6840z.m13033d(str);
                int i10 = 0;
                if (h4Var.e0().m13889W(null, f0.f44834z0)) {
                    h4Var.mo334l().getClass();
                    long jCurrentTimeMillis = System.currentTimeMillis();
                    int iM13887U = h4Var.e0().m13887U(null, f0.f44814i0);
                    h4Var.e0();
                    long jLongValue = jCurrentTimeMillis - ((Long) f0.f35410e.m13872a(null)).longValue();
                    while (i10 < iM13887U && h4Var.m13951I(null, jLongValue)) {
                        i10++;
                    }
                } else {
                    h4Var.e0();
                    long jIntValue = ((Integer) f0.f35417l.m13872a(null)).intValue();
                    while (i10 < jIntValue && h4Var.m13951I(str, 0L)) {
                        i10++;
                    }
                }
                if (h4Var.e0().m13889W(null, f0.A0)) {
                    h4Var.mo327b().mo325M();
                    h4Var.m13950H();
                }
                e4 e4Var = h4Var.f35495k;
                com.google.android.gms.internal.measurement.r3 r3VarZzb = com.google.android.gms.internal.measurement.r3.zzb(n4Var.f35696I);
                e4Var.mo325M();
                if (r3VarZzb == com.google.android.gms.internal.measurement.r3.CLIENT_UPLOAD_ELIGIBLE && !e4.m13874P(str)) {
                    i1 i1Var = e4Var.f35959b.f35486a;
                    h4.m13944U(i1Var);
                    com.google.android.gms.internal.measurement.g2 g2VarM13993Y = i1Var.m13993Y(str);
                    if (g2VarM13993Y != null && g2VarM13993Y.m3275D() && !g2VarM13993Y.m3276E().m3487q().isEmpty()) {
                        h4Var.mo326a().f35870p.m14141b(str, "[sgtm] Going background, trigger client side upload. appId");
                        h4Var.mo334l().getClass();
                        h4Var.m13976r(str, System.currentTimeMillis());
                        break;
                    }
                }
                break;
            case 1:
                s1 s1Var2 = this.f35754c;
                s1Var2.f35819e.m13947B();
                h4 h4Var2 = s1Var2.f35819e;
                h4Var2.mo327b().mo325M();
                h4Var2.l0();
                n4 n4Var2 = this.f35753b;
                AbstractC6840z.m13033d(n4Var2.f35697a);
                h4Var2.c0(n4Var2);
                break;
            case 2:
                s1 s1Var3 = this.f35754c;
                s1Var3.f35819e.m13947B();
                h4 h4Var3 = s1Var3.f35819e;
                h4Var3.mo327b().mo325M();
                h4Var3.l0();
                n4 n4Var3 = this.f35753b;
                AbstractC6840z.m13033d(n4Var3.f35697a);
                h4Var3.m0(n4Var3);
                h4Var3.n0(n4Var3);
                break;
            default:
                h4 h4Var4 = this.f35754c.f35819e;
                h4Var4.m13947B();
                h4Var4.m0(this.f35753b);
                break;
        }
    }
}
