package p001o;

import android.graphics.Rect;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import com.google.android.gms.common.api.Api;
import java.util.ArrayList;
import java.util.List;
import p001o.i77;

/* loaded from: classes2.dex */
public abstract class ap6 extends db {

    /* renamed from: n */
    public static final Rect f15094n = new Rect(Api.BaseClientBuilder.API_PRIORITY_OTHER, Api.BaseClientBuilder.API_PRIORITY_OTHER, Integer.MIN_VALUE, Integer.MIN_VALUE);

    /* renamed from: o */
    public static final i77.InterfaceC14204a f15095o = new C12230a();

    /* renamed from: p */
    public static final i77.InterfaceC14205b f15096p = new C12231b();

    /* renamed from: h */
    public final AccessibilityManager f15101h;

    /* renamed from: i */
    public final View f15102i;

    /* renamed from: j */
    public C12232c f15103j;

    /* renamed from: d */
    public final Rect f15097d = new Rect();

    /* renamed from: e */
    public final Rect f15098e = new Rect();

    /* renamed from: f */
    public final Rect f15099f = new Rect();

    /* renamed from: g */
    public final int[] f15100g = new int[2];

    /* renamed from: k */
    public int f15104k = Integer.MIN_VALUE;

    /* renamed from: l */
    public int f15105l = Integer.MIN_VALUE;

    /* renamed from: m */
    public int f15106m = Integer.MIN_VALUE;

    /* renamed from: o.ap6$a */
    public class C12230a implements i77.InterfaceC14204a {
        @Override // p001o.i77.InterfaceC14204a
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void mo17625a(cc ccVar, Rect rect) {
            ccVar.m20788m(rect);
        }
    }

    /* renamed from: o.ap6$b */
    public class C12231b implements i77.InterfaceC14205b {
        @Override // p001o.i77.InterfaceC14205b
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public cc mo17627a(d0g d0gVar, int i) {
            return (cc) d0gVar.m22194q(i);
        }

        @Override // p001o.i77.InterfaceC14205b
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public int mo17628b(d0g d0gVar) {
            return d0gVar.m22193p();
        }
    }

    /* renamed from: o.ap6$c */
    public class C12232c extends hc {
        public C12232c() {
        }

        @Override // p001o.hc
        /* renamed from: b */
        public cc mo17631b(int i) {
            return cc.c0(ap6.this.m17601J(i));
        }

        @Override // p001o.hc
        /* renamed from: d */
        public cc mo17632d(int i) {
            int i2 = i == 2 ? ap6.this.f15104k : ap6.this.f15105l;
            if (i2 == Integer.MIN_VALUE) {
                return null;
            }
            return mo17631b(i2);
        }

        @Override // p001o.hc
        /* renamed from: f */
        public boolean mo17633f(int i, int i2, Bundle bundle) {
            return ap6.this.m17605R(i, i2, bundle);
        }
    }

    public ap6(View view) {
        if (view == null) {
            throw new IllegalArgumentException("View may not be null");
        }
        this.f15102i = view;
        this.f15101h = (AccessibilityManager) view.getContext().getSystemService("accessibility");
        view.setFocusable(true);
        if (wvi.m55137x(view) == 0) {
            wvi.t0(view, 1);
        }
    }

    /* renamed from: D */
    public static Rect m17594D(View view, int i, Rect rect) {
        int width = view.getWidth();
        int height = view.getHeight();
        if (i == 17) {
            rect.set(width, 0, width, height);
        } else if (i == 33) {
            rect.set(0, height, width, height);
        } else if (i == 66) {
            rect.set(-1, 0, -1, height);
        } else {
            if (i != 130) {
                throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
            }
            rect.set(0, -1, width, -1);
        }
        return rect;
    }

    /* renamed from: H */
    public static int m17595H(int i) {
        if (i == 19) {
            return 33;
        }
        if (i != 21) {
            return i != 22 ? 130 : 66;
        }
        return 17;
    }

    /* renamed from: A */
    public final int m17596A() {
        return this.f15105l;
    }

    /* renamed from: B */
    public abstract int mo14398B(float f, float f2);

    /* renamed from: C */
    public abstract void mo14399C(List list);

    /* renamed from: E */
    public final void m17597E(int i) {
        m17598F(i, 0);
    }

    /* renamed from: F */
    public final void m17598F(int i, int i2) {
        ViewParent parent;
        if (i == Integer.MIN_VALUE || !this.f15101h.isEnabled() || (parent = this.f15102i.getParent()) == null) {
            return;
        }
        AccessibilityEvent accessibilityEventM17615q = m17615q(i, 2048);
        eb.m24668b(accessibilityEventM17615q, i2);
        parent.requestSendAccessibilityEvent(this.f15102i, accessibilityEventM17615q);
    }

