package p001o;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.carousel.AbstractC10987a;
import com.google.android.material.carousel.AbstractC10988b;
import com.google.android.material.carousel.C10989c;

/* loaded from: classes3.dex */
public final class rnb extends AbstractC10987a {

    /* renamed from: d */
    public static final int[] f43858d = {1};

    /* renamed from: e */
    public static final int[] f43859e = {1, 0};

    /* renamed from: c */
    public int f43860c = 0;

    @Override // com.google.android.material.carousel.AbstractC10987a
    /* renamed from: g */
    public C10989c mo14291g(ke2 ke2Var, View view) {
        int iMo14275b = ke2Var.mo14275b();
        if (ke2Var.mo14277k()) {
            iMo14275b = ke2Var.mo14274a();
        }
        RecyclerView.LayoutParams layoutParams = (RecyclerView.LayoutParams) view.getLayoutParams();
        float f = ((ViewGroup.MarginLayoutParams) layoutParams).topMargin + ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin;
        float measuredHeight = view.getMeasuredHeight();
        if (ke2Var.mo14277k()) {
            f = ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin + ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin;
            measuredHeight = view.getMeasuredWidth();
        }
        float fM14288d = m14288d() + f;
        float fMax = Math.max(m14287c() + f, fM14288d);
        float f2 = iMo14275b;
        float fMin = Math.min(measuredHeight + f, f2);
        float fM44555a = pza.m44555a((measuredHeight / 3.0f) + f, fM14288d + f, fMax + f);
        float f3 = (fMin + fM44555a) / 2.0f;
        int[] iArrM14285a = f43858d;
        float f4 = fM14288d * 2.0f;
        if (f2 <= f4) {
            iArrM14285a = new int[]{0};
        }
        int[] iArrM14285a2 = f43859e;
        if (ke2Var.mo14276h() == 1) {
            iArrM14285a = AbstractC10987a.m14285a(iArrM14285a);
            iArrM14285a2 = AbstractC10987a.m14285a(iArrM14285a2);
        }
        int[] iArr = iArrM14285a;
        int[] iArr2 = iArrM14285a2;
        int iMax = (int) Math.max(1.0d, Math.floor(((f2 - (AbstractC10988b.m14301i(iArr2) * f3)) - (AbstractC10988b.m14301i(iArr) * fMax)) / fMin));
        int iCeil = (int) Math.ceil(f2 / fMin);
        int i = (iCeil - iMax) + 1;
        int[] iArr3 = new int[i];
        for (int i2 = 0; i2 < i; i2++) {
            iArr3[i2] = iCeil - i2;
        }
        int i3 = iMo14275b;
        jo0 jo0VarM34139c = jo0.m34139c(f2, fM44555a, fM14288d, fMax, iArr, f3, iArr2, fMin, iArr3);
        this.f43860c = jo0VarM34139c.m34143e();
        boolean zM47004i = m47004i(jo0VarM34139c, ke2Var.m35527j());
        int i4 = jo0VarM34139c.f30841d;
        if (i4 == 0 && jo0VarM34139c.f30840c == 0 && f2 > f4) {
            jo0VarM34139c.f30840c = 1;
            zM47004i = true;
        }
        if (zM47004i) {
            jo0VarM34139c = jo0.m34139c(f2, fM44555a, fM14288d, fMax, new int[]{jo0VarM34139c.f30840c}, f3, new int[]{i4}, fMin, new int[]{jo0VarM34139c.f30844g});
        }
        return AbstractC10988b.m14296d(view.getContext(), f, i3, jo0VarM34139c, ke2Var.mo14276h());
    }

    @Override // com.google.android.material.carousel.AbstractC10987a
    /* renamed from: h */
    public boolean mo14292h(ke2 ke2Var, int i) {
        return (i < this.f43860c && ke2Var.m35527j() >= this.f43860c) || (i >= this.f43860c && ke2Var.m35527j() < this.f43860c);
    }

    /* renamed from: i */
    public boolean m47004i(jo0 jo0Var, int i) {
        int iM34143e = jo0Var.m34143e() - i;
        boolean z = iM34143e > 0 && (jo0Var.f30840c > 0 || jo0Var.f30841d > 1);
        while (iM34143e > 0) {
            int i2 = jo0Var.f30840c;
            if (i2 > 0) {
                jo0Var.f30840c = i2 - 1;
            } else {
                int i3 = jo0Var.f30841d;
                if (i3 > 1) {
                    jo0Var.f30841d = i3 - 1;
                }
            }
            iM34143e--;
        }
        return z;
    }
}
