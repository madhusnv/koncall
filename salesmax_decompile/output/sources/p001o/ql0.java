package p001o;

import android.app.Application;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import com.facebook.AccessToken;
import com.facebook.C10773c;
import com.facebook.C10791k;
import com.onesignal.session.internal.session.impl.SessionListener;
import java.lang.reflect.InvocationTargetException;
import java.math.BigDecimal;
import java.util.Currency;
import java.util.HashSet;
import java.util.Iterator;
import java.util.UUID;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import org.json.JSONException;
import p001o.bk8;
import p001o.eec;
import p001o.mt6;
import p001o.nl0;
import p001o.ql0;

/* loaded from: classes5.dex */
public final class ql0 {

    /* renamed from: c */
    public static final C16419a f42105c = new C16419a(null);

    /* renamed from: d */
    public static final String f42106d;

    /* renamed from: e */
    public static ScheduledThreadPoolExecutor f42107e;

    /* renamed from: f */
    public static nl0.EnumC15599b f42108f;

    /* renamed from: g */
    public static final Object f42109g;

    /* renamed from: h */
    public static String f42110h;

    /* renamed from: i */
    public static boolean f42111i;

    /* renamed from: j */
    public static String f42112j;

    /* renamed from: a */
    public final String f42113a;

    /* renamed from: b */
    public ua f42114b;

    /* renamed from: o.ql0$a */
    public static final class C16419a {

        /* renamed from: o.ql0$a$a */
        public static final class a implements bk8.InterfaceC12449a {
            @Override // p001o.bk8.InterfaceC12449a
            /* renamed from: a */
            public void mo19295a(String str) {
                ql0.f42105c.m45627u(str);
            }
        }

        public C16419a() {
        }

        public /* synthetic */ C16419a(id5 id5Var) {
            this();
        }

        /* renamed from: o */
        public static final void m45612o(Context context, ql0 ql0Var) throws ClassNotFoundException {
            sq8.m48649h(context, "$context");
            sq8.m48649h(ql0Var, "$logger");
            Bundle bundle = new Bundle();
            String[] strArr = {"com.facebook.core.Core", "com.facebook.login.Login", "com.facebook.share.Share", "com.facebook.places.Places", "com.facebook.messenger.Messenger", "com.facebook.applinks.AppLinks", "com.facebook.marketing.Marketing", "com.facebook.gamingservices.GamingServices", "com.facebook.all.All", "com.android.billingclient.api.BillingClient", "com.android.vending.billing.IInAppBillingService"};
            String[] strArr2 = {"core_lib_included", "login_lib_included", "share_lib_included", "places_lib_included", "messenger_lib_included", "applinks_lib_included", "marketing_lib_included", "gamingservices_lib_included", "all_lib_included", "billing_client_lib_included", "billing_service_lib_included"};
            int i = 0;
            for (int i2 = 0; i2 < 11; i2++) {
                String str = strArr[i2];
                String str2 = strArr2[i2];
                try {
                    Class.forName(str);
                    bundle.putInt(str2, 1);
                    i |= 1 << i2;
                } catch (ClassNotFoundException unused) {
                }
            }
            SharedPreferences sharedPreferences = context.getSharedPreferences("com.facebook.sdk.appEventPreferences", 0);
            if (sharedPreferences.getInt("kitsBitmask", 0) != i) {
                sharedPreferences.edit().putInt("kitsBitmask", i).apply();
                ql0Var.m45603p("fb_sdk_initialize", null, bundle);
            }
        }

        /* renamed from: q */
        public static final void m45613q() throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
            HashSet hashSet = new HashSet();
            Iterator it = cl0.m21365p().iterator();
            while (it.hasNext()) {
                hashSet.add(((ua) it.next()).m51266b());
            }
            Iterator it2 = hashSet.iterator();
            while (it2.hasNext()) {
                xt6.m56803u((String) it2.next(), true);
            }
        }

