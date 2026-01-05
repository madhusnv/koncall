package com.facebook.internal;

import android.content.Context;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.webkit.WebView;
import com.facebook.internal.DialogC10789a;
import com.google.android.gms.common.internal.ImagesContract;
import org.apache.http.cookie.ClientCookie;
import org.json.JSONException;
import org.json.JSONObject;
import p001o.cri;
import p001o.hn1;
import p001o.id5;
import p001o.sq8;
import p001o.srb;

/* renamed from: com.facebook.internal.a */
/* loaded from: classes5.dex */
public final class DialogC10789a extends WebDialog {

    /* renamed from: X */
    public static final a f11495X = new a(null);

    /* renamed from: Y */
    public static final String f11496Y = DialogC10789a.class.getName();

    /* renamed from: Q */
    public boolean f11497Q;

    /* renamed from: com.facebook.internal.a$a */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(id5 id5Var) {
            this();
        }

        /* renamed from: a */
        public final DialogC10789a m13150a(Context context, String str, String str2) throws PackageManager.NameNotFoundException {
            sq8.m48649h(context, "context");
            sq8.m48649h(str, ImagesContract.URL);
            sq8.m48649h(str2, "expectedRedirectUrl");
            WebDialog.m13116s(context);
            return new DialogC10789a(context, str, str2, null);
        }
    }

    public /* synthetic */ DialogC10789a(Context context, String str, String str2, id5 id5Var) {
        this(context, str, str2);
    }

    /* renamed from: F */
    public static final void m13149F(DialogC10789a dialogC10789a) {
        sq8.m48649h(dialogC10789a, "this$0");
        super.cancel();
    }

    @Override // com.facebook.internal.WebDialog, android.app.Dialog, android.content.DialogInterface
    public void cancel() {
        WebView webViewM13123r = m13123r();
        if (!m13125u() || m13124t() || webViewM13123r == null || !webViewM13123r.isShown()) {
            super.cancel();
            return;
        }
        if (this.f11497Q) {
            return;
        }
        this.f11497Q = true;
        webViewM13123r.loadUrl("javascript:(function() {  var event = document.createEvent('Event');  event.initEvent('fbPlatformDialogMustClose',true,true);  document.dispatchEvent(event);})();");
        new Handler(Looper.getMainLooper()).postDelayed(new Runnable() { // from class: o.ks6
            @Override // java.lang.Runnable
            public final void run() {
                DialogC10789a.m13149F(this.f32662a);
            }
        }, 1500L);
    }

    @Override // com.facebook.internal.WebDialog
    /* renamed from: w */
    public Bundle mo13126w(String str) {
        Bundle bundleP0 = cri.p0(Uri.parse(str).getQuery());
        String string = bundleP0.getString("bridge_args");
        bundleP0.remove("bridge_args");
        if (!cri.d0(string)) {
            try {
                bundleP0.putBundle("com.facebook.platform.protocol.BRIDGE_ARGS", hn1.m30840a(new JSONObject(string)));
            } catch (JSONException e) {
                cri.l0(f11496Y, "Unable to parse bridge_args JSON", e);
            }
        }
        String string2 = bundleP0.getString("method_results");
        bundleP0.remove("method_results");
        if (!cri.d0(string2)) {
            try {
                bundleP0.putBundle("com.facebook.platform.protocol.RESULT_ARGS", hn1.m30840a(new JSONObject(string2)));
            } catch (JSONException e2) {
                cri.l0(f11496Y, "Unable to parse bridge_args JSON", e2);
            }
        }
        bundleP0.remove(ClientCookie.VERSION_ATTR);
        bundleP0.putInt("com.facebook.platform.protocol.PROTOCOL_VERSION", srb.m48791u());
        return bundleP0;
    }

    public DialogC10789a(Context context, String str, String str2) {
        super(context, str);
        m13118A(str2);
    }
}
