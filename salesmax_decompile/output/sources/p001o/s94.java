package p001o;

import android.graphics.drawable.Icon;
import android.os.Bundle;
import android.text.TextUtils;

/* loaded from: classes2.dex */
public abstract class s94 {

    /* renamed from: i */
    public static final C16787a f45006i = new C16787a(null);

    /* renamed from: a */
    public final String f45007a;

    /* renamed from: b */
    public final Bundle f45008b;

    /* renamed from: c */
    public final Bundle f45009c;

    /* renamed from: d */
    public final boolean f45010d;

    /* renamed from: e */
    public final boolean f45011e;

    /* renamed from: f */
    public final C16788b f45012f;

    /* renamed from: g */
    public final String f45013g;

    /* renamed from: h */
    public final boolean f45014h;

    /* renamed from: o.s94$a */
    public static final class C16787a {
        public C16787a() {
        }

        public /* synthetic */ C16787a(id5 id5Var) {
            this();
        }
    }

    /* renamed from: o.s94$b */
    public static final class C16788b {

        /* renamed from: e */
        public static final a f45015e = new a(null);

        /* renamed from: a */
        public final CharSequence f45016a;

        /* renamed from: b */
        public final CharSequence f45017b;

        /* renamed from: c */
        public final Icon f45018c;

        /* renamed from: d */
        public final String f45019d;

        /* renamed from: o.s94$b$a */
        public static final class a {
            public a() {
            }

            public /* synthetic */ a(id5 id5Var) {
                this();
            }
        }

        public C16788b(CharSequence charSequence, CharSequence charSequence2, Icon icon, String str) {
            sq8.m48649h(charSequence, "userId");
            this.f45016a = charSequence;
            this.f45017b = charSequence2;
            this.f45018c = icon;
            this.f45019d = str;
            if (!(charSequence.length() > 0)) {
                throw new IllegalArgumentException("userId should not be empty".toString());
            }
        }

        /* renamed from: a */
        public final Bundle m48038a() {
            Bundle bundle = new Bundle();
            bundle.putCharSequence("androidx.credentials.BUNDLE_KEY_USER_ID", this.f45016a);
            if (!TextUtils.isEmpty(this.f45017b)) {
                bundle.putCharSequence("androidx.credentials.BUNDLE_KEY_USER_DISPLAY_NAME", this.f45017b);
            }
            if (!TextUtils.isEmpty(this.f45019d)) {
                bundle.putString("androidx.credentials.BUNDLE_KEY_DEFAULT_PROVIDER", this.f45019d);
            }
            return bundle;
        }
    }

    public s94(String str, Bundle bundle, Bundle bundle2, boolean z, boolean z2, C16788b c16788b, String str2, boolean z3) {
        sq8.m48649h(str, "type");
        sq8.m48649h(bundle, "credentialData");
        sq8.m48649h(bundle2, "candidateQueryData");
        sq8.m48649h(c16788b, "displayInfo");
        this.f45007a = str;
        this.f45008b = bundle;
        this.f45009c = bundle2;
        this.f45010d = z;
        this.f45011e = z2;
        this.f45012f = c16788b;
        this.f45013g = str2;
        this.f45014h = z3;
        bundle.putBoolean("androidx.credentials.BUNDLE_KEY_IS_AUTO_SELECT_ALLOWED", z2);
        bundle.putBoolean("androidx.credentials.BUNDLE_KEY_PREFER_IMMEDIATELY_AVAILABLE_CREDENTIALS", z3);
        bundle2.putBoolean("androidx.credentials.BUNDLE_KEY_IS_AUTO_SELECT_ALLOWED", z2);
    }

    /* renamed from: a */
    public final Bundle m48032a() {
        return this.f45009c;
    }

    /* renamed from: b */
    public final Bundle m48033b() {
        return this.f45008b;
    }

    /* renamed from: c */
    public final C16788b m48034c() {
        return this.f45012f;
    }

    /* renamed from: d */
    public final String m48035d() {
        return this.f45013g;
    }

    /* renamed from: e */
    public final String m48036e() {
        return this.f45007a;
    }

    /* renamed from: f */
    public final boolean m48037f() {
        return this.f45010d;
    }
}
