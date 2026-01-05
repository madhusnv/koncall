package androidx.compose.material3.internal;

import c9.C0925t;
import ex.InterfaceC2141e;
import h2.C2799d;
import i1.y0;
import k1.x0;
import qw.a0;
import vw.EnumC7794a;
import w2.InterfaceC7879r;
import ww.AbstractC8199i;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: androidx.compose.material3.internal.a */
/* loaded from: classes.dex */
public abstract class AbstractC0257a {
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object m704a(ex.InterfaceC2137a r5, ex.InterfaceC2141e r6, ww.AbstractC8193c r7) {
        /*
            boolean r0 = r7 instanceof h2.C2800e
            if (r0 == 0) goto L13
            r0 = r7
            h2.e r0 = (h2.C2800e) r0
            int r1 = r0.f15695b
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f15695b = r1
            goto L18
        L13:
            h2.e r0 = new h2.e
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.f15694a
            vw.a r1 = vw.EnumC7794a.COROUTINE_SUSPENDED
            int r2 = r0.f15695b
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            og.od.m10798c(r7)     // Catch: h2.C2798c -> L43
            goto L43
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L2f:
            og.od.m10798c(r7)
            aq.i r7 = new aq.i     // Catch: h2.C2798c -> L43
            r2 = 0
            r4 = 27
            r7.<init>(r5, r6, r2, r4)     // Catch: h2.C2798c -> L43
            r0.f15695b = r3     // Catch: h2.C2798c -> L43
            java.lang.Object r5 = tx.c0.m13488k(r7, r0)     // Catch: h2.C2798c -> L43
            if (r5 != r1) goto L43
            return r1
        L43:
            qw.a0 r5 = qw.a0.f30746a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.internal.AbstractC0257a.m704a(ex.a, ex.e, ww.c):java.lang.Object");
    }

    /* renamed from: b */
    public static final Object m705b(C0925t c0925t, Object obj, float f6, AbstractC8199i abstractC8199i) throws Throwable {
        Object objM2675d = c0925t.m2675d(obj, y0.Default, new C2799d(c0925t, f6, null), abstractC8199i);
        return objM2675d == EnumC7794a.COROUTINE_SUSPENDED ? objM2675d : a0.f30746a;
    }

    /* renamed from: c */
    public static final InterfaceC7879r m706c(InterfaceC7879r interfaceC7879r, C0925t c0925t, x0 x0Var, InterfaceC2141e interfaceC2141e) {
        return interfaceC7879r.mo14852e(new DraggableAnchorsElement(c0925t, interfaceC2141e, x0Var));
    }
}
