package p013o;

import androidx.appcompat.widget.Toolbar;
import p012n.MenuItemC4930j;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final /* synthetic */ class y1 implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ int f25682a;

    /* renamed from: b */
    public final /* synthetic */ Toolbar f25683b;

    public /* synthetic */ y1(Toolbar toolbar, int i10) {
        this.f25682a = i10;
        this.f25683b = toolbar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f25682a) {
            case 0:
                a2 a2Var = this.f25683b.f1787T;
                MenuItemC4930j menuItemC4930j = a2Var == null ? null : a2Var.f25437b;
                if (menuItemC4930j != null) {
                    menuItemC4930j.collapseActionView();
                    break;
                }
                break;
            default:
                this.f25683b.m587l();
                break;
        }
    }
}
