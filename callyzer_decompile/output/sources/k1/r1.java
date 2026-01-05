package k1;

import ex.InterfaceC2141e;
import p3.InterfaceC5822t;
import uw.InterfaceC7559c;
import vw.EnumC7794a;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public abstract class r1 {

    /* renamed from: a */
    public static final StackTraceElement[] f20217a = new StackTraceElement[0];

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object m8470a(k1.q1 r5, float r6, h1.InterfaceC2779j r7, ww.AbstractC8193c r8) {
        /*
            boolean r0 = r8 instanceof k1.b1
            if (r0 == 0) goto L13
            r0 = r8
            k1.b1 r0 = (k1.b1) r0
            int r1 = r0.f20028c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f20028c = r1
            goto L18
        L13:
            k1.b1 r0 = new k1.b1
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.f20027b
            vw.a r1 = vw.EnumC7794a.COROUTINE_SUSPENDED
            int r2 = r0.f20028c
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            kotlin.jvm.internal.w r5 = r0.f20026a
            og.od.m10798c(r8)
            goto L4d
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L31:
            og.od.m10798c(r8)
            kotlin.jvm.internal.w r8 = new kotlin.jvm.internal.w
            r8.<init>()
            k1.c1 r2 = new k1.c1
            r4 = 0
            r2.<init>(r6, r7, r8, r4)
            r0.f20026a = r8
            r0.f20028c = r3
            i1.y0 r6 = i1.y0.Default
            java.lang.Object r5 = r5.mo7521b(r6, r2, r0)
            if (r5 != r1) goto L4c
            return r1
        L4c:
            r5 = r8
        L4d:
            float r5 = r5.f21161a
            java.lang.Float r6 = new java.lang.Float
            r6.<init>(r5)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: k1.r1.m8470a(k1.q1, float, h1.j, ww.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x005d A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r10v4, types: [java.lang.Object, java.util.Collection, java.util.List] */
    /* JADX WARN: Type inference failed for: r10v8, types: [java.lang.Object, java.util.Collection, java.util.List] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:19:0x005b -> B:21:0x005e). Please report as a decompilation issue!!! */
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object m8471b(p3.f0 r8, p3.EnumC5813k r9, ww.AbstractC8191a r10) {
        /*
            boolean r0 = r10 instanceof k1.l0
            if (r0 == 0) goto L13
            r0 = r10
            k1.l0 r0 = (k1.l0) r0
            int r1 = r0.f20167d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f20167d = r1
            goto L18
        L13:
            k1.l0 r0 = new k1.l0
            r0.<init>(r10)
        L18:
            java.lang.Object r10 = r0.f20166c
            vw.a r1 = vw.EnumC7794a.COROUTINE_SUSPENDED
            int r2 = r0.f20167d
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L37
            if (r2 != r4) goto L2f
            p3.k r8 = r0.f20165b
            p3.f0 r9 = r0.f20164a
            og.od.m10798c(r10)
            r7 = r9
            r9 = r8
            r8 = r7
            goto L5e
        L2f:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L37:
            og.od.m10798c(r10)
            p3.h0 r10 = r8.f28444f
            p3.j r10 = r10.f28461w
            java.lang.Object r10 = r10.f28467a
            int r2 = r10.size()
            r5 = r3
        L45:
            if (r5 >= r2) goto L7a
            java.lang.Object r6 = r10.get(r5)
            p3.q r6 = (p3.C5819q) r6
            boolean r6 = r6.f28479d
            if (r6 == 0) goto L77
        L51:
            r0.f20164a = r8
            r0.f20165b = r9
            r0.f20167d = r4
            java.lang.Object r10 = r8.m11384b(r9, r0)
            if (r10 != r1) goto L5e
            return r1
        L5e:
            p3.j r10 = (p3.C5812j) r10
            java.lang.Object r10 = r10.f28467a
            int r2 = r10.size()
            r5 = r3
        L67:
            if (r5 >= r2) goto L7a
            java.lang.Object r6 = r10.get(r5)
            p3.q r6 = (p3.C5819q) r6
            boolean r6 = r6.f28479d
            if (r6 == 0) goto L74
            goto L51
        L74:
            int r5 = r5 + 1
            goto L67
        L77:
            int r5 = r5 + 1
            goto L45
        L7a:
            qw.a0 r8 = qw.a0.f30746a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: k1.r1.m8471b(p3.f0, p3.k, ww.a):java.lang.Object");
    }

    /* renamed from: c */
    public static final Object m8472c(InterfaceC5822t interfaceC5822t, InterfaceC2141e interfaceC2141e, InterfaceC7559c interfaceC7559c) {
        Object objL0 = ((p3.h0) interfaceC5822t).L0(new m0(interfaceC7559c.getContext(), interfaceC2141e, (InterfaceC7559c) null), interfaceC7559c);
        return objL0 == EnumC7794a.COROUTINE_SUSPENDED ? objL0 : qw.a0.f30746a;
    }
}