    /* renamed from: G */
    public final boolean m17599G(Rect rect) {
        if (rect == null || rect.isEmpty() || this.f15102i.getWindowVisibility() != 0) {
            return false;
        }
        Object parent = this.f15102i.getParent();
        while (parent instanceof View) {
            View view = (View) parent;
            if (view.getAlpha() <= 0.0f || view.getVisibility() != 0) {
                return false;
            }
            parent = view.getParent();
        }
        return parent != null;
    }

    /* renamed from: I */
    public final boolean m17600I(int i, Rect rect) {
        cc ccVar;
        d0g d0gVarM17623y = m17623y();
        int i2 = this.f15105l;
        cc ccVar2 = i2 == Integer.MIN_VALUE ? null : (cc) d0gVarM17623y.m22184f(i2);
        if (i == 1 || i == 2) {
            ccVar = (cc) i77.m31634d(d0gVarM17623y, f15096p, f15095o, ccVar2, i, wvi.m55139z(this.f15102i) == 1, false);
        } else {
            if (i != 17 && i != 33 && i != 66 && i != 130) {
                throw new IllegalArgumentException("direction must be one of {FOCUS_FORWARD, FOCUS_BACKWARD, FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
            }
            Rect rect2 = new Rect();
            int i3 = this.f15105l;
            if (i3 != Integer.MIN_VALUE) {
                m17624z(i3, rect2);
            } else if (rect != null) {
                rect2.set(rect);
            } else {
                m17594D(this.f15102i, i, rect2);
            }
            ccVar = (cc) i77.m31633c(d0gVarM17623y, f15096p, f15095o, ccVar2, rect2, i);
        }
        return m17609V(ccVar != null ? d0gVarM17623y.m22189k(d0gVarM17623y.m22187i(ccVar)) : Integer.MIN_VALUE);
    }

    /* renamed from: J */
    public cc m17601J(int i) {
        return i == -1 ? m17619u() : m17618t(i);
    }

    /* renamed from: K */
    public final void m17602K(boolean z, int i, Rect rect) {
        int i2 = this.f15105l;
        if (i2 != Integer.MIN_VALUE) {
            m17613o(i2);
        }
        if (z) {
            m17600I(i, rect);
        }
    }

    /* renamed from: L */
    public abstract boolean mo14400L(int i, int i2, Bundle bundle);

    /* renamed from: M */
    public void m17603M(AccessibilityEvent accessibilityEvent) {
    }

    /* renamed from: N */
    public void m17604N(int i, AccessibilityEvent accessibilityEvent) {
    }

    /* renamed from: O */
    public void mo14401O(cc ccVar) {
    }

    /* renamed from: P */
    public abstract void mo14402P(int i, cc ccVar);

    /* renamed from: Q */
    public void mo14403Q(int i, boolean z) {
    }

    /* renamed from: R */
    public boolean m17605R(int i, int i2, Bundle bundle) {
        return i != -1 ? m17606S(i, i2, bundle) : m17607T(i2, bundle);
    }

    /* renamed from: S */
    public final boolean m17606S(int i, int i2, Bundle bundle) {
        return i2 != 1 ? i2 != 2 ? i2 != 64 ? i2 != 128 ? mo14400L(i, i2, bundle) : m17612n(i) : m17608U(i) : m17613o(i) : m17609V(i);
    }

    /* renamed from: T */
    public final boolean m17607T(int i, Bundle bundle) {
        return wvi.b0(this.f15102i, i, bundle);
    }

    /* renamed from: U */
    public final boolean m17608U(int i) {
        int i2;
        if (!this.f15101h.isEnabled() || !this.f15101h.isTouchExplorationEnabled() || (i2 = this.f15104k) == i) {
            return false;
        }
        if (i2 != Integer.MIN_VALUE) {
            m17612n(i2);
        }
        this.f15104k = i;
        this.f15102i.invalidate();
        m17610W(i, 32768);
        return true;
    }

    /* renamed from: V */
    public final boolean m17609V(int i) {
        int i2;
        if ((!this.f15102i.isFocused() && !this.f15102i.requestFocus()) || (i2 = this.f15105l) == i) {
            return false;
        }
        if (i2 != Integer.MIN_VALUE) {
            m17613o(i2);
        }
        if (i == Integer.MIN_VALUE) {
            return false;
        }
        this.f15105l = i;
        mo14403Q(i, true);
        m17610W(i, 8);
        return true;
    }

    /* renamed from: W */
    public final boolean m17610W(int i, int i2) {
        ViewParent parent;
        if (i == Integer.MIN_VALUE || !this.f15101h.isEnabled() || (parent = this.f15102i.getParent()) == null) {
            return false;
        }
        return parent.requestSendAccessibilityEvent(this.f15102i, m17615q(i, i2));
    }

    /* renamed from: X */
    public final void m17611X(int i) {
        int i2 = this.f15106m;
        if (i2 == i) {
            return;
        }
        this.f15106m = i;
        m17610W(i, 128);
        m17610W(i2, 256);
    }

    @Override // p001o.db
    /* renamed from: b */
    public hc mo5184b(View view) {
        if (this.f15103j == null) {
            this.f15103j = new C12232c();
        }
        return this.f15103j;
    }

    @Override // p001o.db
    /* renamed from: f */
    public void mo5937f(View view, AccessibilityEvent accessibilityEvent) {
        super.mo5937f(view, accessibilityEvent);
        m17603M(accessibilityEvent);
    }

    @Override // p001o.db
    /* renamed from: g */
    public void mo5938g(View view, cc ccVar) {
        super.mo5938g(view, ccVar);
        mo14401O(ccVar);
    }

    /* renamed from: n */
    public final boolean m17612n(int i) {
        if (this.f15104k != i) {
            return false;
        }
        this.f15104k = Integer.MIN_VALUE;
        this.f15102i.invalidate();
        m17610W(i, 65536);
        return true;
    }

    /* renamed from: o */
    public final boolean m17613o(int i) {
        if (this.f15105l != i) {
            return false;
        }
        this.f15105l = Integer.MIN_VALUE;
        mo14403Q(i, false);
        m17610W(i, 8);
        return true;
    }

    /* renamed from: p */
    public final boolean m17614p() {
        int i = this.f15105l;
        return i != Integer.MIN_VALUE && mo14400L(i, 16, null);
    }

    /* renamed from: q */
    public final AccessibilityEvent m17615q(int i, int i2) {
        return i != -1 ? m17616r(i, i2) : m17617s(i2);
    }

    /* renamed from: r */
    public final AccessibilityEvent m17616r(int i, int i2) {
        AccessibilityEvent accessibilityEventObtain = AccessibilityEvent.obtain(i2);
        cc ccVarM17601J = m17601J(i);
        accessibilityEventObtain.getText().add(ccVarM17601J.m20753C());
        accessibilityEventObtain.setContentDescription(ccVarM17601J.m20794t());
        accessibilityEventObtain.setScrollable(ccVarM17601J.m20772V());
        accessibilityEventObtain.setPassword(ccVarM17601J.m20771U());
        accessibilityEventObtain.setEnabled(ccVarM17601J.m20765O());
        accessibilityEventObtain.setChecked(ccVarM17601J.m20762L());
        m17604N(i, accessibilityEventObtain);
        if (accessibilityEventObtain.getText().isEmpty() && accessibilityEventObtain.getContentDescription() == null) {
            throw new RuntimeException("Callbacks must add text or a content description in populateEventForVirtualViewId()");
        }
        accessibilityEventObtain.setClassName(ccVarM17601J.m20792q());
        ic.m31894c(accessibilityEventObtain, this.f15102i, i);
        accessibilityEventObtain.setPackageName(this.f15102i.getContext().getPackageName());
        return accessibilityEventObtain;
    }

    /* renamed from: s */
    public final AccessibilityEvent m17617s(int i) {
        AccessibilityEvent accessibilityEventObtain = AccessibilityEvent.obtain(i);
        this.f15102i.onInitializeAccessibilityEvent(accessibilityEventObtain);
        return accessibilityEventObtain;
    }

    /* renamed from: t */
    public final cc m17618t(int i) {
        cc ccVarA0 = cc.a0();
        ccVarA0.w0(true);
        ccVarA0.y0(true);
        ccVarA0.o0("android.view.View");
        Rect rect = f15094n;
        ccVarA0.j0(rect);
        ccVarA0.k0(rect);
        ccVarA0.J0(this.f15102i);
        mo14402P(i, ccVarA0);
        if (ccVarA0.m20753C() == null && ccVarA0.m20794t() == null) {
            throw new RuntimeException("Callbacks must add text or a content description in populateNodeForVirtualViewId()");
        }
        ccVarA0.m20788m(this.f15098e);
        if (this.f15098e.equals(rect)) {
            throw new RuntimeException("Callbacks must set parent bounds in populateNodeForVirtualViewId()");
        }
        int iM20786k = ccVarA0.m20786k();
        if ((iM20786k & 64) != 0) {
            throw new RuntimeException("Callbacks must not add ACTION_ACCESSIBILITY_FOCUS in populateNodeForVirtualViewId()");
        }
        if ((iM20786k & 128) != 0) {
            throw new RuntimeException("Callbacks must not add ACTION_CLEAR_ACCESSIBILITY_FOCUS in populateNodeForVirtualViewId()");
        }
        ccVarA0.H0(this.f15102i.getContext().getPackageName());
        ccVarA0.T0(this.f15102i, i);
        if (this.f15104k == i) {
            ccVarA0.h0(true);
            ccVarA0.m20777a(128);
        } else {
            ccVarA0.h0(false);
            ccVarA0.m20777a(64);
        }
        boolean z = this.f15105l == i;
        if (z) {
            ccVarA0.m20777a(2);
        } else if (ccVarA0.m20766P()) {
            ccVarA0.m20777a(1);
        }
        ccVarA0.z0(z);
        this.f15102i.getLocationOnScreen(this.f15100g);
        ccVarA0.m20789n(this.f15097d);
        if (this.f15097d.equals(rect)) {
            ccVarA0.m20788m(this.f15097d);
            if (ccVarA0.f17769b != -1) {
                cc ccVarA02 = cc.a0();
                for (int i2 = ccVarA0.f17769b; i2 != -1; i2 = ccVarA02.f17769b) {
                    ccVarA02.K0(this.f15102i, -1);
                    ccVarA02.j0(f15094n);
                    mo14402P(i2, ccVarA02);
                    ccVarA02.m20788m(this.f15098e);
                    Rect rect2 = this.f15097d;
                    Rect rect3 = this.f15098e;
                    rect2.offset(rect3.left, rect3.top);
                }
                ccVarA02.e0();
            }
            this.f15097d.offset(this.f15100g[0] - this.f15102i.getScrollX(), this.f15100g[1] - this.f15102i.getScrollY());
        }
        if (this.f15102i.getLocalVisibleRect(this.f15099f)) {
            this.f15099f.offset(this.f15100g[0] - this.f15102i.getScrollX(), this.f15100g[1] - this.f15102i.getScrollY());
            if (this.f15097d.intersect(this.f15099f)) {
                ccVarA0.k0(this.f15097d);
                if (m17599G(this.f15097d)) {
                    ccVarA0.b1(true);
                }
            }
        }
        return ccVarA0;
    }

    /* renamed from: u */
    public final cc m17619u() {
        cc ccVarB0 = cc.b0(this.f15102i);
        wvi.m55113Z(this.f15102i, ccVarB0);
        ArrayList arrayList = new ArrayList();
        mo14399C(arrayList);
        if (ccVarB0.m20791p() > 0 && arrayList.size() > 0) {
            throw new RuntimeException("Views cannot have both real and virtual children");
        }
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ccVarB0.m20780d(this.f15102i, ((Integer) arrayList.get(i)).intValue());
        }
        return ccVarB0;
    }

