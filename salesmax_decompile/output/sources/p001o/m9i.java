package p001o;

import android.content.Context;
import android.content.SharedPreferences;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;
import java.util.function.Consumer;

/* loaded from: classes2.dex */
public class m9i implements SharedPreferences {

    /* renamed from: g */
    public static String f35022g = "ai.salesmax.prefs";

    /* renamed from: h */
    public static String f35023h = "ai.salesmax.prefs_encrypted";

    /* renamed from: i */
    public static String f35024i = "ai.salesmax.use_device.encryption";

    /* renamed from: a */
    public Context f35025a;

    /* renamed from: b */
    public Context f35026b;

    /* renamed from: c */
    public SharedPreferences f35027c = null;

    /* renamed from: d */
    public SharedPreferences f35028d = null;

    /* renamed from: e */
    public SharedPreferences f35029e = null;

    /* renamed from: f */
    public String f35030f = f35022g;

    public m9i(Context context) {
        this.f35025a = context;
        this.f35026b = context.createDeviceProtectedStorageContext();
        m38600c();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: f */
    public /* synthetic */ void m38598f(String str, String str2, AtomicReference atomicReference) {
        atomicReference.set(this.f35027c.getString(str, str2));
    }

    /* renamed from: g */
    public static /* synthetic */ void m38599g(Throwable th) {
    }

    /* renamed from: c */
    public final void m38600c() {
        this.f35028d = this.f35026b.getSharedPreferences(this.f35030f, 0);
        this.f35029e = this.f35026b.getSharedPreferences(f35023h, 0);
        m38601d(true);
    }

    @Override // android.content.SharedPreferences
    public boolean contains(String str) {
        return this.f35027c.contains(str);
    }

    /* renamed from: d */
    public void m38601d(boolean z) {
        boolean zM38604i = m38604i();
        if (z && !zM38604i) {
            this.f35026b.moveSharedPreferencesFrom(this.f35025a, this.f35030f);
        }
        if (!z && zM38604i) {
            this.f35025a.moveSharedPreferencesFrom(this.f35026b, this.f35030f);
        }
        this.f35029e.edit().putBoolean(f35024i, z).apply();
        this.f35027c = z ? this.f35028d : this.f35025a.getSharedPreferences(this.f35030f, 0);
    }

    /* renamed from: e */
    public boolean m38602e() {
        return !Objects.equals(this.f35030f, f35022g);
    }

    @Override // android.content.SharedPreferences
    public SharedPreferences.Editor edit() {
        return this.f35027c.edit();
    }

    @Override // android.content.SharedPreferences
    public Map getAll() {
        return this.f35027c.getAll();
    }

    @Override // android.content.SharedPreferences
    public boolean getBoolean(String str, boolean z) {
        return this.f35027c.getBoolean(str, z);
    }

    @Override // android.content.SharedPreferences
    public float getFloat(String str, float f) {
        return this.f35027c.getFloat(str, f);
    }

    @Override // android.content.SharedPreferences
    public int getInt(String str, int i) {
        return this.f35027c.getInt(str, i);
    }

    @Override // android.content.SharedPreferences
    public long getLong(String str, long j) {
        return this.f35027c.getLong(str, j);
    }

    @Override // android.content.SharedPreferences
    public String getString(final String str, final String str2) {
        final AtomicReference atomicReference = new AtomicReference();
        ayh.Z2(new o83() { // from class: o.k9i
            @Override // p001o.o83
            public final void run() {
                this.f31716a.m38598f(str, str2, atomicReference);
            }
        }).q1(new Consumer() { // from class: o.l9i
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                m9i.m38599g((Throwable) obj);
            }
        });
        return (String) atomicReference.get();
    }

    @Override // android.content.SharedPreferences
    public Set getStringSet(String str, Set set) {
        return this.f35027c.getStringSet(str, set);
    }

    /* renamed from: h */
    public void m38603h(String str, String str2) {
        this.f35030f = String.format(f35022g + String.format(".%s.%s", str, str2), new Object[0]);
        this.f35026b = this.f35025a.createDeviceProtectedStorageContext();
        m38600c();
    }

    /* renamed from: i */
    public boolean m38604i() {
        return this.f35029e.getBoolean(f35024i, false);
    }

    @Override // android.content.SharedPreferences
    public void registerOnSharedPreferenceChangeListener(SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener) {
        this.f35027c.registerOnSharedPreferenceChangeListener(onSharedPreferenceChangeListener);
    }

    @Override // android.content.SharedPreferences
    public void unregisterOnSharedPreferenceChangeListener(SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener) {
        this.f35027c.unregisterOnSharedPreferenceChangeListener(onSharedPreferenceChangeListener);
    }
}
