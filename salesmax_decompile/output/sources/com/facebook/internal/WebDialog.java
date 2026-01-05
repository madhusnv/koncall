package com.facebook.internal;

import android.app.Activity;
import android.app.Dialog;
import android.app.ProgressDialog;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.net.http.SslError;
import android.os.AsyncTask;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.webkit.SslErrorHandler;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.facebook.AccessToken;
import com.facebook.AsyncTaskC10774d;
import com.facebook.C10773c;
import com.facebook.C10776f;
import com.facebook.FacebookRequestError;
import com.facebook.GraphRequest;
import com.facebook.internal.WebDialog;
import com.google.android.gms.cast.MediaTrack;
import com.google.android.gms.common.internal.ImagesContract;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.firebase.messaging.Constants;
import com.onesignal.session.internal.outcomes.impl.OutcomeEventsTable;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.CountDownLatch;
import java.util.regex.Pattern;
import org.json.JSONArray;
import org.json.JSONObject;
import p001o.a94;
import p001o.cgf;
import p001o.cri;
import p001o.e9g;
import p001o.eae;
import p001o.f9g;
import p001o.fp0;
import p001o.h8g;
import p001o.id5;
import p001o.is6;
import p001o.nae;
import p001o.qr6;
import p001o.rri;
import p001o.s7e;
import p001o.sq8;
import p001o.ur6;
import p001o.vr6;
import p001o.wr6;
import p001o.xka;
import p001o.xlf;

/* loaded from: classes5.dex */
public class WebDialog extends Dialog {

    /* renamed from: H */
    public static final C10784b f11467H = new C10784b(null);

    /* renamed from: L */
    public static final int f11468L = nae.com_facebook_activity_theme;

    /* renamed from: M */
    public static volatile int f11469M;

    /* renamed from: a */
    public String f11470a;

    /* renamed from: b */
    public String f11471b;

    /* renamed from: c */
    public InterfaceC10786d f11472c;

    /* renamed from: d */
    public WebView f11473d;

    /* renamed from: e */
    public ProgressDialog f11474e;

    /* renamed from: f */
    public ImageView f11475f;

    /* renamed from: g */
    public FrameLayout f11476g;

    /* renamed from: h */
    public AsyncTaskC10787e f11477h;

    /* renamed from: q */
    public boolean f11478q;

    /* renamed from: s */
    public boolean f11479s;

    /* renamed from: x */
    public boolean f11480x;

    /* renamed from: y */
    public WindowManager.LayoutParams f11481y;

    /* renamed from: com.facebook.internal.WebDialog$b */
    public static final class C10784b {
        public C10784b() {
        }

        public /* synthetic */ C10784b(id5 id5Var) {
            this();
        }

        /* renamed from: a */
        public final int m13138a() {
            rri.m47117l();
            return WebDialog.f11469M;
        }

        /* renamed from: b */
        public final void m13139b(Context context) throws PackageManager.NameNotFoundException {
            if (context == null) {
                return;
            }
            try {
                ApplicationInfo applicationInfo = context.getPackageManager().getApplicationInfo(context.getPackageName(), 128);
                if ((applicationInfo != null ? applicationInfo.metaData : null) != null && WebDialog.f11469M == 0) {
                    m13142e(applicationInfo.metaData.getInt("com.facebook.sdk.WebDialogTheme"));
                }
            } catch (PackageManager.NameNotFoundException unused) {
            }
        }

        /* renamed from: c */
        public final WebDialog m13140c(Context context, String str, Bundle bundle, int i, InterfaceC10786d interfaceC10786d) throws PackageManager.NameNotFoundException {
            sq8.m48649h(context, "context");
            WebDialog.m13116s(context);
            return new WebDialog(context, str, bundle, i, xka.FACEBOOK, interfaceC10786d, null);
        }

        /* renamed from: d */
        public final WebDialog m13141d(Context context, String str, Bundle bundle, int i, xka xkaVar, InterfaceC10786d interfaceC10786d) throws PackageManager.NameNotFoundException {
            sq8.m48649h(context, "context");
            sq8.m48649h(xkaVar, "targetApp");
            WebDialog.m13116s(context);
            return new WebDialog(context, str, bundle, i, xkaVar, interfaceC10786d, null);
        }

