package com.google.android.gms.auth.api.signin;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.ReflectedParcelable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import mf.C4720c;
import mf.C4721d;
import nf.C5039a;
import org.json.JSONArray;
import org.json.JSONObject;
import pg.AbstractC5932m;
import qf.InterfaceC6203b;
import tf.AbstractC7149a;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
@Deprecated
/* loaded from: classes.dex */
public class GoogleSignInOptions extends AbstractC7149a implements InterfaceC6203b, ReflectedParcelable {
    public static final Parcelable.Creator<GoogleSignInOptions> CREATOR;

    /* renamed from: l */
    public static final GoogleSignInOptions f5971l;

    /* renamed from: m */
    public static final Scope f5972m;

    /* renamed from: n */
    public static final Scope f5973n;

    /* renamed from: p */
    public static final Scope f5974p;

    /* renamed from: q */
    public static final C4720c f5975q;

    /* renamed from: a */
    public final int f5976a;

    /* renamed from: b */
    public final ArrayList f5977b;

    /* renamed from: c */
    public final Account f5978c;

    /* renamed from: d */
    public final boolean f5979d;

    /* renamed from: e */
    public final boolean f5980e;

    /* renamed from: f */
    public final boolean f5981f;

    /* renamed from: g */
    public final String f5982g;

    /* renamed from: h */
    public final String f5983h;

    /* renamed from: j */
    public final ArrayList f5984j;

    /* renamed from: k */
    public final String f5985k;

    static {
        Scope scope = new Scope(1, "profile");
        new Scope(1, "email");
        Scope scope2 = new Scope(1, "openid");
        f5972m = scope2;
        Scope scope3 = new Scope(1, "https://www.googleapis.com/auth/games_lite");
        f5973n = scope3;
        f5974p = new Scope(1, "https://www.googleapis.com/auth/games");
        HashSet hashSet = new HashSet();
        HashMap map = new HashMap();
        hashSet.add(scope2);
        hashSet.add(scope);
        if (hashSet.contains(f5974p)) {
            Scope scope4 = f5973n;
            if (hashSet.contains(scope4)) {
                hashSet.remove(scope4);
            }
        }
        f5971l = new GoogleSignInOptions(3, new ArrayList(hashSet), null, false, false, false, null, null, map, null);
        HashSet hashSet2 = new HashSet();
        HashMap map2 = new HashMap();
        hashSet2.add(scope3);
        hashSet2.addAll(Arrays.asList(new Scope[0]));
        if (hashSet2.contains(f5974p)) {
            Scope scope5 = f5973n;
            if (hashSet2.contains(scope5)) {
                hashSet2.remove(scope5);
            }
        }
        new GoogleSignInOptions(3, new ArrayList(hashSet2), null, false, false, false, null, null, map2, null);
        CREATOR = new C4721d(1);
        f5975q = new C4720c(1);
    }

    public GoogleSignInOptions(int i10, ArrayList arrayList, Account account, boolean z6, boolean z10, boolean z11, String str, String str2, HashMap map, String str3) {
        this.f5976a = i10;
        this.f5977b = arrayList;
        this.f5978c = account;
        this.f5979d = z6;
        this.f5980e = z10;
        this.f5981f = z11;
        this.f5982g = str;
        this.f5983h = str2;
        this.f5984j = new ArrayList(map.values());
        this.f5985k = str3;
    }

    /* renamed from: b */
    public static GoogleSignInOptions m3087b(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        JSONObject jSONObject = new JSONObject(str);
        HashSet hashSet = new HashSet();
        JSONArray jSONArray = jSONObject.getJSONArray("scopes");
        int length = jSONArray.length();
        for (int i10 = 0; i10 < length; i10++) {
            hashSet.add(new Scope(1, jSONArray.getString(i10)));
        }
        String strOptString = jSONObject.has("accountName") ? jSONObject.optString("accountName") : null;
        return new GoogleSignInOptions(3, new ArrayList(hashSet), !TextUtils.isEmpty(strOptString) ? new Account(strOptString, "com.google") : null, jSONObject.getBoolean("idTokenRequested"), jSONObject.getBoolean("serverAuthRequested"), jSONObject.getBoolean("forceCodeForRefreshToken"), jSONObject.has("serverClientId") ? jSONObject.optString("serverClientId") : null, jSONObject.has("hostedDomain") ? jSONObject.optString("hostedDomain") : null, new HashMap(), null);
    }

