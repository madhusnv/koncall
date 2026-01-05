package androidx.compose.foundation.gestures;

import k1.f1;
import k1.g1;
import k1.h1;
import k1.x0;
import m1.InterfaceC4630l;
import w2.InterfaceC7879r;
import x1.n1;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: androidx.compose.foundation.gestures.a */
/* loaded from: classes.dex */
public abstract class AbstractC0241a {

    /* renamed from: a */
    public static final g1 f1937a = new g1();

    /* renamed from: b */
    public static final f1 f1938b = new f1();

    /* renamed from: c */
    public static final h1 f1939c = new h1();

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object m645a(k1.x1 r11, long r12, ww.AbstractC8193c r14) {
        /*
            boolean r0 = r14 instanceof k1.i1
            if (r0 == 0) goto L13
            r0 = r14
            k1.i1 r0 = (k1.i1) r0
            int r1 = r0.f20131d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f20131d = r1
            goto L18
        L13:
            k1.i1 r0 = new k1.i1
            r0.<init>(r14)
        L18:
            java.lang.Object r14 = r0.f20130c
            vw.a r1 = vw.EnumC7794a.COROUTINE_SUSPENDED
            int r2 = r0.f20131d
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            kotlin.jvm.internal.w r11 = r0.f20129b
            k1.x1 r12 = r0.f20128a
            og.od.m10798c(r14)
            r8 = r11
            r11 = r12
            goto L56
        L2d:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L35:
            og.od.m10798c(r14)
            kotlin.jvm.internal.w r8 = new kotlin.jvm.internal.w
            r8.<init>()
            i1.y0 r14 = i1.y0.Default
            i1.a r4 = new i1.a
            r9 = 0
            r10 = 1
            r5 = r11
            r6 = r12
            r4.<init>(r5, r6, r8, r9, r10)
            r0.f20128a = r5
            r0.f20129b = r8
            r0.f20131d = r3
            java.lang.Object r11 = r5.m8479e(r14, r4, r0)
            if (r11 != r1) goto L55
            return r1
        L55:
            r11 = r5
        L56:
            float r12 = r8.f21161a
            long r11 = r11.m8481g(r12)
            c3.b r13 = new c3.b
            r13.<init>(r11)
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.AbstractC0241a.m645a(k1.x1, long, ww.c):java.lang.Object");
    }

    /* renamed from: b */
    public static InterfaceC7879r m646b(n1 n1Var, x0 x0Var, boolean z6, boolean z10, InterfaceC4630l interfaceC4630l) {
        return new ScrollableElement(n1Var, x0Var, z6, z10, interfaceC4630l);
    }
}
