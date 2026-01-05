package androidx.viewpager2.widget;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;
import java.util.Locale;
import p001o.vg0;

/* renamed from: androidx.viewpager2.widget.c */
/* loaded from: classes2.dex */
public final class C2562c extends RecyclerView.AbstractC2383t {

    /* renamed from: a */
    public ViewPager2.AbstractC2554i f10539a;

    /* renamed from: b */
    public final ViewPager2 f10540b;

    /* renamed from: c */
    public final RecyclerView f10541c;

    /* renamed from: d */
    public final LinearLayoutManager f10542d;

    /* renamed from: e */
    public int f10543e;

    /* renamed from: f */
    public int f10544f;

    /* renamed from: g */
    public a f10545g;

    /* renamed from: h */
    public int f10546h;

    /* renamed from: i */
    public int f10547i;

    /* renamed from: j */
    public boolean f10548j;

    /* renamed from: k */
    public boolean f10549k;

    /* renamed from: l */
    public boolean f10550l;

    /* renamed from: m */
    public boolean f10551m;

    /* renamed from: androidx.viewpager2.widget.c$a */
    public static final class a {

        /* renamed from: a */
        public int f10552a;

        /* renamed from: b */
        public float f10553b;

        /* renamed from: c */
        public int f10554c;

        /* renamed from: a */
        public void m10083a() {
            this.f10552a = -1;
            this.f10553b = 0.0f;
            this.f10554c = 0;
        }
    }

