package p001o;

import android.view.View;

/* loaded from: classes2.dex */
public abstract class rzi {

    /* renamed from: o.rzi$a */
    public static final class C16696a extends kf9 implements xk7 {

        /* renamed from: a */
        public static final C16696a f44346a = new C16696a();

        public C16696a() {
            super(1);
        }

        @Override // p001o.xk7
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final View invoke(View view) {
            sq8.m48649h(view, "currentView");
            Object parent = view.getParent();
            if (parent instanceof View) {
                return (View) parent;
            }
            return null;
        }
    }

    /* renamed from: o.rzi$b */
    public static final class C16697b extends kf9 implements xk7 {

        /* renamed from: a */
        public static final C16697b f44347a = new C16697b();

        public C16697b() {
            super(1);
        }

        @Override // p001o.xk7
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final xca invoke(View view) {
            sq8.m48649h(view, "viewParent");
            Object tag = view.getTag(y7e.view_tree_lifecycle_owner);
            if (tag instanceof xca) {
                return (xca) tag;
            }
            return null;
        }
    }

    /* renamed from: a */
    public static final xca m47365a(View view) {
        sq8.m48649h(view, "<this>");
        return (xca) qef.m45313p(qef.m45320w(oef.m42147f(view, C16696a.f44346a), C16697b.f44347a));
    }

    /* renamed from: b */
    public static final void m47366b(View view, xca xcaVar) {
        sq8.m48649h(view, "<this>");
        view.setTag(y7e.view_tree_lifecycle_owner, xcaVar);
    }
}
