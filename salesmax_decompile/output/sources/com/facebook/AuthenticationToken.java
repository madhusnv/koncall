package com.facebook;

import android.os.Parcel;
import android.os.Parcelable;
import com.amplifyframework.auth.cognito.data.AWSCognitoLegacyCredentialStore;
import java.io.IOException;
import java.security.spec.InvalidKeySpecException;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;
import p001o.dac;
import p001o.f9g;
import p001o.id5;
import p001o.rri;
import p001o.sq8;

/* loaded from: classes5.dex */
public final class AuthenticationToken implements Parcelable {

    /* renamed from: a */
    public final String f11256a;

    /* renamed from: b */
    public final String f11257b;

    /* renamed from: c */
    public final AuthenticationTokenHeader f11258c;

    /* renamed from: d */
    public final AuthenticationTokenClaims f11259d;

    /* renamed from: e */
    public final String f11260e;

    /* renamed from: f */
    public static final C10745b f11255f = new C10745b(null);
    public static final Parcelable.Creator<AuthenticationToken> CREATOR = new C10744a();

    /* renamed from: com.facebook.AuthenticationToken$a */
    public static final class C10744a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public AuthenticationToken createFromParcel(Parcel parcel) {
            sq8.m48649h(parcel, "source");
            return new AuthenticationToken(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public AuthenticationToken[] newArray(int i) {
            return new AuthenticationToken[i];
        }
    }

    /* renamed from: com.facebook.AuthenticationToken$b */
    public static final class C10745b {
        public C10745b() {
        }

        public /* synthetic */ C10745b(id5 id5Var) {
            this();
        }

        /* renamed from: a */
        public final void m12783a(AuthenticationToken authenticationToken) {
            AuthenticationTokenManager.f11284d.m12800a().m12798e(authenticationToken);
        }
    }

    public AuthenticationToken(String str, String str2) {
        sq8.m48649h(str, AWSCognitoLegacyCredentialStore.TOKEN_KEY);
        sq8.m48649h(str2, "expectedNonce");
        rri.m47112g(str, AWSCognitoLegacyCredentialStore.TOKEN_KEY);
        rri.m47112g(str2, "expectedNonce");
        List listD0 = f9g.D0(str, new String[]{"."}, false, 0, 6, null);
        if (!(listD0.size() == 3)) {
            throw new IllegalArgumentException("Invalid IdToken string".toString());
        }
        String str3 = (String) listD0.get(0);
        String str4 = (String) listD0.get(1);
        String str5 = (String) listD0.get(2);
        this.f11256a = str;
        this.f11257b = str2;
        AuthenticationTokenHeader authenticationTokenHeader = new AuthenticationTokenHeader(str3);
        this.f11258c = authenticationTokenHeader;
        this.f11259d = new AuthenticationTokenClaims(str4, str2);
        if (!m12779a(str3, str4, str5, authenticationTokenHeader.m12789a())) {
            throw new IllegalArgumentException("Invalid Signature".toString());
        }
        this.f11260e = str5;
    }

    /* renamed from: a */
    public final boolean m12779a(String str, String str2, String str3, String str4) {
        try {
            String strM22705c = dac.m22705c(str4);
            if (strM22705c == null) {
                return false;
            }
            return dac.m22707e(dac.m22704b(strM22705c), str + '.' + str2, str3);
        } catch (IOException | InvalidKeySpecException unused) {
            return false;
        }
    }

    /* renamed from: b */
    public final JSONObject m12780b() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("token_string", this.f11256a);
        jSONObject.put("expected_nonce", this.f11257b);
        jSONObject.put("header", this.f11258c.m12791c());
        jSONObject.put("claims", this.f11259d.m12785b());
        jSONObject.put("signature", this.f11260e);
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
        if (!(obj instanceof AuthenticationToken)) {
            return false;
        }
        AuthenticationToken authenticationToken = (AuthenticationToken) obj;
        return sq8.m48644c(this.f11256a, authenticationToken.f11256a) && sq8.m48644c(this.f11257b, authenticationToken.f11257b) && sq8.m48644c(this.f11258c, authenticationToken.f11258c) && sq8.m48644c(this.f11259d, authenticationToken.f11259d) && sq8.m48644c(this.f11260e, authenticationToken.f11260e);
    }

    public int hashCode() {
        return ((((((((527 + this.f11256a.hashCode()) * 31) + this.f11257b.hashCode()) * 31) + this.f11258c.hashCode()) * 31) + this.f11259d.hashCode()) * 31) + this.f11260e.hashCode();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        sq8.m48649h(parcel, "dest");
        parcel.writeString(this.f11256a);
        parcel.writeString(this.f11257b);
        parcel.writeParcelable(this.f11258c, i);
        parcel.writeParcelable(this.f11259d, i);
        parcel.writeString(this.f11260e);
    }

    public AuthenticationToken(Parcel parcel) {
        sq8.m48649h(parcel, "parcel");
        this.f11256a = rri.m47116k(parcel.readString(), AWSCognitoLegacyCredentialStore.TOKEN_KEY);
        this.f11257b = rri.m47116k(parcel.readString(), "expectedNonce");
        Parcelable parcelable = parcel.readParcelable(AuthenticationTokenHeader.class.getClassLoader());
        if (parcelable != null) {
            this.f11258c = (AuthenticationTokenHeader) parcelable;
            Parcelable parcelable2 = parcel.readParcelable(AuthenticationTokenClaims.class.getClassLoader());
            if (parcelable2 != null) {
                this.f11259d = (AuthenticationTokenClaims) parcelable2;
                this.f11260e = rri.m47116k(parcel.readString(), "signature");
                return;
            }
            throw new IllegalStateException("Required value was null.".toString());
        }
        throw new IllegalStateException("Required value was null.".toString());
    }
}