        /* renamed from: e */
        public final void m13142e(int i) {
            if (i == 0) {
                i = WebDialog.f11468L;
            }
            WebDialog.f11469M = i;
        }
    }

    /* renamed from: com.facebook.internal.WebDialog$c */
    public final class C10785c extends WebViewClient {
        public C10785c() {
        }

        @Override // android.webkit.WebViewClient
        public void onPageFinished(WebView webView, String str) {
            ProgressDialog progressDialog;
            sq8.m48649h(webView, "view");
            sq8.m48649h(str, ImagesContract.URL);
            super.onPageFinished(webView, str);
            if (!WebDialog.this.f11479s && (progressDialog = WebDialog.this.f11474e) != null) {
                progressDialog.dismiss();
            }
            FrameLayout frameLayout = WebDialog.this.f11476g;
            if (frameLayout != null) {
                frameLayout.setBackgroundColor(0);
            }
            WebView webViewM13123r = WebDialog.this.m13123r();
            if (webViewM13123r != null) {
                webViewM13123r.setVisibility(0);
            }
            ImageView imageView = WebDialog.this.f11475f;
            if (imageView != null) {
                imageView.setVisibility(0);
            }
            WebDialog.this.f11480x = true;
        }

        @Override // android.webkit.WebViewClient
        public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
            ProgressDialog progressDialog;
            sq8.m48649h(webView, "view");
            sq8.m48649h(str, ImagesContract.URL);
            cri.k0("FacebookSDK.WebDialog", "Webview loading URL: " + str);
            super.onPageStarted(webView, str, bitmap);
            if (WebDialog.this.f11479s || (progressDialog = WebDialog.this.f11474e) == null) {
                return;
            }
            progressDialog.show();
        }

        @Override // android.webkit.WebViewClient
        public void onReceivedError(WebView webView, int i, String str, String str2) {
            sq8.m48649h(webView, "view");
            sq8.m48649h(str, MediaTrack.ROLE_DESCRIPTION);
            sq8.m48649h(str2, "failingUrl");
            super.onReceivedError(webView, i, str, str2);
            WebDialog.this.m13128y(new qr6(str, i, str2));
        }

        @Override // android.webkit.WebViewClient
        public void onReceivedSslError(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
            sq8.m48649h(webView, "view");
            sq8.m48649h(sslErrorHandler, "handler");
            sq8.m48649h(sslError, Constants.IPC_BUNDLE_KEY_SEND_ERROR);
            super.onReceivedSslError(webView, sslErrorHandler, sslError);
            sslErrorHandler.cancel();
            WebDialog.this.m13128y(new qr6(null, -11, null));
        }

