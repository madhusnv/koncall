package p001o;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import android.view.View;
import androidx.recyclerview.widget.C2404j;
import androidx.recyclerview.widget.RecyclerView;
import com.google.firebase.perf.util.Constants;

/* loaded from: classes.dex */
public final class cdb extends C2404j.e {

    /* renamed from: d */
    public final Context f17948d;

    /* renamed from: e */
    public final kgg f17949e;

    /* renamed from: f */
    public Drawable f17950f;

    /* renamed from: g */
    public Drawable f17951g;

    /* renamed from: h */
    public RecyclerView.d0 f17952h;

    /* renamed from: i */
    public View f17953i;

    /* renamed from: j */
    public float f17954j;

    /* renamed from: k */
    public float f17955k;

    /* renamed from: l */
    public long f17956l;

    /* renamed from: m */
    public boolean f17957m;

    /* renamed from: n */
    public boolean f17958n;

    /* renamed from: o */
    public boolean f17959o;

    public cdb(Context context, kgg kggVar) {
        sq8.m48649h(context, "context");
        sq8.m48649h(kggVar, "swipeControllerActions");
        this.f17948d = context;
        this.f17949e = kggVar;
    }

    /* renamed from: G */
    public static final boolean m20966G(cdb cdbVar, RecyclerView.d0 d0Var, View view, MotionEvent motionEvent) {
        sq8.m48649h(cdbVar, "this$0");
        sq8.m48649h(d0Var, "$viewHolder");
        boolean z = true;
        if (motionEvent.getAction() != 3 && motionEvent.getAction() != 1) {
            z = false;
        }
        cdbVar.f17957m = z;
        if (z) {
            View view2 = cdbVar.f17953i;
            if (view2 == null) {
                sq8.m48667z("mView");
                view2 = null;
            }
            if (Math.abs(view2.getTranslationX()) >= cdbVar.m20967D(100)) {
                cdbVar.f17949e.mo1017a(d0Var.m9147k());
            }
        }
        return false;
    }

    @Override // androidx.recyclerview.widget.C2404j.e
    /* renamed from: B */
    public void mo2681B(RecyclerView.d0 d0Var, int i) {
        sq8.m48649h(d0Var, "viewHolder");
    }

    /* renamed from: D */
    public final int m20967D(int i) {
        return xf0.f53677a.m56205b(i, this.f17948d);
    }

    /* renamed from: E */
    public final void m20968E(Canvas canvas) {
        float f;
        float fMin;
        int translationX;
        if (this.f17952h == null) {
            return;
        }
        View view = this.f17953i;
        Drawable drawable = null;
        if (view == null) {
            sq8.m48667z("mView");
            view = null;
        }
        float translationX2 = view.getTranslationX();
        long jCurrentTimeMillis = System.currentTimeMillis();
        long jMin = Math.min(17L, jCurrentTimeMillis - this.f17956l);
        this.f17956l = jCurrentTimeMillis;
        boolean z = translationX2 >= ((float) m20967D(30));
        if (z) {
            float f2 = this.f17955k;
            if (f2 < 1.0f) {
                float f3 = f2 + (jMin / 180.0f);
                this.f17955k = f3;
                if (f3 > 1.0f) {
                    this.f17955k = 1.0f;
                } else {
                    View view2 = this.f17953i;
                    if (view2 == null) {
                        sq8.m48667z("mView");
                        view2 = null;
                    }
                    view2.invalidate();
                }
            }
        } else if (translationX2 <= 0.0f) {
            this.f17955k = 0.0f;
            this.f17959o = false;
            this.f17958n = false;
        } else {
            float f4 = this.f17955k;
            if (f4 > 0.0f) {
                float f5 = f4 - (jMin / 180.0f);
                this.f17955k = f5;
                if (f5 < 0.1f) {
                    this.f17955k = 0.0f;
                } else {
                    View view3 = this.f17953i;
                    if (view3 == null) {
                        sq8.m48667z("mView");
                        view3 = null;
                    }
                    view3.invalidate();
                }
            }
        }
        if (z) {
            float f6 = this.f17955k;
            f = f6 <= 0.8f ? (f6 / 0.8f) * 1.2f : 1.2f - (((f6 - 0.8f) / 0.2f) * 0.2f);
            fMin = Math.min(255.0f, Constants.MAX_HOST_LENGTH * (f6 / 0.8f));
        } else {
            f = this.f17955k;
            fMin = Math.min(255.0f, Constants.MAX_HOST_LENGTH * f);
        }
        int i = (int) fMin;
        Drawable drawable2 = this.f17951g;
        if (drawable2 == null) {
            sq8.m48667z("shareRound");
            drawable2 = null;
        }
        drawable2.setAlpha(i);
        Drawable drawable3 = this.f17950f;
        if (drawable3 == null) {
            sq8.m48667z("imageDrawable");
            drawable3 = null;
        }
        drawable3.setAlpha(i);
        if (this.f17959o && !this.f17958n) {
            View view4 = this.f17953i;
            if (view4 == null) {
                sq8.m48667z("mView");
                view4 = null;
            }
            if (view4.getTranslationX() >= m20967D(100)) {
                View view5 = this.f17953i;
                if (view5 == null) {
                    sq8.m48667z("mView");
                    view5 = null;
                }
                view5.performHapticFeedback(3, 2);
                this.f17958n = true;
            }
        }
        View view6 = this.f17953i;
        if (view6 == null) {
            sq8.m48667z("mView");
            view6 = null;
        }
        if (view6.getTranslationX() > m20967D(130)) {
            translationX = m20967D(130) / 2;
        } else {
            View view7 = this.f17953i;
            if (view7 == null) {
                sq8.m48667z("mView");
                view7 = null;
            }
            translationX = (int) (view7.getTranslationX() / 2);
        }
        View view8 = this.f17953i;
        if (view8 == null) {
            sq8.m48667z("mView");
            view8 = null;
        }
        int top = view8.getTop();
        View view9 = this.f17953i;
        if (view9 == null) {
            sq8.m48667z("mView");
            view9 = null;
        }
        float measuredHeight = top + (view9.getMeasuredHeight() / 2);
        Drawable drawable4 = this.f17951g;
        if (drawable4 == null) {
            sq8.m48667z("shareRound");
            drawable4 = null;
        }
        drawable4.setColorFilter(new PorterDuffColorFilter(c64.getColor(this.f17948d, u6e.superfone_purple), PorterDuff.Mode.MULTIPLY));
        Drawable drawable5 = this.f17951g;
        if (drawable5 == null) {
            sq8.m48667z("shareRound");
            drawable5 = null;
        }
        float f7 = translationX;
        drawable5.setBounds((int) (f7 - (m20967D(18) * f)), (int) (measuredHeight - (m20967D(18) * f)), (int) ((m20967D(18) * f) + f7), (int) ((m20967D(18) * f) + measuredHeight));
        Drawable drawable6 = this.f17951g;
        if (drawable6 == null) {
            sq8.m48667z("shareRound");
            drawable6 = null;
        }
        drawable6.draw(canvas);
        Drawable drawable7 = this.f17950f;
        if (drawable7 == null) {
            sq8.m48667z("imageDrawable");
            drawable7 = null;
        }
        drawable7.setBounds((int) (f7 - (m20967D(12) * f)), (int) (measuredHeight - (m20967D(11) * f)), (int) (f7 + (m20967D(12) * f)), (int) (measuredHeight + (m20967D(10) * f)));
        Drawable drawable8 = this.f17950f;
        if (drawable8 == null) {
            sq8.m48667z("imageDrawable");
            drawable8 = null;
        }
        drawable8.draw(canvas);
        Drawable drawable9 = this.f17951g;
        if (drawable9 == null) {
            sq8.m48667z("shareRound");
            drawable9 = null;
        }
        drawable9.setAlpha(Constants.MAX_HOST_LENGTH);
        Drawable drawable10 = this.f17950f;
        if (drawable10 == null) {
            sq8.m48667z("imageDrawable");
        } else {
            drawable = drawable10;
        }
        drawable.setAlpha(Constants.MAX_HOST_LENGTH);
    }

