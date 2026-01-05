package p001o;

import android.content.Context;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;

/* loaded from: classes2.dex */
public abstract class wm {

    /* renamed from: a */
    public final Context f52324a;

    /* renamed from: b */
    public InterfaceC17927a f52325b;

    /* renamed from: c */
    public InterfaceC17928b f52326c;

    /* renamed from: o.wm$a */
    public interface InterfaceC17927a {
        /* renamed from: a */
        void mo4167a(boolean z);
    }

    /* renamed from: o.wm$b */
    public interface InterfaceC17928b {
        void onActionProviderVisibilityChanged(boolean z);
    }

    public wm(Context context) {
        this.f52324a = context;
    }

    /* renamed from: a */
    public Context m54694a() {
        return this.f52324a;
    }

    /* renamed from: b */
    public boolean mo54695b() {
        return false;
    }

    /* renamed from: c */
    public abstract boolean mo7873c();

    /* renamed from: d */
    public abstract View mo7874d();

    /* renamed from: e */
    public View mo54696e(MenuItem menuItem) {
        return mo7874d();
    }

    /* renamed from: f */
    public abstract boolean mo7875f();

    /* renamed from: g */
    public void mo54697g(SubMenu subMenu) {
    }

    /* renamed from: h */
    public abstract boolean mo7876h();

    /* renamed from: i */
    public void m54698i() {
        if (this.f52326c == null || !mo7876h()) {
            return;
        }
        this.f52326c.onActionProviderVisibilityChanged(mo7873c());
    }

    /* renamed from: j */
    public void m54699j() {
        this.f52326c = null;
        this.f52325b = null;
    }

    /* renamed from: k */
    public void m54700k(InterfaceC17927a interfaceC17927a) {
        this.f52325b = interfaceC17927a;
    }

    /* renamed from: l */
    public void mo54701l(InterfaceC17928b interfaceC17928b) {
        if (this.f52326c != null && interfaceC17928b != null) {
            StringBuilder sb = new StringBuilder();
            sb.append("setVisibilityListener: Setting a new ActionProvider.VisibilityListener when one is already set. Are you reusing this ");
            sb.append(getClass().getSimpleName());
            sb.append(" instance while it is still in use somewhere else?");
        }
        this.f52326c = interfaceC17928b;
    }

    /* renamed from: m */
    public void m54702m(boolean z) {
        InterfaceC17927a interfaceC17927a = this.f52325b;
        if (interfaceC17927a != null) {
            interfaceC17927a.mo4167a(z);
        }
    }
}
