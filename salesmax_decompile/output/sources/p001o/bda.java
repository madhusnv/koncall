package p001o;

import androidx.lifecycle.C2128b;
import androidx.lifecycle.C2134c;
import androidx.lifecycle.C2135d;
import androidx.lifecycle.C2148q;
import androidx.lifecycle.C2157z;
import androidx.lifecycle.InterfaceC2136e;
import androidx.lifecycle.InterfaceC2142k;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes2.dex */
public final class bda {

    /* renamed from: a */
    public static final bda f15968a = new bda();

    /* renamed from: b */
    public static final Map f15969b = new HashMap();

    /* renamed from: c */
    public static final Map f15970c = new HashMap();

    /* renamed from: c */
    public static final String m18653c(String str) {
        sq8.m48649h(str, "className");
        return e9g.m24593G(str, ".", "_", false, 4, null) + "_LifecycleAdapter";
    }

    /* renamed from: f */
    public static final InterfaceC2142k m18654f(Object obj) throws IllegalAccessException, InstantiationException, IllegalArgumentException, InvocationTargetException {
        sq8.m48649h(obj, "object");
        boolean z = obj instanceof InterfaceC2142k;
        boolean z2 = obj instanceof te5;
        if (z && z2) {
            return new C2135d((te5) obj, (InterfaceC2142k) obj);
        }
        if (z2) {
            return new C2135d((te5) obj, null);
        }
        if (z) {
            return (InterfaceC2142k) obj;
        }
        Class<?> cls = obj.getClass();
        bda bdaVar = f15968a;
        if (bdaVar.m18657d(cls) != 2) {
            return new C2148q(obj);
        }
        Object obj2 = f15970c.get(cls);
        sq8.m48646e(obj2);
        List list = (List) obj2;
        if (list.size() == 1) {
            bdaVar.m18655a((Constructor) list.get(0), obj);
            return new C2157z(null);
        }
        int size = list.size();
        InterfaceC2136e[] interfaceC2136eArr = new InterfaceC2136e[size];
        for (int i = 0; i < size; i++) {
            f15968a.m18655a((Constructor) list.get(i), obj);
            interfaceC2136eArr[i] = null;
        }
        return new C2134c(interfaceC2136eArr);
    }

    /* renamed from: a */
    public final InterfaceC2136e m18655a(Constructor constructor, Object obj) throws IllegalAccessException, InstantiationException, IllegalArgumentException, InvocationTargetException {
        try {
            Object objNewInstance = constructor.newInstance(obj);
            sq8.m48648g(objNewInstance, "{\n            constructo…tance(`object`)\n        }");
            tq.m50332a(objNewInstance);
            return null;
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        } catch (InstantiationException e2) {
            throw new RuntimeException(e2);
        } catch (InvocationTargetException e3) {
            throw new RuntimeException(e3);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: b */
    public final Constructor m18656b(Class cls) throws NoSuchMethodException, ClassNotFoundException, SecurityException {
        try {
            Package r0 = cls.getPackage();
            String canonicalName = cls.getCanonicalName();
            String name = r0 != null ? r0.getName() : "";
            sq8.m48648g(name, "fullPackage");
            if (!(name.length() == 0)) {
                sq8.m48648g(canonicalName, "name");
                canonicalName = canonicalName.substring(name.length() + 1);
                sq8.m48648g(canonicalName, "this as java.lang.String).substring(startIndex)");
            }
            sq8.m48648g(canonicalName, "if (fullPackage.isEmpty(…g(fullPackage.length + 1)");
            String strM18653c = m18653c(canonicalName);
            if (!(name.length() == 0)) {
                strM18653c = name + '.' + strM18653c;
            }
            Class<?> cls2 = Class.forName(strM18653c);
            sq8.m48647f(cls2, "null cannot be cast to non-null type java.lang.Class<out androidx.lifecycle.GeneratedAdapter>");
            Constructor declaredConstructor = cls2.getDeclaredConstructor(cls);
            if (declaredConstructor.isAccessible()) {
                return declaredConstructor;
            }
            declaredConstructor.setAccessible(true);
            return declaredConstructor;
        } catch (ClassNotFoundException unused) {
            return null;
        } catch (NoSuchMethodException e) {
            throw new RuntimeException(e);
        }
    }

    /* renamed from: d */
    public final int m18657d(Class cls) throws NoSuchMethodException, ClassNotFoundException, SecurityException {
        Map map = f15969b;
        Integer num = (Integer) map.get(cls);
        if (num != null) {
            return num.intValue();
        }
        int iM18659g = m18659g(cls);
        map.put(cls, Integer.valueOf(iM18659g));
        return iM18659g;
    }

    /* renamed from: e */
    public final boolean m18658e(Class cls) {
        return cls != null && wca.class.isAssignableFrom(cls);
    }

    /* renamed from: g */
    public final int m18659g(Class cls) throws NoSuchMethodException, ClassNotFoundException, SecurityException {
        ArrayList arrayList;
        if (cls.getCanonicalName() == null) {
            return 1;
        }
        Constructor constructorM18656b = m18656b(cls);
        if (constructorM18656b != null) {
            f15970c.put(cls, bh3.m18963e(constructorM18656b));
            return 2;
        }
        if (C2128b.f7646c.m6500d(cls)) {
            return 1;
        }
        Class superclass = cls.getSuperclass();
        if (m18658e(superclass)) {
            sq8.m48648g(superclass, "superclass");
            if (m18657d(superclass) == 1) {
                return 1;
            }
            Object obj = f15970c.get(superclass);
            sq8.m48646e(obj);
            arrayList = new ArrayList((Collection) obj);
        } else {
            arrayList = null;
        }
        Class<?>[] interfaces = cls.getInterfaces();
        sq8.m48648g(interfaces, "klass.interfaces");
        for (Class<?> cls2 : interfaces) {
            if (m18658e(cls2)) {
                sq8.m48648g(cls2, "intrface");
                if (m18657d(cls2) == 1) {
                    return 1;
                }
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                Object obj2 = f15970c.get(cls2);
                sq8.m48646e(obj2);
                arrayList.addAll((Collection) obj2);
            }
        }
        if (arrayList == null) {
            return 1;
        }
        f15970c.put(cls, arrayList);
        return 2;
    }
}
