package com.facebook;

import android.content.SharedPreferences;
import android.os.Bundle;
import org.json.JSONException;
import org.json.JSONObject;
import p001o.a94;
import p001o.id5;
import p001o.sq8;
import p001o.y3i;

/* renamed from: com.facebook.a */
/* loaded from: classes5.dex */
public final class C10771a {

    /* renamed from: d */
    public static final a f11376d = new a(null);

    /* renamed from: a */
    public final SharedPreferences f11377a;

    /* renamed from: b */
    public final b f11378b;

    /* renamed from: c */
    public C10777g f11379c;

    /* renamed from: com.facebook.a$a */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(id5 id5Var) {
            this();
        }
    }

    /* renamed from: com.facebook.a$b */
    public static final class b {
        /* renamed from: a */
        public final C10777g m12947a() {
            return new C10777g(C10773c.m13019l(), null, 2, null);
        }
    }

    public C10771a(SharedPreferences sharedPreferences, b bVar) {
        sq8.m48649h(sharedPreferences, "sharedPreferences");
        sq8.m48649h(bVar, "tokenCachingStrategyFactory");
        this.f11377a = sharedPreferences;
        this.f11378b = bVar;
    }

    /* renamed from: a */
    public final void m12939a() {
        this.f11377a.edit().remove("com.facebook.AccessTokenManager.CachedAccessToken").apply();
        if (m12946h()) {
            m12942d().m13073a();
        }
    }

    /* renamed from: b */
    public final AccessToken m12940b() {
        String string = this.f11377a.getString("com.facebook.AccessTokenManager.CachedAccessToken", null);
        if (string == null) {
            return null;
        }
        try {
            return AccessToken.f11242y.m12771b(new JSONObject(string));
        } catch (JSONException unused) {
            return null;
        }
    }

    /* renamed from: c */
    public final AccessToken m12941c() throws ClassNotFoundException {
        Bundle bundleM13075c = m12942d().m13075c();
        if (bundleM13075c == null || !C10777g.f11443c.m13082g(bundleM13075c)) {
            return null;
        }
        return AccessToken.f11242y.m12772c(bundleM13075c);
    }

    /* renamed from: d */
    public final C10777g m12942d() {
        if (a94.m16694d(this)) {
            return null;
        }
        try {
            if (this.f11379c == null) {
                synchronized (this) {
                    if (this.f11379c == null) {
                        this.f11379c = this.f11378b.m12947a();
                    }
                    y3i y3iVar = y3i.f54824a;
                }
            }
            C10777g c10777g = this.f11379c;
            if (c10777g != null) {
                return c10777g;
            }
            throw new IllegalStateException("Required value was null.".toString());
        } catch (Throwable th) {
            a94.m16692b(th, this);
            return null;
        }
    }

    /* renamed from: e */
    public final boolean m12943e() {
        return this.f11377a.contains("com.facebook.AccessTokenManager.CachedAccessToken");
    }

    /* renamed from: f */
    public final AccessToken m12944f() throws ClassNotFoundException {
        if (m12943e()) {
            return m12940b();
        }
        if (!m12946h()) {
            return null;
        }
        AccessToken accessTokenM12941c = m12941c();
        if (accessTokenM12941c == null) {
            return accessTokenM12941c;
        }
        m12945g(accessTokenM12941c);
        m12942d().m13073a();
        return accessTokenM12941c;
    }

    /* renamed from: g */
    public final void m12945g(AccessToken accessToken) {
        sq8.m48649h(accessToken, "accessToken");
        try {
            this.f11377a.edit().putString("com.facebook.AccessTokenManager.CachedAccessToken", accessToken.m12764p().toString()).apply();
        } catch (JSONException unused) {
        }
    }

    /* renamed from: h */
    public final boolean m12946h() {
        return C10773c.m12994H();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public C10771a() {
        SharedPreferences sharedPreferences = C10773c.m13019l().getSharedPreferences("com.facebook.AccessTokenManager.SharedPreferences", 0);
        sq8.m48648g(sharedPreferences, "getApplicationContext()\n…ME, Context.MODE_PRIVATE)");
        this(sharedPreferences, new b());
    }
}
