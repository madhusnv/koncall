package p001o;

import java.lang.reflect.Array;

/* loaded from: classes2.dex */
public abstract class bp0 {
    /* renamed from: a */
    public static Object[] m19501a(Object[] objArr, int i) {
        if (objArr.length < i) {
            return (Object[]) Array.newInstance(objArr.getClass().getComponentType(), i);
        }
        if (objArr.length > i) {
            objArr[i] = null;
        }
        return objArr;
    }
}
