package p001o;

import android.content.Context;
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
public final class eh8 implements yg8 {

    /* renamed from: Q */
    public static eh8 f21616Q;

    /* renamed from: A */
    public final Method f21620A;

    /* renamed from: B */
    public final Method f21621B;

    /* renamed from: C */
    public final Method f21622C;

    /* renamed from: D */
    public final Method f21623D;

    /* renamed from: E */
    public final Method f21624E;

    /* renamed from: F */
    public final Method f21625F;

    /* renamed from: G */
    public final Method f21626G;

    /* renamed from: H */
    public final Method f21627H;

    /* renamed from: I */
    public final Method f21628I;

    /* renamed from: J */
    public final Method f21629J;

    /* renamed from: K */
    public final Method f21630K;

    /* renamed from: L */
    public final Method f21631L;

    /* renamed from: M */
    public final Method f21632M;

    /* renamed from: a */
    public final Object f21633a;

    /* renamed from: b */
    public final Class f21634b;

    /* renamed from: c */
    public final Class f21635c;

    /* renamed from: d */
    public final Class f21636d;

    /* renamed from: e */
    public final Class f21637e;

    /* renamed from: f */
    public final Class f21638f;

    /* renamed from: g */
    public final Class f21639g;

    /* renamed from: h */
    public final Class f21640h;

    /* renamed from: i */
    public final Class f21641i;

    /* renamed from: j */
    public final Class f21642j;

    /* renamed from: k */
    public final Class f21643k;

    /* renamed from: l */
    public final Class f21644l;

    /* renamed from: m */
    public final Class f21645m;

    /* renamed from: n */
    public final Class f21646n;

    /* renamed from: o */
    public final Class f21647o;

    /* renamed from: p */
    public final Class f21648p;

    /* renamed from: q */
    public final Class f21649q;

    /* renamed from: r */
    public final Class f21650r;

    /* renamed from: s */
    public final Method f21651s;

    /* renamed from: t */
    public final Method f21652t;

    /* renamed from: u */
    public final Method f21653u;

    /* renamed from: v */
    public final Method f21654v;

    /* renamed from: w */
    public final Method f21655w;

    /* renamed from: x */
    public final Method f21656x;

    /* renamed from: y */
    public final Method f21657y;

    /* renamed from: z */
    public final Method f21658z;

    /* renamed from: N */
    public static final C13190a f21613N = new C13190a(null);

    /* renamed from: O */
    public static final String f21614O = eh8.class.getCanonicalName();

    /* renamed from: P */
    public static final AtomicBoolean f21615P = new AtomicBoolean(false);

    /* renamed from: R */
    public static final Map f21617R = new ConcurrentHashMap();

    /* renamed from: S */
    public static final Map f21618S = new ConcurrentHashMap();

    /* renamed from: T */
    public static final Map f21619T = new ConcurrentHashMap();

    /* renamed from: o.eh8$a */
    public static final class C13190a implements InvocationHandler {
        public C13190a() {
        }

        public /* synthetic */ C13190a(id5 id5Var) {
            this();
        }

        /* renamed from: a */
        public final Object m25041a(Context context, Class cls, Class cls2, Class cls3) {
            Object objM35716e;
            Method methodM35715d = kh8.m35715d(cls, "newBuilder", Context.class);
            Method methodM35715d2 = kh8.m35715d(cls2, "setListener", cls3);
            Method methodM35715d3 = kh8.m35715d(cls2, "enablePendingPurchases", new Class[0]);
            Method methodM35715d4 = kh8.m35715d(cls2, "build", new Class[0]);
            if (methodM35715d4 == null || methodM35715d2 == null || methodM35715d == null || methodM35715d3 == null || (objM35716e = kh8.m35716e(cls2, methodM35715d2, kh8.m35716e(cls, methodM35715d, null, context), Proxy.newProxyInstance(cls3.getClassLoader(), new Class[]{cls3}, this))) == null) {
                return null;
            }
            return kh8.m35716e(cls2, methodM35715d4, kh8.m35716e(cls2, methodM35715d3, objM35716e, new Object[0]), new Object[0]);
        }

