package androidx.browser.trusted;

import android.app.Notification;
import android.app.NotificationManager;
import android.app.Service;
import android.content.ComponentName;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.graphics.BitmapFactory;
import android.os.Binder;
import android.os.Build;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcelable;
import androidx.browser.trusted.AbstractC1888a;
import com.onesignal.core.internal.database.impl.OneSignalDbContract;
import java.util.Locale;
import org.apache.http.message.TokenParser;
import p001o.c2c;
import p001o.drh;
import p001o.e3c;
import p001o.ma8;
import p001o.yxh;
import p001o.z1c;

/* loaded from: classes2.dex */
public abstract class TrustedWebActivityService extends Service {

    /* renamed from: a */
    public NotificationManager f6044a;

    /* renamed from: b */
    public int f6045b = -1;

    /* renamed from: c */
    public final ma8.AbstractBinderC15260a f6046c = new BinderC1887a();

    /* renamed from: androidx.browser.trusted.TrustedWebActivityService$a */
    public class BinderC1887a extends ma8.AbstractBinderC15260a {
        public BinderC1887a() {
        }

        @Override // p001o.ma8
        /* renamed from: B */
        public Bundle mo4507B(String str, Bundle bundle, IBinder iBinder) {
            L0();
            return TrustedWebActivityService.this.m4502f(str, bundle, yxh.m58467a(iBinder));
        }

        @Override // p001o.ma8
        /* renamed from: H */
        public Bundle mo4508H() {
            L0();
            return TrustedWebActivityService.this.m4504h();
        }

        public final void L0() {
            TrustedWebActivityService trustedWebActivityService = TrustedWebActivityService.this;
            int i = trustedWebActivityService.f6045b;
            if (i != -1) {
                if (i != Binder.getCallingUid()) {
                    throw new SecurityException("Caller is not verified as Trusted Web Activity provider.");
                }
            } else {
                trustedWebActivityService.getPackageManager().getPackagesForUid(Binder.getCallingUid());
                TrustedWebActivityService.this.m4499c();
                throw null;
            }
        }

        @Override // p001o.ma8
        /* renamed from: Q */
        public Bundle mo4509Q(Bundle bundle) {
            L0();
            AbstractC1888a.d dVarM4514a = AbstractC1888a.d.m4514a(bundle);
            return new AbstractC1888a.e(TrustedWebActivityService.this.m4506j(dVarM4514a.f6052a, dVarM4514a.f6053b, dVarM4514a.f6054c, dVarM4514a.f6055d)).m4515a();
        }

        @Override // p001o.ma8
        public Bundle h0() {
            L0();
            return new AbstractC1888a.a(TrustedWebActivityService.this.m4503g()).m4511a();
        }

        @Override // p001o.ma8
        public int v0() {
            L0();
            return TrustedWebActivityService.this.m4505i();
        }

        @Override // p001o.ma8
        public Bundle w0(Bundle bundle) {
            L0();
            return new AbstractC1888a.e(TrustedWebActivityService.this.m4500d(AbstractC1888a.c.m4513a(bundle).f6051a)).m4515a();
        }

        @Override // p001o.ma8
        public void z0(Bundle bundle) {
            L0();
            AbstractC1888a.b bVarM4512a = AbstractC1888a.b.m4512a(bundle);
            TrustedWebActivityService.this.m4501e(bVarM4512a.f6049a, bVarM4512a.f6050b);
        }
    }

    /* renamed from: a */
    public static String m4497a(String str) {
        return str.toLowerCase(Locale.ROOT).replace(TokenParser.SP, '_') + "_channel_id";
    }

    /* renamed from: b */
    public final void m4498b() {
        if (this.f6044a == null) {
            throw new IllegalStateException("TrustedWebActivityService has not been properly initialized. Did onCreate() call super.onCreate()?");
        }
    }

    /* renamed from: c */
    public abstract drh m4499c();

    /* renamed from: d */
    public boolean m4500d(String str) {
        m4498b();
        if (!e3c.m24211d(this).m24214a()) {
            return false;
        }
        if (Build.VERSION.SDK_INT < 26) {
            return true;
        }
        return c2c.m20098b(this.f6044a, m4497a(str));
    }

    /* renamed from: e */
    public void m4501e(String str, int i) {
        m4498b();
        this.f6044a.cancel(str, i);
    }

    /* renamed from: f */
    public Bundle m4502f(String str, Bundle bundle, yxh yxhVar) {
        return null;
    }

    /* renamed from: g */
    public Parcelable[] m4503g() {
        m4498b();
        return z1c.m58651a(this.f6044a);
    }

    /* renamed from: h */
    public Bundle m4504h() {
        int iM4505i = m4505i();
        Bundle bundle = new Bundle();
        if (iM4505i == -1) {
            return bundle;
        }
        bundle.putParcelable("android.support.customtabs.trusted.SMALL_ICON_BITMAP", BitmapFactory.decodeResource(getResources(), iM4505i));
        return bundle;
    }

    /* renamed from: i */
    public int m4505i() {
        try {
            Bundle bundle = getPackageManager().getServiceInfo(new ComponentName(this, getClass()), 128).metaData;
            if (bundle == null) {
                return -1;
            }
            return bundle.getInt("android.support.customtabs.trusted.SMALL_ICON", -1);
        } catch (PackageManager.NameNotFoundException unused) {
            return -1;
        }
    }

    /* renamed from: j */
    public boolean m4506j(String str, int i, Notification notification, String str2) {
        m4498b();
        if (!e3c.m24211d(this).m24214a()) {
            return false;
        }
        if (Build.VERSION.SDK_INT >= 26) {
            String strM4497a = m4497a(str2);
            notification = c2c.m20097a(this, this.f6044a, notification, strM4497a, str2);
            if (!c2c.m20098b(this.f6044a, strM4497a)) {
                return false;
            }
        }
        this.f6044a.notify(str, i, notification);
        return true;
    }

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        return this.f6046c;
    }

    @Override // android.app.Service
    public void onCreate() {
        super.onCreate();
        this.f6044a = (NotificationManager) getSystemService(OneSignalDbContract.NotificationTable.TABLE_NAME);
    }

    @Override // android.app.Service
    public final boolean onUnbind(Intent intent) {
        this.f6045b = -1;
        return super.onUnbind(intent);
    }
}
