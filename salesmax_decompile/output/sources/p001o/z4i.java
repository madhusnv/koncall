package p001o;

import com.google.firebase.perf.util.Constants;
import java.lang.reflect.Field;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.security.AccessController;
import java.security.PrivilegedExceptionAction;
import java.util.logging.Level;
import java.util.logging.Logger;
import sun.misc.Unsafe;

/* loaded from: classes6.dex */
public abstract class z4i {

    /* renamed from: a */
    public static final Unsafe f56523a = m58696H();

    /* renamed from: b */
    public static final Class f56524b = bd0.m18626b();

    /* renamed from: c */
    public static final boolean f56525c = m58729q(Long.TYPE);

    /* renamed from: d */
    public static final boolean f56526d = m58729q(Integer.TYPE);

    /* renamed from: e */
    public static final AbstractC18557e f56527e = m58694F();

    /* renamed from: f */
    public static final boolean f56528f = m58712X();

    /* renamed from: g */
    public static final boolean f56529g = m58711W();

    /* renamed from: h */
    public static final long f56530h;

    /* renamed from: i */
    public static final long f56531i;

    /* renamed from: j */
    public static final long f56532j;

    /* renamed from: k */
    public static final long f56533k;

    /* renamed from: l */
    public static final long f56534l;

    /* renamed from: m */
    public static final long f56535m;

    /* renamed from: n */
    public static final long f56536n;

    /* renamed from: o */
    public static final long f56537o;

    /* renamed from: p */
    public static final long f56538p;

    /* renamed from: q */
    public static final long f56539q;

    /* renamed from: r */
    public static final long f56540r;

    /* renamed from: s */
    public static final long f56541s;

    /* renamed from: t */
    public static final long f56542t;

    /* renamed from: u */
    public static final long f56543u;

    /* renamed from: v */
    public static final int f56544v;

    /* renamed from: w */
    public static final boolean f56545w;

    /* renamed from: o.z4i$a */
    public static class C18553a implements PrivilegedExceptionAction {
        @Override // java.security.PrivilegedExceptionAction
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Unsafe run() throws IllegalAccessException, SecurityException, IllegalArgumentException {
            for (Field field : Unsafe.class.getDeclaredFields()) {
                field.setAccessible(true);
                Object obj = field.get(null);
                if (Unsafe.class.isInstance(obj)) {
                    return (Unsafe) Unsafe.class.cast(obj);
                }
            }
            return null;
        }
    }

    /* renamed from: o.z4i$b */
    public static final class C18554b extends AbstractC18557e {
        public C18554b(Unsafe unsafe) {
            super(unsafe);
        }

        @Override // p001o.z4i.AbstractC18557e
        /* renamed from: c */
        public void mo58740c(long j, byte[] bArr, long j2, long j3) {
            throw new UnsupportedOperationException();
        }

        @Override // p001o.z4i.AbstractC18557e
        /* renamed from: d */
        public boolean mo58741d(Object obj, long j) {
            return z4i.f56545w ? z4i.m58733u(obj, j) : z4i.m58734v(obj, j);
        }

        @Override // p001o.z4i.AbstractC18557e
        /* renamed from: e */
        public byte mo58742e(long j) {
            throw new UnsupportedOperationException();
        }

        @Override // p001o.z4i.AbstractC18557e
        /* renamed from: f */
        public byte mo58743f(Object obj, long j) {
            return z4i.f56545w ? z4i.m58737y(obj, j) : z4i.m58738z(obj, j);
        }

        @Override // p001o.z4i.AbstractC18557e
        /* renamed from: g */
        public double mo58744g(Object obj, long j) {
            return Double.longBitsToDouble(m58756k(obj, j));
        }

        @Override // p001o.z4i.AbstractC18557e
        /* renamed from: h */
        public float mo58745h(Object obj, long j) {
            return Float.intBitsToFloat(m58755i(obj, j));
        }

        @Override // p001o.z4i.AbstractC18557e
        /* renamed from: j */
        public long mo58746j(long j) {
            throw new UnsupportedOperationException();
        }

