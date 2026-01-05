package p001o;

import android.app.Notification;
import android.app.NotificationManager;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.IBinder;
import android.os.Message;
import android.os.RemoteException;
import android.provider.Settings;
import android.util.Log;
import com.onesignal.core.internal.database.impl.OneSignalDbContract;
import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import p001o.n68;

/* loaded from: classes2.dex */
public final class e3c {

    /* renamed from: d */
    public static String f20887d;

    /* renamed from: g */
    public static ServiceConnectionC13095d f20890g;

    /* renamed from: a */
    public final Context f20891a;

    /* renamed from: b */
    public final NotificationManager f20892b;

    /* renamed from: c */
    public static final Object f20886c = new Object();

    /* renamed from: e */
    public static Set f20888e = new HashSet();

    /* renamed from: f */
    public static final Object f20889f = new Object();

    /* renamed from: o.e3c$a */
    public static class C13092a {
        /* renamed from: a */
        public static boolean m24220a(NotificationManager notificationManager) {
            return notificationManager.areNotificationsEnabled();
        }

        /* renamed from: b */
        public static int m24221b(NotificationManager notificationManager) {
            return notificationManager.getImportance();
        }
    }

    /* renamed from: o.e3c$b */
    public static class C13093b implements InterfaceC13096e {

        /* renamed from: a */
        public final String f20893a;

        /* renamed from: b */
        public final int f20894b;

        /* renamed from: c */
        public final String f20895c;

        /* renamed from: d */
        public final Notification f20896d;

        public C13093b(String str, int i, String str2, Notification notification) {
            this.f20893a = str;
            this.f20894b = i;
            this.f20895c = str2;
            this.f20896d = notification;
        }

        @Override // p001o.e3c.InterfaceC13096e
        /* renamed from: a */
        public void mo24222a(n68 n68Var) {
            n68Var.I0(this.f20893a, this.f20894b, this.f20895c, this.f20896d);
        }

        public String toString() {
            return "NotifyTask[packageName:" + this.f20893a + ", id:" + this.f20894b + ", tag:" + this.f20895c + "]";
        }
    }

    /* renamed from: o.e3c$c */
    public static class C13094c {

        /* renamed from: a */
        public final ComponentName f20897a;

        /* renamed from: b */
        public final IBinder f20898b;

        public C13094c(ComponentName componentName, IBinder iBinder) {
            this.f20897a = componentName;
            this.f20898b = iBinder;
        }
    }

    /* renamed from: o.e3c$d */
    public static class ServiceConnectionC13095d implements Handler.Callback, ServiceConnection {

        /* renamed from: a */
        public final Context f20899a;

        /* renamed from: b */
        public final HandlerThread f20900b;

        /* renamed from: c */
        public final Handler f20901c;

        /* renamed from: d */
        public final Map f20902d = new HashMap();

        /* renamed from: e */
        public Set f20903e = new HashSet();

        /* renamed from: o.e3c$d$a */
        public static class a {

            /* renamed from: a */
            public final ComponentName f20904a;

            /* renamed from: c */
            public n68 f20906c;

            /* renamed from: b */
            public boolean f20905b = false;

            /* renamed from: d */
            public ArrayDeque f20907d = new ArrayDeque();

            /* renamed from: e */
            public int f20908e = 0;

            public a(ComponentName componentName) {
                this.f20904a = componentName;
            }
        }

        public ServiceConnectionC13095d(Context context) {
            this.f20899a = context;
            HandlerThread handlerThread = new HandlerThread("NotificationManagerCompat");
            this.f20900b = handlerThread;
            handlerThread.start();
            this.f20901c = new Handler(handlerThread.getLooper(), this);
        }

        /* renamed from: a */
        public final boolean m24223a(a aVar) {
            if (aVar.f20905b) {
                return true;
            }
            boolean zBindService = this.f20899a.bindService(new Intent("android.support.BIND_NOTIFICATION_SIDE_CHANNEL").setComponent(aVar.f20904a), this, 33);
            aVar.f20905b = zBindService;
            if (zBindService) {
                aVar.f20908e = 0;
            } else {
                StringBuilder sb = new StringBuilder();
                sb.append("Unable to bind to listener ");
                sb.append(aVar.f20904a);
                this.f20899a.unbindService(this);
            }
            return aVar.f20905b;
        }

        /* renamed from: b */
        public final void m24224b(a aVar) {
            if (aVar.f20905b) {
                this.f20899a.unbindService(this);
                aVar.f20905b = false;
            }
            aVar.f20906c = null;
        }

        /* renamed from: c */
        public final void m24225c(InterfaceC13096e interfaceC13096e) {
            m24232j();
            for (a aVar : this.f20902d.values()) {
                aVar.f20907d.add(interfaceC13096e);
                m24229g(aVar);
            }
        }

