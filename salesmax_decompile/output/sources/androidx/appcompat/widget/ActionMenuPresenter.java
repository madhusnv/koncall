package androidx.appcompat.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.SparseBooleanArray;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.view.menu.AbstractC1788a;
import androidx.appcompat.view.menu.ActionMenuItemView;
import androidx.appcompat.view.menu.C1792e;
import androidx.appcompat.view.menu.C1794g;
import androidx.appcompat.view.menu.C1795h;
import androidx.appcompat.view.menu.InterfaceC1796i;
import androidx.appcompat.view.menu.InterfaceC1797j;
import androidx.appcompat.view.menu.SubMenuC1799l;
import androidx.appcompat.widget.ActionMenuView;
import java.util.ArrayList;
import p001o.brf;
import p001o.fy5;
import p001o.g9e;
import p001o.jsh;
import p001o.nm;
import p001o.of7;
import p001o.wm;
import p001o.z5e;

/* loaded from: classes2.dex */
public class ActionMenuPresenter extends AbstractC1788a implements wm.InterfaceC17927a {

    /* renamed from: H */
    public boolean f5731H;

    /* renamed from: L */
    public boolean f5732L;

    /* renamed from: M */
    public boolean f5733M;

    /* renamed from: Q */
    public int f5734Q;

    /* renamed from: X */
    public int f5735X;

    /* renamed from: Y */
    public int f5736Y;

    /* renamed from: Z */
    public boolean f5737Z;
    public boolean h0;
    public boolean i0;
    public boolean j0;
    public int k0;
    public final SparseBooleanArray l0;
    public C1812e m0;
    public C1808a n0;
    public RunnableC1810c o0;
    public C1809b p0;
    public final C1813f q0;
    public int r0;

    /* renamed from: x */
    public C1811d f5738x;

    /* renamed from: y */
    public Drawable f5739y;

    @SuppressLint({"BanParcelableUsage"})
    public static class SavedState implements Parcelable {
        public static final Parcelable.Creator<SavedState> CREATOR = new C1807a();

        /* renamed from: a */
        public int f5740a;

        /* renamed from: androidx.appcompat.widget.ActionMenuPresenter$SavedState$a */
        public class C1807a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public SavedState createFromParcel(Parcel parcel) {
                return new SavedState(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public SavedState[] newArray(int i) {
                return new SavedState[i];
            }
        }

        public SavedState() {
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(this.f5740a);
        }

        public SavedState(Parcel parcel) {
            this.f5740a = parcel.readInt();
        }
    }

    /* renamed from: androidx.appcompat.widget.ActionMenuPresenter$a */
    public class C1808a extends C1795h {
        public C1808a(Context context, SubMenuC1799l subMenuC1799l, View view) {
            super(context, subMenuC1799l, view, false, z5e.actionOverflowMenuStyle);
            if (!((C1794g) subMenuC1799l.getItem()).m4080l()) {
                View view2 = ActionMenuPresenter.this.f5738x;
                m4100f(view2 == null ? (View) ActionMenuPresenter.this.f5546q : view2);
            }
            m4104j(ActionMenuPresenter.this.q0);
        }

        @Override // androidx.appcompat.view.menu.C1795h
        /* renamed from: e */
        public void mo4099e() {
            ActionMenuPresenter actionMenuPresenter = ActionMenuPresenter.this;
            actionMenuPresenter.n0 = null;
            actionMenuPresenter.r0 = 0;
            super.mo4099e();
        }
    }

    /* renamed from: androidx.appcompat.widget.ActionMenuPresenter$b */
    public class C1809b extends ActionMenuItemView.AbstractC1787b {
        public C1809b() {
        }

        @Override // androidx.appcompat.view.menu.ActionMenuItemView.AbstractC1787b
        /* renamed from: a */
        public brf mo3955a() {
            C1808a c1808a = ActionMenuPresenter.this.n0;
            if (c1808a != null) {
                return c1808a.m4097c();
            }
            return null;
        }
    }

    /* renamed from: androidx.appcompat.widget.ActionMenuPresenter$c */
    public class RunnableC1810c implements Runnable {

        /* renamed from: a */
        public C1812e f5743a;

        public RunnableC1810c(C1812e c1812e) {
            this.f5743a = c1812e;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (ActionMenuPresenter.this.f5540c != null) {
                ActionMenuPresenter.this.f5540c.m4043d();
            }
            View view = (View) ActionMenuPresenter.this.f5546q;
            if (view != null && view.getWindowToken() != null && this.f5743a.m4107m()) {
                ActionMenuPresenter.this.m0 = this.f5743a;
            }
            ActionMenuPresenter.this.o0 = null;
        }
    }

