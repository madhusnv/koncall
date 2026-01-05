package retrofit2;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import java.lang.invoke.MethodHandles;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Executor;
import p001o.v8d;
import p001o.w8d;

/* renamed from: retrofit2.e */
/* loaded from: classes6.dex */
public class C18794e {

    /* renamed from: c */
    public static final C18794e f58024c = m60249e();

    /* renamed from: a */
    public final boolean f58025a;

    /* renamed from: b */
    public final Constructor f58026b;

    /* renamed from: retrofit2.e$a */
    public static final class a extends C18794e {

        /* renamed from: retrofit2.e$a$a, reason: collision with other inner class name */
        public static final class ExecutorC19598a implements Executor {

            /* renamed from: a */
            public final Handler f58027a = new Handler(Looper.getMainLooper());

            @Override // java.util.concurrent.Executor
            public void execute(Runnable runnable) {
                this.f58027a.post(runnable);
            }
        }

        public a() {
            super(true);
        }

        @Override // retrofit2.C18794e
        /* renamed from: b */
        public Executor mo60252b() {
            return new ExecutorC19598a();
        }

        @Override // retrofit2.C18794e
        /* renamed from: g */
        public Object mo60255g(Method method, Class cls, Object obj, Object... objArr) {
            if (Build.VERSION.SDK_INT >= 26) {
                return super.mo60255g(method, cls, obj, objArr);
            }
            throw new UnsupportedOperationException("Calling default methods on API 24 and 25 is not supported");
        }
    }

    public C18794e(boolean z) throws NoSuchMethodException, SecurityException {
        this.f58025a = z;
        Constructor declaredConstructor = null;
        if (z) {
            try {
                declaredConstructor = v8d.m52457a().getDeclaredConstructor(Class.class, Integer.TYPE);
                declaredConstructor.setAccessible(true);
            } catch (NoClassDefFoundError | NoSuchMethodException unused) {
            }
        }
        this.f58026b = declaredConstructor;
    }

    /* renamed from: e */
    public static C18794e m60249e() {
        return "Dalvik".equals(System.getProperty("java.vm.name")) ? new a() : new C18794e(true);
    }

    /* renamed from: f */
    public static C18794e m60250f() {
        return f58024c;
    }

    /* renamed from: a */
    public List m60251a(Executor executor) {
        C18792c c18792c = new C18792c(executor);
        return this.f58025a ? Arrays.asList(C18791b.f58006a, c18792c) : Collections.singletonList(c18792c);
    }

    /* renamed from: b */
    public Executor mo60252b() {
        return null;
    }

    /* renamed from: c */
    public List m60253c() {
        return this.f58025a ? Collections.singletonList(C18793d.f58022a) : Collections.emptyList();
    }

    /* renamed from: d */
    public int m60254d() {
        return this.f58025a ? 1 : 0;
    }

    /* renamed from: g */
    public Object mo60255g(Method method, Class cls, Object obj, Object... objArr) {
        Constructor constructor = this.f58026b;
        return (constructor != null ? w8d.m54065a(constructor.newInstance(cls, -1)) : MethodHandles.lookup()).unreflectSpecial(method, cls).bindTo(obj).invokeWithArguments(objArr);
    }

    /* renamed from: h */
    public boolean m60256h(Method method) {
        return this.f58025a && method.isDefault();
    }
}