        /* renamed from: f */
        public final void m45614f(Application application, String str) {
            sq8.m48649h(application, "application");
            if (!C10773c.m12993G()) {
                throw new ur6("The Facebook sdk must be initialized before calling activateApp");
            }
            lc0.m36882d();
            cdi.m20984e();
            if (str == null) {
                str = C10773c.m13020m();
            }
            C10773c.m12997L(application, str);
            wp.m54777z(application, str);
            if (mt6.m39648g(mt6.EnumC15426c.GPSPACAProcessing)) {
                yhc.f55535a.m57833d(str, "fb_mobile_app_install");
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:16:0x0064  */
        /* renamed from: g */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final hwc m45615g(Bundle bundle, eec eecVar, boolean z) {
            fec fecVar;
            String str = u61.m50977g() ? "1" : "0";
            eec.C13167a c13167a = eec.f21491b;
            fec fecVar2 = fec.IAPParameters;
            hwc hwcVarM24866b = c13167a.m24866b(fecVar2, "is_implicit_purchase_logging_enabled", str, bundle, eecVar);
            Object objM24867c = c13167a.m24867c(fecVar2, "fb_iap_product_id", bundle, eecVar);
            String str2 = objM24867c instanceof String ? (String) objM24867c : null;
            if (z) {
                fecVar = fecVar2;
            } else {
                if ((bundle != null ? bundle.getString("fb_content_id") : null) == null && str2 != null) {
                    hwc hwcVarM24866b2 = c13167a.m24866b(fecVar2, "fb_content_id", str2, bundle, eecVar);
                    fecVar = fecVar2;
                    hwcVarM24866b = c13167a.m24866b(fecVar2, "android_dynamic_ads_content_id", "client_manual", (Bundle) hwcVarM24866b2.m31229c(), (eec) hwcVarM24866b2.m31230d());
                }
            }
            hwc hwcVarM24866b3 = c13167a.m24866b(fecVar, "is_autolog_app_events_enabled", C10791k.m13157f() ? "1" : "0", (Bundle) hwcVarM24866b.m31229c(), (eec) hwcVarM24866b.m31230d());
            return new hwc((Bundle) hwcVarM24866b3.m31229c(), (eec) hwcVarM24866b3.m31230d());
        }

        /* renamed from: h */
        public final void m45616h() {
            if (m45619k() != nl0.EnumC15599b.EXPLICIT_ONLY) {
                cl0.m21361l(m67.EAGER_FLUSHING_EVENT);
            }
        }

        /* renamed from: i */
        public final Executor m45617i() {
            if (ql0.m45589b() == null) {
                m45623p();
            }
            ScheduledThreadPoolExecutor scheduledThreadPoolExecutorM45589b = ql0.m45589b();
            if (scheduledThreadPoolExecutorM45589b != null) {
                return scheduledThreadPoolExecutorM45589b;
            }
            throw new IllegalStateException("Required value was null.".toString());
        }

        /* renamed from: j */
        public final String m45618j(Context context) {
            sq8.m48649h(context, "context");
            if (ql0.m45588a() == null) {
                synchronized (ql0.m45592e()) {
                    if (ql0.m45588a() == null) {
                        ql0.m45595h(context.getSharedPreferences("com.facebook.sdk.appEventPreferences", 0).getString("anonymousAppDeviceGUID", null));
                        if (ql0.m45588a() == null) {
                            ql0.m45595h("XZ" + UUID.randomUUID());
                            context.getSharedPreferences("com.facebook.sdk.appEventPreferences", 0).edit().putString("anonymousAppDeviceGUID", ql0.m45588a()).apply();
                        }
                    }
                    y3i y3iVar = y3i.f54824a;
                }
            }
            String strM45588a = ql0.m45588a();
            if (strM45588a != null) {
                return strM45588a;
            }
            throw new IllegalStateException("Required value was null.".toString());
        }

        /* renamed from: k */
        public final nl0.EnumC15599b m45619k() {
            nl0.EnumC15599b enumC15599bM45590c;
            synchronized (ql0.m45592e()) {
                enumC15599bM45590c = ql0.m45590c();
            }
            return enumC15599bM45590c;
        }

        /* renamed from: l */
        public final String m45620l() {
            bk8.m19291d(new a());
            return C10773c.m13019l().getSharedPreferences("com.facebook.sdk.appEventPreferences", 0).getString("install_referrer", null);
        }

        /* renamed from: m */
        public final String m45621m() {
            String strM45591d;
            synchronized (ql0.m45592e()) {
                strM45591d = ql0.m45591d();
            }
            return strM45591d;
        }

        /* renamed from: n */
        public final void m45622n(final Context context, String str) {
            sq8.m48649h(context, "context");
            if (C10773c.m13023p()) {
                final ql0 ql0Var = new ql0(context, str, (AccessToken) null);
                ScheduledThreadPoolExecutor scheduledThreadPoolExecutorM45589b = ql0.m45589b();
                if (scheduledThreadPoolExecutorM45589b == null) {
                    throw new IllegalStateException("Required value was null.".toString());
                }
                scheduledThreadPoolExecutorM45589b.execute(new Runnable() { // from class: o.pl0
                    @Override // java.lang.Runnable
                    public final void run() throws ClassNotFoundException {
                        ql0.C16419a.m45612o(context, ql0Var);
                    }
                });
            }
        }

        /* renamed from: p */
        public final void m45623p() {
            synchronized (ql0.m45592e()) {
                if (ql0.m45589b() != null) {
                    return;
                }
                ql0.m45596i(new ScheduledThreadPoolExecutor(1));
                y3i y3iVar = y3i.f54824a;
                Runnable runnable = new Runnable() { // from class: o.ol0
                    @Override // java.lang.Runnable
                    public final void run() throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
                        ql0.C16419a.m45613q();
                    }
                };
                ScheduledThreadPoolExecutor scheduledThreadPoolExecutorM45589b = ql0.m45589b();
                if (scheduledThreadPoolExecutorM45589b == null) {
                    throw new IllegalStateException("Required value was null.".toString());
                }
                scheduledThreadPoolExecutorM45589b.scheduleAtFixedRate(runnable, 0L, SessionListener.SECONDS_IN_A_DAY, TimeUnit.SECONDS);
            }
        }

        /* renamed from: r */
        public final void m45624r(tk0 tk0Var, ua uaVar) {
            cl0.m21356g(uaVar, tk0Var);
            if (mt6.m39648g(mt6.EnumC15426c.OnDevicePostInstallEventProcessing) && obc.m41917d()) {
                obc.m41918e(uaVar.m51266b(), tk0Var);
            }
            if (mt6.m39648g(mt6.EnumC15426c.GPSARATriggers)) {
                iu7.f29235a.m32794i(uaVar.m51266b(), tk0Var);
            }
            if (mt6.m39648g(mt6.EnumC15426c.GPSPACAProcessing)) {
                yhc.f55535a.m57834e(uaVar.m51266b(), tk0Var);
            }
            if (tk0Var.m50091b() || ql0.m45593f()) {
                return;
            }
            if (sq8.m48644c(tk0Var.m50095f(), "fb_mobile_activate_app")) {
                ql0.m45594g(true);
            } else {
                sja.f45482e.m48387b(bka.APP_EVENTS, "AppEvents", "Warning: Please call AppEventsLogger.activateApp(...)from the long-lived activity's onResume() methodbefore logging other app events.");
            }
        }

        /* renamed from: s */
        public final void m45625s(String str) {
            sja.f45482e.m48387b(bka.DEVELOPER_ERRORS, "AppEvents", str);
        }

        /* renamed from: t */
        public final void m45626t() {
            cl0.m21368s();
        }

        /* renamed from: u */
        public final void m45627u(String str) {
            SharedPreferences sharedPreferences = C10773c.m13019l().getSharedPreferences("com.facebook.sdk.appEventPreferences", 0);
            if (str != null) {
                sharedPreferences.edit().putString("install_referrer", str).apply();
            }
        }
    }