        /* renamed from: d */
        public final void m24226d(ComponentName componentName) {
            a aVar = (a) this.f20902d.get(componentName);
            if (aVar != null) {
                m24229g(aVar);
            }
        }

        /* renamed from: e */
        public final void m24227e(ComponentName componentName, IBinder iBinder) {
            a aVar = (a) this.f20902d.get(componentName);
            if (aVar != null) {
                aVar.f20906c = n68.AbstractBinderC15509a.L0(iBinder);
                aVar.f20908e = 0;
                m24229g(aVar);
            }
        }

        /* renamed from: f */
        public final void m24228f(ComponentName componentName) {
            a aVar = (a) this.f20902d.get(componentName);
            if (aVar != null) {
                m24224b(aVar);
            }
        }

        /* renamed from: g */
        public final void m24229g(a aVar) {
            if (Log.isLoggable("NotifManCompat", 3)) {
                StringBuilder sb = new StringBuilder();
                sb.append("Processing component ");
                sb.append(aVar.f20904a);
                sb.append(", ");
                sb.append(aVar.f20907d.size());
                sb.append(" queued tasks");
            }
            if (aVar.f20907d.isEmpty()) {
                return;
            }
            if (!m24223a(aVar) || aVar.f20906c == null) {
                m24231i(aVar);
                return;
            }
            while (true) {
                InterfaceC13096e interfaceC13096e = (InterfaceC13096e) aVar.f20907d.peek();
                if (interfaceC13096e == null) {
                    break;
                }
                try {
                    if (Log.isLoggable("NotifManCompat", 3)) {
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append("Sending task ");
                        sb2.append(interfaceC13096e);
                    }
                    interfaceC13096e.mo24222a(aVar.f20906c);
                    aVar.f20907d.remove();
                } catch (DeadObjectException unused) {
                    if (Log.isLoggable("NotifManCompat", 3)) {
                        StringBuilder sb3 = new StringBuilder();
                        sb3.append("Remote service has died: ");
                        sb3.append(aVar.f20904a);
                    }
                } catch (RemoteException unused2) {
                    StringBuilder sb4 = new StringBuilder();
                    sb4.append("RemoteException communicating with ");
                    sb4.append(aVar.f20904a);
                }
            }
            if (aVar.f20907d.isEmpty()) {
                return;
            }
            m24231i(aVar);
        }

        /* renamed from: h */
        public void m24230h(InterfaceC13096e interfaceC13096e) {
            this.f20901c.obtainMessage(0, interfaceC13096e).sendToTarget();
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) {
            int i = message.what;
            if (i == 0) {
                m24225c((InterfaceC13096e) message.obj);
                return true;
            }
            if (i == 1) {
                C13094c c13094c = (C13094c) message.obj;
                m24227e(c13094c.f20897a, c13094c.f20898b);
                return true;
            }
            if (i == 2) {
                m24228f((ComponentName) message.obj);
                return true;
            }
            if (i != 3) {
                return false;
            }
            m24226d((ComponentName) message.obj);
            return true;
        }

        /* renamed from: i */
        public final void m24231i(a aVar) {
            if (this.f20901c.hasMessages(3, aVar.f20904a)) {
                return;
            }
            int i = aVar.f20908e + 1;
            aVar.f20908e = i;
            if (i <= 6) {
                int i2 = (1 << (i - 1)) * 1000;
                if (Log.isLoggable("NotifManCompat", 3)) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("Scheduling retry for ");
                    sb.append(i2);
                    sb.append(" ms");
                }
                this.f20901c.sendMessageDelayed(this.f20901c.obtainMessage(3, aVar.f20904a), i2);
                return;
            }
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Giving up on delivering ");
            sb2.append(aVar.f20907d.size());
            sb2.append(" tasks to ");
            sb2.append(aVar.f20904a);
            sb2.append(" after ");
            sb2.append(aVar.f20908e);
            sb2.append(" retries");
            aVar.f20907d.clear();
        }

