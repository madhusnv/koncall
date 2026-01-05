package p001o;

import java.lang.reflect.Method;
import java.util.List;
import p001o.kh8;

/* loaded from: classes5.dex */
public final class jh8 {

    /* renamed from: g */
    public static final C14544a f30431g = new C14544a(null);

    /* renamed from: h */
    public static jh8 f30432h;

    /* renamed from: a */
    public final Class f30433a;

    /* renamed from: b */
    public final Class f30434b;

    /* renamed from: c */
    public final Method f30435c;

    /* renamed from: d */
    public final Method f30436d;

    /* renamed from: e */
    public final Method f30437e;

    /* renamed from: f */
    public final Method f30438f;

    /* renamed from: o.jh8$a */
    public static final class C14544a {
        public C14544a() {
        }

        public /* synthetic */ C14544a(id5 id5Var) {
            this();
        }

        /* renamed from: a */
        public final jh8 m33836a() {
            Class clsM35712a = kh8.m35712a("com.android.billingclient.api.SkuDetailsParams");
            Class clsM35712a2 = kh8.m35712a("com.android.billingclient.api.SkuDetailsParams$Builder");
            if (clsM35712a == null || clsM35712a2 == null) {
                return null;
            }
            Method methodM35715d = kh8.m35715d(clsM35712a, "newBuilder", new Class[0]);
            Method methodM35715d2 = kh8.m35715d(clsM35712a2, "setType", String.class);
            Method methodM35715d3 = kh8.m35715d(clsM35712a2, "setSkusList", List.class);
            Method methodM35715d4 = kh8.m35715d(clsM35712a2, "build", new Class[0]);
            if (methodM35715d == null || methodM35715d2 == null || methodM35715d3 == null || methodM35715d4 == null) {
                return null;
            }
            jh8.m33833b(new jh8(clsM35712a, clsM35712a2, methodM35715d, methodM35715d2, methodM35715d3, methodM35715d4));
            return jh8.m33832a();
        }

        /* renamed from: b */
        public final synchronized jh8 m33837b() {
            jh8 jh8VarM33832a;
            jh8VarM33832a = jh8.m33832a();
            if (jh8VarM33832a == null) {
                jh8VarM33832a = m33836a();
            }
            return jh8VarM33832a;
        }
    }

    public jh8(Class cls, Class cls2, Method method, Method method2, Method method3, Method method4) {
        sq8.m48649h(cls, "skuDetailsParamsClazz");
        sq8.m48649h(cls2, "builderClazz");
        sq8.m48649h(method, "newBuilderMethod");
        sq8.m48649h(method2, "setTypeMethod");
        sq8.m48649h(method3, "setSkusListMethod");
        sq8.m48649h(method4, "buildMethod");
        this.f30433a = cls;
        this.f30434b = cls2;
        this.f30435c = method;
        this.f30436d = method2;
        this.f30437e = method3;
        this.f30438f = method4;
    }

    /* renamed from: a */
    public static final /* synthetic */ jh8 m33832a() {
        if (a94.m16694d(jh8.class)) {
            return null;
        }
        try {
            return f30432h;
        } catch (Throwable th) {
            a94.m16692b(th, jh8.class);
            return null;
        }
    }

    /* renamed from: b */
    public static final /* synthetic */ void m33833b(jh8 jh8Var) {
        if (a94.m16694d(jh8.class)) {
            return;
        }
        try {
            f30432h = jh8Var;
        } catch (Throwable th) {
            a94.m16692b(th, jh8.class);
        }
    }

    /* renamed from: c */
    public final Object m33834c(kh8.EnumC14836b enumC14836b, List list) {
        Object objM35716e;
        Object objM35716e2;
        if (a94.m16694d(this)) {
            return null;
        }
        try {
            sq8.m48649h(enumC14836b, "productType");
            Object objM35716e3 = kh8.m35716e(this.f30433a, this.f30435c, null, new Object[0]);
            if (objM35716e3 != null && (objM35716e = kh8.m35716e(this.f30434b, this.f30436d, objM35716e3, enumC14836b.getType())) != null && (objM35716e2 = kh8.m35716e(this.f30434b, this.f30437e, objM35716e, list)) != null) {
                return kh8.m35716e(this.f30434b, this.f30438f, objM35716e2, new Object[0]);
            }
            return null;
        } catch (Throwable th) {
            a94.m16692b(th, this);
            return null;
        }
    }

    /* renamed from: d */
    public final Class m33835d() {
        if (a94.m16694d(this)) {
            return null;
        }
        try {
            return this.f30433a;
        } catch (Throwable th) {
            a94.m16692b(th, this);
            return null;
        }
    }
}
