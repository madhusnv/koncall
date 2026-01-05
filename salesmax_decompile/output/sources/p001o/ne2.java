package p001o;

import android.graphics.Rect;
import android.graphics.RectF;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.carousel.CarouselLayoutManager;

/* loaded from: classes3.dex */
public abstract class ne2 {

    /* renamed from: a */
    public final int f36739a;

    /* renamed from: o.ne2$a */
    public class C15552a extends ne2 {

        /* renamed from: b */
        public final /* synthetic */ CarouselLayoutManager f36740b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C15552a(int i, CarouselLayoutManager carouselLayoutManager) {
            super(i, null);
            this.f36740b = carouselLayoutManager;
        }

        @Override // p001o.ne2
        /* renamed from: a */
        public void mo40400a(RectF rectF, RectF rectF2, RectF rectF3) {
            float f = rectF2.top;
            float f2 = rectF3.top;
            if (f < f2 && rectF2.bottom > f2) {
                float f3 = f2 - f;
                rectF.top += f3;
                rectF3.top += f3;
            }
            float f4 = rectF2.bottom;
            float f5 = rectF3.bottom;
            if (f4 <= f5 || rectF2.top >= f5) {
                return;
            }
            float f6 = f4 - f5;
            rectF.bottom = Math.max(rectF.bottom - f6, rectF.top);
            rectF2.bottom = Math.max(rectF2.bottom - f6, rectF2.top);
        }

        @Override // p001o.ne2
        /* renamed from: e */
        public RectF mo40401e(float f, float f2, float f3, float f4) {
            return new RectF(0.0f, f3, f2, f - f3);
        }

        @Override // p001o.ne2
        /* renamed from: f */
        public int mo40402f() {
            return this.f36740b.m0();
        }

        @Override // p001o.ne2
        /* renamed from: g */
        public int mo40403g() {
            return this.f36740b.getPaddingLeft();
        }

        @Override // p001o.ne2
        /* renamed from: h */
        public int mo40404h() {
            return this.f36740b.z0() - this.f36740b.getPaddingRight();
        }

        @Override // p001o.ne2
        /* renamed from: i */
        public int mo40405i() {
            return mo40406j();
        }

        @Override // p001o.ne2
        /* renamed from: j */
        public int mo40406j() {
            return 0;
        }

        @Override // p001o.ne2
        /* renamed from: k */
        public void mo40407k(View view, int i, int i2) {
            int iMo40403g = mo40403g();
            this.f36740b.L0(view, iMo40403g, i, iMo40403g + m40410n(view), i2);
        }

        @Override // p001o.ne2
        /* renamed from: l */
        public void mo40408l(RectF rectF, RectF rectF2, RectF rectF3) {
            if (rectF2.bottom <= rectF3.top) {
                float fFloor = ((float) Math.floor(rectF.bottom)) - 1.0f;
                rectF.bottom = fFloor;
                rectF.top = Math.min(rectF.top, fFloor);
            }
            if (rectF2.top >= rectF3.bottom) {
                float fCeil = ((float) Math.ceil(rectF.top)) + 1.0f;
                rectF.top = fCeil;
                rectF.bottom = Math.max(fCeil, rectF.bottom);
            }
        }

        @Override // p001o.ne2
        /* renamed from: m */
        public void mo40409m(View view, Rect rect, float f, float f2) {
            view.offsetTopAndBottom((int) (f2 - (rect.top + f)));
        }

        /* renamed from: n */
        public int m40410n(View view) {
            RecyclerView.LayoutParams layoutParams = (RecyclerView.LayoutParams) view.getLayoutParams();
            return this.f36740b.i0(view) + ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin + ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin;
        }
    }

    /* renamed from: o.ne2$b */
    public class C15553b extends ne2 {

        /* renamed from: b */
        public final /* synthetic */ CarouselLayoutManager f36741b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C15553b(int i, CarouselLayoutManager carouselLayoutManager) {
            super(i, null);
            this.f36741b = carouselLayoutManager;
        }

        @Override // p001o.ne2
        /* renamed from: a */
        public void mo40400a(RectF rectF, RectF rectF2, RectF rectF3) {
            float f = rectF2.left;
            float f2 = rectF3.left;
            if (f < f2 && rectF2.right > f2) {
                float f3 = f2 - f;
                rectF.left += f3;
                rectF2.left += f3;
            }
            float f4 = rectF2.right;
            float f5 = rectF3.right;
            if (f4 <= f5 || rectF2.left >= f5) {
                return;
            }
            float f6 = f4 - f5;
            rectF.right = Math.max(rectF.right - f6, rectF.left);
            rectF2.right = Math.max(rectF2.right - f6, rectF2.left);
        }

