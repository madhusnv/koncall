package androidx.transition;

import android.animation.Animator;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import org.xmlpull.v1.XmlPullParser;
import p001o.drf;
import p001o.dzh;
import p001o.kag;
import p001o.svh;

/* loaded from: classes2.dex */
public class Slide extends Visibility {
    public static final TimeInterpolator I0 = new DecelerateInterpolator();
    public static final TimeInterpolator J0 = new AccelerateInterpolator();
    public static final InterfaceC2503g K0 = new C2497a();
    public static final InterfaceC2503g L0 = new C2498b();
    public static final InterfaceC2503g M0 = new C2499c();
    public static final InterfaceC2503g N0 = new C2500d();
    public static final InterfaceC2503g O0 = new C2501e();
    public static final InterfaceC2503g P0 = new C2502f();
    public InterfaceC2503g G0;
    public int H0;

    /* renamed from: androidx.transition.Slide$a */
    public class C2497a extends AbstractC2504h {
        public C2497a() {
            super(null);
        }

        @Override // androidx.transition.Slide.InterfaceC2503g
        /* renamed from: b */
        public float mo9846b(ViewGroup viewGroup, View view) {
            return view.getTranslationX() - viewGroup.getWidth();
        }
    }

    /* renamed from: androidx.transition.Slide$b */
    public class C2498b extends AbstractC2504h {
        public C2498b() {
            super(null);
        }

        @Override // androidx.transition.Slide.InterfaceC2503g
        /* renamed from: b */
        public float mo9846b(ViewGroup viewGroup, View view) {
            return viewGroup.getLayoutDirection() == 1 ? view.getTranslationX() + viewGroup.getWidth() : view.getTranslationX() - viewGroup.getWidth();
        }
    }

    /* renamed from: androidx.transition.Slide$c */
    public class C2499c extends AbstractC2505i {
        public C2499c() {
            super(null);
        }

        @Override // androidx.transition.Slide.InterfaceC2503g
        /* renamed from: a */
        public float mo9847a(ViewGroup viewGroup, View view) {
            return view.getTranslationY() - viewGroup.getHeight();
        }
    }

    /* renamed from: androidx.transition.Slide$d */
    public class C2500d extends AbstractC2504h {
        public C2500d() {
            super(null);
        }

        @Override // androidx.transition.Slide.InterfaceC2503g
        /* renamed from: b */
        public float mo9846b(ViewGroup viewGroup, View view) {
            return view.getTranslationX() + viewGroup.getWidth();
        }
    }

    /* renamed from: androidx.transition.Slide$e */
    public class C2501e extends AbstractC2504h {
        public C2501e() {
            super(null);
        }

        @Override // androidx.transition.Slide.InterfaceC2503g
        /* renamed from: b */
        public float mo9846b(ViewGroup viewGroup, View view) {
            return viewGroup.getLayoutDirection() == 1 ? view.getTranslationX() - viewGroup.getWidth() : view.getTranslationX() + viewGroup.getWidth();
        }
    }

    /* renamed from: androidx.transition.Slide$f */
    public class C2502f extends AbstractC2505i {
        public C2502f() {
            super(null);
        }

        @Override // androidx.transition.Slide.InterfaceC2503g
        /* renamed from: a */
        public float mo9847a(ViewGroup viewGroup, View view) {
            return view.getTranslationY() + viewGroup.getHeight();
        }
    }

    /* renamed from: androidx.transition.Slide$g */
    public interface InterfaceC2503g {
        /* renamed from: a */
        float mo9847a(ViewGroup viewGroup, View view);

        /* renamed from: b */
        float mo9846b(ViewGroup viewGroup, View view);
    }

    /* renamed from: androidx.transition.Slide$h */
    public static abstract class AbstractC2504h implements InterfaceC2503g {
        public AbstractC2504h() {
        }

        public /* synthetic */ AbstractC2504h(C2497a c2497a) {
            this();
        }

        @Override // androidx.transition.Slide.InterfaceC2503g
        /* renamed from: a */
        public float mo9847a(ViewGroup viewGroup, View view) {
            return view.getTranslationY();
        }
    }

    /* renamed from: androidx.transition.Slide$i */
    public static abstract class AbstractC2505i implements InterfaceC2503g {
        public AbstractC2505i() {
        }

        public /* synthetic */ AbstractC2505i(C2497a c2497a) {
            this();
        }

        @Override // androidx.transition.Slide.InterfaceC2503g
        /* renamed from: b */
        public float mo9846b(ViewGroup viewGroup, View view) {
            return view.getTranslationX();
        }
    }

    public Slide(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.G0 = P0;
        this.H0 = 80;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, kag.f31778h);
        int iM23978g = dzh.m23978g(typedArrayObtainStyledAttributes, (XmlPullParser) attributeSet, "slideEdge", 0, 80);
        typedArrayObtainStyledAttributes.recycle();
        S0(iM23978g);
    }

    private void I0(svh svhVar) {
        int[] iArr = new int[2];
        svhVar.f46009b.getLocationOnScreen(iArr);
        svhVar.f46008a.put("android:slide:screenPosition", iArr);
    }

    @Override // androidx.transition.Visibility
    public Animator M0(ViewGroup viewGroup, View view, svh svhVar, svh svhVar2) {
        if (svhVar2 == null) {
            return null;
        }
        int[] iArr = (int[]) svhVar2.f46008a.get("android:slide:screenPosition");
        float translationX = view.getTranslationX();
        float translationY = view.getTranslationY();
        return AbstractC2526e.m9959a(view, svhVar2, iArr[0], iArr[1], this.G0.mo9846b(viewGroup, view), this.G0.mo9847a(viewGroup, view), translationX, translationY, I0, this);
    }

    @Override // androidx.transition.Visibility
    public Animator O0(ViewGroup viewGroup, View view, svh svhVar, svh svhVar2) {
        if (svhVar == null) {
            return null;
        }
        int[] iArr = (int[]) svhVar.f46008a.get("android:slide:screenPosition");
        return AbstractC2526e.m9959a(view, svhVar, iArr[0], iArr[1], view.getTranslationX(), view.getTranslationY(), this.G0.mo9846b(viewGroup, view), this.G0.mo9847a(viewGroup, view), J0, this);
    }

    public void S0(int i) {
        if (i == 3) {
            this.G0 = K0;
        } else if (i == 5) {
            this.G0 = N0;
        } else if (i == 48) {
            this.G0 = M0;
        } else if (i == 80) {
            this.G0 = P0;
        } else if (i == 8388611) {
            this.G0 = L0;
        } else {
            if (i != 8388613) {
                throw new IllegalArgumentException("Invalid slide direction");
            }
            this.G0 = O0;
        }
        this.H0 = i;
        drf drfVar = new drf();
        drfVar.m23709j(i);
        C0(drfVar);
    }

    @Override // androidx.transition.Transition
    /* renamed from: U */
    public boolean mo9806U() {
        return true;
    }

    @Override // androidx.transition.Visibility, androidx.transition.Transition
    /* renamed from: k */
    public void mo9807k(svh svhVar) {
        super.mo9807k(svhVar);
        I0(svhVar);
    }

    @Override // androidx.transition.Visibility, androidx.transition.Transition
    /* renamed from: n */
    public void mo9808n(svh svhVar) {
        super.mo9808n(svhVar);
        I0(svhVar);
    }
}
