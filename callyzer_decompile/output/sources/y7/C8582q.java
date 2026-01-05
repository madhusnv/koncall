package y7;

import android.view.View;
import java.util.List;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: y7.q */
/* loaded from: classes.dex */
public final class C8582q {

    /* renamed from: a */
    public boolean f41739a;

    /* renamed from: b */
    public int f41740b;

    /* renamed from: c */
    public int f41741c;

    /* renamed from: d */
    public int f41742d;

    /* renamed from: e */
    public int f41743e;

    /* renamed from: f */
    public int f41744f;

    /* renamed from: g */
    public int f41745g;

    /* renamed from: h */
    public int f41746h;

    /* renamed from: i */
    public int f41747i;

    /* renamed from: j */
    public int f41748j;

    /* renamed from: k */
    public List f41749k;

    /* renamed from: l */
    public boolean f41750l;

    /* renamed from: a */
    public final void m15891a(View view) {
        int iM15917b;
        int size = this.f41749k.size();
        View view2 = null;
        int i10 = Integer.MAX_VALUE;
        for (int i11 = 0; i11 < size; i11++) {
            View view3 = ((t0) this.f41749k.get(i11)).f41792a;
            g0 g0Var = (g0) view3.getLayoutParams();
            if (view3 != view && !g0Var.f41639a.m15923h() && (iM15917b = (g0Var.f41639a.m15917b() - this.f41742d) * this.f41743e) >= 0 && iM15917b < i10) {
                view2 = view3;
                if (iM15917b == 0) {
                    break;
                } else {
                    i10 = iM15917b;
                }
            }
        }
        if (view2 == null) {
            this.f41742d = -1;
        } else {
            this.f41742d = ((g0) view2.getLayoutParams()).f41639a.m15917b();
        }
    }

    /* renamed from: b */
    public final View m15892b(l0 l0Var) {
        List list = this.f41749k;
        if (list == null) {
            View view = l0Var.m15883i(this.f41742d, Long.MAX_VALUE).f41792a;
            this.f41742d += this.f41743e;
            return view;
        }
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            View view2 = ((t0) this.f41749k.get(i10)).f41792a;
            g0 g0Var = (g0) view2.getLayoutParams();
            if (!g0Var.f41639a.m15923h() && this.f41742d == g0Var.f41639a.m15917b()) {
                m15891a(view2);
                return view2;
            }
        }
        return null;
    }
}
