package g6;

import android.content.res.Resources;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AnimationUtils;
import bk.RunnableC0683n;
import com.skydoves.balloon.internals.DefinitionKt;
import p013o.x0;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: g6.e */
/* loaded from: classes.dex */
public final class ViewOnTouchListenerC2530e implements View.OnTouchListener {

    /* renamed from: t */
    public static final int f13842t = ViewConfiguration.getTapTimeout();

    /* renamed from: a */
    public final C2526a f13843a;

    /* renamed from: b */
    public final AccelerateInterpolator f13844b;

    /* renamed from: c */
    public final x0 f13845c;

    /* renamed from: d */
    public RunnableC0683n f13846d;

    /* renamed from: e */
    public final float[] f13847e;

    /* renamed from: f */
    public final float[] f13848f;

    /* renamed from: g */
    public final int f13849g;

    /* renamed from: h */
    public final int f13850h;

    /* renamed from: j */
    public final float[] f13851j;

    /* renamed from: k */
    public final float[] f13852k;

    /* renamed from: l */
    public final float[] f13853l;

    /* renamed from: m */
    public boolean f13854m;

    /* renamed from: n */
    public boolean f13855n;

    /* renamed from: p */
    public boolean f13856p;

    /* renamed from: q */
    public boolean f13857q;

    /* renamed from: r */
    public boolean f13858r;

    /* renamed from: s */
    public final x0 f13859s;

    public ViewOnTouchListenerC2530e(x0 x0Var) {
        C2526a c2526a = new C2526a();
        c2526a.f13837e = Long.MIN_VALUE;
        c2526a.f13839g = -1L;
        c2526a.f13838f = 0L;
        this.f13843a = c2526a;
        this.f13844b = new AccelerateInterpolator();
        float[] fArr = {DefinitionKt.NO_Float_VALUE, DefinitionKt.NO_Float_VALUE};
        this.f13847e = fArr;
        float[] fArr2 = {Float.MAX_VALUE, Float.MAX_VALUE};
        this.f13848f = fArr2;
        float[] fArr3 = {DefinitionKt.NO_Float_VALUE, DefinitionKt.NO_Float_VALUE};
        this.f13851j = fArr3;
        float[] fArr4 = {DefinitionKt.NO_Float_VALUE, DefinitionKt.NO_Float_VALUE};
        this.f13852k = fArr4;
        float[] fArr5 = {Float.MAX_VALUE, Float.MAX_VALUE};
        this.f13853l = fArr5;
        this.f13845c = x0Var;
        float f6 = Resources.getSystem().getDisplayMetrics().density;
        float f10 = ((int) ((1575.0f * f6) + 0.5f)) / 1000.0f;
        fArr5[0] = f10;
        fArr5[1] = f10;
        float f11 = ((int) ((f6 * 315.0f) + 0.5f)) / 1000.0f;
        fArr4[0] = f11;
        fArr4[1] = f11;
        this.f13849g = 1;
        fArr2[0] = Float.MAX_VALUE;
        fArr2[1] = Float.MAX_VALUE;
        fArr[0] = 0.2f;
        fArr[1] = 0.2f;
        fArr3[0] = 0.001f;
        fArr3[1] = 0.001f;
        this.f13850h = f13842t;
        c2526a.f13833a = 500;
        c2526a.f13834b = 500;
        this.f13859s = x0Var;
    }

