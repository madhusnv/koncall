package androidx.transition;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Matrix;
import android.graphics.PointF;
import android.util.AttributeSet;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import java.lang.reflect.InvocationTargetException;
import org.xmlpull.v1.XmlPullParser;
import p001o.a37;
import p001o.cs7;
import p001o.dzh;
import p001o.g8e;
import p001o.gs7;
import p001o.kag;
import p001o.svh;
import p001o.twd;
import p001o.vza;
import p001o.wvi;
import p001o.zzi;

/* loaded from: classes2.dex */
public class ChangeTransform extends Transition {
    public static final String[] H0 = {"android:changeTransform:matrix", "android:changeTransform:transforms", "android:changeTransform:parentMatrix"};
    public static final Property I0 = new C2490a(float[].class, "nonTranslations");
    public static final Property J0 = new C2491b(PointF.class, "translations");
    public static final boolean K0 = true;
    public boolean E0;
    public boolean F0;
    public Matrix G0;

    /* renamed from: androidx.transition.ChangeTransform$a */
    public class C2490a extends Property {
        public C2490a(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public float[] get(C2494e c2494e) {
            return null;
        }

        @Override // android.util.Property
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void set(C2494e c2494e, float[] fArr) {
            c2494e.m9841d(fArr);
        }
    }

    /* renamed from: androidx.transition.ChangeTransform$b */
    public class C2491b extends Property {
        public C2491b(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public PointF get(C2494e c2494e) {
            return null;
        }

        @Override // android.util.Property
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void set(C2494e c2494e, PointF pointF) {
            c2494e.m9840c(pointF);
        }
    }

    /* renamed from: androidx.transition.ChangeTransform$c */
    public static class C2492c extends AbstractC2523b {

        /* renamed from: a */
        public View f10317a;

        /* renamed from: b */
        public cs7 f10318b;

        public C2492c(View view, cs7 cs7Var) {
            this.f10317a = view;
            this.f10318b = cs7Var;
        }

        @Override // androidx.transition.AbstractC2523b, androidx.transition.Transition.InterfaceC2514i
        /* renamed from: b */
        public void mo9820b(Transition transition) {
            this.f10318b.setVisibility(0);
        }

        @Override // androidx.transition.AbstractC2523b, androidx.transition.Transition.InterfaceC2514i
        /* renamed from: e */
        public void mo9822e(Transition transition) {
            this.f10318b.setVisibility(4);
        }

        @Override // androidx.transition.AbstractC2523b, androidx.transition.Transition.InterfaceC2514i
        /* renamed from: h */
        public void mo9823h(Transition transition) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
            transition.n0(this);
            gs7.m29446b(this.f10317a);
            this.f10317a.setTag(g8e.transition_transform, null);
            this.f10317a.setTag(g8e.parent_matrix, null);
        }
    }

    /* renamed from: androidx.transition.ChangeTransform$d */
    public static class C2493d extends AnimatorListenerAdapter {

        /* renamed from: a */
        public boolean f10319a;

        /* renamed from: b */
        public final Matrix f10320b = new Matrix();

        /* renamed from: c */
        public final boolean f10321c;

        /* renamed from: d */
        public final boolean f10322d;

        /* renamed from: e */
        public final View f10323e;

        /* renamed from: f */
        public final C2495f f10324f;

        /* renamed from: g */
        public final C2494e f10325g;

        /* renamed from: h */
        public final Matrix f10326h;

        public C2493d(View view, C2495f c2495f, C2494e c2494e, Matrix matrix, boolean z, boolean z2) {
            this.f10321c = z;
            this.f10322d = z2;
            this.f10323e = view;
            this.f10324f = c2495f;
            this.f10325g = c2494e;
            this.f10326h = matrix;
        }

