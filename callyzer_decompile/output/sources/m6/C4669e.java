package m6;

import android.content.Context;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewParent;
import android.widget.OverScroller;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import bk.RunnableC0683n;
import c6.v0;
import com.skydoves.balloon.internals.DefinitionKt;
import com.sun.mail.imap.IMAPStore;
import hz.AbstractC3063b;
import java.lang.reflect.Field;
import java.util.Arrays;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: m6.e */
/* loaded from: classes.dex */
public final class C4669e {

    /* renamed from: v */
    public static final InterpolatorC4668d f23083v = new InterpolatorC4668d(0);

    /* renamed from: a */
    public int f23084a;

    /* renamed from: b */
    public final int f23085b;

    /* renamed from: d */
    public float[] f23087d;

    /* renamed from: e */
    public float[] f23088e;

    /* renamed from: f */
    public float[] f23089f;

    /* renamed from: g */
    public float[] f23090g;

    /* renamed from: h */
    public int[] f23091h;

    /* renamed from: i */
    public int[] f23092i;

    /* renamed from: j */
    public int[] f23093j;

    /* renamed from: k */
    public int f23094k;

    /* renamed from: l */
    public VelocityTracker f23095l;

    /* renamed from: m */
    public final float f23096m;

    /* renamed from: n */
    public final float f23097n;

    /* renamed from: o */
    public final int f23098o;

    /* renamed from: p */
    public final OverScroller f23099p;

    /* renamed from: q */
    public final AbstractC3063b f23100q;

    /* renamed from: r */
    public View f23101r;

    /* renamed from: s */
    public boolean f23102s;

    /* renamed from: t */
    public final CoordinatorLayout f23103t;

    /* renamed from: c */
    public int f23086c = -1;

    /* renamed from: u */
    public final RunnableC0683n f23104u = new RunnableC0683n(6, this);

    public C4669e(Context context, CoordinatorLayout coordinatorLayout, AbstractC3063b abstractC3063b) {
        if (abstractC3063b == null) {
            throw new IllegalArgumentException("Callback may not be null");
        }
        this.f23103t = coordinatorLayout;
        this.f23100q = abstractC3063b;
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        this.f23098o = (int) ((context.getResources().getDisplayMetrics().density * 20.0f) + 0.5f);
        this.f23085b = viewConfiguration.getScaledTouchSlop();
        this.f23096m = viewConfiguration.getScaledMaximumFlingVelocity();
        this.f23097n = viewConfiguration.getScaledMinimumFlingVelocity();
        this.f23099p = new OverScroller(context, f23083v);
    }

