package p001o;

import android.app.PendingIntent;
import android.net.Uri;
import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;

/* loaded from: classes2.dex */
public class ki4 {

    /* renamed from: a */
    public final i68 f32269a;

    /* renamed from: b */
    public final PendingIntent f32270b;

    /* renamed from: c */
    public final ei4 f32271c;

    /* renamed from: o.ki4$a */
    public class C14839a extends ei4 {
        public C14839a() {
        }

        @Override // p001o.ei4
        /* renamed from: a */
        public void mo25097a(String str, Bundle bundle) {
            try {
                ki4.this.f32269a.mo26741M(str, bundle);
            } catch (RemoteException unused) {
            }
        }

        @Override // p001o.ei4
        /* renamed from: b */
        public Bundle mo25098b(String str, Bundle bundle) {
            try {
                return ki4.this.f32269a.mo26742e(str, bundle);
            } catch (RemoteException unused) {
                return null;
            }
        }

        @Override // p001o.ei4
        /* renamed from: c */
        public void mo25099c(Bundle bundle) {
            try {
                ki4.this.f32269a.H0(bundle);
            } catch (RemoteException unused) {
            }
        }

        @Override // p001o.ei4
        /* renamed from: d */
        public void mo25100d(int i, Bundle bundle) {
            try {
                ki4.this.f32269a.C0(i, bundle);
            } catch (RemoteException unused) {
            }
        }

        @Override // p001o.ei4
        /* renamed from: e */
        public void mo25101e(String str, Bundle bundle) {
            try {
                ki4.this.f32269a.G0(str, bundle);
            } catch (RemoteException unused) {
            }
        }

        @Override // p001o.ei4
        /* renamed from: f */
        public void mo25102f(int i, Uri uri, boolean z, Bundle bundle) {
            try {
                ki4.this.f32269a.J0(i, uri, z, bundle);
            } catch (RemoteException unused) {
            }
        }
    }

    public ki4(i68 i68Var, PendingIntent pendingIntent) {
        if (i68Var == null && pendingIntent == null) {
            throw new IllegalStateException("CustomTabsSessionToken must have either a session id or a callback (or both).");
        }
        this.f32269a = i68Var;
        this.f32270b = pendingIntent;
        this.f32271c = i68Var == null ? null : new C14839a();
    }

    /* renamed from: a */
    public IBinder m35725a() {
        i68 i68Var = this.f32269a;
        if (i68Var == null) {
            return null;
        }
        return i68Var.asBinder();
    }

    /* renamed from: b */
    public final IBinder m35726b() {
        i68 i68Var = this.f32269a;
        if (i68Var != null) {
            return i68Var.asBinder();
        }
        throw new IllegalStateException("CustomTabSessionToken must have valid binder or pending session");
    }

    /* renamed from: c */
    public PendingIntent m35727c() {
        return this.f32270b;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof ki4)) {
            return false;
        }
        ki4 ki4Var = (ki4) obj;
        PendingIntent pendingIntentM35727c = ki4Var.m35727c();
        PendingIntent pendingIntent = this.f32270b;
        if ((pendingIntent == null) != (pendingIntentM35727c == null)) {
            return false;
        }
        return pendingIntent != null ? pendingIntent.equals(pendingIntentM35727c) : m35726b().equals(ki4Var.m35726b());
    }

    public int hashCode() {
        PendingIntent pendingIntent = this.f32270b;
        return pendingIntent != null ? pendingIntent.hashCode() : m35726b().hashCode();
    }
}