    /* renamed from: androidx.appcompat.widget.ActionMenuPresenter$d */
    public class C1811d extends AppCompatImageView implements ActionMenuView.InterfaceC1814a {

        /* renamed from: androidx.appcompat.widget.ActionMenuPresenter$d$a */
        public class a extends of7 {

            /* renamed from: s */
            public final /* synthetic */ ActionMenuPresenter f5746s;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(View view, ActionMenuPresenter actionMenuPresenter) {
                super(view);
                this.f5746s = actionMenuPresenter;
            }

            @Override // p001o.of7
            /* renamed from: b */
            public brf mo3953b() {
                C1812e c1812e = ActionMenuPresenter.this.m0;
                if (c1812e == null) {
                    return null;
                }
                return c1812e.m4097c();
            }

            @Override // p001o.of7
            /* renamed from: c */
            public boolean mo3954c() {
                ActionMenuPresenter.this.m4166N();
                return true;
            }

            @Override // p001o.of7
            /* renamed from: d */
            public boolean mo4170d() {
                ActionMenuPresenter actionMenuPresenter = ActionMenuPresenter.this;
                if (actionMenuPresenter.o0 != null) {
                    return false;
                }
                actionMenuPresenter.m4157E();
                return true;
            }
        }

        public C1811d(Context context) {
            super(context, null, z5e.actionOverflowButtonStyle);
            setClickable(true);
            setFocusable(true);
            setVisibility(0);
            setEnabled(true);
            jsh.m34483a(this, getContentDescription());
            setOnTouchListener(new a(this, ActionMenuPresenter.this));
        }

        @Override // androidx.appcompat.widget.ActionMenuView.InterfaceC1814a
        /* renamed from: a */
        public boolean mo3946a() {
            return false;
        }

        @Override // androidx.appcompat.widget.ActionMenuView.InterfaceC1814a
        /* renamed from: b */
        public boolean mo3947b() {
            return false;
        }

        @Override // android.view.View
        public boolean performClick() {
            if (super.performClick()) {
                return true;
            }
            playSoundEffect(0);
            ActionMenuPresenter.this.m4166N();
            return true;
        }

        @Override // android.widget.ImageView
        public boolean setFrame(int i, int i2, int i3, int i4) {
            boolean frame = super.setFrame(i, i2, i3, i4);
            Drawable drawable = getDrawable();
            Drawable background = getBackground();
            if (drawable != null && background != null) {
                int width = getWidth();
                int height = getHeight();
                int iMax = Math.max(width, height) / 2;
                int paddingLeft = (width + (getPaddingLeft() - getPaddingRight())) / 2;
                int paddingTop = (height + (getPaddingTop() - getPaddingBottom())) / 2;
                fy5.m27738l(background, paddingLeft - iMax, paddingTop - iMax, paddingLeft + iMax, paddingTop + iMax);
            }
            return frame;
        }
    }

    /* renamed from: androidx.appcompat.widget.ActionMenuPresenter$e */
    public class C1812e extends C1795h {
        public C1812e(Context context, C1792e c1792e, View view, boolean z) {
            super(context, c1792e, view, z, z5e.actionOverflowMenuStyle);
            m4102h(8388613);
            m4104j(ActionMenuPresenter.this.q0);
        }

        @Override // androidx.appcompat.view.menu.C1795h
        /* renamed from: e */
        public void mo4099e() {
            if (ActionMenuPresenter.this.f5540c != null) {
                ActionMenuPresenter.this.f5540c.close();
            }
            ActionMenuPresenter.this.m0 = null;
            super.mo4099e();
        }
    }

    /* renamed from: androidx.appcompat.widget.ActionMenuPresenter$f */
    public class C1813f implements InterfaceC1796i.a {
        public C1813f() {
        }

        @Override // androidx.appcompat.view.menu.InterfaceC1796i.a
        /* renamed from: b */
        public void mo3835b(C1792e c1792e, boolean z) {
            if (c1792e instanceof SubMenuC1799l) {
                c1792e.mo4019F().m4044e(false);
            }
            InterfaceC1796i.a aVarM3974p = ActionMenuPresenter.this.m3974p();
            if (aVarM3974p != null) {
                aVarM3974p.mo3835b(c1792e, z);
            }
        }