    /* renamed from: F */
    public final void m20969F(RecyclerView recyclerView, final RecyclerView.d0 d0Var) {
        recyclerView.setOnTouchListener(new View.OnTouchListener() { // from class: o.bdb
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                return cdb.m20966G(this.f15971a, d0Var, view, motionEvent);
            }
        });
    }

    @Override // androidx.recyclerview.widget.C2404j.e
    /* renamed from: d */
    public int mo9578d(int i, int i2) {
        if (!this.f17957m) {
            return super.mo9578d(i, i2);
        }
        this.f17957m = false;
        return 0;
    }

    @Override // androidx.recyclerview.widget.C2404j.e
    /* renamed from: k */
    public int mo9584k(RecyclerView recyclerView, RecyclerView.d0 d0Var) {
        sq8.m48649h(recyclerView, "recyclerView");
        sq8.m48649h(d0Var, "viewHolder");
        View view = d0Var.f9794a;
        sq8.m48648g(view, "itemView");
        this.f17953i = view;
        Drawable drawable = this.f17948d.getDrawable(w7e.ic_reply_black_24dp);
        sq8.m48646e(drawable);
        this.f17950f = drawable;
        Drawable drawable2 = this.f17948d.getDrawable(w7e.ic_round_shape);
        sq8.m48646e(drawable2);
        this.f17951g = drawable2;
        return C2404j.e.m9575t(0, 8);
    }

    @Override // androidx.recyclerview.widget.C2404j.e
    /* renamed from: u */
    public void mo9592u(Canvas canvas, RecyclerView recyclerView, RecyclerView.d0 d0Var, float f, float f2, int i, boolean z) {
        sq8.m48649h(canvas, "c");
        sq8.m48649h(recyclerView, "recyclerView");
        sq8.m48649h(d0Var, "viewHolder");
        if (i == 1) {
            m20969F(recyclerView, d0Var);
        }
        View view = this.f17953i;
        if (view == null) {
            sq8.m48667z("mView");
            view = null;
        }
        if (view.getTranslationX() < m20967D(130) || f < this.f17954j) {
            super.mo9592u(canvas, recyclerView, d0Var, f, f2, i, z);
            this.f17954j = f;
            this.f17959o = true;
        }
        this.f17952h = d0Var;
        m20968E(canvas);
    }

    @Override // androidx.recyclerview.widget.C2404j.e
    /* renamed from: y */
    public boolean mo2683y(RecyclerView recyclerView, RecyclerView.d0 d0Var, RecyclerView.d0 d0Var2) {
        sq8.m48649h(recyclerView, "recyclerView");
        sq8.m48649h(d0Var, "viewHolder");
        sq8.m48649h(d0Var2, "target");
        return false;
    }
}
