package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import mm.AbstractC4801l;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public abstract class e1 extends j0 {
    private static final Map zzb = new ConcurrentHashMap();
    protected i2 zzc;
    private int zzd;

    public e1() {
        this.zza = 0;
        this.zzd = -1;
        this.zzc = i2.f6561f;
    }

    /* renamed from: e */
    public static e1 m3831e(Class cls) throws ClassNotFoundException {
        Map map = zzb;
        e1 e1Var = (e1) map.get(cls);
        if (e1Var == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                e1Var = (e1) map.get(cls);
            } catch (ClassNotFoundException e2) {
                throw new IllegalStateException("Class initialization cannot fail.", e2);
            }
        }
        if (e1Var != null) {
            return e1Var;
        }
        e1 e1Var2 = (e1) ((e1) n2.m3921g(cls)).mo3803m(6, null);
        if (e1Var2 == null) {
            throw new IllegalStateException();
        }
        map.put(cls, e1Var2);
        return e1Var2;
    }

    /* renamed from: f */
    public static Object m3832f(Method method, e1 e1Var, Object... objArr) {
        try {
            return method.invoke(e1Var, objArr);
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

    /* renamed from: h */
    public static void m3833h(Class cls, e1 e1Var) {
        e1Var.m3838g();
        zzb.put(cls, e1Var);
    }

    /* renamed from: j */
    public static final boolean m3834j(e1 e1Var, boolean z6) {
        byte bByteValue = ((Byte) e1Var.mo3803m(1, null)).byteValue();
        if (bByteValue == 1) {
            return true;
        }
        if (bByteValue == 0) {
            return false;
        }
        boolean zMo3843b = y1.f6701c.m4007a(e1Var.getClass()).mo3843b(e1Var);
        if (z6) {
            e1Var.mo3803m(2, true == zMo3843b ? e1Var : null);
        }
        return zMo3843b;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.t1
    /* renamed from: a */
    public final boolean mo3804a() {
        return m3834j(this, true);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.j0
    /* renamed from: b */
    public final int mo3835b(e2 e2Var) {
        if (m3840k()) {
            int iMo3847f = e2Var.mo3847f(this);
            if (iMo3847f >= 0) {
                return iMo3847f;
            }
            throw new IllegalStateException(AbstractC4801l.m9730d(iMo3847f, "serialized size must be non-negative, was "));
        }
        int i10 = this.zzd & Integer.MAX_VALUE;
        if (i10 != Integer.MAX_VALUE) {
            return i10;
        }
        int iMo3847f2 = e2Var.mo3847f(this);
        if (iMo3847f2 < 0) {
            throw new IllegalStateException(AbstractC4801l.m9730d(iMo3847f2, "serialized size must be non-negative, was "));
        }
        this.zzd = (this.zzd & Integer.MIN_VALUE) | iMo3847f2;
        return iMo3847f2;
    }

    /* renamed from: c */
    public final int m3836c() {
        if (m3840k()) {
            int iMo3847f = y1.f6701c.m4007a(getClass()).mo3847f(this);
            if (iMo3847f >= 0) {
                return iMo3847f;
            }
            throw new IllegalStateException(AbstractC4801l.m9730d(iMo3847f, "serialized size must be non-negative, was "));
        }
        int i10 = this.zzd & Integer.MAX_VALUE;
        if (i10 != Integer.MAX_VALUE) {
            return i10;
        }
        int iMo3847f2 = y1.f6701c.m4007a(getClass()).mo3847f(this);
        if (iMo3847f2 < 0) {
            throw new IllegalStateException(AbstractC4801l.m9730d(iMo3847f2, "serialized size must be non-negative, was "));
        }
        this.zzd = (this.zzd & Integer.MIN_VALUE) | iMo3847f2;
        return iMo3847f2;
    }

    /* renamed from: d */
    public final a1 m3837d() {
        return (a1) mo3803m(5, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return y1.f6701c.m4007a(getClass()).mo3849h(this, (e1) obj);
    }

    /* renamed from: g */
    public final void m3838g() {
        this.zzd &= Integer.MAX_VALUE;
    }

    public final int hashCode() {
        if (m3840k()) {
            return y1.f6701c.m4007a(getClass()).mo3846e(this);
        }
        int i10 = this.zza;
        if (i10 != 0) {
            return i10;
        }
        int iMo3846e = y1.f6701c.m4007a(getClass()).mo3846e(this);
        this.zza = iMo3846e;
        return iMo3846e;
    }

    /* renamed from: i */
    public final void m3839i() {
        this.zzd = (this.zzd & Integer.MIN_VALUE) | Integer.MAX_VALUE;
    }

    /* renamed from: k */
    public final boolean m3840k() {
        return (this.zzd & Integer.MIN_VALUE) != 0;
    }

    /* renamed from: l */
    public final void m3841l(s0 s0Var) {
        e2 e2VarM4007a = y1.f6701c.m4007a(getClass());
        p1 p1Var = s0Var.f6661b;
        if (p1Var == null) {
            p1Var = new p1(s0Var);
        }
        e2VarM4007a.mo3850i(this, p1Var);
    }

    /* renamed from: m */
    public abstract Object mo3803m(int i10, e1 e1Var);

    public final String toString() {
        String string = super.toString();
        char[] cArr = u1.f6671a;
        StringBuilder sb2 = new StringBuilder();
        sb2.append("# ");
        sb2.append(string);
        u1.m3972c(this, sb2, 0);
        return sb2.toString();
    }
}
