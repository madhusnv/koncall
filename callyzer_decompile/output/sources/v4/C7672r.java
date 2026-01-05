package v4;

import android.content.Context;
import android.os.Parcelable;
import android.util.SparseArray;
import android.view.View;
import ex.InterfaceC2139c;
import k2.C3964m;
import l4.C4367l;
import o3.C5281d;
import t2.InterfaceC7008g;
import t2.InterfaceC7009h;
import v3.p1;
import w3.AbstractC7883a;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: v4.r */
/* loaded from: classes.dex */
public final class C7672r extends AbstractC7663i {

    /* renamed from: D */
    public final View f37152D;

    /* renamed from: E */
    public final C5281d f37153E;

    /* renamed from: F */
    public InterfaceC7008g f37154F;

    /* renamed from: G */
    public InterfaceC2139c f37155G;

    /* renamed from: H */
    public InterfaceC2139c f37156H;

    /* renamed from: I */
    public InterfaceC2139c f37157I;

    public C7672r(Context context, InterfaceC2139c interfaceC2139c, C3964m c3964m, InterfaceC7009h interfaceC7009h, int i10, p1 p1Var) {
        View view = (View) interfaceC2139c.invoke(context);
        C5281d c5281d = new C5281d();
        super(context, c3964m, i10, c5281d, view, p1Var);
        this.f37152D = view;
        this.f37153E = c5281d;
        setClipChildren(false);
        String strValueOf = String.valueOf(i10);
        Object objMo12858d = interfaceC7009h != null ? interfaceC7009h.mo12858d(strValueOf) : null;
        SparseArray<Parcelable> sparseArray = objMo12858d instanceof SparseArray ? (SparseArray) objMo12858d : null;
        if (sparseArray != null) {
            view.restoreHierarchyState(sparseArray);
        }
        if (interfaceC7009h != null) {
            setSavableRegistryEntry(interfaceC7009h.mo12859e(strValueOf, new C7662h(this, 2)));
        }
        C7657c c7657c = C7657c.f37088e;
        this.f37155G = c7657c;
        this.f37156H = c7657c;
        this.f37157I = c7657c;
    }

    /* renamed from: p */
    public static final void m14685p(C7672r c7672r) {
        c7672r.setSavableRegistryEntry(null);
    }

    private final void setSavableRegistryEntry(InterfaceC7008g interfaceC7008g) {
        InterfaceC7008g interfaceC7008g2 = this.f37154F;
        if (interfaceC7008g2 != null) {
            ((C4367l) interfaceC7008g2).m9127N();
        }
        this.f37154F = interfaceC7008g;
    }

    public final C5281d getDispatcher() {
        return this.f37153E;
    }

    public final InterfaceC2139c getReleaseBlock() {
        return this.f37157I;
    }

    public final InterfaceC2139c getResetBlock() {
        return this.f37156H;
    }

    public /* bridge */ /* synthetic */ AbstractC7883a getSubCompositionView() {
        return null;
    }

    public final InterfaceC2139c getUpdateBlock() {
        return this.f37155G;
    }

    public final void setReleaseBlock(InterfaceC2139c interfaceC2139c) {
        this.f37157I = interfaceC2139c;
        setRelease(new C7662h(this, 3));
    }

    public final void setResetBlock(InterfaceC2139c interfaceC2139c) {
        this.f37156H = interfaceC2139c;
        setReset(new C7662h(this, 4));
    }

    public final void setUpdateBlock(InterfaceC2139c interfaceC2139c) {
        this.f37155G = interfaceC2139c;
        setUpdate(new C7662h(this, 5));
    }

    public View getViewRoot() {
        return this;
    }
}