    static {
        String canonicalName = ql0.class.getCanonicalName();
        if (canonicalName == null) {
            canonicalName = "com.facebook.appevents.AppEventsLoggerImpl";
        }
        f42106d = canonicalName;
        f42108f = nl0.EnumC15599b.AUTO;
        f42109g = new Object();
    }

    public ql0(String str, String str2, AccessToken accessToken) {
        sq8.m48649h(str, "activityName");
        rri.m47117l();
        this.f42113a = str;
        accessToken = accessToken == null ? AccessToken.f11242y.m12774e() : accessToken;
        if (accessToken == null || accessToken.m12762n() || !(str2 == null || sq8.m48644c(str2, accessToken.m12751c()))) {
            str2 = str2 == null ? cri.m21647K(C10773c.m13019l()) : str2;
            if (str2 == null) {
                throw new IllegalStateException("Required value was null.".toString());
            }
            this.f42114b = new ua(null, str2);
        } else {
            this.f42114b = new ua(accessToken);
        }
        f42105c.m45623p();
    }

    /* renamed from: a */
    public static final /* synthetic */ String m45588a() {
        if (a94.m16694d(ql0.class)) {
            return null;
        }
        try {
            return f42110h;
        } catch (Throwable th) {
            a94.m16692b(th, ql0.class);
            return null;
        }
    }

