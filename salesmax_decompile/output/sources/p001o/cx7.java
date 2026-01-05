package p001o;

import java.util.HashMap;
import java.util.Map;

/* loaded from: classes6.dex */
public enum cx7 implements idg {
    INSTANCE;

    public static <K, V> idg asSupplier() {
        return INSTANCE;
    }

    @Override // p001o.idg
    public Map<Object, Object> get() {
        return new HashMap();
    }
}