        @Override // p001o.z4i.AbstractC18557e
        /* renamed from: n */
        public void mo58747n(Object obj, long j, boolean z) {
            if (z4i.f56545w) {
                z4i.m58701M(obj, j, z);
            } else {
                z4i.m58702N(obj, j, z);
            }
        }

        @Override // p001o.z4i.AbstractC18557e
        /* renamed from: o */
        public void mo58748o(Object obj, long j, byte b) {
            if (z4i.f56545w) {
                z4i.m58704P(obj, j, b);
            } else {
                z4i.m58705Q(obj, j, b);
            }
        }

        @Override // p001o.z4i.AbstractC18557e
        /* renamed from: p */
        public void mo58749p(Object obj, long j, double d) {
            m58760s(obj, j, Double.doubleToLongBits(d));
        }

        @Override // p001o.z4i.AbstractC18557e
        /* renamed from: q */
        public void mo58750q(Object obj, long j, float f) {
            m58759r(obj, j, Float.floatToIntBits(f));
        }

        @Override // p001o.z4i.AbstractC18557e
        /* renamed from: v */
        public boolean mo58751v() {
            return false;
        }
    }

    /* renamed from: o.z4i$c */
    public static final class C18555c extends AbstractC18557e {
        public C18555c(Unsafe unsafe) {
            super(unsafe);
        }

        @Override // p001o.z4i.AbstractC18557e
        /* renamed from: c */
        public void mo58740c(long j, byte[] bArr, long j2, long j3) {
            throw new UnsupportedOperationException();
        }

        @Override // p001o.z4i.AbstractC18557e
        /* renamed from: d */
        public boolean mo58741d(Object obj, long j) {
            return z4i.f56545w ? z4i.m58733u(obj, j) : z4i.m58734v(obj, j);
        }

        @Override // p001o.z4i.AbstractC18557e
        /* renamed from: e */
        public byte mo58742e(long j) {
            throw new UnsupportedOperationException();
        }

        @Override // p001o.z4i.AbstractC18557e
        /* renamed from: f */
        public byte mo58743f(Object obj, long j) {
            return z4i.f56545w ? z4i.m58737y(obj, j) : z4i.m58738z(obj, j);
        }

        @Override // p001o.z4i.AbstractC18557e
        /* renamed from: g */
        public double mo58744g(Object obj, long j) {
            return Double.longBitsToDouble(m58756k(obj, j));
        }

        @Override // p001o.z4i.AbstractC18557e
        /* renamed from: h */
        public float mo58745h(Object obj, long j) {
            return Float.intBitsToFloat(m58755i(obj, j));
        }

        @Override // p001o.z4i.AbstractC18557e
        /* renamed from: j */
        public long mo58746j(long j) {
            throw new UnsupportedOperationException();
        }

        @Override // p001o.z4i.AbstractC18557e
        /* renamed from: n */
        public void mo58747n(Object obj, long j, boolean z) {
            if (z4i.f56545w) {
                z4i.m58701M(obj, j, z);
            } else {
                z4i.m58702N(obj, j, z);
            }
        }

        @Override // p001o.z4i.AbstractC18557e
        /* renamed from: o */
        public void mo58748o(Object obj, long j, byte b) {
            if (z4i.f56545w) {
                z4i.m58704P(obj, j, b);
            } else {
                z4i.m58705Q(obj, j, b);
            }
        }

        @Override // p001o.z4i.AbstractC18557e
        /* renamed from: p */
        public void mo58749p(Object obj, long j, double d) {
            m58760s(obj, j, Double.doubleToLongBits(d));
        }

        @Override // p001o.z4i.AbstractC18557e
        /* renamed from: q */
        public void mo58750q(Object obj, long j, float f) {
            m58759r(obj, j, Float.floatToIntBits(f));
        }

        @Override // p001o.z4i.AbstractC18557e
        /* renamed from: v */
        public boolean mo58751v() {
            return false;
        }
    }

