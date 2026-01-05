package p013o;

import android.os.Build;
import android.view.MenuItem;
import android.widget.PopupWindow;
import java.lang.reflect.Method;
import k4.C4001v;
import p012n.MenuC4929i;
import p012n.MenuItemC4930j;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class o1 extends j1 implements k1 {

    /* renamed from: D */
    public static final Method f25607D;

    /* renamed from: C */
    public C4001v f25608C;

    static {
        try {
            if (Build.VERSION.SDK_INT <= 28) {
                f25607D = PopupWindow.class.getDeclaredMethod("setTouchModal", Boolean.TYPE);
            }
        } catch (NoSuchMethodException unused) {
        }
    }

    @Override // p013o.k1
    /* renamed from: d */
    public final void mo8765d(MenuC4929i menuC4929i, MenuItem menuItem) {
        C4001v c4001v = this.f25608C;
        if (c4001v != null) {
            c4001v.mo8765d(menuC4929i, menuItem);
        }
    }

    @Override // p013o.k1
    /* renamed from: o */
    public final void mo8774o(MenuC4929i menuC4929i, MenuItemC4930j menuItemC4930j) {
        C4001v c4001v = this.f25608C;
        if (c4001v != null) {
            c4001v.mo8774o(menuC4929i, menuItemC4930j);
        }
    }
}
