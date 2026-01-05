package p001o;

import android.app.Activity;
import android.graphics.Rect;
import androidx.window.extensions.WindowExtensionsProvider;
import androidx.window.extensions.layout.WindowLayoutComponent;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.function.Consumer;

/* loaded from: classes2.dex */
public final class k0f {

    /* renamed from: a */
    public static final k0f f31330a = new k0f();

    /* renamed from: b */
    public static final gi9 f31331b = si9.m48360a(C14691e.f31336a);

    /* renamed from: o.k0f$a */
    public static final class C14687a extends kf9 implements uk7 {

        /* renamed from: a */
        public final /* synthetic */ ClassLoader f31332a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C14687a(ClassLoader classLoader) {
            super(0);
            this.f31332a = classLoader;
        }

        @Override // p001o.uk7
        public final Boolean invoke() throws NoSuchMethodException, SecurityException {
            k0f k0fVar = k0f.f31330a;
            Class clsM34834l = k0fVar.m34834l(this.f31332a);
            boolean z = false;
            Method method = clsM34834l.getMethod("getBounds", new Class[0]);
            Method method2 = clsM34834l.getMethod("getType", new Class[0]);
            Method method3 = clsM34834l.getMethod("getState", new Class[0]);
            sq8.m48648g(method, "getBoundsMethod");
            if (k0fVar.m34833k(method, kge.m35689b(Rect.class)) && k0fVar.m34837o(method)) {
                sq8.m48648g(method2, "getTypeMethod");
                Class cls = Integer.TYPE;
                if (k0fVar.m34833k(method2, kge.m35689b(cls)) && k0fVar.m34837o(method2)) {
                    sq8.m48648g(method3, "getStateMethod");
                    if (k0fVar.m34833k(method3, kge.m35689b(cls)) && k0fVar.m34837o(method3)) {
                        z = true;
                    }
                }
            }
            return Boolean.valueOf(z);
        }
    }

    /* renamed from: o.k0f$b */
    public static final class C14688b extends kf9 implements uk7 {

        /* renamed from: a */
        public final /* synthetic */ ClassLoader f31333a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C14688b(ClassLoader classLoader) {
            super(0);
            this.f31333a = classLoader;
        }

        @Override // p001o.uk7
        public final Boolean invoke() throws NoSuchMethodException, SecurityException {
            k0f k0fVar = k0f.f31330a;
            boolean z = false;
            Method method = k0fVar.m34842t(this.f31333a).getMethod("getWindowLayoutComponent", new Class[0]);
            Class clsM34844v = k0fVar.m34844v(this.f31333a);
            sq8.m48648g(method, "getWindowLayoutComponentMethod");
            if (k0fVar.m34837o(method)) {
                sq8.m48648g(clsM34844v, "windowLayoutComponentClass");
                if (k0fVar.m34832j(method, clsM34844v)) {
                    z = true;
                }
            }
            return Boolean.valueOf(z);
        }
    }

    /* renamed from: o.k0f$c */
    public static final class C14689c extends kf9 implements uk7 {

        /* renamed from: a */
        public final /* synthetic */ ClassLoader f31334a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C14689c(ClassLoader classLoader) {
            super(0);
            this.f31334a = classLoader;
        }

        @Override // p001o.uk7
        public final Boolean invoke() throws NoSuchMethodException, SecurityException {
            k0f k0fVar = k0f.f31330a;
            Class clsM34844v = k0fVar.m34844v(this.f31334a);
            boolean z = false;
            Method method = clsM34844v.getMethod("addWindowLayoutInfoListener", Activity.class, Consumer.class);
            Method method2 = clsM34844v.getMethod("removeWindowLayoutInfoListener", Consumer.class);
            sq8.m48648g(method, "addListenerMethod");
            if (k0fVar.m34837o(method)) {
                sq8.m48648g(method2, "removeListenerMethod");
                if (k0fVar.m34837o(method2)) {
                    z = true;
                }
            }
            return Boolean.valueOf(z);
        }
    }

