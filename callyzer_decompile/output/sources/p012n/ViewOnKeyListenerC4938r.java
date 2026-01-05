package p012n;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.ListView;
import android.widget.PopupWindow;
import android.widget.TextView;
import com.websoptimization.callyzerbiz.R;
import p013o.C5238x;
import p013o.n1;
import p013o.o1;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: n.r */
/* loaded from: classes.dex */
public final class ViewOnKeyListenerC4938r extends AbstractC4931k implements PopupWindow.OnDismissListener, View.OnKeyListener {

    /* renamed from: b */
    public final Context f24594b;

    /* renamed from: c */
    public final MenuC4929i f24595c;

    /* renamed from: d */
    public final C4927g f24596d;

    /* renamed from: e */
    public final boolean f24597e;

    /* renamed from: f */
    public final int f24598f;

    /* renamed from: g */
    public final int f24599g;

    /* renamed from: h */
    public final o1 f24600h;

    /* renamed from: j */
    public final ViewTreeObserverOnGlobalLayoutListenerC4923c f24601j;

    /* renamed from: k */
    public final ViewOnAttachStateChangeListenerC4924d f24602k;

    /* renamed from: l */
    public PopupWindow.OnDismissListener f24603l;

    /* renamed from: m */
    public View f24604m;

    /* renamed from: n */
    public View f24605n;

    /* renamed from: p */
    public InterfaceC4934n f24606p;

    /* renamed from: q */
    public ViewTreeObserver f24607q;

    /* renamed from: r */
    public boolean f24608r;

    /* renamed from: s */
    public boolean f24609s;

    /* renamed from: t */
    public int f24610t;

    /* renamed from: v */
    public int f24611v = 0;

    /* renamed from: w */
    public boolean f24612w;

