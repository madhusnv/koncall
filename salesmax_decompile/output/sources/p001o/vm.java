package p001o;

import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;

/* loaded from: classes2.dex */
public abstract class vm {

    /* renamed from: a */
    public Object f50529a;

    /* renamed from: b */
    public boolean f50530b;

    /* renamed from: o.vm$a */
    public interface InterfaceC17615a {
        /* renamed from: a */
        boolean mo3837a(vm vmVar, Menu menu);

        /* renamed from: b */
        void mo3838b(vm vmVar);

        /* renamed from: c */
        boolean mo3839c(vm vmVar, MenuItem menuItem);

        /* renamed from: d */
        boolean mo3840d(vm vmVar, Menu menu);
    }

    /* renamed from: c */
    public abstract void mo3931c();

    /* renamed from: d */
    public abstract View mo3932d();

    /* renamed from: e */
    public abstract Menu mo3933e();

    /* renamed from: f */
    public abstract MenuInflater mo3934f();

    /* renamed from: g */
    public abstract CharSequence mo3935g();

    /* renamed from: h */
    public Object m52960h() {
        return this.f50529a;
    }

    /* renamed from: i */
    public abstract CharSequence mo3936i();

    /* renamed from: j */
    public boolean m52961j() {
        return this.f50530b;
    }

    /* renamed from: k */
    public abstract void mo3937k();

    /* renamed from: l */
    public abstract boolean mo3938l();

    /* renamed from: m */
    public abstract void mo3939m(View view);

    /* renamed from: n */
    public abstract void mo3940n(int i);

    /* renamed from: o */
    public abstract void mo3941o(CharSequence charSequence);

    /* renamed from: p */
    public void m52962p(Object obj) {
        this.f50529a = obj;
    }

    /* renamed from: q */
    public abstract void mo3942q(int i);

    /* renamed from: r */
    public abstract void mo3943r(CharSequence charSequence);

    /* renamed from: s */
    public void mo3944s(boolean z) {
        this.f50530b = z;
    }
}
