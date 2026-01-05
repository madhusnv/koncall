package g2;

import dy.AbstractC1856d;
import dy.C1855c;
import k2.C3953b;
import ww.AbstractC8199i;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class ta {

    /* renamed from: a */
    public final C1855c f12799a = AbstractC1856d.m5490a();

    /* renamed from: b */
    public final k2.e1 f12800b = C3953b.m8517t(null);

    /* renamed from: b */
    public static Object m6312b(ta taVar, String str, la laVar, AbstractC8199i abstractC8199i) {
        taVar.getClass();
        return taVar.m6313a(new ra(str, laVar), abstractC8199i);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r8v0, types: [dy.a, g2.ra] */
    /* JADX WARN: Type inference failed for: r8v8, types: [dy.a] */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m6313a(g2.ra r8, ww.AbstractC8193c r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof g2.sa
            if (r0 == 0) goto L13
            r0 = r9
            g2.sa r0 = (g2.sa) r0
            int r1 = r0.f12717f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f12717f = r1
            goto L18
        L13:
            g2.sa r0 = new g2.sa
            r0.<init>(r7, r9)
        L18:
            java.lang.Object r9 = r0.f12715d
            vw.a r1 = vw.EnumC7794a.COROUTINE_SUSPENDED
            int r2 = r0.f12717f
            r3 = 2
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L45
            if (r2 == r4) goto L39
            if (r2 != r3) goto L31
            dy.a r8 = r0.f12714c
            g2.ta r0 = r0.f12712a
            og.od.m10798c(r9)     // Catch: java.lang.Throwable -> L2f
            goto L83
        L2f:
            r9 = move-exception
            goto L91
        L31:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L39:
            dy.a r8 = r0.f12714c
            g2.ra r2 = r0.f12713b
            g2.ta r6 = r0.f12712a
            og.od.m10798c(r9)
            r9 = r8
            r8 = r2
            goto L5a
        L45:
            og.od.m10798c(r9)
            r0.f12712a = r7
            r0.f12713b = r8
            dy.c r9 = r7.f12799a
            r0.f12714c = r9
            r0.f12717f = r4
            java.lang.Object r2 = r9.mo1768h(r0)
            if (r2 != r1) goto L59
            goto L7e
        L59:
            r6 = r7
        L5a:
            r0.f12712a = r6     // Catch: java.lang.Throwable -> L8c
            r0.f12713b = r8     // Catch: java.lang.Throwable -> L8c
            r0.f12714c = r9     // Catch: java.lang.Throwable -> L8c
            r0.f12717f = r3     // Catch: java.lang.Throwable -> L8c
            tx.k r2 = new tx.k     // Catch: java.lang.Throwable -> L8c
            uw.c r0 = pg.n6.m11797c(r0)     // Catch: java.lang.Throwable -> L8c
            r2.<init>(r4, r0)     // Catch: java.lang.Throwable -> L8c
            r2.m13540p()     // Catch: java.lang.Throwable -> L8c
            g2.qa r0 = new g2.qa     // Catch: java.lang.Throwable -> L8c
            r0.<init>(r8, r2)     // Catch: java.lang.Throwable -> L8c
            k2.e1 r8 = r6.f12800b     // Catch: java.lang.Throwable -> L8c
            r8.setValue(r0)     // Catch: java.lang.Throwable -> L8c
            java.lang.Object r8 = r2.m13539o()     // Catch: java.lang.Throwable -> L8c
            if (r8 != r1) goto L7f
        L7e:
            return r1
        L7f:
            r0 = r9
            r9 = r8
            r8 = r0
            r0 = r6
        L83:
            k2.e1 r0 = r0.f12800b     // Catch: java.lang.Throwable -> L97
            r0.setValue(r5)     // Catch: java.lang.Throwable -> L97
            r8.mo1769j(r5)
            return r9
        L8c:
            r8 = move-exception
            r0 = r9
            r9 = r8
            r8 = r0
            r0 = r6
        L91:
            k2.e1 r0 = r0.f12800b     // Catch: java.lang.Throwable -> L97
            r0.setValue(r5)     // Catch: java.lang.Throwable -> L97
            throw r9     // Catch: java.lang.Throwable -> L97
        L97:
            r9 = move-exception
            r8.mo1769j(r5)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: g2.ta.m6313a(g2.ra, ww.c):java.lang.Object");
    }
}
