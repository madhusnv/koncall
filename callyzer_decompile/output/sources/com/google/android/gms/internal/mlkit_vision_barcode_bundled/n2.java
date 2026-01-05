package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

import com.sun.mail.imap.IMAPStore;
import java.lang.reflect.Field;
import java.nio.Buffer;
import java.security.AccessController;
import sun.misc.Unsafe;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public abstract class n2 {

    /* renamed from: a */
    public static final Unsafe f6614a;

    /* renamed from: b */
    public static final Class f6615b;

    /* renamed from: c */
    public static final m2 f6616c;

    /* renamed from: d */
    public static final boolean f6617d;

    /* renamed from: e */
    public static final boolean f6618e;

    /* renamed from: f */
    public static final long f6619f;

    /* renamed from: g */
    public static final boolean f6620g;

    /* JADX WARN: Removed duplicated region for block: B:11:0x0043  */
    static {
        /*
            Method dump skipped, instructions count: 324
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.mlkit_vision_barcode_bundled.n2.<clinit>():void");
    }

    /* renamed from: a */
    public static void m3915a(Class cls) {
        if (f6618e) {
            f6616c.f6603a.arrayIndexScale(cls);
        }
    }

    /* renamed from: b */
    public static Field m3916b() {
        Field declaredField;
        Field declaredField2;
        int i10 = l0.f6593a;
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
    public static void m3917c(Object obj, long j6, byte b10) {
        m2 m2Var = f6616c;
        long j10 = (-4) & j6;
        int i10 = m2Var.f6603a.getInt(obj, j10);
        int i11 = ((~((int) j6)) & 3) << 3;
        m2Var.f6603a.putInt(obj, j10, ((255 & b10) << i11) | (i10 & (~(255 << i11))));
    }

    /* renamed from: d */
    public static void m3918d(Object obj, long j6, byte b10) {
        m2 m2Var = f6616c;
        long j10 = (-4) & j6;
        int i10 = (((int) j6) & 3) << 3;
        m2Var.f6603a.putInt(obj, j10, ((255 & b10) << i10) | (m2Var.f6603a.getInt(obj, j10) & (~(255 << i10))));
    }

    /* renamed from: e */
    public static int m3919e(long j6, Object obj) {
        return f6616c.f6603a.getInt(obj, j6);
    }

    /* renamed from: f */
    public static long m3920f(long j6, Object obj) {
        return f6616c.f6603a.getLong(obj, j6);
    }

    /* renamed from: g */
    public static Object m3921g(Class cls) {
        try {
            return f6614a.allocateInstance(cls);
        } catch (InstantiationException e2) {
            throw new IllegalStateException(e2);
        }
    }

    /* renamed from: h */
    public static Object m3922h(long j6, Object obj) {
        return f6616c.f6603a.getObject(obj, j6);
    }

    /* renamed from: i */
    public static Unsafe m3923i() {
        try {
            return (Unsafe) AccessController.doPrivileged(new j2());
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: j */
    public static void m3924j(int i10, long j6, Object obj) {
        f6616c.f6603a.putInt(obj, j6, i10);
    }

    /* renamed from: k */
    public static void m3925k(Object obj, long j6, long j10) {
        f6616c.f6603a.putLong(obj, j6, j10);
    }

    /* renamed from: l */
    public static void m3926l(Object obj, long j6, Object obj2) {
        f6616c.f6603a.putObject(obj, j6, obj2);
    }

    /* renamed from: m */
    public static /* bridge */ /* synthetic */ boolean m3927m(long j6, Object obj) {
        return ((byte) ((f6616c.f6603a.getInt(obj, (-4) & j6) >>> ((int) (((~j6) & 3) << 3))) & 255)) != 0;
    }

    /* renamed from: n */
    public static /* bridge */ /* synthetic */ boolean m3928n(long j6, Object obj) {
        return ((byte) ((f6616c.f6603a.getInt(obj, (-4) & j6) >>> ((int) ((j6 & 3) << 3))) & 255)) != 0;
    }

    /* renamed from: o */
    public static boolean m3929o(Class cls) {
        int i10 = l0.f6593a;
        try {
            Class cls2 = f6615b;
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

    /* renamed from: p */
    public static int m3930p(Class cls) {
        if (f6618e) {
            return f6616c.f6603a.arrayBaseOffset(cls);
        }
        return -1;
    }
}