        @Override // androidx.appcompat.view.menu.InterfaceC1796i.a
        /* renamed from: c */
        public boolean mo3836c(C1792e c1792e) {
            if (c1792e == ActionMenuPresenter.this.f5540c) {
                return false;
            }
            ActionMenuPresenter.this.r0 = ((SubMenuC1799l) c1792e).getItem().getItemId();
            InterfaceC1796i.a aVarM3974p = ActionMenuPresenter.this.m3974p();
            if (aVarM3974p != null) {
                return aVarM3974p.mo3836c(c1792e);
            }
            return false;
        }
    }

    public ActionMenuPresenter(Context context) {
        super(context, g9e.abc_action_menu_layout, g9e.abc_action_menu_item_layout);
        this.l0 = new SparseBooleanArray();
        this.q0 = new C1813f();
    }

    /* renamed from: B */
    public boolean m4154B() {
        return m4157E() | m4158F();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: C */
    public final View m4155C(MenuItem menuItem) {
        ViewGroup viewGroup = (ViewGroup) this.f5546q;
        if (viewGroup == null) {
            return null;
        }
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = viewGroup.getChildAt(i);
            if ((childAt instanceof InterfaceC1797j.a) && ((InterfaceC1797j.a) childAt).getItemData() == menuItem) {
                return childAt;
            }
        }
        return null;
    }

    /* renamed from: D */
    public Drawable m4156D() {
        C1811d c1811d = this.f5738x;
        if (c1811d != null) {
            return c1811d.getDrawable();
        }
        if (this.f5731H) {
            return this.f5739y;
        }
        return null;
    }

    /* renamed from: E */
    public boolean m4157E() {
        Object obj;
        RunnableC1810c runnableC1810c = this.o0;
        if (runnableC1810c != null && (obj = this.f5546q) != null) {
            ((View) obj).removeCallbacks(runnableC1810c);
            this.o0 = null;
            return true;
        }
        C1812e c1812e = this.m0;
        if (c1812e == null) {
            return false;
        }
        c1812e.m4096b();
        return true;
    }

    /* renamed from: F */
    public boolean m4158F() {
        C1808a c1808a = this.n0;
        if (c1808a == null) {
            return false;
        }
        c1808a.m4096b();
        return true;
    }

    /* renamed from: G */
    public boolean m4159G() {
        return this.o0 != null || m4160H();
    }

    /* renamed from: H */
    public boolean m4160H() {
        C1812e c1812e = this.m0;
        return c1812e != null && c1812e.m4098d();
    }

    /* renamed from: I */
    public void m4161I(Configuration configuration) {
        if (!this.f5737Z) {
            this.f5736Y = nm.m40771b(this.f5539b).m40774d();
        }
        C1792e c1792e = this.f5540c;
        if (c1792e != null) {
            c1792e.mo4027N(true);
        }
    }

    /* renamed from: J */
    public void m4162J(boolean z) {
        this.j0 = z;
    }

    /* renamed from: K */
    public void m4163K(ActionMenuView actionMenuView) {
        this.f5546q = actionMenuView;
        actionMenuView.mo3956a(this.f5540c);
    }

    /* renamed from: L */
    public void m4164L(Drawable drawable) {
        C1811d c1811d = this.f5738x;
        if (c1811d != null) {
            c1811d.setImageDrawable(drawable);
        } else {
            this.f5731H = true;
            this.f5739y = drawable;
        }
    }

    /* renamed from: M */
    public void m4165M(boolean z) {
        this.f5732L = z;
        this.f5733M = true;
    }

    /* renamed from: N */
    public boolean m4166N() {
        C1792e c1792e;
        if (!this.f5732L || m4160H() || (c1792e = this.f5540c) == null || this.f5546q == null || this.o0 != null || c1792e.m4016B().isEmpty()) {
            return false;
        }
        RunnableC1810c runnableC1810c = new RunnableC1810c(new C1812e(this.f5539b, this.f5540c, this.f5738x, true));
        this.o0 = runnableC1810c;
        ((View) this.f5546q).post(runnableC1810c);
        return true;
    }

    @Override // p001o.wm.InterfaceC17927a
    /* renamed from: a */
    public void mo4167a(boolean z) {
        if (z) {
            super.mo3966f(null);
            return;
        }
        C1792e c1792e = this.f5540c;
        if (c1792e != null) {
            c1792e.m4044e(false);
        }
    }

