package androidx.appcompat.view.menu;

import android.content.Context;
import android.graphics.Point;
import android.graphics.Rect;
import android.view.Display;
import android.view.View;
import android.view.WindowManager;
import android.widget.PopupWindow;
import androidx.appcompat.view.menu.InterfaceC1796i;
import p001o.abb;
import p001o.b7e;
import p001o.dv7;

/* renamed from: androidx.appcompat.view.menu.h */
/* loaded from: classes2.dex */
public class C1795h {

    /* renamed from: a */
    public final Context f5657a;

    /* renamed from: b */
    public final C1792e f5658b;

    /* renamed from: c */
    public final boolean f5659c;

    /* renamed from: d */
    public final int f5660d;

    /* renamed from: e */
    public final int f5661e;

    /* renamed from: f */
    public View f5662f;

    /* renamed from: g */
    public int f5663g;

    /* renamed from: h */
    public boolean f5664h;

    /* renamed from: i */
    public InterfaceC1796i.a f5665i;

    /* renamed from: j */
    public abb f5666j;

    /* renamed from: k */
    public PopupWindow.OnDismissListener f5667k;

    /* renamed from: l */
    public final PopupWindow.OnDismissListener f5668l;

    /* renamed from: androidx.appcompat.view.menu.h$a */
    public class a implements PopupWindow.OnDismissListener {
        public a() {
        }

        @Override // android.widget.PopupWindow.OnDismissListener
        public void onDismiss() {
            C1795h.this.mo4099e();
        }
    }

    public C1795h(Context context, C1792e c1792e, View view, boolean z, int i) {
        this(context, c1792e, view, z, i, 0);
    }

    /* renamed from: a */
    public final abb m4095a() {
        Display defaultDisplay = ((WindowManager) this.f5657a.getSystemService("window")).getDefaultDisplay();
        Point point = new Point();
        defaultDisplay.getRealSize(point);
        abb viewOnKeyListenerC1789b = Math.min(point.x, point.y) >= this.f5657a.getResources().getDimensionPixelSize(b7e.abc_cascading_menus_min_smallest_width) ? new ViewOnKeyListenerC1789b(this.f5657a, this.f5662f, this.f5660d, this.f5661e, this.f5659c) : new ViewOnKeyListenerC1798k(this.f5657a, this.f5658b, this.f5662f, this.f5660d, this.f5661e, this.f5659c);
        viewOnKeyListenerC1789b.mo3990l(this.f5658b);
        viewOnKeyListenerC1789b.mo3997v(this.f5668l);
        viewOnKeyListenerC1789b.mo3993q(this.f5662f);
        viewOnKeyListenerC1789b.mo3965d(this.f5665i);
        viewOnKeyListenerC1789b.mo3994s(this.f5664h);
        viewOnKeyListenerC1789b.mo3995t(this.f5663g);
        return viewOnKeyListenerC1789b;
    }

    /* renamed from: b */
    public void m4096b() {
        if (m4098d()) {
            this.f5666j.dismiss();
        }
    }

    /* renamed from: c */
    public abb m4097c() {
        if (this.f5666j == null) {
            this.f5666j = m4095a();
        }
        return this.f5666j;
    }

    /* renamed from: d */
    public boolean m4098d() {
        abb abbVar = this.f5666j;
        return abbVar != null && abbVar.mo3986a();
    }

    /* renamed from: e */
    public void mo4099e() {
        this.f5666j = null;
        PopupWindow.OnDismissListener onDismissListener = this.f5667k;
        if (onDismissListener != null) {
            onDismissListener.onDismiss();
        }
    }

    /* renamed from: f */
    public void m4100f(View view) {
        this.f5662f = view;
    }

    /* renamed from: g */
    public void m4101g(boolean z) {
        this.f5664h = z;
        abb abbVar = this.f5666j;
        if (abbVar != null) {
            abbVar.mo3994s(z);
        }
    }

    /* renamed from: h */
    public void m4102h(int i) {
        this.f5663g = i;
    }

    /* renamed from: i */
    public void m4103i(PopupWindow.OnDismissListener onDismissListener) {
        this.f5667k = onDismissListener;
    }

    /* renamed from: j */
    public void m4104j(InterfaceC1796i.a aVar) {
        this.f5665i = aVar;
        abb abbVar = this.f5666j;
        if (abbVar != null) {
            abbVar.mo3965d(aVar);
        }
    }

    /* renamed from: k */
    public void m4105k() {
        if (!m4107m()) {
            throw new IllegalStateException("MenuPopupHelper cannot be used without an anchor");
        }
    }

    /* renamed from: l */
    public final void m4106l(int i, int i2, boolean z, boolean z2) {
        abb abbVarM4097c = m4097c();
        abbVarM4097c.mo3998w(z2);
        if (z) {
            if ((dv7.m23889b(this.f5663g, this.f5662f.getLayoutDirection()) & 7) == 5) {
                i -= this.f5662f.getWidth();
            }
            abbVarM4097c.mo3996u(i);
            abbVarM4097c.mo3999x(i2);
            int i3 = (int) ((this.f5657a.getResources().getDisplayMetrics().density * 48.0f) / 2.0f);
            abbVarM4097c.m16819r(new Rect(i - i3, i2 - i3, i + i3, i2 + i3));
        }
        abbVarM4097c.show();
    }

    /* renamed from: m */
    public boolean m4107m() {
        if (m4098d()) {
            return true;
        }
        if (this.f5662f == null) {
            return false;
        }
        m4106l(0, 0, false, false);
        return true;
    }

    /* renamed from: n */
    public boolean m4108n(int i, int i2) {
        if (m4098d()) {
            return true;
        }
        if (this.f5662f == null) {
            return false;
        }
        m4106l(i, i2, true, true);
        return true;
    }

    public C1795h(Context context, C1792e c1792e, View view, boolean z, int i, int i2) {
        this.f5663g = 8388611;
        this.f5668l = new a();
        this.f5657a = context;
        this.f5658b = c1792e;
        this.f5662f = view;
        this.f5659c = z;
        this.f5660d = i;
        this.f5661e = i2;
    }
}