    /* renamed from: o.z4i$d */
    public static final class C18556d extends AbstractC18557e {
        public C18556d(Unsafe unsafe) {
            super(unsafe);
        }

        @Override // p001o.z4i.AbstractC18557e
        /* renamed from: c */
        public void mo58740c(long j, byte[] bArr, long j2, long j3) {
            this.f56546a.copyMemory((Object) null, j, bArr, z4i.f56530h + j2, j3);
        }

        @Override // p001o.z4i.AbstractC18557e
        /* renamed from: d */
        public boolean mo58741d(Object obj, long j) {
            return this.f56546a.getBoolean(obj, j);
        }

        @Override // p001o.z4i.AbstractC18557e
        /* renamed from: e */
        public byte mo58742e(long j) {
            return this.f56546a.getByte(j);
        }

        @Override // p001o.z4i.AbstractC18557e
        /* renamed from: f */
        public byte mo58743f(Object obj, long j) {
            return this.f56546a.getByte(obj, j);
        }

        @Override // p001o.z4i.AbstractC18557e
        /* renamed from: g */
        public double mo58744g(Object obj, long j) {
            return this.f56546a.getDouble(obj, j);
        }

        @Override // p001o.z4i.AbstractC18557e
        /* renamed from: h */
        public float mo58745h(Object obj, long j) {
            return this.f56546a.getFloat(obj, j);
        }

        @Override // p001o.z4i.AbstractC18557e
        /* renamed from: j */
        public long mo58746j(long j) {
            return this.f56546a.getLong(j);
        }

        @Override // p001o.z4i.AbstractC18557e
        /* renamed from: n */
        public void mo58747n(Object obj, long j, boolean z) {
            this.f56546a.putBoolean(obj, j, z);
        }

        @Override // p001o.z4i.AbstractC18557e
        /* renamed from: o */
        public void mo58748o(Object obj, long j, byte b) {
            this.f56546a.putByte(obj, j, b);
        }

        @Override // p001o.z4i.AbstractC18557e
        /* renamed from: p */
        public void mo58749p(Object obj, long j, double d) {
            this.f56546a.putDouble(obj, j, d);
        }

        @Override // p001o.z4i.AbstractC18557e
        /* renamed from: q */
        public void mo58750q(Object obj, long j, float f) {
            this.f56546a.putFloat(obj, j, f);
        }

        @Override // p001o.z4i.AbstractC18557e
        /* renamed from: u */
        public boolean mo58752u() {
            if (!super.mo58752u()) {
                return false;
            }
            try {
                Class<?> cls = this.f56546a.getClass();
                Class<?> cls2 = Long.TYPE;
                cls.getMethod("getByte", Object.class, cls2);
                cls.getMethod("putByte", Object.class, cls2, Byte.TYPE);
                cls.getMethod("getBoolean", Object.class, cls2);
                cls.getMethod("putBoolean", Object.class, cls2, Boolean.TYPE);
                cls.getMethod("getFloat", Object.class, cls2);
                cls.getMethod("putFloat", Object.class, cls2, Float.TYPE);
                cls.getMethod("getDouble", Object.class, cls2);
                cls.getMethod("putDouble", Object.class, cls2, Double.TYPE);
                return true;
            } catch (Throwable th) {
                z4i.m58699K(th);
                return false;
            }
        }

        @Override // p001o.z4i.AbstractC18557e
        /* renamed from: v */
        public boolean mo58751v() {
            if (!super.mo58751v()) {
                return false;
            }
            try {
                Class<?> cls = this.f56546a.getClass();
                Class<?> cls2 = Long.TYPE;
                cls.getMethod("getByte", cls2);
                cls.getMethod("putByte", cls2, Byte.TYPE);
                cls.getMethod("getInt", cls2);
                cls.getMethod("putInt", cls2, Integer.TYPE);
                cls.getMethod("getLong", cls2);
                cls.getMethod("putLong", cls2, cls2);
                cls.getMethod("copyMemory", cls2, cls2, cls2);
                cls.getMethod("copyMemory", Object.class, cls2, Object.class, cls2, cls2);
                return true;
            } catch (Throwable th) {
                z4i.m58699K(th);
                return false;
            }
        }
    }