        /* renamed from: j */
        public final void m24232j() {
            Set setM24212e = e3c.m24212e(this.f20899a);
            if (setM24212e.equals(this.f20903e)) {
                return;
            }
            this.f20903e = setM24212e;
            List<ResolveInfo> listQueryIntentServices = this.f20899a.getPackageManager().queryIntentServices(new Intent().setAction("android.support.BIND_NOTIFICATION_SIDE_CHANNEL"), 0);
            HashSet<ComponentName> hashSet = new HashSet();
            for (ResolveInfo resolveInfo : listQueryIntentServices) {
                if (setM24212e.contains(resolveInfo.serviceInfo.packageName)) {
                    ServiceInfo serviceInfo = resolveInfo.serviceInfo;
                    ComponentName componentName = new ComponentName(serviceInfo.packageName, serviceInfo.name);
                    if (resolveInfo.serviceInfo.permission != null) {
                        StringBuilder sb = new StringBuilder();
                        sb.append("Permission present on component ");
                        sb.append(componentName);
                        sb.append(", not adding listener record.");
                    } else {
                        hashSet.add(componentName);
                    }
                }
            }
            for (ComponentName componentName2 : hashSet) {
                if (!this.f20902d.containsKey(componentName2)) {
                    if (Log.isLoggable("NotifManCompat", 3)) {
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append("Adding listener record for ");
                        sb2.append(componentName2);
                    }
                    this.f20902d.put(componentName2, new a(componentName2));
                }
            }
            Iterator it = this.f20902d.entrySet().iterator();
            while (it.hasNext()) {
                Map.Entry entry = (Map.Entry) it.next();
                if (!hashSet.contains(entry.getKey())) {
                    if (Log.isLoggable("NotifManCompat", 3)) {
                        StringBuilder sb3 = new StringBuilder();
                        sb3.append("Removing listener record for ");
                        sb3.append(entry.getKey());
                    }
                    m24224b((a) entry.getValue());
                    it.remove();
                }
            }
        }

        @Override // android.content.ServiceConnection
        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            if (Log.isLoggable("NotifManCompat", 3)) {
                StringBuilder sb = new StringBuilder();
                sb.append("Connected to service ");
                sb.append(componentName);
            }
            this.f20901c.obtainMessage(1, new C13094c(componentName, iBinder)).sendToTarget();
        }

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(ComponentName componentName) {
            if (Log.isLoggable("NotifManCompat", 3)) {
                StringBuilder sb = new StringBuilder();
                sb.append("Disconnected from service ");
                sb.append(componentName);
            }
            this.f20901c.obtainMessage(2, componentName).sendToTarget();
        }
    }

    /* renamed from: o.e3c$e */
    public interface InterfaceC13096e {
        /* renamed from: a */
        void mo24222a(n68 n68Var);
    }

    public e3c(Context context) {
        this.f20891a = context;
        this.f20892b = (NotificationManager) context.getSystemService(OneSignalDbContract.NotificationTable.TABLE_NAME);
    }

    /* renamed from: d */
    public static e3c m24211d(Context context) {
        return new e3c(context);
    }

    /* renamed from: e */
    public static Set m24212e(Context context) {
        Set set;
        String string = Settings.Secure.getString(context.getContentResolver(), "enabled_notification_listeners");
        synchronized (f20886c) {
            if (string != null) {
                if (!string.equals(f20887d)) {
                    String[] strArrSplit = string.split(":", -1);
                    HashSet hashSet = new HashSet(strArrSplit.length);
                    for (String str : strArrSplit) {
                        ComponentName componentNameUnflattenFromString = ComponentName.unflattenFromString(str);
                        if (componentNameUnflattenFromString != null) {
                            hashSet.add(componentNameUnflattenFromString.getPackageName());
                        }
                    }
                    f20888e = hashSet;
                    f20887d = string;
                }
                set = f20888e;
            } else {
                set = f20888e;
            }
        }
        return set;
    }

    /* renamed from: i */
    public static boolean m24213i(Notification notification) {
        Bundle bundleM41351a = o2c.m41351a(notification);
        return bundleM41351a != null && bundleM41351a.getBoolean("android.support.useSideChannel");
    }

    /* renamed from: a */
    public boolean m24214a() {
        return C13092a.m24220a(this.f20892b);
    }

    /* renamed from: b */
    public void m24215b(int i) {
        m24216c(null, i);
    }

    /* renamed from: c */
    public void m24216c(String str, int i) {
        this.f20892b.cancel(str, i);
    }

    /* renamed from: f */
    public void m24217f(int i, Notification notification) {
        m24218g(null, i, notification);
    }

    /* renamed from: g */
    public void m24218g(String str, int i, Notification notification) {
        if (!m24213i(notification)) {
            this.f20892b.notify(str, i, notification);
        } else {
            m24219h(new C13093b(this.f20891a.getPackageName(), i, str, notification));
            this.f20892b.cancel(str, i);
        }
    }

    /* renamed from: h */
    public final void m24219h(InterfaceC13096e interfaceC13096e) {
        synchronized (f20889f) {
            if (f20890g == null) {
                f20890g = new ServiceConnectionC13095d(this.f20891a.getApplicationContext());
            }
            f20890g.m24230h(interfaceC13096e);
        }
    }
}
