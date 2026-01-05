package p001o;

import android.content.Context;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;
import p001o.kh8;

/* loaded from: classes5.dex */
public final class bh8 implements yg8 {

    /* renamed from: s */
    public static bh8 f16214s;

    /* renamed from: a */
    public final Object f16219a;

    /* renamed from: b */
    public final Class f16220b;

    /* renamed from: c */
    public final Class f16221c;

    /* renamed from: d */
    public final Class f16222d;

    /* renamed from: e */
    public final Class f16223e;

    /* renamed from: f */
    public final Class f16224f;

    /* renamed from: g */
    public final Class f16225g;

    /* renamed from: h */
    public final Class f16226h;

    /* renamed from: i */
    public final Method f16227i;

    /* renamed from: j */
    public final Method f16228j;

    /* renamed from: k */
    public final Method f16229k;

    /* renamed from: l */
    public final Method f16230l;

    /* renamed from: m */
    public final Method f16231m;

    /* renamed from: n */
    public final Method f16232n;

    /* renamed from: o */
    public final Method f16233o;

    /* renamed from: p */
    public final jh8 f16234p;

    /* renamed from: q */
    public static final C12394b f16212q = new C12394b(null);

    /* renamed from: r */
    public static final String f16213r = bh8.class.getCanonicalName();

    /* renamed from: t */
    public static final AtomicBoolean f16215t = new AtomicBoolean(false);

    /* renamed from: u */
    public static final Map f16216u = new ConcurrentHashMap();

    /* renamed from: v */
    public static final Map f16217v = new ConcurrentHashMap();

    /* renamed from: w */
    public static final Map f16218w = new ConcurrentHashMap();

    /* renamed from: o.bh8$a */
    public static final class C12393a implements InvocationHandler {

        /* renamed from: a */
        public final Runnable f16235a;

        public C12393a(Runnable runnable) {
            this.f16235a = runnable;
        }

        @Override // java.lang.reflect.InvocationHandler
        public Object invoke(Object obj, Method method, Object[] objArr) {
            Method methodM35715d;
            if (a94.m16694d(this)) {
                return null;
            }
            try {
                sq8.m48649h(obj, "proxy");
                sq8.m48649h(method, "m");
                if (sq8.m48644c(method.getName(), "onBillingSetupFinished")) {
                    Object objF0 = objArr != null ? gp0.f0(objArr, 0) : null;
                    Class clsM35712a = kh8.m35712a("com.android.billingclient.api.BillingResult");
                    if (clsM35712a != null && (methodM35715d = kh8.m35715d(clsM35712a, "getResponseCode", new Class[0])) != null && sq8.m48644c(kh8.m35716e(clsM35712a, methodM35715d, objF0, new Object[0]), 0)) {
                        bh8.f16212q.m18999g().set(true);
                        Runnable runnable = this.f16235a;
                        if (runnable != null) {
                            runnable.run();
                        }
                    }
                } else {
                    String name = method.getName();
                    sq8.m48648g(name, "m.name");
                    if (e9g.m24605w(name, "onBillingServiceDisconnected", false, 2, null)) {
                        bh8.f16212q.m18999g().set(false);
                    }
                }
                return null;
            } catch (Throwable th) {
                a94.m16692b(th, this);
                return null;
            }
        }
    }

    /* renamed from: o.bh8$b */
    public static final class C12394b {
        public C12394b() {
        }

        public /* synthetic */ C12394b(id5 id5Var) {
            this();
        }

