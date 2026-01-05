package jf;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import android.os.SystemClock;
import com.google.android.gms.common.GooglePlayServicesNotAvailableException;
import hg.AbstractBinderC2922c;
import hg.AbstractC2920a;
import hg.C2921b;
import hg.InterfaceC2923d;
import java.io.IOException;
import java.util.HashMap;
import java.util.concurrent.TimeUnit;
import pf.C5906f;
import pf.ServiceConnectionC5901a;
import sf.AbstractC6840z;
import yf.C8643a;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: jf.b */
/* loaded from: classes.dex */
public final class C3759b {

    /* renamed from: a */
    public ServiceConnectionC5901a f19628a;

    /* renamed from: b */
    public InterfaceC2923d f19629b;

    /* renamed from: c */
    public boolean f19630c;

    /* renamed from: d */
    public final Object f19631d = new Object();

    /* renamed from: e */
    public C3761d f19632e;

    /* renamed from: f */
    public final Context f19633f;

    /* renamed from: g */
    public final long f19634g;

    public C3759b(Context context) {
        AbstractC6840z.m13036g(context);
        Context applicationContext = context.getApplicationContext();
        this.f19633f = applicationContext != null ? applicationContext : context;
        this.f19630c = false;
        this.f19634g = -1L;
    }

    /* renamed from: a */
    public static C3758a m8280a(Context context) {
        C3759b c3759b = new C3759b(context);
        try {
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            c3759b.m8283c();
            C3758a c3758aM8284e = c3759b.m8284e();
            m8281d(c3758aM8284e, SystemClock.elapsedRealtime() - jElapsedRealtime, null);
            return c3758aM8284e;
        } finally {
        }
    }

    /* renamed from: d */
    public static void m8281d(C3758a c3758a, long j6, Throwable th2) {
        if (Math.random() <= 0.0d) {
            HashMap map = new HashMap();
            map.put("app_context", "1");
            if (c3758a != null) {
                map.put("limit_ad_tracking", true != c3758a.f19627c ? "0" : "1");
                String str = c3758a.f19626b;
                if (str != null) {
                    map.put("ad_id_size", Integer.toString(str.length()));
                }
            }
            if (th2 != null) {
                map.put("error", th2.getClass().getName());
            }
            map.put("tag", "AdvertisingIdClient");
            map.put("time_spent", Long.toString(j6));
            new C3760c(map).start();
        }
    }

    /* renamed from: b */
    public final void m8282b() {
        AbstractC6840z.m13035f("Calling this from your main thread can lead to deadlock");
        synchronized (this) {
            try {
                if (this.f19633f == null || this.f19628a == null) {
                    return;
                }
                try {
                    if (this.f19630c) {
                        C8643a.m15964b().m15966c(this.f19633f, this.f19628a);
                    }
                } catch (Throwable unused) {
                }
                this.f19630c = false;
                this.f19629b = null;
                this.f19628a = null;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* renamed from: c */
    public final void m8283c() {
        AbstractC6840z.m13035f("Calling this from your main thread can lead to deadlock");
        synchronized (this) {
            try {
                if (this.f19630c) {
                    m8282b();
                }
                Context context = this.f19633f;
                try {
                    context.getPackageManager().getPackageInfo("com.android.vending", 0);
                    int iM11516c = C5906f.f28748b.m11516c(context, 12451000);
                    if (iM11516c != 0 && iM11516c != 2) {
                        throw new IOException("Google Play services not available");
                    }
                    ServiceConnectionC5901a serviceConnectionC5901a = new ServiceConnectionC5901a();
                    Intent intent = new Intent("com.google.android.gms.ads.identifier.service.START");
                    intent.setPackage("com.google.android.gms");
                    try {
                        if (!C8643a.m15964b().m15965a(context, intent, serviceConnectionC5901a, 1)) {
                            throw new IOException("Connection failure");
                        }
                        this.f19628a = serviceConnectionC5901a;
                        try {
                            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
                            IBinder iBinderM11506a = serviceConnectionC5901a.m11506a();
                            int i10 = AbstractBinderC2922c.f15954e;
                            IInterface iInterfaceQueryLocalInterface = iBinderM11506a.queryLocalInterface("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
                            this.f19629b = iInterfaceQueryLocalInterface instanceof InterfaceC2923d ? (InterfaceC2923d) iInterfaceQueryLocalInterface : new C2921b(iBinderM11506a);
                            this.f19630c = true;
                        } catch (InterruptedException unused) {
                            throw new IOException("Interrupted exception");
                        } catch (Throwable th2) {
                            throw new IOException(th2);
                        }
                    } finally {
                        IOException iOException = new IOException(th2);
                    }
                } catch (PackageManager.NameNotFoundException unused2) {
                    throw new GooglePlayServicesNotAvailableException();
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    /* renamed from: e */
    public final C3758a m8284e() {
        C3758a c3758a;
        AbstractC6840z.m13035f("Calling this from your main thread can lead to deadlock");
        synchronized (this) {
            try {
                if (!this.f19630c) {
                    synchronized (this.f19631d) {
                        C3761d c3761d = this.f19632e;
                        if (c3761d == null || !c3761d.f19639d) {
                            throw new IOException("AdvertisingIdClient is not connected.");
                        }
                    }
                    try {
                        m8283c();
                        if (!this.f19630c) {
                            throw new IOException("AdvertisingIdClient cannot reconnect.");
                        }
                    } catch (Exception e2) {
                        throw new IOException("AdvertisingIdClient cannot reconnect.", e2);
                    }
                }
                AbstractC6840z.m13036g(this.f19628a);
                AbstractC6840z.m13036g(this.f19629b);
                try {
                    C2921b c2921b = (C2921b) this.f19629b;
                    c2921b.getClass();
                    Parcel parcelObtain = Parcel.obtain();
                    parcelObtain.writeInterfaceToken("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
                    boolean z6 = true;
                    Parcel parcelM7027d = c2921b.m7027d(parcelObtain, 1);
                    String string = parcelM7027d.readString();
                    parcelM7027d.recycle();
                    C2921b c2921b2 = (C2921b) this.f19629b;
                    c2921b2.getClass();
                    Parcel parcelObtain2 = Parcel.obtain();
                    parcelObtain2.writeInterfaceToken("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
                    int i10 = AbstractC2920a.f15952a;
                    parcelObtain2.writeInt(1);
                    Parcel parcelM7027d2 = c2921b2.m7027d(parcelObtain2, 2);
                    if (parcelM7027d2.readInt() == 0) {
                        z6 = false;
                    }
                    parcelM7027d2.recycle();
                    c3758a = new C3758a(string, z6, 0);
                } catch (RemoteException unused) {
                    throw new IOException("Remote exception");
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        synchronized (this.f19631d) {
            C3761d c3761d2 = this.f19632e;
            if (c3761d2 != null) {
                c3761d2.f19638c.countDown();
                try {
                    this.f19632e.join();
                } catch (InterruptedException unused2) {
                }
            }
            long j6 = this.f19634g;
            if (j6 > 0) {
                this.f19632e = new C3761d(this, j6);
            }
        }
        return c3758a;
    }

    public final void finalize() throws Throwable {
        m8282b();
        super.finalize();
    }
}
