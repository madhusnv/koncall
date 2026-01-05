package p001o;

import android.view.View;
import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.sidesheet.SideSheetBehavior;

/* loaded from: classes3.dex */
public final class lba extends rnf {

    /* renamed from: a */
    public final SideSheetBehavior f33548a;

    public lba(SideSheetBehavior sideSheetBehavior) {
        this.f33548a = sideSheetBehavior;
    }

    @Override // p001o.rnf
    /* renamed from: a */
    public int mo19824a(ViewGroup.MarginLayoutParams marginLayoutParams) {
        return marginLayoutParams.leftMargin;
    }

    @Override // p001o.rnf
    /* renamed from: b */
    public float mo19825b(int i) {
        float fMo19828e = mo19828e();
        return (i - fMo19828e) / (mo19827d() - fMo19828e);
    }

    @Override // p001o.rnf
    /* renamed from: c */
    public int mo19826c(ViewGroup.MarginLayoutParams marginLayoutParams) {
        return marginLayoutParams.leftMargin;
    }

    @Override // p001o.rnf
    /* renamed from: d */
    public int mo19827d() {
        return Math.max(0, this.f33548a.m0() + this.f33548a.k0());
    }

    @Override // p001o.rnf
    /* renamed from: e */
    public int mo19828e() {
        return (-this.f33548a.d0()) - this.f33548a.k0();
    }

    @Override // p001o.rnf
    /* renamed from: f */
    public int mo19829f() {
        return this.f33548a.k0();
    }

    @Override // p001o.rnf
    /* renamed from: g */
    public int mo19830g() {
        return -this.f33548a.d0();
    }

    @Override // p001o.rnf
    /* renamed from: h */
    public int mo19831h(View view) {
        return view.getRight() + this.f33548a.k0();
    }

    @Override // p001o.rnf
    /* renamed from: i */
    public int mo19832i(CoordinatorLayout coordinatorLayout) {
        return coordinatorLayout.getLeft();
    }

    @Override // p001o.rnf
    /* renamed from: j */
    public int mo19833j() {
        return 1;
    }

    @Override // p001o.rnf
    /* renamed from: k */
    public boolean mo19834k(float f) {
        return f > 0.0f;
    }

    @Override // p001o.rnf
    /* renamed from: l */
    public boolean mo19835l(View view) {
        return view.getRight() < (mo19827d() - mo19828e()) / 2;
    }

    @Override // p001o.rnf
    /* renamed from: m */
    public boolean mo19836m(float f, float f2) {
        return opf.m42538a(f, f2) && Math.abs(f) > ((float) this.f33548a.o0());
    }

    @Override // p001o.rnf
    /* renamed from: n */
    public boolean mo19837n(View view, float f) {
        return Math.abs(((float) view.getLeft()) + (f * this.f33548a.i0())) > this.f33548a.j0();
    }

    @Override // p001o.rnf
    /* renamed from: o */
    public void mo19838o(ViewGroup.MarginLayoutParams marginLayoutParams, int i) {
        marginLayoutParams.leftMargin = i;
    }

    @Override // p001o.rnf
    /* renamed from: p */
    public void mo19839p(ViewGroup.MarginLayoutParams marginLayoutParams, int i, int i2) {
        if (i <= this.f33548a.n0()) {
            marginLayoutParams.leftMargin = i2;
        }
    }
}
