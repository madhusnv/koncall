package p001o;

import android.content.SharedPreferences;
import com.facebook.C10773c;
import com.facebook.Profile;
import com.google.android.gms.common.Scopes;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes5.dex */
public final class jld {

    /* renamed from: b */
    public static final C14590a f30670b = new C14590a(null);

    /* renamed from: a */
    public final SharedPreferences f30671a;

    /* renamed from: o.jld$a */
    public static final class C14590a {
        public C14590a() {
        }

        public /* synthetic */ C14590a(id5 id5Var) {
            this();
        }
    }

    public jld() {
        SharedPreferences sharedPreferences = C10773c.m13019l().getSharedPreferences("com.facebook.AccessTokenManager.SharedPreferences", 0);
        sq8.m48648g(sharedPreferences, "getApplicationContext()\n…ME, Context.MODE_PRIVATE)");
        this.f30671a = sharedPreferences;
    }

    /* renamed from: a */
    public final void m34007a() {
        this.f30671a.edit().remove("com.facebook.ProfileManager.CachedProfile").apply();
    }

    /* renamed from: b */
    public final Profile m34008b() {
        String string = this.f30671a.getString("com.facebook.ProfileManager.CachedProfile", null);
        if (string != null) {
            try {
                return new Profile(new JSONObject(string));
            } catch (JSONException unused) {
            }
        }
        return null;
    }

    /* renamed from: c */
    public final void m34009c(Profile profile) {
        sq8.m48649h(profile, Scopes.PROFILE);
        JSONObject jSONObjectM12931e = profile.m12931e();
        if (jSONObjectM12931e != null) {
            this.f30671a.edit().putString("com.facebook.ProfileManager.CachedProfile", jSONObjectM12931e.toString()).apply();
        }
    }
}
