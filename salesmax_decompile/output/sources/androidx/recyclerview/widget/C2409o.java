package androidx.recyclerview.widget;

import android.content.Context;
import android.graphics.PointF;
import android.util.DisplayMetrics;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.common.api.Api;

/* renamed from: androidx.recyclerview.widget.o */
/* loaded from: classes2.dex */
public class C2409o extends AbstractC2413s {

    /* renamed from: d */
    public AbstractC2408n f10183d;

    /* renamed from: e */
    public AbstractC2408n f10184e;

    /* renamed from: androidx.recyclerview.widget.o$a */
    public class a extends C2406l {
        public a(Context context) {
            super(context);
        }

        @Override // androidx.recyclerview.widget.C2406l, androidx.recyclerview.widget.RecyclerView.AbstractC2388y
        /* renamed from: o */
        public void mo9334o(View view, RecyclerView.C2389z c2389z, RecyclerView.AbstractC2388y.a aVar) {
            C2409o c2409o = C2409o.this;
            int[] iArrMo9644c = c2409o.mo9644c(c2409o.f10191a.getLayoutManager(), view);
            int i = iArrMo9644c[0];
            int i2 = iArrMo9644c[1];
            int iM9614w = m9614w(Math.max(Math.abs(i), Math.abs(i2)));
            if (iM9614w > 0) {
                aVar.m9341d(i, i2, iM9614w, this.f10172j);
            }
        }

        @Override // androidx.recyclerview.widget.C2406l
        /* renamed from: v */
        public float mo9613v(DisplayMetrics displayMetrics) {
            return 100.0f / displayMetrics.densityDpi;
        }

        @Override // androidx.recyclerview.widget.C2406l
        /* renamed from: x */
        public int mo9615x(int i) {
            return Math.min(100, super.mo9615x(i));
        }
    }

    @Override // androidx.recyclerview.widget.AbstractC2413s
    /* renamed from: c */
    public int[] mo9644c(RecyclerView.AbstractC2379p abstractC2379p, View view) {
        int[] iArr = new int[2];
        if (abstractC2379p.mo9027A()) {
            iArr[0] = m9648k(view, m9650m(abstractC2379p));
        } else {
            iArr[0] = 0;
        }
        if (abstractC2379p.mo9028B()) {
            iArr[1] = m9648k(view, m9652o(abstractC2379p));
        } else {
            iArr[1] = 0;
        }
        return iArr;
    }

    @Override // androidx.recyclerview.widget.AbstractC2413s
    /* renamed from: d */
    public RecyclerView.AbstractC2388y mo9645d(RecyclerView.AbstractC2379p abstractC2379p) {
        if (abstractC2379p instanceof RecyclerView.AbstractC2388y.b) {
            return new a(this.f10191a.getContext());
        }
        return null;
    }

    @Override // androidx.recyclerview.widget.AbstractC2413s
    /* renamed from: f */
    public View mo9646f(RecyclerView.AbstractC2379p abstractC2379p) {
        if (abstractC2379p.mo9028B()) {
            return m9649l(abstractC2379p, m9652o(abstractC2379p));
        }
        if (abstractC2379p.mo9027A()) {
            return m9649l(abstractC2379p, m9650m(abstractC2379p));
        }
        return null;
    }