        /* renamed from: a */
        public final void m9837a(Matrix matrix) {
            this.f10320b.set(matrix);
            this.f10323e.setTag(g8e.transition_transform, this.f10320b);
            this.f10324f.m9842a(this.f10323e);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            this.f10319a = true;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            if (!this.f10319a) {
                if (this.f10321c && this.f10322d) {
                    m9837a(this.f10326h);
                } else {
                    this.f10323e.setTag(g8e.transition_transform, null);
                    this.f10323e.setTag(g8e.parent_matrix, null);
                }
            }
            zzi.m60171d(this.f10323e, null);
            this.f10324f.m9842a(this.f10323e);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorPauseListener
        public void onAnimationPause(Animator animator) {
            m9837a(this.f10325g.m9838a());
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorPauseListener
        public void onAnimationResume(Animator animator) {
            ChangeTransform.N0(this.f10323e);
        }
    }

    /* renamed from: androidx.transition.ChangeTransform$e */
    public static class C2494e {

        /* renamed from: a */
        public final Matrix f10327a = new Matrix();

        /* renamed from: b */
        public final View f10328b;

        /* renamed from: c */
        public final float[] f10329c;

        /* renamed from: d */
        public float f10330d;

        /* renamed from: e */
        public float f10331e;

        public C2494e(View view, float[] fArr) {
            this.f10328b = view;
            float[] fArr2 = (float[]) fArr.clone();
            this.f10329c = fArr2;
            this.f10330d = fArr2[2];
            this.f10331e = fArr2[5];
            m9839b();
        }

        /* renamed from: a */
        public Matrix m9838a() {
            return this.f10327a;
        }

        /* renamed from: b */
        public final void m9839b() {
            float[] fArr = this.f10329c;
            fArr[2] = this.f10330d;
            fArr[5] = this.f10331e;
            this.f10327a.setValues(fArr);
            zzi.m60171d(this.f10328b, this.f10327a);
        }

        /* renamed from: c */
        public void m9840c(PointF pointF) {
            this.f10330d = pointF.x;
            this.f10331e = pointF.y;
            m9839b();
        }

        /* renamed from: d */
        public void m9841d(float[] fArr) {
            System.arraycopy(fArr, 0, this.f10329c, 0, fArr.length);
            m9839b();
        }
    }

    /* renamed from: androidx.transition.ChangeTransform$f */
    public static class C2495f {

        /* renamed from: a */
        public final float f10332a;

        /* renamed from: b */
        public final float f10333b;

        /* renamed from: c */
        public final float f10334c;

        /* renamed from: d */
        public final float f10335d;

        /* renamed from: e */
        public final float f10336e;

        /* renamed from: f */
        public final float f10337f;

        /* renamed from: g */
        public final float f10338g;

        /* renamed from: h */
        public final float f10339h;

        public C2495f(View view) {
            this.f10332a = view.getTranslationX();
            this.f10333b = view.getTranslationY();
            this.f10334c = wvi.m55097J(view);
            this.f10335d = view.getScaleX();
            this.f10336e = view.getScaleY();
            this.f10337f = view.getRotationX();
            this.f10338g = view.getRotationY();
            this.f10339h = view.getRotation();
        }

        /* renamed from: a */
        public void m9842a(View view) {
            ChangeTransform.P0(view, this.f10332a, this.f10333b, this.f10334c, this.f10335d, this.f10336e, this.f10337f, this.f10338g, this.f10339h);
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof C2495f)) {
                return false;
            }
            C2495f c2495f = (C2495f) obj;
            return c2495f.f10332a == this.f10332a && c2495f.f10333b == this.f10333b && c2495f.f10334c == this.f10334c && c2495f.f10335d == this.f10335d && c2495f.f10336e == this.f10336e && c2495f.f10337f == this.f10337f && c2495f.f10338g == this.f10338g && c2495f.f10339h == this.f10339h;
        }

        public int hashCode() {
            float f = this.f10332a;
            int iFloatToIntBits = (f != 0.0f ? Float.floatToIntBits(f) : 0) * 31;
            float f2 = this.f10333b;
            int iFloatToIntBits2 = (iFloatToIntBits + (f2 != 0.0f ? Float.floatToIntBits(f2) : 0)) * 31;
            float f3 = this.f10334c;
            int iFloatToIntBits3 = (iFloatToIntBits2 + (f3 != 0.0f ? Float.floatToIntBits(f3) : 0)) * 31;
            float f4 = this.f10335d;
            int iFloatToIntBits4 = (iFloatToIntBits3 + (f4 != 0.0f ? Float.floatToIntBits(f4) : 0)) * 31;
            float f5 = this.f10336e;
            int iFloatToIntBits5 = (iFloatToIntBits4 + (f5 != 0.0f ? Float.floatToIntBits(f5) : 0)) * 31;
            float f6 = this.f10337f;
            int iFloatToIntBits6 = (iFloatToIntBits5 + (f6 != 0.0f ? Float.floatToIntBits(f6) : 0)) * 31;
            float f7 = this.f10338g;
            int iFloatToIntBits7 = (iFloatToIntBits6 + (f7 != 0.0f ? Float.floatToIntBits(f7) : 0)) * 31;
            float f8 = this.f10339h;
            return iFloatToIntBits7 + (f8 != 0.0f ? Float.floatToIntBits(f8) : 0);
        }
    }

