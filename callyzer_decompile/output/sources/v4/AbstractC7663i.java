package v4;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.Region;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.compose.ui.draw.AbstractC0258a;
import androidx.compose.ui.graphics.AbstractC0260a;
import androidx.compose.ui.input.nestedscroll.AbstractC0262a;
import androidx.compose.ui.layout.AbstractC0264a;
import b2.C0566x;
import b2.k0;
import ba.C0636f;
import c6.C0892v;
import c6.InterfaceC0891u;
import c6.InterfaceC0893w;
import c6.n0;
import c6.v0;
import c6.v1;
import c6.y1;
import com.skydoves.balloon.internals.DefinitionKt;
import com.websoptimization.callyzerbiz.R;
import d4.AbstractC1586n;
import d7.InterfaceC1649u;
import d7.q0;
import ex.InterfaceC2137a;
import ex.InterfaceC2139c;
import g8.InterfaceC2547g;
import java.util.LinkedHashMap;
import k2.C3964m;
import k2.InterfaceC3960i;
import o3.C5281d;
import o3.C5284g;
import og.bf;
import og.gg;
import og.ue;
import og.xe;
import p3.C5825w;
import p3.C5826x;
import pg.w9;
import r1.C6431p;
import s1.C6725t;
import s3.AbstractC6744a;
import s4.InterfaceC6747c;
import t3.c1;
import tx.c0;
import u5.C7340b;
import uw.InterfaceC7559c;
import v3.AbstractC7634f;
import v3.C7649u;
import v3.g0;
import v3.p1;
import v3.q1;
import v3.r1;
import w2.C7876o;
import w2.InterfaceC7879r;
import w3.C7904v;
import w3.d3;
import w3.m0;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: v4.i */
/* loaded from: classes.dex */
public abstract class AbstractC7663i extends ViewGroup implements InterfaceC0891u, InterfaceC3960i, q1, InterfaceC0893w {

    /* renamed from: B */
    public boolean f37105B;

    /* renamed from: C */
    public final g0 f37106C;

    /* renamed from: a */
    public final C5281d f37107a;

    /* renamed from: b */
    public final View f37108b;

    /* renamed from: c */
    public final p1 f37109c;

    /* renamed from: d */
    public InterfaceC2137a f37110d;

    /* renamed from: e */
    public boolean f37111e;

    /* renamed from: f */
    public InterfaceC2137a f37112f;

    /* renamed from: g */
    public InterfaceC2137a f37113g;

    /* renamed from: h */
    public InterfaceC7879r f37114h;

    /* renamed from: j */
    public InterfaceC2139c f37115j;

    /* renamed from: k */
    public InterfaceC6747c f37116k;

    /* renamed from: l */
    public InterfaceC2139c f37117l;

    /* renamed from: m */
    public InterfaceC1649u f37118m;

    /* renamed from: n */
    public InterfaceC2547g f37119n;

    /* renamed from: p */
    public final int[] f37120p;

    /* renamed from: q */
    public long f37121q;

    /* renamed from: r */
    public y1 f37122r;

    /* renamed from: s */
    public final C7662h f37123s;

    /* renamed from: t */
    public final C7662h f37124t;

    /* renamed from: v */
    public InterfaceC2139c f37125v;

    /* renamed from: w */
    public final int[] f37126w;

    /* renamed from: x */
    public int f37127x;

    /* renamed from: y */
    public int f37128y;

    /* renamed from: z */
    public final C0892v f37129z;

