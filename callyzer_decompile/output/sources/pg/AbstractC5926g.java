package pg;

import d6.AbstractC1614d;
import kotlin.jvm.internal.AbstractC4154l;
import p007h.C2760l;
import p008i.C3067d;
import p008i.C3068e;
import tc.C7117b;
import tc.C7122g;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: pg.g */
/* loaded from: classes.dex */
public abstract class AbstractC5926g {
    /* renamed from: a */
    public static C2760l m11639a() {
        int iM5265a = AbstractC1614d.m5265a();
        AbstractC1614d.m5265a();
        C2760l c2760l = new C2760l();
        c2760l.f15319a = C3067d.f16419a;
        AbstractC1614d.m5265a();
        c2760l.f15319a = C3068e.f16420a;
        c2760l.f15320b = iM5265a;
        return c2760l;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object m11640b(jc.AbstractC3745u r4, wc.C7985s r5, ww.AbstractC8193c r6) {
        /*
            boolean r0 = r6 instanceof tc.C7118c
            if (r0 == 0) goto L13
            r0 = r6
            tc.c r0 = (tc.C7118c) r0
            int r1 = r0.f34318d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f34318d = r1
            goto L18
        L13:
            tc.c r0 = new tc.c
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.f34317c
            vw.a r1 = vw.EnumC7794a.COROUTINE_SUSPENDED
            int r2 = r0.f34318d
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            wc.s r5 = r0.f34316b
            jc.u r4 = r0.f34315a
            og.od.m10798c(r6)
            goto L43
        L2b:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L33:
            og.od.m10798c(r6)
            r0.f34315a = r4
            r0.f34316b = r5
            r0.f34318d = r3
            java.io.Serializable r6 = pg.f8.m11621b(r4, r0)
            if (r6 != r1) goto L43
            return r1
        L43:
            byte[] r6 = (byte[]) r6
            if (r6 != 0) goto L4a
            jc.s r4 = jc.C3743s.f19596a
            return r4
        L4a:
            r0 = 0
            int r1 = r6.length
            r5.write(r6, r0, r1)
            tc.d r5 = new tc.d
            r5.<init>(r4, r6)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: pg.AbstractC5926g.m11640b(jc.u, wc.s, ww.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /* renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object m11641c(tc.C7117b r18, boolean r19, ww.AbstractC8193c r20) {
        /*
            Method dump skipped, instructions count: 445
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: pg.AbstractC5926g.m11641c(tc.b, boolean, ww.c):java.lang.Object");
    }

    /* renamed from: d */
    public static final void m11642d(C7117b c7117b, String str, String value) {
        AbstractC4154l.m8923f(c7117b, "<this>");
        AbstractC4154l.m8923f(value, "value");
        c7117b.f34312c.m336p(value, str);
    }

    /* renamed from: e */
    public static C7122g m11643e(C7117b c7117b) {
        AbstractC4154l.m8923f(c7117b, "<this>");
        return new C7122g(c7117b, false);
    }
}
