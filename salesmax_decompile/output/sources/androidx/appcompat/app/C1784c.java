package androidx.appcompat.app;

import android.content.Context;
import android.content.res.Configuration;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import androidx.appcompat.app.AppCompatDelegateImpl;
import androidx.appcompat.view.menu.C1792e;
import androidx.appcompat.view.menu.InterfaceC1796i;
import androidx.appcompat.widget.C1884a;
import androidx.appcompat.widget.Toolbar;
import java.util.ArrayList;
import p001o.e85;
import p001o.fgd;
import p001o.tq;
import p001o.wvi;

/* renamed from: androidx.appcompat.app.c */
/* loaded from: classes2.dex */
public class C1784c extends ActionBar {

    /* renamed from: a */
    public final e85 f5454a;

    /* renamed from: b */
    public final Window.Callback f5455b;

    /* renamed from: c */
    public final AppCompatDelegateImpl.InterfaceC1768g f5456c;

    /* renamed from: d */
    public boolean f5457d;

    /* renamed from: e */
    public boolean f5458e;

    /* renamed from: f */
    public boolean f5459f;

    /* renamed from: g */
    public ArrayList f5460g = new ArrayList();

    /* renamed from: h */
    public final Runnable f5461h = new a();

    /* renamed from: i */
    public final Toolbar.InterfaceC1882g f5462i;

