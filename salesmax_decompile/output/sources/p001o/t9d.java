package p001o;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import com.onesignal.core.internal.database.impl.OneSignalDbContract;

/* loaded from: classes5.dex */
public abstract class t9d implements ServiceConnection {

    /* renamed from: a */
    public final Context f46669a;

    /* renamed from: b */
    public final Handler f46670b;

    /* renamed from: c */
    public InterfaceC17035b f46671c;

    /* renamed from: d */
    public boolean f46672d;

    /* renamed from: e */
    public Messenger f46673e;

    /* renamed from: f */
    public final int f46674f;

    /* renamed from: g */
    public final int f46675g;

    /* renamed from: h */
    public final String f46676h;

    /* renamed from: q */
    public final int f46677q;

    /* renamed from: s */
    public final String f46678s;

    /* renamed from: o.t9d$a */
    public static final class HandlerC17034a extends Handler {
        public HandlerC17034a() {
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            if (a94.m16694d(this)) {
                return;
            }
            try {
                sq8.m48649h(message, OneSignalDbContract.NotificationTable.COLUMN_NAME_MESSAGE);
                t9d.this.m49578c(message);
            } catch (Throwable th) {
                a94.m16692b(th, this);
            }
        }
    }

    /* renamed from: o.t9d$b */
    public interface InterfaceC17035b {
        /* renamed from: a */
        void mo44070a(Bundle bundle);
    }

    public t9d(Context context, int i, int i2, int i3, String str, String str2) {
        sq8.m48649h(context, "context");
        sq8.m48649h(str, "applicationId");
        Context applicationContext = context.getApplicationContext();
        this.f46669a = applicationContext != null ? applicationContext : context;
        this.f46674f = i;
        this.f46675g = i2;
        this.f46676h = str;
        this.f46677q = i3;
        this.f46678s = str2;
        this.f46670b = new HandlerC17034a();
    }

    /* renamed from: a */
    public final void m49576a(Bundle bundle) {
        if (this.f46672d) {
            this.f46672d = false;
            InterfaceC17035b interfaceC17035b = this.f46671c;
            if (interfaceC17035b != null) {
                interfaceC17035b.mo44070a(bundle);
            }
        }
    }

    /* renamed from: b */
    public final void m49577b() {
        this.f46672d = false;
    }

    /* renamed from: c */
    public final void m49578c(Message message) {
        sq8.m48649h(message, OneSignalDbContract.NotificationTable.COLUMN_NAME_MESSAGE);
        if (message.what == this.f46675g) {
            Bundle data = message.getData();
            if (data.getString("com.facebook.platform.status.ERROR_TYPE") != null) {
                m49576a(null);
            } else {
                m49576a(data);
            }
            try {
                this.f46669a.unbindService(this);
            } catch (IllegalArgumentException unused) {
            }
        }
    }

    /* renamed from: d */
    public abstract void mo13363d(Bundle bundle);

    /* renamed from: e */
    public final void m49579e() throws RemoteException {
        Bundle bundle = new Bundle();
        bundle.putString("com.facebook.platform.extra.APPLICATION_ID", this.f46676h);
        String str = this.f46678s;
        if (str != null) {
            bundle.putString("com.facebook.platform.extra.NONCE", str);
        }
        mo13363d(bundle);
        Message messageObtain = Message.obtain((Handler) null, this.f46674f);
        messageObtain.arg1 = this.f46677q;
        messageObtain.setData(bundle);
        messageObtain.replyTo = new Messenger(this.f46670b);
        try {
            Messenger messenger = this.f46673e;
            if (messenger != null) {
                messenger.send(messageObtain);
            }
        } catch (RemoteException unused) {
            m49576a(null);
        }
    }

    /* renamed from: f */
    public final void m49580f(InterfaceC17035b interfaceC17035b) {
        this.f46671c = interfaceC17035b;
    }

    /* renamed from: g */
    public final boolean m49581g() {
        synchronized (this) {
            boolean z = false;
            if (this.f46672d) {
                return false;
            }
            if (srb.m48790t(this.f46677q) == -1) {
                return false;
            }
            Intent intentM48784l = srb.m48784l(this.f46669a);
            if (intentM48784l != null) {
                z = true;
                this.f46672d = true;
                this.f46669a.bindService(intentM48784l, this, 1);
            }
            return z;
        }
    }

    @Override // android.content.ServiceConnection
    public void onServiceConnected(ComponentName componentName, IBinder iBinder) throws RemoteException {
        sq8.m48649h(componentName, "name");
        sq8.m48649h(iBinder, "service");
        this.f46673e = new Messenger(iBinder);
        m49579e();
    }

    @Override // android.content.ServiceConnection
    public void onServiceDisconnected(ComponentName componentName) {
        sq8.m48649h(componentName, "name");
        this.f46673e = null;
        try {
            this.f46669a.unbindService(this);
        } catch (IllegalArgumentException unused) {
        }
        m49576a(null);
    }
}
