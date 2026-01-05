package com.facebook;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.AccessToken;
import com.onesignal.session.internal.outcomes.impl.OutcomeConstants;
import org.json.JSONException;
import org.json.JSONObject;
import p001o.cri;
import p001o.de8;
import p001o.id5;
import p001o.rri;
import p001o.sq8;
import p001o.ur6;

/* loaded from: classes5.dex */
public final class Profile implements Parcelable {

    /* renamed from: a */
    public final String f11369a;

    /* renamed from: b */
    public final String f11370b;

    /* renamed from: c */
    public final String f11371c;

    /* renamed from: d */
    public final String f11372d;

    /* renamed from: e */
    public final String f11373e;

    /* renamed from: f */
    public final Uri f11374f;

    /* renamed from: g */
    public final Uri f11375g;

    /* renamed from: h */
    public static final C10770b f11367h = new C10770b(null);

    /* renamed from: q */
    public static final String f11368q = Profile.class.getSimpleName();
    public static final Parcelable.Creator<Profile> CREATOR = new C10769a();

    /* renamed from: com.facebook.Profile$a */
    public static final class C10769a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Profile createFromParcel(Parcel parcel) {
            sq8.m48649h(parcel, "source");
            return new Profile(parcel, null);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public Profile[] newArray(int i) {
            return new Profile[i];
        }
    }

    /* renamed from: com.facebook.Profile$b */
    public static final class C10770b {

        /* renamed from: com.facebook.Profile$b$a */
        public static final class a implements cri.InterfaceC12734a {
            @Override // p001o.cri.InterfaceC12734a
            /* renamed from: a */
            public void mo12937a(ur6 ur6Var) {
                String unused = Profile.f11368q;
                StringBuilder sb = new StringBuilder();
                sb.append("Got unexpected exception: ");
                sb.append(ur6Var);
            }

            @Override // p001o.cri.InterfaceC12734a
            /* renamed from: b */
            public void mo12938b(JSONObject jSONObject) {
                String strOptString = jSONObject != null ? jSONObject.optString(OutcomeConstants.OUTCOME_ID) : null;
                if (strOptString == null) {
                    String unused = Profile.f11368q;
                    return;
                }
                String strOptString2 = jSONObject.optString("link");
                String strOptString3 = jSONObject.optString("profile_picture", null);
                Profile.f11367h.m12936c(new Profile(strOptString, jSONObject.optString("first_name"), jSONObject.optString("middle_name"), jSONObject.optString("last_name"), jSONObject.optString("name"), strOptString2 != null ? Uri.parse(strOptString2) : null, strOptString3 != null ? Uri.parse(strOptString3) : null));
            }
        }

        public C10770b() {
        }

        public /* synthetic */ C10770b(id5 id5Var) {
            this();
        }

        /* renamed from: a */
        public final void m12934a() {
            AccessToken.C10742c c10742c = AccessToken.f11242y;
            AccessToken accessTokenM12774e = c10742c.m12774e();
            if (accessTokenM12774e == null) {
                return;
            }
            if (c10742c.m12776g()) {
                cri.m21645H(accessTokenM12774e.m12760l(), new a());
            } else {
                m12936c(null);
            }
        }

        /* renamed from: b */
        public final Profile m12935b() {
            return C10778h.f11447d.m13090a().m13085c();
        }

        /* renamed from: c */
        public final void m12936c(Profile profile) {
            C10778h.f11447d.m13090a().m13088f(profile);
        }
    }

    public /* synthetic */ Profile(Parcel parcel, id5 id5Var) {
        this(parcel);
    }

    /* renamed from: b */
    public final String m12928b() {
        return this.f11369a;
    }

    /* renamed from: c */
    public final String m12929c() {
        return this.f11373e;
    }

