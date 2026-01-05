package p001o;

import com.google.firebase.perf.util.Constants;
import java.lang.reflect.Field;
import java.nio.Buffer;
import java.nio.ByteOrder;
import java.security.AccessController;
import java.security.PrivilegedExceptionAction;
import java.util.logging.Level;
import java.util.logging.Logger;
import sun.misc.Unsafe;

/* loaded from: classes4.dex */
public abstract class a5i {

    /* renamed from: a */
    public static final Logger f14165a = Logger.getLogger(a5i.class.getName());

    /* renamed from: b */
    public static final Unsafe f14166b = m16447B();

    /* renamed from: c */
    public static final Class f14167c = cd0.m20877b();

    /* renamed from: d */
    public static final boolean f14168d = m16475m(Long.TYPE);

    /* renamed from: e */
    public static final boolean f14169e = m16475m(Integer.TYPE);

    /* renamed from: f */
    public static final AbstractC12097e f14170f = m16488z();

    /* renamed from: g */
    public static final boolean f14171g = m16462Q();

    /* renamed from: h */
    public static final boolean f14172h = m16461P();

    /* renamed from: i */
    public static final long f14173i;

    /* renamed from: j */
    public static final long f14174j;

    /* renamed from: k */
    public static final long f14175k;

    /* renamed from: l */
    public static final long f14176l;

    /* renamed from: m */
    public static final long f14177m;

    /* renamed from: n */
    public static final long f14178n;

    /* renamed from: o */
    public static final long f14179o;

    /* renamed from: p */
    public static final long f14180p;

    /* renamed from: q */
    public static final long f14181q;

    /* renamed from: r */
    public static final long f14182r;

    /* renamed from: s */
    public static final long f14183s;

    /* renamed from: t */
    public static final long f14184t;

    /* renamed from: u */
    public static final long f14185u;

    /* renamed from: v */
    public static final long f14186v;

    /* renamed from: w */
    public static final int f14187w;

    /* renamed from: x */
    public static final boolean f14188x;

    /* renamed from: o.a5i$a */
    public class C12093a implements PrivilegedExceptionAction {
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

    /* renamed from: o.a5i$b */
    public static final class C12094b extends AbstractC12097e {
        public C12094b(Unsafe unsafe) {
            super(unsafe);
        }

        @Override // p001o.a5i.AbstractC12097e
        /* renamed from: c */
        public boolean mo16490c(Object obj, long j) {
            return a5i.f14188x ? a5i.m16479q(obj, j) : a5i.m16480r(obj, j);
        }

        @Override // p001o.a5i.AbstractC12097e
        /* renamed from: d */
        public byte mo16491d(Object obj, long j) {
            return a5i.f14188x ? a5i.m16482t(obj, j) : a5i.m16483u(obj, j);
        }

        @Override // p001o.a5i.AbstractC12097e
        /* renamed from: e */
        public double mo16492e(Object obj, long j) {
            return Double.longBitsToDouble(m16501h(obj, j));
        }

        @Override // p001o.a5i.AbstractC12097e
        /* renamed from: f */
        public float mo16493f(Object obj, long j) {
            return Float.intBitsToFloat(m16500g(obj, j));
        }

        @Override // p001o.a5i.AbstractC12097e
        /* renamed from: k */
        public void mo16494k(Object obj, long j, boolean z) {
            if (a5i.f14188x) {
                a5i.m16451F(obj, j, z);
            } else {
                a5i.m16452G(obj, j, z);
            }
        }

        @Override // p001o.a5i.AbstractC12097e
        /* renamed from: l */
        public void mo16495l(Object obj, long j, byte b) {
            if (a5i.f14188x) {
                a5i.m16454I(obj, j, b);
            } else {
                a5i.m16455J(obj, j, b);
            }
        }

        @Override // p001o.a5i.AbstractC12097e
        /* renamed from: m */
        public void mo16496m(Object obj, long j, double d) {
            m16505p(obj, j, Double.doubleToLongBits(d));
        }

        @Override // p001o.a5i.AbstractC12097e
        /* renamed from: n */
        public void mo16497n(Object obj, long j, float f) {
            m16504o(obj, j, Float.floatToIntBits(f));
        }
    }

    /* renamed from: o.a5i$c */
    public static final class C12095c extends AbstractC12097e {
        public C12095c(Unsafe unsafe) {
            super(unsafe);
        }

