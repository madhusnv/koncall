package com.facebook;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.Base64;
import com.google.android.gms.fido.u2f.api.common.ClientData;
import org.json.JSONException;
import org.json.JSONObject;
import p001o.id5;
import p001o.rri;
import p001o.sh2;
import p001o.sq8;

/* loaded from: classes5.dex */
public final class AuthenticationTokenHeader implements Parcelable {

    /* renamed from: a */
    public final String f11281a;

    /* renamed from: b */
    public final String f11282b;

    /* renamed from: c */
    public final String f11283c;

    /* renamed from: d */
    public static final C10749b f11280d = new C10749b(null);
    public static final Parcelable.Creator<AuthenticationTokenHeader> CREATOR = new C10748a();

    /* renamed from: com.facebook.AuthenticationTokenHeader$a */
    public static final class C10748a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public AuthenticationTokenHeader createFromParcel(Parcel parcel) {
            sq8.m48649h(parcel, "source");
            return new AuthenticationTokenHeader(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public AuthenticationTokenHeader[] newArray(int i) {
            return new AuthenticationTokenHeader[i];
        }
    }

    /* renamed from: com.facebook.AuthenticationTokenHeader$b */
    public static final class C10749b {
        public C10749b() {
        }

        public /* synthetic */ C10749b(id5 id5Var) {
            this();
        }
    }

    public AuthenticationTokenHeader(String str) throws JSONException {
        sq8.m48649h(str, "encodedHeaderString");
        if (!m12790b(str)) {
            throw new IllegalArgumentException("Invalid Header".toString());
        }
        byte[] bArrDecode = Base64.decode(str, 0);
        sq8.m48648g(bArrDecode, "decodedBytes");
        JSONObject jSONObject = new JSONObject(new String(bArrDecode, sh2.f45422b));
        String string = jSONObject.getString("alg");
        sq8.m48648g(string, "jsonObj.getString(\"alg\")");
        this.f11281a = string;
        String string2 = jSONObject.getString(ClientData.KEY_TYPE);
        sq8.m48648g(string2, "jsonObj.getString(\"typ\")");
        this.f11282b = string2;
        String string3 = jSONObject.getString("kid");
        sq8.m48648g(string3, "jsonObj.getString(\"kid\")");
        this.f11283c = string3;
    }

    /* renamed from: a */
    public final String m12789a() {
        return this.f11283c;
    }

    /* renamed from: b */
    public final boolean m12790b(String str) {
        rri.m47112g(str, "encodedHeaderString");
        byte[] bArrDecode = Base64.decode(str, 0);
        sq8.m48648g(bArrDecode, "decodedBytes");
        try {
            JSONObject jSONObject = new JSONObject(new String(bArrDecode, sh2.f45422b));
            String strOptString = jSONObject.optString("alg");
            sq8.m48648g(strOptString, "alg");
            boolean z = (strOptString.length() > 0) && sq8.m48644c(strOptString, "RS256");
            String strOptString2 = jSONObject.optString("kid");
            sq8.m48648g(strOptString2, "jsonObj.optString(\"kid\")");
            boolean z2 = strOptString2.length() > 0;
            String strOptString3 = jSONObject.optString(ClientData.KEY_TYPE);
            sq8.m48648g(strOptString3, "jsonObj.optString(\"typ\")");
            return z && z2 && (strOptString3.length() > 0);
        } catch (JSONException unused) {
            return false;
        }
    }

    /* renamed from: c */
    public final JSONObject m12791c() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("alg", this.f11281a);
        jSONObject.put(ClientData.KEY_TYPE, this.f11282b);
        jSONObject.put("kid", this.f11283c);
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
        if (!(obj instanceof AuthenticationTokenHeader)) {
            return false;
        }
        AuthenticationTokenHeader authenticationTokenHeader = (AuthenticationTokenHeader) obj;
        return sq8.m48644c(this.f11281a, authenticationTokenHeader.f11281a) && sq8.m48644c(this.f11282b, authenticationTokenHeader.f11282b) && sq8.m48644c(this.f11283c, authenticationTokenHeader.f11283c);
    }

    public int hashCode() {
        return ((((527 + this.f11281a.hashCode()) * 31) + this.f11282b.hashCode()) * 31) + this.f11283c.hashCode();
    }

    public String toString() {
        String string = m12791c().toString();
        sq8.m48648g(string, "headerJsonObject.toString()");
        return string;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        sq8.m48649h(parcel, "dest");
        parcel.writeString(this.f11281a);
        parcel.writeString(this.f11282b);
        parcel.writeString(this.f11283c);
    }

    public AuthenticationTokenHeader(Parcel parcel) {
        sq8.m48649h(parcel, "parcel");
        this.f11281a = rri.m47116k(parcel.readString(), "alg");
        this.f11282b = rri.m47116k(parcel.readString(), ClientData.KEY_TYPE);
        this.f11283c = rri.m47116k(parcel.readString(), "kid");
    }
}
