package p001o;

import android.view.View;
import android.view.ViewParent;

/* loaded from: classes2.dex */
public class etb {

    /* renamed from: a */
    public ViewParent f22149a;

    /* renamed from: b */
    public ViewParent f22150b;

    /* renamed from: c */
    public final View f22151c;

    /* renamed from: d */
    public boolean f22152d;

    /* renamed from: e */
    public int[] f22153e;

    public etb(View view) {
        this.f22151c = view;
    }

    /* renamed from: a */
    public boolean m25578a(float f, float f2, boolean z) {
        ViewParent viewParentM25585h;
        if (!m25589l() || (viewParentM25585h = m25585h(0)) == null) {
            return false;
        }
        return zxi.m60067a(viewParentM25585h, this.f22151c, f, f2, z);
    }

    /* renamed from: b */
    public boolean m25579b(float f, float f2) {
        ViewParent viewParentM25585h;
        if (!m25589l() || (viewParentM25585h = m25585h(0)) == null) {
            return false;
        }
        return zxi.m60068b(viewParentM25585h, this.f22151c, f, f2);
    }

    /* renamed from: c */
    public boolean m25580c(int i, int i2, int[] iArr, int[] iArr2) {
        return m25581d(i, i2, iArr, iArr2, 0);
    }

    /* renamed from: d */
    public boolean m25581d(int i, int i2, int[] iArr, int[] iArr2, int i3) {
        ViewParent viewParentM25585h;
        int i4;
        int i5;
        if (!m25589l() || (viewParentM25585h = m25585h(i3)) == null) {
            return false;
        }
        if (i == 0 && i2 == 0) {
            if (iArr2 == null) {
                return false;
            }
            iArr2[0] = 0;
            iArr2[1] = 0;
            return false;
        }
        if (iArr2 != null) {
            this.f22151c.getLocationInWindow(iArr2);
            i4 = iArr2[0];
            i5 = iArr2[1];
        } else {
            i4 = 0;
            i5 = 0;
        }
        if (iArr == null) {
            iArr = m25586i();
        }
        iArr[0] = 0;
        iArr[1] = 0;
        zxi.m60069c(viewParentM25585h, this.f22151c, i, i2, iArr, i3);
        if (iArr2 != null) {
            this.f22151c.getLocationInWindow(iArr2);
            iArr2[0] = iArr2[0] - i4;
            iArr2[1] = iArr2[1] - i5;
        }
        return (iArr[0] == 0 && iArr[1] == 0) ? false : true;
    }

    /* renamed from: e */
    public void m25582e(int i, int i2, int i3, int i4, int[] iArr, int i5, int[] iArr2) {
        m25584g(i, i2, i3, i4, iArr, i5, iArr2);
    }

    /* renamed from: f */
    public boolean m25583f(int i, int i2, int i3, int i4, int[] iArr) {
        return m25584g(i, i2, i3, i4, iArr, 0, null);
    }

    /* renamed from: g */
    public final boolean m25584g(int i, int i2, int i3, int i4, int[] iArr, int i5, int[] iArr2) {
        ViewParent viewParentM25585h;
        int i6;
        int i7;
        int[] iArr3;
        if (!m25589l() || (viewParentM25585h = m25585h(i5)) == null) {
            return false;
        }
        if (i == 0 && i2 == 0 && i3 == 0 && i4 == 0) {
            if (iArr != null) {
                iArr[0] = 0;
                iArr[1] = 0;
            }
            return false;
        }
        if (iArr != null) {
            this.f22151c.getLocationInWindow(iArr);
            i6 = iArr[0];
            i7 = iArr[1];
        } else {
            i6 = 0;
            i7 = 0;
        }
        if (iArr2 == null) {
            int[] iArrM25586i = m25586i();
            iArrM25586i[0] = 0;
            iArrM25586i[1] = 0;
            iArr3 = iArrM25586i;
        } else {
            iArr3 = iArr2;
        }
        zxi.m60070d(viewParentM25585h, this.f22151c, i, i2, i3, i4, i5, iArr3);
        if (iArr != null) {
            this.f22151c.getLocationInWindow(iArr);
            iArr[0] = iArr[0] - i6;
            iArr[1] = iArr[1] - i7;
        }
        return true;
    }

    /* renamed from: h */
    public final ViewParent m25585h(int i) {
        if (i == 0) {
            return this.f22149a;
        }
        if (i != 1) {
            return null;
        }
        return this.f22150b;
    }

    /* renamed from: i */
    public final int[] m25586i() {
        if (this.f22153e == null) {
            this.f22153e = new int[2];
        }
        return this.f22153e;
    }

    /* renamed from: j */
    public boolean m25587j() {
        return m25588k(0);
    }

    /* renamed from: k */
    public boolean m25588k(int i) {
        return m25585h(i) != null;
    }

    /* renamed from: l */
    public boolean m25589l() {
        return this.f22152d;
    }

    /* renamed from: m */
    public void m25590m(boolean z) {
        if (this.f22152d) {
            wvi.H0(this.f22151c);
        }
        this.f22152d = z;
    }

    /* renamed from: n */
    public final void m25591n(int i, ViewParent viewParent) {
        if (i == 0) {
            this.f22149a = viewParent;
        } else {
            if (i != 1) {
                return;
            }
            this.f22150b = viewParent;
        }
    }

    /* renamed from: o */
    public boolean m25592o(int i) {
        return m25593p(i, 0);
    }

    /* renamed from: p */
    public boolean m25593p(int i, int i2) {
        if (m25588k(i2)) {
            return true;
        }
        if (!m25589l()) {
            return false;
        }
        View view = this.f22151c;
        for (ViewParent parent = this.f22151c.getParent(); parent != null; parent = parent.getParent()) {
            if (zxi.m60072f(parent, view, this.f22151c, i, i2)) {
                m25591n(i2, parent);
                zxi.m60071e(parent, view, this.f22151c, i, i2);
                return true;
            }
            if (parent instanceof View) {
                view = (View) parent;
            }
        }
        return false;
    }

    /* renamed from: q */
    public void m25594q() {
        m25595r(0);
    }

    /* renamed from: r */
    public void m25595r(int i) {
        ViewParent viewParentM25585h = m25585h(i);
        if (viewParentM25585h != null) {
            zxi.m60073g(viewParentM25585h, this.f22151c, i);
            m25591n(i, null);
        }
    }
}
