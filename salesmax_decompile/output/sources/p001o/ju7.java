package p001o;

import android.content.Context;
import android.os.Bundle;

/* loaded from: classes5.dex */
public final class ju7 {

    /* renamed from: b */
    public static final C14661a f31094b = new C14661a(null);

    /* renamed from: c */
    public static final boolean f31095c;

    /* renamed from: a */
    public final ao8 f31096a;

    /* renamed from: o.ju7$a */
    public static final class C14661a {
        public C14661a() {
        }

        public /* synthetic */ C14661a(id5 id5Var) {
            this();
        }
    }

    static {
        f31095c = vbe.f50091a.mo22611c() <= 1.0E-4d;
    }

    public ju7(Context context) {
        sq8.m48649h(context, "context");
        this.f31096a = new ao8(context);
    }

    /* renamed from: a */
    public final boolean m34514a(String str) {
        if (str != null) {
            return f9g.m26306P(str, "gps", false, 2, null);
        }
        return false;
    }

    /* renamed from: b */
    public final void m34515b(String str, Bundle bundle) {
        if (f31095c && m34514a(str)) {
            this.f31096a.m17564g(str, bundle);
        }
    }
}