        @Override // p001o.ne2
        /* renamed from: e */
        public RectF mo40401e(float f, float f2, float f3, float f4) {
            return new RectF(f4, 0.0f, f2 - f4, f);
        }

        @Override // p001o.ne2
        /* renamed from: f */
        public int mo40402f() {
            return this.f36741b.m0() - this.f36741b.getPaddingBottom();
        }

        @Override // p001o.ne2
        /* renamed from: g */
        public int mo40403g() {
            return 0;
        }

        @Override // p001o.ne2
        /* renamed from: h */
        public int mo40404h() {
            return this.f36741b.z0();
        }

        @Override // p001o.ne2
        /* renamed from: i */
        public int mo40405i() {
            return this.f36741b.O2() ? mo40404h() : mo40403g();
        }

        @Override // p001o.ne2
        /* renamed from: j */
        public int mo40406j() {
            return this.f36741b.getPaddingTop();
        }

        @Override // p001o.ne2
        /* renamed from: k */
        public void mo40407k(View view, int i, int i2) {
            int iMo40406j = mo40406j();
            this.f36741b.L0(view, i, iMo40406j, i2, iMo40406j + m40411n(view));
        }

        @Override // p001o.ne2
        /* renamed from: l */
        public void mo40408l(RectF rectF, RectF rectF2, RectF rectF3) {
            if (rectF2.right <= rectF3.left) {
                float fFloor = ((float) Math.floor(rectF.right)) - 1.0f;
                rectF.right = fFloor;
                rectF.left = Math.min(rectF.left, fFloor);
            }
            if (rectF2.left >= rectF3.right) {
                float fCeil = ((float) Math.ceil(rectF.left)) + 1.0f;
                rectF.left = fCeil;
                rectF.right = Math.max(fCeil, rectF.right);
            }
        }

        @Override // p001o.ne2
        /* renamed from: m */
        public void mo40409m(View view, Rect rect, float f, float f2) {
            view.offsetLeftAndRight((int) (f2 - (rect.left + f)));
        }

        /* renamed from: n */
        public int m40411n(View view) {
            RecyclerView.LayoutParams layoutParams = (RecyclerView.LayoutParams) view.getLayoutParams();
            return this.f36741b.h0(view) + ((ViewGroup.MarginLayoutParams) layoutParams).topMargin + ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin;
        }
    }

    public /* synthetic */ ne2(int i, C15552a c15552a) {
        this(i);
    }

    /* renamed from: b */
    public static ne2 m40397b(CarouselLayoutManager carouselLayoutManager) {
        return new C15553b(0, carouselLayoutManager);
    }

    /* renamed from: c */
    public static ne2 m40398c(CarouselLayoutManager carouselLayoutManager, int i) {
        if (i == 0) {
            return m40397b(carouselLayoutManager);
        }
        if (i == 1) {
            return m40399d(carouselLayoutManager);
        }
        throw new IllegalArgumentException("invalid orientation");
    }

    /* renamed from: d */
    public static ne2 m40399d(CarouselLayoutManager carouselLayoutManager) {
        return new C15552a(1, carouselLayoutManager);
    }

    /* renamed from: a */
    public abstract void mo40400a(RectF rectF, RectF rectF2, RectF rectF3);

    /* renamed from: e */
    public abstract RectF mo40401e(float f, float f2, float f3, float f4);

    /* renamed from: f */
    public abstract int mo40402f();

    /* renamed from: g */
    public abstract int mo40403g();

    /* renamed from: h */
    public abstract int mo40404h();

    /* renamed from: i */
    public abstract int mo40405i();

    /* renamed from: j */
    public abstract int mo40406j();

    /* renamed from: k */
    public abstract void mo40407k(View view, int i, int i2);

    /* renamed from: l */
    public abstract void mo40408l(RectF rectF, RectF rectF2, RectF rectF3);

    /* renamed from: m */
    public abstract void mo40409m(View view, Rect rect, float f, float f2);

    public ne2(int i) {
        this.f36739a = i;
    }
}
