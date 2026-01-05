package com.google.android.gms.auth.api.signin;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.ReflectedParcelable;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import mf.C4721d;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import pg.AbstractC5932m;
import sf.AbstractC6840z;
import tf.AbstractC7149a;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
@Deprecated
/* loaded from: classes.dex */
public class GoogleSignInAccount extends AbstractC7149a implements ReflectedParcelable {
    public static final Parcelable.Creator<GoogleSignInAccount> CREATOR = new C4721d(0);

    /* renamed from: a */
    public final int f5958a;

    /* renamed from: b */
    public final String f5959b;

    /* renamed from: c */
    public final String f5960c;

    /* renamed from: d */
    public final String f5961d;

    /* renamed from: e */
    public final String f5962e;

    /* renamed from: f */
    public final Uri f5963f;

    /* renamed from: g */
    public String f5964g;

    /* renamed from: h */
    public final long f5965h;

    /* renamed from: j */
    public final String f5966j;

    /* renamed from: k */
    public final List f5967k;

    /* renamed from: l */
    public final String f5968l;

    /* renamed from: m */
    public final String f5969m;

    /* renamed from: n */
    public final HashSet f5970n = new HashSet();

    public GoogleSignInAccount(int i10, String str, String str2, String str3, String str4, Uri uri, String str5, long j6, String str6, ArrayList arrayList, String str7, String str8) {
        this.f5958a = i10;
        this.f5959b = str;
        this.f5960c = str2;
        this.f5961d = str3;
        this.f5962e = str4;
        this.f5963f = uri;
        this.f5964g = str5;
        this.f5965h = j6;
        this.f5966j = str6;
        this.f5967k = arrayList;
        this.f5968l = str7;
        this.f5969m = str8;
    }

    /* renamed from: b */
    public static GoogleSignInAccount m3086b(String str) throws JSONException, NumberFormatException {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        JSONObject jSONObject = new JSONObject(str);
        String strOptString = jSONObject.optString("photoUrl");
        Uri uri = !TextUtils.isEmpty(strOptString) ? Uri.parse(strOptString) : null;
        long j6 = Long.parseLong(jSONObject.getString("expirationTime"));
        HashSet hashSet = new HashSet();
        JSONArray jSONArray = jSONObject.getJSONArray("grantedScopes");
        int length = jSONArray.length();
        for (int i10 = 0; i10 < length; i10++) {
            hashSet.add(new Scope(1, jSONArray.getString(i10)));
        }
        String strOptString2 = jSONObject.optString("id");
        String strOptString3 = jSONObject.has("tokenId") ? jSONObject.optString("tokenId") : null;
        String strOptString4 = jSONObject.has("email") ? jSONObject.optString("email") : null;
        String strOptString5 = jSONObject.has("displayName") ? jSONObject.optString("displayName") : null;
        String strOptString6 = jSONObject.has("givenName") ? jSONObject.optString("givenName") : null;
        String strOptString7 = jSONObject.has("familyName") ? jSONObject.optString("familyName") : null;
        String string = jSONObject.getString("obfuscatedIdentifier");
        AbstractC6840z.m13033d(string);
        GoogleSignInAccount googleSignInAccount = new GoogleSignInAccount(3, strOptString2, strOptString3, strOptString4, strOptString5, uri, null, j6, string, new ArrayList(hashSet), strOptString6, strOptString7);
        googleSignInAccount.f5964g = jSONObject.has("serverAuthCode") ? jSONObject.optString("serverAuthCode") : null;
        return googleSignInAccount;
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof GoogleSignInAccount)) {
            return false;
        }
        GoogleSignInAccount googleSignInAccount = (GoogleSignInAccount) obj;
        if (!googleSignInAccount.f5966j.equals(this.f5966j)) {
            return false;
        }
        HashSet hashSet = new HashSet(googleSignInAccount.f5967k);
        hashSet.addAll(googleSignInAccount.f5970n);
        HashSet hashSet2 = new HashSet(this.f5967k);
        hashSet2.addAll(this.f5970n);
        return hashSet.equals(hashSet2);
    }

    public final int hashCode() {
        int iHashCode = this.f5966j.hashCode() + 527;
        HashSet hashSet = new HashSet(this.f5967k);
        hashSet.addAll(this.f5970n);
        return (iHashCode * 31) + hashSet.hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iM11783k = AbstractC5932m.m11783k(parcel, 20293);
        AbstractC5932m.m11785m(parcel, 1, 4);
        parcel.writeInt(this.f5958a);
        AbstractC5932m.m11778f(parcel, 2, this.f5959b);
        AbstractC5932m.m11778f(parcel, 3, this.f5960c);
        AbstractC5932m.m11778f(parcel, 4, this.f5961d);
        AbstractC5932m.m11778f(parcel, 5, this.f5962e);
        AbstractC5932m.m11777e(parcel, 6, this.f5963f, i10);
        AbstractC5932m.m11778f(parcel, 7, this.f5964g);
        AbstractC5932m.m11785m(parcel, 8, 8);
        parcel.writeLong(this.f5965h);
        AbstractC5932m.m11778f(parcel, 9, this.f5966j);
        AbstractC5932m.m11782j(parcel, 10, this.f5967k);
        AbstractC5932m.m11778f(parcel, 11, this.f5968l);
        AbstractC5932m.m11778f(parcel, 12, this.f5969m);
        AbstractC5932m.m11784l(parcel, iM11783k);
    }
}