        @Override // android.webkit.WebViewClient
        public boolean shouldOverrideUrlLoading(WebView webView, String str) throws NumberFormatException {
            int i;
            sq8.m48649h(webView, "view");
            sq8.m48649h(str, ImagesContract.URL);
            cri.k0("FacebookSDK.WebDialog", "Redirect URL: " + str);
            Uri uri = Uri.parse(str);
            boolean z = uri.getPath() != null && Pattern.matches("^/(v\\d+\\.\\d+/)??dialog/.*", uri.getPath());
            if (!e9g.m24597K(str, WebDialog.this.f11471b, false, 2, null)) {
                if (e9g.m24597K(str, "fbconnect://cancel", false, 2, null)) {
                    WebDialog.this.cancel();
                    return true;
                }
                if (z || f9g.m26306P(str, "touch", false, 2, null)) {
                    return false;
                }
                try {
                    WebDialog.this.getContext().startActivity(new Intent("android.intent.action.VIEW", Uri.parse(str)));
                    return true;
                } catch (ActivityNotFoundException unused) {
                    return false;
                }
            }
            Bundle bundleMo13126w = WebDialog.this.mo13126w(str);
            String string = bundleMo13126w.getString(Constants.IPC_BUNDLE_KEY_SEND_ERROR);
            if (string == null) {
                string = bundleMo13126w.getString("error_type");
            }
            String string2 = bundleMo13126w.getString("error_msg");
            if (string2 == null) {
                string2 = bundleMo13126w.getString("error_message");
            }
            if (string2 == null) {
                string2 = bundleMo13126w.getString("error_description");
            }
            String string3 = bundleMo13126w.getString("error_code");
            if (string3 == null || cri.d0(string3)) {
                i = -1;
            } else {
                try {
                    i = Integer.parseInt(string3);
                } catch (NumberFormatException unused2) {
                }
            }
            if (cri.d0(string) && cri.d0(string2) && i == -1) {
                WebDialog.this.m13129z(bundleMo13126w);
            } else if ((string == null || !(sq8.m48644c(string, "access_denied") || sq8.m48644c(string, "OAuthAccessDeniedException"))) && i != 4201) {
                WebDialog.this.m13128y(new is6(new FacebookRequestError(i, string, string2), string2));
            } else {
                WebDialog.this.cancel();
            }
            return true;
        }
    }

    /* renamed from: com.facebook.internal.WebDialog$d */
    public interface InterfaceC10786d {
        /* renamed from: a */
        void mo13143a(Bundle bundle, ur6 ur6Var);
    }

    /* renamed from: com.facebook.internal.WebDialog$e */
    public final class AsyncTaskC10787e extends AsyncTask {

        /* renamed from: a */
        public final String f11490a;

        /* renamed from: b */
        public final Bundle f11491b;

        /* renamed from: c */
        public Exception[] f11492c;

        /* renamed from: d */
        public final /* synthetic */ WebDialog f11493d;

        public AsyncTaskC10787e(WebDialog webDialog, String str, Bundle bundle) {
            sq8.m48649h(str, "action");
            sq8.m48649h(bundle, "parameters");
            this.f11493d = webDialog;
            this.f11490a = str;
            this.f11491b = bundle;
            this.f11492c = new Exception[0];
        }

        /* renamed from: c */
        public static final void m13145c(String[] strArr, int i, AsyncTaskC10787e asyncTaskC10787e, CountDownLatch countDownLatch, C10776f c10776f) {
            FacebookRequestError facebookRequestErrorM13064b;
            String str;
            sq8.m48649h(strArr, "$results");
            sq8.m48649h(asyncTaskC10787e, "this$0");
            sq8.m48649h(countDownLatch, "$latch");
            sq8.m48649h(c10776f, "response");
            try {
                facebookRequestErrorM13064b = c10776f.m13064b();
                str = "Error staging photo.";
            } catch (Exception e) {
                asyncTaskC10787e.f11492c[i] = e;
            }
            if (facebookRequestErrorM13064b != null) {
                String strM12821c = facebookRequestErrorM13064b.m12821c();
                if (strM12821c != null) {
                    str = strM12821c;
                }
                throw new vr6(c10776f, str);
            }
            JSONObject jSONObjectM13065c = c10776f.m13065c();
            if (jSONObjectM13065c == null) {
                throw new ur6("Error staging photo.");
            }
            String strOptString = jSONObjectM13065c.optString("uri");
            if (strOptString == null) {
                throw new ur6("Error staging photo.");
            }
            strArr[i] = strOptString;
            countDownLatch.countDown();
        }

        /* renamed from: b */
        public String[] m13146b(Void... voidArr) {
            if (a94.m16694d(this)) {
                return null;
            }
            try {
                sq8.m48649h(voidArr, "p0");
                String[] stringArray = this.f11491b.getStringArray("media");
                if (stringArray == null) {
                    return null;
                }
                final String[] strArr = new String[stringArray.length];
                this.f11492c = new Exception[stringArray.length];
                final CountDownLatch countDownLatch = new CountDownLatch(stringArray.length);
                ConcurrentLinkedQueue concurrentLinkedQueue = new ConcurrentLinkedQueue();
                AccessToken accessTokenM12774e = AccessToken.f11242y.m12774e();
                try {
                    int length = stringArray.length;
                    for (final int i = 0; i < length; i++) {
                        if (isCancelled()) {
                            Iterator it = concurrentLinkedQueue.iterator();
                            while (it.hasNext()) {
                                ((AsyncTaskC10774d) it.next()).cancel(true);
                            }
                            return null;
                        }
                        Uri uri = Uri.parse(stringArray[i]);
                        if (cri.f0(uri)) {
                            strArr[i] = uri.toString();
                            countDownLatch.countDown();
                        } else {
                            GraphRequest.InterfaceC10763b interfaceC10763b = new GraphRequest.InterfaceC10763b() { // from class: o.k5j
                                @Override // com.facebook.GraphRequest.InterfaceC10763b
                                /* renamed from: a */
                                public final void mo12873a(C10776f c10776f) {
                                    WebDialog.AsyncTaskC10787e.m13145c(strArr, i, this, countDownLatch, c10776f);
                                }
                            };
                            sq8.m48648g(uri, "uri");
                            concurrentLinkedQueue.add(xlf.m56465a(accessTokenM12774e, uri, interfaceC10763b).m12852l());
                        }
                    }
                    countDownLatch.await();
                    return strArr;
                } catch (Exception unused) {
                    Iterator it2 = concurrentLinkedQueue.iterator();
                    while (it2.hasNext()) {
                        ((AsyncTaskC10774d) it2.next()).cancel(true);
                    }
                    return null;
                }
            } catch (Throwable th) {
                a94.m16692b(th, this);
                return null;
            }
        }

        /* renamed from: d */
        public void m13147d(String[] strArr) {
            if (a94.m16694d(this)) {
                return;
            }
            try {
                ProgressDialog progressDialog = this.f11493d.f11474e;
                if (progressDialog != null) {
                    progressDialog.dismiss();
                }
                for (Exception exc : this.f11492c) {
                    if (exc != null) {
                        this.f11493d.m13128y(exc);
                        return;
                    }
                }
                if (strArr == null) {
                    this.f11493d.m13128y(new ur6("Failed to stage photos for web dialog"));
                    return;
                }
                List listM27255d = fp0.m27255d(strArr);
                if (listM27255d.contains(null)) {
                    this.f11493d.m13128y(new ur6("Failed to stage photos for web dialog"));
                    return;
                }
                cri.q0(this.f11491b, "media", new JSONArray((Collection) listM27255d));
                this.f11493d.f11470a = cri.m21662g(cgf.m21201b(), C10773c.m13031x() + "/dialog/" + this.f11490a, this.f11491b).toString();
                ImageView imageView = this.f11493d.f11475f;
                if (imageView == null) {
                    throw new IllegalStateException("Required value was null.".toString());
                }
                this.f11493d.m13120C((imageView.getDrawable().getIntrinsicWidth() / 2) + 1);
            } catch (Throwable th) {
                a94.m16692b(th, this);
            }
        }

        @Override // android.os.AsyncTask
        public /* bridge */ /* synthetic */ Object doInBackground(Object[] objArr) {
            if (a94.m16694d(this)) {
                return null;
            }
            try {
                return m13146b((Void[]) objArr);
            } catch (Throwable th) {
                a94.m16692b(th, this);
                return null;
            }
        }

        @Override // android.os.AsyncTask
        public /* bridge */ /* synthetic */ void onPostExecute(Object obj) {
            if (a94.m16694d(this)) {
                return;
            }
            try {
                m13147d((String[]) obj);
            } catch (Throwable th) {
                a94.m16692b(th, this);
            }
        }
    }

    /* renamed from: com.facebook.internal.WebDialog$f */
    public /* synthetic */ class C10788f {

        /* renamed from: a */
        public static final /* synthetic */ int[] f11494a;

        static {
            int[] iArr = new int[xka.values().length];
            try {
                iArr[xka.INSTAGRAM.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            f11494a = iArr;
        }
    }

    public /* synthetic */ WebDialog(Context context, String str, Bundle bundle, int i, xka xkaVar, InterfaceC10786d interfaceC10786d, id5 id5Var) {
        this(context, str, bundle, i, xkaVar, interfaceC10786d);
    }

    /* renamed from: D */
    public static final boolean m13100D(View view, MotionEvent motionEvent) {
        if (view.hasFocus()) {
            return false;
        }
        view.requestFocus();
        return false;
    }

    /* renamed from: p */
    public static final void m13115p(WebDialog webDialog, View view) {
        sq8.m48649h(webDialog, "this$0");
        webDialog.cancel();
    }

    /* renamed from: s */
    public static final void m13116s(Context context) throws PackageManager.NameNotFoundException {
        f11467H.m13139b(context);
    }

    /* renamed from: v */
    public static final void m13117v(WebDialog webDialog, DialogInterface dialogInterface) {
        sq8.m48649h(webDialog, "this$0");
        webDialog.cancel();
    }

    /* renamed from: A */
    public final void m13118A(String str) {
        sq8.m48649h(str, "expectedRedirectUrl");
        this.f11471b = str;
    }

    /* renamed from: B */
    public final void m13119B(InterfaceC10786d interfaceC10786d) {
        this.f11472c = interfaceC10786d;
    }

    /* renamed from: C */
    public final void m13120C(int i) {
        LinearLayout linearLayout = new LinearLayout(getContext());
        final Context context = getContext();
        WebView webView = new WebView(context) { // from class: com.facebook.internal.WebDialog$setUpWebView$1
            @Override // android.webkit.WebView, android.view.View
            public void onWindowFocusChanged(boolean z) {
                try {
                    super.onWindowFocusChanged(z);
                } catch (NullPointerException unused) {
                }
            }
        };
        this.f11473d = webView;
        webView.setVerticalScrollBarEnabled(false);
        WebView webView2 = this.f11473d;
        if (webView2 != null) {
            webView2.setHorizontalScrollBarEnabled(false);
        }
        WebView webView3 = this.f11473d;
        if (webView3 != null) {
            webView3.setWebViewClient(new C10785c());
        }
        WebView webView4 = this.f11473d;
        WebSettings settings = webView4 != null ? webView4.getSettings() : null;
        if (settings != null) {
            settings.setJavaScriptEnabled(true);
        }
        WebView webView5 = this.f11473d;
        if (webView5 != null) {
            String str = this.f11470a;
            if (str == null) {
                throw new IllegalStateException("Required value was null.".toString());
            }
            webView5.loadUrl(str);
        }
        WebView webView6 = this.f11473d;
        if (webView6 != null) {
            webView6.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        }
        WebView webView7 = this.f11473d;
        if (webView7 != null) {
            webView7.setVisibility(4);
        }
        WebView webView8 = this.f11473d;
        WebSettings settings2 = webView8 != null ? webView8.getSettings() : null;
        if (settings2 != null) {
            settings2.setSavePassword(false);
        }
        WebView webView9 = this.f11473d;
        WebSettings settings3 = webView9 != null ? webView9.getSettings() : null;
        if (settings3 != null) {
            settings3.setSaveFormData(false);
        }
        WebView webView10 = this.f11473d;
        if (webView10 != null) {
            webView10.setFocusable(true);
        }
        WebView webView11 = this.f11473d;
        if (webView11 != null) {
            webView11.setFocusableInTouchMode(true);
        }
        WebView webView12 = this.f11473d;
        if (webView12 != null) {
            webView12.setOnTouchListener(new View.OnTouchListener() { // from class: o.i5j
                @Override // android.view.View.OnTouchListener
                public final boolean onTouch(View view, MotionEvent motionEvent) {
                    return WebDialog.m13100D(view, motionEvent);
                }
            });
        }
        linearLayout.setPadding(i, i, i, i);
        linearLayout.addView(this.f11473d);
        linearLayout.setBackgroundColor(-872415232);
        FrameLayout frameLayout = this.f11476g;
        if (frameLayout != null) {
            frameLayout.addView(linearLayout);
        }
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public void cancel() {
        if (this.f11472c == null || this.f11478q) {
            return;
        }
        m13128y(new wr6());
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public void dismiss() {
        ProgressDialog progressDialog;
        WebView webView = this.f11473d;
        if (webView != null) {
            webView.stopLoading();
        }
        if (!this.f11479s && (progressDialog = this.f11474e) != null && progressDialog.isShowing()) {
            progressDialog.dismiss();
        }
        super.dismiss();
    }

    /* renamed from: o */
    public final void m13121o() throws Resources.NotFoundException {
        ImageView imageView = new ImageView(getContext());
        this.f11475f = imageView;
        imageView.setOnClickListener(new View.OnClickListener() { // from class: o.j5j
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                WebDialog.m13115p(this.f29840a, view);
            }
        });
        Drawable drawable = getContext().getResources().getDrawable(s7e.com_facebook_close);
        ImageView imageView2 = this.f11475f;
        if (imageView2 != null) {
            imageView2.setImageDrawable(drawable);
        }
        ImageView imageView3 = this.f11475f;
        if (imageView3 == null) {
            return;
        }
        imageView3.setVisibility(4);
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public void onAttachedToWindow() {
        WindowManager.LayoutParams layoutParams;
        Window window;
        WindowManager.LayoutParams attributes;
        this.f11479s = false;
        Context context = getContext();
        sq8.m48648g(context, "context");
        if (cri.o0(context) && (layoutParams = this.f11481y) != null) {
            if ((layoutParams != null ? layoutParams.token : null) == null) {
                if (layoutParams != null) {
                    Activity ownerActivity = getOwnerActivity();
                    layoutParams.token = (ownerActivity == null || (window = ownerActivity.getWindow()) == null || (attributes = window.getAttributes()) == null) ? null : attributes.token;
                }
                StringBuilder sb = new StringBuilder();
                sb.append("Set token on onAttachedToWindow(): ");
                WindowManager.LayoutParams layoutParams2 = this.f11481y;
                sb.append(layoutParams2 != null ? layoutParams2.token : null);
                cri.k0("FacebookSDK.WebDialog", sb.toString());
            }
        }
        super.onAttachedToWindow();
    }

    @Override // android.app.Dialog
    public void onCreate(Bundle bundle) throws Resources.NotFoundException {
        super.onCreate(bundle);
        ProgressDialog progressDialog = new ProgressDialog(getContext());
        this.f11474e = progressDialog;
        progressDialog.requestWindowFeature(1);
        ProgressDialog progressDialog2 = this.f11474e;
        if (progressDialog2 != null) {
            progressDialog2.setMessage(getContext().getString(eae.com_facebook_loading));
        }
        ProgressDialog progressDialog3 = this.f11474e;
        if (progressDialog3 != null) {
            progressDialog3.setCanceledOnTouchOutside(false);
        }
        ProgressDialog progressDialog4 = this.f11474e;
        if (progressDialog4 != null) {
            progressDialog4.setOnCancelListener(new DialogInterface.OnCancelListener() { // from class: o.h5j
                @Override // android.content.DialogInterface.OnCancelListener
                public final void onCancel(DialogInterface dialogInterface) {
                    WebDialog.m13117v(this.f26225a, dialogInterface);
                }
            });
        }
        requestWindowFeature(1);
        this.f11476g = new FrameLayout(getContext());
        m13127x();
        Window window = getWindow();
        if (window != null) {
            window.setGravity(17);
        }
        Window window2 = getWindow();
        if (window2 != null) {
            window2.setSoftInputMode(16);
        }
        m13121o();
        if (this.f11470a != null) {
            ImageView imageView = this.f11475f;
            if (imageView == null) {
                throw new IllegalStateException("Required value was null.".toString());
            }
            m13120C((imageView.getDrawable().getIntrinsicWidth() / 2) + 1);
        }
        FrameLayout frameLayout = this.f11476g;
        if (frameLayout != null) {
            frameLayout.addView(this.f11475f, new ViewGroup.LayoutParams(-2, -2));
        }
        FrameLayout frameLayout2 = this.f11476g;
        if (frameLayout2 == null) {
            throw new IllegalStateException("Required value was null.".toString());
        }
        setContentView(frameLayout2);
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public void onDetachedFromWindow() {
        this.f11479s = true;
        super.onDetachedFromWindow();
    }

    @Override // android.app.Dialog, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        sq8.m48649h(keyEvent, "event");
        if (i == 4) {
            WebView webView = this.f11473d;
            if (webView != null) {
                boolean z = false;
                if (webView != null && webView.canGoBack()) {
                    z = true;
                }
                if (z) {
                    WebView webView2 = this.f11473d;
                    if (webView2 != null) {
                        webView2.goBack();
                    }
                    return true;
                }
            }
            cancel();
        }
        return super.onKeyDown(i, keyEvent);
    }

    @Override // android.app.Dialog
    public void onStart() {
        super.onStart();
        AsyncTaskC10787e asyncTaskC10787e = this.f11477h;
        if (asyncTaskC10787e != null) {
            if ((asyncTaskC10787e != null ? asyncTaskC10787e.getStatus() : null) == AsyncTask.Status.PENDING) {
                AsyncTaskC10787e asyncTaskC10787e2 = this.f11477h;
                if (asyncTaskC10787e2 != null) {
                    asyncTaskC10787e2.execute(new Void[0]);
                }
                ProgressDialog progressDialog = this.f11474e;
                if (progressDialog != null) {
                    progressDialog.show();
                    return;
                }
                return;
            }
        }
        m13127x();
    }

    @Override // android.app.Dialog
    public void onStop() {
        AsyncTaskC10787e asyncTaskC10787e = this.f11477h;
        if (asyncTaskC10787e != null) {
            asyncTaskC10787e.cancel(true);
            ProgressDialog progressDialog = this.f11474e;
            if (progressDialog != null) {
                progressDialog.dismiss();
            }
        }
        super.onStop();
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public void onWindowAttributesChanged(WindowManager.LayoutParams layoutParams) {
        sq8.m48649h(layoutParams, OutcomeEventsTable.COLUMN_NAME_PARAMS);
        if (layoutParams.token == null) {
            this.f11481y = layoutParams;
        }
        super.onWindowAttributesChanged(layoutParams);
    }

    /* renamed from: q */
    public final int m13122q(int i, float f, int i2, int i3) {
        int i4 = (int) (i / f);
        return (int) (i * (i4 <= i2 ? 1.0d : i4 >= i3 ? 0.5d : (((i3 - i4) / (i3 - i2)) * 0.5d) + 0.5d));
    }

    /* renamed from: r */
    public final WebView m13123r() {
        return this.f11473d;
    }

    /* renamed from: t */
    public final boolean m13124t() {
        return this.f11478q;
    }

    /* renamed from: u */
    public final boolean m13125u() {
        return this.f11480x;
    }

    /* renamed from: w */
    public Bundle mo13126w(String str) {
        Uri uri = Uri.parse(str);
        Bundle bundleP0 = cri.p0(uri.getQuery());
        bundleP0.putAll(cri.p0(uri.getFragment()));
        return bundleP0;
    }

    /* renamed from: x */
    public final void m13127x() {
        Object systemService = getContext().getSystemService("window");
        sq8.m48647f(systemService, "null cannot be cast to non-null type android.view.WindowManager");
        Display defaultDisplay = ((WindowManager) systemService).getDefaultDisplay();
        DisplayMetrics displayMetrics = new DisplayMetrics();
        defaultDisplay.getMetrics(displayMetrics);
        int i = displayMetrics.widthPixels;
        int i2 = displayMetrics.heightPixels;
        int i3 = i < i2 ? i : i2;
        if (i < i2) {
            i = i2;
        }
        int iMin = Math.min(m13122q(i3, displayMetrics.density, 480, 800), displayMetrics.widthPixels);
        int iMin2 = Math.min(m13122q(i, displayMetrics.density, 800, 1280), displayMetrics.heightPixels);
        Window window = getWindow();
        if (window != null) {
            window.setLayout(iMin, iMin2);
        }
    }

    /* renamed from: y */
    public final void m13128y(Throwable th) {
        if (this.f11472c == null || this.f11478q) {
            return;
        }
        this.f11478q = true;
        ur6 ur6Var = th instanceof ur6 ? (ur6) th : new ur6(th);
        InterfaceC10786d interfaceC10786d = this.f11472c;
        if (interfaceC10786d != null) {
            interfaceC10786d.mo13143a(null, ur6Var);
        }
        dismiss();
    }

    /* renamed from: z */
    public final void m13129z(Bundle bundle) {
        InterfaceC10786d interfaceC10786d = this.f11472c;
        if (interfaceC10786d == null || this.f11478q) {
            return;
        }
        this.f11478q = true;
        if (interfaceC10786d != null) {
            interfaceC10786d.mo13143a(bundle, null);
        }
        dismiss();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public WebDialog(Context context, String str) {
        this(context, str, f11467H.m13138a());
        sq8.m48649h(context, "context");
        sq8.m48649h(str, ImagesContract.URL);
    }

    public WebDialog(Context context, String str, int i) {
        super(context, i == 0 ? f11467H.m13138a() : i);
        this.f11471b = "fbconnect://success";
        this.f11470a = str;
    }

    public WebDialog(Context context, String str, Bundle bundle, int i, xka xkaVar, InterfaceC10786d interfaceC10786d) {
        Uri uriM21662g;
        super(context, i == 0 ? f11467H.m13138a() : i);
        this.f11471b = "fbconnect://success";
        bundle = bundle == null ? new Bundle() : bundle;
        String str2 = cri.m21655X(context) ? "fbconnect://chrome_os_success" : "fbconnect://success";
        this.f11471b = str2;
        bundle.putString("redirect_uri", str2);
        bundle.putString(Constants.ScionAnalytics.MessageType.DISPLAY_NOTIFICATION, "touch");
        bundle.putString("client_id", C10773c.m13020m());
        h8g h8gVar = h8g.f26398a;
        String str3 = String.format(Locale.ROOT, "android-%s", Arrays.copyOf(new Object[]{C10773c.m12989C()}, 1));
        sq8.m48648g(str3, "format(locale, format, *args)");
        bundle.putString("sdk", str3);
        this.f11472c = interfaceC10786d;
        if (sq8.m48644c(str, FirebaseAnalytics.Event.SHARE) && bundle.containsKey("media")) {
            this.f11477h = new AsyncTaskC10787e(this, str, bundle);
            return;
        }
        if (C10788f.f11494a[xkaVar.ordinal()] == 1) {
            uriM21662g = cri.m21662g(cgf.m21210k(), "oauth/authorize", bundle);
        } else {
            uriM21662g = cri.m21662g(cgf.m21201b(), C10773c.m13031x() + "/dialog/" + str, bundle);
        }
        this.f11470a = uriM21662g.toString();
    }

    /* renamed from: com.facebook.internal.WebDialog$a */
    public static class C10783a {

        /* renamed from: a */
        public Context f11482a;

        /* renamed from: b */
        public String f11483b;

        /* renamed from: c */
        public String f11484c;

        /* renamed from: d */
        public int f11485d;

        /* renamed from: e */
        public InterfaceC10786d f11486e;

        /* renamed from: f */
        public Bundle f11487f;

        /* renamed from: g */
        public AccessToken f11488g;

        public C10783a(Context context, String str, Bundle bundle) {
            sq8.m48649h(context, "context");
            sq8.m48649h(str, "action");
            AccessToken.C10742c c10742c = AccessToken.f11242y;
            this.f11488g = c10742c.m12774e();
            if (!c10742c.m12776g()) {
                String strM21647K = cri.m21647K(context);
                if (strM21647K == null) {
                    throw new ur6("Attempted to create a builder without a valid access token or a valid default Application ID.");
                }
                this.f11483b = strM21647K;
            }
            m13131b(context, str, bundle);
        }

        /* renamed from: a */
        public WebDialog mo13130a() {
            AccessToken accessToken = this.f11488g;
            if (accessToken != null) {
                Bundle bundle = this.f11487f;
                if (bundle != null) {
                    bundle.putString("app_id", accessToken != null ? accessToken.m12751c() : null);
                }
                Bundle bundle2 = this.f11487f;
                if (bundle2 != null) {
                    AccessToken accessToken2 = this.f11488g;
                    bundle2.putString("access_token", accessToken2 != null ? accessToken2.m12760l() : null);
                }
            } else {
                Bundle bundle3 = this.f11487f;
                if (bundle3 != null) {
                    bundle3.putString("app_id", this.f11483b);
                }
            }
            C10784b c10784b = WebDialog.f11467H;
            Context context = this.f11482a;
            if (context != null) {
                return c10784b.m13140c(context, this.f11484c, this.f11487f, this.f11485d, this.f11486e);
            }
            throw new IllegalStateException("Required value was null.".toString());
        }

        /* renamed from: b */
        public final void m13131b(Context context, String str, Bundle bundle) {
            this.f11482a = context;
            this.f11484c = str;
            if (bundle != null) {
                this.f11487f = bundle;
            } else {
                this.f11487f = new Bundle();
            }
        }

        /* renamed from: c */
        public final String m13132c() {
            return this.f11483b;
        }

        /* renamed from: d */
        public final Context m13133d() {
            return this.f11482a;
        }

        /* renamed from: e */
        public final InterfaceC10786d m13134e() {
            return this.f11486e;
        }

        /* renamed from: f */
        public final Bundle m13135f() {
            return this.f11487f;
        }

        /* renamed from: g */
        public final int m13136g() {
            return this.f11485d;
        }

        /* renamed from: h */
        public final C10783a m13137h(InterfaceC10786d interfaceC10786d) {
            this.f11486e = interfaceC10786d;
            return this;
        }

        public C10783a(Context context, String str, String str2, Bundle bundle) {
            sq8.m48649h(context, "context");
            sq8.m48649h(str2, "action");
            this.f11483b = rri.m47116k(str == null ? cri.m21647K(context) : str, "applicationId");
            m13131b(context, str2, bundle);
        }
    }
}
