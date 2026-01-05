package p001o;

import android.content.Context;
import android.content.SharedPreferences;
import com.google.firebase.components.Component;
import com.google.firebase.components.ComponentContainer;
import com.google.firebase.components.ComponentFactory;
import com.google.firebase.components.Dependency;
import java.util.UUID;

/* loaded from: classes6.dex */
public class fmf {

    /* renamed from: b */
    public static final Component f23677b = Component.builder(fmf.class).add(Dependency.required((Class<?>) kgb.class)).add(Dependency.required((Class<?>) Context.class)).factory(new ComponentFactory() { // from class: o.hkj
        @Override // com.google.firebase.components.ComponentFactory
        public final Object create(ComponentContainer componentContainer) {
            return new fmf((Context) componentContainer.get(Context.class));
        }
    }).build();

    /* renamed from: a */
    public final Context f23678a;

    public fmf(Context context) {
        this.f23678a = context;
    }

    /* renamed from: a */
    public synchronized String m27089a() {
        String string = m27090b().getString("ml_sdk_instance_id", null);
        if (string != null) {
            return string;
        }
        String string2 = UUID.randomUUID().toString();
        m27090b().edit().putString("ml_sdk_instance_id", string2).apply();
        return string2;
    }

    /* renamed from: b */
    public final SharedPreferences m27090b() {
        return this.f23678a.getSharedPreferences("com.google.mlkit.internal", 0);
    }
}