    /* renamed from: o.k0f$d */
    public static final class C14690d extends kf9 implements uk7 {

        /* renamed from: a */
        public final /* synthetic */ ClassLoader f31335a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C14690d(ClassLoader classLoader) {
            super(0);
            this.f31335a = classLoader;
        }

        @Override // p001o.uk7
        public final Boolean invoke() throws NoSuchMethodException, SecurityException {
            k0f k0fVar = k0f.f31330a;
            boolean z = false;
            Method declaredMethod = k0fVar.m34843u(this.f31335a).getDeclaredMethod("getWindowExtensions", new Class[0]);
            Class clsM34842t = k0fVar.m34842t(this.f31335a);
            sq8.m48648g(declaredMethod, "getWindowExtensionsMethod");
            sq8.m48648g(clsM34842t, "windowExtensionsClass");
            if (k0fVar.m34832j(declaredMethod, clsM34842t) && k0fVar.m34837o(declaredMethod)) {
                z = true;
            }
            return Boolean.valueOf(z);
        }
    }

    /* renamed from: o.k0f$e */
    public static final class C14691e extends kf9 implements uk7 {

        /* renamed from: a */
        public static final C14691e f31336a = new C14691e();

        public C14691e() {
            super(0);
        }

        @Override // p001o.uk7
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final WindowLayoutComponent invoke() {
            ClassLoader classLoader = k0f.class.getClassLoader();
            if (classLoader == null || !k0f.f31330a.m34831i(classLoader)) {
                return null;
            }
            try {
                return WindowExtensionsProvider.getWindowExtensions().getWindowLayoutComponent();
            } catch (UnsupportedOperationException unused) {
                return null;
            }
        }
    }

    /* renamed from: i */
    public final boolean m34831i(ClassLoader classLoader) {
        return m34840r(classLoader) && m34838p(classLoader) && m34839q(classLoader) && m34836n(classLoader);
    }

    /* renamed from: j */
    public final boolean m34832j(Method method, Class cls) {
        return method.getReturnType().equals(cls);
    }

    /* renamed from: k */
    public final boolean m34833k(Method method, ob9 ob9Var) {
        return m34832j(method, hb9.m30150a(ob9Var));
    }

    /* renamed from: l */
    public final Class m34834l(ClassLoader classLoader) {
        return classLoader.loadClass("androidx.window.extensions.layout.FoldingFeature");
    }

    /* renamed from: m */
    public final WindowLayoutComponent m34835m() {
        return (WindowLayoutComponent) f31331b.getValue();
    }

    /* renamed from: n */
    public final boolean m34836n(ClassLoader classLoader) {
        return m34841s(new C14687a(classLoader));
    }

    /* renamed from: o */
    public final boolean m34837o(Method method) {
        return Modifier.isPublic(method.getModifiers());
    }

    /* renamed from: p */
    public final boolean m34838p(ClassLoader classLoader) {
        return m34841s(new C14688b(classLoader));
    }

    /* renamed from: q */
    public final boolean m34839q(ClassLoader classLoader) {
        return m34841s(new C14689c(classLoader));
    }

    /* renamed from: r */
    public final boolean m34840r(ClassLoader classLoader) {
        return m34841s(new C14690d(classLoader));
    }

    /* renamed from: s */
    public final boolean m34841s(uk7 uk7Var) {
        try {
            return ((Boolean) uk7Var.invoke()).booleanValue();
        } catch (ClassNotFoundException | NoSuchMethodException unused) {
            return false;
        }
    }

    /* renamed from: t */
    public final Class m34842t(ClassLoader classLoader) {
        return classLoader.loadClass("androidx.window.extensions.WindowExtensions");
    }

    /* renamed from: u */
    public final Class m34843u(ClassLoader classLoader) {
        return classLoader.loadClass("androidx.window.extensions.WindowExtensionsProvider");
    }

    /* renamed from: v */
    public final Class m34844v(ClassLoader classLoader) {
        return classLoader.loadClass("androidx.window.extensions.layout.WindowLayoutComponent");
    }
}