    /* renamed from: o.z4i$e */
    public static abstract class AbstractC18557e {

        /* renamed from: a */
        public Unsafe f56546a;

        public AbstractC18557e(Unsafe unsafe) {
            this.f56546a = unsafe;
        }

        /* renamed from: a */
        public final int m58753a(Class cls) {
            return this.f56546a.arrayBaseOffset(cls);
        }

        /* renamed from: b */
        public final int m58754b(Class cls) {
            return this.f56546a.arrayIndexScale(cls);
        }

        /* renamed from: c */
        public abstract void mo58740c(long j, byte[] bArr, long j2, long j3);

        /* renamed from: d */
        public abstract boolean mo58741d(Object obj, long j);

        /* renamed from: e */
        public abstract byte mo58742e(long j);

        /* renamed from: f */
        public abstract byte mo58743f(Object obj, long j);

        /* renamed from: g */
        public abstract double mo58744g(Object obj, long j);

        /* renamed from: h */
        public abstract float mo58745h(Object obj, long j);

        /* renamed from: i */
        public final int m58755i(Object obj, long j) {
            return this.f56546a.getInt(obj, j);
        }

        /* renamed from: j */
        public abstract long mo58746j(long j);

        /* renamed from: k */
        public final long m58756k(Object obj, long j) {
            return this.f56546a.getLong(obj, j);
        }

        /* renamed from: l */
        public final Object m58757l(Object obj, long j) {
            return this.f56546a.getObject(obj, j);
        }

        /* renamed from: m */
        public final long m58758m(Field field) {
            return this.f56546a.objectFieldOffset(field);
        }

        /* renamed from: n */
        public abstract void mo58747n(Object obj, long j, boolean z);

        /* renamed from: o */
        public abstract void mo58748o(Object obj, long j, byte b);

        /* renamed from: p */
        public abstract void mo58749p(Object obj, long j, double d);

        /* renamed from: q */
        public abstract void mo58750q(Object obj, long j, float f);

        /* renamed from: r */
        public final void m58759r(Object obj, long j, int i) {
            this.f56546a.putInt(obj, j, i);
        }

        /* renamed from: s */
        public final void m58760s(Object obj, long j, long j2) {
            this.f56546a.putLong(obj, j, j2);
        }

        /* renamed from: t */
        public final void m58761t(Object obj, long j, Object obj2) {
            this.f56546a.putObject(obj, j, obj2);
        }

        /* renamed from: u */
        public boolean mo58752u() {
            Unsafe unsafe = this.f56546a;
            if (unsafe == null) {
                return false;
            }
            try {
                Class<?> cls = unsafe.getClass();
                cls.getMethod("objectFieldOffset", Field.class);
                cls.getMethod("arrayBaseOffset", Class.class);
                cls.getMethod("arrayIndexScale", Class.class);
                Class<?> cls2 = Long.TYPE;
                cls.getMethod("getInt", Object.class, cls2);
                cls.getMethod("putInt", Object.class, cls2, Integer.TYPE);
                cls.getMethod("getLong", Object.class, cls2);
                cls.getMethod("putLong", Object.class, cls2, cls2);
                cls.getMethod("getObject", Object.class, cls2);
                cls.getMethod("putObject", Object.class, cls2, Object.class);
                return true;
            } catch (Throwable th) {
                z4i.m58699K(th);
                return false;
            }
        }

        /* renamed from: v */
        public boolean mo58751v() {
            Unsafe unsafe = this.f56546a;
            if (unsafe == null) {
                return false;
            }
            try {
                Class<?> cls = unsafe.getClass();
                cls.getMethod("objectFieldOffset", Field.class);
                cls.getMethod("getLong", Object.class, Long.TYPE);
                return z4i.m58727o() != null;
            } catch (Throwable th) {
                z4i.m58699K(th);
                return false;
            }
        }
    }

