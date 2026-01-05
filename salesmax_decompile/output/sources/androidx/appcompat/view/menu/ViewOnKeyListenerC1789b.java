package androidx.appcompat.view.menu;

import android.R;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.os.Build;
import android.os.Handler;
import android.os.Parcelable;
import android.os.SystemClock;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.PopupWindow;
import android.widget.TextView;
import androidx.appcompat.view.menu.InterfaceC1796i;
import androidx.appcompat.widget.MenuPopupWindow;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p001o.abb;
import p001o.b7e;
import p001o.dv7;
import p001o.g9e;
import p001o.yab;

/* renamed from: androidx.appcompat.view.menu.b */
/* loaded from: classes2.dex */
public final class ViewOnKeyListenerC1789b extends abb implements View.OnKeyListener, PopupWindow.OnDismissListener {
    public static final int p0 = g9e.abc_cascading_menu_item_layout;

    /* renamed from: M */
    public View f5550M;

    /* renamed from: Q */
    public View f5551Q;

    /* renamed from: Y */
    public boolean f5553Y;

    /* renamed from: Z */
    public boolean f5554Z;

    /* renamed from: b */
    public final Context f5555b;

    /* renamed from: c */
    public final int f5556c;

    /* renamed from: d */
    public final int f5557d;

    /* renamed from: e */
    public final int f5558e;

    /* renamed from: f */
    public final boolean f5559f;

    /* renamed from: g */
    public final Handler f5560g;
    public int h0;
    public int i0;
    public boolean k0;
    public InterfaceC1796i.a l0;
    public ViewTreeObserver m0;
    public PopupWindow.OnDismissListener n0;
    public boolean o0;

    /* renamed from: h */
    public final List f5561h = new ArrayList();

    /* renamed from: q */
    public final List f5562q = new ArrayList();

    /* renamed from: s */
    public final ViewTreeObserver.OnGlobalLayoutListener f5563s = new a();

    /* renamed from: x */
    public final View.OnAttachStateChangeListener f5564x = new b();

    /* renamed from: y */
    public final yab f5565y = new c();

    /* renamed from: H */
    public int f5548H = 0;

    /* renamed from: L */
    public int f5549L = 0;
    public boolean j0 = false;

    /* renamed from: X */
    public int f5552X = m3983E();

    /* renamed from: androidx.appcompat.view.menu.b$a */
    public class a implements ViewTreeObserver.OnGlobalLayoutListener {
        public a() {
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
            if (!ViewOnKeyListenerC1789b.this.mo3986a() || ViewOnKeyListenerC1789b.this.f5562q.size() <= 0 || ((d) ViewOnKeyListenerC1789b.this.f5562q.get(0)).f5573a.m4282A()) {
                return;
            }
            View view = ViewOnKeyListenerC1789b.this.f5551Q;
            if (view == null || !view.isShown()) {
                ViewOnKeyListenerC1789b.this.dismiss();
                return;
            }
            Iterator it = ViewOnKeyListenerC1789b.this.f5562q.iterator();
            while (it.hasNext()) {
                ((d) it.next()).f5573a.show();
            }
        }
    }

    /* renamed from: androidx.appcompat.view.menu.b$b */
    public class b implements View.OnAttachStateChangeListener {
        public b() {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
            ViewTreeObserver viewTreeObserver = ViewOnKeyListenerC1789b.this.m0;
            if (viewTreeObserver != null) {
                if (!viewTreeObserver.isAlive()) {
                    ViewOnKeyListenerC1789b.this.m0 = view.getViewTreeObserver();
                }
                ViewOnKeyListenerC1789b viewOnKeyListenerC1789b = ViewOnKeyListenerC1789b.this;
                viewOnKeyListenerC1789b.m0.removeGlobalOnLayoutListener(viewOnKeyListenerC1789b.f5563s);
            }
            view.removeOnAttachStateChangeListener(this);
        }
    }

    /* renamed from: androidx.appcompat.view.menu.b$c */
    public class c implements yab {

        /* renamed from: androidx.appcompat.view.menu.b$c$a */
        public class a implements Runnable {

            /* renamed from: a */
            public final /* synthetic */ d f5569a;

            /* renamed from: b */
            public final /* synthetic */ MenuItem f5570b;

