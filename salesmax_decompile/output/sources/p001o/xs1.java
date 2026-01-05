package p001o;

import android.view.View;
import androidx.recyclerview.widget.AbstractC2408n;
import androidx.recyclerview.widget.C2409o;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes6.dex */
public final class xs1 extends C2409o {

    /* renamed from: f */
    public RecyclerView f54216f;

    /* renamed from: g */
    public Integer f54217g;

    /* renamed from: h */
    public o6f f54218h;

    /* renamed from: i */
    public final C18239b f54219i = new C18239b();

    /* renamed from: j */
    public AbstractC2408n f54220j;

    /* renamed from: k */
    public AbstractC2408n f54221k;

    /* renamed from: o.xs1$a */
    public /* synthetic */ class C18238a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f54222a;

        static {
            int[] iArr = new int[o6f.values().length];
            try {
                iArr[o6f.Forward.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[o6f.Backward.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[o6f.Layout.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f54222a = iArr;
        }
    }

    /* renamed from: o.xs1$b */
    public static final class C18239b extends RecyclerView.AbstractC2383t {
        public C18239b() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC2383t
        /* renamed from: b */
        public void mo964b(RecyclerView recyclerView, int i, int i2) {
            sq8.m48649h(recyclerView, "recyclerView");
            xs1.this.f54218h = (i > 0 || i2 > 0) ? o6f.Forward : (i < 0 || i2 < 0) ? o6f.Backward : o6f.Layout;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0017  */
    /* renamed from: m */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final AbstractC2408n m56746m(RecyclerView.AbstractC2379p abstractC2379p) {
        AbstractC2408n abstractC2408n = this.f54221k;
        if (abstractC2408n == null) {
            AbstractC2408n abstractC2408nM9624a = AbstractC2408n.m9624a(abstractC2379p);
            sq8.m48648g(abstractC2408nM9624a, "createHorizontalHelper(lm)");
            this.f54221k = abstractC2408nM9624a;
        } else {
            if (abstractC2408n == null) {
                sq8.m48667z("horizontalHelper");
                abstractC2408n = null;
            }
            if (!sq8.m48644c(abstractC2408n.m9634k(), abstractC2379p)) {
            }
        }
        AbstractC2408n abstractC2408n2 = this.f54221k;
        if (abstractC2408n2 != null) {
            return abstractC2408n2;
        }
        sq8.m48667z("horizontalHelper");
        return null;
    }

    /* renamed from: n */
    private final AbstractC2408n m56747n(RecyclerView.AbstractC2379p abstractC2379p) {
        sq8.m48647f(abstractC2379p, "null cannot be cast to non-null type androidx.recyclerview.widget.LinearLayoutManager");
        int iY2 = ((LinearLayoutManager) abstractC2379p).y2();
        if (iY2 == 0) {
            return m56746m(abstractC2379p);
        }
        if (iY2 == 1) {
            return m56748o(abstractC2379p);
        }
        throw new IllegalStateException();
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0017  */
    /* renamed from: o */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final AbstractC2408n m56748o(RecyclerView.AbstractC2379p abstractC2379p) {
        AbstractC2408n abstractC2408n = this.f54220j;
        if (abstractC2408n == null) {
            AbstractC2408n abstractC2408nM9626c = AbstractC2408n.m9626c(abstractC2379p);
            sq8.m48648g(abstractC2408nM9626c, "createVerticalHelper(lm)");
            this.f54220j = abstractC2408nM9626c;
        } else {
            if (abstractC2408n == null) {
                sq8.m48667z("verticalHelper");
                abstractC2408n = null;
            }
            if (!sq8.m48644c(abstractC2408n.m9634k(), abstractC2379p)) {
            }
        }
        AbstractC2408n abstractC2408n2 = this.f54220j;
        if (abstractC2408n2 != null) {
            return abstractC2408n2;
        }
        sq8.m48667z("verticalHelper");
        return null;
    }

    /* renamed from: p */
    private final boolean m56749p(RecyclerView.AbstractC2379p abstractC2379p, int i, int i2) {
        if (abstractC2379p.mo9027A()) {
            if (i > 0) {
                return true;
            }
        } else if (i2 > 0) {
            return true;
        }
        return false;
    }

    @Override // androidx.recyclerview.widget.AbstractC2413s
    /* renamed from: b */
    public void mo9681b(RecyclerView recyclerView) {
        super.mo9681b(recyclerView);
        RecyclerView recyclerView2 = this.f54216f;
        if (recyclerView2 != null) {
            recyclerView2.j1(this.f54219i);
        }
        this.f54216f = recyclerView;
        if (recyclerView != null) {
            recyclerView.m9090l(this.f54219i);
        }
    }

    @Override // androidx.recyclerview.widget.C2409o, androidx.recyclerview.widget.AbstractC2413s
    /* renamed from: c */
    public int[] mo9644c(RecyclerView.AbstractC2379p abstractC2379p, View view) {
        sq8.m48649h(abstractC2379p, "lm");
        sq8.m48649h(view, "targetView");
        int[] iArr = new int[2];
        iArr[0] = abstractC2379p.mo9027A() ? m56751s(view, m56746m(abstractC2379p)) : 0;
        iArr[1] = abstractC2379p.mo9028B() ? m56751s(view, m56748o(abstractC2379p)) : 0;
        return iArr;
    }

    @Override // androidx.recyclerview.widget.C2409o, androidx.recyclerview.widget.AbstractC2413s
    /* renamed from: f */
    public View mo9646f(RecyclerView.AbstractC2379p abstractC2379p) {
        int iM56751s;
        sq8.m48649h(abstractC2379p, "lm");
        Integer num = this.f54217g;
        if (num != null) {
            this.f54217g = null;
            return abstractC2379p.mo9033S(num.intValue());
        }
        o6f o6fVar = this.f54218h;
        this.f54218h = null;
        AbstractC2408n abstractC2408nM56747n = m56747n(abstractC2379p);
        LinearLayoutManager linearLayoutManager = (LinearLayoutManager) abstractC2379p;
        int iM56754v = m56754v(linearLayoutManager);
        int iM56752t = m56752t(linearLayoutManager);
        View viewMo9033S = abstractC2379p.mo9033S(iM56752t);
        if (viewMo9033S == null || (iM56751s = m56751s(viewMo9033S, abstractC2408nM56747n)) == 0) {
            return null;
        }
        int i = o6fVar == null ? -1 : C18238a.f54222a[o6fVar.ordinal()];
        if (i != -1) {
            if (i != 1) {
                if (i == 2) {
                    View viewMo9033S2 = abstractC2379p.mo9033S(bce.m18609l(iM56752t + iM56754v, ys1.m58158b(abstractC2379p)));
                    if (viewMo9033S2 == null) {
                        return viewMo9033S;
                    }
                    if (Math.abs(m56751s(viewMo9033S2, abstractC2408nM56747n)) <= abstractC2408nM56747n.mo9628e(viewMo9033S2) * 0.1f) {
                        return viewMo9033S2;
                    }
                } else if (i != 3) {
                    throw new szb();
                }
            } else if (Math.abs(iM56751s) >= abstractC2408nM56747n.mo9628e(viewMo9033S) * 0.1f) {
                return abstractC2379p.mo9033S(bce.m18609l(iM56752t + iM56754v, ys1.m58158b(abstractC2379p)));
            }
        }
        return viewMo9033S;
    }

    @Override // androidx.recyclerview.widget.C2409o, androidx.recyclerview.widget.AbstractC2413s
    /* renamed from: g */
    public int mo9647g(RecyclerView.AbstractC2379p abstractC2379p, int i, int i2) {
        sq8.m48649h(abstractC2379p, "lm");
        int iM56753u = m56753u((LinearLayoutManager) abstractC2379p, i, i2);
        this.f54217g = Integer.valueOf(iM56753u);
        return iM56753u;
    }

    /* renamed from: s */
    public final int m56751s(View view, AbstractC2408n abstractC2408n) {
        return abstractC2408n.mo9630g(view) - abstractC2408n.mo9637n();
    }

    /* renamed from: t */
    public final int m56752t(LinearLayoutManager linearLayoutManager) {
        return linearLayoutManager.z2() ? linearLayoutManager.n2() : linearLayoutManager.l2();
    }

    /* renamed from: u */
    public final int m56753u(LinearLayoutManager linearLayoutManager, int i, int i2) {
        return bce.m18609l(m56749p(linearLayoutManager, i, i2) ? m56752t(linearLayoutManager) + m56754v(linearLayoutManager) : m56752t(linearLayoutManager), ys1.m58158b(linearLayoutManager));
    }

    /* renamed from: v */
    public final int m56754v(LinearLayoutManager linearLayoutManager) {
        return linearLayoutManager.z2() ? -1 : 1;
    }
}
