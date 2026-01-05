package androidx.appcompat.view.menu;

import android.R;
import android.content.Context;
import android.content.res.Resources;
import android.os.Parcelable;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.ListView;
import android.widget.PopupWindow;
import android.widget.TextView;
import androidx.appcompat.view.menu.InterfaceC1796i;
import androidx.appcompat.widget.MenuPopupWindow;
import java.lang.reflect.InvocationTargetException;
import p001o.abb;
import p001o.b7e;
import p001o.g9e;

/* renamed from: androidx.appcompat.view.menu.k */
/* loaded from: classes2.dex */
public final class ViewOnKeyListenerC1798k extends abb implements PopupWindow.OnDismissListener, View.OnKeyListener {
    public static final int j0 = g9e.abc_popup_menu_item_layout;

    /* renamed from: H */
    public View f5670H;

    /* renamed from: L */
    public View f5671L;

    /* renamed from: M */
    public InterfaceC1796i.a f5672M;

    /* renamed from: Q */
    public ViewTreeObserver f5673Q;

    /* renamed from: X */
    public boolean f5674X;

    /* renamed from: Y */
    public boolean f5675Y;

    /* renamed from: Z */
    public int f5676Z;

    /* renamed from: b */
    public final Context f5677b;

    /* renamed from: c */
    public final C1792e f5678c;

    /* renamed from: d */
    public final C1791d f5679d;

    /* renamed from: e */
    public final boolean f5680e;

    /* renamed from: f */
    public final int f5681f;

    /* renamed from: g */
    public final int f5682g;

    /* renamed from: h */
    public final int f5683h;
    public boolean i0;

    /* renamed from: q */
    public final MenuPopupWindow f5684q;

    /* renamed from: y */
    public PopupWindow.OnDismissListener f5687y;

    /* renamed from: s */
    public final ViewTreeObserver.OnGlobalLayoutListener f5685s = new a();

    /* renamed from: x */
    public final View.OnAttachStateChangeListener f5686x = new b();
    public int h0 = 0;

    /* renamed from: androidx.appcompat.view.menu.k$a */
    public class a implements ViewTreeObserver.OnGlobalLayoutListener {
        public a() {
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
            if (!ViewOnKeyListenerC1798k.this.mo3986a() || ViewOnKeyListenerC1798k.this.f5684q.m4282A()) {
                return;
            }
            View view = ViewOnKeyListenerC1798k.this.f5671L;
            if (view == null || !view.isShown()) {
                ViewOnKeyListenerC1798k.this.dismiss();
            } else {
                ViewOnKeyListenerC1798k.this.f5684q.show();
            }
        }
    }

    /* renamed from: androidx.appcompat.view.menu.k$b */
    public class b implements View.OnAttachStateChangeListener {
        public b() {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
            ViewTreeObserver viewTreeObserver = ViewOnKeyListenerC1798k.this.f5673Q;
            if (viewTreeObserver != null) {
                if (!viewTreeObserver.isAlive()) {
                    ViewOnKeyListenerC1798k.this.f5673Q = view.getViewTreeObserver();
                }
                ViewOnKeyListenerC1798k viewOnKeyListenerC1798k = ViewOnKeyListenerC1798k.this;
                viewOnKeyListenerC1798k.f5673Q.removeGlobalOnLayoutListener(viewOnKeyListenerC1798k.f5685s);
            }
            view.removeOnAttachStateChangeListener(this);
        }
    }

