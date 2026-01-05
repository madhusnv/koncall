package com.facebook.login;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.text.TextUtils;
import com.facebook.login.C10829d;
import com.facebook.login.LoginClient;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import org.json.JSONException;
import org.json.JSONObject;
import p001o.a94;
import p001o.ao8;
import p001o.id5;
import p001o.sq8;

/* renamed from: com.facebook.login.d */
/* loaded from: classes5.dex */
public final class C10829d {

    /* renamed from: d */
    public static final a f11643d = new a(null);

    /* renamed from: e */
    public static final ScheduledExecutorService f11644e = Executors.newSingleThreadScheduledExecutor();

    /* renamed from: a */
    public final String f11645a;

    /* renamed from: b */
    public final ao8 f11646b;

    /* renamed from: c */
    public String f11647c;

    /* renamed from: com.facebook.login.d$a */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(id5 id5Var) {
            this();
        }

        /* renamed from: b */
        public final Bundle m13376b(String str) {
            Bundle bundle = new Bundle();
            bundle.putLong("1_timestamp_ms", System.currentTimeMillis());
            bundle.putString("0_auth_logger_id", str);
            bundle.putString("3_method", "");
            bundle.putString("2_result", "");
            bundle.putString("5_error_message", "");
            bundle.putString("4_error_code", "");
            bundle.putString("6_extras", "");
            return bundle;
        }
    }

    public C10829d(Context context, String str) {
        PackageInfo packageInfo;
        sq8.m48649h(context, "context");
        sq8.m48649h(str, "applicationId");
        this.f11645a = str;
        this.f11646b = new ao8(context, str);
        try {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager == null || (packageInfo = packageManager.getPackageInfo("com.facebook.katana", 0)) == null) {
                return;
            }
            this.f11647c = packageInfo.versionName;
        } catch (PackageManager.NameNotFoundException unused) {
        }
    }

    /* renamed from: h */
    public static final void m13365h(C10829d c10829d, Bundle bundle) {
        if (a94.m16694d(C10829d.class)) {
            return;
        }
        try {
            sq8.m48649h(c10829d, "this$0");
            sq8.m48649h(bundle, "$bundle");
            c10829d.f11646b.m17564g("fb_mobile_login_heartbeat", bundle);
        } catch (Throwable th) {
            a94.m16692b(th, C10829d.class);
        }
    }

    /* renamed from: k */
    public static /* synthetic */ void m13366k(C10829d c10829d, String str, String str2, String str3, int i, Object obj) {
        if (a94.m16694d(C10829d.class)) {
            return;
        }
        if ((i & 4) != 0) {
            str3 = "";
        }
        try {
            c10829d.m13374j(str, str2, str3);
        } catch (Throwable th) {
            a94.m16692b(th, C10829d.class);
        }
    }

    /* renamed from: b */
    public final String m13367b() {
        if (a94.m16694d(this)) {
            return null;
        }
        try {
            return this.f11645a;
        } catch (Throwable th) {
            a94.m16692b(th, this);
            return null;
        }
    }

    /* renamed from: c */
    public final void m13368c(String str, String str2, String str3, String str4, String str5, Map map, String str6) {
        if (a94.m16694d(this)) {
            return;
        }
        try {
            Bundle bundleM13376b = f11643d.m13376b(str);
            if (str3 != null) {
                bundleM13376b.putString("2_result", str3);
            }
            if (str4 != null) {
                bundleM13376b.putString("5_error_message", str4);
            }
            if (str5 != null) {
                bundleM13376b.putString("4_error_code", str5);
            }
            if (map != null && (!map.isEmpty())) {
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                for (Map.Entry entry : map.entrySet()) {
                    if (((String) entry.getKey()) != null) {
                        linkedHashMap.put(entry.getKey(), entry.getValue());
                    }
                }
                bundleM13376b.putString("6_extras", new JSONObject(linkedHashMap).toString());
            }
            bundleM13376b.putString("3_method", str2);
            this.f11646b.m17564g(str6, bundleM13376b);
        } catch (Throwable th) {
            a94.m16692b(th, this);
        }
    }

    /* renamed from: d */
    public final void m13369d(String str, String str2, String str3) {
        if (a94.m16694d(this)) {
            return;
        }
        try {
            Bundle bundleM13376b = f11643d.m13376b(str);
            bundleM13376b.putString("3_method", str2);
            this.f11646b.m17564g(str3, bundleM13376b);
        } catch (Throwable th) {
            a94.m16692b(th, this);
        }
    }

    /* renamed from: e */
    public final void m13370e(String str, String str2, String str3) {
        if (a94.m16694d(this)) {
            return;
        }
        try {
            Bundle bundleM13376b = f11643d.m13376b(str);
            bundleM13376b.putString("3_method", str2);
            this.f11646b.m17564g(str3, bundleM13376b);
        } catch (Throwable th) {
            a94.m16692b(th, this);
        }
    }

    /* renamed from: f */
    public final void m13371f(String str, Map map, LoginClient.Result.EnumC10810a enumC10810a, Map map2, Exception exc, String str2) {
        if (a94.m16694d(this)) {
            return;
        }
        try {
            sq8.m48649h(map, "loggingExtras");
            Bundle bundleM13376b = f11643d.m13376b(str);
            if (enumC10810a != null) {
                bundleM13376b.putString("2_result", enumC10810a.getLoggingValue());
            }
            if ((exc != null ? exc.getMessage() : null) != null) {
                bundleM13376b.putString("5_error_message", exc.getMessage());
            }
            JSONObject jSONObject = map.isEmpty() ^ true ? new JSONObject(map) : null;
            if (map2 != null) {
                if (jSONObject == null) {
                    jSONObject = new JSONObject();
                }
                try {
                    for (Map.Entry entry : map2.entrySet()) {
                        String str3 = (String) entry.getKey();
                        String str4 = (String) entry.getValue();
                        if (str3 != null) {
                            jSONObject.put(str3, str4);
                        }
                    }
                } catch (JSONException unused) {
                }
            }
            if (jSONObject != null) {
                bundleM13376b.putString("6_extras", jSONObject.toString());
            }
            this.f11646b.m17564g(str2, bundleM13376b);
            if (enumC10810a == LoginClient.Result.EnumC10810a.SUCCESS) {
                m13372g(str);
            }
        } catch (Throwable th) {
            a94.m16692b(th, this);
        }
    }

    /* renamed from: g */
    public final void m13372g(String str) {
        if (a94.m16694d(this)) {
            return;
        }
        try {
            final Bundle bundleM13376b = f11643d.m13376b(str);
            f11644e.schedule(new Runnable() { // from class: o.pka
                @Override // java.lang.Runnable
                public final void run() {
                    C10829d.m13365h(this.f40197a, bundleM13376b);
                }
            }, 5L, TimeUnit.SECONDS);
        } catch (Throwable th) {
            a94.m16692b(th, this);
        }
    }

    /* renamed from: i */
    public final void m13373i(LoginClient.Request request, String str) {
        if (a94.m16694d(this)) {
            return;
        }
        try {
            sq8.m48649h(request, "pendingLoginRequest");
            Bundle bundleM13376b = f11643d.m13376b(request.m13266b());
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("login_behavior", request.m13274j().toString());
                jSONObject.put("request_code", LoginClient.f11564H.m13305b());
                jSONObject.put("permissions", TextUtils.join(",", request.m13278n()));
                jSONObject.put("default_audience", request.m13271g().toString());
                jSONObject.put("isReauthorize", request.m13283s());
                String str2 = this.f11647c;
                if (str2 != null) {
                    jSONObject.put("facebookVersion", str2);
                }
                if (request.m13275k() != null) {
                    jSONObject.put("target_app", request.m13275k().toString());
                }
                bundleM13376b.putString("6_extras", jSONObject.toString());
            } catch (JSONException unused) {
            }
            this.f11646b.m17564g(str, bundleM13376b);
        } catch (Throwable th) {
            a94.m16692b(th, this);
        }
    }

    /* renamed from: j */
    public final void m13374j(String str, String str2, String str3) {
        if (a94.m16694d(this)) {
            return;
        }
        try {
            Bundle bundleM13376b = f11643d.m13376b("");
            bundleM13376b.putString("2_result", LoginClient.Result.EnumC10810a.ERROR.getLoggingValue());
            bundleM13376b.putString("5_error_message", str2);
            bundleM13376b.putString("3_method", str3);
            this.f11646b.m17564g(str, bundleM13376b);
        } catch (Throwable th) {
            a94.m16692b(th, this);
        }
    }
}
