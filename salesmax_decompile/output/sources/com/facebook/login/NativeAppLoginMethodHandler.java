package com.facebook.login;

import android.content.Intent;
import android.os.Bundle;
import android.os.Parcel;
import androidx.fragment.app.Fragment;
import com.facebook.C10773c;
import com.facebook.FacebookRequestError;
import com.facebook.login.LoginClient;
import com.facebook.login.LoginMethodHandler;
import com.facebook.login.NativeAppLoginMethodHandler;
import com.google.firebase.messaging.Constants;
import p001o.cgf;
import p001o.cri;
import p001o.is6;
import p001o.kh3;
import p001o.sq8;
import p001o.ur6;
import p001o.ws;
import p001o.y3i;
import p001o.za;

/* loaded from: classes5.dex */
public abstract class NativeAppLoginMethodHandler extends LoginMethodHandler {

    /* renamed from: d */
    public final za f11617d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NativeAppLoginMethodHandler(LoginClient loginClient) {
        super(loginClient);
        sq8.m48649h(loginClient, "loginClient");
        this.f11617d = za.FACEBOOK_APPLICATION_WEB;
    }

    /* renamed from: z */
    public static final void m13322z(NativeAppLoginMethodHandler nativeAppLoginMethodHandler, LoginClient.Request request, Bundle bundle) throws NumberFormatException {
        sq8.m48649h(nativeAppLoginMethodHandler, "this$0");
        sq8.m48649h(request, "$request");
        sq8.m48649h(bundle, "$extras");
        try {
            nativeAppLoginMethodHandler.m13329w(request, nativeAppLoginMethodHandler.m13314k(request, bundle));
        } catch (is6 e) {
            FacebookRequestError facebookRequestErrorM32672c = e.m32672c();
            nativeAppLoginMethodHandler.m13328v(request, facebookRequestErrorM32672c.m12822d(), facebookRequestErrorM32672c.m12821c(), String.valueOf(facebookRequestErrorM32672c.m12820b()));
        } catch (ur6 e2) {
            nativeAppLoginMethodHandler.m13328v(request, null, e2.getMessage(), null);
        }
    }

    /* renamed from: A */
    public boolean m13323A(Intent intent, int i) {
        ws wsVarK0;
        if (intent == null || !m13330x(intent)) {
            return false;
        }
        Fragment fragmentM13248k = m13310d().m13248k();
        y3i y3iVar = null;
        LoginFragment loginFragment = fragmentM13248k instanceof LoginFragment ? (LoginFragment) fragmentM13248k : null;
        if (loginFragment != null && (wsVarK0 = loginFragment.K0()) != null) {
            wsVarK0.m54945b(intent);
            y3iVar = y3i.f54824a;
        }
        return y3iVar != null;
    }

    @Override // com.facebook.login.LoginMethodHandler
    /* renamed from: j */
    public boolean mo13186j(int i, int i2, Intent intent) throws NumberFormatException {
        LoginClient.Request requestM13252o = m13310d().m13252o();
        if (intent == null) {
            m13324q(LoginClient.Result.f11596q.m13296a(requestM13252o, "Operation canceled"));
        } else if (i2 == 0) {
            m13327u(requestM13252o, intent);
        } else if (i2 != -1) {
            m13324q(LoginClient.Result.C10812c.m13295d(LoginClient.Result.f11596q, requestM13252o, "Unexpected resultCode from authorization.", null, null, 8, null));
        } else {
            Bundle extras = intent.getExtras();
            if (extras == null) {
                m13324q(LoginClient.Result.C10812c.m13295d(LoginClient.Result.f11596q, requestM13252o, "Unexpected null from returned authorization data.", null, null, 8, null));
                return true;
            }
            String strM13325r = m13325r(extras);
            Object obj = extras.get("error_code");
            String string = obj != null ? obj.toString() : null;
            String strM13326s = m13326s(extras);
            String string2 = extras.getString("e2e");
            if (!cri.d0(string2)) {
                m13312h(string2);
            }
            if (strM13325r == null && string == null && strM13326s == null && requestM13252o != null) {
                m13331y(requestM13252o, extras);
            } else {
                m13328v(requestM13252o, strM13325r, strM13326s, string);
            }
        }
        return true;
    }

