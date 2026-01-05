package com.facebook.login;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.facebook.C10773c;
import com.facebook.login.GetTokenLoginMethodHandler;
import com.facebook.login.LoginClient;
import com.facebook.login.LoginMethodHandler;
import com.google.android.gms.common.Scopes;
import com.onesignal.session.internal.outcomes.impl.OutcomeConstants;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import org.json.JSONException;
import org.json.JSONObject;
import p001o.ch3;
import p001o.cri;
import p001o.id5;
import p001o.nif;
import p001o.sq8;
import p001o.t9d;
import p001o.ur6;
import p001o.za;

/* loaded from: classes5.dex */
public final class GetTokenLoginMethodHandler extends LoginMethodHandler {

    /* renamed from: d */
    public C10828c f11554d;

    /* renamed from: e */
    public final String f11555e;

    /* renamed from: f */
    public static final C10802b f11553f = new C10802b(null);
    public static final Parcelable.Creator<GetTokenLoginMethodHandler> CREATOR = new C10801a();

    /* renamed from: com.facebook.login.GetTokenLoginMethodHandler$a */
    public static final class C10801a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public GetTokenLoginMethodHandler createFromParcel(Parcel parcel) {
            sq8.m48649h(parcel, "source");
            return new GetTokenLoginMethodHandler(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public GetTokenLoginMethodHandler[] newArray(int i) {
            return new GetTokenLoginMethodHandler[i];
        }
    }

    /* renamed from: com.facebook.login.GetTokenLoginMethodHandler$b */
    public static final class C10802b {
        public C10802b() {
        }

        public /* synthetic */ C10802b(id5 id5Var) {
            this();
        }
    }

    /* renamed from: com.facebook.login.GetTokenLoginMethodHandler$c */
    public static final class C10803c implements cri.InterfaceC12734a {

        /* renamed from: a */
        public final /* synthetic */ Bundle f11556a;

        /* renamed from: b */
        public final /* synthetic */ GetTokenLoginMethodHandler f11557b;

        /* renamed from: c */
        public final /* synthetic */ LoginClient.Request f11558c;

        public C10803c(Bundle bundle, GetTokenLoginMethodHandler getTokenLoginMethodHandler, LoginClient.Request request) {
            this.f11556a = bundle;
            this.f11557b = getTokenLoginMethodHandler;
            this.f11558c = request;
        }

        @Override // p001o.cri.InterfaceC12734a
        /* renamed from: a */
        public void mo12937a(ur6 ur6Var) {
            this.f11557b.m13310d().m13243f(LoginClient.Result.C10812c.m13295d(LoginClient.Result.f11596q, this.f11557b.m13310d().m13252o(), "Caught exception", ur6Var != null ? ur6Var.getMessage() : null, null, 8, null));
        }

