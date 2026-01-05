package androidx.transition;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.PointF;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import androidx.transition.Transition;
import java.util.Map;
import p001o.dzh;
import p001o.f6c;
import p001o.g8e;
import p001o.kag;
import p001o.mwi;
import p001o.ofe;
import p001o.svh;
import p001o.zzi;

/* loaded from: classes2.dex */
public class ChangeBounds extends Transition {
    public static final String[] F0 = {"android:changeBounds:bounds", "android:changeBounds:clip", "android:changeBounds:parent", "android:changeBounds:windowX", "android:changeBounds:windowY"};
    public static final Property G0 = new C2476a(PointF.class, "topLeft");
    public static final Property H0 = new C2477b(PointF.class, "bottomRight");
    public static final Property I0 = new C2478c(PointF.class, "bottomRight");
    public static final Property J0 = new C2479d(PointF.class, "topLeft");
    public static final Property K0 = new C2480e(PointF.class, "position");
    public static final ofe L0 = new ofe();
    public boolean E0;

    /* renamed from: androidx.transition.ChangeBounds$a */
    public class C2476a extends Property {
        public C2476a(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public PointF get(C2484i c2484i) {
            return null;
        }

        @Override // android.util.Property
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void set(C2484i c2484i, PointF pointF) {
            c2484i.m9827c(pointF);
        }
    }

    /* renamed from: androidx.transition.ChangeBounds$b */
    public class C2477b extends Property {
        public C2477b(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public PointF get(C2484i c2484i) {
            return null;
        }

        @Override // android.util.Property
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void set(C2484i c2484i, PointF pointF) {
            c2484i.m9825a(pointF);
        }
    }

    /* renamed from: androidx.transition.ChangeBounds$c */
    public class C2478c extends Property {
        public C2478c(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public PointF get(View view) {
            return null;
        }

        @Override // android.util.Property
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void set(View view, PointF pointF) {
            zzi.m60172e(view, view.getLeft(), view.getTop(), Math.round(pointF.x), Math.round(pointF.y));
        }
    }

    /* renamed from: androidx.transition.ChangeBounds$d */
    public class C2479d extends Property {
        public C2479d(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public PointF get(View view) {
            return null;
        }

        @Override // android.util.Property
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void set(View view, PointF pointF) {
            zzi.m60172e(view, Math.round(pointF.x), Math.round(pointF.y), view.getRight(), view.getBottom());
        }
    }

    /* renamed from: androidx.transition.ChangeBounds$e */
    public class C2480e extends Property {
        public C2480e(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public PointF get(View view) {
            return null;
        }

        @Override // android.util.Property
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void set(View view, PointF pointF) {
            int iRound = Math.round(pointF.x);
            int iRound2 = Math.round(pointF.y);
            zzi.m60172e(view, iRound, iRound2, view.getWidth() + iRound, view.getHeight() + iRound2);
        }
    }

    /* renamed from: androidx.transition.ChangeBounds$f */
    public class C2481f extends AnimatorListenerAdapter {

        /* renamed from: a */
        public final /* synthetic */ C2484i f10284a;
        private final C2484i mViewBounds;

        public C2481f(C2484i c2484i) {
            this.f10284a = c2484i;
            this.mViewBounds = c2484i;
        }
    }

    /* renamed from: androidx.transition.ChangeBounds$g */
    public static class C2482g extends AnimatorListenerAdapter implements Transition.InterfaceC2514i {

        /* renamed from: a */
        public final View f10286a;

        /* renamed from: b */
        public final Rect f10287b;

        /* renamed from: c */
        public final boolean f10288c;

        /* renamed from: d */
        public final Rect f10289d;

        /* renamed from: e */
        public final boolean f10290e;

        /* renamed from: f */
        public final int f10291f;

        /* renamed from: g */
        public final int f10292g;

        /* renamed from: h */
        public final int f10293h;

        /* renamed from: i */
        public final int f10294i;

        /* renamed from: j */
        public final int f10295j;

        /* renamed from: k */
        public final int f10296k;

        /* renamed from: l */
        public final int f10297l;

        /* renamed from: m */
        public final int f10298m;

        /* renamed from: n */
        public boolean f10299n;

