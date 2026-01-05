package p001o;

import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes3.dex */
public final class rkj {

    /* renamed from: o */
    public static final Map f43740o = new HashMap();

    /* renamed from: a */
    public final Context f43741a;

    /* renamed from: b */
    public final sjj f43742b;

    /* renamed from: g */
    public boolean f43747g;

    /* renamed from: h */
    public final Intent f43748h;

    /* renamed from: l */
    public ServiceConnection f43752l;

    /* renamed from: m */
    public IInterface f43753m;

    /* renamed from: n */
    public final rjj f43754n;

    /* renamed from: d */
    public final List f43744d = new ArrayList();

    /* renamed from: e */
    public final Set f43745e = new HashSet();

    /* renamed from: f */
    public final Object f43746f = new Object();

    /* renamed from: j */
    public final IBinder.DeathRecipient f43750j = new IBinder.DeathRecipient() { // from class: o.akj
        @Override // android.os.IBinder.DeathRecipient
        public final void binderDied() {
            rkj.m46883j(this.f14904a);
        }
    };

    /* renamed from: k */
    public final AtomicInteger f43751k = new AtomicInteger(0);

    /* renamed from: c */
    public final String f43743c = "AppUpdateService";

    /* renamed from: i */
    public final WeakReference f43749i = new WeakReference(null);

    public rkj(Context context, sjj sjjVar, String str, Intent intent, rjj rjjVar, gkj gkjVar) {
        this.f43741a = context;
        this.f43742b = sjjVar;
        this.f43748h = intent;
        this.f43754n = rjjVar;
    }

    /* renamed from: j */
    public static /* synthetic */ void m46883j(rkj rkjVar) {
        rkjVar.f43742b.m48398c("reportBinderDeath", new Object[0]);
        tq.m50332a(rkjVar.f43749i.get());
        rkjVar.f43742b.m48398c("%s : Binder has died.", rkjVar.f43743c);
        Iterator it = rkjVar.f43744d.iterator();
        while (it.hasNext()) {
            ((ujj) it.next()).m51663c(rkjVar.m46897v());
        }
        rkjVar.f43744d.clear();
        synchronized (rkjVar.f43746f) {
            rkjVar.m46898w();
        }
    }

    /* renamed from: n */
    public static /* bridge */ /* synthetic */ void m46887n(final rkj rkjVar, final TaskCompletionSource taskCompletionSource) {
        rkjVar.f43745e.add(taskCompletionSource);
        taskCompletionSource.getTask().addOnCompleteListener(new OnCompleteListener() { // from class: o.vjj
            @Override // com.google.android.gms.tasks.OnCompleteListener
            public final void onComplete(Task task) {
                this.f50457a.m46895t(taskCompletionSource, task);
            }
        });
    }

    /* renamed from: p */
    public static /* bridge */ /* synthetic */ void m46889p(rkj rkjVar, ujj ujjVar) {
        if (rkjVar.f43753m != null || rkjVar.f43747g) {
            if (!rkjVar.f43747g) {
                ujjVar.run();
                return;
            } else {
                rkjVar.f43742b.m48398c("Waiting to bind to the service.", new Object[0]);
                rkjVar.f43744d.add(ujjVar);
                return;
            }
        }
        rkjVar.f43742b.m48398c("Initiate binding to the service.", new Object[0]);
        rkjVar.f43744d.add(ujjVar);
        pkj pkjVar = new pkj(rkjVar, null);
        rkjVar.f43752l = pkjVar;
        rkjVar.f43747g = true;
        if (rkjVar.f43741a.bindService(rkjVar.f43748h, pkjVar, 1)) {
            return;
        }
        rkjVar.f43742b.m48398c("Failed to bind to the service.", new Object[0]);
        rkjVar.f43747g = false;
        Iterator it = rkjVar.f43744d.iterator();
        while (it.hasNext()) {
            ((ujj) it.next()).m51663c(new tkj());
        }
        rkjVar.f43744d.clear();
    }

    /* renamed from: q */
    public static /* bridge */ /* synthetic */ void m46890q(rkj rkjVar) throws RemoteException {
        rkjVar.f43742b.m48398c("linkToDeath", new Object[0]);
        try {
            rkjVar.f43753m.asBinder().linkToDeath(rkjVar.f43750j, 0);
        } catch (RemoteException e) {
            rkjVar.f43742b.m48397b(e, "linkToDeath failed", new Object[0]);
        }
    }

    /* renamed from: r */
    public static /* bridge */ /* synthetic */ void m46891r(rkj rkjVar) {
        rkjVar.f43742b.m48398c("unlinkToDeath", new Object[0]);
        rkjVar.f43753m.asBinder().unlinkToDeath(rkjVar.f43750j, 0);
    }

    /* renamed from: c */
    public final Handler m46892c() {
        Handler handler;
        Map map = f43740o;
        synchronized (map) {
            if (!map.containsKey(this.f43743c)) {
                HandlerThread handlerThread = new HandlerThread(this.f43743c, 10);
                handlerThread.start();
                map.put(this.f43743c, new Handler(handlerThread.getLooper()));
            }
            handler = (Handler) map.get(this.f43743c);
        }
        return handler;
    }

    /* renamed from: e */
    public final IInterface m46893e() {
        return this.f43753m;
    }

    /* renamed from: s */
    public final void m46894s(ujj ujjVar, TaskCompletionSource taskCompletionSource) {
        m46892c().post(new bkj(this, ujjVar.m51662b(), taskCompletionSource, ujjVar));
    }

    /* renamed from: t */
    public final /* synthetic */ void m46895t(TaskCompletionSource taskCompletionSource, Task task) {
        synchronized (this.f43746f) {
            this.f43745e.remove(taskCompletionSource);
        }
    }

    /* renamed from: u */
    public final void m46896u(TaskCompletionSource taskCompletionSource) {
        synchronized (this.f43746f) {
            this.f43745e.remove(taskCompletionSource);
        }
        m46892c().post(new ekj(this));
    }

    /* renamed from: v */
    public final RemoteException m46897v() {
        return new RemoteException(String.valueOf(this.f43743c).concat(" : Binder has died."));
    }

    /* renamed from: w */
    public final void m46898w() {
        Iterator it = this.f43745e.iterator();
        while (it.hasNext()) {
            ((TaskCompletionSource) it.next()).trySetException(m46897v());
        }
        this.f43745e.clear();
    }
}