        /* renamed from: b */
        public final eh8 m25042b(Context context) {
            Class clsM35712a = kh8.m35712a("com.android.billingclient.api.BillingClient");
            Class clsM35712a2 = kh8.m35712a("com.android.billingclient.api.Purchase");
            Class clsM35712a3 = kh8.m35712a("com.android.billingclient.api.ProductDetails");
            Class clsM35712a4 = kh8.m35712a("com.android.billingclient.api.PurchaseHistoryRecord");
            Class clsM35712a5 = kh8.m35712a("com.android.billingclient.api.QueryProductDetailsParams$Product");
            Class clsM35712a6 = kh8.m35712a("com.android.billingclient.api.BillingResult");
            Class clsM35712a7 = kh8.m35712a("com.android.billingclient.api.QueryProductDetailsParams");
            Class clsM35712a8 = kh8.m35712a("com.android.billingclient.api.QueryPurchaseHistoryParams");
            Class clsM35712a9 = kh8.m35712a("com.android.billingclient.api.QueryPurchasesParams");
            Class clsM35712a10 = kh8.m35712a("com.android.billingclient.api.QueryProductDetailsParams$Builder");
            Class clsM35712a11 = kh8.m35712a("com.android.billingclient.api.QueryPurchaseHistoryParams$Builder");
            Class clsM35712a12 = kh8.m35712a("com.android.billingclient.api.QueryPurchasesParams$Builder");
            Class clsM35712a13 = kh8.m35712a("com.android.billingclient.api.QueryProductDetailsParams$Product$Builder");
            Class clsM35712a14 = kh8.m35712a("com.android.billingclient.api.BillingClient$Builder");
            Class clsM35712a15 = kh8.m35712a("com.android.billingclient.api.PurchasesUpdatedListener");
            Class clsM35712a16 = kh8.m35712a("com.android.billingclient.api.BillingClientStateListener");
            Class clsM35712a17 = kh8.m35712a("com.android.billingclient.api.ProductDetailsResponseListener");
            Class clsM35712a18 = kh8.m35712a("com.android.billingclient.api.PurchasesResponseListener");
            Class clsM35712a19 = kh8.m35712a("com.android.billingclient.api.PurchaseHistoryResponseListener");
            if (clsM35712a == null || clsM35712a2 == null || clsM35712a3 == null || clsM35712a4 == null || clsM35712a5 == null || clsM35712a6 == null || clsM35712a7 == null || clsM35712a8 == null || clsM35712a9 == null || clsM35712a10 == null || clsM35712a11 == null || clsM35712a12 == null || clsM35712a13 == null || clsM35712a14 == null || clsM35712a15 == null || clsM35712a16 == null || clsM35712a17 == null || clsM35712a18 == null || clsM35712a19 == null) {
                eh8.m25021h();
                return null;
            }
            Method methodM35715d = kh8.m35715d(clsM35712a, "queryPurchasesAsync", clsM35712a9, clsM35712a18);
            Method methodM35715d2 = kh8.m35715d(clsM35712a9, "newBuilder", new Class[0]);
            Method methodM35715d3 = kh8.m35715d(clsM35712a12, "build", new Class[0]);
            Method methodM35715d4 = kh8.m35715d(clsM35712a12, "setProductType", String.class);
            Method methodM35715d5 = kh8.m35715d(clsM35712a2, "getOriginalJson", new Class[0]);
            Method methodM35715d6 = kh8.m35715d(clsM35712a, "queryPurchaseHistoryAsync", clsM35712a8, clsM35712a19);
            Method methodM35715d7 = kh8.m35715d(clsM35712a8, "newBuilder", new Class[0]);
            Method methodM35715d8 = kh8.m35715d(clsM35712a11, "build", new Class[0]);
            Method methodM35715d9 = kh8.m35715d(clsM35712a11, "setProductType", String.class);
            Method methodM35715d10 = kh8.m35715d(clsM35712a4, "getOriginalJson", new Class[0]);
            Method methodM35715d11 = kh8.m35715d(clsM35712a, "queryProductDetailsAsync", clsM35712a7, clsM35712a17);
            Method methodM35715d12 = kh8.m35715d(clsM35712a7, "newBuilder", new Class[0]);
            Method methodM35715d13 = kh8.m35715d(clsM35712a10, "build", new Class[0]);
            Method methodM35715d14 = kh8.m35715d(clsM35712a10, "setProductList", List.class);
            Method methodM35715d15 = kh8.m35715d(clsM35712a5, "newBuilder", new Class[0]);
            Method methodM35715d16 = kh8.m35715d(clsM35712a13, "build", new Class[0]);
            Method methodM35715d17 = kh8.m35715d(clsM35712a13, "setProductId", String.class);
            Method methodM35715d18 = kh8.m35715d(clsM35712a13, "setProductType", String.class);
            Method methodM35715d19 = kh8.m35715d(clsM35712a3, "toString", new Class[0]);
            Method methodM35715d20 = kh8.m35715d(clsM35712a, "startConnection", clsM35712a16);
            Method methodM35715d21 = kh8.m35715d(clsM35712a6, "getResponseCode", new Class[0]);
            if (methodM35715d == null || methodM35715d2 == null || methodM35715d3 == null || methodM35715d4 == null || methodM35715d5 == null || methodM35715d6 == null || methodM35715d7 == null || methodM35715d8 == null || methodM35715d9 == null || methodM35715d10 == null || methodM35715d11 == null || methodM35715d12 == null || methodM35715d13 == null || methodM35715d14 == null || methodM35715d15 == null || methodM35715d16 == null || methodM35715d17 == null || methodM35715d18 == null || methodM35715d19 == null || methodM35715d20 == null || methodM35715d21 == null) {
                eh8.m25021h();
                return null;
            }
            Object objM25041a = m25041a(context, clsM35712a, clsM35712a14, clsM35712a15);
            if (objM25041a == null) {
                eh8.m25021h();
                return null;
            }
            eh8.m25027n(new eh8(objM25041a, clsM35712a, clsM35712a2, clsM35712a3, clsM35712a4, clsM35712a5, clsM35712a6, clsM35712a7, clsM35712a8, clsM35712a9, clsM35712a10, clsM35712a11, clsM35712a12, clsM35712a13, clsM35712a16, clsM35712a17, clsM35712a18, clsM35712a19, methodM35715d, methodM35715d2, methodM35715d3, methodM35715d4, methodM35715d5, methodM35715d6, methodM35715d7, methodM35715d8, methodM35715d9, methodM35715d10, methodM35715d11, methodM35715d12, methodM35715d13, methodM35715d14, methodM35715d15, methodM35715d16, methodM35715d17, methodM35715d18, methodM35715d19, methodM35715d20, methodM35715d21, null));
            return eh8.m25018e();
        }

