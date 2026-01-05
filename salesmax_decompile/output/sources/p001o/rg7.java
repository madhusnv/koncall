package p001o;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MenuItem;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;

/* loaded from: classes2.dex */
public class rg7 {

    /* renamed from: a */
    public final bh7 f43576a;

    public rg7(bh7 bh7Var) {
        this.f43576a = bh7Var;
    }

    /* renamed from: b */
    public static rg7 m46703b(bh7 bh7Var) {
        return new rg7((bh7) fgd.m26664h(bh7Var, "callbacks == null"));
    }

    /* renamed from: a */
    public void m46704a(Fragment fragment) {
        FragmentManager fragmentManagerM18967g = this.f43576a.m18967g();
        bh7 bh7Var = this.f43576a;
        fragmentManagerM18967g.m6203o(bh7Var, bh7Var, fragment);
    }

    /* renamed from: c */
    public void m46705c() {
        this.f43576a.m18967g().m6171A();
    }

    /* renamed from: d */
    public boolean m46706d(MenuItem menuItem) {
        return this.f43576a.m18967g().m6174D(menuItem);
    }

    /* renamed from: e */
    public void m46707e() {
        this.f43576a.m18967g().m6175E();
    }

    /* renamed from: f */
    public void m46708f() {
        this.f43576a.m18967g().m6177G();
    }

    /* renamed from: g */
    public void m46709g() {
        this.f43576a.m18967g().m6186P();
    }

    /* renamed from: h */
    public void m46710h() {
        this.f43576a.m18967g().m6190T();
    }

    /* renamed from: i */
    public void m46711i() {
        this.f43576a.m18967g().m6191U();
    }

    /* renamed from: j */
    public void m46712j() {
        this.f43576a.m18967g().m6193W();
    }

    /* renamed from: k */
    public boolean m46713k() {
        return this.f43576a.m18967g().d0(true);
    }

    /* renamed from: l */
    public FragmentManager m46714l() {
        return this.f43576a.m18967g();
    }

    /* renamed from: m */
    public void m46715m() {
        this.f43576a.m18967g().h1();
    }

    /* renamed from: n */
    public View m46716n(View view, String str, Context context, AttributeSet attributeSet) {
        return this.f43576a.m18967g().D0().onCreateView(view, str, context, attributeSet);
    }
}
