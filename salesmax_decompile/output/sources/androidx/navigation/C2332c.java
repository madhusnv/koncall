package androidx.navigation;

import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import androidx.lifecycle.AbstractC2127a;
import androidx.lifecycle.AbstractC2139h;
import androidx.lifecycle.AbstractC2154w;
import androidx.lifecycle.C2144m;
import androidx.lifecycle.C2151t;
import androidx.lifecycle.C2155x;
import androidx.lifecycle.InterfaceC2137f;
import androidx.lifecycle.b0;
import com.amplifyframework.storage.s3.transfer.TransferTable;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.onesignal.session.internal.outcomes.impl.OutcomeConstants;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import java.util.UUID;
import p001o.dxi;
import p001o.esb;
import p001o.f1f;
import p001o.g1f;
import p001o.gi9;
import p001o.h1f;
import p001o.id5;
import p001o.kf9;
import p001o.kxi;
import p001o.lxi;
import p001o.si9;
import p001o.sq8;
import p001o.uk7;
import p001o.wob;
import p001o.xca;
import p001o.ya4;

/* renamed from: androidx.navigation.c */
/* loaded from: classes2.dex */
public final class C2332c implements xca, lxi, InterfaceC2137f, h1f {

    /* renamed from: M */
    public static final a f9433M = new a(null);

    /* renamed from: H */
    public AbstractC2139h.b f9434H;

    /* renamed from: L */
    public final b0.InterfaceC2131c f9435L;

    /* renamed from: a */
    public final Context f9436a;

    /* renamed from: b */
    public AbstractC2341h f9437b;

    /* renamed from: c */
    public final Bundle f9438c;

    /* renamed from: d */
    public AbstractC2139h.b f9439d;

    /* renamed from: e */
    public final esb f9440e;

    /* renamed from: f */
    public final String f9441f;

    /* renamed from: g */
    public final Bundle f9442g;

    /* renamed from: h */
    public C2144m f9443h;

    /* renamed from: q */
    public final g1f f9444q;

    /* renamed from: s */
    public boolean f9445s;

    /* renamed from: x */
    public final gi9 f9446x;

    /* renamed from: y */
    public final gi9 f9447y;

    /* renamed from: androidx.navigation.c$a */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(id5 id5Var) {
            this();
        }

        /* renamed from: b */
        public static /* synthetic */ C2332c m8562b(a aVar, Context context, AbstractC2341h abstractC2341h, Bundle bundle, AbstractC2139h.b bVar, esb esbVar, String str, Bundle bundle2, int i, Object obj) {
            String str2;
            Bundle bundle3 = (i & 4) != 0 ? null : bundle;
            AbstractC2139h.b bVar2 = (i & 8) != 0 ? AbstractC2139h.b.CREATED : bVar;
            esb esbVar2 = (i & 16) != 0 ? null : esbVar;
            if ((i & 32) != 0) {
                String string = UUID.randomUUID().toString();
                sq8.m48648g(string, "randomUUID().toString()");
                str2 = string;
            } else {
                str2 = str;
            }
            return aVar.m8563a(context, abstractC2341h, bundle3, bVar2, esbVar2, str2, (i & 64) != 0 ? null : bundle2);
        }