    public C2562c(ViewPager2 viewPager2) {
        this.f10540b = viewPager2;
        RecyclerView recyclerView = viewPager2.f10514s;
        this.f10541c = recyclerView;
        this.f10542d = (LinearLayoutManager) recyclerView.getLayoutManager();
        this.f10545g = new a();
        m10079n();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC2383t
    /* renamed from: a */
    public void mo9260a(RecyclerView recyclerView, int i) {
        boolean z = true;
        if (!(this.f10543e == 1 && this.f10544f == 1) && i == 1) {
            m10081p(false);
            return;
        }
        if (m10076k() && i == 2) {
            if (this.f10549k) {
                m10070e(2);
                this.f10548j = true;
                return;
            }
            return;
        }
        if (m10076k() && i == 0) {
            m10082q();
            if (this.f10549k) {
                a aVar = this.f10545g;
                if (aVar.f10554c == 0) {
                    int i2 = this.f10546h;
                    int i3 = aVar.f10552a;
                    if (i2 != i3) {
                        m10069d(i3);
                    }
                } else {
                    z = false;
                }
            } else {
                int i4 = this.f10545g.f10552a;
                if (i4 != -1) {
                    m10068c(i4, 0.0f, 0);
                }
            }
            if (z) {
                m10070e(0);
                m10079n();
            }
        }
        if (this.f10543e == 2 && i == 0 && this.f10550l) {
            m10082q();
            a aVar2 = this.f10545g;
            if (aVar2.f10554c == 0) {
                int i5 = this.f10547i;
                int i6 = aVar2.f10552a;
                if (i5 != i6) {
                    if (i6 == -1) {
                        i6 = 0;
                    }
                    m10069d(i6);
                }
                m10070e(0);
                m10079n();
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x002f  */
    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC2383t
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void mo964b(RecyclerView recyclerView, int i, int i2) {
        boolean z;
        this.f10549k = true;
        m10082q();
        if (this.f10548j) {
            this.f10548j = false;
            if (i2 > 0) {
                z = true;
                if (z) {
                    a aVar = this.f10545g;
                    int i3 = aVar.f10554c != 0 ? aVar.f10552a + 1 : this.f10545g.f10552a;
                    this.f10547i = i3;
                    if (this.f10546h != i3) {
                        m10069d(i3);
                    }
                }
            } else {
                if (i2 == 0) {
                    if ((i < 0) == this.f10540b.m10023d()) {
                    }
                    if (z) {
                    }
                }
                z = false;
                if (z) {
                }
            }
        } else if (this.f10543e == 0) {
            int i4 = this.f10545g.f10552a;
            if (i4 == -1) {
                i4 = 0;
            }
            m10069d(i4);
        }
        a aVar2 = this.f10545g;
        int i5 = aVar2.f10552a;
        if (i5 == -1) {
            i5 = 0;
        }
        m10068c(i5, aVar2.f10553b, aVar2.f10554c);
        a aVar3 = this.f10545g;
        int i6 = aVar3.f10552a;
        int i7 = this.f10547i;
        if ((i6 == i7 || i7 == -1) && aVar3.f10554c == 0 && this.f10544f != 1) {
            m10070e(0);
            m10079n();
        }
    }

    /* renamed from: c */
    public final void m10068c(int i, float f, int i2) {
        ViewPager2.AbstractC2554i abstractC2554i = this.f10539a;
        if (abstractC2554i != null) {
            abstractC2554i.mo10057b(i, f, i2);
        }
    }

    /* renamed from: d */
    public final void m10069d(int i) {
        ViewPager2.AbstractC2554i abstractC2554i = this.f10539a;
        if (abstractC2554i != null) {
            abstractC2554i.mo697c(i);
        }
    }

    /* renamed from: e */
    public final void m10070e(int i) {
        if ((this.f10543e == 3 && this.f10544f == 0) || this.f10544f == i) {
            return;
        }
        this.f10544f = i;
        ViewPager2.AbstractC2554i abstractC2554i = this.f10539a;
        if (abstractC2554i != null) {
            abstractC2554i.mo696a(i);
        }
    }

    /* renamed from: f */
    public final int m10071f() {
        return this.f10542d.l2();
    }

    /* renamed from: g */
    public double m10072g() {
        m10082q();
        a aVar = this.f10545g;
        return aVar.f10552a + aVar.f10553b;
    }

    /* renamed from: h */
    public int m10073h() {
        return this.f10544f;
    }

    /* renamed from: i */
    public boolean m10074i() {
        return this.f10551m;
    }

    /* renamed from: j */
    public boolean m10075j() {
        return this.f10544f == 0;
    }

    /* renamed from: k */
    public final boolean m10076k() {
        int i = this.f10543e;
        return i == 1 || i == 4;
    }

    /* renamed from: l */
    public void m10077l() {
        this.f10550l = true;
    }

    /* renamed from: m */
    public void m10078m(int i, boolean z) {
        this.f10543e = z ? 2 : 3;
        this.f10551m = false;
        boolean z2 = this.f10547i != i;
        this.f10547i = i;
        m10070e(2);
        if (z2) {
            m10069d(i);
        }
    }

    /* renamed from: n */
    public final void m10079n() {
        this.f10543e = 0;
        this.f10544f = 0;
        this.f10545g.m10083a();
        this.f10546h = -1;
        this.f10547i = -1;
        this.f10548j = false;
        this.f10549k = false;
        this.f10551m = false;
        this.f10550l = false;
    }

    /* renamed from: o */
    public void m10080o(ViewPager2.AbstractC2554i abstractC2554i) {
        this.f10539a = abstractC2554i;
    }

    /* renamed from: p */
    public final void m10081p(boolean z) {
        this.f10551m = z;
        this.f10543e = z ? 4 : 1;
        int i = this.f10547i;
        if (i != -1) {
            this.f10546h = i;
            this.f10547i = -1;
        } else if (this.f10546h == -1) {
            this.f10546h = m10071f();
        }
        m10070e(1);
    }

    /* renamed from: q */
    public final void m10082q() {
        int top;
        a aVar = this.f10545g;
        int iL2 = this.f10542d.l2();
        aVar.f10552a = iL2;
        if (iL2 == -1) {
            aVar.m10083a();
            return;
        }
        View viewMo9033S = this.f10542d.mo9033S(iL2);
        if (viewMo9033S == null) {
            aVar.m10083a();
            return;
        }
        int iP0 = this.f10542d.p0(viewMo9033S);
        int iU0 = this.f10542d.u0(viewMo9033S);
        int iX0 = this.f10542d.x0(viewMo9033S);
        int iM9239X = this.f10542d.m9239X(viewMo9033S);
        ViewGroup.LayoutParams layoutParams = viewMo9033S.getLayoutParams();
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            iP0 += marginLayoutParams.leftMargin;
            iU0 += marginLayoutParams.rightMargin;
            iX0 += marginLayoutParams.topMargin;
            iM9239X += marginLayoutParams.bottomMargin;
        }
        int height = viewMo9033S.getHeight() + iX0 + iM9239X;
        int width = viewMo9033S.getWidth() + iP0 + iU0;
        if (this.f10542d.y2() == 0) {
            top = (viewMo9033S.getLeft() - iP0) - this.f10541c.getPaddingLeft();
            if (this.f10540b.m10023d()) {
                top = -top;
            }
            height = width;
        } else {
            top = (viewMo9033S.getTop() - iX0) - this.f10541c.getPaddingTop();
        }
        int i = -top;
        aVar.f10554c = i;
        if (i >= 0) {
            aVar.f10553b = height == 0 ? 0.0f : i / height;
        } else {
            if (!new vg0(this.f10542d).m52731d()) {
                throw new IllegalStateException(String.format(Locale.US, "Page can only be offset by a positive amount, not by %d", Integer.valueOf(aVar.f10554c)));
            }
            throw new IllegalStateException("Page(s) contain a ViewGroup with a LayoutTransition (or animateLayoutChanges=\"true\"), which interferes with the scrolling animation. Make sure to call getLayoutTransition().setAnimateParentHierarchy(false) on all ViewGroups with a LayoutTransition before an animation is started.");
        }
    }
}
