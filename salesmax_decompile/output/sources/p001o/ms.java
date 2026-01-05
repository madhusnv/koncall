package p001o;

import android.app.Activity;
import android.app.Application;
import android.content.res.Configuration;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.List;

/* loaded from: classes2.dex */
public abstract class ms {

    /* renamed from: a */
    public static final Class f35878a;

    /* renamed from: b */
    public static final Field f35879b;

    /* renamed from: c */
    public static final Field f35880c;

    /* renamed from: d */
    public static final Method f35881d;

    /* renamed from: e */
    public static final Method f35882e;

    /* renamed from: f */
    public static final Method f35883f;

    /* renamed from: g */
    public static final Handler f35884g = new Handler(Looper.getMainLooper());

    /* renamed from: o.ms$a */
    public class RunnableC15409a implements Runnable {

        /* renamed from: a */
        public final /* synthetic */ C15412d f35885a;

        /* renamed from: b */
        public final /* synthetic */ Object f35886b;

        public RunnableC15409a(C15412d c15412d, Object obj) {
            this.f35885a = c15412d;
            this.f35886b = obj;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f35885a.f35891a = this.f35886b;
        }
    }

    /* renamed from: o.ms$b */
    public class RunnableC15410b implements Runnable {

        /* renamed from: a */
        public final /* synthetic */ Application f35887a;

        /* renamed from: b */
        public final /* synthetic */ C15412d f35888b;

        public RunnableC15410b(Application application, C15412d c15412d) {
            this.f35887a = application;
            this.f35888b = c15412d;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f35887a.unregisterActivityLifecycleCallbacks(this.f35888b);
        }
    }

    /* renamed from: o.ms$c */
    public class RunnableC15411c implements Runnable {

        /* renamed from: a */
        public final /* synthetic */ Object f35889a;

        /* renamed from: b */
        public final /* synthetic */ Object f35890b;

        public RunnableC15411c(Object obj, Object obj2) {
            this.f35889a = obj;
            this.f35890b = obj2;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                Method method = ms.f35881d;
                if (method != null) {
                    method.invoke(this.f35889a, this.f35890b, Boolean.FALSE, "AppCompat recreation");
                } else {
                    ms.f35882e.invoke(this.f35889a, this.f35890b, Boolean.FALSE);
                }
            } catch (RuntimeException e) {
                if (e.getClass() == RuntimeException.class && e.getMessage() != null && e.getMessage().startsWith("Unable to stop")) {
                    throw e;
                }
            } catch (Throwable unused) {
            }
        }
    }

    /* renamed from: o.ms$d */
    public static final class C15412d implements Application.ActivityLifecycleCallbacks {

        /* renamed from: a */
        public Object f35891a;

        /* renamed from: b */
        public Activity f35892b;

        /* renamed from: c */
        public final int f35893c;

        /* renamed from: d */
        public boolean f35894d = false;

        /* renamed from: e */
        public boolean f35895e = false;

        /* renamed from: f */
        public boolean f35896f = false;

        public C15412d(Activity activity) {
            this.f35892b = activity;
            this.f35893c = activity.hashCode();
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityCreated(Activity activity, Bundle bundle) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityDestroyed(Activity activity) {
            if (this.f35892b == activity) {
                this.f35892b = null;
                this.f35895e = true;
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPaused(Activity activity) {
            if (!this.f35895e || this.f35896f || this.f35894d || !ms.m39594h(this.f35891a, this.f35893c, activity)) {
                return;
            }
            this.f35896f = true;
            this.f35891a = null;
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityResumed(Activity activity) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStarted(Activity activity) {
            if (this.f35892b == activity) {
                this.f35894d = true;
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStopped(Activity activity) {
        }
    }

    static {
        Class clsM39587a = m39587a();
        f35878a = clsM39587a;
        f35879b = m39588b();
        f35880c = m39592f();
        f35881d = m39590d(clsM39587a);
        f35882e = m39589c(clsM39587a);
        f35883f = m39591e(clsM39587a);
    }

    /* renamed from: a */
    public static Class m39587a() {
        try {
            return Class.forName("android.app.ActivityThread");
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: b */
    public static Field m39588b() {
        try {
            Field declaredField = Activity.class.getDeclaredField("mMainThread");
            declaredField.setAccessible(true);
            return declaredField;
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: c */
    public static Method m39589c(Class cls) {
        if (cls == null) {
            return null;
        }
        try {
            Method declaredMethod = cls.getDeclaredMethod("performStopActivity", IBinder.class, Boolean.TYPE);
            declaredMethod.setAccessible(true);
            return declaredMethod;
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: d */
    public static Method m39590d(Class cls) {
        if (cls == null) {
            return null;
        }
        try {
            Method declaredMethod = cls.getDeclaredMethod("performStopActivity", IBinder.class, Boolean.TYPE, String.class);
            declaredMethod.setAccessible(true);
            return declaredMethod;
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: e */
    public static Method m39591e(Class cls) {
        if (m39593g() && cls != null) {
            try {
                Class<?> cls2 = Boolean.TYPE;
                Method declaredMethod = cls.getDeclaredMethod("requestRelaunchActivity", IBinder.class, List.class, List.class, Integer.TYPE, cls2, Configuration.class, Configuration.class, cls2, cls2);
                declaredMethod.setAccessible(true);
                return declaredMethod;
            } catch (Throwable unused) {
            }
        }
        return null;
    }

    /* renamed from: f */
    public static Field m39592f() {
        try {
            Field declaredField = Activity.class.getDeclaredField("mToken");
            declaredField.setAccessible(true);
            return declaredField;
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: g */
    public static boolean m39593g() {
        int i = Build.VERSION.SDK_INT;
        return i == 26 || i == 27;
    }

    /* renamed from: h */
    public static boolean m39594h(Object obj, int i, Activity activity) {
        try {
            Object obj2 = f35880c.get(activity);
            if (obj2 == obj && activity.hashCode() == i) {
                f35884g.postAtFrontOfQueue(new RunnableC15411c(f35879b.get(activity), obj2));
                return true;
            }
        } catch (Throwable unused) {
        }
        return false;
    }

    /* renamed from: i */
    public static boolean m39595i(Activity activity) {
        Object obj;
        if (Build.VERSION.SDK_INT >= 28) {
            activity.recreate();
            return true;
        }
        if (m39593g() && f35883f == null) {
            return false;
        }
        if (f35882e == null && f35881d == null) {
            return false;
        }
        try {
            Object obj2 = f35880c.get(activity);
            if (obj2 == null || (obj = f35879b.get(activity)) == null) {
                return false;
            }
            Application application = activity.getApplication();
            C15412d c15412d = new C15412d(activity);
            application.registerActivityLifecycleCallbacks(c15412d);
            Handler handler = f35884g;
            handler.post(new RunnableC15409a(c15412d, obj2));
            try {
                if (m39593g()) {
                    Method method = f35883f;
                    Boolean bool = Boolean.FALSE;
                    method.invoke(obj, obj2, null, null, 0, bool, null, null, bool, bool);
                } else {
                    activity.recreate();
                }
                handler.post(new RunnableC15410b(application, c15412d));
                return true;
            } catch (Throwable th) {
                f35884g.post(new RunnableC15410b(application, c15412d));
                throw th;
            }
        } catch (Throwable unused) {
            return false;
        }
    }
}
