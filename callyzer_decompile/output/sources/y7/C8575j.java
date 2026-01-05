package y7;

import android.R;
import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import androidx.recyclerview.widget.RecyclerView;
import bk.RunnableC0683n;
import com.skydoves.balloon.internals.DefinitionKt;
import fh.C2287b;
import java.lang.reflect.Field;
import java.util.ArrayList;
import p8.C5848i;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: y7.j */
/* loaded from: classes.dex */
public final class C8575j extends d0 {

    /* renamed from: C */
    public static final int[] f41657C = {R.attr.state_pressed};

    /* renamed from: D */
    public static final int[] f41658D = new int[0];

    /* renamed from: A */
    public int f41659A;

    /* renamed from: B */
    public final RunnableC0683n f41660B;

    /* renamed from: a */
    public final int f41661a;

    /* renamed from: b */
    public final int f41662b;

    /* renamed from: c */
    public final StateListDrawable f41663c;

    /* renamed from: d */
    public final Drawable f41664d;

    /* renamed from: e */
    public final int f41665e;

    /* renamed from: f */
    public final int f41666f;

    /* renamed from: g */
    public final StateListDrawable f41667g;

    /* renamed from: h */
    public final Drawable f41668h;

    /* renamed from: i */
    public final int f41669i;

    /* renamed from: j */
    public final int f41670j;

    /* renamed from: k */
    public int f41671k;

    /* renamed from: l */
    public int f41672l;

    /* renamed from: m */
    public float f41673m;

    /* renamed from: n */
    public int f41674n;

    /* renamed from: o */
    public int f41675o;

    /* renamed from: p */
    public float f41676p;

    /* renamed from: s */
    public final RecyclerView f41679s;

    /* renamed from: z */
    public final ValueAnimator f41686z;

    /* renamed from: q */
    public int f41677q = 0;

    /* renamed from: r */
    public int f41678r = 0;

    /* renamed from: t */
    public boolean f41680t = false;

    /* renamed from: u */
    public boolean f41681u = false;

    /* renamed from: v */
    public int f41682v = 0;

    /* renamed from: w */
    public int f41683w = 0;

    /* renamed from: x */
    public final int[] f41684x = new int[2];

    /* renamed from: y */
    public final int[] f41685y = new int[2];

    public C8575j(RecyclerView recyclerView, StateListDrawable stateListDrawable, Drawable drawable, StateListDrawable stateListDrawable2, Drawable drawable2, int i10, int i11, int i12) {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(DefinitionKt.NO_Float_VALUE, 1.0f);
        this.f41686z = valueAnimatorOfFloat;
        this.f41659A = 0;
        RunnableC0683n runnableC0683n = new RunnableC0683n(24, this);
        this.f41660B = runnableC0683n;
        C8574i c8574i = new C8574i(this);
        this.f41663c = stateListDrawable;
        this.f41664d = drawable;
        this.f41667g = stateListDrawable2;
        this.f41668h = drawable2;
        this.f41665e = Math.max(i10, stateListDrawable.getIntrinsicWidth());
        this.f41666f = Math.max(i10, drawable.getIntrinsicWidth());
        this.f41669i = Math.max(i10, stateListDrawable2.getIntrinsicWidth());
        this.f41670j = Math.max(i10, drawable2.getIntrinsicWidth());
        this.f41661a = i11;
        this.f41662b = i12;
        stateListDrawable.setAlpha(255);
        drawable.setAlpha(255);
        valueAnimatorOfFloat.addListener(new C5848i(this));
        valueAnimatorOfFloat.addUpdateListener(new C2287b(3, this));
        RecyclerView recyclerView2 = this.f41679s;
        if (recyclerView2 == recyclerView) {
            return;
        }
        if (recyclerView2 != null) {
            ArrayList arrayList = recyclerView2.f2825n;
            f0 f0Var = recyclerView2.f2824m;
            if (f0Var != null) {
                f0Var.mo1304c("Cannot remove item decoration during a scroll  or layout");
            }
            arrayList.remove(this);
            if (arrayList.isEmpty()) {
                recyclerView2.setWillNotDraw(recyclerView2.getOverScrollMode() == 2);
            }
            recyclerView2.m1329M();
            recyclerView2.requestLayout();
            RecyclerView recyclerView3 = this.f41679s;
            recyclerView3.f2826p.remove(this);
            if (recyclerView3.f2827q == this) {
                recyclerView3.f2827q = null;
            }
            ArrayList arrayList2 = this.f41679s.f43701k1;
            if (arrayList2 != null) {
                arrayList2.remove(c8574i);
            }
            this.f41679s.removeCallbacks(runnableC0683n);
        }
        this.f41679s = recyclerView;
        recyclerView.m1344f(this);
        this.f41679s.f2826p.add(this);
        this.f41679s.m1345g(c8574i);
    }

    /* renamed from: e */
    public static int m15866e(float f6, float f10, int[] iArr, int i10, int i11, int i12) {
        int i13 = iArr[1] - iArr[0];
        if (i13 != 0) {
            int i14 = i10 - i12;
            int i15 = (int) (((f10 - f6) / i13) * i14);
            int i16 = i11 + i15;
            if (i16 < i14 && i16 >= 0) {
                return i15;
            }
        }
        return 0;
    }

