package q5;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.os.DeadObjectException;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Message;
import android.os.RemoteException;
import android.provider.Settings;
import android.util.Log;
import com.sun.mail.imap.IMAPStore;
import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import p002c.AbstractBinderC0806b;
import p002c.C0805a;
import p002c.InterfaceC0807c;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: q5.o */
/* loaded from: classes.dex */
public final class ServiceConnectionC6122o implements Handler.Callback, ServiceConnection {

    /* renamed from: a */
    public final Context f29864a;

    /* renamed from: b */
    public final Handler f29865b;

    /* renamed from: c */
    public final HashMap f29866c = new HashMap();

    /* renamed from: d */
    public HashSet f29867d = new HashSet();

    public ServiceConnectionC6122o(Context context) {
        this.f29864a = context;
        HandlerThread handlerThread = new HandlerThread("NotificationManagerCompat");
        handlerThread.start();
        this.f29865b = new Handler(handlerThread.getLooper(), this);
    }

    /* renamed from: a */
    public final void m12156a(C6121n c6121n) {
        boolean z6;
        ArrayDeque arrayDeque = c6121n.f29862d;
        ComponentName componentName = c6121n.f29859a;
        if (Log.isLoggable("NotifManCompat", 3)) {
            Objects.toString(componentName);
            arrayDeque.size();
        }
        if (arrayDeque.isEmpty()) {
            return;
        }
        if (c6121n.f29860b) {
            z6 = true;
        } else {
            Intent component = new Intent("android.support.BIND_NOTIFICATION_SIDE_CHANNEL").setComponent(componentName);
            Context context = this.f29864a;
            boolean zBindService = context.bindService(component, this, 33);
            c6121n.f29860b = zBindService;
            if (zBindService) {
                c6121n.f29863e = 0;
            } else {
                Objects.toString(componentName);
                context.unbindService(this);
            }
            z6 = c6121n.f29860b;
        }
        if (!z6 || c6121n.f29861c == null) {
            m12157b(c6121n);
            return;
        }
        while (true) {
            C6119l c6119l = (C6119l) arrayDeque.peek();
            if (c6119l == null) {
                break;
            }
            try {
                if (Log.isLoggable("NotifManCompat", 3)) {
                    c6119l.toString();
                }
                c6119l.m12155a(c6121n.f29861c);
                arrayDeque.remove();
            } catch (DeadObjectException unused) {
                if (Log.isLoggable("NotifManCompat", 3)) {
                    Objects.toString(componentName);
                }
            } catch (RemoteException unused2) {
                Objects.toString(componentName);
            }
        }
        if (arrayDeque.isEmpty()) {
            return;
        }
        m12157b(c6121n);
    }