    /* renamed from: b */
    public static final /* synthetic */ ScheduledThreadPoolExecutor m45589b() {
        if (a94.m16694d(ql0.class)) {
            return null;
        }
        try {
            return f42107e;
        } catch (Throwable th) {
            a94.m16692b(th, ql0.class);
            return null;
        }
    }

    /* renamed from: c */
    public static final /* synthetic */ nl0.EnumC15599b m45590c() {
        if (a94.m16694d(ql0.class)) {
            return null;
        }
        try {
            return f42108f;
        } catch (Throwable th) {
            a94.m16692b(th, ql0.class);
            return null;
        }
    }

    /* renamed from: d */
    public static final /* synthetic */ String m45591d() {
        if (a94.m16694d(ql0.class)) {
            return null;
        }
        try {
            return f42112j;
        } catch (Throwable th) {
            a94.m16692b(th, ql0.class);
            return null;
        }
    }

    /* renamed from: e */
    public static final /* synthetic */ Object m45592e() {
        if (a94.m16694d(ql0.class)) {
            return null;
        }
        try {
            return f42109g;
        } catch (Throwable th) {
            a94.m16692b(th, ql0.class);
            return null;
        }
    }

    /* renamed from: f */
    public static final /* synthetic */ boolean m45593f() {
        if (a94.m16694d(ql0.class)) {
            return false;
        }
        try {
            return f42111i;
        } catch (Throwable th) {
            a94.m16692b(th, ql0.class);
            return false;
        }
    }

    /* renamed from: g */
    public static final /* synthetic */ void m45594g(boolean z) {
        if (a94.m16694d(ql0.class)) {
            return;
        }
        try {
            f42111i = z;
        } catch (Throwable th) {
            a94.m16692b(th, ql0.class);
        }
    }

    /* renamed from: h */
    public static final /* synthetic */ void m45595h(String str) {
        if (a94.m16694d(ql0.class)) {
            return;
        }
        try {
            f42110h = str;
        } catch (Throwable th) {
            a94.m16692b(th, ql0.class);
        }
    }

