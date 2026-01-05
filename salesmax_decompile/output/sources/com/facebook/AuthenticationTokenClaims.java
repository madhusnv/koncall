package com.facebook;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.Base64;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p001o.cl8;
import p001o.cri;
import p001o.h8g;
import p001o.id5;
import p001o.rri;
import p001o.sh2;
import p001o.sq8;

/* loaded from: classes5.dex */
public final class AuthenticationTokenClaims implements Parcelable {

    /* renamed from: H */
    public final String f11261H;

    /* renamed from: L */
    public final Set f11262L;

    /* renamed from: M */
    public final String f11263M;

    /* renamed from: Q */
    public final Map f11264Q;

    /* renamed from: X */
    public final Map f11265X;

    /* renamed from: Y */
    public final Map f11266Y;

    /* renamed from: Z */
    public final String f11267Z;

    /* renamed from: a */
    public final String f11268a;

    /* renamed from: b */
    public final String f11269b;

    /* renamed from: c */
    public final String f11270c;

    /* renamed from: d */
    public final String f11271d;

    /* renamed from: e */
    public final long f11272e;

    /* renamed from: f */
    public final long f11273f;

    /* renamed from: g */
    public final String f11274g;

    /* renamed from: h */
    public final String f11275h;
    public final String h0;

    /* renamed from: q */
    public final String f11276q;

    /* renamed from: s */
    public final String f11277s;

    /* renamed from: x */
    public final String f11278x;

    /* renamed from: y */
    public final String f11279y;
    public static final C10747b i0 = new C10747b(null);
    public static final Parcelable.Creator<AuthenticationTokenClaims> CREATOR = new C10746a();

    /* renamed from: com.facebook.AuthenticationTokenClaims$a */
    public static final class C10746a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public AuthenticationTokenClaims createFromParcel(Parcel parcel) {
            sq8.m48649h(parcel, "source");
            return new AuthenticationTokenClaims(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public AuthenticationTokenClaims[] newArray(int i) {
            return new AuthenticationTokenClaims[i];
        }
    }

    /* renamed from: com.facebook.AuthenticationTokenClaims$b */
    public static final class C10747b {
        public C10747b() {
        }

        public /* synthetic */ C10747b(id5 id5Var) {
            this();
        }

        /* renamed from: a */
        public final String m12788a(JSONObject jSONObject, String str) {
            sq8.m48649h(jSONObject, "<this>");
            sq8.m48649h(str, "name");
            if (jSONObject.has(str)) {
                return jSONObject.getString(str);
            }
            return null;
        }
    }