    static {
        long jM58725m = m58725m(byte[].class);
        f56530h = jM58725m;
        f56531i = m58725m(boolean[].class);
        f56532j = m58726n(boolean[].class);
        f56533k = m58725m(int[].class);
        f56534l = m58726n(int[].class);
        f56535m = m58725m(long[].class);
        f56536n = m58726n(long[].class);
        f56537o = m58725m(float[].class);
        f56538p = m58726n(float[].class);
        f56539q = m58725m(double[].class);
        f56540r = m58726n(double[].class);
        f56541s = m58725m(Object[].class);
        f56542t = m58726n(Object[].class);
        f56543u = m58731s(m58727o());
        f56544v = (int) (jM58725m & 7);
        f56545w = ByteOrder.nativeOrder() == ByteOrder.BIG_ENDIAN;
    }

    /* renamed from: A */
    public static double m58689A(Object obj, long j) {
        return f56527e.mo58744g(obj, j);
    }

    /* renamed from: B */
    public static float m58690B(Object obj, long j) {
        return f56527e.mo58745h(obj, j);
    }

    /* renamed from: C */
    public static int m58691C(Object obj, long j) {
        return f56527e.m58755i(obj, j);
    }

    /* renamed from: D */
    public static long m58692D(long j) {
        return f56527e.mo58746j(j);
    }

    /* renamed from: E */
    public static long m58693E(Object obj, long j) {
        return f56527e.m58756k(obj, j);
    }

    /* renamed from: F */
    public static AbstractC18557e m58694F() {
        Unsafe unsafe = f56523a;
        if (unsafe == null) {
            return null;
        }
        if (!bd0.m18627c()) {
            return new C18556d(unsafe);
        }
        if (f56525c) {
            return new C18555c(unsafe);
        }
        if (f56526d) {
            return new C18554b(unsafe);
        }
        return null;
    }

    /* renamed from: G */
    public static Object m58695G(Object obj, long j) {
        return f56527e.m58757l(obj, j);
    }

