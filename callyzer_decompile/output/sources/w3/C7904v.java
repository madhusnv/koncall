package w3;

import a2.C0036i;
import a3.C0043b;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Canvas;
import android.graphics.Point;
import android.graphics.Rect;
import android.os.Build;
import android.os.Looper;
import android.os.Trace;
import android.util.LongSparseArray;
import android.util.SparseArray;
import android.view.Choreographer;
import android.view.FocusFinder;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.PointerIcon;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewStructure;
import android.view.ViewTreeObserver;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.animation.AnimationUtils;
import android.view.autofill.AutofillManager;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import androidx.compose.ui.input.key.AbstractC0261a;
import androidx.compose.ui.input.rotary.AbstractC0263a;
import androidx.compose.ui.semantics.EmptySemanticsElement;
import b3.AbstractC0574f;
import b3.C0572d;
import b3.C0575g;
import b3.C0578j;
import b3.C0582n;
import b3.C0584p;
import b3.C0585q;
import b3.InterfaceC0579k;
import bg.AbstractC0656a;
import bg.C0657b;
import bk.RunnableC0683n;
import c3.C0848c;
import c4.C0861k;
import c9.C0908c;
import c9.C0910e;
import c9.C0917l;
import c9.C0927v;
import com.skydoves.balloon.internals.DefinitionKt;
import com.sun.mail.imap.IMAPStore;
import d3.C1549c;
import d3.C1551e;
import d3.C1564r;
import d3.InterfaceC1570x;
import d4.C1577e;
import d4.C1590r;
import d7.AbstractC1646r;
import d7.InterfaceC1633f;
import d7.InterfaceC1649u;
import e1.AbstractC1911m;
import e1.C1915q;
import e1.C1922x;
import e1.C1923y;
import e4.C1944a;
import e6.AbstractC1960c;
import ex.InterfaceC2137a;
import ex.InterfaceC2139c;
import f2.C2193p;
import g2.l7;
import g8.InterfaceC2547g;
import i1.AbstractC3131j;
import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;
import java.util.function.Consumer;
import k2.C3953b;
import k4.C4001v;
import k4.InterfaceC3986g;
import k4.InterfaceC3987h;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.AbstractC4154l;
import kotlin.jvm.internal.C4168z;
import l3.C4355b;
import l3.InterfaceC4354a;
import l4.C4357b;
import l4.C4358c;
import l4.C4366k;
import l4.C4367l;
import l4.C4371p;
import l4.C4372q;
import l4.C4381z;
import l4.InputConnectionC4370o;
import l4.InputConnectionC4376u;
import lv.C4535g;
import m2.C4640e;
import m3.C4643a;
import m3.C4645c;
import m3.InterfaceC4644b;
import og.gg;
import og.nd;
import og.se;
import og.te;
import p020v.RunnableC7606p;
import p3.C5803a;
import p3.C5805c;
import p3.C5808f;
import p3.C5821s;
import p3.C5827y;
import p3.InterfaceC5807e;
import p3.InterfaceC5816n;
import p3.InterfaceC5817o;
import pg.w8;
import qi.RunnableC6224g;
import qw.EnumC6359i;
import qw.InterfaceC6353c;
import r3.C6444a;
import s1.C6725t;
import s3.AbstractC6744a;
import s4.C6745a;
import s4.C6749e;
import s4.EnumC6757m;
import s4.InterfaceC6747c;
import u2.AbstractC7316m;
import u2.C7324u;
import u2.C7325v;
import u3.C7333d;
import uw.InterfaceC7564h;
import v3.AbstractC7634f;
import v3.AbstractC7642n;
import v3.C7647s;
import v3.C7649u;
import w2.AbstractC7878q;
import w2.C7876o;
import w2.C7881t;
import w2.InterfaceC7879r;
import w3.c1;
import x2.AbstractC8286j;
import x2.C8277a;
import x2.C8279c;
import x2.C8285i;
import x2.C8287k;
import x2.InterfaceC8282f;
import y2.ViewOnAttachStateChangeListenerC8534d;
import z1.InputConnectionC8855o;
import z2.ViewOnDragListenerC8856a;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: w3.v */
/* loaded from: classes.dex */
public final class C7904v extends ViewGroup implements v3.p1, v3.v1, InterfaceC5807e, InterfaceC1633f {
    public static Class J1;
    public static Method K1;
    public final e1.e0 A1;

    /* renamed from: B */
    public boolean f38003B;
    public final RunnableC0683n B1;

    /* renamed from: C */
    public final C5808f f38004C;
    public final RunnableC7606p C1;

    /* renamed from: D */
    public final C2193p f38005D;
    public boolean D1;

    /* renamed from: E */
    public InterfaceC2139c f38006E;
    public final C7902t E1;

    /* renamed from: F */
    public final C8277a f38007F;
    public final d1 F1;

    /* renamed from: G */
    public final C8279c f38008G;
    public boolean G1;

    /* renamed from: H */
    public boolean f38009H;
    public final C0861k H1;

    /* renamed from: I */
    public final C7891i f38010I;
    public final C7901s I1;

    /* renamed from: K */
    public final C7890h f38011K;

    /* renamed from: L */
    public final v3.r1 f38012L;

    /* renamed from: M */
    public boolean f38013M;

    /* renamed from: N */
    public z0 f38014N;

    /* renamed from: O */
    public o1 f38015O;

    /* renamed from: T */
    public C6745a f38016T;

    /* renamed from: V */
    public boolean f38017V;
    public final int[] X0;
    public final float[] Y0;
    public final float[] Z0;

    /* renamed from: a */
    public long f38018a;

    /* renamed from: a1, reason: collision with root package name */
    public final float[] f44837a1;

    /* renamed from: b */
    public final boolean f38019b;

    /* renamed from: b1, reason: collision with root package name */
    public long f44838b1;

    /* renamed from: c */
    public final v3.i0 f38020c;

    /* renamed from: c1, reason: collision with root package name */
    public boolean f44839c1;

    /* renamed from: d */
    public final k2.e1 f38021d;

    /* renamed from: d1, reason: collision with root package name */
    public long f44840d1;

    /* renamed from: e */
    public final C0585q f38022e;

    /* renamed from: e1, reason: collision with root package name */
    public boolean f44841e1;

    /* renamed from: f */
    public InterfaceC7564h f38023f;

    /* renamed from: f1, reason: collision with root package name */
    public final k2.e1 f44842f1;

    /* renamed from: g */
    public final ViewOnDragListenerC8856a f38024g;

    /* renamed from: g1, reason: collision with root package name */
    public final k2.c0 f44843g1;

    /* renamed from: h */
    public final w1 f38025h;

    /* renamed from: h0, reason: collision with root package name */
    public final v3.v0 f44844h0;

    /* renamed from: h1, reason: collision with root package name */
    public InterfaceC2139c f44845h1;

    /* renamed from: i1, reason: collision with root package name */
    public final ViewTreeObserverOnGlobalLayoutListenerC7893k f44846i1;

    /* renamed from: j */
    public final C1564r f38026j;

    /* renamed from: j1, reason: collision with root package name */
    public final ViewTreeObserverOnScrollChangedListenerC7894l f44847j1;

    /* renamed from: k */
    public final x0 f38027k;

    /* renamed from: k1, reason: collision with root package name */
    public final ViewTreeObserverOnTouchModeChangeListenerC7895m f44848k1;

    /* renamed from: l */
    public final v3.g0 f38028l;

    /* renamed from: l1, reason: collision with root package name */
    public final l4.e0 f44849l1;

    /* renamed from: m */
    public final C1922x f38029m;

    /* renamed from: m1, reason: collision with root package name */
    public final l4.a0 f44850m1;

    /* renamed from: n */
    public final C1944a f38030n;

    /* renamed from: n1, reason: collision with root package name */
    public final AtomicReference f44851n1;

    /* renamed from: o1, reason: collision with root package name */
    public final l1 f44852o1;

    /* renamed from: p */
    public final C7904v f38031p;

    /* renamed from: p1, reason: collision with root package name */
    public final s1 f44853p1;

    /* renamed from: q */
    public final C1590r f38032q;

    /* renamed from: q1, reason: collision with root package name */
    public final k2.e1 f44854q1;

    /* renamed from: r */
    public final b0 f38033r;

    /* renamed from: r1, reason: collision with root package name */
    public int f44855r1;

    /* renamed from: s */
    public ViewOnAttachStateChangeListenerC8534d f38034s;

    /* renamed from: s1, reason: collision with root package name */
    public final k2.e1 f44856s1;

    /* renamed from: t */
    public final C7889g f38035t;

    /* renamed from: t0, reason: collision with root package name */
    public long f44857t0;

    /* renamed from: t1, reason: collision with root package name */
    public final C4355b f44858t1;

    /* renamed from: u1, reason: collision with root package name */
    public final C4645c f44859u1;

    /* renamed from: v */
    public final C1551e f38036v;

    /* renamed from: v1, reason: collision with root package name */
    public final C7333d f44860v1;

    /* renamed from: w */
    public final C8287k f38037w;

    /* renamed from: w1, reason: collision with root package name */
    public final s0 f44861w1;

    /* renamed from: x */
    public final ArrayList f38038x;

    /* renamed from: x1, reason: collision with root package name */
    public MotionEvent f44862x1;

    /* renamed from: y */
    public ArrayList f38039y;

    /* renamed from: y1, reason: collision with root package name */
    public long f44863y1;

    /* renamed from: z */
    public boolean f38040z;

    /* renamed from: z1, reason: collision with root package name */
    public final C0917l f44864z1;

