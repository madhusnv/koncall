package org.slf4j.helpers;

import android.content.ComponentCallbacks2;
import android.content.Context;
import ea.C1973c;
import iw.InterfaceC3359b;
import l4.C4367l;
import og.fe;
import ud.C7410n;
import ud.InterfaceC7411o;
import ww.AbstractC8199i;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: org.slf4j.helpers.k */
/* loaded from: classes3.dex */
public abstract class AbstractC5722k {

    /* renamed from: a */
    public static C5721j f28204a = null;

    /* renamed from: b */
    public static boolean f28205b = false;

    /* renamed from: a */
    public static Object m11277a(Context context) {
        ComponentCallbacks2 componentCallbacks2M10652b = fe.m10652b(context.getApplicationContext());
        boolean z6 = componentCallbacks2M10652b instanceof InterfaceC3359b;
        Class<?> cls = componentCallbacks2M10652b.getClass();
        if (z6) {
            return ((InterfaceC3359b) componentCallbacks2M10652b).mo1432a();
        }
        throw new IllegalArgumentException("Hilt BroadcastReceiver must be attached to an @HiltAndroidApp Application. Found: " + cls);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object m11278b(ud.InterfaceC7411o r5, l4.C4367l r6, ww.AbstractC8193c r7) throws java.lang.Throwable {
        /*
            boolean r0 = r7 instanceof ta.C7088f
            if (r0 == 0) goto L13
            r0 = r7
            ta.f r0 = (ta.C7088f) r0
            int r1 = r0.f34198c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f34198c = r1
            goto L18
        L13:
            ta.f r0 = new ta.f
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.f34197b
            vw.a r1 = vw.EnumC7794a.COROUTINE_SUSPENDED
            int r2 = r0.f34198c
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            ta.a r5 = r0.f34196a
            og.od.m10798c(r7)     // Catch: java.lang.Throwable -> L29
            goto L4c
        L29:
            r6 = move-exception
            goto L58
        L2b:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L33:
            og.od.m10798c(r7)
            ta.a r7 = new ta.a
            r2 = 2
            r7.<init>(r5, r6, r2)
            r0.f34196a = r7     // Catch: java.lang.Throwable -> L56
            r0.f34198c = r3     // Catch: java.lang.Throwable -> L56
            l4.l r5 = r7.f34187b     // Catch: java.lang.Throwable -> L52
            java.lang.Object r5 = r5.m9139s(r0)     // Catch: java.lang.Throwable -> L52
            if (r5 != r1) goto L49
            return r1
        L49:
            r4 = r7
            r7 = r5
            r5 = r4
        L4c:
            java.lang.String r7 = (java.lang.String) r7     // Catch: java.lang.Throwable -> L29
            r5.close()
            return r7
        L52:
            r5 = move-exception
            r6 = r5
        L54:
            r5 = r7
            goto L58
        L56:
            r6 = move-exception
            goto L54
        L58:
            r5.close()     // Catch: java.lang.Throwable -> L5c
            goto L60
        L5c:
            r5 = move-exception
            og.md.m10764a(r6, r5)
        L60:
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: org.slf4j.helpers.AbstractC5722k.m11278b(ud.o, l4.l, ww.c):java.lang.Object");
    }

    /* renamed from: c */
    public static Object m11279c(InterfaceC7411o interfaceC7411o, C4367l c4367l, AbstractC8199i abstractC8199i, int i10) {
        if ((i10 & 1) != 0) {
            InterfaceC7411o.f35200a.getClass();
            interfaceC7411o = C7410n.f35199b;
        }
        if ((i10 & 2) != 0) {
            c4367l = new C4367l(new C1973c(interfaceC7411o, null, 6));
        }
        return m11278b(interfaceC7411o, c4367l, abstractC8199i);
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00ab A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* renamed from: d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object m11280d(ud.InterfaceC7411o r5, l4.C4367l r6, ww.AbstractC8193c r7) throws java.lang.Throwable {
        /*
            boolean r0 = r7 instanceof ta.C7089g
            if (r0 == 0) goto L13
            r0 = r7
            ta.g r0 = (ta.C7089g) r0
            int r1 = r0.f34200b
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f34200b = r1
            goto L18
        L13:
            ta.g r0 = new ta.g
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.f34199a
            vw.a r1 = vw.EnumC7794a.COROUTINE_SUSPENDED
            int r2 = r0.f34200b
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L30
            if (r2 != r3) goto L28
            og.od.m10798c(r7)
            goto L46
        L28:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L30:
            og.od.m10798c(r7)
            gc.b r7 = ea.AbstractC1976f.f9238A
            java.lang.Object r5 = gc.AbstractC2562f.m6572a(r7, r5)
            java.lang.String r5 = (java.lang.String) r5
            if (r5 != 0) goto L53
            r0.f34200b = r3
            java.lang.Object r7 = r6.m9139s(r0)
            if (r7 != r1) goto L46
            return r1
        L46:
            ja.k r7 = (ja.C3617k) r7
            java.lang.String r5 = "<this>"
            kotlin.jvm.internal.AbstractC4154l.m8923f(r7, r5)
            java.lang.String r5 = "sigv4a_signing_region_set"
            java.lang.String r5 = r7.m8168a(r5, r4)
        L53:
            if (r5 == 0) goto Lab
            java.lang.String r6 = ","
            java.lang.String[] r6 = new java.lang.String[]{r6}
            r7 = 6
            java.util.List r5 = nx.AbstractC5178p.m10112W(r5, r6, r7)
            java.util.ArrayList r6 = new java.util.ArrayList
            r7 = 10
            int r7 = rw.AbstractC6664n.m12768r(r5, r7)
            r6.<init>(r7)
            java.util.Iterator r5 = r5.iterator()
        L6f:
            boolean r7 = r5.hasNext()
            if (r7 == 0) goto L87
            java.lang.Object r7 = r5.next()
            java.lang.String r7 = (java.lang.String) r7
            java.lang.CharSequence r7 = nx.AbstractC5178p.g0(r7)
            java.lang.String r7 = r7.toString()
            r6.add(r7)
            goto L6f
        L87:
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            int r7 = r6.size()
            r0 = 0
        L91:
            if (r0 >= r7) goto La6
            java.lang.Object r1 = r6.get(r0)
            int r0 = r0 + 1
            r2 = r1
            java.lang.String r2 = (java.lang.String) r2
            int r2 = r2.length()
            if (r2 <= 0) goto L91
            r5.add(r1)
            goto L91
        La6:
            java.util.Set r5 = rw.AbstractC6663m.g0(r5)
            return r5
        Lab:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: org.slf4j.helpers.AbstractC5722k.m11280d(ud.o, l4.l, ww.c):java.lang.Object");
    }
}
