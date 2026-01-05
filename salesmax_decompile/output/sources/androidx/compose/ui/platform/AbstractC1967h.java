package androidx.compose.ui.platform;

import android.content.ComponentCallbacks2;
import android.content.Context;
import android.content.res.Configuration;
import android.view.View;
import androidx.compose.ui.platform.AndroidComposeView;
import com.google.firebase.analytics.FirebaseAnalytics;
import p001o.bqb;
import p001o.bv5;
import p001o.cv5;
import p001o.g2e;
import p001o.g6f;
import p001o.go3;
import p001o.h1f;
import p001o.jp3;
import p001o.k2e;
import p001o.k46;
import p001o.kf9;
import p001o.le8;
import p001o.mp3;
import p001o.nl7;
import p001o.pn3;
import p001o.qe9;
import p001o.see;
import p001o.sq8;
import p001o.txf;
import p001o.uk7;
import p001o.un3;
import p001o.vu5;
import p001o.wf0;
import p001o.wu5;
import p001o.x0f;
import p001o.xca;
import p001o.xk7;
import p001o.y3i;

/* renamed from: androidx.compose.ui.platform.h */
/* loaded from: classes2.dex */
public abstract class AbstractC1967h {

    /* renamed from: a */
    public static final g2e f6481a = jp3.m34194c(null, a.f6487a, 1, null);

    /* renamed from: b */
    public static final g2e f6482b = jp3.m34195d(b.f6488a);

    /* renamed from: c */
    public static final g2e f6483c = jp3.m34195d(c.f6489a);

    /* renamed from: d */
    public static final g2e f6484d = jp3.m34195d(d.f6490a);

    /* renamed from: e */
    public static final g2e f6485e = jp3.m34195d(e.f6491a);

    /* renamed from: f */
    public static final g2e f6486f = jp3.m34195d(f.f6492a);

    /* renamed from: androidx.compose.ui.platform.h$a */
    public static final class a extends kf9 implements uk7 {

        /* renamed from: a */
        public static final a f6487a = new a();

        public a() {
            super(0);
        }

        @Override // p001o.uk7
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Configuration invoke() {
            AbstractC1967h.m5254f("LocalConfiguration");
            throw new qe9();
        }
    }

    /* renamed from: androidx.compose.ui.platform.h$b */
    public static final class b extends kf9 implements uk7 {

        /* renamed from: a */
        public static final b f6488a = new b();

        public b() {
            super(0);
        }

        @Override // p001o.uk7
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Context invoke() {
            AbstractC1967h.m5254f("LocalContext");
            throw new qe9();
        }
    }

    /* renamed from: androidx.compose.ui.platform.h$c */
    public static final class c extends kf9 implements uk7 {

        /* renamed from: a */
        public static final c f6489a = new c();

        public c() {
            super(0);
        }

        @Override // p001o.uk7
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final le8 invoke() {
            AbstractC1967h.m5254f("LocalImageVectorCache");
            throw new qe9();
        }
    }

    /* renamed from: androidx.compose.ui.platform.h$d */
    public static final class d extends kf9 implements uk7 {

        /* renamed from: a */
        public static final d f6490a = new d();

        public d() {
            super(0);
        }

        @Override // p001o.uk7
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final xca invoke() {
            AbstractC1967h.m5254f("LocalLifecycleOwner");
            throw new qe9();
        }
    }

    /* renamed from: androidx.compose.ui.platform.h$e */
    public static final class e extends kf9 implements uk7 {

        /* renamed from: a */
        public static final e f6491a = new e();

        public e() {
            super(0);
        }

        @Override // p001o.uk7
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final h1f invoke() {
            AbstractC1967h.m5254f("LocalSavedStateRegistryOwner");
            throw new qe9();
        }
    }

    /* renamed from: androidx.compose.ui.platform.h$f */
    public static final class f extends kf9 implements uk7 {

        /* renamed from: a */
        public static final f f6492a = new f();

        public f() {
            super(0);
        }

        @Override // p001o.uk7
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final View invoke() {
            AbstractC1967h.m5254f("LocalView");
            throw new qe9();
        }
    }

