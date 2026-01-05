package p001o;

import android.view.View;

/* loaded from: classes2.dex */
public abstract class tzi {

    /* renamed from: o.tzi$a */
    public static final class C17272a extends kf9 implements xk7 {

        /* renamed from: a */
        public static final C17272a f48124a = new C17272a();

        public C17272a() {
            super(1);
        }

        @Override // p001o.xk7
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final View invoke(View view) {
            sq8.m48649h(view, "view");
            Object parent = view.getParent();
            if (parent instanceof View) {
                return (View) parent;
            }
            return null;
        }
    }

    /* renamed from: o.tzi$b */
    public static final class C17273b extends kf9 implements xk7 {

        /* renamed from: a */
        public static final C17273b f48125a = new C17273b();

        public C17273b() {
            super(1);
        }

        @Override // p001o.xk7
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final h1f invoke(View view) {
            sq8.m48649h(view, "view");
            Object tag = view.getTag(f8e.view_tree_saved_state_registry_owner);
            if (tag instanceof h1f) {
                return (h1f) tag;
            }
            return null;
        }
    }

    /* renamed from: a */
    public static final h1f m50816a(View view) {
        sq8.m48649h(view, "<this>");
        return (h1f) qef.m45313p(qef.m45320w(oef.m42147f(view, C17272a.f48124a), C17273b.f48125a));
    }

    /* renamed from: b */
    public static final void m50817b(View view, h1f h1fVar) {
        sq8.m48649h(view, "<this>");
        view.setTag(f8e.view_tree_saved_state_registry_owner, h1fVar);
    }
}
