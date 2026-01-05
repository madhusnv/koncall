package ai.salesmax;

import ai.salesmax.SuperfoneApplication;
import ai.salesmax.auth.AuthUtil;
import ai.salesmax.model.ConnectionAwareObservable;
import ai.salesmax.onesignal.OneSignalSubscriptionManager;
import ai.salesmax.ui.service.CallStateManagerRestarterBroadcastReceiver;
import ai.salesmax.util.Prefs;
import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkCapabilities;
import android.os.Bundle;
import android.telephony.TelephonyManager;
import android.util.Log;
import androidx.appcompat.app.AbstractC1783b;
import androidx.appcompat.app.AppCompatActivity;
import androidx.work.Configuration;
import com.amazonaws.util.StringUtils;
import com.amplifyframework.AmplifyException;
import com.amplifyframework.api.aws.AWSApiPlugin;
import com.amplifyframework.api.aws.OkHttpConfigurator;
import com.amplifyframework.auth.AuthChannelEventName;
import com.amplifyframework.auth.cognito.AWSCognitoAuthPlugin;
import com.amplifyframework.core.Amplify;
import com.amplifyframework.core.InitializationStatus;
import com.amplifyframework.hub.HubChannel;
import com.amplifyframework.hub.HubEvent;
import com.amplifyframework.hub.HubSubscriber;
import com.amplifyframework.predictions.aws.AWSPredictionsPlugin;
import com.amplifyframework.storage.s3.AWSS3StoragePlugin;
import com.google.android.gms.maps.MapsInitializer;
import com.google.firebase.crashlytics.FirebaseCrashlytics;
import com.google.firebase.crashlytics.ktx.FirebaseCrashlyticsKt;
import com.google.firebase.ktx.Firebase;
import com.google.firebase.messaging.Constants;
import com.onesignal.OneSignal;
import com.onesignal.notifications.INotificationsManager;
import java.io.IOException;
import java.lang.Thread;
import java.lang.ref.WeakReference;
import java.net.InetAddress;
import java.net.SocketException;
import java.net.UnknownHostException;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;
import java.util.function.Predicate;
import p000.C2675c;
import p001o.ch3;
import p001o.cl3;
import p001o.e3i;
import p001o.el3;
import p001o.eu5;
import p001o.f64;
import p001o.fwe;
import p001o.gu3;
import p001o.h84;
import p001o.hac;
import p001o.i84;
import p001o.id5;
import p001o.itf;
import p001o.j01;
import p001o.jgg;
import p001o.jpa;
import p001o.ke1;
import p001o.kf9;
import p001o.ml1;
import p001o.n64;
import p001o.nl7;
import p001o.ov5;
import p001o.p74;
import p001o.pm1;
import p001o.qm1;
import p001o.ryh;
import p001o.s07;
import p001o.sq8;
import p001o.ttb;
import p001o.uq8;
import p001o.v16;
import p001o.wre;
import p001o.x6c;
import p001o.xk7;
import p001o.y3i;
import p001o.z74;
import p001o.zr1;
import p001o.ztb;

/* loaded from: classes.dex */
public final class SuperfoneApplication extends Application implements Configuration.Provider, Application.ActivityLifecycleCallbacks {

    /* renamed from: c */
    public static final C0044a f225c = new C0044a(null);

    /* renamed from: d */
    public static final int f226d = 8;

    /* renamed from: e */
    public static Prefs f227e;

    /* renamed from: f */
    public static itf f228f;

    /* renamed from: g */
    public static WeakReference f229g;

    /* renamed from: h */
    public static String f230h;

    /* renamed from: a */
    public final h84 f231a = p74.f39487a.m43082j();

    /* renamed from: b */
    public final cl3 f232b = el3.m25197b(null, 1, null);

    /* renamed from: ai.salesmax.SuperfoneApplication$a */
    public static final class C0044a {
        public C0044a() {
        }

        public /* synthetic */ C0044a(id5 id5Var) {
            this();
        }

        /* renamed from: a */
        public final Activity m125a() {
            WeakReference weakReference = SuperfoneApplication.f229g;
            if (weakReference != null) {
                return (Activity) weakReference.get();
            }
            return null;
        }

        /* renamed from: b */
        public final String m126b() {
            return SuperfoneApplication.f230h;
        }

        /* renamed from: c */
        public final Prefs m127c() {
            return SuperfoneApplication.f227e;
        }

