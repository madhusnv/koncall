package p001o;

import java.io.Serializable;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes6.dex */
public abstract class ti9 implements Cloneable, Serializable {

    /* renamed from: a */
    public static final String[] f47194a = new String[0];

    /* renamed from: a */
    public static Object m49909a(Object obj, Object obj2) {
        if (obj == null) {
            if (!(obj2 instanceof List) && obj2 != null) {
                return obj2;
            }
            ArrayList arrayList = new ArrayList();
            arrayList.add(obj2);
            return arrayList;
        }
        if (obj instanceof List) {
            ((List) obj).add(obj2);
            return obj;
        }
        ArrayList arrayList2 = new ArrayList();
        arrayList2.add(obj);
        arrayList2.add(obj2);
        return arrayList2;
    }

    /* renamed from: b */
    public static Object m49910b(Object obj, Object[] objArr) {
        for (int i = 0; objArr != null && i < objArr.length; i++) {
            obj = m49909a(obj, objArr[i]);
        }
        return obj;
    }

    /* renamed from: c */
    public static Object[] m49911c(Object[] objArr, Object obj, Class cls) {
        if (objArr != null) {
            Object[] objArr2 = (Object[]) Array.newInstance(objArr.getClass().getComponentType(), Array.getLength(objArr) + 1);
            System.arraycopy(objArr, 0, objArr2, 0, objArr.length);
            objArr2[objArr.length] = obj;
            return objArr2;
        }
        if (cls == null && obj != null) {
            cls = obj.getClass();
        }
        Object[] objArr3 = (Object[]) Array.newInstance((Class<?>) cls, 1);
        objArr3[0] = obj;
        return objArr3;
    }

    /* renamed from: f */
    public static Object m49912f(Object obj) {
        if (obj == null) {
            return null;
        }
        return obj instanceof List ? new ArrayList((List) obj) : obj;
    }

    /* renamed from: g */
    public static Object m49913g(Object obj, int i) {
        if (obj == null) {
            throw new IndexOutOfBoundsException();
        }
        if (obj instanceof List) {
            return ((List) obj).get(i);
        }
        if (i == 0) {
            return obj;
        }
        throw new IndexOutOfBoundsException();
    }

    /* renamed from: h */
    public static List m49914h(Object obj) {
        return m49915i(obj, false);
    }

    /* renamed from: i */
    public static List m49915i(Object obj, boolean z) {
        if (obj == null) {
            if (z) {
                return null;
            }
            return Collections.EMPTY_LIST;
        }
        if (obj instanceof List) {
            return (List) obj;
        }
        ArrayList arrayList = new ArrayList(1);
        arrayList.add(obj);
        return arrayList;
    }

    /* renamed from: j */
    public static Object[] m49916j(Object[] objArr, Object obj) {
        if (obj != null && objArr != null) {
            int length = objArr.length;
            while (true) {
                int i = length - 1;
                if (length <= 0) {
                    break;
                }
                if (obj.equals(objArr[i])) {
                    Object[] objArr2 = (Object[]) Array.newInstance(objArr.getClass().getComponentType(), Array.getLength(objArr) - 1);
                    if (i > 0) {
                        System.arraycopy(objArr, 0, objArr2, 0, i);
                    }
                    int i2 = i + 1;
                    if (i2 < objArr.length) {
                        System.arraycopy(objArr, i2, objArr2, i, objArr.length - i2);
                    }
                    return objArr2;
                }
                length = i;
            }
        }
        return objArr;
    }

    /* renamed from: k */
    public static int m49917k(Object obj) {
        if (obj == null) {
            return 0;
        }
        if (obj instanceof List) {
            return ((List) obj).size();
        }
        return 1;
    }

    /* renamed from: l */
    public static Object m49918l(Object obj, Class cls) throws ArrayIndexOutOfBoundsException, IllegalArgumentException, NegativeArraySizeException {
        if (obj == null) {
            return (Object[]) Array.newInstance((Class<?>) cls, 0);
        }
        if (!(obj instanceof List)) {
            Object objNewInstance = Array.newInstance((Class<?>) cls, 1);
            Array.set(objNewInstance, 0, obj);
            return objNewInstance;
        }
        List list = (List) obj;
        if (!cls.isPrimitive()) {
            return list.toArray((Object[]) Array.newInstance((Class<?>) cls, list.size()));
        }
        Object objNewInstance2 = Array.newInstance((Class<?>) cls, list.size());
        for (int i = 0; i < list.size(); i++) {
            Array.set(objNewInstance2, i, list.get(i));
        }
        return objNewInstance2;
    }
}
