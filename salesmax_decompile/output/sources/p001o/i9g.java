package p001o;

import java.lang.reflect.Field;
import java.security.AccessController;
import java.security.PrivilegedActionException;
import java.security.PrivilegedExceptionAction;
import java.util.Random;
import sun.misc.Unsafe;

/* loaded from: classes3.dex */
public abstract class i9g extends Number {

    /* renamed from: d */
    public static final ThreadLocal f28289d = new ThreadLocal();

    /* renamed from: e */
    public static final Random f28290e = new Random();

    /* renamed from: f */
    public static final int f28291f = Runtime.getRuntime().availableProcessors();

    /* renamed from: g */
    public static final Unsafe f28292g;

    /* renamed from: h */
    public static final long f28293h;

    /* renamed from: q */
    public static final long f28294q;

    /* renamed from: a */
    public volatile transient C14227b[] f28295a;

    /* renamed from: b */
    public volatile transient long f28296b;

    /* renamed from: c */
    public volatile transient int f28297c;

    /* renamed from: o.i9g$a */
    public class C14226a implements PrivilegedExceptionAction {
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
            throw new NoSuchFieldError("the Unsafe");
        }
    }

    /* renamed from: o.i9g$b */
    public static final class C14227b {

        /* renamed from: b */
        public static final Unsafe f28298b;

        /* renamed from: c */
        public static final long f28299c;

        /* renamed from: a */
        public volatile long f28300a;

        static {
            try {
                Unsafe unsafeM31775f = i9g.m31775f();
                f28298b = unsafeM31775f;
                f28299c = unsafeM31775f.objectFieldOffset(C14227b.class.getDeclaredField("a"));
            } catch (Exception e) {
                throw new Error(e);
            }
        }

        public C14227b(long j) {
            this.f28300a = j;
        }

        /* renamed from: a */
        public final boolean m31780a(long j, long j2) {
            return f28298b.compareAndSwapLong(this, f28299c, j, j2);
        }
    }

    static {
        try {
            Unsafe unsafeM31775f = m31775f();
            f28292g = unsafeM31775f;
            f28293h = unsafeM31775f.objectFieldOffset(i9g.class.getDeclaredField("b"));
            f28294q = unsafeM31775f.objectFieldOffset(i9g.class.getDeclaredField("c"));
        } catch (Exception e) {
            throw new Error(e);
        }
    }

    /* renamed from: f */
    public static Unsafe m31775f() {
        try {
            try {
                return Unsafe.getUnsafe();
            } catch (PrivilegedActionException e) {
                throw new RuntimeException("Could not initialize intrinsics", e.getCause());
            }
        } catch (SecurityException unused) {
            return (Unsafe) AccessController.doPrivileged(new C14226a());
        }
    }

    /* renamed from: c */
    public final boolean m31776c(long j, long j2) {
        return f28292g.compareAndSwapLong(this, f28293h, j, j2);
    }

    /* renamed from: d */
    public final boolean m31777d() {
        return f28292g.compareAndSwapInt(this, f28294q, 0, 1);
    }

    /* renamed from: e */
    public abstract long mo17347e(long j, long j2);

    /* JADX WARN: Removed duplicated region for block: B:117:0x0023 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x00ee A[SYNTHETIC] */
    /* renamed from: g */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m31778g(long j, int[] iArr, boolean z) {
        int iNextInt;
        int[] iArr2;
        boolean z2;
        int length;
        boolean z3;
        int length2;
        if (iArr == null) {
            iArr2 = new int[1];
            f28289d.set(iArr2);
            iNextInt = f28290e.nextInt();
            if (iNextInt == 0) {
                iNextInt = 1;
            }
            iArr2[0] = iNextInt;
        } else {
            iNextInt = iArr[0];
            iArr2 = iArr;
        }
        boolean z4 = false;
        int i = iNextInt;
        boolean z5 = z;
        while (true) {
            C14227b[] c14227bArr = this.f28295a;
            if (c14227bArr != null && (length = c14227bArr.length) > 0) {
                C14227b c14227b = c14227bArr[(length - 1) & i];
                if (c14227b == null) {
                    if (this.f28297c == 0) {
                        C14227b c14227b2 = new C14227b(j);
                        if (this.f28297c == 0 && m31777d()) {
                            try {
                                C14227b[] c14227bArr2 = this.f28295a;
                                if (c14227bArr2 == null || (length2 = c14227bArr2.length) <= 0) {
                                    z3 = false;
                                    if (!z3) {
                                        return;
                                    }
                                } else {
                                    int i2 = (length2 - 1) & i;
                                    if (c14227bArr2[i2] == null) {
                                        c14227bArr2[i2] = c14227b2;
                                        z3 = true;
                                    }
                                    if (!z3) {
                                    }
                                }
                            } finally {
                            }
                        }
                    }
                    z4 = false;
                } else if (z5) {
                    long j2 = c14227b.f28300a;
                    if (c14227b.m31780a(j2, mo17347e(j2, j))) {
                        return;
                    }
                    if (length >= f28291f || this.f28295a != c14227bArr) {
                        z4 = false;
                    } else if (!z4) {
                        z4 = true;
                    } else if (this.f28297c == 0 && m31777d()) {
                        try {
                            if (this.f28295a == c14227bArr) {
                                C14227b[] c14227bArr3 = new C14227b[length << 1];
                                for (int i3 = 0; i3 < length; i3++) {
                                    c14227bArr3[i3] = c14227bArr[i3];
                                }
                                this.f28295a = c14227bArr3;
                            }
                            this.f28297c = 0;
                            z4 = false;
                        } finally {
                        }
                    }
                } else {
                    z5 = true;
                }
                int i4 = i ^ (i << 13);
                int i5 = i4 ^ (i4 >>> 17);
                i = i5 ^ (i5 << 5);
                iArr2[0] = i;
            } else if (this.f28297c == 0 && this.f28295a == c14227bArr && m31777d()) {
                try {
                    if (this.f28295a == c14227bArr) {
                        C14227b[] c14227bArr4 = new C14227b[2];
                        c14227bArr4[i & 1] = new C14227b(j);
                        this.f28295a = c14227bArr4;
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    if (z2) {
                        return;
                    }
                } finally {
                }
            } else {
                long j3 = this.f28296b;
                if (m31776c(j3, mo17347e(j3, j))) {
                    return;
                }
            }
        }
    }
}
