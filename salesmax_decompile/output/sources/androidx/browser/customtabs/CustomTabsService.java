package androidx.browser.customtabs;

import android.app.PendingIntent;
import android.app.Service;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import java.util.List;
import java.util.NoSuchElementException;
import p001o.i68;
import p001o.j68;
import p001o.ki4;
import p001o.ktf;

/* loaded from: classes2.dex */
public abstract class CustomTabsService extends Service {

    /* renamed from: a */
    public final ktf f6039a = new ktf();

    /* renamed from: b */
    public j68.AbstractBinderC14459a f6040b = new BinderC1885a();

    /* renamed from: androidx.browser.customtabs.CustomTabsService$a */
    public class BinderC1885a extends j68.AbstractBinderC14459a {
        public BinderC1885a() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void P0(ki4 ki4Var) {
            CustomTabsService.this.m4479a(ki4Var);
        }

        @Override // p001o.j68
        public boolean A0(i68 i68Var, int i, Uri uri, Bundle bundle) {
            return CustomTabsService.this.m4487i(new ki4(i68Var, O0(bundle)), i, uri, bundle);
        }

        @Override // p001o.j68
        /* renamed from: C */
        public int mo4489C(i68 i68Var, String str, Bundle bundle) {
            return CustomTabsService.this.m4483e(new ki4(i68Var, O0(bundle)), str, bundle);
        }

        @Override // p001o.j68
        /* renamed from: D */
        public boolean mo4490D(i68 i68Var, Uri uri, Bundle bundle) {
            return CustomTabsService.this.m4485g(new ki4(i68Var, O0(bundle)), uri);
        }

        @Override // p001o.j68
        /* renamed from: L */
        public boolean mo4491L(i68 i68Var) {
            return Q0(i68Var, null);
        }

        public final PendingIntent O0(Bundle bundle) {
            if (bundle == null) {
                return null;
            }
            PendingIntent pendingIntent = (PendingIntent) bundle.getParcelable("android.support.customtabs.extra.SESSION_ID");
            bundle.remove("android.support.customtabs.extra.SESSION_ID");
            return pendingIntent;
        }

        public final boolean Q0(i68 i68Var, PendingIntent pendingIntent) {
            final ki4 ki4Var = new ki4(i68Var, pendingIntent);
            try {
                IBinder.DeathRecipient deathRecipient = new IBinder.DeathRecipient() { // from class: o.hi4
                    @Override // android.os.IBinder.DeathRecipient
                    public final void binderDied() {
                        this.f27006a.P0(ki4Var);
                    }
                };
                synchronized (CustomTabsService.this.f6039a) {
                    i68Var.asBinder().linkToDeath(deathRecipient, 0);
                    CustomTabsService.this.f6039a.put(i68Var.asBinder(), deathRecipient);
                }
                return CustomTabsService.this.m4482d(ki4Var);
            } catch (RemoteException unused) {
                return false;
            }
        }

        @Override // p001o.j68
        /* renamed from: U */
        public boolean mo4492U(i68 i68Var, Uri uri, Bundle bundle, List list) {
            return CustomTabsService.this.m4481c(new ki4(i68Var, O0(bundle)), uri, bundle, list);
        }

        @Override // p001o.j68
        /* renamed from: V */
        public boolean mo4493V(i68 i68Var, Uri uri, int i, Bundle bundle) {
            return CustomTabsService.this.m4484f(new ki4(i68Var, O0(bundle)), uri, i, bundle);
        }

        @Override // p001o.j68
        public boolean k0(i68 i68Var, Bundle bundle) {
            return Q0(i68Var, O0(bundle));
        }

        @Override // p001o.j68
        public boolean l0(i68 i68Var, Bundle bundle) {
            return CustomTabsService.this.m4486h(new ki4(i68Var, O0(bundle)), bundle);
        }

        @Override // p001o.j68
        public boolean q0(long j) {
            return CustomTabsService.this.m4488j(j);
        }

        @Override // p001o.j68
        /* renamed from: s */
        public Bundle mo4494s(String str, Bundle bundle) {
            return CustomTabsService.this.m4480b(str, bundle);
        }

        @Override // p001o.j68
        /* renamed from: y */
        public boolean mo4495y(i68 i68Var, Uri uri) {
            return CustomTabsService.this.m4485g(new ki4(i68Var, null), uri);
        }
    }

    /* renamed from: a */
    public boolean m4479a(ki4 ki4Var) {
        try {
            synchronized (this.f6039a) {
                IBinder iBinderM35725a = ki4Var.m35725a();
                if (iBinderM35725a == null) {
                    return false;
                }
                iBinderM35725a.unlinkToDeath((IBinder.DeathRecipient) this.f6039a.get(iBinderM35725a), 0);
                this.f6039a.remove(iBinderM35725a);
                return true;
            }
        } catch (NoSuchElementException unused) {
            return false;
        }
    }

    /* renamed from: b */
    public abstract Bundle m4480b(String str, Bundle bundle);

    /* renamed from: c */
    public abstract boolean m4481c(ki4 ki4Var, Uri uri, Bundle bundle, List list);

    /* renamed from: d */
    public abstract boolean m4482d(ki4 ki4Var);

    /* renamed from: e */
    public abstract int m4483e(ki4 ki4Var, String str, Bundle bundle);

    /* renamed from: f */
    public abstract boolean m4484f(ki4 ki4Var, Uri uri, int i, Bundle bundle);

    /* renamed from: g */
    public abstract boolean m4485g(ki4 ki4Var, Uri uri);

    /* renamed from: h */
    public abstract boolean m4486h(ki4 ki4Var, Bundle bundle);

    /* renamed from: i */
    public abstract boolean m4487i(ki4 ki4Var, int i, Uri uri, Bundle bundle);

    /* renamed from: j */
    public abstract boolean m4488j(long j);

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        return this.f6040b;
    }
}
