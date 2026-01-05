package p001o;

import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import com.facebook.C10773c;

/* loaded from: classes5.dex */
public final class mzf {

    /* renamed from: c */
    public static final C15452a f36139c = new C15452a(null);

    /* renamed from: a */
    public final String f36140a;

    /* renamed from: b */
    public final boolean f36141b;

    /* renamed from: o.mzf$a */
    public static final class C15452a {
        public C15452a() {
        }

        public /* synthetic */ C15452a(id5 id5Var) {
            this();
        }

        /* renamed from: a */
        public final void m39920a() {
            SharedPreferences.Editor editorEdit = PreferenceManager.getDefaultSharedPreferences(C10773c.m13019l()).edit();
            editorEdit.remove("com.facebook.appevents.SourceApplicationInfo.callingApplicationPackage");
            editorEdit.remove("com.facebook.appevents.SourceApplicationInfo.openedByApplink");
            editorEdit.apply();
        }

        /* renamed from: b */
        public final mzf m39921b() {
            SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(C10773c.m13019l());
            id5 id5Var = null;
            if (defaultSharedPreferences.contains("com.facebook.appevents.SourceApplicationInfo.callingApplicationPackage")) {
                return new mzf(defaultSharedPreferences.getString("com.facebook.appevents.SourceApplicationInfo.callingApplicationPackage", null), defaultSharedPreferences.getBoolean("com.facebook.appevents.SourceApplicationInfo.openedByApplink", false), id5Var);
            }
            return null;
        }
    }

    public /* synthetic */ mzf(String str, boolean z, id5 id5Var) {
        this(str, z);
    }

    /* renamed from: a */
    public final void m39919a() {
        SharedPreferences.Editor editorEdit = PreferenceManager.getDefaultSharedPreferences(C10773c.m13019l()).edit();
        editorEdit.putString("com.facebook.appevents.SourceApplicationInfo.callingApplicationPackage", this.f36140a);
        editorEdit.putBoolean("com.facebook.appevents.SourceApplicationInfo.openedByApplink", this.f36141b);
        editorEdit.apply();
    }

    public String toString() {
        String str = this.f36141b ? "Applink" : "Unclassified";
        if (this.f36140a == null) {
            return str;
        }
        return str + '(' + this.f36140a + ')';
    }

    public mzf(String str, boolean z) {
        this.f36140a = str;
        this.f36141b = z;
    }
}
