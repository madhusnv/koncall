package com.facebook;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.amplifyframework.auth.cognito.data.AWSCognitoLegacyCredentialStore;
import com.facebook.C10777g;
import com.onesignal.session.internal.outcomes.impl.OutcomeConstants;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import org.apache.http.cookie.ClientCookie;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p001o.bka;
import p001o.ch3;
import p001o.cri;
import p001o.id5;
import p001o.rri;
import p001o.sq8;
import p001o.ur6;
import p001o.za;

/* loaded from: classes5.dex */
public final class AccessToken implements Parcelable {
    public static final Parcelable.Creator<AccessToken> CREATOR;

    /* renamed from: H */
    public static final Date f11238H;

    /* renamed from: L */
    public static final Date f11239L;

    /* renamed from: M */
    public static final Date f11240M;

    /* renamed from: Q */
    public static final za f11241Q;

    /* renamed from: y */
    public static final C10742c f11242y = new C10742c(null);

    /* renamed from: a */
    public final Date f11243a;

    /* renamed from: b */
    public final Set f11244b;

    /* renamed from: c */
    public final Set f11245c;

    /* renamed from: d */
    public final Set f11246d;

    /* renamed from: e */
    public final String f11247e;

    /* renamed from: f */
    public final za f11248f;

    /* renamed from: g */
    public final Date f11249g;

    /* renamed from: h */
    public final String f11250h;

    /* renamed from: q */
    public final String f11251q;

    /* renamed from: s */
    public final Date f11252s;

    /* renamed from: x */
    public final String f11253x;

    /* renamed from: com.facebook.AccessToken$a */
    public interface InterfaceC10740a {
        /* renamed from: a */
        void m12766a(ur6 ur6Var);

        /* renamed from: b */
        void m12767b(AccessToken accessToken);
    }

    /* renamed from: com.facebook.AccessToken$b */
    public static final class C10741b implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public AccessToken createFromParcel(Parcel parcel) {
            sq8.m48649h(parcel, "source");
            return new AccessToken(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public AccessToken[] newArray(int i) {
            return new AccessToken[i];
        }
    }

    /* renamed from: com.facebook.AccessToken$c */
    public static final class C10742c {
        public C10742c() {
        }

        public /* synthetic */ C10742c(id5 id5Var) {
            this();
        }

        /* renamed from: a */
        public final AccessToken m12770a(AccessToken accessToken) {
            sq8.m48649h(accessToken, "current");
            return new AccessToken(accessToken.m12760l(), accessToken.m12751c(), accessToken.m12761m(), accessToken.m12758j(), accessToken.m12753e(), accessToken.m12754f(), accessToken.m12759k(), new Date(), new Date(), accessToken.m12752d(), null, 1024, null);
        }

        /* renamed from: b */
        public final AccessToken m12771b(JSONObject jSONObject) throws JSONException {
            sq8.m48649h(jSONObject, "jsonObject");
            if (jSONObject.getInt(ClientCookie.VERSION_ATTR) > 1) {
                throw new ur6("Unknown AccessToken serialization format.");
            }
            String string = jSONObject.getString(AWSCognitoLegacyCredentialStore.TOKEN_KEY);
            Date date = new Date(jSONObject.getLong("expires_at"));
            JSONArray jSONArray = jSONObject.getJSONArray("permissions");
            JSONArray jSONArray2 = jSONObject.getJSONArray("declined_permissions");
            JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("expired_permissions");
            Date date2 = new Date(jSONObject.getLong("last_refresh"));
            String string2 = jSONObject.getString("source");
            sq8.m48648g(string2, "jsonObject.getString(SOURCE_KEY)");
            za zaVarValueOf = za.valueOf(string2);
            String string3 = jSONObject.getString("application_id");
            String string4 = jSONObject.getString("user_id");
            Date date3 = new Date(jSONObject.optLong("data_access_expiration_time", 0L));
            String strOptString = jSONObject.optString("graph_domain", null);
            sq8.m48648g(string, AWSCognitoLegacyCredentialStore.TOKEN_KEY);
            sq8.m48648g(string3, "applicationId");
            sq8.m48648g(string4, "userId");
            sq8.m48648g(jSONArray, "permissionsArray");
            List listH0 = cri.h0(jSONArray);
            sq8.m48648g(jSONArray2, "declinedPermissionsArray");
            return new AccessToken(string, string3, string4, listH0, cri.h0(jSONArray2), jSONArrayOptJSONArray == null ? new ArrayList() : cri.h0(jSONArrayOptJSONArray), zaVarValueOf, date, date2, date3, strOptString);
        }