        public C2482g(View view, Rect rect, boolean z, Rect rect2, boolean z2, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
            this.f10286a = view;
            this.f10287b = rect;
            this.f10288c = z;
            this.f10289d = rect2;
            this.f10290e = z2;
            this.f10291f = i;
            this.f10292g = i2;
            this.f10293h = i3;
            this.f10294i = i4;
            this.f10295j = i5;
            this.f10296k = i6;
            this.f10297l = i7;
            this.f10298m = i8;
        }

        @Override // androidx.transition.Transition.InterfaceC2514i
        /* renamed from: b */
        public void mo9820b(Transition transition) {
            Rect rect = (Rect) this.f10286a.getTag(g8e.transition_clip);
            this.f10286a.setTag(g8e.transition_clip, null);
            this.f10286a.setClipBounds(rect);
        }

        @Override // androidx.transition.Transition.InterfaceC2514i
        /* renamed from: d */
        public void mo9821d(Transition transition) {
        }

        @Override // androidx.transition.Transition.InterfaceC2514i
        /* renamed from: e */
        public void mo9822e(Transition transition) {
            this.f10286a.setTag(g8e.transition_clip, this.f10286a.getClipBounds());
            this.f10286a.setClipBounds(this.f10290e ? null : this.f10289d);
        }

        @Override // androidx.transition.Transition.InterfaceC2514i
        /* renamed from: h */
        public void mo9823h(Transition transition) {
        }

        @Override // androidx.transition.Transition.InterfaceC2514i
        /* renamed from: j */
        public void mo9824j(Transition transition) {
            this.f10299n = true;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            onAnimationEnd(animator, false);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            onAnimationStart(animator, false);
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator, boolean z) {
            if (this.f10299n) {
                return;
            }
            Rect rect = null;
            if (z) {
                if (!this.f10288c) {
                    rect = this.f10287b;
                }
            } else if (!this.f10290e) {
                rect = this.f10289d;
            }
            this.f10286a.setClipBounds(rect);
            if (z) {
                zzi.m60172e(this.f10286a, this.f10291f, this.f10292g, this.f10293h, this.f10294i);
            } else {
                zzi.m60172e(this.f10286a, this.f10295j, this.f10296k, this.f10297l, this.f10298m);
            }
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator, boolean z) {
            int iMax = Math.max(this.f10293h - this.f10291f, this.f10297l - this.f10295j);
            int iMax2 = Math.max(this.f10294i - this.f10292g, this.f10298m - this.f10296k);
            int i = z ? this.f10295j : this.f10291f;
            int i2 = z ? this.f10296k : this.f10292g;
            zzi.m60172e(this.f10286a, i, i2, iMax + i, iMax2 + i2);
            this.f10286a.setClipBounds(z ? this.f10289d : this.f10287b);
        }
    }

    /* renamed from: androidx.transition.ChangeBounds$h */
    public static class C2483h extends AbstractC2523b {

        /* renamed from: a */
        public boolean f10300a = false;

        /* renamed from: b */
        public final ViewGroup f10301b;

        public C2483h(ViewGroup viewGroup) {
            this.f10301b = viewGroup;
        }

        @Override // androidx.transition.AbstractC2523b, androidx.transition.Transition.InterfaceC2514i
        /* renamed from: b */
        public void mo9820b(Transition transition) {
            mwi.m39750c(this.f10301b, true);
        }

        @Override // androidx.transition.AbstractC2523b, androidx.transition.Transition.InterfaceC2514i
        /* renamed from: e */
        public void mo9822e(Transition transition) {
            mwi.m39750c(this.f10301b, false);
        }

        @Override // androidx.transition.AbstractC2523b, androidx.transition.Transition.InterfaceC2514i
        /* renamed from: h */
        public void mo9823h(Transition transition) {
            if (!this.f10300a) {
                mwi.m39750c(this.f10301b, false);
            }
            transition.n0(this);
        }

        @Override // androidx.transition.AbstractC2523b, androidx.transition.Transition.InterfaceC2514i
        /* renamed from: j */
        public void mo9824j(Transition transition) {
            mwi.m39750c(this.f10301b, false);
            this.f10300a = true;
        }
    }

