package com.facebook.login;

import android.content.Context;
import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.amplifyframework.auth.cognito.data.AWSCognitoLegacyCredentialStore;
import com.facebook.AccessToken;
import com.facebook.AuthenticationToken;
import com.facebook.C10773c;
import com.facebook.CustomTabMainActivity;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.firebase.messaging.Constants;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import org.json.JSONException;
import org.json.JSONObject;
import p001o.cri;
import p001o.e32;
import p001o.eae;
import p001o.fka;
import p001o.id5;
import p001o.isa;
import p001o.rri;
import p001o.sq8;
import p001o.ur6;
import p001o.xka;
import p001o.ye3;
import p001o.za5;

/* loaded from: classes5.dex */
public class LoginClient implements Parcelable {

    /* renamed from: a */
    public LoginMethodHandler[] f11565a;

    /* renamed from: b */
    public int f11566b;

    /* renamed from: c */
    public Fragment f11567c;

    /* renamed from: d */
    public InterfaceC10816d f11568d;

    /* renamed from: e */
    public InterfaceC10813a f11569e;

    /* renamed from: f */
    public boolean f11570f;

    /* renamed from: g */
    public Request f11571g;

    /* renamed from: h */
    public Map f11572h;

    /* renamed from: q */
    public Map f11573q;

    /* renamed from: s */
    public C10829d f11574s;

    /* renamed from: x */
    public int f11575x;

    /* renamed from: y */
    public int f11576y;

    /* renamed from: H */
    public static final C10815c f11564H = new C10815c(null);
    public static final Parcelable.Creator<LoginClient> CREATOR = new C10814b();

    public static final class Request implements Parcelable {

        /* renamed from: H */
        public boolean f11578H;

        /* renamed from: L */
        public boolean f11579L;

        /* renamed from: M */
        public final String f11580M;

        /* renamed from: Q */
        public final String f11581Q;

        /* renamed from: X */
        public final String f11582X;

        /* renamed from: Y */
        public final ye3 f11583Y;

        /* renamed from: a */
        public final fka f11584a;

        /* renamed from: b */
        public Set f11585b;

        /* renamed from: c */
        public final za5 f11586c;

        /* renamed from: d */
        public final String f11587d;

        /* renamed from: e */
        public String f11588e;

        /* renamed from: f */
        public boolean f11589f;

        /* renamed from: g */
        public String f11590g;

        /* renamed from: h */
        public String f11591h;

        /* renamed from: q */
        public String f11592q;

        /* renamed from: s */
        public String f11593s;

        /* renamed from: x */
        public boolean f11594x;

        /* renamed from: y */
        public final xka f11595y;

        /* renamed from: Z */
        public static final C10809b f11577Z = new C10809b(null);
        public static final Parcelable.Creator<Request> CREATOR = new C10808a();

        /* renamed from: com.facebook.login.LoginClient$Request$a */
        public static final class C10808a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public Request createFromParcel(Parcel parcel) {
                sq8.m48649h(parcel, "source");
                return new Request(parcel, null);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public Request[] newArray(int i) {
                return new Request[i];
            }
        }

        /* renamed from: com.facebook.login.LoginClient$Request$b */
        public static final class C10809b {
            public C10809b() {
            }

            public /* synthetic */ C10809b(id5 id5Var) {
                this();
            }
        }

        public /* synthetic */ Request(Parcel parcel, id5 id5Var) {
            this(parcel);
        }

        /* renamed from: A */
        public final boolean m13264A() {
            return this.f11579L;
        }

        /* renamed from: a */
        public final String m13265a() {
            return this.f11587d;
        }

        /* renamed from: b */
        public final String m13266b() {
            return this.f11588e;
        }

        /* renamed from: c */
        public final String m13267c() {
            return this.f11591h;
        }