    /* renamed from: androidx.appcompat.app.c$a */
    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            C1784c.this.m3904A();
        }
    }

    /* renamed from: androidx.appcompat.app.c$b */
    public class b implements Toolbar.InterfaceC1882g {
        public b() {
        }

        @Override // androidx.appcompat.widget.Toolbar.InterfaceC1882g
        public boolean onMenuItemClick(MenuItem menuItem) {
            return C1784c.this.f5455b.onMenuItemSelected(0, menuItem);
        }
    }

    /* renamed from: androidx.appcompat.app.c$c */
    public final class c implements InterfaceC1796i.a {

        /* renamed from: a */
        public boolean f5465a;

        public c() {
        }

        @Override // androidx.appcompat.view.menu.InterfaceC1796i.a
        /* renamed from: b */
        public void mo3835b(C1792e c1792e, boolean z) {
            if (this.f5465a) {
                return;
            }
            this.f5465a = true;
            C1784c.this.f5454a.mo4467p();
            C1784c.this.f5455b.onPanelClosed(108, c1792e);
            this.f5465a = false;
        }

        @Override // androidx.appcompat.view.menu.InterfaceC1796i.a
        /* renamed from: c */
        public boolean mo3836c(C1792e c1792e) {
            C1784c.this.f5455b.onMenuOpened(108, c1792e);
            return true;
        }
    }

    /* renamed from: androidx.appcompat.app.c$d */
    public final class d implements C1792e.a {
        public d() {
        }

        @Override // androidx.appcompat.view.menu.C1792e.a
        /* renamed from: a */
        public boolean mo3808a(C1792e c1792e, MenuItem menuItem) {
            return false;
        }

        @Override // androidx.appcompat.view.menu.C1792e.a
        /* renamed from: b */
        public void mo3809b(C1792e c1792e) {
            if (C1784c.this.f5454a.mo4455d()) {
                C1784c.this.f5455b.onPanelClosed(108, c1792e);
            } else if (C1784c.this.f5455b.onPreparePanel(0, null, c1792e)) {
                C1784c.this.f5455b.onMenuOpened(108, c1792e);
            }
        }
    }

    /* renamed from: androidx.appcompat.app.c$e */
    public class e implements AppCompatDelegateImpl.InterfaceC1768g {
        public e() {
        }

        @Override // androidx.appcompat.app.AppCompatDelegateImpl.InterfaceC1768g
        /* renamed from: a */
        public boolean mo3834a(int i) {
            if (i != 0) {
                return false;
            }
            C1784c c1784c = C1784c.this;
            if (c1784c.f5457d) {
                return false;
            }
            c1784c.f5454a.setMenuPrepared();
            C1784c.this.f5457d = true;
            return false;
        }

        @Override // androidx.appcompat.app.AppCompatDelegateImpl.InterfaceC1768g
        public View onCreatePanelView(int i) {
            if (i == 0) {
                return new View(C1784c.this.f5454a.getContext());
            }
            return null;
        }
    }

    public C1784c(Toolbar toolbar, CharSequence charSequence, Window.Callback callback) {
        b bVar = new b();
        this.f5462i = bVar;
        fgd.m26663g(toolbar);
        C1884a c1884a = new C1884a(toolbar, false);
        this.f5454a = c1884a;
        this.f5455b = (Window.Callback) fgd.m26663g(callback);
        c1884a.setWindowCallback(callback);
        toolbar.setOnMenuItemClickListener(bVar);
        c1884a.setWindowTitle(charSequence);
        this.f5456c = new e();
    }

    /* renamed from: A */
    public void m3904A() {
        Menu menuM3906z = m3906z();
        C1792e c1792e = menuM3906z instanceof C1792e ? (C1792e) menuM3906z : null;
        if (c1792e != null) {
            c1792e.i0();
        }
        try {
            menuM3906z.clear();
            if (!this.f5455b.onCreatePanelMenu(0, menuM3906z) || !this.f5455b.onPreparePanel(0, null, menuM3906z)) {
                menuM3906z.clear();
            }
        } finally {
            if (c1792e != null) {
                c1792e.h0();
            }
        }
    }

    /* renamed from: B */
    public void m3905B(int i, int i2) {
        this.f5454a.mo4458g((i & i2) | ((~i2) & this.f5454a.mo4472u()));
    }

    @Override // androidx.appcompat.app.ActionBar
    /* renamed from: g */
    public boolean mo3738g() {
        return this.f5454a.mo4453b();
    }

    @Override // androidx.appcompat.app.ActionBar
    /* renamed from: h */
    public boolean mo3739h() {
        if (!this.f5454a.mo4457f()) {
            return false;
        }
        this.f5454a.collapseActionView();
        return true;
    }

    @Override // androidx.appcompat.app.ActionBar
    /* renamed from: i */
    public void mo3740i(boolean z) {
        if (z == this.f5459f) {
            return;
        }
        this.f5459f = z;
        if (this.f5460g.size() <= 0) {
            return;
        }
        tq.m50332a(this.f5460g.get(0));
        throw null;
    }

    @Override // androidx.appcompat.app.ActionBar
    /* renamed from: j */
    public int mo3741j() {
        return this.f5454a.mo4472u();
    }

    @Override // androidx.appcompat.app.ActionBar
    /* renamed from: k */
    public Context mo3742k() {
        return this.f5454a.getContext();
    }

    @Override // androidx.appcompat.app.ActionBar
    /* renamed from: l */
    public boolean mo3743l() {
        this.f5454a.mo4463l().removeCallbacks(this.f5461h);
        wvi.e0(this.f5454a.mo4463l(), this.f5461h);
        return true;
    }

    @Override // androidx.appcompat.app.ActionBar
    /* renamed from: m */
    public void mo3744m(Configuration configuration) {
        super.mo3744m(configuration);
    }

    @Override // androidx.appcompat.app.ActionBar
    /* renamed from: n */
    public void mo3745n() {
        this.f5454a.mo4463l().removeCallbacks(this.f5461h);
    }

    @Override // androidx.appcompat.app.ActionBar
    /* renamed from: o */
    public boolean mo3746o(int i, KeyEvent keyEvent) {
        Menu menuM3906z = m3906z();
        if (menuM3906z == null) {
            return false;
        }
        menuM3906z.setQwertyMode(KeyCharacterMap.load(keyEvent != null ? keyEvent.getDeviceId() : -1).getKeyboardType() != 1);
        return menuM3906z.performShortcut(i, keyEvent, 0);
    }

    @Override // androidx.appcompat.app.ActionBar
    /* renamed from: p */
    public boolean mo3747p(KeyEvent keyEvent) {
        if (keyEvent.getAction() == 1) {
            mo3748q();
        }
        return true;
    }

    @Override // androidx.appcompat.app.ActionBar
    /* renamed from: q */
    public boolean mo3748q() {
        return this.f5454a.mo4454c();
    }

    @Override // androidx.appcompat.app.ActionBar
    /* renamed from: r */
    public void mo3749r(boolean z) {
    }

    @Override // androidx.appcompat.app.ActionBar
    /* renamed from: s */
    public void mo3750s(boolean z) {
        m3905B(z ? 4 : 0, 4);
    }

    @Override // androidx.appcompat.app.ActionBar
    /* renamed from: t */
    public void mo3751t(int i) {
        this.f5454a.mo4470s(i);
    }

    @Override // androidx.appcompat.app.ActionBar
    /* renamed from: u */
    public void mo3752u(boolean z) {
    }

    @Override // androidx.appcompat.app.ActionBar
    /* renamed from: v */
    public void mo3753v(CharSequence charSequence) {
        this.f5454a.mo4459h(charSequence);
    }

    @Override // androidx.appcompat.app.ActionBar
    /* renamed from: w */
    public void mo3754w(CharSequence charSequence) {
        this.f5454a.setTitle(charSequence);
    }

    @Override // androidx.appcompat.app.ActionBar
    /* renamed from: x */
    public void mo3755x(CharSequence charSequence) {
        this.f5454a.setWindowTitle(charSequence);
    }

    /* renamed from: z */
    public final Menu m3906z() {
        if (!this.f5458e) {
            this.f5454a.mo4471t(new c(), new d());
            this.f5458e = true;
        }
        return this.f5454a.mo4460i();
    }
}