    @Override // androidx.appcompat.view.menu.AbstractC1788a, androidx.appcompat.view.menu.InterfaceC1796i
    /* renamed from: b */
    public void mo3963b(C1792e c1792e, boolean z) {
        m4154B();
        super.mo3963b(c1792e, z);
    }

    @Override // androidx.appcompat.view.menu.InterfaceC1796i
    /* renamed from: e */
    public void mo3987e(Parcelable parcelable) {
        int i;
        MenuItem menuItemFindItem;
        if ((parcelable instanceof SavedState) && (i = ((SavedState) parcelable).f5740a) > 0 && (menuItemFindItem = this.f5540c.findItem(i)) != null) {
            mo3966f((SubMenuC1799l) menuItemFindItem.getSubMenu());
        }
    }

    @Override // androidx.appcompat.view.menu.AbstractC1788a, androidx.appcompat.view.menu.InterfaceC1796i
    /* renamed from: f */
    public boolean mo3966f(SubMenuC1799l subMenuC1799l) {
        boolean z = false;
        if (!subMenuC1799l.hasVisibleItems()) {
            return false;
        }
        SubMenuC1799l subMenuC1799l2 = subMenuC1799l;
        while (subMenuC1799l2.j0() != this.f5540c) {
            subMenuC1799l2 = (SubMenuC1799l) subMenuC1799l2.j0();
        }
        View viewM4155C = m4155C(subMenuC1799l2.getItem());
        if (viewM4155C == null) {
            return false;
        }
        this.r0 = subMenuC1799l.getItem().getItemId();
        int size = subMenuC1799l.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                break;
            }
            MenuItem item = subMenuC1799l.getItem(i);
            if (item.isVisible() && item.getIcon() != null) {
                z = true;
                break;
            }
            i++;
        }
        C1808a c1808a = new C1808a(this.f5539b, subMenuC1799l, viewM4155C);
        this.n0 = c1808a;
        c1808a.m4101g(z);
        this.n0.m4105k();
        super.mo3966f(subMenuC1799l);
        return true;
    }

    @Override // androidx.appcompat.view.menu.InterfaceC1796i
    /* renamed from: g */
    public Parcelable mo3988g() {
        SavedState savedState = new SavedState();
        savedState.f5740a = this.r0;
        return savedState;
    }

    @Override // androidx.appcompat.view.menu.AbstractC1788a, androidx.appcompat.view.menu.InterfaceC1796i
    /* renamed from: h */
    public void mo3967h(boolean z) {
        super.mo3967h(z);
        ((View) this.f5546q).requestLayout();
        C1792e c1792e = this.f5540c;
        boolean z2 = false;
        if (c1792e != null) {
            ArrayList arrayListM4059u = c1792e.m4059u();
            int size = arrayListM4059u.size();
            for (int i = 0; i < size; i++) {
                wm wmVarMo4070a = ((C1794g) arrayListM4059u.get(i)).mo4070a();
                if (wmVarMo4070a != null) {
                    wmVarMo4070a.m54700k(this);
                }
            }
        }
        C1792e c1792e2 = this.f5540c;
        ArrayList arrayListM4016B = c1792e2 != null ? c1792e2.m4016B() : null;
        if (this.f5732L && arrayListM4016B != null) {
            int size2 = arrayListM4016B.size();
            if (size2 == 1) {
                z2 = !((C1794g) arrayListM4016B.get(0)).isActionViewExpanded();
            } else if (size2 > 0) {
                z2 = true;
            }
        }
        if (z2) {
            if (this.f5738x == null) {
                this.f5738x = new C1811d(this.f5538a);
            }
            ViewGroup viewGroup = (ViewGroup) this.f5738x.getParent();
            if (viewGroup != this.f5546q) {
                if (viewGroup != null) {
                    viewGroup.removeView(this.f5738x);
                }
                ActionMenuView actionMenuView = (ActionMenuView) this.f5546q;
                actionMenuView.addView(this.f5738x, actionMenuView.m4176F());
            }
        } else {
            C1811d c1811d = this.f5738x;
            if (c1811d != null) {
                Object parent = c1811d.getParent();
                Object obj = this.f5546q;
                if (parent == obj) {
                    ((ViewGroup) obj).removeView(this.f5738x);
                }
            }
        }
        ((ActionMenuView) this.f5546q).setOverflowReserved(this.f5732L);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v1, types: [int] */
    /* JADX WARN: Type inference failed for: r3v12 */
    @Override // androidx.appcompat.view.menu.InterfaceC1796i
    /* renamed from: i */
    public boolean mo3989i() {
        ArrayList arrayListM4020G;
        int size;
        int i;
        int iM4171L;
        boolean z;
        int i2;
        ActionMenuPresenter actionMenuPresenter = this;
        C1792e c1792e = actionMenuPresenter.f5540c;
        View view = null;
        ?? r3 = 0;
        if (c1792e != null) {
            arrayListM4020G = c1792e.m4020G();
            size = arrayListM4020G.size();
        } else {
            arrayListM4020G = null;
            size = 0;
        }
        int i3 = actionMenuPresenter.f5736Y;
        int i4 = actionMenuPresenter.f5735X;
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        ViewGroup viewGroup = (ViewGroup) actionMenuPresenter.f5546q;
        boolean z2 = false;
        int i5 = 0;
        int i6 = 0;
        for (int i7 = 0; i7 < size; i7++) {
            C1794g c1794g = (C1794g) arrayListM4020G.get(i7);
            if (c1794g.m4083o()) {
                i5++;
            } else if (c1794g.m4082n()) {
                i6++;
            } else {
                z2 = true;
            }
            if (actionMenuPresenter.j0 && c1794g.isActionViewExpanded()) {
                i3 = 0;
            }
        }
        if (actionMenuPresenter.f5732L && (z2 || i6 + i5 > i3)) {
            i3--;
        }
        int i8 = i3 - i5;
        SparseBooleanArray sparseBooleanArray = actionMenuPresenter.l0;
        sparseBooleanArray.clear();
        if (actionMenuPresenter.h0) {
            int i9 = actionMenuPresenter.k0;
            iM4171L = i4 / i9;
            i = i9 + ((i4 % i9) / iM4171L);
        } else {
            i = 0;
            iM4171L = 0;
        }
        int i10 = 0;
        int i11 = 0;
        while (i10 < size) {
            C1794g c1794g2 = (C1794g) arrayListM4020G.get(i10);
            if (c1794g2.m4083o()) {
                View viewMo3975q = actionMenuPresenter.mo3975q(c1794g2, view, viewGroup);
                if (actionMenuPresenter.h0) {
                    iM4171L -= ActionMenuView.m4171L(viewMo3975q, i, iM4171L, iMakeMeasureSpec, r3);
                } else {
                    viewMo3975q.measure(iMakeMeasureSpec, iMakeMeasureSpec);
                }
                int measuredWidth = viewMo3975q.getMeasuredWidth();
                i4 -= measuredWidth;
                if (i11 == 0) {
                    i11 = measuredWidth;
                }
                int groupId = c1794g2.getGroupId();
                if (groupId != 0) {
                    sparseBooleanArray.put(groupId, true);
                }
                c1794g2.m4089u(true);
                z = r3;
                i2 = size;
            } else if (c1794g2.m4082n()) {
                int groupId2 = c1794g2.getGroupId();
                boolean z3 = sparseBooleanArray.get(groupId2);
                boolean z4 = (i8 > 0 || z3) && i4 > 0 && (!actionMenuPresenter.h0 || iM4171L > 0);
                boolean z5 = z4;
                i2 = size;
                if (z4) {
                    View viewMo3975q2 = actionMenuPresenter.mo3975q(c1794g2, null, viewGroup);
                    if (actionMenuPresenter.h0) {
                        int iM4171L2 = ActionMenuView.m4171L(viewMo3975q2, i, iM4171L, iMakeMeasureSpec, 0);
                        iM4171L -= iM4171L2;
                        if (iM4171L2 == 0) {
                            z5 = false;
                        }
                    } else {
                        viewMo3975q2.measure(iMakeMeasureSpec, iMakeMeasureSpec);
                    }
                    boolean z6 = z5;
                    int measuredWidth2 = viewMo3975q2.getMeasuredWidth();
                    i4 -= measuredWidth2;
                    if (i11 == 0) {
                        i11 = measuredWidth2;
                    }
                    z4 = z6 & (!actionMenuPresenter.h0 ? i4 + i11 <= 0 : i4 < 0);
                }
                if (z4 && groupId2 != 0) {
                    sparseBooleanArray.put(groupId2, true);
                } else if (z3) {
                    sparseBooleanArray.put(groupId2, false);
                    for (int i12 = 0; i12 < i10; i12++) {
                        C1794g c1794g3 = (C1794g) arrayListM4020G.get(i12);
                        if (c1794g3.getGroupId() == groupId2) {
                            if (c1794g3.m4080l()) {
                                i8++;
                            }
                            c1794g3.m4089u(false);
                        }
                    }
                }
                if (z4) {
                    i8--;
                }
                c1794g2.m4089u(z4);
                z = false;
            } else {
                z = r3;
                i2 = size;
                c1794g2.m4089u(z);
            }
            i10++;
            r3 = z;
            size = i2;
            view = null;
            actionMenuPresenter = this;
        }
        return true;
    }

    @Override // androidx.appcompat.view.menu.AbstractC1788a, androidx.appcompat.view.menu.InterfaceC1796i
    /* renamed from: k */
    public void mo3969k(Context context, C1792e c1792e) {
        super.mo3969k(context, c1792e);
        Resources resources = context.getResources();
        nm nmVarM40771b = nm.m40771b(context);
        if (!this.f5733M) {
            this.f5732L = nmVarM40771b.m40778h();
        }
        if (!this.i0) {
            this.f5734Q = nmVarM40771b.m40773c();
        }
        if (!this.f5737Z) {
            this.f5736Y = nmVarM40771b.m40774d();
        }
        int measuredWidth = this.f5734Q;
        if (this.f5732L) {
            if (this.f5738x == null) {
                C1811d c1811d = new C1811d(this.f5538a);
                this.f5738x = c1811d;
                if (this.f5731H) {
                    c1811d.setImageDrawable(this.f5739y);
                    this.f5739y = null;
                    this.f5731H = false;
                }
                int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
                this.f5738x.measure(iMakeMeasureSpec, iMakeMeasureSpec);
            }
            measuredWidth -= this.f5738x.getMeasuredWidth();
        } else {
            this.f5738x = null;
        }
        this.f5735X = measuredWidth;
        this.k0 = (int) (resources.getDisplayMetrics().density * 56.0f);
    }

    @Override // androidx.appcompat.view.menu.AbstractC1788a
    /* renamed from: m */
    public void mo3971m(C1794g c1794g, InterfaceC1797j.a aVar) {
        aVar.mo3948c(c1794g, 0);
        ActionMenuItemView actionMenuItemView = (ActionMenuItemView) aVar;
        actionMenuItemView.setItemInvoker((ActionMenuView) this.f5546q);
        if (this.p0 == null) {
            this.p0 = new C1809b();
        }
        actionMenuItemView.setPopupCallback(this.p0);
    }

    @Override // androidx.appcompat.view.menu.AbstractC1788a
    /* renamed from: o */
    public boolean mo3973o(ViewGroup viewGroup, int i) {
        if (viewGroup.getChildAt(i) == this.f5738x) {
            return false;
        }
        return super.mo3973o(viewGroup, i);
    }

    @Override // androidx.appcompat.view.menu.AbstractC1788a
    /* renamed from: q */
    public View mo3975q(C1794g c1794g, View view, ViewGroup viewGroup) {
        View actionView = c1794g.getActionView();
        if (actionView == null || c1794g.m4078j()) {
            actionView = super.mo3975q(c1794g, view, viewGroup);
        }
        actionView.setVisibility(c1794g.isActionViewExpanded() ? 8 : 0);
        ActionMenuView actionMenuView = (ActionMenuView) viewGroup;
        ViewGroup.LayoutParams layoutParams = actionView.getLayoutParams();
        if (!actionMenuView.checkLayoutParams(layoutParams)) {
            actionView.setLayoutParams(actionMenuView.generateLayoutParams(layoutParams));
        }
        return actionView;
    }

    @Override // androidx.appcompat.view.menu.AbstractC1788a
    /* renamed from: r */
    public InterfaceC1797j mo3976r(ViewGroup viewGroup) {
        InterfaceC1797j interfaceC1797j = this.f5546q;
        InterfaceC1797j interfaceC1797jMo3976r = super.mo3976r(viewGroup);
        if (interfaceC1797j != interfaceC1797jMo3976r) {
            ((ActionMenuView) interfaceC1797jMo3976r).setPresenter(this);
        }
        return interfaceC1797jMo3976r;
    }

    @Override // androidx.appcompat.view.menu.AbstractC1788a
    /* renamed from: t */
    public boolean mo3978t(int i, C1794g c1794g) {
        return c1794g.m4080l();
    }
}
