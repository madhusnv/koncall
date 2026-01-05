package androidx.navigation;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p001o.kf9;
import p001o.kh3;
import p001o.kyg;
import p001o.oef;
import p001o.oo0;
import p001o.qef;
import p001o.sq8;
import p001o.xk7;

/* renamed from: androidx.navigation.g */
/* loaded from: classes2.dex */
public final class C2340g {

    /* renamed from: a */
    public final Context f9592a;

    /* renamed from: b */
    public final Activity f9593b;

    /* renamed from: c */
    public final Intent f9594c;

    /* renamed from: d */
    public C2342i f9595d;

    /* renamed from: e */
    public final List f9596e;

    /* renamed from: f */
    public Bundle f9597f;

    /* renamed from: androidx.navigation.g$a */
    public static final class a {

        /* renamed from: a */
        public final int f9598a;

        /* renamed from: b */
        public final Bundle f9599b;

        public a(int i, Bundle bundle) {
            this.f9598a = i;
            this.f9599b = bundle;
        }

        /* renamed from: a */
        public final Bundle m8747a() {
            return this.f9599b;
        }

        /* renamed from: b */
        public final int m8748b() {
            return this.f9598a;
        }
    }

    /* renamed from: androidx.navigation.g$b */
    public static final class b extends kf9 implements xk7 {

        /* renamed from: a */
        public static final b f9600a = new b();

        public b() {
            super(1);
        }

        @Override // p001o.xk7
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Context invoke(Context context) {
            sq8.m48649h(context, "it");
            ContextWrapper contextWrapper = context instanceof ContextWrapper ? (ContextWrapper) context : null;
            if (contextWrapper != null) {
                return contextWrapper.getBaseContext();
            }
            return null;
        }
    }

    /* renamed from: androidx.navigation.g$c */
    public static final class c extends kf9 implements xk7 {

        /* renamed from: a */
        public static final c f9601a = new c();

        public c() {
            super(1);
        }

        @Override // p001o.xk7
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Activity invoke(Context context) {
            sq8.m48649h(context, "it");
            if (context instanceof Activity) {
                return (Activity) context;
            }
            return null;
        }
    }

    public C2340g(Context context) {
        Intent launchIntentForPackage;
        sq8.m48649h(context, "context");
        this.f9592a = context;
        Activity activity = (Activity) qef.m45313p(qef.m45320w(oef.m42147f(context, b.f9600a), c.f9601a));
        this.f9593b = activity;
        if (activity != null) {
            launchIntentForPackage = new Intent(context, activity.getClass());
        } else {
            launchIntentForPackage = context.getPackageManager().getLaunchIntentForPackage(context.getPackageName());
            if (launchIntentForPackage == null) {
                launchIntentForPackage = new Intent();
            }
        }
        launchIntentForPackage.addFlags(268468224);
        this.f9594c = launchIntentForPackage;
        this.f9596e = new ArrayList();
    }

    /* renamed from: g */
    public static /* synthetic */ C2340g m8739g(C2340g c2340g, int i, Bundle bundle, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            bundle = null;
        }
        return c2340g.m8745f(i, bundle);
    }

    /* renamed from: a */
    public final C2340g m8740a(int i, Bundle bundle) throws Resources.NotFoundException {
        this.f9596e.add(new a(i, bundle));
        if (this.f9595d != null) {
            m8746h();
        }
        return this;
    }

    /* renamed from: b */
    public final kyg m8741b() throws Resources.NotFoundException {
        if (this.f9595d == null) {
            throw new IllegalStateException("You must call setGraph() before constructing the deep link".toString());
        }
        if (!(!this.f9596e.isEmpty())) {
            throw new IllegalStateException("You must call setDestination() or addDestination() before constructing the deep link".toString());
        }
        m8742c();
        kyg kygVarM36331d = kyg.m36329j(this.f9592a).m36331d(new Intent(this.f9594c));
        sq8.m48648g(kygVarM36331d, "create(context).addNextI…rentStack(Intent(intent))");
        int iM36335m = kygVarM36331d.m36335m();
        for (int i = 0; i < iM36335m; i++) {
            Intent intentM36334l = kygVarM36331d.m36334l(i);
            if (intentM36334l != null) {
                intentM36334l.putExtra("android-support-nav:controller:deepLinkIntent", this.f9594c);
            }
        }
        return kygVarM36331d;
    }

    /* renamed from: c */
    public final void m8742c() throws Resources.NotFoundException {
        ArrayList arrayList = new ArrayList();
        ArrayList<? extends Parcelable> arrayList2 = new ArrayList<>();
        AbstractC2341h abstractC2341h = null;
        for (a aVar : this.f9596e) {
            int iM8748b = aVar.m8748b();
            Bundle bundleM8747a = aVar.m8747a();
            AbstractC2341h abstractC2341hM8743d = m8743d(iM8748b);
            if (abstractC2341hM8743d == null) {
                throw new IllegalArgumentException("Navigation destination " + AbstractC2341h.f9602x.m8775b(this.f9592a, iM8748b) + " cannot be found in the navigation graph " + this.f9595d);
            }
            for (int i : abstractC2341hM8743d.m8769o(abstractC2341h)) {
                arrayList.add(Integer.valueOf(i));
                arrayList2.add(bundleM8747a);
            }
            abstractC2341h = abstractC2341hM8743d;
        }
        this.f9594c.putExtra("android-support-nav:controller:deepLinkIds", kh3.P0(arrayList));
        this.f9594c.putParcelableArrayListExtra("android-support-nav:controller:deepLinkArgs", arrayList2);
    }

    /* renamed from: d */
    public final AbstractC2341h m8743d(int i) {
        oo0 oo0Var = new oo0();
        C2342i c2342i = this.f9595d;
        sq8.m48646e(c2342i);
        oo0Var.add(c2342i);
        while (!oo0Var.isEmpty()) {
            AbstractC2341h abstractC2341h = (AbstractC2341h) oo0Var.m42474N();
            if (abstractC2341h.m8753A() == i) {
                return abstractC2341h;
            }
            if (abstractC2341h instanceof C2342i) {
                Iterator it = ((C2342i) abstractC2341h).iterator();
                while (it.hasNext()) {
                    oo0Var.add((AbstractC2341h) it.next());
                }
            }
        }
        return null;
    }

    /* renamed from: e */
    public final C2340g m8744e(Bundle bundle) {
        this.f9597f = bundle;
        this.f9594c.putExtra("android-support-nav:controller:deepLinkExtras", bundle);
        return this;
    }

    /* renamed from: f */
    public final C2340g m8745f(int i, Bundle bundle) throws Resources.NotFoundException {
        this.f9596e.clear();
        this.f9596e.add(new a(i, bundle));
        if (this.f9595d != null) {
            m8746h();
        }
        return this;
    }

    /* renamed from: h */
    public final void m8746h() throws Resources.NotFoundException {
        Iterator it = this.f9596e.iterator();
        while (it.hasNext()) {
            int iM8748b = ((a) it.next()).m8748b();
            if (m8743d(iM8748b) == null) {
                throw new IllegalArgumentException("Navigation destination " + AbstractC2341h.f9602x.m8775b(this.f9592a, iM8748b) + " cannot be found in the navigation graph " + this.f9595d);
            }
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C2340g(AbstractC2333d abstractC2333d) {
        this(abstractC2333d.m8589E());
        sq8.m48649h(abstractC2333d, "navController");
        this.f9595d = abstractC2333d.m8593I();
    }
}
