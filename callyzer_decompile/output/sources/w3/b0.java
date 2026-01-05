package w3;

import android.content.res.Resources;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcelable;
import android.os.SystemClock;
import android.os.Trace;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeInfo;
import c3.C0848c;
import c6.C0872b;
import com.skydoves.balloon.internals.DefinitionKt;
import com.websoptimization.callyzerbiz.R;
import d4.AbstractC1592t;
import d4.C1573a;
import d4.C1581i;
import d4.C1582j;
import d4.C1583k;
import d4.C1589q;
import d4.C1595w;
import d6.C1617g;
import e1.AbstractC1909k;
import e1.AbstractC1910l;
import e1.AbstractC1911m;
import e1.C1904f;
import e1.C1920v;
import e1.C1921w;
import e1.C1922x;
import e1.C1923y;
import ex.InterfaceC2142f;
import g4.C2492h;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import kotlin.jvm.internal.AbstractC4154l;
import l4.C4367l;
import m6.C4665a;
import og.pe;
import org.bouncycastle.pqc.crypto.newhope.NewHope;
import p012n.ViewOnAttachStateChangeListenerC4924d;
import p020v.RunnableC7606p;
import pg.o6;
import rw.AbstractC6663m;
import rw.C6668r;
import u4.AbstractC7338a;
import vx.C7806h;
import zk.C8989c;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class b0 extends C0872b {

    /* renamed from: P */
    public static final C1921w f37695P = AbstractC1909k.m5580a(R.id.accessibility_custom_action_0, R.id.accessibility_custom_action_1, R.id.accessibility_custom_action_2, R.id.accessibility_custom_action_3, R.id.accessibility_custom_action_4, R.id.accessibility_custom_action_5, R.id.accessibility_custom_action_6, R.id.accessibility_custom_action_7, R.id.accessibility_custom_action_8, R.id.accessibility_custom_action_9, R.id.accessibility_custom_action_10, R.id.accessibility_custom_action_11, R.id.accessibility_custom_action_12, R.id.accessibility_custom_action_13, R.id.accessibility_custom_action_14, R.id.accessibility_custom_action_15, R.id.accessibility_custom_action_16, R.id.accessibility_custom_action_17, R.id.accessibility_custom_action_18, R.id.accessibility_custom_action_19, R.id.accessibility_custom_action_20, R.id.accessibility_custom_action_21, R.id.accessibility_custom_action_22, R.id.accessibility_custom_action_23, R.id.accessibility_custom_action_24, R.id.accessibility_custom_action_25, R.id.accessibility_custom_action_26, R.id.accessibility_custom_action_27, R.id.accessibility_custom_action_28, R.id.accessibility_custom_action_29, R.id.accessibility_custom_action_30, R.id.accessibility_custom_action_31);

    /* renamed from: A */
    public boolean f37696A;

    /* renamed from: B */
    public C7907y f37697B;

    /* renamed from: C */
    public C1922x f37698C;

    /* renamed from: D */
    public final C1923y f37699D;

    /* renamed from: E */
    public final C1920v f37700E;

    /* renamed from: F */
    public final C1920v f37701F;

    /* renamed from: G */
    public final String f37702G;

    /* renamed from: H */
    public final String f37703H;

    /* renamed from: I */
    public final C4367l f37704I;

    /* renamed from: J */
    public final C1922x f37705J;

    /* renamed from: K */
    public n2 f37706K;

    /* renamed from: L */
    public boolean f37707L;

    /* renamed from: M */
    public final RunnableC7606p f37708M;

    /* renamed from: N */
    public final ArrayList f37709N;

    /* renamed from: O */
    public final a0 f37710O;

    /* renamed from: d */
    public final C7904v f37711d;

    /* renamed from: e */
    public int f37712e = Integer.MIN_VALUE;

    /* renamed from: f */
    public final a0 f37713f = new a0(this, 0);

    /* renamed from: g */
    public final AccessibilityManager f37714g;

    /* renamed from: h */
    public long f37715h;

    /* renamed from: i */
    public final AccessibilityManagerAccessibilityStateChangeListenerC7905w f37716i;

    /* renamed from: j */
    public final AccessibilityManagerTouchExplorationStateChangeListenerC7906x f37717j;

    /* renamed from: k */
    public List f37718k;

    /* renamed from: l */
    public final Handler f37719l;

    /* renamed from: m */
    public final C4665a f37720m;

    /* renamed from: n */
    public int f37721n;

    /* renamed from: o */
    public int f37722o;

    /* renamed from: p */
    public C1617g f37723p;

    /* renamed from: q */
    public C1617g f37724q;

    /* renamed from: r */
    public boolean f37725r;

    /* renamed from: s */
    public final C1922x f37726s;

    /* renamed from: t */
    public final C1922x f37727t;

    /* renamed from: u */
    public final e1.v0 f37728u;

    /* renamed from: v */
    public final e1.v0 f37729v;

    /* renamed from: w */
    public int f37730w;

    /* renamed from: x */
    public Integer f37731x;

    /* renamed from: y */
    public final C1904f f37732y;

    /* renamed from: z */
    public final C7806h f37733z;

    /* JADX WARN: Type inference failed for: r2v4, types: [w3.w] */
    /* JADX WARN: Type inference failed for: r2v5, types: [w3.x] */
    public b0(C7904v c7904v) {
        this.f37711d = c7904v;
        Object systemService = c7904v.getContext().getSystemService("accessibility");
        AbstractC4154l.m8921d(systemService, "null cannot be cast to non-null type android.view.accessibility.AccessibilityManager");
        AccessibilityManager accessibilityManager = (AccessibilityManager) systemService;
        this.f37714g = accessibilityManager;
        this.f37715h = 100L;
        this.f37716i = new AccessibilityManager.AccessibilityStateChangeListener() { // from class: w3.w
            @Override // android.view.accessibility.AccessibilityManager.AccessibilityStateChangeListener
            public final void onAccessibilityStateChanged(boolean z6) {
                b0 b0Var = this.f38044a;
                b0Var.f37718k = z6 ? b0Var.f37714g.getEnabledAccessibilityServiceList(-1) : C6668r.f31943a;
            }
        };
        this.f37717j = new AccessibilityManager.TouchExplorationStateChangeListener() { // from class: w3.x
            @Override // android.view.accessibility.AccessibilityManager.TouchExplorationStateChangeListener
            public final void onTouchExplorationStateChanged(boolean z6) {
                b0 b0Var = this.f38047a;
                b0Var.f37718k = b0Var.f37714g.getEnabledAccessibilityServiceList(-1);
            }
        };
        this.f37718k = accessibilityManager.getEnabledAccessibilityServiceList(-1);
        this.f37719l = new Handler(Looper.getMainLooper());
        this.f37720m = new C4665a(this, 1);
        this.f37721n = Integer.MIN_VALUE;
        this.f37722o = Integer.MIN_VALUE;
        this.f37726s = new C1922x();
        this.f37727t = new C1922x();
        this.f37728u = new e1.v0(0);
        this.f37729v = new e1.v0(0);
        this.f37730w = -1;
        this.f37732y = new C1904f(0);
        this.f37733z = o6.m11805a(1, null, null, 6);
        this.f37696A = true;
        C1922x c1922x = AbstractC1911m.f9027a;
        AbstractC4154l.m8921d(c1922x, "null cannot be cast to non-null type androidx.collection.IntObjectMap<V of androidx.collection.IntObjectMapKt.intObjectMapOf>");
        this.f37698C = c1922x;
        this.f37699D = new C1923y();
        this.f37700E = new C1920v();
        this.f37701F = new C1920v();
        this.f37702G = "android.view.accessibility.extra.EXTRA_DATA_TEST_TRAVERSALBEFORE_VAL";
        this.f37703H = "android.view.accessibility.extra.EXTRA_DATA_TEST_TRAVERSALAFTER_VAL";
        this.f37704I = new C4367l(15);
        this.f37705J = new C1922x();
        C1589q c1589qM5221a = c7904v.getSemanticsOwner().m5221a();
        AbstractC4154l.m8921d(c1922x, "null cannot be cast to non-null type androidx.collection.IntObjectMap<V of androidx.collection.IntObjectMapKt.intObjectMapOf>");
        this.f37706K = new n2(c1589qM5221a, c1922x);
        c7904v.addOnAttachStateChangeListener(new ViewOnAttachStateChangeListenerC4924d(2, this));
        this.f37708M = new RunnableC7606p(6, this);
        this.f37709N = new ArrayList();
        this.f37710O = new a0(this, 1);
    }

    /* renamed from: D */
    public static /* synthetic */ void m14862D(b0 b0Var, int i10, int i11, Integer num, int i12) {
        if ((i12 & 4) != 0) {
            num = null;
        }
        b0Var.m14870C(i10, i11, num, null);
    }

    /* renamed from: K */
    public static CharSequence m14863K(CharSequence charSequence) {
        if (charSequence.length() != 0) {
            int i10 = 100000;
            if (charSequence.length() > 100000) {
                if (Character.isHighSurrogate(charSequence.charAt(99999)) && Character.isLowSurrogate(charSequence.charAt(100000))) {
                    i10 = 99999;
                }
                CharSequence charSequenceSubSequence = charSequence.subSequence(0, i10);
                AbstractC4154l.m8921d(charSequenceSubSequence, "null cannot be cast to non-null type T of androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat.trimToSize");
                return charSequenceSubSequence;
            }
        }
        return charSequence;
    }

    /* renamed from: t */
    public static String m14864t(C1589q c1589q) {
        C2492h c2492h;
        if (c1589q != null) {
            C1583k c1583k = c1589q.f7879d;
            e1.j0 j0Var = c1583k.f7868a;
            C1595w c1595w = AbstractC1592t.f7917a;
            if (j0Var.m5570c(c1595w)) {
                return AbstractC7338a.m13729a((List) c1583k.m5200h(c1595w), ",", null, 62);
            }
            C1595w c1595w2 = AbstractC1592t.f7907D;
            if (j0Var.m5570c(c1595w2)) {
                Object objM5574g = j0Var.m5574g(c1595w2);
                if (objM5574g == null) {
                    objM5574g = null;
                }
                C2492h c2492h2 = (C2492h) objM5574g;
                if (c2492h2 != null) {
                    return c2492h2.f13620b;
                }
            } else {
                Object objM5574g2 = j0Var.m5574g(AbstractC1592t.f7942z);
                if (objM5574g2 == null) {
                    objM5574g2 = null;
                }
                List list = (List) objM5574g2;
                if (list != null && (c2492h = (C2492h) AbstractC6663m.m12743G(list)) != null) {
                    return c2492h.f13620b;
                }
            }
        }
        return null;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [ex.a, kotlin.jvm.internal.m] */
    /* JADX WARN: Type inference failed for: r3v2, types: [ex.a, kotlin.jvm.internal.m] */
    /* renamed from: w */
    public static final boolean m14865w(C1581i c1581i, float f6) {
        ?? r02 = c1581i.f7838a;
        if (f6 >= DefinitionKt.NO_Float_VALUE || ((Number) r02.invoke()).floatValue() <= DefinitionKt.NO_Float_VALUE) {
            return f6 > DefinitionKt.NO_Float_VALUE && ((Number) r02.invoke()).floatValue() < ((Number) c1581i.f7839b.invoke()).floatValue();
        }
        return true;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [ex.a, kotlin.jvm.internal.m] */
    /* JADX WARN: Type inference failed for: r3v1, types: [ex.a, kotlin.jvm.internal.m] */
    /* renamed from: x */
    public static final boolean m14866x(C1581i c1581i) {
        ?? r02 = c1581i.f7838a;
        if (((Number) r02.invoke()).floatValue() > DefinitionKt.NO_Float_VALUE) {
            return true;
        }
        ((Number) r02.invoke()).floatValue();
        ((Number) c1581i.f7839b.invoke()).floatValue();
        return false;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [ex.a, kotlin.jvm.internal.m] */
    /* JADX WARN: Type inference failed for: r2v1, types: [ex.a, kotlin.jvm.internal.m] */
    /* renamed from: y */
    public static final boolean m14867y(C1581i c1581i) {
        ?? r02 = c1581i.f7838a;
        if (((Number) r02.invoke()).floatValue() < ((Number) c1581i.f7839b.invoke()).floatValue()) {
            return true;
        }
        ((Number) r02.invoke()).floatValue();
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0086  */
    /* renamed from: A */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m14868A(d4.C1589q r20, w3.n2 r21) {
        /*
            r19 = this;
            r0 = r19
            r1 = r20
            r2 = r21
            int[] r3 = e1.AbstractC1912n.f9030a
            e1.y r3 = new e1.y
            r3.<init>()
            r4 = 4
            java.util.List r5 = d4.C1589q.m5206h(r4, r1)
            v3.g0 r6 = r1.f7878c
            int r7 = r5.size()
            r8 = 0
            r9 = r8
        L1a:
            if (r9 >= r7) goto L40
            java.lang.Object r10 = r5.get(r9)
            d4.q r10 = (d4.C1589q) r10
            e1.l r11 = r0.m14887s()
            int r10 = r10.f7882g
            boolean r11 = r11.m5594a(r10)
            if (r11 == 0) goto L3d
            e1.y r11 = r2.f37900b
            boolean r11 = r11.m5665b(r10)
            if (r11 != 0) goto L3a
            r0.m14889v(r6)
            return
        L3a:
            r3.m5664a(r10)
        L3d:
            int r9 = r9 + 1
            goto L1a
        L40:
            e1.y r2 = r2.f37900b
            int[] r5 = r2.f9085b
            long[] r2 = r2.f9084a
            int r7 = r2.length
            int r7 = r7 + (-2)
            if (r7 < 0) goto L8b
            r9 = r8
        L4c:
            r10 = r2[r9]
            long r12 = ~r10
            r14 = 7
            long r12 = r12 << r14
            long r12 = r12 & r10
            r14 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r12 = r12 & r14
            int r12 = (r12 > r14 ? 1 : (r12 == r14 ? 0 : -1))
            if (r12 == 0) goto L86
            int r12 = r9 - r7
            int r12 = ~r12
            int r12 = r12 >>> 31
            r13 = 8
            int r12 = 8 - r12
            r14 = r8
        L66:
            if (r14 >= r12) goto L84
            r15 = 255(0xff, double:1.26E-321)
            long r15 = r15 & r10
            r17 = 128(0x80, double:6.3E-322)
            int r15 = (r15 > r17 ? 1 : (r15 == r17 ? 0 : -1))
            if (r15 >= 0) goto L80
            int r15 = r9 << 3
            int r15 = r15 + r14
            r15 = r5[r15]
            boolean r15 = r3.m5665b(r15)
            if (r15 != 0) goto L80
            r0.m14889v(r6)
            return
        L80:
            long r10 = r10 >> r13
            int r14 = r14 + 1
            goto L66
        L84:
            if (r12 != r13) goto L8b
        L86:
            if (r9 == r7) goto L8b
            int r9 = r9 + 1
            goto L4c
        L8b:
            java.util.List r1 = d4.C1589q.m5206h(r4, r1)
            int r2 = r1.size()
        L93:
            if (r8 >= r2) goto Lba
            java.lang.Object r3 = r1.get(r8)
            d4.q r3 = (d4.C1589q) r3
            e1.l r4 = r0.m14887s()
            int r5 = r3.f7882g
            boolean r4 = r4.m5594a(r5)
            if (r4 == 0) goto Lb7
            e1.x r4 = r0.f37705J
            int r5 = r3.f7882g
            java.lang.Object r4 = r4.m5595b(r5)
            kotlin.jvm.internal.AbstractC4154l.m8920c(r4)
            w3.n2 r4 = (w3.n2) r4
            r0.m14868A(r3, r4)
        Lb7:
            int r8 = r8 + 1
            goto L93
        Lba:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: w3.b0.m14868A(d4.q, w3.n2):void");
    }

    /* renamed from: B */
    public final boolean m14869B(AccessibilityEvent accessibilityEvent) {
        if (!m14888u()) {
            return false;
        }
        if (accessibilityEvent.getEventType() == 2048 || accessibilityEvent.getEventType() == 32768) {
            this.f37725r = true;
        }
        try {
            return ((Boolean) this.f37713f.invoke(accessibilityEvent)).booleanValue();
        } finally {
            this.f37725r = false;
        }
    }

    /* renamed from: C */
    public final boolean m14870C(int i10, int i11, Integer num, List list) {
        if (i10 == Integer.MIN_VALUE || !m14888u()) {
            return false;
        }
        AccessibilityEvent accessibilityEventM14883o = m14883o(i10, i11);
        if (num != null) {
            accessibilityEventM14883o.setContentChangeTypes(num.intValue());
        }
        if (list != null) {
            accessibilityEventM14883o.setContentDescription(AbstractC7338a.m13729a(list, ",", null, 62));
        }
        return m14869B(accessibilityEventM14883o);
    }

    /* renamed from: E */
    public final void m14871E(int i10, int i11, String str) {
        AccessibilityEvent accessibilityEventM14883o = m14883o(m14890z(i10), 32);
        accessibilityEventM14883o.setContentChangeTypes(i11);
        if (str != null) {
            accessibilityEventM14883o.getText().add(str);
        }
        m14869B(accessibilityEventM14883o);
    }

    /* renamed from: F */
    public final void m14872F(int i10) {
        C7907y c7907y = this.f37697B;
        if (c7907y != null) {
            C1589q c1589q = c7907y.f38054a;
            if (i10 != c1589q.f7882g) {
                return;
            }
            if (SystemClock.uptimeMillis() - c7907y.f38059f <= 1000) {
                AccessibilityEvent accessibilityEventM14883o = m14883o(m14890z(c1589q.f7882g), 131072);
                accessibilityEventM14883o.setFromIndex(c7907y.f38057d);
                accessibilityEventM14883o.setToIndex(c7907y.f38058e);
                accessibilityEventM14883o.setAction(c7907y.f38055b);
                accessibilityEventM14883o.setMovementGranularity(c7907y.f38056c);
                accessibilityEventM14883o.getText().add(m14864t(c1589q));
                m14869B(accessibilityEventM14883o);
            }
        }
        this.f37697B = null;
    }

    /* JADX WARN: Removed duplicated region for block: B:228:0x0500  */
    /* JADX WARN: Removed duplicated region for block: B:254:0x0540  */
    /* JADX WARN: Removed duplicated region for block: B:282:0x0605  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0139  */
    /* renamed from: G */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m14873G(e1.AbstractC1910l r57) {
        /*
            Method dump skipped, instructions count: 1633
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: w3.b0.m14873G(e1.l):void");
    }

    /* renamed from: H */
    public final void m14874H(v3.g0 g0Var, C1923y c1923y) {
        C1583k c1583kM14611x;
        if (g0Var.m14578H() && !this.f37711d.getAndroidViewsHandler$ui_release().getLayoutNodeToHolder().containsKey(g0Var)) {
            v3.g0 g0Var2 = null;
            if (!g0Var.f36832K.m9386d(8)) {
                g0Var = g0Var.m14609v();
                while (true) {
                    if (g0Var == null) {
                        g0Var = null;
                        break;
                    } else if (g0Var.f36832K.m9386d(8)) {
                        break;
                    } else {
                        g0Var = g0Var.m14609v();
                    }
                }
            }
            if (g0Var == null || (c1583kM14611x = g0Var.m14611x()) == null) {
                return;
            }
            if (!c1583kM14611x.f7870c) {
                v3.g0 g0VarM14609v = g0Var.m14609v();
                while (true) {
                    if (g0VarM14609v != null) {
                        C1583k c1583kM14611x2 = g0VarM14609v.m14611x();
                        if (c1583kM14611x2 != null && c1583kM14611x2.f7870c) {
                            g0Var2 = g0VarM14609v;
                            break;
                        }
                        g0VarM14609v = g0VarM14609v.m14609v();
                    } else {
                        break;
                    }
                }
                if (g0Var2 != null) {
                    g0Var = g0Var2;
                }
            }
            int i10 = g0Var.f36843b;
            if (c1923y.m5664a(i10)) {
                m14862D(this, m14890z(i10), NewHope.SENDB_BYTES, 1, 8);
            }
        }
    }

    /* JADX WARN: Type inference failed for: r0v13, types: [ex.a, kotlin.jvm.internal.m] */
    /* JADX WARN: Type inference failed for: r0v18, types: [ex.a, kotlin.jvm.internal.m] */
    /* JADX WARN: Type inference failed for: r0v8, types: [ex.a, kotlin.jvm.internal.m] */
    /* JADX WARN: Type inference failed for: r2v1, types: [ex.a, kotlin.jvm.internal.m] */
    /* renamed from: I */
    public final void m14875I(v3.g0 g0Var) {
        if (g0Var.m14578H() && !this.f37711d.getAndroidViewsHandler$ui_release().getLayoutNodeToHolder().containsKey(g0Var)) {
            int i10 = g0Var.f36843b;
            C1581i c1581i = (C1581i) this.f37726s.m5595b(i10);
            C1581i c1581i2 = (C1581i) this.f37727t.m5595b(i10);
            if (c1581i == null && c1581i2 == null) {
                return;
            }
            AccessibilityEvent accessibilityEventM14883o = m14883o(i10, 4096);
            if (c1581i != null) {
                accessibilityEventM14883o.setScrollX((int) ((Number) c1581i.f7838a.invoke()).floatValue());
                accessibilityEventM14883o.setMaxScrollX((int) ((Number) c1581i.f7839b.invoke()).floatValue());
            }
            if (c1581i2 != null) {
                accessibilityEventM14883o.setScrollY((int) ((Number) c1581i2.f7838a.invoke()).floatValue());
                accessibilityEventM14883o.setMaxScrollY((int) ((Number) c1581i2.f7839b.invoke()).floatValue());
            }
            m14869B(accessibilityEventM14883o);
        }
    }

    /* renamed from: J */
    public final boolean m14876J(C1589q c1589q, int i10, int i11, boolean z6) {
        String strM14864t;
        C1583k c1583k = c1589q.f7879d;
        int i12 = c1589q.f7882g;
        C1595w c1595w = C1582j.f7850i;
        if (c1583k.f7868a.m5570c(c1595w) && e0.m14905a(c1589q)) {
            InterfaceC2142f interfaceC2142f = (InterfaceC2142f) ((C1573a) c1589q.f7879d.m5200h(c1595w)).f7826b;
            if (interfaceC2142f != null) {
                return ((Boolean) interfaceC2142f.invoke(Integer.valueOf(i10), Integer.valueOf(i11), Boolean.valueOf(z6))).booleanValue();
            }
        } else if ((i10 != i11 || i11 != this.f37730w) && (strM14864t = m14864t(c1589q)) != null) {
            if (i10 < 0 || i10 != i11 || i11 > strM14864t.length()) {
                i10 = -1;
            }
            this.f37730w = i10;
            boolean z10 = strM14864t.length() > 0;
            m14869B(m14884p(m14890z(i12), z10 ? Integer.valueOf(this.f37730w) : null, z10 ? Integer.valueOf(this.f37730w) : null, z10 ? Integer.valueOf(strM14864t.length()) : null, strM14864t));
            m14872F(i12);
            return true;
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:52:0x013f, code lost:
    
        r28 = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0149, code lost:
    
        if (((r7 & ((~r7) << 6)) & r20) == 0) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x014b, code lost:
    
        r25 = -1;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0064  */
    /* renamed from: L */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m14877L() {
        /*
            Method dump skipped, instructions count: 530
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: w3.b0.m14877L():void");
    }

    @Override // c6.C0872b
    /* renamed from: b */
    public final C8989c mo2336b(View view) {
        return this.f37720m;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: j */
    public final void m14878j(int i10, C1617g c1617g, String str, Bundle bundle) {
        C1589q c1589q;
        g4.l0 l0VarM14986m;
        int i11;
        RectF rectF;
        AccessibilityNodeInfo accessibilityNodeInfo = c1617g.f8062a;
        o2 o2Var = (o2) m14887s().m5595b(i10);
        if (o2Var == null || (c1589q = o2Var.f37907a) == null) {
            return;
        }
        C1583k c1583k = c1589q.f7879d;
        e1.j0 j0Var = c1583k.f7868a;
        String strM14864t = m14864t(c1589q);
        if (AbstractC4154l.m8918a(str, this.f37702G)) {
            int iM5641d = this.f37700E.m5641d(i10);
            if (iM5641d != -1) {
                accessibilityNodeInfo.getExtras().putInt(str, iM5641d);
                return;
            }
            return;
        }
        if (AbstractC4154l.m8918a(str, this.f37703H)) {
            int iM5641d2 = this.f37701F.m5641d(i10);
            if (iM5641d2 != -1) {
                accessibilityNodeInfo.getExtras().putInt(str, iM5641d2);
                return;
            }
            return;
        }
        v3.h1 h1Var = null;
        if (!j0Var.m5570c(C1582j.f7842a) || bundle == null || !AbstractC4154l.m8918a(str, "android.view.accessibility.extra.DATA_TEXT_CHARACTER_LOCATION_KEY")) {
            C1595w c1595w = AbstractC1592t.f7940x;
            if (!j0Var.m5570c(c1595w) || bundle == null || !AbstractC4154l.m8918a(str, "androidx.compose.ui.semantics.testTag")) {
                if (AbstractC4154l.m8918a(str, "androidx.compose.ui.semantics.id")) {
                    accessibilityNodeInfo.getExtras().putInt(str, c1589q.f7882g);
                    return;
                }
                return;
            } else {
                Object objM5574g = j0Var.m5574g(c1595w);
                String str2 = (String) (objM5574g == null ? null : objM5574g);
                if (str2 != null) {
                    accessibilityNodeInfo.getExtras().putCharSequence(str, str2);
                    return;
                }
                return;
            }
        }
        int i12 = bundle.getInt("android.view.accessibility.extra.DATA_TEXT_CHARACTER_LOCATION_ARG_START_INDEX", -1);
        int i13 = bundle.getInt("android.view.accessibility.extra.DATA_TEXT_CHARACTER_LOCATION_ARG_LENGTH", -1);
        if (i13 <= 0 || i12 < 0) {
            return;
        }
        if (i12 < (strM14864t != null ? strM14864t.length() : Integer.MAX_VALUE) && (l0VarM14986m = m0.m14986m(c1583k)) != null) {
            ArrayList arrayList = new ArrayList();
            int i14 = 0;
            while (i14 < i13) {
                int i15 = i12 + i14;
                if (i15 >= l0VarM14986m.f13670a.f13660a.f13620b.length()) {
                    arrayList.add(h1Var);
                    i11 = i14;
                } else {
                    C0848c c0848cM6444b = l0VarM14986m.m6444b(i15);
                    v3.h1 h1VarM5209c = c1589q.m5209c();
                    long jMo13299V = 0;
                    if (h1VarM5209c != null) {
                        if (!h1VarM5209c.T0().f37683p) {
                            h1VarM5209c = h1Var;
                        }
                        if (h1VarM5209c != null) {
                            jMo13299V = h1VarM5209c.mo13299V(0L);
                        }
                    }
                    C0848c c0848cM2287i = c0848cM6444b.m2287i(jMo13299V);
                    C0848c c0848cM5211e = c1589q.m5211e();
                    if ((c0848cM2287i.m2285g(c0848cM5211e) ? c0848cM2287i.m2283e(c0848cM5211e) : h1Var) != 0) {
                        C7904v c7904v = this.f37711d;
                        long jM15037s = c7904v.m15037s((Float.floatToRawIntBits(r11.f5355b) & 4294967295L) | (Float.floatToRawIntBits(r11.f5354a) << 32));
                        i11 = i14;
                        long jM15037s2 = c7904v.m15037s((Float.floatToRawIntBits(r11.f5357d) & 4294967295L) | (Float.floatToRawIntBits(r11.f5356c) << 32));
                        rectF = new RectF(Float.intBitsToFloat((int) (jM15037s >> 32)), Float.intBitsToFloat((int) (jM15037s & 4294967295L)), Float.intBitsToFloat((int) (jM15037s2 >> 32)), Float.intBitsToFloat((int) (jM15037s2 & 4294967295L)));
                    } else {
                        i11 = i14;
                        rectF = null;
                    }
                    arrayList.add(rectF);
                }
                i14 = i11 + 1;
                h1Var = null;
            }
            accessibilityNodeInfo.getExtras().putParcelableArray(str, (Parcelable[]) arrayList.toArray(new RectF[0]));
        }
    }

    /* renamed from: k */
    public final Rect m14879k(o2 o2Var) {
        Rect rect = o2Var.f37908b;
        float f6 = rect.left;
        float f10 = rect.top;
        long jFloatToRawIntBits = (Float.floatToRawIntBits(f10) & 4294967295L) | (Float.floatToRawIntBits(f6) << 32);
        C7904v c7904v = this.f37711d;
        long jM15037s = c7904v.m15037s(jFloatToRawIntBits);
        float f11 = rect.right;
        float f12 = rect.bottom;
        long jM15037s2 = c7904v.m15037s((Float.floatToRawIntBits(f11) << 32) | (Float.floatToRawIntBits(f12) & 4294967295L));
        return new Rect((int) Math.floor(Float.intBitsToFloat((int) (jM15037s >> 32))), (int) Math.floor(Float.intBitsToFloat((int) (jM15037s & 4294967295L))), (int) Math.ceil(Float.intBitsToFloat((int) (jM15037s2 >> 32))), (int) Math.ceil(Float.intBitsToFloat((int) (jM15037s2 & 4294967295L))));
    }

    /* JADX WARN: Code restructure failed: missing block: B:46:0x00fa, code lost:
    
        if (tx.c0.m13489l(r5, r2) == r3) goto L47;
     */
    /* JADX WARN: Removed duplicated region for block: B:27:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x007d A[Catch: all -> 0x0037, TRY_LEAVE, TryCatch #0 {all -> 0x0037, blocks: (B:13:0x0030, B:25:0x005f, B:29:0x0075, B:31:0x007d, B:34:0x0088, B:36:0x008e, B:37:0x009d, B:39:0x00a5, B:40:0x00c1, B:42:0x00d0, B:45:0x00de, B:20:0x0048), top: B:56:0x0024 }] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:46:0x00fa -> B:48:0x00fd). Please report as a decompilation issue!!! */
    /* renamed from: l */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m14880l(ww.AbstractC8193c r18) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 277
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: w3.b0.m14880l(ww.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x00b6  */
    /* JADX WARN: Type inference failed for: r15v7, types: [ex.a, kotlin.jvm.internal.m] */
    /* JADX WARN: Type inference failed for: r4v10, types: [ex.a, kotlin.jvm.internal.m] */
    /* renamed from: m */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean m14881m(int r20, long r21, boolean r23) {
        /*
            Method dump skipped, instructions count: 239
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: w3.b0.m14881m(int, long, boolean):boolean");
    }

    /* renamed from: n */
    public final void m14882n() {
        Trace.beginSection("sendAccessibilitySemanticsStructureChangeEvents");
        try {
            if (m14888u()) {
                m14868A(this.f37711d.getSemanticsOwner().m5221a(), this.f37706K);
            }
            Trace.endSection();
            Trace.beginSection("sendSemanticsPropertyChangeEvents");
            try {
                m14873G(m14887s());
                Trace.endSection();
                Trace.beginSection("updateSemanticsNodesCopyAndPanes");
                try {
                    m14877L();
                } finally {
                }
            } finally {
            }
        } finally {
        }
    }

    /* renamed from: o */
    public final AccessibilityEvent m14883o(int i10, int i11) {
        o2 o2Var;
        AccessibilityEvent accessibilityEventObtain = AccessibilityEvent.obtain(i11);
        accessibilityEventObtain.setEnabled(true);
        accessibilityEventObtain.setClassName("android.view.View");
        C7904v c7904v = this.f37711d;
        accessibilityEventObtain.setPackageName(c7904v.getContext().getPackageName());
        accessibilityEventObtain.setSource(c7904v, i10);
        if (m14888u() && (o2Var = (o2) m14887s().m5595b(i10)) != null) {
            accessibilityEventObtain.setPassword(o2Var.f37907a.f7879d.f7868a.m5570c(AbstractC1592t.f7912I));
        }
        return accessibilityEventObtain;
    }

    /* renamed from: p */
    public final AccessibilityEvent m14884p(int i10, Integer num, Integer num2, Integer num3, CharSequence charSequence) {
        AccessibilityEvent accessibilityEventM14883o = m14883o(i10, 8192);
        if (num != null) {
            accessibilityEventM14883o.setFromIndex(num.intValue());
        }
        if (num2 != null) {
            accessibilityEventM14883o.setToIndex(num2.intValue());
        }
        if (num3 != null) {
            accessibilityEventM14883o.setItemCount(num3.intValue());
        }
        if (charSequence != null) {
            accessibilityEventM14883o.getText().add(charSequence);
        }
        return accessibilityEventM14883o;
    }

    /* renamed from: q */
    public final int m14885q(C1589q c1589q) {
        C1583k c1583k = c1589q.f7879d;
        C1583k c1583k2 = c1589q.f7879d;
        C1595w c1595w = AbstractC1592t.f7917a;
        if (!c1583k.f7868a.m5570c(AbstractC1592t.f7917a)) {
            C1595w c1595w2 = AbstractC1592t.f7908E;
            if (c1583k2.f7868a.m5570c(c1595w2)) {
                return (int) (((g4.n0) c1583k2.m5200h(c1595w2)).f13686a & 4294967295L);
            }
        }
        return this.f37730w;
    }

    /* renamed from: r */
    public final int m14886r(C1589q c1589q) {
        C1583k c1583k = c1589q.f7879d;
        C1583k c1583k2 = c1589q.f7879d;
        C1595w c1595w = AbstractC1592t.f7917a;
        if (!c1583k.f7868a.m5570c(AbstractC1592t.f7917a)) {
            C1595w c1595w2 = AbstractC1592t.f7908E;
            if (c1583k2.f7868a.m5570c(c1595w2)) {
                return (int) (((g4.n0) c1583k2.m5200h(c1595w2)).f13686a >> 32);
            }
        }
        return this.f37730w;
    }

    /* renamed from: s */
    public final AbstractC1910l m14887s() {
        if (this.f37696A) {
            this.f37696A = false;
            C7904v c7904v = this.f37711d;
            this.f37698C = m0.m14984k(c7904v.getSemanticsOwner());
            if (m14888u()) {
                C1922x c1922x = this.f37698C;
                Resources resources = c7904v.getContext().getResources();
                Comparator[] comparatorArr = e0.f37774a;
                C1920v c1920v = this.f37700E;
                c1920v.m5638a();
                C1920v c1920v2 = this.f37701F;
                c1920v2.m5638a();
                o2 o2Var = (o2) c1922x.m5595b(-1);
                C1589q c1589q = o2Var != null ? o2Var.f37907a : null;
                AbstractC4154l.m8920c(c1589q);
                ArrayList arrayListM14912h = e0.m14912h(e0.m14910f(c1589q), pe.m10833h(c1589q), c1922x, resources);
                int iM10832g = pe.m10832g(arrayListM14912h);
                int i10 = 1;
                if (1 <= iM10832g) {
                    while (true) {
                        int i11 = ((C1589q) arrayListM14912h.get(i10 - 1)).f7882g;
                        int i12 = ((C1589q) arrayListM14912h.get(i10)).f7882g;
                        c1920v.m5643f(i11, i12);
                        c1920v2.m5643f(i12, i11);
                        if (i10 == iM10832g) {
                            break;
                        }
                        i10++;
                    }
                }
            }
        }
        return this.f37698C;
    }

    /* renamed from: u */
    public final boolean m14888u() {
        return this.f37714g.isEnabled() && !this.f37718k.isEmpty();
    }

    /* renamed from: v */
    public final void m14889v(v3.g0 g0Var) {
        if (this.f37732y.add(g0Var)) {
            this.f37733z.mo14776i(qw.a0.f30746a);
        }
    }

    /* renamed from: z */
    public final int m14890z(int i10) {
        if (i10 == this.f37711d.getSemanticsOwner().m5221a().f7882g) {
            return -1;
        }
        return i10;
    }
}
