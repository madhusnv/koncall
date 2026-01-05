package p001o;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import com.facebook.C10773c;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import p001o.s68;

/* loaded from: classes5.dex */
public final class kie {

    /* renamed from: a */
    public static final kie f32282a = new kie();

    /* renamed from: b */
    public static final String f32283b = kie.class.getSimpleName();

    /* renamed from: c */
    public static Boolean f32284c;

    /* renamed from: o.kie$a */
    public enum EnumC14841a {
        MOBILE_APP_INSTALL("MOBILE_APP_INSTALL"),
        CUSTOM_APP_EVENTS("CUSTOM_APP_EVENTS");

        private final String eventType;

        EnumC14841a(String str) {
            this.eventType = str;
        }

        @Override // java.lang.Enum
        public String toString() {
            return this.eventType;
        }
    }

    /* renamed from: o.kie$b */
    public static final class ServiceConnectionC14842b implements ServiceConnection {

        /* renamed from: a */
        public final CountDownLatch f32285a = new CountDownLatch(1);

        /* renamed from: b */
        public IBinder f32286b;

        /* renamed from: a */
        public final IBinder m35752a() throws InterruptedException {
            this.f32285a.await(5L, TimeUnit.SECONDS);
            return this.f32286b;
        }

        @Override // android.content.ServiceConnection
        public void onNullBinding(ComponentName componentName) {
            sq8.m48649h(componentName, "name");
            this.f32285a.countDown();
        }

        @Override // android.content.ServiceConnection
        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            sq8.m48649h(componentName, "name");
            sq8.m48649h(iBinder, "serviceBinder");
            this.f32286b = iBinder;
            this.f32285a.countDown();
        }

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(ComponentName componentName) {
            sq8.m48649h(componentName, "name");
        }
    }

    /* renamed from: o.kie$c */
    public enum EnumC14843c {
        OPERATION_SUCCESS,
        SERVICE_NOT_AVAILABLE,
        SERVICE_ERROR
    }

    /* renamed from: b */
    public static final boolean m35747b() {
        if (a94.m16694d(kie.class)) {
            return false;
        }
        try {
            if (f32284c == null) {
                f32284c = Boolean.valueOf(f32282a.m35750a(C10773c.m13019l()) != null);
            }
            Boolean bool = f32284c;
            if (bool != null) {
                return bool.booleanValue();
            }
            return false;
        } catch (Throwable th) {
            a94.m16692b(th, kie.class);
            return false;
        }
    }

    /* renamed from: c */
    public static final EnumC14843c m35748c(String str, List list) {
        if (a94.m16694d(kie.class)) {
            return null;
        }
        try {
            sq8.m48649h(str, "applicationId");
            sq8.m48649h(list, "appEvents");
            return f32282a.m35751d(EnumC14841a.CUSTOM_APP_EVENTS, str, list);
        } catch (Throwable th) {
            a94.m16692b(th, kie.class);
            return null;
        }
    }

    /* renamed from: e */
    public static final EnumC14843c m35749e(String str) {
        if (a94.m16694d(kie.class)) {
            return null;
        }
        try {
            sq8.m48649h(str, "applicationId");
            return f32282a.m35751d(EnumC14841a.MOBILE_APP_INSTALL, str, ch3.m21246k());
        } catch (Throwable th) {
            a94.m16692b(th, kie.class);
            return null;
        }
    }

    /* renamed from: a */
    public final Intent m35750a(Context context) {
        if (a94.m16694d(this)) {
            return null;
        }
        try {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager != null) {
                Intent intent = new Intent("ReceiverService");
                intent.setPackage("com.facebook.katana");
                if (packageManager.resolveService(intent, 0) != null && js6.m34454a(context, "com.facebook.katana")) {
                    return intent;
                }
                Intent intent2 = new Intent("ReceiverService");
                intent2.setPackage("com.facebook.wakizashi");
                if (packageManager.resolveService(intent2, 0) != null) {
                    if (js6.m34454a(context, "com.facebook.wakizashi")) {
                        return intent2;
                    }
                }
            }
            return null;
        } catch (Throwable th) {
            a94.m16692b(th, this);
            return null;
        }
    }

    /* renamed from: d */
    public final EnumC14843c m35751d(EnumC14841a enumC14841a, String str, List list) {
        EnumC14843c enumC14843c;
        String str2;
        if (a94.m16694d(this)) {
            return null;
        }
        try {
            EnumC14843c enumC14843c2 = EnumC14843c.SERVICE_NOT_AVAILABLE;
            gl0.m28968b();
            Context contextM13019l = C10773c.m13019l();
            Intent intentM35750a = m35750a(contextM13019l);
            if (intentM35750a == null) {
                return enumC14843c2;
            }
            ServiceConnectionC14842b serviceConnectionC14842b = new ServiceConnectionC14842b();
            try {
                if (!contextM13019l.bindService(intentM35750a, serviceConnectionC14842b, 1)) {
                    return EnumC14843c.SERVICE_ERROR;
                }
                try {
                    try {
                        IBinder iBinderM35752a = serviceConnectionC14842b.m35752a();
                        if (iBinderM35752a != null) {
                            s68 s68VarL0 = s68.AbstractBinderC16758a.L0(iBinderM35752a);
                            Bundle bundleM33867a = jie.m33867a(enumC14841a, str, list);
                            if (bundleM33867a != null) {
                                s68VarL0.mo47905a(bundleM33867a);
                                cri.k0(f32283b, "Successfully sent events to the remote service: " + bundleM33867a);
                            }
                            enumC14843c2 = EnumC14843c.OPERATION_SUCCESS;
                        }
                        return enumC14843c2;
                    } catch (RemoteException e) {
                        enumC14843c = EnumC14843c.SERVICE_ERROR;
                        str2 = f32283b;
                        cri.j0(str2, e);
                        contextM13019l.unbindService(serviceConnectionC14842b);
                        cri.k0(str2, "Unbound from the remote service");
                        return enumC14843c;
                    }
                } catch (InterruptedException e2) {
                    enumC14843c = EnumC14843c.SERVICE_ERROR;
                    str2 = f32283b;
                    cri.j0(str2, e2);
                    contextM13019l.unbindService(serviceConnectionC14842b);
                    cri.k0(str2, "Unbound from the remote service");
                    return enumC14843c;
                }
            } finally {
                contextM13019l.unbindService(serviceConnectionC14842b);
                cri.k0(f32283b, "Unbound from the remote service");
            }
        } catch (Throwable th) {
            a94.m16692b(th, this);
            return null;
        }
    }
}