        @Override // p001o.a5i.AbstractC12097e
        /* renamed from: c */
        public boolean mo16490c(Object obj, long j) {
            return a5i.f14188x ? a5i.m16479q(obj, j) : a5i.m16480r(obj, j);
        }

        @Override // p001o.a5i.AbstractC12097e
        /* renamed from: d */
        public byte mo16491d(Object obj, long j) {
            return a5i.f14188x ? a5i.m16482t(obj, j) : a5i.m16483u(obj, j);
        }

        @Override // p001o.a5i.AbstractC12097e
        /* renamed from: e */
        public double mo16492e(Object obj, long j) {
            return Double.longBitsToDouble(m16501h(obj, j));
        }

        @Override // p001o.a5i.AbstractC12097e
        /* renamed from: f */
        public float mo16493f(Object obj, long j) {
            return Float.intBitsToFloat(m16500g(obj, j));
        }

        @Override // p001o.a5i.AbstractC12097e
        /* renamed from: k */
        public void mo16494k(Object obj, long j, boolean z) {
            if (a5i.f14188x) {
                a5i.m16451F(obj, j, z);
            } else {
                a5i.m16452G(obj, j, z);
            }
        }

        @Override // p001o.a5i.AbstractC12097e
        /* renamed from: l */
        public void mo16495l(Object obj, long j, byte b) {
            if (a5i.f14188x) {
                a5i.m16454I(obj, j, b);
            } else {
                a5i.m16455J(obj, j, b);
            }
        }

        @Override // p001o.a5i.AbstractC12097e
        /* renamed from: m */
        public void mo16496m(Object obj, long j, double d) {
            m16505p(obj, j, Double.doubleToLongBits(d));
        }

        @Override // p001o.a5i.AbstractC12097e
        /* renamed from: n */
        public void mo16497n(Object obj, long j, float f) {
            m16504o(obj, j, Float.floatToIntBits(f));
        }
    }

    /* renamed from: o.a5i$d */
    public static final class C12096d extends AbstractC12097e {
        public C12096d(Unsafe unsafe) {
            super(unsafe);
        }

        @Override // p001o.a5i.AbstractC12097e
        /* renamed from: c */
        public boolean mo16490c(Object obj, long j) {
            return this.f14189a.getBoolean(obj, j);
        }

        @Override // p001o.a5i.AbstractC12097e
        /* renamed from: d */
        public byte mo16491d(Object obj, long j) {
            return this.f14189a.getByte(obj, j);
        }

        @Override // p001o.a5i.AbstractC12097e
        /* renamed from: e */
        public double mo16492e(Object obj, long j) {
            return this.f14189a.getDouble(obj, j);
        }

        @Override // p001o.a5i.AbstractC12097e
        /* renamed from: f */
        public float mo16493f(Object obj, long j) {
            return this.f14189a.getFloat(obj, j);
        }

        @Override // p001o.a5i.AbstractC12097e
        /* renamed from: k */
        public void mo16494k(Object obj, long j, boolean z) {
            this.f14189a.putBoolean(obj, j, z);
        }

        @Override // p001o.a5i.AbstractC12097e
        /* renamed from: l */
        public void mo16495l(Object obj, long j, byte b) {
            this.f14189a.putByte(obj, j, b);
        }

        @Override // p001o.a5i.AbstractC12097e
        /* renamed from: m */
        public void mo16496m(Object obj, long j, double d) {
            this.f14189a.putDouble(obj, j, d);
        }

        @Override // p001o.a5i.AbstractC12097e
        /* renamed from: n */
        public void mo16497n(Object obj, long j, float f) {
            this.f14189a.putFloat(obj, j, f);
        }
    }

    /* renamed from: o.a5i$e */
    public static abstract class AbstractC12097e {

        /* renamed from: a */
        public Unsafe f14189a;

        public AbstractC12097e(Unsafe unsafe) {
            this.f14189a = unsafe;
        }

        /* renamed from: a */
        public final int m16498a(Class cls) {
            return this.f14189a.arrayBaseOffset(cls);
        }

        /* renamed from: b */
        public final int m16499b(Class cls) {
            return this.f14189a.arrayIndexScale(cls);
        }

        /* renamed from: c */
        public abstract boolean mo16490c(Object obj, long j);

        /* renamed from: d */
        public abstract byte mo16491d(Object obj, long j);

        /* renamed from: e */
        public abstract double mo16492e(Object obj, long j);

        /* renamed from: f */
        public abstract float mo16493f(Object obj, long j);

        /* renamed from: g */
        public final int m16500g(Object obj, long j) {
            return this.f14189a.getInt(obj, j);
        }

