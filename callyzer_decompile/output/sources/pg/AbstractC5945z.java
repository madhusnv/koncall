package pg;

import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import java.util.Arrays;
import java.util.HashSet;
import jc.AbstractC3745u;
import jc.InterfaceC3738n;
import kotlin.jvm.internal.AbstractC4154l;
import p016r.InterfaceC6409a;
import uc.C7394a;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: pg.z */
/* loaded from: classes.dex */
public abstract class AbstractC5945z implements InterfaceC6409a {
    /* renamed from: a */
    public static final C7394a m11956a(jc.h0 status, InterfaceC3738n interfaceC3738n, AbstractC3745u body) {
        AbstractC4154l.m8923f(status, "status");
        AbstractC4154l.m8923f(body, "body");
        return new C7394a(status, interfaceC3738n, body);
    }

    /* renamed from: b */
    public static i0.t1 m11957b(Context context, Bundle bundle) {
        boolean z6 = bundle.getBoolean("androidx.camera.core.quirks.DEFAULT_QUIRK_ENABLED", true);
        String[] strArrM11960e = m11960e(context, "androidx.camera.core.quirks.FORCE_ENABLED", bundle);
        String[] strArrM11960e2 = m11960e(context, "androidx.camera.core.quirks.FORCE_DISABLED", bundle);
        og.u1.m10942a("QuirkSettingsLoader");
        og.u1.m10942a("QuirkSettingsLoader");
        Arrays.toString(strArrM11960e);
        og.u1.m10942a("QuirkSettingsLoader");
        Arrays.toString(strArrM11960e2);
        og.u1.m10942a("QuirkSettingsLoader");
        return new i0.t1(z6, new HashSet(m11961f(strArrM11960e)), new HashSet(m11961f(strArrM11960e2)));
    }

