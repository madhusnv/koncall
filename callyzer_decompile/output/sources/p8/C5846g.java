package p8;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.TypeConverter;
import android.graphics.PointF;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import b9.AbstractC0630b;
import c6.v0;
import java.lang.reflect.Field;
import java.util.HashMap;
import ng.C5070u;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: p8.g */
/* loaded from: classes.dex */
public final class C5846g extends AbstractC5857r {

    /* renamed from: B */
    public static final C5842c f28576B;

    /* renamed from: C */
    public static final C5842c f28577C;

    /* renamed from: D */
    public static final C5842c f28578D;

    /* renamed from: E */
    public static final C5842c f28579E;

    /* renamed from: y */
    public static final String[] f28580y = {"android:changeBounds:bounds", "android:changeBounds:clip", "android:changeBounds:parent", "android:changeBounds:windowX", "android:changeBounds:windowY"};

    /* renamed from: z */
    public static final C5842c f28581z;

    static {
        new C5841b(PointF.class, "boundsOrigin").f28545a = new Rect();
        f28581z = new C5842c(PointF.class, "topLeft", 0);
        f28576B = new C5842c(PointF.class, "bottomRight", 1);
        f28577C = new C5842c(PointF.class, "bottomRight", 2);
        f28578D = new C5842c(PointF.class, "topLeft", 3);
        f28579E = new C5842c(PointF.class, "position", 4);
    }

    /* renamed from: J */
    public static void m11426J(C5864y c5864y) {
        View view = c5864y.f28641b;
        HashMap map = c5864y.f28640a;
        Field field = v0.f5527a;
        if (!view.isLaidOut() && view.getWidth() == 0 && view.getHeight() == 0) {
            return;
        }
        map.put("android:changeBounds:bounds", new Rect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom()));
        map.put("android:changeBounds:parent", view.getParent());
    }

    @Override // p8.AbstractC5857r
    /* renamed from: d */
    public final void mo11427d(C5864y c5864y) {
        m11426J(c5864y);
    }

    @Override // p8.AbstractC5857r
    /* renamed from: g */
    public final void mo11428g(C5864y c5864y) {
        m11426J(c5864y);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p8.AbstractC5857r
    /* renamed from: m */
    public final Animator mo11429m(ViewGroup viewGroup, C5864y c5864y, C5864y c5864y2) {
        int i10;
        C5846g c5846g;
        ObjectAnimator objectAnimatorOfObject;
        if (c5864y != null) {
            HashMap map = c5864y.f28640a;
            if (c5864y2 != null) {
                HashMap map2 = c5864y2.f28640a;
                ViewGroup viewGroup2 = (ViewGroup) map.get("android:changeBounds:parent");
                ViewGroup viewGroup3 = (ViewGroup) map2.get("android:changeBounds:parent");
                if (viewGroup2 != null && viewGroup3 != null) {
                    View view = c5864y2.f28641b;
                    Rect rect = (Rect) map.get("android:changeBounds:bounds");
                    Rect rect2 = (Rect) map2.get("android:changeBounds:bounds");
                    int i11 = rect.left;
                    int i12 = rect2.left;
                    int i13 = rect.top;
                    int i14 = rect2.top;
                    int i15 = rect.right;
                    int i16 = rect2.right;
                    int i17 = rect.bottom;
                    int i18 = rect2.bottom;
                    int i19 = i15 - i11;
                    int i20 = i17 - i13;
                    int i21 = i16 - i12;
                    int i22 = i18 - i14;
                    Rect rect3 = (Rect) map.get("android:changeBounds:clip");
                    Rect rect4 = (Rect) map2.get("android:changeBounds:clip");
                    if ((i19 == 0 || i20 == 0) && (i21 == 0 || i22 == 0)) {
                        i10 = 0;
                    } else {
                        i10 = (i11 == i12 && i13 == i14) ? 0 : 1;
                        if (i15 != i16 || i17 != i18) {
                            i10++;
                        }
                    }
                    if ((rect3 != null && !rect3.equals(rect4)) || (rect3 == null && rect4 != null)) {
                        i10++;
                    }
                    int i23 = i10;
                    if (i23 > 0) {
                        AbstractC5865z.m11467a(view, i11, i13, i15, i17);
                        if (i23 != 2) {
                            c5846g = this;
                            if (i11 == i12 && i13 == i14) {
                                c5846g.f28624t.getClass();
                                objectAnimatorOfObject = ObjectAnimator.ofObject(view, f28577C, (TypeConverter) null, C5070u.m10000j(i15, i17, i16, i18));
                            } else {
                                c5846g.f28624t.getClass();
                                objectAnimatorOfObject = ObjectAnimator.ofObject(view, f28578D, (TypeConverter) null, C5070u.m10000j(i11, i13, i12, i14));
                            }
                        } else if (i19 == i21 && i20 == i22) {
                            c5846g = this;
                            c5846g.f28624t.getClass();
                            objectAnimatorOfObject = ObjectAnimator.ofObject(view, f28579E, (TypeConverter) null, C5070u.m10000j(i11, i13, i12, i14));
                        } else {
                            c5846g = this;
                            C5845f c5845f = new C5845f();
                            c5845f.f28567e = view;
                            c5846g.f28624t.getClass();
                            ObjectAnimator objectAnimatorOfObject2 = ObjectAnimator.ofObject(c5845f, f28581z, (TypeConverter) null, C5070u.m10000j(i11, i13, i12, i14));
                            c5846g.f28624t.getClass();
                            ObjectAnimator objectAnimatorOfObject3 = ObjectAnimator.ofObject(c5845f, f28576B, (TypeConverter) null, C5070u.m10000j(i15, i17, i16, i18));
                            AnimatorSet animatorSet = new AnimatorSet();
                            animatorSet.playTogether(objectAnimatorOfObject2, objectAnimatorOfObject3);
                            animatorSet.addListener(new C5843d(c5845f));
                            objectAnimatorOfObject = animatorSet;
                        }
                        if (view.getParent() instanceof ViewGroup) {
                            ViewGroup viewGroup4 = (ViewGroup) view.getParent();
                            AbstractC0630b.m1806o(viewGroup4, true);
                            c5846g.m11448a(new C5844e(viewGroup4));
                        }
                        return objectAnimatorOfObject;
                    }
                }
            }
        }
        return null;
    }

    @Override // p8.AbstractC5857r
    /* renamed from: r */
    public final String[] mo11430r() {
        return f28580y;
    }
}
