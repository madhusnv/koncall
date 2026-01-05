package ug;

import sf.AbstractC6840z;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class g4 {

    /* renamed from: a */
    public final h4 f35455a;

    /* renamed from: b */
    public int f35456b = 1;

    /* renamed from: c */
    public long f35457c = m13935a();

    public g4(h4 h4Var) {
        this.f35455a = h4Var;
    }

    /* renamed from: a */
    public final long m13935a() {
        h4 h4Var = this.f35455a;
        AbstractC6840z.m13036g(h4Var);
        long jLongValue = ((Long) f0.f35427v.m13872a(null)).longValue();
        long jLongValue2 = ((Long) f0.f35428w.m13872a(null)).longValue();
        for (int i10 = 1; i10 < this.f35456b; i10++) {
            jLongValue += jLongValue;
            if (jLongValue >= jLongValue2) {
                break;
            }
        }
        h4Var.mo334l().getClass();
        return Math.min(jLongValue, jLongValue2) + System.currentTimeMillis();
    }
}
