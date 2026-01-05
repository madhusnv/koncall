package p001o;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.List;

/* loaded from: classes6.dex */
public abstract class j9d {

    /* renamed from: o.j9d$a */
    public static final class C14475a {

        /* renamed from: a */
        public static final C14475a f29994a = new C14475a();

        /* renamed from: b */
        public static final Method f29995b;

        /* renamed from: c */
        public static final Method f29996c;

        /* JADX WARN: Removed duplicated region for block: B:10:0x0039  */
        static {
            Method method;
            Method method2;
            Method[] methods = Throwable.class.getMethods();
            sq8.m48646e(methods);
            int length = methods.length;
            int i = 0;
            int i2 = 0;
            while (true) {
                method = null;
                if (i2 >= length) {
                    method2 = null;
                    break;
                }
                method2 = methods[i2];
                if (sq8.m48644c(method2.getName(), "addSuppressed")) {
                    Class<?>[] parameterTypes = method2.getParameterTypes();
                    sq8.m48648g(parameterTypes, "getParameterTypes(...)");
                    boolean z = sq8.m48644c(gp0.u0(parameterTypes), Throwable.class);
                    if (z) {
                        break;
                    } else {
                        i2++;
                    }
                }
            }
            f29995b = method2;
            int length2 = methods.length;
            while (true) {
                if (i >= length2) {
                    break;
                }
                Method method3 = methods[i];
                if (sq8.m48644c(method3.getName(), "getSuppressed")) {
                    method = method3;
                    break;
                }
                i++;
            }
            f29996c = method;
        }
    }

    /* renamed from: a */
    public void mo26205a(Throwable th, Throwable th2) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        sq8.m48649h(th, "cause");
        sq8.m48649h(th2, "exception");
        Method method = C14475a.f29995b;
        if (method != null) {
            method.invoke(th, th2);
        }
    }

    /* renamed from: b */
    public vbe mo28093b() {
        return new xs6();
    }

    /* renamed from: c */
    public List mo26206c(Throwable th) {
        Object objInvoke;
        List listM27255d;
        sq8.m48649h(th, "exception");
        Method method = C14475a.f29996c;
        return (method == null || (objInvoke = method.invoke(th, new Object[0])) == null || (listM27255d = fp0.m27255d((Throwable[]) objInvoke)) == null) ? ch3.m21246k() : listM27255d;
    }
}