    /* renamed from: v */
    public final boolean m17620v(MotionEvent motionEvent) {
        if (!this.f15101h.isEnabled() || !this.f15101h.isTouchExplorationEnabled()) {
            return false;
        }
        int action = motionEvent.getAction();
        if (action == 7 || action == 9) {
            int iMo14398B = mo14398B(motionEvent.getX(), motionEvent.getY());
            m17611X(iMo14398B);
            return iMo14398B != Integer.MIN_VALUE;
        }
        if (action != 10 || this.f15106m == Integer.MIN_VALUE) {
            return false;
        }
        m17611X(Integer.MIN_VALUE);
        return true;
    }

    /* renamed from: w */
    public final boolean m17621w(KeyEvent keyEvent) {
        int i = 0;
        if (keyEvent.getAction() == 1) {
            return false;
        }
        int keyCode = keyEvent.getKeyCode();
        if (keyCode == 61) {
            if (keyEvent.hasNoModifiers()) {
                return m17600I(2, null);
            }
            if (keyEvent.hasModifiers(1)) {
                return m17600I(1, null);
            }
            return false;
        }
        if (keyCode != 66) {
            switch (keyCode) {
                case 19:
                case 20:
                case 21:
                case 22:
                    if (!keyEvent.hasNoModifiers()) {
                        return false;
                    }
                    int iM17595H = m17595H(keyCode);
                    int repeatCount = keyEvent.getRepeatCount() + 1;
                    boolean z = false;
                    while (i < repeatCount && m17600I(iM17595H, null)) {
                        i++;
                        z = true;
                    }
                    return z;
                case 23:
                    break;
                default:
                    return false;
            }
        }
        if (!keyEvent.hasNoModifiers() || keyEvent.getRepeatCount() != 0) {
            return false;
        }
        m17614p();
        return true;
    }

    /* renamed from: x */
    public final int m17622x() {
        return this.f15104k;
    }

    /* renamed from: y */
    public final d0g m17623y() {
        ArrayList arrayList = new ArrayList();
        mo14399C(arrayList);
        d0g d0gVar = new d0g();
        for (int i = 0; i < arrayList.size(); i++) {
            d0gVar.m22190l(((Integer) arrayList.get(i)).intValue(), m17618t(((Integer) arrayList.get(i)).intValue()));
        }
        return d0gVar;
    }

    /* renamed from: z */
    public final void m17624z(int i, Rect rect) {
        m17601J(i).m20788m(rect);
    }
}
