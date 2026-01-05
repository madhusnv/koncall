package pk;

import com.amplifyframework.core.model.ModelIdentifier;
import com.google.gson.JsonIOException;
import i0.m0;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import og.xb;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: pk.c */
/* loaded from: classes.dex */
public abstract class AbstractC5973c {

    /* renamed from: a */
    public static final xb f29216a;

    static {
        xb c5971a;
        try {
            c5971a = new C5972b();
        } catch (ReflectiveOperationException unused) {
            c5971a = new C5971a();
        }
        f29216a = c5971a;
    }

    /* renamed from: a */
    public static void m12004a(AccessibleObject accessibleObject, StringBuilder sb2) {
        sb2.append('(');
        Class<?>[] parameterTypes = accessibleObject instanceof Method ? ((Method) accessibleObject).getParameterTypes() : ((Constructor) accessibleObject).getParameterTypes();
        for (int i10 = 0; i10 < parameterTypes.length; i10++) {
            if (i10 > 0) {
                sb2.append(", ");
            }
            sb2.append(parameterTypes[i10].getSimpleName());
        }
        sb2.append(')');
    }

    /* renamed from: b */
    public static String m12005b(Constructor constructor) {
        StringBuilder sb2 = new StringBuilder(constructor.getDeclaringClass().getName());
        m12004a(constructor, sb2);
        return sb2.toString();
    }

    /* renamed from: c */
    public static String m12006c(Field field) {
        return field.getDeclaringClass().getName() + ModelIdentifier.Helper.PRIMARY_KEY_DELIMITER + field.getName();
    }

    /* renamed from: d */
    public static String m12007d(AccessibleObject accessibleObject, boolean z6) {
        String str;
        if (accessibleObject instanceof Field) {
            str = "field '" + m12006c((Field) accessibleObject) + "'";
        } else if (accessibleObject instanceof Method) {
            Method method = (Method) accessibleObject;
            StringBuilder sb2 = new StringBuilder(method.getName());
            m12004a(method, sb2);
            str = "method '" + method.getDeclaringClass().getName() + ModelIdentifier.Helper.PRIMARY_KEY_DELIMITER + sb2.toString() + "'";
        } else if (accessibleObject instanceof Constructor) {
            str = "constructor '" + m12005b((Constructor) accessibleObject) + "'";
        } else {
            str = "<unknown AccessibleObject> " + accessibleObject.toString();
        }
        if (!z6 || !Character.isLowerCase(str.charAt(0))) {
            return str;
        }
        return Character.toUpperCase(str.charAt(0)) + str.substring(1);
    }

    /* renamed from: e */
    public static String m12008e(Exception exc) {
        if (!exc.getClass().getName().equals("java.lang.reflect.InaccessibleObjectException")) {
            return "";
        }
        String message = exc.getMessage();
        return "\nSee " + "https://github.com/google/gson/blob/main/Troubleshooting.md#".concat((message == null || !message.contains("to module com.google.gson")) ? "reflection-inaccessible" : "reflection-inaccessible-to-module-gson");
    }

    /* renamed from: f */
    public static void m12009f(AccessibleObject accessibleObject) throws SecurityException {
        try {
            accessibleObject.setAccessible(true);
        } catch (Exception e2) {
            StringBuilder sbM7383p = m0.m7383p("Failed making ", m12007d(accessibleObject, false), " accessible; either increase its visibility or write a custom TypeAdapter for its declaring type.");
            sbM7383p.append(m12008e(e2));
            throw new JsonIOException(sbM7383p.toString(), e2);
        }
    }
}
