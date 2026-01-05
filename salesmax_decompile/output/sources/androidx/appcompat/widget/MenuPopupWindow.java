package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.transition.Transition;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import android.widget.PopupWindow;
import androidx.appcompat.view.menu.C1791d;
import androidx.appcompat.view.menu.C1792e;
import androidx.appcompat.view.menu.C1794g;
import androidx.appcompat.view.menu.ListMenuItemView;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import p001o.rz5;
import p001o.yab;

/* loaded from: classes2.dex */
public class MenuPopupWindow extends ListPopupWindow implements yab {
    public static Method x0;
    public yab w0;

    public static class MenuDropDownListView extends rz5 {

        /* renamed from: L */
        public final int f5917L;

        /* renamed from: M */
        public final int f5918M;

        /* renamed from: Q */
        public yab f5919Q;
        public MenuItem h0;

        public MenuDropDownListView(Context context, boolean z) {
            super(context, z);
            if (1 == context.getResources().getConfiguration().getLayoutDirection()) {
                this.f5917L = 21;
                this.f5918M = 22;
            } else {
                this.f5917L = 22;
                this.f5918M = 21;
            }
        }

        @Override // p001o.rz5
        /* renamed from: d */
        public /* bridge */ /* synthetic */ int mo4323d(int i, int i2, int i3, int i4, int i5) {
            return super.mo4323d(i, i2, i3, i4, i5);
        }

        @Override // p001o.rz5
        /* renamed from: e */
        public /* bridge */ /* synthetic */ boolean mo4324e(MotionEvent motionEvent, int i) {
            return super.mo4324e(motionEvent, i);
        }

        @Override // p001o.rz5, android.view.ViewGroup, android.view.View
        public /* bridge */ /* synthetic */ boolean hasFocus() {
            return super.hasFocus();
        }

        @Override // p001o.rz5, android.view.View
        public /* bridge */ /* synthetic */ boolean hasWindowFocus() {
            return super.hasWindowFocus();
        }

        @Override // p001o.rz5, android.view.View
        public /* bridge */ /* synthetic */ boolean isFocused() {
            return super.isFocused();
        }

        @Override // p001o.rz5, android.view.View
        public /* bridge */ /* synthetic */ boolean isInTouchMode() {
            return super.isInTouchMode();
        }

        @Override // p001o.rz5, android.view.View
        public boolean onHoverEvent(MotionEvent motionEvent) {
            C1791d c1791d;
            int headersCount;
            int iPointToPosition;
            int i;
            if (this.f5919Q != null) {
                ListAdapter adapter = getAdapter();
                if (adapter instanceof HeaderViewListAdapter) {
                    HeaderViewListAdapter headerViewListAdapter = (HeaderViewListAdapter) adapter;
                    headersCount = headerViewListAdapter.getHeadersCount();
                    c1791d = (C1791d) headerViewListAdapter.getWrappedAdapter();
                } else {
                    c1791d = (C1791d) adapter;
                    headersCount = 0;
                }
                C1794g item = (motionEvent.getAction() == 10 || (iPointToPosition = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY())) == -1 || (i = iPointToPosition - headersCount) < 0 || i >= c1791d.getCount()) ? null : c1791d.getItem(i);
                MenuItem menuItem = this.h0;
                if (menuItem != item) {
                    C1792e c1792eM4010b = c1791d.m4010b();
                    if (menuItem != null) {
                        this.f5919Q.mo4001n(c1792eM4010b, menuItem);
                    }
                    this.h0 = item;
                    if (item != null) {
                        this.f5919Q.mo4000d(c1792eM4010b, item);
                    }
                }
            }
            return super.onHoverEvent(motionEvent);
        }

