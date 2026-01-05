package com.google.android.material.bottomsheet;

import a6.C0058f;
import ah.AbstractC0143a;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.os.Build;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.AbsSavedState;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import c6.C0871a;
import c6.C0872b;
import c6.l0;
import c6.n0;
import c6.v0;
import c9.C0927v;
import com.skydoves.balloon.internals.DefinitionKt;
import com.websoptimization.callyzerbiz.R;
import d6.C1613c;
import d9.RunnableC1669n;
import dg.C1714c;
import ee.C2039g;
import fh.C2287b;
import fh.C2288c;
import fh.C2289d;
import fh.RunnableC2286a;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.HashMap;
import l0.RunnableC4307g;
import lh.ViewOnAttachStateChangeListenerC4476l;
import m6.C4669e;
import mm.AbstractC4801l;
import o5.AbstractC5292a;
import o5.C5295d;
import og.y0;
import ph.C5951f;
import ph.C5952g;
import ph.C5955j;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public class BottomSheetBehavior<V extends View> extends AbstractC5292a {

    /* renamed from: A */
    public int f6733A;

    /* renamed from: B */
    public final float f6734B;

    /* renamed from: C */
    public boolean f6735C;

    /* renamed from: D */
    public boolean f6736D;

    /* renamed from: E */
    public final boolean f6737E;

    /* renamed from: F */
    public int f6738F;

    /* renamed from: G */
    public C4669e f6739G;

    /* renamed from: H */
    public boolean f6740H;

    /* renamed from: I */
    public int f6741I;

    /* renamed from: J */
    public boolean f6742J;

    /* renamed from: K */
    public int f6743K;

    /* renamed from: L */
    public int f6744L;

    /* renamed from: M */
    public int f6745M;

    /* renamed from: N */
    public WeakReference f6746N;

    /* renamed from: O */
    public WeakReference f6747O;

    /* renamed from: P */
    public final ArrayList f6748P;

    /* renamed from: Q */
    public VelocityTracker f6749Q;

    /* renamed from: R */
    public int f6750R;

    /* renamed from: S */
    public int f6751S;

    /* renamed from: T */
    public boolean f6752T;

    /* renamed from: U */
    public HashMap f6753U;

    /* renamed from: V */
    public int f6754V;

    /* renamed from: W */
    public final C2288c f6755W;

    /* renamed from: a */
    public final int f6756a;

    /* renamed from: b */
    public boolean f6757b;

    /* renamed from: c */
    public final float f6758c;

    /* renamed from: d */
    public int f6759d;

    /* renamed from: e */
    public boolean f6760e;

    /* renamed from: f */
    public int f6761f;

    /* renamed from: g */
    public final int f6762g;

    /* renamed from: h */
    public final boolean f6763h;

    /* renamed from: i */
    public C5952g f6764i;

    /* renamed from: j */
    public final int f6765j;

    /* renamed from: k */
    public int f6766k;

    /* renamed from: l */
    public final boolean f6767l;

    /* renamed from: m */
    public final boolean f6768m;

    /* renamed from: n */
    public final boolean f6769n;

    /* renamed from: o */
    public final boolean f6770o;

    /* renamed from: p */
    public final boolean f6771p;

    /* renamed from: q */
    public int f6772q;

    /* renamed from: r */
    public int f6773r;

    /* renamed from: s */
    public C5955j f6774s;

    /* renamed from: t */
    public boolean f6775t;

    /* renamed from: u */
    public RunnableC1669n f6776u;

    /* renamed from: v */
    public final ValueAnimator f6777v;

    /* renamed from: w */
    public final int f6778w;

    /* renamed from: x */
    public int f6779x;

    /* renamed from: y */
    public int f6780y;

    /* renamed from: z */
    public final float f6781z;

    public BottomSheetBehavior() {
        this.f6756a = 0;
        this.f6757b = true;
        this.f6765j = -1;
        this.f6776u = null;
        this.f6781z = 0.5f;
        this.f6734B = -1.0f;
        this.f6737E = true;
        this.f6738F = 4;
        this.f6748P = new ArrayList();
        this.f6754V = -1;
        this.f6755W = new C2288c(this);
    }

    /* renamed from: v */
    public static View m4049v(View view) {
        Field field = v0.f5527a;
        if (n0.m2456h(view)) {
            return view;
        }
        if (!(view instanceof ViewGroup)) {
            return null;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View viewM4049v = m4049v(viewGroup.getChildAt(i10));
            if (viewM4049v != null) {
                return viewM4049v;
            }
        }
        return null;
    }

    /* renamed from: A */
    public final void m4050A(int i10, View view) throws Resources.NotFoundException {
        int iM4064w;
        int i11;
        if (i10 == 4) {
            iM4064w = this.f6733A;
        } else if (i10 == 6) {
            iM4064w = this.f6780y;
            if (this.f6757b && iM4064w <= (i11 = this.f6779x)) {
                i10 = 3;
                iM4064w = i11;
            }
        } else if (i10 == 3) {
            iM4064w = m4064w();
        } else {
            if (!this.f6735C || i10 != 5) {
                throw new IllegalArgumentException(AbstractC4801l.m9730d(i10, "Illegal state argument: "));
            }
            iM4064w = this.f6745M;
        }
        m4052C(view, i10, iM4064w, false);
    }

    /* renamed from: B */
    public final boolean m4051B(View view, float f6) {
        if (this.f6736D) {
            return true;
        }
        if (view.getTop() < this.f6733A) {
            return false;
        }
        return Math.abs(((f6 * 0.1f) + ((float) view.getTop())) - ((float) this.f6733A)) / ((float) m4061s()) > 0.5f;
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x002c, code lost:
    
        if (r5 != false) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x002e, code lost:
    
        m4067z(2);
        m4054E(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0037, code lost:
    
        if (r2.f6776u != null) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0039, code lost:
    
        r2.f6776u = new d9.RunnableC1669n(r2, r3, r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0040, code lost:
    
        r5 = r2.f6776u;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0044, code lost:
    
        if (r5.f8195b != false) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0046, code lost:
    
        r5.f8196c = r4;
        r4 = c6.v0.f5527a;
        r3.postOnAnimation(r5);
        r2.f6776u.f8195b = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0052, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0053, code lost:
    
        r5.f8196c = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0055, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x000e, code lost:
    
        if (r0.m9568n(r3.getLeft(), r5) != false) goto L16;
     */
    /* renamed from: C */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m4052C(android.view.View r3, int r4, int r5, boolean r6) throws android.content.res.Resources.NotFoundException {
        /*
            r2 = this;
            m6.e r0 = r2.f6739G
            if (r0 == 0) goto L56
            if (r6 == 0) goto L11
            int r6 = r3.getLeft()
            boolean r5 = r0.m9568n(r6, r5)
            if (r5 == 0) goto L56
            goto L2e
        L11:
            int r6 = r3.getLeft()
            r0.f23101r = r3
            r1 = -1
            r0.f23086c = r1
            r1 = 0
            boolean r5 = r0.m9562h(r6, r5, r1, r1)
            if (r5 != 0) goto L2c
            int r6 = r0.f23084a
            if (r6 != 0) goto L2c
            android.view.View r6 = r0.f23101r
            if (r6 == 0) goto L2c
            r6 = 0
            r0.f23101r = r6
        L2c:
            if (r5 == 0) goto L56
        L2e:
            r5 = 2
            r2.m4067z(r5)
            r2.m4054E(r4)
            d9.n r5 = r2.f6776u
            if (r5 != 0) goto L40
            d9.n r5 = new d9.n
            r5.<init>(r2, r3, r4)
            r2.f6776u = r5
        L40:
            d9.n r5 = r2.f6776u
            boolean r6 = r5.f8195b
            if (r6 != 0) goto L53
            r5.f8196c = r4
            java.lang.reflect.Field r4 = c6.v0.f5527a
            r3.postOnAnimation(r5)
            d9.n r3 = r2.f6776u
            r4 = 1
            r3.f8195b = r4
            return
        L53:
            r5.f8196c = r4
            return
        L56:
            r2.m4067z(r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.bottomsheet.BottomSheetBehavior.m4052C(android.view.View, int, int, boolean):void");
    }

    /* renamed from: D */
    public final void m4053D() throws Resources.NotFoundException {
        View view;
        int iM5264a;
        WeakReference weakReference = this.f6746N;
        if (weakReference == null || (view = (View) weakReference.get()) == null) {
            return;
        }
        v0.m2525g(524288, view);
        v0.m2523e(0, view);
        v0.m2525g(262144, view);
        v0.m2523e(0, view);
        v0.m2525g(1048576, view);
        v0.m2523e(0, view);
        int i10 = this.f6754V;
        if (i10 != -1) {
            v0.m2525g(i10, view);
            v0.m2523e(0, view);
        }
        if (!this.f6757b && this.f6738F != 6) {
            String string = view.getResources().getString(R.string.bottomsheet_action_expand_halfway);
            C2039g c2039g = new C2039g(this, i, 1);
            ArrayList arrayListM2521c = v0.m2521c(view);
            int i11 = 0;
            while (true) {
                if (i11 >= arrayListM2521c.size()) {
                    int i12 = 0;
                    int i13 = -1;
                    while (true) {
                        int[] iArr = v0.f5529c;
                        if (i12 >= 32 || i13 != -1) {
                            break;
                        }
                        int i14 = iArr[i12];
                        boolean z6 = true;
                        for (int i15 = 0; i15 < arrayListM2521c.size(); i15++) {
                            z6 &= ((C1613c) arrayListM2521c.get(i15)).m5264a() != i14;
                        }
                        if (z6) {
                            i13 = i14;
                        }
                        i12++;
                    }
                    iM5264a = i13;
                } else {
                    if (TextUtils.equals(string, ((AccessibilityNodeInfo.AccessibilityAction) ((C1613c) arrayListM2521c.get(i11)).f8055a).getLabel())) {
                        iM5264a = ((C1613c) arrayListM2521c.get(i11)).m5264a();
                        break;
                    }
                    i11++;
                }
            }
            if (iM5264a != -1) {
                C1613c c1613c = new C1613c(null, iM5264a, string, c2039g, null);
                View.AccessibilityDelegate accessibilityDelegateM2520b = v0.m2520b(view);
                C0872b c0872b = accessibilityDelegateM2520b == null ? null : accessibilityDelegateM2520b instanceof C0871a ? ((C0871a) accessibilityDelegateM2520b).f5417a : new C0872b(accessibilityDelegateM2520b);
                if (c0872b == null) {
                    c0872b = new C0872b();
                }
                v0.m2528j(view, c0872b);
                v0.m2525g(c1613c.m5264a(), view);
                v0.m2521c(view).add(c1613c);
                v0.m2523e(0, view);
            }
            this.f6754V = iM5264a;
        }
        if (this.f6735C) {
            int i16 = 5;
            if (this.f6738F != 5) {
                v0.m2526h(view, C1613c.f8050l, new C2039g(this, i16, 1));
            }
        }
        int i17 = this.f6738F;
        int i18 = 4;
        int i19 = 3;
        if (i17 == 3) {
            v0.m2526h(view, C1613c.f8049k, new C2039g(this, this.f6757b ? 4 : 6, 1));
            return;
        }
        if (i17 == 4) {
            v0.m2526h(view, C1613c.f8048j, new C2039g(this, this.f6757b ? 3 : 6, 1));
        } else {
            if (i17 != 6) {
                return;
            }
            v0.m2526h(view, C1613c.f8049k, new C2039g(this, i18, 1));
            v0.m2526h(view, C1613c.f8048j, new C2039g(this, i19, 1));
        }
    }

    /* renamed from: E */
    public final void m4054E(int i10) {
        ValueAnimator valueAnimator;
        if (i10 == 2) {
            return;
        }
        boolean z6 = i10 == 3;
        if (this.f6775t != z6) {
            this.f6775t = z6;
            if (this.f6764i == null || (valueAnimator = this.f6777v) == null) {
                return;
            }
            if (valueAnimator.isRunning()) {
                valueAnimator.reverse();
                return;
            }
            float f6 = z6 ? DefinitionKt.NO_Float_VALUE : 1.0f;
            valueAnimator.setFloatValues(1.0f - f6, f6);
            valueAnimator.start();
        }
    }

    /* renamed from: F */
    public final void m4055F(boolean z6) {
        WeakReference weakReference = this.f6746N;
        if (weakReference == null) {
            return;
        }
        ViewParent parent = ((View) weakReference.get()).getParent();
        if (parent instanceof CoordinatorLayout) {
            CoordinatorLayout coordinatorLayout = (CoordinatorLayout) parent;
            int childCount = coordinatorLayout.getChildCount();
            if (z6) {
                if (this.f6753U != null) {
                    return;
                } else {
                    this.f6753U = new HashMap(childCount);
                }
            }
            for (int i10 = 0; i10 < childCount; i10++) {
                View childAt = coordinatorLayout.getChildAt(i10);
                if (childAt != this.f6746N.get() && z6) {
                    this.f6753U.put(childAt, Integer.valueOf(childAt.getImportantForAccessibility()));
                }
            }
            if (z6) {
                return;
            }
            this.f6753U = null;
        }
    }

    /* renamed from: G */
    public final void m4056G() {
        View view;
        if (this.f6746N != null) {
            m4060r();
            if (this.f6738F != 4 || (view = (View) this.f6746N.get()) == null) {
                return;
            }
            view.requestLayout();
        }
    }

    @Override // o5.AbstractC5292a
    /* renamed from: c */
    public final void mo4057c(C5295d c5295d) {
        this.f6746N = null;
        this.f6739G = null;
    }

    @Override // o5.AbstractC5292a
    /* renamed from: e */
    public final void mo4058e() {
        this.f6746N = null;
        this.f6739G = null;
    }

    @Override // o5.AbstractC5292a
    /* renamed from: f */
    public final boolean mo4035f(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        C4669e c4669e;
        if (!view.isShown() || !this.f6737E) {
            this.f6740H = true;
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.f6750R = -1;
            VelocityTracker velocityTracker = this.f6749Q;
            if (velocityTracker != null) {
                velocityTracker.recycle();
                this.f6749Q = null;
            }
        }
        if (this.f6749Q == null) {
            this.f6749Q = VelocityTracker.obtain();
        }
        this.f6749Q.addMovement(motionEvent);
        if (actionMasked == 0) {
            int x3 = (int) motionEvent.getX();
            this.f6751S = (int) motionEvent.getY();
            if (this.f6738F != 2) {
                WeakReference weakReference = this.f6747O;
                View view2 = weakReference != null ? (View) weakReference.get() : null;
                if (view2 != null && coordinatorLayout.m745n(view2, x3, this.f6751S)) {
                    this.f6750R = motionEvent.getPointerId(motionEvent.getActionIndex());
                    this.f6752T = true;
                }
            }
            this.f6740H = this.f6750R == -1 && !coordinatorLayout.m745n(view, x3, this.f6751S);
        } else if (actionMasked == 1 || actionMasked == 3) {
            this.f6752T = false;
            this.f6750R = -1;
            if (this.f6740H) {
                this.f6740H = false;
                return false;
            }
        }
        if (this.f6740H || (c4669e = this.f6739G) == null || !c4669e.m9569o(motionEvent)) {
            WeakReference weakReference2 = this.f6747O;
            View view3 = weakReference2 != null ? (View) weakReference2.get() : null;
            if (actionMasked != 2 || view3 == null || this.f6740H || this.f6738F == 1 || coordinatorLayout.m745n(view3, (int) motionEvent.getX(), (int) motionEvent.getY()) || this.f6739G == null || Math.abs(this.f6751S - motionEvent.getY()) <= this.f6739G.f23085b) {
                return false;
            }
        }
        return true;
    }

    @Override // o5.AbstractC5292a
    /* renamed from: g */
    public final boolean mo2728g(CoordinatorLayout coordinatorLayout, View view, int i10) throws Resources.NotFoundException {
        C5952g c5952g;
        Field field = v0.f5527a;
        if (coordinatorLayout.getFitsSystemWindows() && !view.getFitsSystemWindows()) {
            view.setFitsSystemWindows(true);
        }
        int i11 = 6;
        boolean z6 = false;
        if (this.f6746N == null) {
            this.f6761f = coordinatorLayout.getResources().getDimensionPixelSize(R.dimen.design_bottom_sheet_peek_height_min);
            boolean z10 = (Build.VERSION.SDK_INT < 29 || this.f6767l || this.f6760e) ? false : true;
            if (this.f6768m || this.f6769n || this.f6770o || z10) {
                C0058f c0058f = new C0058f(this, z10);
                int paddingStart = view.getPaddingStart();
                view.getPaddingTop();
                int paddingEnd = view.getPaddingEnd();
                int paddingBottom = view.getPaddingBottom();
                C1714c c1714c = new C1714c();
                c1714c.f8340a = paddingStart;
                c1714c.f8341b = paddingEnd;
                c1714c.f8342c = paddingBottom;
                n0.m2460l(view, new C0927v(7, c0058f, c1714c, z6));
                if (view.isAttachedToWindow()) {
                    l0.m2444c(view);
                } else {
                    view.addOnAttachStateChangeListener(new ViewOnAttachStateChangeListenerC4476l());
                }
            }
            this.f6746N = new WeakReference(view);
            if (this.f6763h && (c5952g = this.f6764i) != null) {
                view.setBackground(c5952g);
            }
            C5952g c5952g2 = this.f6764i;
            if (c5952g2 != null) {
                float fM2453e = this.f6734B;
                if (fM2453e == -1.0f) {
                    fM2453e = n0.m2453e(view);
                }
                c5952g2.m11987h(fM2453e);
                boolean z11 = this.f6738F == 3;
                this.f6775t = z11;
                C5952g c5952g3 = this.f6764i;
                float f6 = z11 ? DefinitionKt.NO_Float_VALUE : 1.0f;
                C5951f c5951f = c5952g3.f29152a;
                if (c5951f.f29143i != f6) {
                    c5951f.f29143i = f6;
                    c5952g3.f29156e = true;
                    c5952g3.invalidateSelf();
                }
            }
            m4053D();
            if (view.getImportantForAccessibility() == 0) {
                view.setImportantForAccessibility(1);
            }
            int measuredWidth = view.getMeasuredWidth();
            int i12 = this.f6765j;
            if (measuredWidth > i12 && i12 != -1) {
                ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                layoutParams.width = i12;
                view.post(new RunnableC4307g(i11, view, layoutParams));
            }
        }
        if (this.f6739G == null) {
            this.f6739G = new C4669e(coordinatorLayout.getContext(), coordinatorLayout, this.f6755W);
        }
        int top = view.getTop();
        coordinatorLayout.m747p(i10, view);
        this.f6744L = coordinatorLayout.getWidth();
        this.f6745M = coordinatorLayout.getHeight();
        int height = view.getHeight();
        this.f6743K = height;
        int i13 = this.f6745M;
        int i14 = i13 - height;
        int i15 = this.f6773r;
        if (i14 < i15) {
            if (this.f6771p) {
                this.f6743K = i13;
            } else {
                this.f6743K = i13 - i15;
            }
        }
        this.f6779x = Math.max(0, i13 - this.f6743K);
        this.f6780y = (int) ((1.0f - this.f6781z) * this.f6745M);
        m4060r();
        int i16 = this.f6738F;
        if (i16 == 3) {
            view.offsetTopAndBottom(m4064w());
        } else if (i16 == 6) {
            view.offsetTopAndBottom(this.f6780y);
        } else if (this.f6735C && i16 == 5) {
            view.offsetTopAndBottom(this.f6745M);
        } else if (i16 == 4) {
            view.offsetTopAndBottom(this.f6733A);
        } else if (i16 == 1 || i16 == 2) {
            view.offsetTopAndBottom(top - view.getTop());
        }
        this.f6747O = new WeakReference(m4049v(view));
        return true;
    }

    @Override // o5.AbstractC5292a
    /* renamed from: i */
    public final boolean mo4059i(View view) {
        WeakReference weakReference = this.f6747O;
        return (weakReference == null || view != weakReference.get() || this.f6738F == 3) ? false : true;
    }

    @Override // o5.AbstractC5292a
    /* renamed from: j */
    public final void mo4037j(CoordinatorLayout coordinatorLayout, View view, View view2, int i10, int i11, int[] iArr, int i12) throws Resources.NotFoundException {
        if (i12 == 1) {
            return;
        }
        WeakReference weakReference = this.f6747O;
        if (view2 != (weakReference != null ? (View) weakReference.get() : null)) {
            return;
        }
        int top = view.getTop();
        int i13 = top - i11;
        boolean z6 = this.f6737E;
        if (i11 > 0) {
            if (i13 < m4064w()) {
                int iM4064w = top - m4064w();
                iArr[1] = iM4064w;
                int i14 = -iM4064w;
                Field field = v0.f5527a;
                view.offsetTopAndBottom(i14);
                m4067z(3);
            } else {
                if (!z6) {
                    return;
                }
                iArr[1] = i11;
                Field field2 = v0.f5527a;
                view.offsetTopAndBottom(-i11);
                m4067z(1);
            }
        } else if (i11 < 0 && !view2.canScrollVertically(-1)) {
            int i15 = this.f6733A;
            if (i13 > i15 && !this.f6735C) {
                int i16 = top - i15;
                iArr[1] = i16;
                int i17 = -i16;
                Field field3 = v0.f5527a;
                view.offsetTopAndBottom(i17);
                m4067z(4);
            } else {
                if (!z6) {
                    return;
                }
                iArr[1] = i11;
                Field field4 = v0.f5527a;
                view.offsetTopAndBottom(-i11);
                m4067z(1);
            }
        }
        m4063u(view.getTop());
        this.f6741I = i11;
        this.f6742J = true;
    }

    @Override // o5.AbstractC5292a
    /* renamed from: m */
    public final void mo4039m(View view, Parcelable parcelable) {
        C2289d c2289d = (C2289d) parcelable;
        int i10 = this.f6756a;
        if (i10 != 0) {
            if (i10 == -1 || (i10 & 1) == 1) {
                this.f6759d = c2289d.f10325d;
            }
            if (i10 == -1 || (i10 & 2) == 2) {
                this.f6757b = c2289d.f10326e;
            }
            if (i10 == -1 || (i10 & 4) == 4) {
                this.f6735C = c2289d.f10327f;
            }
            if (i10 == -1 || (i10 & 8) == 8) {
                this.f6736D = c2289d.f10328g;
            }
        }
        int i11 = c2289d.f10324c;
        if (i11 == 1 || i11 == 2) {
            this.f6738F = 4;
        } else {
            this.f6738F = i11;
        }
    }

    @Override // o5.AbstractC5292a
    /* renamed from: n */
    public final Parcelable mo4040n(View view) {
        AbsSavedState absSavedState = View.BaseSavedState.EMPTY_STATE;
        return new C2289d(this);
    }

    @Override // o5.AbstractC5292a
    /* renamed from: o */
    public final boolean mo4041o(View view, int i10, int i11) {
        this.f6741I = 0;
        this.f6742J = false;
        return (i10 & 2) != 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x0062  */
    @Override // o5.AbstractC5292a
    /* renamed from: p */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void mo4042p(android.view.View r4, android.view.View r5, int r6) throws android.content.res.Resources.NotFoundException {
        /*
            Method dump skipped, instructions count: 220
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.bottomsheet.BottomSheetBehavior.mo4042p(android.view.View, android.view.View, int):void");
    }

    @Override // o5.AbstractC5292a
    /* renamed from: q */
    public final boolean mo4043q(View view, MotionEvent motionEvent) {
        if (!view.isShown()) {
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (this.f6738F == 1 && actionMasked == 0) {
            return true;
        }
        C4669e c4669e = this.f6739G;
        if (c4669e != null) {
            c4669e.m9563i(motionEvent);
        }
        if (actionMasked == 0) {
            this.f6750R = -1;
            VelocityTracker velocityTracker = this.f6749Q;
            if (velocityTracker != null) {
                velocityTracker.recycle();
                this.f6749Q = null;
            }
        }
        if (this.f6749Q == null) {
            this.f6749Q = VelocityTracker.obtain();
        }
        this.f6749Q.addMovement(motionEvent);
        if (this.f6739G != null && actionMasked == 2 && !this.f6740H) {
            float fAbs = Math.abs(this.f6751S - motionEvent.getY());
            C4669e c4669e2 = this.f6739G;
            if (fAbs > c4669e2.f23085b) {
                c4669e2.m9556b(motionEvent.getPointerId(motionEvent.getActionIndex()), view);
            }
        }
        return !this.f6740H;
    }

    /* renamed from: r */
    public final void m4060r() {
        int iM4061s = m4061s();
        if (this.f6757b) {
            this.f6733A = Math.max(this.f6745M - iM4061s, this.f6779x);
        } else {
            this.f6733A = this.f6745M - iM4061s;
        }
    }

    /* renamed from: s */
    public final int m4061s() {
        int i10;
        return this.f6760e ? Math.min(Math.max(this.f6761f, this.f6745M - ((this.f6744L * 9) / 16)), this.f6743K) + this.f6772q : (this.f6767l || this.f6768m || (i10 = this.f6766k) <= 0) ? this.f6759d + this.f6772q : Math.max(this.f6759d, i10 + this.f6762g);
    }

    /* renamed from: t */
    public final void m4062t(Context context, AttributeSet attributeSet, boolean z6, ColorStateList colorStateList) {
        if (this.f6763h) {
            this.f6774s = C5955j.m11993b(context, attributeSet, R.attr.bottomSheetStyle, R.style.Widget_Design_BottomSheet_Modal).m9582a();
            C5952g c5952g = new C5952g(this.f6774s);
            this.f6764i = c5952g;
            c5952g.m11986g(context);
            if (z6 && colorStateList != null) {
                this.f6764i.m11988i(colorStateList);
                return;
            }
            TypedValue typedValue = new TypedValue();
            context.getTheme().resolveAttribute(android.R.attr.colorBackground, typedValue, true);
            this.f6764i.setTint(typedValue.data);
        }
    }

    /* renamed from: u */
    public final void m4063u(int i10) {
        if (((View) this.f6746N.get()) != null) {
            ArrayList arrayList = this.f6748P;
            if (arrayList.isEmpty()) {
                return;
            }
            int i11 = this.f6733A;
            if (i10 <= i11 && i11 != m4064w()) {
                m4064w();
            }
            if (arrayList.size() <= 0) {
                return;
            }
            arrayList.get(0).getClass();
            throw new ClassCastException();
        }
    }

    /* renamed from: w */
    public final int m4064w() {
        if (this.f6757b) {
            return this.f6779x;
        }
        return Math.max(this.f6778w, this.f6771p ? 0 : this.f6773r);
    }

    /* renamed from: x */
    public final void m4065x(int i10) {
        if (i10 == -1) {
            if (this.f6760e) {
                return;
            } else {
                this.f6760e = true;
            }
        } else {
            if (!this.f6760e && this.f6759d == i10) {
                return;
            }
            this.f6760e = false;
            this.f6759d = Math.max(0, i10);
        }
        m4056G();
    }

    /* renamed from: y */
    public final void m4066y(int i10) {
        if (i10 == this.f6738F) {
            return;
        }
        if (this.f6746N == null) {
            if (i10 == 4 || i10 == 3 || i10 == 6 || (this.f6735C && i10 == 5)) {
                this.f6738F = i10;
                return;
            }
            return;
        }
        View view = (View) this.f6746N.get();
        if (view == null) {
            return;
        }
        ViewParent parent = view.getParent();
        if (parent != null && parent.isLayoutRequested()) {
            Field field = v0.f5527a;
            if (view.isAttachedToWindow()) {
                view.post(new RunnableC2286a(this, view, i10));
                return;
            }
        }
        m4050A(i10, view);
    }

    /* renamed from: z */
    public final void m4067z(int i10) throws Resources.NotFoundException {
        if (this.f6738F == i10) {
            return;
        }
        this.f6738F = i10;
        WeakReference weakReference = this.f6746N;
        if (weakReference == null || ((View) weakReference.get()) == null) {
            return;
        }
        if (i10 == 3) {
            m4055F(true);
        } else if (i10 == 6 || i10 == 5 || i10 == 4) {
            m4055F(false);
        }
        m4054E(i10);
        ArrayList arrayList = this.f6748P;
        if (arrayList.size() <= 0) {
            m4053D();
        } else {
            arrayList.get(0).getClass();
            throw new ClassCastException();
        }
    }

    public BottomSheetBehavior(Context context, AttributeSet attributeSet) throws Resources.NotFoundException {
        int i10;
        int i11 = 0;
        this.f6756a = 0;
        this.f6757b = true;
        this.f6765j = -1;
        this.f6776u = null;
        this.f6781z = 0.5f;
        this.f6734B = -1.0f;
        this.f6737E = true;
        this.f6738F = 4;
        this.f6748P = new ArrayList();
        this.f6754V = -1;
        this.f6755W = new C2288c(this);
        this.f6762g = context.getResources().getDimensionPixelSize(R.dimen.mtrl_min_touch_target_size);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC0143a.f452a);
        this.f6763h = typedArrayObtainStyledAttributes.hasValue(16);
        boolean zHasValue = typedArrayObtainStyledAttributes.hasValue(2);
        if (zHasValue) {
            m4062t(context, attributeSet, zHasValue, y0.m11057g(context, typedArrayObtainStyledAttributes, 2));
        } else {
            m4062t(context, attributeSet, zHasValue, null);
        }
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(DefinitionKt.NO_Float_VALUE, 1.0f);
        this.f6777v = valueAnimatorOfFloat;
        valueAnimatorOfFloat.setDuration(500L);
        this.f6777v.addUpdateListener(new C2287b(i11, this));
        this.f6734B = typedArrayObtainStyledAttributes.getDimension(1, -1.0f);
        if (typedArrayObtainStyledAttributes.hasValue(0)) {
            this.f6765j = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, -1);
        }
        TypedValue typedValuePeekValue = typedArrayObtainStyledAttributes.peekValue(8);
        if (typedValuePeekValue != null && (i10 = typedValuePeekValue.data) == -1) {
            m4065x(i10);
        } else {
            m4065x(typedArrayObtainStyledAttributes.getDimensionPixelSize(8, -1));
        }
        boolean z6 = typedArrayObtainStyledAttributes.getBoolean(7, false);
        if (this.f6735C != z6) {
            this.f6735C = z6;
            if (!z6 && this.f6738F == 5) {
                m4066y(4);
            }
            m4053D();
        }
        this.f6767l = typedArrayObtainStyledAttributes.getBoolean(11, false);
        boolean z10 = typedArrayObtainStyledAttributes.getBoolean(5, true);
        if (this.f6757b != z10) {
            this.f6757b = z10;
            if (this.f6746N != null) {
                m4060r();
            }
            m4067z((this.f6757b && this.f6738F == 6) ? 3 : this.f6738F);
            m4053D();
        }
        this.f6736D = typedArrayObtainStyledAttributes.getBoolean(10, false);
        this.f6737E = typedArrayObtainStyledAttributes.getBoolean(3, true);
        this.f6756a = typedArrayObtainStyledAttributes.getInt(9, 0);
        float f6 = typedArrayObtainStyledAttributes.getFloat(6, 0.5f);
        if (f6 > DefinitionKt.NO_Float_VALUE && f6 < 1.0f) {
            this.f6781z = f6;
            if (this.f6746N != null) {
                this.f6780y = (int) ((1.0f - f6) * this.f6745M);
            }
            TypedValue typedValuePeekValue2 = typedArrayObtainStyledAttributes.peekValue(4);
            if (typedValuePeekValue2 != null && typedValuePeekValue2.type == 16) {
                int i12 = typedValuePeekValue2.data;
                if (i12 >= 0) {
                    this.f6778w = i12;
                } else {
                    throw new IllegalArgumentException("offset must be greater than or equal to 0");
                }
            } else {
                int dimensionPixelOffset = typedArrayObtainStyledAttributes.getDimensionPixelOffset(4, 0);
                if (dimensionPixelOffset >= 0) {
                    this.f6778w = dimensionPixelOffset;
                } else {
                    throw new IllegalArgumentException("offset must be greater than or equal to 0");
                }
            }
            this.f6768m = typedArrayObtainStyledAttributes.getBoolean(12, false);
            this.f6769n = typedArrayObtainStyledAttributes.getBoolean(13, false);
            this.f6770o = typedArrayObtainStyledAttributes.getBoolean(14, false);
            this.f6771p = typedArrayObtainStyledAttributes.getBoolean(15, true);
            typedArrayObtainStyledAttributes.recycle();
            this.f6758c = ViewConfiguration.get(context).getScaledMaximumFlingVelocity();
            return;
        }
        throw new IllegalArgumentException("ratio must be a float value between 0 and 1");
    }

    @Override // o5.AbstractC5292a
    /* renamed from: k */
    public final void mo4038k(CoordinatorLayout coordinatorLayout, View view, int i10, int i11, int i12, int[] iArr) {
    }
}
