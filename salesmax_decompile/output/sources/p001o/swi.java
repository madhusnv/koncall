package p001o;

import android.app.Activity;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.util.Base64;
import android.view.View;
import com.facebook.AccessToken;
import com.facebook.C10773c;
import com.facebook.C10776f;
import com.facebook.GraphRequest;
import com.google.android.gms.cast.CredentialsData;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.io.ByteArrayOutputStream;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import java.util.Locale;
import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p001o.swi;

/* loaded from: classes5.dex */
public final class swi {

    /* renamed from: e */
    public static final C16929a f46047e = new C16929a(null);

    /* renamed from: f */
    public static final String f46048f;

    /* renamed from: g */
    public static swi f46049g;

    /* renamed from: a */
    public final Handler f46050a;

    /* renamed from: b */
    public final WeakReference f46051b;

    /* renamed from: c */
    public Timer f46052c;

    /* renamed from: d */
    public String f46053d;

    /* renamed from: o.swi$a */
    public static final class C16929a {
        public C16929a() {
        }

        public /* synthetic */ C16929a(id5 id5Var) {
            this();
        }

        /* renamed from: c */
        public static final void m49041c(C10776f c10776f) {
            sq8.m48649h(c10776f, "it");
            sja.f45482e.m48387b(bka.APP_EVENTS, swi.m49031d(), "App index sent to FB!");
        }

        /* renamed from: b */
        public final GraphRequest m49042b(String str, AccessToken accessToken, String str2, String str3) {
            sq8.m48649h(str3, "requestType");
            if (str == null) {
                return null;
            }
            GraphRequest.C10764c c10764c = GraphRequest.f11338n;
            h8g h8gVar = h8g.f26398a;
            String str4 = String.format(Locale.US, "%s/app_indexing", Arrays.copyOf(new Object[]{str2}, 1));
            sq8.m48648g(str4, "format(locale, format, *args)");
            GraphRequest graphRequestM12882A = c10764c.m12882A(accessToken, str4, null, null);
            Bundle bundleM12861u = graphRequestM12882A.m12861u();
            if (bundleM12861u == null) {
                bundleM12861u = new Bundle();
            }
            bundleM12861u.putString("tree", str);
            bundleM12861u.putString("app_version", gl0.m28969c());
            bundleM12861u.putString("platform", CredentialsData.CREDENTIALS_TYPE_ANDROID);
            bundleM12861u.putString("request_type", str3);
            if (sq8.m48644c(str3, "app_indexing")) {
                bundleM12861u.putString("device_session_id", uf3.m51521g());
            }
            graphRequestM12882A.m12846G(bundleM12861u);
            graphRequestM12882A.m12842C(new GraphRequest.InterfaceC10763b() { // from class: o.rwi
                @Override // com.facebook.GraphRequest.InterfaceC10763b
                /* renamed from: a */
                public final void mo12873a(C10776f c10776f) {
                    swi.C16929a.m49041c(c10776f);
                }
            });
            return graphRequestM12882A;
        }
    }

    /* renamed from: o.swi$b */
    public static final class CallableC16930b implements Callable {

        /* renamed from: a */
        public final WeakReference f46054a;

        public CallableC16930b(View view) {
            sq8.m48649h(view, "rootView");
            this.f46054a = new WeakReference(view);
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public String call() {
            View view = (View) this.f46054a.get();
            if (view == null || view.getWidth() == 0 || view.getHeight() == 0) {
                return "";
            }
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(view.getWidth(), view.getHeight(), Bitmap.Config.RGB_565);
            sq8.m48648g(bitmapCreateBitmap, "createBitmap(view.width,…t, Bitmap.Config.RGB_565)");
            view.draw(new Canvas(bitmapCreateBitmap));
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            bitmapCreateBitmap.compress(Bitmap.CompressFormat.JPEG, 10, byteArrayOutputStream);
            String strEncodeToString = Base64.encodeToString(byteArrayOutputStream.toByteArray(), 2);
            sq8.m48648g(strEncodeToString, "encodeToString(outputStr…eArray(), Base64.NO_WRAP)");
            return strEncodeToString;
        }
    }

    /* renamed from: o.swi$c */
    public static final class C16931c extends TimerTask {
        public C16931c() {
        }

        @Override // java.util.TimerTask, java.lang.Runnable
        public void run() throws JSONException {
            try {
                Activity activity = (Activity) swi.m49030c(swi.this).get();
                View viewM28970d = gl0.m28970d(activity);
                if (activity != null && viewM28970d != null) {
                    String simpleName = activity.getClass().getSimpleName();
                    if (uf3.m51522h()) {
                        if (lq8.m37758b()) {
                            g4i.m28043a();
                            return;
                        }
                        FutureTask futureTask = new FutureTask(new CallableC16930b(viewM28970d));
                        swi.m49032e(swi.this).post(futureTask);
                        String str = "";
                        try {
                            str = (String) futureTask.get(1L, TimeUnit.SECONDS);
                        } catch (Exception unused) {
                            swi.m49031d();
                        }
                        JSONObject jSONObject = new JSONObject();
                        try {
                            jSONObject.put("screenname", simpleName);
                            jSONObject.put("screenshot", str);
                            JSONArray jSONArray = new JSONArray();
                            jSONArray.put(owi.m42735d(viewM28970d));
                            jSONObject.put("view", jSONArray);
                        } catch (JSONException unused2) {
                            swi.m49031d();
                        }
                        String string = jSONObject.toString();
                        sq8.m48648g(string, "viewTree.toString()");
                        swi.m49033f(swi.this, string);
                    }
                }
            } catch (Exception unused3) {
                swi.m49031d();
            }
        }
    }

