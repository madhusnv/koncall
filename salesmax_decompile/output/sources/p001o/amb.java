package p001o;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.kizitonwose.calendar.view.internal.C11562a;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes6.dex */
public final class amb extends RecyclerView.d0 {

    /* renamed from: A */
    public dwi f14988A;

    /* renamed from: B */
    public ws1 f14989B;

    /* renamed from: u */
    public final View f14990u;

    /* renamed from: v */
    public final View f14991v;

    /* renamed from: w */
    public final List f14992w;

    /* renamed from: x */
    public zlb f14993x;

    /* renamed from: y */
    public zlb f14994y;

    /* renamed from: z */
    public dwi f14995z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public amb(ViewGroup viewGroup, View view, View view2, List list, zlb zlbVar, zlb zlbVar2) {
        super(viewGroup);
        sq8.m48649h(viewGroup, "rootLayout");
        sq8.m48649h(list, "weekHolders");
        this.f14990u = view;
        this.f14991v = view2;
        this.f14992w = list;
        this.f14993x = zlbVar;
        this.f14994y = zlbVar2;
    }

    /* renamed from: O */
    public final void m17459O(ws1 ws1Var) {
        sq8.m48649h(ws1Var, "month");
        m17461Q(ws1Var);
        View view = this.f14990u;
        if (view != null) {
            dwi dwiVarMo3086a = this.f14995z;
            if (dwiVarMo3086a == null) {
                zlb zlbVar = this.f14993x;
                sq8.m48646e(zlbVar);
                dwiVarMo3086a = zlbVar.mo3086a(view);
                this.f14995z = dwiVarMo3086a;
            }
            zlb zlbVar2 = this.f14993x;
            if (zlbVar2 != null) {
                zlbVar2.mo3087b(dwiVarMo3086a, ws1Var);
            }
        }
        int i = 0;
        for (Object obj : this.f14992w) {
            int i2 = i + 1;
            if (i < 0) {
                ch3.m21256u();
            }
            C11562a c11562a = (C11562a) obj;
            List listM21246k = (List) kh3.i0(ws1Var.m54946a(), i);
            if (listM21246k == null) {
                listM21246k = ch3.m21246k();
            }
            c11562a.m15882a(listM21246k);
            i = i2;
        }
        View view2 = this.f14991v;
        if (view2 != null) {
            dwi dwiVarMo3086a2 = this.f14988A;
            if (dwiVarMo3086a2 == null) {
                zlb zlbVar3 = this.f14994y;
                sq8.m48646e(zlbVar3);
                dwiVarMo3086a2 = zlbVar3.mo3086a(view2);
                this.f14988A = dwiVarMo3086a2;
            }
            zlb zlbVar4 = this.f14994y;
            if (zlbVar4 != null) {
                zlbVar4.mo3087b(dwiVarMo3086a2, ws1Var);
            }
        }
    }

    /* renamed from: P */
    public final void m17460P(ps1 ps1Var) {
        sq8.m48649h(ps1Var, "day");
        Iterator it = this.f14992w.iterator();
        while (it.hasNext() && !((C11562a) it.next()).m15884c(ps1Var)) {
        }
    }

    /* renamed from: Q */
    public final void m17461Q(ws1 ws1Var) {
        sq8.m48649h(ws1Var, "<set-?>");
        this.f14989B = ws1Var;
    }
}
