package au;

import ab.C0084b;
import d7.w0;
import io.C3328c;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.AbstractC4154l;
import rw.C6668r;
import tx.c0;
import wx.c1;
import wx.m1;
import yx.C8810d;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: au.n */
/* loaded from: classes3.dex */
public final class C0450n extends w0 {

    /* renamed from: b */
    public final C3328c f3248b;

    /* renamed from: c */
    public final m1 f3249c;

    /* renamed from: d */
    public final m1 f3250d;

    public C0450n(C3328c c3328c, C8810d c8810d) {
        this.f3248b = c3328c;
        m1 m1VarM15372c = c1.m15372c(new C0454r(C6668r.f31943a, null, EnumC0455s.DUAL_SIM));
        this.f3249c = m1VarM15372c;
        this.f3250d = m1VarM15372c;
        c0.m13502y(c8810d, null, null, new C0084b(this, null, 3), 3);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* renamed from: e */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object m1457e(au.C0450n r5, ww.AbstractC8193c r6) {
        /*
            boolean r0 = r6 instanceof au.C0449m
            if (r0 == 0) goto L13
            r0 = r6
            au.m r0 = (au.C0449m) r0
            int r1 = r0.f3247c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f3247c = r1
            goto L18
        L13:
            au.m r0 = new au.m
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.f3245a
            vw.a r1 = vw.EnumC7794a.COROUTINE_SUSPENDED
            int r2 = r0.f3247c
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            og.od.m10798c(r6)
            goto L41
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L2f:
            og.od.m10798c(r6)
            io.c r6 = r5.f3248b
            r0.f3247c = r3
            java.lang.Object r6 = r6.f17610b
            xm.y5 r6 = (xm.y5) r6
            java.lang.Object r6 = r6.m15696l(r0)
            if (r6 != r1) goto L41
            return r1
        L41:
            java.util.List r6 = (java.util.List) r6
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.Iterator r6 = r6.iterator()
        L4c:
            boolean r1 = r6.hasNext()
            if (r1 == 0) goto L64
            java.lang.Object r1 = r6.next()
            mm.m r1 = (mm.C4802m) r1
            sv.c r2 = new sv.c
            boolean r3 = r1.f23898j
            r4 = 0
            r2.<init>(r1, r3, r4)
            r0.add(r2)
            goto L4c
        L64:
            wx.m1 r5 = r5.f3249c
        L66:
            java.lang.Object r6 = r5.getValue()
            r1 = r6
            au.r r1 = (au.C0454r) r1
            r2 = 14
            r3 = 0
            au.r r1 = au.C0454r.m1459a(r1, r0, r3, r3, r2)
            boolean r6 = r5.m15397i(r6, r1)
            if (r6 == 0) goto L66
            qw.a0 r5 = qw.a0.f30746a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: au.C0450n.m1457e(au.n, ww.c):java.lang.Object");
    }

    /* renamed from: f */
    public final void m1458f(AbstractC0453q event) {
        Object value;
        Object value2;
        AbstractC4154l.m8923f(event, "event");
        boolean z6 = event instanceof C0452p;
        m1 m1Var = this.f3249c;
        if (z6) {
            do {
                value2 = m1Var.getValue();
            } while (!m1Var.m15397i(value2, C0454r.m1459a((C0454r) value2, null, ((C0452p) event).f3252a, EnumC0455s.REGISTRATION, 3)));
        } else {
            if (!(event instanceof C0451o)) {
                throw new NoWhenBranchMatchedException();
            }
            do {
                value = m1Var.getValue();
            } while (!m1Var.m15397i(value, C0454r.m1459a((C0454r) value, null, null, ((C0451o) event).f3251a, 7)));
        }
    }
}
