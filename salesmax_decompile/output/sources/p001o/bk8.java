package p001o;

import android.os.RemoteException;
import com.android.installreferrer.api.InstallReferrerClient;
import com.android.installreferrer.api.InstallReferrerStateListener;
import com.android.installreferrer.api.ReferrerDetails;
import com.facebook.C10773c;

/* loaded from: classes5.dex */
public final class bk8 {

    /* renamed from: a */
    public static final bk8 f16458a = new bk8();

    /* renamed from: o.bk8$a */
    public interface InterfaceC12449a {
        /* renamed from: a */
        void mo19295a(String str);
    }

    /* renamed from: o.bk8$b */
    public static final class C12450b implements InstallReferrerStateListener {

        /* renamed from: a */
        public final /* synthetic */ InstallReferrerClient f16459a;

        /* renamed from: b */
        public final /* synthetic */ InterfaceC12449a f16460b;

        public C12450b(InstallReferrerClient installReferrerClient, InterfaceC12449a interfaceC12449a) {
            this.f16459a = installReferrerClient;
            this.f16460b = interfaceC12449a;
        }

        @Override // com.android.installreferrer.api.InstallReferrerStateListener
        /* renamed from: a */
        public void mo12626a(int i) {
            if (a94.m16694d(this)) {
                return;
            }
            try {
                if (i == 0) {
                    try {
                        ReferrerDetails referrerDetailsMo12623b = this.f16459a.mo12623b();
                        sq8.m48648g(referrerDetailsMo12623b, "{\n                      …rer\n                    }");
                        String strM12628a = referrerDetailsMo12623b.m12628a();
                        if (strM12628a != null && (f9g.m26306P(strM12628a, "fb", false, 2, null) || f9g.m26306P(strM12628a, "facebook", false, 2, null))) {
                            this.f16460b.mo19295a(strM12628a);
                        }
                        bk8.f16458a.m19294e();
                    } catch (RemoteException unused) {
                        return;
                    }
                } else if (i == 2) {
                    bk8.f16458a.m19294e();
                }
                try {
                    this.f16459a.mo12622a();
                } catch (Exception unused2) {
                }
            } catch (Throwable th) {
                a94.m16692b(th, this);
            }
        }

        @Override // com.android.installreferrer.api.InstallReferrerStateListener
        /* renamed from: b */
        public void mo12627b() {
        }
    }

    /* renamed from: d */
    public static final void m19291d(InterfaceC12449a interfaceC12449a) {
        sq8.m48649h(interfaceC12449a, "callback");
        bk8 bk8Var = f16458a;
        if (bk8Var.m19292b()) {
            return;
        }
        bk8Var.m19293c(interfaceC12449a);
    }

    /* renamed from: b */
    public final boolean m19292b() {
        return C10773c.m13019l().getSharedPreferences("com.facebook.sdk.appEventPreferences", 0).getBoolean("is_referrer_updated", false);
    }

    /* renamed from: c */
    public final void m19293c(InterfaceC12449a interfaceC12449a) {
        InstallReferrerClient installReferrerClientM12625a = InstallReferrerClient.m12621c(C10773c.m13019l()).m12625a();
        try {
            installReferrerClientM12625a.mo12624d(new C12450b(installReferrerClientM12625a, interfaceC12449a));
        } catch (Exception unused) {
        }
    }

    /* renamed from: e */
    public final void m19294e() {
        C10773c.m13019l().getSharedPreferences("com.facebook.sdk.appEventPreferences", 0).edit().putBoolean("is_referrer_updated", true).apply();
    }
}
