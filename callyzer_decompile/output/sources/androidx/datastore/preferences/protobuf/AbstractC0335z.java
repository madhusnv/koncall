package androidx.datastore.preferences.protobuf;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import mm.AbstractC4801l;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: androidx.datastore.preferences.protobuf.z */
/* loaded from: classes.dex */
public abstract class AbstractC0335z extends AbstractC0306a {
    private static final int MEMOIZED_SERIALIZED_SIZE_MASK = Integer.MAX_VALUE;
    private static final int MUTABLE_FLAG_MASK = Integer.MIN_VALUE;
    static final int UNINITIALIZED_HASH_CODE = 0;
    static final int UNINITIALIZED_SERIALIZED_SIZE = Integer.MAX_VALUE;
    private static Map<Object, AbstractC0335z> defaultInstanceMap = new ConcurrentHashMap();
    private int memoizedSerializedSize;
    protected h1 unknownFields;

    public AbstractC0335z() {
        this.memoizedHashCode = 0;
        this.memoizedSerializedSize = -1;
        this.unknownFields = h1.f2338f;
    }

    /* renamed from: d */
    public static AbstractC0335z m1076d(Class cls) throws ClassNotFoundException {
        AbstractC0335z abstractC0335z = defaultInstanceMap.get(cls);
        if (abstractC0335z == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                abstractC0335z = defaultInstanceMap.get(cls);
            } catch (ClassNotFoundException e2) {
                throw new IllegalStateException("Class initialization cannot fail.", e2);
            }
        }
        if (abstractC0335z != null) {
            return abstractC0335z;
        }
        AbstractC0335z abstractC0335z2 = (AbstractC0335z) n1.m1010d(cls);
        abstractC0335z2.getClass();
        AbstractC0335z abstractC0335z3 = (AbstractC0335z) abstractC0335z2.mo1080c(EnumC0334y.GET_DEFAULT_INSTANCE);
        if (abstractC0335z3 == null) {
            throw new IllegalStateException();
        }
        defaultInstanceMap.put(cls, abstractC0335z3);
        return abstractC0335z3;
    }

    /* renamed from: e */
    public static Object m1077e(Method method, AbstractC0335z abstractC0335z, Object... objArr) {
        try {
            return method.invoke(abstractC0335z, objArr);
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

    /* renamed from: f */
    public static final boolean m1078f(AbstractC0335z abstractC0335z, boolean z6) {
        byte bByteValue = ((Byte) abstractC0335z.mo1080c(EnumC0334y.GET_MEMOIZED_IS_INITIALIZED)).byteValue();
        if (bByteValue == 1) {
            return true;
        }
        if (bByteValue == 0) {
            return false;
        }
        x0 x0Var = x0.f2424c;
        x0Var.getClass();
        boolean zMo811b = x0Var.m1073a(abstractC0335z.getClass()).mo811b(abstractC0335z);
        if (z6) {
            abstractC0335z.mo1080c(EnumC0334y.SET_MEMOIZED_IS_INITIALIZED);
        }
        return zMo811b;
    }

    /* renamed from: j */
    public static void m1079j(Class cls, AbstractC0335z abstractC0335z) {
        abstractC0335z.m1082h();
        defaultInstanceMap.put(cls, abstractC0335z);
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0306a
    /* renamed from: a */
    public final int mo808a(a1 a1Var) {
        int iMo815f;
        int iMo815f2;
        if (m1081g()) {
            if (a1Var == null) {
                x0 x0Var = x0.f2424c;
                x0Var.getClass();
                iMo815f2 = x0Var.m1073a(getClass()).mo815f(this);
            } else {
                iMo815f2 = a1Var.mo815f(this);
            }
            if (iMo815f2 >= 0) {
                return iMo815f2;
            }
            throw new IllegalStateException(AbstractC4801l.m9730d(iMo815f2, "serialized size must be non-negative, was "));
        }
        int i10 = this.memoizedSerializedSize;
        if ((i10 & Integer.MAX_VALUE) != Integer.MAX_VALUE) {
            return i10 & Integer.MAX_VALUE;
        }
        if (a1Var == null) {
            x0 x0Var2 = x0.f2424c;
            x0Var2.getClass();
            iMo815f = x0Var2.m1073a(getClass()).mo815f(this);
        } else {
            iMo815f = a1Var.mo815f(this);
        }
        m1084k(iMo815f);
        return iMo815f;
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0306a
    /* renamed from: b */
    public final void mo809b(C0318m c0318m) {
        x0 x0Var = x0.f2424c;
        x0Var.getClass();
        a1 a1VarM1073a = x0Var.m1073a(getClass());
        i0 i0Var = c0318m.f2370a;
        if (i0Var == null) {
            i0Var = new i0(c0318m);
        }
        a1VarM1073a.mo814e(this, i0Var);
    }

    /* renamed from: c */
    public abstract Object mo1080c(EnumC0334y enumC0334y);

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        x0 x0Var = x0.f2424c;
        x0Var.getClass();
        return x0Var.m1073a(getClass()).mo817h(this, (AbstractC0335z) obj);
    }

    /* renamed from: g */
    public final boolean m1081g() {
        return (this.memoizedSerializedSize & Integer.MIN_VALUE) != 0;
    }

    /* renamed from: h */
    public final void m1082h() {
        this.memoizedSerializedSize &= Integer.MAX_VALUE;
    }

    public final int hashCode() {
        if (m1081g()) {
            x0 x0Var = x0.f2424c;
            x0Var.getClass();
            return x0Var.m1073a(getClass()).mo816g(this);
        }
        if (this.memoizedHashCode == 0) {
            x0 x0Var2 = x0.f2424c;
            x0Var2.getClass();
            this.memoizedHashCode = x0Var2.m1073a(getClass()).mo816g(this);
        }
        return this.memoizedHashCode;
    }

    /* renamed from: i */
    public final AbstractC0335z m1083i() {
        return (AbstractC0335z) mo1080c(EnumC0334y.NEW_MUTABLE_INSTANCE);
    }

    /* renamed from: k */
    public final void m1084k(int i10) {
        if (i10 < 0) {
            throw new IllegalStateException(AbstractC4801l.m9730d(i10, "serialized size must be non-negative, was "));
        }
        this.memoizedSerializedSize = (i10 & Integer.MAX_VALUE) | (this.memoizedSerializedSize & Integer.MIN_VALUE);
    }

    public final String toString() {
        String string = super.toString();
        char[] cArr = p0.f2389a;
        StringBuilder sb2 = new StringBuilder();
        sb2.append("# ");
        sb2.append(string);
        p0.m1034c(this, sb2, 0);
        return sb2.toString();
    }
}
