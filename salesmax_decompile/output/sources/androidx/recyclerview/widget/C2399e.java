package androidx.recyclerview.widget;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;

/* renamed from: androidx.recyclerview.widget.e */
/* loaded from: classes2.dex */
public class C2399e {

    /* renamed from: a */
    public final b f9970a;

    /* renamed from: b */
    public final a f9971b = new a();

    /* renamed from: c */
    public final List f9972c = new ArrayList();

    /* renamed from: androidx.recyclerview.widget.e$a */
    public static class a {

        /* renamed from: a */
        public long f9973a = 0;

        /* renamed from: b */
        public a f9974b;

        /* renamed from: a */
        public void m9464a(int i) {
            if (i < 64) {
                this.f9973a &= ~(1 << i);
                return;
            }
            a aVar = this.f9974b;
            if (aVar != null) {
                aVar.m9464a(i - 64);
            }
        }

        /* renamed from: b */
        public int m9465b(int i) {
            a aVar = this.f9974b;
            return aVar == null ? i >= 64 ? Long.bitCount(this.f9973a) : Long.bitCount(this.f9973a & ((1 << i) - 1)) : i < 64 ? Long.bitCount(this.f9973a & ((1 << i) - 1)) : aVar.m9465b(i - 64) + Long.bitCount(this.f9973a);
        }

        /* renamed from: c */
        public final void m9466c() {
            if (this.f9974b == null) {
                this.f9974b = new a();
            }
        }

        /* renamed from: d */
        public boolean m9467d(int i) {
            if (i < 64) {
                return (this.f9973a & (1 << i)) != 0;
            }
            m9466c();
            return this.f9974b.m9467d(i - 64);
        }

        /* renamed from: e */
        public void m9468e(int i, boolean z) {
            if (i >= 64) {
                m9466c();
                this.f9974b.m9468e(i - 64, z);
                return;
            }
            long j = this.f9973a;
            boolean z2 = (Long.MIN_VALUE & j) != 0;
            long j2 = (1 << i) - 1;
            this.f9973a = ((j & (~j2)) << 1) | (j & j2);
            if (z) {
                m9471h(i);
            } else {
                m9464a(i);
            }
            if (z2 || this.f9974b != null) {
                m9466c();
                this.f9974b.m9468e(0, z2);
            }
        }

        /* renamed from: f */
        public boolean m9469f(int i) {
            if (i >= 64) {
                m9466c();
                return this.f9974b.m9469f(i - 64);
            }
            long j = 1 << i;
            long j2 = this.f9973a;
            boolean z = (j2 & j) != 0;
            long j3 = j2 & (~j);
            this.f9973a = j3;
            long j4 = j - 1;
            this.f9973a = (j3 & j4) | Long.rotateRight((~j4) & j3, 1);
            a aVar = this.f9974b;
            if (aVar != null) {
                if (aVar.m9467d(0)) {
                    m9471h(63);
                }
                this.f9974b.m9469f(0);
            }
            return z;
        }

        /* renamed from: g */
        public void m9470g() {
            this.f9973a = 0L;
            a aVar = this.f9974b;
            if (aVar != null) {
                aVar.m9470g();
            }
        }

        /* renamed from: h */
        public void m9471h(int i) {
            if (i < 64) {
                this.f9973a |= 1 << i;
            } else {
                m9466c();
                this.f9974b.m9471h(i - 64);
            }
        }

        public String toString() {
            if (this.f9974b == null) {
                return Long.toBinaryString(this.f9973a);
            }
            return this.f9974b.toString() + "xx" + Long.toBinaryString(this.f9973a);
        }
    }

    /* renamed from: androidx.recyclerview.widget.e$b */
    public interface b {
        /* renamed from: a */
        View mo9163a(int i);

        /* renamed from: b */
        void mo9164b(View view);

        /* renamed from: c */
        int mo9165c();

        /* renamed from: d */
        RecyclerView.d0 mo9166d(View view);

        /* renamed from: e */
        void mo9167e(int i);

        /* renamed from: f */
        void mo9168f(View view, int i);

        /* renamed from: g */
        void mo9169g();

        /* renamed from: h */
        int mo9170h(View view);

        /* renamed from: i */
        void mo9171i(View view);

        /* renamed from: j */
        void mo9172j(int i);

        /* renamed from: k */
        void mo9173k(View view, int i, ViewGroup.LayoutParams layoutParams);
    }

    public C2399e(b bVar) {
        this.f9970a = bVar;
    }

    /* renamed from: a */
    public void m9444a(View view, int i, boolean z) {
        int iMo9165c = i < 0 ? this.f9970a.mo9165c() : m9451h(i);
        this.f9971b.m9468e(iMo9165c, z);
        if (z) {
            m9455l(view);
        }
        this.f9970a.mo9168f(view, iMo9165c);
    }

    /* renamed from: b */
    public void m9445b(View view, boolean z) {
        m9444a(view, -1, z);
    }