    /* renamed from: d */
    public final Uri m12930d(int i, int i2) {
        String strM12760l;
        Uri uri = this.f11375g;
        if (uri != null) {
            return uri;
        }
        AccessToken.C10742c c10742c = AccessToken.f11242y;
        if (c10742c.m12776g()) {
            AccessToken accessTokenM12774e = c10742c.m12774e();
            strM12760l = accessTokenM12774e != null ? accessTokenM12774e.m12760l() : null;
        } else {
            strM12760l = "";
        }
        return de8.f19636f.m22847a(this.f11369a, i, i2, strM12760l);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    /* renamed from: e */
    public final JSONObject m12931e() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(OutcomeConstants.OUTCOME_ID, this.f11369a);
            jSONObject.put("first_name", this.f11370b);
            jSONObject.put("middle_name", this.f11371c);
            jSONObject.put("last_name", this.f11372d);
            jSONObject.put("name", this.f11373e);
            Uri uri = this.f11374f;
            if (uri != null) {
                jSONObject.put("link_uri", uri.toString());
            }
            Uri uri2 = this.f11375g;
            if (uri2 != null) {
                jSONObject.put("picture_uri", uri2.toString());
            }
            return jSONObject;
        } catch (JSONException unused) {
            return null;
        }
    }

    public boolean equals(Object obj) {
        String str;
        String str2;
        String str3;
        String str4;
        Uri uri;
        Uri uri2;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Profile)) {
            return false;
        }
        String str5 = this.f11369a;
        return ((str5 == null && ((Profile) obj).f11369a == null) || sq8.m48644c(str5, ((Profile) obj).f11369a)) && (((str = this.f11370b) == null && ((Profile) obj).f11370b == null) || sq8.m48644c(str, ((Profile) obj).f11370b)) && ((((str2 = this.f11371c) == null && ((Profile) obj).f11371c == null) || sq8.m48644c(str2, ((Profile) obj).f11371c)) && ((((str3 = this.f11372d) == null && ((Profile) obj).f11372d == null) || sq8.m48644c(str3, ((Profile) obj).f11372d)) && ((((str4 = this.f11373e) == null && ((Profile) obj).f11373e == null) || sq8.m48644c(str4, ((Profile) obj).f11373e)) && ((((uri = this.f11374f) == null && ((Profile) obj).f11374f == null) || sq8.m48644c(uri, ((Profile) obj).f11374f)) && (((uri2 = this.f11375g) == null && ((Profile) obj).f11375g == null) || sq8.m48644c(uri2, ((Profile) obj).f11375g))))));
    }

    public int hashCode() {
        String str = this.f11369a;
        int iHashCode = 527 + (str != null ? str.hashCode() : 0);
        String str2 = this.f11370b;
        if (str2 != null) {
            iHashCode = (iHashCode * 31) + str2.hashCode();
        }
        String str3 = this.f11371c;
        if (str3 != null) {
            iHashCode = (iHashCode * 31) + str3.hashCode();
        }
        String str4 = this.f11372d;
        if (str4 != null) {
            iHashCode = (iHashCode * 31) + str4.hashCode();
        }
        String str5 = this.f11373e;
        if (str5 != null) {
            iHashCode = (iHashCode * 31) + str5.hashCode();
        }
        Uri uri = this.f11374f;
        if (uri != null) {
            iHashCode = (iHashCode * 31) + uri.hashCode();
        }
        Uri uri2 = this.f11375g;
        return uri2 != null ? (iHashCode * 31) + uri2.hashCode() : iHashCode;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        sq8.m48649h(parcel, "dest");
        parcel.writeString(this.f11369a);
        parcel.writeString(this.f11370b);
        parcel.writeString(this.f11371c);
        parcel.writeString(this.f11372d);
        parcel.writeString(this.f11373e);
        Uri uri = this.f11374f;
        parcel.writeString(uri != null ? uri.toString() : null);
        Uri uri2 = this.f11375g;
        parcel.writeString(uri2 != null ? uri2.toString() : null);
    }

    public Profile(String str, String str2, String str3, String str4, String str5, Uri uri, Uri uri2) {
        rri.m47116k(str, OutcomeConstants.OUTCOME_ID);
        this.f11369a = str;
        this.f11370b = str2;
        this.f11371c = str3;
        this.f11372d = str4;
        this.f11373e = str5;
        this.f11374f = uri;
        this.f11375g = uri2;
    }

    public Profile(JSONObject jSONObject) {
        sq8.m48649h(jSONObject, "jsonObject");
        this.f11369a = jSONObject.optString(OutcomeConstants.OUTCOME_ID, null);
        this.f11370b = jSONObject.optString("first_name", null);
        this.f11371c = jSONObject.optString("middle_name", null);
        this.f11372d = jSONObject.optString("last_name", null);
        this.f11373e = jSONObject.optString("name", null);
        String strOptString = jSONObject.optString("link_uri", null);
        this.f11374f = strOptString == null ? null : Uri.parse(strOptString);
        String strOptString2 = jSONObject.optString("picture_uri", null);
        this.f11375g = strOptString2 != null ? Uri.parse(strOptString2) : null;
    }

    public Profile(Parcel parcel) {
        this.f11369a = parcel.readString();
        this.f11370b = parcel.readString();
        this.f11371c = parcel.readString();
        this.f11372d = parcel.readString();
        this.f11373e = parcel.readString();
        String string = parcel.readString();
        this.f11374f = string == null ? null : Uri.parse(string);
        String string2 = parcel.readString();
        this.f11375g = string2 != null ? Uri.parse(string2) : null;
    }
}
