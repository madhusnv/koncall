package androidx.mediarouter.media;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import androidx.mediarouter.media.C2319g;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.Executor;
import p001o.e7b;
import p001o.s6c;

/* renamed from: androidx.mediarouter.media.d */
/* loaded from: classes2.dex */
public abstract class AbstractC2316d {

    /* renamed from: a */
    public final Context f9185a;

    /* renamed from: b */
    public final d f9186b;

    /* renamed from: c */
    public final c f9187c;

    /* renamed from: d */
    public a f9188d;

    /* renamed from: e */
    public e7b f9189e;

    /* renamed from: f */
    public boolean f9190f;

    /* renamed from: g */
    public C2317e f9191g;

    /* renamed from: h */
    public boolean f9192h;

    /* renamed from: androidx.mediarouter.media.d$a */
    public static abstract class a {
        /* renamed from: a */
        public abstract void mo8076a(AbstractC2316d abstractC2316d, C2317e c2317e);
    }

    /* renamed from: androidx.mediarouter.media.d$b */
    public static abstract class b extends e {

        /* renamed from: a */
        public final Object f9193a = new Object();

        /* renamed from: b */
        public Executor f9194b;

        /* renamed from: c */
        public d f9195c;

        /* renamed from: d */
        public C2315c f9196d;

        /* renamed from: e */
        public Collection f9197e;

        /* renamed from: androidx.mediarouter.media.d$b$a */
        public class a implements Runnable {

            /* renamed from: a */
            public final /* synthetic */ d f9198a;

            /* renamed from: b */
            public final /* synthetic */ C2315c f9199b;

            /* renamed from: c */
            public final /* synthetic */ Collection f9200c;

            public a(d dVar, C2315c c2315c, Collection collection) {
                this.f9198a = dVar;
                this.f9199b = c2315c;
                this.f9200c = collection;
            }

            @Override // java.lang.Runnable
            public void run() {
                this.f9198a.mo8075a(b.this, this.f9199b, this.f9200c);
            }
        }

        /* renamed from: androidx.mediarouter.media.d$b$b, reason: collision with other inner class name */
        public class RunnableC19567b implements Runnable {

            /* renamed from: a */
            public final /* synthetic */ d f9202a;

            /* renamed from: b */
            public final /* synthetic */ C2315c f9203b;

            /* renamed from: c */
            public final /* synthetic */ Collection f9204c;

            public RunnableC19567b(d dVar, C2315c c2315c, Collection collection) {
                this.f9202a = dVar;
                this.f9203b = c2315c;
                this.f9204c = collection;
            }

            @Override // java.lang.Runnable
            public void run() {
                this.f9202a.mo8075a(b.this, this.f9203b, this.f9204c);
            }
        }

        /* renamed from: androidx.mediarouter.media.d$b$c */
        public static final class c {

            /* renamed from: a */
            public final C2315c f9206a;

            /* renamed from: b */
            public final int f9207b;

            /* renamed from: c */
            public final boolean f9208c;

            /* renamed from: d */
            public final boolean f9209d;

            /* renamed from: e */
            public final boolean f9210e;

            /* renamed from: f */
            public Bundle f9211f;

            /* renamed from: androidx.mediarouter.media.d$b$c$a */
            public static final class a {

                /* renamed from: a */
                public final C2315c f9212a;

                /* renamed from: b */
                public int f9213b = 1;

                /* renamed from: c */
                public boolean f9214c = false;

                /* renamed from: d */
                public boolean f9215d = false;

                /* renamed from: e */
                public boolean f9216e = false;

                public a(C2315c c2315c) {
                    if (c2315c == null) {
                        throw new NullPointerException("descriptor must not be null");
                    }
                    this.f9212a = c2315c;
                }

                /* renamed from: a */
                public c m8201a() {
                    return new c(this.f9212a, this.f9213b, this.f9214c, this.f9215d, this.f9216e);
                }

                /* renamed from: b */
                public a m8202b(boolean z) {
                    this.f9215d = z;
                    return this;
                }

                /* renamed from: c */
                public a m8203c(boolean z) {
                    this.f9216e = z;
                    return this;
                }