        /* renamed from: c */
        public final AccessToken m12772c(Bundle bundle) throws JSONException {
            String string;
            sq8.m48649h(bundle, "bundle");
            List listM12775f = m12775f(bundle, "com.facebook.TokenCachingStrategy.Permissions");
            List listM12775f2 = m12775f(bundle, "com.facebook.TokenCachingStrategy.DeclinedPermissions");
            List listM12775f3 = m12775f(bundle, "com.facebook.TokenCachingStrategy.ExpiredPermissions");
            C10777g.a aVar = C10777g.f11443c;
            String strM13076a = aVar.m13076a(bundle);
            if (cri.d0(strM13076a)) {
                strM13076a = C10773c.m13020m();
            }
            String str = strM13076a;
            String strM13081f = aVar.m13081f(bundle);
            if (strM13081f == null) {
                return null;
            }
            JSONObject jSONObjectM21661f = cri.m21661f(strM13081f);
            if (jSONObjectM21661f != null) {
                try {
                    string = jSONObjectM21661f.getString(OutcomeConstants.OUTCOME_ID);
                } catch (JSONException unused) {
                    return null;
                }
            } else {
                string = null;
            }
            if (str == null || string == null) {
                return null;
            }
            return new AccessToken(strM13081f, str, string, listM12775f, listM12775f2, listM12775f3, aVar.m13080e(bundle), aVar.m13078c(bundle), aVar.m13079d(bundle), null, null, 1024, null);
        }

        /* renamed from: d */
        public final void m12773d() {
            AccessToken accessTokenM12960i = C10772b.f11380f.m12973e().m12960i();
            if (accessTokenM12960i != null) {
                m12778i(m12770a(accessTokenM12960i));
            }
        }

        /* renamed from: e */
        public final AccessToken m12774e() {
            return C10772b.f11380f.m12973e().m12960i();
        }

        /* renamed from: f */
        public final List m12775f(Bundle bundle, String str) {
            sq8.m48649h(bundle, "bundle");
            ArrayList<String> stringArrayList = bundle.getStringArrayList(str);
            if (stringArrayList == null) {
                return ch3.m21246k();
            }
            List listUnmodifiableList = Collections.unmodifiableList(new ArrayList(stringArrayList));
            sq8.m48648g(listUnmodifiableList, "{\n            Collection…Permissions))\n          }");
            return listUnmodifiableList;
        }

        /* renamed from: g */
        public final boolean m12776g() {
            AccessToken accessTokenM12960i = C10772b.f11380f.m12973e().m12960i();
            return (accessTokenM12960i == null || accessTokenM12960i.m12762n()) ? false : true;
        }

        /* renamed from: h */
        public final boolean m12777h() {
            AccessToken accessTokenM12960i = C10772b.f11380f.m12973e().m12960i();
            return (accessTokenM12960i == null || accessTokenM12960i.m12762n() || !accessTokenM12960i.m12763o()) ? false : true;
        }

        /* renamed from: i */
        public final void m12778i(AccessToken accessToken) {
            C10772b.f11380f.m12973e().m12965r(accessToken);
        }
    }

