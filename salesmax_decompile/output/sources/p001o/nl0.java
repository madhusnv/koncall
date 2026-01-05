package p001o;

import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import com.facebook.AccessToken;

/* loaded from: classes5.dex */
public final class nl0 {

    /* renamed from: b */
    public static final C15598a f36985b = new C15598a(null);

    /* renamed from: c */
    public static final String f36986c = nl0.class.getCanonicalName();

    /* renamed from: a */
    public final ql0 f36987a;

    /* renamed from: o.nl0$a */
    public static final class C15598a {
        public C15598a() {
        }

        public /* synthetic */ C15598a(id5 id5Var) {
            this();
        }

        /* renamed from: a */
        public final void m40734a(Application application, String str) {
            sq8.m48649h(application, "application");
            ql0.f42105c.m45614f(application, str);
        }

        /* renamed from: b */
        public final String m40735b(Context context) {
            sq8.m48649h(context, "context");
            return ql0.f42105c.m45618j(context);
        }

        /* renamed from: c */
        public final EnumC15599b m40736c() {
            return ql0.f42105c.m45619k();
        }

        /* renamed from: d */
        public final String m40737d() {
            return lc0.m36881b();
        }

        /* renamed from: e */
        public final void m40738e(Context context, String str) {
            sq8.m48649h(context, "context");
            ql0.f42105c.m45622n(context, str);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* renamed from: f */
        public final nl0 m40739f(Context context) {
            sq8.m48649h(context, "context");
            return new nl0(context, null, 0 == true ? 1 : 0, 0 == true ? 1 : 0);
        }

        /* renamed from: g */
        public final void m40740g() {
            ql0.f42105c.m45626t();
        }
    }

    /* renamed from: o.nl0$b */
    public enum EnumC15599b {
        AUTO,
        EXPLICIT_ONLY
    }

    public /* synthetic */ nl0(Context context, String str, AccessToken accessToken, id5 id5Var) {
        this(context, str, accessToken);
    }

    /* renamed from: a */
    public final void m40732a() {
        this.f36987a.m45598j();
    }

    /* renamed from: b */
    public final void m40733b(String str, Bundle bundle) {
        this.f36987a.m45600l(str, bundle);
    }

    public nl0(Context context, String str, AccessToken accessToken) {
        this.f36987a = new ql0(context, str, accessToken);
    }
}