    /* JADX WARN: Type inference failed for: r1v33, types: [w3.k] */
    /* JADX WARN: Type inference failed for: r1v34, types: [w3.l] */
    /* JADX WARN: Type inference failed for: r1v35, types: [w3.m] */
    public C7904v(Context context, InterfaceC7564h interfaceC7564h) {
        C8279c c8279c;
        super(context);
        this.f38018a = 9205357640488583168L;
        int i10 = 1;
        this.f38019b = true;
        this.f38020c = new v3.i0();
        C6749e c6749eM10913a = se.m10913a(context);
        k2.s0 s0Var = k2.s0.f20545d;
        this.f38021d = new k2.e1(c6749eM10913a, s0Var);
        C1577e c1577e = new C1577e();
        EmptySemanticsElement emptySemanticsElement = new EmptySemanticsElement(c1577e);
        v3.a1 a1Var = new v3.a1() { // from class: androidx.compose.ui.platform.AndroidComposeView$bringIntoViewNode$1
            public final boolean equals(Object obj) {
                return obj == this;
            }

            @Override // v3.a1
            /* renamed from: h */
            public final AbstractC7878q mo621h() {
                c1 c1Var = new c1();
                c1Var.f37757q = this.f2132a;
                return c1Var;
            }

            public final int hashCode() {
                return this.f2132a.hashCode();
            }

            @Override // v3.a1
            /* renamed from: i */
            public final void mo622i(AbstractC7878q abstractC7878q) {
                ((c1) abstractC7878q).f37757q = this.f2132a;
            }
        };
        int i11 = 0;
        int i12 = 0;
        this.f38022e = new C0585q(new vr.b0(1, this, C7904v.class, "registerOnEndApplyChangesListener", "registerOnEndApplyChangesListener(Lkotlin/jvm/functions/Function0;)V", i11, 4), new i1.e0(2, this, C7904v.class, "onRequestFocusForOwner", "onRequestFocusForOwner-7o62pno(Landroidx/compose/ui/focus/FocusDirection;Landroidx/compose/ui/geometry/Rect;)Z", i11, 8), new vr.b0(1, this, C7904v.class, "onMoveFocusInChildren", "onMoveFocusInChildren-3ESFkO8(I)Z", i11, 5), new C0575g(i12, this, C7904v.class, "onClearFocusForOwner", "onClearFocusForOwner()V", i11, 8), new C0575g(i12, this, C7904v.class, "onFetchFocusRect", "onFetchFocusRect()Landroidx/compose/ui/geometry/Rect;", i11, 9), new C0582n(i12, 2, C7904v.class, this, "layoutDirection", "getLayoutDirection()Landroidx/compose/ui/unit/LayoutDirection;"));
        this.f38023f = interfaceC7564h;
        this.f38024g = new ViewOnDragListenerC8856a();
        this.f38025h = new w1();
        int i13 = 0;
        InterfaceC7879r interfaceC7879rM716a = AbstractC0261a.m716a(C7876o.f37669a, new C7900r(this, i13));
        InterfaceC7879r interfaceC7879rM719a = AbstractC0263a.m719a();
        this.f38026j = new C1564r();
        this.f38027k = new x0(ViewConfiguration.get(context));
        v3.g0 g0Var = new v3.g0(3);
        g0Var.b0(t3.z0.f34054b);
        g0Var.m14592Z(getDensity());
        g0Var.d0(getViewConfiguration());
        g0Var.c0(emptySemanticsElement.mo14852e(interfaceC7879rM719a).mo14852e(interfaceC7879rM716a).mo14852e(((C0585q) getFocusOwner()).f3944i).mo14852e(m16702getDragAndDropManager().f42634c).mo14852e(a1Var));
        this.f38028l = g0Var;
        C1922x c1922x = AbstractC1911m.f9027a;
        this.f38029m = new C1922x();
        getLayoutNodes();
        this.f38030n = new C1944a();
        this.f38031p = this;
        this.f38032q = new C1590r(getRoot(), c1577e, getLayoutNodes());
        b0 b0Var = new b0(this);
        this.f38033r = b0Var;
        final C7904v c7904v = this;
        c7904v.f38034s = new ViewOnAttachStateChangeListenerC8534d(c7904v, new C0575g(0, c7904v, m0.class, "getContentCaptureSessionCompat", "getContentCaptureSessionCompat(Landroid/view/View;)Landroidx/compose/ui/platform/coreshims/ContentCaptureSessionCompat;", 1, 7));
        c7904v.f38035t = new C7889g(context);
        c7904v.f38036v = new C1551e(c7904v);
        c7904v.f38037w = new C8287k();
        c7904v.f38038x = new ArrayList();
        c7904v.f38004C = new C5808f();
        v3.g0 root = c7904v.getRoot();
        C2193p c2193p = new C2193p();
        c2193p.f10111b = root;
        c2193p.f10112c = new C5805c((C7649u) root.f36832K.f22539c);
        c2193p.f10113d = new C4001v((byte) 0, 18);
        c2193p.f10114e = new C7647s();
        c7904v.f38005D = c2193p;
        c7904v.f38006E = C7898p.f37909b;
        c7904v.f38007F = m15013g() ? new C8277a(c7904v, c7904v.getAutofillTree()) : null;
        if (m15013g()) {
            AutofillManager autofillManager = (AutofillManager) context.getSystemService(AutofillManager.class);
            if (autofillManager == null) {
                throw p020v.a1.m14342v("Autofill service could not be located.");
            }
            c7904v = this;
            c8279c = new C8279c(new C0657b(autofillManager), getSemanticsOwner(), this, getRectManager(), context.getPackageName());
        } else {
            c8279c = null;
        }
        c7904v.f38008G = c8279c;
        c7904v.f38010I = new C7891i(context);
        c7904v.f38011K = new C7890h(c7904v.getClipboardManager());
        c7904v.f38012L = new v3.r1(new C7900r(c7904v, i10));
        c7904v.f44844h0 = new v3.v0(c7904v.getRoot());
        long j6 = Integer.MAX_VALUE;
        c7904v.f44857t0 = (j6 & 4294967295L) | (j6 << 32);
        c7904v.X0 = new int[]{0, 0};
        float[] fArrM5094a = d3.b0.m5094a();
        c7904v.Y0 = fArrM5094a;
        c7904v.Z0 = d3.b0.m5094a();
        c7904v.f44837a1 = d3.b0.m5094a();
        c7904v.f44838b1 = -1L;
        c7904v.f44840d1 = 9187343241974906880L;
        c7904v.f44841e1 = true;
        c7904v.f44842f1 = C3953b.m8517t(null);
        c7904v.f44843g1 = C3953b.m8512o(new C7902t(c7904v, i10));
        c7904v.f44846i1 = new ViewTreeObserver.OnGlobalLayoutListener() { // from class: w3.k
            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public final void onGlobalLayout() {
                this.f37827a.m15030L();
            }
        };
        c7904v.f44847j1 = new ViewTreeObserver.OnScrollChangedListener() { // from class: w3.l
            @Override // android.view.ViewTreeObserver.OnScrollChangedListener
            public final void onScrollChanged() {
                this.f37852a.m15030L();
            }
        };
        c7904v.f44848k1 = new ViewTreeObserver.OnTouchModeChangeListener() { // from class: w3.m
            @Override // android.view.ViewTreeObserver.OnTouchModeChangeListener
            public final void onTouchModeChanged(boolean z6) {
                this.f37855a.f44859u1.f22889a.setValue(new C4643a(z6 ? 1 : 2));
            }
        };
        View view = c7904v.getView();
        C4367l c4367l = new C4367l(view);
        l4.f0 f0Var = new l4.f0(Choreographer.getInstance());
        l4.e0 e0Var = new l4.e0();
        e0Var.f21886c = view;
        e0Var.f21887d = c4367l;
        e0Var.f21888e = f0Var;
        e0Var.f21889f = C4357b.f21856e;
        e0Var.f21890g = C4357b.f21857f;
        e0Var.f21891h = new C4381z("", 4, g4.n0.f13684b);
        e0Var.f21892i = C4366k.f21913g;
        e0Var.f21884a = new ArrayList();
        e0Var.f21893j = nd.m10781b(EnumC6359i.NONE, new C0036i(27, e0Var));
        e0Var.f21895l = new C4358c(c7904v, c4367l);
        e0Var.f21896m = new C4640e(new l4.b0[16]);
        c7904v.f44849l1 = e0Var;
        c7904v.f44850m1 = new l4.a0(e0Var);
        c7904v.f44851n1 = new AtomicReference(null);
        c7904v.f44852o1 = new l1(c7904v.getTextInputService());
        c7904v.f44853p1 = new s1();
        c7904v.f44854q1 = new k2.e1(w8.m11909a(context), s0Var);
        Configuration configuration = context.getResources().getConfiguration();
        int i14 = Build.VERSION.SDK_INT;
        c7904v.f44855r1 = i14 >= 31 ? configuration.fontWeightAdjustment : 0;
        int layoutDirection = context.getResources().getConfiguration().getLayoutDirection();
        EnumC6757m enumC6757m = layoutDirection != 0 ? layoutDirection != 1 ? null : EnumC6757m.Rtl : EnumC6757m.Ltr;
        c7904v.f44856s1 = C3953b.m8517t(enumC6757m == null ? EnumC6757m.Ltr : enumC6757m);
        c7904v.f44858t1 = new C4355b(0, c7904v);
        c7904v.f44859u1 = new C4645c(c7904v.isInTouchMode() ? 1 : 2);
        c7904v.f44860v1 = new C7333d(c7904v);
        c7904v.f44861w1 = new s0(c7904v);
        c7904v.f44864z1 = new C0917l(21);
        c7904v.A1 = new e1.e0();
        c7904v.B1 = new RunnableC0683n(22, c7904v);
        c7904v.C1 = new RunnableC7606p(5, c7904v);
        c7904v.E1 = new C7902t(c7904v, i13);
        c7904v.F1 = i14 < 29 ? new C0910e(fArrM5094a) : new e1();
        c7904v.addOnAttachStateChangeListener(c7904v.f38034s);
        c7904v.setWillNotDraw(false);
        c7904v.setFocusable(true);
        if (i14 >= 26) {
            l0.f37853a.m14974a(c7904v, 1, false);
        }
        c7904v.setFocusableInTouchMode(true);
        c7904v.setClipChildren(false);
        c6.v0.m2528j(c7904v, b0Var);
        c7904v.setOnDragListener(c7904v.m16702getDragAndDropManager());
        c7904v.getRoot().m14594d(c7904v);
        if (i14 >= 29) {
            g0.f37790a.m14916a(c7904v);
        }
        c7904v.H1 = i14 >= 31 ? new C0861k() : null;
        c7904v.I1 = new C7901s(c7904v);
    }

    /* renamed from: b */
    public static final void m15008b(C7904v c7904v, int i10, AccessibilityNodeInfo accessibilityNodeInfo, String str) {
        int iM5641d;
        b0 b0Var = c7904v.f38033r;
        if (AbstractC4154l.m8918a(str, b0Var.f37702G)) {
            int iM5641d2 = b0Var.f37700E.m5641d(i10);
            if (iM5641d2 != -1) {
                accessibilityNodeInfo.getExtras().putInt(str, iM5641d2);
                return;
            }
            return;
        }
        if (!AbstractC4154l.m8918a(str, b0Var.f37703H) || (iM5641d = b0Var.f37701F.m5641d(i10)) == -1) {
            return;
        }
        accessibilityNodeInfo.getExtras().putInt(str, iM5641d);
    }

    /* renamed from: f */
    public static final boolean m15012f(C7904v c7904v, C0572d c0572d, C0848c c0848c) {
        Integer numM1713D;
        if (c7904v.isFocused() || c7904v.hasFocus()) {
            return true;
        }
        return super.requestFocus((c0572d == null || (numM1713D = AbstractC0574f.m1713D(c0572d.f3900a)) == null) ? 130 : numM1713D.intValue(), c0848c != null ? d3.h0.m5146r(c0848c) : null);
    }

    /* renamed from: g */
    public static boolean m15013g() {
        return Build.VERSION.SDK_INT >= 26;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final C7896n get_viewTreeOwners() {
        return (C7896n) this.f44842f1.getValue();
    }

    /* renamed from: h */
    public static void m15014h(ViewGroup viewGroup) {
        int childCount = viewGroup.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = viewGroup.getChildAt(i10);
            if (childAt instanceof C7904v) {
                ((C7904v) childAt).m15041x();
            } else if (childAt instanceof ViewGroup) {
                m15014h((ViewGroup) childAt);
            }
        }
    }

    /* renamed from: i */
    public static long m15015i(int i10) {
        int mode = View.MeasureSpec.getMode(i10);
        int size = View.MeasureSpec.getSize(i10);
        if (mode == Integer.MIN_VALUE) {
            return (0 << 32) | size;
        }
        if (mode == 0) {
            return (0 << 32) | Integer.MAX_VALUE;
        }
        if (mode != 1073741824) {
            throw new IllegalStateException();
        }
        long j6 = size;
        return j6 | (j6 << 32);
    }