        /* renamed from: d */
        public final itf m128d() {
            return SuperfoneApplication.f228f;
        }

        /* renamed from: e */
        public final x6c m129e(x6c x6cVar, Runnable runnable, Runnable runnable2, String str) {
            sq8.m48649h(x6cVar, "observable");
            sq8.m48649h(runnable, "onPauseCallback");
            sq8.m48649h(runnable2, "onResumeCallback");
            Activity activityM125a = m125a();
            x6c connectionAwareObservable = activityM125a != null ? activityM125a instanceof AppCompatActivity ? ConnectionAwareObservable.getConnectionAwareObservable((AppCompatActivity) activityM125a, x6cVar, runnable, runnable2, str) : x6c.m55693G() : null;
            return connectionAwareObservable == null ? x6cVar : connectionAwareObservable;
        }

        /* renamed from: f */
        public final x6c m130f(x6c x6cVar, String str) {
            sq8.m48649h(x6cVar, "observable");
            Activity activityM125a = m125a();
            x6c connectionAwareObservable = activityM125a != null ? activityM125a instanceof AppCompatActivity ? ConnectionAwareObservable.getConnectionAwareObservable((AppCompatActivity) activityM125a, x6cVar, str) : x6c.m55693G() : null;
            return connectionAwareObservable == null ? x6cVar : connectionAwareObservable;
        }
    }