    public ChangeTransform(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.E0 = true;
        this.F0 = true;
        this.G0 = new Matrix();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, kag.f31777g);
        XmlPullParser xmlPullParser = (XmlPullParser) attributeSet;
        this.E0 = dzh.m23972a(typedArrayObtainStyledAttributes, xmlPullParser, "reparentWithOverlay", 1, true);
        this.F0 = dzh.m23972a(typedArrayObtainStyledAttributes, xmlPullParser, "reparent", 0, true);
        typedArrayObtainStyledAttributes.recycle();
    }

    public static void N0(View view) {
        P0(view, 0.0f, 0.0f, 0.0f, 1.0f, 1.0f, 0.0f, 0.0f, 0.0f);
    }

    public static void P0(View view, float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8) {
        view.setTranslationX(f);
        view.setTranslationY(f2);
        wvi.D0(view, f3);
        view.setScaleX(f4);
        view.setScaleY(f5);
        view.setRotationX(f6);
        view.setRotationY(f7);
        view.setRotation(f8);
    }

    public final void I0(svh svhVar) {
        View view = svhVar.f46009b;
        if (view.getVisibility() == 8) {
            return;
        }
        svhVar.f46008a.put("android:changeTransform:parent", view.getParent());
        svhVar.f46008a.put("android:changeTransform:transforms", new C2495f(view));
        Matrix matrix = view.getMatrix();
        svhVar.f46008a.put("android:changeTransform:matrix", (matrix == null || matrix.isIdentity()) ? null : new Matrix(matrix));
        if (this.F0) {
            Matrix matrix2 = new Matrix();
            zzi.m60175h((ViewGroup) view.getParent(), matrix2);
            matrix2.preTranslate(-r2.getScrollX(), -r2.getScrollY());
            svhVar.f46008a.put("android:changeTransform:parentMatrix", matrix2);
            svhVar.f46008a.put("android:changeTransform:intermediateMatrix", view.getTag(g8e.transition_transform));
            svhVar.f46008a.put("android:changeTransform:intermediateParentMatrix", view.getTag(g8e.parent_matrix));
        }
    }

    public final void J0(ViewGroup viewGroup, svh svhVar, svh svhVar2) {
        View view = svhVar2.f46009b;
        Matrix matrix = new Matrix((Matrix) svhVar2.f46008a.get("android:changeTransform:parentMatrix"));
        zzi.m60176i(viewGroup, matrix);
        cs7 cs7VarM29445a = gs7.m29445a(view, viewGroup, matrix);
        if (cs7VarM29445a == null) {
            return;
        }
        cs7VarM29445a.mo21705a((ViewGroup) svhVar.f46008a.get("android:changeTransform:parent"), svhVar.f46009b);
        Transition transition = this;
        while (true) {
            Transition transition2 = transition.f10350Y;
            if (transition2 == null) {
                break;
            } else {
                transition = transition2;
            }
        }
        transition.mo9876c(new C2492c(view, cs7VarM29445a));
        if (K0) {
            View view2 = svhVar.f46009b;
            if (view2 != svhVar2.f46009b) {
                zzi.m60173f(view2, 0.0f);
            }
            zzi.m60173f(view, 1.0f);
        }
    }