        /* renamed from: a */
        public final Object m18993a(Context context, Class cls) {
            Object objM35716e;
            Object objM35716e2;
            Object objM35716e3;
            Class clsM35712a = kh8.m35712a("com.android.billingclient.api.BillingClient$Builder");
            Class clsM35712a2 = kh8.m35712a("com.android.billingclient.api.PurchasesUpdatedListener");
            if (clsM35712a == null || clsM35712a2 == null) {
                return null;
            }
            Method methodM35715d = kh8.m35715d(cls, "newBuilder", Context.class);
            Method methodM35715d2 = kh8.m35715d(clsM35712a, "enablePendingPurchases", new Class[0]);
            Method methodM35715d3 = kh8.m35715d(clsM35712a, "setListener", clsM35712a2);
            Method methodM35715d4 = kh8.m35715d(clsM35712a, "build", new Class[0]);
            if (methodM35715d == null || methodM35715d2 == null || methodM35715d3 == null || methodM35715d4 == null || (objM35716e = kh8.m35716e(cls, methodM35715d, null, context)) == null || (objM35716e2 = kh8.m35716e(clsM35712a, methodM35715d3, objM35716e, Proxy.newProxyInstance(clsM35712a2.getClassLoader(), new Class[]{clsM35712a2}, new C12396d()))) == null || (objM35716e3 = kh8.m35716e(clsM35712a, methodM35715d2, objM35716e2, new Object[0])) == null) {
                return null;
            }
            return kh8.m35716e(clsM35712a, methodM35715d4, objM35716e3, new Object[0]);
        }

        /* renamed from: b */
        public final bh8 m18994b(Context context) {
            jh8 jh8VarM33837b = jh8.f30431g.m33837b();
            if (jh8VarM33837b == null) {
                return null;
            }
            Class clsM35712a = kh8.m35712a("com.android.billingclient.api.BillingClient");
            Class clsM35712a2 = kh8.m35712a("com.android.billingclient.api.Purchase");
            Class clsM35712a3 = kh8.m35712a("com.android.billingclient.api.Purchase$PurchasesResult");
            Class clsM35712a4 = kh8.m35712a("com.android.billingclient.api.SkuDetails");
            Class clsM35712a5 = kh8.m35712a("com.android.billingclient.api.PurchaseHistoryRecord");
            Class clsM35712a6 = kh8.m35712a("com.android.billingclient.api.SkuDetailsResponseListener");
            Class clsM35712a7 = kh8.m35712a("com.android.billingclient.api.PurchaseHistoryResponseListener");
            if (clsM35712a == null || clsM35712a3 == null || clsM35712a2 == null || clsM35712a4 == null || clsM35712a6 == null || clsM35712a5 == null || clsM35712a7 == null) {
                bh8.m18982l();
                return null;
            }
            Method methodM35715d = kh8.m35715d(clsM35712a, "queryPurchases", String.class);
            Method methodM35715d2 = kh8.m35715d(clsM35712a3, "getPurchasesList", new Class[0]);
            Method methodM35715d3 = kh8.m35715d(clsM35712a2, "getOriginalJson", new Class[0]);
            Method methodM35715d4 = kh8.m35715d(clsM35712a4, "getOriginalJson", new Class[0]);
            Method methodM35715d5 = kh8.m35715d(clsM35712a5, "getOriginalJson", new Class[0]);
            Method methodM35715d6 = kh8.m35715d(clsM35712a, "querySkuDetailsAsync", jh8VarM33837b.m33835d(), clsM35712a6);
            Method methodM35715d7 = kh8.m35715d(clsM35712a, "queryPurchaseHistoryAsync", String.class, clsM35712a7);
            if (methodM35715d == null || methodM35715d2 == null || methodM35715d3 == null || methodM35715d4 == null || methodM35715d5 == null || methodM35715d6 == null || methodM35715d7 == null) {
                bh8.m18982l();
                return null;
            }
            Object objM18993a = m18993a(context, clsM35712a);
            if (objM18993a == null) {
                bh8.m18982l();
                return null;
            }
            bh8.m18985o(new bh8(objM18993a, clsM35712a, clsM35712a3, clsM35712a2, clsM35712a4, clsM35712a5, clsM35712a6, clsM35712a7, methodM35715d, methodM35715d2, methodM35715d3, methodM35715d4, methodM35715d5, methodM35715d6, methodM35715d7, jh8VarM33837b, null));
            return bh8.m18977g();
        }

