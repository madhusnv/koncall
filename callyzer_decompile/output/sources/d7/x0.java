package d7;

import android.app.Application;
import g7.C2539d;
import java.lang.reflect.InvocationTargetException;
import kotlin.jvm.internal.AbstractC4154l;
import pg.z5;
import ph.C5950e;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class x0 extends z0 {

    /* renamed from: c */
    public static x0 f8157c;

    /* renamed from: d */
    public static final C5950e f8158d = new C5950e(5);

    /* renamed from: b */
    public final Application f8159b;

    public x0(Application application) {
        this.f8159b = application;
    }

    @Override // d7.z0, d7.y0
    /* renamed from: a */
    public final w0 mo5348a(Class cls, C2539d c2539d) {
        if (this.f8159b != null) {
            return mo1207b(cls);
        }
        Application application = (Application) c2539d.f13868a.get(f8158d);
        if (application != null) {
            return m5362d(cls, application);
        }
        if (AbstractC1628a.class.isAssignableFrom(cls)) {
            throw new IllegalArgumentException("CreationExtras must have an application by `APPLICATION_KEY`");
        }
        return z5.m11962a(cls);
    }

    @Override // d7.z0, d7.y0
    /* renamed from: b */
    public final w0 mo1207b(Class cls) {
        Application application = this.f8159b;
        if (application != null) {
            return m5362d(cls, application);
        }
        throw new UnsupportedOperationException("AndroidViewModelFactory constructed with empty constructor works only with create(modelClass: Class<T>, extras: CreationExtras).");
    }

    /* renamed from: d */
    public final w0 m5362d(Class cls, Application application) {
        if (!AbstractC1628a.class.isAssignableFrom(cls)) {
            return z5.m11962a(cls);
        }
        try {
            w0 w0Var = (w0) cls.getConstructor(Application.class).newInstance(application);
            AbstractC4154l.m8920c(w0Var);
            return w0Var;
        } catch (IllegalAccessException e2) {
            throw new RuntimeException("Cannot create an instance of " + cls, e2);
        } catch (InstantiationException e10) {
            throw new RuntimeException("Cannot create an instance of " + cls, e10);
        } catch (NoSuchMethodException e11) {
            throw new RuntimeException("Cannot create an instance of " + cls, e11);
        } catch (InvocationTargetException e12) {
            throw new RuntimeException("Cannot create an instance of " + cls, e12);
        }
    }
}
