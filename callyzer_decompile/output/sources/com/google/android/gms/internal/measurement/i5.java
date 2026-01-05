package com.google.android.gms.internal.measurement;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public abstract class i5 extends t4 {
    private static final Map zzd = new ConcurrentHashMap();
    private int zzb;
    protected m6 zzc;

    public i5() {
        this.zza = 0;
        this.zzb = -1;
        this.zzc = m6.f6295f;
    }

    /* renamed from: l */
    public static i5 m3331l(Class cls) throws ClassNotFoundException {
        Map map = zzd;
        i5 i5Var = (i5) map.get(cls);
        if (i5Var == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                i5Var = (i5) map.get(cls);
            } catch (ClassNotFoundException e2) {
                throw new IllegalStateException("Class initialization cannot fail.", e2);
            }
        }
        if (i5Var != null) {
            return i5Var;
        }
        i5 i5Var2 = (i5) ((i5) r6.m3620e(cls)).mo3102o(6);
        if (i5Var2 == null) {
            throw new IllegalStateException();
        }
        map.put(cls, i5Var2);
        return i5Var2;
    }

    /* renamed from: m */
    public static void m3332m(Class cls, i5 i5Var) {
        i5Var.m3337f();
        zzd.put(cls, i5Var);
    }

    /* renamed from: n */
    public static Object m3333n(Method method, i5 i5Var, Object... objArr) {
        try {
            return method.invoke(i5Var, objArr);
        } catch (IllegalAccessException e2) {
            throw new RuntimeException("Couldn't use Java reflection to implement protocol message reflection.", e2);
        } catch (InvocationTargetException e10) {
            Throwable cause = e10.getCause();
            if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            }
            if (cause instanceof Error) {
                throw ((Error) cause);
            }
            throw new RuntimeException("Unexpected exception thrown by generated accessor method.", cause);
        }
    }

    @Override // com.google.android.gms.internal.measurement.t4
    /* renamed from: b */
    public final int mo3334b(i6 i6Var) {
        if (m3336e()) {
            int iMo3166d = i6Var.mo3166d(this);
            if (iMo3166d >= 0) {
                return iMo3166d;
            }
            StringBuilder sb2 = new StringBuilder(String.valueOf(iMo3166d).length() + 42);
            sb2.append("serialized size must be non-negative, was ");
            sb2.append(iMo3166d);
            throw new IllegalStateException(sb2.toString());
        }
        int i10 = this.zzb & Integer.MAX_VALUE;
        if (i10 != Integer.MAX_VALUE) {
            return i10;
        }
        int iMo3166d2 = i6Var.mo3166d(this);
        if (iMo3166d2 >= 0) {
            this.zzb = (this.zzb & Integer.MIN_VALUE) | iMo3166d2;
            return iMo3166d2;
        }
        StringBuilder sb3 = new StringBuilder(String.valueOf(iMo3166d2).length() + 42);
        sb3.append("serialized size must be non-negative, was ");
        sb3.append(iMo3166d2);
        throw new IllegalStateException(sb3.toString());
    }

    /* renamed from: d */
    public final void m3335d(a5 a5Var) {
        i6 i6VarM3269a = f6.f6193c.m3269a(getClass());
        v5 v5Var = a5Var.f6059a;
        if (v5Var == null) {
            v5Var = new v5(a5Var);
        }
        i6VarM3269a.mo3167e(this, v5Var);
    }

    /* renamed from: e */
    public final boolean m3336e() {
        return (this.zzb & Integer.MIN_VALUE) != 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return f6.f6193c.m3269a(getClass()).mo3168f(this, (i5) obj);
    }

    /* renamed from: f */
    public final void m3337f() {
        this.zzb &= Integer.MAX_VALUE;
    }

    /* renamed from: g */
    public final void m3338g() {
        f6.f6193c.m3269a(getClass()).mo3169g(this);
        m3337f();
    }

    /* renamed from: h */
    public final h5 m3339h() {
        return (h5) mo3102o(5);
    }

    public final int hashCode() {
        if (m3336e()) {
            return f6.f6193c.m3269a(getClass()).mo3171i(this);
        }
        int i10 = this.zza;
        if (i10 != 0) {
            return i10;
        }
        int iMo3171i = f6.f6193c.m3269a(getClass()).mo3171i(this);
        this.zza = iMo3171i;
        return iMo3171i;
    }

    /* renamed from: i */
    public final h5 m3340i() {
        h5 h5Var = (h5) mo3102o(5);
        h5Var.m3307f(this);
        return h5Var;
    }

    /* renamed from: j */
    public final void m3341j() {
        this.zzb = (this.zzb & Integer.MIN_VALUE) | Integer.MAX_VALUE;
    }

    /* renamed from: k */
    public final int m3342k() {
        if (m3336e()) {
            int iMo3166d = f6.f6193c.m3269a(getClass()).mo3166d(this);
            if (iMo3166d >= 0) {
                return iMo3166d;
            }
            StringBuilder sb2 = new StringBuilder(String.valueOf(iMo3166d).length() + 42);
            sb2.append("serialized size must be non-negative, was ");
            sb2.append(iMo3166d);
            throw new IllegalStateException(sb2.toString());
        }
        int i10 = this.zzb & Integer.MAX_VALUE;
        if (i10 != Integer.MAX_VALUE) {
            return i10;
        }
        int iMo3166d2 = f6.f6193c.m3269a(getClass()).mo3166d(this);
        if (iMo3166d2 >= 0) {
            this.zzb = (this.zzb & Integer.MIN_VALUE) | iMo3166d2;
            return iMo3166d2;
        }
        StringBuilder sb3 = new StringBuilder(String.valueOf(iMo3166d2).length() + 42);
        sb3.append("serialized size must be non-negative, was ");
        sb3.append(iMo3166d2);
        throw new IllegalStateException(sb3.toString());
    }

    /* renamed from: o */
    public abstract Object mo3102o(int i10);

    public final String toString() {
        String string = super.toString();
        char[] cArr = a6.f6063a;
        StringBuilder sb2 = new StringBuilder();
        sb2.append("# ");
        sb2.append(string);
        a6.m3130b(this, sb2, 0);
        return sb2.toString();
    }
}
