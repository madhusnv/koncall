package y3;

import android.graphics.Rect;
import android.os.Build;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import b2.w0;
import c3.C0848c;
import ex.InterfaceC2137a;
import kotlin.jvm.internal.AbstractC4154l;
import o6.b0;
import p013o.i2;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: y3.a */
/* loaded from: classes.dex */
public final class C8537a extends ActionMode.Callback2 {

    /* renamed from: a */
    public final i2 f41481a;

    public C8537a(i2 i2Var) {
        this.f41481a = i2Var;
    }

    @Override // android.view.ActionMode.Callback
    public final boolean onActionItemClicked(ActionMode actionMode, MenuItem menuItem) {
        i2 i2Var = this.f41481a;
        i2Var.getClass();
        AbstractC4154l.m8920c(menuItem);
        int itemId = menuItem.getItemId();
        if (itemId == EnumC8539c.Copy.getId()) {
            InterfaceC2137a interfaceC2137a = (InterfaceC2137a) i2Var.f25540c;
            if (interfaceC2137a != null) {
                interfaceC2137a.invoke();
            }
        } else if (itemId == EnumC8539c.Paste.getId()) {
            w0 w0Var = (w0) i2Var.f25541d;
            if (w0Var != null) {
                w0Var.invoke();
            }
        } else if (itemId == EnumC8539c.Cut.getId()) {
            InterfaceC2137a interfaceC2137a2 = (InterfaceC2137a) i2Var.f25542e;
            if (interfaceC2137a2 != null) {
                interfaceC2137a2.invoke();
            }
        } else if (itemId == EnumC8539c.SelectAll.getId()) {
            w0 w0Var2 = (w0) i2Var.f25543f;
            if (w0Var2 != null) {
                w0Var2.invoke();
            }
        } else {
            if (itemId != EnumC8539c.Autofill.getId()) {
                return false;
            }
            w0 w0Var3 = (w0) i2Var.f25544g;
            if (w0Var3 != null) {
                w0Var3.invoke();
            }
        }
        if (actionMode == null) {
            return true;
        }
        actionMode.finish();
        return true;
    }

    @Override // android.view.ActionMode.Callback
    public final boolean onCreateActionMode(ActionMode actionMode, Menu menu) {
        i2 i2Var = this.f41481a;
        i2Var.getClass();
        if (menu == null) {
            throw new IllegalArgumentException("onCreateActionMode requires a non-null menu");
        }
        if (actionMode == null) {
            throw new IllegalArgumentException("onCreateActionMode requires a non-null mode");
        }
        if (((InterfaceC2137a) i2Var.f25540c) != null) {
            i2.m10244a(menu, EnumC8539c.Copy);
        }
        if (((w0) i2Var.f25541d) != null) {
            i2.m10244a(menu, EnumC8539c.Paste);
        }
        if (((InterfaceC2137a) i2Var.f25542e) != null) {
            i2.m10244a(menu, EnumC8539c.Cut);
        }
        if (((w0) i2Var.f25543f) != null) {
            i2.m10244a(menu, EnumC8539c.SelectAll);
        }
        if (((w0) i2Var.f25544g) == null || Build.VERSION.SDK_INT < 26) {
            return true;
        }
        i2.m10244a(menu, EnumC8539c.Autofill);
        return true;
    }

    @Override // android.view.ActionMode.Callback
    public final void onDestroyActionMode(ActionMode actionMode) {
        ((b0) this.f41481a.f25538a).invoke();
    }

    @Override // android.view.ActionMode.Callback2
    public final void onGetContentRect(ActionMode actionMode, View view, Rect rect) {
        C0848c c0848c = (C0848c) this.f41481a.f25539b;
        if (rect != null) {
            rect.set((int) c0848c.f5354a, (int) c0848c.f5355b, (int) c0848c.f5356c, (int) c0848c.f5357d);
        }
    }

    @Override // android.view.ActionMode.Callback
    public final boolean onPrepareActionMode(ActionMode actionMode, Menu menu) {
        i2 i2Var = this.f41481a;
        i2Var.getClass();
        if (actionMode == null || menu == null) {
            return false;
        }
        i2.m10245b(menu, EnumC8539c.Copy, (InterfaceC2137a) i2Var.f25540c);
        i2.m10245b(menu, EnumC8539c.Paste, (w0) i2Var.f25541d);
        i2.m10245b(menu, EnumC8539c.Cut, (InterfaceC2137a) i2Var.f25542e);
        i2.m10245b(menu, EnumC8539c.SelectAll, (w0) i2Var.f25543f);
        i2.m10245b(menu, EnumC8539c.Autofill, (w0) i2Var.f25544g);
        return true;
    }
}
