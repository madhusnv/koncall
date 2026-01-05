package p001o;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.Network;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import p001o.dt7;
import p001o.it3;

/* loaded from: classes5.dex */
public final class bvf {

    /* renamed from: d */
    public static volatile bvf f16863d;

    /* renamed from: a */
    public final InterfaceC12510c f16864a;

    /* renamed from: b */
    public final Set f16865b = new HashSet();

    /* renamed from: c */
    public boolean f16866c;

    /* renamed from: o.bvf$a */
    public class C12508a implements dt7.InterfaceC13029b {

        /* renamed from: a */
        public final /* synthetic */ Context f16867a;

        public C12508a(Context context) {
            this.f16867a = context;
        }

        @Override // p001o.dt7.InterfaceC13029b
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public ConnectivityManager get() {
            return (ConnectivityManager) this.f16867a.getSystemService("connectivity");
        }
    }

    /* renamed from: o.bvf$b */
    public class C12509b implements it3.InterfaceC14366a {
        public C12509b() {
        }

        @Override // p001o.it3.InterfaceC14366a
        /* renamed from: a */
        public void mo19874a(boolean z) {
            ArrayList arrayList;
            uqi.m51920a();
            synchronized (bvf.this) {
                arrayList = new ArrayList(bvf.this.f16865b);
            }
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ((it3.InterfaceC14366a) it.next()).mo19874a(z);
            }
        }
    }

    /* renamed from: o.bvf$c */
    public interface InterfaceC12510c {
        /* renamed from: a */
        boolean mo19875a();

        void unregister();
    }

    /* renamed from: o.bvf$d */
    public static final class C12511d implements InterfaceC12510c {

        /* renamed from: a */
        public boolean f16870a;

        /* renamed from: b */
        public final it3.InterfaceC14366a f16871b;

        /* renamed from: c */
        public final dt7.InterfaceC13029b f16872c;

        /* renamed from: d */
        public final ConnectivityManager.NetworkCallback f16873d = new a();

        /* renamed from: o.bvf$d$a */
        public class a extends ConnectivityManager.NetworkCallback {

            /* renamed from: o.bvf$d$a$a, reason: collision with other inner class name */
            public class RunnableC19584a implements Runnable {

                /* renamed from: a */
                public final /* synthetic */ boolean f16875a;

                public RunnableC19584a(boolean z) {
                    this.f16875a = z;
                }

                @Override // java.lang.Runnable
                public void run() {
                    a.this.m19876a(this.f16875a);
                }
            }

            public a() {
            }

            /* renamed from: a */
            public void m19876a(boolean z) {
                uqi.m51920a();
                C12511d c12511d = C12511d.this;
                boolean z2 = c12511d.f16870a;
                c12511d.f16870a = z;
                if (z2 != z) {
                    c12511d.f16871b.mo19874a(z);
                }
            }

            /* renamed from: b */
            public final void m19877b(boolean z) {
                uqi.m51939t(new RunnableC19584a(z));
            }

            @Override // android.net.ConnectivityManager.NetworkCallback
            public void onAvailable(Network network) {
                m19877b(true);
            }

            @Override // android.net.ConnectivityManager.NetworkCallback
            public void onLost(Network network) {
                m19877b(false);
            }
        }

        public C12511d(dt7.InterfaceC13029b interfaceC13029b, it3.InterfaceC14366a interfaceC14366a) {
            this.f16872c = interfaceC13029b;
            this.f16871b = interfaceC14366a;
        }

        @Override // p001o.bvf.InterfaceC12510c
        /* renamed from: a */
        public boolean mo19875a() {
            this.f16870a = ((ConnectivityManager) this.f16872c.get()).getActiveNetwork() != null;
            try {
                ((ConnectivityManager) this.f16872c.get()).registerDefaultNetworkCallback(this.f16873d);
                return true;
            } catch (RuntimeException unused) {
                return false;
            }
        }

        @Override // p001o.bvf.InterfaceC12510c
        public void unregister() {
            ((ConnectivityManager) this.f16872c.get()).unregisterNetworkCallback(this.f16873d);
        }
    }

    public bvf(Context context) {
        this.f16864a = new C12511d(dt7.m23783a(new C12508a(context)), new C12509b());
    }

    /* renamed from: a */
    public static bvf m19868a(Context context) {
        if (f16863d == null) {
            synchronized (bvf.class) {
                if (f16863d == null) {
                    f16863d = new bvf(context.getApplicationContext());
                }
            }
        }
        return f16863d;
    }

    /* renamed from: b */
    public final void m19869b() {
        if (this.f16866c || this.f16865b.isEmpty()) {
            return;
        }
        this.f16866c = this.f16864a.mo19875a();
    }

    /* renamed from: c */
    public final void m19870c() {
        if (this.f16866c && this.f16865b.isEmpty()) {
            this.f16864a.unregister();
            this.f16866c = false;
        }
    }

    /* renamed from: d */
    public synchronized void m19871d(it3.InterfaceC14366a interfaceC14366a) {
        this.f16865b.add(interfaceC14366a);
        m19869b();
    }

    /* renamed from: e */
    public synchronized void m19872e(it3.InterfaceC14366a interfaceC14366a) {
        this.f16865b.remove(interfaceC14366a);
        m19870c();
    }
}