    public final ObjectAnimator L0(svh svhVar, svh svhVar2, boolean z) {
        Matrix matrix = (Matrix) svhVar.f46008a.get("android:changeTransform:matrix");
        Matrix matrix2 = (Matrix) svhVar2.f46008a.get("android:changeTransform:matrix");
        if (matrix == null) {
            matrix = vza.f51069a;
        }
        if (matrix2 == null) {
            matrix2 = vza.f51069a;
        }
        Matrix matrix3 = matrix2;
        if (matrix.equals(matrix3)) {
            return null;
        }
        C2495f c2495f = (C2495f) svhVar2.f46008a.get("android:changeTransform:transforms");
        View view = svhVar2.f46009b;
        N0(view);
        float[] fArr = new float[9];
        matrix.getValues(fArr);
        float[] fArr2 = new float[9];
        matrix3.getValues(fArr2);
        C2494e c2494e = new C2494e(view, fArr);
        ObjectAnimator objectAnimatorOfPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(c2494e, PropertyValuesHolder.ofObject(I0, new a37(new float[9]), fArr, fArr2), twd.m50731a(J0, m9862H().mo9801a(fArr[2], fArr[5], fArr2[2], fArr2[5])));
        C2493d c2493d = new C2493d(view, c2495f, c2494e, matrix3, z, this.E0);
        objectAnimatorOfPropertyValuesHolder.addListener(c2493d);
        objectAnimatorOfPropertyValuesHolder.addPauseListener(c2493d);
        return objectAnimatorOfPropertyValuesHolder;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x001d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean M0(ViewGroup viewGroup, ViewGroup viewGroup2) {
        boolean z = true;
        if (m9874X(viewGroup) && m9874X(viewGroup2)) {
            svh svhVarM9860F = m9860F(viewGroup, true);
            if (svhVarM9860F == null) {
                return false;
            }
            if (viewGroup2 != svhVarM9860F.f46009b) {
            }
        } else if (viewGroup != viewGroup2) {
            z = false;
        }
        return z;
    }

    public final void O0(svh svhVar, svh svhVar2) {
        Matrix matrix = (Matrix) svhVar2.f46008a.get("android:changeTransform:parentMatrix");
        svhVar2.f46009b.setTag(g8e.parent_matrix, matrix);
        Matrix matrix2 = this.G0;
        matrix2.reset();
        matrix.invert(matrix2);
        Matrix matrix3 = (Matrix) svhVar.f46008a.get("android:changeTransform:matrix");
        if (matrix3 == null) {
            matrix3 = new Matrix();
            svhVar.f46008a.put("android:changeTransform:matrix", matrix3);
        }
        matrix3.postConcat((Matrix) svhVar.f46008a.get("android:changeTransform:parentMatrix"));
        matrix3.postConcat(matrix2);
    }

    @Override // androidx.transition.Transition
    /* renamed from: R */
    public String[] mo9805R() {
        return H0;
    }

    @Override // androidx.transition.Transition
    /* renamed from: k */
    public void mo9807k(svh svhVar) {
        I0(svhVar);
    }

    @Override // androidx.transition.Transition
    /* renamed from: n */
    public void mo9808n(svh svhVar) {
        I0(svhVar);
        if (K0) {
            return;
        }
        ((ViewGroup) svhVar.f46009b.getParent()).startViewTransition(svhVar.f46009b);
    }

    @Override // androidx.transition.Transition
    /* renamed from: t */
    public Animator mo9809t(ViewGroup viewGroup, svh svhVar, svh svhVar2) {
        if (svhVar == null || svhVar2 == null || !svhVar.f46008a.containsKey("android:changeTransform:parent") || !svhVar2.f46008a.containsKey("android:changeTransform:parent")) {
            return null;
        }
        ViewGroup viewGroup2 = (ViewGroup) svhVar.f46008a.get("android:changeTransform:parent");
        boolean z = this.F0 && !M0(viewGroup2, (ViewGroup) svhVar2.f46008a.get("android:changeTransform:parent"));
        Matrix matrix = (Matrix) svhVar.f46008a.get("android:changeTransform:intermediateMatrix");
        if (matrix != null) {
            svhVar.f46008a.put("android:changeTransform:matrix", matrix);
        }
        Matrix matrix2 = (Matrix) svhVar.f46008a.get("android:changeTransform:intermediateParentMatrix");
        if (matrix2 != null) {
            svhVar.f46008a.put("android:changeTransform:parentMatrix", matrix2);
        }
        if (z) {
            O0(svhVar, svhVar2);
        }
        ObjectAnimator objectAnimatorL0 = L0(svhVar, svhVar2, z);
        if (z && objectAnimatorL0 != null && this.E0) {
            J0(viewGroup, svhVar, svhVar2);
        } else if (!K0) {
            viewGroup2.endViewTransition(svhVar.f46009b);
        }
        return objectAnimatorL0;
    }
}