        /* renamed from: c */
        public final Map m25043c() {
            return eh8.m25017d();
        }

        /* renamed from: d */
        public final synchronized eh8 m25044d(Context context) {
            eh8 eh8VarM25018e;
            sq8.m48649h(context, "context");
            eh8VarM25018e = eh8.m25018e();
            if (eh8VarM25018e == null) {
                eh8VarM25018e = m25042b(context);
            }
            return eh8VarM25018e;
        }

        /* renamed from: e */
        public final Map m25045e() {
            return eh8.m25019f();
        }

        /* renamed from: f */
        public final Map m25046f() {
            return eh8.m25020g();
        }

        @Override // java.lang.reflect.InvocationHandler
        public Object invoke(Object obj, Method method, Object[] objArr) {
            sq8.m48649h(obj, "proxy");
            sq8.m48649h(method, "m");
            return null;
        }
    }

    /* renamed from: o.eh8$b */
    public final class C13191b implements InvocationHandler {

        /* renamed from: a */
        public Object[] f21659a;

        public C13191b(Object[] objArr) {
            this.f21659a = objArr;
        }

        /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
        java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
        	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
        	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
         */
        @Override // java.lang.reflect.InvocationHandler
        public Object invoke(Object obj, Method method, Object[] objArr) {
            sq8.m48649h(obj, "proxy");
            sq8.m48649h(method, "m");
            String name = method.getName();
            if (name == null) {
                return null;
            }
            switch (name.hashCode()) {
                case -1642587947:
                    if (name.equals("onPurchaseHistoryResponse")) {
                        eh8.m25025l(eh8.this, this.f21659a, objArr);
                        break;
                    }
                    break;
                case -1599362358:
                    if (name.equals("onQueryPurchasesResponse")) {
                        eh8.m25026m(eh8.this, this.f21659a, objArr);
                        break;
                    }
                    break;
                case -79406125:
                    if (name.equals("onBillingSetupFinished")) {
                        eh8.m25023j(eh8.this, this.f21659a, objArr);
                        break;
                    }
                    break;
                case 1227540564:
                    if (name.equals("onBillingServiceDisconnected")) {
                        eh8.m25022i(eh8.this, this.f21659a, objArr);
                        break;
                    }
                    break;
                case 1940131955:
                    if (name.equals("onProductDetailsResponse")) {
                        eh8.m25024k(eh8.this, this.f21659a, objArr);
                        break;
                    }
                    break;
            }
            return null;
        }
    }