    /* renamed from: a */
    public final void m9555a() {
        this.f23086c = -1;
        float[] fArr = this.f23087d;
        if (fArr != null) {
            Arrays.fill(fArr, DefinitionKt.NO_Float_VALUE);
            Arrays.fill(this.f23088e, DefinitionKt.NO_Float_VALUE);
            Arrays.fill(this.f23089f, DefinitionKt.NO_Float_VALUE);
            Arrays.fill(this.f23090g, DefinitionKt.NO_Float_VALUE);
            Arrays.fill(this.f23091h, 0);
            Arrays.fill(this.f23092i, 0);
            Arrays.fill(this.f23093j, 0);
            this.f23094k = 0;
        }
        VelocityTracker velocityTracker = this.f23095l;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.f23095l = null;
        }
    }

    /* renamed from: b */
    public final void m9556b(int i10, View view) {
        ViewParent parent = view.getParent();
        CoordinatorLayout coordinatorLayout = this.f23103t;
        if (parent != coordinatorLayout) {
            throw new IllegalArgumentException("captureChildView: parameter must be a descendant of the ViewDragHelper's tracked parent view (" + coordinatorLayout + ")");
        }
        this.f23101r = view;
        this.f23086c = i10;
        this.f23100q.mo5422i(i10, view);
        m9567m(1);
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0044 A[RETURN] */
    /* renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean m9557c(android.view.View r4, float r5, float r6) {
        /*
            r3 = this;
            r0 = 0
            if (r4 != 0) goto L4
            goto L45
        L4:
            hz.b r1 = r3.f23100q
            int r4 = r1.mo5421g(r4)
            r2 = 1
            if (r4 <= 0) goto Lf
            r4 = r2
            goto L10
        Lf:
            r4 = r0
        L10:
            int r1 = r1.mo5965h()
            if (r1 <= 0) goto L18
            r1 = r2
            goto L19
        L18:
            r1 = r0
        L19:
            if (r4 == 0) goto L29
            if (r1 == 0) goto L29
            float r5 = r5 * r5
            float r6 = r6 * r6
            float r6 = r6 + r5
            int r4 = r3.f23085b
            int r4 = r4 * r4
            float r4 = (float) r4
            int r4 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r4 <= 0) goto L45
            goto L44
        L29:
            if (r4 == 0) goto L37
            float r4 = java.lang.Math.abs(r5)
            int r5 = r3.f23085b
            float r5 = (float) r5
            int r4 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1))
            if (r4 <= 0) goto L45
            goto L44
        L37:
            if (r1 == 0) goto L45
            float r4 = java.lang.Math.abs(r6)
            int r5 = r3.f23085b
            float r5 = (float) r5
            int r4 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1))
            if (r4 <= 0) goto L45
        L44:
            return r2
        L45:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: m6.C4669e.m9557c(android.view.View, float, float):boolean");
    }

    /* renamed from: d */
    public final void m9558d(int i10) {
        float[] fArr = this.f23087d;
        if (fArr != null) {
            int i11 = this.f23094k;
            int i12 = 1 << i10;
            if ((i11 & i12) != 0) {
                fArr[i10] = 0.0f;
                this.f23088e[i10] = 0.0f;
                this.f23089f[i10] = 0.0f;
                this.f23090g[i10] = 0.0f;
                this.f23091h[i10] = 0;
                this.f23092i[i10] = 0;
                this.f23093j[i10] = 0;
                this.f23094k = (~i12) & i11;
            }
        }
    }

    /* renamed from: e */
    public final int m9559e(int i10, int i11, int i12) {
        if (i10 == 0) {
            return 0;
        }
        float width = this.f23103t.getWidth() / 2;
        float fSin = (((float) Math.sin((Math.min(1.0f, Math.abs(i10) / r0) - 0.5f) * 0.47123894f)) * width) + width;
        int iAbs = Math.abs(i11);
        return Math.min(iAbs > 0 ? Math.round(Math.abs(fSin / iAbs) * 1000.0f) * 4 : (int) (((Math.abs(i10) / i12) + 1.0f) * 256.0f), 600);
    }

    /* renamed from: f */
    public final boolean m9560f() {
        if (this.f23084a == 2) {
            OverScroller overScroller = this.f23099p;
            boolean zComputeScrollOffset = overScroller.computeScrollOffset();
            int currX = overScroller.getCurrX();
            int currY = overScroller.getCurrY();
            int left = currX - this.f23101r.getLeft();
            int top = currY - this.f23101r.getTop();
            if (left != 0) {
                View view = this.f23101r;
                Field field = v0.f5527a;
                view.offsetLeftAndRight(left);
            }
            if (top != 0) {
                View view2 = this.f23101r;
                Field field2 = v0.f5527a;
                view2.offsetTopAndBottom(top);
            }
            if (left != 0 || top != 0) {
                this.f23100q.mo5424k(this.f23101r, currX, currY);
            }
            if (zComputeScrollOffset && currX == overScroller.getFinalX() && currY == overScroller.getFinalY()) {
                overScroller.abortAnimation();
                zComputeScrollOffset = false;
            }
            if (!zComputeScrollOffset) {
                this.f23103t.post(this.f23104u);
            }
        }
        return this.f23084a == 2;
    }

    /* renamed from: g */
    public final View m9561g(int i10, int i11) {
        CoordinatorLayout coordinatorLayout = this.f23103t;
        for (int childCount = coordinatorLayout.getChildCount() - 1; childCount >= 0; childCount--) {
            this.f23100q.getClass();
            View childAt = coordinatorLayout.getChildAt(childCount);
            if (i10 >= childAt.getLeft() && i10 < childAt.getRight() && i11 >= childAt.getTop() && i11 < childAt.getBottom()) {
                return childAt;
            }
        }
        return null;
    }

    /* renamed from: h */
    public final boolean m9562h(int i10, int i11, int i12, int i13) {
        float f6;
        float f10;
        float f11;
        float f12;
        int left = this.f23101r.getLeft();
        int top = this.f23101r.getTop();
        int i14 = i10 - left;
        int i15 = i11 - top;
        OverScroller overScroller = this.f23099p;
        if (i14 == 0 && i15 == 0) {
            overScroller.abortAnimation();
            m9567m(0);
            return false;
        }
        View view = this.f23101r;
        int i16 = (int) this.f23097n;
        int i17 = (int) this.f23096m;
        int iAbs = Math.abs(i12);
        if (iAbs < i16) {
            i12 = 0;
        } else if (iAbs > i17) {
            i12 = i12 > 0 ? i17 : -i17;
        }
        int iAbs2 = Math.abs(i13);
        if (iAbs2 < i16) {
            i13 = 0;
        } else if (iAbs2 > i17) {
            i13 = i13 > 0 ? i17 : -i17;
        }
        int iAbs3 = Math.abs(i14);
        int iAbs4 = Math.abs(i15);
        int iAbs5 = Math.abs(i12);
        int iAbs6 = Math.abs(i13);
        int i18 = iAbs5 + iAbs6;
        int i19 = iAbs3 + iAbs4;
        if (i12 != 0) {
            f6 = iAbs5;
            f10 = i18;
        } else {
            f6 = iAbs3;
            f10 = i19;
        }
        float f13 = f6 / f10;
        if (i13 != 0) {
            f11 = iAbs6;
            f12 = i18;
        } else {
            f11 = iAbs4;
            f12 = i19;
        }
        float f14 = f11 / f12;
        AbstractC3063b abstractC3063b = this.f23100q;
        overScroller.startScroll(left, top, i14, i15, (int) ((m9559e(i15, i13, abstractC3063b.mo5965h()) * f14) + (m9559e(i14, i12, abstractC3063b.mo5421g(view)) * f13)));
        m9567m(2);
        return true;
    }

    /* renamed from: i */
    public final void m9563i(MotionEvent motionEvent) {
        int i10;
        int actionMasked = motionEvent.getActionMasked();
        int actionIndex = motionEvent.getActionIndex();
        if (actionMasked == 0) {
            m9555a();
        }
        if (this.f23095l == null) {
            this.f23095l = VelocityTracker.obtain();
        }
        this.f23095l.addMovement(motionEvent);
        if (actionMasked == 0) {
            float x3 = motionEvent.getX();
            float y10 = motionEvent.getY();
            int pointerId = motionEvent.getPointerId(0);
            View viewM9561g = m9561g((int) x3, (int) y10);
            m9565k(x3, y10, pointerId);
            m9570p(pointerId, viewM9561g);
            int i11 = this.f23091h[pointerId];
            return;
        }
        if (actionMasked == 1) {
            if (this.f23084a == 1) {
                m9564j();
            }
            m9555a();
            return;
        }
        AbstractC3063b abstractC3063b = this.f23100q;
        if (actionMasked != 2) {
            if (actionMasked == 3) {
                if (this.f23084a == 1) {
                    this.f23102s = true;
                    abstractC3063b.mo5425l(this.f23101r, DefinitionKt.NO_Float_VALUE, DefinitionKt.NO_Float_VALUE);
                    this.f23102s = false;
                    if (this.f23084a == 1) {
                        m9567m(0);
                    }
                }
                m9555a();
                return;
            }
            if (actionMasked == 5) {
                int pointerId2 = motionEvent.getPointerId(actionIndex);
                float x10 = motionEvent.getX(actionIndex);
                float y11 = motionEvent.getY(actionIndex);
                m9565k(x10, y11, pointerId2);
                if (this.f23084a == 0) {
                    m9570p(pointerId2, m9561g((int) x10, (int) y11));
                    int i12 = this.f23091h[pointerId2];
                    return;
                }
                int i13 = (int) x10;
                int i14 = (int) y11;
                View view = this.f23101r;
                if (view != null && i13 >= view.getLeft() && i13 < view.getRight() && i14 >= view.getTop() && i14 < view.getBottom()) {
                    i = 1;
                }
                if (i != 0) {
                    m9570p(pointerId2, this.f23101r);
                    return;
                }
                return;
            }
            if (actionMasked != 6) {
                return;
            }
            int pointerId3 = motionEvent.getPointerId(actionIndex);
            if (this.f23084a == 1 && pointerId3 == this.f23086c) {
                int pointerCount = motionEvent.getPointerCount();
                while (true) {
                    if (i >= pointerCount) {
                        i10 = -1;
                        break;
                    }
                    int pointerId4 = motionEvent.getPointerId(i);
                    if (pointerId4 != this.f23086c) {
                        View viewM9561g2 = m9561g((int) motionEvent.getX(i), (int) motionEvent.getY(i));
                        View view2 = this.f23101r;
                        if (viewM9561g2 == view2 && m9570p(pointerId4, view2)) {
                            i10 = this.f23086c;
                            break;
                        }
                    }
                    i++;
                }
                if (i10 == -1) {
                    m9564j();
                }
            }
            m9558d(pointerId3);
            return;
        }
        if (this.f23084a == 1) {
            int i15 = this.f23086c;
            if (((this.f23094k & (1 << i15)) != 0 ? 1 : 0) == 0) {
                return;
            }
            int iFindPointerIndex = motionEvent.findPointerIndex(i15);
            float x11 = motionEvent.getX(iFindPointerIndex);
            float y12 = motionEvent.getY(iFindPointerIndex);
            float[] fArr = this.f23089f;
            int i16 = this.f23086c;
            int i17 = (int) (x11 - fArr[i16]);
            int i18 = (int) (y12 - this.f23090g[i16]);
            int left = this.f23101r.getLeft() + i17;
            int top = this.f23101r.getTop() + i18;
            int left2 = this.f23101r.getLeft();
            int top2 = this.f23101r.getTop();
            if (i17 != 0) {
                left = abstractC3063b.mo5419d(left, this.f23101r);
                Field field = v0.f5527a;
                this.f23101r.offsetLeftAndRight(left - left2);
            }
            if (i18 != 0) {
                top = abstractC3063b.mo5420e(top, this.f23101r);
                Field field2 = v0.f5527a;
                this.f23101r.offsetTopAndBottom(top - top2);
            }
            if (i17 != 0 || i18 != 0) {
                abstractC3063b.mo5424k(this.f23101r, left, top);
            }
            m9566l(motionEvent);
            return;
        }
        int pointerCount2 = motionEvent.getPointerCount();
        for (int i19 = 0; i19 < pointerCount2; i19++) {
            int pointerId5 = motionEvent.getPointerId(i19);
            if ((this.f23094k & (1 << pointerId5)) != 0) {
                float x12 = motionEvent.getX(i19);
                float y13 = motionEvent.getY(i19);
                float f6 = x12 - this.f23087d[pointerId5];
                float f10 = y13 - this.f23088e[pointerId5];
                Math.abs(f6);
                Math.abs(f10);
                int i20 = this.f23091h[pointerId5];
                Math.abs(f10);
                Math.abs(f6);
                int i21 = this.f23091h[pointerId5];
                Math.abs(f6);
                Math.abs(f10);
                int i22 = this.f23091h[pointerId5];
                Math.abs(f10);
                Math.abs(f6);
                int i23 = this.f23091h[pointerId5];
                if (this.f23084a == 1) {
                    break;
                }
                View viewM9561g3 = m9561g((int) x12, (int) y13);
                if (m9557c(viewM9561g3, f6, f10) && m9570p(pointerId5, viewM9561g3)) {
                    break;
                }
            }
        }
        m9566l(motionEvent);
    }

    /* renamed from: j */
    public final void m9564j() {
        VelocityTracker velocityTracker = this.f23095l;
        float f6 = this.f23096m;
        velocityTracker.computeCurrentVelocity(IMAPStore.RESPONSE, f6);
        float xVelocity = this.f23095l.getXVelocity(this.f23086c);
        float fAbs = Math.abs(xVelocity);
        float f10 = this.f23097n;
        if (fAbs < f10) {
            xVelocity = 0.0f;
        } else if (fAbs > f6) {
            xVelocity = xVelocity > DefinitionKt.NO_Float_VALUE ? f6 : -f6;
        }
        float yVelocity = this.f23095l.getYVelocity(this.f23086c);
        float fAbs2 = Math.abs(yVelocity);
        if (fAbs2 < f10) {
            f6 = 0.0f;
        } else if (fAbs2 <= f6) {
            f6 = yVelocity;
        } else if (yVelocity <= DefinitionKt.NO_Float_VALUE) {
            f6 = -f6;
        }
        this.f23102s = true;
        this.f23100q.mo5425l(this.f23101r, xVelocity, f6);
        this.f23102s = false;
        if (this.f23084a == 1) {
            m9567m(0);
        }
    }

    /* renamed from: k */
    public final void m9565k(float f6, float f10, int i10) {
        float[] fArr = this.f23087d;
        if (fArr == null || fArr.length <= i10) {
            int i11 = i10 + 1;
            float[] fArr2 = new float[i11];
            float[] fArr3 = new float[i11];
            float[] fArr4 = new float[i11];
            float[] fArr5 = new float[i11];
            int[] iArr = new int[i11];
            int[] iArr2 = new int[i11];
            int[] iArr3 = new int[i11];
            if (fArr != null) {
                System.arraycopy(fArr, 0, fArr2, 0, fArr.length);
                float[] fArr6 = this.f23088e;
                System.arraycopy(fArr6, 0, fArr3, 0, fArr6.length);
                float[] fArr7 = this.f23089f;
                System.arraycopy(fArr7, 0, fArr4, 0, fArr7.length);
                float[] fArr8 = this.f23090g;
                System.arraycopy(fArr8, 0, fArr5, 0, fArr8.length);
                int[] iArr4 = this.f23091h;
                System.arraycopy(iArr4, 0, iArr, 0, iArr4.length);
                int[] iArr5 = this.f23092i;
                System.arraycopy(iArr5, 0, iArr2, 0, iArr5.length);
                int[] iArr6 = this.f23093j;
                System.arraycopy(iArr6, 0, iArr3, 0, iArr6.length);
            }
            this.f23087d = fArr2;
            this.f23088e = fArr3;
            this.f23089f = fArr4;
            this.f23090g = fArr5;
            this.f23091h = iArr;
            this.f23092i = iArr2;
            this.f23093j = iArr3;
        }
        float[] fArr9 = this.f23087d;
        this.f23089f[i10] = f6;
        fArr9[i10] = f6;
        float[] fArr10 = this.f23088e;
        this.f23090g[i10] = f10;
        fArr10[i10] = f10;
        int[] iArr7 = this.f23091h;
        int i12 = (int) f6;
        int i13 = (int) f10;
        CoordinatorLayout coordinatorLayout = this.f23103t;
        int left = coordinatorLayout.getLeft();
        int i14 = this.f23098o;
        int i15 = i12 < left + i14 ? 1 : 0;
        if (i13 < coordinatorLayout.getTop() + i14) {
            i15 |= 4;
        }
        if (i12 > coordinatorLayout.getRight() - i14) {
            i15 |= 2;
        }
        if (i13 > coordinatorLayout.getBottom() - i14) {
            i15 |= 8;
        }
        iArr7[i10] = i15;
        this.f23094k |= 1 << i10;
    }

    /* renamed from: l */
    public final void m9566l(MotionEvent motionEvent) {
        int pointerCount = motionEvent.getPointerCount();
        for (int i10 = 0; i10 < pointerCount; i10++) {
            int pointerId = motionEvent.getPointerId(i10);
            if ((this.f23094k & (1 << pointerId)) != 0) {
                float x3 = motionEvent.getX(i10);
                float y10 = motionEvent.getY(i10);
                this.f23089f[pointerId] = x3;
                this.f23090g[pointerId] = y10;
            }
        }
    }

    /* renamed from: m */
    public final void m9567m(int i10) {
        this.f23103t.removeCallbacks(this.f23104u);
        if (this.f23084a != i10) {
            this.f23084a = i10;
            this.f23100q.mo5423j(i10);
            if (this.f23084a == 0) {
                this.f23101r = null;
            }
        }
    }

    /* renamed from: n */
    public final boolean m9568n(int i10, int i11) {
        if (this.f23102s) {
            return m9562h(i10, i11, (int) this.f23095l.getXVelocity(this.f23086c), (int) this.f23095l.getYVelocity(this.f23086c));
        }
        throw new IllegalStateException("Cannot settleCapturedViewAt outside of a call to Callback#onViewReleased");
    }

    /* JADX WARN: Removed duplicated region for block: B:51:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0113  */
    /* renamed from: o */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean m9569o(android.view.MotionEvent r18) {
        /*
            Method dump skipped, instructions count: 321
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: m6.C4669e.m9569o(android.view.MotionEvent):boolean");
    }

    /* renamed from: p */
    public final boolean m9570p(int i10, View view) {
        if (view == this.f23101r && this.f23086c == i10) {
            return true;
        }
        if (view == null || !this.f23100q.mo5426m(i10, view)) {
            return false;
        }
        this.f23086c = i10;
        m9556b(i10, view);
        return true;
    }
}
