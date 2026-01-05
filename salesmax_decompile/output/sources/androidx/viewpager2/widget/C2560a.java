package androidx.viewpager2.widget;

import androidx.viewpager2.widget.ViewPager2;
import java.util.ArrayList;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;

/* renamed from: androidx.viewpager2.widget.a */
/* loaded from: classes2.dex */
public final class C2560a extends ViewPager2.AbstractC2554i {

    /* renamed from: a */
    public final List f10536a;

    public C2560a(int i) {
        this.f10536a = new ArrayList(i);
    }

    @Override // androidx.viewpager2.widget.ViewPager2.AbstractC2554i
    /* renamed from: a */
    public void mo696a(int i) {
        try {
            Iterator it = this.f10536a.iterator();
            while (it.hasNext()) {
                ((ViewPager2.AbstractC2554i) it.next()).mo696a(i);
            }
        } catch (ConcurrentModificationException e) {
            m10065f(e);
        }
    }

    @Override // androidx.viewpager2.widget.ViewPager2.AbstractC2554i
    /* renamed from: b */
    public void mo10057b(int i, float f, int i2) {
        try {
            Iterator it = this.f10536a.iterator();
            while (it.hasNext()) {
                ((ViewPager2.AbstractC2554i) it.next()).mo10057b(i, f, i2);
            }
        } catch (ConcurrentModificationException e) {
            m10065f(e);
        }
    }

    @Override // androidx.viewpager2.widget.ViewPager2.AbstractC2554i
    /* renamed from: c */
    public void mo697c(int i) {
        try {
            Iterator it = this.f10536a.iterator();
            while (it.hasNext()) {
                ((ViewPager2.AbstractC2554i) it.next()).mo697c(i);
            }
        } catch (ConcurrentModificationException e) {
            m10065f(e);
        }
    }

    /* renamed from: d */
    public void m10063d(ViewPager2.AbstractC2554i abstractC2554i) {
        this.f10536a.add(abstractC2554i);
    }

    /* renamed from: e */
    public void m10064e(ViewPager2.AbstractC2554i abstractC2554i) {
        this.f10536a.remove(abstractC2554i);
    }

    /* renamed from: f */
    public final void m10065f(ConcurrentModificationException concurrentModificationException) {
        throw new IllegalStateException("Adding and removing callbacks during dispatch to callbacks is not supported", concurrentModificationException);
    }
}
