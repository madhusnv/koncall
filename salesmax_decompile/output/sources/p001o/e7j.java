package p001o;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.kizitonwose.calendar.view.internal.C11562a;

/* loaded from: classes6.dex */
public final class e7j extends RecyclerView.d0 {

    /* renamed from: u */
    public final View f21135u;

    /* renamed from: v */
    public final View f21136v;

    /* renamed from: w */
    public final C11562a f21137w;

    /* renamed from: x */
    public dwi f21138x;

    /* renamed from: y */
    public dwi f21139y;

    /* renamed from: z */
    public s6j f21140z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e7j(ViewGroup viewGroup, View view, View view2, C11562a c11562a, d7j d7jVar, d7j d7jVar2) {
        super(viewGroup);
        sq8.m48649h(viewGroup, "rootLayout");
        sq8.m48649h(c11562a, "weekHolder");
        this.f21135u = view;
        this.f21136v = view2;
        this.f21137w = c11562a;
    }

    /* renamed from: O */
    public final void m24500O(s6j s6jVar) {
        sq8.m48649h(s6jVar, "week");
        m24502Q(s6jVar);
        if (this.f21135u != null && this.f21138x == null) {
            sq8.m48646e(null);
            throw null;
        }
        this.f21137w.m15882a(s6jVar.m47918a());
        if (this.f21136v == null || this.f21139y != null) {
            return;
        }
        sq8.m48646e(null);
        throw null;
    }

    /* renamed from: P */
    public final void m24501P(a7j a7jVar) {
        sq8.m48649h(a7jVar, "day");
        this.f21137w.m15884c(a7jVar);
    }

    /* renamed from: Q */
    public final void m24502Q(s6j s6jVar) {
        sq8.m48649h(s6jVar, "<set-?>");
        this.f21140z = s6jVar;
    }
}
