package androidx.datastore.preferences.protobuf;

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
public abstract class n1 {

    /* renamed from: a */
    public static final Unsafe f2379a;

    /* renamed from: b */
    public static final Class f2380b;

    /* renamed from: c */
    public static final m1 f2381c;

    /* renamed from: d */
    public static final boolean f2382d;

    /* renamed from: e */
    public static final boolean f2383e;

    /* renamed from: f */
    public static final long f2384f;

    /* renamed from: g */
    public static final boolean f2385g;

    static {
        Unsafe unsafeM1015i = m1015i();
        f2379a = unsafeM1015i;
        f2380b = AbstractC0308c.f2298a;
        boolean zM1014h = m1014h(Long.TYPE);
        boolean zM1014h2 = m1014h(Integer.TYPE);
        m1 l1Var = null;
        if (unsafeM1015i != null) {
            if (!AbstractC0308c.m852a()) {
                l1Var = new l1(unsafeM1015i);
            } else if (zM1014h) {
                l1Var = new k1(unsafeM1015i, 1);
            } else if (zM1014h2) {
                l1Var = new k1(unsafeM1015i, 0);
            }
        }
        f2381c = l1Var;
        f2382d = l1Var == null ? false : l1Var.mo937r();
        f2383e = l1Var == null ? false : l1Var.mo964q();
        f2384f = m1011e(byte[].class);
        m1011e(boolean[].class);
        m1012f(boolean[].class);
        m1011e(int[].class);
        m1012f(int[].class);
        m1011e(long[].class);
        m1012f(long[].class);
        m1011e(float[].class);
        m1012f(float[].class);
        m1011e(double[].class);
        m1012f(double[].class);
        m1011e(Object[].class);
        m1012f(Object[].class);
        Field fieldM1013g = m1013g();
        if (fieldM1013g != null && l1Var != null) {
            l1Var.m1003i(fieldM1013g);
        }
        f2385g = ByteOrder.nativeOrder() == ByteOrder.BIG_ENDIAN;
    }

    /* renamed from: a */
    public static void m1007a(Throwable th2) {
        Logger.getLogger(n1.class.getName()).log(Level.WARNING, "platform method missing - proto runtime falling back to safer methods: " + th2);
    }

    /* renamed from: b */
    public static boolean m1008b(long j6, Object obj) {
        return ((byte) ((f2381c.m1000f((-4) & j6, obj) >>> ((int) (((~j6) & 3) << 3))) & 255)) != 0;
    }

    /* renamed from: c */
    public static boolean m1009c(long j6, Object obj) {
        return ((byte) ((f2381c.m1000f((-4) & j6, obj) >>> ((int) ((j6 & 3) << 3))) & 255)) != 0;
    }

    /* renamed from: d */
    public static Object m1010d(Class cls) {
        try {
            return f2379a.allocateInstance(cls);
        } catch (InstantiationException e2) {
            throw new IllegalStateException(e2);
        }
    }

    /* renamed from: e */
    public static int m1011e(Class cls) {
        if (f2383e) {
            return f2381c.m998a(cls);
        }
        return -1;
    }

    /* renamed from: f */
    public static void m1012f(Class cls) {
        if (f2383e) {
            f2381c.m999b(cls);
        }
    }

    /* renamed from: g */
    public static Field m1013g() {
        Field declaredField;
        Field declaredField2;
        if (AbstractC0308c.m852a()) {
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

    /* renamed from: h */
    public static boolean m1014h(Class cls) {
        if (!AbstractC0308c.m852a()) {
            return false;
        }
        try {
            Class cls2 = f2380b;
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

    /* renamed from: i */
    public static Unsafe m1015i() {
        try {
            return (Unsafe) AccessController.doPrivileged(new j1());
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: j */
    public static void m1016j(byte[] bArr, long j6, byte b10) {
        f2381c.mo934k(bArr, f2384f + j6, b10);
    }

    /* renamed from: k */
    public static void m1017k(Object obj, long j6, byte b10) {
        long j10 = (-4) & j6;
        int iM1000f = f2381c.m1000f(j10, obj);
        int i10 = ((~((int) j6)) & 3) << 3;
        m1019m(((255 & b10) << i10) | (iM1000f & (~(255 << i10))), j10, obj);
    }

    /* renamed from: l */
    public static void m1018l(Object obj, long j6, byte b10) {
        long j10 = (-4) & j6;
        int i10 = (((int) j6) & 3) << 3;
        m1019m(((255 & b10) << i10) | (f2381c.m1000f(j10, obj) & (~(255 << i10))), j10, obj);
    }

    /* renamed from: m */
    public static void m1019m(int i10, long j6, Object obj) {
        f2381c.m1004n(i10, j6, obj);
    }

    /* renamed from: n */
    public static void m1020n(Object obj, long j6, long j10) {
        f2381c.m1005o(obj, j6, j10);
    }

    /* renamed from: o */
    public static void m1021o(Object obj, long j6, Object obj2) {
        f2381c.m1006p(obj, j6, obj2);
    }
}
