package i9;

import an.b3;
import b2.C0554l;
import ec.InterfaceC2004b;
import nc.InterfaceC4991b;
import og.bb;
import ox.C5770a;
import ox.EnumC5772c;
import td.C7124a;
import ud.InterfaceC7411o;
import uw.InterfaceC7559c;
import vc.InterfaceC7700c;
import ww.AbstractC8193c;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class l0 implements InterfaceC7700c {

    /* renamed from: a */
    public final String f17201a;

    /* renamed from: b */
    public final String f17202b;

    /* renamed from: c */
    public final long f17203c;

    /* renamed from: d */
    public final InterfaceC4991b f17204d;

    /* renamed from: e */
    public final InterfaceC7411o f17205e;

    /* renamed from: f */
    public final C7124a f17206f;

    /* renamed from: g */
    public final C0554l f17207g;

    public l0(String str, String str2, String str3, InterfaceC4991b interfaceC4991b, InterfaceC7411o interfaceC7411o, C7124a c7124a) {
        int i10 = C5770a.f28335d;
        long jM10551g = bb.m10551g(300, EnumC5772c.SECONDS);
        this.f17201a = str;
        this.f17202b = str3;
        this.f17203c = jM10551g;
        this.f17204d = interfaceC4991b;
        this.f17205e = interfaceC7411o;
        this.f17206f = c7124a;
        this.f17207g = new C0554l((byte) 0, 12);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object m7546a(i9.l0 r9, ww.AbstractC8193c r10) {
        /*
            java.lang.String r0 = r9.f17201a
            td.a r1 = r9.f17206f
            boolean r2 = r10 instanceof i9.i0
            if (r2 == 0) goto L17
            r2 = r10
            i9.i0 r2 = (i9.i0) r2
            int r3 = r2.f17185c
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L17
            int r3 = r3 - r4
            r2.f17185c = r3
            goto L1c
        L17:
            i9.i0 r2 = new i9.i0
            r2.<init>(r9, r10)
        L1c:
            java.lang.Object r10 = r2.f17183a
            vw.a r3 = vw.EnumC7794a.COROUTINE_SUSPENDED
            int r4 = r2.f17185c
            r5 = 2
            r6 = 1
            if (r4 == 0) goto L3a
            if (r4 == r6) goto L36
            if (r4 != r5) goto L2e
            og.od.m10798c(r10)
            return r10
        L2e:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L36:
            og.od.m10798c(r10)
            goto L48
        L3a:
            og.od.m10798c(r10)
            ud.o r10 = r9.f17205e
            r2.f17185c = r6
            java.lang.Object r10 = pg.e6.m11599e(r0, r10, r2)
            if (r10 != r3) goto L48
            goto L9e
        L48:
            i9.d0 r10 = (i9.d0) r10
            r1.getClass()
            j$.time.format.DateTimeFormatter r1 = td.C7126c.f34342b
            td.c r1 = td.C7124a.m13407e()
            td.c r4 = r10.f17145b
            long r6 = r9.f17203c
            long r6 = ox.C5770a.m11304o(r6)
            td.c r4 = r4.m13410c(r6)
            int r1 = r1.compareTo(r4)
            r4 = 0
            java.lang.String r6 = "log<T> cannot be used on an anonymous object"
            java.lang.Class<i9.l0> r7 = i9.l0.class
            r8 = 0
            if (r1 >= 0) goto L8a
            uw.h r0 = r2.getContext()
            i9.e0 r1 = new i9.e0
            r1.<init>(r9, r4)
            nd.b r9 = nd.EnumC5011b.Debug
            kotlin.jvm.internal.e r2 = kotlin.jvm.internal.a0.m8901a(r7)
            java.lang.String r2 = r2.m8913b()
            if (r2 == 0) goto L84
            og.u1.m10948g(r0, r9, r2, r8, r1)
            return r10
        L84:
            java.lang.IllegalArgumentException r9 = new java.lang.IllegalArgumentException
            r9.<init>(r6)
            throw r9
        L8a:
            java.lang.String r1 = r10.f17147d
            if (r1 == 0) goto La0
            java.lang.String r1 = r10.f17148e
            if (r1 == 0) goto La0
            java.lang.String r1 = r10.f17146c
            if (r1 == 0) goto La0
            r2.f17185c = r5
            java.lang.Object r9 = r9.m7547b(r10, r2)
            if (r9 != r3) goto L9f
        L9e:
            return r3
        L9f:
            return r9
        La0:
            td.c r1 = td.C7124a.m13407e()
            td.c r3 = r10.f17145b
            int r1 = r1.compareTo(r3)
            if (r1 >= 0) goto Lad
            goto Lae
        Lad:
            r10 = r8
        Lae:
            if (r10 == 0) goto Lcf
            uw.h r0 = r2.getContext()
            i9.f0 r1 = new i9.f0
            r1.<init>(r10, r9, r4)
            nd.b r9 = nd.EnumC5011b.Debug
            kotlin.jvm.internal.e r2 = kotlin.jvm.internal.a0.m8901a(r7)
            java.lang.String r2 = r2.m8913b()
            if (r2 == 0) goto Lc9
            og.u1.m10948g(r0, r9, r2, r8, r1)
            return r10
        Lc9:
            java.lang.IllegalArgumentException r9 = new java.lang.IllegalArgumentException
            r9.<init>(r6)
            throw r9
        Lcf:
            aws.sdk.kotlin.runtime.auth.credentials.InvalidSsoTokenException r9 = new aws.sdk.kotlin.runtime.auth.credentials.InvalidSsoTokenException
            java.lang.String r10 = "SSO token for sso-session: "
            java.lang.String r1 = " is expired"
            java.lang.String r10 = org.bouncycastle.jcajce.provider.digest.AbstractC5601a.m11238i(r10, r0, r1)
            r9.<init>(r10, r8)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: i9.l0.m7546a(i9.l0, ww.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:57:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m7547b(i9.d0 r12, ww.AbstractC8193c r13) {
        /*
            Method dump skipped, instructions count: 255
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: i9.l0.m7547b(i9.d0, ww.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m7548c(i9.d0 r8, ww.AbstractC8193c r9) throws java.lang.Throwable {
        /*
            r7 = this;
            boolean r0 = r9 instanceof i9.j0
            if (r0 == 0) goto L13
            r0 = r9
            i9.j0 r0 = (i9.j0) r0
            int r1 = r0.f17191e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f17191e = r1
            goto L18
        L13:
            i9.j0 r0 = new i9.j0
            r0.<init>(r7, r9)
        L18:
            java.lang.Object r9 = r0.f17189c
            vw.a r1 = vw.EnumC7794a.COROUTINE_SUSPENDED
            int r2 = r0.f17191e
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3f
            if (r2 == r4) goto L39
            if (r2 != r3) goto L31
            java.io.Closeable r8 = r0.f17188b
            i9.d0 r0 = r0.f17187a
            og.od.m10798c(r9)     // Catch: java.lang.Throwable -> L2e
            goto L8f
        L2e:
            r9 = move-exception
            goto La1
        L31:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L39:
            i9.d0 r8 = r0.f17187a
            og.od.m10798c(r9)
            goto L5d
        L3f:
            og.od.m10798c(r9)
            uw.h r9 = r0.getContext()
            ld.g r9 = com.google.android.gms.internal.measurement.d4.m3227a(r9)
            hq.n r2 = new hq.n
            r5 = 2
            r2.<init>(r5, r7, r9)
            r0.f17187a = r8
            r0.f17191e = r4
            q9.d r9 = q9.C6146d.f29961a
            java.lang.Object r9 = r9.m10876g(r2, r0)
            if (r9 != r1) goto L5d
            goto L8a
        L5d:
            java.io.Closeable r9 = (java.io.Closeable) r9
            r2 = r9
            q9.g r2 = (q9.InterfaceC6149g) r2     // Catch: java.lang.Throwable -> L9f
            c9.n r4 = new c9.n     // Catch: java.lang.Throwable -> L9f
            r4.<init>()     // Catch: java.lang.Throwable -> L9f
            java.lang.String r5 = r8.f17147d     // Catch: java.lang.Throwable -> L9f
            r4.f5598a = r5     // Catch: java.lang.Throwable -> L9f
            java.lang.String r5 = r8.f17148e     // Catch: java.lang.Throwable -> L9f
            r4.f5599b = r5     // Catch: java.lang.Throwable -> L9f
            java.lang.String r5 = r8.f17146c     // Catch: java.lang.Throwable -> L9f
            r4.f5601d = r5     // Catch: java.lang.Throwable -> L9f
            java.lang.String r5 = "refresh_token"
            r4.f5600c = r5     // Catch: java.lang.Throwable -> L9f
            u9.a r5 = new u9.a     // Catch: java.lang.Throwable -> L9f
            r5.<init>(r4)     // Catch: java.lang.Throwable -> L9f
            r0.f17187a = r8     // Catch: java.lang.Throwable -> L9f
            r0.f17188b = r9     // Catch: java.lang.Throwable -> L9f
            r0.f17191e = r3     // Catch: java.lang.Throwable -> L9f
            q9.a r2 = (q9.C6143a) r2     // Catch: java.lang.Throwable -> L9f
            java.lang.Object r0 = r2.m12190h(r5, r0)     // Catch: java.lang.Throwable -> L9f
            if (r0 != r1) goto L8b
        L8a:
            return r1
        L8b:
            r6 = r0
            r0 = r8
            r8 = r9
            r9 = r6
        L8f:
            u9.b r9 = (u9.C7380b) r9     // Catch: java.lang.Throwable -> L2e
            td.a r1 = r7.f17206f     // Catch: java.lang.Throwable -> L2e
            i9.d0 r9 = pg.e6.m11595a(r9, r0, r1)     // Catch: java.lang.Throwable -> L2e
            r8.close()
            return r9
        L9b:
            r6 = r9
            r9 = r8
            r8 = r6
            goto La1
        L9f:
            r8 = move-exception
            goto L9b
        La1:
            r8.close()     // Catch: java.lang.Throwable -> La5
            goto La9
        La5:
            r8 = move-exception
            og.md.m10764a(r9, r8)
        La9:
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: i9.l0.m7548c(i9.d0, ww.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* renamed from: d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m7549d(i9.d0 r10, ww.AbstractC8193c r11) throws java.lang.Throwable {
        /*
            r9 = this;
            boolean r0 = r11 instanceof i9.k0
            if (r0 == 0) goto L13
            r0 = r11
            i9.k0 r0 = (i9.k0) r0
            int r1 = r0.f17199d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f17199d = r1
            goto L18
        L13:
            i9.k0 r0 = new i9.k0
            r0.<init>(r9, r11)
        L18:
            java.lang.Object r11 = r0.f17197b
            vw.a r1 = vw.EnumC7794a.COROUTINE_SUSPENDED
            int r2 = r0.f17199d
            qw.a0 r3 = qw.a0.f30746a
            r4 = 1
            if (r2 == 0) goto L35
            if (r2 != r4) goto L2d
            java.lang.String r10 = r0.f17196a
            og.od.m10798c(r11)     // Catch: java.lang.Exception -> L2b
            return r3
        L2b:
            r11 = move-exception
            goto L7a
        L2d:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L35:
            og.od.m10798c(r11)
            java.lang.String r11 = r9.f17201a
            java.lang.String r11 = pg.e6.m11598d(r11)
            java.lang.String r2 = "sso"
            java.lang.String r5 = "cache"
            java.lang.String r6 = "~"
            java.lang.String r7 = ".aws"
            java.lang.String[] r11 = new java.lang.String[]{r6, r7, r2, r5, r11}
            ud.o r2 = r9.f17205e
            java.lang.String r11 = pg.e6.m11597c(r2, r11)
            java.lang.String r11 = pg.z7.m11965b(r11, r2)
            byte[] r10 = pg.e6.m11600f(r10)     // Catch: java.lang.Exception -> L78
            r0.f17196a = r11     // Catch: java.lang.Exception -> L78
            r0.f17199d = r4     // Catch: java.lang.Exception -> L78
            ay.f r2 = tx.m0.f34659a     // Catch: java.lang.Exception -> L78
            ay.e r2 = ay.ExecutorC0495e.f3538c     // Catch: java.lang.Exception -> L78
            lu.k r4 = new lu.k     // Catch: java.lang.Exception -> L78
            r5 = 23
            r6 = 0
            r4.<init>(r11, r10, r6, r5)     // Catch: java.lang.Exception -> L78
            java.lang.Object r10 = tx.c0.m13475K(r2, r4, r0)     // Catch: java.lang.Exception -> L78
            if (r10 != r1) goto L6f
            goto L70
        L6f:
            r10 = r3
        L70:
            if (r10 != r1) goto L73
            return r1
        L73:
            return r3
        L74:
            r8 = r11
            r11 = r10
            r10 = r8
            goto L7a
        L78:
            r10 = move-exception
            goto L74
        L7a:
            uw.h r0 = r0.getContext()
            i9.g0 r1 = new i9.g0
            r2 = 0
            r1.<init>(r10, r2)
            nd.b r10 = nd.EnumC5011b.Debug
            java.lang.Class<i9.l0> r2 = i9.l0.class
            kotlin.jvm.internal.e r2 = kotlin.jvm.internal.a0.m8901a(r2)
            java.lang.String r2 = r2.m8913b()
            if (r2 == 0) goto L96
            og.u1.m10948g(r0, r10, r2, r11, r1)
            return r3
        L96:
            java.lang.IllegalArgumentException r10 = new java.lang.IllegalArgumentException
            java.lang.String r11 = "log<T> cannot be used on an anonymous object"
            r10.<init>(r11)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: i9.l0.m7549d(i9.d0, ww.c):java.lang.Object");
    }

    @Override // vc.InterfaceC7700c
    public final Object resolve(InterfaceC2004b interfaceC2004b, InterfaceC7559c interfaceC7559c) {
        return this.f17207g.m1643m(new b3(this, interfaceC2004b, null, 6), (AbstractC8193c) interfaceC7559c);
    }
}