    public /* synthetic */ eh8(Object obj, Class cls, Class cls2, Class cls3, Class cls4, Class cls5, Class cls6, Class cls7, Class cls8, Class cls9, Class cls10, Class cls11, Class cls12, Class cls13, Class cls14, Class cls15, Class cls16, Class cls17, Method method, Method method2, Method method3, Method method4, Method method5, Method method6, Method method7, Method method8, Method method9, Method method10, Method method11, Method method12, Method method13, Method method14, Method method15, Method method16, Method method17, Method method18, Method method19, Method method20, Method method21, id5 id5Var) {
        this(obj, cls, cls2, cls3, cls4, cls5, cls6, cls7, cls8, cls9, cls10, cls11, cls12, cls13, cls14, cls15, cls16, cls17, method, method2, method3, method4, method5, method6, method7, method8, method9, method10, method11, method12, method13, method14, method15, method16, method17, method18, method19, method20, method21);
    }

    /* renamed from: A */
    public static final void m25014A(eh8 eh8Var, kh8.EnumC14836b enumC14836b, Runnable runnable) {
        if (a94.m16694d(eh8.class)) {
            return;
        }
        try {
            sq8.m48649h(eh8Var, "this$0");
            sq8.m48649h(enumC14836b, "$productType");
            sq8.m48649h(runnable, "$completionHandler");
            kh8.m35716e(eh8Var.f21634b, eh8Var.f21656x, eh8Var.m25031p(), eh8Var.m25034s(enumC14836b), Proxy.newProxyInstance(eh8Var.f21650r.getClassLoader(), new Class[]{eh8Var.f21650r}, eh8Var.new C13191b(new Object[]{enumC14836b, runnable})));
        } catch (Throwable th) {
            a94.m16692b(th, eh8.class);
        }
    }

    /* renamed from: d */
    public static final /* synthetic */ Map m25017d() {
        if (a94.m16694d(eh8.class)) {
            return null;
        }
        try {
            return f21617R;
        } catch (Throwable th) {
            a94.m16692b(th, eh8.class);
            return null;
        }
    }

    /* renamed from: e */
    public static final /* synthetic */ eh8 m25018e() {
        if (a94.m16694d(eh8.class)) {
            return null;
        }
        try {
            return f21616Q;
        } catch (Throwable th) {
            a94.m16692b(th, eh8.class);
            return null;
        }
    }

    /* renamed from: f */
    public static final /* synthetic */ Map m25019f() {
        if (a94.m16694d(eh8.class)) {
            return null;
        }
        try {
            return f21619T;
        } catch (Throwable th) {
            a94.m16692b(th, eh8.class);
            return null;
        }
    }