    static {
        String canonicalName = swi.class.getCanonicalName();
        if (canonicalName == null) {
            canonicalName = "";
        }
        f46048f = canonicalName;
    }

    public swi(Activity activity) {
        sq8.m48649h(activity, "activity");
        this.f46051b = new WeakReference(activity);
        this.f46053d = null;
        this.f46050a = new Handler(Looper.getMainLooper());
        f46049g = this;
    }

    /* renamed from: c */
    public static final /* synthetic */ WeakReference m49030c(swi swiVar) {
        if (a94.m16694d(swi.class)) {
            return null;
        }
        try {
            return swiVar.f46051b;
        } catch (Throwable th) {
            a94.m16692b(th, swi.class);
            return null;
        }
    }

    /* renamed from: d */
    public static final /* synthetic */ String m49031d() {
        if (a94.m16694d(swi.class)) {
            return null;
        }
        try {
            return f46048f;
        } catch (Throwable th) {
            a94.m16692b(th, swi.class);
            return null;
        }
    }

    /* renamed from: e */
    public static final /* synthetic */ Handler m49032e(swi swiVar) {
        if (a94.m16694d(swi.class)) {
            return null;
        }
        try {
            return swiVar.f46050a;
        } catch (Throwable th) {
            a94.m16692b(th, swi.class);
            return null;
        }
    }

    /* renamed from: f */
    public static final /* synthetic */ void m49033f(swi swiVar, String str) {
        if (a94.m16694d(swi.class)) {
            return;
        }
        try {
            swiVar.m49038j(str);
        } catch (Throwable th) {
            a94.m16692b(th, swi.class);
        }
    }

    /* renamed from: i */
    public static final void m49034i(swi swiVar, TimerTask timerTask) {
        if (a94.m16694d(swi.class)) {
            return;
        }
        try {
            sq8.m48649h(swiVar, "this$0");
            sq8.m48649h(timerTask, "$indexingTask");
            try {
                Timer timer = swiVar.f46052c;
                if (timer != null) {
                    timer.cancel();
                }
                swiVar.f46053d = null;
                Timer timer2 = new Timer();
                timer2.scheduleAtFixedRate(timerTask, 0L, 1000L);
                swiVar.f46052c = timer2;
            } catch (Exception unused) {
            }
        } catch (Throwable th) {
            a94.m16692b(th, swi.class);
        }
    }

    /* renamed from: k */
    public static final void m49035k(String str, swi swiVar) {
        if (a94.m16694d(swi.class)) {
            return;
        }
        try {
            sq8.m48649h(str, "$tree");
            sq8.m48649h(swiVar, "this$0");
            String strN0 = cri.n0(str);
            AccessToken accessTokenM12774e = AccessToken.f11242y.m12774e();
            if (strN0 == null || !sq8.m48644c(strN0, swiVar.f46053d)) {
                swiVar.m49036g(f46047e.m49042b(str, accessTokenM12774e, C10773c.m13020m(), "app_indexing"), strN0);
            }
        } catch (Throwable th) {
            a94.m16692b(th, swi.class);
        }
    }

    /* renamed from: g */
    public final void m49036g(GraphRequest graphRequest, String str) {
        if (a94.m16694d(this) || graphRequest == null) {
            return;
        }
        try {
            C10776f c10776fM12851k = graphRequest.m12851k();
            try {
                JSONObject jSONObjectM13065c = c10776fM12851k.m13065c();
                if (jSONObjectM13065c == null) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("Error sending UI component tree to Facebook: ");
                    sb.append(c10776fM12851k.m13064b());
                } else {
                    if (sq8.m48644c("true", jSONObjectM13065c.optString(FirebaseAnalytics.Param.SUCCESS))) {
                        sja.f45482e.m48387b(bka.APP_EVENTS, f46048f, "Successfully send UI component tree to server");
                        this.f46053d = str;
                    }
                    if (jSONObjectM13065c.has("is_app_indexing_enabled")) {
                        uf3.m51527n(jSONObjectM13065c.getBoolean("is_app_indexing_enabled"));
                    }
                }
            } catch (JSONException unused) {
            }
        } catch (Throwable th) {
            a94.m16692b(th, this);
        }
    }

    /* renamed from: h */
    public final void m49037h() {
        if (a94.m16694d(this)) {
            return;
        }
        try {
            final C16931c c16931c = new C16931c();
            try {
                C10773c.m13028u().execute(new Runnable() { // from class: o.pwi
                    @Override // java.lang.Runnable
                    public final void run() {
                        swi.m49034i(this.f40693a, c16931c);
                    }
                });
            } catch (RejectedExecutionException unused) {
            }
        } catch (Throwable th) {
            a94.m16692b(th, this);
        }
    }

    /* renamed from: j */
    public final void m49038j(final String str) {
        if (a94.m16694d(this)) {
            return;
        }
        try {
            C10773c.m13028u().execute(new Runnable() { // from class: o.qwi
                @Override // java.lang.Runnable
                public final void run() {
                    swi.m49035k(str, this);
                }
            });
        } catch (Throwable th) {
            a94.m16692b(th, this);
        }
    }

    /* renamed from: l */
    public final void m49039l() {
        if (a94.m16694d(this)) {
            return;
        }
        try {
            if (((Activity) this.f46051b.get()) == null) {
                return;
            }
            try {
                Timer timer = this.f46052c;
                if (timer != null) {
                    timer.cancel();
                }
                this.f46052c = null;
            } catch (Exception unused) {
            }
        } catch (Throwable th) {
            a94.m16692b(th, this);
        }
    }
}
