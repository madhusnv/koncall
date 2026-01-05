package p001o;

import android.content.Context;
import android.os.Bundle;
import com.facebook.AccessToken;
import com.facebook.C10773c;
import java.math.BigDecimal;
import java.util.Currency;
import java.util.Map;
import java.util.concurrent.Executor;
import p001o.nl0;

/* loaded from: classes5.dex */
public final class ao8 {

    /* renamed from: b */
    public static final C12228a f15070b = new C12228a(null);

    /* renamed from: a */
    public final ql0 f15071a;

    /* renamed from: o.ao8$a */
    public static final class C12228a {
        public C12228a() {
        }

        public /* synthetic */ C12228a(id5 id5Var) {
            this();
        }

        /* renamed from: a */
        public final ao8 m17568a(Context context, String str) {
            return new ao8(context, str);
        }

        /* renamed from: b */
        public final ao8 m17569b(String str, String str2, AccessToken accessToken) {
            sq8.m48649h(str, "activityName");
            return new ao8(str, str2, accessToken);
        }

        /* renamed from: c */
        public final Executor m17570c() {
            return ql0.f42105c.m45617i();
        }

        /* renamed from: d */
        public final nl0.EnumC15599b m17571d() {
            return ql0.f42105c.m45619k();
        }

        /* renamed from: e */
        public final String m17572e() {
            return ql0.f42105c.m45621m();
        }

        /* renamed from: f */
        public final void m17573f(Map map) {
            sq8.m48649h(map, "ud");
            cdi.m20985g(map);
        }
    }

    public ao8(ql0 ql0Var) {
        sq8.m48649h(ql0Var, "loggerImpl");
        this.f15071a = ql0Var;
    }

    /* renamed from: a */
    public final void m17558a() {
        this.f15071a.m45598j();
    }

    /* renamed from: b */
    public final void m17559b(Bundle bundle) {
        sq8.m48649h(bundle, "parameters");
        if (((bundle.getInt("previous") & 2) != 0) || C10773c.m13023p()) {
            this.f15071a.m45603p("fb_sdk_settings_changed", null, bundle);
        }
    }

    /* renamed from: c */
    public final void m17560c(String str, double d, Bundle bundle) {
        if (C10773c.m13023p()) {
            this.f15071a.m45599k(str, d, bundle);
        }
    }

    /* renamed from: d */
    public final void m17561d(String str, Bundle bundle) {
        if (C10773c.m13023p()) {
            this.f15071a.m45600l(str, bundle);
        }
    }

    /* renamed from: e */
    public final void m17562e(String str, String str2) {
        this.f15071a.m45602o(str, str2);
    }

    /* renamed from: f */
    public final void m17563f(String str) {
        if (C10773c.m13023p()) {
            this.f15071a.m45603p(str, null, null);
        }
    }

    /* renamed from: g */
    public final void m17564g(String str, Bundle bundle) {
        if (C10773c.m13023p()) {
            this.f15071a.m45603p(str, null, bundle);
        }
    }

    /* renamed from: h */
    public final void m17565h(String str, Double d, Bundle bundle) {
        if (C10773c.m13023p()) {
            this.f15071a.m45603p(str, d, bundle);
        }
    }

    /* renamed from: i */
    public final void m17566i(String str, BigDecimal bigDecimal, Currency currency, Bundle bundle, eec eecVar) {
        if (C10773c.m13023p()) {
            this.f15071a.m45604q(str, bigDecimal, currency, bundle, eecVar);
        }
    }

    /* renamed from: j */
    public final void m17567j(BigDecimal bigDecimal, Currency currency, Bundle bundle, eec eecVar) {
        if (C10773c.m13023p()) {
            this.f15071a.m45606s(bigDecimal, currency, bundle, eecVar);
        }
    }

    public ao8(Context context) {
        this(new ql0(context, (String) null, (AccessToken) null));
    }

    public ao8(Context context, String str) {
        this(new ql0(context, str, (AccessToken) null));
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ao8(String str, String str2, AccessToken accessToken) {
        this(new ql0(str, str2, accessToken));
        sq8.m48649h(str, "activityName");
    }
}
