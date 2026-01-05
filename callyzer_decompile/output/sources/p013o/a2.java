package p013o;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.appcompat.widget.Toolbar;
import java.util.ArrayList;
import p012n.InterfaceC4935o;
import p012n.MenuC4929i;
import p012n.MenuItemC4930j;
import p012n.SubMenuC4939s;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class a2 implements InterfaceC4935o {

    /* renamed from: a */
    public MenuC4929i f25436a;

    /* renamed from: b */
    public MenuItemC4930j f25437b;

    /* renamed from: c */
    public final /* synthetic */ Toolbar f25438c;

    public a2(Toolbar toolbar) {
        this.f25438c = toolbar;
    }

    @Override // p012n.InterfaceC4935o
    /* renamed from: b */
    public final void mo9877b(Context context, MenuC4929i menuC4929i) {
        MenuItemC4930j menuItemC4930j;
        MenuC4929i menuC4929i2 = this.f25436a;
        if (menuC4929i2 != null && (menuItemC4930j = this.f25437b) != null) {
            menuC4929i2.mo9855d(menuItemC4930j);
        }
        this.f25436a = menuC4929i;
    }

    @Override // p012n.InterfaceC4935o
    /* renamed from: c */
    public final boolean mo9834c(SubMenuC4939s subMenuC4939s) {
        return false;
    }

    @Override // p012n.InterfaceC4935o
    /* renamed from: d */
    public final boolean mo9835d() {
        return false;
    }

    @Override // p012n.InterfaceC4935o
    /* renamed from: g */
    public final void mo9838g() {
        if (this.f25437b != null) {
            MenuC4929i menuC4929i = this.f25436a;
            if (menuC4929i != null) {
                int size = menuC4929i.f24538f.size();
                for (int i10 = 0; i10 < size; i10++) {
                    if (this.f25436a.getItem(i10) == this.f25437b) {
                        return;
                    }
                }
            }
            mo9879k(this.f25437b);
        }
    }

    @Override // p012n.InterfaceC4935o
    /* renamed from: i */
    public final boolean mo9878i(MenuItemC4930j menuItemC4930j) {
        Toolbar toolbar = this.f25438c;
        toolbar.m582c();
        ViewParent parent = toolbar.f1796h.getParent();
        if (parent != toolbar) {
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(toolbar.f1796h);
            }
            toolbar.addView(toolbar.f1796h);
        }
        View view = menuItemC4930j.f24580z;
        if (view == null) {
            view = null;
        }
        toolbar.f1797j = view;
        this.f25437b = menuItemC4930j;
        ViewParent parent2 = view.getParent();
        if (parent2 != toolbar) {
            if (parent2 instanceof ViewGroup) {
                ((ViewGroup) parent2).removeView(toolbar.f1797j);
            }
            b2 b2VarM576g = Toolbar.m576g();
            b2VarM576g.f25460a = (toolbar.f1802p & 112) | 8388611;
            b2VarM576g.f25461b = 2;
            toolbar.f1797j.setLayoutParams(b2VarM576g);
            toolbar.addView(toolbar.f1797j);
        }
        for (int childCount = toolbar.getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = toolbar.getChildAt(childCount);
            if (((b2) childAt.getLayoutParams()).f25461b != 2 && childAt != toolbar.f1789a) {
                toolbar.removeViewAt(childCount);
                toolbar.f1781I.add(childAt);
            }
        }
        toolbar.requestLayout();
        menuItemC4930j.f24554B = true;
        menuItemC4930j.f24568n.m9866o(false);
        toolbar.m594s();
        return true;
    }

    @Override // p012n.InterfaceC4935o
    /* renamed from: k */
    public final boolean mo9879k(MenuItemC4930j menuItemC4930j) {
        Toolbar toolbar = this.f25438c;
        toolbar.removeView(toolbar.f1797j);
        toolbar.removeView(toolbar.f1796h);
        toolbar.f1797j = null;
        ArrayList arrayList = toolbar.f1781I;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            toolbar.addView((View) arrayList.get(size));
        }
        arrayList.clear();
        this.f25437b = null;
        toolbar.requestLayout();
        menuItemC4930j.f24554B = false;
        menuItemC4930j.f24568n.m9866o(false);
        toolbar.m594s();
        return true;
    }

    @Override // p012n.InterfaceC4935o
    /* renamed from: a */
    public final void mo9833a(MenuC4929i menuC4929i, boolean z6) {
    }
}
