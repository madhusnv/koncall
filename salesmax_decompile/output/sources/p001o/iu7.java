package p001o;

import android.adservices.measurement.MeasurementManager;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.os.OutcomeReceiver;
import com.facebook.C10773c;
import com.google.firebase.messaging.Constants;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.Iterator;
import org.apache.http.protocol.HTTP;
import org.json.JSONObject;

/* loaded from: classes5.dex */
public final class iu7 {

    /* renamed from: a */
    public static final iu7 f29235a = new iu7();

    /* renamed from: b */
    public static final String f29236b;

    /* renamed from: c */
    public static boolean f29237c;

    /* renamed from: d */
    public static ju7 f29238d;

    /* renamed from: e */
    public static String f29239e;

    /* renamed from: o.iu7$a */
    public static final class C14373a extends kf9 implements xk7 {

        /* renamed from: a */
        public final /* synthetic */ JSONObject f29240a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C14373a(JSONObject jSONObject) {
            super(1);
            this.f29240a = jSONObject;
        }

        @Override // p001o.xk7
        public final String invoke(String str) throws UnsupportedEncodingException {
            Object objOpt = this.f29240a.opt(str);
            if (objOpt == null) {
                return null;
            }
            try {
                return URLEncoder.encode(str, HTTP.UTF_8) + '=' + URLEncoder.encode(objOpt.toString(), HTTP.UTF_8);
            } catch (Exception unused) {
                return null;
            }
        }
    }

    /* renamed from: o.iu7$b */
    public static final class C14374b implements OutcomeReceiver {
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onError(Exception exc) {
            sq8.m48649h(exc, Constants.IPC_BUNDLE_KEY_SEND_ERROR);
            iu7.m32787c();
            ju7 ju7VarM32786b = iu7.m32786b();
            if (ju7VarM32786b == null) {
                sq8.m48667z("gpsDebugLogger");
                ju7VarM32786b = null;
            }
            Bundle bundle = new Bundle();
            bundle.putString("gps_ara_failed_reason", exc.toString());
            y3i y3iVar = y3i.f54824a;
            ju7VarM32786b.m34515b("gps_ara_failed", bundle);
        }

        public void onResult(Object obj) {
            sq8.m48649h(obj, "result");
            iu7.m32787c();
            ju7 ju7VarM32786b = iu7.m32786b();
            if (ju7VarM32786b == null) {
                sq8.m48667z("gpsDebugLogger");
                ju7VarM32786b = null;
            }
            ju7VarM32786b.m34515b("gps_ara_succeed", null);
        }
    }

    static {
        String string = iu7.class.toString();
        sq8.m48648g(string, "GpsAraTriggersManager::class.java.toString()");
        f29236b = string;
    }

    /* renamed from: b */
    public static final /* synthetic */ ju7 m32786b() {
        if (a94.m16694d(iu7.class)) {
            return null;
        }
        try {
            return f29238d;
        } catch (Throwable th) {
            a94.m16692b(th, iu7.class);
            return null;
        }
    }

    /* renamed from: c */
    public static final /* synthetic */ String m32787c() {
        if (a94.m16694d(iu7.class)) {
            return null;
        }
        try {
            return f29236b;
        } catch (Throwable th) {
            a94.m16692b(th, iu7.class);
            return null;
        }
    }

    /* renamed from: e */
    public static final void m32788e() {
        if (a94.m16694d(iu7.class)) {
            return;
        }
        try {
            f29237c = true;
            f29238d = new ju7(C10773c.m13019l());
            f29239e = "https://www." + C10773c.m13029v() + "/privacy_sandbox/mobile/register/trigger";
        } catch (Throwable th) {
            a94.m16692b(th, iu7.class);
        }
    }

    /* renamed from: j */
    public static final void m32789j(String str, tk0 tk0Var) {
        if (a94.m16694d(iu7.class)) {
            return;
        }
        try {
            sq8.m48649h(str, "$applicationId");
            sq8.m48649h(tk0Var, "$event");
            f29235a.m32793h(str, tk0Var);
        } catch (Throwable th) {
            a94.m16692b(th, iu7.class);
        }
    }

    /* renamed from: d */
    public final boolean m32790d() {
        if (a94.m16694d(this)) {
            return false;
        }
        try {
            if (!f29237c) {
                return false;
            }
            ju7 ju7Var = null;
            try {
                try {
                    Class.forName("android.adservices.measurement.MeasurementManager");
                    return true;
                } catch (Error e) {
                    ju7 ju7Var2 = f29238d;
                    if (ju7Var2 == null) {
                        sq8.m48667z("gpsDebugLogger");
                    } else {
                        ju7Var = ju7Var2;
                    }
                    Bundle bundle = new Bundle();
                    bundle.putString("gps_ara_failed_reason", e.toString());
                    y3i y3iVar = y3i.f54824a;
                    ju7Var.m34515b("gps_ara_failed", bundle);
                    return false;
                }
            } catch (Exception e2) {
                ju7 ju7Var3 = f29238d;
                if (ju7Var3 == null) {
                    sq8.m48667z("gpsDebugLogger");
                } else {
                    ju7Var = ju7Var3;
                }
                Bundle bundle2 = new Bundle();
                bundle2.putString("gps_ara_failed_reason", e2.toString());
                y3i y3iVar2 = y3i.f54824a;
                ju7Var.m34515b("gps_ara_failed", bundle2);
                return false;
            }
        } catch (Throwable th) {
            a94.m16692b(th, this);
            return false;
        }
    }

