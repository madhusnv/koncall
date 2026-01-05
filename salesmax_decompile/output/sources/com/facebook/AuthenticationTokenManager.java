package com.facebook;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import p001o.cri;
import p001o.gha;
import p001o.id5;
import p001o.s01;
import p001o.sq8;

/* loaded from: classes5.dex */
public final class AuthenticationTokenManager {

    /* renamed from: d */
    public static final C10750a f11284d = new C10750a(null);

    /* renamed from: e */
    public static AuthenticationTokenManager f11285e;

    /* renamed from: a */
    public final gha f11286a;

    /* renamed from: b */
    public final s01 f11287b;

    /* renamed from: c */
    public AuthenticationToken f11288c;

    public static final class CurrentAuthenticationTokenChangedBroadcastReceiver extends BroadcastReceiver {
        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            sq8.m48649h(context, "context");
            sq8.m48649h(intent, "intent");
        }
    }

    /* renamed from: com.facebook.AuthenticationTokenManager$a */
    public static final class C10750a {
        public C10750a() {
        }

        public /* synthetic */ C10750a(id5 id5Var) {
            this();
        }

        /* renamed from: a */
        public final AuthenticationTokenManager m12800a() {
            AuthenticationTokenManager authenticationTokenManager;
            AuthenticationTokenManager authenticationTokenManager2 = AuthenticationTokenManager.f11285e;
            if (authenticationTokenManager2 != null) {
                return authenticationTokenManager2;
            }
            synchronized (this) {
                authenticationTokenManager = AuthenticationTokenManager.f11285e;
                if (authenticationTokenManager == null) {
                    gha ghaVarM28700b = gha.m28700b(C10773c.m13019l());
                    sq8.m48648g(ghaVarM28700b, "getInstance(applicationContext)");
                    AuthenticationTokenManager authenticationTokenManager3 = new AuthenticationTokenManager(ghaVarM28700b, new s01());
                    AuthenticationTokenManager.f11285e = authenticationTokenManager3;
                    authenticationTokenManager = authenticationTokenManager3;
                }
            }
            return authenticationTokenManager;
        }
    }

    public AuthenticationTokenManager(gha ghaVar, s01 s01Var) {
        sq8.m48649h(ghaVar, "localBroadcastManager");
        sq8.m48649h(s01Var, "authenticationTokenCache");
        this.f11286a = ghaVar;
        this.f11287b = s01Var;
    }

    /* renamed from: c */
    public final AuthenticationToken m12796c() {
        return this.f11288c;
    }

    /* renamed from: d */
    public final void m12797d(AuthenticationToken authenticationToken, AuthenticationToken authenticationToken2) {
        Intent intent = new Intent(C10773c.m13019l(), (Class<?>) CurrentAuthenticationTokenChangedBroadcastReceiver.class);
        intent.setAction("com.facebook.sdk.ACTION_CURRENT_AUTHENTICATION_TOKEN_CHANGED");
        intent.putExtra("com.facebook.sdk.EXTRA_OLD_AUTHENTICATION_TOKEN", authenticationToken);
        intent.putExtra("com.facebook.sdk.EXTRA_NEW_AUTHENTICATION_TOKEN", authenticationToken2);
        this.f11286a.m28703d(intent);
    }

    /* renamed from: e */
    public final void m12798e(AuthenticationToken authenticationToken) {
        m12799f(authenticationToken, true);
    }

    /* renamed from: f */
    public final void m12799f(AuthenticationToken authenticationToken, boolean z) {
        AuthenticationToken authenticationTokenM12796c = m12796c();
        this.f11288c = authenticationToken;
        if (z) {
            if (authenticationToken != null) {
                this.f11287b.m47370b(authenticationToken);
            } else {
                this.f11287b.m47369a();
                cri.m21663i(C10773c.m13019l());
            }
        }
        if (cri.m21660e(authenticationTokenM12796c, authenticationToken)) {
            return;
        }
        m12797d(authenticationTokenM12796c, authenticationToken);
    }
}