                /* renamed from: d */
                public a m8204d(boolean z) {
                    this.f9214c = z;
                    return this;
                }

                /* renamed from: e */
                public a m8205e(int i) {
                    this.f9213b = i;
                    return this;
                }
            }

            public c(C2315c c2315c, int i, boolean z, boolean z2, boolean z3) {
                this.f9206a = c2315c;
                this.f9207b = i;
                this.f9208c = z;
                this.f9209d = z2;
                this.f9210e = z3;
            }

            /* renamed from: a */
            public static c m8194a(Bundle bundle) {
                if (bundle == null) {
                    return null;
                }
                return new c(C2315c.m8135e(bundle.getBundle("mrDescriptor")), bundle.getInt("selectionState", 1), bundle.getBoolean("isUnselectable", false), bundle.getBoolean("isGroupable", false), bundle.getBoolean("isTransferable", false));
            }

            /* renamed from: b */
            public C2315c m8195b() {
                return this.f9206a;
            }

            /* renamed from: c */
            public int m8196c() {
                return this.f9207b;
            }

            /* renamed from: d */
            public boolean m8197d() {
                return this.f9209d;
            }

            /* renamed from: e */
            public boolean m8198e() {
                return this.f9210e;
            }

            /* renamed from: f */
            public boolean m8199f() {
                return this.f9208c;
            }

            /* renamed from: g */
            public Bundle m8200g() {
                if (this.f9211f == null) {
                    Bundle bundle = new Bundle();
                    this.f9211f = bundle;
                    bundle.putBundle("mrDescriptor", this.f9206a.m8136a());
                    this.f9211f.putInt("selectionState", this.f9207b);
                    this.f9211f.putBoolean("isUnselectable", this.f9208c);
                    this.f9211f.putBoolean("isGroupable", this.f9209d);
                    this.f9211f.putBoolean("isTransferable", this.f9210e);
                }
                return this.f9211f;
            }
        }

        /* renamed from: androidx.mediarouter.media.d$b$d */
        public interface d {
            /* renamed from: a */
            void mo8075a(b bVar, C2315c c2315c, Collection collection);
        }

        /* renamed from: k */
        public String mo8190k() {
            return null;
        }

        /* renamed from: l */
        public String mo8191l() {
            return null;
        }

        /* renamed from: m */
        public final void m8192m(C2315c c2315c, Collection collection) {
            if (c2315c == null) {
                throw new NullPointerException("groupRoute must not be null");
            }
            if (collection == null) {
                throw new NullPointerException("dynamicRoutes must not be null");
            }
            synchronized (this.f9193a) {
                Executor executor = this.f9194b;
                if (executor != null) {
                    executor.execute(new RunnableC19567b(this.f9195c, c2315c, collection));
                } else {
                    this.f9196d = c2315c;
                    this.f9197e = new ArrayList(collection);
                }
            }
        }

        /* renamed from: n */
        public abstract void mo8099n(String str);

        /* renamed from: o */
        public abstract void mo8100o(String str);

        /* renamed from: p */
        public abstract void mo8101p(List list);

        /* renamed from: q */
        public void m8193q(Executor executor, d dVar) {
            synchronized (this.f9193a) {
                if (executor == null) {
                    throw new NullPointerException("Executor shouldn't be null");
                }
                if (dVar == null) {
                    throw new NullPointerException("Listener shouldn't be null");
                }
                this.f9194b = executor;
                this.f9195c = dVar;
                Collection collection = this.f9197e;
                if (collection != null && !collection.isEmpty()) {
                    C2315c c2315c = this.f9196d;
                    Collection collection2 = this.f9197e;
                    this.f9196d = null;
                    this.f9197e = null;
                    this.f9194b.execute(new a(dVar, c2315c, collection2));
                }
            }
        }
    }

    /* renamed from: androidx.mediarouter.media.d$c */
    public final class c extends Handler {
        public c() {
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            int i = message.what;
            if (i == 1) {
                AbstractC2316d.this.m8180l();
            } else {
                if (i != 2) {
                    return;
                }
                AbstractC2316d.this.m8181m();
            }
        }
    }