    @Override // androidx.recyclerview.widget.AbstractC2413s
    /* renamed from: g */
    public int mo9647g(RecyclerView.AbstractC2379p abstractC2379p, int i, int i2) {
        AbstractC2408n abstractC2408nM9651n;
        int iM9242j = abstractC2379p.m9242j();
        if (iM9242j == 0 || (abstractC2408nM9651n = m9651n(abstractC2379p)) == null) {
            return -1;
        }
        int iM9241Z = abstractC2379p.m9241Z();
        View view = null;
        int i3 = Integer.MAX_VALUE;
        int i4 = Integer.MIN_VALUE;
        View view2 = null;
        for (int i5 = 0; i5 < iM9241Z; i5++) {
            View viewM9240Y = abstractC2379p.m9240Y(i5);
            if (viewM9240Y != null) {
                int iM9648k = m9648k(viewM9240Y, abstractC2408nM9651n);
                if (iM9648k <= 0 && iM9648k > i4) {
                    view2 = viewM9240Y;
                    i4 = iM9648k;
                }
                if (iM9648k >= 0 && iM9648k < i3) {
                    view = viewM9240Y;
                    i3 = iM9648k;
                }
            }
        }
        boolean zM9653p = m9653p(abstractC2379p, i, i2);
        if (zM9653p && view != null) {
            return abstractC2379p.s0(view);
        }
        if (!zM9653p && view2 != null) {
            return abstractC2379p.s0(view2);
        }
        if (zM9653p) {
            view = view2;
        }
        if (view == null) {
            return -1;
        }
        int iS0 = abstractC2379p.s0(view) + (m9654q(abstractC2379p) == zM9653p ? -1 : 1);
        if (iS0 < 0 || iS0 >= iM9242j) {
            return -1;
        }
        return iS0;
    }

    /* renamed from: k */
    public final int m9648k(View view, AbstractC2408n abstractC2408n) {
        return (abstractC2408n.mo9630g(view) + (abstractC2408n.mo9628e(view) / 2)) - (abstractC2408n.mo9637n() + (abstractC2408n.mo9638o() / 2));
    }

    /* renamed from: l */
    public final View m9649l(RecyclerView.AbstractC2379p abstractC2379p, AbstractC2408n abstractC2408n) {
        int iM9241Z = abstractC2379p.m9241Z();
        View view = null;
        if (iM9241Z == 0) {
            return null;
        }
        int iMo9637n = abstractC2408n.mo9637n() + (abstractC2408n.mo9638o() / 2);
        int i = Api.BaseClientBuilder.API_PRIORITY_OTHER;
        for (int i2 = 0; i2 < iM9241Z; i2++) {
            View viewM9240Y = abstractC2379p.m9240Y(i2);
            int iAbs = Math.abs((abstractC2408n.mo9630g(viewM9240Y) + (abstractC2408n.mo9628e(viewM9240Y) / 2)) - iMo9637n);
            if (iAbs < i) {
                view = viewM9240Y;
                i = iAbs;
            }
        }
        return view;
    }

    /* renamed from: m */
    public final AbstractC2408n m9650m(RecyclerView.AbstractC2379p abstractC2379p) {
        AbstractC2408n abstractC2408n = this.f10184e;
        if (abstractC2408n == null || abstractC2408n.f10180a != abstractC2379p) {
            this.f10184e = AbstractC2408n.m9624a(abstractC2379p);
        }
        return this.f10184e;
    }

    /* renamed from: n */
    public final AbstractC2408n m9651n(RecyclerView.AbstractC2379p abstractC2379p) {
        if (abstractC2379p.mo9028B()) {
            return m9652o(abstractC2379p);
        }
        if (abstractC2379p.mo9027A()) {
            return m9650m(abstractC2379p);
        }
        return null;
    }

    /* renamed from: o */
    public final AbstractC2408n m9652o(RecyclerView.AbstractC2379p abstractC2379p) {
        AbstractC2408n abstractC2408n = this.f10183d;
        if (abstractC2408n == null || abstractC2408n.f10180a != abstractC2379p) {
            this.f10183d = AbstractC2408n.m9626c(abstractC2379p);
        }
        return this.f10183d;
    }

    /* renamed from: p */
    public final boolean m9653p(RecyclerView.AbstractC2379p abstractC2379p, int i, int i2) {
        return abstractC2379p.mo9027A() ? i > 0 : i2 > 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: q */
    public final boolean m9654q(RecyclerView.AbstractC2379p abstractC2379p) {
        PointF pointFMo9034c;
        int iM9242j = abstractC2379p.m9242j();
        if (!(abstractC2379p instanceof RecyclerView.AbstractC2388y.b) || (pointFMo9034c = ((RecyclerView.AbstractC2388y.b) abstractC2379p).mo9034c(iM9242j - 1)) == null) {
            return false;
        }
        return pointFMo9034c.x < 0.0f || pointFMo9034c.y < 0.0f;
    }
}