    public AbstractC7663i(Context context, C3964m c3964m, int i10, C5281d c5281d, View view, p1 p1Var) {
        super(context);
        this.f37107a = c5281d;
        this.f37108b = view;
        this.f37109c = p1Var;
        LinkedHashMap linkedHashMap = d3.f37772a;
        setTag(R.id.androidx_compose_ui_view_composition_context, c3964m);
        int i11 = 0;
        setSaveFromParentEnabled(false);
        addView(view);
        C7672r c7672r = (C7672r) this;
        v0.m2530l(this, new C7656b(c7672r, i11));
        n0.m2460l(this, this);
        this.f37110d = C7661g.f37101d;
        this.f37112f = C7661g.f37100c;
        this.f37113g = C7661g.f37099b;
        C7876o c7876o = C7876o.f37669a;
        this.f37114h = c7876o;
        this.f37116k = ue.m10985a();
        int i12 = 2;
        this.f37120p = new int[2];
        this.f37121q = 0L;
        this.f37123s = new C7662h(c7672r, 1);
        this.f37124t = new C7662h(c7672r, i11);
        this.f37126w = new int[2];
        this.f37127x = Integer.MIN_VALUE;
        this.f37128y = Integer.MIN_VALUE;
        this.f37129z = new C0892v();
        g0 g0Var = new g0(3);
        g0Var.f36848g = true;
        g0Var.f36856q = c7672r;
        InterfaceC7879r interfaceC7879rM5204b = AbstractC1586n.m5204b(AbstractC0262a.m718a(c7876o, AbstractC7665k.f37130a, c5281d), true, C7657c.f37087d);
        C5825w c5825w = new C5825w();
        c5825w.f28507a = new C5826x(c7672r, 0);
        C0636f c0636f = new C0636f();
        C0636f c0636f2 = c5825w.f28508b;
        if (c0636f2 != null) {
            c0636f2.f4108b = null;
        }
        c5825w.f28508b = c0636f;
        c0636f.f4108b = c5825w;
        setOnRequestDisallowInterceptTouchEvent$ui_release(c0636f);
        InterfaceC7879r interfaceC7879rM723d = AbstractC0264a.m723d(AbstractC0258a.m707a(AbstractC0260a.m715b(interfaceC7879rM5204b.mo14852e(c5825w), DefinitionKt.NO_Float_VALUE, DefinitionKt.NO_Float_VALUE, DefinitionKt.NO_Float_VALUE, DefinitionKt.NO_Float_VALUE, DefinitionKt.NO_Float_VALUE, null, false, 131071), new C0566x(19, c7672r, g0Var, c7672r)), new C7658d(c7672r, g0Var, i12));
        g0Var.c0(this.f37114h.mo14852e(interfaceC7879rM723d));
        this.f37115j = new C6431p(14, g0Var, interfaceC7879rM723d);
        g0Var.m14592Z(this.f37116k);
        this.f37117l = new C6725t(8, g0Var);
        g0Var.f36839X = new C7658d(c7672r, g0Var, i11);
        g0Var.f36840Y = new C5826x(c7672r, 1);
        g0Var.b0(new C7659e(c7672r, g0Var));
        this.f37106C = g0Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final r1 getSnapshotObserver() {
        if (!isAttachedToWindow()) {
            AbstractC6744a.m12907b("Expected AndroidViewHolder to be attached when observing reads.");
        }
        return ((C7904v) this.f37109c).getSnapshotObserver();
    }

    /* renamed from: l */
    public static final int m14678l(C7672r c7672r, int i10, int i11, int i12) {
        return (i12 >= 0 || i10 == i11) ? View.MeasureSpec.makeMeasureSpec(w9.m11912c(i12, i10, i11), 1073741824) : (i12 != -2 || i11 == Integer.MAX_VALUE) ? (i12 != -1 || i11 == Integer.MAX_VALUE) ? View.MeasureSpec.makeMeasureSpec(0, 0) : View.MeasureSpec.makeMeasureSpec(i11, 1073741824) : View.MeasureSpec.makeMeasureSpec(i11, Integer.MIN_VALUE);
    }

    /* renamed from: m */
    public static C7340b m14679m(C7340b c7340b, int i10, int i11, int i12, int i13) {
        int i14 = c7340b.f34957a - i10;
        if (i14 < 0) {
            i14 = 0;
        }
        int i15 = c7340b.f34958b - i11;
        if (i15 < 0) {
            i15 = 0;
        }
        int i16 = c7340b.f34959c - i12;
        if (i16 < 0) {
            i16 = 0;
        }
        int i17 = c7340b.f34960d - i13;
        return C7340b.m13736b(i14, i15, i16, i17 >= 0 ? i17 : 0);
    }

    @Override // k2.InterfaceC3960i
    /* renamed from: a */
    public final void mo8538a() {
        this.f37113g.invoke();
    }

    @Override // k2.InterfaceC3960i
    /* renamed from: b */
    public final void mo8539b() {
        this.f37112f.invoke();
        removeAllViewsInLayout();
    }

    @Override // c6.InterfaceC0890t
    /* renamed from: c */
    public final void mo561c(int i10, View view) {
        C0892v c0892v = this.f37129z;
        if (i10 == 1) {
            c0892v.f5526b = 0;
        } else {
            c0892v.f5525a = 0;
        }
    }

    @Override // c6.InterfaceC0891u
    /* renamed from: d */
    public final void mo562d(View view, int i10, int i11, int i12, int i13, int i14, int[] iArr) {
        if (this.f37108b.isNestedScrollingEnabled()) {
            float f6 = i10;
            float f10 = -1;
            long jFloatToRawIntBits = (Float.floatToRawIntBits(f6 * f10) << 32) | (Float.floatToRawIntBits(i11 * f10) & 4294967295L);
            long jFloatToRawIntBits2 = (Float.floatToRawIntBits(i12 * f10) << 32) | (Float.floatToRawIntBits(i13 * f10) & 4294967295L);
            int i15 = i14 == 0 ? 1 : 2;
            C5284g c5284g = this.f37107a.f25935a;
            C5284g c5284g2 = null;
            if (c5284g != null && c5284g.f37683p) {
                c5284g2 = (C5284g) AbstractC7634f.m14549j(c5284g);
            }
            C5284g c5284g3 = c5284g2;
            long jD0 = c5284g3 != null ? c5284g3.d0(i15, jFloatToRawIntBits, jFloatToRawIntBits2) : 0L;
            iArr[0] = m0.m14982i(Float.intBitsToFloat((int) (jD0 >> 32)));
            iArr[1] = m0.m14982i(Float.intBitsToFloat((int) (jD0 & 4294967295L)));
        }
    }

    @Override // c6.InterfaceC0893w
    /* renamed from: e */
    public final y1 mo2531e(View view, y1 y1Var) {
        this.f37122r = new y1(y1Var);
        return m14680o(y1Var);
    }

    @Override // c6.InterfaceC0890t
    /* renamed from: f */
    public final void mo564f(View view, int i10, int i11, int i12, int i13, int i14) {
        if (this.f37108b.isNestedScrollingEnabled()) {
            float f6 = -1;
            long jFloatToRawIntBits = (Float.floatToRawIntBits(i10 * f6) << 32) | (Float.floatToRawIntBits(i11 * f6) & 4294967295L);
            long jFloatToRawIntBits2 = (Float.floatToRawIntBits(i12 * f6) << 32) | (Float.floatToRawIntBits(i13 * f6) & 4294967295L);
            int i15 = i14 == 0 ? 1 : 2;
            C5284g c5284g = this.f37107a.f25935a;
            C5284g c5284g2 = null;
            if (c5284g != null && c5284g.f37683p) {
                c5284g2 = (C5284g) AbstractC7634f.m14549j(c5284g);
            }
            if (c5284g2 != null) {
                c5284g2.d0(i15, jFloatToRawIntBits, jFloatToRawIntBits2);
            }
        }
    }

    @Override // c6.InterfaceC0890t
    /* renamed from: g */
    public final boolean mo565g(View view, View view2, int i10, int i11) {
        return ((i10 & 2) == 0 && (i10 & 1) == 0) ? false : true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean gatherTransparentRegion(Region region) {
        if (region == null) {
            return true;
        }
        int[] iArr = this.f37126w;
        getLocationInWindow(iArr);
        int i10 = iArr[0];
        region.op(i10, iArr[1], getWidth() + i10, getHeight() + iArr[1], Region.Op.DIFFERENCE);
        return true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public CharSequence getAccessibilityClassName() {
        return getClass().getName();
    }

    public final InterfaceC6747c getDensity() {
        return this.f37116k;
    }

    public final View getInteropView() {
        return this.f37108b;
    }

    public final g0 getLayoutNode() {
        return this.f37106C;
    }

    @Override // android.view.View
    public ViewGroup.LayoutParams getLayoutParams() {
        ViewGroup.LayoutParams layoutParams = this.f37108b.getLayoutParams();
        return layoutParams == null ? new ViewGroup.LayoutParams(-1, -1) : layoutParams;
    }

    public final InterfaceC1649u getLifecycleOwner() {
        return this.f37118m;
    }

    public final InterfaceC7879r getModifier() {
        return this.f37114h;
    }

    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
        C0892v c0892v = this.f37129z;
        return c0892v.f5526b | c0892v.f5525a;
    }

    public final InterfaceC2139c getOnDensityChanged$ui_release() {
        return this.f37117l;
    }

    public final InterfaceC2139c getOnModifierChanged$ui_release() {
        return this.f37115j;
    }

    public final InterfaceC2139c getOnRequestDisallowInterceptTouchEvent$ui_release() {
        return this.f37125v;
    }

    public final InterfaceC2137a getRelease() {
        return this.f37113g;
    }

    public final InterfaceC2137a getReset() {
        return this.f37112f;
    }

    public final InterfaceC2547g getSavedStateRegistryOwner() {
        return this.f37119n;
    }

    public final InterfaceC2137a getUpdate() {
        return this.f37110d;
    }

    public final View getView() {
        return this.f37108b;
    }

    @Override // c6.InterfaceC0890t
    /* renamed from: h */
    public final void mo566h(View view, View view2, int i10, int i11) {
        C0892v c0892v = this.f37129z;
        if (i11 == 1) {
            c0892v.f5526b = i10;
        } else {
            c0892v.f5525a = i10;
        }
    }

    @Override // c6.InterfaceC0890t
    /* renamed from: i */
    public final void mo567i(View view, int i10, int i11, int[] iArr, int i12) {
        if (this.f37108b.isNestedScrollingEnabled()) {
            float f6 = i10;
            float f10 = -1;
            long jFloatToRawIntBits = (Float.floatToRawIntBits(f6 * f10) << 32) | (Float.floatToRawIntBits(i11 * f10) & 4294967295L);
            int i13 = i12 == 0 ? 1 : 2;
            C5284g c5284g = this.f37107a.f25935a;
            C5284g c5284g2 = null;
            if (c5284g != null && c5284g.f37683p) {
                c5284g2 = (C5284g) AbstractC7634f.m14549j(c5284g);
            }
            long jMo6161B = c5284g2 != null ? c5284g2.mo6161B(i13, jFloatToRawIntBits) : 0L;
            iArr[0] = m0.m14982i(Float.intBitsToFloat((int) (jMo6161B >> 32)));
            iArr[1] = m0.m14982i(Float.intBitsToFloat((int) (jMo6161B & 4294967295L)));
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final ViewParent invalidateChildInParent(int[] iArr, Rect rect) {
        super.invalidateChildInParent(iArr, rect);
        if (!this.f37105B) {
            this.f37106C.m14573C();
            return null;
        }
        this.f37108b.postOnAnimation(new RunnableC7655a(0, this.f37124t));
        return null;
    }

    @Override // android.view.View
    public final boolean isNestedScrollingEnabled() {
        return this.f37108b.isNestedScrollingEnabled();
    }

    @Override // k2.InterfaceC3960i
    /* renamed from: j */
    public final void mo8540j() {
        View view = this.f37108b;
        if (view.getParent() != this) {
            addView(view);
        } else {
            this.f37112f.invoke();
        }
    }

    @Override // v3.q1
    /* renamed from: n */
    public final boolean mo14534n() {
        return isAttachedToWindow();
    }

    /* renamed from: o */
    public final y1 m14680o(y1 y1Var) {
        v1 v1Var = y1Var.f5541a;
        C7340b c7340bMo2475g = v1Var.mo2475g(-1);
        C7340b c7340b = C7340b.f34956e;
        if (!c7340bMo2475g.equals(c7340b) || !v1Var.mo2476h(-9).equals(c7340b) || v1Var.mo2501f() != null) {
            C7649u c7649u = (C7649u) this.f37106C.f36832K.f22539c;
            if (c7649u.f37016V.f37683p) {
                long jM11048e = xe.m11048e(c7649u.mo13299V(0L));
                int i10 = (int) (jM11048e >> 32);
                if (i10 < 0) {
                    i10 = 0;
                }
                int i11 = (int) (jM11048e & 4294967295L);
                if (i11 < 0) {
                    i11 = 0;
                }
                long jMo13307v = c1.m13279h(c7649u).mo13307v();
                int i12 = (int) (jMo13307v >> 32);
                int i13 = (int) (jMo13307v & 4294967295L);
                long j6 = c7649u.f34032c;
                long jM11048e2 = xe.m11048e(c7649u.mo13299V((Float.floatToRawIntBits((int) (j6 >> 32)) << 32) | (Float.floatToRawIntBits((int) (j6 & 4294967295L)) & 4294967295L)));
                int i14 = i12 - ((int) (jM11048e2 >> 32));
                if (i14 < 0) {
                    i14 = 0;
                }
                int i15 = i13 - ((int) (4294967295L & jM11048e2));
                int i16 = i15 >= 0 ? i15 : 0;
                if (i10 != 0 || i11 != 0 || i14 != 0 || i16 != 0) {
                    return y1Var.f5541a.mo2478n(i10, i11, i14, i16);
                }
            }
        }
        return y1Var;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f37123s.invoke();
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onDescendantInvalidated(View view, View view2) {
        super.onDescendantInvalidated(view, view2);
        if (!this.f37105B) {
            this.f37106C.m14573C();
        } else {
            this.f37108b.postOnAnimation(new RunnableC7655a(0, this.f37124t));
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        getSnapshotObserver().f36980a.m13720c(this);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z6, int i10, int i11, int i12, int i13) {
        this.f37108b.layout(0, 0, i12 - i10, i13 - i11);
    }

    @Override // android.view.View
    public final void onMeasure(int i10, int i11) {
        View view = this.f37108b;
        if (view.getParent() != this) {
            setMeasuredDimension(View.MeasureSpec.getSize(i10), View.MeasureSpec.getSize(i11));
            return;
        }
        if (view.getVisibility() == 8) {
            setMeasuredDimension(0, 0);
            return;
        }
        view.measure(i10, i11);
        setMeasuredDimension(view.getMeasuredWidth(), view.getMeasuredHeight());
        this.f37127x = i10;
        this.f37128y = i11;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedFling(View view, float f6, float f10, boolean z6) {
        if (!this.f37108b.isNestedScrollingEnabled()) {
            return false;
        }
        c0.m13502y(this.f37107a.m10430c(), null, null, new C7660f(z6, this, bf.m10557a(f6 * (-1.0f), f10 * (-1.0f)), null), 3);
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedPreFling(View view, float f6, float f10) {
        if (!this.f37108b.isNestedScrollingEnabled()) {
            return false;
        }
        c0.m13502y(this.f37107a.m10430c(), null, null, new k0(this, bf.m10557a(f6 * (-1.0f), f10 * (-1.0f)), (InterfaceC7559c) null, 3), 3);
        return false;
    }

    @Override // android.view.View
    public final void onWindowVisibilityChanged(int i10) {
        super.onWindowVisibilityChanged(i10);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestDisallowInterceptTouchEvent(boolean z6) {
        InterfaceC2139c interfaceC2139c = this.f37125v;
        if (interfaceC2139c != null) {
            interfaceC2139c.invoke(Boolean.valueOf(z6));
        }
        super.requestDisallowInterceptTouchEvent(z6);
    }

    public final void setDensity(InterfaceC6747c interfaceC6747c) {
        if (interfaceC6747c != this.f37116k) {
            this.f37116k = interfaceC6747c;
            InterfaceC2139c interfaceC2139c = this.f37117l;
            if (interfaceC2139c != null) {
                interfaceC2139c.invoke(interfaceC6747c);
            }
        }
    }

    public final void setLifecycleOwner(InterfaceC1649u interfaceC1649u) {
        if (interfaceC1649u != this.f37118m) {
            this.f37118m = interfaceC1649u;
            q0.m5341h(this, interfaceC1649u);
        }
    }

    public final void setModifier(InterfaceC7879r interfaceC7879r) {
        if (interfaceC7879r != this.f37114h) {
            this.f37114h = interfaceC7879r;
            InterfaceC2139c interfaceC2139c = this.f37115j;
            if (interfaceC2139c != null) {
                interfaceC2139c.invoke(interfaceC7879r);
            }
        }
    }

    public final void setOnDensityChanged$ui_release(InterfaceC2139c interfaceC2139c) {
        this.f37117l = interfaceC2139c;
    }

    public final void setOnModifierChanged$ui_release(InterfaceC2139c interfaceC2139c) {
        this.f37115j = interfaceC2139c;
    }

    public final void setOnRequestDisallowInterceptTouchEvent$ui_release(InterfaceC2139c interfaceC2139c) {
        this.f37125v = interfaceC2139c;
    }

    public final void setRelease(InterfaceC2137a interfaceC2137a) {
        this.f37113g = interfaceC2137a;
    }

    public final void setReset(InterfaceC2137a interfaceC2137a) {
        this.f37112f = interfaceC2137a;
    }

    public final void setSavedStateRegistryOwner(InterfaceC2547g interfaceC2547g) {
        if (interfaceC2547g != this.f37119n) {
            this.f37119n = interfaceC2547g;
            gg.m10676c(this, interfaceC2547g);
        }
    }

    public final void setUpdate(InterfaceC2137a interfaceC2137a) {
        this.f37110d = interfaceC2137a;
        this.f37111e = true;
        this.f37123s.invoke();
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return true;
    }
}