    /* renamed from: q */
    public final void m13324q(LoginClient.Result result) {
        if (result != null) {
            m13310d().m13244g(result);
        } else {
            m13310d().m13236A();
        }
    }

    /* renamed from: r */
    public String m13325r(Bundle bundle) {
        String string;
        if (bundle != null && (string = bundle.getString(Constants.IPC_BUNDLE_KEY_SEND_ERROR)) != null) {
            return string;
        }
        if (bundle != null) {
            return bundle.getString("error_type");
        }
        return null;
    }

    /* renamed from: s */
    public String m13326s(Bundle bundle) {
        String string;
        if (bundle != null && (string = bundle.getString("error_message")) != null) {
            return string;
        }
        if (bundle != null) {
            return bundle.getString("error_description");
        }
        return null;
    }

    /* renamed from: t */
    public za mo13230t() {
        return this.f11617d;
    }

    /* renamed from: u */
    public void m13327u(LoginClient.Request request, Intent intent) {
        Object obj;
        sq8.m48649h(intent, Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
        Bundle extras = intent.getExtras();
        String strM13325r = m13325r(extras);
        String string = (extras == null || (obj = extras.get("error_code")) == null) ? null : obj.toString();
        if (sq8.m48644c(cgf.m21202c(), string)) {
            m13324q(LoginClient.Result.f11596q.m13298c(request, strM13325r, m13326s(extras), string));
        } else {
            m13324q(LoginClient.Result.f11596q.m13296a(request, strM13325r));
        }
    }

    /* renamed from: v */
    public void m13328v(LoginClient.Request request, String str, String str2, String str3) {
        if (str != null && sq8.m48644c(str, "logged_out")) {
            CustomTabLoginMethodHandler.f11519y = true;
            m13324q(null);
        } else if (kh3.m35708X(cgf.m21203d(), str)) {
            m13324q(null);
        } else if (kh3.m35708X(cgf.m21204e(), str)) {
            m13324q(LoginClient.Result.f11596q.m13296a(request, null));
        } else {
            m13324q(LoginClient.Result.f11596q.m13298c(request, str, str2, str3));
        }
    }

    /* renamed from: w */
    public void m13329w(LoginClient.Request request, Bundle bundle) throws NumberFormatException {
        sq8.m48649h(request, "request");
        sq8.m48649h(bundle, "extras");
        try {
            LoginMethodHandler.C10820a c10820a = LoginMethodHandler.f11614c;
            m13324q(LoginClient.Result.f11596q.m13297b(request, c10820a.m13317b(request.m13278n(), bundle, mo13230t(), request.m13265a()), c10820a.m13319d(bundle, request.m13277m())));
        } catch (ur6 e) {
            m13324q(LoginClient.Result.C10812c.m13295d(LoginClient.Result.f11596q, request, null, e.getMessage(), null, 8, null));
        }
    }

    /* renamed from: x */
    public final boolean m13330x(Intent intent) {
        sq8.m48648g(C10773c.m13019l().getPackageManager().queryIntentActivities(intent, 65536), "getApplicationContext()\n…nager.MATCH_DEFAULT_ONLY)");
        return !r3.isEmpty();
    }

    /* renamed from: y */
    public final void m13331y(final LoginClient.Request request, final Bundle bundle) throws NumberFormatException {
        if (!bundle.containsKey("code") || cri.d0(bundle.getString("code"))) {
            m13329w(request, bundle);
        } else {
            C10773c.m13028u().execute(new Runnable() { // from class: o.qrb
                @Override // java.lang.Runnable
                public final void run() throws NumberFormatException {
                    NativeAppLoginMethodHandler.m13322z(this.f42338a, request, bundle);
                }
            });
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NativeAppLoginMethodHandler(Parcel parcel) {
        super(parcel);
        sq8.m48649h(parcel, "source");
        this.f11617d = za.FACEBOOK_APPLICATION_WEB;
    }
}