    /* renamed from: b */
    public static float m6555b(float f6, float f10, float f11) {
        return f6 > f11 ? f11 : f6 < f10 ? f10 : f6;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x003b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:13:0x003c  */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final float m6556a(float r4, float r5, float r6, int r7) {
        /*
            r3 = this;
            float[] r0 = r3.f13847e
            r0 = r0[r7]
            float[] r1 = r3.f13848f
            r1 = r1[r7]
            float r0 = r0 * r5
            r2 = 0
            float r0 = m6555b(r0, r2, r1)
            float r1 = r3.m6557c(r4, r0)
            float r5 = r5 - r4
            float r4 = r3.m6557c(r5, r0)
            float r4 = r4 - r1
            int r5 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            android.view.animation.AccelerateInterpolator r0 = r3.f13844b
            if (r5 >= 0) goto L25
            float r4 = -r4
            float r4 = r0.getInterpolation(r4)
            float r4 = -r4
            goto L2d
        L25:
            int r5 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r5 <= 0) goto L36
            float r4 = r0.getInterpolation(r4)
        L2d:
            r5 = -1082130432(0xffffffffbf800000, float:-1.0)
            r0 = 1065353216(0x3f800000, float:1.0)
            float r4 = m6555b(r4, r5, r0)
            goto L37
        L36:
            r4 = r2
        L37:
            int r5 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r5 != 0) goto L3c
            return r2
        L3c:
            float[] r0 = r3.f13851j
            r0 = r0[r7]
            float[] r1 = r3.f13852k
            r1 = r1[r7]
            float[] r2 = r3.f13853l
            r7 = r2[r7]
            float r0 = r0 * r6
            if (r5 <= 0) goto L51
            float r4 = r4 * r0
            float r4 = m6555b(r4, r1, r7)
            return r4
        L51:
            float r4 = -r4
            float r4 = r4 * r0
            float r4 = m6555b(r4, r1, r7)
            float r4 = -r4
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: g6.ViewOnTouchListenerC2530e.m6556a(float, float, float, int):float");
    }

    /* renamed from: c */
    public final float m6557c(float f6, float f10) {
        if (f10 != DefinitionKt.NO_Float_VALUE) {
            int i10 = this.f13849g;
            if (i10 == 0 || i10 == 1) {
                if (f6 < f10) {
                    if (f6 >= DefinitionKt.NO_Float_VALUE) {
                        return 1.0f - (f6 / f10);
                    }
                    if (this.f13857q && i10 == 1) {
                        return 1.0f;
                    }
                }
            } else if (i10 == 2 && f6 < DefinitionKt.NO_Float_VALUE) {
                return f6 / (-f10);
            }
        }
        return DefinitionKt.NO_Float_VALUE;
    }

    /* renamed from: d */
    public final void m6558d() {
        int i10 = 0;
        if (this.f13855n) {
            this.f13857q = false;
            return;
        }
        long jCurrentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
        C2526a c2526a = this.f13843a;
        int i11 = (int) (jCurrentAnimationTimeMillis - c2526a.f13837e);
        int i12 = c2526a.f13834b;
        if (i11 > i12) {
            i10 = i12;
        } else if (i11 >= 0) {
            i10 = i11;
        }
        c2526a.f13841i = i10;
        c2526a.f13840h = c2526a.m6550a(jCurrentAnimationTimeMillis);
        c2526a.f13839g = jCurrentAnimationTimeMillis;
    }

    /* renamed from: e */
    public final boolean m6559e() {
        x0 x0Var;
        int count;
        C2526a c2526a = this.f13843a;
        float f6 = c2526a.f13836d;
        int iAbs = (int) (f6 / Math.abs(f6));
        Math.abs(c2526a.f13835c);
        if (iAbs != 0 && (count = (x0Var = this.f13859s).getCount()) != 0) {
            int childCount = x0Var.getChildCount();
            int firstVisiblePosition = x0Var.getFirstVisiblePosition();
            int i10 = firstVisiblePosition + childCount;
            if (iAbs <= 0 ? !(iAbs >= 0 || (firstVisiblePosition <= 0 && x0Var.getChildAt(0).getTop() >= 0)) : !(i10 >= count && x0Var.getChildAt(childCount - 1).getBottom() <= x0Var.getHeight())) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0014, code lost:
    
        if (r0 != 3) goto L30;
     */
    @Override // android.view.View.OnTouchListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onTouch(android.view.View r8, android.view.MotionEvent r9) {
        /*
            r7 = this;
            boolean r0 = r7.f13858r
            r1 = 0
            if (r0 != 0) goto L7
            goto L7c
        L7:
            int r0 = r9.getActionMasked()
            r2 = 1
            if (r0 == 0) goto L1b
            if (r0 == r2) goto L17
            r3 = 2
            if (r0 == r3) goto L1f
            r8 = 3
            if (r0 == r8) goto L17
            goto L7c
        L17:
            r7.m6558d()
            return r1
        L1b:
            r7.f13856p = r2
            r7.f13854m = r1
        L1f:
            float r0 = r9.getX()
            int r3 = r8.getWidth()
            float r3 = (float) r3
            o.x0 r4 = r7.f13845c
            int r5 = r4.getWidth()
            float r5 = (float) r5
            float r0 = r7.m6556a(r0, r3, r5, r1)
            float r9 = r9.getY()
            int r8 = r8.getHeight()
            float r8 = (float) r8
            int r3 = r4.getHeight()
            float r3 = (float) r3
            float r8 = r7.m6556a(r9, r8, r3, r2)
            g6.a r9 = r7.f13843a
            r9.f13835c = r0
            r9.f13836d = r8
            boolean r8 = r7.f13857q
            if (r8 != 0) goto L7c
            boolean r8 = r7.m6559e()
            if (r8 == 0) goto L7c
            bk.n r8 = r7.f13846d
            if (r8 != 0) goto L60
            bk.n r8 = new bk.n
            r8.<init>(r2, r7)
            r7.f13846d = r8
        L60:
            r7.f13857q = r2
            r7.f13855n = r2
            boolean r8 = r7.f13854m
            if (r8 != 0) goto L75
            int r8 = r7.f13850h
            if (r8 <= 0) goto L75
            bk.n r9 = r7.f13846d
            long r5 = (long) r8
            java.lang.reflect.Field r8 = c6.v0.f5527a
            r4.postOnAnimationDelayed(r9, r5)
            goto L7a
        L75:
            bk.n r8 = r7.f13846d
            r8.run()
        L7a:
            r7.f13854m = r2
        L7c:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: g6.ViewOnTouchListenerC2530e.onTouch(android.view.View, android.view.MotionEvent):boolean");
    }
}