    /* renamed from: com.facebook.AccessToken$d */
    public /* synthetic */ class C10743d {

        /* renamed from: a */
        public static final /* synthetic */ int[] f11254a;

        static {
            int[] iArr = new int[za.values().length];
            try {
                iArr[za.FACEBOOK_APPLICATION_WEB.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[za.CHROME_CUSTOM_TAB.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[za.WEB_VIEW.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f11254a = iArr;
        }
    }

    static {
        Date date = new Date(Long.MAX_VALUE);
        f11238H = date;
        f11239L = date;
        f11240M = new Date();
        f11241Q = za.FACEBOOK_APPLICATION_WEB;
        CREATOR = new C10741b();
    }

    public /* synthetic */ AccessToken(String str, String str2, String str3, Collection collection, Collection collection2, Collection collection3, za zaVar, Date date, Date date2, Date date3, String str4, int i, id5 id5Var) {
        this(str, str2, str3, collection, collection2, collection3, zaVar, date, date2, date3, (i & 1024) != 0 ? "facebook" : str4);
    }

    /* renamed from: a */
    public final void m12749a(StringBuilder sb) {
        sb.append(" permissions:");
        sb.append("[");
        sb.append(TextUtils.join(", ", this.f11244b));
        sb.append("]");
    }

    /* renamed from: b */
    public final za m12750b(za zaVar, String str) {
        if (str == null || !str.equals("instagram")) {
            return zaVar;
        }
        int i = C10743d.f11254a[zaVar.ordinal()];
        return i != 1 ? i != 2 ? i != 3 ? zaVar : za.INSTAGRAM_WEB_VIEW : za.INSTAGRAM_CUSTOM_CHROME_TAB : za.INSTAGRAM_APPLICATION_WEB;
    }

    /* renamed from: c */
    public final String m12751c() {
        return this.f11250h;
    }

    /* renamed from: d */
    public final Date m12752d() {
        return this.f11252s;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    /* renamed from: e */
    public final Set m12753e() {
        return this.f11245c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AccessToken)) {
            return false;
        }
        AccessToken accessToken = (AccessToken) obj;
        if (sq8.m48644c(this.f11243a, accessToken.f11243a) && sq8.m48644c(this.f11244b, accessToken.f11244b) && sq8.m48644c(this.f11245c, accessToken.f11245c) && sq8.m48644c(this.f11246d, accessToken.f11246d) && sq8.m48644c(this.f11247e, accessToken.f11247e) && this.f11248f == accessToken.f11248f && sq8.m48644c(this.f11249g, accessToken.f11249g) && sq8.m48644c(this.f11250h, accessToken.f11250h) && sq8.m48644c(this.f11251q, accessToken.f11251q) && sq8.m48644c(this.f11252s, accessToken.f11252s)) {
            String str = this.f11253x;
            String str2 = accessToken.f11253x;
            if (str == null ? str2 == null : sq8.m48644c(str, str2)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: f */
    public final Set m12754f() {
        return this.f11246d;
    }

    /* renamed from: g */
    public final Date m12755g() {
        return this.f11243a;
    }

    /* renamed from: h */
    public final String m12756h() {
        return this.f11253x;
    }

    public int hashCode() {
        int iHashCode = (((((((((((((((((((527 + this.f11243a.hashCode()) * 31) + this.f11244b.hashCode()) * 31) + this.f11245c.hashCode()) * 31) + this.f11246d.hashCode()) * 31) + this.f11247e.hashCode()) * 31) + this.f11248f.hashCode()) * 31) + this.f11249g.hashCode()) * 31) + this.f11250h.hashCode()) * 31) + this.f11251q.hashCode()) * 31) + this.f11252s.hashCode()) * 31;
        String str = this.f11253x;
        return iHashCode + (str != null ? str.hashCode() : 0);
    }

    /* renamed from: i */
    public final Date m12757i() {
        return this.f11249g;
    }

    /* renamed from: j */
    public final Set m12758j() {
        return this.f11244b;
    }

    /* renamed from: k */
    public final za m12759k() {
        return this.f11248f;
    }

    /* renamed from: l */
    public final String m12760l() {
        return this.f11247e;
    }

    /* renamed from: m */
    public final String m12761m() {
        return this.f11251q;
    }

    /* renamed from: n */
    public final boolean m12762n() {
        return new Date().after(this.f11243a);
    }

    /* renamed from: o */
    public final boolean m12763o() {
        String str = this.f11253x;
        return str != null && str.equals("instagram");
    }

    /* renamed from: p */
    public final JSONObject m12764p() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put(ClientCookie.VERSION_ATTR, 1);
        jSONObject.put(AWSCognitoLegacyCredentialStore.TOKEN_KEY, this.f11247e);
        jSONObject.put("expires_at", this.f11243a.getTime());
        jSONObject.put("permissions", new JSONArray((Collection) this.f11244b));
        jSONObject.put("declined_permissions", new JSONArray((Collection) this.f11245c));
        jSONObject.put("expired_permissions", new JSONArray((Collection) this.f11246d));
        jSONObject.put("last_refresh", this.f11249g.getTime());
        jSONObject.put("source", this.f11248f.name());
        jSONObject.put("application_id", this.f11250h);
        jSONObject.put("user_id", this.f11251q);
        jSONObject.put("data_access_expiration_time", this.f11252s.getTime());
        String str = this.f11253x;
        if (str != null) {
            jSONObject.put("graph_domain", str);
        }
        return jSONObject;
    }

    /* renamed from: q */
    public final String m12765q() {
        return C10773c.m12995I(bka.INCLUDE_ACCESS_TOKENS) ? this.f11247e : "ACCESS_TOKEN_REMOVED";
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{AccessToken");
        sb.append(" token:");
        sb.append(m12765q());
        m12749a(sb);
        sb.append("}");
        String string = sb.toString();
        sq8.m48648g(string, "builder.toString()");
        return string;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        sq8.m48649h(parcel, "dest");
        parcel.writeLong(this.f11243a.getTime());
        parcel.writeStringList(new ArrayList(this.f11244b));
        parcel.writeStringList(new ArrayList(this.f11245c));
        parcel.writeStringList(new ArrayList(this.f11246d));
        parcel.writeString(this.f11247e);
        parcel.writeString(this.f11248f.name());
        parcel.writeLong(this.f11249g.getTime());
        parcel.writeString(this.f11250h);
        parcel.writeString(this.f11251q);
        parcel.writeLong(this.f11252s.getTime());
        parcel.writeString(this.f11253x);
    }

    public AccessToken(String str, String str2, String str3, Collection collection, Collection collection2, Collection collection3, za zaVar, Date date, Date date2, Date date3, String str4) {
        sq8.m48649h(str, "accessToken");
        sq8.m48649h(str2, "applicationId");
        sq8.m48649h(str3, "userId");
        rri.m47112g(str, "accessToken");
        rri.m47112g(str2, "applicationId");
        rri.m47112g(str3, "userId");
        this.f11243a = date == null ? f11239L : date;
        Set setUnmodifiableSet = Collections.unmodifiableSet(collection != null ? new HashSet(collection) : new HashSet());
        sq8.m48648g(setUnmodifiableSet, "unmodifiableSet(if (perm…missions) else HashSet())");
        this.f11244b = setUnmodifiableSet;
        Set setUnmodifiableSet2 = Collections.unmodifiableSet(collection2 != null ? new HashSet(collection2) : new HashSet());
        sq8.m48648g(setUnmodifiableSet2, "unmodifiableSet(\n       …missions) else HashSet())");
        this.f11245c = setUnmodifiableSet2;
        Set setUnmodifiableSet3 = Collections.unmodifiableSet(collection3 != null ? new HashSet(collection3) : new HashSet());
        sq8.m48648g(setUnmodifiableSet3, "unmodifiableSet(\n       …missions) else HashSet())");
        this.f11246d = setUnmodifiableSet3;
        this.f11247e = str;
        this.f11248f = m12750b(zaVar == null ? f11241Q : zaVar, str4);
        this.f11249g = date2 == null ? f11240M : date2;
        this.f11250h = str2;
        this.f11251q = str3;
        this.f11252s = (date3 == null || date3.getTime() == 0) ? f11239L : date3;
        this.f11253x = str4 == null ? "facebook" : str4;
    }

    public AccessToken(Parcel parcel) {
        za zaVarValueOf;
        sq8.m48649h(parcel, "parcel");
        this.f11243a = new Date(parcel.readLong());
        ArrayList arrayList = new ArrayList();
        parcel.readStringList(arrayList);
        Set setUnmodifiableSet = Collections.unmodifiableSet(new HashSet(arrayList));
        sq8.m48648g(setUnmodifiableSet, "unmodifiableSet(HashSet(permissionsList))");
        this.f11244b = setUnmodifiableSet;
        arrayList.clear();
        parcel.readStringList(arrayList);
        Set setUnmodifiableSet2 = Collections.unmodifiableSet(new HashSet(arrayList));
        sq8.m48648g(setUnmodifiableSet2, "unmodifiableSet(HashSet(permissionsList))");
        this.f11245c = setUnmodifiableSet2;
        arrayList.clear();
        parcel.readStringList(arrayList);
        Set setUnmodifiableSet3 = Collections.unmodifiableSet(new HashSet(arrayList));
        sq8.m48648g(setUnmodifiableSet3, "unmodifiableSet(HashSet(permissionsList))");
        this.f11246d = setUnmodifiableSet3;
        this.f11247e = rri.m47116k(parcel.readString(), AWSCognitoLegacyCredentialStore.TOKEN_KEY);
        String string = parcel.readString();
        if (string != null) {
            zaVarValueOf = za.valueOf(string);
        } else {
            zaVarValueOf = f11241Q;
        }
        this.f11248f = zaVarValueOf;
        this.f11249g = new Date(parcel.readLong());
        this.f11250h = rri.m47116k(parcel.readString(), "applicationId");
        this.f11251q = rri.m47116k(parcel.readString(), "userId");
        this.f11252s = new Date(parcel.readLong());
        this.f11253x = parcel.readString();
    }
}
