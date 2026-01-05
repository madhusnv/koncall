package p001o;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.Network;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

/* loaded from: classes.dex */
public final class ztb {

    /* renamed from: g */
    public static volatile ztb f57676g;

    /* renamed from: a */
    public final Context f57679a;

    /* renamed from: b */
    public final jtb f57680b;

    /* renamed from: c */
    public final kce f57681c;

    /* renamed from: e */
    public static final /* synthetic */ ac9[] f57674e = {kge.m35691d(new tpb(ztb.class, "networkAccessChanged", "getNetworkAccessChanged()Z", 0))};

    /* renamed from: d */
    public static final C18703a f57673d = new C18703a(null);

    /* renamed from: f */
    public static final int f57675f = 8;

    /* renamed from: h */
    public static final Set f57677h = nif.m40668i(new kf2(), new t8j());

    /* renamed from: i */
    public static final Set f57678i = new LinkedHashSet();

    /* renamed from: o.ztb$a */
    public static final class C18703a {
        public C18703a() {
        }

        public /* synthetic */ C18703a(id5 id5Var) {
            this();
        }

        /* renamed from: a */
        public final void m59891a(ytb ytbVar) {
            sq8.m48649h(ytbVar, "networkListener");
            ztb.f57678i.add(ytbVar);
        }

        /* renamed from: b */
        public final ztb m59892b() {
            return ztb.f57676g;
        }

        /* renamed from: c */
        public final void m59893c(Context context) {
            sq8.m48649h(context, "context");
            uia.m51627b(uia.f48971a, "network-manager", "initializing network manager", null, null, 12, null);
            ztb.f57676g = new ztb(context, null);
        }
    }

    /* renamed from: o.ztb$b */
    public static final class C18704b extends n8c {

        /* renamed from: b */
        public final /* synthetic */ ztb f57682b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C18704b(Object obj, ztb ztbVar) {
            super(obj);
            this.f57682b = ztbVar;
        }

        @Override // p001o.n8c
        /* renamed from: c */
        public void mo2072c(ac9 ac9Var, Object obj, Object obj2) {
            sq8.m48649h(ac9Var, "property");
            boolean zBooleanValue = ((Boolean) obj2).booleanValue();
            boolean zBooleanValue2 = ((Boolean) obj).booleanValue();
            Iterator it = ztb.f57678i.iterator();
            while (it.hasNext()) {
                ((ytb) it.next()).mo19750b(new vtb(zBooleanValue2, zBooleanValue, zBooleanValue2 != zBooleanValue, this.f57682b.f57679a));
            }
        }
    }

    public /* synthetic */ ztb(Context context, id5 id5Var) {
        this(context);
    }

    /* renamed from: g */
    public static /* synthetic */ boolean m59886g(ztb ztbVar, Network network, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = true;
        }
        return ztbVar.m59888f(network, z);
    }

    /* renamed from: e */
    public final boolean m59887e() {
        Object systemService = this.f57679a.getSystemService("connectivity");
        ConnectivityManager connectivityManager = systemService instanceof ConnectivityManager ? (ConnectivityManager) systemService : null;
        return m59886g(this, connectivityManager != null ? connectivityManager.getActiveNetwork() : null, false, 2, null);
    }

    /* renamed from: f */
    public final boolean m59888f(Network network, boolean z) {
        boolean z2;
        loop0: while (true) {
            for (itb itbVar : f57677h) {
                boolean zMo32726a = itbVar.mo32726a(this.f57679a, network);
                uia.m51627b(uia.f48971a, "network-manager", "Connection status for the " + itbVar.getClass().getName() + " is : " + zMo32726a, null, null, 12, null);
                z2 = z2 || zMo32726a;
            }
        }
        m59890i(z2 && z);
        return z2 && z;
    }

    /* renamed from: h */
    public final void m59889h() {
        this.f57680b.m34499c();
    }

    /* renamed from: i */
    public final void m59890i(boolean z) {
        this.f57681c.mo35410a(this, f57674e[0], Boolean.valueOf(z));
    }

    public ztb(Context context) {
        this.f57679a = context;
        this.f57680b = new jtb(context, this);
        tk5 tk5Var = tk5.f47333a;
        this.f57681c = new C18704b(Boolean.FALSE, this);
        m59889h();
    }
}
