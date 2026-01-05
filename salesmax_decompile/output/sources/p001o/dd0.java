package p001o;

import android.content.Context;
import android.view.accessibility.AccessibilityManager;

/* loaded from: classes2.dex */
public final class dd0 implements hb {

    /* renamed from: b */
    public static final C12873a f19596b = new C12873a(null);

    /* renamed from: a */
    public final AccessibilityManager f19597a;

    /* renamed from: o.dd0$a */
    public static final class C12873a {
        public C12873a() {
        }

        public /* synthetic */ C12873a(id5 id5Var) {
            this();
        }
    }

    public dd0(Context context) {
        sq8.m48649h(context, "context");
        Object systemService = context.getSystemService("accessibility");
        sq8.m48647f(systemService, "null cannot be cast to non-null type android.view.accessibility.AccessibilityManager");
        this.f19597a = (AccessibilityManager) systemService;
    }
}