    /* renamed from: b */
    public final void m12157b(C6121n c6121n) {
        ComponentName componentName = c6121n.f29859a;
        ArrayDeque arrayDeque = c6121n.f29862d;
        Handler handler = this.f29865b;
        if (handler.hasMessages(3, componentName)) {
            return;
        }
        int i10 = c6121n.f29863e;
        int i11 = i10 + 1;
        c6121n.f29863e = i11;
        if (i11 > 6) {
            arrayDeque.size();
            Objects.toString(componentName);
            arrayDeque.clear();
        } else {
            int i12 = (1 << i10) * IMAPStore.RESPONSE;
            Log.isLoggable("NotifManCompat", 3);
            handler.sendMessageDelayed(handler.obtainMessage(3, componentName), i12);
        }
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        HashSet hashSet;
        int i10 = message.what;
        InterfaceC0807c interfaceC0807c = null;
        if (i10 == 0) {
            C6119l c6119l = (C6119l) message.obj;
            String string = Settings.Secure.getString(this.f29864a.getContentResolver(), "enabled_notification_listeners");
            synchronized (C6123p.f29868b) {
                if (string != null) {
                    try {
                        if (!string.equals(C6123p.f29869c)) {
                            String[] strArrSplit = string.split(":", -1);
                            HashSet hashSet2 = new HashSet(strArrSplit.length);
                            for (String str : strArrSplit) {
                                ComponentName componentNameUnflattenFromString = ComponentName.unflattenFromString(str);
                                if (componentNameUnflattenFromString != null) {
                                    hashSet2.add(componentNameUnflattenFromString.getPackageName());
                                }
                            }
                            C6123p.f29870d = hashSet2;
                            C6123p.f29869c = string;
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                hashSet = C6123p.f29870d;
            }
            if (!hashSet.equals(this.f29867d)) {
                this.f29867d = hashSet;
                List<ResolveInfo> listQueryIntentServices = this.f29864a.getPackageManager().queryIntentServices(new Intent().setAction("android.support.BIND_NOTIFICATION_SIDE_CHANNEL"), 0);
                HashSet hashSet3 = new HashSet();
                for (ResolveInfo resolveInfo : listQueryIntentServices) {
                    if (hashSet.contains(resolveInfo.serviceInfo.packageName)) {
                        ServiceInfo serviceInfo = resolveInfo.serviceInfo;
                        ComponentName componentName = new ComponentName(serviceInfo.packageName, serviceInfo.name);
                        if (resolveInfo.serviceInfo.permission != null) {
                            componentName.toString();
                        } else {
                            hashSet3.add(componentName);
                        }
                    }
                }
                Iterator it = hashSet3.iterator();
                while (it.hasNext()) {
                    ComponentName componentName2 = (ComponentName) it.next();
                    if (!this.f29866c.containsKey(componentName2)) {
                        if (Log.isLoggable("NotifManCompat", 3)) {
                            Objects.toString(componentName2);
                        }
                        this.f29866c.put(componentName2, new C6121n(componentName2));
                    }
                }
                Iterator it2 = this.f29866c.entrySet().iterator();
                while (it2.hasNext()) {
                    Map.Entry entry = (Map.Entry) it2.next();
                    if (!hashSet3.contains(entry.getKey())) {
                        if (Log.isLoggable("NotifManCompat", 3)) {
                            Objects.toString(entry.getKey());
                        }
                        C6121n c6121n = (C6121n) entry.getValue();
                        if (c6121n.f29860b) {
                            this.f29864a.unbindService(this);
                            c6121n.f29860b = false;
                        }
                        c6121n.f29861c = null;
                        it2.remove();
                    }
                }
            }
            for (C6121n c6121n2 : this.f29866c.values()) {
                c6121n2.f29862d.add(c6119l);
                m12156a(c6121n2);
            }
        } else if (i10 == 1) {
            C6120m c6120m = (C6120m) message.obj;
            ComponentName componentName3 = c6120m.f29857a;
            IBinder iBinder = c6120m.f29858b;
            C6121n c6121n3 = (C6121n) this.f29866c.get(componentName3);
            if (c6121n3 != null) {
                int i11 = AbstractBinderC0806b.f5029e;
                if (iBinder != null) {
                    IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface(InterfaceC0807c.f5030a);
                    if (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof InterfaceC0807c)) {
                        C0805a c0805a = new C0805a();
                        c0805a.f5028e = iBinder;
                        interfaceC0807c = c0805a;
                    } else {
                        interfaceC0807c = (InterfaceC0807c) iInterfaceQueryLocalInterface;
                    }
                }
                c6121n3.f29861c = interfaceC0807c;
                c6121n3.f29863e = 0;
                m12156a(c6121n3);
                return true;
            }
        } else if (i10 == 2) {
            C6121n c6121n4 = (C6121n) this.f29866c.get((ComponentName) message.obj);
            if (c6121n4 != null) {
                if (c6121n4.f29860b) {
                    this.f29864a.unbindService(this);
                    c6121n4.f29860b = false;
                }
                c6121n4.f29861c = null;
                return true;
            }
        } else {
            if (i10 != 3) {
                return false;
            }
            C6121n c6121n5 = (C6121n) this.f29866c.get((ComponentName) message.obj);
            if (c6121n5 != null) {
                m12156a(c6121n5);
                return true;
            }
        }
        return true;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        if (Log.isLoggable("NotifManCompat", 3)) {
            Objects.toString(componentName);
        }
        this.f29865b.obtainMessage(1, new C6120m(componentName, iBinder)).sendToTarget();
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        if (Log.isLoggable("NotifManCompat", 3)) {
            Objects.toString(componentName);
        }
        this.f29865b.obtainMessage(2, componentName).sendToTarget();
    }
}