            /* renamed from: c */
            public final /* synthetic */ C1792e f5571c;

            public a(d dVar, MenuItem menuItem, C1792e c1792e) {
                this.f5569a = dVar;
                this.f5570b = menuItem;
                this.f5571c = c1792e;
            }

            @Override // java.lang.Runnable
            public void run() {
                d dVar = this.f5569a;
                if (dVar != null) {
                    ViewOnKeyListenerC1789b.this.o0 = true;
                    dVar.f5574b.m4044e(false);
                    ViewOnKeyListenerC1789b.this.o0 = false;
                }
                if (this.f5570b.isEnabled() && this.f5570b.hasSubMenu()) {
                    this.f5571c.m4028O(this.f5570b, 4);
                }
            }
        }

        public c() {
        }

        @Override // p001o.yab
        /* renamed from: d */
        public void mo4000d(C1792e c1792e, MenuItem menuItem) {
            ViewOnKeyListenerC1789b.this.f5560g.removeCallbacksAndMessages(null);
            int size = ViewOnKeyListenerC1789b.this.f5562q.size();
            int i = 0;
            while (true) {
                if (i >= size) {
                    i = -1;
                    break;
                } else if (c1792e == ((d) ViewOnKeyListenerC1789b.this.f5562q.get(i)).f5574b) {
                    break;
                } else {
                    i++;
                }
            }
            if (i == -1) {
                return;
            }
            int i2 = i + 1;
            ViewOnKeyListenerC1789b.this.f5560g.postAtTime(new a(i2 < ViewOnKeyListenerC1789b.this.f5562q.size() ? (d) ViewOnKeyListenerC1789b.this.f5562q.get(i2) : null, menuItem, c1792e), c1792e, SystemClock.uptimeMillis() + 200);
        }

        @Override // p001o.yab
        /* renamed from: n */
        public void mo4001n(C1792e c1792e, MenuItem menuItem) {
            ViewOnKeyListenerC1789b.this.f5560g.removeCallbacksAndMessages(c1792e);
        }
    }

    /* renamed from: androidx.appcompat.view.menu.b$d */
    public static class d {

        /* renamed from: a */
        public final MenuPopupWindow f5573a;

        /* renamed from: b */
        public final C1792e f5574b;

        /* renamed from: c */
        public final int f5575c;

        public d(MenuPopupWindow menuPopupWindow, C1792e c1792e, int i) {
            this.f5573a = menuPopupWindow;
            this.f5574b = c1792e;
            this.f5575c = i;
        }

        /* renamed from: a */
        public ListView m4002a() {
            return this.f5573a.mo3992o();
        }
    }

