package com.facebook;

import android.content.Intent;
import p001o.cri;
import p001o.gha;
import p001o.id5;
import p001o.jld;
import p001o.sq8;

/* renamed from: com.facebook.h */
/* loaded from: classes5.dex */
public final class C10778h {

    /* renamed from: d */
    public static final a f11447d = new a(null);

    /* renamed from: e */
    public static volatile C10778h f11448e;

    /* renamed from: a */
    public final gha f11449a;

    /* renamed from: b */
    public final jld f11450b;

    /* renamed from: c */
    public Profile f11451c;

    /* renamed from: com.facebook.h$a */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(id5 id5Var) {
            this();
        }

        /* renamed from: a */
        public final synchronized C10778h m13090a() {
            C10778h c10778h;
            if (C10778h.f11448e == null) {
                gha ghaVarM28700b = gha.m28700b(C10773c.m13019l());
                sq8.m48648g(ghaVarM28700b, "getInstance(applicationContext)");
                C10778h.f11448e = new C10778h(ghaVarM28700b, new jld());
            }
            c10778h = C10778h.f11448e;
            if (c10778h == null) {
                sq8.m48667z("instance");
                c10778h = null;
            }
            return c10778h;
        }
    }

    public C10778h(gha ghaVar, jld jldVar) {
        sq8.m48649h(ghaVar, "localBroadcastManager");
        sq8.m48649h(jldVar, "profileCache");
        this.f11449a = ghaVar;
        this.f11450b = jldVar;
    }

    /* renamed from: c */
    public final Profile m13085c() {
        return this.f11451c;
    }

    /* renamed from: d */
    public final boolean m13086d() {
        Profile profileM34008b = this.f11450b.m34008b();
        if (profileM34008b == null) {
            return false;
        }
        m13089g(profileM34008b, false);
        return true;
    }

    /* renamed from: e */
    public final void m13087e(Profile profile, Profile profile2) {
        Intent intent = new Intent("com.facebook.sdk.ACTION_CURRENT_PROFILE_CHANGED");
        intent.putExtra("com.facebook.sdk.EXTRA_OLD_PROFILE", profile);
        intent.putExtra("com.facebook.sdk.EXTRA_NEW_PROFILE", profile2);
        this.f11449a.m28703d(intent);
    }

    /* renamed from: f */
    public final void m13088f(Profile profile) {
        m13089g(profile, true);
    }

    /* renamed from: g */
    public final void m13089g(Profile profile, boolean z) {
        Profile profile2 = this.f11451c;
        this.f11451c = profile;
        if (z) {
            if (profile != null) {
                this.f11450b.m34009c(profile);
            } else {
                this.f11450b.m34007a();
            }
        }
        if (cri.m21660e(profile2, profile)) {
            return;
        }
        m13087e(profile2, profile);
    }
}