    public ViewOnKeyListenerC1798k(Context context, C1792e c1792e, View view, int i, int i2, boolean z) {
        this.f5677b = context;
        this.f5678c = c1792e;
        this.f5680e = z;
        this.f5679d = new C1791d(c1792e, LayoutInflater.from(context), z, j0);
        this.f5682g = i;
        this.f5683h = i2;
        Resources resources = context.getResources();
        this.f5681f = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(b7e.abc_config_prefDialogWidth));
        this.f5670H = view;
        this.f5684q = new MenuPopupWindow(context, null, i, i2);
        c1792e.m4042c(this, context);
    }

    /* renamed from: A */
    public final boolean m4109A() throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        View view;
        if (mo3986a()) {
            return true;
        }
        if (this.f5674X || (view = this.f5670H) == null) {
            return false;
        }
        this.f5671L = view;
        this.f5684q.m4291J(this);
        this.f5684q.m4292K(this);
        this.f5684q.m4290I(true);
        View view2 = this.f5671L;
        boolean z = this.f5673Q == null;
        ViewTreeObserver viewTreeObserver = view2.getViewTreeObserver();
        this.f5673Q = viewTreeObserver;
        if (z) {
            viewTreeObserver.addOnGlobalLayoutListener(this.f5685s);
        }
        view2.addOnAttachStateChangeListener(this.f5686x);
        this.f5684q.m4284C(view2);
        this.f5684q.m4287F(this.h0);
        if (!this.f5675Y) {
            this.f5676Z = abb.m16815p(this.f5679d, null, this.f5677b, this.f5681f);
            this.f5675Y = true;
        }
        this.f5684q.m4286E(this.f5676Z);
        this.f5684q.m4289H(2);
        this.f5684q.m4288G(m16818n());
        this.f5684q.show();
        ListView listViewMo3992o = this.f5684q.mo3992o();
        listViewMo3992o.setOnKeyListener(this);
        if (this.i0 && this.f5678c.m4064z() != null) {
            FrameLayout frameLayout = (FrameLayout) LayoutInflater.from(this.f5677b).inflate(g9e.abc_popup_menu_header_item_layout, (ViewGroup) listViewMo3992o, false);
            TextView textView = (TextView) frameLayout.findViewById(R.id.title);
            if (textView != null) {
                textView.setText(this.f5678c.m4064z());
            }
            frameLayout.setEnabled(false);
            listViewMo3992o.addHeaderView(frameLayout, null, false);
        }
        this.f5684q.mo4230m(this.f5679d);
        this.f5684q.show();
        return true;
    }

    @Override // p001o.brf
    /* renamed from: a */
    public boolean mo3986a() {
        return !this.f5674X && this.f5684q.mo3986a();
    }

    @Override // androidx.appcompat.view.menu.InterfaceC1796i
    /* renamed from: b */
    public void mo3963b(C1792e c1792e, boolean z) {
        if (c1792e != this.f5678c) {
            return;
        }
        dismiss();
        InterfaceC1796i.a aVar = this.f5672M;
        if (aVar != null) {
            aVar.mo3835b(c1792e, z);
        }
    }

    @Override // androidx.appcompat.view.menu.InterfaceC1796i
    /* renamed from: d */
    public void mo3965d(InterfaceC1796i.a aVar) {
        this.f5672M = aVar;
    }

    @Override // p001o.brf
    public void dismiss() {
        if (mo3986a()) {
            this.f5684q.dismiss();
        }
    }

    @Override // androidx.appcompat.view.menu.InterfaceC1796i
    /* renamed from: e */
    public void mo3987e(Parcelable parcelable) {
    }

    @Override // androidx.appcompat.view.menu.InterfaceC1796i
    /* renamed from: f */
    public boolean mo3966f(SubMenuC1799l subMenuC1799l) {
        if (subMenuC1799l.hasVisibleItems()) {
            C1795h c1795h = new C1795h(this.f5677b, subMenuC1799l, this.f5671L, this.f5680e, this.f5682g, this.f5683h);
            c1795h.m4104j(this.f5672M);
            c1795h.m4101g(abb.m16816y(subMenuC1799l));
            c1795h.m4103i(this.f5687y);
            this.f5687y = null;
            this.f5678c.m4044e(false);
            int iM4300c = this.f5684q.m4300c();
            int iM4304l = this.f5684q.m4304l();
            if ((Gravity.getAbsoluteGravity(this.h0, this.f5670H.getLayoutDirection()) & 7) == 5) {
                iM4300c += this.f5670H.getWidth();
            }
            if (c1795h.m4108n(iM4300c, iM4304l)) {
                InterfaceC1796i.a aVar = this.f5672M;
                if (aVar == null) {
                    return true;
                }
                aVar.mo3836c(subMenuC1799l);
                return true;
            }
        }
        return false;
    }

    @Override // androidx.appcompat.view.menu.InterfaceC1796i
    /* renamed from: g */
    public Parcelable mo3988g() {
        return null;
    }

    @Override // androidx.appcompat.view.menu.InterfaceC1796i
    /* renamed from: h */
    public void mo3967h(boolean z) {
        this.f5675Y = false;
        C1791d c1791d = this.f5679d;
        if (c1791d != null) {
            c1791d.notifyDataSetChanged();
        }
    }

    @Override // androidx.appcompat.view.menu.InterfaceC1796i
    /* renamed from: i */
    public boolean mo3989i() {
        return false;
    }

    @Override // p001o.abb
    /* renamed from: l */
    public void mo3990l(C1792e c1792e) {
    }

    @Override // p001o.brf
    /* renamed from: o */
    public ListView mo3992o() {
        return this.f5684q.mo3992o();
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public void onDismiss() {
        this.f5674X = true;
        this.f5678c.close();
        ViewTreeObserver viewTreeObserver = this.f5673Q;
        if (viewTreeObserver != null) {
            if (!viewTreeObserver.isAlive()) {
                this.f5673Q = this.f5671L.getViewTreeObserver();
            }
            this.f5673Q.removeGlobalOnLayoutListener(this.f5685s);
            this.f5673Q = null;
        }
        this.f5671L.removeOnAttachStateChangeListener(this.f5686x);
        PopupWindow.OnDismissListener onDismissListener = this.f5687y;
        if (onDismissListener != null) {
            onDismissListener.onDismiss();
        }
    }

    @Override // android.view.View.OnKeyListener
    public boolean onKey(View view, int i, KeyEvent keyEvent) {
        if (keyEvent.getAction() != 1 || i != 82) {
            return false;
        }
        dismiss();
        return true;
    }

    @Override // p001o.abb
    /* renamed from: q */
    public void mo3993q(View view) {
        this.f5670H = view;
    }

    @Override // p001o.abb
    /* renamed from: s */
    public void mo3994s(boolean z) {
        this.f5679d.m4012d(z);
    }

    @Override // p001o.brf
    public void show() {
        if (!m4109A()) {
            throw new IllegalStateException("StandardMenuPopup cannot be used without an anchor");
        }
    }

    @Override // p001o.abb
    /* renamed from: t */
    public void mo3995t(int i) {
        this.h0 = i;
    }

    @Override // p001o.abb
    /* renamed from: u */
    public void mo3996u(int i) {
        this.f5684q.m4301e(i);
    }

    @Override // p001o.abb
    /* renamed from: v */
    public void mo3997v(PopupWindow.OnDismissListener onDismissListener) {
        this.f5687y = onDismissListener;
    }

    @Override // p001o.abb
    /* renamed from: w */
    public void mo3998w(boolean z) {
        this.i0 = z;
    }

    @Override // p001o.abb
    /* renamed from: x */
    public void mo3999x(int i) {
        this.f5684q.m4303i(i);
    }
}
