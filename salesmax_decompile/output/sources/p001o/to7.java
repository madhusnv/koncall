package p001o;

import android.content.ComponentName;
import android.os.Bundle;
import java.util.List;

/* loaded from: classes2.dex */
public final class to7 {

    /* renamed from: f */
    public static final C17167a f47484f = new C17167a(null);

    /* renamed from: a */
    public final List f47485a;

    /* renamed from: b */
    public final String f47486b;

    /* renamed from: c */
    public final boolean f47487c;

    /* renamed from: d */
    public final ComponentName f47488d;

    /* renamed from: e */
    public final boolean f47489e;

    /* renamed from: o.to7$a */
    public static final class C17167a {
        public C17167a() {
        }

        public /* synthetic */ C17167a(id5 id5Var) {
            this();
        }

        /* renamed from: a */
        public final Bundle m50251a(to7 to7Var) {
            sq8.m48649h(to7Var, "request");
            Bundle bundle = new Bundle();
            bundle.putBoolean("androidx.credentials.BUNDLE_KEY_PREFER_IDENTITY_DOC_UI", to7Var.m50248c());
            bundle.putBoolean("androidx.credentials.BUNDLE_KEY_PREFER_IMMEDIATELY_AVAILABLE_CREDENTIALS", to7Var.m50250e());
            bundle.putParcelable("androidx.credentials.BUNDLE_KEY_PREFER_UI_BRANDING_COMPONENT_NAME", to7Var.m50249d());
            return bundle;
        }
    }

    public to7(List list, String str, boolean z, ComponentName componentName, boolean z2) {
        sq8.m48649h(list, "credentialOptions");
        this.f47485a = list;
        this.f47486b = str;
        this.f47487c = z;
        this.f47488d = componentName;
        this.f47489e = z2;
        if (!(!list.isEmpty())) {
            throw new IllegalArgumentException("credentialOptions should not be empty".toString());
        }
    }

    /* renamed from: a */
    public final List m50246a() {
        return this.f47485a;
    }

    /* renamed from: b */
    public final String m50247b() {
        return this.f47486b;
    }

    /* renamed from: c */
    public final boolean m50248c() {
        return this.f47487c;
    }

    /* renamed from: d */
    public final ComponentName m50249d() {
        return this.f47488d;
    }

    /* renamed from: e */
    public final boolean m50250e() {
        return this.f47489e;
    }

    public /* synthetic */ to7(List list, String str, boolean z, ComponentName componentName, boolean z2, int i, id5 id5Var) {
        this(list, (i & 2) != 0 ? null : str, (i & 4) != 0 ? false : z, (i & 8) != 0 ? null : componentName, (i & 16) != 0 ? false : z2);
    }
}
