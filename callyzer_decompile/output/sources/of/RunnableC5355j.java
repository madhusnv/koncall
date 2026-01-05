package of;

import android.content.Context;
import android.os.Bundle;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import android.util.Log;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import tb.C7105p;
import zh.RunnableC8956c;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: of.j */
/* loaded from: classes.dex */
public final /* synthetic */ class RunnableC5355j implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ int f26287a;

    /* renamed from: b */
    public final /* synthetic */ ServiceConnectionC5357l f26288b;

    public /* synthetic */ RunnableC5355j(ServiceConnectionC5357l serviceConnectionC5357l, int i10) {
        this.f26287a = i10;
        this.f26288b = serviceConnectionC5357l;
    }

    @Override // java.lang.Runnable
    public final void run() throws RemoteException {
        switch (this.f26287a) {
            case 0:
                break;
            case 1:
                ServiceConnectionC5357l serviceConnectionC5357l = this.f26288b;
                synchronized (serviceConnectionC5357l) {
                    if (serviceConnectionC5357l.f26291a == 1) {
                        serviceConnectionC5357l.m10478a("Timed out while binding");
                    }
                }
                return;
            default:
                this.f26288b.m10478a("Service disconnected");
                return;
        }
        while (true) {
            ServiceConnectionC5357l serviceConnectionC5357l2 = this.f26288b;
            synchronized (serviceConnectionC5357l2) {
                try {
                    if (serviceConnectionC5357l2.f26291a != 2) {
                        return;
                    }
                    if (serviceConnectionC5357l2.f26294d.isEmpty()) {
                        serviceConnectionC5357l2.m10480c();
                        return;
                    }
                    C5358m c5358m = (C5358m) serviceConnectionC5357l2.f26294d.poll();
                    serviceConnectionC5357l2.f26295e.put(c5358m.f26297a, c5358m);
                    ((ScheduledExecutorService) serviceConnectionC5357l2.f26296f.f26305c).schedule(new RunnableC8956c(8, serviceConnectionC5357l2, c5358m), 30L, TimeUnit.SECONDS);
                    if (Log.isLoggable("MessengerIpcClient", 3)) {
                        "Sending ".concat(String.valueOf(c5358m));
                    }
                    C5359n c5359n = serviceConnectionC5357l2.f26296f;
                    Messenger messenger = serviceConnectionC5357l2.f26292b;
                    int i10 = c5358m.f26299c;
                    Context context = (Context) c5359n.f26304b;
                    Message messageObtain = Message.obtain();
                    messageObtain.what = i10;
                    messageObtain.arg1 = c5358m.f26297a;
                    messageObtain.replyTo = messenger;
                    Bundle bundle = new Bundle();
                    bundle.putBoolean("oneWay", c5358m.m10482a());
                    bundle.putString("pkg", context.getPackageName());
                    bundle.putBundle("data", c5358m.f26300d);
                    messageObtain.setData(bundle);
                    try {
                        C7105p c7105p = serviceConnectionC5357l2.f26293c;
                        Messenger messenger2 = (Messenger) c7105p.f34290b;
                        if (messenger2 != null) {
                            messenger2.send(messageObtain);
                        } else {
                            C5352g c5352g = (C5352g) c7105p.f34291c;
                            if (c5352g == null) {
                                throw new IllegalStateException("Both messengers are null");
                            }
                            Messenger messenger3 = c5352g.f26278a;
                            messenger3.getClass();
                            messenger3.send(messageObtain);
                        }
                    } catch (RemoteException e2) {
                        serviceConnectionC5357l2.m10478a(e2.getMessage());
                    }
                } finally {
                }
            }
        }
    }
}
