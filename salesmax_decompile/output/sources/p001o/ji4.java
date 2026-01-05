package p001o;

import android.app.PendingIntent;
import android.content.ComponentName;
import android.net.Uri;
import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import java.util.List;

/* loaded from: classes2.dex */
public final class ji4 {

    /* renamed from: a */
    public final Object f30474a = new Object();

    /* renamed from: b */
    public final j68 f30475b;

    /* renamed from: c */
    public final i68 f30476c;

    /* renamed from: d */
    public final ComponentName f30477d;

    /* renamed from: e */
    public final PendingIntent f30478e;

    public ji4(j68 j68Var, i68 i68Var, ComponentName componentName, PendingIntent pendingIntent) {
        this.f30475b = j68Var;
        this.f30476c = i68Var;
        this.f30477d = componentName;
        this.f30478e = pendingIntent;
    }

    /* renamed from: a */
    public final void m33854a(Bundle bundle) {
        PendingIntent pendingIntent = this.f30478e;
        if (pendingIntent != null) {
            bundle.putParcelable("android.support.customtabs.extra.SESSION_ID", pendingIntent);
        }
    }

    /* renamed from: b */
    public final Bundle m33855b(Bundle bundle) {
        Bundle bundle2 = new Bundle();
        if (bundle != null) {
            bundle2.putAll(bundle);
        }
        m33854a(bundle2);
        return bundle2;
    }

    /* renamed from: c */
    public IBinder m33856c() {
        return this.f30476c.asBinder();
    }

    /* renamed from: d */
    public ComponentName m33857d() {
        return this.f30477d;
    }

    /* renamed from: e */
    public PendingIntent m33858e() {
        return this.f30478e;
    }

    /* renamed from: f */
    public boolean m33859f(Uri uri, Bundle bundle, List list) {
        try {
            return this.f30475b.mo4492U(this.f30476c, uri, m33855b(bundle), list);
        } catch (RemoteException unused) {
            return false;
        }
    }
}