    public AuthenticationTokenClaims(String str, String str2) throws JSONException {
        sq8.m48649h(str, "encodedClaims");
        sq8.m48649h(str2, "expectedNonce");
        rri.m47112g(str, "encodedClaims");
        byte[] bArrDecode = Base64.decode(str, 8);
        sq8.m48648g(bArrDecode, "decodedBytes");
        JSONObject jSONObject = new JSONObject(new String(bArrDecode, sh2.f45422b));
        if (!m12784a(jSONObject, str2)) {
            throw new IllegalArgumentException("Invalid claims".toString());
        }
        String string = jSONObject.getString("jti");
        sq8.m48648g(string, "jsonObj.getString(JSON_KEY_JIT)");
        this.f11268a = string;
        String string2 = jSONObject.getString("iss");
        sq8.m48648g(string2, "jsonObj.getString(JSON_KEY_ISS)");
        this.f11269b = string2;
        String string3 = jSONObject.getString("aud");
        sq8.m48648g(string3, "jsonObj.getString(JSON_KEY_AUD)");
        this.f11270c = string3;
        String string4 = jSONObject.getString("nonce");
        sq8.m48648g(string4, "jsonObj.getString(JSON_KEY_NONCE)");
        this.f11271d = string4;
        this.f11272e = jSONObject.getLong("exp");
        this.f11273f = jSONObject.getLong("iat");
        String string5 = jSONObject.getString("sub");
        sq8.m48648g(string5, "jsonObj.getString(JSON_KEY_SUB)");
        this.f11274g = string5;
        C10747b c10747b = i0;
        this.f11275h = c10747b.m12788a(jSONObject, "name");
        this.f11276q = c10747b.m12788a(jSONObject, "given_name");
        this.f11277s = c10747b.m12788a(jSONObject, "middle_name");
        this.f11278x = c10747b.m12788a(jSONObject, "family_name");
        this.f11279y = c10747b.m12788a(jSONObject, "email");
        this.f11261H = c10747b.m12788a(jSONObject, "picture");
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("user_friends");
        this.f11262L = jSONArrayOptJSONArray == null ? null : Collections.unmodifiableSet(cri.g0(jSONArrayOptJSONArray));
        this.f11263M = c10747b.m12788a(jSONObject, "user_birthday");
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("user_age_range");
        this.f11264Q = jSONObjectOptJSONObject == null ? null : Collections.unmodifiableMap(cri.m21668o(jSONObjectOptJSONObject));
        JSONObject jSONObjectOptJSONObject2 = jSONObject.optJSONObject("user_hometown");
        this.f11265X = jSONObjectOptJSONObject2 == null ? null : Collections.unmodifiableMap(cri.m21669p(jSONObjectOptJSONObject2));
        JSONObject jSONObjectOptJSONObject3 = jSONObject.optJSONObject("user_location");
        this.f11266Y = jSONObjectOptJSONObject3 != null ? Collections.unmodifiableMap(cri.m21669p(jSONObjectOptJSONObject3)) : null;
        this.f11267Z = c10747b.m12788a(jSONObject, "user_gender");
        this.h0 = c10747b.m12788a(jSONObject, "user_link");
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0052  */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean m12784a(JSONObject jSONObject, String str) {
        if (jSONObject == null) {
            return false;
        }
        String strOptString = jSONObject.optString("jti");
        sq8.m48648g(strOptString, "jti");
        if (strOptString.length() == 0) {
            return false;
        }
        try {
            String strOptString2 = jSONObject.optString("iss");
            sq8.m48648g(strOptString2, "iss");
            if (!(strOptString2.length() == 0)) {
                if (!sq8.m48644c(new URL(strOptString2).getHost(), "facebook.com")) {
                    if (sq8.m48644c(new URL(strOptString2).getHost(), "www.facebook.com")) {
                        String strOptString3 = jSONObject.optString("aud");
                        sq8.m48648g(strOptString3, "aud");
                        if (!(strOptString3.length() == 0) && sq8.m48644c(strOptString3, C10773c.m13020m())) {
                            long j = 1000;
                            if (new Date().after(new Date(jSONObject.optLong("exp") * j))) {
                                return false;
                            }
                            if (new Date().after(new Date((jSONObject.optLong("iat") * j) + 600000))) {
                                return false;
                            }
                            String strOptString4 = jSONObject.optString("sub");
                            sq8.m48648g(strOptString4, "sub");
                            if (strOptString4.length() == 0) {
                                return false;
                            }
                            String strOptString5 = jSONObject.optString("nonce");
                            sq8.m48648g(strOptString5, "nonce");
                            if (!(strOptString5.length() == 0) && sq8.m48644c(strOptString5, str)) {
                                return true;
                            }
                        }
                    }
                }
            }
        } catch (MalformedURLException unused) {
        }
        return false;
    }

    /* renamed from: b */
    public final JSONObject m12785b() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("jti", this.f11268a);
        jSONObject.put("iss", this.f11269b);
        jSONObject.put("aud", this.f11270c);
        jSONObject.put("nonce", this.f11271d);
        jSONObject.put("exp", this.f11272e);
        jSONObject.put("iat", this.f11273f);
        String str = this.f11274g;
        if (str != null) {
            jSONObject.put("sub", str);
        }
        String str2 = this.f11275h;
        if (str2 != null) {
            jSONObject.put("name", str2);
        }
        String str3 = this.f11276q;
        if (str3 != null) {
            jSONObject.put("given_name", str3);
        }
        String str4 = this.f11277s;
        if (str4 != null) {
            jSONObject.put("middle_name", str4);
        }
        String str5 = this.f11278x;
        if (str5 != null) {
            jSONObject.put("family_name", str5);
        }
        String str6 = this.f11279y;
        if (str6 != null) {
            jSONObject.put("email", str6);
        }
        String str7 = this.f11261H;
        if (str7 != null) {
            jSONObject.put("picture", str7);
        }
        if (this.f11262L != null) {
            jSONObject.put("user_friends", new JSONArray((Collection) this.f11262L));
        }
        String str8 = this.f11263M;
        if (str8 != null) {
            jSONObject.put("user_birthday", str8);
        }
        if (this.f11264Q != null) {
            jSONObject.put("user_age_range", new JSONObject(this.f11264Q));
        }
        if (this.f11265X != null) {
            jSONObject.put("user_hometown", new JSONObject(this.f11265X));
        }
        if (this.f11266Y != null) {
            jSONObject.put("user_location", new JSONObject(this.f11266Y));
        }
        String str9 = this.f11267Z;
        if (str9 != null) {
            jSONObject.put("user_gender", str9);
        }
        String str10 = this.h0;
        if (str10 != null) {
            jSONObject.put("user_link", str10);
        }
        return jSONObject;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AuthenticationTokenClaims)) {
            return false;
        }
        AuthenticationTokenClaims authenticationTokenClaims = (AuthenticationTokenClaims) obj;
        return sq8.m48644c(this.f11268a, authenticationTokenClaims.f11268a) && sq8.m48644c(this.f11269b, authenticationTokenClaims.f11269b) && sq8.m48644c(this.f11270c, authenticationTokenClaims.f11270c) && sq8.m48644c(this.f11271d, authenticationTokenClaims.f11271d) && this.f11272e == authenticationTokenClaims.f11272e && this.f11273f == authenticationTokenClaims.f11273f && sq8.m48644c(this.f11274g, authenticationTokenClaims.f11274g) && sq8.m48644c(this.f11275h, authenticationTokenClaims.f11275h) && sq8.m48644c(this.f11276q, authenticationTokenClaims.f11276q) && sq8.m48644c(this.f11277s, authenticationTokenClaims.f11277s) && sq8.m48644c(this.f11278x, authenticationTokenClaims.f11278x) && sq8.m48644c(this.f11279y, authenticationTokenClaims.f11279y) && sq8.m48644c(this.f11261H, authenticationTokenClaims.f11261H) && sq8.m48644c(this.f11262L, authenticationTokenClaims.f11262L) && sq8.m48644c(this.f11263M, authenticationTokenClaims.f11263M) && sq8.m48644c(this.f11264Q, authenticationTokenClaims.f11264Q) && sq8.m48644c(this.f11265X, authenticationTokenClaims.f11265X) && sq8.m48644c(this.f11266Y, authenticationTokenClaims.f11266Y) && sq8.m48644c(this.f11267Z, authenticationTokenClaims.f11267Z) && sq8.m48644c(this.h0, authenticationTokenClaims.h0);
    }

    public int hashCode() {
        int iHashCode = (((((((((((((527 + this.f11268a.hashCode()) * 31) + this.f11269b.hashCode()) * 31) + this.f11270c.hashCode()) * 31) + this.f11271d.hashCode()) * 31) + Long.hashCode(this.f11272e)) * 31) + Long.hashCode(this.f11273f)) * 31) + this.f11274g.hashCode()) * 31;
        String str = this.f11275h;
        int iHashCode2 = (iHashCode + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f11276q;
        int iHashCode3 = (iHashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f11277s;
        int iHashCode4 = (iHashCode3 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.f11278x;
        int iHashCode5 = (iHashCode4 + (str4 != null ? str4.hashCode() : 0)) * 31;
        String str5 = this.f11279y;
        int iHashCode6 = (iHashCode5 + (str5 != null ? str5.hashCode() : 0)) * 31;
        String str6 = this.f11261H;
        int iHashCode7 = (iHashCode6 + (str6 != null ? str6.hashCode() : 0)) * 31;
        Set set = this.f11262L;
        int iHashCode8 = (iHashCode7 + (set != null ? set.hashCode() : 0)) * 31;
        String str7 = this.f11263M;
        int iHashCode9 = (iHashCode8 + (str7 != null ? str7.hashCode() : 0)) * 31;
        Map map = this.f11264Q;
        int iHashCode10 = (iHashCode9 + (map != null ? map.hashCode() : 0)) * 31;
        Map map2 = this.f11265X;
        int iHashCode11 = (iHashCode10 + (map2 != null ? map2.hashCode() : 0)) * 31;
        Map map3 = this.f11266Y;
        int iHashCode12 = (iHashCode11 + (map3 != null ? map3.hashCode() : 0)) * 31;
        String str8 = this.f11267Z;
        int iHashCode13 = (iHashCode12 + (str8 != null ? str8.hashCode() : 0)) * 31;
        String str9 = this.h0;
        return iHashCode13 + (str9 != null ? str9.hashCode() : 0);
    }

    public String toString() {
        String string = m12785b().toString();
        sq8.m48648g(string, "claimsJsonObject.toString()");
        return string;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        sq8.m48649h(parcel, "dest");
        parcel.writeString(this.f11268a);
        parcel.writeString(this.f11269b);
        parcel.writeString(this.f11270c);
        parcel.writeString(this.f11271d);
        parcel.writeLong(this.f11272e);
        parcel.writeLong(this.f11273f);
        parcel.writeString(this.f11274g);
        parcel.writeString(this.f11275h);
        parcel.writeString(this.f11276q);
        parcel.writeString(this.f11277s);
        parcel.writeString(this.f11278x);
        parcel.writeString(this.f11279y);
        parcel.writeString(this.f11261H);
        if (this.f11262L == null) {
            parcel.writeStringList(null);
        } else {
            parcel.writeStringList(new ArrayList(this.f11262L));
        }
        parcel.writeString(this.f11263M);
        parcel.writeMap(this.f11264Q);
        parcel.writeMap(this.f11265X);
        parcel.writeMap(this.f11266Y);
        parcel.writeString(this.f11267Z);
        parcel.writeString(this.h0);
    }

    public AuthenticationTokenClaims(Parcel parcel) {
        sq8.m48649h(parcel, "parcel");
        this.f11268a = rri.m47116k(parcel.readString(), "jti");
        this.f11269b = rri.m47116k(parcel.readString(), "iss");
        this.f11270c = rri.m47116k(parcel.readString(), "aud");
        this.f11271d = rri.m47116k(parcel.readString(), "nonce");
        this.f11272e = parcel.readLong();
        this.f11273f = parcel.readLong();
        this.f11274g = rri.m47116k(parcel.readString(), "sub");
        this.f11275h = parcel.readString();
        this.f11276q = parcel.readString();
        this.f11277s = parcel.readString();
        this.f11278x = parcel.readString();
        this.f11279y = parcel.readString();
        this.f11261H = parcel.readString();
        ArrayList<String> arrayListCreateStringArrayList = parcel.createStringArrayList();
        this.f11262L = arrayListCreateStringArrayList != null ? Collections.unmodifiableSet(new HashSet(arrayListCreateStringArrayList)) : null;
        this.f11263M = parcel.readString();
        HashMap hashMap = parcel.readHashMap(cl8.f18292a.getClass().getClassLoader());
        hashMap = hashMap instanceof HashMap ? hashMap : null;
        this.f11264Q = hashMap != null ? Collections.unmodifiableMap(hashMap) : null;
        h8g h8gVar = h8g.f26398a;
        HashMap hashMap2 = parcel.readHashMap(h8gVar.getClass().getClassLoader());
        hashMap2 = hashMap2 instanceof HashMap ? hashMap2 : null;
        this.f11265X = hashMap2 != null ? Collections.unmodifiableMap(hashMap2) : null;
        HashMap hashMap3 = parcel.readHashMap(h8gVar.getClass().getClassLoader());
        hashMap3 = hashMap3 instanceof HashMap ? hashMap3 : null;
        this.f11266Y = hashMap3 != null ? Collections.unmodifiableMap(hashMap3) : null;
        this.f11267Z = parcel.readString();
        this.h0 = parcel.readString();
    }
}
