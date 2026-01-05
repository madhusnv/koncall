package androidx.browser.customtabs;

import android.app.Service;
import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import p001o.i68;
import p001o.r68;

/* loaded from: classes2.dex */
public class PostMessageService extends Service {

    /* renamed from: a */
    public r68.AbstractBinderC16545a f6042a = new BinderC1886a();

    /* renamed from: androidx.browser.customtabs.PostMessageService$a */
    public class BinderC1886a extends r68.AbstractBinderC16545a {
        public BinderC1886a() {
        }

        @Override // p001o.r68
        public void F0(i68 i68Var, Bundle bundle) {
            i68Var.H0(bundle);
        }

        @Override // p001o.r68
        /* renamed from: d */
        public void mo4496d(i68 i68Var, String str, Bundle bundle) {
            i68Var.G0(str, bundle);
        }
    }

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        return this.f6042a;
    }
}
