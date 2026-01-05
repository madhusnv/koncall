package com.google.crypto.tink.shaded.protobuf;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public abstract class a0 extends AbstractC1374a {
    private static Map<Object, a0> defaultInstanceMap = new ConcurrentHashMap();
    protected int memoizedSerializedSize;
    protected i1 unknownFields;

    public a0() {
        this.memoizedHashCode = 0;
        this.unknownFields = i1.f7048f;
        this.memoizedSerializedSize = -1;
    }

    /* renamed from: g */
    public static a0 m4159g(Class cls) throws ClassNotFoundException {
        a0 a0Var = defaultInstanceMap.get(cls);
        if (a0Var == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                a0Var = defaultInstanceMap.get(cls);
            } catch (ClassNotFoundException e2) {
                throw new IllegalStateException("Class initialization cannot fail.", e2);
            }
        }
        if (a0Var != null) {
            return a0Var;
        }
        a0 a0Var2 = (a0) r1.m4378a(cls);
        a0Var2.getClass();
        a0 a0Var3 = (a0) a0Var2.mo4165f(EnumC1399z.GET_DEFAULT_INSTANCE);
        if (a0Var3 == null) {
            throw new IllegalStateException();
        }
        defaultInstanceMap.put(cls, a0Var3);
        return a0Var3;
    }

    /* renamed from: h */
    public static Object m4160h(Method method, a0 a0Var, Object... objArr) {
        try {
            return method.invoke(a0Var, objArr);
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

    /* renamed from: j */
    public static a0 m4161j(a0 a0Var, AbstractC1382i abstractC1382i, C1390q c1390q) throws InvalidProtocolBufferException {
        C1381h c1381h = (C1381h) abstractC1382i;
        byte[] bArr = c1381h.f7043d;
        int iMo4227j = c1381h.mo4227j();
        int size = c1381h.size();
        C1383j c1383j = new C1383j(bArr, iMo4227j, size, true);
        try {
            c1383j.m4289e(size);
            a0 a0Var2 = (a0) a0Var.mo4165f(EnumC1399z.NEW_MUTABLE_INSTANCE);
            try {
                b1 b1Var = b1.f7019c;
                b1Var.getClass();
                f1 f1VarM4170a = b1Var.m4170a(a0Var2.getClass());
                C1385l c1385l = c1383j.f7063c;
                if (c1385l == null) {
                    c1385l = new C1385l(c1383j);
                }
                f1VarM4170a.mo4221h(a0Var2, c1385l, c1390q);
                f1VarM4170a.mo4214a(a0Var2);
                if (c1383j.f7059i != 0) {
                    throw new InvalidProtocolBufferException("Protocol message end-group tag did not match expected tag.");
                }
                if (a0Var2.m4166i()) {
                    return a0Var2;
                }
                throw new InvalidProtocolBufferException(new UninitializedMessageException().getMessage());
            } catch (IOException e2) {
                if (e2.getCause() instanceof InvalidProtocolBufferException) {
                    throw ((InvalidProtocolBufferException) e2.getCause());
                }
                throw new InvalidProtocolBufferException(e2.getMessage());
            } catch (RuntimeException e10) {
                if (e10.getCause() instanceof InvalidProtocolBufferException) {
                    throw ((InvalidProtocolBufferException) e10.getCause());
                }
                throw e10;
            }
        } catch (InvalidProtocolBufferException e11) {
            throw new IllegalArgumentException(e11);
        }
    }

    /* renamed from: k */
    public static a0 m4162k(a0 a0Var, byte[] bArr, C1390q c1390q) throws InvalidProtocolBufferException {
        int length = bArr.length;
        a0 a0Var2 = (a0) a0Var.mo4165f(EnumC1399z.NEW_MUTABLE_INSTANCE);
        try {
            b1 b1Var = b1.f7019c;
            b1Var.getClass();
            f1 f1VarM4170a = b1Var.m4170a(a0Var2.getClass());
            C1377d c1377d = new C1377d();
            c1390q.getClass();
            f1VarM4170a.mo4220g(a0Var2, bArr, 0, length, c1377d);
            f1VarM4170a.mo4214a(a0Var2);
            if (a0Var2.memoizedHashCode != 0) {
                throw new RuntimeException();
            }
            if (a0Var2.m4166i()) {
                return a0Var2;
            }
            throw new InvalidProtocolBufferException(new UninitializedMessageException().getMessage());
        } catch (IOException e2) {
            if (e2.getCause() instanceof InvalidProtocolBufferException) {
                throw ((InvalidProtocolBufferException) e2.getCause());
            }
            throw new InvalidProtocolBufferException(e2.getMessage());
        } catch (IndexOutOfBoundsException unused) {
            throw InvalidProtocolBufferException.m4154f();
        }
    }

    /* renamed from: l */
    public static void m4163l(Class cls, a0 a0Var) {
        defaultInstanceMap.put(cls, a0Var);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.AbstractC1374a
    /* renamed from: a */
    public final int mo4155a() {
        if (this.memoizedSerializedSize == -1) {
            b1 b1Var = b1.f7019c;
            b1Var.getClass();
            this.memoizedSerializedSize = b1Var.m4170a(getClass()).mo4222i(this);
        }
        return this.memoizedSerializedSize;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.AbstractC1374a
    /* renamed from: d */
    public final void mo4158d(C1386m c1386m) {
        b1 b1Var = b1.f7019c;
        b1Var.getClass();
        f1 f1VarM4170a = b1Var.m4170a(getClass());
        C1387n c1387n = c1386m.f7073a;
        if (c1387n == null) {
            c1387n = new C1387n(c1386m);
        }
        f1VarM4170a.mo4218e(this, c1387n);
    }

    /* renamed from: e */
    public final AbstractC1397x m4164e() {
        return (AbstractC1397x) mo4165f(EnumC1399z.NEW_BUILDER);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!((a0) mo4165f(EnumC1399z.GET_DEFAULT_INSTANCE)).getClass().isInstance(obj)) {
            return false;
        }
        b1 b1Var = b1.f7019c;
        b1Var.getClass();
        return b1Var.m4170a(getClass()).mo4217d(this, (a0) obj);
    }

    /* renamed from: f */
    public abstract Object mo4165f(EnumC1399z enumC1399z);

    public final int hashCode() {
        int i10 = this.memoizedHashCode;
        if (i10 != 0) {
            return i10;
        }
        b1 b1Var = b1.f7019c;
        b1Var.getClass();
        int iMo4219f = b1Var.m4170a(getClass()).mo4219f(this);
        this.memoizedHashCode = iMo4219f;
        return iMo4219f;
    }

    /* renamed from: i */
    public final boolean m4166i() {
        byte bByteValue = ((Byte) mo4165f(EnumC1399z.GET_MEMOIZED_IS_INITIALIZED)).byteValue();
        if (bByteValue == 1) {
            return true;
        }
        if (bByteValue == 0) {
            return false;
        }
        b1 b1Var = b1.f7019c;
        b1Var.getClass();
        boolean zMo4215b = b1Var.m4170a(getClass()).mo4215b(this);
        mo4165f(EnumC1399z.SET_MEMOIZED_IS_INITIALIZED);
        return zMo4215b;
    }

    public final String toString() {
        String string = super.toString();
        StringBuilder sb2 = new StringBuilder();
        sb2.append("# ");
        sb2.append(string);
        t0.m4417y(this, sb2, 0);
        return sb2.toString();
    }
}