        @Override // android.widget.ListView, android.widget.AbsListView, android.view.View, android.view.KeyEvent.Callback
        public boolean onKeyDown(int i, KeyEvent keyEvent) {
            ListMenuItemView listMenuItemView = (ListMenuItemView) getSelectedView();
            if (listMenuItemView != null && i == this.f5917L) {
                if (listMenuItemView.isEnabled() && listMenuItemView.getItemData().hasSubMenu()) {
                    performItemClick(listMenuItemView, getSelectedItemPosition(), getSelectedItemId());
                }
                return true;
            }
            if (listMenuItemView == null || i != this.f5918M) {
                return super.onKeyDown(i, keyEvent);
            }
            setSelection(-1);
            ListAdapter adapter = getAdapter();
            (adapter instanceof HeaderViewListAdapter ? (C1791d) ((HeaderViewListAdapter) adapter).getWrappedAdapter() : (C1791d) adapter).m4010b().m4044e(false);
            return true;
        }

        @Override // p001o.rz5, android.widget.AbsListView, android.view.View
        public /* bridge */ /* synthetic */ boolean onTouchEvent(MotionEvent motionEvent) {
            return super.onTouchEvent(motionEvent);
        }

        public void setHoverListener(yab yabVar) {
            this.f5919Q = yabVar;
        }

        @Override // p001o.rz5, android.widget.AbsListView
        public /* bridge */ /* synthetic */ void setSelector(Drawable drawable) {
            super.setSelector(drawable);
        }
    }

    /* renamed from: androidx.appcompat.widget.MenuPopupWindow$a */
    public static class C1848a {
        /* renamed from: a */
        public static void m4325a(PopupWindow popupWindow, Transition transition) {
            popupWindow.setEnterTransition(transition);
        }

        /* renamed from: b */
        public static void m4326b(PopupWindow popupWindow, Transition transition) {
            popupWindow.setExitTransition(transition);
        }
    }

    /* renamed from: androidx.appcompat.widget.MenuPopupWindow$b */
    public static class C1849b {
        /* renamed from: a */
        public static void m4327a(PopupWindow popupWindow, boolean z) {
            popupWindow.setTouchModal(z);
        }
    }

    static {
        try {
            if (Build.VERSION.SDK_INT <= 28) {
                x0 = PopupWindow.class.getDeclaredMethod("setTouchModal", Boolean.TYPE);
            }
        } catch (NoSuchMethodException unused) {
        }
    }

    public MenuPopupWindow(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
    }

    /* renamed from: R */
    public void m4319R(Object obj) {
        C1848a.m4325a(this.t0, (Transition) obj);
    }

    /* renamed from: S */
    public void m4320S(Object obj) {
        C1848a.m4326b(this.t0, (Transition) obj);
    }

    /* renamed from: T */
    public void m4321T(yab yabVar) {
        this.w0 = yabVar;
    }

    /* renamed from: U */
    public void m4322U(boolean z) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        if (Build.VERSION.SDK_INT > 28) {
            C1849b.m4327a(this.t0, z);
            return;
        }
        Method method = x0;
        if (method != null) {
            try {
                method.invoke(this.t0, Boolean.valueOf(z));
            } catch (Exception unused) {
            }
        }
    }

    @Override // p001o.yab
    /* renamed from: d */
    public void mo4000d(C1792e c1792e, MenuItem menuItem) {
        yab yabVar = this.w0;
        if (yabVar != null) {
            yabVar.mo4000d(c1792e, menuItem);
        }
    }

    @Override // p001o.yab
    /* renamed from: n */
    public void mo4001n(C1792e c1792e, MenuItem menuItem) {
        yab yabVar = this.w0;
        if (yabVar != null) {
            yabVar.mo4001n(c1792e, menuItem);
        }
    }

    @Override // androidx.appcompat.widget.ListPopupWindow
    /* renamed from: r */
    public rz5 mo4307r(Context context, boolean z) {
        MenuDropDownListView menuDropDownListView = new MenuDropDownListView(context, z);
        menuDropDownListView.setHoverListener(this);
        return menuDropDownListView;
    }
}
