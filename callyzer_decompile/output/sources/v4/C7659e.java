package v4;

import android.view.View;
import android.view.ViewGroup;
import java.util.List;
import kotlin.jvm.internal.AbstractC4154l;
import rw.C6669s;
import s4.C6745a;
import t3.InterfaceC7028o;
import t3.j0;
import t3.k0;
import t3.l0;
import v3.g0;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: v4.e */
/* loaded from: classes.dex */
public final class C7659e implements j0 {

    /* renamed from: a */
    public final /* synthetic */ C7672r f37093a;

    /* renamed from: b */
    public final /* synthetic */ g0 f37094b;

    public C7659e(C7672r c7672r, g0 g0Var) {
        this.f37093a = c7672r;
        this.f37094b = g0Var;
    }

    @Override // t3.j0
    public final int maxIntrinsicHeight(InterfaceC7028o interfaceC7028o, List list, int i10) {
        C7672r c7672r = this.f37093a;
        ViewGroup.LayoutParams layoutParams = c7672r.getLayoutParams();
        AbstractC4154l.m8920c(layoutParams);
        c7672r.measure(AbstractC7663i.m14678l(c7672r, 0, i10, layoutParams.width), View.MeasureSpec.makeMeasureSpec(0, 0));
        return c7672r.getMeasuredHeight();
    }

    @Override // t3.j0
    public final int maxIntrinsicWidth(InterfaceC7028o interfaceC7028o, List list, int i10) {
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        C7672r c7672r = this.f37093a;
        ViewGroup.LayoutParams layoutParams = c7672r.getLayoutParams();
        AbstractC4154l.m8920c(layoutParams);
        c7672r.measure(iMakeMeasureSpec, AbstractC7663i.m14678l(c7672r, 0, i10, layoutParams.height));
        return c7672r.getMeasuredWidth();
    }

    @Override // t3.j0
    /* renamed from: measure-3p2s80s */
    public final k0 mo16554measure3p2s80s(l0 l0Var, List list, long j6) {
        C7672r c7672r = this.f37093a;
        int childCount = c7672r.getChildCount();
        C6669s c6669s = C6669s.f31944a;
        if (childCount == 0) {
            return l0Var.g0(C6745a.m12920k(j6), C6745a.m12919j(j6), c6669s, C7657c.f37086c);
        }
        if (C6745a.m12920k(j6) != 0) {
            c7672r.getChildAt(0).setMinimumWidth(C6745a.m12920k(j6));
        }
        if (C6745a.m12919j(j6) != 0) {
            c7672r.getChildAt(0).setMinimumHeight(C6745a.m12919j(j6));
        }
        int iM12920k = C6745a.m12920k(j6);
        int iM12918i = C6745a.m12918i(j6);
        ViewGroup.LayoutParams layoutParams = c7672r.getLayoutParams();
        AbstractC4154l.m8920c(layoutParams);
        int iM14678l = AbstractC7663i.m14678l(c7672r, iM12920k, iM12918i, layoutParams.width);
        int iM12919j = C6745a.m12919j(j6);
        int iM12917h = C6745a.m12917h(j6);
        ViewGroup.LayoutParams layoutParams2 = c7672r.getLayoutParams();
        AbstractC4154l.m8920c(layoutParams2);
        c7672r.measure(iM14678l, AbstractC7663i.m14678l(c7672r, iM12919j, iM12917h, layoutParams2.height));
        return l0Var.g0(c7672r.getMeasuredWidth(), c7672r.getMeasuredHeight(), c6669s, new C7658d(c7672r, this.f37094b, 1));
    }

    @Override // t3.j0
    public final int minIntrinsicHeight(InterfaceC7028o interfaceC7028o, List list, int i10) {
        C7672r c7672r = this.f37093a;
        ViewGroup.LayoutParams layoutParams = c7672r.getLayoutParams();
        AbstractC4154l.m8920c(layoutParams);
        c7672r.measure(AbstractC7663i.m14678l(c7672r, 0, i10, layoutParams.width), View.MeasureSpec.makeMeasureSpec(0, 0));
        return c7672r.getMeasuredHeight();
    }

    @Override // t3.j0
    public final int minIntrinsicWidth(InterfaceC7028o interfaceC7028o, List list, int i10) {
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        C7672r c7672r = this.f37093a;
        ViewGroup.LayoutParams layoutParams = c7672r.getLayoutParams();
        AbstractC4154l.m8920c(layoutParams);
        c7672r.measure(iMakeMeasureSpec, AbstractC7663i.m14678l(c7672r, 0, i10, layoutParams.height));
        return c7672r.getMeasuredWidth();
    }
}
