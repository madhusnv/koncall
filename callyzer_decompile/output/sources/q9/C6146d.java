package q9;

import ea.C1971a;
import l4.C4367l;
import og.rd;
import pg.v9;
import vb.C7696c;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: q9.d */
/* loaded from: classes.dex */
public final class C6146d extends rd {

    /* renamed from: a */
    public static final /* synthetic */ C6146d f29961a = new C6146d();

    @Override // og.rd
    /* renamed from: d */
    public final v9 mo8827d() {
        return new C6144b();
    }

    @Override // og.rd
    /* renamed from: e */
    public final void mo8828e(v9 v9Var) {
        ((C6144b) v9Var).f29954b.f29969h.add(0, new C7696c());
    }

    @Override // og.rd
    /* renamed from: f */
    public final /* bridge */ /* synthetic */ Object mo8829f(v9 v9Var, C4367l c4367l, C4367l c4367l2, C1971a c1971a) {
        return m12191h((C6144b) v9Var, c4367l, c1971a);
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
    public final java.lang.Object m12191h(q9.C6144b r7, l4.C4367l r8, ww.AbstractC8193c r9) {
        /*
            r6 = this;
            boolean r0 = r9 instanceof q9.C6145c
            if (r0 == 0) goto L13
            r0 = r9
            q9.c r0 = (q9.C6145c) r0
            int r1 = r0.f29960f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f29960f = r1
            goto L18
        L13:
            q9.c r0 = new q9.c
            r0.<init>(r6, r9)
        L18:
            java.lang.Object r9 = r0.f29958d
            vw.a r1 = vw.EnumC7794a.COROUTINE_SUSPENDED
            int r2 = r0.f29960f
            qw.a0 r3 = qw.a0.f30746a
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L3e
            if (r2 == r5) goto L36
            if (r2 != r4) goto L2e
            q9.e r7 = r0.f29957c
            og.od.m10798c(r9)
            goto L66
        L2e:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L36:
            l4.l r8 = r0.f29956b
            q9.b r7 = r0.f29955a
            og.od.m10798c(r9)
            goto L4a
        L3e:
            og.od.m10798c(r9)
            r0.f29955a = r7
            r0.f29956b = r8
            r0.f29960f = r5
            if (r3 != r1) goto L4a
            goto L65
        L4a:
            q9.e r7 = r7.f29954b
            ad.p r9 = r7.f29968g
            if (r9 != 0) goto L68
            r9 = 0
            r0.f29955a = r9
            r0.f29956b = r9
            r0.f29957c = r7
            r0.f29960f = r4
            java.lang.String r9 = "SsoOidc"
            java.lang.String r2 = "SSO_OIDC"
            java.lang.String r4 = "sso_oidc"
            java.lang.Object r9 = pg.AbstractC5930k.m11727b(r8, r9, r2, r4, r0)
            if (r9 != r1) goto L66
        L65:
            return r1
        L66:
            ad.p r9 = (ad.C0109p) r9
        L68:
            r7.f29968g = r9
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: q9.C6146d.m12191h(q9.b, l4.l, ww.c):java.lang.Object");
    }
}
