package p001o;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import androidx.appcompat.widget.Toolbar;
import androidx.navigation.AbstractC2333d;
import androidx.navigation.AbstractC2341h;
import androidx.transition.AbstractC2524c;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.lang.ref.WeakReference;

/* loaded from: classes2.dex */
public final class hsh extends p6 {

    /* renamed from: f */
    public final WeakReference f27442f;

    /* JADX WARN: Illegal instructions before constructor call */
    public hsh(Toolbar toolbar, jj0 jj0Var) {
        sq8.m48649h(toolbar, "toolbar");
        sq8.m48649h(jj0Var, "configuration");
        Context context = toolbar.getContext();
        sq8.m48648g(context, "toolbar.context");
        super(context, jj0Var);
        this.f27442f = new WeakReference(toolbar);
    }

    @Override // p001o.p6, androidx.navigation.AbstractC2333d.c
    /* renamed from: a */
    public void mo74a(AbstractC2333d abstractC2333d, AbstractC2341h abstractC2341h, Bundle bundle) {
        sq8.m48649h(abstractC2333d, "controller");
        sq8.m48649h(abstractC2341h, FirebaseAnalytics.Param.DESTINATION);
        if (((Toolbar) this.f27442f.get()) == null) {
            abstractC2333d.t0(this);
        } else {
            super.mo74a(abstractC2333d, abstractC2341h, bundle);
        }
    }

    @Override // p001o.p6
    /* renamed from: c */
    public void mo31058c(Drawable drawable, int i) {
        Toolbar toolbar = (Toolbar) this.f27442f.get();
        if (toolbar != null) {
            boolean z = drawable == null && toolbar.getNavigationIcon() != null;
            toolbar.setNavigationIcon(drawable);
            toolbar.setNavigationContentDescription(i);
            if (z) {
                AbstractC2524c.m9944a(toolbar);
            }
        }
    }

    @Override // p001o.p6
    /* renamed from: d */
    public void mo31059d(CharSequence charSequence) {
        Toolbar toolbar = (Toolbar) this.f27442f.get();
        if (toolbar != null) {
            toolbar.setTitle(charSequence);
        }
    }
}