        @Override // p001o.cri.InterfaceC12734a
        /* renamed from: b */
        public void mo12938b(JSONObject jSONObject) throws NumberFormatException {
            try {
                this.f11556a.putString("com.facebook.platform.extra.USER_ID", jSONObject != null ? jSONObject.getString(OutcomeConstants.OUTCOME_ID) : null);
                this.f11557b.m13227s(this.f11558c, this.f11556a);
            } catch (JSONException e) {
                this.f11557b.m13310d().m13243f(LoginClient.Result.C10812c.m13295d(LoginClient.Result.f11596q, this.f11557b.m13310d().m13252o(), "Caught exception", e.getMessage(), null, 8, null));
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GetTokenLoginMethodHandler(LoginClient loginClient) {
        super(loginClient);
        sq8.m48649h(loginClient, "loginClient");
        this.f11555e = "get_token";
    }

    /* renamed from: t */
    public static final void m13223t(GetTokenLoginMethodHandler getTokenLoginMethodHandler, LoginClient.Request request, Bundle bundle) throws NumberFormatException {
        sq8.m48649h(getTokenLoginMethodHandler, "this$0");
        sq8.m48649h(request, "$request");
        getTokenLoginMethodHandler.m13226r(request, bundle);
    }

    @Override // com.facebook.login.LoginMethodHandler
    /* renamed from: b */
    public void mo13224b() {
        C10828c c10828c = this.f11554d;
        if (c10828c != null) {
            c10828c.m49577b();
            c10828c.m49580f(null);
            this.f11554d = null;
        }
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // com.facebook.login.LoginMethodHandler
    /* renamed from: f */
    public String mo13184f() {
        return this.f11555e;
    }

    @Override // com.facebook.login.LoginMethodHandler
    /* renamed from: o */
    public int mo13188o(final LoginClient.Request request) {
        sq8.m48649h(request, "request");
        Context contextM13246i = m13310d().m13246i();
        if (contextM13246i == null) {
            contextM13246i = C10773c.m13019l();
        }
        this.f11554d = new C10828c(contextM13246i, request);
        if (!r0.m49581g()) {
            return 0;
        }
        m13310d().m13255r();
        t9d.InterfaceC17035b interfaceC17035b = new t9d.InterfaceC17035b() { // from class: o.pr7
            @Override // p001o.t9d.InterfaceC17035b
            /* renamed from: a */
            public final void mo44070a(Bundle bundle) throws NumberFormatException {
                GetTokenLoginMethodHandler.m13223t(this.f40440a, request, bundle);
            }
        };
        C10828c c10828c = this.f11554d;
        if (c10828c != null) {
            c10828c.m49580f(interfaceC17035b);
        }
        return 1;
    }

    /* renamed from: q */
    public final void m13225q(LoginClient.Request request, Bundle bundle) throws NumberFormatException {
        sq8.m48649h(request, "request");
        sq8.m48649h(bundle, "result");
        String string = bundle.getString("com.facebook.platform.extra.USER_ID");
        if (!(string == null || string.length() == 0)) {
            m13227s(request, bundle);
            return;
        }
        m13310d().m13255r();
        String string2 = bundle.getString("com.facebook.platform.extra.ACCESS_TOKEN");
        if (string2 == null) {
            throw new IllegalStateException("Required value was null.".toString());
        }
        sq8.m48648g(string2, "checkNotNull(result.getS…ocol.EXTRA_ACCESS_TOKEN))");
        cri.m21645H(string2, new C10803c(bundle, this, request));
    }

    /* renamed from: r */
    public final void m13226r(LoginClient.Request request, Bundle bundle) throws NumberFormatException {
        sq8.m48649h(request, "request");
        C10828c c10828c = this.f11554d;
        if (c10828c != null) {
            c10828c.m49580f(null);
        }
        this.f11554d = null;
        m13310d().m13256s();
        if (bundle != null) {
            List stringArrayList = bundle.getStringArrayList("com.facebook.platform.extra.PERMISSIONS");
            if (stringArrayList == null) {
                stringArrayList = ch3.m21246k();
            }
            Set<String> setM13278n = request.m13278n();
            if (setM13278n == null) {
                setM13278n = nif.m40664e();
            }
            String string = bundle.getString("com.facebook.platform.extra.ID_TOKEN");
            if (setM13278n.contains(Scopes.OPEN_ID)) {
                if (string == null || string.length() == 0) {
                    m13310d().m13236A();
                    return;
                }
            }
            if (stringArrayList.containsAll(setM13278n)) {
                m13225q(request, bundle);
                return;
            }
            HashSet hashSet = new HashSet();
            for (String str : setM13278n) {
                if (!stringArrayList.contains(str)) {
                    hashSet.add(str);
                }
            }
            if (!hashSet.isEmpty()) {
                m13308a("new_permissions", TextUtils.join(",", hashSet));
            }
            request.m13287w(hashSet);
        }
        m13310d().m13236A();
    }

    /* renamed from: s */
    public final void m13227s(LoginClient.Request request, Bundle bundle) throws NumberFormatException {
        LoginClient.Result resultM13295d;
        sq8.m48649h(request, "request");
        sq8.m48649h(bundle, "result");
        try {
            LoginMethodHandler.C10820a c10820a = LoginMethodHandler.f11614c;
            resultM13295d = LoginClient.Result.f11596q.m13297b(request, c10820a.m13316a(bundle, za.FACEBOOK_APPLICATION_SERVICE, request.m13265a()), c10820a.m13318c(bundle, request.m13277m()));
        } catch (ur6 e) {
            resultM13295d = LoginClient.Result.C10812c.m13295d(LoginClient.Result.f11596q, m13310d().m13252o(), null, e.getMessage(), null, 8, null);
        }
        m13310d().m13244g(resultM13295d);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GetTokenLoginMethodHandler(Parcel parcel) {
        super(parcel);
        sq8.m48649h(parcel, "source");
        this.f11555e = "get_token";
    }
}