        /* renamed from: d */
        public final String m13268d() {
            return this.f11582X;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        /* renamed from: e */
        public final ye3 m13269e() {
            return this.f11583Y;
        }

        /* renamed from: f */
        public final String m13270f() {
            return this.f11581Q;
        }

        /* renamed from: g */
        public final za5 m13271g() {
            return this.f11586c;
        }

        /* renamed from: h */
        public final String m13272h() {
            return this.f11592q;
        }

        /* renamed from: i */
        public final String m13273i() {
            return this.f11590g;
        }

        /* renamed from: j */
        public final fka m13274j() {
            return this.f11584a;
        }

        /* renamed from: k */
        public final xka m13275k() {
            return this.f11595y;
        }

        /* renamed from: l */
        public final String m13276l() {
            return this.f11593s;
        }

        /* renamed from: m */
        public final String m13277m() {
            return this.f11580M;
        }

        /* renamed from: n */
        public final Set m13278n() {
            return this.f11585b;
        }

        /* renamed from: o */
        public final boolean m13279o() {
            return this.f11594x;
        }

        /* renamed from: p */
        public final boolean m13280p() {
            Iterator it = this.f11585b.iterator();
            while (it.hasNext()) {
                if (C10830e.f11648j.m13418e((String) it.next())) {
                    return true;
                }
            }
            return false;
        }

        /* renamed from: q */
        public final boolean m13281q() {
            return this.f11578H;
        }

        /* renamed from: r */
        public final boolean m13282r() {
            return this.f11595y == xka.INSTAGRAM;
        }

        /* renamed from: s */
        public final boolean m13283s() {
            return this.f11589f;
        }

        /* renamed from: t */
        public final void m13284t(String str) {
            sq8.m48649h(str, "<set-?>");
            this.f11588e = str;
        }

        /* renamed from: u */
        public final void m13285u(boolean z) {
            this.f11578H = z;
        }

        /* renamed from: v */
        public final void m13286v(String str) {
            this.f11593s = str;
        }

        /* renamed from: w */
        public final void m13287w(Set set) {
            sq8.m48649h(set, "<set-?>");
            this.f11585b = set;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            sq8.m48649h(parcel, "dest");
            parcel.writeString(this.f11584a.name());
            parcel.writeStringList(new ArrayList(this.f11585b));
            parcel.writeString(this.f11586c.name());
            parcel.writeString(this.f11587d);
            parcel.writeString(this.f11588e);
            parcel.writeByte(this.f11589f ? (byte) 1 : (byte) 0);
            parcel.writeString(this.f11590g);
            parcel.writeString(this.f11591h);
            parcel.writeString(this.f11592q);
            parcel.writeString(this.f11593s);
            parcel.writeByte(this.f11594x ? (byte) 1 : (byte) 0);
            parcel.writeString(this.f11595y.name());
            parcel.writeByte(this.f11578H ? (byte) 1 : (byte) 0);
            parcel.writeByte(this.f11579L ? (byte) 1 : (byte) 0);
            parcel.writeString(this.f11580M);
            parcel.writeString(this.f11581Q);
            parcel.writeString(this.f11582X);
            ye3 ye3Var = this.f11583Y;
            parcel.writeString(ye3Var != null ? ye3Var.name() : null);
        }

        /* renamed from: x */
        public final void m13288x(boolean z) {
            this.f11589f = z;
        }

        /* renamed from: y */
        public final void m13289y(boolean z) {
            this.f11594x = z;
        }

        /* renamed from: z */
        public final void m13290z(boolean z) {
            this.f11579L = z;
        }

        /* JADX WARN: Removed duplicated region for block: B:17:0x0046  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public Request(fka fkaVar, Set set, za5 za5Var, String str, String str2, String str3, xka xkaVar, String str4, String str5, String str6, ye3 ye3Var) {
            sq8.m48649h(fkaVar, "loginBehavior");
            sq8.m48649h(za5Var, "defaultAudience");
            sq8.m48649h(str, "authType");
            sq8.m48649h(str2, "applicationId");
            sq8.m48649h(str3, "authId");
            this.f11584a = fkaVar;
            this.f11585b = set == null ? new HashSet() : set;
            this.f11586c = za5Var;
            this.f11591h = str;
            this.f11587d = str2;
            this.f11588e = str3;
            this.f11595y = xkaVar == null ? xka.FACEBOOK : xkaVar;
            if (str4 == null) {
                String string = UUID.randomUUID().toString();
                sq8.m48648g(string, "randomUUID().toString()");
                this.f11580M = string;
            } else {
                if (!(str4.length() == 0)) {
                    this.f11580M = str4;
                }
            }
            this.f11581Q = str5;
            this.f11582X = str6;
            this.f11583Y = ye3Var;
        }

        public Request(Parcel parcel) {
            za5 za5VarValueOf;
            xka xkaVarValueOf;
            this.f11584a = fka.valueOf(rri.m47116k(parcel.readString(), "loginBehavior"));
            ArrayList arrayList = new ArrayList();
            parcel.readStringList(arrayList);
            this.f11585b = new HashSet(arrayList);
            String string = parcel.readString();
            if (string != null) {
                za5VarValueOf = za5.valueOf(string);
            } else {
                za5VarValueOf = za5.NONE;
            }
            this.f11586c = za5VarValueOf;
            this.f11587d = rri.m47116k(parcel.readString(), "applicationId");
            this.f11588e = rri.m47116k(parcel.readString(), "authId");
            this.f11589f = parcel.readByte() != 0;
            this.f11590g = parcel.readString();
            this.f11591h = rri.m47116k(parcel.readString(), "authType");
            this.f11592q = parcel.readString();
            this.f11593s = parcel.readString();
            this.f11594x = parcel.readByte() != 0;
            String string2 = parcel.readString();
            if (string2 != null) {
                xkaVarValueOf = xka.valueOf(string2);
            } else {
                xkaVarValueOf = xka.FACEBOOK;
            }
            this.f11595y = xkaVarValueOf;
            this.f11578H = parcel.readByte() != 0;
            this.f11579L = parcel.readByte() != 0;
            this.f11580M = rri.m47116k(parcel.readString(), "nonce");
            this.f11581Q = parcel.readString();
            this.f11582X = parcel.readString();
            String string3 = parcel.readString();
            this.f11583Y = string3 != null ? ye3.valueOf(string3) : null;
        }
    }

    public static final class Result implements Parcelable {

        /* renamed from: a */
        public final EnumC10810a f11597a;

        /* renamed from: b */
        public final AccessToken f11598b;

        /* renamed from: c */
        public final AuthenticationToken f11599c;

        /* renamed from: d */
        public final String f11600d;

        /* renamed from: e */
        public final String f11601e;

        /* renamed from: f */
        public final Request f11602f;

        /* renamed from: g */
        public Map f11603g;

        /* renamed from: h */
        public Map f11604h;

        /* renamed from: q */
        public static final C10812c f11596q = new C10812c(null);
        public static final Parcelable.Creator<Result> CREATOR = new C10811b();

        /* renamed from: com.facebook.login.LoginClient$Result$a */
        public enum EnumC10810a {
            SUCCESS(FirebaseAnalytics.Param.SUCCESS),
            CANCEL("cancel"),
            ERROR(Constants.IPC_BUNDLE_KEY_SEND_ERROR);

            private final String loggingValue;

            EnumC10810a(String str) {
                this.loggingValue = str;
            }

            public final String getLoggingValue() {
                return this.loggingValue;
            }
        }

        /* renamed from: com.facebook.login.LoginClient$Result$b */
        public static final class C10811b implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public Result createFromParcel(Parcel parcel) {
                sq8.m48649h(parcel, "source");
                return new Result(parcel, null);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public Result[] newArray(int i) {
                return new Result[i];
            }
        }

        /* renamed from: com.facebook.login.LoginClient$Result$c */
        public static final class C10812c {
            public C10812c() {
            }

            public /* synthetic */ C10812c(id5 id5Var) {
                this();
            }

            /* renamed from: d */
            public static /* synthetic */ Result m13295d(C10812c c10812c, Request request, String str, String str2, String str3, int i, Object obj) {
                if ((i & 8) != 0) {
                    str3 = null;
                }
                return c10812c.m13298c(request, str, str2, str3);
            }

            /* renamed from: a */
            public final Result m13296a(Request request, String str) {
                return new Result(request, EnumC10810a.CANCEL, null, str, null);
            }

            /* renamed from: b */
            public final Result m13297b(Request request, AccessToken accessToken, AuthenticationToken authenticationToken) {
                return new Result(request, EnumC10810a.SUCCESS, accessToken, authenticationToken, null, null);
            }

            /* renamed from: c */
            public final Result m13298c(Request request, String str, String str2, String str3) {
                ArrayList arrayList = new ArrayList();
                if (str != null) {
                    arrayList.add(str);
                }
                if (str2 != null) {
                    arrayList.add(str2);
                }
                return new Result(request, EnumC10810a.ERROR, null, TextUtils.join(": ", arrayList), str3);
            }

            /* renamed from: e */
            public final Result m13299e(Request request, AccessToken accessToken) {
                sq8.m48649h(accessToken, AWSCognitoLegacyCredentialStore.TOKEN_KEY);
                return new Result(request, EnumC10810a.SUCCESS, accessToken, null, null);
            }
        }

        public /* synthetic */ Result(Parcel parcel, id5 id5Var) {
            this(parcel);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            sq8.m48649h(parcel, "dest");
            parcel.writeString(this.f11597a.name());
            parcel.writeParcelable(this.f11598b, i);
            parcel.writeParcelable(this.f11599c, i);
            parcel.writeString(this.f11600d);
            parcel.writeString(this.f11601e);
            parcel.writeParcelable(this.f11602f, i);
            cri.H0(parcel, this.f11603g);
            cri.H0(parcel, this.f11604h);
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public Result(Request request, EnumC10810a enumC10810a, AccessToken accessToken, String str, String str2) {
            this(request, enumC10810a, accessToken, null, str, str2);
            sq8.m48649h(enumC10810a, "code");
        }

        public Result(Request request, EnumC10810a enumC10810a, AccessToken accessToken, AuthenticationToken authenticationToken, String str, String str2) {
            sq8.m48649h(enumC10810a, "code");
            this.f11602f = request;
            this.f11598b = accessToken;
            this.f11599c = authenticationToken;
            this.f11600d = str;
            this.f11597a = enumC10810a;
            this.f11601e = str2;
        }

        public Result(Parcel parcel) {
            String string = parcel.readString();
            this.f11597a = EnumC10810a.valueOf(string == null ? Constants.IPC_BUNDLE_KEY_SEND_ERROR : string);
            this.f11598b = (AccessToken) parcel.readParcelable(AccessToken.class.getClassLoader());
            this.f11599c = (AuthenticationToken) parcel.readParcelable(AuthenticationToken.class.getClassLoader());
            this.f11600d = parcel.readString();
            this.f11601e = parcel.readString();
            this.f11602f = (Request) parcel.readParcelable(Request.class.getClassLoader());
            this.f11603g = cri.s0(parcel);
            this.f11604h = cri.s0(parcel);
        }
    }

    /* renamed from: com.facebook.login.LoginClient$a */
    public interface InterfaceC10813a {
        /* renamed from: a */
        void mo13300a();

        /* renamed from: b */
        void mo13301b();
    }

    /* renamed from: com.facebook.login.LoginClient$b */
    public static final class C10814b implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public LoginClient createFromParcel(Parcel parcel) {
            sq8.m48649h(parcel, "source");
            return new LoginClient(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public LoginClient[] newArray(int i) {
            return new LoginClient[i];
        }
    }

    /* renamed from: com.facebook.login.LoginClient$c */
    public static final class C10815c {
        public C10815c() {
        }

        public /* synthetic */ C10815c(id5 id5Var) {
            this();
        }

        /* renamed from: a */
        public final String m13304a() {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("init", System.currentTimeMillis());
            } catch (JSONException unused) {
            }
            String string = jSONObject.toString();
            sq8.m48648g(string, "e2e.toString()");
            return string;
        }

        /* renamed from: b */
        public final int m13305b() {
            return e32.EnumC13090c.Login.toRequestCode();
        }
    }

    /* renamed from: com.facebook.login.LoginClient$d */
    public interface InterfaceC10816d {
        /* renamed from: a */
        void mo13306a(Result result);
    }

    public LoginClient(Fragment fragment) {
        sq8.m48649h(fragment, "fragment");
        this.f11566b = -1;
        m13260w(fragment);
    }

    /* renamed from: A */
    public final void m13236A() {
        LoginMethodHandler loginMethodHandlerM13247j = m13247j();
        if (loginMethodHandlerM13247j != null) {
            m13254q(loginMethodHandlerM13247j.mo13184f(), "skipped", null, null, loginMethodHandlerM13247j.m13311e());
        }
        LoginMethodHandler[] loginMethodHandlerArr = this.f11565a;
        while (loginMethodHandlerArr != null) {
            int i = this.f11566b;
            if (i >= loginMethodHandlerArr.length - 1) {
                break;
            }
            this.f11566b = i + 1;
            if (m13263z()) {
                return;
            }
        }
        if (this.f11571g != null) {
            m13245h();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x002e A[Catch: Exception -> 0x0041, TryCatch #0 {Exception -> 0x0041, blocks: (B:6:0x0013, B:8:0x0021, B:10:0x003d, B:9:0x002e), top: B:17:0x0013 }] */
    /* renamed from: B */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m13237B(Result result) {
        Result resultM13297b;
        sq8.m48649h(result, "pendingResult");
        if (result.f11598b == null) {
            throw new ur6("Can't validate without a token");
        }
        AccessToken accessTokenM12774e = AccessToken.f11242y.m12774e();
        AccessToken accessToken = result.f11598b;
        if (accessTokenM12774e != null) {
            try {
                resultM13297b = sq8.m48644c(accessTokenM12774e.m12761m(), accessToken.m12761m()) ? Result.f11596q.m13297b(this.f11571g, result.f11598b, result.f11599c) : Result.C10812c.m13295d(Result.f11596q, this.f11571g, "User logged in as different Facebook user.", null, null, 8, null);
            } catch (Exception e) {
                m13243f(Result.C10812c.m13295d(Result.f11596q, this.f11571g, "Caught exception", e.getMessage(), null, 8, null));
                return;
            }
        }
        m13243f(resultM13297b);
    }

    /* renamed from: a */
    public final void m13238a(String str, String str2, boolean z) {
        Map map = this.f11572h;
        if (map == null) {
            map = new HashMap();
        }
        if (this.f11572h == null) {
            this.f11572h = map;
        }
        if (map.containsKey(str) && z) {
            str2 = ((String) map.get(str)) + ',' + str2;
        }
        map.put(str, str2);
    }

    /* renamed from: b */
    public final void m13239b(Request request) {
        if (request == null) {
            return;
        }
        if (this.f11571g != null) {
            throw new ur6("Attempted to authorize while a request is pending.");
        }
        if (!AccessToken.f11242y.m12776g() || m13241d()) {
            this.f11571g = request;
            this.f11565a = m13249l(request);
            m13236A();
        }
    }

    /* renamed from: c */
    public final void m13240c() {
        LoginMethodHandler loginMethodHandlerM13247j = m13247j();
        if (loginMethodHandlerM13247j != null) {
            loginMethodHandlerM13247j.mo13224b();
        }
    }

    /* renamed from: d */
    public final boolean m13241d() {
        if (this.f11570f) {
            return true;
        }
        if (m13242e("android.permission.INTERNET") == 0) {
            this.f11570f = true;
            return true;
        }
        FragmentActivity fragmentActivityM13246i = m13246i();
        m13243f(Result.C10812c.m13295d(Result.f11596q, this.f11571g, fragmentActivityM13246i != null ? fragmentActivityM13246i.getString(eae.com_facebook_internet_permission_error_title) : null, fragmentActivityM13246i != null ? fragmentActivityM13246i.getString(eae.com_facebook_internet_permission_error_message) : null, null, 8, null));
        return false;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    /* renamed from: e */
    public final int m13242e(String str) {
        sq8.m48649h(str, "permission");
        FragmentActivity fragmentActivityM13246i = m13246i();
        if (fragmentActivityM13246i != null) {
            return fragmentActivityM13246i.checkCallingOrSelfPermission(str);
        }
        return -1;
    }

    /* renamed from: f */
    public final void m13243f(Result result) {
        sq8.m48649h(result, "outcome");
        LoginMethodHandler loginMethodHandlerM13247j = m13247j();
        if (loginMethodHandlerM13247j != null) {
            m13253p(loginMethodHandlerM13247j.mo13184f(), result, loginMethodHandlerM13247j.m13311e());
        }
        Map map = this.f11572h;
        if (map != null) {
            result.f11603g = map;
        }
        Map map2 = this.f11573q;
        if (map2 != null) {
            result.f11604h = map2;
        }
        this.f11565a = null;
        this.f11566b = -1;
        this.f11571g = null;
        this.f11572h = null;
        this.f11575x = 0;
        this.f11576y = 0;
        m13257t(result);
    }

    /* renamed from: g */
    public final void m13244g(Result result) {
        sq8.m48649h(result, "outcome");
        if (result.f11598b == null || !AccessToken.f11242y.m12776g()) {
            m13243f(result);
        } else {
            m13237B(result);
        }
    }

    /* renamed from: h */
    public final void m13245h() {
        m13243f(Result.C10812c.m13295d(Result.f11596q, this.f11571g, "Login attempt failed.", null, null, 8, null));
    }

    /* renamed from: i */
    public final FragmentActivity m13246i() {
        Fragment fragment = this.f11567c;
        if (fragment != null) {
            return fragment.getActivity();
        }
        return null;
    }

    /* renamed from: j */
    public final LoginMethodHandler m13247j() {
        LoginMethodHandler[] loginMethodHandlerArr;
        int i = this.f11566b;
        if (i < 0 || (loginMethodHandlerArr = this.f11565a) == null) {
            return null;
        }
        return loginMethodHandlerArr[i];
    }

    /* renamed from: k */
    public final Fragment m13248k() {
        return this.f11567c;
    }

    /* renamed from: l */
    public LoginMethodHandler[] m13249l(Request request) {
        sq8.m48649h(request, "request");
        ArrayList arrayList = new ArrayList();
        fka fkaVarM13274j = request.m13274j();
        if (!request.m13282r()) {
            if (fkaVarM13274j.allowsGetTokenAuth()) {
                arrayList.add(new GetTokenLoginMethodHandler(this));
            }
            if (!C10773c.f11414s && fkaVarM13274j.allowsKatanaAuth()) {
                arrayList.add(new KatanaProxyLoginMethodHandler(this));
            }
        } else if (!C10773c.f11414s && fkaVarM13274j.allowsInstagramAppAuth()) {
            arrayList.add(new InstagramAppLoginMethodHandler(this));
        }
        if (fkaVarM13274j.allowsCustomTabAuth()) {
            arrayList.add(new CustomTabLoginMethodHandler(this));
        }
        if (fkaVarM13274j.allowsWebViewAuth()) {
            arrayList.add(new WebViewLoginMethodHandler(this));
        }
        if (!request.m13282r() && fkaVarM13274j.allowsDeviceAuth()) {
            arrayList.add(new DeviceAuthMethodHandler(this));
        }
        return (LoginMethodHandler[]) arrayList.toArray(new LoginMethodHandler[0]);
    }

    /* renamed from: m */
    public final boolean m13250m() {
        return this.f11571g != null && this.f11566b >= 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0018  */
    /* renamed from: n */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final C10829d m13251n() {
        String strM13020m;
        C10829d c10829d = this.f11574s;
        if (c10829d != null) {
            String strM13367b = c10829d.m13367b();
            Request request = this.f11571g;
            if (!sq8.m48644c(strM13367b, request != null ? request.m13265a() : null)) {
                Context contextM13246i = m13246i();
                if (contextM13246i == null) {
                    contextM13246i = C10773c.m13019l();
                }
                Request request2 = this.f11571g;
                if (request2 == null || (strM13020m = request2.m13265a()) == null) {
                    strM13020m = C10773c.m13020m();
                }
                c10829d = new C10829d(contextM13246i, strM13020m);
                this.f11574s = c10829d;
            }
        }
        return c10829d;
    }

    /* renamed from: o */
    public final Request m13252o() {
        return this.f11571g;
    }

    /* renamed from: p */
    public final void m13253p(String str, Result result, Map map) {
        m13254q(str, result.f11597a.getLoggingValue(), result.f11600d, result.f11601e, map);
    }

    /* renamed from: q */
    public final void m13254q(String str, String str2, String str3, String str4, Map map) {
        Request request = this.f11571g;
        if (request == null) {
            m13251n().m13374j("fb_mobile_login_method_complete", "Unexpected call to logCompleteLogin with null pendingAuthorizationRequest.", str);
        } else {
            m13251n().m13368c(request.m13266b(), str, str2, str3, str4, map, request.m13281q() ? "foa_mobile_login_method_complete" : "fb_mobile_login_method_complete");
        }
    }

    /* renamed from: r */
    public final void m13255r() {
        InterfaceC10813a interfaceC10813a = this.f11569e;
        if (interfaceC10813a != null) {
            interfaceC10813a.mo13300a();
        }
    }

    /* renamed from: s */
    public final void m13256s() {
        InterfaceC10813a interfaceC10813a = this.f11569e;
        if (interfaceC10813a != null) {
            interfaceC10813a.mo13301b();
        }
    }

    /* renamed from: t */
    public final void m13257t(Result result) {
        InterfaceC10816d interfaceC10816d = this.f11568d;
        if (interfaceC10816d != null) {
            interfaceC10816d.mo13306a(result);
        }
    }

    /* renamed from: u */
    public final boolean m13258u(int i, int i2, Intent intent) {
        this.f11575x++;
        if (this.f11571g != null) {
            if (intent != null && intent.getBooleanExtra(CustomTabMainActivity.f11301s, false)) {
                m13236A();
                return false;
            }
            LoginMethodHandler loginMethodHandlerM13247j = m13247j();
            if (loginMethodHandlerM13247j != null && (!loginMethodHandlerM13247j.mo13233n() || intent != null || this.f11575x >= this.f11576y)) {
                return loginMethodHandlerM13247j.mo13186j(i, i2, intent);
            }
        }
        return false;
    }

    /* renamed from: v */
    public final void m13259v(InterfaceC10813a interfaceC10813a) {
        this.f11569e = interfaceC10813a;
    }

    /* renamed from: w */
    public final void m13260w(Fragment fragment) {
        if (this.f11567c != null) {
            throw new ur6("Can't set fragment once it is already set.");
        }
        this.f11567c = fragment;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        sq8.m48649h(parcel, "dest");
        parcel.writeParcelableArray(this.f11565a, i);
        parcel.writeInt(this.f11566b);
        parcel.writeParcelable(this.f11571g, i);
        cri.H0(parcel, this.f11572h);
        cri.H0(parcel, this.f11573q);
    }

    /* renamed from: x */
    public final void m13261x(InterfaceC10816d interfaceC10816d) {
        this.f11568d = interfaceC10816d;
    }

    /* renamed from: y */
    public final void m13262y(Request request) {
        if (m13250m()) {
            return;
        }
        m13239b(request);
    }

    /* renamed from: z */
    public final boolean m13263z() {
        LoginMethodHandler loginMethodHandlerM13247j = m13247j();
        if (loginMethodHandlerM13247j == null) {
            return false;
        }
        if (loginMethodHandlerM13247j.mo13313i() && !m13241d()) {
            m13238a("no_internet_permission", "1", false);
            return false;
        }
        Request request = this.f11571g;
        if (request == null) {
            return false;
        }
        int iMo13188o = loginMethodHandlerM13247j.mo13188o(request);
        this.f11575x = 0;
        if (iMo13188o > 0) {
            m13251n().m13370e(request.m13266b(), loginMethodHandlerM13247j.mo13184f(), request.m13281q() ? "foa_mobile_login_method_start" : "fb_mobile_login_method_start");
            this.f11576y = iMo13188o;
        } else {
            m13251n().m13369d(request.m13266b(), loginMethodHandlerM13247j.mo13184f(), request.m13281q() ? "foa_mobile_login_method_not_tried" : "fb_mobile_login_method_not_tried");
            m13238a("not_tried", loginMethodHandlerM13247j.mo13184f(), true);
        }
        return iMo13188o > 0;
    }

    public LoginClient(Parcel parcel) {
        sq8.m48649h(parcel, "source");
        this.f11566b = -1;
        Parcelable[] parcelableArray = parcel.readParcelableArray(LoginMethodHandler.class.getClassLoader());
        parcelableArray = parcelableArray == null ? new Parcelable[0] : parcelableArray;
        ArrayList arrayList = new ArrayList();
        int length = parcelableArray.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                break;
            }
            Parcelable parcelable = parcelableArray[i];
            LoginMethodHandler loginMethodHandler = parcelable instanceof LoginMethodHandler ? (LoginMethodHandler) parcelable : null;
            if (loginMethodHandler != null) {
                loginMethodHandler.m13315m(this);
            }
            if (loginMethodHandler != null) {
                arrayList.add(loginMethodHandler);
            }
            i++;
        }
        this.f11565a = (LoginMethodHandler[]) arrayList.toArray(new LoginMethodHandler[0]);
        this.f11566b = parcel.readInt();
        this.f11571g = (Request) parcel.readParcelable(Request.class.getClassLoader());
        Map mapS0 = cri.s0(parcel);
        this.f11572h = mapS0 != null ? isa.m32696w(mapS0) : null;
        Map mapS02 = cri.s0(parcel);
        this.f11573q = mapS02 != null ? isa.m32696w(mapS02) : null;
    }
}
