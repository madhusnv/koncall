package d7;

import android.app.Application;
import com.sun.mail.util.AbstractC1452a;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;
import java.util.List;
import kotlin.jvm.internal.AbstractC4154l;
import og.pe;
import rw.AbstractC6662l;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public abstract class u0 {

    /* renamed from: a */
    public static final List f8138a = pe.m10834i(Application.class, n0.class);

    /* renamed from: b */
    public static final List f8139b = pe.m10833h(n0.class);

    /* renamed from: a */
    public static final Constructor m5350a(Class cls, List signature) {
        AbstractC4154l.m8923f(signature, "signature");
        e1.x0 x0VarM8925h = AbstractC4154l.m8925h(cls.getConstructors());
        while (x0VarM8925h.hasNext()) {
            Constructor constructor = (Constructor) x0VarM8925h.next();
            Class<?>[] parameterTypes = constructor.getParameterTypes();
            AbstractC4154l.m8922e(parameterTypes, "getParameterTypes(...)");
            List listM12708K = AbstractC6662l.m12708K(parameterTypes);
            if (signature.equals(listM12708K)) {
                return constructor;
            }
            if (signature.size() == listM12708K.size() && listM12708K.containsAll(signature)) {
                throw new UnsupportedOperationException("Class " + cls.getSimpleName() + " must have parameters in the proper order: " + signature);
            }
        }
        return null;
    }

    /* renamed from: b */
    public static final w0 m5351b(Class cls, Constructor constructor, Object... objArr) {
        try {
            return (w0) constructor.newInstance(Arrays.copyOf(objArr, objArr.length));
        } catch (IllegalAccessException e2) {
            throw new RuntimeException("Failed to access " + cls, e2);
        } catch (InstantiationException e10) {
            throw new RuntimeException(AbstractC1452a.m4560g("A ", cls, " cannot be instantiated."), e10);
        } catch (InvocationTargetException e11) {
            throw new RuntimeException("An exception happened in constructor of " + cls, e11.getCause());
        }
    }
}
