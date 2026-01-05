package androidx.compose.ui.platform;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.os.Trace;
import android.util.SparseArray;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewStructure;
import android.view.ViewTreeObserver;
import android.view.animation.AnimationUtils;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import androidx.compose.ui.focus.C1928b;
import androidx.compose.ui.focus.FocusOwnerImpl;
import androidx.compose.ui.input.key.AbstractC1937a;
import androidx.compose.ui.input.rotary.AbstractC1938a;
import androidx.compose.ui.platform.AndroidComposeView;
import androidx.compose.ui.platform.ViewLayer;
import androidx.compose.ui.semantics.EmptySemanticsElement;
import androidx.lifecycle.AbstractC2139h;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import p001o.a61;
import p001o.add;
import p001o.ae0;
import p001o.alb;
import p001o.bi9;
import p001o.bqb;
import p001o.bu3;
import p001o.c77;
import p001o.cwi;
import p001o.dd0;
import p001o.ddd;
import p001o.de0;
import p001o.dlb;
import p001o.du3;
import p001o.ee0;
import p001o.fb7;
import p001o.fe0;
import p001o.fqb;
import p001o.gc9;
import p001o.gl8;
import p001o.h1f;
import p001o.h4j;
import p001o.hl8;
import p001o.i9d;
import p001o.id0;
import p001o.id5;
import p001o.jmb;
import p001o.kd0;
import p001o.kf9;
import p001o.kke;
import p001o.lb7;
import p001o.le0;
import p001o.lj8;
import p001o.ls1;
import p001o.lza;
import p001o.mfe;
import p001o.mj8;
import p001o.ms1;
import p001o.n64;
import p001o.nj8;
import p001o.nl7;
import p001o.nue;
import p001o.ob7;
import p001o.oc9;
import p001o.omb;
import p001o.os1;
import p001o.oue;
import p001o.ov8;
import p001o.p0i;
import p001o.p4g;
import p001o.p61;
import p001o.pd0;
import p001o.q74;
import p001o.qc2;
import p001o.qc9;
import p001o.qcd;
import p001o.qf0;
import p001o.qh9;
import p001o.qxf;
import p001o.qza;
import p001o.rc9;
import p001o.rgc;
import p001o.rue;
import p001o.rzi;
import p001o.s9c;
import p001o.scd;
import p001o.scf;
import p001o.sf0;
import p001o.sgc;
import p001o.sq8;
import p001o.t61;
import p001o.te5;
import p001o.ted;
import p001o.txf;
import p001o.tzi;
import p001o.uhh;
import p001o.uid;
import p001o.uk7;
import p001o.uq8;
import p001o.v9c;
import p001o.v9d;
import p001o.w9d;
import p001o.wgc;
import p001o.wih;
import p001o.wvi;
import p001o.x9d;
import p001o.xca;
import p001o.xcd;
import p001o.xk7;
import p001o.xw7;
import p001o.y3i;
import p001o.y8j;
import p001o.ycd;
import p001o.yf0;
import p001o.z0b;
import p001o.z8j;
import p001o.z9d;
import p001o.zcd;
import p001o.zh9;
import p001o.zl5;
import p001o.zvi;

@SuppressLint({"ViewConstructor", "VisibleForTests"})
/* loaded from: classes2.dex */
public final class AndroidComposeView extends ViewGroup implements sgc, InterfaceC1969j, ted, te5 {
    public static final C1942a i1 = new C1942a(null);
    public static Class j1;
    public static Method k1;
    public final float[] A0;
    public final float[] B0;
    public long C0;
    public boolean D0;
    public long E0;
    public boolean F0;
    public final bqb G0;

    /* renamed from: H */
    public final scf f6328H;
    public final p4g H0;
    public xk7 I0;
    public final ViewTreeObserver.OnGlobalLayoutListener J0;
    public final ViewTreeObserver.OnScrollChangedListener K0;

    /* renamed from: L */
    public final C1965f f6329L;
    public final ViewTreeObserver.OnTouchModeChangeListener L0;

    /* renamed from: M */
    public final t61 f6330M;
    public final z9d M0;
    public final uhh N0;
    public final fb7 O0;
    public final bqb P0;

    /* renamed from: Q */
    public final List f6331Q;
    public int Q0;
    public final bqb R0;
    public final xw7 S0;
    public final nj8 T0;
    public final dlb U0;
    public final wih V0;
    public final q74 W0;
    public MotionEvent X0;
    public long Y0;
    public final h4j Z0;

    /* renamed from: a */
    public long f6332a;
    public final fqb a1;

    /* renamed from: b */
    public boolean f6333b;
    public final RunnableC1951j b1;

    /* renamed from: c */
    public final bi9 f6334c;
    public final Runnable c1;

    /* renamed from: d */
    public zl5 f6335d;
    public boolean d1;

    /* renamed from: e */
    public final EmptySemanticsElement f6336e;
    public final uk7 e1;

    /* renamed from: f */
    public final c77 f6337f;
    public final ls1 f1;

    /* renamed from: g */
    public final z8j f6338g;
    public boolean g1;

    /* renamed from: h */
    public final alb f6339h;
    public List h0;
    public final scd h1;
    public boolean i0;
    public final jmb j0;
    public final zcd k0;
    public xk7 l0;
    public final id0 m0;
    public boolean n0;
    public final pd0 o0;
    public final dd0 p0;

    /* renamed from: q */
    public final alb f6340q;
    public final wgc q0;
    public boolean r0;

    /* renamed from: s */
    public final qc2 f6341s;
    public AndroidViewsHandler s0;
    public DrawChildContainer t0;
    public bu3 u0;
    public boolean v0;
    public final z0b w0;

    /* renamed from: x */
    public final zh9 f6342x;
    public final zvi x0;

    /* renamed from: y */
    public final nue f6343y;
    public long y0;
    public final int[] z0;

    /* renamed from: androidx.compose.ui.platform.AndroidComposeView$a */
    public static final class C1942a {
        public C1942a() {
        }

        public /* synthetic */ C1942a(id5 id5Var) {
            this();
        }

        /* renamed from: b */
        public final boolean m5077b() {
            try {
                if (AndroidComposeView.j1 == null) {
                    AndroidComposeView.j1 = Class.forName("android.os.SystemProperties");
                    Class cls = AndroidComposeView.j1;
                    AndroidComposeView.k1 = cls != null ? cls.getDeclaredMethod("getBoolean", String.class, Boolean.TYPE) : null;
                }
                Method method = AndroidComposeView.k1;
                Object objInvoke = method != null ? method.invoke(null, "debug.layout", Boolean.FALSE) : null;
                Boolean bool = objInvoke instanceof Boolean ? (Boolean) objInvoke : null;
                if (bool != null) {
                    return bool.booleanValue();
                }
                return false;
            } catch (Exception unused) {
                return false;
            }
        }
    }

    /* renamed from: androidx.compose.ui.platform.AndroidComposeView$b */
    public static final class C1943b {

        /* renamed from: a */
        public final xca f6344a;

        /* renamed from: b */
        public final h1f f6345b;

        public C1943b(xca xcaVar, h1f h1fVar) {
            sq8.m48649h(xcaVar, "lifecycleOwner");
            sq8.m48649h(h1fVar, "savedStateRegistryOwner");
            this.f6344a = xcaVar;
            this.f6345b = h1fVar;
        }

        /* renamed from: a */
        public final xca m5078a() {
            return this.f6344a;
        }

        /* renamed from: b */
        public final h1f m5079b() {
            return this.f6345b;
        }
    }

    /* renamed from: androidx.compose.ui.platform.AndroidComposeView$c */
    public static final class C1944c extends kf9 implements xk7 {
        public C1944c() {
            super(1);
        }

        /* renamed from: a */
        public final Boolean m5080a(int i) {
            lj8.C15087a c15087a = lj8.f33918b;
            return Boolean.valueOf(lj8.m37343f(i, c15087a.m37348b()) ? AndroidComposeView.this.isInTouchMode() : lj8.m37343f(i, c15087a.m37347a()) ? AndroidComposeView.this.isInTouchMode() ? AndroidComposeView.this.requestFocusFromTouch() : true : false);
        }

