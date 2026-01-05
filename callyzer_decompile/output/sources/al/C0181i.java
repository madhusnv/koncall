package al;

import android.content.Context;
import java.util.UUID;
import qi.C6218a;
import qi.C6219b;
import qi.C6228k;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: al.i */
/* loaded from: classes.dex */
public final class C0181i {

    /* renamed from: b */
    public static final C6219b f552b;

    /* renamed from: a */
    public final Context f553a;

    static {
        C6218a c6218aM12231a = C6219b.m12231a(C0181i.class);
        c6218aM12231a.m12227a(C6228k.m12246a(C0178f.class));
        c6218aM12231a.m12227a(C6228k.m12246a(Context.class));
        c6218aM12231a.f30212g = new C0174b(2);
        f552b = c6218aM12231a.m12228b();
    }

    public C0181i(Context context) {
        this.f553a = context;
    }

    /* renamed from: a */
    public final synchronized String m409a() {
        String string = this.f553a.getSharedPreferences("com.google.mlkit.internal", 0).getString("ml_sdk_instance_id", null);
        if (string != null) {
            return string;
        }
        String string2 = UUID.randomUUID().toString();
        this.f553a.getSharedPreferences("com.google.mlkit.internal", 0).edit().putString("ml_sdk_instance_id", string2).apply();
        return string2;
    }
}
