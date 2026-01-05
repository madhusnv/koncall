package p001o;

import android.os.Bundle;
import android.view.View;
import android.view.ViewParent;
import androidx.coordinatorlayout.widget.CoordinatorLayout;

/* loaded from: classes3.dex */
public final class mo6 {

    /* renamed from: a */
    public final View f35775a;

    /* renamed from: b */
    public boolean f35776b = false;

    /* renamed from: c */
    public int f35777c = 0;

    /* JADX WARN: Multi-variable type inference failed */
    public mo6(lo6 lo6Var) {
        this.f35775a = (View) lo6Var;
    }

    /* renamed from: a */
    public final void m39448a() {
        ViewParent parent = this.f35775a.getParent();
        if (parent instanceof CoordinatorLayout) {
            ((CoordinatorLayout) parent).m5749p(this.f35775a);
        }
    }

    /* renamed from: b */
    public int m39449b() {
        return this.f35777c;
    }

    /* renamed from: c */
    public boolean m39450c() {
        return this.f35776b;
    }

    /* renamed from: d */
    public void m39451d(Bundle bundle) {
        this.f35776b = bundle.getBoolean("expanded", false);
        this.f35777c = bundle.getInt("expandedComponentIdHint", 0);
        if (this.f35776b) {
            m39448a();
        }
    }

    /* renamed from: e */
    public Bundle m39452e() {
        Bundle bundle = new Bundle();
        bundle.putBoolean("expanded", this.f35776b);
        bundle.putInt("expandedComponentIdHint", this.f35777c);
        return bundle;
    }

    /* renamed from: f */
    public boolean m39453f(boolean z) {
        if (this.f35776b == z) {
            return false;
        }
        this.f35776b = z;
        m39448a();
        return true;
    }

    /* renamed from: g */
    public void m39454g(int i) {
        this.f35777c = i;
    }
}