    /* renamed from: c */
    public static C7394a m11958c(C7394a c7394a, jc.h0 status, AbstractC3745u body, int i10) {
        if ((i10 & 1) != 0) {
            status = c7394a.f35158a;
        }
        InterfaceC3738n interfaceC3738n = c7394a.f35159b;
        AbstractC4154l.m8923f(c7394a, "<this>");
        AbstractC4154l.m8923f(status, "status");
        AbstractC4154l.m8923f(body, "body");
        return m11956a(status, interfaceC3738n, body);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* renamed from: d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.io.Serializable m11959d(uc.C7394a r8, boolean r9, ww.AbstractC8193c r10) {
        /*
            boolean r0 = r10 instanceof uc.C7396c
            if (r0 == 0) goto L13
            r0 = r10
            uc.c r0 = (uc.C7396c) r0
            int r1 = r0.f35169e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f35169e = r1
            goto L18
        L13:
            uc.c r0 = new uc.c
            r0.<init>(r10)
        L18:
            java.lang.Object r10 = r0.f35168d
            vw.a r1 = vw.EnumC7794a.COROUTINE_SUSPENDED
            int r2 = r0.f35169e
            r3 = 1
            if (r2 == 0) goto L3b
            if (r2 != r3) goto L33
            uc.a r8 = r0.f35167c
            wc.s r9 = r0.f35166b
            uc.a r0 = r0.f35165a
            og.od.m10798c(r10)
            r7 = r9
            r9 = r8
            r8 = r0
            r0 = r10
            r10 = r7
            goto La1
        L33:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L3b:
            og.od.m10798c(r10)
            wc.s r10 = new wc.s
            r10.<init>()
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r4 = "HTTP "
            r2.<init>(r4)
            jc.h0 r4 = r8.f35158a
            r2.append(r4)
            java.lang.String r4 = "\r\n"
            r2.append(r4)
            java.lang.String r2 = r2.toString()
            wc.InterfaceC7986t.m15165r(r10, r2)
            jc.n r2 = r8.f35159b
            sq.b r5 = new sq.b
            r6 = 7
            r5.<init>(r6, r10)
            r2.m5748b(r5)
            r2 = 2
            r10.mo15145m(r2, r4)
            if (r9 == 0) goto Lb7
            jc.u r9 = r8.f35160c
            boolean r2 = r9 instanceof jc.AbstractC3740p
            if (r2 == 0) goto L7c
            jc.p r9 = (jc.AbstractC3740p) r9
            byte[] r9 = r9.mo8273b()
            wc.InterfaceC7986t.c0(r10, r9)
            goto Lb7
        L7c:
            boolean r2 = r9 instanceof jc.AbstractC3741q
            if (r2 != 0) goto L90
            boolean r2 = r9 instanceof jc.AbstractC3744t
            if (r2 == 0) goto L85
            goto L90
        L85:
            boolean r9 = r9 instanceof jc.C3743s
            if (r9 == 0) goto L8a
            goto Lb7
        L8a:
            kotlin.NoWhenBranchMatchedException r8 = new kotlin.NoWhenBranchMatchedException
            r8.<init>()
            throw r8
        L90:
            r0.f35165a = r8
            r0.f35166b = r10
            r0.f35167c = r8
            r0.f35169e = r3
            java.io.Serializable r9 = pg.f8.m11621b(r9, r0)
            if (r9 != r1) goto L9f
            return r1
        L9f:
            r0 = r9
            r9 = r8
        La1:
            byte[] r0 = (byte[]) r0
            if (r0 == 0) goto Lb6
            r9 = 0
            int r1 = r0.length
            r10.write(r0, r9, r1)
            mc.a r9 = new mc.a
            r9.<init>(r0)
            r0 = 0
            r1 = 3
            uc.a r8 = m11958c(r8, r0, r9, r1)
            goto Lb7
        Lb6:
            r8 = r9
        Lb7:
            b00.k r9 = r10.f38413a
            java.lang.String r9 = r9.o0()
            qw.k r10 = new qw.k
            r10.<init>(r8, r9)
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: pg.AbstractC5945z.m11959d(uc.a, boolean, ww.c):java.io.Serializable");
    }

    /* renamed from: e */
    public static String[] m11960e(Context context, String str, Bundle bundle) {
        if (!bundle.containsKey(str)) {
            return new String[0];
        }
        int i10 = bundle.getInt(str, -1);
        if (i10 == -1) {
            og.u1.m10951j("QuirkSettingsLoader");
            return new String[0];
        }
        try {
            return context.getResources().getStringArray(i10);
        } catch (Resources.NotFoundException unused) {
            og.u1.m10952k("QuirkSettingsLoader");
            return new String[0];
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0027 A[SYNTHETIC] */
    /* renamed from: f */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.util.HashSet m11961f(java.lang.String[] r6) throws java.lang.ClassNotFoundException {
        /*
            java.util.HashSet r0 = new java.util.HashSet
            r0.<init>()
            int r1 = r6.length
            r2 = 0
        L7:
            if (r2 >= r1) goto L2a
            r3 = r6[r2]
            java.lang.String r4 = "QuirkSettingsLoader"
            java.lang.Class r3 = java.lang.Class.forName(r3)     // Catch: java.lang.ClassNotFoundException -> L1e
            java.lang.Class<i0.s1> r5 = i0.s1.class
            boolean r5 = r5.isAssignableFrom(r3)     // Catch: java.lang.ClassNotFoundException -> L1e
            if (r5 == 0) goto L1a
            goto L22
        L1a:
            og.u1.m10951j(r4)     // Catch: java.lang.ClassNotFoundException -> L1e
            goto L21
        L1e:
            og.u1.m10952k(r4)
        L21:
            r3 = 0
        L22:
            if (r3 == 0) goto L27
            r0.add(r3)
        L27:
            int r2 = r2 + 1
            goto L7
        L2a:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: pg.AbstractC5945z.m11961f(java.lang.String[]):java.util.HashSet");
    }
}
