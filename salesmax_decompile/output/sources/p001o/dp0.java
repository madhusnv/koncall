package p001o;

import java.lang.reflect.Array;

/* loaded from: classes6.dex */
public abstract class dp0 {
    /* renamed from: a */
    public static final Object[] m23653a(Object[] objArr, int i) throws NegativeArraySizeException {
        sq8.m48649h(objArr, "reference");
        Object objNewInstance = Array.newInstance(objArr.getClass().getComponentType(), i);
        sq8.m48647f(objNewInstance, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.arrayOfNulls>");
        return (Object[]) objNewInstance;
    }

    /* renamed from: b */
    public static final void m23654b(int i, int i2) {
        if (i <= i2) {
            return;
        }
        throw new IndexOutOfBoundsException("toIndex (" + i + ") is greater than size (" + i2 + ").");
    }
}
