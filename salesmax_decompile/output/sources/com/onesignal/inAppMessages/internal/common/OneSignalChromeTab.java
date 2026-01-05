package com.onesignal.inAppMessages.internal.common;

import android.content.ComponentName;
import android.content.Context;
import android.net.Uri;
import com.google.android.gms.common.internal.ImagesContract;
import p001o.fi4;
import p001o.gi4;
import p001o.ii4;
import p001o.ji4;
import p001o.sq8;

/* loaded from: classes6.dex */
public final class OneSignalChromeTab {
    public static final OneSignalChromeTab INSTANCE = new OneSignalChromeTab();

    public static final class OneSignalCustomTabsServiceConnection extends ii4 {
        private final Context context;
        private final boolean openActivity;
        private final String url;

        public OneSignalCustomTabsServiceConnection(String str, boolean z, Context context) {
            sq8.m48649h(str, ImagesContract.URL);
            sq8.m48649h(context, "context");
            this.url = str;
            this.openActivity = z;
            this.context = context;
        }

        @Override // p001o.ii4
        public void onCustomTabsServiceConnected(ComponentName componentName, fi4 fi4Var) {
            sq8.m48649h(componentName, "componentName");
            sq8.m48649h(fi4Var, "customTabsClient");
            fi4Var.m26740h(0L);
            ji4 ji4VarM26738f = fi4Var.m26738f(null);
            if (ji4VarM26738f == null) {
                return;
            }
            Uri uri = Uri.parse(this.url);
            ji4VarM26738f.m33859f(uri, null, null);
            if (this.openActivity) {
                gi4 gi4VarM28790a = new gi4.C13739a(ji4VarM26738f).m28790a();
                sq8.m48648g(gi4VarM28790a, "mBuilder.build()");
                gi4VarM28790a.f25267a.setData(uri);
                gi4VarM28790a.f25267a.addFlags(268435456);
                this.context.startActivity(gi4VarM28790a.f25267a, gi4VarM28790a.f25268b);
            }
        }

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(ComponentName componentName) {
            sq8.m48649h(componentName, "name");
        }
    }

    private OneSignalChromeTab() {
    }

    private final boolean hasChromeTabLibrary() {
        return true;
    }

    public final boolean open$com_onesignal_inAppMessages(String str, boolean z, Context context) {
        sq8.m48649h(str, ImagesContract.URL);
        sq8.m48649h(context, "context");
        if (hasChromeTabLibrary()) {
            return fi4.m26733a(context, "com.android.chrome", new OneSignalCustomTabsServiceConnection(str, z, context));
        }
        return false;
    }
}
