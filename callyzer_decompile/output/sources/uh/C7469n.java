package uh;

import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.IBinder;
import android.os.RemoteException;
import com.google.android.play.core.appupdate.internal.zzy;
import eb.g2;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicInteger;
import th.C7156f;
import yg.C8650g;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: uh.n */
/* loaded from: classes.dex */
public final class C7469n {

    /* renamed from: n */
    public static final HashMap f36060n = new HashMap();

    /* renamed from: a */
    public final Context f36061a;

    /* renamed from: b */
    public final g2 f36062b;

    /* renamed from: g */
    public boolean f36067g;

    /* renamed from: h */
    public final Intent f36068h;

    /* renamed from: l */
    public ServiceConnectionC7468m f36072l;

    /* renamed from: m */
    public InterfaceC7462g f36073m;

    /* renamed from: d */
    public final ArrayList f36064d = new ArrayList();

    /* renamed from: e */
    public final HashSet f36065e = new HashSet();

    /* renamed from: f */
    public final Object f36066f = new Object();

    /* renamed from: j */
    public final C7465j f36070j = new IBinder.DeathRecipient() { // from class: uh.j
        @Override // android.os.IBinder.DeathRecipient
        public final void binderDied() {
            C7469n c7469n = this.f36054a;
            int i10 = 0;
            c7469n.f36062b.m5720e("reportBinderDeath", new Object[0]);
            if (c7469n.f36069i.get() != null) {
                throw new ClassCastException();
            }
            c7469n.f36062b.m5720e("%s : Binder has died.", c7469n.f36063c);
            ArrayList arrayList = c7469n.f36064d;
            int size = arrayList.size();
            while (i10 < size) {
                Object obj = arrayList.get(i10);
                i10++;
                RemoteException remoteException = new RemoteException(String.valueOf(c7469n.f36063c).concat(" : Binder has died."));
                C8650g c8650g = ((AbstractRunnableC7464i) obj).f36053a;
                if (c8650g != null) {
                    c8650g.m15970c(remoteException);
                }
            }
            c7469n.f36064d.clear();
            synchronized (c7469n.f36066f) {
                c7469n.m14275d();
            }
        }
    };

    /* renamed from: k */
    public final AtomicInteger f36071k = new AtomicInteger(0);

    /* renamed from: c */
    public final String f36063c = "AppUpdateService";

    /* renamed from: i */
    public final WeakReference f36069i = new WeakReference(null);

    /* JADX WARN: Type inference failed for: r0v3, types: [uh.j] */
    public C7469n(Context context, g2 g2Var, Intent intent) {
        this.f36061a = context;
        this.f36062b = g2Var;
        this.f36068h = intent;
    }

    /* renamed from: b */
    public static void m14272b(C7469n c7469n, C7156f c7156f) {
        InterfaceC7462g interfaceC7462g = c7469n.f36073m;
        g2 g2Var = c7469n.f36062b;
        ArrayList arrayList = c7469n.f36064d;
        int i10 = 0;
        if (interfaceC7462g != null || c7469n.f36067g) {
            if (!c7469n.f36067g) {
                c7156f.run();
                return;
            } else {
                g2Var.m5720e("Waiting to bind to the service.", new Object[0]);
                arrayList.add(c7156f);
                return;
            }
        }
        g2Var.m5720e("Initiate binding to the service.", new Object[0]);
        arrayList.add(c7156f);
        ServiceConnectionC7468m serviceConnectionC7468m = new ServiceConnectionC7468m(c7469n);
        c7469n.f36072l = serviceConnectionC7468m;
        c7469n.f36067g = true;
        if (c7469n.f36061a.bindService(c7469n.f36068h, serviceConnectionC7468m, 1)) {
            return;
        }
        g2Var.m5720e("Failed to bind to the service.", new Object[0]);
        c7469n.f36067g = false;
        int size = arrayList.size();
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            zzy zzyVar = new zzy();
            C8650g c8650g = ((AbstractRunnableC7464i) obj).f36053a;
            if (c8650g != null) {
                c8650g.m15970c(zzyVar);
            }
        }
        arrayList.clear();
    }

    /* renamed from: a */
    public final Handler m14273a() {
        Handler handler;
        HashMap map = f36060n;
        synchronized (map) {
            try {
                if (!map.containsKey(this.f36063c)) {
                    HandlerThread handlerThread = new HandlerThread(this.f36063c, 10);
                    handlerThread.start();
                    map.put(this.f36063c, new Handler(handlerThread.getLooper()));
                }
                handler = (Handler) map.get(this.f36063c);
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return handler;
    }

    /* renamed from: c */
    public final void m14274c(C8650g c8650g) {
        synchronized (this.f36066f) {
            this.f36065e.remove(c8650g);
        }
        m14273a().post(new C7466k(0, this));
    }

    /* renamed from: d */
    public final void m14275d() {
        HashSet hashSet = this.f36065e;
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            ((C8650g) it.next()).m15970c(new RemoteException(String.valueOf(this.f36063c).concat(" : Binder has died.")));
        }
        hashSet.clear();
    }
}
