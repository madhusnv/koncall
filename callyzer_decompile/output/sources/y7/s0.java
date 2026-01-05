package y7;

import android.view.animation.Interpolator;
import android.widget.OverScroller;
import androidx.recyclerview.widget.RecyclerView;
import b2.C0558p;
import java.lang.reflect.Field;
import java.util.Arrays;
import m6.InterpolatorC4668d;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class s0 implements Runnable {

    /* renamed from: a */
    public int f41783a;

    /* renamed from: b */
    public int f41784b;

    /* renamed from: c */
    public OverScroller f41785c;

    /* renamed from: d */
    public Interpolator f41786d;

    /* renamed from: e */
    public boolean f41787e;

    /* renamed from: f */
    public boolean f41788f;

    /* renamed from: g */
    public final /* synthetic */ RecyclerView f41789g;

    public s0(RecyclerView recyclerView) {
        this.f41789g = recyclerView;
        InterpolatorC4668d interpolatorC4668d = RecyclerView.A1;
        this.f41786d = interpolatorC4668d;
        this.f41787e = false;
        this.f41788f = false;
        this.f41785c = new OverScroller(recyclerView.getContext(), interpolatorC4668d);
    }

    /* renamed from: a */
    public final void m15900a() {
        if (this.f41787e) {
            this.f41788f = true;
            return;
        }
        RecyclerView recyclerView = this.f41789g;
        recyclerView.removeCallbacks(this);
        Field field = c6.v0.f5527a;
        recyclerView.postOnAnimation(this);
    }

    /* renamed from: b */
    public final void m15901b(int i10, int i11, int i12, Interpolator interpolator) {
        int iRound;
        RecyclerView recyclerView = this.f41789g;
        if (i12 == Integer.MIN_VALUE) {
            int iAbs = Math.abs(i10);
            int iAbs2 = Math.abs(i11);
            boolean z6 = iAbs > iAbs2;
            int iSqrt = (int) Math.sqrt(0);
            int iSqrt2 = (int) Math.sqrt((i11 * i11) + (i10 * i10));
            int width = z6 ? recyclerView.getWidth() : recyclerView.getHeight();
            int i13 = width / 2;
            float f6 = width;
            float f10 = i13;
            float fSin = (((float) Math.sin((Math.min(1.0f, (iSqrt2 * 1.0f) / f6) - 0.5f) * 0.47123894f)) * f10) + f10;
            if (iSqrt > 0) {
                iRound = Math.round(Math.abs(fSin / iSqrt) * 1000.0f) * 4;
            } else {
                if (!z6) {
                    iAbs = iAbs2;
                }
                iRound = (int) (((iAbs / f6) + 1.0f) * 300.0f);
            }
            i12 = Math.min(iRound, 2000);
        }
        int i14 = i12;
        if (interpolator == null) {
            interpolator = RecyclerView.A1;
        }
        if (this.f41786d != interpolator) {
            this.f41786d = interpolator;
            this.f41785c = new OverScroller(recyclerView.getContext(), interpolator);
        }
        this.f41784b = 0;
        this.f41783a = 0;
        recyclerView.setScrollState(2);
        this.f41785c.startScroll(0, 0, i10, i11, i14);
        m15900a();
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        RecyclerView recyclerView = this.f41789g;
        int[] iArr = recyclerView.f43712u1;
        if (recyclerView.f2824m == null) {
            recyclerView.removeCallbacks(this);
            this.f41785c.abortAnimation();
            return;
        }
        this.f41788f = false;
        this.f41787e = true;
        recyclerView.m1349l();
        OverScroller overScroller = this.f41785c;
        if (overScroller.computeScrollOffset()) {
            int currX = overScroller.getCurrX();
            int currY = overScroller.getCurrY();
            int i15 = currX - this.f41783a;
            int i16 = currY - this.f41784b;
            this.f41783a = currX;
            this.f41784b = currY;
            int[] iArr2 = recyclerView.f43712u1;
            iArr2[0] = 0;
            iArr2[1] = 0;
            int i17 = i15;
            if (recyclerView.m1354q(i17, iArr2, i16, 1, null)) {
                i17 -= iArr[0];
                i10 = i16 - iArr[1];
            } else {
                i10 = i16;
            }
            int i18 = i17;
            if (recyclerView.getOverScrollMode() != 2) {
                recyclerView.m1348k(i18, i10);
            }
            if (recyclerView.f2823l != null) {
                iArr[0] = 0;
                iArr[1] = 0;
                recyclerView.m1339W(i18, i10, iArr);
                i12 = iArr[0];
                int i19 = iArr[1];
                int i20 = i18 - i12;
                int i21 = i10 - i19;
                C8584s c8584s = recyclerView.f2824m.f41623e;
                if (c8584s != null && !c8584s.f41771d && c8584s.f41772e) {
                    int iM15894b = recyclerView.f43699i1.m15894b();
                    if (iM15894b == 0) {
                        c8584s.m15899f();
                    } else if (c8584s.f41768a >= iM15894b) {
                        c8584s.f41768a = iM15894b - 1;
                        c8584s.m15897d(i12, i19);
                    } else {
                        c8584s.m15897d(i12, i19);
                    }
                }
                i11 = i21;
                i13 = i20;
                i14 = i19;
            } else {
                i11 = i10;
                i12 = 0;
                i13 = i18;
                i14 = 0;
            }
            if (!recyclerView.f2825n.isEmpty()) {
                recyclerView.invalidate();
            }
            int[] iArr3 = recyclerView.f43712u1;
            iArr3[0] = 0;
            iArr3[1] = 0;
            recyclerView.m1355r(i12, null, i14, i13, i11, iArr3, 1);
            int i22 = i13 - iArr[0];
            int i23 = i11 - iArr[1];
            if (i12 != 0 || i14 != 0) {
                recyclerView.m1356s(i12, i14);
            }
            if (!recyclerView.awakenScrollBars()) {
                recyclerView.invalidate();
            }
            boolean z6 = overScroller.isFinished() || (((overScroller.getCurrX() == overScroller.getFinalX()) || i22 != 0) && ((overScroller.getCurrY() == overScroller.getFinalY()) || i23 != 0));
            C8584s c8584s2 = recyclerView.f2824m.f41623e;
            if ((c8584s2 == null || !c8584s2.f41771d) && z6) {
                if (recyclerView.getOverScrollMode() != 2) {
                    int currVelocity = (int) overScroller.getCurrVelocity();
                    int i24 = i22 < 0 ? -currVelocity : i22 > 0 ? currVelocity : 0;
                    if (i23 < 0) {
                        currVelocity = -currVelocity;
                    } else if (i23 <= 0) {
                        currVelocity = 0;
                    }
                    if (i24 < 0) {
                        recyclerView.m1358u();
                        if (recyclerView.f2804H.isFinished()) {
                            recyclerView.f2804H.onAbsorb(-i24);
                        }
                    } else if (i24 > 0) {
                        recyclerView.m1359v();
                        if (recyclerView.f2806K.isFinished()) {
                            recyclerView.f2806K.onAbsorb(i24);
                        }
                    }
                    if (currVelocity < 0) {
                        recyclerView.m1360w();
                        if (recyclerView.f2805I.isFinished()) {
                            recyclerView.f2805I.onAbsorb(-currVelocity);
                        }
                    } else if (currVelocity > 0) {
                        recyclerView.m1357t();
                        if (recyclerView.f2807L.isFinished()) {
                            recyclerView.f2807L.onAbsorb(currVelocity);
                        }
                    }
                    if (i24 != 0 || currVelocity != 0) {
                        Field field = c6.v0.f5527a;
                        recyclerView.postInvalidateOnAnimation();
                    }
                }
                C0558p c0558p = recyclerView.f43698h1;
                int[] iArr4 = (int[]) c0558p.f3798e;
                if (iArr4 != null) {
                    Arrays.fill(iArr4, -1);
                }
                c0558p.f3797d = 0;
            } else {
                m15900a();
                RunnableC8577l runnableC8577l = recyclerView.f43696g1;
                if (runnableC8577l != null) {
                    runnableC8577l.m15873a(recyclerView, i12, i14);
                }
            }
        }
        C8584s c8584s3 = recyclerView.f2824m.f41623e;
        if (c8584s3 != null && c8584s3.f41771d) {
            c8584s3.m15897d(0, 0);
        }
        this.f41787e = false;
        if (!this.f41788f) {
            recyclerView.setScrollState(0);
            recyclerView.b0(1);
        } else {
            recyclerView.removeCallbacks(this);
            Field field2 = c6.v0.f5527a;
            recyclerView.postOnAnimation(this);
        }
    }
}