    /* renamed from: androidx.transition.ChangeBounds$i */
    public static class C2484i {

        /* renamed from: a */
        public int f10302a;

        /* renamed from: b */
        public int f10303b;

        /* renamed from: c */
        public int f10304c;

        /* renamed from: d */
        public int f10305d;

        /* renamed from: e */
        public final View f10306e;

        /* renamed from: f */
        public int f10307f;

        /* renamed from: g */
        public int f10308g;

        public C2484i(View view) {
            this.f10306e = view;
        }

        /* renamed from: a */
        public void m9825a(PointF pointF) {
            this.f10304c = Math.round(pointF.x);
            this.f10305d = Math.round(pointF.y);
            int i = this.f10308g + 1;
            this.f10308g = i;
            if (this.f10307f == i) {
                m9826b();
            }
        }

        /* renamed from: b */
        public final void m9826b() {
            zzi.m60172e(this.f10306e, this.f10302a, this.f10303b, this.f10304c, this.f10305d);
            this.f10307f = 0;
            this.f10308g = 0;
        }

        /* renamed from: c */
        public void m9827c(PointF pointF) {
            this.f10302a = Math.round(pointF.x);
            this.f10303b = Math.round(pointF.y);
            int i = this.f10307f + 1;
            this.f10307f = i;
            if (i == this.f10308g) {
                m9826b();
            }
        }
    }

    public ChangeBounds() {
        this.E0 = false;
    }

    public final void I0(svh svhVar) {
        View view = svhVar.f46009b;
        if (!view.isLaidOut() && view.getWidth() == 0 && view.getHeight() == 0) {
            return;
        }
        svhVar.f46008a.put("android:changeBounds:bounds", new Rect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom()));
        svhVar.f46008a.put("android:changeBounds:parent", svhVar.f46009b.getParent());
        if (this.E0) {
            svhVar.f46008a.put("android:changeBounds:clip", view.getClipBounds());
        }
    }

    public void J0(boolean z) {
        this.E0 = z;
    }

    @Override // androidx.transition.Transition
    /* renamed from: R */
    public String[] mo9805R() {
        return F0;
    }

    @Override // androidx.transition.Transition
    /* renamed from: U */
    public boolean mo9806U() {
        return true;
    }

    @Override // androidx.transition.Transition
    /* renamed from: k */
    public void mo9807k(svh svhVar) {
        I0(svhVar);
    }