    /* renamed from: c */
    public static HashMap m3088c(ArrayList arrayList) {
        HashMap map = new HashMap();
        if (arrayList != null) {
            int size = arrayList.size();
            int i10 = 0;
            while (i10 < size) {
                Object obj = arrayList.get(i10);
                i10++;
                C5039a c5039a = (C5039a) obj;
                map.put(Integer.valueOf(c5039a.f24797b), c5039a);
            }
        }
        return map;
    }

    public final boolean equals(Object obj) {
        String str = this.f5982g;
        ArrayList arrayList = this.f5977b;
        if (obj == null) {
            return false;
        }
        try {
            GoogleSignInOptions googleSignInOptions = (GoogleSignInOptions) obj;
            ArrayList arrayList2 = googleSignInOptions.f5977b;
            String str2 = googleSignInOptions.f5982g;
            Account account = googleSignInOptions.f5978c;
            if (this.f5984j.isEmpty() && googleSignInOptions.f5984j.isEmpty() && arrayList.size() == new ArrayList(arrayList2).size() && arrayList.containsAll(new ArrayList(arrayList2))) {
                Account account2 = this.f5978c;
                if (account2 == null) {
                    if (account != null) {
                        return false;
                    }
                } else if (!account2.equals(account)) {
                    return false;
                }
                if (TextUtils.isEmpty(str)) {
                    if (!TextUtils.isEmpty(str2)) {
                        return false;
                    }
                } else if (!str.equals(str2)) {
                    return false;
                }
                if (this.f5981f == googleSignInOptions.f5981f && this.f5979d == googleSignInOptions.f5979d && this.f5980e == googleSignInOptions.f5980e) {
                    return TextUtils.equals(this.f5985k, googleSignInOptions.f5985k);
                }
                return false;
            }
            return false;
        } catch (ClassCastException unused) {
            return false;
        }
    }

    public final int hashCode() {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = this.f5977b;
        int size = arrayList2.size();
        for (int i10 = 0; i10 < size; i10++) {
            arrayList.add(((Scope) arrayList2.get(i10)).f6001b);
        }
        Collections.sort(arrayList);
        int iHashCode = (arrayList.hashCode() + (1 * 31)) * 31;
        Account account = this.f5978c;
        int iHashCode2 = (iHashCode + (account == null ? 0 : account.hashCode())) * 31;
        String str = this.f5982g;
        int iHashCode3 = (((((((iHashCode2 + (str == null ? 0 : str.hashCode())) * 31) + (this.f5981f ? 1 : 0)) * 31) + (this.f5979d ? 1 : 0)) * 31) + (this.f5980e ? 1 : 0)) * 31;
        String str2 = this.f5985k;
        return iHashCode3 + (str2 != null ? str2.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iM11783k = AbstractC5932m.m11783k(parcel, 20293);
        AbstractC5932m.m11785m(parcel, 1, 4);
        parcel.writeInt(this.f5976a);
        AbstractC5932m.m11782j(parcel, 2, new ArrayList(this.f5977b));
        AbstractC5932m.m11777e(parcel, 3, this.f5978c, i10);
        AbstractC5932m.m11785m(parcel, 4, 4);
        parcel.writeInt(this.f5979d ? 1 : 0);
        AbstractC5932m.m11785m(parcel, 5, 4);
        parcel.writeInt(this.f5980e ? 1 : 0);
        AbstractC5932m.m11785m(parcel, 6, 4);
        parcel.writeInt(this.f5981f ? 1 : 0);
        AbstractC5932m.m11778f(parcel, 7, this.f5982g);
        AbstractC5932m.m11778f(parcel, 8, this.f5983h);
        AbstractC5932m.m11782j(parcel, 9, this.f5984j);
        AbstractC5932m.m11778f(parcel, 10, this.f5985k);
        AbstractC5932m.m11784l(parcel, iM11783k);
    }
}