    public ViewOnKeyListenerC4938r(Context context, MenuC4929i menuC4929i, View view, int i10, boolean z6) {
        int i11 = 1;
        this.f24601j = new ViewTreeObserverOnGlobalLayoutListenerC4923c(this, i11);
        this.f24602k = new ViewOnAttachStateChangeListenerC4924d(i11, this);
        this.f24594b = context;
        this.f24595c = menuC4929i;
        this.f24597e = z6;
        this.f24596d = new C4927g(menuC4929i, LayoutInflater.from(context), z6, R.layout.abc_popup_menu_item_layout);
        this.f24599g = i10;
        Resources resources = context.getResources();
        this.f24598f = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(R.dimen.abc_config_prefDialogWidth));
        this.f24604m = view;
        this.f24600h = new o1(context, i10);
        menuC4929i.m9853b(this, context);
    }

    @Override // p012n.InterfaceC4935o
    /* renamed from: a */
    public final void mo9833a(MenuC4929i menuC4929i, boolean z6) {
        if (menuC4929i != this.f24595c) {
            return;
        }
        dismiss();
        InterfaceC4934n interfaceC4934n = this.f24606p;
        if (interfaceC4934n != null) {
            interfaceC4934n.mo393a(menuC4929i, z6);
        }
    }

    @Override // p012n.InterfaceC4935o
    /* renamed from: c */
    public final boolean mo9834c(SubMenuC4939s subMenuC4939s) {
        boolean z6;
        if (subMenuC4939s.hasVisibleItems()) {
            C4933m c4933m = new C4933m(this.f24594b, subMenuC4939s, this.f24605n, this.f24597e, this.f24599g, 0);
            InterfaceC4934n interfaceC4934n = this.f24606p;
            c4933m.f24590h = interfaceC4934n;
            AbstractC4931k abstractC4931k = c4933m.f24591i;
            if (abstractC4931k != null) {
                abstractC4931k.mo9840j(interfaceC4934n);
            }
            int size = subMenuC4939s.f24538f.size();
            int i10 = 0;
            while (true) {
                if (i10 >= size) {
                    z6 = false;
                    break;
                }
                MenuItem item = subMenuC4939s.getItem(i10);
                if (item.isVisible() && item.getIcon() != null) {
                    z6 = true;
                    break;
                }
                i10++;
            }
            c4933m.f24589g = z6;
            AbstractC4931k abstractC4931k2 = c4933m.f24591i;
            if (abstractC4931k2 != null) {
                abstractC4931k2.mo9843o(z6);
            }
            c4933m.f24592j = this.f24603l;
            this.f24603l = null;
            this.f24595c.m9854c(false);
            o1 o1Var = this.f24600h;
            int width = o1Var.f25551e;
            int i11 = !o1Var.f25553g ? 0 : o1Var.f25552f;
            if ((Gravity.getAbsoluteGravity(this.f24611v, this.f24604m.getLayoutDirection()) & 7) == 5) {
                width += this.f24604m.getWidth();
            }
            if (!c4933m.m9881b()) {
                if (c4933m.f24587e != null) {
                    c4933m.m9883d(width, i11, true, true);
                }
            }
            InterfaceC4934n interfaceC4934n2 = this.f24606p;
            if (interfaceC4934n2 != null) {
                interfaceC4934n2.mo397f(subMenuC4939s);
            }
            return true;
        }
        return false;
    }

    @Override // p012n.InterfaceC4935o
    /* renamed from: d */
    public final boolean mo9835d() {
        return false;
    }

    @Override // p012n.InterfaceC4937q
    public final void dismiss() {
        if (mo9836e()) {
            this.f24600h.dismiss();
        }
    }

    @Override // p012n.InterfaceC4937q
    /* renamed from: e */
    public final boolean mo9836e() {
        return !this.f24608r && this.f24600h.f25568y.isShowing();
    }

    @Override // p012n.InterfaceC4937q
    /* renamed from: f */
    public final void mo9837f() {
        View view;
        if (mo9836e()) {
            return;
        }
        if (this.f24608r || (view = this.f24604m) == null) {
            throw new IllegalStateException("StandardMenuPopup cannot be used without an anchor");
        }
        this.f24605n = view;
        o1 o1Var = this.f24600h;
        C5238x c5238x = o1Var.f25568y;
        C5238x c5238x2 = o1Var.f25568y;
        c5238x.setOnDismissListener(this);
        o1Var.f25559n = this;
        o1Var.f25567x = true;
        c5238x2.setFocusable(true);
        View view2 = this.f24605n;
        boolean z6 = this.f24607q == null;
        ViewTreeObserver viewTreeObserver = view2.getViewTreeObserver();
        this.f24607q = viewTreeObserver;
        if (z6) {
            viewTreeObserver.addOnGlobalLayoutListener(this.f24601j);
        }
        view2.addOnAttachStateChangeListener(this.f24602k);
        o1Var.f25558m = view2;
        o1Var.f25556k = this.f24611v;
        boolean z10 = this.f24609s;
        Context context = this.f24594b;
        C4927g c4927g = this.f24596d;
        if (!z10) {
            this.f24610t = AbstractC4931k.m9876m(c4927g, context, this.f24598f);
            this.f24609s = true;
        }
        int i10 = this.f24610t;
        Rect rect = o1Var.f25565v;
        Drawable background = c5238x2.getBackground();
        if (background != null) {
            background.getPadding(rect);
            o1Var.f25550d = rect.left + rect.right + i10;
        } else {
            o1Var.f25550d = i10;
        }
        c5238x2.setInputMethodMode(2);
        Rect rect2 = this.f24581a;
        o1Var.f25566w = rect2 != null ? new Rect(rect2) : null;
        o1Var.mo9837f();
        n1 n1Var = o1Var.f25549c;
        n1Var.setOnKeyListener(this);
        if (this.f24612w) {
            MenuC4929i menuC4929i = this.f24595c;
            if (menuC4929i.f24544l != null) {
                FrameLayout frameLayout = (FrameLayout) LayoutInflater.from(context).inflate(R.layout.abc_popup_menu_header_item_layout, (ViewGroup) n1Var, false);
                TextView textView = (TextView) frameLayout.findViewById(android.R.id.title);
                if (textView != null) {
                    textView.setText(menuC4929i.f24544l);
                }
                frameLayout.setEnabled(false);
                n1Var.addHeaderView(frameLayout, null, false);
            }
        }
        o1Var.m10248a(c4927g);
        o1Var.mo9837f();
    }

    @Override // p012n.InterfaceC4935o
    /* renamed from: g */
    public final void mo9838g() {
        this.f24609s = false;
        C4927g c4927g = this.f24596d;
        if (c4927g != null) {
            c4927g.notifyDataSetChanged();
        }
    }

    @Override // p012n.InterfaceC4937q
    /* renamed from: h */
    public final ListView mo9839h() {
        return this.f24600h.f25549c;
    }

    @Override // p012n.InterfaceC4935o
    /* renamed from: j */
    public final void mo9840j(InterfaceC4934n interfaceC4934n) {
        this.f24606p = interfaceC4934n;
    }

    @Override // p012n.AbstractC4931k
    /* renamed from: n */
    public final void mo9842n(View view) {
        this.f24604m = view;
    }

    @Override // p012n.AbstractC4931k
    /* renamed from: o */
    public final void mo9843o(boolean z6) {
        this.f24596d.f24528c = z6;
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        this.f24608r = true;
        this.f24595c.m9854c(true);
        ViewTreeObserver viewTreeObserver = this.f24607q;
        if (viewTreeObserver != null) {
            if (!viewTreeObserver.isAlive()) {
                this.f24607q = this.f24605n.getViewTreeObserver();
            }
            this.f24607q.removeGlobalOnLayoutListener(this.f24601j);
            this.f24607q = null;
        }
        this.f24605n.removeOnAttachStateChangeListener(this.f24602k);
        PopupWindow.OnDismissListener onDismissListener = this.f24603l;
        if (onDismissListener != null) {
            onDismissListener.onDismiss();
        }
    }

    @Override // android.view.View.OnKeyListener
    public final boolean onKey(View view, int i10, KeyEvent keyEvent) {
        if (keyEvent.getAction() != 1 || i10 != 82) {
            return false;
        }
        dismiss();
        return true;
    }

    @Override // p012n.AbstractC4931k
    /* renamed from: p */
    public final void mo9844p(int i10) {
        this.f24611v = i10;
    }

    @Override // p012n.AbstractC4931k
    /* renamed from: q */
    public final void mo9845q(int i10) {
        this.f24600h.f25551e = i10;
    }

    @Override // p012n.AbstractC4931k
    /* renamed from: r */
    public final void mo9846r(PopupWindow.OnDismissListener onDismissListener) {
        this.f24603l = onDismissListener;
    }

    @Override // p012n.AbstractC4931k
    /* renamed from: s */
    public final void mo9847s(boolean z6) {
        this.f24612w = z6;
    }

    @Override // p012n.AbstractC4931k
    /* renamed from: t */
    public final void mo9848t(int i10) {
        o1 o1Var = this.f24600h;
        o1Var.f25552f = i10;
        o1Var.f25553g = true;
    }

    @Override // p012n.AbstractC4931k
    /* renamed from: l */
    public final void mo9841l(MenuC4929i menuC4929i) {
    }
}
