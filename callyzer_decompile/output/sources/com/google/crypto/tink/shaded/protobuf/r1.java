package com.google.crypto.tink.shaded.protobuf;

import com.sun.mail.imap.IMAPStore;
import java.lang.reflect.Field;
import java.nio.Buffer;
import java.nio.ByteOrder;
import java.security.AccessController;
import java.util.logging.Level;
import java.util.logging.Logger;
import sun.misc.Unsafe;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public abstract class r1 {

    /* renamed from: a */
    public static final Logger f7092a = Logger.getLogger(r1.class.getName());

    /* renamed from: b */
    public static final Unsafe f7093b;

    /* renamed from: c */
    public static final Class f7094c;

    /* renamed from: d */
    public static final q1 f7095d;

    /* renamed from: e */
    public static final boolean f7096e;

    /* renamed from: f */
    public static final boolean f7097f;

    /* renamed from: g */
    public static final long f7098g;

    /* renamed from: h */
    public static final boolean f7099h;

    static {
        Class cls;
        Class<?> cls2;
        boolean z6;
        boolean z10;
        q1 q1Var;
        Unsafe unsafeM4386i = m4386i();
        f7093b = unsafeM4386i;
        f7094c = AbstractC1376c.f7022a;
        Class cls3 = Long.TYPE;
        boolean zM4382e = m4382e(cls3);
        Class cls4 = Integer.TYPE;
        boolean zM4382e2 = m4382e(cls4);
        q1 p1Var = null;
        if (unsafeM4386i != null) {
            if (!AbstractC1376c.m4171a()) {
                p1Var = new p1(unsafeM4386i);
            } else if (zM4382e) {
                p1Var = new o1(unsafeM4386i, 1);
            } else if (zM4382e2) {
                p1Var = new o1(unsafeM4386i, 0);
            }
        }
        f7095d = p1Var;
        Class cls5 = Byte.TYPE;
        if (unsafeM4386i == null) {
            cls = Field.class;
            z6 = false;
        } else {
            try {
                cls2 = unsafeM4386i.getClass();
                cls2.getMethod("objectFieldOffset", Field.class);
                cls2.getMethod("getLong", Object.class, cls3);
            } catch (Throwable th2) {
                cls = Field.class;
                f7092a.log(Level.WARNING, "platform method missing - proto runtime falling back to safer methods: " + th2);
            }
            if (m4381d() == null) {
                cls = Field.class;
                z6 = false;
            } else {
                if (!AbstractC1376c.m4171a()) {
                    cls2.getMethod("getByte", cls3);
                    cls2.getMethod("putByte", cls3, cls5);
                    cls2.getMethod("getInt", cls3);
                    cls2.getMethod("putInt", cls3, cls4);
                    cls2.getMethod("getLong", cls3);
                    cls2.getMethod("putLong", cls3, cls3);
                    cls2.getMethod("copyMemory", cls3, cls3, cls3);
                    cls2.getMethod("copyMemory", Object.class, cls3, Object.class, cls3, cls3);
                }
                cls = Field.class;
                z6 = true;
            }
        }
        f7096e = z6;
        Unsafe unsafe = f7093b;
        if (unsafe == null) {
            z10 = false;
        } else {
            try {
                Class<?> cls6 = unsafe.getClass();
                cls6.getMethod("objectFieldOffset", cls);
                cls6.getMethod("arrayBaseOffset", Class.class);
                cls6.getMethod("arrayIndexScale", Class.class);
                cls6.getMethod("getInt", Object.class, cls3);
                cls6.getMethod("putInt", Object.class, cls3, cls4);
                cls6.getMethod("getLong", Object.class, cls3);
                cls6.getMethod("putLong", Object.class, cls3, cls3);
                cls6.getMethod("getObject", Object.class, cls3);
                cls6.getMethod("putObject", Object.class, cls3, Object.class);
                if (!AbstractC1376c.m4171a()) {
                    cls6.getMethod("getByte", Object.class, cls3);
                    cls6.getMethod("putByte", Object.class, cls3, cls5);
                    cls6.getMethod("getBoolean", Object.class, cls3);
                    cls6.getMethod("putBoolean", Object.class, cls3, Boolean.TYPE);
                    cls6.getMethod("getFloat", Object.class, cls3);
                    cls6.getMethod("putFloat", Object.class, cls3, Float.TYPE);
                    cls6.getMethod("getDouble", Object.class, cls3);
                    cls6.getMethod("putDouble", Object.class, cls3, Double.TYPE);
                }
                z10 = true;
            } catch (Throwable th3) {
                f7092a.log(Level.WARNING, "platform method missing - proto runtime falling back to safer methods: " + th3);
            }
        }
        f7097f = z10;
        f7098g = m4379b(byte[].class);
        m4379b(boolean[].class);
        m4380c(boolean[].class);
        m4379b(int[].class);
        m4380c(int[].class);
        m4379b(long[].class);
        m4380c(long[].class);
        m4379b(float[].class);
        m4380c(float[].class);
        m4379b(double[].class);
        m4380c(double[].class);
        m4379b(Object[].class);
        m4380c(Object[].class);
        Field fieldM4381d = m4381d();
        if (fieldM4381d != null && (q1Var = f7095d) != null) {
            q1Var.m4374j(fieldM4381d);
        }
        f7099h = ByteOrder.nativeOrder() == ByteOrder.BIG_ENDIAN;
    }

    /* renamed from: a */
    public static Object m4378a(Class cls) {
        try {
            return f7093b.allocateInstance(cls);
        } catch (InstantiationException e2) {
            throw new IllegalStateException(e2);
        }
    }

    /* renamed from: b */
    public static int m4379b(Class cls) {
        if (f7097f) {
            return f7095d.m4369a(cls);
        }
        return -1;
    }

    /* renamed from: c */
    public static void m4380c(Class cls) {
        if (f7097f) {
            f7095d.m4370b(cls);
        }
    }

    /* renamed from: d */
    public static Field m4381d() {
        Field declaredField;
        Field declaredField2;
        if (AbstractC1376c.m4171a()) {
            try {
                declaredField2 = Buffer.class.getDeclaredField("effectiveDirectAddress");
            } catch (Throwable unused) {
                declaredField2 = null;
            }
            if (declaredField2 != null) {
                return declaredField2;
            }
        }
        try {
            declaredField = Buffer.class.getDeclaredField(IMAPStore.ID_ADDRESS);
        } catch (Throwable unused2) {
            declaredField = null;
        }
        if (declaredField == null || declaredField.getType() != Long.TYPE) {
            return null;
        }
        return declaredField;
    }

    /* renamed from: e */
    public static boolean m4382e(Class cls) {
        if (!AbstractC1376c.m4171a()) {
            return false;
        }
        try {
            Class cls2 = f7094c;
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

    /* renamed from: f */
    public static byte m4383f(long j6, byte[] bArr) {
        return f7095d.mo4356d(f7098g + j6, bArr);
    }

    /* renamed from: g */
    public static byte m4384g(long j6, Object obj) {
        return (byte) ((f7095d.m4371g((-4) & j6, obj) >>> ((int) (((~j6) & 3) << 3))) & 255);
    }

    /* renamed from: h */
    public static byte m4385h(long j6, Object obj) {
        return (byte) ((f7095d.m4371g((-4) & j6, obj) >>> ((int) ((j6 & 3) << 3))) & 255);
    }

    /* renamed from: i */
    public static Unsafe m4386i() {
        try {
            return (Unsafe) AccessController.doPrivileged(new n1());
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: j */
    public static void m4387j(byte[] bArr, long j6, byte b10) {
        f7095d.mo4360l(bArr, f7098g + j6, b10);
    }

    /* renamed from: k */
    public static void m4388k(Object obj, long j6, byte b10) {
        long j10 = (-4) & j6;
        int iM4371g = f7095d.m4371g(j10, obj);
        int i10 = ((~((int) j6)) & 3) << 3;
        m4390m(((255 & b10) << i10) | (iM4371g & (~(255 << i10))), j10, obj);
    }

    /* renamed from: l */
    public static void m4389l(Object obj, long j6, byte b10) {
        long j10 = (-4) & j6;
        int i10 = (((int) j6) & 3) << 3;
        m4390m(((255 & b10) << i10) | (f7095d.m4371g(j10, obj) & (~(255 << i10))), j10, obj);
    }

    /* renamed from: m */
    public static void m4390m(int i10, long j6, Object obj) {
        f7095d.m4375o(i10, j6, obj);
    }

    /* renamed from: n */
    public static void m4391n(Object obj, long j6, long j10) {
        f7095d.m4376p(obj, j6, j10);
    }

    /* renamed from: o */
    public static void m4392o(Object obj, long j6, Object obj2) {
        f7095d.m4377q(obj, j6, obj2);
    }
}