        @Override // p001o.xk7
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return m5080a(((lj8) obj).m37346i());
        }
    }

    /* renamed from: androidx.compose.ui.platform.AndroidComposeView$d */
    public static final class C1945d extends kf9 implements xk7 {

        /* renamed from: a */
        public static final C1945d f6347a = new C1945d();

        public C1945d() {
            super(1);
        }

        /* renamed from: a */
        public final void m5081a(Configuration configuration) {
            sq8.m48649h(configuration, "it");
        }

        @Override // p001o.xk7
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            m5081a((Configuration) obj);
            return y3i.f54824a;
        }
    }

    /* renamed from: androidx.compose.ui.platform.AndroidComposeView$e */
    public static final class C1946e extends kf9 implements xk7 {
        public C1946e() {
            super(1);
        }

        /* renamed from: a */
        public final void m5082a(uk7 uk7Var) {
            sq8.m48649h(uk7Var, "it");
            AndroidComposeView.this.h0(uk7Var);
        }

        @Override // p001o.xk7
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            m5082a((uk7) obj);
            return y3i.f54824a;
        }
    }

    /* renamed from: androidx.compose.ui.platform.AndroidComposeView$f */
    public static final class C1947f extends kf9 implements xk7 {
        public C1947f() {
            super(1);
        }

        /* renamed from: a */
        public final Boolean m5083a(KeyEvent keyEvent) {
            sq8.m48649h(keyEvent, "it");
            C1928b c1928bM5051O = AndroidComposeView.this.m5051O(keyEvent);
            return (c1928bM5051O == null || !qc9.m45090e(rc9.m46512b(keyEvent), qc9.f41620a.m45091a())) ? Boolean.FALSE : Boolean.valueOf(AndroidComposeView.this.getFocusOwner().mo4850e(c1928bM5051O.m4884o()));
        }

        @Override // p001o.xk7
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return m5083a(((oc9) obj).m41969f());
        }
    }

    /* renamed from: androidx.compose.ui.platform.AndroidComposeView$g */
    public static final class C1948g extends kf9 implements nl7 {
        public C1948g() {
            super(2);
        }

        @Override // p001o.nl7
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final w9d invoke(x9d x9dVar, v9d v9dVar) {
            sq8.m48649h(x9dVar, "factory");
            sq8.m48649h(v9dVar, "platformTextInput");
            return x9dVar.mo45353a(v9dVar, AndroidComposeView.this);
        }
    }

    /* renamed from: androidx.compose.ui.platform.AndroidComposeView$h */
    public static final class C1949h implements scd {

        /* renamed from: a */
        public qcd f6351a = qcd.f41625a.m45096a();

        public C1949h() {
        }
    }

    /* renamed from: androidx.compose.ui.platform.AndroidComposeView$i */
    public static final class C1950i extends kf9 implements uk7 {
        public C1950i() {
            super(0);
        }

        @Override // p001o.uk7
        public /* bridge */ /* synthetic */ Object invoke() {
            m68691invoke();
            return y3i.f54824a;
        }

        /* renamed from: invoke, reason: collision with other method in class */
        public final void m68691invoke() {
            MotionEvent motionEvent = AndroidComposeView.this.X0;
            if (motionEvent != null) {
                int actionMasked = motionEvent.getActionMasked();
                if (actionMasked == 7 || actionMasked == 9) {
                    AndroidComposeView.this.Y0 = SystemClock.uptimeMillis();
                    AndroidComposeView androidComposeView = AndroidComposeView.this;
                    androidComposeView.post(androidComposeView.b1);
                }
            }
        }
    }

    /* renamed from: androidx.compose.ui.platform.AndroidComposeView$j */
    public static final class RunnableC1951j implements Runnable {
        public RunnableC1951j() {
        }

        @Override // java.lang.Runnable
        public void run() {
            AndroidComposeView.this.removeCallbacks(this);
            MotionEvent motionEvent = AndroidComposeView.this.X0;
            if (motionEvent != null) {
                boolean z = false;
                boolean z2 = motionEvent.getToolType(0) == 3;
                int actionMasked = motionEvent.getActionMasked();
                if (!z2 ? actionMasked != 1 : !(actionMasked == 10 || actionMasked == 1)) {
                    z = true;
                }
                if (z) {
                    int i = 7;
                    if (actionMasked != 7 && actionMasked != 9) {
                        i = 2;
                    }
                    AndroidComposeView androidComposeView = AndroidComposeView.this;
                    androidComposeView.o0(motionEvent, i, androidComposeView.Y0, false);
                }
            }
        }
    }

    /* renamed from: androidx.compose.ui.platform.AndroidComposeView$k */
    public static final class C1952k extends kf9 implements xk7 {

        /* renamed from: a */
        public static final C1952k f6355a = new C1952k();

        public C1952k() {
            super(1);
        }

        @Override // p001o.xk7
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(rue rueVar) {
            sq8.m48649h(rueVar, "it");
            return Boolean.FALSE;
        }
    }

    /* renamed from: androidx.compose.ui.platform.AndroidComposeView$l */
    public static final class C1953l extends kf9 implements xk7 {
        public C1953l() {
            super(1);
        }

        /* renamed from: c */
        public static final void m5087c(uk7 uk7Var) {
            sq8.m48649h(uk7Var, "$tmp0");
            uk7Var.invoke();
        }

        /* renamed from: b */
        public final void m5088b(final uk7 uk7Var) {
            sq8.m48649h(uk7Var, "command");
            Handler handler = AndroidComposeView.this.getHandler();
            if ((handler != null ? handler.getLooper() : null) == Looper.myLooper()) {
                uk7Var.invoke();
                return;
            }
            Handler handler2 = AndroidComposeView.this.getHandler();
            if (handler2 != null) {
                handler2.post(new Runnable() { // from class: o.vd0
                    @Override // java.lang.Runnable
                    public final void run() {
                        AndroidComposeView.C1953l.m5087c(uk7Var);
                    }
                });
            }
        }

        @Override // p001o.xk7
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            m5088b((uk7) obj);
            return y3i.f54824a;
        }
    }

    /* renamed from: androidx.compose.ui.platform.AndroidComposeView$m */
    public static final class C1954m extends kf9 implements uk7 {
        public C1954m() {
            super(0);
        }

        @Override // p001o.uk7
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C1943b invoke() {
            return AndroidComposeView.this.get_viewTreeOwners();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AndroidComposeView(Context context, q74 q74Var) {
        super(context);
        sq8.m48649h(context, "context");
        sq8.m48649h(q74Var, "coroutineContext");
        s9c.C16789a c16789a = s9c.f45035b;
        this.f6332a = c16789a.m48062b();
        this.f6333b = true;
        this.f6334c = new bi9(null, 1, null);
        this.f6335d = fe0.m26472a(context);
        EmptySemanticsElement emptySemanticsElement = EmptySemanticsElement.f6533b;
        this.f6336e = emptySemanticsElement;
        this.f6337f = new FocusOwnerImpl(new C1946e());
        this.f6338g = new z8j();
        alb.C12214a c12214a = alb.f14913a;
        alb albVarM4966a = AbstractC1937a.m4966a(c12214a, new C1947f());
        this.f6339h = albVarM4966a;
        alb albVarM4969a = AbstractC1938a.m4969a(c12214a, C1952k.f6355a);
        this.f6340q = albVarM4969a;
        this.f6341s = new qc2();
        zh9 zh9Var = new zh9(false, 0, 3, null);
        zh9Var.c1(oue.f38938b);
        zh9Var.Z0(getDensity());
        zh9Var.d1(c12214a.mo17351c(emptySemanticsElement).mo17351c(albVarM4969a).mo17351c(getFocusOwner().mo4854i()).mo17351c(albVarM4966a));
        this.f6342x = zh9Var;
        this.f6343y = this;
        this.f6328H = new scf(getRoot());
        C1965f c1965f = new C1965f(this);
        this.f6329L = c1965f;
        this.f6330M = new t61();
        this.f6331Q = new ArrayList();
        this.j0 = new jmb();
        this.k0 = new zcd(getRoot());
        this.l0 = C1945d.f6347a;
        this.m0 = m5045I() ? new id0(this, getAutofillTree()) : null;
        this.o0 = new pd0(context);
        this.p0 = new dd0(context);
        this.q0 = new wgc(new C1953l());
        this.w0 = new z0b(getRoot());
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        sq8.m48648g(viewConfiguration, "get(context)");
        this.x0 = new yf0(viewConfiguration);
        this.y0 = hl8.m30757a(Api.BaseClientBuilder.API_PRIORITY_OTHER, Api.BaseClientBuilder.API_PRIORITY_OTHER);
        this.z0 = new int[]{0, 0};
        this.A0 = qza.m45993b(null, 1, null);
        this.B0 = qza.m45993b(null, 1, null);
        this.C0 = -1L;
        this.E0 = c16789a.m48061a();
        this.F0 = true;
        this.G0 = txf.m50750c(null, null, 2, null);
        this.H0 = qxf.m45951b(new C1954m());
        this.J0 = new ViewTreeObserver.OnGlobalLayoutListener() { // from class: o.rd0
            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public final void onGlobalLayout() {
                AndroidComposeView.m5038Q(this.f43389a);
            }
        };
        this.K0 = new ViewTreeObserver.OnScrollChangedListener() { // from class: o.sd0
            @Override // android.view.ViewTreeObserver.OnScrollChangedListener
            public final void onScrollChanged() {
                AndroidComposeView.l0(this.f45231a);
            }
        };
        this.L0 = new ViewTreeObserver.OnTouchModeChangeListener() { // from class: o.td0
            @Override // android.view.ViewTreeObserver.OnTouchModeChangeListener
            public final void onTouchModeChanged(boolean z) {
                AndroidComposeView.q0(this.f46879a, z);
            }
        };
        this.M0 = new z9d(new C1948g());
        this.N0 = ((qf0.C16371a) getPlatformTextInputPluginRegistry().m58994c(qf0.f41812a).m58996a()).m45356b();
        this.O0 = new le0(context);
        this.P0 = qxf.m45953d(ob7.m41909a(context), qxf.m45956g());
        Configuration configuration = context.getResources().getConfiguration();
        sq8.m48648g(configuration, "context.resources.configuration");
        this.Q0 = m5052P(configuration);
        Configuration configuration2 = context.getResources().getConfiguration();
        sq8.m48648g(configuration2, "context.resources.configuration");
        this.R0 = txf.m50750c(ee0.m24832d(configuration2), null, 2, null);
        this.S0 = new i9d(this);
        this.T0 = new nj8(isInTouchMode() ? lj8.f33918b.m37348b() : lj8.f33918b.m37347a(), new C1944c(), null);
        this.U0 = new dlb(this);
        this.V0 = new sf0(this);
        this.W0 = q74Var;
        this.Z0 = new h4j();
        this.a1 = new fqb(new uk7[16], 0);
        this.b1 = new RunnableC1951j();
        this.c1 = new Runnable() { // from class: o.ud0
            @Override // java.lang.Runnable
            public final void run() {
                AndroidComposeView.m0(this.f48729a);
            }
        };
        this.e1 = new C1950i();
        int i = Build.VERSION.SDK_INT;
        this.f1 = i >= 29 ? new os1() : new ms1();
        setWillNotDraw(false);
        setFocusable(true);
        if (i >= 26) {
            de0.f19629a.m22837a(this, 1, false);
        }
        setFocusableInTouchMode(true);
        setClipChildren(false);
        wvi.m0(this, c1965f);
        xk7 xk7VarM5270a = InterfaceC1969j.f6517i.m5270a();
        if (xk7VarM5270a != null) {
            xk7VarM5270a.invoke(this);
        }
        getRoot().m59434j(this);
        if (i >= 29) {
            ae0.f14557a.m16937a(this);
        }
        this.h1 = new C1949h();
    }

    /* renamed from: Q */
    public static final void m5038Q(AndroidComposeView androidComposeView) {
        sq8.m48649h(androidComposeView, "this$0");
        androidComposeView.r0();
    }

    public static /* synthetic */ void getFontLoader$annotations() {
    }

    public static /* synthetic */ void getLastMatrixRecalculationAnimationTime$ui_release$annotations() {
    }

    public static /* synthetic */ void getShowLayoutBounds$annotations() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final C1943b get_viewTreeOwners() {
        return (C1943b) this.G0.getValue();
    }

    public static /* synthetic */ void k0(AndroidComposeView androidComposeView, zh9 zh9Var, int i, Object obj) {
        if ((i & 1) != 0) {
            zh9Var = null;
        }
        androidComposeView.j0(zh9Var);
    }

    public static final void l0(AndroidComposeView androidComposeView) {
        sq8.m48649h(androidComposeView, "this$0");
        androidComposeView.r0();
    }

    public static final void m0(AndroidComposeView androidComposeView) {
        sq8.m48649h(androidComposeView, "this$0");
        androidComposeView.d1 = false;
        MotionEvent motionEvent = androidComposeView.X0;
        sq8.m48646e(motionEvent);
        if (!(motionEvent.getActionMasked() == 10)) {
            throw new IllegalStateException("The ACTION_HOVER_EXIT event was not cleared.".toString());
        }
        androidComposeView.n0(motionEvent);
    }

    public static /* synthetic */ void p0(AndroidComposeView androidComposeView, MotionEvent motionEvent, int i, long j, boolean z, int i2, Object obj) {
        if ((i2 & 8) != 0) {
            z = true;
        }
        androidComposeView.o0(motionEvent, i, j, z);
    }

    public static final void q0(AndroidComposeView androidComposeView, boolean z) {
        sq8.m48649h(androidComposeView, "this$0");
        androidComposeView.T0.m40674a(z ? lj8.f33918b.m37348b() : lj8.f33918b.m37347a());
    }

    private void setFontFamilyResolver(lb7.InterfaceC15049a interfaceC15049a) {
        this.P0.setValue(interfaceC15049a);
    }

    private void setLayoutDirection(qh9 qh9Var) {
        this.R0.setValue(qh9Var);
    }

    private final void set_viewTreeOwners(C1943b c1943b) {
        this.G0.setValue(c1943b);
    }

    /* renamed from: I */
    public final boolean m5045I() {
        return Build.VERSION.SDK_INT >= 26;
    }

    /* renamed from: J */
    public final Object m5046J(n64 n64Var) throws Throwable {
        Object objM5186y = this.f6329L.m5186y(n64Var);
        return objM5186y == uq8.m51918f() ? objM5186y : y3i.f54824a;
    }

    /* renamed from: K */
    public final boolean m5047K(zh9 zh9Var) {
        if (this.v0) {
            return true;
        }
        zh9 zh9VarM59431X = zh9Var.m59431X();
        return zh9VarM59431X != null && !zh9VarM59431X.m59408A();
    }

    /* renamed from: L */
    public final void m5048L(ViewGroup viewGroup) {
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = viewGroup.getChildAt(i);
            if (childAt instanceof AndroidComposeView) {
                ((AndroidComposeView) childAt).mo5073r();
            } else if (childAt instanceof ViewGroup) {
                m5048L((ViewGroup) childAt);
            }
        }
    }

    /* renamed from: M */
    public final long m5049M(int i) {
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        if (mode == Integer.MIN_VALUE) {
            return c0(0, size);
        }
        if (mode == 0) {
            return c0(0, Api.BaseClientBuilder.API_PRIORITY_OTHER);
        }
        if (mode == 1073741824) {
            return c0(size, size);
        }
        throw new IllegalStateException();
    }

    /* renamed from: N */
    public final View m5050N(int i, View view) throws NoSuchMethodException, SecurityException {
        if (Build.VERSION.SDK_INT >= 29) {
            return null;
        }
        Method declaredMethod = View.class.getDeclaredMethod("getAccessibilityViewId", new Class[0]);
        declaredMethod.setAccessible(true);
        if (sq8.m48644c(declaredMethod.invoke(view, new Object[0]), Integer.valueOf(i))) {
            return view;
        }
        if (!(view instanceof ViewGroup)) {
            return null;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = viewGroup.getChildAt(i2);
            sq8.m48648g(childAt, "currentView.getChildAt(i)");
            View viewM5050N = m5050N(i, childAt);
            if (viewM5050N != null) {
                return viewM5050N;
            }
        }
        return null;
    }

    /* renamed from: O */
    public C1928b m5051O(KeyEvent keyEvent) {
        sq8.m48649h(keyEvent, "keyEvent");
        long jM46511a = rc9.m46511a(keyEvent);
        gc9.C13677a c13677a = gc9.f24952a;
        if (gc9.m28418l(jM46511a, c13677a.m28428j())) {
            return C1928b.m4878i(rc9.m46513c(keyEvent) ? C1928b.f6246b.m4890f() : C1928b.f6246b.m4889e());
        }
        if (gc9.m28418l(jM46511a, c13677a.m28423e())) {
            return C1928b.m4878i(C1928b.f6246b.m4891g());
        }
        if (gc9.m28418l(jM46511a, c13677a.m28422d())) {
            return C1928b.m4878i(C1928b.f6246b.m4888d());
        }
        if (gc9.m28418l(jM46511a, c13677a.m28424f())) {
            return C1928b.m4878i(C1928b.f6246b.m4892h());
        }
        if (gc9.m28418l(jM46511a, c13677a.m28421c())) {
            return C1928b.m4878i(C1928b.f6246b.m4885a());
        }
        if (gc9.m28418l(jM46511a, c13677a.m28420b()) ? true : gc9.m28418l(jM46511a, c13677a.m28425g()) ? true : gc9.m28418l(jM46511a, c13677a.m28427i())) {
            return C1928b.m4878i(C1928b.f6246b.m4886b());
        }
        if (gc9.m28418l(jM46511a, c13677a.m28419a()) ? true : gc9.m28418l(jM46511a, c13677a.m28426h())) {
            return C1928b.m4878i(C1928b.f6246b.m4887c());
        }
        return null;
    }

    /* renamed from: P */
    public final int m5052P(Configuration configuration) {
        if (Build.VERSION.SDK_INT >= 31) {
            return configuration.fontWeightAdjustment;
        }
        return 0;
    }

    /* renamed from: R */
    public final int m5053R(MotionEvent motionEvent) {
        removeCallbacks(this.b1);
        try {
            e0(motionEvent);
            boolean z = true;
            this.D0 = true;
            mo5062a(false);
            Trace.beginSection("AndroidOwner:onTouch");
            try {
                int actionMasked = motionEvent.getActionMasked();
                MotionEvent motionEvent2 = this.X0;
                boolean z2 = motionEvent2 != null && motionEvent2.getToolType(0) == 3;
                if (motionEvent2 != null && m5055T(motionEvent, motionEvent2)) {
                    if (m5060Y(motionEvent2)) {
                        this.k0.m59190b();
                    } else if (motionEvent2.getActionMasked() != 10 && z2) {
                        p0(this, motionEvent2, 10, motionEvent2.getEventTime(), false, 8, null);
                    }
                }
                if (motionEvent.getToolType(0) != 3) {
                    z = false;
                }
                if (!z2 && z && actionMasked != 3 && actionMasked != 9 && m5061Z(motionEvent)) {
                    p0(this, motionEvent, 9, motionEvent.getEventTime(), false, 8, null);
                }
                if (motionEvent2 != null) {
                    motionEvent2.recycle();
                }
                this.X0 = MotionEvent.obtainNoHistory(motionEvent);
                return n0(motionEvent);
            } finally {
                Trace.endSection();
            }
        } finally {
            this.D0 = false;
        }
    }

    /* renamed from: S */
    public final boolean m5054S(MotionEvent motionEvent) {
        ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
        float f = -motionEvent.getAxisValue(26);
        return getFocusOwner().mo4847b(new rue(cwi.m21951j(viewConfiguration, getContext()) * f, f * cwi.m21947f(viewConfiguration, getContext()), motionEvent.getEventTime()));
    }

    /* renamed from: T */
    public final boolean m5055T(MotionEvent motionEvent, MotionEvent motionEvent2) {
        return (motionEvent2.getSource() == motionEvent.getSource() && motionEvent2.getToolType(0) == motionEvent.getToolType(0)) ? false : true;
    }

    /* renamed from: U */
    public void m5056U() {
        m5057V(getRoot());
    }

    /* renamed from: V */
    public final void m5057V(zh9 zh9Var) {
        zh9Var.n0();
        fqb fqbVarE0 = zh9Var.e0();
        int iM27354o = fqbVarE0.m27354o();
        if (iM27354o > 0) {
            Object[] objArrM27353n = fqbVarE0.m27353n();
            int i = 0;
            do {
                m5057V((zh9) objArrM27353n[i]);
                i++;
            } while (i < iM27354o);
        }
    }

    /* renamed from: W */
    public final void m5058W(zh9 zh9Var) {
        int i = 0;
        z0b.m58591D(this.w0, zh9Var, false, 2, null);
        fqb fqbVarE0 = zh9Var.e0();
        int iM27354o = fqbVarE0.m27354o();
        if (iM27354o > 0) {
            Object[] objArrM27353n = fqbVarE0.m27353n();
            do {
                m5058W((zh9) objArrM27353n[i]);
                i++;
            } while (i < iM27354o);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00a6 A[LOOP:0: B:35:0x0061->B:61:0x00a6, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00a9 A[EDGE_INSN: B:64:0x00a9->B:62:0x00a9 BREAK  A[LOOP:0: B:35:0x0061->B:61:0x00a6], SYNTHETIC] */
    /* renamed from: X */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean m5059X(MotionEvent motionEvent) {
        boolean z;
        float x = motionEvent.getX();
        if ((Float.isInfinite(x) || Float.isNaN(x)) ? false : true) {
            float y = motionEvent.getY();
            if ((Float.isInfinite(y) || Float.isNaN(y)) ? false : true) {
                float rawX = motionEvent.getRawX();
                if ((Float.isInfinite(rawX) || Float.isNaN(rawX)) ? false : true) {
                    float rawY = motionEvent.getRawY();
                    z = !(!Float.isInfinite(rawY) && !Float.isNaN(rawY));
                }
            }
        }
        if (!z) {
            int pointerCount = motionEvent.getPointerCount();
            for (int i = 1; i < pointerCount; i++) {
                float x2 = motionEvent.getX(i);
                if ((Float.isInfinite(x2) || Float.isNaN(x2)) ? false : true) {
                    float y2 = motionEvent.getY(i);
                    if (!((Float.isInfinite(y2) || Float.isNaN(y2)) ? false : true)) {
                        z = true;
                        if (!z) {
                            break;
                        }
                    } else {
                        if (!(Build.VERSION.SDK_INT >= 29 && !omb.f38592a.m42438a(motionEvent, i))) {
                            z = false;
                        }
                        if (!z) {
                        }
                    }
                }
            }
        }
        return z;
    }

    /* renamed from: Y */
    public final boolean m5060Y(MotionEvent motionEvent) {
        int actionMasked;
        return motionEvent.getButtonState() != 0 || (actionMasked = motionEvent.getActionMasked()) == 0 || actionMasked == 2 || actionMasked == 6;
    }

    /* renamed from: Z */
    public final boolean m5061Z(MotionEvent motionEvent) {
        float x = motionEvent.getX();
        float y = motionEvent.getY();
        if (0.0f <= x && x <= ((float) getWidth())) {
            if (0.0f <= y && y <= ((float) getHeight())) {
                return true;
            }
        }
        return false;
    }

    @Override // p001o.sgc
    /* renamed from: a */
    public void mo5062a(boolean z) {
        uk7 uk7Var;
        if (this.w0.m58608k() || this.w0.m58609l()) {
            Trace.beginSection("AndroidOwner:measureAndLayout");
            if (z) {
                try {
                    uk7Var = this.e1;
                } catch (Throwable th) {
                    Trace.endSection();
                    throw th;
                }
            } else {
                uk7Var = null;
            }
            if (this.w0.m58612o(uk7Var)) {
                requestLayout();
            }
            z0b.m58594e(this.w0, false, 1, null);
            y3i y3iVar = y3i.f54824a;
            Trace.endSection();
        }
    }

    public final boolean a0(MotionEvent motionEvent) {
        MotionEvent motionEvent2;
        if (motionEvent.getPointerCount() != 1 || (motionEvent2 = this.X0) == null || motionEvent2.getPointerCount() != motionEvent.getPointerCount()) {
            return true;
        }
        if (motionEvent.getRawX() == motionEvent2.getRawX()) {
            return !((motionEvent.getRawY() > motionEvent2.getRawY() ? 1 : (motionEvent.getRawY() == motionEvent2.getRawY() ? 0 : -1)) == 0);
        }
        return true;
    }

    @Override // android.view.View
    public void autofill(SparseArray sparseArray) {
        id0 id0Var;
        sq8.m48649h(sparseArray, "values");
        if (!m5045I() || (id0Var = this.m0) == null) {
            return;
        }
        kd0.m35423a(id0Var, sparseArray);
    }

    @Override // p001o.sgc
    /* renamed from: b */
    public void mo5063b(zh9 zh9Var, boolean z, boolean z2, boolean z3) {
        sq8.m48649h(zh9Var, "layoutNode");
        if (z) {
            if (this.w0.m58619x(zh9Var, z2) && z3) {
                j0(zh9Var);
                return;
            }
            return;
        }
        if (this.w0.m58599C(zh9Var, z2) && z3) {
            j0(zh9Var);
        }
    }

    public final void b0(rgc rgcVar, boolean z) {
        sq8.m48649h(rgcVar, "layer");
        if (!z) {
            if (this.i0) {
                return;
            }
            this.f6331Q.remove(rgcVar);
            List list = this.h0;
            if (list != null) {
                list.remove(rgcVar);
                return;
            }
            return;
        }
        if (!this.i0) {
            this.f6331Q.add(rgcVar);
            return;
        }
        List arrayList = this.h0;
        if (arrayList == null) {
            arrayList = new ArrayList();
            this.h0 = arrayList;
        }
        arrayList.add(rgcVar);
    }

    @Override // p001o.sgc
    /* renamed from: c */
    public long mo5064c(long j) {
        d0();
        return qza.m45994c(this.A0, j);
    }

    public final long c0(int i, int i2) {
        return p0i.m42841c(p0i.m42841c(i2) | p0i.m42841c(p0i.m42841c(i) << 32));
    }

    @Override // android.view.View
    public boolean canScrollHorizontally(int i) {
        return this.f6329L.m5160B(false, i, this.f6332a);
    }

    @Override // android.view.View
    public boolean canScrollVertically(int i) {
        return this.f6329L.m5160B(true, i, this.f6332a);
    }

    @Override // p001o.sgc
    /* renamed from: d */
    public void mo5065d(zh9 zh9Var) {
        sq8.m48649h(zh9Var, "layoutNode");
        this.f6329L.i0(zh9Var);
    }

    public final void d0() {
        if (this.D0) {
            return;
        }
        long jCurrentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
        if (jCurrentAnimationTimeMillis != this.C0) {
            this.C0 = jCurrentAnimationTimeMillis;
            f0();
            ViewParent parent = getParent();
            View view = this;
            while (parent instanceof ViewGroup) {
                view = (View) parent;
                parent = ((ViewGroup) view).getParent();
            }
            view.getLocationOnScreen(this.z0);
            int[] iArr = this.z0;
            float f = iArr[0];
            float f2 = iArr[1];
            view.getLocationInWindow(iArr);
            int[] iArr2 = this.z0;
            this.E0 = v9c.m52474a(f - iArr2[0], f2 - iArr2[1]);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        sq8.m48649h(canvas, "canvas");
        if (!isAttachedToWindow()) {
            m5057V(getRoot());
        }
        sgc.m48316h(this, false, 1, null);
        this.i0 = true;
        qc2 qc2Var = this.f6341s;
        Canvas canvasM36964m = qc2Var.m45083a().m36964m();
        qc2Var.m45083a().m36965n(canvas);
        getRoot().m59440q(qc2Var.m45083a());
        qc2Var.m45083a().m36965n(canvasM36964m);
        if (!this.f6331Q.isEmpty()) {
            int size = this.f6331Q.size();
            for (int i = 0; i < size; i++) {
                ((rgc) this.f6331Q.get(i)).mo5111j();
            }
        }
        if (ViewLayer.f6365M.m5117b()) {
            int iSave = canvas.save();
            canvas.clipRect(0.0f, 0.0f, 0.0f, 0.0f);
            super.dispatchDraw(canvas);
            canvas.restoreToCount(iSave);
        }
        this.f6331Q.clear();
        this.i0 = false;
        List list = this.h0;
        if (list != null) {
            sq8.m48646e(list);
            this.f6331Q.addAll(list);
            list.clear();
        }
    }

    @Override // android.view.View
    public boolean dispatchGenericMotionEvent(MotionEvent motionEvent) {
        sq8.m48649h(motionEvent, "event");
        return motionEvent.getActionMasked() == 8 ? motionEvent.isFromSource(4194304) ? m5054S(motionEvent) : (m5059X(motionEvent) || !isAttachedToWindow()) ? super.dispatchGenericMotionEvent(motionEvent) : uid.m51634c(m5053R(motionEvent)) : super.dispatchGenericMotionEvent(motionEvent);
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchHoverEvent(MotionEvent motionEvent) {
        sq8.m48649h(motionEvent, "event");
        if (this.d1) {
            removeCallbacks(this.c1);
            this.c1.run();
        }
        if (m5059X(motionEvent) || !isAttachedToWindow()) {
            return false;
        }
        this.f6329L.m5167I(motionEvent);
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 7) {
            if (actionMasked == 10 && m5061Z(motionEvent)) {
                if (motionEvent.getToolType(0) != 3) {
                    MotionEvent motionEvent2 = this.X0;
                    if (motionEvent2 != null) {
                        motionEvent2.recycle();
                    }
                    this.X0 = MotionEvent.obtainNoHistory(motionEvent);
                    this.d1 = true;
                    post(this.c1);
                    return false;
                }
                if (motionEvent.getButtonState() != 0) {
                    return false;
                }
            }
        } else if (!a0(motionEvent)) {
            return false;
        }
        return uid.m51634c(m5053R(motionEvent));
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        sq8.m48649h(keyEvent, "event");
        if (!isFocused()) {
            return super.dispatchKeyEvent(keyEvent);
        }
        this.f6338g.m58944a(ddd.m22822b(keyEvent.getMetaState()));
        return getFocusOwner().mo4859o(oc9.m41965b(keyEvent)) || super.dispatchKeyEvent(keyEvent);
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchKeyEventPreIme(KeyEvent keyEvent) {
        sq8.m48649h(keyEvent, "event");
        return (isFocused() && getFocusOwner().mo4851f(oc9.m41965b(keyEvent))) || super.dispatchKeyEventPreIme(keyEvent);
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        sq8.m48649h(motionEvent, "motionEvent");
        if (this.d1) {
            removeCallbacks(this.c1);
            MotionEvent motionEvent2 = this.X0;
            sq8.m48646e(motionEvent2);
            if (motionEvent.getActionMasked() != 0 || m5055T(motionEvent, motionEvent2)) {
                this.c1.run();
            } else {
                this.d1 = false;
            }
        }
        if (m5059X(motionEvent) || !isAttachedToWindow()) {
            return false;
        }
        if (motionEvent.getActionMasked() == 2 && !a0(motionEvent)) {
            return false;
        }
        int iM5053R = m5053R(motionEvent);
        if (uid.m51633b(iM5053R)) {
            getParent().requestDisallowInterceptTouchEvent(true);
        }
        return uid.m51634c(iM5053R);
    }

    @Override // p001o.sgc
    /* renamed from: e */
    public void mo5066e(zh9 zh9Var, boolean z) {
        sq8.m48649h(zh9Var, "layoutNode");
        this.w0.m58605h(zh9Var, z);
    }

    public final void e0(MotionEvent motionEvent) {
        this.C0 = AnimationUtils.currentAnimationTimeMillis();
        f0();
        long jM45994c = qza.m45994c(this.A0, v9c.m52474a(motionEvent.getX(), motionEvent.getY()));
        this.E0 = v9c.m52474a(motionEvent.getRawX() - s9c.m48052k(jM45994c), motionEvent.getRawY() - s9c.m48053l(jM45994c));
    }

    public final void f0() {
        this.f1.mo37856a(this, this.A0);
        ov8.m42718a(this.A0, this.B0);
    }

    public final View findViewByAccessibilityIdTraversal(int i) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        View viewM5050N = null;
        try {
            if (Build.VERSION.SDK_INT >= 29) {
                Method declaredMethod = View.class.getDeclaredMethod("findViewByAccessibilityIdTraversal", Integer.TYPE);
                declaredMethod.setAccessible(true);
                Object objInvoke = declaredMethod.invoke(this, Integer.valueOf(i));
                if (objInvoke instanceof View) {
                    viewM5050N = (View) objInvoke;
                }
            } else {
                viewM5050N = m5050N(i, this);
            }
        } catch (NoSuchMethodException unused) {
        }
        return viewM5050N;
    }

    public final boolean g0(rgc rgcVar) {
        sq8.m48649h(rgcVar, "layer");
        if (this.t0 != null) {
            ViewLayer.f6365M.m5117b();
        }
        this.Z0.m29817c(rgcVar);
        return true;
    }

    public final AndroidViewsHandler getAndroidViewsHandler$ui_release() {
        if (this.s0 == null) {
            Context context = getContext();
            sq8.m48648g(context, "context");
            AndroidViewsHandler androidViewsHandler = new AndroidViewsHandler(context);
            this.s0 = androidViewsHandler;
            addView(androidViewsHandler);
        }
        AndroidViewsHandler androidViewsHandler2 = this.s0;
        sq8.m48646e(androidViewsHandler2);
        return androidViewsHandler2;
    }

    @Override // p001o.sgc
    public a61 getAutofill() {
        return this.m0;
    }

    @Override // p001o.sgc
    public t61 getAutofillTree() {
        return this.f6330M;
    }

    public final xk7 getConfigurationChangeObserver() {
        return this.l0;
    }

    public q74 getCoroutineContext() {
        return this.W0;
    }

    @Override // p001o.sgc
    public zl5 getDensity() {
        return this.f6335d;
    }

    @Override // p001o.sgc
    public c77 getFocusOwner() {
        return this.f6337f;
    }

    @Override // android.view.View
    public void getFocusedRect(Rect rect) {
        y3i y3iVar;
        sq8.m48649h(rect, "rect");
        mfe mfeVarMo4856k = getFocusOwner().mo4856k();
        if (mfeVarMo4856k != null) {
            rect.left = lza.m38121d(mfeVarMo4856k.m38945f());
            rect.top = lza.m38121d(mfeVarMo4856k.m38948i());
            rect.right = lza.m38121d(mfeVarMo4856k.m38946g());
            rect.bottom = lza.m38121d(mfeVarMo4856k.m38942c());
            y3iVar = y3i.f54824a;
        } else {
            y3iVar = null;
        }
        if (y3iVar == null) {
            super.getFocusedRect(rect);
        }
    }

    @Override // p001o.sgc
    public lb7.InterfaceC15049a getFontFamilyResolver() {
        return (lb7.InterfaceC15049a) this.P0.getValue();
    }

    @Override // p001o.sgc
    public fb7 getFontLoader() {
        return this.O0;
    }

    @Override // p001o.sgc
    public xw7 getHapticFeedBack() {
        return this.S0;
    }

    public boolean getHasPendingMeasureOrLayout() {
        return this.w0.m58608k();
    }

    @Override // p001o.sgc
    public mj8 getInputModeManager() {
        return this.T0;
    }

    public final long getLastMatrixRecalculationAnimationTime$ui_release() {
        return this.C0;
    }

    @Override // android.view.View, android.view.ViewParent, p001o.sgc
    public qh9 getLayoutDirection() {
        return (qh9) this.R0.getValue();
    }

    public long getMeasureIteration() {
        return this.w0.m58611n();
    }

    public dlb getModifierLocalManager() {
        return this.U0;
    }

    @Override // p001o.sgc
    public scd getPointerIconService() {
        return this.h1;
    }

    public zh9 getRoot() {
        return this.f6342x;
    }

    public nue getRootForTest() {
        return this.f6343y;
    }

    public scf getSemanticsOwner() {
        return this.f6328H;
    }

    @Override // p001o.sgc
    public bi9 getSharedDrawScope() {
        return this.f6334c;
    }

    @Override // p001o.sgc
    public boolean getShowLayoutBounds() {
        return this.r0;
    }

    @Override // p001o.sgc
    public wgc getSnapshotObserver() {
        return this.q0;
    }

    @Override // p001o.sgc
    public uhh getTextInputService() {
        return this.N0;
    }

    @Override // p001o.sgc
    public wih getTextToolbar() {
        return this.V0;
    }

    public View getView() {
        return this;
    }

    @Override // p001o.sgc
    public zvi getViewConfiguration() {
        return this.x0;
    }

    public final C1943b getViewTreeOwners() {
        return (C1943b) this.H0.getValue();
    }

    @Override // p001o.sgc
    public y8j getWindowInfo() {
        return this.f6338g;
    }

    public void h0(uk7 uk7Var) {
        sq8.m48649h(uk7Var, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
        if (this.a1.m27350j(uk7Var)) {
            return;
        }
        this.a1.m27344c(uk7Var);
    }

    @Override // p001o.sgc
    /* renamed from: i */
    public rgc mo5067i(xk7 xk7Var, uk7 uk7Var) {
        DrawChildContainer viewLayerContainer;
        sq8.m48649h(xk7Var, "drawBlock");
        sq8.m48649h(uk7Var, "invalidateParentLayer");
        rgc rgcVar = (rgc) this.Z0.m29816b();
        if (rgcVar != null) {
            rgcVar.mo5102a(xk7Var, uk7Var);
            return rgcVar;
        }
        if (isHardwareAccelerated() && this.F0) {
            try {
                return new kke(this, xk7Var, uk7Var);
            } catch (Throwable unused) {
                this.F0 = false;
            }
        }
        if (this.t0 == null) {
            ViewLayer.C1958c c1958c = ViewLayer.f6365M;
            if (!c1958c.m5116a()) {
                c1958c.m5119d(new View(getContext()));
            }
            if (c1958c.m5117b()) {
                Context context = getContext();
                sq8.m48648g(context, "context");
                viewLayerContainer = new DrawChildContainer(context);
            } else {
                Context context2 = getContext();
                sq8.m48648g(context2, "context");
                viewLayerContainer = new ViewLayerContainer(context2);
            }
            this.t0 = viewLayerContainer;
            addView(viewLayerContainer);
        }
        DrawChildContainer drawChildContainer = this.t0;
        sq8.m48646e(drawChildContainer);
        return new ViewLayer(this, drawChildContainer, xk7Var, uk7Var);
    }

    public final void i0() {
        this.n0 = true;
    }

    public final void j0(zh9 zh9Var) {
        if (isLayoutRequested() || !isAttachedToWindow()) {
            return;
        }
        if (zh9Var != null) {
            while (zh9Var != null && zh9Var.m59424Q() == zh9.EnumC18642g.InMeasureBlock && m5047K(zh9Var)) {
                zh9Var = zh9Var.m59431X();
            }
            if (zh9Var == getRoot()) {
                requestLayout();
                return;
            }
        }
        if (getWidth() == 0 || getHeight() == 0) {
            requestLayout();
        } else {
            invalidate();
        }
    }

    @Override // p001o.sgc
    /* renamed from: k */
    public void mo5068k(zh9 zh9Var) {
        sq8.m48649h(zh9Var, "node");
    }

    @Override // p001o.ted
    /* renamed from: l */
    public long mo5069l(long j) {
        d0();
        return qza.m45994c(this.B0, v9c.m52474a(s9c.m48052k(j) - s9c.m48052k(this.E0), s9c.m48053l(j) - s9c.m48053l(this.E0)));
    }

    @Override // p001o.sgc
    /* renamed from: m */
    public void mo5070m(zh9 zh9Var, boolean z, boolean z2) {
        sq8.m48649h(zh9Var, "layoutNode");
        if (z) {
            if (this.w0.m58618v(zh9Var, z2)) {
                k0(this, null, 1, null);
            }
        } else if (this.w0.m58598A(zh9Var, z2)) {
            k0(this, null, 1, null);
        }
    }

    @Override // p001o.sgc
    /* renamed from: n */
    public void mo5071n(zh9 zh9Var) {
        sq8.m48649h(zh9Var, "node");
        this.w0.m58614q(zh9Var);
        i0();
    }

    public final int n0(MotionEvent motionEvent) {
        Object obj;
        if (this.g1) {
            this.g1 = false;
            this.f6338g.m58944a(ddd.m22822b(motionEvent.getMetaState()));
        }
        xcd xcdVarM34083c = this.j0.m34083c(motionEvent, this);
        if (xcdVarM34083c == null) {
            this.k0.m59190b();
            return add.m16918a(false, false);
        }
        List listM56022b = xcdVarM34083c.m56022b();
        int size = listM56022b.size() - 1;
        if (size >= 0) {
            while (true) {
                int i = size - 1;
                obj = listM56022b.get(size);
                if (((ycd) obj).m57564a()) {
                    break;
                }
                if (i < 0) {
                    break;
                }
                size = i;
            }
            obj = null;
        } else {
            obj = null;
        }
        ycd ycdVar = (ycd) obj;
        if (ycdVar != null) {
            this.f6332a = ycdVar.m57568e();
        }
        int iM59189a = this.k0.m59189a(xcdVarM34083c, this, m5061Z(motionEvent));
        int actionMasked = motionEvent.getActionMasked();
        if ((actionMasked != 0 && actionMasked != 5) || uid.m51634c(iM59189a)) {
            return iM59189a;
        }
        this.j0.m34085e(motionEvent.getPointerId(motionEvent.getActionIndex()));
        return iM59189a;
    }

    public final void o0(MotionEvent motionEvent, int i, long j, boolean z) {
        int actionMasked = motionEvent.getActionMasked();
        int actionIndex = -1;
        if (actionMasked != 1) {
            if (actionMasked == 6) {
                actionIndex = motionEvent.getActionIndex();
            }
        } else if (i != 9 && i != 10) {
            actionIndex = 0;
        }
        int pointerCount = motionEvent.getPointerCount() - (actionIndex >= 0 ? 1 : 0);
        if (pointerCount == 0) {
            return;
        }
        MotionEvent.PointerProperties[] pointerPropertiesArr = new MotionEvent.PointerProperties[pointerCount];
        for (int i2 = 0; i2 < pointerCount; i2++) {
            pointerPropertiesArr[i2] = new MotionEvent.PointerProperties();
        }
        MotionEvent.PointerCoords[] pointerCoordsArr = new MotionEvent.PointerCoords[pointerCount];
        for (int i3 = 0; i3 < pointerCount; i3++) {
            pointerCoordsArr[i3] = new MotionEvent.PointerCoords();
        }
        int i4 = 0;
        while (i4 < pointerCount) {
            int i5 = ((actionIndex < 0 || i4 < actionIndex) ? 0 : 1) + i4;
            motionEvent.getPointerProperties(i5, pointerPropertiesArr[i4]);
            MotionEvent.PointerCoords pointerCoords = pointerCoordsArr[i4];
            motionEvent.getPointerCoords(i5, pointerCoords);
            long jMo5072p = mo5072p(v9c.m52474a(pointerCoords.x, pointerCoords.y));
            pointerCoords.x = s9c.m48052k(jMo5072p);
            pointerCoords.y = s9c.m48053l(jMo5072p);
            i4++;
        }
        MotionEvent motionEventObtain = MotionEvent.obtain(motionEvent.getDownTime() == motionEvent.getEventTime() ? j : motionEvent.getDownTime(), j, i, pointerCount, pointerPropertiesArr, pointerCoordsArr, motionEvent.getMetaState(), z ? 0 : motionEvent.getButtonState(), motionEvent.getXPrecision(), motionEvent.getYPrecision(), motionEvent.getDeviceId(), motionEvent.getEdgeFlags(), motionEvent.getSource(), motionEvent.getFlags());
        jmb jmbVar = this.j0;
        sq8.m48648g(motionEventObtain, "event");
        xcd xcdVarM34083c = jmbVar.m34083c(motionEventObtain, this);
        sq8.m48646e(xcdVarM34083c);
        this.k0.m59189a(xcdVarM34083c, this, true);
        motionEventObtain.recycle();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        xca xcaVarM5078a;
        AbstractC2139h lifecycle;
        id0 id0Var;
        super.onAttachedToWindow();
        m5058W(getRoot());
        m5057V(getRoot());
        getSnapshotObserver().m54370j();
        if (m5045I() && (id0Var = this.m0) != null) {
            p61.f39386a.m42992a(id0Var);
        }
        xca xcaVarM47365a = rzi.m47365a(this);
        h1f h1fVarM50816a = tzi.m50816a(this);
        C1943b viewTreeOwners = getViewTreeOwners();
        if (viewTreeOwners == null || !(xcaVarM47365a == null || h1fVarM50816a == null || (xcaVarM47365a == viewTreeOwners.m5078a() && h1fVarM50816a == viewTreeOwners.m5078a()))) {
            if (xcaVarM47365a == null) {
                throw new IllegalStateException("Composed into the View which doesn't propagate ViewTreeLifecycleOwner!");
            }
            if (h1fVarM50816a == null) {
                throw new IllegalStateException("Composed into the View which doesn't propagateViewTreeSavedStateRegistryOwner!");
            }
            if (viewTreeOwners != null && (xcaVarM5078a = viewTreeOwners.m5078a()) != null && (lifecycle = xcaVarM5078a.getLifecycle()) != null) {
                lifecycle.mo6524d(this);
            }
            xcaVarM47365a.getLifecycle().mo6521a(this);
            C1943b c1943b = new C1943b(xcaVarM47365a, h1fVarM50816a);
            set_viewTreeOwners(c1943b);
            xk7 xk7Var = this.I0;
            if (xk7Var != null) {
                xk7Var.invoke(c1943b);
            }
            this.I0 = null;
        }
        this.T0.m40674a(isInTouchMode() ? lj8.f33918b.m37348b() : lj8.f33918b.m37347a());
        C1943b viewTreeOwners2 = getViewTreeOwners();
        sq8.m48646e(viewTreeOwners2);
        viewTreeOwners2.m5078a().getLifecycle().mo6521a(this);
        getViewTreeObserver().addOnGlobalLayoutListener(this.J0);
        getViewTreeObserver().addOnScrollChangedListener(this.K0);
        getViewTreeObserver().addOnTouchModeChangeListener(this.L0);
    }

    @Override // android.view.View
    public boolean onCheckIsTextEditor() {
        return getPlatformTextInputPluginRegistry().m58993b() != null;
    }

    @Override // android.view.View
    public void onConfigurationChanged(Configuration configuration) {
        sq8.m48649h(configuration, "newConfig");
        super.onConfigurationChanged(configuration);
        Context context = getContext();
        sq8.m48648g(context, "context");
        this.f6335d = fe0.m26472a(context);
        if (m5052P(configuration) != this.Q0) {
            this.Q0 = m5052P(configuration);
            Context context2 = getContext();
            sq8.m48648g(context2, "context");
            setFontFamilyResolver(ob7.m41909a(context2));
        }
        this.l0.invoke(configuration);
    }

    @Override // android.view.View
    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        sq8.m48649h(editorInfo, "outAttrs");
        w9d w9dVarM58993b = getPlatformTextInputPluginRegistry().m58993b();
        if (w9dVarM58993b != null) {
            return w9dVarM58993b.mo45355a(editorInfo);
        }
        return null;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        id0 id0Var;
        xca xcaVarM5078a;
        AbstractC2139h lifecycle;
        super.onDetachedFromWindow();
        getSnapshotObserver().m54371k();
        C1943b viewTreeOwners = getViewTreeOwners();
        if (viewTreeOwners != null && (xcaVarM5078a = viewTreeOwners.m5078a()) != null && (lifecycle = xcaVarM5078a.getLifecycle()) != null) {
            lifecycle.mo6524d(this);
        }
        if (m5045I() && (id0Var = this.m0) != null) {
            p61.f39386a.m42993b(id0Var);
        }
        getViewTreeObserver().removeOnGlobalLayoutListener(this.J0);
        getViewTreeObserver().removeOnScrollChangedListener(this.K0);
        getViewTreeObserver().removeOnTouchModeChangeListener(this.L0);
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        sq8.m48649h(canvas, "canvas");
    }

    @Override // android.view.View
    public void onFocusChanged(boolean z, int i, Rect rect) {
        super.onFocusChanged(z, i, rect);
        StringBuilder sb = new StringBuilder();
        sb.append("Owner FocusChanged(");
        sb.append(z);
        sb.append(')');
        if (z) {
            getFocusOwner().mo4846a();
        } else {
            getFocusOwner().mo4857m();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        this.w0.m58612o(this.e1);
        this.u0 = null;
        r0();
        if (this.s0 != null) {
            getAndroidViewsHandler$ui_release().layout(0, 0, i3 - i, i4 - i2);
        }
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        Trace.beginSection("AndroidOwner:onMeasure");
        try {
            if (!isAttachedToWindow()) {
                m5058W(getRoot());
            }
            long jM5049M = m5049M(i);
            int iM42841c = (int) p0i.m42841c(jM5049M >>> 32);
            int iM42841c2 = (int) p0i.m42841c(jM5049M & 4294967295L);
            long jM5049M2 = m5049M(i2);
            long jM23817a = du3.m23817a(iM42841c, iM42841c2, (int) p0i.m42841c(jM5049M2 >>> 32), (int) p0i.m42841c(4294967295L & jM5049M2));
            bu3 bu3Var = this.u0;
            boolean zM19793e = false;
            if (bu3Var == null) {
                this.u0 = bu3.m19790b(jM23817a);
                this.v0 = false;
            } else {
                if (bu3Var != null) {
                    zM19793e = bu3.m19793e(bu3Var.m19803o(), jM23817a);
                }
                if (!zM19793e) {
                    this.v0 = true;
                }
            }
            this.w0.m58600E(jM23817a);
            this.w0.m58613p();
            setMeasuredDimension(getRoot().b0(), getRoot().m59409B());
            if (this.s0 != null) {
                getAndroidViewsHandler$ui_release().measure(View.MeasureSpec.makeMeasureSpec(getRoot().b0(), 1073741824), View.MeasureSpec.makeMeasureSpec(getRoot().m59409B(), 1073741824));
            }
            y3i y3iVar = y3i.f54824a;
        } finally {
            Trace.endSection();
        }
    }

    @Override // android.view.View
    public void onProvideAutofillVirtualStructure(ViewStructure viewStructure, int i) {
        id0 id0Var;
        if (!m5045I() || viewStructure == null || (id0Var = this.m0) == null) {
            return;
        }
        kd0.m35424b(id0Var, viewStructure);
    }

    @Override // p001o.te5
    public void onResume(xca xcaVar) {
        sq8.m48649h(xcaVar, "owner");
        setShowLayoutBounds(i1.m5077b());
    }

    @Override // android.view.View
    public void onRtlPropertiesChanged(int i) {
        if (this.f6333b) {
            qh9 qh9VarM24833e = ee0.m24833e(i);
            setLayoutDirection(qh9VarM24833e);
            getFocusOwner().mo4849d(qh9VarM24833e);
        }
    }

    @Override // android.view.View
    public void onWindowFocusChanged(boolean z) {
        boolean zM5077b;
        this.f6338g.m58945b(z);
        this.g1 = true;
        super.onWindowFocusChanged(z);
        if (!z || getShowLayoutBounds() == (zM5077b = i1.m5077b())) {
            return;
        }
        setShowLayoutBounds(zM5077b);
        m5056U();
    }

    @Override // p001o.ted
    /* renamed from: p */
    public long mo5072p(long j) {
        d0();
        long jM45994c = qza.m45994c(this.A0, j);
        return v9c.m52474a(s9c.m48052k(jM45994c) + s9c.m48052k(this.E0), s9c.m48053l(jM45994c) + s9c.m48053l(this.E0));
    }

    @Override // p001o.sgc
    /* renamed from: r */
    public void mo5073r() {
        if (this.n0) {
            getSnapshotObserver().m54364a();
            this.n0 = false;
        }
        AndroidViewsHandler androidViewsHandler = this.s0;
        if (androidViewsHandler != null) {
            m5048L(androidViewsHandler);
        }
        while (this.a1.m27357r()) {
            int iM27354o = this.a1.m27354o();
            for (int i = 0; i < iM27354o; i++) {
                uk7 uk7Var = (uk7) this.a1.m27353n()[i];
                this.a1.m27364y(i, null);
                if (uk7Var != null) {
                    uk7Var.invoke();
                }
            }
            this.a1.m27362w(0, iM27354o);
        }
    }

    public final void r0() {
        getLocationOnScreen(this.z0);
        long j = this.y0;
        int iM28997b = gl8.m28997b(j);
        int iM28998c = gl8.m28998c(j);
        int[] iArr = this.z0;
        boolean z = false;
        int i = iArr[0];
        if (iM28997b != i || iM28998c != iArr[1]) {
            this.y0 = hl8.m30757a(i, iArr[1]);
            if (iM28997b != Integer.MAX_VALUE && iM28998c != Integer.MAX_VALUE) {
                getRoot().m59413F().m23246D().k0();
                z = true;
            }
        }
        this.w0.m58602d(z);
    }

    @Override // p001o.sgc
    /* renamed from: s */
    public void mo5074s() {
        this.f6329L.j0();
    }

    public final void setConfigurationChangeObserver(xk7 xk7Var) {
        sq8.m48649h(xk7Var, "<set-?>");
        this.l0 = xk7Var;
    }

    public final void setLastMatrixRecalculationAnimationTime$ui_release(long j) {
        this.C0 = j;
    }

    public final void setOnViewTreeOwnersAvailable(xk7 xk7Var) {
        sq8.m48649h(xk7Var, "callback");
        C1943b viewTreeOwners = getViewTreeOwners();
        if (viewTreeOwners != null) {
            xk7Var.invoke(viewTreeOwners);
        }
        if (isAttachedToWindow()) {
            return;
        }
        this.I0 = xk7Var;
    }

    @Override // p001o.sgc
    public void setShowLayoutBounds(boolean z) {
        this.r0 = z;
    }

    @Override // android.view.ViewGroup
    public boolean shouldDelayChildPressedState() {
        return false;
    }

    @Override // p001o.sgc
    /* renamed from: t */
    public void mo5075t(zh9 zh9Var) {
        sq8.m48649h(zh9Var, "layoutNode");
        this.w0.m58620z(zh9Var);
        k0(this, null, 1, null);
    }

    @Override // p001o.sgc
    public dd0 getAccessibilityManager() {
        return this.p0;
    }

    @Override // p001o.sgc
    public pd0 getClipboardManager() {
        return this.o0;
    }

    @Override // p001o.sgc
    public z9d getPlatformTextInputPluginRegistry() {
        return this.M0;
    }
}
