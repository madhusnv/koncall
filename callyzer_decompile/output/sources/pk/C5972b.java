package pk;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import og.xb;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: pk.b */
/* loaded from: classes.dex */
public final class C5972b extends xb {

    /* renamed from: b */
    public final Method f29212b = Class.class.getMethod("isRecord", null);

    /* renamed from: c */
    public final Method f29213c = Class.class.getMethod("getRecordComponents", null);

    /* renamed from: d */
    public final Method f29214d;

    /* renamed from: e */
    public final Method f29215e;

    public C5972b() throws ClassNotFoundException {
        Class<?> cls = Class.forName("java.lang.reflect.RecordComponent");
        this.f29214d = cls.getMethod("getName", null);
        this.f29215e = cls.getMethod("getType", null);
    }

    @Override // og.xb
    /* renamed from: a */
    public final Method mo11040a(Class cls, Field field) {
        try {
            return cls.getMethod(field.getName(), null);
        } catch (ReflectiveOperationException e2) {
            throw new RuntimeException("Unexpected ReflectiveOperationException occurred (Gson 2.13.1). To support Java records, reflection is utilized to read out information about records. All these invocations happens after it is established that records exist in the JVM. This exception is unexpected behavior.", e2);
        }
    }

    @Override // og.xb
    /* renamed from: b */
    public final Constructor mo11041b(Class cls) {
        try {
            Object[] objArr = (Object[]) this.f29213c.invoke(cls, null);
            Class<?>[] clsArr = new Class[objArr.length];
            for (int i10 = 0; i10 < objArr.length; i10++) {
                clsArr[i10] = (Class) this.f29215e.invoke(objArr[i10], null);
            }
            return cls.getDeclaredConstructor(clsArr);
        } catch (ReflectiveOperationException e2) {
            throw new RuntimeException("Unexpected ReflectiveOperationException occurred (Gson 2.13.1). To support Java records, reflection is utilized to read out information about records. All these invocations happens after it is established that records exist in the JVM. This exception is unexpected behavior.", e2);
        }
    }

    @Override // og.xb
    /* renamed from: d */
    public final String[] mo11042d(Class cls) {
        try {
            Object[] objArr = (Object[]) this.f29213c.invoke(cls, null);
            String[] strArr = new String[objArr.length];
            for (int i10 = 0; i10 < objArr.length; i10++) {
                strArr[i10] = (String) this.f29214d.invoke(objArr[i10], null);
            }
            return strArr;
        } catch (ReflectiveOperationException e2) {
            throw new RuntimeException("Unexpected ReflectiveOperationException occurred (Gson 2.13.1). To support Java records, reflection is utilized to read out information about records. All these invocations happens after it is established that records exist in the JVM. This exception is unexpected behavior.", e2);
        }
    }

    @Override // og.xb
    /* renamed from: e */
    public final boolean mo11043e(Class cls) {
        try {
            return ((Boolean) this.f29212b.invoke(cls, null)).booleanValue();
        } catch (ReflectiveOperationException e2) {
            throw new RuntimeException("Unexpected ReflectiveOperationException occurred (Gson 2.13.1). To support Java records, reflection is utilized to read out information about records. All these invocations happens after it is established that records exist in the JVM. This exception is unexpected behavior.", e2);
        }
    }
}
