package of;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Looper;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import android.util.Log;
import bk.RunnableC0683n;
import ch.C0972b;
import e1.u0;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;
import kg.AbstractC4076a;
import l4.C4367l;
import yg.C8650g;
import yg.C8656m;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: of.b */
/* loaded from: classes.dex */
public final class C5347b {

    /* renamed from: h */
    public static int f26262h;

    /* renamed from: i */
    public static PendingIntent f26263i;

    /* renamed from: j */
    public static final Pattern f26264j = Pattern.compile("\\|ID\\|([^|]+)\\|:?+(.*)");

    /* renamed from: b */
    public final Context f26266b;

    /* renamed from: c */
    public final C0972b f26267c;

    /* renamed from: d */
    public final ScheduledThreadPoolExecutor f26268d;

    /* renamed from: f */
    public Messenger f26270f;

    /* renamed from: g */
    public C5352g f26271g;

    /* renamed from: a */
    public final u0 f26265a = new u0(0);

    /* renamed from: e */
    public final Messenger f26269e = new Messenger(new HandlerC5350e(this, Looper.getMainLooper()));

    public C5347b(Context context) {
        this.f26266b = context;
        this.f26267c = new C0972b(context);
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = new ScheduledThreadPoolExecutor(1);
        scheduledThreadPoolExecutor.setKeepAliveTime(60L, TimeUnit.SECONDS);
        scheduledThreadPoolExecutor.allowCoreThreadTimeOut(true);
        this.f26268d = scheduledThreadPoolExecutor;
    }

    /* renamed from: a */
    public final C8656m m10476a(Bundle bundle) throws RemoteException {
        String string;
        synchronized (C5347b.class) {
            int i10 = f26262h;
            f26262h = i10 + 1;
            string = Integer.toString(i10);
        }
        C8650g c8650g = new C8650g();
        synchronized (this.f26265a) {
            this.f26265a.put(string, c8650g);
        }
        Intent intent = new Intent();
        intent.setPackage("com.google.android.gms");
        if (this.f26267c.m2752v() == 2) {
            intent.setAction("com.google.iid.TOKEN_REQUEST");
        } else {
            intent.setAction("com.google.android.c2dm.intent.REGISTER");
        }
        intent.putExtras(bundle);
        Context context = this.f26266b;
        synchronized (C5347b.class) {
            try {
                if (f26263i == null) {
                    Intent intent2 = new Intent();
                    intent2.setPackage("com.google.example.invalidpackage");
                    f26263i = PendingIntent.getBroadcast(context, 0, intent2, AbstractC4076a.f20946a);
                }
                intent.putExtra("app", f26263i);
            } finally {
            }
        }
        intent.putExtra("kid", "|ID|" + string + "|");
        if (Log.isLoggable("Rpc", 3)) {
            "Sending ".concat(String.valueOf(intent.getExtras()));
        }
        intent.putExtra("google.messenger", this.f26269e);
        if (this.f26270f != null || this.f26271g != null) {
            Message messageObtain = Message.obtain();
            messageObtain.obj = intent;
            try {
                Messenger messenger = this.f26270f;
                if (messenger != null) {
                    messenger.send(messageObtain);
                } else {
                    Messenger messenger2 = this.f26271g.f26278a;
                    messenger2.getClass();
                    messenger2.send(messageObtain);
                }
            } catch (RemoteException unused) {
                Log.isLoggable("Rpc", 3);
            }
        } else if (this.f26267c.m2752v() == 2) {
            this.f26266b.sendBroadcast(intent);
        } else {
            this.f26266b.startService(intent);
        }
        c8650g.f41930a.m15975b(ExecutorC5353h.f26280c, new C4367l(16, this, string, this.f26268d.schedule(new RunnableC0683n(11, c8650g), 30L, TimeUnit.SECONDS)));
        return c8650g.f41930a;
    }

    /* renamed from: b */
    public final void m10477b(String str, Bundle bundle) {
        synchronized (this.f26265a) {
            try {
                C8650g c8650g = (C8650g) this.f26265a.remove(str);
                if (c8650g == null) {
                    return;
                }
                c8650g.m15969b(bundle);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