    /* renamed from: H */
    public static Unsafe m58696H() {
        try {
            return (Unsafe) AccessController.doPrivileged(new C18553a());
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: I */
    public static boolean m58697I() {
        return f56529g;
    }

    /* renamed from: J */
    public static boolean m58698J() {
        return f56528f;
    }

    /* renamed from: K */
    public static void m58699K(Throwable th) {
        Logger.getLogger(z4i.class.getName()).log(Level.WARNING, "platform method missing - proto runtime falling back to safer methods: " + th);
    }

    /* renamed from: L */
    public static void m58700L(Object obj, long j, boolean z) {
        f56527e.mo58747n(obj, j, z);
    }

    /* renamed from: M */
    public static void m58701M(Object obj, long j, boolean z) {
        m58704P(obj, j, z ? (byte) 1 : (byte) 0);
    }

    /* renamed from: N */
    public static void m58702N(Object obj, long j, boolean z) {
        m58705Q(obj, j, z ? (byte) 1 : (byte) 0);
    }

    /* renamed from: O */
    public static void m58703O(byte[] bArr, long j, byte b) {
        f56527e.mo58748o(bArr, f56530h + j, b);
    }

    /* renamed from: P */
    public static void m58704P(Object obj, long j, byte b) {
        long j2 = (-4) & j;
        int iM58691C = m58691C(obj, j2);
        int i = ((~((int) j)) & 3) << 3;
        m58708T(obj, j2, ((255 & b) << i) | (iM58691C & (~(Constants.MAX_HOST_LENGTH << i))));
    }

    /* renamed from: Q */
    public static void m58705Q(Object obj, long j, byte b) {
        long j2 = (-4) & j;
        int i = (((int) j) & 3) << 3;
        m58708T(obj, j2, ((255 & b) << i) | (m58691C(obj, j2) & (~(Constants.MAX_HOST_LENGTH << i))));
    }

    /* renamed from: R */
    public static void m58706R(Object obj, long j, double d) {
        f56527e.mo58749p(obj, j, d);
    }

    /* renamed from: S */
    public static void m58707S(Object obj, long j, float f) {
        f56527e.mo58750q(obj, j, f);
    }

    /* renamed from: T */
    public static void m58708T(Object obj, long j, int i) {
        f56527e.m58759r(obj, j, i);
    }

    /* renamed from: U */
    public static void m58709U(Object obj, long j, long j2) {
        f56527e.m58760s(obj, j, j2);
    }

    /* renamed from: V */
    public static void m58710V(Object obj, long j, Object obj2) {
        f56527e.m58761t(obj, j, obj2);
    }

    /* renamed from: W */
    public static boolean m58711W() {
        AbstractC18557e abstractC18557e = f56527e;
        if (abstractC18557e == null) {
            return false;
        }
        return abstractC18557e.mo58752u();
    }

    /* renamed from: X */
    public static boolean m58712X() {
        AbstractC18557e abstractC18557e = f56527e;
        if (abstractC18557e == null) {
            return false;
        }
        return abstractC18557e.mo58751v();
    }

    /* renamed from: k */
    public static long m58723k(ByteBuffer byteBuffer) {
        return f56527e.m58756k(byteBuffer, f56543u);
    }

    /* renamed from: l */
    public static Object m58724l(Class cls) {
        try {
            return f56523a.allocateInstance(cls);
        } catch (InstantiationException e) {
            throw new IllegalStateException(e);
        }
    }

    /* renamed from: m */
    public static int m58725m(Class cls) {
        if (f56529g) {
            return f56527e.m58753a(cls);
        }
        return -1;
    }

    /* renamed from: n */
    public static int m58726n(Class cls) {
        if (f56529g) {
            return f56527e.m58754b(cls);
        }
        return -1;
    }

    /* renamed from: o */
    public static Field m58727o() {
        Field fieldM58730r;
        if (bd0.m18627c() && (fieldM58730r = m58730r(Buffer.class, "effectiveDirectAddress")) != null) {
            return fieldM58730r;
        }
        Field fieldM58730r2 = m58730r(Buffer.class, "address");
        if (fieldM58730r2 == null || fieldM58730r2.getType() != Long.TYPE) {
            return null;
        }
        return fieldM58730r2;
    }

    /* renamed from: p */
    public static void m58728p(long j, byte[] bArr, long j2, long j3) {
        f56527e.mo58740c(j, bArr, j2, j3);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: q */
    public static boolean m58729q(Class cls) {
        if (!bd0.m18627c()) {
            return false;
        }
        try {
            Class cls2 = f56524b;
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

    /* renamed from: r */
    public static Field m58730r(Class cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: s */
    public static long m58731s(Field field) {
        AbstractC18557e abstractC18557e;
        if (field == null || (abstractC18557e = f56527e) == null) {
            return -1L;
        }
        return abstractC18557e.m58758m(field);
    }

    /* renamed from: t */
    public static boolean m58732t(Object obj, long j) {
        return f56527e.mo58741d(obj, j);
    }

    /* renamed from: u */
    public static boolean m58733u(Object obj, long j) {
        return m58737y(obj, j) != 0;
    }

    /* renamed from: v */
    public static boolean m58734v(Object obj, long j) {
        return m58738z(obj, j) != 0;
    }

    /* renamed from: w */
    public static byte m58735w(long j) {
        return f56527e.mo58742e(j);
    }

    /* renamed from: x */
    public static byte m58736x(byte[] bArr, long j) {
        return f56527e.mo58743f(bArr, f56530h + j);
    }

    /* renamed from: y */
    public static byte m58737y(Object obj, long j) {
        return (byte) ((m58691C(obj, (-4) & j) >>> ((int) (((~j) & 3) << 3))) & Constants.MAX_HOST_LENGTH);
    }

    /* renamed from: z */
    public static byte m58738z(Object obj, long j) {
        return (byte) ((m58691C(obj, (-4) & j) >>> ((int) ((j & 3) << 3))) & Constants.MAX_HOST_LENGTH);
    }
}
