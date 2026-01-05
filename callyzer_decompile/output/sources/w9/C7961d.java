package w9;

import ea.C1971a;
import l4.C4367l;
import og.rd;
import pg.v9;
import vb.C7696c;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: w9.d */
/* loaded from: classes.dex */
public final class C7961d extends rd {

    /* renamed from: a */
    public static final /* synthetic */ C7961d f38293a = new C7961d();

    @Override // og.rd
    /* renamed from: d */
    public final v9 mo8827d() {
        return new C7959b();
    }

    @Override // og.rd
    /* renamed from: e */
    public final void mo8828e(v9 v9Var) {
        ((C7959b) v9Var).f38286b.f38302j.add(0, new C7696c());
    }

    @Override // og.rd
    /* renamed from: f */
    public final /* bridge */ /* synthetic */ Object mo8829f(v9 v9Var, C4367l c4367l, C4367l c4367l2, C1971a c1971a) {
        return m15141h((C7959b) v9Var, c4367l, c1971a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0063, code lost:
    
        if (r9 == r1) goto L23;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* renamed from: h */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m15141h(w9.C7959b r7, l4.C4367l r8, ww.AbstractC8193c r9) {
        /*
            r6 = this;
            boolean r0 = r9 instanceof w9.C7960c
            if (r0 == 0) goto L13
            r0 = r9
            w9.c r0 = (w9.C7960c) r0
            int r1 = r0.f38292f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f38292f = r1
            goto L18
        L13:
            w9.c r0 = new w9.c
            r0.<init>(r6, r9)
        L18:
            java.lang.Object r9 = r0.f38290d
            vw.a r1 = vw.EnumC7794a.COROUTINE_SUSPENDED
            int r2 = r0.f38292f
            qw.a0 r3 = qw.a0.f30746a
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L3e
            if (r2 == r5) goto L36
            if (r2 != r4) goto L2e
            w9.e r7 = r0.f38289c
            og.od.m10798c(r9)
            goto L66
        L2e:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L36:
            l4.l r8 = r0.f38288b
            w9.b r7 = r0.f38287a
            og.od.m10798c(r9)
            goto L4a
        L3e:
            og.od.m10798c(r9)
            r0.f38287a = r7
            r0.f38288b = r8
            r0.f38292f = r5
            if (r3 != r1) goto L4a
            goto L65
        L4a:
            w9.e r7 = r7.f38286b
            ad.p r9 = r7.f38301h
            if (r9 != 0) goto L68
            r9 = 0
            r0.f38287a = r9
            r0.f38288b = r9
            r0.f38289c = r7
            r0.f38292f = r4
            java.lang.String r9 = "Sts"
            java.lang.String r2 = "STS"
            java.lang.String r4 = "sts"
            java.lang.Object r9 = pg.AbstractC5930k.m11727b(r8, r9, r2, r4, r0)
            if (r9 != r1) goto L66
        L65:
            return r1
        L66:
            ad.p r9 = (ad.C0109p) r9
        L68:
            r7.f38301h = r9
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: w9.C7961d.m15141h(w9.b, l4.l, ww.c):java.lang.Object");
    }
}