    /* renamed from: ai.salesmax.SuperfoneApplication$b */
    public /* synthetic */ class C0045b {

        /* renamed from: a */
        public static final /* synthetic */ int[] f233a;

        static {
            int[] iArr = new int[AuthChannelEventName.values().length];
            try {
                iArr[AuthChannelEventName.SIGNED_IN.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[AuthChannelEventName.SIGNED_OUT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[AuthChannelEventName.SESSION_EXPIRED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f233a = iArr;
        }
    }

    /* renamed from: ai.salesmax.SuperfoneApplication$c */
    public static final class C0046c extends kf9 implements xk7 {

        /* renamed from: a */
        public static final C0046c f234a = new C0046c();

        public C0046c() {
            super(1);
        }

        @Override // p001o.xk7
        public final Boolean invoke(String str) {
            return Boolean.valueOf(!StringUtils.isBlank(str));
        }
    }

    /* renamed from: ai.salesmax.SuperfoneApplication$d */
    public static final class C0047d extends kf9 implements xk7 {

        /* renamed from: a */
        public static final C0047d f235a = new C0047d();

        public C0047d() {
            super(1);
        }

        @Override // p001o.xk7
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((String) obj);
            return y3i.f54824a;
        }

        public final void invoke(String str) {
            sq8.m48649h(str, "it");
            FirebaseCrashlyticsKt.getCrashlytics(Firebase.INSTANCE).setUserId(str);
        }
    }

    /* renamed from: ai.salesmax.SuperfoneApplication$e */
    public static final class C0048e extends kf9 implements xk7 {

        /* renamed from: a */
        public static final C0048e f236a = new C0048e();

        public C0048e() {
            super(1);
        }

        @Override // p001o.xk7
        public final Boolean invoke(String str) {
            return Boolean.valueOf(!StringUtils.isBlank(str));
        }
    }

    /* renamed from: ai.salesmax.SuperfoneApplication$f */
    public static final class C0049f extends kf9 implements xk7 {

        /* renamed from: a */
        public static final C0049f f237a = new C0049f();

        public C0049f() {
            super(1);
        }

        @Override // p001o.xk7
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((String) obj);
            return y3i.f54824a;
        }

        public final void invoke(String str) {
            sq8.m48649h(str, "it");
            FirebaseCrashlyticsKt.getCrashlytics(Firebase.INSTANCE).setCustomKey("userId", str);
        }
    }

    /* renamed from: ai.salesmax.SuperfoneApplication$g */
    public static final class C0050g extends kf9 implements xk7 {

        /* renamed from: a */
        public static final C0050g f238a = new C0050g();

        public C0050g() {
            super(1);
        }

        @Override // p001o.xk7
        public final Boolean invoke(String str) {
            return Boolean.valueOf(!StringUtils.isBlank(str));
        }
    }

    /* renamed from: ai.salesmax.SuperfoneApplication$h */
    public static final class C0051h extends kf9 implements xk7 {

        /* renamed from: a */
        public static final C0051h f239a = new C0051h();

        public C0051h() {
            super(1);
        }

        @Override // p001o.xk7
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((String) obj);
            return y3i.f54824a;
        }

        public final void invoke(String str) {
            sq8.m48649h(str, "it");
            FirebaseCrashlyticsKt.getCrashlytics(Firebase.INSTANCE).setCustomKey("accountId", str);
        }
    }

    /* renamed from: ai.salesmax.SuperfoneApplication$i */
    public static final class C0052i extends jgg implements nl7 {

        /* renamed from: a */
        public int f240a;

        public C0052i(n64 n64Var) {
            super(2, n64Var);
        }

        @Override // p001o.vb1
        public final n64 create(Object obj, n64 n64Var) {
            return SuperfoneApplication.this.new C0052i(n64Var);
        }

        @Override // p001o.vb1
        public final Object invokeSuspend(Object obj) {
            Object objM51918f = uq8.m51918f();
            int i = this.f240a;
            try {
                if (i == 0) {
                    wre.m54934b(obj);
                    cl3 cl3Var = SuperfoneApplication.this.f232b;
                    this.f240a = 1;
                    if (cl3Var.mo21334s(this) == objM51918f) {
                        return objM51918f;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    wre.m54934b(obj);
                }
                return y3i.f54824a;
            } catch (Throwable th) {
                return ml1.m39304d(Log.e("SuperfoneApplication", "Amplify initialization failed", th));
            }
        }

        @Override // p001o.nl7
        public final Object invoke(h84 h84Var, n64 n64Var) {
            return ((C0052i) create(h84Var, n64Var)).invokeSuspend(y3i.f54824a);
        }
    }

    /* renamed from: ai.salesmax.SuperfoneApplication$j */
    public static final class C0053j extends jgg implements xk7 {

        /* renamed from: a */
        public int f242a;

        public C0053j(n64 n64Var) {
            super(1, n64Var);
        }

        @Override // p001o.vb1
        public final n64 create(n64 n64Var) {
            return SuperfoneApplication.this.new C0053j(n64Var);
        }

        @Override // p001o.vb1
        public final Object invokeSuspend(Object obj) {
            Object objM51918f = uq8.m51918f();
            int i = this.f242a;
            try {
                if (i == 0) {
                    wre.m54934b(obj);
                    j01 j01VarM32992a = j01.f29455d.m32992a();
                    this.f242a = 1;
                    if (j01VarM32992a.m32987p(true, this) == objM51918f) {
                        return objM51918f;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    wre.m54934b(obj);
                }
                AuthUtil.f257a.m141f();
                Amplify.Hub.publish(HubChannel.LOGGING, HubEvent.create("APP_LOGIN"));
                CallStateManagerRestarterBroadcastReceiver.m2585m(SuperfoneApplication.this.getApplicationContext());
                return y3i.f54824a;
            } catch (Exception e) {
                return ml1.m39304d(Log.e("AuthQuickStart", "Couldn't refresh auth session after sign in", e));
            }
        }

        @Override // p001o.xk7
        public final Object invoke(n64 n64Var) {
            return ((C0053j) create(n64Var)).invokeSuspend(y3i.f54824a);
        }
    }

    /* renamed from: ai.salesmax.SuperfoneApplication$k */
    public static final class C0054k extends jgg implements xk7 {

        /* renamed from: a */
        public int f244a;

        public C0054k(n64 n64Var) {
            super(1, n64Var);
        }

        @Override // p001o.vb1
        public final n64 create(n64 n64Var) {
            return new C0054k(n64Var);
        }

        @Override // p001o.vb1
        public final Object invokeSuspend(Object obj) {
            Object objM51918f = uq8.m51918f();
            int i = this.f244a;
            try {
                if (i == 0) {
                    wre.m54934b(obj);
                    j01 j01VarM32992a = j01.f29455d.m32992a();
                    this.f244a = 1;
                    if (j01VarM32992a.m32987p(true, this) == objM51918f) {
                        return objM51918f;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    wre.m54934b(obj);
                }
                return y3i.f54824a;
            } catch (Exception e) {
                return ml1.m39304d(Log.e("AuthQuickstart", "Error refreshing session after expiration", e));
            }
        }

        @Override // p001o.xk7
        public final Object invoke(n64 n64Var) {
            return ((C0054k) create(n64Var)).invokeSuspend(y3i.f54824a);
        }
    }

    /* renamed from: ai.salesmax.SuperfoneApplication$l */
    public static final class C0055l extends jgg implements xk7 {

        /* renamed from: a */
        public int f245a;

        /* renamed from: ai.salesmax.SuperfoneApplication$l$a */
        public static final class a extends jgg implements nl7 {

            /* renamed from: a */
            public int f247a;

            /* renamed from: b */
            public final /* synthetic */ ke1 f248b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(ke1 ke1Var, n64 n64Var) {
                super(2, n64Var);
                this.f248b = ke1Var;
            }

            @Override // p001o.vb1
            public final n64 create(Object obj, n64 n64Var) {
                return new a(this.f248b, n64Var);
            }

            @Override // p001o.vb1
            public final Object invokeSuspend(Object obj) {
                uq8.m51918f();
                if (this.f247a != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                wre.m54934b(obj);
                return ml1.m39304d(this.f248b != null ? Log.d("superfone-application", "Database is registered.") : Log.d("superfone-application", "Database not registered."));
            }

            @Override // p001o.nl7
            public final Object invoke(h84 h84Var, n64 n64Var) {
                return ((a) create(h84Var, n64Var)).invokeSuspend(y3i.f54824a);
            }
        }

        public C0055l(n64 n64Var) {
            super(1, n64Var);
        }

        @Override // p001o.vb1
        public final n64 create(n64 n64Var) {
            return SuperfoneApplication.this.new C0055l(n64Var);
        }

        @Override // p001o.vb1
        public final Object invokeSuspend(Object obj) {
            Object objM51918f = uq8.m51918f();
            int i = this.f245a;
            if (i == 0) {
                wre.m54934b(obj);
                ke1.C14789a c14789a = ke1.f32003i;
                Context applicationContext = SuperfoneApplication.this.getApplicationContext();
                sq8.m48648g(applicationContext, "getApplicationContext(...)");
                c14789a.m35526b(applicationContext);
                ke1 ke1VarM35525a = c14789a.m35525a();
                jpa jpaVarM25612c = eu5.m25612c();
                a aVar = new a(ke1VarM35525a, null);
                this.f245a = 1;
                obj = pm1.m43867g(jpaVarM25612c, aVar, this);
                if (obj == objM51918f) {
                    return objM51918f;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                wre.m54934b(obj);
            }
            return obj;
        }

        @Override // p001o.xk7
        public final Object invoke(n64 n64Var) {
            return ((C0055l) create(n64Var)).invokeSuspend(y3i.f54824a);
        }
    }

    /* renamed from: ai.salesmax.SuperfoneApplication$m */
    public static final class C0056m implements gu3 {
        public C0056m() {
        }

        @Override // p001o.gu3
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final void accept(Throwable th) {
            y3i y3iVar;
            Throwable cause;
            sq8.m48649h(th, Constants.IPC_BUNDLE_KEY_SEND_ERROR);
            if ((th instanceof e3i) && (cause = th.getCause()) != null) {
                th = cause;
            }
            if (th instanceof IOException ? true : th instanceof SocketException) {
                String message = th.getMessage();
                StringBuilder sb = new StringBuilder();
                sb.append("Ignored network exception: ");
                sb.append(message);
                return;
            }
            if (th instanceof InterruptedException) {
                String message2 = th.getMessage();
                StringBuilder sb2 = new StringBuilder();
                sb2.append("Ignored thread interruption: ");
                sb2.append(message2);
                return;
            }
            if (!(th instanceof NullPointerException ? true : th instanceof IllegalArgumentException ? true : th instanceof IllegalStateException)) {
                String message3 = th.getMessage();
                StringBuilder sb3 = new StringBuilder();
                sb3.append("Unhandled exception type: ");
                sb3.append(message3);
                FirebaseCrashlyticsKt.getCrashlytics(Firebase.INSTANCE).recordException(th);
                return;
            }
            String message4 = th.getMessage();
            StringBuilder sb4 = new StringBuilder();
            sb4.append("Critical exception caught: ");
            sb4.append(message4);
            Thread.UncaughtExceptionHandler uncaughtExceptionHandler = Thread.currentThread().getUncaughtExceptionHandler();
            if (uncaughtExceptionHandler != null) {
                uncaughtExceptionHandler.uncaughtException(Thread.currentThread(), th);
                y3iVar = y3i.f54824a;
            } else {
                y3iVar = null;
            }
            if (y3iVar == null) {
                FirebaseCrashlyticsKt.getCrashlytics(Firebase.INSTANCE).recordException(th);
            }
        }
    }

    /* renamed from: ai.salesmax.SuperfoneApplication$n */
    public static final class C0057n extends jgg implements xk7 {

        /* renamed from: a */
        public int f250a;

        public C0057n(n64 n64Var) {
            super(1, n64Var);
        }

        @Override // p001o.vb1
        public final n64 create(n64 n64Var) {
            return SuperfoneApplication.this.new C0057n(n64Var);
        }

        @Override // p001o.vb1
        public final Object invokeSuspend(Object obj) {
            uq8.m51918f();
            if (this.f250a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            wre.m54934b(obj);
            ztb.C18703a c18703a = ztb.f57673d;
            Context applicationContext = SuperfoneApplication.this.getApplicationContext();
            sq8.m48648g(applicationContext, "getApplicationContext(...)");
            c18703a.m59893c(applicationContext);
            ztb ztbVarM59892b = c18703a.m59892b();
            if (ztbVarM59892b != null) {
                return ml1.m39301a(ztbVarM59892b.m59887e());
            }
            return null;
        }

        @Override // p001o.xk7
        public final Object invoke(n64 n64Var) {
            return ((C0057n) create(n64Var)).invokeSuspend(y3i.f54824a);
        }
    }

    /* renamed from: ai.salesmax.SuperfoneApplication$o */
    public static final class C0058o extends jgg implements xk7 {

        /* renamed from: a */
        public int f252a;

        /* renamed from: ai.salesmax.SuperfoneApplication$o$a */
        public static final class a extends jgg implements nl7 {

            /* renamed from: a */
            public int f254a;

            public a(n64 n64Var) {
                super(2, n64Var);
            }

            @Override // p001o.vb1
            public final n64 create(Object obj, n64 n64Var) {
                return new a(n64Var);
            }

            @Override // p001o.vb1
            public final Object invokeSuspend(Object obj) {
                Object objM51918f = uq8.m51918f();
                int i = this.f254a;
                if (i == 0) {
                    wre.m54934b(obj);
                    INotificationsManager notifications = OneSignal.getNotifications();
                    this.f254a = 1;
                    obj = notifications.requestPermission(true, this);
                    if (obj == objM51918f) {
                        return objM51918f;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    wre.m54934b(obj);
                }
                return obj;
            }

            @Override // p001o.nl7
            public final Object invoke(h84 h84Var, n64 n64Var) {
                return ((a) create(h84Var, n64Var)).invokeSuspend(y3i.f54824a);
            }
        }

        public C0058o(n64 n64Var) {
            super(1, n64Var);
        }

        @Override // p001o.vb1
        public final n64 create(n64 n64Var) {
            return SuperfoneApplication.this.new C0058o(n64Var);
        }

        @Override // p001o.vb1
        public final Object invokeSuspend(Object obj) {
            Object objM51918f = uq8.m51918f();
            int i = this.f252a;
            if (i == 0) {
                wre.m54934b(obj);
                OneSignalSubscriptionManager.instance(SuperfoneApplication.this);
                if (!OneSignalSubscriptionManager.isPermissionSet()) {
                    z74 z74VarM25611b = eu5.m25611b();
                    a aVar = new a(null);
                    this.f252a = 1;
                    if (pm1.m43867g(z74VarM25611b, aVar, this) == objM51918f) {
                        return objM51918f;
                    }
                }
                return y3i.f54824a;
            }
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            wre.m54934b(obj);
            OneSignalSubscriptionManager.setPermissionSet(true);
            return y3i.f54824a;
        }

        @Override // p001o.xk7
        public final Object invoke(n64 n64Var) {
            return ((C0058o) create(n64Var)).invokeSuspend(y3i.f54824a);
        }
    }

    /* renamed from: C */
    public static final void m91C(SuperfoneApplication superfoneApplication, HubEvent hubEvent) {
        sq8.m48649h(superfoneApplication, "this$0");
        sq8.m48649h(hubEvent, "hubEvent");
        String name = hubEvent.getName();
        if (sq8.m48644c(name, InitializationStatus.SUCCEEDED.toString()) || sq8.m48644c(name, InitializationStatus.FAILED.toString())) {
            return;
        }
        String name2 = hubEvent.getName();
        sq8.m48648g(name2, "getName(...)");
        int i = C0045b.f233a[AuthChannelEventName.valueOf(name2).ordinal()];
        if (i == 1) {
            p74.f39487a.m43079g(superfoneApplication.new C0053j(null));
            return;
        }
        if (i != 2) {
            if (i != 3) {
                return;
            }
            p74.f39487a.m43078f(superfoneApplication.f231a, new C0054k(null));
            return;
        }
        j01.f29455d.m32992a().m32989r();
        CallStateManagerRestarterBroadcastReceiver.m2580h(superfoneApplication.getApplicationContext());
        Activity activityM125a = f225c.m125a();
        if (activityM125a == null || !(activityM125a instanceof MainActivity)) {
            return;
        }
        ((MainActivity) activityM125a).e3();
    }

    /* renamed from: p */
    public static final void m106p(final SuperfoneApplication superfoneApplication, hac.C13902a c13902a) {
        sq8.m48649h(superfoneApplication, "this$0");
        sq8.m48649h(c13902a, "okHttpBuilder");
        c13902a.m30122i(new ov5() { // from class: o.ddg
            @Override // p001o.ov5
            public final List lookup(String str) {
                return SuperfoneApplication.m107q(this.f19625c, str);
            }
        });
        c13902a.m30114a(new C2675c(false));
    }

    /* renamed from: q */
    public static final List m107q(SuperfoneApplication superfoneApplication, String str) {
        sq8.m48649h(superfoneApplication, "this$0");
        sq8.m48649h(str, "hostname");
        try {
            List listLookup = ov5.f38963b.lookup(str);
            zr1.f57558c.m59786a().m59785c(str, listLookup);
            return listLookup;
        } catch (UnknownHostException e) {
            FirebaseCrashlytics firebaseCrashlytics = FirebaseCrashlytics.getInstance();
            firebaseCrashlytics.setCustomKey("errorType", "DNS resolution failure");
            firebaseCrashlytics.setCustomKey("hostname", str);
            firebaseCrashlytics.setCustomKey("networkState", superfoneApplication.m122r(superfoneApplication));
            firebaseCrashlytics.recordException(e);
            StringBuilder sb = new StringBuilder();
            sb.append("DNS resolution failed for ");
            sb.append(str);
            sb.append(", using fallback DNS");
            List listM59784b = zr1.f57558c.m59786a().m59784b(str);
            StringBuilder sb2 = new StringBuilder();
            sb2.append("getting cached inet address: ");
            sb2.append(listM59784b);
            if (!((listM59784b == null || listM59784b.isEmpty()) ? false : true)) {
                listM59784b = null;
            }
            if (listM59784b == null) {
                listM59784b = ch3.m21249n(InetAddress.getByName("8.8.8.8"), InetAddress.getByName("8.8.4.4"));
            }
            return listM59784b;
        }
    }

    /* renamed from: t */
    public static final void m108t(xk7 xk7Var, Object obj) {
        sq8.m48649h(xk7Var, "$tmp0");
        xk7Var.invoke(obj);
    }

    /* renamed from: u */
    public static final boolean m109u(xk7 xk7Var, Object obj) {
        sq8.m48649h(xk7Var, "$tmp0");
        return ((Boolean) xk7Var.invoke(obj)).booleanValue();
    }

    /* renamed from: v */
    public static final void m110v(xk7 xk7Var, Object obj) {
        sq8.m48649h(xk7Var, "$tmp0");
        xk7Var.invoke(obj);
    }

    /* renamed from: w */
    public static final boolean m111w(xk7 xk7Var, Object obj) {
        sq8.m48649h(xk7Var, "$tmp0");
        return ((Boolean) xk7Var.invoke(obj)).booleanValue();
    }

    /* renamed from: x */
    public static final void m112x(xk7 xk7Var, Object obj) {
        sq8.m48649h(xk7Var, "$tmp0");
        xk7Var.invoke(obj);
    }

    /* renamed from: y */
    public static final boolean m113y(xk7 xk7Var, Object obj) {
        sq8.m48649h(xk7Var, "$tmp0");
        return ((Boolean) xk7Var.invoke(obj)).booleanValue();
    }

    /* renamed from: A */
    public final void m114A() {
        StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
        if (stackTrace.length > 4) {
            StackTraceElement stackTraceElement = stackTrace[4];
            String className = stackTraceElement.getClassName();
            String methodName = stackTraceElement.getMethodName();
            String fileName = stackTraceElement.getFileName();
            int lineNumber = stackTraceElement.getLineNumber();
            StringBuilder sb = new StringBuilder();
            sb.append("Called from: ");
            sb.append(className);
            sb.append(".");
            sb.append(methodName);
            sb.append(" (");
            sb.append(fileName);
            sb.append(":");
            sb.append(lineNumber);
            sb.append(")");
        }
    }

    /* renamed from: B */
    public final void m115B() {
        Amplify.Hub.subscribe(HubChannel.AUTH, new HubSubscriber() { // from class: o.wcg
            @Override // com.amplifyframework.hub.HubSubscriber
            public final void onEvent(HubEvent hubEvent) {
                SuperfoneApplication.m91C(this.f51795a, hubEvent);
            }
        });
    }

    /* renamed from: D */
    public final void m116D() {
        f64.f22783a.m26204a().m26203d(f64.EnumC13346b.APPLICATION, getApplicationContext());
    }

    /* renamed from: E */
    public final void m117E() {
        p74.f39487a.m43079g(new C0055l(null));
    }

    /* renamed from: F */
    public final void m118F() {
        fwe.m27580B(new C0056m());
    }

    /* renamed from: G */
    public final void m119G() {
        p74.f39487a.m43079g(new C0057n(null));
    }

    /* renamed from: H */
    public final void m120H() {
        String name = Thread.currentThread().getName();
        StringBuilder sb = new StringBuilder();
        sb.append("registerOneSignal called on: ");
        sb.append(name);
        m114A();
        p74.f39487a.m43078f(this.f231a, new C0058o(null));
    }

    @Override // androidx.work.Configuration.Provider
    public Configuration getWorkManagerConfiguration() {
        Configuration configurationBuild = new Configuration.Builder().build();
        sq8.m48646e(configurationBuild);
        return configurationBuild;
    }

    /* renamed from: o */
    public final AWSApiPlugin m121o() {
        AWSApiPlugin aWSApiPluginBuild = AWSApiPlugin.builder().configureClient("superfoneAngularApp", new OkHttpConfigurator() { // from class: o.vcg
            @Override // com.amplifyframework.api.aws.OkHttpConfigurator
            public final void applyConfiguration(hac.C13902a c13902a) {
                SuperfoneApplication.m106p(this.f50126a, c13902a);
            }
        }).build();
        sq8.m48648g(aWSApiPluginBuild, "build(...)");
        return aWSApiPluginBuild;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(Activity activity, Bundle bundle) {
        sq8.m48649h(activity, "p0");
        sq8.m48648g(String.format("Activity created %s", Arrays.copyOf(new Object[]{activity.getClass().getSimpleName()}, 1)), "format(...)");
        f229g = new WeakReference(activity);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityDestroyed(Activity activity) {
        sq8.m48649h(activity, "p0");
        sq8.m48648g(String.format("Activity destroyed %s", Arrays.copyOf(new Object[]{activity.getClass().getSimpleName()}, 1)), "format(...)");
        if (activity instanceof AppCompatActivity) {
            ttb.m50571g((AppCompatActivity) activity);
        }
        WeakReference weakReference = f229g;
        if (sq8.m48644c(weakReference != null ? (Activity) weakReference.get() : null, activity)) {
            f229g = null;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(Activity activity) {
        sq8.m48649h(activity, "p0");
        sq8.m48648g(String.format("Activity paused %s", Arrays.copyOf(new Object[]{activity.getClass().getSimpleName()}, 1)), "format(...)");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityResumed(Activity activity) {
        sq8.m48649h(activity, "p0");
        sq8.m48648g(String.format("Activity resumed %s", Arrays.copyOf(new Object[]{activity.getClass().getSimpleName()}, 1)), "format(...)");
        f229g = new WeakReference(activity);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        sq8.m48649h(activity, "p0");
        sq8.m48649h(bundle, "p1");
        sq8.m48648g(String.format("Activity save instance state %s", Arrays.copyOf(new Object[]{activity.getClass().getSimpleName()}, 1)), "format(...)");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStarted(Activity activity) {
        sq8.m48649h(activity, "p0");
        sq8.m48648g(String.format("Activity started %s", Arrays.copyOf(new Object[]{activity.getClass().getSimpleName()}, 1)), "format(...)");
        f229g = new WeakReference(activity);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(Activity activity) {
        sq8.m48649h(activity, "p0");
        sq8.m48648g(String.format("Activity stopped %s", Arrays.copyOf(new Object[]{activity.getClass().getSimpleName()}, 1)), "format(...)");
    }

    @Override // android.app.Application
    public void onCreate() {
        super.onCreate();
        m124z();
        s07.f44359a.m47381j(this);
        qm1.m45641b(null, new C0052i(null), 1, null);
        v16.m52217a(this);
        try {
            Object systemService = getApplicationContext().getSystemService("phone");
            sq8.m48647f(systemService, "null cannot be cast to non-null type android.telephony.TelephonyManager");
            f230h = ((TelephonyManager) systemService).getNetworkCountryIso();
            Context applicationContext = getApplicationContext();
            sq8.m48648g(applicationContext, "getApplicationContext(...)");
            f227e = new Prefs(applicationContext);
            itf itfVar = new itf(getApplicationContext());
            f228f = itfVar;
            itfVar.e0();
            Prefs prefs = f227e;
            if (prefs != null) {
                m123s(prefs);
            }
            registerActivityLifecycleCallbacks(this);
            m118F();
            MapsInitializer.initialize(getApplicationContext());
            m117E();
            m119G();
            m120H();
            AbstractC1783b.m3883N(1);
        } catch (AmplifyException e) {
            throw new RuntimeException(e);
        }
    }

    @Override // android.app.Application
    public void onTerminate() {
        super.onTerminate();
        i84.m31710d(this.f231a, null, 1, null);
    }

    /* renamed from: r */
    public final String m122r(Context context) {
        sq8.m48649h(context, "context");
        Object systemService = context.getSystemService("connectivity");
        sq8.m48647f(systemService, "null cannot be cast to non-null type android.net.ConnectivityManager");
        ConnectivityManager connectivityManager = (ConnectivityManager) systemService;
        NetworkCapabilities networkCapabilities = connectivityManager.getNetworkCapabilities(connectivityManager.getActiveNetwork());
        return networkCapabilities != null ? networkCapabilities.hasTransport(1) ? "Wi-Fi" : networkCapabilities.hasTransport(0) ? "Mobile Data" : networkCapabilities.hasTransport(3) ? "Ethernet" : networkCapabilities.hasTransport(4) ? "VPN" : "Unknown Network" : "No Internet Connection";
    }

    /* renamed from: s */
    public final void m123s(Prefs prefs) {
        ryh ryhVarM3242d = prefs.m3242d();
        Optional optionalOfNullable = Optional.ofNullable(ryhVarM3242d.f44265a);
        final C0046c c0046c = C0046c.f234a;
        Optional optionalFilter = optionalOfNullable.filter(new Predicate() { // from class: o.xcg
            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                return SuperfoneApplication.m111w(c0046c, obj);
            }
        });
        final C0047d c0047d = C0047d.f235a;
        optionalFilter.ifPresent(new Consumer() { // from class: o.ycg
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                SuperfoneApplication.m112x(c0047d, obj);
            }
        });
        Optional optionalOfNullable2 = Optional.ofNullable(ryhVarM3242d.f44265a);
        final C0048e c0048e = C0048e.f236a;
        Optional optionalFilter2 = optionalOfNullable2.filter(new Predicate() { // from class: o.zcg
            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                return SuperfoneApplication.m113y(c0048e, obj);
            }
        });
        final C0049f c0049f = C0049f.f237a;
        optionalFilter2.ifPresent(new Consumer() { // from class: o.adg
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                SuperfoneApplication.m108t(c0049f, obj);
            }
        });
        Optional optionalOfNullable3 = Optional.ofNullable(ryhVarM3242d.f44266b);
        final C0050g c0050g = C0050g.f238a;
        Optional optionalFilter3 = optionalOfNullable3.filter(new Predicate() { // from class: o.bdg
            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                return SuperfoneApplication.m109u(c0050g, obj);
            }
        });
        final C0051h c0051h = C0051h.f239a;
        optionalFilter3.ifPresent(new Consumer() { // from class: o.cdg
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                SuperfoneApplication.m110v(c0051h, obj);
            }
        });
    }

    /* renamed from: z */
    public final void m124z() {
        try {
            Amplify.addPlugin(new AWSCognitoAuthPlugin());
            Amplify.addPlugin(m121o());
            Amplify.addPlugin(new AWSS3StoragePlugin());
            Amplify.addPlugin(new AWSPredictionsPlugin());
            Amplify.configure(getApplicationContext());
            m115B();
            m116D();
            this.f232b.complete(y3i.f54824a);
        } catch (AmplifyException e) {
            this.f232b.mo21375d(e);
            FirebaseCrashlyticsKt.getCrashlytics(Firebase.INSTANCE).recordException(e);
        }
    }
}