        /* renamed from: h */
        public final long m16501h(Object obj, long j) {
            return this.f14189a.getLong(obj, j);
        }

        /* renamed from: i */
        public final Object m16502i(Object obj, long j) {
            return this.f14189a.getObject(obj, j);
        }

        /* renamed from: j */
        public final long m16503j(Field field) {
            return this.f14189a.objectFieldOffset(field);
        }

        /* renamed from: k */
        public abstract void mo16494k(Object obj, long j, boolean z);

        /* renamed from: l */
        public abstract void mo16495l(Object obj, long j, byte b);

        /* renamed from: m */
        public abstract void mo16496m(Object obj, long j, double d);

        /* renamed from: n */
        public abstract void mo16497n(Object obj, long j, float f);

        /* renamed from: o */
        public final void m16504o(Object obj, long j, int i) {
            this.f14189a.putInt(obj, j, i);
        }

        /* renamed from: p */
        public final void m16505p(Object obj, long j, long j2) {
            this.f14189a.putLong(obj, j, j2);
        }

        /* renamed from: q */
        public final void m16506q(Object obj, long j, Object obj2) {
            this.f14189a.putObject(obj, j, obj2);
        }
    }

    static {
        long jM16472j = m16472j(byte[].class);
        f14173i = jM16472j;
        f14174j = m16472j(boolean[].class);
        f14175k = m16473k(boolean[].class);
        f14176l = m16472j(int[].class);
        f14177m = m16473k(int[].class);
        f14178n = m16472j(long[].class);
        f14179o = m16473k(long[].class);
        f14180p = m16472j(float[].class);
        f14181q = m16473k(float[].class);
        f14182r = m16472j(double[].class);
        f14183s = m16473k(double[].class);
        f14184t = m16472j(Object[].class);
        f14185u = m16473k(Object[].class);
        f14186v = m16477o(m16474l());
        f14187w = (int) (jM16472j & 7);
        f14188x = ByteOrder.nativeOrder() == ByteOrder.BIG_ENDIAN;
    }

    /* renamed from: A */
    public static Object m16446A(Object obj, long j) {
        return f14170f.m16502i(obj, j);
    }