    @Override // androidx.transition.Transition
    /* renamed from: n */
    public void mo9808n(svh svhVar) {
        Rect rect;
        I0(svhVar);
        if (!this.E0 || (rect = (Rect) svhVar.f46009b.getTag(g8e.transition_clip)) == null) {
            return;
        }
        svhVar.f46008a.put("android:changeBounds:clip", rect);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.transition.Transition
    /* renamed from: t */
    public Animator mo9809t(ViewGroup viewGroup, svh svhVar, svh svhVar2) {
        int i;
        int i2;
        int i3;
        int i4;
        ObjectAnimator objectAnimatorM26209a;
        int i5;
        View view;
        ObjectAnimator objectAnimatorOfObject;
        Animator animatorM9956c;
        if (svhVar == null || svhVar2 == null) {
            return null;
        }
        Map map = svhVar.f46008a;
        Map map2 = svhVar2.f46008a;
        ViewGroup viewGroup2 = (ViewGroup) map.get("android:changeBounds:parent");
        ViewGroup viewGroup3 = (ViewGroup) map2.get("android:changeBounds:parent");
        if (viewGroup2 == null || viewGroup3 == null) {
            return null;
        }
        View view2 = svhVar2.f46009b;
        Rect rect = (Rect) svhVar.f46008a.get("android:changeBounds:bounds");
        Rect rect2 = (Rect) svhVar2.f46008a.get("android:changeBounds:bounds");
        int i6 = rect.left;
        int i7 = rect2.left;
        int i8 = rect.top;
        int i9 = rect2.top;
        int i10 = rect.right;
        int i11 = rect2.right;
        int i12 = rect.bottom;
        int i13 = rect2.bottom;
        int i14 = i10 - i6;
        int i15 = i12 - i8;
        int i16 = i11 - i7;
        int i17 = i13 - i9;
        Rect rect3 = (Rect) svhVar.f46008a.get("android:changeBounds:clip");
        Rect rect4 = (Rect) svhVar2.f46008a.get("android:changeBounds:clip");
        if ((i14 == 0 || i15 == 0) && (i16 == 0 || i17 == 0)) {
            i = 0;
        } else {
            i = (i6 == i7 && i8 == i9) ? 0 : 1;
            if (i10 != i11 || i12 != i13) {
                i++;
            }
        }
        if ((rect3 != null && !rect3.equals(rect4)) || (rect3 == null && rect4 != null)) {
            i++;
        }
        int i18 = i;
        if (i18 <= 0) {
            return null;
        }
        if (this.E0) {
            zzi.m60172e(view2, i6, i8, Math.max(i14, i16) + i6, i8 + Math.max(i15, i17));
            if (i6 == i7 && i8 == i9) {
                i2 = i11;
                i3 = i10;
                i4 = i7;
                objectAnimatorM26209a = null;
            } else {
                i2 = i11;
                i3 = i10;
                i4 = i7;
                objectAnimatorM26209a = f6c.m26209a(view2, K0, m9862H().mo9801a(i6, i8, i7, i9));
            }
            boolean z = rect3 == null;
            if (z) {
                i5 = 0;
                rect3 = new Rect(0, 0, i14, i15);
            } else {
                i5 = 0;
            }
            boolean z2 = rect4 == null ? 1 : i5;
            Rect rect5 = z2 != 0 ? new Rect(i5, i5, i16, i17) : rect4;
            if (rect3.equals(rect5)) {
                view = view2;
                objectAnimatorOfObject = null;
            } else {
                view2.setClipBounds(rect3);
                objectAnimatorOfObject = ObjectAnimator.ofObject(view2, "clipBounds", L0, rect3, rect5);
                int i19 = i4;
                view = view2;
                C2482g c2482g = new C2482g(view2, rect3, z, rect5, z2, i6, i8, i3, i12, i19, i9, i2, i13);
                objectAnimatorOfObject.addListener(c2482g);
                mo9876c(c2482g);
            }
            animatorM9956c = AbstractC2525d.m9956c(objectAnimatorM26209a, objectAnimatorOfObject);
        } else {
            zzi.m60172e(view2, i6, i8, i10, i12);
            if (i18 != 2) {
                animatorM9956c = (i6 == i7 && i8 == i9) ? f6c.m26209a(view2, I0, m9862H().mo9801a(i10, i12, i11, i13)) : f6c.m26209a(view2, J0, m9862H().mo9801a(i6, i8, i7, i9));
            } else if (i14 == i16 && i15 == i17) {
                animatorM9956c = f6c.m26209a(view2, K0, m9862H().mo9801a(i6, i8, i7, i9));
            } else {
                C2484i c2484i = new C2484i(view2);
                ObjectAnimator objectAnimatorM26209a2 = f6c.m26209a(c2484i, G0, m9862H().mo9801a(i6, i8, i7, i9));
                ObjectAnimator objectAnimatorM26209a3 = f6c.m26209a(c2484i, H0, m9862H().mo9801a(i10, i12, i11, i13));
                AnimatorSet animatorSet = new AnimatorSet();
                animatorSet.playTogether(objectAnimatorM26209a2, objectAnimatorM26209a3);
                animatorSet.addListener(new C2481f(c2484i));
                view = view2;
                animatorM9956c = animatorSet;
            }
            view = view2;
        }
        if (view.getParent() instanceof ViewGroup) {
            ViewGroup viewGroup4 = (ViewGroup) view.getParent();
            mwi.m39750c(viewGroup4, true);
            m9864J().mo9876c(new C2483h(viewGroup4));
        }
        return animatorM9956c;
    }

    public ChangeBounds(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.E0 = false;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, kag.f31774d);
        boolean zM23972a = dzh.m23972a(typedArrayObtainStyledAttributes, (XmlResourceParser) attributeSet, "resizeClip", 0, false);
        typedArrayObtainStyledAttributes.recycle();
        J0(zM23972a);
    }
}
