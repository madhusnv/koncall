package com.google.android.gms.internal.measurement;

import com.sun.mail.imap.IMAPStore;
import java.lang.reflect.Field;
import java.nio.Buffer;
import java.security.AccessController;
import sun.misc.Unsafe;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public abstract class r6 {

    /* renamed from: a */
    public static final Unsafe f6353a;

    /* renamed from: b */
    public static final Class f6354b;

    /* renamed from: c */
    public static final q6 f6355c;

    /* renamed from: d */
    public static final boolean f6356d;

    /* renamed from: e */
    public static final boolean f6357e;

    /* renamed from: f */
    public static final long f6358f;

    /* renamed from: g */
    public static final boolean f6359g;

    /* JADX WARN: Removed duplicated region for block: B:11:0x0043  */
    static {
        /*
            Method dump skipped, instructions count: 324
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.r6.<clinit>():void");
    }

    /* renamed from: a */
    public static void m3616a(Class cls) {
        if (f6357e) {
            f6355c.f6349a.arrayIndexScale(cls);
        }
    }

    /* renamed from: b */
    public static Field m3617b() {
        Field declaredField;
        Field declaredField2;
        int i10 = v4.f6421a;
        try {
            declaredField = Buffer.class.getDeclaredField("effectiveDirectAddress");
        } catch (Throwable unused) {
            declaredField = null;
        }
        if (declaredField != null) {
            return declaredField;
        }
        try {
            declaredField2 = Buffer.class.getDeclaredField(IMAPStore.ID_ADDRESS);
        } catch (Throwable unused2) {
            declaredField2 = null;
        }
        if (declaredField2 == null || declaredField2.getType() != Long.TYPE) {
            return null;
        }
        return declaredField2;
    }

    /* renamed from: c */
    public static void m3618c(Object obj, long j6, byte b10) {
        Unsafe unsafe = f6355c.f6349a;
        long j10 = (-4) & j6;
        int i10 = unsafe.getInt(obj, j10);
        int i11 = ((~((int) j6)) & 3) << 3;
        unsafe.putInt(obj, j10, ((255 & b10) << i11) | (i10 & (~(255 << i11))));
    }

    /* renamed from: d */
    public static void m3619d(Object obj, long j6, byte b10) {
        Unsafe unsafe = f6355c.f6349a;
        long j10 = (-4) & j6;
        int i10 = (((int) j6) & 3) << 3;
        unsafe.putInt(obj, j10, ((255 & b10) << i10) | (unsafe.getInt(obj, j10) & (~(255 << i10))));
    }

    /* renamed from: e */
    public static Object m3620e(Class cls) {
        try {
            return f6353a.allocateInstance(cls);
        } catch (InstantiationException e2) {
            throw new IllegalStateException(e2);
        }
    }

    /* renamed from: f */
    public static int m3621f(long j6, Object obj) {
        return f6355c.f6349a.getInt(obj, j6);
    }

    /* renamed from: g */
    public static void m3622g(int i10, long j6, Object obj) {
        f6355c.f6349a.putInt(obj, j6, i10);
    }

    /* renamed from: h */
    public static long m3623h(long j6, Object obj) {
        return f6355c.f6349a.getLong(obj, j6);
    }

    /* renamed from: i */
    public static void m3624i(Object obj, long j6, long j10) {
        f6355c.f6349a.putLong(obj, j6, j10);
    }

    /* renamed from: j */
    public static Object m3625j(long j6, Object obj) {
        return f6355c.f6349a.getObject(obj, j6);
    }

    /* renamed from: k */
    public static void m3626k(Object obj, long j6, Object obj2) {
        f6355c.f6349a.putObject(obj, j6, obj2);
    }

    /* renamed from: l */
    public static Unsafe m3627l() {
        try {
            return (Unsafe) AccessController.doPrivileged(new n6());
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: m */
    public static boolean m3628m(Class cls) {
        int i10 = v4.f6421a;
        try {
            Class cls2 = f6354b;
            Class cls3 = Boolean.TYPE;
            cls2.getMethod("peekLong", cls, cls3);
            cls2.getMethod("pokeLong", cls, Long.TYPE, cls3);
            Class cls4 = Integer.TYPE;
            cls2.getMethod("pokeInt", cls, cls4, cls3);
            cls2.getMethod("peekInt", cls, cls3);
            cls2.getMethod("pokeByte", cls, Byte.TYPE);
            cls2.getMethod("peekByte", cls);
            cls2.getMethod("pokeByteArray", cls, byte[].class, cls4, cls4);
            cls2.getMethod("peekByteArray", cls, byte[].class, cls4, cls4);
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }

    /* renamed from: n */
    public static /* synthetic */ boolean m3629n(long j6, Object obj) {
        return ((byte) ((f6355c.f6349a.getInt(obj, (-4) & j6) >>> ((int) (((~j6) & 3) << 3))) & 255)) != 0;
    }

    /* renamed from: o */
    public static /* synthetic */ boolean m3630o(long j6, Object obj) {
        return ((byte) ((f6355c.f6349a.getInt(obj, (-4) & j6) >>> ((int) ((j6 & 3) << 3))) & 255)) != 0;
    }

    /* renamed from: p */
    public static int m3631p(Class cls) {
        if (f6357e) {
            return f6355c.f6349a.arrayBaseOffset(cls);
        }
        return -1;
    }
}
