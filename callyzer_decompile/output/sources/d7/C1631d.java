package d7;

import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: d7.d */
/* loaded from: classes.dex */
public final class C1631d {

    /* renamed from: c */
    public static final C1631d f8079c = new C1631d();

    /* renamed from: a */
    public final HashMap f8080a = new HashMap();

    /* renamed from: b */
    public final HashMap f8081b = new HashMap();

    /* renamed from: b */
    public static void m5309b(HashMap map, C1630c c1630c, EnumC1644p enumC1644p, Class cls) {
        EnumC1644p enumC1644p2 = (EnumC1644p) map.get(c1630c);
        if (enumC1644p2 == null || enumC1644p == enumC1644p2) {
            if (enumC1644p2 == null) {
                map.put(c1630c, enumC1644p);
                return;
            }
            return;
        }
        throw new IllegalArgumentException("Method " + c1630c.f8074b.getName() + " in " + cls.getName() + " already declared with different @OnLifecycleEvent value: previous value " + enumC1644p2 + ", new value " + enumC1644p);
    }

    /* renamed from: a */
    public final C1629b m5310a(Class cls, Method[] methodArr) throws SecurityException {
        int i10;
        Class superclass = cls.getSuperclass();
        HashMap map = new HashMap();
        HashMap map2 = this.f8080a;
        if (superclass != null) {
            C1629b c1629bM5310a = (C1629b) map2.get(superclass);
            if (c1629bM5310a == null) {
                c1629bM5310a = m5310a(superclass, null);
            }
            map.putAll(c1629bM5310a.f8069b);
        }
        for (Class<?> cls2 : cls.getInterfaces()) {
            C1629b c1629bM5310a2 = (C1629b) map2.get(cls2);
            if (c1629bM5310a2 == null) {
                c1629bM5310a2 = m5310a(cls2, null);
            }
            for (Map.Entry entry : c1629bM5310a2.f8069b.entrySet()) {
                m5309b(map, (C1630c) entry.getKey(), (EnumC1644p) entry.getValue(), cls);
            }
        }
        if (methodArr == null) {
            try {
                methodArr = cls.getDeclaredMethods();
            } catch (NoClassDefFoundError e2) {
                throw new IllegalArgumentException("The observer class has some methods that use newer APIs which are not available in the current OS version. Lifecycles cannot access even other methods so you should make sure that your observer classes only access framework classes that are available in your min API level OR use lifecycle:compiler annotation processor.", e2);
            }
        }
        boolean z6 = false;
        for (Method method : methodArr) {
            i0 i0Var = (i0) method.getAnnotation(i0.class);
            if (i0Var != null) {
                Class<?>[] parameterTypes = method.getParameterTypes();
                if (parameterTypes.length <= 0) {
                    i10 = 0;
                } else {
                    if (!InterfaceC1649u.class.isAssignableFrom(parameterTypes[0])) {
                        throw new IllegalArgumentException("invalid parameter type. Must be one and instanceof LifecycleOwner");
                    }
                    i10 = 1;
                }
                EnumC1644p enumC1644pValue = i0Var.value();
                if (parameterTypes.length > 1) {
                    if (!EnumC1644p.class.isAssignableFrom(parameterTypes[1])) {
                        throw new IllegalArgumentException("invalid parameter type. second arg must be an event");
                    }
                    if (enumC1644pValue != EnumC1644p.ON_ANY) {
                        throw new IllegalArgumentException("Second arg is supported only for ON_ANY value");
                    }
                    i10 = 2;
                }
                if (parameterTypes.length > 2) {
                    throw new IllegalArgumentException("cannot have more than 2 params");
                }
                m5309b(map, new C1630c(i10, method), enumC1644pValue, cls);
                z6 = true;
            }
        }
        C1629b c1629b = new C1629b(map);
        map2.put(cls, c1629b);
        this.f8081b.put(cls, Boolean.valueOf(z6));
        return c1629b;
    }
}
