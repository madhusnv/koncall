package androidx.recyclerview.widget;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: androidx.recyclerview.widget.n */
/* loaded from: classes2.dex */
public abstract class AbstractC2408n {

    /* renamed from: a */
    public final RecyclerView.AbstractC2379p f10180a;

    /* renamed from: b */
    public int f10181b;

    /* renamed from: c */
    public final Rect f10182c;

    /* renamed from: androidx.recyclerview.widget.n$a */
    public class a extends AbstractC2408n {
        public a(RecyclerView.AbstractC2379p abstractC2379p) {
            super(abstractC2379p, null);
        }

        @Override // androidx.recyclerview.widget.AbstractC2408n
        /* renamed from: d */
        public int mo9627d(View view) {
            return this.f10180a.j0(view) + ((ViewGroup.MarginLayoutParams) ((RecyclerView.LayoutParams) view.getLayoutParams())).rightMargin;
        }

        @Override // androidx.recyclerview.widget.AbstractC2408n
        /* renamed from: e */
        public int mo9628e(View view) {
            RecyclerView.LayoutParams layoutParams = (RecyclerView.LayoutParams) view.getLayoutParams();
            return this.f10180a.i0(view) + ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin + ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin;
        }

        @Override // androidx.recyclerview.widget.AbstractC2408n
        /* renamed from: f */
        public int mo9629f(View view) {
            RecyclerView.LayoutParams layoutParams = (RecyclerView.LayoutParams) view.getLayoutParams();
            return this.f10180a.h0(view) + ((ViewGroup.MarginLayoutParams) layoutParams).topMargin + ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin;
        }

        @Override // androidx.recyclerview.widget.AbstractC2408n
        /* renamed from: g */
        public int mo9630g(View view) {
            return this.f10180a.g0(view) - ((ViewGroup.MarginLayoutParams) ((RecyclerView.LayoutParams) view.getLayoutParams())).leftMargin;
        }

        @Override // androidx.recyclerview.widget.AbstractC2408n
        /* renamed from: h */
        public int mo9631h() {
            return this.f10180a.z0();
        }

        @Override // androidx.recyclerview.widget.AbstractC2408n
        /* renamed from: i */
        public int mo9632i() {
            return this.f10180a.z0() - this.f10180a.getPaddingRight();
        }

        @Override // androidx.recyclerview.widget.AbstractC2408n
        /* renamed from: j */
        public int mo9633j() {
            return this.f10180a.getPaddingRight();
        }

        @Override // androidx.recyclerview.widget.AbstractC2408n
        /* renamed from: l */
        public int mo9635l() {
            return this.f10180a.A0();
        }

        @Override // androidx.recyclerview.widget.AbstractC2408n
        /* renamed from: m */
        public int mo9636m() {
            return this.f10180a.n0();
        }

        @Override // androidx.recyclerview.widget.AbstractC2408n
        /* renamed from: n */
        public int mo9637n() {
            return this.f10180a.getPaddingLeft();
        }

        @Override // androidx.recyclerview.widget.AbstractC2408n
        /* renamed from: o */
        public int mo9638o() {
            return (this.f10180a.z0() - this.f10180a.getPaddingLeft()) - this.f10180a.getPaddingRight();
        }

        @Override // androidx.recyclerview.widget.AbstractC2408n
        /* renamed from: q */
        public int mo9640q(View view) {
            this.f10180a.y0(view, true, this.f10182c);
            return this.f10182c.right;
        }

        @Override // androidx.recyclerview.widget.AbstractC2408n
        /* renamed from: r */
        public int mo9641r(View view) {
            this.f10180a.y0(view, true, this.f10182c);
            return this.f10182c.left;
        }

        @Override // androidx.recyclerview.widget.AbstractC2408n
        /* renamed from: s */
        public void mo9642s(int i) {
            this.f10180a.O0(i);
        }
    }

    /* renamed from: androidx.recyclerview.widget.n$b */
    public class b extends AbstractC2408n {
        public b(RecyclerView.AbstractC2379p abstractC2379p) {
            super(abstractC2379p, null);
        }

        @Override // androidx.recyclerview.widget.AbstractC2408n
        /* renamed from: d */
        public int mo9627d(View view) {
            return this.f10180a.e0(view) + ((ViewGroup.MarginLayoutParams) ((RecyclerView.LayoutParams) view.getLayoutParams())).bottomMargin;
        }

        @Override // androidx.recyclerview.widget.AbstractC2408n
        /* renamed from: e */
        public int mo9628e(View view) {
            RecyclerView.LayoutParams layoutParams = (RecyclerView.LayoutParams) view.getLayoutParams();
            return this.f10180a.h0(view) + ((ViewGroup.MarginLayoutParams) layoutParams).topMargin + ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin;
        }