    /* renamed from: g */
    public static final /* synthetic */ Map m25020g() {
        if (a94.m16694d(eh8.class)) {
            return null;
        }
        try {
            return f21618S;
        } catch (Throwable th) {
            a94.m16692b(th, eh8.class);
            return null;
        }
    }

    /* renamed from: h */
    public static final /* synthetic */ String m25021h() {
        if (a94.m16694d(eh8.class)) {
            return null;
        }
        try {
            return f21614O;
        } catch (Throwable th) {
            a94.m16692b(th, eh8.class);
            return null;
        }
    }

    /* renamed from: i */
    public static final /* synthetic */ void m25022i(eh8 eh8Var, Object[] objArr, Object[] objArr2) {
        if (a94.m16694d(eh8.class)) {
            return;
        }
        try {
            eh8Var.m25035t(objArr, objArr2);
        } catch (Throwable th) {
            a94.m16692b(th, eh8.class);
        }
    }

    /* renamed from: j */
    public static final /* synthetic */ void m25023j(eh8 eh8Var, Object[] objArr, Object[] objArr2) {
        if (a94.m16694d(eh8.class)) {
            return;
        }
        try {
            eh8Var.m25036u(objArr, objArr2);
        } catch (Throwable th) {
            a94.m16692b(th, eh8.class);
        }
    }

    /* renamed from: k */
    public static final /* synthetic */ void m25024k(eh8 eh8Var, Object[] objArr, Object[] objArr2) {
        if (a94.m16694d(eh8.class)) {
            return;
        }
        try {
            eh8Var.m25037v(objArr, objArr2);
        } catch (Throwable th) {
            a94.m16692b(th, eh8.class);
        }
    }

    /* renamed from: l */
    public static final /* synthetic */ void m25025l(eh8 eh8Var, Object[] objArr, Object[] objArr2) {
        if (a94.m16694d(eh8.class)) {
            return;
        }
        try {
            eh8Var.m25038w(objArr, objArr2);
        } catch (Throwable th) {
            a94.m16692b(th, eh8.class);
        }
    }

    /* renamed from: m */
    public static final /* synthetic */ void m25026m(eh8 eh8Var, Object[] objArr, Object[] objArr2) {
        if (a94.m16694d(eh8.class)) {
            return;
        }
        try {
            eh8Var.m25039x(objArr, objArr2);
        } catch (Throwable th) {
            a94.m16692b(th, eh8.class);
        }
    }

    /* renamed from: n */
    public static final /* synthetic */ void m25027n(eh8 eh8Var) {
        if (a94.m16694d(eh8.class)) {
            return;
        }
        try {
            f21616Q = eh8Var;
        } catch (Throwable th) {
            a94.m16692b(th, eh8.class);
        }
    }

    /* renamed from: z */
    public static final void m25028z(eh8 eh8Var, Runnable runnable, kh8.EnumC14836b enumC14836b, List list) {
        if (a94.m16694d(eh8.class)) {
            return;
        }
        try {
            sq8.m48649h(eh8Var, "this$0");
            sq8.m48649h(runnable, "$completionHandler");
            sq8.m48649h(enumC14836b, "$productType");
            sq8.m48649h(list, "$productIds");
            Object objNewProxyInstance = Proxy.newProxyInstance(eh8Var.f21648p.getClassLoader(), new Class[]{eh8Var.f21648p}, eh8Var.new C13191b(new Object[]{runnable}));
            Object objM25033r = eh8Var.m25033r(enumC14836b, list);
            if (objM25033r != null) {
                kh8.m35716e(eh8Var.f21634b, eh8Var.f21622C, eh8Var.m25031p(), objM25033r, objNewProxyInstance);
            }
        } catch (Throwable th) {
            a94.m16692b(th, eh8.class);
        }
    }