    /* renamed from: i */
    public static final /* synthetic */ void m45596i(ScheduledThreadPoolExecutor scheduledThreadPoolExecutor) {
        if (a94.m16694d(ql0.class)) {
            return;
        }
        try {
            f42107e = scheduledThreadPoolExecutor;
        } catch (Throwable th) {
            a94.m16692b(th, ql0.class);
        }
    }

    /* renamed from: n */
    public static /* synthetic */ void m45597n(ql0 ql0Var, String str, Double d, Bundle bundle, boolean z, UUID uuid, eec eecVar, int i, Object obj) {
        if (a94.m16694d(ql0.class)) {
            return;
        }
        if ((i & 32) != 0) {
            eecVar = null;
        }
        try {
            ql0Var.m45601m(str, d, bundle, z, uuid, eecVar);
        } catch (Throwable th) {
            a94.m16692b(th, ql0.class);
        }
    }

    /* renamed from: j */
    public final void m45598j() {
        if (a94.m16694d(this)) {
            return;
        }
        try {
            cl0.m21361l(m67.EXPLICIT);
        } catch (Throwable th) {
            a94.m16692b(th, this);
        }
    }

    /* renamed from: k */
    public final void m45599k(String str, double d, Bundle bundle) {
        if (a94.m16694d(this)) {
            return;
        }
        try {
            m45597n(this, str, Double.valueOf(d), bundle, false, wp.m54768n(), null, 32, null);
        } catch (Throwable th) {
            a94.m16692b(th, this);
        }
    }

    /* renamed from: l */
    public final void m45600l(String str, Bundle bundle) {
        if (a94.m16694d(this)) {
            return;
        }
        try {
            m45597n(this, str, null, bundle, false, wp.m54768n(), null, 32, null);
        } catch (Throwable th) {
            a94.m16692b(th, this);
        }
    }

    /* renamed from: m */
    public final void m45601m(String str, Double d, Bundle bundle, boolean z, UUID uuid, eec eecVar) {
        boolean z2;
        Bundle bundle2 = bundle;
        eec eecVar2 = eecVar;
        if (a94.m16694d(this)) {
            return;
        }
        if (str != null) {
            try {
                z2 = str.length() == 0;
            } catch (Throwable th) {
                a94.m16692b(th, this);
                return;
            }
        }
        if (z2) {
            return;
        }
        if (!z && u61.m50977g() && ((sq8.m48644c(str, "fb_mobile_purchase") || sq8.m48644c(str, "Subscribe") || sq8.m48644c(str, "StartTrial")) && ((mt6.m39648g(mt6.EnumC15426c.AndroidManualImplicitPurchaseDedupe) && sq8.m48644c(str, "fb_mobile_purchase")) || (mt6.m39648g(mt6.EnumC15426c.AndroidManualImplicitSubsDedupe) && (sq8.m48644c(str, "Subscribe") || sq8.m48644c(str, "StartTrial")))))) {
            fh8 fh8Var = fh8.f23324a;
            Double dM26693g = fh8Var.m26693g(d, bundle2);
            Currency currencyM26688b = fh8Var.m26688b(bundle2);
            if (dM26693g != null && currencyM26688b != null) {
                hwc hwcVarM26687a = fh8Var.m26687a(ih8.m32135f(bh3.m18963e(new qg8(str, dM26693g.doubleValue(), currencyM26688b)), System.currentTimeMillis(), false, bh3.m18963e(new hwc(bundle2, eecVar2))), bundle2, eecVar2);
                Bundle bundle3 = (Bundle) hwcVarM26687a.m31227a();
                eecVar2 = (eec) hwcVarM26687a.m31228b();
                bundle2 = bundle3;
            }
        }
        if (st6.m48897d("app_events_killswitch", C10773c.m13020m(), false)) {
            sja.f45482e.m48388c(bka.APP_EVENTS, "AppEvents", "KillSwitch is enabled and fail to log app event: %s", str);
            return;
        }
        if (xj1.m56369b(str)) {
            return;
        }
        C16419a c16419a = f42105c;
        hwc hwcVarM45615g = c16419a.m45615g(bundle2, eecVar2, z);
        Bundle bundle4 = (Bundle) hwcVarM45615g.m31227a();
        eec eecVar3 = (eec) hwcVarM45615g.m31228b();
        try {
            try {
                if (!r1e.f42749a.m46055g(bundle4)) {
                    bef.m18805c(bundle4, str);
                }
                ua1.m51268d(bundle4);
                cna.m21453h(bundle4, str);
                w5g.m53988g(bundle4);
                r1e.m46051f(bundle4);
                c16419a.m45624r(new tk0(this.f42113a, str, d, bundle4, z, wp.m54769p(), uuid, eecVar3), this.f42114b);
            } catch (ur6 e) {
                sja.f45482e.m48388c(bka.APP_EVENTS, "AppEvents", "Invalid app event: %s", e.toString());
            }
        } catch (JSONException e2) {
            sja.f45482e.m48388c(bka.APP_EVENTS, "AppEvents", "JSON encoding for app event failed: '%s'", e2.toString());
        }
    }

