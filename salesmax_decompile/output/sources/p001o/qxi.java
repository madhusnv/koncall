package p001o;

import android.view.View;

/* loaded from: classes3.dex */
public class qxi {

    /* renamed from: a */
    public final View f42594a;

    /* renamed from: b */
    public int f42595b;

    /* renamed from: c */
    public int f42596c;

    /* renamed from: d */
    public int f42597d;

    /* renamed from: e */
    public int f42598e;

    /* renamed from: f */
    public boolean f42599f = true;

    /* renamed from: g */
    public boolean f42600g = true;

    public qxi(View view) {
        this.f42594a = view;
    }

    /* renamed from: a */
    public void m45969a() {
        View view = this.f42594a;
        wvi.m55111X(view, this.f42597d - (view.getTop() - this.f42595b));
        View view2 = this.f42594a;
        wvi.m55110W(view2, this.f42598e - (view2.getLeft() - this.f42596c));
    }

    /* renamed from: b */
    public int m45970b() {
        return this.f42595b;
    }

    /* renamed from: c */
    public int m45971c() {
        return this.f42597d;
    }

    /* renamed from: d */
    public void m45972d() {
        this.f42595b = this.f42594a.getTop();
        this.f42596c = this.f42594a.getLeft();
    }

    /* renamed from: e */
    public boolean m45973e(int i) {
        if (!this.f42600g || this.f42598e == i) {
            return false;
        }
        this.f42598e = i;
        m45969a();
        return true;
    }

    /* renamed from: f */
    public boolean m45974f(int i) {
        if (!this.f42599f || this.f42597d == i) {
            return false;
        }
        this.f42597d = i;
        m45969a();
        return true;
    }
}
