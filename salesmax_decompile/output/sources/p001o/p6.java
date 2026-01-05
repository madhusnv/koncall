package p001o;

import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import androidx.navigation.AbstractC2333d;
import androidx.navigation.AbstractC2341h;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.lang.ref.WeakReference;

/* loaded from: classes2.dex */
public abstract class p6 implements AbstractC2333d.c {

    /* renamed from: a */
    public final Context f39380a;

    /* renamed from: b */
    public final jj0 f39381b;

    /* renamed from: c */
    public final WeakReference f39382c;

    /* renamed from: d */
    public az5 f39383d;

    /* renamed from: e */
    public ValueAnimator f39384e;

    public p6(Context context, jj0 jj0Var) {
        sq8.m48649h(context, "context");
        sq8.m48649h(jj0Var, "configuration");
        this.f39380a = context;
        this.f39381b = jj0Var;
        ndc ndcVarM33872b = jj0Var.m33872b();
        this.f39382c = ndcVarM33872b != null ? new WeakReference(ndcVarM33872b) : null;
    }

    @Override // androidx.navigation.AbstractC2333d.c
    /* renamed from: a */
    public void mo74a(AbstractC2333d abstractC2333d, AbstractC2341h abstractC2341h, Bundle bundle) {
        sq8.m48649h(abstractC2333d, "controller");
        sq8.m48649h(abstractC2341h, FirebaseAnalytics.Param.DESTINATION);
        if (abstractC2341h instanceof r37) {
            return;
        }
        WeakReference weakReference = this.f39382c;
        ndc ndcVar = weakReference != null ? (ndc) weakReference.get() : null;
        if (this.f39382c != null && ndcVar == null) {
            abstractC2333d.t0(this);
            return;
        }
        String strM8770r = abstractC2341h.m8770r(this.f39380a, bundle);
        if (strM8770r != null) {
            mo31059d(strM8770r);
        }
        boolean zM33873c = this.f39381b.m33873c(abstractC2341h);
        boolean z = false;
        if (ndcVar == null && zM33873c) {
            mo31058c(null, 0);
            return;
        }
        if (ndcVar != null && zM33873c) {
            z = true;
        }
        m42991b(z);
    }

    /* renamed from: b */
    public final void m42991b(boolean z) {
        hwc hwcVarM53620a;
        az5 az5Var = this.f39383d;
        if (az5Var == null || (hwcVarM53620a = vyh.m53620a(az5Var, Boolean.TRUE)) == null) {
            az5 az5Var2 = new az5(this.f39380a);
            this.f39383d = az5Var2;
            hwcVarM53620a = vyh.m53620a(az5Var2, Boolean.FALSE);
        }
        az5 az5Var3 = (az5) hwcVarM53620a.m31227a();
        boolean zBooleanValue = ((Boolean) hwcVarM53620a.m31228b()).booleanValue();
        mo31058c(az5Var3, z ? cae.nav_app_bar_open_drawer_description : cae.nav_app_bar_navigate_up_description);
        float f = z ? 0.0f : 1.0f;
        if (!zBooleanValue) {
            az5Var3.setProgress(f);
            return;
        }
        float fM18031a = az5Var3.m18031a();
        ValueAnimator valueAnimator = this.f39384e;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(az5Var3, "progress", fM18031a, f);
        this.f39384e = objectAnimatorOfFloat;
        sq8.m48647f(objectAnimatorOfFloat, "null cannot be cast to non-null type android.animation.ObjectAnimator");
        objectAnimatorOfFloat.start();
    }

    /* renamed from: c */
    public abstract void mo31058c(Drawable drawable, int i);

    /* renamed from: d */
    public abstract void mo31059d(CharSequence charSequence);
}