    /* renamed from: f */
    public final String m32791f(tk0 tk0Var) {
        if (a94.m16694d(this)) {
            return null;
        }
        try {
            JSONObject jSONObjectM50092c = tk0Var.m50092c();
            if (jSONObjectM50092c != null && jSONObjectM50092c.length() != 0) {
                Iterator<String> itKeys = jSONObjectM50092c.keys();
                sq8.m48648g(itKeys, "params.keys()");
                return qef.m45317t(qef.m45320w(oef.m42144c(itKeys), new C14373a(jSONObjectM50092c)), "&", null, null, 0, null, null, 62, null);
            }
            return "";
        } catch (Throwable th) {
            a94.m16692b(th, this);
            return null;
        }
    }

    /* renamed from: g */
    public final boolean m32792g(tk0 tk0Var) {
        if (a94.m16694d(this)) {
            return false;
        }
        try {
            String string = tk0Var.m50092c().getString("_eventName");
            if (sq8.m48644c(string, "_removed_")) {
                return false;
            }
            sq8.m48648g(string, "eventName");
            return !f9g.m26306P(string, "gps", false, 2, null);
        } catch (Throwable th) {
            a94.m16692b(th, this);
            return false;
        }
    }

    /* renamed from: h */
    public final void m32793h(String str, tk0 tk0Var) {
        if (a94.m16694d(this)) {
            return;
        }
        try {
            sq8.m48649h(str, "applicationId");
            sq8.m48649h(tk0Var, "event");
            if (m32792g(tk0Var) && m32790d()) {
                Context contextM13019l = C10773c.m13019l();
                ju7 ju7Var = null;
                try {
                    try {
                        MeasurementManager measurementManagerM27519a = fu7.m27519a(contextM13019l.getSystemService(eu7.m25614a()));
                        if (measurementManagerM27519a == null) {
                            measurementManagerM27519a = MeasurementManager.get(contextM13019l.getApplicationContext());
                        }
                        if (measurementManagerM27519a == null) {
                            ju7 ju7Var2 = f29238d;
                            if (ju7Var2 == null) {
                                sq8.m48667z("gpsDebugLogger");
                                ju7Var2 = null;
                            }
                            Bundle bundle = new Bundle();
                            bundle.putString("gps_ara_failed_reason", "Failed to get measurement manager");
                            y3i y3iVar = y3i.f54824a;
                            ju7Var2.m34515b("gps_ara_failed", bundle);
                            return;
                        }
                        String strM32791f = m32791f(tk0Var);
                        StringBuilder sb = new StringBuilder();
                        String str2 = f29239e;
                        if (str2 == null) {
                            sq8.m48667z("serverUri");
                            str2 = null;
                        }
                        sb.append(str2);
                        sb.append('?');
                        sb.append("app_id");
                        sb.append('=');
                        sb.append(str);
                        sb.append('&');
                        sb.append(strM32791f);
                        Uri uri = Uri.parse(sb.toString());
                        sq8.m48648g(uri, "parse(\"$serverUri?$appId…=$applicationId&$params\")");
                        measurementManagerM27519a.registerTrigger(uri, C10773c.m13028u(), mb4.m38667a(new C14374b()));
                    } catch (Error e) {
                        ju7 ju7Var3 = f29238d;
                        if (ju7Var3 == null) {
                            sq8.m48667z("gpsDebugLogger");
                        } else {
                            ju7Var = ju7Var3;
                        }
                        Bundle bundle2 = new Bundle();
                        bundle2.putString("gps_ara_failed_reason", e.toString());
                        y3i y3iVar2 = y3i.f54824a;
                        ju7Var.m34515b("gps_ara_failed", bundle2);
                    }
                } catch (Exception e2) {
                    ju7 ju7Var4 = f29238d;
                    if (ju7Var4 == null) {
                        sq8.m48667z("gpsDebugLogger");
                    } else {
                        ju7Var = ju7Var4;
                    }
                    Bundle bundle3 = new Bundle();
                    bundle3.putString("gps_ara_failed_reason", e2.toString());
                    y3i y3iVar3 = y3i.f54824a;
                    ju7Var.m34515b("gps_ara_failed", bundle3);
                }
            }
        } catch (Throwable th) {
            a94.m16692b(th, this);
        }
    }

    /* renamed from: i */
    public final void m32794i(final String str, final tk0 tk0Var) {
        if (a94.m16694d(this)) {
            return;
        }
        try {
            sq8.m48649h(str, "applicationId");
            sq8.m48649h(tk0Var, "event");
            C10773c.m13028u().execute(new Runnable() { // from class: o.hu7
                @Override // java.lang.Runnable
                public final void run() {
                    iu7.m32789j(str, tk0Var);
                }
            });
        } catch (Throwable th) {
            a94.m16692b(th, this);
        }
    }
}
