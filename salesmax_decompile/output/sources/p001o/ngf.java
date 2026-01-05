package p001o;

import java.lang.reflect.Method;
import java.lang.reflect.Type;
import retrofit2.C18795f;

/* loaded from: classes6.dex */
public abstract class ngf {
    /* renamed from: b */
    public static ngf m40548b(C18795f c18795f, Method method) {
        dme dmeVarM23557b = dme.m23557b(c18795f, method);
        Type genericReturnType = method.getGenericReturnType();
        if (lri.m37841j(genericReturnType)) {
            throw lri.m37844m(method, "Method return type must not include a type variable or wildcard: %s", genericReturnType);
        }
        if (genericReturnType != Void.TYPE) {
            return n48.m40055f(c18795f, method, dmeVarM23557b);
        }
        throw lri.m37844m(method, "Service methods cannot return void.", new Object[0]);
    }

    /* renamed from: a */
    public abstract Object mo40056a(Object[] objArr);
}