    /* renamed from: B */
    public static Unsafe m16447B() {
        try {
            return (Unsafe) AccessController.doPrivileged(new C12093a());
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: C */
    public static boolean m16448C() {
        return f14172h;
    }

    /* renamed from: D */
    public static boolean m16449D() {
        return f14171g;
    }

    /* renamed from: E */
    public static void m16450E(Object obj, long j, boolean z) {
        f14170f.mo16494k(obj, j, z);
    }

    /* renamed from: F */
    public static void m16451F(Object obj, long j, boolean z) {
        m16454I(obj, j, z ? (byte) 1 : (byte) 0);
    }

    /* renamed from: G */
    public static void m16452G(Object obj, long j, boolean z) {
        m16455J(obj, j, z ? (byte) 1 : (byte) 0);
    }

    /* renamed from: H */
    public static void m16453H(byte[] bArr, long j, byte b) {
        f14170f.mo16495l(bArr, f14173i + j, b);
    }

    /* renamed from: I */
    public static void m16454I(Object obj, long j, byte b) {
        long j2 = (-4) & j;
        int iM16486x = m16486x(obj, j2);
        int i = ((~((int) j)) & 3) << 3;
        m16458M(obj, j2, ((255 & b) << i) | (iM16486x & (~(Constants.MAX_HOST_LENGTH << i))));
    }

    /* renamed from: J */
    public static void m16455J(Object obj, long j, byte b) {
        long j2 = (-4) & j;
        int i = (((int) j) & 3) << 3;
        m16458M(obj, j2, ((255 & b) << i) | (m16486x(obj, j2) & (~(Constants.MAX_HOST_LENGTH << i))));
    }

    /* renamed from: K */
    public static void m16456K(Object obj, long j, double d) {
        f14170f.mo16496m(obj, j, d);
    }

    /* renamed from: L */
    public static void m16457L(Object obj, long j, float f) {
        f14170f.mo16497n(obj, j, f);
    }

    /* renamed from: M */
    public static void m16458M(Object obj, long j, int i) {
        f14170f.m16504o(obj, j, i);
    }

    /* renamed from: N */
    public static void m16459N(Object obj, long j, long j2) {
        f14170f.m16505p(obj, j, j2);
    }

    /* renamed from: O */
    public static void m16460O(Object obj, long j, Object obj2) {
        f14170f.m16506q(obj, j, obj2);
    }

    /* renamed from: P */
    public static boolean m16461P() {
        Unsafe unsafe = f14166b;
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
            if (cd0.m20878c()) {
                return true;
            }
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
            f14165a.log(Level.WARNING, "platform method missing - proto runtime falling back to safer methods: " + th);
            return false;
        }
    }

    /* renamed from: Q */
    public static boolean m16462Q() {
        Unsafe unsafe = f14166b;
        if (unsafe == null) {
            return false;
        }
        try {
            Class<?> cls = unsafe.getClass();
            cls.getMethod("objectFieldOffset", Field.class);
            Class<?> cls2 = Long.TYPE;
            cls.getMethod("getLong", Object.class, cls2);
            if (m16474l() == null) {
                return false;
            }
            if (cd0.m20878c()) {
                return true;
            }
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
            f14165a.log(Level.WARNING, "platform method missing - proto runtime falling back to safer methods: " + th);
            return false;
        }
    }

    /* renamed from: i */
    public static Object m16471i(Class cls) {
        try {
            return f14166b.allocateInstance(cls);
        } catch (InstantiationException e) {
            throw new IllegalStateException(e);
        }
    }

    /* renamed from: j */
    public static int m16472j(Class cls) {
        if (f14172h) {
            return f14170f.m16498a(cls);
        }
        return -1;
    }

    /* renamed from: k */
    public static int m16473k(Class cls) {
        if (f14172h) {
            return f14170f.m16499b(cls);
        }
        return -1;
    }

    /* renamed from: l */
    public static Field m16474l() {
        Field fieldM16476n;
        if (cd0.m20878c() && (fieldM16476n = m16476n(Buffer.class, "effectiveDirectAddress")) != null) {
            return fieldM16476n;
        }
        Field fieldM16476n2 = m16476n(Buffer.class, "address");
        if (fieldM16476n2 == null || fieldM16476n2.getType() != Long.TYPE) {
            return null;
        }
        return fieldM16476n2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: m */
    public static boolean m16475m(Class cls) {
        if (!cd0.m20878c()) {
            return false;
        }
        try {
            Class cls2 = f14167c;
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
    public static Field m16476n(Class cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: o */
    public static long m16477o(Field field) {
        AbstractC12097e abstractC12097e;
        if (field == null || (abstractC12097e = f14170f) == null) {
            return -1L;
        }
        return abstractC12097e.m16503j(field);
    }

    /* renamed from: p */
    public static boolean m16478p(Object obj, long j) {
        return f14170f.mo16490c(obj, j);
    }

    /* renamed from: q */
    public static boolean m16479q(Object obj, long j) {
        return m16482t(obj, j) != 0;
    }

    /* renamed from: r */
    public static boolean m16480r(Object obj, long j) {
        return m16483u(obj, j) != 0;
    }

    /* renamed from: s */
    public static byte m16481s(byte[] bArr, long j) {
        return f14170f.mo16491d(bArr, f14173i + j);
    }

    /* renamed from: t */
    public static byte m16482t(Object obj, long j) {
        return (byte) ((m16486x(obj, (-4) & j) >>> ((int) (((~j) & 3) << 3))) & Constants.MAX_HOST_LENGTH);
    }

    /* renamed from: u */
    public static byte m16483u(Object obj, long j) {
        return (byte) ((m16486x(obj, (-4) & j) >>> ((int) ((j & 3) << 3))) & Constants.MAX_HOST_LENGTH);
    }

    /* renamed from: v */
    public static double m16484v(Object obj, long j) {
        return f14170f.mo16492e(obj, j);
    }

    /* renamed from: w */
    public static float m16485w(Object obj, long j) {
        return f14170f.mo16493f(obj, j);
    }

    /* renamed from: x */
    public static int m16486x(Object obj, long j) {
        return f14170f.m16500g(obj, j);
    }

    /* renamed from: y */
    public static long m16487y(Object obj, long j) {
        return f14170f.m16501h(obj, j);
    }

    /* renamed from: z */
    public static AbstractC12097e m16488z() {
        Unsafe unsafe = f14166b;
        if (unsafe == null) {
            return null;
        }
        if (!cd0.m20878c()) {
            return new C12096d(unsafe);
        }
        if (f14168d) {
            return new C12095c(unsafe);
        }
        if (f14169e) {
            return new C12094b(unsafe);
        }
        return null;
    }
}
