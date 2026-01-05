package p001o;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Handler;
import android.os.Looper;
import android.telephony.TelephonyCallback;
import android.telephony.TelephonyDisplayInfo;
import android.telephony.TelephonyManager;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes2.dex */
public final class dub {

    /* renamed from: e */
    public static dub f20541e;

    /* renamed from: a */
    public final Handler f20542a = new Handler(Looper.getMainLooper());

    /* renamed from: b */
    public final CopyOnWriteArrayList f20543b = new CopyOnWriteArrayList();

    /* renamed from: c */
    public final Object f20544c = new Object();

    /* renamed from: d */
    public int f20545d = 0;

    /* renamed from: o.dub$b */
    public static final class C13035b {

        /* renamed from: o.dub$b$a */
        public static final class a extends TelephonyCallback implements TelephonyCallback.DisplayInfoListener {

            /* renamed from: a */
            public final dub f20546a;

            public a(dub dubVar) {
                this.f20546a = dubVar;
            }

            public void onDisplayInfoChanged(TelephonyDisplayInfo telephonyDisplayInfo) {
                int overrideNetworkType = telephonyDisplayInfo.getOverrideNetworkType();
                this.f20546a.m23845k(overrideNetworkType == 3 || overrideNetworkType == 4 || overrideNetworkType == 5 ? 10 : 5);
            }
        }

        /* renamed from: a */
        public static void m23846a(Context context, dub dubVar) {
            try {
                TelephonyManager telephonyManager = (TelephonyManager) op0.m42515e((TelephonyManager) context.getSystemService("phone"));
                a aVar = new a(dubVar);
                telephonyManager.registerTelephonyCallback(context.getMainExecutor(), aVar);
                telephonyManager.unregisterTelephonyCallback(aVar);
            } catch (RuntimeException unused) {
                dubVar.m23845k(5);
            }
        }
    }

    /* renamed from: o.dub$c */
    public interface InterfaceC13036c {
        /* renamed from: a */
        void mo22804a(int i);
    }

    /* renamed from: o.dub$d */
    public final class C13037d extends BroadcastReceiver {
        public C13037d() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            int iM23840g = dub.m23840g(context);
            if (sqi.f45790a < 31 || iM23840g != 5) {
                dub.this.m23845k(iM23840g);
            } else {
                C13035b.m23846a(context, dub.this);
            }
        }
    }

    public dub(Context context) {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
        context.registerReceiver(new C13037d(), intentFilter);
    }

    /* renamed from: d */
    public static synchronized dub m23838d(Context context) {
        if (f20541e == null) {
            f20541e = new dub(context);
        }
        return f20541e;
    }

    /* renamed from: e */
    public static int m23839e(NetworkInfo networkInfo) {
        switch (networkInfo.getSubtype()) {
            case 1:
            case 2:
                return 3;
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 14:
            case 15:
            case 17:
                return 4;
            case 13:
                return 5;
            case 16:
            case 19:
            default:
                return 6;
            case 18:
                return 2;
            case 20:
                return sqi.f45790a >= 29 ? 9 : 0;
        }
    }

    /* renamed from: g */
    public static int m23840g(Context context) {
        ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
        int i = 0;
        if (connectivityManager == null) {
            return 0;
        }
        try {
            NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
            i = 1;
            if (activeNetworkInfo != null && activeNetworkInfo.isConnected()) {
                int type2 = activeNetworkInfo.getType();
                if (type2 != 0) {
                    if (type2 == 1) {
                        return 2;
                    }
                    if (type2 != 4 && type2 != 5) {
                        if (type2 != 6) {
                            return type2 != 9 ? 8 : 7;
                        }
                        return 5;
                    }
                }
                return m23839e(activeNetworkInfo);
            }
        } catch (SecurityException unused) {
        }
        return i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: h */
    public /* synthetic */ void m23841h(InterfaceC13036c interfaceC13036c) {
        interfaceC13036c.mo22804a(m23842f());
    }

    /* renamed from: f */
    public int m23842f() {
        int i;
        synchronized (this.f20544c) {
            i = this.f20545d;
        }
        return i;
    }

    /* renamed from: i */
    public void m23843i(final InterfaceC13036c interfaceC13036c) {
        m23844j();
        this.f20543b.add(new WeakReference(interfaceC13036c));
        this.f20542a.post(new Runnable() { // from class: o.cub
            @Override // java.lang.Runnable
            public final void run() {
                this.f18659a.m23841h(interfaceC13036c);
            }
        });
    }

    /* renamed from: j */
    public final void m23844j() {
        Iterator it = this.f20543b.iterator();
        while (it.hasNext()) {
            WeakReference weakReference = (WeakReference) it.next();
            if (weakReference.get() == null) {
                this.f20543b.remove(weakReference);
            }
        }
    }

    /* renamed from: k */
    public final void m23845k(int i) {
        synchronized (this.f20544c) {
            if (this.f20545d == i) {
                return;
            }
            this.f20545d = i;
            Iterator it = this.f20543b.iterator();
            while (it.hasNext()) {
                WeakReference weakReference = (WeakReference) it.next();
                InterfaceC13036c interfaceC13036c = (InterfaceC13036c) weakReference.get();
                if (interfaceC13036c != null) {
                    interfaceC13036c.mo22804a(i);
                } else {
                    this.f20543b.remove(weakReference);
                }
            }
        }
    }
}
