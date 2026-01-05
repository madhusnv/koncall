package p001o;

import android.content.Context;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import androidx.appcompat.view.menu.C1792e;
import androidx.appcompat.widget.ActionBarContextView;
import java.lang.ref.WeakReference;
import p001o.vm;

/* loaded from: classes2.dex */
public class y2g extends vm implements C1792e.a {

    /* renamed from: c */
    public Context f54793c;

    /* renamed from: d */
    public ActionBarContextView f54794d;

    /* renamed from: e */
    public vm.InterfaceC17615a f54795e;

    /* renamed from: f */
    public WeakReference f54796f;

    /* renamed from: g */
    public boolean f54797g;

    /* renamed from: h */
    public boolean f54798h;

    /* renamed from: q */
    public C1792e f54799q;

    public y2g(Context context, ActionBarContextView actionBarContextView, vm.InterfaceC17615a interfaceC17615a, boolean z) {
        this.f54793c = context;
        this.f54794d = actionBarContextView;
        this.f54795e = interfaceC17615a;
        C1792e c1792eM4037X = new C1792e(actionBarContextView.getContext()).m4037X(1);
        this.f54799q = c1792eM4037X;
        c1792eM4037X.mo4036W(this);
        this.f54798h = z;
    }

    @Override // androidx.appcompat.view.menu.C1792e.a
    /* renamed from: a */
    public boolean mo3808a(C1792e c1792e, MenuItem menuItem) {
        return this.f54795e.mo3839c(this, menuItem);
    }

    @Override // androidx.appcompat.view.menu.C1792e.a
    /* renamed from: b */
    public void mo3809b(C1792e c1792e) {
        mo3937k();
        this.f54794d.m4119l();
    }

    @Override // p001o.vm
    /* renamed from: c */
    public void mo3931c() {
        if (this.f54797g) {
            return;
        }
        this.f54797g = true;
        this.f54795e.mo3838b(this);
    }

    @Override // p001o.vm
    /* renamed from: d */
    public View mo3932d() {
        WeakReference weakReference = this.f54796f;
        if (weakReference != null) {
            return (View) weakReference.get();
        }
        return null;
    }

    @Override // p001o.vm
    /* renamed from: e */
    public Menu mo3933e() {
        return this.f54799q;
    }

    @Override // p001o.vm
    /* renamed from: f */
    public MenuInflater mo3934f() {
        return new zdg(this.f54794d.getContext());
    }

    @Override // p001o.vm
    /* renamed from: g */
    public CharSequence mo3935g() {
        return this.f54794d.getSubtitle();
    }

    @Override // p001o.vm
    /* renamed from: i */
    public CharSequence mo3936i() {
        return this.f54794d.getTitle();
    }

    @Override // p001o.vm
    /* renamed from: k */
    public void mo3937k() {
        this.f54795e.mo3840d(this, this.f54799q);
    }

    @Override // p001o.vm
    /* renamed from: l */
    public boolean mo3938l() {
        return this.f54794d.m4117j();
    }

    @Override // p001o.vm
    /* renamed from: m */
    public void mo3939m(View view) {
        this.f54794d.setCustomView(view);
        this.f54796f = view != null ? new WeakReference(view) : null;
    }

    @Override // p001o.vm
    /* renamed from: n */
    public void mo3940n(int i) {
        mo3941o(this.f54793c.getString(i));
    }

    @Override // p001o.vm
    /* renamed from: o */
    public void mo3941o(CharSequence charSequence) {
        this.f54794d.setSubtitle(charSequence);
    }

    @Override // p001o.vm
    /* renamed from: q */
    public void mo3942q(int i) {
        mo3943r(this.f54793c.getString(i));
    }

    @Override // p001o.vm
    /* renamed from: r */
    public void mo3943r(CharSequence charSequence) {
        this.f54794d.setTitle(charSequence);
    }

    @Override // p001o.vm
    /* renamed from: s */
    public void mo3944s(boolean z) {
        super.mo3944s(z);
        this.f54794d.setTitleOptional(z);
    }
}
