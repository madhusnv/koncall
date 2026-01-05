package fk;

import a3.C0045d;
import ex.InterfaceC2137a;
import l1.C4327p;
import nu.C5142c;
import o6.C5321w;
import og.pe;
import rw.C6668r;
import uw.InterfaceC7559c;
import yx.C8810d;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: fk.q */
/* loaded from: classes.dex */
public final class C2311q {
    /* renamed from: b */
    public static C5321w m5982b(o6.w0 w0Var, C4327p c4327p, C8810d c8810d, InterfaceC2137a interfaceC2137a) {
        C6668r c6668r = C6668r.f31943a;
        InterfaceC7559c interfaceC7559c = null;
        try {
            System.loadLibrary("datastore_shared_counter");
            return new C5321w(new o6.c0(w0Var, new C0045d(25, c8810d), interfaceC2137a), pe.m10833h(new C5142c(c6668r, interfaceC7559c, 1)), c4327p, c8810d);
        } catch (SecurityException | UnsatisfiedLinkError unused) {
            return new C5321w(new o6.c0(w0Var, o6.a0.f26001a, interfaceC2137a), pe.m10833h(new C5142c(c6668r, interfaceC7559c, 1)), c4327p, c8810d);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x007b, code lost:
    
        if (r9 == r1) goto L32;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r8v0, types: [rj.d] */
    /* JADX WARN: Type inference failed for: r8v1 */
    /* JADX WARN: Type inference failed for: r8v11 */
    /* JADX WARN: Type inference failed for: r8v12 */
    /* JADX WARN: Type inference failed for: r8v19 */
    /* JADX WARN: Type inference failed for: r8v2 */
    /* JADX WARN: Type inference failed for: r8v20 */
    /* JADX WARN: Type inference failed for: r8v21 */
    /* JADX WARN: Type inference failed for: r8v3 */
    /* JADX WARN: Type inference failed for: r8v6, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r8v7 */
    /* JADX WARN: Type inference failed for: r8v9 */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object m5983a(rj.InterfaceC6558d r8, ww.AbstractC8193c r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof fk.C2319y
            if (r0 == 0) goto L13
            r0 = r9
            fk.y r0 = (fk.C2319y) r0
            int r1 = r0.f10522d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f10522d = r1
            goto L18
        L13:
            fk.y r0 = new fk.y
            r0.<init>(r7, r9)
        L18:
            java.lang.Object r9 = r0.f10520b
            vw.a r1 = vw.EnumC7794a.COROUTINE_SUSPENDED
            int r2 = r0.f10522d
            r3 = 2
            r4 = 1
            java.lang.String r5 = ""
            if (r2 == 0) goto L40
            if (r2 == r4) goto L38
            if (r2 != r3) goto L30
            java.lang.Object r8 = r0.f10519a
            java.lang.String r8 = (java.lang.String) r8
            og.od.m10798c(r9)     // Catch: java.lang.Exception -> L84
            goto L7e
        L30:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L38:
            java.lang.Object r8 = r0.f10519a
            rj.d r8 = (rj.InterfaceC6558d) r8
            og.od.m10798c(r9)     // Catch: java.lang.Exception -> L66
            goto L5d
        L40:
            og.od.m10798c(r9)
            r9 = r8
            com.google.firebase.installations.a r9 = (com.google.firebase.installations.C1401a) r9     // Catch: java.lang.Exception -> L66
            yg.m r8 = r9.m4472d()     // Catch: java.lang.Exception -> L66
            java.lang.String r2 = "getToken(...)"
            kotlin.jvm.internal.AbstractC4154l.m8922e(r8, r2)     // Catch: java.lang.Exception -> L65
            r0.f10519a = r9     // Catch: java.lang.Exception -> L65
            r0.f10522d = r4     // Catch: java.lang.Exception -> L65
            java.lang.Object r8 = og.he.m10686c(r8, r0)     // Catch: java.lang.Exception -> L65
            if (r8 != r1) goto L5a
            goto L7d
        L5a:
            r6 = r9
            r9 = r8
            r8 = r6
        L5d:
            rj.a r9 = (rj.C6555a) r9     // Catch: java.lang.Exception -> L66
            java.lang.String r9 = r9.f31407a     // Catch: java.lang.Exception -> L66
            r6 = r9
            r9 = r8
            r8 = r6
            goto L68
        L65:
            r8 = r9
        L66:
            r9 = r8
            r8 = r5
        L68:
            com.google.firebase.installations.a r9 = (com.google.firebase.installations.C1401a) r9     // Catch: java.lang.Exception -> L84
            yg.m r9 = r9.m4471c()     // Catch: java.lang.Exception -> L84
            java.lang.String r2 = "getId(...)"
            kotlin.jvm.internal.AbstractC4154l.m8922e(r9, r2)     // Catch: java.lang.Exception -> L84
            r0.f10519a = r8     // Catch: java.lang.Exception -> L84
            r0.f10522d = r3     // Catch: java.lang.Exception -> L84
            java.lang.Object r9 = og.he.m10686c(r9, r0)     // Catch: java.lang.Exception -> L84
            if (r9 != r1) goto L7e
        L7d:
            return r1
        L7e:
            java.lang.String r9 = (java.lang.String) r9     // Catch: java.lang.Exception -> L84
            if (r9 != 0) goto L83
            goto L84
        L83:
            r5 = r9
        L84:
            fk.z r9 = new fk.z
            r9.<init>(r5, r8)
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: fk.C2311q.m5983a(rj.d, ww.c):java.lang.Object");
    }
}
