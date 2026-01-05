package l1;

import com.skydoves.balloon.internals.DefinitionKt;
import ex.InterfaceC2139c;
import h1.C2778i;
import java.util.concurrent.CancellationException;
import k1.d1;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: l1.l */
/* loaded from: classes.dex */
public abstract class AbstractC4323l {

    /* renamed from: a */
    public static final float f21783a = 400;

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object m9041a(k1.d1 r10, float r11, h1.C2780k r12, h1.C2790u r13, ex.InterfaceC2139c r14, ww.AbstractC8193c r15) {
        /*
            boolean r0 = r15 instanceof l1.C4320i
            if (r0 == 0) goto L13
            r0 = r15
            l1.i r0 = (l1.C4320i) r0
            int r1 = r0.f21771e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f21771e = r1
            goto L18
        L13:
            l1.i r0 = new l1.i
            r0.<init>(r15)
        L18:
            java.lang.Object r15 = r0.f21770d
            vw.a r1 = vw.EnumC7794a.COROUTINE_SUSPENDED
            int r2 = r0.f21771e
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            float r11 = r0.f21767a
            kotlin.jvm.internal.w r10 = r0.f21769c
            h1.k r12 = r0.f21768b
            og.od.m10798c(r15)
            goto L6a
        L2d:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L35:
            og.od.m10798c(r15)
            kotlin.jvm.internal.w r6 = new kotlin.jvm.internal.w
            r6.<init>()
            java.lang.Object r15 = r12.m6828b()
            java.lang.Number r15 = (java.lang.Number) r15
            float r15 = r15.floatValue()
            r2 = 0
            int r15 = (r15 > r2 ? 1 : (r15 == r2 ? 0 : -1))
            if (r15 != 0) goto L4e
            r15 = r3
            goto L4f
        L4e:
            r15 = 0
        L4f:
            r15 = r15 ^ r3
            l1.j r4 = new l1.j
            r9 = 0
            r7 = r10
            r5 = r11
            r8 = r14
            r4.<init>(r5, r6, r7, r8, r9)
            r0.f21768b = r12
            r0.f21769c = r6
            r0.f21767a = r5
            r0.f21771e = r3
            java.lang.Object r10 = h1.AbstractC2773d.m6783f(r12, r13, r15, r4, r0)
            if (r10 != r1) goto L68
            return r1
        L68:
            r11 = r5
            r10 = r6
        L6a:
            l1.a r13 = new l1.a
            float r10 = r10.f21161a
            float r11 = r11 - r10
            java.lang.Float r10 = new java.lang.Float
            r10.<init>(r11)
            r13.<init>(r10, r12)
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: l1.AbstractC4323l.m9041a(k1.d1, float, h1.k, h1.u, ex.c, ww.c):java.lang.Object");
    }

    /* renamed from: b */
    public static final void m9042b(C2778i c2778i, d1 d1Var, InterfaceC2139c interfaceC2139c, float f6) {
        float fMo8445a;
        try {
            fMo8445a = d1Var.mo8445a(f6);
        } catch (CancellationException unused) {
            c2778i.m6826a();
            fMo8445a = DefinitionKt.NO_Float_VALUE;
        }
        interfaceC2139c.invoke(Float.valueOf(fMo8445a));
        if (Math.abs(f6 - fMo8445a) > 0.5f) {
            c2778i.m6826a();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0018  */
    /* renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object m9043c(k1.d1 r16, float r17, float r18, h1.C2780k r19, h1.a1 r20, ex.InterfaceC2139c r21, ww.AbstractC8193c r22) {
        /*
            r0 = r17
            r1 = r22
            boolean r2 = r1 instanceof l1.C4322k
            if (r2 == 0) goto L18
            r2 = r1
            l1.k r2 = (l1.C4322k) r2
            int r3 = r2.f21782f
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L18
            int r3 = r3 - r4
            r2.f21782f = r3
        L16:
            r8 = r2
            goto L1e
        L18:
            l1.k r2 = new l1.k
            r2.<init>(r1)
            goto L16
        L1e:
            java.lang.Object r1 = r8.f21781e
            vw.a r2 = vw.EnumC7794a.COROUTINE_SUSPENDED
            int r3 = r8.f21782f
            r9 = 0
            r4 = 1
            if (r3 == 0) goto L40
            if (r3 != r4) goto L38
            float r0 = r8.f21778b
            float r2 = r8.f21777a
            kotlin.jvm.internal.w r3 = r8.f21780d
            h1.k r4 = r8.f21779c
            og.od.m10798c(r1)
            r1 = r0
            r0 = r2
            goto L91
        L38:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L40:
            og.od.m10798c(r1)
            kotlin.jvm.internal.w r12 = new kotlin.jvm.internal.w
            r12.<init>()
            java.lang.Object r1 = r19.m6828b()
            java.lang.Number r1 = (java.lang.Number) r1
            float r1 = r1.floatValue()
            java.lang.Float r3 = new java.lang.Float
            r3.<init>(r0)
            java.lang.Object r5 = r19.m6828b()
            java.lang.Number r5 = (java.lang.Number) r5
            float r5 = r5.floatValue()
            int r5 = (r5 > r9 ? 1 : (r5 == r9 ? 0 : -1))
            if (r5 != 0) goto L67
            r5 = r4
            goto L68
        L67:
            r5 = 0
        L68:
            r6 = r5 ^ 1
            l1.j r10 = new l1.j
            r15 = 1
            r13 = r16
            r11 = r18
            r14 = r21
            r10.<init>(r11, r12, r13, r14, r15)
            r5 = r3
            r3 = r19
            r8.f21779c = r3
            r8.f21780d = r12
            r8.f21777a = r0
            r8.f21778b = r1
            r8.f21782f = r4
            r4 = r5
            r7 = r10
            r5 = r20
            java.lang.Object r4 = h1.AbstractC2773d.m6785h(r3, r4, r5, r6, r7, r8)
            if (r4 != r2) goto L8e
            return r2
        L8e:
            r4 = r19
            r3 = r12
        L91:
            java.lang.Object r2 = r4.m6828b()
            java.lang.Number r2 = (java.lang.Number) r2
            float r2 = r2.floatValue()
            float r1 = m9044d(r2, r1)
            l1.a r2 = new l1.a
            float r3 = r3.f21161a
            float r0 = r0 - r3
            java.lang.Float r3 = new java.lang.Float
            r3.<init>(r0)
            r0 = 29
            h1.k r0 = h1.AbstractC2773d.m6789l(r4, r9, r1, r0)
            r2.<init>(r3, r0)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: l1.AbstractC4323l.m9043c(k1.d1, float, float, h1.k, h1.a1, ex.c, ww.c):java.lang.Object");
    }

    /* renamed from: d */
    public static final float m9044d(float f6, float f10) {
        return f10 == DefinitionKt.NO_Float_VALUE ? DefinitionKt.NO_Float_VALUE : (f10 <= DefinitionKt.NO_Float_VALUE ? f6 >= f10 : f6 <= f10) ? f6 : f10;
    }
}
