package p001o;

import java.util.ArrayList;
import java.util.List;

/* loaded from: classes6.dex */
public enum uo0 implements idg, rl7 {
    INSTANCE;

    public static <T, O> rl7 asFunction() {
        return INSTANCE;
    }

    public static <T> idg asSupplier() {
        return INSTANCE;
    }

    @Override // p001o.rl7
    public List<Object> apply(Object obj) {
        return new ArrayList();
    }

    @Override // p001o.idg
    public List<Object> get() {
        return new ArrayList();
    }
}
