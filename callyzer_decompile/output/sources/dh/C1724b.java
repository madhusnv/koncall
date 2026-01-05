package dh;

import android.view.View;
import android.view.ViewParent;
import c6.v0;
import com.google.android.material.behavior.SwipeDismissBehavior;
import com.skydoves.balloon.internals.DefinitionKt;
import hz.AbstractC3063b;
import java.lang.reflect.Field;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: dh.b */
/* loaded from: classes.dex */
public final class C1724b extends AbstractC3063b {

    /* renamed from: a */
    public int f8366a;

    /* renamed from: b */
    public int f8367b = -1;

    /* renamed from: c */
    public final /* synthetic */ SwipeDismissBehavior f8368c;

    public C1724b(SwipeDismissBehavior swipeDismissBehavior) {
        this.f8368c = swipeDismissBehavior;
    }

    @Override // hz.AbstractC3063b
    /* renamed from: d */
    public final int mo5419d(int i10, View view) {
        int width;
        int width2;
        int width3;
        Field field = v0.f5527a;
        boolean z6 = view.getLayoutDirection() == 1;
        int i11 = this.f8368c.f6729c;
        if (i11 == 0) {
            if (z6) {
                width = this.f8366a - view.getWidth();
                width2 = this.f8366a;
            } else {
                width = this.f8366a;
                width3 = view.getWidth();
                width2 = width3 + width;
            }
        } else if (i11 != 1) {
            width = this.f8366a - view.getWidth();
            width2 = view.getWidth() + this.f8366a;
        } else if (z6) {
            width = this.f8366a;
            width3 = view.getWidth();
            width2 = width3 + width;
        } else {
            width = this.f8366a - view.getWidth();
            width2 = this.f8366a;
        }
        return Math.min(Math.max(width, i10), width2);
    }

    @Override // hz.AbstractC3063b
    /* renamed from: e */
    public final int mo5420e(int i10, View view) {
        return view.getTop();
    }

    @Override // hz.AbstractC3063b
    /* renamed from: g */
    public final int mo5421g(View view) {
        return view.getWidth();
    }

    @Override // hz.AbstractC3063b
    /* renamed from: i */
    public final void mo5422i(int i10, View view) {
        this.f8367b = i10;
        this.f8366a = view.getLeft();
        ViewParent parent = view.getParent();
        if (parent != null) {
            parent.requestDisallowInterceptTouchEvent(true);
        }
    }

    @Override // hz.AbstractC3063b
    /* renamed from: k */
    public final void mo5424k(View view, int i10, int i11) {
        float f6 = this.f8366a;
        float width = view.getWidth();
        SwipeDismissBehavior swipeDismissBehavior = this.f8368c;
        float f10 = (width * swipeDismissBehavior.f6730d) + f6;
        float width2 = (view.getWidth() * swipeDismissBehavior.f6731e) + this.f8366a;
        float f11 = i10;
        if (f11 <= f10) {
            view.setAlpha(1.0f);
        } else if (f11 >= width2) {
            view.setAlpha(DefinitionKt.NO_Float_VALUE);
        } else {
            view.setAlpha(Math.min(Math.max(DefinitionKt.NO_Float_VALUE, 1.0f - ((f11 - f10) / (width2 - f10))), 1.0f));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x005f  */
    @Override // hz.AbstractC3063b
    /* renamed from: l */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void mo5425l(android.view.View r9, float r10, float r11) {
        /*
            r8 = this;
            r11 = -1
            r8.f8367b = r11
            int r11 = r9.getWidth()
            r0 = 0
            int r1 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
            r2 = 0
            com.google.android.material.behavior.SwipeDismissBehavior r3 = r8.f8368c
            r4 = 1
            if (r1 == 0) goto L39
            java.lang.reflect.Field r5 = c6.v0.f5527a
            int r5 = r9.getLayoutDirection()
            if (r5 != r4) goto L1a
            r5 = r4
            goto L1b
        L1a:
            r5 = r2
        L1b:
            int r6 = r3.f6729c
            r7 = 2
            if (r6 != r7) goto L21
            goto L52
        L21:
            if (r6 != 0) goto L2d
            if (r5 == 0) goto L2a
            int r10 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
            if (r10 >= 0) goto L5f
            goto L52
        L2a:
            if (r1 <= 0) goto L5f
            goto L52
        L2d:
            if (r6 != r4) goto L5f
            if (r5 == 0) goto L34
            if (r1 <= 0) goto L5f
            goto L52
        L34:
            int r10 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
            if (r10 >= 0) goto L5f
            goto L52
        L39:
            int r10 = r9.getLeft()
            int r0 = r8.f8366a
            int r10 = r10 - r0
            int r0 = r9.getWidth()
            float r0 = (float) r0
            r1 = 1056964608(0x3f000000, float:0.5)
            float r0 = r0 * r1
            int r0 = java.lang.Math.round(r0)
            int r10 = java.lang.Math.abs(r10)
            if (r10 < r0) goto L5f
        L52:
            int r10 = r9.getLeft()
            int r0 = r8.f8366a
            if (r10 >= r0) goto L5c
            int r0 = r0 - r11
            goto L5d
        L5c:
            int r0 = r0 + r11
        L5d:
            r2 = r4
            goto L61
        L5f:
            int r0 = r8.f8366a
        L61:
            m6.e r10 = r3.f6727a
            int r11 = r9.getTop()
            boolean r10 = r10.m9568n(r0, r11)
            if (r10 == 0) goto L77
            zh.c r10 = new zh.c
            r10.<init>(r3, r9, r2)
            java.lang.reflect.Field r11 = c6.v0.f5527a
            r9.postOnAnimation(r10)
        L77:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: dh.C1724b.mo5425l(android.view.View, float, float):void");
    }

    @Override // hz.AbstractC3063b
    /* renamed from: m */
    public final boolean mo5426m(int i10, View view) {
        int i11 = this.f8367b;
        return (i11 == -1 || i11 == i10) && this.f8368c.mo4048r(view);
    }

    @Override // hz.AbstractC3063b
    /* renamed from: j */
    public final void mo5423j(int i10) {
    }
}
