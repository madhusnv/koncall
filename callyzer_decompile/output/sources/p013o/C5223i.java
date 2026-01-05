package p013o;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.util.SparseBooleanArray;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.appcompat.view.menu.ActionMenuItemView;
import androidx.appcompat.widget.ActionMenuView;
import com.websoptimization.callyzerbiz.R;
import java.util.ArrayList;
import k4.C4001v;
import p012n.AbstractC4931k;
import p012n.InterfaceC4934n;
import p012n.InterfaceC4935o;
import p012n.InterfaceC4936p;
import p012n.MenuC4929i;
import p012n.MenuItemC4930j;
import p012n.SubMenuC4939s;
import zh.RunnableC8956c;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: o.i */
/* loaded from: classes.dex */
public final class C5223i implements InterfaceC4935o {

    /* renamed from: a */
    public final Context f25514a;

    /* renamed from: b */
    public Context f25515b;

    /* renamed from: c */
    public MenuC4929i f25516c;

    /* renamed from: d */
    public final LayoutInflater f25517d;

    /* renamed from: e */
    public InterfaceC4934n f25518e;

    /* renamed from: g */
    public ActionMenuView f25520g;

    /* renamed from: h */
    public C5222h f25521h;

    /* renamed from: j */
    public Drawable f25522j;

    /* renamed from: k */
    public boolean f25523k;

    /* renamed from: l */
    public boolean f25524l;

    /* renamed from: m */
    public boolean f25525m;

    /* renamed from: n */
    public int f25526n;

    /* renamed from: p */
    public int f25527p;

    /* renamed from: q */
    public int f25528q;

    /* renamed from: r */
    public boolean f25529r;

    /* renamed from: t */
    public C5220f f25531t;

    /* renamed from: v */
    public C5220f f25532v;

    /* renamed from: w */
    public RunnableC8956c f25533w;

    /* renamed from: x */
    public C5221g f25534x;

    /* renamed from: f */
    public final int f25519f = R.layout.abc_action_menu_item_layout;

    /* renamed from: s */
    public final SparseBooleanArray f25530s = new SparseBooleanArray();

    /* renamed from: y */
    public final C4001v f25535y = new C4001v(13, this);

    public C5223i(Context context) {
        this.f25514a = context;
        this.f25517d = LayoutInflater.from(context);
    }

    @Override // p012n.InterfaceC4935o
    /* renamed from: a */
    public final void mo9833a(MenuC4929i menuC4929i, boolean z6) {
        m10242f();
        C5220f c5220f = this.f25532v;
        if (c5220f != null && c5220f.m9881b()) {
            c5220f.f24591i.dismiss();
        }
        InterfaceC4934n interfaceC4934n = this.f25518e;
        if (interfaceC4934n != null) {
            interfaceC4934n.mo393a(menuC4929i, z6);
        }
    }