    /* renamed from: c */
    public void m9446c(View view, int i, ViewGroup.LayoutParams layoutParams, boolean z) {
        int iMo9165c = i < 0 ? this.f9970a.mo9165c() : m9451h(i);
        this.f9971b.m9468e(iMo9165c, z);
        if (z) {
            m9455l(view);
        }
        this.f9970a.mo9173k(view, iMo9165c, layoutParams);
    }

    /* renamed from: d */
    public void m9447d(int i) {
        int iM9451h = m9451h(i);
        this.f9971b.m9469f(iM9451h);
        this.f9970a.mo9167e(iM9451h);
    }

    /* renamed from: e */
    public View m9448e(int i) {
        int size = this.f9972c.size();
        for (int i2 = 0; i2 < size; i2++) {
            View view = (View) this.f9972c.get(i2);
            RecyclerView.d0 d0VarMo9166d = this.f9970a.mo9166d(view);
            if (d0VarMo9166d.m9151o() == i && !d0VarMo9166d.m9158v() && !d0VarMo9166d.m9160x()) {
                return view;
            }
        }
        return null;
    }

    /* renamed from: f */
    public View m9449f(int i) {
        return this.f9970a.mo9163a(m9451h(i));
    }

    /* renamed from: g */
    public int m9450g() {
        return this.f9970a.mo9165c() - this.f9972c.size();
    }

    /* renamed from: h */
    public final int m9451h(int i) {
        if (i < 0) {
            return -1;
        }
        int iMo9165c = this.f9970a.mo9165c();
        int i2 = i;
        while (i2 < iMo9165c) {
            int iM9465b = i - (i2 - this.f9971b.m9465b(i2));
            if (iM9465b == 0) {
                while (this.f9971b.m9467d(i2)) {
                    i2++;
                }
                return i2;
            }
            i2 += iM9465b;
        }
        return -1;
    }

    /* renamed from: i */
    public View m9452i(int i) {
        return this.f9970a.mo9163a(i);
    }

    /* renamed from: j */
    public int m9453j() {
        return this.f9970a.mo9165c();
    }

    /* renamed from: k */
    public void m9454k(View view) {
        int iMo9170h = this.f9970a.mo9170h(view);
        if (iMo9170h >= 0) {
            this.f9971b.m9471h(iMo9170h);
            m9455l(view);
        } else {
            throw new IllegalArgumentException("view is not a child, cannot hide " + view);
        }
    }

    /* renamed from: l */
    public final void m9455l(View view) {
        this.f9972c.add(view);
        this.f9970a.mo9164b(view);
    }

    /* renamed from: m */
    public int m9456m(View view) {
        int iMo9170h = this.f9970a.mo9170h(view);
        if (iMo9170h == -1 || this.f9971b.m9467d(iMo9170h)) {
            return -1;
        }
        return iMo9170h - this.f9971b.m9465b(iMo9170h);
    }

    /* renamed from: n */
    public boolean m9457n(View view) {
        return this.f9972c.contains(view);
    }

    /* renamed from: o */
    public void m9458o() {
        this.f9971b.m9470g();
        for (int size = this.f9972c.size() - 1; size >= 0; size--) {
            this.f9970a.mo9171i((View) this.f9972c.get(size));
            this.f9972c.remove(size);
        }
        this.f9970a.mo9169g();
    }

    /* renamed from: p */
    public void m9459p(View view) {
        int iMo9170h = this.f9970a.mo9170h(view);
        if (iMo9170h < 0) {
            return;
        }
        if (this.f9971b.m9469f(iMo9170h)) {
            m9463t(view);
        }
        this.f9970a.mo9172j(iMo9170h);
    }

    /* renamed from: q */
    public void m9460q(int i) {
        int iM9451h = m9451h(i);
        View viewMo9163a = this.f9970a.mo9163a(iM9451h);
        if (viewMo9163a == null) {
            return;
        }
        if (this.f9971b.m9469f(iM9451h)) {
            m9463t(viewMo9163a);
        }
        this.f9970a.mo9172j(iM9451h);
    }

    /* renamed from: r */
    public boolean m9461r(View view) {
        int iMo9170h = this.f9970a.mo9170h(view);
        if (iMo9170h == -1) {
            m9463t(view);
            return true;
        }
        if (!this.f9971b.m9467d(iMo9170h)) {
            return false;
        }
        this.f9971b.m9469f(iMo9170h);
        m9463t(view);
        this.f9970a.mo9172j(iMo9170h);
        return true;
    }

    /* renamed from: s */
    public void m9462s(View view) {
        int iMo9170h = this.f9970a.mo9170h(view);
        if (iMo9170h < 0) {
            throw new IllegalArgumentException("view is not a child, cannot hide " + view);
        }
        if (this.f9971b.m9467d(iMo9170h)) {
            this.f9971b.m9464a(iMo9170h);
            m9463t(view);
        } else {
            throw new RuntimeException("trying to unhide a view that was not hidden" + view);
        }
    }

    /* renamed from: t */
    public final boolean m9463t(View view) {
        if (!this.f9972c.remove(view)) {
            return false;
        }
        this.f9970a.mo9171i(view);
        return true;
    }

    public String toString() {
        return this.f9971b.toString() + ", hidden list:" + this.f9972c.size();
    }
}