    /* renamed from: B */
    public final void m25029B(Runnable runnable) {
        if (a94.m16694d(this)) {
            return;
        }
        try {
            kh8.m35716e(this.f21634b, this.f21631L, m25031p(), Proxy.newProxyInstance(this.f21647o.getClassLoader(), new Class[]{this.f21647o}, new C13191b(new Object[]{runnable})));
        } catch (Throwable th) {
            a94.m16692b(th, this);
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
            m25030o(new Runnable() { // from class: o.ch8
                @Override // java.lang.Runnable
                public final void run() {
                    eh8.m25014A(this.f18184a, enumC14836b, runnable);
                }
            });
        } catch (Throwable th) {
            a94.m16692b(th, this);
        }
    }

    /* renamed from: o */
    public final void m25030o(Runnable runnable) {
        if (a94.m16694d(this)) {
            return;
        }
        try {
            if (f21615P.get()) {
                runnable.run();
            } else {
                m25029B(runnable);
            }
        } catch (Throwable th) {
            a94.m16692b(th, this);
        }
    }

    /* renamed from: p */
    public Object m25031p() {
        if (a94.m16694d(this)) {
            return null;
        }
        try {
            return this.f21633a;
        } catch (Throwable th) {
            a94.m16692b(th, this);
            return null;
        }
    }

    /* renamed from: q */
    public final String m25032q(String str) {
        List listMo34493b;
        if (a94.m16694d(this)) {
            return null;
        }
        try {
            sq8.m48649h(str, "productDetailsString");
            jta jtaVarM38989c = mge.m38989c(new mge("jsonString='(.*?)'"), str, 0, 2, null);
            if (jtaVarM38989c == null || (listMo34493b = jtaVarM38989c.mo34493b()) == null) {
                return null;
            }
            return (String) kh3.i0(listMo34493b, 1);
        } catch (Throwable th) {
            a94.m16692b(th, this);
            return null;
        }
    }

