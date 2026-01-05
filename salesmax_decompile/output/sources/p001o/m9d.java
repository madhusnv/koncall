package p001o;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.Arrays;

/* loaded from: classes6.dex */
public abstract class m9d {
    /* renamed from: a */
    public static final Object m38583a(Class cls, String str) {
        try {
            Field declaredField = cls.getDeclaredField(str);
            declaredField.setAccessible(true);
            return declaredField.get(null);
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: b */
    public static final dc9 m38584b(ob9 ob9Var) {
        sq8.m48649h(ob9Var, "<this>");
        return m38586d(ob9Var, new dc9[0]);
    }

    /* renamed from: c */
    public static final dc9 m38585c(Class cls, dc9... dc9VarArr) throws IllegalAccessException, SecurityException, IllegalArgumentException, InvocationTargetException {
        dc9 dc9VarM38591i;
        sq8.m48649h(cls, "<this>");
        sq8.m48649h(dc9VarArr, "args");
        if (cls.isEnum() && m38594l(cls)) {
            return m38587e(cls);
        }
        if (cls.isInterface() && (dc9VarM38591i = m38591i(cls)) != null) {
            return dc9VarM38591i;
        }
        dc9 dc9VarM38593k = m38593k(cls, (dc9[]) Arrays.copyOf(dc9VarArr, dc9VarArr.length));
        if (dc9VarM38593k != null) {
            return dc9VarM38593k;
        }
        dc9 dc9VarM38590h = m38590h(cls);
        if (dc9VarM38590h != null) {
            return dc9VarM38590h;
        }
        dc9 dc9VarM38588f = m38588f(cls, (dc9[]) Arrays.copyOf(dc9VarArr, dc9VarArr.length));
        if (dc9VarM38588f != null) {
            return dc9VarM38588f;
        }
        if (m38595m(cls)) {
            return new wdd(hb9.m30152c(cls));
        }
        return null;
    }

    /* renamed from: d */
    public static final dc9 m38586d(ob9 ob9Var, dc9... dc9VarArr) {
        sq8.m48649h(ob9Var, "<this>");
        sq8.m48649h(dc9VarArr, "args");
        return m38585c(hb9.m30150a(ob9Var), (dc9[]) Arrays.copyOf(dc9VarArr, dc9VarArr.length));
    }

    /* renamed from: e */
    public static final dc9 m38587e(Class cls) {
        Object[] enumConstants = cls.getEnumConstants();
        String canonicalName = cls.getCanonicalName();
        sq8.m48648g(canonicalName, "getCanonicalName(...)");
        sq8.m48647f(enumConstants, "null cannot be cast to non-null type kotlin.Array<out kotlin.Enum<*>>");
        return new li6(canonicalName, (Enum[]) enumConstants);
    }

    /* renamed from: f */
    public static final dc9 m38588f(Class cls, dc9... dc9VarArr) {
        Field field;
        dc9 dc9VarM38592j;
        Object objM38589g = m38589g(cls);
        if (objM38589g != null && (dc9VarM38592j = m38592j(objM38589g, (dc9[]) Arrays.copyOf(dc9VarArr, dc9VarArr.length))) != null) {
            return dc9VarM38592j;
        }
        try {
            Class<?>[] declaredClasses = cls.getDeclaredClasses();
            sq8.m48648g(declaredClasses, "getDeclaredClasses(...)");
            int length = declaredClasses.length;
            int i = 0;
            Class<?> cls2 = null;
            boolean z = false;
            while (true) {
                if (i >= length) {
                    if (!z) {
                        break;
                    }
                } else {
                    Class<?> cls3 = declaredClasses[i];
                    if (sq8.m48644c(cls3.getSimpleName(), "$serializer")) {
                        if (z) {
                            break;
                        }
                        z = true;
                        cls2 = cls3;
                    }
                    i++;
                }
            }
            cls2 = null;
            Class<?> cls4 = cls2;
            Object obj = (cls4 == null || (field = cls4.getField("INSTANCE")) == null) ? null : field.get(null);
            if (obj instanceof dc9) {
                return (dc9) obj;
            }
            return null;
        } catch (NoSuchFieldException unused) {
            return null;
        }
    }

    /* renamed from: g */
    public static final Object m38589g(Class cls) {
        Class<?> cls2;
        Class<?>[] declaredClasses = cls.getDeclaredClasses();
        sq8.m48648g(declaredClasses, "getDeclaredClasses(...)");
        int length = declaredClasses.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                cls2 = null;
                break;
            }
            cls2 = declaredClasses[i];
            if (cls2.getAnnotation(jrb.class) != null) {
                break;
            }
            i++;
        }
        if (cls2 == null) {
            return null;
        }
        String simpleName = cls2.getSimpleName();
        sq8.m48648g(simpleName, "getSimpleName(...)");
        return m38583a(cls, simpleName);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00ac  */
    /* renamed from: h */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final dc9 m38590h(Class cls) throws IllegalAccessException, SecurityException, IllegalArgumentException, InvocationTargetException {
        boolean z;
        String canonicalName = cls.getCanonicalName();
        if (canonicalName == null) {
            z = false;
        } else {
            if (!(e9g.m24597K(canonicalName, "java.", false, 2, null) || e9g.m24597K(canonicalName, "kotlin.", false, 2, null))) {
                z = true;
            }
        }
        if (!z) {
            return null;
        }
        Field[] declaredFields = cls.getDeclaredFields();
        sq8.m48648g(declaredFields, "getDeclaredFields(...)");
        int length = declaredFields.length;
        Field field = null;
        int i = 0;
        boolean z2 = false;
        while (true) {
            if (i >= length) {
                if (!z2) {
                    break;
                }
            } else {
                Field field2 = declaredFields[i];
                if (sq8.m48644c(field2.getName(), "INSTANCE") && sq8.m48644c(field2.getType(), cls) && Modifier.isStatic(field2.getModifiers())) {
                    if (z2) {
                        break;
                    }
                    z2 = true;
                    field = field2;
                }
                i++;
            }
        }
        field = null;
        Field field3 = field;
        if (field3 == null) {
            return null;
        }
        Object obj = field3.get(null);
        Method[] methods = cls.getMethods();
        sq8.m48648g(methods, "getMethods(...)");
        int length2 = methods.length;
        Method method = null;
        int i2 = 0;
        boolean z3 = false;
        while (true) {
            if (i2 >= length2) {
                if (!z3) {
                    break;
                }
            } else {
                Method method2 = methods[i2];
                if (sq8.m48644c(method2.getName(), "serializer")) {
                    Class<?>[] parameterTypes = method2.getParameterTypes();
                    sq8.m48648g(parameterTypes, "getParameterTypes(...)");
                    boolean z4 = (parameterTypes.length == 0) && sq8.m48644c(method2.getReturnType(), dc9.class);
                    if (z4) {
                        if (z3) {
                            break;
                        }
                        z3 = true;
                        method = method2;
                    }
                    i2++;
                }
            }
        }
        method = null;
        Method method3 = method;
        if (method3 == null) {
            return null;
        }
        Object objInvoke = method3.invoke(obj, new Object[0]);
        if (objInvoke instanceof dc9) {
            return (dc9) objInvoke;
        }
        return null;
    }

    /* renamed from: i */
    public static final dc9 m38591i(Class cls) {
        dff dffVar = (dff) cls.getAnnotation(dff.class);
        if (dffVar == null || sq8.m48644c(kge.m35689b(dffVar.with()), kge.m35689b(wdd.class))) {
            return new wdd(hb9.m30152c(cls));
        }
        return null;
    }

    /* renamed from: j */
    public static final dc9 m38592j(Object obj, dc9... dc9VarArr) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        Class[] clsArr;
        try {
            if (dc9VarArr.length == 0) {
                clsArr = new Class[0];
            } else {
                int length = dc9VarArr.length;
                Class[] clsArr2 = new Class[length];
                for (int i = 0; i < length; i++) {
                    clsArr2[i] = dc9.class;
                }
                clsArr = clsArr2;
            }
            Object objInvoke = obj.getClass().getDeclaredMethod("serializer", (Class[]) Arrays.copyOf(clsArr, clsArr.length)).invoke(obj, Arrays.copyOf(dc9VarArr, dc9VarArr.length));
            if (objInvoke instanceof dc9) {
                return (dc9) objInvoke;
            }
            return null;
        } catch (NoSuchMethodException unused) {
            return null;
        } catch (InvocationTargetException e) {
            Throwable cause = e.getCause();
            if (cause == null) {
                throw e;
            }
            String message = cause.getMessage();
            if (message == null) {
                message = e.getMessage();
            }
            throw new InvocationTargetException(cause, message);
        }
    }

    /* renamed from: k */
    public static final dc9 m38593k(Class cls, dc9... dc9VarArr) {
        Object objM38583a = m38583a(cls, "Companion");
        if (objM38583a == null) {
            return null;
        }
        return m38592j(objM38583a, (dc9[]) Arrays.copyOf(dc9VarArr, dc9VarArr.length));
    }

    /* renamed from: l */
    public static final boolean m38594l(Class cls) {
        return cls.getAnnotation(dff.class) == null && cls.getAnnotation(tdd.class) == null;
    }

    /* renamed from: m */
    public static final boolean m38595m(Class cls) {
        if (cls.getAnnotation(tdd.class) != null) {
            return true;
        }
        dff dffVar = (dff) cls.getAnnotation(dff.class);
        return dffVar != null && sq8.m48644c(kge.m35689b(dffVar.with()), kge.m35689b(wdd.class));
    }
}
