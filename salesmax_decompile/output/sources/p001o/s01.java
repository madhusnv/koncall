package p001o;

import android.content.SharedPreferences;
import com.facebook.AuthenticationToken;
import com.facebook.C10773c;
import org.json.JSONException;

/* loaded from: classes5.dex */
public final class s01 {

    /* renamed from: b */
    public static final C16699a f44354b = new C16699a(null);

    /* renamed from: a */
    public final SharedPreferences f44355a;

    /* renamed from: o.s01$a */
    public static final class C16699a {
        public C16699a() {
        }

        public /* synthetic */ C16699a(id5 id5Var) {
            this();
        }
    }

    public s01(SharedPreferences sharedPreferences) {
        sq8.m48649h(sharedPreferences, "sharedPreferences");
        this.f44355a = sharedPreferences;
    }

    /* renamed from: a */
    public final void m47369a() {
        this.f44355a.edit().remove("com.facebook.AuthenticationManager.CachedAuthenticationToken").apply();
    }

    /* renamed from: b */
    public final void m47370b(AuthenticationToken authenticationToken) {
        sq8.m48649h(authenticationToken, "authenticationToken");
        try {
            this.f44355a.edit().putString("com.facebook.AuthenticationManager.CachedAuthenticationToken", authenticationToken.m12780b().toString()).apply();
        } catch (JSONException unused) {
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public s01() {
        SharedPreferences sharedPreferences = C10773c.m13019l().getSharedPreferences("com.facebook.AuthenticationTokenManager.SharedPreferences", 0);
        sq8.m48648g(sharedPreferences, "getApplicationContext()\n…ME, Context.MODE_PRIVATE)");
        this(sharedPreferences);
    }
}