    /* renamed from: j */
    public static View m15016j(int i10, View view) throws NoSuchMethodException, SecurityException {
        if (Build.VERSION.SDK_INT < 29) {
            Method declaredMethod = View.class.getDeclaredMethod("getAccessibilityViewId", null);
            declaredMethod.setAccessible(true);
            if (AbstractC4154l.m8918a(declaredMethod.invoke(view, null), Integer.valueOf(i10))) {
                return view;
            }
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                int childCount = viewGroup.getChildCount();
                for (int i11 = 0; i11 < childCount; i11++) {
                    View viewM15016j = m15016j(i10, viewGroup.getChildAt(i11));
                    if (viewM15016j != null) {
                        return viewM15016j;
                    }
                }
            }
        }
        return null;
    }

    /* renamed from: m */
    public static void m15017m(v3.g0 g0Var) {
        g0Var.m14574D();
        C4640e c4640eM14613z = g0Var.m14613z();
        Object[] objArr = c4640eM14613z.f22884a;
        int i10 = c4640eM14613z.f22886c;
        for (int i11 = 0; i11 < i10; i11++) {
            m15017m((v3.g0) objArr[i11]);
        }
    }

    /* renamed from: o */
    public static boolean m15018o(MotionEvent motionEvent) {
        boolean z6 = (Float.floatToRawIntBits(motionEvent.getX()) & Integer.MAX_VALUE) >= 2139095040 || (Float.floatToRawIntBits(motionEvent.getY()) & Integer.MAX_VALUE) >= 2139095040 || (Float.floatToRawIntBits(motionEvent.getRawX()) & Integer.MAX_VALUE) >= 2139095040 || (Float.floatToRawIntBits(motionEvent.getRawY()) & Integer.MAX_VALUE) >= 2139095040;
        if (!z6) {
            int pointerCount = motionEvent.getPointerCount();
            for (int i10 = 1; i10 < pointerCount; i10++) {
                z6 = (Float.floatToRawIntBits(motionEvent.getX(i10)) & Integer.MAX_VALUE) >= 2139095040 || (Float.floatToRawIntBits(motionEvent.getY(i10)) & Integer.MAX_VALUE) >= 2139095040 || (Build.VERSION.SDK_INT >= 29 && !z1.f38069a.m15046a(motionEvent, i10));
                if (z6) {
                    break;
                }
            }
        }
        return z6;
    }

    private void setDensity(InterfaceC6747c interfaceC6747c) {
        this.f38021d.setValue(interfaceC6747c);
    }

    private void setFontFamilyResolver(InterfaceC3987h interfaceC3987h) {
        this.f44854q1.setValue(interfaceC3987h);
    }

    private void setLayoutDirection(EnumC6757m enumC6757m) {
        this.f44856s1.setValue(enumC6757m);
    }

    private final void set_viewTreeOwners(C7896n c7896n) {
        this.f44842f1.setValue(c7896n);
    }

    /* renamed from: A */
    public final void m15019A(v3.g0 g0Var, boolean z6, boolean z10, boolean z11) {
        v3.g0 g0VarM14609v;
        v3.g0 g0VarM14609v2;
        v3.s0 s0Var;
        v3.h0 h0Var;
        v3.v0 v0Var = this.f44844h0;
        if (!z6) {
            if (v0Var.m14675p(g0Var, z10) && z11) {
                m15025G(g0Var);
                return;
            }
            return;
        }
        C0908c c0908c = v0Var.f37029b;
        v3.g0 g0Var2 = g0Var.f36849h;
        v3.k0 k0Var = g0Var.f36833L;
        if (g0Var2 == null) {
            AbstractC6744a.m12907b("Error: requestLookaheadRemeasure cannot be called on a node outside LookaheadScope");
        }
        int i10 = v3.u0.f37018a[k0Var.f36931d.ordinal()];
        if (i10 != 1) {
            if (i10 == 2 || i10 == 3 || i10 == 4) {
                v0Var.f37035h.m9506b(new v3.t0(g0Var, true, z10));
                return;
            }
            if (i10 != 5) {
                throw new NoWhenBranchMatchedException();
            }
            if (!k0Var.f36932e || z10) {
                k0Var.f36932e = true;
                k0Var.f36943p.f37072x = true;
                if (g0Var.f44836h0) {
                    return;
                }
                if ((AbstractC4154l.m8918a(g0Var.m14580J(), Boolean.TRUE) || (k0Var.f36932e && (g0Var.m14607t() == v3.e0.InMeasureBlock || !((s0Var = k0Var.f36944q) == null || (h0Var = s0Var.f37004t) == null || !h0Var.m14618e())))) && ((g0VarM14609v = g0Var.m14609v()) == null || !g0VarM14609v.f36833L.f36932e)) {
                    c0908c.m2558a(g0Var, true);
                } else if ((g0Var.m14579I() || v3.v0.m14662h(g0Var)) && ((g0VarM14609v2 = g0Var.m14609v()) == null || !g0VarM14609v2.m14606s())) {
                    c0908c.m2558a(g0Var, false);
                }
                if (v0Var.f37031d || !z11) {
                    return;
                }
                m15025G(g0Var);
            }
        }
    }

    /* renamed from: B */
    public final void m15020B(v3.g0 g0Var, boolean z6, boolean z10) {
        v3.k0 k0Var = g0Var.f36833L;
        v3.v0 v0Var = this.f44844h0;
        if (!z6) {
            v0Var.getClass();
            int i10 = v3.u0.f37018a[k0Var.f36931d.ordinal()];
            if (i10 == 1 || i10 == 2 || i10 == 3 || i10 == 4) {
                return;
            }
            if (i10 != 5) {
                throw new NoWhenBranchMatchedException();
            }
            v3.g0 g0VarM14609v = g0Var.m14609v();
            boolean z11 = g0VarM14609v == null || g0VarM14609v.m14579I();
            if (!z10) {
                if (g0Var.m14606s()) {
                    return;
                }
                if (g0Var.m14605r() && g0Var.m14579I() == z11 && g0Var.m14579I() == k0Var.f36943p.f37071w) {
                    return;
                }
            }
            v3.y0 y0Var = k0Var.f36943p;
            y0Var.f37073y = true;
            y0Var.f37074z = true;
            if (!g0Var.f44836h0 && y0Var.f37071w && z11) {
                if ((g0VarM14609v == null || !g0VarM14609v.m14605r()) && (g0VarM14609v == null || !g0VarM14609v.m14606s())) {
                    v0Var.f37029b.m2558a(g0Var, false);
                }
                if (v0Var.f37031d) {
                    return;
                }
                m15025G(null);
                return;
            }
            return;
        }
        C0908c c0908c = v0Var.f37029b;
        int i11 = v3.u0.f37018a[k0Var.f36931d.ordinal()];
        if (i11 != 1) {
            if (i11 != 2) {
                if (i11 == 3) {
                    return;
                }
                if (i11 != 4 && i11 != 5) {
                    throw new NoWhenBranchMatchedException();
                }
            }
            if ((k0Var.f36932e || k0Var.f36933f) && !z10) {
                return;
            }
            k0Var.f36933f = true;
            k0Var.f36934g = true;
            v3.y0 y0Var2 = k0Var.f36943p;
            y0Var2.f37073y = true;
            y0Var2.f37074z = true;
            if (g0Var.f44836h0) {
                return;
            }
            v3.g0 g0VarM14609v2 = g0Var.m14609v();
            if (AbstractC4154l.m8918a(g0Var.m14580J(), Boolean.TRUE) && ((g0VarM14609v2 == null || !g0VarM14609v2.f36833L.f36932e) && (g0VarM14609v2 == null || !g0VarM14609v2.f36833L.f36933f))) {
                c0908c.m2558a(g0Var, true);
            } else if (g0Var.m14579I() && ((g0VarM14609v2 == null || !g0VarM14609v2.m14605r()) && (g0VarM14609v2 == null || !g0VarM14609v2.m14606s()))) {
                c0908c.m2558a(g0Var, false);
            }
            if (v0Var.f37031d) {
                return;
            }
            m15025G(null);
        }
    }

    /* renamed from: C */
    public final void m15021C() {
        b0 b0Var = this.f38033r;
        b0Var.f37696A = true;
        if (b0Var.m14888u() && !b0Var.f37707L) {
            b0Var.f37707L = true;
            b0Var.f37719l.post(b0Var.f37708M);
        }
        ViewOnAttachStateChangeListenerC8534d viewOnAttachStateChangeListenerC8534d = this.f38034s;
        viewOnAttachStateChangeListenerC8534d.f41468g = true;
        if (!viewOnAttachStateChangeListenerC8534d.m15801d() || viewOnAttachStateChangeListenerC8534d.f41475p) {
            return;
        }
        viewOnAttachStateChangeListenerC8534d.f41475p = true;
        viewOnAttachStateChangeListenerC8534d.f41470j.post(viewOnAttachStateChangeListenerC8534d.f41476q);
    }

    /* renamed from: D */
    public final void m15022D() {
        if (this.f44839c1) {
            return;
        }
        long jCurrentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
        if (jCurrentAnimationTimeMillis != this.f44838b1) {
            this.f44838b1 = jCurrentAnimationTimeMillis;
            d1 d1Var = this.F1;
            float[] fArr = this.Z0;
            d1Var.mo2601k(this, fArr);
            m0.m14987n(fArr, this.f44837a1);
            ViewParent parent = getParent();
            View view = this;
            while (parent instanceof ViewGroup) {
                view = (View) parent;
                parent = ((ViewGroup) view).getParent();
            }
            int[] iArr = this.X0;
            view.getLocationOnScreen(iArr);
            float f6 = iArr[0];
            float f10 = iArr[1];
            view.getLocationInWindow(iArr);
            float f11 = iArr[0];
            float f12 = f10 - iArr[1];
            this.f44840d1 = (Float.floatToRawIntBits(f6 - f11) << 32) | (Float.floatToRawIntBits(f12) & 4294967295L);
        }
    }

    /* renamed from: E */
    public final void m15023E(MotionEvent motionEvent) {
        this.f44838b1 = AnimationUtils.currentAnimationTimeMillis();
        d1 d1Var = this.F1;
        float[] fArr = this.Z0;
        d1Var.mo2601k(this, fArr);
        m0.m14987n(fArr, this.f44837a1);
        float x3 = motionEvent.getX();
        float y10 = motionEvent.getY();
        long jM5095b = d3.b0.m5095b((Float.floatToRawIntBits(x3) << 32) | (Float.floatToRawIntBits(y10) & 4294967295L), fArr);
        float rawX = motionEvent.getRawX() - Float.intBitsToFloat((int) (jM5095b >> 32));
        float rawY = motionEvent.getRawY() - Float.intBitsToFloat((int) (jM5095b & 4294967295L));
        this.f44840d1 = (Float.floatToRawIntBits(rawX) << 32) | (Float.floatToRawIntBits(rawY) & 4294967295L);
    }

    /* renamed from: F */
    public final void m15024F(v3.o1 o1Var) {
        C0917l c0917l;
        C4640e c4640e;
        Reference referencePoll;
        if (this.f38015O != null) {
            l7 l7Var = u2.f37983r;
        }
        do {
            c0917l = this.f44864z1;
            ReferenceQueue referenceQueue = (ReferenceQueue) c0917l.f5595c;
            c4640e = (C4640e) c0917l.f5594b;
            referencePoll = referenceQueue.poll();
            if (referencePoll != null) {
                c4640e.m9514l(referencePoll);
            }
        } while (referencePoll != null);
        c4640e.m9506b(new WeakReference(o1Var, (ReferenceQueue) c0917l.f5595c));
        this.f38038x.remove(o1Var);
    }

    /* renamed from: G */
    public final void m15025G(v3.g0 g0Var) {
        if (isLayoutRequested() || !isAttachedToWindow()) {
            return;
        }
        if (g0Var != null) {
            while (g0Var != null && g0Var.f36833L.f36943p.f37063m == v3.e0.InMeasureBlock) {
                if (!this.f38017V) {
                    v3.g0 g0VarM14609v = g0Var.m14609v();
                    if (g0VarM14609v == null) {
                        break;
                    }
                    long j6 = ((C7649u) g0VarM14609v.f36832K.f22539c).f34033d;
                    if (C6745a.m12916g(j6) && C6745a.m12915f(j6)) {
                        break;
                    }
                }
                g0Var = g0Var.m14609v();
            }
            if (g0Var == getRoot()) {
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

    /* renamed from: H */
    public final long m15026H(long j6) {
        m15022D();
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j6 >> 32)) - Float.intBitsToFloat((int) (this.f44840d1 >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j6 & 4294967295L)) - Float.intBitsToFloat((int) (this.f44840d1 & 4294967295L));
        return d3.b0.m5095b((Float.floatToRawIntBits(fIntBitsToFloat2) & 4294967295L) | (Float.floatToRawIntBits(fIntBitsToFloat) << 32), this.f44837a1);
    }

    /* renamed from: I */
    public final int m15027I(MotionEvent motionEvent) {
        Object obj;
        if (this.G1) {
            this.G1 = false;
            int metaState = motionEvent.getMetaState();
            this.f38025h.getClass();
            x2.f38053a.setValue(new C5827y(metaState));
        }
        C5808f c5808f = this.f38004C;
        C0927v c0927vM11383a = c5808f.m11383a(motionEvent, this);
        C2193p c2193p = this.f38005D;
        if (c0927vM11383a == null) {
            if (!c2193p.f10110a) {
                ((C1915q) ((C4001v) c2193p.f10113d).f20704b).m5597a();
                ((C5805c) c2193p.f10112c).m11380f();
            }
            return 0;
        }
        List list = (List) c0927vM11383a.f5668b;
        int size = list.size() - 1;
        if (size >= 0) {
            while (true) {
                int i10 = size - 1;
                obj = list.get(size);
                if (((C5821s) obj).f28498e) {
                    break;
                }
                if (i10 < 0) {
                    break;
                }
                size = i10;
            }
            obj = null;
        } else {
            obj = null;
        }
        C5821s c5821s = (C5821s) obj;
        if (c5821s != null) {
            this.f38018a = c5821s.f28497d;
        }
        int iM5894f = c2193p.m5894f(c0927vM11383a, this, m15034p(motionEvent));
        int actionMasked = motionEvent.getActionMasked();
        if ((actionMasked != 0 && actionMasked != 5) || (iM5894f & 1) != 0) {
            return iM5894f;
        }
        int pointerId = motionEvent.getPointerId(motionEvent.getActionIndex());
        c5808f.f28435c.delete(pointerId);
        c5808f.f28434b.delete(pointerId);
        return iM5894f;
    }

    /* renamed from: J */
    public final void m15028J(MotionEvent motionEvent, int i10, long j6, boolean z6) {
        int actionMasked = motionEvent.getActionMasked();
        int actionIndex = -1;
        if (actionMasked != 1) {
            if (actionMasked == 6) {
                actionIndex = motionEvent.getActionIndex();
            }
        } else if (i10 != 9 && i10 != 10) {
            actionIndex = 0;
        }
        int pointerCount = motionEvent.getPointerCount() - (actionIndex >= 0 ? 1 : 0);
        if (pointerCount == 0) {
            return;
        }
        MotionEvent.PointerProperties[] pointerPropertiesArr = new MotionEvent.PointerProperties[pointerCount];
        for (int i11 = 0; i11 < pointerCount; i11++) {
            pointerPropertiesArr[i11] = new MotionEvent.PointerProperties();
        }
        MotionEvent.PointerCoords[] pointerCoordsArr = new MotionEvent.PointerCoords[pointerCount];
        for (int i12 = 0; i12 < pointerCount; i12++) {
            pointerCoordsArr[i12] = new MotionEvent.PointerCoords();
        }
        int i13 = 0;
        while (i13 < pointerCount) {
            int i14 = ((actionIndex < 0 || i13 < actionIndex) ? 0 : 1) + i13;
            motionEvent.getPointerProperties(i14, pointerPropertiesArr[i13]);
            MotionEvent.PointerCoords pointerCoords = pointerCoordsArr[i13];
            motionEvent.getPointerCoords(i14, pointerCoords);
            float f6 = pointerCoords.x;
            long jM15037s = m15037s((Float.floatToRawIntBits(pointerCoords.y) & 4294967295L) | (Float.floatToRawIntBits(f6) << 32));
            pointerCoords.x = Float.intBitsToFloat((int) (jM15037s >> 32));
            pointerCoords.y = Float.intBitsToFloat((int) (jM15037s & 4294967295L));
            i13++;
        }
        MotionEvent motionEventObtain = MotionEvent.obtain(motionEvent.getDownTime() == motionEvent.getEventTime() ? j6 : motionEvent.getDownTime(), j6, i10, pointerCount, pointerPropertiesArr, pointerCoordsArr, motionEvent.getMetaState(), z6 ? 0 : motionEvent.getButtonState(), motionEvent.getXPrecision(), motionEvent.getYPrecision(), motionEvent.getDeviceId(), motionEvent.getEdgeFlags(), motionEvent.getSource(), motionEvent.getFlags());
        C0927v c0927vM11383a = this.f38004C.m11383a(motionEventObtain, this);
        AbstractC4154l.m8920c(c0927vM11383a);
        this.f38005D.m5894f(c0927vM11383a, this, true);
        motionEventObtain.recycle();
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* renamed from: K */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final vw.EnumC7794a m15029K(ex.InterfaceC2141e r6, ww.AbstractC8193c r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof w3.C7903u
            if (r0 == 0) goto L13
            r0 = r7
            w3.u r0 = (w3.C7903u) r0
            int r1 = r0.f37967c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f37967c = r1
            goto L18
        L13:
            w3.u r0 = new w3.u
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.f37965a
            vw.a r1 = vw.EnumC7794a.COROUTINE_SUSPENDED
            int r2 = r0.f37967c
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 == r3) goto L2b
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L2b:
            og.od.m10798c(r7)
            goto L49
        L2f:
            og.od.m10798c(r7)
            w3.r r7 = new w3.r
            r2 = 2
            r7.<init>(r5, r2)
            r0.f37967c = r3
            ao.t r2 = new ao.t
            r3 = 0
            java.util.concurrent.atomic.AtomicReference r4 = r5.f44851n1
            r2.<init>(r7, r4, r6, r3)
            java.lang.Object r6 = tx.c0.m13488k(r2, r0)
            if (r6 != r1) goto L49
            return r1
        L49:
            kotlin.KotlinNothingValueException r6 = new kotlin.KotlinNothingValueException
            r6.<init>()
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: w3.C7904v.m15029K(ex.e, ww.c):vw.a");
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0042  */
    /* renamed from: L */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m15030L() {
        /*
            r13 = this;
            int[] r0 = r13.X0
            r13.getLocationOnScreen(r0)
            long r1 = r13.f44857t0
            r3 = 32
            long r4 = r1 >> r3
            int r4 = (int) r4
            r5 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r1 = r1 & r5
            int r1 = (int) r1
            r2 = 0
            r7 = r0[r2]
            r8 = 1
            if (r4 != r7) goto L25
            r9 = r0[r8]
            if (r1 != r9) goto L25
            long r9 = r13.f44838b1
            r11 = 0
            int r9 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r9 >= 0) goto L42
        L25:
            r0 = r0[r8]
            long r9 = (long) r7
            long r9 = r9 << r3
            long r11 = (long) r0
            long r5 = r5 & r11
            long r5 = r5 | r9
            r13.f44857t0 = r5
            r0 = 2147483647(0x7fffffff, float:NaN)
            if (r4 == r0) goto L42
            if (r1 == r0) goto L42
            v3.g0 r0 = r13.getRoot()
            v3.k0 r0 = r0.f36833L
            v3.y0 r0 = r0.f36943p
            r0.z0()
            r0 = r8
            goto L43
        L42:
            r0 = r2
        L43:
            r13.m15022D()
            e4.a r1 = r13.getRectManager()
            long r3 = r13.f44857t0
            long r5 = r13.f44840d1
            long r5 = og.xe.m11048e(r5)
            r1.getClass()
            float[] r7 = r13.Z0
            int r9 = og.pd.m10823a(r7)
            e4.b r10 = r1.f9179b
            r9 = r9 & 2
            if (r9 != 0) goto L62
            goto L63
        L62:
            r7 = 0
        L63:
            long r11 = r10.f9190c
            boolean r9 = s4.C6754j.m12940a(r5, r11)
            if (r9 != 0) goto L6f
            r10.f9190c = r5
            r5 = r8
            goto L70
        L6f:
            r5 = r2
        L70:
            long r11 = r10.f9191d
            boolean r6 = s4.C6754j.m12940a(r3, r11)
            if (r6 != 0) goto L7b
            r10.f9191d = r3
            r5 = r8
        L7b:
            if (r7 == 0) goto L7e
            r5 = r8
        L7e:
            if (r5 != 0) goto L84
            boolean r3 = r1.f9182e
            if (r3 == 0) goto L85
        L84:
            r2 = r8
        L85:
            r1.f9182e = r2
            v3.v0 r1 = r13.f44844h0
            r1.m14664a(r0)
            e4.a r0 = r13.getRectManager()
            r0.m5694a()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: w3.C7904v.m15030L():void");
    }

    @Override // android.view.ViewGroup
    public final void addView(View view) {
        addView(view, -1);
    }

    @Override // android.view.View
    public final void autofill(SparseArray sparseArray) {
        if (m15013g()) {
            C8279c c8279c = this.f38008G;
            if (c8279c != null) {
                c8279c.m15486a(sparseArray);
            }
            C8277a c8277a = this.f38007F;
            if (c8277a != null) {
                AbstractC0656a.m1910s(c8277a, sparseArray);
            }
        }
    }

    @Override // android.view.View
    public final boolean canScrollHorizontally(int i10) {
        return this.f38033r.m14881m(i10, this.f38018a, false);
    }

    @Override // android.view.View
    public final boolean canScrollVertically(int i10) {
        return this.f38033r.m14881m(i10, this.f38018a, true);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        if (!isAttachedToWindow()) {
            m15017m(getRoot());
        }
        m15038t(true);
        AbstractC7316m.m13686k().mo13644m();
        this.f38040z = true;
        C1564r c1564r = this.f38026j;
        C1549c c1549c = c1564r.f7808a;
        Canvas canvas2 = c1549c.f7733a;
        c1549c.f7733a = canvas;
        getRoot().m14599i(c1549c, null);
        c1564r.f7808a.f7733a = canvas2;
        ArrayList arrayList = this.f38038x;
        if (!arrayList.isEmpty()) {
            int size = arrayList.size();
            for (int i10 = 0; i10 < size; i10++) {
                ((v3.o1) arrayList.get(i10)).mo14652h();
            }
        }
        if (u2.f37987w) {
            int iSave = canvas.save();
            canvas.clipRect(DefinitionKt.NO_Float_VALUE, DefinitionKt.NO_Float_VALUE, DefinitionKt.NO_Float_VALUE, DefinitionKt.NO_Float_VALUE);
            super.dispatchDraw(canvas);
            canvas.restoreToCount(iSave);
        }
        arrayList.clear();
        this.f38040z = false;
        ArrayList arrayList2 = this.f38039y;
        if (arrayList2 != null) {
            arrayList.addAll(arrayList2);
            arrayList2.clear();
        }
        getRectManager().m5694a();
    }

    @Override // android.view.View
    public final boolean dispatchGenericMotionEvent(MotionEvent motionEvent) {
        C6444a c6444a;
        int size;
        C4535g c4535g;
        AbstractC7878q abstractC7878qM14545f;
        C4535g c4535g2;
        if (this.D1) {
            RunnableC7606p runnableC7606p = this.C1;
            removeCallbacks(runnableC7606p);
            if (motionEvent.getActionMasked() == 8) {
                this.D1 = false;
            } else {
                runnableC7606p.run();
            }
        }
        if (motionEvent.getActionMasked() != 8) {
            return super.dispatchGenericMotionEvent(motionEvent);
        }
        if (m15018o(motionEvent) || !isAttachedToWindow()) {
            return super.dispatchGenericMotionEvent(motionEvent);
        }
        if (!motionEvent.isFromSource(4194304)) {
            return (m15032l(motionEvent) & 1) != 0;
        }
        ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
        motionEvent.getAxisValue(26);
        Context context = getContext();
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 26) {
            Method method = c6.w0.f5534a;
            AbstractC0656a.m1905n(viewConfiguration);
        } else {
            c6.w0.m2532a(viewConfiguration, context);
        }
        Context context2 = getContext();
        if (i10 >= 26) {
            AbstractC0656a.m1904m(viewConfiguration);
        } else {
            c6.w0.m2532a(viewConfiguration, context2);
        }
        motionEvent.getEventTime();
        motionEvent.getDeviceId();
        InterfaceC0579k focusOwner = getFocusOwner();
        C0043b c0043b = new C0043b(24, this, motionEvent);
        C0585q c0585q = (C0585q) focusOwner;
        if (c0585q.f3942g.f3915f) {
            System.out.println((Object) "FocusRelatedWarning: Dispatching rotary event while the focus system is invalidated.");
            return false;
        }
        b3.e0 e0VarM1722g = AbstractC0574f.m1722g(c0585q.f3941f);
        if (e0VarM1722g != null) {
            if (!e0VarM1722g.f37670a.f37683p) {
                AbstractC6744a.m12907b("visitAncestors called on an unattached node");
            }
            AbstractC7878q abstractC7878q = e0VarM1722g.f37670a;
            v3.g0 g0VarM14563x = AbstractC7634f.m14563x(e0VarM1722g);
            loop0: while (true) {
                if (g0VarM14563x == null) {
                    abstractC7878qM14545f = null;
                    break;
                }
                if ((((AbstractC7878q) g0VarM14563x.f36832K.f22542f).f37673d & 16384) != 0) {
                    while (abstractC7878q != null) {
                        if ((abstractC7878q.f37672c & 16384) != 0) {
                            C4640e c4640e = null;
                            abstractC7878qM14545f = abstractC7878q;
                            while (abstractC7878qM14545f != null) {
                                if (abstractC7878qM14545f instanceof C6444a) {
                                    break loop0;
                                }
                                if ((abstractC7878qM14545f.f37672c & 16384) != 0 && (abstractC7878qM14545f instanceof AbstractC7642n)) {
                                    int i11 = 0;
                                    for (AbstractC7878q abstractC7878q2 = ((AbstractC7642n) abstractC7878qM14545f).f36953r; abstractC7878q2 != null; abstractC7878q2 = abstractC7878q2.f37675f) {
                                        if ((abstractC7878q2.f37672c & 16384) != 0) {
                                            i11++;
                                            if (i11 == 1) {
                                                abstractC7878qM14545f = abstractC7878q2;
                                            } else {
                                                if (c4640e == null) {
                                                    c4640e = new C4640e(new AbstractC7878q[16]);
                                                }
                                                if (abstractC7878qM14545f != null) {
                                                    c4640e.m9506b(abstractC7878qM14545f);
                                                    abstractC7878qM14545f = null;
                                                }
                                                c4640e.m9506b(abstractC7878q2);
                                            }
                                        }
                                    }
                                    if (i11 == 1) {
                                    }
                                }
                                abstractC7878qM14545f = AbstractC7634f.m14545f(c4640e);
                            }
                        }
                        abstractC7878q = abstractC7878q.f37674e;
                    }
                }
                g0VarM14563x = g0VarM14563x.m14609v();
                abstractC7878q = (g0VarM14563x == null || (c4535g2 = g0VarM14563x.f36832K) == null) ? null : (v3.x1) c4535g2.f22541e;
            }
            c6444a = (C6444a) abstractC7878qM14545f;
        } else {
            c6444a = null;
        }
        if (c6444a != null) {
            C6444a c6444a2 = c6444a;
            if (!c6444a2.f37670a.f37683p) {
                AbstractC6744a.m12907b("visitAncestors called on an unattached node");
            }
            AbstractC7878q abstractC7878q3 = c6444a2.f37670a.f37674e;
            v3.g0 g0VarM14563x2 = AbstractC7634f.m14563x(c6444a);
            ArrayList arrayList = null;
            while (g0VarM14563x2 != null) {
                if ((((AbstractC7878q) g0VarM14563x2.f36832K.f22542f).f37673d & 16384) != 0) {
                    while (abstractC7878q3 != null) {
                        if ((abstractC7878q3.f37672c & 16384) != 0) {
                            AbstractC7878q abstractC7878qM14545f2 = abstractC7878q3;
                            C4640e c4640e2 = null;
                            while (abstractC7878qM14545f2 != null) {
                                if (abstractC7878qM14545f2 instanceof C6444a) {
                                    if (arrayList == null) {
                                        arrayList = new ArrayList();
                                    }
                                    arrayList.add(abstractC7878qM14545f2);
                                } else if ((abstractC7878qM14545f2.f37672c & 16384) != 0 && (abstractC7878qM14545f2 instanceof AbstractC7642n)) {
                                    int i12 = 0;
                                    for (AbstractC7878q abstractC7878q4 = ((AbstractC7642n) abstractC7878qM14545f2).f36953r; abstractC7878q4 != null; abstractC7878q4 = abstractC7878q4.f37675f) {
                                        if ((abstractC7878q4.f37672c & 16384) != 0) {
                                            i12++;
                                            if (i12 == 1) {
                                                abstractC7878qM14545f2 = abstractC7878q4;
                                            } else {
                                                if (c4640e2 == null) {
                                                    c4640e2 = new C4640e(new AbstractC7878q[16]);
                                                }
                                                if (abstractC7878qM14545f2 != null) {
                                                    c4640e2.m9506b(abstractC7878qM14545f2);
                                                    abstractC7878qM14545f2 = null;
                                                }
                                                c4640e2.m9506b(abstractC7878q4);
                                            }
                                        }
                                    }
                                    if (i12 == 1) {
                                    }
                                }
                                abstractC7878qM14545f2 = AbstractC7634f.m14545f(c4640e2);
                            }
                        }
                        abstractC7878q3 = abstractC7878q3.f37674e;
                    }
                }
                g0VarM14563x2 = g0VarM14563x2.m14609v();
                abstractC7878q3 = (g0VarM14563x2 == null || (c4535g = g0VarM14563x2.f36832K) == null) ? null : (v3.x1) c4535g.f22541e;
            }
            if (arrayList != null && arrayList.size() - 1 >= 0) {
                while (true) {
                    int i13 = size - 1;
                    ((C6444a) arrayList.get(size)).getClass();
                    if (i13 < 0) {
                        break;
                    }
                    size = i13;
                }
            }
            AbstractC7878q abstractC7878qM14545f3 = c6444a2.f37670a;
            C4640e c4640e3 = null;
            while (abstractC7878qM14545f3 != null) {
                if (abstractC7878qM14545f3 instanceof C6444a) {
                } else if ((abstractC7878qM14545f3.f37672c & 16384) != 0 && (abstractC7878qM14545f3 instanceof AbstractC7642n)) {
                    int i14 = 0;
                    for (AbstractC7878q abstractC7878q5 = ((AbstractC7642n) abstractC7878qM14545f3).f36953r; abstractC7878q5 != null; abstractC7878q5 = abstractC7878q5.f37675f) {
                        if ((abstractC7878q5.f37672c & 16384) != 0) {
                            i14++;
                            if (i14 == 1) {
                                abstractC7878qM14545f3 = abstractC7878q5;
                            } else {
                                if (c4640e3 == null) {
                                    c4640e3 = new C4640e(new AbstractC7878q[16]);
                                }
                                if (abstractC7878qM14545f3 != null) {
                                    c4640e3.m9506b(abstractC7878qM14545f3);
                                    abstractC7878qM14545f3 = null;
                                }
                                c4640e3.m9506b(abstractC7878q5);
                            }
                        }
                    }
                    if (i14 == 1) {
                    }
                }
                abstractC7878qM14545f3 = AbstractC7634f.m14545f(c4640e3);
            }
            if (!((Boolean) c0043b.invoke()).booleanValue()) {
                AbstractC7878q abstractC7878qM14545f4 = c6444a2.f37670a;
                C4640e c4640e4 = null;
                while (abstractC7878qM14545f4 != null) {
                    if (abstractC7878qM14545f4 instanceof C6444a) {
                    } else if ((abstractC7878qM14545f4.f37672c & 16384) != 0 && (abstractC7878qM14545f4 instanceof AbstractC7642n)) {
                        int i15 = 0;
                        for (AbstractC7878q abstractC7878q6 = ((AbstractC7642n) abstractC7878qM14545f4).f36953r; abstractC7878q6 != null; abstractC7878q6 = abstractC7878q6.f37675f) {
                            if ((abstractC7878q6.f37672c & 16384) != 0) {
                                i15++;
                                if (i15 == 1) {
                                    abstractC7878qM14545f4 = abstractC7878q6;
                                } else {
                                    if (c4640e4 == null) {
                                        c4640e4 = new C4640e(new AbstractC7878q[16]);
                                    }
                                    if (abstractC7878qM14545f4 != null) {
                                        c4640e4.m9506b(abstractC7878qM14545f4);
                                        abstractC7878qM14545f4 = null;
                                    }
                                    c4640e4.m9506b(abstractC7878q6);
                                }
                            }
                        }
                        if (i15 == 1) {
                        }
                    }
                    abstractC7878qM14545f4 = AbstractC7634f.m14545f(c4640e4);
                }
                if (arrayList != null) {
                    int size2 = arrayList.size();
                    for (int i16 = 0; i16 < size2; i16++) {
                        C7898p c7898p = ((C6444a) arrayList.get(i16)).f31099q;
                    }
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:66:0x015c  */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean dispatchHoverEvent(android.view.MotionEvent r24) {
        /*
            Method dump skipped, instructions count: 357
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: w3.C7904v.dispatchHoverEvent(android.view.MotionEvent):boolean");
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        if (!isFocused()) {
            return ((C0585q) getFocusOwner()).m1745d(keyEvent, new C0043b(23, this, keyEvent));
        }
        int metaState = keyEvent.getMetaState();
        this.f38025h.getClass();
        x2.f38053a.setValue(new C5827y(metaState));
        return ((C0585q) getFocusOwner()).m1745d(keyEvent, C0578j.f3919a) || super.dispatchKeyEvent(keyEvent);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEventPreIme(KeyEvent keyEvent) {
        C4535g c4535g;
        if (isFocused()) {
            C0585q c0585q = (C0585q) getFocusOwner();
            if (c0585q.f3942g.f3915f) {
                System.out.println((Object) "FocusRelatedWarning: Dispatching intercepted soft keyboard event while the focus system is invalidated.");
            } else {
                b3.e0 e0VarM1722g = AbstractC0574f.m1722g(c0585q.f3941f);
                if (e0VarM1722g != null) {
                    if (!e0VarM1722g.f37670a.f37683p) {
                        AbstractC6744a.m12907b("visitAncestors called on an unattached node");
                    }
                    AbstractC7878q abstractC7878q = e0VarM1722g.f37670a;
                    v3.g0 g0VarM14563x = AbstractC7634f.m14563x(e0VarM1722g);
                    while (g0VarM14563x != null) {
                        if ((((AbstractC7878q) g0VarM14563x.f36832K.f22542f).f37673d & 131072) != 0) {
                            while (abstractC7878q != null) {
                                if ((abstractC7878q.f37672c & 131072) != 0) {
                                    AbstractC7878q abstractC7878qM14545f = abstractC7878q;
                                    C4640e c4640e = null;
                                    while (abstractC7878qM14545f != null) {
                                        if ((abstractC7878qM14545f.f37672c & 131072) != 0 && (abstractC7878qM14545f instanceof AbstractC7642n)) {
                                            int i10 = 0;
                                            for (AbstractC7878q abstractC7878q2 = ((AbstractC7642n) abstractC7878qM14545f).f36953r; abstractC7878q2 != null; abstractC7878q2 = abstractC7878q2.f37675f) {
                                                if ((abstractC7878q2.f37672c & 131072) != 0) {
                                                    i10++;
                                                    if (i10 == 1) {
                                                        abstractC7878qM14545f = abstractC7878q2;
                                                    } else {
                                                        if (c4640e == null) {
                                                            c4640e = new C4640e(new AbstractC7878q[16]);
                                                        }
                                                        if (abstractC7878qM14545f != null) {
                                                            c4640e.m9506b(abstractC7878qM14545f);
                                                            abstractC7878qM14545f = null;
                                                        }
                                                        c4640e.m9506b(abstractC7878q2);
                                                    }
                                                }
                                            }
                                            if (i10 == 1) {
                                            }
                                        }
                                        abstractC7878qM14545f = AbstractC7634f.m14545f(c4640e);
                                    }
                                }
                                abstractC7878q = abstractC7878q.f37674e;
                            }
                        }
                        g0VarM14563x = g0VarM14563x.m14609v();
                        abstractC7878q = (g0VarM14563x == null || (c4535g = g0VarM14563x.f36832K) == null) ? null : (v3.x1) c4535g.f22541e;
                    }
                }
            }
        }
        return super.dispatchKeyEventPreIme(keyEvent);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchProvideStructure(ViewStructure viewStructure) {
        if (Build.VERSION.SDK_INT < 28) {
            f0.f37783a.m14913a(viewStructure, getView());
        } else {
            super.dispatchProvideStructure(viewStructure);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (this.D1) {
            RunnableC7606p runnableC7606p = this.C1;
            removeCallbacks(runnableC7606p);
            MotionEvent motionEvent2 = this.f44862x1;
            AbstractC4154l.m8920c(motionEvent2);
            if (motionEvent.getActionMasked() == 0 && motionEvent2.getSource() == motionEvent.getSource() && motionEvent2.getToolType(0) == motionEvent.getToolType(0)) {
                this.D1 = false;
            } else {
                runnableC7606p.run();
            }
        }
        if (!m15018o(motionEvent) && isAttachedToWindow() && (motionEvent.getActionMasked() != 2 || m15035q(motionEvent))) {
            int iM15032l = m15032l(motionEvent);
            if ((iM15032l & 2) != 0) {
                getParent().requestDisallowInterceptTouchEvent(true);
            }
            if ((iM15032l & 1) != 0) {
                return true;
            }
        }
        return false;
    }

    public final View findViewByAccessibilityIdTraversal(int i10) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        try {
            if (Build.VERSION.SDK_INT < 29) {
                return m15016j(i10, this);
            }
            Method declaredMethod = View.class.getDeclaredMethod("findViewByAccessibilityIdTraversal", Integer.TYPE);
            declaredMethod.setAccessible(true);
            Object objInvoke = declaredMethod.invoke(this, Integer.valueOf(i10));
            if (objInvoke instanceof View) {
                return (View) objInvoke;
            }
            return null;
        } catch (NoSuchMethodException unused) {
            return null;
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final View focusSearch(View view, int i10) {
        C0848c c0848cM1719d;
        if (view == null || this.f44844h0.f37030c) {
            return super.focusSearch(view, i10);
        }
        View viewFindNextFocus = FocusFinder.getInstance().findNextFocus(this, view, i10);
        if (view == this) {
            b3.e0 e0VarM1722g = AbstractC0574f.m1722g(((C0585q) getFocusOwner()).f3941f);
            c0848cM1719d = e0VarM1722g != null ? AbstractC0574f.m1725j(e0VarM1722g) : null;
            if (c0848cM1719d == null) {
                c0848cM1719d = AbstractC0574f.m1719d(view, this);
            }
        } else {
            c0848cM1719d = AbstractC0574f.m1719d(view, this);
        }
        C0572d c0572dM1714E = AbstractC0574f.m1714E(i10);
        int i11 = c0572dM1714E != null ? c0572dM1714E.f3900a : 6;
        C4168z c4168z = new C4168z();
        if (((C0585q) getFocusOwner()).m1746e(i11, c0848cM1719d, new o1.k0(c4168z, 5)) != null) {
            Object obj = c4168z.f21164a;
            if (obj != null) {
                if (viewFindNextFocus != null) {
                    if (i11 == 1 || i11 == 2) {
                        return super.focusSearch(view, i10);
                    }
                    AbstractC4154l.m8920c(obj);
                    if (AbstractC0574f.m1731p(AbstractC0574f.m1725j((b3.e0) obj), AbstractC0574f.m1719d(viewFindNextFocus, this), c0848cM1719d, i11)) {
                    }
                }
                return this;
            }
            if (viewFindNextFocus == null) {
            }
            return viewFindNextFocus;
        }
        return view;
    }

    public final z0 getAndroidViewsHandler$ui_release() {
        if (this.f38014N == null) {
            z0 z0Var = new z0(getContext());
            this.f38014N = z0Var;
            addView(z0Var, -1);
            requestLayout();
        }
        z0 z0Var2 = this.f38014N;
        AbstractC4154l.m8920c(z0Var2);
        return z0Var2;
    }

    public InterfaceC8282f getAutofill() {
        return this.f38007F;
    }

    public AbstractC8286j getAutofillManager() {
        return this.f38008G;
    }

    public C8287k getAutofillTree() {
        return this.f38037w;
    }

    public final InterfaceC2139c getConfigurationChangeObserver() {
        return this.f38006E;
    }

    public final ViewOnAttachStateChangeListenerC8534d getContentCaptureManager$ui_release() {
        return this.f38034s;
    }

    public InterfaceC7564h getCoroutineContext() {
        return this.f38023f;
    }

    public InterfaceC6747c getDensity() {
        return (InterfaceC6747c) this.f38021d.getValue();
    }

    public InterfaceC0579k getFocusOwner() {
        return this.f38022e;
    }

    @Override // android.view.View
    public final void getFocusedRect(Rect rect) {
        C0848c c0848cM15042y = m15042y();
        if (c0848cM15042y != null) {
            rect.left = Math.round(c0848cM15042y.f5354a);
            rect.top = Math.round(c0848cM15042y.f5355b);
            rect.right = Math.round(c0848cM15042y.f5356c);
            rect.bottom = Math.round(c0848cM15042y.f5357d);
            return;
        }
        if (AbstractC4154l.m8918a(((C0585q) getFocusOwner()).m1746e(6, null, C7898p.f37910c), Boolean.TRUE)) {
            super.getFocusedRect(rect);
        } else {
            rect.set(Integer.MIN_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE);
        }
    }

    public InterfaceC3987h getFontFamilyResolver() {
        return (InterfaceC3987h) this.f44854q1.getValue();
    }

    public InterfaceC3986g getFontLoader() {
        return this.f44853p1;
    }

    public InterfaceC1570x getGraphicsContext() {
        return this.f38036v;
    }

    public InterfaceC4354a getHapticFeedBack() {
        return this.f44858t1;
    }

    public boolean getHasPendingMeasureOrLayout() {
        return this.f44844h0.f37029b.m2580y();
    }

    @Override // android.view.View
    public int getImportantForAutofill() {
        return 1;
    }

    public InterfaceC4644b getInputModeManager() {
        return this.f44859u1;
    }

    public final long getLastMatrixRecalculationAnimationTime$ui_release() {
        return this.f44838b1;
    }

    @Override // android.view.View, android.view.ViewParent
    public EnumC6757m getLayoutDirection() {
        return (EnumC6757m) this.f44856s1.getValue();
    }

    public long getMeasureIteration() {
        v3.v0 v0Var = this.f44844h0;
        if (!v0Var.f37030c) {
            AbstractC6744a.m12906a("measureIteration should be only used during the measure/layout pass");
        }
        return v0Var.f37034g;
    }

    public C7333d getModifierLocalManager() {
        return this.f44860v1;
    }

    public t3.v0 getPlacementScope() {
        int i10 = t3.y0.f34047b;
        return new t3.g0(1, this);
    }

    public InterfaceC5817o getPointerIconService() {
        return this.I1;
    }

    public C1944a getRectManager() {
        return this.f38030n;
    }

    public v3.g0 getRoot() {
        return this.f38028l;
    }

    public v3.v1 getRootForTest() {
        return this.f38031p;
    }

    public final boolean getScrollCaptureInProgress$ui_release() {
        C0861k c0861k;
        if (Build.VERSION.SDK_INT < 31 || (c0861k = this.H1) == null) {
            return false;
        }
        return ((Boolean) ((k2.e1) c0861k.f5403b).getValue()).booleanValue();
    }

    public C1590r getSemanticsOwner() {
        return this.f38032q;
    }

    public v3.i0 getSharedDrawScope() {
        return this.f38020c;
    }

    public boolean getShowLayoutBounds() {
        return this.f38013M;
    }

    public v3.r1 getSnapshotObserver() {
        return this.f38012L;
    }

    public p2 getSoftwareKeyboardController() {
        return this.f44852o1;
    }

    public l4.a0 getTextInputService() {
        return this.f44850m1;
    }

    public q2 getTextToolbar() {
        return this.f44861w1;
    }

    public t2 getViewConfiguration() {
        return this.f38027k;
    }

    public final C7896n getViewTreeOwners() {
        return (C7896n) this.f44843g1.getValue();
    }

    public w2 getWindowInfo() {
        return this.f38025h;
    }

    public final C8279c get_autofillManager$ui_release() {
        return this.f38008G;
    }

    /* renamed from: k */
    public final void m15031k(v3.g0 g0Var, boolean z6) {
        this.f44844h0.m14667f(g0Var, z6);
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x007b  */
    /* renamed from: l */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int m15032l(android.view.MotionEvent r17) {
        /*
            Method dump skipped, instructions count: 375
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: w3.C7904v.m15032l(android.view.MotionEvent):int");
    }

    /* renamed from: n */
    public final void m15033n(v3.g0 g0Var) {
        this.f44844h0.m14675p(g0Var, false);
        C4640e c4640eM14613z = g0Var.m14613z();
        Object[] objArr = c4640eM14613z.f22884a;
        int i10 = c4640eM14613z.f22886c;
        for (int i11 = 0; i11 < i10; i11++) {
            m15033n((v3.g0) objArr[i11]);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        AbstractC1646r lifecycle;
        InterfaceC1649u interfaceC1649u;
        C8277a c8277a;
        super.onAttachedToWindow();
        boolean zHasWindowFocus = hasWindowFocus();
        w1 w1Var = this.f38025h;
        w1Var.f38046a.setValue(Boolean.valueOf(zHasWindowFocus));
        w1Var.getClass();
        m15033n(getRoot());
        m15017m(getRoot());
        getSnapshotObserver().f36980a.m13722e();
        if (m15013g() && (c8277a = this.f38007F) != null) {
            C8285i.f39813a.m15495a(c8277a);
        }
        InterfaceC1649u interfaceC1649uM5337d = d7.q0.m5337d(this);
        InterfaceC2547g interfaceC2547gM10674a = gg.m10674a(this);
        C7896n viewTreeOwners = getViewTreeOwners();
        if (viewTreeOwners == null || (interfaceC1649uM5337d != null && interfaceC2547gM10674a != null && (interfaceC1649uM5337d != (interfaceC1649u = viewTreeOwners.f37864a) || interfaceC2547gM10674a != interfaceC1649u))) {
            if (interfaceC1649uM5337d == null) {
                throw new IllegalStateException("Composed into the View which doesn't propagate ViewTreeLifecycleOwner!");
            }
            if (interfaceC2547gM10674a == null) {
                throw new IllegalStateException("Composed into the View which doesn't propagateViewTreeSavedStateRegistryOwner!");
            }
            if (viewTreeOwners != null && (lifecycle = viewTreeOwners.f37864a.getLifecycle()) != null) {
                lifecycle.mo5346d(this);
            }
            interfaceC1649uM5337d.getLifecycle().mo5343a(this);
            C7896n c7896n = new C7896n(interfaceC1649uM5337d, interfaceC2547gM10674a);
            set_viewTreeOwners(c7896n);
            InterfaceC2139c interfaceC2139c = this.f44845h1;
            if (interfaceC2139c != null) {
                interfaceC2139c.invoke(c7896n);
            }
            this.f44845h1 = null;
        }
        this.f44859u1.f22889a.setValue(new C4643a(isInTouchMode() ? 1 : 2));
        C7896n viewTreeOwners2 = getViewTreeOwners();
        AbstractC1646r lifecycle2 = viewTreeOwners2 != null ? viewTreeOwners2.f37864a.getLifecycle() : null;
        if (lifecycle2 == null) {
            throw p020v.a1.m14342v("No lifecycle owner exists");
        }
        lifecycle2.mo5343a(this);
        lifecycle2.mo5343a(this.f38034s);
        getViewTreeObserver().addOnGlobalLayoutListener(this.f44846i1);
        getViewTreeObserver().addOnScrollChangedListener(this.f44847j1);
        getViewTreeObserver().addOnTouchModeChangeListener(this.f44848k1);
        if (Build.VERSION.SDK_INT >= 31) {
            j0.f37811a.m14967b(this);
        }
        C8279c c8279c = this.f38008G;
        if (c8279c != null) {
            ((C0585q) getFocusOwner()).f3946k.m5543a(c8279c);
            getSemanticsOwner().f7886d.m5543a(c8279c);
        }
    }

    @Override // android.view.View
    public final boolean onCheckIsTextEditor() {
        C7881t c7881t = (C7881t) this.f44851n1.get();
        r0 r0Var = (r0) (c7881t != null ? c7881t.f37685b : null);
        if (r0Var == null) {
            return this.f44849l1.f21885b;
        }
        C7881t c7881t2 = (C7881t) r0Var.f37948d.get();
        t1 t1Var = (t1) (c7881t2 != null ? c7881t2.f37685b : null);
        return t1Var != null && (t1Var.f37964e ^ true);
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        setDensity(se.m10913a(getContext()));
        this.f38025h.getClass();
        int i10 = Build.VERSION.SDK_INT;
        if ((i10 >= 31 ? configuration.fontWeightAdjustment : 0) != this.f44855r1) {
            this.f44855r1 = i10 >= 31 ? configuration.fontWeightAdjustment : 0;
            setFontFamilyResolver(w8.m11909a(getContext()));
        }
        this.f38006E.invoke(configuration);
    }

    @Override // android.view.View
    public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        int i10;
        C7881t c7881t = (C7881t) this.f44851n1.get();
        r0 r0Var = (r0) (c7881t != null ? c7881t.f37685b : null);
        if (r0Var == null) {
            l4.e0 e0Var = this.f44849l1;
            if (e0Var.f21885b) {
                C4366k c4366k = (C4366k) e0Var.f21892i;
                C4381z c4381z = (C4381z) e0Var.f21891h;
                int i11 = c4366k.f21918e;
                boolean z6 = c4366k.f21914a;
                if (i11 == 1) {
                    i10 = z6 ? 6 : 0;
                } else if (i11 == 0) {
                    i10 = 1;
                } else if (i11 == 2) {
                    i10 = 2;
                } else if (i11 == 6) {
                    i10 = 5;
                } else if (i11 == 5) {
                    i10 = 7;
                } else if (i11 == 3) {
                    i10 = 3;
                } else if (i11 == 4) {
                    i10 = 4;
                } else {
                    if (i11 != 7) {
                        throw new IllegalStateException("invalid ImeAction");
                    }
                }
                editorInfo.imeOptions = i10;
                int i12 = c4366k.f21917d;
                if (i12 == 1) {
                    editorInfo.inputType = 1;
                } else if (i12 == 2) {
                    editorInfo.inputType = 1;
                    editorInfo.imeOptions = Integer.MIN_VALUE | i10;
                } else if (i12 == 3) {
                    editorInfo.inputType = 2;
                } else if (i12 == 4) {
                    editorInfo.inputType = 3;
                } else if (i12 == 5) {
                    editorInfo.inputType = 17;
                } else if (i12 == 6) {
                    editorInfo.inputType = 33;
                } else if (i12 == 7) {
                    editorInfo.inputType = 129;
                } else if (i12 == 8) {
                    editorInfo.inputType = 18;
                } else {
                    if (i12 != 9) {
                        throw new IllegalStateException("Invalid Keyboard Type");
                    }
                    editorInfo.inputType = 8194;
                }
                if (!z6) {
                    int i13 = editorInfo.inputType;
                    if ((i13 & 1) == 1) {
                        editorInfo.inputType = i13 | 131072;
                        if (i11 == 1) {
                            editorInfo.imeOptions |= 1073741824;
                        }
                    }
                }
                int i14 = editorInfo.inputType;
                if ((i14 & 1) == 1) {
                    int i15 = c4366k.f21915b;
                    if (i15 == 1) {
                        editorInfo.inputType = i14 | 4096;
                    } else if (i15 == 2) {
                        editorInfo.inputType = i14 | 8192;
                    } else if (i15 == 3) {
                        editorInfo.inputType = i14 | 16384;
                    }
                    if (c4366k.f21916c) {
                        editorInfo.inputType |= 32768;
                    }
                }
                long j6 = c4381z.f21946b;
                int i16 = g4.n0.f13685c;
                editorInfo.initialSelStart = (int) (j6 >> 32);
                editorInfo.initialSelEnd = (int) (j6 & 4294967295L);
                AbstractC1960c.m5709c(editorInfo, c4381z.f21945a.f13620b);
                editorInfo.imeOptions |= 33554432;
                InputConnectionC4376u inputConnectionC4376u = new InputConnectionC4376u((C4381z) e0Var.f21891h, new l4.d0(0, e0Var), ((C4366k) e0Var.f21892i).f21916c);
                e0Var.f21884a.add(new WeakReference(inputConnectionC4376u));
                return inputConnectionC4376u;
            }
        } else {
            C7881t c7881t2 = (C7881t) r0Var.f37948d.get();
            t1 t1Var = (t1) (c7881t2 != null ? c7881t2.f37685b : null);
            if (t1Var != null) {
                synchronized (t1Var.f37962c) {
                    if (t1Var.f37964e) {
                        return null;
                    }
                    InputConnectionC8855o inputConnectionC8855oM16329a = t1Var.f37960a.m16329a(editorInfo);
                    C6725t c6725t = new C6725t(13, t1Var);
                    int i17 = Build.VERSION.SDK_INT;
                    InputConnection c4372q = i17 >= 34 ? new C4372q(inputConnectionC8855oM16329a, c6725t) : i17 >= 25 ? new C4371p(inputConnectionC8855oM16329a, c6725t) : new InputConnectionC4370o(inputConnectionC8855oM16329a, c6725t);
                    t1Var.f37963d.m9506b(new v3.c2(c4372q));
                    return c4372q;
                }
            }
        }
        return null;
    }

    @Override // android.view.View
    public final void onCreateVirtualViewTranslationRequests(long[] jArr, int[] iArr, Consumer consumer) {
        ViewOnAttachStateChangeListenerC8534d viewOnAttachStateChangeListenerC8534d = this.f38034s;
        viewOnAttachStateChangeListenerC8534d.getClass();
        AbstractC3131j.m7516f(viewOnAttachStateChangeListenerC8534d, jArr, consumer);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        C8277a c8277a;
        super.onDetachedFromWindow();
        C7325v c7325v = getSnapshotObserver().f36980a;
        a1.c0 c0Var = c7325v.f34932h;
        if (c0Var != null) {
            c0Var.m29k();
        }
        c7325v.m13719b();
        this.f38025h.getClass();
        C7896n viewTreeOwners = getViewTreeOwners();
        AbstractC1646r lifecycle = viewTreeOwners != null ? viewTreeOwners.f37864a.getLifecycle() : null;
        if (lifecycle == null) {
            throw p020v.a1.m14342v("No lifecycle owner exists");
        }
        lifecycle.mo5346d(this.f38034s);
        lifecycle.mo5346d(this);
        if (m15013g() && (c8277a = this.f38007F) != null) {
            C8285i.f39813a.m15496b(c8277a);
        }
        getViewTreeObserver().removeOnGlobalLayoutListener(this.f44846i1);
        getViewTreeObserver().removeOnScrollChangedListener(this.f44847j1);
        getViewTreeObserver().removeOnTouchModeChangeListener(this.f44848k1);
        if (Build.VERSION.SDK_INT >= 31) {
            j0.f37811a.m14966a(this);
        }
        C8279c c8279c = this.f38008G;
        if (c8279c != null) {
            getSemanticsOwner().f7886d.m5551i(c8279c);
            ((C0585q) getFocusOwner()).f3946k.m5551i(c8279c);
        }
    }

    @Override // android.view.View
    public final void onFocusChanged(boolean z6, int i10, Rect rect) {
        super.onFocusChanged(z6, i10, rect);
        if (z6 || hasFocus()) {
            return;
        }
        AbstractC0574f.m1720e(((C0585q) getFocusOwner()).f3941f, true);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z6, int i10, int i11, int i12, int i13) {
        this.f44838b1 = 0L;
        this.f44844h0.m14669j(this.E1);
        this.f38016T = null;
        m15030L();
        if (this.f38014N != null) {
            getAndroidViewsHandler$ui_release().layout(0, 0, i12 - i10, i13 - i11);
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i10, int i11) {
        v3.v0 v0Var = this.f44844h0;
        Trace.beginSection("AndroidOwner:onMeasure");
        try {
            if (!isAttachedToWindow()) {
                m15033n(getRoot());
            }
            long jM15015i = m15015i(i10);
            long jM15015i2 = m15015i(i11);
            long jM10935a = te.m10935a((int) (jM15015i >>> 32), (int) (jM15015i & 4294967295L), (int) (jM15015i2 >>> 32), (int) (4294967295L & jM15015i2));
            C6745a c6745a = this.f38016T;
            if (c6745a == null) {
                this.f38016T = new C6745a(jM10935a);
                this.f38017V = false;
            } else if (!C6745a.m12912c(c6745a.f32195a, jM10935a)) {
                this.f38017V = true;
            }
            v0Var.m14676q(jM10935a);
            v0Var.m14671l();
            setMeasuredDimension(getRoot().f36833L.f36943p.f34030a, getRoot().f36833L.f36943p.f34031b);
            if (this.f38014N != null) {
                getAndroidViewsHandler$ui_release().measure(View.MeasureSpec.makeMeasureSpec(getRoot().f36833L.f36943p.f34030a, 1073741824), View.MeasureSpec.makeMeasureSpec(getRoot().f36833L.f36943p.f34031b, 1073741824));
            }
            Trace.endSection();
        } catch (Throwable th2) {
            Trace.endSection();
            throw th2;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x00a2  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onProvideAutofillVirtualStructure(android.view.ViewStructure r12, int r13) {
        /*
            Method dump skipped, instructions count: 267
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: w3.C7904v.onProvideAutofillVirtualStructure(android.view.ViewStructure, int):void");
    }

    @Override // android.view.ViewGroup, android.view.View
    public final PointerIcon onResolvePointerIcon(MotionEvent motionEvent, int i10) {
        InterfaceC5816n interfaceC5816n;
        int toolType = motionEvent.getToolType(i10);
        if (motionEvent.isFromSource(8194) || !motionEvent.isFromSource(16386) || (!(toolType == 2 || toolType == 4) || (interfaceC5816n = ((C7901s) getPointerIconService()).f37949a) == null)) {
            return super.onResolvePointerIcon(motionEvent, i10);
        }
        Context context = getContext();
        return interfaceC5816n instanceof C5803a ? PointerIcon.getSystemIcon(context, ((C5803a) interfaceC5816n).f28408b) : PointerIcon.getSystemIcon(context, IMAPStore.RESPONSE);
    }

    @Override // d7.InterfaceC1633f
    public final void onResume(InterfaceC1649u interfaceC1649u) {
        setShowLayoutBounds(s1.m15003a());
    }

    @Override // android.view.View
    public final void onRtlPropertiesChanged(int i10) {
        if (this.f38019b) {
            EnumC6757m enumC6757m = i10 != 0 ? i10 != 1 ? null : EnumC6757m.Rtl : EnumC6757m.Ltr;
            if (enumC6757m == null) {
                enumC6757m = EnumC6757m.Ltr;
            }
            setLayoutDirection(enumC6757m);
        }
    }

    @Override // android.view.View
    public final void onScrollCaptureSearch(Rect rect, Point point, Consumer consumer) {
        C0861k c0861k;
        if (Build.VERSION.SDK_INT < 31 || (c0861k = this.H1) == null) {
            return;
        }
        c0861k.m2310j(this, getSemanticsOwner(), getCoroutineContext(), consumer);
    }

    @Override // android.view.View
    public final void onVirtualViewTranslationResponses(LongSparseArray longSparseArray) {
        ViewOnAttachStateChangeListenerC8534d viewOnAttachStateChangeListenerC8534d = this.f38034s;
        viewOnAttachStateChangeListenerC8534d.getClass();
        if (Build.VERSION.SDK_INT < 31) {
            return;
        }
        if (AbstractC4154l.m8918a(Looper.getMainLooper().getThread(), Thread.currentThread())) {
            AbstractC3131j.m7512b(viewOnAttachStateChangeListenerC8534d, longSparseArray);
        } else {
            viewOnAttachStateChangeListenerC8534d.f41462a.post(new RunnableC6224g(22, viewOnAttachStateChangeListenerC8534d, longSparseArray));
        }
    }

    @Override // android.view.View
    public final void onWindowFocusChanged(boolean z6) {
        boolean zM15003a;
        this.f38025h.f38046a.setValue(Boolean.valueOf(z6));
        this.G1 = true;
        super.onWindowFocusChanged(z6);
        if (!z6 || getShowLayoutBounds() == (zM15003a = s1.m15003a())) {
            return;
        }
        setShowLayoutBounds(zM15003a);
        m15017m(getRoot());
    }

    /* renamed from: p */
    public final boolean m15034p(MotionEvent motionEvent) {
        float x3 = motionEvent.getX();
        float y10 = motionEvent.getY();
        return DefinitionKt.NO_Float_VALUE <= x3 && x3 <= ((float) getWidth()) && DefinitionKt.NO_Float_VALUE <= y10 && y10 <= ((float) getHeight());
    }

    /* renamed from: q */
    public final boolean m15035q(MotionEvent motionEvent) {
        MotionEvent motionEvent2;
        return (motionEvent.getPointerCount() == 1 && (motionEvent2 = this.f44862x1) != null && motionEvent2.getPointerCount() == motionEvent.getPointerCount() && motionEvent.getRawX() == motionEvent2.getRawX() && motionEvent.getRawY() == motionEvent2.getRawY()) ? false : true;
    }

    /* renamed from: r */
    public final void m15036r(float[] fArr) {
        m15022D();
        d3.b0.m5098e(fArr, this.Z0);
        float fIntBitsToFloat = Float.intBitsToFloat((int) (this.f44840d1 >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (this.f44840d1 & 4294967295L));
        float[] fArr2 = this.Y0;
        d3.b0.m5097d(fArr2);
        d3.b0.m5099f(fArr2, fIntBitsToFloat, fIntBitsToFloat2);
        m0.m14993t(fArr, fArr2);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean requestFocus(int i10, Rect rect) {
        if (isFocused()) {
            return true;
        }
        if (((C0585q) getFocusOwner()).f3941f.N0().getHasFocus()) {
            return super.requestFocus(i10, rect);
        }
        C0572d c0572dM1714E = AbstractC0574f.m1714E(i10);
        int i11 = c0572dM1714E != null ? c0572dM1714E.f3900a : 7;
        return AbstractC4154l.m8918a(((C0585q) getFocusOwner()).m1746e(i11, rect != null ? d3.h0.m5150v(rect) : null, new C0584p(i11, 8)), Boolean.TRUE);
    }

    /* renamed from: s */
    public final long m15037s(long j6) {
        m15022D();
        long jM5095b = d3.b0.m5095b(j6, this.Z0);
        float fIntBitsToFloat = Float.intBitsToFloat((int) (this.f44840d1 >> 32)) + Float.intBitsToFloat((int) (jM5095b >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (this.f44840d1 & 4294967295L)) + Float.intBitsToFloat((int) (jM5095b & 4294967295L));
        return (Float.floatToRawIntBits(fIntBitsToFloat2) & 4294967295L) | (Float.floatToRawIntBits(fIntBitsToFloat) << 32);
    }

    public void setAccessibilityEventBatchIntervalMillis(long j6) {
        this.f38033r.f37715h = j6;
    }

    public final void setConfigurationChangeObserver(InterfaceC2139c interfaceC2139c) {
        this.f38006E = interfaceC2139c;
    }

    public final void setContentCaptureManager$ui_release(ViewOnAttachStateChangeListenerC8534d viewOnAttachStateChangeListenerC8534d) {
        this.f38034s = viewOnAttachStateChangeListenerC8534d;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1, types: [w2.q] */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v12 */
    /* JADX WARN: Type inference failed for: r4v4 */
    /* JADX WARN: Type inference failed for: r4v5, types: [w2.q] */
    /* JADX WARN: Type inference failed for: r4v6, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v7 */
    /* JADX WARN: Type inference failed for: r4v8 */
    /* JADX WARN: Type inference failed for: r4v9 */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v3, types: [m2.e] */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v6, types: [m2.e] */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Type inference failed for: r5v9 */
    public void setCoroutineContext(InterfaceC7564h interfaceC7564h) {
        this.f38023f = interfaceC7564h;
        AbstractC7878q abstractC7878q = (AbstractC7878q) getRoot().f36832K.f22542f;
        if (abstractC7878q instanceof p3.h0) {
            ((p3.h0) abstractC7878q).N0();
        }
        if (!abstractC7878q.f37670a.f37683p) {
            AbstractC6744a.m12907b("visitSubtreeIf called on an unattached node");
        }
        C4640e c4640e = new C4640e(new AbstractC7878q[16]);
        AbstractC7878q abstractC7878q2 = abstractC7878q.f37670a;
        AbstractC7878q abstractC7878q3 = abstractC7878q2.f37675f;
        if (abstractC7878q3 == null) {
            AbstractC7634f.m14541b(c4640e, abstractC7878q2);
        } else {
            c4640e.m9506b(abstractC7878q3);
        }
        while (true) {
            int i10 = c4640e.f22886c;
            if (i10 == 0) {
                return;
            }
            AbstractC7878q abstractC7878q4 = (AbstractC7878q) c4640e.m9515m(i10 - 1);
            if ((abstractC7878q4.f37673d & 16) != 0) {
                for (AbstractC7878q abstractC7878q5 = abstractC7878q4; abstractC7878q5 != null; abstractC7878q5 = abstractC7878q5.f37675f) {
                    if ((abstractC7878q5.f37672c & 16) != 0) {
                        AbstractC7642n abstractC7642nM14545f = abstractC7878q5;
                        ?? c4640e2 = 0;
                        while (abstractC7642nM14545f != 0) {
                            if (abstractC7642nM14545f instanceof v3.u1) {
                                v3.u1 u1Var = (v3.u1) abstractC7642nM14545f;
                                if (u1Var instanceof p3.h0) {
                                    ((p3.h0) u1Var).N0();
                                }
                            } else if ((abstractC7642nM14545f.f37672c & 16) != 0 && (abstractC7642nM14545f instanceof AbstractC7642n)) {
                                AbstractC7878q abstractC7878q6 = abstractC7642nM14545f.f36953r;
                                int i11 = 0;
                                abstractC7642nM14545f = abstractC7642nM14545f;
                                c4640e2 = c4640e2;
                                while (abstractC7878q6 != null) {
                                    if ((abstractC7878q6.f37672c & 16) != 0) {
                                        i11++;
                                        c4640e2 = c4640e2;
                                        if (i11 == 1) {
                                            abstractC7642nM14545f = abstractC7878q6;
                                        } else {
                                            if (c4640e2 == 0) {
                                                c4640e2 = new C4640e(new AbstractC7878q[16]);
                                            }
                                            if (abstractC7642nM14545f != 0) {
                                                c4640e2.m9506b(abstractC7642nM14545f);
                                                abstractC7642nM14545f = 0;
                                            }
                                            c4640e2.m9506b(abstractC7878q6);
                                        }
                                    }
                                    abstractC7878q6 = abstractC7878q6.f37675f;
                                    abstractC7642nM14545f = abstractC7642nM14545f;
                                    c4640e2 = c4640e2;
                                }
                                if (i11 == 1) {
                                }
                            }
                            abstractC7642nM14545f = AbstractC7634f.m14545f(c4640e2);
                        }
                    }
                }
            }
            AbstractC7634f.m14541b(c4640e, abstractC7878q4);
        }
    }

    public final void setLastMatrixRecalculationAnimationTime$ui_release(long j6) {
        this.f44838b1 = j6;
    }

    public final void setOnViewTreeOwnersAvailable(InterfaceC2139c interfaceC2139c) {
        C7896n viewTreeOwners = getViewTreeOwners();
        if (viewTreeOwners != null) {
            interfaceC2139c.invoke(viewTreeOwners);
        }
        if (isAttachedToWindow()) {
            return;
        }
        this.f44845h1 = interfaceC2139c;
    }

    public void setShowLayoutBounds(boolean z6) {
        this.f38013M = z6;
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }

    /* renamed from: t */
    public final void m15038t(boolean z6) {
        C7902t c7902t;
        v3.v0 v0Var = this.f44844h0;
        if (v0Var.f37029b.m2580y() || ((C4640e) v0Var.f37032e.f5668b).f22886c != 0) {
            Trace.beginSection("AndroidOwner:measureAndLayout");
            if (z6) {
                try {
                    c7902t = this.E1;
                } catch (Throwable th2) {
                    Trace.endSection();
                    throw th2;
                }
            } else {
                c7902t = null;
            }
            if (v0Var.m14669j(c7902t)) {
                requestLayout();
            }
            v0Var.m14664a(false);
            if (this.f38003B) {
                getViewTreeObserver().dispatchOnGlobalLayout();
                this.f38003B = false;
            }
            Trace.endSection();
        }
    }

    /* renamed from: v */
    public final void m15039v(v3.g0 g0Var, long j6) {
        v3.v0 v0Var = this.f44844h0;
        Trace.beginSection("AndroidOwner:measureAndLayout");
        try {
            v0Var.m14670k(g0Var, j6);
            if (!v0Var.f37029b.m2580y()) {
                v0Var.m14664a(false);
                if (this.f38003B) {
                    getViewTreeObserver().dispatchOnGlobalLayout();
                    this.f38003B = false;
                }
            }
            getRectManager().m5694a();
            Trace.endSection();
        } catch (Throwable th2) {
            Trace.endSection();
            throw th2;
        }
    }

    /* renamed from: w */
    public final void m15040w(v3.o1 o1Var, boolean z6) {
        ArrayList arrayList = this.f38038x;
        if (!z6) {
            if (this.f38040z) {
                return;
            }
            arrayList.remove(o1Var);
            ArrayList arrayList2 = this.f38039y;
            if (arrayList2 != null) {
                arrayList2.remove(o1Var);
                return;
            }
            return;
        }
        if (!this.f38040z) {
            arrayList.add(o1Var);
            return;
        }
        ArrayList arrayList3 = this.f38039y;
        if (arrayList3 == null) {
            arrayList3 = new ArrayList();
            this.f38039y = arrayList3;
        }
        arrayList3.add(o1Var);
    }

    /* renamed from: x */
    public final void m15041x() {
        C8279c c8279c;
        if (this.f38009H) {
            C7325v c7325v = getSnapshotObserver().f36980a;
            synchronized (c7325v.f34931g) {
                try {
                    C4640e c4640e = c7325v.f34930f;
                    int i10 = c4640e.f22886c;
                    int i11 = 0;
                    for (int i12 = 0; i12 < i10; i12++) {
                        C7324u c7324u = (C7324u) c4640e.f22884a[i12];
                        c7324u.m13717e();
                        if (!(c7324u.f34918f.f9002e != 0)) {
                            i11++;
                        } else if (i11 > 0) {
                            Object[] objArr = c4640e.f22884a;
                            objArr[i12 - i11] = objArr[i12];
                        }
                    }
                    int i13 = i10 - i11;
                    Arrays.fill(c4640e.f22884a, i13, i10, (Object) null);
                    c4640e.f22886c = i13;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            this.f38009H = false;
        }
        z0 z0Var = this.f38014N;
        if (z0Var != null) {
            m15014h(z0Var);
        }
        if (m15013g() && (c8279c = this.f38008G) != null) {
            C1923y c1923y = c8279c.f39810h;
            if (c1923y.f9087d == 0 && c8279c.f39811i) {
                c8279c.f39803a.m1918a();
                c8279c.f39811i = false;
            }
            if (c1923y.f9087d != 0) {
                c8279c.f39811i = true;
            }
        }
        while (this.A1.m5550h() && this.A1.m5547e(0) != null) {
            int i14 = this.A1.f8957b;
            for (int i15 = 0; i15 < i14; i15++) {
                InterfaceC2137a interfaceC2137a = (InterfaceC2137a) this.A1.m5547e(i15);
                e1.e0 e0Var = this.A1;
                if (i15 < 0 || i15 >= e0Var.f8957b) {
                    e0Var.m5555m(i15);
                    throw null;
                }
                Object[] objArr2 = e0Var.f8956a;
                Object obj = objArr2[i15];
                objArr2[i15] = null;
                if (interfaceC2137a != null) {
                    interfaceC2137a.invoke();
                }
            }
            this.A1.m5553k(0, i14);
        }
    }

    /* renamed from: y */
    public final C0848c m15042y() {
        if (isFocused()) {
            b3.e0 e0VarM1722g = AbstractC0574f.m1722g(((C0585q) getFocusOwner()).f3941f);
            if (e0VarM1722g != null) {
                return AbstractC0574f.m1725j(e0VarM1722g);
            }
            return null;
        }
        View viewFindFocus = findFocus();
        if (viewFindFocus != null) {
            return AbstractC0574f.m1719d(viewFindFocus, this);
        }
        return null;
    }

    /* renamed from: z */
    public final void m15043z(v3.g0 g0Var) {
        b0 b0Var = this.f38033r;
        b0Var.f37696A = true;
        if (b0Var.m14888u()) {
            b0Var.m14889v(g0Var);
        }
        ViewOnAttachStateChangeListenerC8534d viewOnAttachStateChangeListenerC8534d = this.f38034s;
        viewOnAttachStateChangeListenerC8534d.f41468g = true;
        if (viewOnAttachStateChangeListenerC8534d.m15801d()) {
            viewOnAttachStateChangeListenerC8534d.f41469h.mo14776i(qw.a0.f30746a);
        }
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i10) {
        AbstractC4154l.m8920c(view);
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams == null) {
            layoutParams = generateDefaultLayoutParams();
        }
        addViewInLayout(view, i10, layoutParams, true);
    }

    public C7889g getAccessibilityManager() {
        return this.f38035t;
    }

    public C7890h getClipboard() {
        return this.f38011K;
    }

    public C7891i getClipboardManager() {
        return this.f38010I;
    }

    /* renamed from: getDragAndDropManager, reason: merged with bridge method [inline-methods] */
    public ViewOnDragListenerC8856a m16702getDragAndDropManager() {
        return this.f38024g;
    }

    public C1922x getLayoutNodes() {
        return this.f38029m;
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i10, int i11) {
        ViewGroup.LayoutParams layoutParamsGenerateDefaultLayoutParams = generateDefaultLayoutParams();
        layoutParamsGenerateDefaultLayoutParams.width = i10;
        layoutParamsGenerateDefaultLayoutParams.height = i11;
        addViewInLayout(view, -1, layoutParamsGenerateDefaultLayoutParams, true);
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i10, ViewGroup.LayoutParams layoutParams) {
        addViewInLayout(view, i10, layoutParams, true);
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public final void addView(View view, ViewGroup.LayoutParams layoutParams) {
        addViewInLayout(view, -1, layoutParams, true);
    }

    @InterfaceC6353c
    public static /* synthetic */ void getFontLoader$annotations() {
    }

    public static /* synthetic */ void getLastMatrixRecalculationAnimationTime$ui_release$annotations() {
    }

    public static /* synthetic */ void getShowLayoutBounds$annotations() {
    }

    @InterfaceC6353c
    public static /* synthetic */ void getTextInputService$annotations() {
    }

    public View getView() {
        return this;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
    }
}
