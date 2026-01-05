package of;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.Looper;
import android.os.Messenger;
import android.util.Log;
import android.util.SparseArray;
import com.google.android.gms.cloudmessaging.zzt;
import com.google.android.gms.internal.measurement.h0;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import l0.RunnableC4307g;
import sf.AbstractC6840z;
import tb.C7105p;
import yf.C8643a;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: of.l */
/* loaded from: classes.dex */
public final class ServiceConnectionC5357l implements ServiceConnection {

    /* renamed from: a */
    public int f26291a = 0;

    /* renamed from: b */
    public final Messenger f26292b;

    /* renamed from: c */
    public C7105p f26293c;

    /* renamed from: d */
    public final ArrayDeque f26294d;

    /* renamed from: e */
    public final SparseArray f26295e;

    /* renamed from: f */
    public final /* synthetic */ C5359n f26296f;

    public ServiceConnectionC5357l(C5359n c5359n) {
        this.f26296f = c5359n;
        h0 h0Var = new h0(Looper.getMainLooper(), new C5356k(0, this), 3);
        Looper.getMainLooper();
        this.f26292b = new Messenger(h0Var);
        this.f26294d = new ArrayDeque();
        this.f26295e = new SparseArray();
    }

    /* renamed from: a */
    public final synchronized void m10478a(String str) {
        m10479b(str, null);
    }

    /* renamed from: b */
    public final synchronized void m10479b(String str, SecurityException securityException) {
        try {
            if (Log.isLoggable("MessengerIpcClient", 3)) {
                "Disconnected: ".concat(String.valueOf(str));
            }
            int i10 = this.f26291a;
            if (i10 == 0) {
                throw new IllegalStateException();
            }
            if (i10 != 1 && i10 != 2) {
                if (i10 != 3) {
                    return;
                }
                this.f26291a = 4;
                return;
            }
            Log.isLoggable("MessengerIpcClient", 2);
            this.f26291a = 4;
            C8643a.m15964b().m15966c((Context) this.f26296f.f26304b, this);
            zzt zztVar = new zzt(str, securityException);
            Iterator it = this.f26294d.iterator();
            while (it.hasNext()) {
                ((C5358m) it.next()).m10483b(zztVar);
            }
            this.f26294d.clear();
            for (int i11 = 0; i11 < this.f26295e.size(); i11++) {
                ((C5358m) this.f26295e.valueAt(i11)).m10483b(zztVar);
            }
            this.f26295e.clear();
        } catch (Throwable th2) {
            throw th2;
        }
    }

    /* renamed from: c */
    public final synchronized void m10480c() {
        if (this.f26291a == 2 && this.f26294d.isEmpty() && this.f26295e.size() == 0) {
            Log.isLoggable("MessengerIpcClient", 2);
            this.f26291a = 3;
            C8643a.m15964b().m15966c((Context) this.f26296f.f26304b, this);
        }
    }

    /* renamed from: d */
    public final synchronized boolean m10481d(C5358m c5358m) {
        int i10 = this.f26291a;
        if (i10 != 0) {
            if (i10 == 1) {
                this.f26294d.add(c5358m);
                return true;
            }
            if (i10 != 2) {
                return false;
            }
            this.f26294d.add(c5358m);
            ((ScheduledExecutorService) this.f26296f.f26305c).execute(new RunnableC5355j(this, 0));
            return true;
        }
        this.f26294d.add(c5358m);
        AbstractC6840z.m13039j(this.f26291a == 0);
        Log.isLoggable("MessengerIpcClient", 2);
        this.f26291a = 1;
        Intent intent = new Intent("com.google.android.c2dm.intent.REGISTER");
        intent.setPackage("com.google.android.gms");
        try {
            if (C8643a.m15964b().m15965a((Context) this.f26296f.f26304b, intent, this, 1)) {
                ((ScheduledExecutorService) this.f26296f.f26305c).schedule(new RunnableC5355j(this, 1), 30L, TimeUnit.SECONDS);
            } else {
                m10478a("Unable to bind to service");
            }
        } catch (SecurityException e2) {
            m10479b("Unable to bind to service", e2);
        }
        return true;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        Log.isLoggable("MessengerIpcClient", 2);
        ((ScheduledExecutorService) this.f26296f.f26305c).execute(new RunnableC4307g(8, this, iBinder));
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        Log.isLoggable("MessengerIpcClient", 2);
        ((ScheduledExecutorService) this.f26296f.f26305c).execute(new RunnableC5355j(this, 2));
    }
}
