package p001o;

import android.app.Activity;
import android.view.View;
import androidx.navigation.AbstractC2333d;
import java.lang.ref.WeakReference;

/* loaded from: classes2.dex */
public final class fsb {

    /* renamed from: a */
    public static final fsb f24034a = new fsb();

    /* renamed from: o.fsb$a */
    public static final class C13550a extends kf9 implements xk7 {

        /* renamed from: a */
        public static final C13550a f24035a = new C13550a();

        public C13550a() {
            super(1);
        }

        @Override // p001o.xk7
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final View invoke(View view) {
            sq8.m48649h(view, "it");
            Object parent = view.getParent();
            if (parent instanceof View) {
                return (View) parent;
            }
            return null;
        }
    }

    /* renamed from: o.fsb$b */
    public static final class C13551b extends kf9 implements xk7 {

        /* renamed from: a */
        public static final C13551b f24036a = new C13551b();

        public C13551b() {
            super(1);
        }

        @Override // p001o.xk7
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final AbstractC2333d invoke(View view) {
            sq8.m48649h(view, "it");
            return fsb.f24034a.m27451e(view);
        }
    }

    /* renamed from: b */
    public static final AbstractC2333d m27447b(Activity activity, int i) {
        sq8.m48649h(activity, "activity");
        View viewM39368h = mn.m39368h(activity, i);
        sq8.m48648g(viewM39368h, "requireViewById<View>(activity, viewId)");
        AbstractC2333d abstractC2333dM27450d = f24034a.m27450d(viewM39368h);
        if (abstractC2333dM27450d != null) {
            return abstractC2333dM27450d;
        }
        throw new IllegalStateException("Activity " + activity + " does not have a NavController set on " + i);
    }

    /* renamed from: c */
    public static final AbstractC2333d m27448c(View view) {
        sq8.m48649h(view, "view");
        AbstractC2333d abstractC2333dM27450d = f24034a.m27450d(view);
        if (abstractC2333dM27450d != null) {
            return abstractC2333dM27450d;
        }
        throw new IllegalStateException("View " + view + " does not have a NavController set");
    }

    /* renamed from: f */
    public static final void m27449f(View view, AbstractC2333d abstractC2333d) {
        sq8.m48649h(view, "view");
        view.setTag(c8e.nav_controller_view_tag, abstractC2333d);
    }

    /* renamed from: d */
    public final AbstractC2333d m27450d(View view) {
        return (AbstractC2333d) qef.m45313p(qef.m45320w(oef.m42147f(view, C13550a.f24035a), C13551b.f24036a));
    }

    /* renamed from: e */
    public final AbstractC2333d m27451e(View view) {
        Object tag = view.getTag(c8e.nav_controller_view_tag);
        if (tag instanceof WeakReference) {
            return (AbstractC2333d) ((WeakReference) tag).get();
        }
        if (tag instanceof AbstractC2333d) {
            return (AbstractC2333d) tag;
        }
        return null;
    }
}
