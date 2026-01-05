package p001o;

import androidx.recyclerview.widget.RecyclerView;
import com.futuremind.recyclerviewfastscroll.FastScroller;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes5.dex */
public class age extends RecyclerView.AbstractC2383t {

    /* renamed from: a */
    public final FastScroller f14679a;

    /* renamed from: b */
    public List f14680b = new ArrayList();

    /* renamed from: c */
    public int f14681c = 0;

    public age(FastScroller fastScroller) {
        this.f14679a = fastScroller;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC2383t
    /* renamed from: a */
    public void mo9260a(RecyclerView recyclerView, int i) {
        super.mo9260a(recyclerView, i);
        if (i == 0 && this.f14681c != 0) {
            this.f14679a.getViewProvider().m46267h();
        } else if (i != 0 && this.f14681c == 0) {
            this.f14679a.getViewProvider().m46268i();
        }
        this.f14681c = i;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC2383t
    /* renamed from: b */
    public void mo964b(RecyclerView recyclerView, int i, int i2) {
        if (this.f14679a.m13628n()) {
            m17035d(recyclerView);
        }
    }

    /* renamed from: c */
    public void m17034c(float f) {
        Iterator it = this.f14680b.iterator();
        if (it.hasNext()) {
            tq.m50332a(it.next());
            throw null;
        }
    }

    /* renamed from: d */
    public void m17035d(RecyclerView recyclerView) {
        int iComputeHorizontalScrollOffset;
        int iComputeHorizontalScrollExtent;
        int iComputeHorizontalScrollRange;
        if (this.f14679a.m13626l()) {
            iComputeHorizontalScrollOffset = recyclerView.computeVerticalScrollOffset();
            iComputeHorizontalScrollExtent = recyclerView.computeVerticalScrollExtent();
            iComputeHorizontalScrollRange = recyclerView.computeVerticalScrollRange();
        } else {
            iComputeHorizontalScrollOffset = recyclerView.computeHorizontalScrollOffset();
            iComputeHorizontalScrollExtent = recyclerView.computeHorizontalScrollExtent();
            iComputeHorizontalScrollRange = recyclerView.computeHorizontalScrollRange();
        }
        float f = iComputeHorizontalScrollOffset / (iComputeHorizontalScrollRange - iComputeHorizontalScrollExtent);
        this.f14679a.setScrollerPosition(f);
        m17034c(f);
    }
}