        /* renamed from: c */
        public final Map m18995c() {
            return bh8.m18976f();
        }

        /* renamed from: d */
        public final synchronized bh8 m18996d(Context context) {
            bh8 bh8VarM18977g;
            sq8.m48649h(context, "context");
            bh8VarM18977g = bh8.m18977g();
            if (bh8VarM18977g == null) {
                bh8VarM18977g = m18994b(context);
            }
            return bh8VarM18977g;
        }

        /* renamed from: e */
        public final Map m18997e() {
            return bh8.m18980j();
        }

        /* renamed from: f */
        public final Map m18998f() {
            return bh8.m18981k();
        }

        /* renamed from: g */
        public final AtomicBoolean m18999g() {
            return bh8.m18983m();
        }
    }

    /* renamed from: o.bh8$c */
    public final class C12395c implements InvocationHandler {

        /* renamed from: a */
        public kh8.EnumC14836b f16236a;

        /* renamed from: b */
        public Runnable f16237b;

        /* renamed from: c */
        public final /* synthetic */ bh8 f16238c;

        public C12395c(bh8 bh8Var, kh8.EnumC14836b enumC14836b, Runnable runnable) {
            sq8.m48649h(enumC14836b, "skuType");
            sq8.m48649h(runnable, "completionHandler");
            this.f16238c = bh8Var;
            this.f16236a = enumC14836b;
            this.f16237b = runnable;
        }

        /* renamed from: a */
        public void m19000a(Object obj, Method method, Object[] objArr) {
            if (a94.m16694d(this)) {
                return;
            }
            try {
                sq8.m48649h(obj, "proxy");
                sq8.m48649h(method, FirebaseAnalytics.Param.METHOD);
                if (sq8.m48644c(method.getName(), "onPurchaseHistoryResponse")) {
                    Object objF0 = objArr != null ? gp0.f0(objArr, 1) : null;
                    if (objF0 != null && (objF0 instanceof List)) {
                        ArrayList arrayList = new ArrayList();
                        Iterator it = ((List) objF0).iterator();
                        while (it.hasNext()) {
                            try {
                                Object objM35716e = kh8.m35716e(bh8.m18978h(this.f16238c), bh8.m18974d(this.f16238c), it.next(), new Object[0]);
                                String str = objM35716e instanceof String ? (String) objM35716e : null;
                                if (str != null) {
                                    JSONObject jSONObject = new JSONObject(str);
                                    if (jSONObject.has("productId")) {
                                        String string = jSONObject.getString("productId");
                                        sq8.m48648g(string, "skuID");
                                        arrayList.add(string);
                                        if (this.f16236a == kh8.EnumC14836b.INAPP) {
                                            bh8.f16212q.m18995c().put(string, jSONObject);
                                        } else {
                                            bh8.f16212q.m18998f().put(string, jSONObject);
                                        }
                                    }
                                }
                            } catch (Exception unused) {
                            }
                        }
                        if (true ^ arrayList.isEmpty()) {
                            bh8.m18984n(this.f16238c, this.f16236a, arrayList, this.f16237b);
                        } else {
                            this.f16237b.run();
                        }
                    }
                }
            } catch (Throwable th) {
                a94.m16692b(th, this);
            }
        }