        @Override // androidx.recyclerview.widget.AbstractC2408n
        /* renamed from: f */
        public int mo9629f(View view) {
            RecyclerView.LayoutParams layoutParams = (RecyclerView.LayoutParams) view.getLayoutParams();
            return this.f10180a.i0(view) + ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin + ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin;
        }

        @Override // androidx.recyclerview.widget.AbstractC2408n
        /* renamed from: g */
        public int mo9630g(View view) {
            return this.f10180a.k0(view) - ((ViewGroup.MarginLayoutParams) ((RecyclerView.LayoutParams) view.getLayoutParams())).topMargin;
        }

        @Override // androidx.recyclerview.widget.AbstractC2408n
        /* renamed from: h */
        public int mo9631h() {
            return this.f10180a.m0();
        }

        @Override // androidx.recyclerview.widget.AbstractC2408n
        /* renamed from: i */
        public int mo9632i() {
            return this.f10180a.m0() - this.f10180a.getPaddingBottom();
        }

        @Override // androidx.recyclerview.widget.AbstractC2408n
        /* renamed from: j */
        public int mo9633j() {
            return this.f10180a.getPaddingBottom();
        }

        @Override // androidx.recyclerview.widget.AbstractC2408n
        /* renamed from: l */
        public int mo9635l() {
            return this.f10180a.n0();
        }

        @Override // androidx.recyclerview.widget.AbstractC2408n
        /* renamed from: m */
        public int mo9636m() {
            return this.f10180a.A0();
        }

        @Override // androidx.recyclerview.widget.AbstractC2408n
        /* renamed from: n */
        public int mo9637n() {
            return this.f10180a.getPaddingTop();
        }

        @Override // androidx.recyclerview.widget.AbstractC2408n
        /* renamed from: o */
        public int mo9638o() {
            return (this.f10180a.m0() - this.f10180a.getPaddingTop()) - this.f10180a.getPaddingBottom();
        }

        @Override // androidx.recyclerview.widget.AbstractC2408n
        /* renamed from: q */
        public int mo9640q(View view) {
            this.f10180a.y0(view, true, this.f10182c);
            return this.f10182c.bottom;
        }

        @Override // androidx.recyclerview.widget.AbstractC2408n
        /* renamed from: r */
        public int mo9641r(View view) {
            this.f10180a.y0(view, true, this.f10182c);
            return this.f10182c.top;
        }

        @Override // androidx.recyclerview.widget.AbstractC2408n
        /* renamed from: s */
        public void mo9642s(int i) {
            this.f10180a.P0(i);
        }
    }

    public /* synthetic */ AbstractC2408n(RecyclerView.AbstractC2379p abstractC2379p, a aVar) {
        this(abstractC2379p);
    }

    /* renamed from: a */
    public static AbstractC2408n m9624a(RecyclerView.AbstractC2379p abstractC2379p) {
        return new a(abstractC2379p);
    }

    /* renamed from: b */
    public static AbstractC2408n m9625b(RecyclerView.AbstractC2379p abstractC2379p, int i) {
        if (i == 0) {
            return m9624a(abstractC2379p);
        }
        if (i == 1) {
            return m9626c(abstractC2379p);
        }
        throw new IllegalArgumentException("invalid orientation");
    }

    /* renamed from: c */
    public static AbstractC2408n m9626c(RecyclerView.AbstractC2379p abstractC2379p) {
        return new b(abstractC2379p);
    }

    /* renamed from: d */
    public abstract int mo9627d(View view);

    /* renamed from: e */
    public abstract int mo9628e(View view);

    /* renamed from: f */
    public abstract int mo9629f(View view);

    /* renamed from: g */
    public abstract int mo9630g(View view);

    /* renamed from: h */
    public abstract int mo9631h();

    /* renamed from: i */
    public abstract int mo9632i();

    /* renamed from: j */
    public abstract int mo9633j();

    /* renamed from: k */
    public RecyclerView.AbstractC2379p m9634k() {
        return this.f10180a;
    }

    /* renamed from: l */
    public abstract int mo9635l();

    /* renamed from: m */
    public abstract int mo9636m();

    /* renamed from: n */
    public abstract int mo9637n();

    /* renamed from: o */
    public abstract int mo9638o();

    /* renamed from: p */
    public int m9639p() {
        if (Integer.MIN_VALUE == this.f10181b) {
            return 0;
        }
        return mo9638o() - this.f10181b;
    }

    /* renamed from: q */
    public abstract int mo9640q(View view);

    /* renamed from: r */
    public abstract int mo9641r(View view);

    /* renamed from: s */
    public abstract void mo9642s(int i);

    /* renamed from: t */
    public void m9643t() {
        this.f10181b = mo9638o();
    }

    public AbstractC2408n(RecyclerView.AbstractC2379p abstractC2379p) {
        this.f10181b = Integer.MIN_VALUE;
        this.f10182c = new Rect();
        this.f10180a = abstractC2379p;
    }
}
