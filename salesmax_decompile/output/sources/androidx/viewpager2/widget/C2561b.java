package androidx.viewpager2.widget;

import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.viewpager2.widget.ViewPager2;
import java.util.Locale;

/* renamed from: androidx.viewpager2.widget.b */
/* loaded from: classes2.dex */
public final class C2561b extends ViewPager2.AbstractC2554i {

    /* renamed from: a */
    public final LinearLayoutManager f10537a;

    /* renamed from: b */
    public ViewPager2.InterfaceC2556k f10538b;

    public C2561b(LinearLayoutManager linearLayoutManager) {
        this.f10537a = linearLayoutManager;
    }

    @Override // androidx.viewpager2.widget.ViewPager2.AbstractC2554i
    /* renamed from: a */
    public void mo696a(int i) {
    }

    @Override // androidx.viewpager2.widget.ViewPager2.AbstractC2554i
    /* renamed from: b */
    public void mo10057b(int i, float f, int i2) {
        if (this.f10538b == null) {
            return;
        }
        float f2 = -f;
        for (int i3 = 0; i3 < this.f10537a.m9241Z(); i3++) {
            View viewM9240Y = this.f10537a.m9240Y(i3);
            if (viewM9240Y == null) {
                throw new IllegalStateException(String.format(Locale.US, "LayoutManager returned a null child at pos %d/%d while transforming pages", Integer.valueOf(i3), Integer.valueOf(this.f10537a.m9241Z())));
            }
            this.f10538b.mo10062a(viewM9240Y, (this.f10537a.s0(viewM9240Y) - i) + f2);
        }
    }

    @Override // androidx.viewpager2.widget.ViewPager2.AbstractC2554i
    /* renamed from: c */
    public void mo697c(int i) {
    }

    /* renamed from: d */
    public ViewPager2.InterfaceC2556k m10066d() {
        return this.f10538b;
    }

    /* renamed from: e */
    public void m10067e(ViewPager2.InterfaceC2556k interfaceC2556k) {
        this.f10538b = interfaceC2556k;
    }
}
