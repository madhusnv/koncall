package p001o;

import android.app.Application;
import androidx.lifecycle.C2151t;
import com.onesignal.session.internal.outcomes.impl.OutcomeEventsTable;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes2.dex */
public abstract class i1f {

    /* renamed from: a */
    public static final List f27932a = ch3.m21249n(Application.class, C2151t.class);

    /* renamed from: b */
    public static final List f27933b = bh3.m18963e(C2151t.class);

    /* renamed from: c */
    public static final Constructor m31388c(Class cls, List list) throws SecurityException {
        sq8.m48649h(cls, "modelClass");
        sq8.m48649h(list, "signature");
        Constructor<?>[] constructors = cls.getConstructors();
        sq8.m48648g(constructors, "modelClass.constructors");
        for (Constructor<?> constructor : constructors) {
            Class<?>[] parameterTypes = constructor.getParameterTypes();
            sq8.m48648g(parameterTypes, "constructor.parameterTypes");
            List listD0 = gp0.D0(parameterTypes);
            if (sq8.m48644c(list, listD0)) {
                sq8.m48647f(constructor, "null cannot be cast to non-null type java.lang.reflect.Constructor<T of androidx.lifecycle.SavedStateViewModelFactoryKt.findMatchingConstructor>");
                return constructor;
            }
            if (list.size() == listD0.size() && listD0.containsAll(list)) {
                throw new UnsupportedOperationException("Class " + cls.getSimpleName() + " must have parameters in the proper order: " + list);
            }
        }
        return null;
    }

    /* renamed from: d */
    public static final dxi m31389d(Class cls, Constructor constructor, Object... objArr) {
        sq8.m48649h(cls, "modelClass");
        sq8.m48649h(constructor, "constructor");
        sq8.m48649h(objArr, OutcomeEventsTable.COLUMN_NAME_PARAMS);
        try {
            return (dxi) constructor.newInstance(Arrays.copyOf(objArr, objArr.length));
        } catch (IllegalAccessException e) {
            throw new RuntimeException("Failed to access " + cls, e);
        } catch (InstantiationException e2) {
            throw new RuntimeException("A " + cls + " cannot be instantiated.", e2);
        } catch (InvocationTargetException e3) {
            throw new RuntimeException("An exception happened in constructor of " + cls, e3.getCause());
        }
    }
}
