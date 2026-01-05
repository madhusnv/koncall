package com.facebook;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.firebase.messaging.Constants;
import com.onesignal.core.internal.database.impl.OneSignalDbContract;
import java.net.HttpURLConnection;
import org.json.JSONException;
import org.json.JSONObject;
import p001o.cri;
import p001o.id5;
import p001o.is6;
import p001o.sq8;
import p001o.tt6;
import p001o.ur6;
import p001o.xr6;
import p001o.xt6;

/* loaded from: classes5.dex */
public final class FacebookRequestError implements Parcelable {

    /* renamed from: H */
    public final EnumC10756a f11322H;

    /* renamed from: L */
    public final String f11323L;

    /* renamed from: a */
    public final int f11324a;

    /* renamed from: b */
    public final int f11325b;

    /* renamed from: c */
    public final int f11326c;

    /* renamed from: d */
    public final String f11327d;

    /* renamed from: e */
    public final String f11328e;

    /* renamed from: f */
    public final String f11329f;

    /* renamed from: g */
    public final JSONObject f11330g;

    /* renamed from: h */
    public final JSONObject f11331h;

    /* renamed from: q */
    public final Object f11332q;

    /* renamed from: s */
    public final HttpURLConnection f11333s;

    /* renamed from: x */
    public final String f11334x;

    /* renamed from: y */
    public ur6 f11335y;

    /* renamed from: M */
    public static final C10758c f11320M = new C10758c(null);

    /* renamed from: Q */
    public static final C10759d f11321Q = new C10759d(200, 299);
    public static final Parcelable.Creator<FacebookRequestError> CREATOR = new C10757b();

    /* renamed from: com.facebook.FacebookRequestError$a */
    public enum EnumC10756a {
        LOGIN_RECOVERABLE,
        OTHER,
        TRANSIENT
    }

    /* renamed from: com.facebook.FacebookRequestError$b */
    public static final class C10757b implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public FacebookRequestError createFromParcel(Parcel parcel) {
            sq8.m48649h(parcel, "parcel");
            return new FacebookRequestError(parcel, (id5) null);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public FacebookRequestError[] newArray(int i) {
            return new FacebookRequestError[i];
        }
    }

    /* renamed from: com.facebook.FacebookRequestError$c */
    public static final class C10758c {
        public C10758c() {
        }

        public /* synthetic */ C10758c(id5 id5Var) {
            this();
        }

        /* JADX WARN: Removed duplicated region for block: B:45:0x00cd A[Catch: JSONException -> 0x012b, TryCatch #0 {JSONException -> 0x012b, blocks: (B:3:0x0012, B:5:0x0018, B:7:0x0022, B:9:0x0026, B:12:0x0034, B:14:0x003f, B:17:0x0049, B:20:0x0053, B:23:0x005b, B:25:0x0061, B:28:0x006b, B:31:0x0075, B:45:0x00cd, B:33:0x0081, B:36:0x008e, B:38:0x0097, B:42:0x00a8, B:47:0x00ee, B:49:0x00f8, B:51:0x0106, B:53:0x010f), top: B:57:0x0012 }] */
        /* renamed from: a */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final FacebookRequestError m12828a(JSONObject jSONObject, Object obj, HttpURLConnection httpURLConnection) throws JSONException {
            String strOptString;
            int iOptInt;
            boolean zOptBoolean;
            String strOptString2;
            String strOptString3;
            String str;
            String str2;
            sq8.m48649h(jSONObject, "singleResult");
            try {
                if (jSONObject.has("code")) {
                    int i = jSONObject.getInt("code");
                    Object objM21651P = cri.m21651P(jSONObject, "body", "FACEBOOK_NON_JSON_RESULT");
                    if (objM21651P != null && (objM21651P instanceof JSONObject)) {
                        if (((JSONObject) objM21651P).has(Constants.IPC_BUNDLE_KEY_SEND_ERROR)) {
                            JSONObject jSONObject2 = (JSONObject) cri.m21651P((JSONObject) objM21651P, Constants.IPC_BUNDLE_KEY_SEND_ERROR, null);
                            strOptString = jSONObject2 != null ? jSONObject2.optString("type", null) : null;
                            String strOptString4 = jSONObject2 != null ? jSONObject2.optString(OneSignalDbContract.NotificationTable.COLUMN_NAME_MESSAGE, null) : null;
                            int iOptInt2 = jSONObject2 != null ? jSONObject2.optInt("code", -1) : -1;
                            iOptInt = jSONObject2 != null ? jSONObject2.optInt("error_subcode", -1) : -1;
                            strOptString2 = jSONObject2 != null ? jSONObject2.optString("error_user_msg", null) : null;
                            strOptString3 = jSONObject2 != null ? jSONObject2.optString("error_user_title", null) : null;
                            zOptBoolean = jSONObject2 != null ? jSONObject2.optBoolean("is_transient", false) : false;
                            z = true;
                            str = strOptString4;
                            iOptInt = iOptInt;
                            iOptInt = iOptInt2;
                        } else {
                            if (!((JSONObject) objM21651P).has("error_code") && !((JSONObject) objM21651P).has("error_msg") && !((JSONObject) objM21651P).has("error_reason")) {
                                zOptBoolean = false;
                                iOptInt = -1;
                                str2 = null;
                                str = null;
                                strOptString2 = null;
                                strOptString3 = null;
                                if (z) {
                                    return new FacebookRequestError(i, iOptInt, iOptInt, str2, str, strOptString3, strOptString2, (JSONObject) objM21651P, jSONObject, obj, httpURLConnection, null, zOptBoolean, null);
                                }
                            }
                            strOptString = ((JSONObject) objM21651P).optString("error_reason", null);
                            String strOptString5 = ((JSONObject) objM21651P).optString("error_msg", null);
                            int iOptInt3 = ((JSONObject) objM21651P).optInt("error_code", -1);
                            iOptInt = ((JSONObject) objM21651P).optInt("error_subcode", -1);
                            iOptInt = iOptInt3;
                            zOptBoolean = false;
                            strOptString2 = null;
                            strOptString3 = null;
                            z = true;
                            str = strOptString5;
                        }
                        str2 = strOptString;
                        if (z) {
                        }
                    }
                    if (!m12830c().m12831a(i)) {
                        return new FacebookRequestError(i, -1, -1, null, null, null, null, jSONObject.has("body") ? (JSONObject) cri.m21651P(jSONObject, "body", "FACEBOOK_NON_JSON_RESULT") : null, jSONObject, obj, httpURLConnection, null, false, null);
                    }
                }
            } catch (JSONException unused) {
            }
            return null;
        }