    /* renamed from: r */
    public final Object m25033r(kh8.EnumC14836b enumC14836b, List list) {
        if (a94.m16694d(this)) {
            return null;
        }
        try {
            if (list.isEmpty()) {
                return null;
            }
            ArrayList arrayList = new ArrayList();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                Object objM35716e = kh8.m35716e(this.f21646n, this.f21627H, kh8.m35716e(this.f21646n, this.f21629J, kh8.m35716e(this.f21646n, this.f21628I, kh8.m35716e(this.f21638f, this.f21626G, null, new Object[0]), (String) it.next()), enumC14836b.getType()), new Object[0]);
                if (objM35716e != null) {
                    arrayList.add(objM35716e);
                }
            }
            return kh8.m35716e(this.f21643k, this.f21624E, kh8.m35716e(this.f21643k, this.f21625F, kh8.m35716e(this.f21640h, this.f21623D, null, new Object[0]), arrayList), new Object[0]);
        } catch (Throwable th) {
            a94.m16692b(th, this);
            return null;
        }
    }

    /* renamed from: s */
    public final Object m25034s(kh8.EnumC14836b enumC14836b) {
        if (a94.m16694d(this)) {
            return null;
        }
        try {
            return kh8.m35716e(this.f21644l, this.f21658z, kh8.m35716e(this.f21644l, this.f21620A, kh8.m35716e(this.f21641i, this.f21657y, null, new Object[0]), enumC14836b.getType()), new Object[0]);
        } catch (Throwable th) {
            a94.m16692b(th, this);
            return null;
        }
    }

    /* renamed from: t */
    public final void m25035t(Object[] objArr, Object[] objArr2) {
        if (a94.m16694d(this)) {
            return;
        }
        try {
            f21615P.set(false);
        } catch (Throwable th) {
            a94.m16692b(th, this);
        }
    }

    /* renamed from: u */
    public final void m25036u(Object[] objArr, Object[] objArr2) {
        boolean z;
        Runnable runnable;
        if (a94.m16694d(this)) {
            return;
        }
        boolean z2 = true;
        if (objArr2 != null) {
            try {
                z = objArr2.length == 0;
            } catch (Throwable th) {
                a94.m16692b(th, this);
                return;
            }
        }
        if (z) {
            return;
        }
        if (sq8.m48644c(kh8.m35716e(this.f21639g, this.f21632M, objArr2[0], new Object[0]), 0)) {
            f21615P.set(true);
            if (objArr != null) {
                if (!(objArr.length == 0)) {
                    z2 = false;
                }
            }
            if (z2) {
                return;
            }
            Object obj = objArr[0];
            if (!(obj instanceof Runnable) || (runnable = (Runnable) obj) == null) {
                return;
            }
            runnable.run();
        }
    }

    /* renamed from: v */
    public final void m25037v(Object[] objArr, Object[] objArr2) {
        Object objF0;
        String strM25032q;
        if (a94.m16694d(this)) {
            return;
        }
        if (objArr != null) {
            try {
                objF0 = gp0.f0(objArr, 0);
            } catch (Throwable th) {
                a94.m16692b(th, this);
                return;
            }
        } else {
            objF0 = null;
        }
        Object objF02 = objArr2 != null ? gp0.f0(objArr2, 1) : null;
        if (objF02 != null && (objF02 instanceof List)) {
            Iterator it = ((List) objF02).iterator();
            while (it.hasNext()) {
                try {
                    Object objM35716e = kh8.m35716e(this.f21636d, this.f21630K, it.next(), new Object[0]);
                    String str = objM35716e instanceof String ? (String) objM35716e : null;
                    if (str != null && (strM25032q = m25032q(str)) != null) {
                        JSONObject jSONObject = new JSONObject(strM25032q);
                        if (jSONObject.has("productId")) {
                            String string = jSONObject.getString("productId");
                            Map map = f21619T;
                            sq8.m48648g(string, "productId");
                            map.put(string, jSONObject);
                        }
                    }
                } catch (Exception unused) {
                }
            }
            if (objF0 == null || !(objF0 instanceof Runnable)) {
                return;
            }
            ((Runnable) objF0).run();
        }
    }

    /* renamed from: w */
    public final void m25038w(Object[] objArr, Object[] objArr2) {
        Object objF0;
        if (a94.m16694d(this)) {
            return;
        }
        if (objArr != null) {
            try {
                objF0 = gp0.f0(objArr, 0);
            } catch (Throwable th) {
                a94.m16692b(th, this);
                return;
            }
        } else {
            objF0 = null;
        }
        if (objF0 != null && (objF0 instanceof kh8.EnumC14836b)) {
            Object objF02 = gp0.f0(objArr, 1);
            if (objF02 instanceof Runnable) {
                Object objF03 = objArr2 != null ? gp0.f0(objArr2, 1) : null;
                if (objF03 != null && (objF03 instanceof List)) {
                    ArrayList arrayList = new ArrayList();
                    Iterator it = ((List) objF03).iterator();
                    while (it.hasNext()) {
                        try {
                            Object objM35716e = kh8.m35716e(this.f21637e, this.f21621B, it.next(), new Object[0]);
                            String str = objM35716e instanceof String ? (String) objM35716e : null;
                            if (str != null) {
                                JSONObject jSONObject = new JSONObject(str);
                                if (jSONObject.has("productId")) {
                                    String string = jSONObject.getString("productId");
                                    if (!f21619T.containsKey(string)) {
                                        sq8.m48648g(string, "productId");
                                        arrayList.add(string);
                                    }
                                    if (objF0 == kh8.EnumC14836b.INAPP) {
                                        Map map = f21617R;
                                        sq8.m48648g(string, "productId");
                                        map.put(string, jSONObject);
                                    } else {
                                        Map map2 = f21618S;
                                        sq8.m48648g(string, "productId");
                                        map2.put(string, jSONObject);
                                    }
                                }
                            }
                        } catch (Exception unused) {
                        }
                    }
                    if (!arrayList.isEmpty()) {
                        m25040y((kh8.EnumC14836b) objF0, arrayList, (Runnable) objF02);
                    } else {
                        ((Runnable) objF02).run();
                    }
                }
            }
        }
    }

    /* renamed from: x */
    public final void m25039x(Object[] objArr, Object[] objArr2) {
        Object objF0;
        if (a94.m16694d(this)) {
            return;
        }
        if (objArr != null) {
            try {
                objF0 = gp0.f0(objArr, 0);
            } catch (Throwable th) {
                a94.m16692b(th, this);
                return;
            }
        } else {
            objF0 = null;
        }
        if (objF0 != null && (objF0 instanceof kh8.EnumC14836b)) {
            Object objF02 = gp0.f0(objArr, 1);
            if (objF02 instanceof Runnable) {
                Object objF03 = objArr2 != null ? gp0.f0(objArr2, 1) : null;
                if (objF03 != null && (objF03 instanceof List)) {
                    ArrayList arrayList = new ArrayList();
                    Iterator it = ((List) objF03).iterator();
                    while (it.hasNext()) {
                        Object objM35716e = kh8.m35716e(this.f21635c, this.f21655w, it.next(), new Object[0]);
                        String str = objM35716e instanceof String ? (String) objM35716e : null;
                        if (str != null) {
                            JSONObject jSONObject = new JSONObject(str);
                            if (jSONObject.has("productId")) {
                                String string = jSONObject.getString("productId");
                                if (!f21619T.containsKey(string)) {
                                    sq8.m48648g(string, "productId");
                                    arrayList.add(string);
                                }
                                if (objF0 == kh8.EnumC14836b.INAPP) {
                                    Map map = f21617R;
                                    sq8.m48648g(string, "productId");
                                    map.put(string, jSONObject);
                                } else {
                                    Map map2 = f21618S;
                                    sq8.m48648g(string, "productId");
                                    map2.put(string, jSONObject);
                                }
                            }
                        }
                    }
                    if (!arrayList.isEmpty()) {
                        m25040y((kh8.EnumC14836b) objF0, arrayList, (Runnable) objF02);
                    } else {
                        ((Runnable) objF02).run();
                    }
                }
            }
        }
    }

    /* renamed from: y */
    public final void m25040y(final kh8.EnumC14836b enumC14836b, final List list, final Runnable runnable) {
        if (a94.m16694d(this)) {
            return;
        }
        try {
            m25030o(new Runnable() { // from class: o.dh8
                @Override // java.lang.Runnable
                public final void run() {
                    eh8.m25028z(this.f19832a, runnable, enumC14836b, list);
                }
            });
        } catch (Throwable th) {
            a94.m16692b(th, this);
        }
    }

    public eh8(Object obj, Class cls, Class cls2, Class cls3, Class cls4, Class cls5, Class cls6, Class cls7, Class cls8, Class cls9, Class cls10, Class cls11, Class cls12, Class cls13, Class cls14, Class cls15, Class cls16, Class cls17, Method method, Method method2, Method method3, Method method4, Method method5, Method method6, Method method7, Method method8, Method method9, Method method10, Method method11, Method method12, Method method13, Method method14, Method method15, Method method16, Method method17, Method method18, Method method19, Method method20, Method method21) {
        this.f21633a = obj;
        this.f21634b = cls;
        this.f21635c = cls2;
        this.f21636d = cls3;
        this.f21637e = cls4;
        this.f21638f = cls5;
        this.f21639g = cls6;
        this.f21640h = cls7;
        this.f21641i = cls8;
        this.f21642j = cls9;
        this.f21643k = cls10;
        this.f21644l = cls11;
        this.f21645m = cls12;
        this.f21646n = cls13;
        this.f21647o = cls14;
        this.f21648p = cls15;
        this.f21649q = cls16;
        this.f21650r = cls17;
        this.f21651s = method;
        this.f21652t = method2;
        this.f21653u = method3;
        this.f21654v = method4;
        this.f21655w = method5;
        this.f21656x = method6;
        this.f21657y = method7;
        this.f21658z = method8;
        this.f21620A = method9;
        this.f21621B = method10;
        this.f21622C = method11;
        this.f21623D = method12;
        this.f21624E = method13;
        this.f21625F = method14;
        this.f21626G = method15;
        this.f21627H = method16;
        this.f21628I = method17;
        this.f21629J = method18;
        this.f21630K = method19;
        this.f21631L = method20;
        this.f21632M = method21;
    }
}
