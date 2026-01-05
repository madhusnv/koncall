package androidx.mediarouter.app;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.util.AttributeSet;
import android.view.animation.Interpolator;
import android.widget.ListView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes2.dex */
final class OverlayListView extends ListView {

    /* renamed from: a */
    public final List f8943a;

    /* renamed from: androidx.mediarouter.app.OverlayListView$a */
    public static class C2304a {

        /* renamed from: a */
        public BitmapDrawable f8944a;

        /* renamed from: c */
        public Rect f8946c;

        /* renamed from: d */
        public Interpolator f8947d;

        /* renamed from: e */
        public long f8948e;

        /* renamed from: f */
        public Rect f8949f;

        /* renamed from: g */
        public int f8950g;

        /* renamed from: j */
        public long f8953j;

        /* renamed from: k */
        public boolean f8954k;

        /* renamed from: l */
        public boolean f8955l;

        /* renamed from: m */
        public a f8956m;

        /* renamed from: b */
        public float f8945b = 1.0f;

        /* renamed from: h */
        public float f8951h = 1.0f;

        /* renamed from: i */
        public float f8952i = 1.0f;

        /* renamed from: androidx.mediarouter.app.OverlayListView$a$a */
        public interface a {
            /* renamed from: a */
            void mo7915a();
        }

        public C2304a(BitmapDrawable bitmapDrawable, Rect rect) {
            this.f8944a = bitmapDrawable;
            this.f8949f = rect;
            this.f8946c = new Rect(rect);
            BitmapDrawable bitmapDrawable2 = this.f8944a;
            if (bitmapDrawable2 != null) {
                bitmapDrawable2.setAlpha((int) (this.f8945b * 255.0f));
                this.f8944a.setBounds(this.f8946c);
            }
        }

        /* renamed from: a */
        public BitmapDrawable m7905a() {
            return this.f8944a;
        }

        /* renamed from: b */
        public boolean m7906b() {
            return this.f8954k;
        }

        /* renamed from: c */
        public C2304a m7907c(float f, float f2) {
            this.f8951h = f;
            this.f8952i = f2;
            return this;
        }

        /* renamed from: d */
        public C2304a m7908d(a aVar) {
            this.f8956m = aVar;
            return this;
        }

        /* renamed from: e */
        public C2304a m7909e(long j) {
            this.f8948e = j;
            return this;
        }

        /* renamed from: f */
        public C2304a m7910f(Interpolator interpolator) {
            this.f8947d = interpolator;
            return this;
        }

        /* renamed from: g */
        public C2304a m7911g(int i) {
            this.f8950g = i;
            return this;
        }

        /* renamed from: h */
        public void m7912h(long j) {
            this.f8953j = j;
            this.f8954k = true;
        }

        /* renamed from: i */
        public void m7913i() {
            this.f8954k = true;
            this.f8955l = true;
            a aVar = this.f8956m;
            if (aVar != null) {
                aVar.mo7915a();
            }
        }

        /* renamed from: j */
        public boolean m7914j(long j) {
            if (this.f8955l) {
                return false;
            }
            float fMax = this.f8954k ? Math.max(0.0f, Math.min(1.0f, (j - this.f8953j) / this.f8948e)) : 0.0f;
            Interpolator interpolator = this.f8947d;
            float interpolation = interpolator == null ? fMax : interpolator.getInterpolation(fMax);
            int i = (int) (this.f8950g * interpolation);
            Rect rect = this.f8946c;
            Rect rect2 = this.f8949f;
            rect.top = rect2.top + i;
            rect.bottom = rect2.bottom + i;
            float f = this.f8951h;
            float f2 = f + ((this.f8952i - f) * interpolation);
            this.f8945b = f2;
            BitmapDrawable bitmapDrawable = this.f8944a;
            if (bitmapDrawable != null && rect != null) {
                bitmapDrawable.setAlpha((int) (f2 * 255.0f));
                this.f8944a.setBounds(this.f8946c);
            }
            if (this.f8954k && fMax >= 1.0f) {
                this.f8955l = true;
                a aVar = this.f8956m;
                if (aVar != null) {
                    aVar.mo7915a();
                }
            }
            return !this.f8955l;
        }
    }

    public OverlayListView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f8943a = new ArrayList();
    }

    /* renamed from: a */
    public void m7902a(C2304a c2304a) {
        this.f8943a.add(c2304a);
    }

    /* renamed from: b */
    public void m7903b() {
        for (C2304a c2304a : this.f8943a) {
            if (!c2304a.m7906b()) {
                c2304a.m7912h(getDrawingTime());
            }
        }
    }

    /* renamed from: c */
    public void m7904c() {
        Iterator it = this.f8943a.iterator();
        while (it.hasNext()) {
            ((C2304a) it.next()).m7913i();
        }
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.f8943a.size() > 0) {
            Iterator it = this.f8943a.iterator();
            while (it.hasNext()) {
                C2304a c2304a = (C2304a) it.next();
                BitmapDrawable bitmapDrawableM7905a = c2304a.m7905a();
                if (bitmapDrawableM7905a != null) {
                    bitmapDrawableM7905a.draw(canvas);
                }
                if (!c2304a.m7914j(getDrawingTime())) {
                    it.remove();
                }
            }
        }
    }

    public OverlayListView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f8943a = new ArrayList();
    }
}