        /* renamed from: b */
        public final synchronized xr6 m12829b() {
            tt6 tt6VarM56796f = xt6.m56796f(C10773c.m13020m());
            if (tt6VarM56796f == null) {
                return xr6.f54160g.m56690b();
            }
            return tt6VarM56796f.m50540g();
        }

        /* renamed from: c */
        public final C10759d m12830c() {
            return FacebookRequestError.f11321Q;
        }
    }

    /* renamed from: com.facebook.FacebookRequestError$d */
    public static final class C10759d {

        /* renamed from: a */
        public final int f11336a;

        /* renamed from: b */
        public final int f11337b;

        public C10759d(int i, int i2) {
            this.f11336a = i;
            this.f11337b = i2;
        }

        /* renamed from: a */
        public final boolean m12831a(int i) {
            return i <= this.f11337b && this.f11336a <= i;
        }
    }

    public /* synthetic */ FacebookRequestError(int i, int i2, int i3, String str, String str2, String str3, String str4, JSONObject jSONObject, JSONObject jSONObject2, Object obj, HttpURLConnection httpURLConnection, ur6 ur6Var, boolean z, id5 id5Var) {
        this(i, i2, i3, str, str2, str3, str4, jSONObject, jSONObject2, obj, httpURLConnection, ur6Var, z);
    }

    /* renamed from: b */
    public final int m12820b() {
        return this.f11325b;
    }

    /* renamed from: c */
    public final String m12821c() {
        String str = this.f11334x;
        if (str != null) {
            return str;
        }
        ur6 ur6Var = this.f11335y;
        if (ur6Var != null) {
            return ur6Var.getLocalizedMessage();
        }
        return null;
    }

    /* renamed from: d */
    public final String m12822d() {
        return this.f11327d;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    /* renamed from: e */
    public final ur6 m12823e() {
        return this.f11335y;
    }

    /* renamed from: f */
    public final int m12824f() {
        return this.f11324a;
    }

    /* renamed from: g */
    public final int m12825g() {
        return this.f11326c;
    }

    public String toString() {
        String str = "{HttpStatus: " + this.f11324a + ", errorCode: " + this.f11325b + ", subErrorCode: " + this.f11326c + ", errorType: " + this.f11327d + ", errorMessage: " + m12821c() + "}";
        sq8.m48648g(str, "StringBuilder(\"{HttpStat…(\"}\")\n        .toString()");
        return str;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        sq8.m48649h(parcel, "out");
        parcel.writeInt(this.f11324a);
        parcel.writeInt(this.f11325b);
        parcel.writeInt(this.f11326c);
        parcel.writeString(this.f11327d);
        parcel.writeString(m12821c());
        parcel.writeString(this.f11328e);
        parcel.writeString(this.f11329f);
    }

    public /* synthetic */ FacebookRequestError(Parcel parcel, id5 id5Var) {
        this(parcel);
    }

    public FacebookRequestError(int i, int i2, int i3, String str, String str2, String str3, String str4, JSONObject jSONObject, JSONObject jSONObject2, Object obj, HttpURLConnection httpURLConnection, ur6 ur6Var, boolean z) {
        boolean z2;
        EnumC10756a enumC10756aM56687c;
        this.f11324a = i;
        this.f11325b = i2;
        this.f11326c = i3;
        this.f11327d = str;
        this.f11328e = str3;
        this.f11329f = str4;
        this.f11330g = jSONObject;
        this.f11331h = jSONObject2;
        this.f11332q = obj;
        this.f11333s = httpURLConnection;
        this.f11334x = str2;
        if (ur6Var != null) {
            this.f11335y = ur6Var;
            z2 = true;
        } else {
            this.f11335y = new is6(this, m12821c());
            z2 = false;
        }
        if (z2) {
            enumC10756aM56687c = EnumC10756a.OTHER;
        } else {
            enumC10756aM56687c = f11320M.m12829b().m56687c(i2, i3, z);
        }
        this.f11322H = enumC10756aM56687c;
        this.f11323L = f11320M.m12829b().m56688d(enumC10756aM56687c);
    }

    public FacebookRequestError(HttpURLConnection httpURLConnection, Exception exc) {
        this(-1, -1, -1, null, null, null, null, null, null, null, httpURLConnection, exc instanceof ur6 ? (ur6) exc : new ur6(exc), false);
    }

    public FacebookRequestError(int i, String str, String str2) {
        this(-1, i, -1, str, str2, null, null, null, null, null, null, null, false);
    }

    public FacebookRequestError(Parcel parcel) {
        this(parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), null, null, null, null, null, false);
    }
}
