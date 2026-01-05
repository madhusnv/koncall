package com.facebook;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import com.facebook.AccessToken;
import com.facebook.C10772b;
import com.facebook.C10775e;
import com.facebook.C10776f;
import com.facebook.GraphRequest;
import com.google.firebase.messaging.Constants;
import java.util.Date;
import java.util.HashSet;
import java.util.Locale;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONArray;
import org.json.JSONObject;
import p001o.cri;
import p001o.gha;
import p001o.id5;
import p001o.p38;
import p001o.sq8;
import p001o.ur6;
import p001o.za;

/* renamed from: com.facebook.b */
/* loaded from: classes5.dex */
public final class C10772b {

    /* renamed from: f */
    public static final a f11380f = new a(null);

    /* renamed from: g */
    public static C10772b f11381g;

    /* renamed from: a */
    public final gha f11382a;

    /* renamed from: b */
    public final C10771a f11383b;

    /* renamed from: c */
    public AccessToken f11384c;

    /* renamed from: d */
    public final AtomicBoolean f11385d;

    /* renamed from: e */
    public Date f11386e;

    /* renamed from: com.facebook.b$a */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(id5 id5Var) {
            this();
        }

        /* renamed from: c */
        public final GraphRequest m12971c(AccessToken accessToken, GraphRequest.InterfaceC10763b interfaceC10763b) {
            e eVarM12974f = m12974f(accessToken);
            Bundle bundle = new Bundle();
            bundle.putString("grant_type", eVarM12974f.mo12975a());
            bundle.putString("client_id", accessToken.m12751c());
            bundle.putString("fields", "access_token,expires_at,expires_in,data_access_expiration_time,graph_domain");
            GraphRequest graphRequestM12913x = GraphRequest.f11338n.m12913x(accessToken, eVarM12974f.mo12976b(), interfaceC10763b);
            graphRequestM12913x.m12846G(bundle);
            graphRequestM12913x.m12845F(p38.GET);
            return graphRequestM12913x;
        }

        /* renamed from: d */
        public final GraphRequest m12972d(AccessToken accessToken, GraphRequest.InterfaceC10763b interfaceC10763b) {
            Bundle bundle = new Bundle();
            bundle.putString("fields", "permission,status");
            GraphRequest graphRequestM12913x = GraphRequest.f11338n.m12913x(accessToken, "me/permissions", interfaceC10763b);
            graphRequestM12913x.m12846G(bundle);
            graphRequestM12913x.m12845F(p38.GET);
            return graphRequestM12913x;
        }

        /* renamed from: e */
        public final C10772b m12973e() {
            C10772b c10772b;
            C10772b c10772b2 = C10772b.f11381g;
            if (c10772b2 != null) {
                return c10772b2;
            }
            synchronized (this) {
                c10772b = C10772b.f11381g;
                if (c10772b == null) {
                    gha ghaVarM28700b = gha.m28700b(C10773c.m13019l());
                    sq8.m48648g(ghaVarM28700b, "getInstance(applicationContext)");
                    C10772b c10772b3 = new C10772b(ghaVarM28700b, new C10771a());
                    C10772b.f11381g = c10772b3;
                    c10772b = c10772b3;
                }
            }
            return c10772b;
        }