    /* renamed from: androidx.compose.ui.platform.h$g */
    public static final class g extends kf9 implements xk7 {

        /* renamed from: a */
        public final /* synthetic */ bqb f6493a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(bqb bqbVar) {
            super(1);
            this.f6493a = bqbVar;
        }

        /* renamed from: a */
        public final void m5262a(Configuration configuration) {
            sq8.m48649h(configuration, "it");
            AbstractC1967h.m5251c(this.f6493a, new Configuration(configuration));
        }

        @Override // p001o.xk7
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            m5262a((Configuration) obj);
            return y3i.f54824a;
        }
    }

    /* renamed from: androidx.compose.ui.platform.h$h */
    public static final class h extends kf9 implements xk7 {

        /* renamed from: a */
        public final /* synthetic */ bv5 f6494a;

        /* renamed from: androidx.compose.ui.platform.h$h$a */
        public static final class a implements vu5 {

            /* renamed from: a */
            public final /* synthetic */ bv5 f6495a;

            public a(bv5 bv5Var) {
                this.f6495a = bv5Var;
            }

            @Override // p001o.vu5
            public void dispose() {
                this.f6495a.m19853b();
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(bv5 bv5Var) {
            super(1);
            this.f6494a = bv5Var;
        }

        @Override // p001o.xk7
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final vu5 invoke(wu5 wu5Var) {
            sq8.m48649h(wu5Var, "$this$DisposableEffect");
            return new a(this.f6494a);
        }
    }

    /* renamed from: androidx.compose.ui.platform.h$i */
    public static final class i extends kf9 implements nl7 {

        /* renamed from: a */
        public final /* synthetic */ AndroidComposeView f6496a;

        /* renamed from: b */
        public final /* synthetic */ wf0 f6497b;

        /* renamed from: c */
        public final /* synthetic */ nl7 f6498c;

        /* renamed from: d */
        public final /* synthetic */ int f6499d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(AndroidComposeView androidComposeView, wf0 wf0Var, nl7 nl7Var, int i) {
            super(2);
            this.f6496a = androidComposeView;
            this.f6497b = wf0Var;
            this.f6498c = nl7Var;
            this.f6499d = i;
        }

        /* renamed from: a */
        public final void m5264a(un3 un3Var, int i) {
            if ((i & 11) == 2 && un3Var.mo27201c()) {
                un3Var.mo27211m();
                return;
            }
            if (go3.m29189I()) {
                go3.m29200T(1471621628, i, -1, "androidx.compose.ui.platform.ProvideAndroidCompositionLocals.<anonymous> (AndroidCompositionLocals.android.kt:117)");
            }
            mp3.m39470a(this.f6496a, this.f6497b, this.f6498c, un3Var, ((this.f6499d << 3) & 896) | 72);
            if (go3.m29189I()) {
                go3.m29199S();
            }
        }

        @Override // p001o.nl7
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            m5264a((un3) obj, ((Number) obj2).intValue());
            return y3i.f54824a;
        }
    }

    /* renamed from: androidx.compose.ui.platform.h$j */
    public static final class j extends kf9 implements nl7 {

        /* renamed from: a */
        public final /* synthetic */ AndroidComposeView f6500a;

        /* renamed from: b */
        public final /* synthetic */ nl7 f6501b;

        /* renamed from: c */
        public final /* synthetic */ int f6502c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(AndroidComposeView androidComposeView, nl7 nl7Var, int i) {
            super(2);
            this.f6500a = androidComposeView;
            this.f6501b = nl7Var;
            this.f6502c = i;
        }

        /* renamed from: a */
        public final void m5265a(un3 un3Var, int i) {
            AbstractC1967h.m5249a(this.f6500a, this.f6501b, un3Var, see.m48284a(this.f6502c | 1));
        }

        @Override // p001o.nl7
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            m5265a((un3) obj, ((Number) obj2).intValue());
            return y3i.f54824a;
        }
    }

    /* renamed from: androidx.compose.ui.platform.h$k */
    public static final class k extends kf9 implements xk7 {

        /* renamed from: a */
        public final /* synthetic */ Context f6503a;

        /* renamed from: b */
        public final /* synthetic */ l f6504b;

        /* renamed from: androidx.compose.ui.platform.h$k$a */
        public static final class a implements vu5 {

            /* renamed from: a */
            public final /* synthetic */ Context f6505a;

            /* renamed from: b */
            public final /* synthetic */ l f6506b;

            public a(Context context, l lVar) {
                this.f6505a = context;
                this.f6506b = lVar;
            }

            @Override // p001o.vu5
            public void dispose() {
                this.f6505a.getApplicationContext().unregisterComponentCallbacks(this.f6506b);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public k(Context context, l lVar) {
            super(1);
            this.f6503a = context;
            this.f6504b = lVar;
        }

        @Override // p001o.xk7
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final vu5 invoke(wu5 wu5Var) {
            sq8.m48649h(wu5Var, "$this$DisposableEffect");
            this.f6503a.getApplicationContext().registerComponentCallbacks(this.f6504b);
            return new a(this.f6503a, this.f6504b);
        }
    }

    /* renamed from: androidx.compose.ui.platform.h$l */
    public static final class l implements ComponentCallbacks2 {

        /* renamed from: a */
        public final /* synthetic */ Configuration f6507a;

        /* renamed from: b */
        public final /* synthetic */ le8 f6508b;

        public l(Configuration configuration, le8 le8Var) {
            this.f6507a = configuration;
            this.f6508b = le8Var;
        }

        @Override // android.content.ComponentCallbacks
        public void onConfigurationChanged(Configuration configuration) {
            sq8.m48649h(configuration, "configuration");
            this.f6508b.m37027b(this.f6507a.updateFrom(configuration));
            this.f6507a.setTo(configuration);
        }

        @Override // android.content.ComponentCallbacks
        public void onLowMemory() {
            this.f6508b.m37026a();
        }

        @Override // android.content.ComponentCallbacks2
        public void onTrimMemory(int i) {
            this.f6508b.m37026a();
        }
    }

    /* renamed from: a */
    public static final void m5249a(AndroidComposeView androidComposeView, nl7 nl7Var, un3 un3Var, int i2) {
        sq8.m48649h(androidComposeView, "owner");
        sq8.m48649h(nl7Var, FirebaseAnalytics.Param.CONTENT);
        un3 un3VarMo27200b = un3Var.mo27200b(1396852028);
        if (go3.m29189I()) {
            go3.m29200T(1396852028, i2, -1, "androidx.compose.ui.platform.ProvideAndroidCompositionLocals (AndroidCompositionLocals.android.kt:80)");
        }
        Context context = androidComposeView.getContext();
        un3VarMo27200b.mo27207i(-492369756);
        Object objMo27208j = un3VarMo27200b.mo27208j();
        un3.C17404a c17404a = un3.f49155a;
        if (objMo27208j == c17404a.m51802a()) {
            objMo27208j = txf.m50750c(new Configuration(context.getResources().getConfiguration()), null, 2, null);
            un3VarMo27200b.mo27204f(objMo27208j);
        }
        un3VarMo27200b.mo27214p();
        bqb bqbVar = (bqb) objMo27208j;
        un3VarMo27200b.mo27207i(1157296644);
        boolean zMo27215q = un3VarMo27200b.mo27215q(bqbVar);
        Object objMo27208j2 = un3VarMo27200b.mo27208j();
        if (zMo27215q || objMo27208j2 == c17404a.m51802a()) {
            objMo27208j2 = new g(bqbVar);
            un3VarMo27200b.mo27204f(objMo27208j2);
        }
        un3VarMo27200b.mo27214p();
        androidComposeView.setConfigurationChangeObserver((xk7) objMo27208j2);
        un3VarMo27200b.mo27207i(-492369756);
        Object objMo27208j3 = un3VarMo27200b.mo27208j();
        if (objMo27208j3 == c17404a.m51802a()) {
            sq8.m48648g(context, "context");
            objMo27208j3 = new wf0(context);
            un3VarMo27200b.mo27204f(objMo27208j3);
        }
        un3VarMo27200b.mo27214p();
        wf0 wf0Var = (wf0) objMo27208j3;
        AndroidComposeView.C1943b viewTreeOwners = androidComposeView.getViewTreeOwners();
        if (viewTreeOwners == null) {
            throw new IllegalStateException("Called when the ViewTreeOwnersAvailability is not yet in Available state");
        }
        un3VarMo27200b.mo27207i(-492369756);
        Object objMo27208j4 = un3VarMo27200b.mo27208j();
        if (objMo27208j4 == c17404a.m51802a()) {
            objMo27208j4 = cv5.m21862a(androidComposeView, viewTreeOwners.m5079b());
            un3VarMo27200b.mo27204f(objMo27208j4);
        }
        un3VarMo27200b.mo27214p();
        bv5 bv5Var = (bv5) objMo27208j4;
        k46.m34964a(y3i.f54824a, new h(bv5Var), un3VarMo27200b, 6);
        sq8.m48648g(context, "context");
        jp3.m34192a(new k2e[]{f6481a.m28000c(m5250b(bqbVar)), f6482b.m28000c(context), f6484d.m28000c(viewTreeOwners.m5078a()), f6485e.m28000c(viewTreeOwners.m5079b()), x0f.m55526b().m28000c(bv5Var), f6486f.m28000c(androidComposeView.getView()), f6483c.m28000c(m5255g(context, m5250b(bqbVar), un3VarMo27200b, 72))}, pn3.m43903b(un3VarMo27200b, 1471621628, true, new i(androidComposeView, wf0Var, nl7Var, i2)), un3VarMo27200b, 56);
        if (go3.m29189I()) {
            go3.m29199S();
        }
        g6f g6fVarMo27202d = un3VarMo27200b.mo27202d();
        if (g6fVarMo27202d == null) {
            return;
        }
        g6fVarMo27202d.mo28099a(new j(androidComposeView, nl7Var, i2));
    }

    /* renamed from: b */
    public static final Configuration m5250b(bqb bqbVar) {
        return (Configuration) bqbVar.getValue();
    }

    /* renamed from: c */
    public static final void m5251c(bqb bqbVar, Configuration configuration) {
        bqbVar.setValue(configuration);
    }

    /* renamed from: f */
    public static final Void m5254f(String str) {
        throw new IllegalStateException(("CompositionLocal " + str + " not present").toString());
    }

    /* renamed from: g */
    public static final le8 m5255g(Context context, Configuration configuration, un3 un3Var, int i2) {
        un3Var.mo27207i(-485908294);
        if (go3.m29189I()) {
            go3.m29200T(-485908294, i2, -1, "androidx.compose.ui.platform.obtainImageVectorCache (AndroidCompositionLocals.android.kt:128)");
        }
        un3Var.mo27207i(-492369756);
        Object objMo27208j = un3Var.mo27208j();
        un3.C17404a c17404a = un3.f49155a;
        if (objMo27208j == c17404a.m51802a()) {
            objMo27208j = new le8();
            un3Var.mo27204f(objMo27208j);
        }
        un3Var.mo27214p();
        le8 le8Var = (le8) objMo27208j;
        un3Var.mo27207i(-492369756);
        Object objMo27208j2 = un3Var.mo27208j();
        Object obj = objMo27208j2;
        if (objMo27208j2 == c17404a.m51802a()) {
            Configuration configuration2 = new Configuration();
            if (configuration != null) {
                configuration2.setTo(configuration);
            }
            un3Var.mo27204f(configuration2);
            obj = configuration2;
        }
        un3Var.mo27214p();
        Configuration configuration3 = (Configuration) obj;
        un3Var.mo27207i(-492369756);
        Object objMo27208j3 = un3Var.mo27208j();
        if (objMo27208j3 == c17404a.m51802a()) {
            objMo27208j3 = new l(configuration3, le8Var);
            un3Var.mo27204f(objMo27208j3);
        }
        un3Var.mo27214p();
        k46.m34964a(le8Var, new k(context, (l) objMo27208j3), un3Var, 8);
        if (go3.m29189I()) {
            go3.m29199S();
        }
        un3Var.mo27214p();
        return le8Var;
    }
}
