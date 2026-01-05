package r7;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.os.Bundle;
import androidx.appcompat.widget.Toolbar;
import com.websoptimization.callyzerbiz.R;
import java.lang.ref.WeakReference;
import java.util.HashSet;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.jvm.internal.AbstractC4154l;
import l4.d0;
import l7.AbstractC4422v;
import l7.C4404d;
import l7.C4408h;
import l7.C4423w;
import l7.InterfaceC4405e;
import l7.a0;
import l7.k0;
import og.cg;
import p010l.C4300a;
import p8.AbstractC5861v;
import q7.C6138e;
import qw.C6361k;
import rw.C6669s;
import zh.AbstractC8954a;
import zh.AbstractC8955b;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: r7.a */
/* loaded from: classes.dex */
public final class C6483a {

    /* renamed from: a */
    public final Context f31146a;

    /* renamed from: b */
    public final d0 f31147b;

    /* renamed from: c */
    public C4300a f31148c;

    /* renamed from: d */
    public ObjectAnimator f31149d;

    /* renamed from: e */
    public final WeakReference f31150e;

    public C6483a(Toolbar toolbar, d0 d0Var) {
        Context context = toolbar.getContext();
        AbstractC4154l.m8922e(context, "getContext(...)");
        this.f31146a = context;
        this.f31147b = d0Var;
        this.f31150e = new WeakReference(toolbar);
    }

    /* renamed from: a */
    public final void m12483a(a0 a0Var, AbstractC4422v destination, Bundle bundle) {
        String string;
        String strValueOf;
        C6361k c6361k;
        Toolbar toolbar;
        AbstractC4154l.m8923f(destination, "destination");
        WeakReference weakReference = this.f31150e;
        if (((Toolbar) weakReference.get()) == null) {
            C6138e c6138e = a0Var.f21996b;
            c6138e.getClass();
            c6138e.f29922p.remove(this);
            return;
        }
        if (destination instanceof InterfaceC4405e) {
            return;
        }
        Context context = this.f31146a;
        AbstractC4154l.m8923f(context, "context");
        CharSequence charSequence = destination.f22137d;
        if (charSequence == null) {
            string = null;
        } else {
            Matcher matcher = Pattern.compile("\\{(.+?)\\}").matcher(charSequence);
            StringBuffer stringBuffer = new StringBuffer();
            Map mapM10591f = bundle != null ? cg.m10591f(bundle) : C6669s.f31944a;
            while (matcher.find()) {
                String strGroup = matcher.group(1);
                if (strGroup == null || !mapM10591f.containsKey(strGroup)) {
                    throw new IllegalArgumentException(("Could not find \"" + strGroup + "\" in " + bundle + " to fill label \"" + ((Object) charSequence) + '\"').toString());
                }
                matcher.appendReplacement(stringBuffer, "");
                C4408h c4408h = (C4408h) destination.m9249r().get(strGroup);
                k0 k0Var = c4408h != null ? c4408h.f22040a : null;
                C4404d c4404d = k0.f22060c;
                if (AbstractC4154l.m8918a(k0Var, c4404d)) {
                    AbstractC4154l.m8920c(bundle);
                    strValueOf = context.getString(((Integer) c4404d.mo9203a(strGroup, bundle)).intValue());
                } else {
                    AbstractC4154l.m8920c(k0Var);
                    AbstractC4154l.m8920c(bundle);
                    strValueOf = String.valueOf(k0Var.mo9203a(strGroup, bundle));
                }
                AbstractC4154l.m8920c(strValueOf);
                stringBuffer.append(strValueOf);
            }
            matcher.appendTail(stringBuffer);
            string = stringBuffer.toString();
        }
        if (string != null && (toolbar = (Toolbar) weakReference.get()) != null) {
            toolbar.setTitle(string);
        }
        d0 d0Var = this.f31147b;
        d0Var.getClass();
        int i10 = AbstractC4422v.f22133f;
        for (AbstractC4422v abstractC4422v : AbstractC8954a.m16436b(destination)) {
            if (((HashSet) d0Var.f21881b).contains(Integer.valueOf(abstractC4422v.f22135b.f29939e))) {
                if (abstractC4422v instanceof C4423w) {
                    int i11 = destination.f22135b.f29939e;
                    int i12 = C4423w.f22139h;
                    if (i11 == AbstractC8955b.m16437a((C4423w) abstractC4422v).f22135b.f29939e) {
                    }
                }
                m12484b(null, 0);
                return;
            }
        }
        C4300a c4300a = this.f31148c;
        if (c4300a != null) {
            c6361k = new C6361k(c4300a, Boolean.TRUE);
        } else {
            C4300a c4300a2 = new C4300a(context);
            this.f31148c = c4300a2;
            c6361k = new C6361k(c4300a2, Boolean.FALSE);
        }
        C4300a c4300a3 = (C4300a) c6361k.f30755a;
        boolean zBooleanValue = ((Boolean) c6361k.f30756b).booleanValue();
        m12484b(c4300a3, R.string.nav_app_bar_navigate_up_description);
        if (!zBooleanValue) {
            c4300a3.setProgress(1.0f);
            return;
        }
        float f6 = c4300a3.f21718i;
        ObjectAnimator objectAnimator = this.f31149d;
        if (objectAnimator != null) {
            objectAnimator.cancel();
        }
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(c4300a3, "progress", f6, 1.0f);
        this.f31149d = objectAnimatorOfFloat;
        AbstractC4154l.m8921d(objectAnimatorOfFloat, "null cannot be cast to non-null type android.animation.ObjectAnimator");
        objectAnimatorOfFloat.start();
    }

    /* renamed from: b */
    public final void m12484b(C4300a c4300a, int i10) {
        Toolbar toolbar = (Toolbar) this.f31150e.get();
        if (toolbar != null) {
            boolean z6 = c4300a == null && toolbar.getNavigationIcon() != null;
            toolbar.setNavigationIcon(c4300a);
            toolbar.setNavigationContentDescription(i10);
            if (z6) {
                AbstractC5861v.m11463a(toolbar, null);
            }
        }
    }
}
