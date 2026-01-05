package p001o;

import p001o.lb7;

/* loaded from: classes2.dex */
public interface sgc {

    /* renamed from: w */
    public static final C16839a f45399w = C16839a.f45400a;

    /* renamed from: o.sgc$a */
    public static final class C16839a {

        /* renamed from: a */
        public static final /* synthetic */ C16839a f45400a = new C16839a();

        /* renamed from: b */
        public static boolean f45401b;

        /* renamed from: a */
        public final boolean m48319a() {
            return f45401b;
        }
    }

    /* renamed from: o.sgc$b */
    public interface InterfaceC16840b {
        /* renamed from: d */
        void mo48320d();
    }

    /* renamed from: f */
    static /* synthetic */ void m48315f(sgc sgcVar, zh9 zh9Var, boolean z, boolean z2, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: onRequestRelayout");
        }
        if ((i & 2) != 0) {
            z = false;
        }
        if ((i & 4) != 0) {
            z2 = false;
        }
        sgcVar.mo5070m(zh9Var, z, z2);
    }

    /* renamed from: h */
    static /* synthetic */ void m48316h(sgc sgcVar, boolean z, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: measureAndLayout");
        }
        if ((i & 1) != 0) {
            z = true;
        }
        sgcVar.mo5062a(z);
    }

    /* renamed from: j */
    static /* synthetic */ void m48317j(sgc sgcVar, zh9 zh9Var, boolean z, boolean z2, boolean z3, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: onRequestMeasure");
        }
        if ((i & 2) != 0) {
            z = false;
        }
        if ((i & 4) != 0) {
            z2 = false;
        }
        if ((i & 8) != 0) {
            z3 = true;
        }
        sgcVar.mo5063b(zh9Var, z, z2, z3);
    }

    /* renamed from: q */
    static /* synthetic */ void m48318q(sgc sgcVar, zh9 zh9Var, boolean z, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: forceMeasureTheSubtree");
        }
        if ((i & 2) != 0) {
            z = false;
        }
        sgcVar.mo5066e(zh9Var, z);
    }

    /* renamed from: a */
    void mo5062a(boolean z);

    /* renamed from: b */
    void mo5063b(zh9 zh9Var, boolean z, boolean z2, boolean z3);

    /* renamed from: c */
    long mo5064c(long j);

    /* renamed from: d */
    void mo5065d(zh9 zh9Var);

    /* renamed from: e */
    void mo5066e(zh9 zh9Var, boolean z);

    hb getAccessibilityManager();

    a61 getAutofill();

    t61 getAutofillTree();

    eb3 getClipboardManager();

    zl5 getDensity();

    c77 getFocusOwner();

    lb7.InterfaceC15049a getFontFamilyResolver();

    fb7 getFontLoader();

    xw7 getHapticFeedBack();

    mj8 getInputModeManager();

    qh9 getLayoutDirection();

    y9d getPlatformTextInputPluginRegistry();

    scd getPointerIconService();

    bi9 getSharedDrawScope();

    boolean getShowLayoutBounds();

    wgc getSnapshotObserver();

    uhh getTextInputService();

    wih getTextToolbar();

    zvi getViewConfiguration();

    y8j getWindowInfo();

    /* renamed from: i */
    rgc mo5067i(xk7 xk7Var, uk7 uk7Var);

    /* renamed from: k */
    void mo5068k(zh9 zh9Var);

    /* renamed from: m */
    void mo5070m(zh9 zh9Var, boolean z, boolean z2);

    /* renamed from: n */
    void mo5071n(zh9 zh9Var);

    /* renamed from: r */
    void mo5073r();

    boolean requestFocus();

    /* renamed from: s */
    void mo5074s();

    void setShowLayoutBounds(boolean z);

    /* renamed from: t */
    void mo5075t(zh9 zh9Var);
}