        @Override // java.lang.reflect.InvocationHandler
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Method method, Object[] objArr) {
            if (a94.m16694d(this)) {
                return null;
            }
            try {
                m19000a(obj, method, objArr);
                return y3i.f54824a;
            } catch (Throwable th) {
                a94.m16692b(th, this);
                return null;
            }
        }
    }

    /* renamed from: o.bh8$d */
    public static final class C12396d implements InvocationHandler {
        @Override // java.lang.reflect.InvocationHandler
        public Object invoke(Object obj, Method method, Object[] objArr) {
            if (a94.m16694d(this)) {
                return null;
            }
            try {
                sq8.m48649h(obj, "proxy");
                sq8.m48649h(method, "m");
                return null;
            } catch (Throwable th) {
                a94.m16692b(th, this);
                return null;
            }
        }
    }

    /* renamed from: o.bh8$e */
    public final class C12397e implements InvocationHandler {

        /* renamed from: a */
        public Runnable f16239a;

        /* renamed from: b */
        public final /* synthetic */ bh8 f16240b;

        public C12397e(bh8 bh8Var, Runnable runnable) {
            sq8.m48649h(runnable, "completionHandler");
            this.f16240b = bh8Var;
            this.f16239a = runnable;
        }

        /* renamed from: a */
        public void m19001a(Object obj, Method method, Object[] objArr) {
            if (a94.m16694d(this)) {
                return;
            }
            try {
                sq8.m48649h(obj, "proxy");
                sq8.m48649h(method, "m");
                if (sq8.m48644c(method.getName(), "onSkuDetailsResponse")) {
                    Object objF0 = objArr != null ? gp0.f0(objArr, 1) : null;
                    if (objF0 != null && (objF0 instanceof List)) {
                        Iterator it = ((List) objF0).iterator();
                        while (it.hasNext()) {
                            try {
                                Object objM35716e = kh8.m35716e(bh8.m18979i(this.f16240b), bh8.m18975e(this.f16240b), it.next(), new Object[0]);
                                String str = objM35716e instanceof String ? (String) objM35716e : null;
                                if (str != null) {
                                    JSONObject jSONObject = new JSONObject(str);
                                    if (jSONObject.has("productId")) {
                                        String string = jSONObject.getString("productId");
                                        Map mapM18997e = bh8.f16212q.m18997e();
                                        sq8.m48648g(string, "skuID");
                                        mapM18997e.put(string, jSONObject);
                                    }
                                }
                            } catch (Exception unused) {
                            }
                        }
                        this.f16239a.run();
                    }
                }
            } catch (Throwable th) {
                a94.m16692b(th, this);
            }
        }

        @Override // java.lang.reflect.InvocationHandler
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Method method, Object[] objArr) {
            if (a94.m16694d(this)) {
                return null;
            }
            try {
                m19001a(obj, method, objArr);
                return y3i.f54824a;
            } catch (Throwable th) {
                a94.m16692b(th, this);
                return null;
            }
        }
    }

    public /* synthetic */ bh8(Object obj, Class cls, Class cls2, Class cls3, Class cls4, Class cls5, Class cls6, Class cls7, Method method, Method method2, Method method3, Method method4, Method method5, Method method6, Method method7, jh8 jh8Var, id5 id5Var) {
        this(obj, cls, cls2, cls3, cls4, cls5, cls6, cls7, method, method2, method3, method4, method5, method6, method7, jh8Var);
    }

    /* renamed from: d */
    public static final /* synthetic */ Method m18974d(bh8 bh8Var) {
        if (a94.m16694d(bh8.class)) {
            return null;
        }
        try {
            return bh8Var.f16231m;
        } catch (Throwable th) {
            a94.m16692b(th, bh8.class);
            return null;
        }
    }

    /* renamed from: e */
    public static final /* synthetic */ Method m18975e(bh8 bh8Var) {
        if (a94.m16694d(bh8.class)) {
            return null;
        }
        try {
            return bh8Var.f16230l;
        } catch (Throwable th) {
            a94.m16692b(th, bh8.class);
            return null;
        }
    }

    /* renamed from: f */
    public static final /* synthetic */ Map m18976f() {
        if (a94.m16694d(bh8.class)) {
            return null;
        }
        try {
            return f16216u;
        } catch (Throwable th) {
            a94.m16692b(th, bh8.class);
            return null;
        }
    }

    /* renamed from: g */
    public static final /* synthetic */ bh8 m18977g() {
        if (a94.m16694d(bh8.class)) {
            return null;
        }
        try {
            return f16214s;
        } catch (Throwable th) {
            a94.m16692b(th, bh8.class);
            return null;
        }
    }

    /* renamed from: h */
    public static final /* synthetic */ Class m18978h(bh8 bh8Var) {
        if (a94.m16694d(bh8.class)) {
            return null;
        }
        try {
            return bh8Var.f16224f;
        } catch (Throwable th) {
            a94.m16692b(th, bh8.class);
            return null;
        }
    }

    /* renamed from: i */
    public static final /* synthetic */ Class m18979i(bh8 bh8Var) {
        if (a94.m16694d(bh8.class)) {
            return null;
        }
        try {
            return bh8Var.f16223e;
        } catch (Throwable th) {
            a94.m16692b(th, bh8.class);
            return null;
        }
    }

    /* renamed from: j */
    public static final /* synthetic */ Map m18980j() {
        if (a94.m16694d(bh8.class)) {
            return null;
        }
        try {
            return f16218w;
        } catch (Throwable th) {
            a94.m16692b(th, bh8.class);
            return null;
        }
    }

    /* renamed from: k */
    public static final /* synthetic */ Map m18981k() {
        if (a94.m16694d(bh8.class)) {
            return null;
        }
        try {
            return f16217v;
        } catch (Throwable th) {
            a94.m16692b(th, bh8.class);
            return null;
        }
    }

    /* renamed from: l */
    public static final /* synthetic */ String m18982l() {
        if (a94.m16694d(bh8.class)) {
            return null;
        }
        try {
            return f16213r;
        } catch (Throwable th) {
            a94.m16692b(th, bh8.class);
            return null;
        }
    }

    /* renamed from: m */
    public static final /* synthetic */ AtomicBoolean m18983m() {
        if (a94.m16694d(bh8.class)) {
            return null;
        }
        try {
            return f16215t;
        } catch (Throwable th) {
            a94.m16692b(th, bh8.class);
            return null;
        }
    }

    /* renamed from: n */
    public static final /* synthetic */ void m18984n(bh8 bh8Var, kh8.EnumC14836b enumC14836b, List list, Runnable runnable) {
        if (a94.m16694d(bh8.class)) {
            return;
        }
        try {
            bh8Var.m18991s(enumC14836b, list, runnable);
        } catch (Throwable th) {
            a94.m16692b(th, bh8.class);
        }
    }

    /* renamed from: o */
    public static final /* synthetic */ void m18985o(bh8 bh8Var) {
        if (a94.m16694d(bh8.class)) {
            return;
        }
        try {
            f16214s = bh8Var;
        } catch (Throwable th) {
            a94.m16692b(th, bh8.class);
        }
    }

    /* renamed from: r */
    public static final void m18986r(bh8 bh8Var, kh8.EnumC14836b enumC14836b, Runnable runnable) {
        if (a94.m16694d(bh8.class)) {
            return;
        }
        try {
            sq8.m48649h(bh8Var, "this$0");
            sq8.m48649h(enumC14836b, "$productType");
            sq8.m48649h(runnable, "$completionHandler");
            kh8.m35716e(bh8Var.f16220b, bh8Var.f16233o, bh8Var.m18990q(), enumC14836b.getType(), Proxy.newProxyInstance(bh8Var.f16226h.getClassLoader(), new Class[]{bh8Var.f16226h}, new C12395c(bh8Var, enumC14836b, runnable)));
        } catch (Throwable th) {
            a94.m16692b(th, bh8.class);
        }
    }

    /* renamed from: t */
    public static final void m18987t(bh8 bh8Var, Runnable runnable, kh8.EnumC14836b enumC14836b, List list) {
        if (a94.m16694d(bh8.class)) {
            return;
        }
        try {
            sq8.m48649h(bh8Var, "this$0");
            sq8.m48649h(runnable, "$completionHandler");
            sq8.m48649h(enumC14836b, "$skuType");
            sq8.m48649h(list, "$skuIDs");
            kh8.m35716e(bh8Var.f16220b, bh8Var.f16232n, bh8Var.m18990q(), bh8Var.f16234p.m33834c(enumC14836b, list), Proxy.newProxyInstance(bh8Var.f16225g.getClassLoader(), new Class[]{bh8Var.f16225g}, new C12397e(bh8Var, runnable)));
        } catch (Throwable th) {
            a94.m16692b(th, bh8.class);
        }
    }

    @Override // p001o.yg8
    /* renamed from: a */
    public void mo18988a(final kh8.EnumC14836b enumC14836b, final Runnable runnable) {
        if (a94.m16694d(this)) {
            return;
        }
        try {
            sq8.m48649h(enumC14836b, "productType");
            sq8.m48649h(runnable, "completionHandler");
            m18989p(new Runnable() { // from class: o.zg8
                @Override // java.lang.Runnable
                public final void run() {
                    bh8.m18986r(this.f57165a, enumC14836b, runnable);
                }
            });
        } catch (Throwable th) {
            a94.m16692b(th, this);
        }
    }

    /* renamed from: p */
    public final void m18989p(Runnable runnable) {
        if (a94.m16694d(this)) {
            return;
        }
        try {
            if (f16215t.get()) {
                runnable.run();
            } else {
                m18992u(runnable);
            }
        } catch (Throwable th) {
            a94.m16692b(th, this);
        }
    }

    /* renamed from: q */
    public Object m18990q() {
        if (a94.m16694d(this)) {
            return null;
        }
        try {
            return this.f16219a;
        } catch (Throwable th) {
            a94.m16692b(th, this);
            return null;
        }
    }

    /* renamed from: s */
    public final void m18991s(final kh8.EnumC14836b enumC14836b, final List list, final Runnable runnable) {
        if (a94.m16694d(this)) {
            return;
        }
        try {
            m18989p(new Runnable() { // from class: o.ah8
                @Override // java.lang.Runnable
                public final void run() {
                    bh8.m18987t(this.f14711a, runnable, enumC14836b, list);
                }
            });
        } catch (Throwable th) {
            a94.m16692b(th, this);
        }
    }

    /* renamed from: u */
    public final void m18992u(Runnable runnable) {
        Method methodM35715d;
        if (a94.m16694d(this)) {
            return;
        }
        try {
            Class clsM35712a = kh8.m35712a("com.android.billingclient.api.BillingClientStateListener");
            if (clsM35712a == null || (methodM35715d = kh8.m35715d(this.f16220b, "startConnection", clsM35712a)) == null) {
                return;
            }
            kh8.m35716e(this.f16220b, methodM35715d, m18990q(), Proxy.newProxyInstance(clsM35712a.getClassLoader(), new Class[]{clsM35712a}, new C12393a(runnable)));
        } catch (Throwable th) {
            a94.m16692b(th, this);
        }
    }

    public bh8(Object obj, Class cls, Class cls2, Class cls3, Class cls4, Class cls5, Class cls6, Class cls7, Method method, Method method2, Method method3, Method method4, Method method5, Method method6, Method method7, jh8 jh8Var) {
        this.f16219a = obj;
        this.f16220b = cls;
        this.f16221c = cls2;
        this.f16222d = cls3;
        this.f16223e = cls4;
        this.f16224f = cls5;
        this.f16225g = cls6;
        this.f16226h = cls7;
        this.f16227i = method;
        this.f16228j = method2;
        this.f16229k = method3;
        this.f16230l = method4;
        this.f16231m = method5;
        this.f16232n = method6;
        this.f16233o = method7;
        this.f16234p = jh8Var;
    }
}
