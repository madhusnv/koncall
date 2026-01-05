package p001o;

import android.content.Context;
import android.content.ContextWrapper;
import android.view.ViewGroup;
import androidx.appcompat.app.AppCompatActivity;
import androidx.transition.AbstractC2524c;
import androidx.transition.Transition;

/* loaded from: classes5.dex */
public abstract class ih0 {

    /* renamed from: o.ih0$a */
    public /* synthetic */ class C14290a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f28654a;

        static {
            int[] iArr = new int[wq8.values().length];
            iArr[wq8.FadeThrough.ordinal()] = 1;
            iArr[wq8.Fade.ordinal()] = 2;
            iArr[wq8.SharedAxisXForward.ordinal()] = 3;
            iArr[wq8.SharedAxisYForward.ordinal()] = 4;
            iArr[wq8.SharedAxisZForward.ordinal()] = 5;
            iArr[wq8.SharedAxisXBackward.ordinal()] = 6;
            iArr[wq8.SharedAxisYBackward.ordinal()] = 7;
            iArr[wq8.SharedAxisZBackward.ordinal()] = 8;
            iArr[wq8.ElevationScale.ordinal()] = 9;
            iArr[wq8.ElevationScaleGrow.ordinal()] = 10;
            iArr[wq8.None.ordinal()] = 11;
            f28654a = iArr;
        }
    }

    /* renamed from: a */
    public static final AppCompatActivity m32119a(Context context) {
        Context baseContext;
        sq8.m48649h(context, "<this>");
        if (context instanceof AppCompatActivity) {
            return (AppCompatActivity) context;
        }
        ContextWrapper contextWrapper = context instanceof ContextWrapper ? (ContextWrapper) context : null;
        if (contextWrapper == null || (baseContext = contextWrapper.getBaseContext()) == null) {
            return null;
        }
        return m32119a(baseContext);
    }

    /* renamed from: b */
    public static final /* synthetic */ Transition m32120b(wq8 wq8Var) {
        sq8.m48649h(wq8Var, "animation");
        switch (C14290a.f28654a[wq8Var.ordinal()]) {
            case 1:
                return new pya();
            case 2:
                return new oya();
            case 3:
                return new cza(0, true);
            case 4:
                return new cza(1, true);
            case 5:
                return new cza(2, true);
            case 6:
                return new cza(0, false);
            case 7:
                return new cza(1, false);
            case 8:
                return new cza(2, false);
            case 9:
                return new nya(false);
            case 10:
                return new nya(true);
            case 11:
                return null;
            default:
                throw new szb();
        }
    }

    /* renamed from: c */
    public static final void m32121c(int i, wq8 wq8Var, long j, ViewGroup viewGroup) {
        y3i y3iVar;
        sq8.m48649h(wq8Var, "introAnimation");
        if (viewGroup == null) {
            return;
        }
        Transition transitionM32120b = m32120b(wq8Var);
        if (transitionM32120b != null) {
            transitionM32120b.w0(j);
        }
        w4f w4fVarM53932d = w4f.m53932d(viewGroup, i, viewGroup.getContext());
        sq8.m48648g(w4fVarM53932d, "getSceneForLayout(root, layoutId, root.context)");
        if (transitionM32120b == null) {
            y3iVar = null;
        } else {
            AbstractC2524c.m9950g(w4fVarM53932d, transitionM32120b);
            y3iVar = y3i.f54824a;
        }
        if (y3iVar == null) {
            AbstractC2524c.m9949f(w4fVarM53932d);
        }
    }
}
