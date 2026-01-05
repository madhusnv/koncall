package androidx.recyclerview.widget;

import android.view.View;
import android.view.animation.DecelerateInterpolator;
import android.widget.Scroller;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: androidx.recyclerview.widget.s */
/* loaded from: classes2.dex */
public abstract class AbstractC2413s extends RecyclerView.AbstractC2381r {

    /* renamed from: a */
    public RecyclerView f10191a;

    /* renamed from: b */
    public Scroller f10192b;

    /* renamed from: c */
    public final RecyclerView.AbstractC2383t f10193c = new a();

    /* renamed from: androidx.recyclerview.widget.s$a */
    public class a extends RecyclerView.AbstractC2383t {

        /* renamed from: a */
        public boolean f10194a = false;

        public a() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC2383t
        /* renamed from: a */
        public void mo9260a(RecyclerView recyclerView, int i) {
            super.mo9260a(recyclerView, i);
            if (i == 0 && this.f10194a) {
                this.f10194a = false;
                AbstractC2413s.this.m9685j();
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC2383t
        /* renamed from: b */
        public void mo964b(RecyclerView recyclerView, int i, int i2) {
            if (i == 0 && i2 == 0) {
                return;
            }
            this.f10194a = true;
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC2381r
    /* renamed from: a */
    public boolean mo9259a(int i, int i2) {
        RecyclerView.AbstractC2379p layoutManager = this.f10191a.getLayoutManager();
        if (layoutManager == null || this.f10191a.getAdapter() == null) {
            return false;
        }
        int minFlingVelocity = this.f10191a.getMinFlingVelocity();
        return (Math.abs(i2) > minFlingVelocity || Math.abs(i) > minFlingVelocity) && m9684i(layoutManager, i, i2);
    }

    /* renamed from: b */
    public void mo9681b(RecyclerView recyclerView) {
        RecyclerView recyclerView2 = this.f10191a;
        if (recyclerView2 == recyclerView) {
            return;
        }
        if (recyclerView2 != null) {
            m9682e();
        }
        this.f10191a = recyclerView;
        if (recyclerView != null) {
            m9683h();
            this.f10192b = new Scroller(this.f10191a.getContext(), new DecelerateInterpolator());
            m9685j();
        }
    }

    /* renamed from: c */
    public abstract int[] mo9644c(RecyclerView.AbstractC2379p abstractC2379p, View view);

    /* renamed from: d */
    public abstract RecyclerView.AbstractC2388y mo9645d(RecyclerView.AbstractC2379p abstractC2379p);

    /* renamed from: e */
    public final void m9682e() {
        this.f10191a.j1(this.f10193c);
        this.f10191a.setOnFlingListener(null);
    }

    /* renamed from: f */
    public abstract View mo9646f(RecyclerView.AbstractC2379p abstractC2379p);

    /* renamed from: g */
    public abstract int mo9647g(RecyclerView.AbstractC2379p abstractC2379p, int i, int i2);

    /* renamed from: h */
    public final void m9683h() {
        if (this.f10191a.getOnFlingListener() != null) {
            throw new IllegalStateException("An instance of OnFlingListener already set.");
        }
        this.f10191a.m9090l(this.f10193c);
        this.f10191a.setOnFlingListener(this);
    }

    /* renamed from: i */
    public final boolean m9684i(RecyclerView.AbstractC2379p abstractC2379p, int i, int i2) {
        RecyclerView.AbstractC2388y abstractC2388yMo9645d;
        int iMo9647g;
        if (!(abstractC2379p instanceof RecyclerView.AbstractC2388y.b) || (abstractC2388yMo9645d = mo9645d(abstractC2379p)) == null || (iMo9647g = mo9647g(abstractC2379p, i, i2)) == -1) {
            return false;
        }
        abstractC2388yMo9645d.m9335p(iMo9647g);
        abstractC2379p.W1(abstractC2388yMo9645d);
        return true;
    }

    /* renamed from: j */
    public void m9685j() {
        RecyclerView.AbstractC2379p layoutManager;
        View viewMo9646f;
        RecyclerView recyclerView = this.f10191a;
        if (recyclerView == null || (layoutManager = recyclerView.getLayoutManager()) == null || (viewMo9646f = mo9646f(layoutManager)) == null) {
            return;
        }
        int[] iArrMo9644c = mo9644c(layoutManager, viewMo9646f);
        int i = iArrMo9644c[0];
        if (i == 0 && iArrMo9644c[1] == 0) {
            return;
        }
        this.f10191a.x1(i, iArrMo9644c[1]);
    }
}
