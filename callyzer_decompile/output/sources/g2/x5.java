package g2;

import h1.C2772c;
import m1.InterfaceC4628j;
import s4.C6750f;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class x5 {

    /* renamed from: a */
    public float f13214a;

    /* renamed from: b */
    public float f13215b;

    /* renamed from: c */
    public float f13216c;

    /* renamed from: d */
    public float f13217d;

    /* renamed from: e */
    public final C2772c f13218e;

    /* renamed from: f */
    public InterfaceC4628j f13219f;

    /* renamed from: g */
    public InterfaceC4628j f13220g;

    public x5(float f6, float f10, float f11, float f12) {
        this.f13214a = f6;
        this.f13215b = f10;
        this.f13216c = f11;
        this.f13217d = f12;
        this.f13218e = new C2772c(new C6750f(f6), h1.y1.f15666c, null, 12);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m6338a(m1.InterfaceC4628j r6, ww.AbstractC8193c r7) throws java.lang.Throwable {
        /*
            r5 = this;
            h1.c r0 = r5.f13218e
            boolean r1 = r7 instanceof g2.v5
            if (r1 == 0) goto L15
            r1 = r7
            g2.v5 r1 = (g2.v5) r1
            int r2 = r1.f12991e
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L15
            int r2 = r2 - r3
            r1.f12991e = r2
            goto L1a
        L15:
            g2.v5 r1 = new g2.v5
            r1.<init>(r5, r7)
        L1a:
            java.lang.Object r7 = r1.f12989c
            vw.a r2 = vw.EnumC7794a.COROUTINE_SUSPENDED
            int r3 = r1.f12991e
            r4 = 1
            if (r3 == 0) goto L37
            if (r3 != r4) goto L2f
            m1.j r6 = r1.f12988b
            g2.x5 r0 = r1.f12987a
            og.od.m10798c(r7)     // Catch: java.lang.Throwable -> L2d
            goto L76
        L2d:
            r7 = move-exception
            goto L7b
        L2f:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L37:
            og.od.m10798c(r7)
            boolean r7 = r6 instanceof m1.C4633o
            if (r7 == 0) goto L41
            float r7 = r5.f13215b
            goto L51
        L41:
            boolean r7 = r6 instanceof m1.C4626h
            if (r7 == 0) goto L48
            float r7 = r5.f13216c
            goto L51
        L48:
            boolean r7 = r6 instanceof m1.C4622d
            if (r7 == 0) goto L4f
            float r7 = r5.f13217d
            goto L51
        L4f:
            float r7 = r5.f13214a
        L51:
            r5.f13220g = r6
            k2.e1 r3 = r0.f15362e     // Catch: java.lang.Throwable -> L72
            java.lang.Object r3 = r3.getValue()     // Catch: java.lang.Throwable -> L72
            s4.f r3 = (s4.C6750f) r3     // Catch: java.lang.Throwable -> L72
            float r3 = r3.f32201a     // Catch: java.lang.Throwable -> L72
            boolean r3 = s4.C6750f.m12935a(r3, r7)     // Catch: java.lang.Throwable -> L72
            if (r3 != 0) goto L75
            m1.j r3 = r5.f13219f     // Catch: java.lang.Throwable -> L72
            r1.f12987a = r5     // Catch: java.lang.Throwable -> L72
            r1.f12988b = r6     // Catch: java.lang.Throwable -> L72
            r1.f12991e = r4     // Catch: java.lang.Throwable -> L72
            java.lang.Object r7 = h2.AbstractC2816u.m6923a(r0, r7, r3, r6, r1)     // Catch: java.lang.Throwable -> L72
            if (r7 != r2) goto L75
            return r2
        L72:
            r7 = move-exception
            r0 = r5
            goto L7b
        L75:
            r0 = r5
        L76:
            r0.f13219f = r6
            qw.a0 r6 = qw.a0.f30746a
            return r6
        L7b:
            r0.f13219f = r6
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: g2.x5.m6338a(m1.j, ww.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m6339b(ww.AbstractC8193c r6) throws java.lang.Throwable {
        /*
            r5 = this;
            boolean r0 = r6 instanceof g2.w5
            if (r0 == 0) goto L13
            r0 = r6
            g2.w5 r0 = (g2.w5) r0
            int r1 = r0.f13115d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f13115d = r1
            goto L18
        L13:
            g2.w5 r0 = new g2.w5
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.f13113b
            vw.a r1 = vw.EnumC7794a.COROUTINE_SUSPENDED
            int r2 = r0.f13115d
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            g2.x5 r0 = r0.f13112a
            og.od.m10798c(r6)     // Catch: java.lang.Throwable -> L29
            goto L72
        L29:
            r6 = move-exception
            goto L79
        L2b:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L33:
            og.od.m10798c(r6)
            m1.j r6 = r5.f13220g
            boolean r2 = r6 instanceof m1.C4633o
            if (r2 == 0) goto L3f
            float r6 = r5.f13215b
            goto L4f
        L3f:
            boolean r2 = r6 instanceof m1.C4626h
            if (r2 == 0) goto L46
            float r6 = r5.f13216c
            goto L4f
        L46:
            boolean r6 = r6 instanceof m1.C4622d
            if (r6 == 0) goto L4d
            float r6 = r5.f13217d
            goto L4f
        L4d:
            float r6 = r5.f13214a
        L4f:
            h1.c r2 = r5.f13218e
            k2.e1 r4 = r2.f15362e
            java.lang.Object r4 = r4.getValue()
            s4.f r4 = (s4.C6750f) r4
            float r4 = r4.f32201a
            boolean r4 = s4.C6750f.m12935a(r4, r6)
            if (r4 != 0) goto L7e
            s4.f r4 = new s4.f     // Catch: java.lang.Throwable -> L77
            r4.<init>(r6)     // Catch: java.lang.Throwable -> L77
            r0.f13112a = r5     // Catch: java.lang.Throwable -> L77
            r0.f13115d = r3     // Catch: java.lang.Throwable -> L77
            java.lang.Object r6 = r2.m6776e(r4, r0)     // Catch: java.lang.Throwable -> L77
            if (r6 != r1) goto L71
            return r1
        L71:
            r0 = r5
        L72:
            m1.j r6 = r0.f13220g
            r0.f13219f = r6
            goto L7e
        L77:
            r6 = move-exception
            r0 = r5
        L79:
            m1.j r1 = r0.f13220g
            r0.f13219f = r1
            throw r6
        L7e:
            qw.a0 r6 = qw.a0.f30746a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: g2.x5.m6339b(ww.c):java.lang.Object");
    }
}
