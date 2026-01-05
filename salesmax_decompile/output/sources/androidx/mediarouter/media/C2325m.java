package androidx.mediarouter.media;

import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.os.Build;
import android.os.Handler;
import android.os.RemoteException;
import androidx.mediarouter.media.AbstractC2316d;
import androidx.mediarouter.media.ServiceConnectionC2324l;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* renamed from: androidx.mediarouter.media.m */
/* loaded from: classes2.dex */
public final class C2325m {

    /* renamed from: a */
    public final Context f9371a;

    /* renamed from: b */
    public final c f9372b;

    /* renamed from: d */
    public final PackageManager f9374d;

    /* renamed from: f */
    public boolean f9376f;

    /* renamed from: e */
    public final ArrayList f9375e = new ArrayList();

    /* renamed from: g */
    public final BroadcastReceiver f9377g = new a();

    /* renamed from: h */
    public final Runnable f9378h = new b();

    /* renamed from: c */
    public final Handler f9373c = new Handler();

    /* renamed from: androidx.mediarouter.media.m$a */
    public class a extends BroadcastReceiver {
        public a() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) throws RemoteException {
            C2325m.this.m8493g();
        }
    }

    /* renamed from: androidx.mediarouter.media.m$b */
    public class b implements Runnable {
        public b() {
        }

        @Override // java.lang.Runnable
        public void run() throws RemoteException {
            C2325m.this.m8493g();
        }
    }

    /* renamed from: androidx.mediarouter.media.m$c */
    public interface c {
        /* renamed from: a */
        void mo8281a(AbstractC2316d abstractC2316d);

        /* renamed from: b */
        void mo8282b(AbstractC2316d abstractC2316d);

        /* renamed from: d */
        void mo8284d(ServiceConnectionC2324l serviceConnectionC2324l, AbstractC2316d.e eVar);
    }

    public C2325m(Context context, c cVar) {
        this.f9371a = context;
        this.f9372b = cVar;
        this.f9374d = context.getPackageManager();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: d */
    public /* synthetic */ void m8488d(ServiceConnectionC2324l serviceConnectionC2324l, AbstractC2316d.e eVar) {
        this.f9372b.mo8284d(serviceConnectionC2324l, eVar);
    }

    /* renamed from: e */
    public static boolean m8489e(List list, ServiceInfo serviceInfo) {
        if (serviceInfo != null && list != null && !list.isEmpty()) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                ServiceInfo serviceInfo2 = (ServiceInfo) it.next();
                if (serviceInfo.packageName.equals(serviceInfo2.packageName) && serviceInfo.name.equals(serviceInfo2.name)) {
                    return true;
                }
            }
        }
        return false;
    }

    /* renamed from: b */
    public final int m8490b(String str, String str2) {
        int size = this.f9375e.size();
        for (int i = 0; i < size; i++) {
            if (((ServiceConnectionC2324l) this.f9375e.get(i)).m8439G(str, str2)) {
                return i;
            }
        }
        return -1;
    }

    /* renamed from: c */
    public List m8491c() {
        Intent intent = new Intent("android.media.MediaRoute2ProviderService");
        ArrayList arrayList = new ArrayList();
        Iterator<ResolveInfo> it = this.f9374d.queryIntentServices(intent, 0).iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().serviceInfo);
        }
        return arrayList;
    }

    /* renamed from: f */
    public void m8492f() {
        this.f9373c.post(this.f9378h);
    }

    /* renamed from: g */
    public void m8493g() throws RemoteException {
        int i;
        if (this.f9376f) {
            List arrayList = new ArrayList();
            if (Build.VERSION.SDK_INT >= 30) {
                arrayList = m8491c();
            }
            int i2 = 0;
            Iterator<ResolveInfo> it = this.f9374d.queryIntentServices(new Intent("android.media.MediaRouteProviderService"), 0).iterator();
            while (it.hasNext()) {
                ServiceInfo serviceInfo = it.next().serviceInfo;
                if (serviceInfo != null && (!C2319g.m8236p() || !m8489e(arrayList, serviceInfo))) {
                    int iM8490b = m8490b(serviceInfo.packageName, serviceInfo.name);
                    if (iM8490b < 0) {
                        final ServiceConnectionC2324l serviceConnectionC2324l = new ServiceConnectionC2324l(this.f9371a, new ComponentName(serviceInfo.packageName, serviceInfo.name));
                        serviceConnectionC2324l.m8448P(new ServiceConnectionC2324l.b() { // from class: o.bhe
                            @Override // androidx.mediarouter.media.ServiceConnectionC2324l.b
                            /* renamed from: a */
                            public final void mo8480a(AbstractC2316d.e eVar) {
                                this.f16257a.m8488d(serviceConnectionC2324l, eVar);
                            }
                        });
                        serviceConnectionC2324l.m8450R();
                        i = i2 + 1;
                        this.f9375e.add(i2, serviceConnectionC2324l);
                        this.f9372b.mo8281a(serviceConnectionC2324l);
                    } else if (iM8490b >= i2) {
                        ServiceConnectionC2324l serviceConnectionC2324l2 = (ServiceConnectionC2324l) this.f9375e.get(iM8490b);
                        serviceConnectionC2324l2.m8450R();
                        serviceConnectionC2324l2.m8447O();
                        i = i2 + 1;
                        Collections.swap(this.f9375e, iM8490b, i2);
                    }
                    i2 = i;
                }
            }
            if (i2 < this.f9375e.size()) {
                for (int size = this.f9375e.size() - 1; size >= i2; size--) {
                    ServiceConnectionC2324l serviceConnectionC2324l3 = (ServiceConnectionC2324l) this.f9375e.get(size);
                    this.f9372b.mo8282b(serviceConnectionC2324l3);
                    this.f9375e.remove(serviceConnectionC2324l3);
                    serviceConnectionC2324l3.m8448P(null);
                    serviceConnectionC2324l3.m8451S();
                }
            }
        }
    }

    /* renamed from: h */
    public void m8494h() {
        if (this.f9376f) {
            return;
        }
        this.f9376f = true;
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.intent.action.PACKAGE_ADDED");
        intentFilter.addAction("android.intent.action.PACKAGE_REMOVED");
        intentFilter.addAction("android.intent.action.PACKAGE_CHANGED");
        intentFilter.addAction("android.intent.action.PACKAGE_REPLACED");
        intentFilter.addAction("android.intent.action.PACKAGE_RESTARTED");
        intentFilter.addDataScheme("package");
        this.f9371a.registerReceiver(this.f9377g, intentFilter, null, this.f9373c);
        this.f9373c.post(this.f9378h);
    }
}