    @Override // p012n.InterfaceC4935o
    /* renamed from: b */
    public final void mo9877b(Context context, MenuC4929i menuC4929i) {
        this.f25515b = context;
        LayoutInflater.from(context);
        this.f25516c = menuC4929i;
        Resources resources = context.getResources();
        if (!this.f25525m) {
            this.f25524l = true;
        }
        int i10 = 2;
        this.f25526n = context.getResources().getDisplayMetrics().widthPixels / 2;
        Configuration configuration = context.getResources().getConfiguration();
        int i11 = configuration.screenWidthDp;
        int i12 = configuration.screenHeightDp;
        if (configuration.smallestScreenWidthDp > 600 || i11 > 600 || ((i11 > 960 && i12 > 720) || (i11 > 720 && i12 > 960))) {
            i10 = 5;
        } else if (i11 >= 500 || ((i11 > 640 && i12 > 480) || (i11 > 480 && i12 > 640))) {
            i10 = 4;
        } else if (i11 >= 360) {
            i10 = 3;
        }
        this.f25528q = i10;
        int measuredWidth = this.f25526n;
        if (this.f25524l) {
            if (this.f25521h == null) {
                C5222h c5222h = new C5222h(this, this.f25514a);
                this.f25521h = c5222h;
                if (this.f25523k) {
                    c5222h.setImageDrawable(this.f25522j);
                    this.f25522j = null;
                    this.f25523k = false;
                }
                int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
                this.f25521h.measure(iMakeMeasureSpec, iMakeMeasureSpec);
            }
            measuredWidth -= this.f25521h.getMeasuredWidth();
        } else {
            this.f25521h = null;
        }
        this.f25527p = measuredWidth;
        float f6 = resources.getDisplayMetrics().density;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p012n.InterfaceC4935o
    /* renamed from: c */
    public final boolean mo9834c(SubMenuC4939s subMenuC4939s) {
        boolean z6;
        if (subMenuC4939s.hasVisibleItems()) {
            SubMenuC4939s subMenuC4939s2 = subMenuC4939s;
            while (true) {
                MenuC4929i menuC4929i = subMenuC4939s2.f24613v;
                if (menuC4929i == this.f25516c) {
                    break;
                }
                subMenuC4939s2 = (SubMenuC4939s) menuC4929i;
            }
            MenuItemC4930j menuItemC4930j = subMenuC4939s2.f24614w;
            ActionMenuView actionMenuView = this.f25520g;
            View view = null;
            if (actionMenuView != null) {
                int childCount = actionMenuView.getChildCount();
                int i10 = 0;
                while (true) {
                    if (i10 >= childCount) {
                        break;
                    }
                    View childAt = actionMenuView.getChildAt(i10);
                    if ((childAt instanceof InterfaceC4936p) && ((InterfaceC4936p) childAt).getItemData() == menuItemC4930j) {
                        view = childAt;
                        break;
                    }
                    i10++;
                }
            }
            if (view != null) {
                subMenuC4939s.f24614w.getClass();
                int size = subMenuC4939s.f24538f.size();
                int i11 = 0;
                while (true) {
                    if (i11 >= size) {
                        z6 = false;
                        break;
                    }
                    MenuItem item = subMenuC4939s.getItem(i11);
                    if (item.isVisible() && item.getIcon() != null) {
                        z6 = true;
                        break;
                    }
                    i11++;
                }
                C5220f c5220f = new C5220f(this, this.f25515b, subMenuC4939s, view);
                this.f25532v = c5220f;
                c5220f.f24589g = z6;
                AbstractC4931k abstractC4931k = c5220f.f24591i;
                if (abstractC4931k != null) {
                    abstractC4931k.mo9843o(z6);
                }
                C5220f c5220f2 = this.f25532v;
                if (!c5220f2.m9881b()) {
                    if (c5220f2.f24587e == null) {
                        throw new IllegalStateException("MenuPopupHelper cannot be used without an anchor");
                    }
                    c5220f2.m9883d(0, 0, false, false);
                }
                InterfaceC4934n interfaceC4934n = this.f25518e;
                if (interfaceC4934n != null) {
                    interfaceC4934n.mo397f(subMenuC4939s);
                }
                return true;
            }
        }
        return false;
    }

    @Override // p012n.InterfaceC4935o
    /* renamed from: d */
    public final boolean mo9835d() {
        int size;
        ArrayList arrayListM9862k;
        int i10;
        boolean z6;
        C5223i c5223i = this;
        MenuC4929i menuC4929i = c5223i.f25516c;
        if (menuC4929i != null) {
            arrayListM9862k = menuC4929i.m9862k();
            size = arrayListM9862k.size();
        } else {
            size = 0;
            arrayListM9862k = null;
        }
        int i11 = c5223i.f25528q;
        int i12 = c5223i.f25527p;
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        ActionMenuView actionMenuView = c5223i.f25520g;
        int i13 = 0;
        boolean z10 = false;
        int i14 = 0;
        int i15 = 0;
        while (true) {
            i10 = 2;
            z6 = true;
            if (i13 >= size) {
                break;
            }
            MenuItemC4930j menuItemC4930j = (MenuItemC4930j) arrayListM9862k.get(i13);
            int i16 = menuItemC4930j.f24579y;
            if ((i16 & 2) == 2) {
                i14++;
            } else if ((i16 & 1) == 1) {
                i15++;
            } else {
                z10 = true;
            }
            if (c5223i.f25529r && menuItemC4930j.f24554B) {
                i11 = 0;
            }
            i13++;
        }
        if (c5223i.f25524l && (z10 || i15 + i14 > i11)) {
            i11--;
        }
        int i17 = i11 - i14;
        SparseBooleanArray sparseBooleanArray = c5223i.f25530s;
        sparseBooleanArray.clear();
        int i18 = 0;
        int i19 = 0;
        while (i18 < size) {
            MenuItemC4930j menuItemC4930j2 = (MenuItemC4930j) arrayListM9862k.get(i18);
            int i20 = menuItemC4930j2.f24579y;
            boolean z11 = (i20 & 2) == i10 ? z6 : false;
            int i21 = menuItemC4930j2.f24556b;
            if (z11) {
                View viewM10241e = c5223i.m10241e(menuItemC4930j2, null, actionMenuView);
                viewM10241e.measure(iMakeMeasureSpec, iMakeMeasureSpec);
                int measuredWidth = viewM10241e.getMeasuredWidth();
                i12 -= measuredWidth;
                if (i19 == 0) {
                    i19 = measuredWidth;
                }
                if (i21 != 0) {
                    sparseBooleanArray.put(i21, z6);
                }
                menuItemC4930j2.m9874d(z6);
            } else if ((i20 & 1) == z6) {
                boolean z12 = sparseBooleanArray.get(i21);
                boolean z13 = ((i17 > 0 || z12) && i12 > 0) ? z6 : false;
                if (z13) {
                    View viewM10241e2 = c5223i.m10241e(menuItemC4930j2, null, actionMenuView);
                    viewM10241e2.measure(iMakeMeasureSpec, iMakeMeasureSpec);
                    int measuredWidth2 = viewM10241e2.getMeasuredWidth();
                    i12 -= measuredWidth2;
                    if (i19 == 0) {
                        i19 = measuredWidth2;
                    }
                    z13 &= i12 + i19 > 0;
                }
                if (z13 && i21 != 0) {
                    sparseBooleanArray.put(i21, true);
                } else if (z12) {
                    sparseBooleanArray.put(i21, false);
                    for (int i22 = 0; i22 < i18; i22++) {
                        MenuItemC4930j menuItemC4930j3 = (MenuItemC4930j) arrayListM9862k.get(i22);
                        if (menuItemC4930j3.f24556b == i21) {
                            if ((menuItemC4930j3.f24578x & 32) == 32) {
                                i17++;
                            }
                            menuItemC4930j3.m9874d(false);
                        }
                    }
                }
                if (z13) {
                    i17--;
                }
                menuItemC4930j2.m9874d(z13);
            } else {
                menuItemC4930j2.m9874d(false);
                i18++;
                i10 = 2;
                c5223i = this;
                z6 = true;
            }
            i18++;
            i10 = 2;
            c5223i = this;
            z6 = true;
        }
        return z6;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v0, types: [android.view.View] */
    /* JADX WARN: Type inference failed for: r7v4, types: [n.p] */
    /* JADX WARN: Type inference failed for: r7v7 */
    /* JADX WARN: Type inference failed for: r7v8 */
    /* renamed from: e */
    public final View m10241e(MenuItemC4930j menuItemC4930j, View view, ActionMenuView actionMenuView) {
        View view2 = menuItemC4930j.f24580z;
        View view3 = view2 != null ? view2 : null;
        if (view3 == null || ((menuItemC4930j.f24579y & 8) != 0 && view2 != null)) {
            ActionMenuItemView actionMenuItemView = view instanceof InterfaceC4936p ? (InterfaceC4936p) view : (InterfaceC4936p) this.f25517d.inflate(this.f25519f, (ViewGroup) actionMenuView, false);
            actionMenuItemView.mo550a(menuItemC4930j);
            ActionMenuItemView actionMenuItemView2 = actionMenuItemView;
            actionMenuItemView2.setItemInvoker(this.f25520g);
            if (this.f25534x == null) {
                this.f25534x = new C5221g(this);
            }
            actionMenuItemView2.setPopupCallback(this.f25534x);
            view3 = actionMenuItemView;
        }
        view3.setVisibility(menuItemC4930j.f24554B ? 8 : 0);
        ViewGroup.LayoutParams layoutParams = view3.getLayoutParams();
        actionMenuView.getClass();
        if (!(layoutParams instanceof C5225k)) {
            view3.setLayoutParams(ActionMenuView.m570j(layoutParams));
        }
        return view3;
    }

    /* renamed from: f */
    public final boolean m10242f() {
        ActionMenuView actionMenuView;
        RunnableC8956c runnableC8956c = this.f25533w;
        if (runnableC8956c != null && (actionMenuView = this.f25520g) != null) {
            actionMenuView.removeCallbacks(runnableC8956c);
            this.f25533w = null;
            return true;
        }
        C5220f c5220f = this.f25531t;
        if (c5220f == null) {
            return false;
        }
        if (c5220f.m9881b()) {
            c5220f.f24591i.dismiss();
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p012n.InterfaceC4935o
    /* renamed from: g */
    public final void mo9838g() {
        int i10;
        ActionMenuView actionMenuView = this.f25520g;
        ArrayList arrayList = null;
        boolean z6 = false;
        if (actionMenuView != null) {
            MenuC4929i menuC4929i = this.f25516c;
            if (menuC4929i != null) {
                menuC4929i.m9860i();
                ArrayList arrayListM9862k = this.f25516c.m9862k();
                int size = arrayListM9862k.size();
                i10 = 0;
                for (int i11 = 0; i11 < size; i11++) {
                    MenuItemC4930j menuItemC4930j = (MenuItemC4930j) arrayListM9862k.get(i11);
                    if ((menuItemC4930j.f24578x & 32) == 32) {
                        View childAt = actionMenuView.getChildAt(i10);
                        MenuItemC4930j itemData = childAt instanceof InterfaceC4936p ? ((InterfaceC4936p) childAt).getItemData() : null;
                        View viewM10241e = m10241e(menuItemC4930j, childAt, actionMenuView);
                        if (menuItemC4930j != itemData) {
                            viewM10241e.setPressed(false);
                            viewM10241e.jumpDrawablesToCurrentState();
                        }
                        if (viewM10241e != childAt) {
                            ViewGroup viewGroup = (ViewGroup) viewM10241e.getParent();
                            if (viewGroup != null) {
                                viewGroup.removeView(viewM10241e);
                            }
                            this.f25520g.addView(viewM10241e, i10);
                        }
                        i10++;
                    }
                }
            } else {
                i10 = 0;
            }
            while (i10 < actionMenuView.getChildCount()) {
                if (actionMenuView.getChildAt(i10) == this.f25521h) {
                    i10++;
                } else {
                    actionMenuView.removeViewAt(i10);
                }
            }
        }
        this.f25520g.requestLayout();
        MenuC4929i menuC4929i2 = this.f25516c;
        if (menuC4929i2 != null) {
            menuC4929i2.m9860i();
            ArrayList arrayList2 = menuC4929i2.f24541i;
            int size2 = arrayList2.size();
            for (int i12 = 0; i12 < size2; i12++) {
                ((MenuItemC4930j) arrayList2.get(i12)).getClass();
            }
        }
        MenuC4929i menuC4929i3 = this.f25516c;
        if (menuC4929i3 != null) {
            menuC4929i3.m9860i();
            arrayList = menuC4929i3.f24542j;
        }
        if (this.f25524l && arrayList != null) {
            int size3 = arrayList.size();
            if (size3 == 1) {
                z6 = !((MenuItemC4930j) arrayList.get(0)).f24554B;
            } else if (size3 > 0) {
                z6 = true;
            }
        }
        if (z6) {
            if (this.f25521h == null) {
                this.f25521h = new C5222h(this, this.f25514a);
            }
            ViewGroup viewGroup2 = (ViewGroup) this.f25521h.getParent();
            if (viewGroup2 != this.f25520g) {
                if (viewGroup2 != null) {
                    viewGroup2.removeView(this.f25521h);
                }
                ActionMenuView actionMenuView2 = this.f25520g;
                C5222h c5222h = this.f25521h;
                actionMenuView2.getClass();
                C5225k c5225kM569i = ActionMenuView.m569i();
                c5225kM569i.f25570a = true;
                actionMenuView2.addView(c5222h, c5225kM569i);
            }
        } else {
            C5222h c5222h2 = this.f25521h;
            if (c5222h2 != null) {
                ViewParent parent = c5222h2.getParent();
                ActionMenuView actionMenuView3 = this.f25520g;
                if (parent == actionMenuView3) {
                    actionMenuView3.removeView(this.f25521h);
                }
            }
        }
        this.f25520g.setOverflowReserved(this.f25524l);
    }

    /* renamed from: h */
    public final boolean m10243h() {
        MenuC4929i menuC4929i;
        if (!this.f25524l) {
            return false;
        }
        C5220f c5220f = this.f25531t;
        if ((c5220f != null && c5220f.m9881b()) || (menuC4929i = this.f25516c) == null || this.f25520g == null || this.f25533w != null) {
            return false;
        }
        menuC4929i.m9860i();
        if (menuC4929i.f24542j.isEmpty()) {
            return false;
        }
        RunnableC8956c runnableC8956c = new RunnableC8956c(7, this, new C5220f(this, this.f25515b, this.f25516c, this.f25521h), false);
        this.f25533w = runnableC8956c;
        this.f25520g.post(runnableC8956c);
        return true;
    }

    @Override // p012n.InterfaceC4935o
    /* renamed from: i */
    public final boolean mo9878i(MenuItemC4930j menuItemC4930j) {
        return false;
    }

    @Override // p012n.InterfaceC4935o
    /* renamed from: j */
    public final void mo9840j(InterfaceC4934n interfaceC4934n) {
        throw null;
    }

    @Override // p012n.InterfaceC4935o
    /* renamed from: k */
    public final boolean mo9879k(MenuItemC4930j menuItemC4930j) {
        return false;
    }
}