        /* renamed from: a */
        public final C2332c m8563a(Context context, AbstractC2341h abstractC2341h, Bundle bundle, AbstractC2139h.b bVar, esb esbVar, String str, Bundle bundle2) {
            sq8.m48649h(abstractC2341h, FirebaseAnalytics.Param.DESTINATION);
            sq8.m48649h(bVar, "hostLifecycleState");
            sq8.m48649h(str, OutcomeConstants.OUTCOME_ID);
            return new C2332c(context, abstractC2341h, bundle, bVar, esbVar, str, bundle2, null);
        }
    }

    /* renamed from: androidx.navigation.c$b */
    public static final class b extends AbstractC2127a {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(h1f h1fVar) {
            super(h1fVar, null);
            sq8.m48649h(h1fVar, "owner");
        }

        @Override // androidx.lifecycle.AbstractC2127a
        /* renamed from: f */
        public dxi mo6495f(String str, Class cls, C2151t c2151t) {
            sq8.m48649h(str, TransferTable.COLUMN_KEY);
            sq8.m48649h(cls, "modelClass");
            sq8.m48649h(c2151t, "handle");
            return new c(c2151t);
        }
    }

    /* renamed from: androidx.navigation.c$c */
    public static final class c extends dxi {

        /* renamed from: b */
        public final C2151t f9448b;

        public c(C2151t c2151t) {
            sq8.m48649h(c2151t, "handle");
            this.f9448b = c2151t;
        }

        /* renamed from: f */
        public final C2151t m8564f() {
            return this.f9448b;
        }
    }

    /* renamed from: androidx.navigation.c$d */
    public static final class d extends kf9 implements uk7 {
        public d() {
            super(0);
        }

        @Override // p001o.uk7
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C2155x invoke() {
            Context context = C2332c.this.f9436a;
            Context applicationContext = context != null ? context.getApplicationContext() : null;
            Application application = applicationContext instanceof Application ? (Application) applicationContext : null;
            C2332c c2332c = C2332c.this;
            return new C2155x(application, c2332c, c2332c.m8551c());
        }
    }

    /* renamed from: androidx.navigation.c$e */
    public static final class e extends kf9 implements uk7 {
        public e() {
            super(0);
        }

        @Override // p001o.uk7
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C2151t invoke() {
            if (!C2332c.this.f9445s) {
                throw new IllegalStateException("You cannot access the NavBackStackEntry's SavedStateHandle until it is added to the NavController's back stack (i.e., the Lifecycle of the NavBackStackEntry reaches the CREATED state).".toString());
            }
            if (C2332c.this.getLifecycle().mo6522b() != AbstractC2139h.b.DESTROYED) {
                return ((c) new b0(C2332c.this, new b(C2332c.this)).m6505a(c.class)).m8564f();
            }
            throw new IllegalStateException("You cannot access the NavBackStackEntry's SavedStateHandle after the NavBackStackEntry is destroyed.".toString());
        }
    }

    public /* synthetic */ C2332c(Context context, AbstractC2341h abstractC2341h, Bundle bundle, AbstractC2139h.b bVar, esb esbVar, String str, Bundle bundle2, id5 id5Var) {
        this(context, abstractC2341h, bundle, bVar, esbVar, str, bundle2);
    }

    /* renamed from: c */
    public final Bundle m8551c() {
        if (this.f9438c == null) {
            return null;
        }
        return new Bundle(this.f9438c);
    }

    /* renamed from: d */
    public final C2155x m8552d() {
        return (C2155x) this.f9446x.getValue();
    }

    /* renamed from: e */
    public final AbstractC2341h m8553e() {
        return this.f9437b;
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:50:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean equals(Object obj) {
        boolean z;
        Set<String> setKeySet;
        boolean z2;
        if (obj == null || !(obj instanceof C2332c)) {
            return false;
        }
        C2332c c2332c = (C2332c) obj;
        if (!sq8.m48644c(this.f9441f, c2332c.f9441f) || !sq8.m48644c(this.f9437b, c2332c.f9437b) || !sq8.m48644c(getLifecycle(), c2332c.getLifecycle()) || !sq8.m48644c(getSavedStateRegistry(), c2332c.getSavedStateRegistry())) {
            return false;
        }
        if (!sq8.m48644c(this.f9438c, c2332c.f9438c)) {
            Bundle bundle = this.f9438c;
            if (bundle == null || (setKeySet = bundle.keySet()) == null) {
                z = false;
                if (!z) {
                    return false;
                }
            } else {
                Set<String> set = setKeySet;
                if ((set instanceof Collection) && set.isEmpty()) {
                    z2 = true;
                    if (!z2) {
                    }
                    if (!z) {
                    }
                } else {
                    for (String str : set) {
                        Object obj2 = this.f9438c.get(str);
                        Bundle bundle2 = c2332c.f9438c;
                        if (!sq8.m48644c(obj2, bundle2 != null ? bundle2.get(str) : null)) {
                            z2 = false;
                            break;
                        }
                    }
                    z2 = true;
                    if (!z2) {
                        z = true;
                    }
                    if (!z) {
                    }
                }
            }
        }
        return true;
    }

    /* renamed from: f */
    public final String m8554f() {
        return this.f9441f;
    }

    /* renamed from: g */
    public final AbstractC2139h.b m8555g() {
        return this.f9434H;
    }

    @Override // androidx.lifecycle.InterfaceC2137f
    public ya4 getDefaultViewModelCreationExtras() {
        wob wobVar = new wob(null, 1, null);
        Context context = this.f9436a;
        Context applicationContext = context != null ? context.getApplicationContext() : null;
        Application application = applicationContext instanceof Application ? (Application) applicationContext : null;
        if (application != null) {
            wobVar.m54753c(b0.C2129a.f7658h, application);
        }
        wobVar.m54753c(AbstractC2154w.f7762a, this);
        wobVar.m54753c(AbstractC2154w.f7763b, this);
        Bundle bundleM8551c = m8551c();
        if (bundleM8551c != null) {
            wobVar.m54753c(AbstractC2154w.f7764c, bundleM8551c);
        }
        return wobVar;
    }

    @Override // androidx.lifecycle.InterfaceC2137f
    public b0.InterfaceC2131c getDefaultViewModelProviderFactory() {
        return this.f9435L;
    }

    @Override // p001o.xca
    public AbstractC2139h getLifecycle() {
        return this.f9443h;
    }

    @Override // p001o.h1f
    public f1f getSavedStateRegistry() {
        return this.f9444q.m27976b();
    }

    @Override // p001o.lxi
    public kxi getViewModelStore() {
        if (!this.f9445s) {
            throw new IllegalStateException("You cannot access the NavBackStackEntry's ViewModels until it is added to the NavController's back stack (i.e., the Lifecycle of the NavBackStackEntry reaches the CREATED state).".toString());
        }
        if (!(getLifecycle().mo6522b() != AbstractC2139h.b.DESTROYED)) {
            throw new IllegalStateException("You cannot access the NavBackStackEntry's ViewModels after the NavBackStackEntry is destroyed.".toString());
        }
        esb esbVar = this.f9440e;
        if (esbVar != null) {
            return esbVar.mo8642a(this.f9441f);
        }
        throw new IllegalStateException("You must call setViewModelStore() on your NavHostController before accessing the ViewModelStore of a navigation graph.".toString());
    }

    /* renamed from: h */
    public final C2151t m8556h() {
        return (C2151t) this.f9447y.getValue();
    }

    public int hashCode() {
        Set<String> setKeySet;
        int iHashCode = (this.f9441f.hashCode() * 31) + this.f9437b.hashCode();
        Bundle bundle = this.f9438c;
        if (bundle != null && (setKeySet = bundle.keySet()) != null) {
            Iterator<T> it = setKeySet.iterator();
            while (it.hasNext()) {
                int i = iHashCode * 31;
                Object obj = this.f9438c.get((String) it.next());
                iHashCode = i + (obj != null ? obj.hashCode() : 0);
            }
        }
        return (((iHashCode * 31) + getLifecycle().hashCode()) * 31) + getSavedStateRegistry().hashCode();
    }

    /* renamed from: i */
    public final void m8557i(AbstractC2139h.a aVar) {
        sq8.m48649h(aVar, "event");
        this.f9439d = aVar.getTargetState();
        m8561m();
    }

    /* renamed from: j */
    public final void m8558j(Bundle bundle) {
        sq8.m48649h(bundle, "outBundle");
        this.f9444q.m27979e(bundle);
    }

    /* renamed from: k */
    public final void m8559k(AbstractC2341h abstractC2341h) {
        sq8.m48649h(abstractC2341h, "<set-?>");
        this.f9437b = abstractC2341h;
    }

    /* renamed from: l */
    public final void m8560l(AbstractC2139h.b bVar) {
        sq8.m48649h(bVar, "maxState");
        this.f9434H = bVar;
        m8561m();
    }

    /* renamed from: m */
    public final void m8561m() {
        if (!this.f9445s) {
            this.f9444q.m27977c();
            this.f9445s = true;
            if (this.f9440e != null) {
                AbstractC2154w.m6598c(this);
            }
            this.f9444q.m27978d(this.f9442g);
        }
        if (this.f9439d.ordinal() < this.f9434H.ordinal()) {
            this.f9443h.m6543n(this.f9439d);
        } else {
            this.f9443h.m6543n(this.f9434H);
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(C2332c.class.getSimpleName());
        sb.append('(' + this.f9441f + ')');
        sb.append(" destination=");
        sb.append(this.f9437b);
        String string = sb.toString();
        sq8.m48648g(string, "sb.toString()");
        return string;
    }

    public C2332c(Context context, AbstractC2341h abstractC2341h, Bundle bundle, AbstractC2139h.b bVar, esb esbVar, String str, Bundle bundle2) {
        this.f9436a = context;
        this.f9437b = abstractC2341h;
        this.f9438c = bundle;
        this.f9439d = bVar;
        this.f9440e = esbVar;
        this.f9441f = str;
        this.f9442g = bundle2;
        this.f9443h = new C2144m(this);
        this.f9444q = g1f.f24466d.m27980a(this);
        this.f9446x = si9.m48360a(new d());
        this.f9447y = si9.m48360a(new e());
        this.f9434H = AbstractC2139h.b.INITIALIZED;
        this.f9435L = m8552d();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C2332c(C2332c c2332c, Bundle bundle) {
        this(c2332c.f9436a, c2332c.f9437b, bundle, c2332c.f9439d, c2332c.f9440e, c2332c.f9441f, c2332c.f9442g);
        sq8.m48649h(c2332c, "entry");
        this.f9439d = c2332c.f9439d;
        m8560l(c2332c.f9434H);
    }
}