        /* renamed from: f */
        public final e m12974f(AccessToken accessToken) {
            String strM12756h = accessToken.m12756h();
            if (strM12756h == null) {
                strM12756h = "facebook";
            }
            return sq8.m48644c(strM12756h, "instagram") ? new c() : new b();
        }
    }

    /* renamed from: com.facebook.b$b */
    public static final class b implements e {

        /* renamed from: a */
        public final String f11387a = "oauth/access_token";

        /* renamed from: b */
        public final String f11388b = "fb_extend_sso_token";

        @Override // com.facebook.C10772b.e
        /* renamed from: a */
        public String mo12975a() {
            return this.f11388b;
        }

        @Override // com.facebook.C10772b.e
        /* renamed from: b */
        public String mo12976b() {
            return this.f11387a;
        }
    }

    /* renamed from: com.facebook.b$c */
    public static final class c implements e {

        /* renamed from: a */
        public final String f11389a = "refresh_access_token";

        /* renamed from: b */
        public final String f11390b = "ig_refresh_token";

        @Override // com.facebook.C10772b.e
        /* renamed from: a */
        public String mo12975a() {
            return this.f11390b;
        }

        @Override // com.facebook.C10772b.e
        /* renamed from: b */
        public String mo12976b() {
            return this.f11389a;
        }
    }

    /* renamed from: com.facebook.b$d */
    public static final class d {

        /* renamed from: a */
        public String f11391a;

        /* renamed from: b */
        public int f11392b;

        /* renamed from: c */
        public int f11393c;

        /* renamed from: d */
        public Long f11394d;

        /* renamed from: e */
        public String f11395e;

        /* renamed from: a */
        public final String m12977a() {
            return this.f11391a;
        }

        /* renamed from: b */
        public final Long m12978b() {
            return this.f11394d;
        }

        /* renamed from: c */
        public final int m12979c() {
            return this.f11392b;
        }

        /* renamed from: d */
        public final int m12980d() {
            return this.f11393c;
        }

        /* renamed from: e */
        public final String m12981e() {
            return this.f11395e;
        }

        /* renamed from: f */
        public final void m12982f(String str) {
            this.f11391a = str;
        }

        /* renamed from: g */
        public final void m12983g(Long l) {
            this.f11394d = l;
        }

        /* renamed from: h */
        public final void m12984h(int i) {
            this.f11392b = i;
        }

        /* renamed from: i */
        public final void m12985i(int i) {
            this.f11393c = i;
        }

        /* renamed from: j */
        public final void m12986j(String str) {
            this.f11395e = str;
        }
    }

    /* renamed from: com.facebook.b$e */
    public interface e {
        /* renamed from: a */
        String mo12975a();

        /* renamed from: b */
        String mo12976b();
    }

    public C10772b(gha ghaVar, C10771a c10771a) {
        sq8.m48649h(ghaVar, "localBroadcastManager");
        sq8.m48649h(c10771a, "accessTokenCache");
        this.f11382a = ghaVar;
        this.f11383b = c10771a;
        this.f11385d = new AtomicBoolean(false);
        this.f11386e = new Date(0L);
    }

    /* renamed from: l */
    public static final void m12954l(C10772b c10772b, AccessToken.InterfaceC10740a interfaceC10740a) {
        sq8.m48649h(c10772b, "this$0");
        c10772b.m12963m(interfaceC10740a);
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x009f  */
    /* renamed from: n */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m12955n(AtomicBoolean atomicBoolean, Set set, Set set2, Set set3, C10776f c10776f) {
        JSONArray jSONArrayOptJSONArray;
        sq8.m48649h(atomicBoolean, "$permissionsCallSucceeded");
        sq8.m48649h(set, "$permissions");
        sq8.m48649h(set2, "$declinedPermissions");
        sq8.m48649h(set3, "$expiredPermissions");
        sq8.m48649h(c10776f, "response");
        JSONObject jSONObjectM13066d = c10776f.m13066d();
        if (jSONObjectM13066d == null || (jSONArrayOptJSONArray = jSONObjectM13066d.optJSONArray(Constants.ScionAnalytics.MessageType.DATA_MESSAGE)) == null) {
            return;
        }
        atomicBoolean.set(true);
        int length = jSONArrayOptJSONArray.length();
        for (int i = 0; i < length; i++) {
            JSONObject jSONObjectOptJSONObject = jSONArrayOptJSONArray.optJSONObject(i);
            if (jSONObjectOptJSONObject != null) {
                String strOptString = jSONObjectOptJSONObject.optString("permission");
                String strOptString2 = jSONObjectOptJSONObject.optString("status");
                if (!cri.d0(strOptString) && !cri.d0(strOptString2)) {
                    sq8.m48648g(strOptString2, "status");
                    Locale locale = Locale.US;
                    sq8.m48648g(locale, "US");
                    String lowerCase = strOptString2.toLowerCase(locale);
                    sq8.m48648g(lowerCase, "this as java.lang.String).toLowerCase(locale)");
                    sq8.m48648g(lowerCase, "status");
                    int iHashCode = lowerCase.hashCode();
                    if (iHashCode != -1309235419) {
                        if (iHashCode != 280295099) {
                            if (iHashCode == 568196142 && lowerCase.equals("declined")) {
                                set2.add(strOptString);
                            } else {
                                StringBuilder sb = new StringBuilder();
                                sb.append("Unexpected status: ");
                                sb.append(lowerCase);
                            }
                        } else if (lowerCase.equals("granted")) {
                            set.add(strOptString);
                        }
                    } else if (lowerCase.equals("expired")) {
                        set3.add(strOptString);
                    }
                }
            }
        }
    }

    /* renamed from: o */
    public static final void m12956o(d dVar, C10776f c10776f) {
        sq8.m48649h(dVar, "$refreshResult");
        sq8.m48649h(c10776f, "response");
        JSONObject jSONObjectM13066d = c10776f.m13066d();
        if (jSONObjectM13066d == null) {
            return;
        }
        dVar.m12982f(jSONObjectM13066d.optString("access_token"));
        dVar.m12984h(jSONObjectM13066d.optInt("expires_at"));
        dVar.m12985i(jSONObjectM13066d.optInt("expires_in"));
        dVar.m12983g(Long.valueOf(jSONObjectM13066d.optLong("data_access_expiration_time")));
        dVar.m12986j(jSONObjectM13066d.optString("graph_domain", null));
    }

    /* renamed from: p */
    public static final void m12957p(d dVar, AccessToken accessToken, AccessToken.InterfaceC10740a interfaceC10740a, AtomicBoolean atomicBoolean, Set set, Set set2, Set set3, C10772b c10772b, C10775e c10775e) throws Throwable {
        boolean z;
        AccessToken accessToken2;
        sq8.m48649h(dVar, "$refreshResult");
        sq8.m48649h(atomicBoolean, "$permissionsCallSucceeded");
        sq8.m48649h(set, "$permissions");
        sq8.m48649h(set2, "$declinedPermissions");
        Set setM12754f = set3;
        sq8.m48649h(setM12754f, "$expiredPermissions");
        sq8.m48649h(c10772b, "this$0");
        sq8.m48649h(c10775e, "it");
        String strM12977a = dVar.m12977a();
        int iM12979c = dVar.m12979c();
        Long lM12978b = dVar.m12978b();
        String strM12981e = dVar.m12981e();
        try {
            a aVar = f11380f;
            if (aVar.m12973e().m12960i() != null) {
                try {
                    AccessToken accessTokenM12960i = aVar.m12973e().m12960i();
                    if ((accessTokenM12960i != null ? accessTokenM12960i.m12761m() : null) == accessToken.m12761m()) {
                        if (!atomicBoolean.get() && strM12977a == null && iM12979c == 0) {
                            if (interfaceC10740a != null) {
                                interfaceC10740a.m12766a(new ur6("Failed to refresh access token"));
                            }
                            c10772b.f11385d.set(false);
                            return;
                        }
                        Date dateM12755g = accessToken.m12755g();
                        if (dVar.m12979c() != 0) {
                            dateM12755g = new Date(dVar.m12979c() * 1000);
                        } else if (dVar.m12980d() != 0) {
                            dateM12755g = new Date((dVar.m12980d() * 1000) + new Date().getTime());
                        }
                        Date date = dateM12755g;
                        if (strM12977a == null) {
                            strM12977a = accessToken.m12760l();
                        }
                        String str = strM12977a;
                        String strM12751c = accessToken.m12751c();
                        String strM12761m = accessToken.m12761m();
                        Set setM12758j = atomicBoolean.get() ? set : accessToken.m12758j();
                        Set setM12753e = atomicBoolean.get() ? set2 : accessToken.m12753e();
                        if (!atomicBoolean.get()) {
                            setM12754f = accessToken.m12754f();
                        }
                        Set set4 = setM12754f;
                        za zaVarM12759k = accessToken.m12759k();
                        Date date2 = new Date();
                        Date date3 = lM12978b != null ? new Date(lM12978b.longValue() * 1000) : accessToken.m12752d();
                        if (strM12981e == null) {
                            strM12981e = accessToken.m12756h();
                        }
                        AccessToken accessToken3 = new AccessToken(str, strM12751c, strM12761m, setM12758j, setM12753e, set4, zaVarM12759k, date, date2, date3, strM12981e);
                        try {
                            aVar.m12973e().m12965r(accessToken3);
                            c10772b.f11385d.set(false);
                            if (interfaceC10740a != null) {
                                interfaceC10740a.m12767b(accessToken3);
                                return;
                            }
                            return;
                        } catch (Throwable th) {
                            th = th;
                            accessToken2 = accessToken3;
                            z = false;
                            c10772b.f11385d.set(z);
                            if (interfaceC10740a != null && accessToken2 != null) {
                                interfaceC10740a.m12767b(accessToken2);
                            }
                            throw th;
                        }
                    }
                } catch (Throwable th2) {
                    th = th2;
                    z = false;
                    accessToken2 = null;
                    c10772b.f11385d.set(z);
                    if (interfaceC10740a != null) {
                        interfaceC10740a.m12767b(accessToken2);
                    }
                    throw th;
                }
            }
            if (interfaceC10740a != null) {
                interfaceC10740a.m12766a(new ur6("No current access token to refresh"));
            }
            c10772b.f11385d.set(false);
        } catch (Throwable th3) {
            th = th3;
            z = false;
        }
    }

    /* renamed from: g */
    public final void m12958g() {
        m12964q(m12960i(), m12960i());
    }

    /* renamed from: h */
    public final void m12959h() {
        if (m12968u()) {
            m12962k(null);
        }
    }

    /* renamed from: i */
    public final AccessToken m12960i() {
        return this.f11384c;
    }

    /* renamed from: j */
    public final boolean m12961j() {
        AccessToken accessTokenM12944f = this.f11383b.m12944f();
        if (accessTokenM12944f == null) {
            return false;
        }
        m12966s(accessTokenM12944f, false);
        return true;
    }

    /* renamed from: k */
    public final void m12962k(final AccessToken.InterfaceC10740a interfaceC10740a) {
        if (sq8.m48644c(Looper.getMainLooper(), Looper.myLooper())) {
            m12963m(interfaceC10740a);
        } else {
            new Handler(Looper.getMainLooper()).post(new Runnable(interfaceC10740a) { // from class: o.va
                @Override // java.lang.Runnable
                public final void run() {
                    C10772b.m12954l(this.f50048a, null);
                }
            });
        }
    }

    /* renamed from: m */
    public final void m12963m(final AccessToken.InterfaceC10740a interfaceC10740a) {
        final AccessToken accessTokenM12960i = m12960i();
        if (accessTokenM12960i == null) {
            if (interfaceC10740a != null) {
                interfaceC10740a.m12766a(new ur6("No current access token to refresh"));
                return;
            }
            return;
        }
        if (!this.f11385d.compareAndSet(false, true)) {
            if (interfaceC10740a != null) {
                interfaceC10740a.m12766a(new ur6("Refresh already in progress"));
                return;
            }
            return;
        }
        this.f11386e = new Date();
        final HashSet hashSet = new HashSet();
        final HashSet hashSet2 = new HashSet();
        final HashSet hashSet3 = new HashSet();
        final AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        final d dVar = new d();
        a aVar = f11380f;
        C10775e c10775e = new C10775e(aVar.m12972d(accessTokenM12960i, new GraphRequest.InterfaceC10763b() { // from class: o.wa
            @Override // com.facebook.GraphRequest.InterfaceC10763b
            /* renamed from: a */
            public final void mo12873a(C10776f c10776f) {
                C10772b.m12955n(atomicBoolean, hashSet, hashSet2, hashSet3, c10776f);
            }
        }), aVar.m12971c(accessTokenM12960i, new GraphRequest.InterfaceC10763b() { // from class: o.xa
            @Override // com.facebook.GraphRequest.InterfaceC10763b
            /* renamed from: a */
            public final void mo12873a(C10776f c10776f) {
                C10772b.m12956o(dVar, c10776f);
            }
        }));
        c10775e.m13047e(new C10775e.a(accessTokenM12960i, interfaceC10740a, atomicBoolean, hashSet, hashSet2, hashSet3, this) { // from class: o.ya

            /* renamed from: b */
            public final /* synthetic */ AccessToken f55124b;

            /* renamed from: c */
            public final /* synthetic */ AtomicBoolean f55125c;

            /* renamed from: d */
            public final /* synthetic */ Set f55126d;

            /* renamed from: e */
            public final /* synthetic */ Set f55127e;

            /* renamed from: f */
            public final /* synthetic */ Set f55128f;

            /* renamed from: g */
            public final /* synthetic */ C10772b f55129g;

            {
                this.f55125c = atomicBoolean;
                this.f55126d = hashSet;
                this.f55127e = hashSet2;
                this.f55128f = hashSet3;
                this.f55129g = this;
            }

            @Override // com.facebook.C10775e.a
            /* renamed from: a */
            public final void mo13062a(C10775e c10775e2) throws Throwable {
                C10772b.m12957p(this.f55123a, this.f55124b, null, this.f55125c, this.f55126d, this.f55127e, this.f55128f, this.f55129g, c10775e2);
            }
        });
        c10775e.m13051m();
    }

    /* renamed from: q */
    public final void m12964q(AccessToken accessToken, AccessToken accessToken2) {
        Intent intent = new Intent(C10773c.m13019l(), (Class<?>) CurrentAccessTokenExpirationBroadcastReceiver.class);
        intent.setAction("com.facebook.sdk.ACTION_CURRENT_ACCESS_TOKEN_CHANGED");
        intent.putExtra("com.facebook.sdk.EXTRA_OLD_ACCESS_TOKEN", accessToken);
        intent.putExtra("com.facebook.sdk.EXTRA_NEW_ACCESS_TOKEN", accessToken2);
        this.f11382a.m28703d(intent);
    }

    /* renamed from: r */
    public final void m12965r(AccessToken accessToken) {
        m12966s(accessToken, true);
    }

    /* renamed from: s */
    public final void m12966s(AccessToken accessToken, boolean z) {
        AccessToken accessToken2 = this.f11384c;
        this.f11384c = accessToken;
        this.f11385d.set(false);
        this.f11386e = new Date(0L);
        if (z) {
            if (accessToken != null) {
                this.f11383b.m12945g(accessToken);
            } else {
                this.f11383b.m12939a();
                cri.m21663i(C10773c.m13019l());
            }
        }
        if (cri.m21660e(accessToken2, accessToken)) {
            return;
        }
        m12964q(accessToken2, accessToken);
        m12967t();
    }

    /* renamed from: t */
    public final void m12967t() {
        Context contextM13019l = C10773c.m13019l();
        AccessToken.C10742c c10742c = AccessToken.f11242y;
        AccessToken accessTokenM12774e = c10742c.m12774e();
        AlarmManager alarmManager = (AlarmManager) contextM13019l.getSystemService("alarm");
        if (c10742c.m12776g()) {
            if ((accessTokenM12774e != null ? accessTokenM12774e.m12755g() : null) == null || alarmManager == null) {
                return;
            }
            Intent intent = new Intent(contextM13019l, (Class<?>) CurrentAccessTokenExpirationBroadcastReceiver.class);
            intent.setAction("com.facebook.sdk.ACTION_CURRENT_ACCESS_TOKEN_CHANGED");
            try {
                alarmManager.set(1, accessTokenM12774e.m12755g().getTime(), PendingIntent.getBroadcast(contextM13019l, 0, intent, 67108864));
            } catch (Exception unused) {
            }
        }
    }

    /* renamed from: u */
    public final boolean m12968u() {
        AccessToken accessTokenM12960i = m12960i();
        if (accessTokenM12960i == null) {
            return false;
        }
        long time = new Date().getTime();
        return accessTokenM12960i.m12759k().canExtendToken() && time - this.f11386e.getTime() > 3600000 && time - accessTokenM12960i.m12757i().getTime() > 86400000;
    }
}