    /* renamed from: o */
    public final void m45602o(String str, String str2) {
        if (a94.m16694d(this)) {
            return;
        }
        try {
            Bundle bundle = new Bundle();
            bundle.putString("_is_suggested_event", "1");
            bundle.putString("_button_text", str2);
            m45600l(str, bundle);
        } catch (Throwable th) {
            a94.m16692b(th, this);
        }
    }

    /* renamed from: p */
    public final void m45603p(String str, Double d, Bundle bundle) {
        if (a94.m16694d(this)) {
            return;
        }
        try {
            m45597n(this, str, d, bundle, true, wp.m54768n(), null, 32, null);
        } catch (Throwable th) {
            a94.m16692b(th, this);
        }
    }

    /* renamed from: q */
    public final void m45604q(String str, BigDecimal bigDecimal, Currency currency, Bundle bundle, eec eecVar) {
        if (a94.m16694d(this)) {
            return;
        }
        try {
            if (bigDecimal == null || currency == null) {
                cri.k0(f42106d, "purchaseAmount and currency cannot be null");
                return;
            }
            if (bundle == null) {
                bundle = new Bundle();
            }
            Bundle bundle2 = bundle;
            bundle2.putString("fb_currency", currency.getCurrencyCode());
            m45601m(str, Double.valueOf(bigDecimal.doubleValue()), bundle2, true, wp.m54768n(), eecVar);
        } catch (Throwable th) {
            a94.m16692b(th, this);
        }
    }

    /* renamed from: r */
    public final void m45605r(BigDecimal bigDecimal, Currency currency, Bundle bundle, boolean z, eec eecVar) {
        if (a94.m16694d(this)) {
            return;
        }
        try {
            if (bigDecimal == null) {
                f42105c.m45625s("purchaseAmount cannot be null");
                return;
            }
            if (currency == null) {
                f42105c.m45625s("currency cannot be null");
                return;
            }
            if (bundle == null) {
                bundle = new Bundle();
            }
            Bundle bundle2 = bundle;
            bundle2.putString("fb_currency", currency.getCurrencyCode());
            m45601m("fb_mobile_purchase", Double.valueOf(bigDecimal.doubleValue()), bundle2, z, wp.m54768n(), eecVar);
            f42105c.m45616h();
        } catch (Throwable th) {
            a94.m16692b(th, this);
        }
    }

    /* renamed from: s */
    public final void m45606s(BigDecimal bigDecimal, Currency currency, Bundle bundle, eec eecVar) {
        if (a94.m16694d(this)) {
            return;
        }
        try {
            m45605r(bigDecimal, currency, bundle, true, eecVar);
        } catch (Throwable th) {
            a94.m16692b(th, this);
        }
    }

    public ql0(Context context, String str, AccessToken accessToken) {
        this(cri.m21673u(context), str, accessToken);
    }
}