    @Override // y7.d0
    /* renamed from: b */
    public final void mo15841b(Canvas canvas) {
        int i10 = this.f41677q;
        RecyclerView recyclerView = this.f41679s;
        if (i10 != recyclerView.getWidth() || this.f41678r != recyclerView.getHeight()) {
            this.f41677q = recyclerView.getWidth();
            this.f41678r = recyclerView.getHeight();
            m15869f(0);
            return;
        }
        if (this.f41659A != 0) {
            if (this.f41680t) {
                int i11 = this.f41677q;
                int i12 = this.f41665e;
                int i13 = i11 - i12;
                int i14 = this.f41672l;
                int i15 = this.f41671k;
                int i16 = i14 - (i15 / 2);
                StateListDrawable stateListDrawable = this.f41663c;
                stateListDrawable.setBounds(0, 0, i12, i15);
                int i17 = this.f41666f;
                int i18 = this.f41678r;
                Drawable drawable = this.f41664d;
                drawable.setBounds(0, 0, i17, i18);
                Field field = c6.v0.f5527a;
                if (recyclerView.getLayoutDirection() == 1) {
                    drawable.draw(canvas);
                    canvas.translate(i12, i16);
                    canvas.scale(-1.0f, 1.0f);
                    stateListDrawable.draw(canvas);
                    canvas.scale(1.0f, 1.0f);
                    canvas.translate(-i12, -i16);
                } else {
                    canvas.translate(i13, DefinitionKt.NO_Float_VALUE);
                    drawable.draw(canvas);
                    canvas.translate(DefinitionKt.NO_Float_VALUE, i16);
                    stateListDrawable.draw(canvas);
                    canvas.translate(-i13, -i16);
                }
            }
            if (this.f41681u) {
                int i19 = this.f41678r;
                int i20 = this.f41669i;
                int i21 = i19 - i20;
                int i22 = this.f41675o;
                int i23 = this.f41674n;
                int i24 = i22 - (i23 / 2);
                StateListDrawable stateListDrawable2 = this.f41667g;
                stateListDrawable2.setBounds(0, 0, i23, i20);
                int i25 = this.f41677q;
                int i26 = this.f41670j;
                Drawable drawable2 = this.f41668h;
                drawable2.setBounds(0, 0, i25, i26);
                canvas.translate(DefinitionKt.NO_Float_VALUE, i21);
                drawable2.draw(canvas);
                canvas.translate(i24, DefinitionKt.NO_Float_VALUE);
                stateListDrawable2.draw(canvas);
                canvas.translate(-i24, -i21);
            }
        }
    }

    /* renamed from: c */
    public final boolean m15867c(float f6, float f10) {
        if (f10 < this.f41678r - this.f41669i) {
            return false;
        }
        int i10 = this.f41675o;
        int i11 = this.f41674n;
        return f6 >= ((float) (i10 - (i11 / 2))) && f6 <= ((float) ((i11 / 2) + i10));
    }

    /* renamed from: d */
    public final boolean m15868d(float f6, float f10) {
        Field field = c6.v0.f5527a;
        int layoutDirection = this.f41679s.getLayoutDirection();
        int i10 = this.f41665e;
        if (layoutDirection == 1) {
            if (f6 > i10 / 2) {
                return false;
            }
        } else if (f6 < this.f41677q - i10) {
            return false;
        }
        int i11 = this.f41672l;
        int i12 = this.f41671k / 2;
        return f10 >= ((float) (i11 - i12)) && f10 <= ((float) (i12 + i11));
    }

    /* renamed from: f */
    public final void m15869f(int i10) {
        RunnableC0683n runnableC0683n = this.f41660B;
        StateListDrawable stateListDrawable = this.f41663c;
        if (i10 == 2 && this.f41682v != 2) {
            stateListDrawable.setState(f41657C);
            this.f41679s.removeCallbacks(runnableC0683n);
        }
        if (i10 == 0) {
            this.f41679s.invalidate();
        } else {
            m15870g();
        }
        if (this.f41682v == 2 && i10 != 2) {
            stateListDrawable.setState(f41658D);
            this.f41679s.removeCallbacks(runnableC0683n);
            this.f41679s.postDelayed(runnableC0683n, 1200);
        } else if (i10 == 1) {
            this.f41679s.removeCallbacks(runnableC0683n);
            this.f41679s.postDelayed(runnableC0683n, 1500);
        }
        this.f41682v = i10;
    }

    /* renamed from: g */
    public final void m15870g() {
        int i10 = this.f41659A;
        ValueAnimator valueAnimator = this.f41686z;
        if (i10 != 0) {
            if (i10 != 3) {
                return;
            } else {
                valueAnimator.cancel();
            }
        }
        this.f41659A = 1;
        valueAnimator.setFloatValues(((Float) valueAnimator.getAnimatedValue()).floatValue(), 1.0f);
        valueAnimator.setDuration(500L);
        valueAnimator.setStartDelay(0L);
        valueAnimator.start();
    }
}
