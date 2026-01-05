package androidx.lifecycle;

import androidx.lifecycle.AbstractC2139h;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import p001o.xca;

/* renamed from: androidx.lifecycle.b */
/* loaded from: classes2.dex */
public final class C2128b {

    /* renamed from: c */
    public static C2128b f7646c = new C2128b();

    /* renamed from: a */
    public final Map f7647a = new HashMap();

    /* renamed from: b */
    public final Map f7648b = new HashMap();

    /* renamed from: androidx.lifecycle.b$a */
    public static class a {

        /* renamed from: a */
        public final Map f7649a = new HashMap();

        /* renamed from: b */
        public final Map f7650b;

        public a(Map map) {
            this.f7650b = map;
            for (Map.Entry entry : map.entrySet()) {
                AbstractC2139h.a aVar = (AbstractC2139h.a) entry.getValue();
                List arrayList = (List) this.f7649a.get(aVar);
                if (arrayList == null) {
                    arrayList = new ArrayList();
                    this.f7649a.put(aVar, arrayList);
                }
                arrayList.add((b) entry.getKey());
            }
        }

        /* renamed from: b */
        public static void m6502b(List list, xca xcaVar, AbstractC2139h.a aVar, Object obj) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
            if (list != null) {
                for (int size = list.size() - 1; size >= 0; size--) {
                    ((b) list.get(size)).m6504a(xcaVar, aVar, obj);
                }
            }
        }

        /* renamed from: a */
        public void m6503a(xca xcaVar, AbstractC2139h.a aVar, Object obj) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
            m6502b((List) this.f7649a.get(aVar), xcaVar, aVar, obj);
            m6502b((List) this.f7649a.get(AbstractC2139h.a.ON_ANY), xcaVar, aVar, obj);
        }
    }

    /* renamed from: androidx.lifecycle.b$b */
    public static final class b {

        /* renamed from: a */
        public final int f7651a;

        /* renamed from: b */
        public final Method f7652b;

        public b(int i, Method method) throws SecurityException {
            this.f7651a = i;
            this.f7652b = method;
            method.setAccessible(true);
        }

        /* renamed from: a */
        public void m6504a(xca xcaVar, AbstractC2139h.a aVar, Object obj) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
            try {
                int i = this.f7651a;
                if (i == 0) {
                    this.f7652b.invoke(obj, new Object[0]);
                } else if (i == 1) {
                    this.f7652b.invoke(obj, xcaVar);
                } else {
                    if (i != 2) {
                        return;
                    }
                    this.f7652b.invoke(obj, xcaVar, aVar);
                }
            } catch (IllegalAccessException e) {
                throw new RuntimeException(e);
            } catch (InvocationTargetException e2) {
                throw new RuntimeException("Failed to call observer method", e2.getCause());
            }
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return this.f7651a == bVar.f7651a && this.f7652b.getName().equals(bVar.f7652b.getName());
        }

        public int hashCode() {
            return (this.f7651a * 31) + this.f7652b.getName().hashCode();
        }
    }

    /* renamed from: a */
    public final a m6497a(Class cls, Method[] methodArr) {
        int i;
        a aVarM6499c;
        Class superclass = cls.getSuperclass();
        HashMap map = new HashMap();
        if (superclass != null && (aVarM6499c = m6499c(superclass)) != null) {
            map.putAll(aVarM6499c.f7650b);
        }
        for (Class<?> cls2 : cls.getInterfaces()) {
            for (Map.Entry entry : m6499c(cls2).f7650b.entrySet()) {
                m6501e(map, (b) entry.getKey(), (AbstractC2139h.a) entry.getValue(), cls);
            }
        }
        if (methodArr == null) {
            methodArr = m6498b(cls);
        }
        boolean z = false;
        for (Method method : methodArr) {
            InterfaceC2146o interfaceC2146o = (InterfaceC2146o) method.getAnnotation(InterfaceC2146o.class);
            if (interfaceC2146o != null) {
                Class<?>[] parameterTypes = method.getParameterTypes();
                if (parameterTypes.length <= 0) {
                    i = 0;
                } else {
                    if (!xca.class.isAssignableFrom(parameterTypes[0])) {
                        throw new IllegalArgumentException("invalid parameter type. Must be one and instanceof LifecycleOwner");
                    }
                    i = 1;
                }
                AbstractC2139h.a aVarValue = interfaceC2146o.value();
                if (parameterTypes.length > 1) {
                    if (!AbstractC2139h.a.class.isAssignableFrom(parameterTypes[1])) {
                        throw new IllegalArgumentException("invalid parameter type. second arg must be an event");
                    }
                    if (aVarValue != AbstractC2139h.a.ON_ANY) {
                        throw new IllegalArgumentException("Second arg is supported only for ON_ANY value");
                    }
                    i = 2;
                }
                if (parameterTypes.length > 2) {
                    throw new IllegalArgumentException("cannot have more than 2 params");
                }
                m6501e(map, new b(i, method), aVarValue, cls);
                z = true;
            }
        }
        a aVar = new a(map);
        this.f7647a.put(cls, aVar);
        this.f7648b.put(cls, Boolean.valueOf(z));
        return aVar;
    }

    /* renamed from: b */
    public final Method[] m6498b(Class cls) {
        try {
            return cls.getDeclaredMethods();
        } catch (NoClassDefFoundError e) {
            throw new IllegalArgumentException("The observer class has some methods that use newer APIs which are not available in the current OS version. Lifecycles cannot access even other methods so you should make sure that your observer classes only access framework classes that are available in your min API level OR use lifecycle:compiler annotation processor.", e);
        }
    }

    /* renamed from: c */
    public a m6499c(Class cls) {
        a aVar = (a) this.f7647a.get(cls);
        return aVar != null ? aVar : m6497a(cls, null);
    }

    /* renamed from: d */
    public boolean m6500d(Class cls) {
        Boolean bool = (Boolean) this.f7648b.get(cls);
        if (bool != null) {
            return bool.booleanValue();
        }
        Method[] methodArrM6498b = m6498b(cls);
        for (Method method : methodArrM6498b) {
            if (((InterfaceC2146o) method.getAnnotation(InterfaceC2146o.class)) != null) {
                m6497a(cls, methodArrM6498b);
                return true;
            }
        }
        this.f7648b.put(cls, Boolean.FALSE);
        return false;
    }

    /* renamed from: e */
    public final void m6501e(Map map, b bVar, AbstractC2139h.a aVar, Class cls) {
        AbstractC2139h.a aVar2 = (AbstractC2139h.a) map.get(bVar);
        if (aVar2 == null || aVar == aVar2) {
            if (aVar2 == null) {
                map.put(bVar, aVar);
                return;
            }
            return;
        }
        throw new IllegalArgumentException("Method " + bVar.f7652b.getName() + " in " + cls.getName() + " already declared with different @OnLifecycleEvent value: previous value " + aVar2 + ", new value " + aVar);
    }
}