    /* renamed from: androidx.mediarouter.media.d$d */
    public static final class d {

        /* renamed from: a */
        public final ComponentName f9218a;

        public d(ComponentName componentName) {
            if (componentName == null) {
                throw new IllegalArgumentException("componentName must not be null");
            }
            this.f9218a = componentName;
        }

        /* renamed from: a */
        public ComponentName m8206a() {
            return this.f9218a;
        }

        /* renamed from: b */
        public String m8207b() {
            return this.f9218a.getPackageName();
        }

        public String toString() {
            return "ProviderMetadata{ componentName=" + this.f9218a.flattenToShortString() + " }";
        }
    }

    /* renamed from: androidx.mediarouter.media.d$e */
    public static abstract class e {
        /* renamed from: d */
        public boolean mo8095d(Intent intent, C2319g.c cVar) {
            return false;
        }

        /* renamed from: e */
        public void mo8096e() {
        }

        /* renamed from: f */
        public void mo8122f() {
        }

        /* renamed from: g */
        public abstract void mo8097g(int i);

        /* renamed from: h */
        public void mo8208h() {
        }

        /* renamed from: i */
        public void mo8123i(int i) {
            mo8208h();
        }

        /* renamed from: j */
        public abstract void mo8098j(int i);
    }

    public AbstractC2316d(Context context) {
        this(context, null);
    }

    /* renamed from: l */
    public void m8180l() {
        this.f9192h = false;
        a aVar = this.f9188d;
        if (aVar != null) {
            aVar.mo8076a(this, this.f9191g);
        }
    }

    /* renamed from: m */
    public void m8181m() {
        this.f9190f = false;
        mo8089u(this.f9189e);
    }

    /* renamed from: n */
    public final Context m8182n() {
        return this.f9185a;
    }

    /* renamed from: o */
    public final C2317e m8183o() {
        return this.f9191g;
    }

    /* renamed from: p */
    public final e7b m8184p() {
        return this.f9189e;
    }

    /* renamed from: q */
    public final d m8185q() {
        return this.f9186b;
    }

    /* renamed from: r */
    public b mo8086r(String str) {
        if (str != null) {
            return null;
        }
        throw new IllegalArgumentException("initialMemberRouteId cannot be null.");
    }

    /* renamed from: s */
    public abstract e mo8087s(String str);

    /* renamed from: t */
    public e mo8088t(String str, String str2) {
        if (str == null) {
            throw new IllegalArgumentException("routeId cannot be null");
        }
        if (str2 != null) {
            return mo8087s(str);
        }
        throw new IllegalArgumentException("routeGroupId cannot be null");
    }

    /* renamed from: u */
    public abstract void mo8089u(e7b e7bVar);

    /* renamed from: v */
    public final void m8186v(a aVar) {
        C2319g.m8231d();
        this.f9188d = aVar;
    }

    /* renamed from: w */
    public final void m8187w(C2317e c2317e) {
        C2319g.m8231d();
        if (this.f9191g != c2317e) {
            this.f9191g = c2317e;
            if (this.f9192h) {
                return;
            }
            this.f9192h = true;
            this.f9187c.sendEmptyMessage(1);
        }
    }

    /* renamed from: x */
    public final void m8188x(e7b e7bVar) {
        C2319g.m8231d();
        if (s6c.m47909a(this.f9189e, e7bVar)) {
            return;
        }
        m8189y(e7bVar);
    }

    /* renamed from: y */
    public final void m8189y(e7b e7bVar) {
        this.f9189e = e7bVar;
        if (this.f9190f) {
            return;
        }
        this.f9190f = true;
        this.f9187c.sendEmptyMessage(2);
    }

    public AbstractC2316d(Context context, d dVar) {
        this.f9187c = new c();
        if (context == null) {
            throw new IllegalArgumentException("context must not be null");
        }
        this.f9185a = context;
        if (dVar == null) {
            this.f9186b = new d(new ComponentName(context, getClass()));
        } else {
            this.f9186b = dVar;
        }
    }
}
