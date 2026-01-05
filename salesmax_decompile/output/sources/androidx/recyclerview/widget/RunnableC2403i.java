package androidx.recyclerview.widget;

import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.concurrent.TimeUnit;
import p001o.zsh;

/* renamed from: androidx.recyclerview.widget.i */
/* loaded from: classes2.dex */
public final class RunnableC2403i implements Runnable {

    /* renamed from: e */
    public static final ThreadLocal f10087e = new ThreadLocal();

    /* renamed from: f */
    public static Comparator f10088f = new a();

    /* renamed from: b */
    public long f10090b;

    /* renamed from: c */
    public long f10091c;

    /* renamed from: a */
    public ArrayList f10089a = new ArrayList();

    /* renamed from: d */
    public ArrayList f10092d = new ArrayList();

    /* renamed from: androidx.recyclerview.widget.i$a */
    public class a implements Comparator {
        @Override // java.util.Comparator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(c cVar, c cVar2) {
            RecyclerView recyclerView = cVar.f10100d;
            if ((recyclerView == null) != (cVar2.f10100d == null)) {
                return recyclerView == null ? 1 : -1;
            }
            boolean z = cVar.f10097a;
            if (z != cVar2.f10097a) {
                return z ? -1 : 1;
            }
            int i = cVar2.f10098b - cVar.f10098b;
            if (i != 0) {
                return i;
            }
            int i2 = cVar.f10099c - cVar2.f10099c;
            if (i2 != 0) {
                return i2;
            }
            return 0;
        }
    }

    /* renamed from: androidx.recyclerview.widget.i$b */
    public static class b implements RecyclerView.AbstractC2379p.c {

        /* renamed from: a */
        public int f10093a;

        /* renamed from: b */
        public int f10094b;

        /* renamed from: c */
        public int[] f10095c;

        /* renamed from: d */
        public int f10096d;

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC2379p.c
        /* renamed from: a */
        public void mo9256a(int i, int i2) {
            if (i < 0) {
                throw new IllegalArgumentException("Layout positions must be non-negative");
            }
            if (i2 < 0) {
                throw new IllegalArgumentException("Pixel distance must be non-negative");
            }
            int i3 = this.f10096d * 2;
            int[] iArr = this.f10095c;
            if (iArr == null) {
                int[] iArr2 = new int[4];
                this.f10095c = iArr2;
                Arrays.fill(iArr2, -1);
            } else if (i3 >= iArr.length) {
                int[] iArr3 = new int[i3 * 2];
                this.f10095c = iArr3;
                System.arraycopy(iArr, 0, iArr3, 0, iArr.length);
            }
            int[] iArr4 = this.f10095c;
            iArr4[i3] = i;
            iArr4[i3 + 1] = i2;
            this.f10096d++;
        }

        /* renamed from: b */
        public void m9542b() {
            int[] iArr = this.f10095c;
            if (iArr != null) {
                Arrays.fill(iArr, -1);
            }
            this.f10096d = 0;
        }

        /* renamed from: c */
        public void m9543c(RecyclerView recyclerView, boolean z) {
            this.f10096d = 0;
            int[] iArr = this.f10095c;
            if (iArr != null) {
                Arrays.fill(iArr, -1);
            }
            RecyclerView.AbstractC2379p abstractC2379p = recyclerView.f9763L;
            if (recyclerView.f9762H == null || abstractC2379p == null || !abstractC2379p.F0()) {
                return;
            }
            if (z) {
                if (!recyclerView.f9770e.m9414p()) {
                    abstractC2379p.mo9030F(recyclerView.f9762H.getItemCount(), this);
                }
            } else if (!recyclerView.s0()) {
                abstractC2379p.mo9029E(this.f10093a, this.f10094b, recyclerView.W0, this);
            }
            int i = this.f10096d;
            if (i > abstractC2379p.f9827H) {
                abstractC2379p.f9827H = i;
                abstractC2379p.f9828L = z;
                recyclerView.f9768c.m9290P();
            }
        }

        /* renamed from: d */
        public boolean m9544d(int i) {
            if (this.f10095c != null) {
                int i2 = this.f10096d * 2;
                for (int i3 = 0; i3 < i2; i3 += 2) {
                    if (this.f10095c[i3] == i) {
                        return true;
                    }
                }
            }
            return false;
        }

        /* renamed from: e */
        public void m9545e(int i, int i2) {
            this.f10093a = i;
            this.f10094b = i2;
        }
    }

    /* renamed from: androidx.recyclerview.widget.i$c */
    public static class c {

        /* renamed from: a */
        public boolean f10097a;

        /* renamed from: b */
        public int f10098b;

        /* renamed from: c */
        public int f10099c;

        /* renamed from: d */
        public RecyclerView f10100d;

        /* renamed from: e */
        public int f10101e;

        /* renamed from: a */
        public void m9546a() {
            this.f10097a = false;
            this.f10098b = 0;
            this.f10099c = 0;
            this.f10100d = null;
            this.f10101e = 0;
        }
    }

    /* renamed from: e */
    public static boolean m9531e(RecyclerView recyclerView, int i) {
        int iM9453j = recyclerView.f9771f.m9453j();
        for (int i2 = 0; i2 < iM9453j; i2++) {
            RecyclerView.d0 d0VarL0 = RecyclerView.l0(recyclerView.f9771f.m9452i(i2));
            if (d0VarL0.f9796c == i && !d0VarL0.m9158v()) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    public void m9532a(RecyclerView recyclerView) {
        this.f10089a.add(recyclerView);
    }

    /* renamed from: b */
    public final void m9533b() {
        c cVar;
        int size = this.f10089a.size();
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            RecyclerView recyclerView = (RecyclerView) this.f10089a.get(i2);
            if (recyclerView.getWindowVisibility() == 0) {
                recyclerView.V0.m9543c(recyclerView, false);
                i += recyclerView.V0.f10096d;
            }
        }
        this.f10092d.ensureCapacity(i);
        int i3 = 0;
        for (int i4 = 0; i4 < size; i4++) {
            RecyclerView recyclerView2 = (RecyclerView) this.f10089a.get(i4);
            if (recyclerView2.getWindowVisibility() == 0) {
                b bVar = recyclerView2.V0;
                int iAbs = Math.abs(bVar.f10093a) + Math.abs(bVar.f10094b);
                for (int i5 = 0; i5 < bVar.f10096d * 2; i5 += 2) {
                    if (i3 >= this.f10092d.size()) {
                        cVar = new c();
                        this.f10092d.add(cVar);
                    } else {
                        cVar = (c) this.f10092d.get(i3);
                    }
                    int[] iArr = bVar.f10095c;
                    int i6 = iArr[i5 + 1];
                    cVar.f10097a = i6 <= iAbs;
                    cVar.f10098b = iAbs;
                    cVar.f10099c = i6;
                    cVar.f10100d = recyclerView2;
                    cVar.f10101e = iArr[i5];
                    i3++;
                }
            }
        }
        Collections.sort(this.f10092d, f10088f);
    }

    /* renamed from: c */
    public final void m9534c(c cVar, long j) {
        RecyclerView.d0 d0VarM9539i = m9539i(cVar.f10100d, cVar.f10101e, cVar.f10097a ? Long.MAX_VALUE : j);
        if (d0VarM9539i == null || d0VarM9539i.f9795b == null || !d0VarM9539i.m9157u() || d0VarM9539i.m9158v()) {
            return;
        }
        m9538h((RecyclerView) d0VarM9539i.f9795b.get(), j);
    }

    /* renamed from: d */
    public final void m9535d(long j) {
        for (int i = 0; i < this.f10092d.size(); i++) {
            c cVar = (c) this.f10092d.get(i);
            if (cVar.f10100d == null) {
                return;
            }
            m9534c(cVar, j);
            cVar.m9546a();
        }
    }

    /* renamed from: f */
    public void m9536f(RecyclerView recyclerView, int i, int i2) {
        if (recyclerView.isAttachedToWindow() && this.f10090b == 0) {
            this.f10090b = recyclerView.getNanoTime();
            recyclerView.post(this);
        }
        recyclerView.V0.m9545e(i, i2);
    }

    /* renamed from: g */
    public void m9537g(long j) {
        m9533b();
        m9535d(j);
    }

    /* renamed from: h */
    public final void m9538h(RecyclerView recyclerView, long j) {
        if (recyclerView == null) {
            return;
        }
        if (recyclerView.v0 && recyclerView.f9771f.m9453j() != 0) {
            recyclerView.e1();
        }
        b bVar = recyclerView.V0;
        bVar.m9543c(recyclerView, true);
        if (bVar.f10096d != 0) {
            try {
                zsh.m59821a("RV Nested Prefetch");
                recyclerView.W0.m9348f(recyclerView.f9762H);
                for (int i = 0; i < bVar.f10096d * 2; i += 2) {
                    m9539i(recyclerView, bVar.f10095c[i], j);
                }
            } finally {
                zsh.m59822b();
            }
        }
    }

    /* renamed from: i */
    public final RecyclerView.d0 m9539i(RecyclerView recyclerView, int i, long j) {
        if (m9531e(recyclerView, i)) {
            return null;
        }
        RecyclerView.C2385v c2385v = recyclerView.f9768c;
        try {
            recyclerView.O0();
            RecyclerView.d0 d0VarM9288N = c2385v.m9288N(i, false, j);
            if (d0VarM9288N != null) {
                if (!d0VarM9288N.m9157u() || d0VarM9288N.m9158v()) {
                    c2385v.m9293a(d0VarM9288N, false);
                } else {
                    c2385v.m9281G(d0VarM9288N.f9794a);
                }
            }
            return d0VarM9288N;
        } finally {
            recyclerView.Q0(false);
        }
    }

    /* renamed from: j */
    public void m9540j(RecyclerView recyclerView) {
        this.f10089a.remove(recyclerView);
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            zsh.m59821a("RV Prefetch");
            if (!this.f10089a.isEmpty()) {
                int size = this.f10089a.size();
                long jMax = 0;
                for (int i = 0; i < size; i++) {
                    RecyclerView recyclerView = (RecyclerView) this.f10089a.get(i);
                    if (recyclerView.getWindowVisibility() == 0) {
                        jMax = Math.max(recyclerView.getDrawingTime(), jMax);
                    }
                }
                if (jMax != 0) {
                    m9537g(TimeUnit.MILLISECONDS.toNanos(jMax) + this.f10091c);
                }
            }
        } finally {
            this.f10090b = 0L;
            zsh.m59822b();
        }
    }
}