    public ViewOnKeyListenerC1789b(Context context, View view, int i, int i2, boolean z) {
        this.f5555b = context;
        this.f5550M = view;
        this.f5557d = i;
        this.f5558e = i2;
        this.f5559f = z;
        Resources resources = context.getResources();
        this.f5556c = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(b7e.abc_config_prefDialogWidth));
        this.f5560g = new Handler();
    }

    /* renamed from: A */
    public final MenuPopupWindow m3979A() {
        MenuPopupWindow menuPopupWindow = new MenuPopupWindow(this.f5555b, null, this.f5557d, this.f5558e);
        menuPopupWindow.m4321T(this.f5565y);
        menuPopupWindow.m4292K(this);
        menuPopupWindow.m4291J(this);
        menuPopupWindow.m4284C(this.f5550M);
        menuPopupWindow.m4287F(this.f5549L);
        menuPopupWindow.m4290I(true);
        menuPopupWindow.m4289H(2);
        return menuPopupWindow;
    }

    /* renamed from: B */
    public final int m3980B(C1792e c1792e) {
        int size = this.f5562q.size();
        for (int i = 0; i < size; i++) {
            if (c1792e == ((d) this.f5562q.get(i)).f5574b) {
                return i;
            }
        }
        return -1;
    }

    /* renamed from: C */
    public final MenuItem m3981C(C1792e c1792e, C1792e c1792e2) {
        int size = c1792e.size();
        for (int i = 0; i < size; i++) {
            MenuItem item = c1792e.getItem(i);
            if (item.hasSubMenu() && c1792e2 == item.getSubMenu()) {
                return item;
            }
        }
        return null;
    }

    /* renamed from: D */
    public final View m3982D(d dVar, C1792e c1792e) {
        C1791d c1791d;
        int headersCount;
        int firstVisiblePosition;
        MenuItem menuItemM3981C = m3981C(dVar.f5574b, c1792e);
        if (menuItemM3981C == null) {
            return null;
        }
        ListView listViewM4002a = dVar.m4002a();
        ListAdapter adapter = listViewM4002a.getAdapter();
        int i = 0;
        if (adapter instanceof HeaderViewListAdapter) {
            HeaderViewListAdapter headerViewListAdapter = (HeaderViewListAdapter) adapter;
            headersCount = headerViewListAdapter.getHeadersCount();
            c1791d = (C1791d) headerViewListAdapter.getWrappedAdapter();
        } else {
            c1791d = (C1791d) adapter;
            headersCount = 0;
        }
        int count = c1791d.getCount();
        while (true) {
            if (i >= count) {
                i = -1;
                break;
            }
            if (menuItemM3981C == c1791d.getItem(i)) {
                break;
            }
            i++;
        }
        if (i != -1 && (firstVisiblePosition = (i + headersCount) - listViewM4002a.getFirstVisiblePosition()) >= 0 && firstVisiblePosition < listViewM4002a.getChildCount()) {
            return listViewM4002a.getChildAt(firstVisiblePosition);
        }
        return null;
    }

    /* renamed from: E */
    public final int m3983E() {
        return this.f5550M.getLayoutDirection() == 1 ? 0 : 1;
    }

    /* renamed from: F */
    public final int m3984F(int i) {
        List list = this.f5562q;
        ListView listViewM4002a = ((d) list.get(list.size() - 1)).m4002a();
        int[] iArr = new int[2];
        listViewM4002a.getLocationOnScreen(iArr);
        Rect rect = new Rect();
        this.f5551Q.getWindowVisibleDisplayFrame(rect);
        return this.f5552X == 1 ? (iArr[0] + listViewM4002a.getWidth()) + i > rect.right ? 0 : 1 : iArr[0] - i < 0 ? 1 : 0;
    }

    /* renamed from: G */
    public final void m3985G(C1792e c1792e) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        d dVar;
        View viewM3982D;
        int i;
        int i2;
        int i3;
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(this.f5555b);
        C1791d c1791d = new C1791d(c1792e, layoutInflaterFrom, this.f5559f, p0);
        if (!mo3986a() && this.j0) {
            c1791d.m4012d(true);
        } else if (mo3986a()) {
            c1791d.m4012d(abb.m16816y(c1792e));
        }
        int iM16815p = abb.m16815p(c1791d, null, this.f5555b, this.f5556c);
        MenuPopupWindow menuPopupWindowM3979A = m3979A();
        menuPopupWindowM3979A.mo4230m(c1791d);
        menuPopupWindowM3979A.m4286E(iM16815p);
        menuPopupWindowM3979A.m4287F(this.f5549L);
        if (this.f5562q.size() > 0) {
            List list = this.f5562q;
            dVar = (d) list.get(list.size() - 1);
            viewM3982D = m3982D(dVar, c1792e);
        } else {
            dVar = null;
            viewM3982D = null;
        }
        if (viewM3982D != null) {
            menuPopupWindowM3979A.m4322U(false);
            menuPopupWindowM3979A.m4319R(null);
            int iM3984F = m3984F(iM16815p);
            boolean z = iM3984F == 1;
            this.f5552X = iM3984F;
            if (Build.VERSION.SDK_INT >= 26) {
                menuPopupWindowM3979A.m4284C(viewM3982D);
                i2 = 0;
                i = 0;
            } else {
                int[] iArr = new int[2];
                this.f5550M.getLocationOnScreen(iArr);
                int[] iArr2 = new int[2];
                viewM3982D.getLocationOnScreen(iArr2);
                if ((this.f5549L & 7) == 5) {
                    iArr[0] = iArr[0] + this.f5550M.getWidth();
                    iArr2[0] = iArr2[0] + viewM3982D.getWidth();
                }
                i = iArr2[0] - iArr[0];
                i2 = iArr2[1] - iArr[1];
            }
            if ((this.f5549L & 5) == 5) {
                if (!z) {
                    iM16815p = viewM3982D.getWidth();
                    i3 = i - iM16815p;
                }
                i3 = i + iM16815p;
            } else {
                if (z) {
                    iM16815p = viewM3982D.getWidth();
                    i3 = i + iM16815p;
                }
                i3 = i - iM16815p;
            }
            menuPopupWindowM3979A.m4301e(i3);
            menuPopupWindowM3979A.m4294M(true);
            menuPopupWindowM3979A.m4303i(i2);
        } else {
            if (this.f5553Y) {
                menuPopupWindowM3979A.m4301e(this.h0);
            }
            if (this.f5554Z) {
                menuPopupWindowM3979A.m4303i(this.i0);
            }
            menuPopupWindowM3979A.m4288G(m16818n());
        }
        this.f5562q.add(new d(menuPopupWindowM3979A, c1792e, this.f5552X));
        menuPopupWindowM3979A.show();
        ListView listViewMo3992o = menuPopupWindowM3979A.mo3992o();
        listViewMo3992o.setOnKeyListener(this);
        if (dVar == null && this.k0 && c1792e.m4064z() != null) {
            FrameLayout frameLayout = (FrameLayout) layoutInflaterFrom.inflate(g9e.abc_popup_menu_header_item_layout, (ViewGroup) listViewMo3992o, false);
            TextView textView = (TextView) frameLayout.findViewById(R.id.title);
            frameLayout.setEnabled(false);
            textView.setText(c1792e.m4064z());
            listViewMo3992o.addHeaderView(frameLayout, null, false);
            menuPopupWindowM3979A.show();
        }
    }

    @Override // p001o.brf
    /* renamed from: a */
    public boolean mo3986a() {
        return this.f5562q.size() > 0 && ((d) this.f5562q.get(0)).f5573a.mo3986a();
    }

    @Override // androidx.appcompat.view.menu.InterfaceC1796i
    /* renamed from: b */
    public void mo3963b(C1792e c1792e, boolean z) {
        int iM3980B = m3980B(c1792e);
        if (iM3980B < 0) {
            return;
        }
        int i = iM3980B + 1;
        if (i < this.f5562q.size()) {
            ((d) this.f5562q.get(i)).f5574b.m4044e(false);
        }
        d dVar = (d) this.f5562q.remove(iM3980B);
        dVar.f5574b.m4031R(this);
        if (this.o0) {
            dVar.f5573a.m4320S(null);
            dVar.f5573a.m4285D(0);
        }
        dVar.f5573a.dismiss();
        int size = this.f5562q.size();
        if (size > 0) {
            this.f5552X = ((d) this.f5562q.get(size - 1)).f5575c;
        } else {
            this.f5552X = m3983E();
        }
        if (size != 0) {
            if (z) {
                ((d) this.f5562q.get(0)).f5574b.m4044e(false);
                return;
            }
            return;
        }
        dismiss();
        InterfaceC1796i.a aVar = this.l0;
        if (aVar != null) {
            aVar.mo3835b(c1792e, true);
        }
        ViewTreeObserver viewTreeObserver = this.m0;
        if (viewTreeObserver != null) {
            if (viewTreeObserver.isAlive()) {
                this.m0.removeGlobalOnLayoutListener(this.f5563s);
            }
            this.m0 = null;
        }
        this.f5551Q.removeOnAttachStateChangeListener(this.f5564x);
        this.n0.onDismiss();
    }

    @Override // androidx.appcompat.view.menu.InterfaceC1796i
    /* renamed from: d */
    public void mo3965d(InterfaceC1796i.a aVar) {
        this.l0 = aVar;
    }

    @Override // p001o.brf
    public void dismiss() {
        int size = this.f5562q.size();
        if (size > 0) {
            d[] dVarArr = (d[]) this.f5562q.toArray(new d[size]);
            for (int i = size - 1; i >= 0; i--) {
                d dVar = dVarArr[i];
                if (dVar.f5573a.mo3986a()) {
                    dVar.f5573a.dismiss();
                }
            }
        }
    }

    @Override // androidx.appcompat.view.menu.InterfaceC1796i
    /* renamed from: e */
    public void mo3987e(Parcelable parcelable) {
    }

    @Override // androidx.appcompat.view.menu.InterfaceC1796i
    /* renamed from: f */
    public boolean mo3966f(SubMenuC1799l subMenuC1799l) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        for (d dVar : this.f5562q) {
            if (subMenuC1799l == dVar.f5574b) {
                dVar.m4002a().requestFocus();
                return true;
            }
        }
        if (!subMenuC1799l.hasVisibleItems()) {
            return false;
        }
        mo3990l(subMenuC1799l);
        InterfaceC1796i.a aVar = this.l0;
        if (aVar != null) {
            aVar.mo3836c(subMenuC1799l);
        }
        return true;
    }

    @Override // androidx.appcompat.view.menu.InterfaceC1796i
    /* renamed from: g */
    public Parcelable mo3988g() {
        return null;
    }

    @Override // androidx.appcompat.view.menu.InterfaceC1796i
    /* renamed from: h */
    public void mo3967h(boolean z) {
        Iterator it = this.f5562q.iterator();
        while (it.hasNext()) {
            abb.m16817z(((d) it.next()).m4002a().getAdapter()).notifyDataSetChanged();
        }
    }

    @Override // androidx.appcompat.view.menu.InterfaceC1796i
    /* renamed from: i */
    public boolean mo3989i() {
        return false;
    }

    @Override // p001o.abb
    /* renamed from: l */
    public void mo3990l(C1792e c1792e) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        c1792e.m4042c(this, this.f5555b);
        if (mo3986a()) {
            m3985G(c1792e);
        } else {
            this.f5561h.add(c1792e);
        }
    }

    @Override // p001o.abb
    /* renamed from: m */
    public boolean mo3991m() {
        return false;
    }

    @Override // p001o.brf
    /* renamed from: o */
    public ListView mo3992o() {
        if (this.f5562q.isEmpty()) {
            return null;
        }
        return ((d) this.f5562q.get(r0.size() - 1)).m4002a();
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public void onDismiss() {
        d dVar;
        int size = this.f5562q.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                dVar = null;
                break;
            }
            dVar = (d) this.f5562q.get(i);
            if (!dVar.f5573a.mo3986a()) {
                break;
            } else {
                i++;
            }
        }
        if (dVar != null) {
            dVar.f5574b.m4044e(false);
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
        if (this.f5550M != view) {
            this.f5550M = view;
            this.f5549L = dv7.m23889b(this.f5548H, view.getLayoutDirection());
        }
    }

    @Override // p001o.abb
    /* renamed from: s */
    public void mo3994s(boolean z) {
        this.j0 = z;
    }

    @Override // p001o.brf
    public void show() throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        if (mo3986a()) {
            return;
        }
        Iterator it = this.f5561h.iterator();
        while (it.hasNext()) {
            m3985G((C1792e) it.next());
        }
        this.f5561h.clear();
        View view = this.f5550M;
        this.f5551Q = view;
        if (view != null) {
            boolean z = this.m0 == null;
            ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
            this.m0 = viewTreeObserver;
            if (z) {
                viewTreeObserver.addOnGlobalLayoutListener(this.f5563s);
            }
            this.f5551Q.addOnAttachStateChangeListener(this.f5564x);
        }
    }

    @Override // p001o.abb
    /* renamed from: t */
    public void mo3995t(int i) {
        if (this.f5548H != i) {
            this.f5548H = i;
            this.f5549L = dv7.m23889b(i, this.f5550M.getLayoutDirection());
        }
    }

    @Override // p001o.abb
    /* renamed from: u */
    public void mo3996u(int i) {
        this.f5553Y = true;
        this.h0 = i;
    }

    @Override // p001o.abb
    /* renamed from: v */
    public void mo3997v(PopupWindow.OnDismissListener onDismissListener) {
        this.n0 = onDismissListener;
    }

    @Override // p001o.abb
    /* renamed from: w */
    public void mo3998w(boolean z) {
        this.k0 = z;
    }

    @Override // p001o.abb
    /* renamed from: x */
    public void mo3999x(int i) {
        this.f5554Z = true;
        this.i0 = i;
    }
}
