package p001o;

import java.io.Serializable;
import java.util.function.Supplier;

/* loaded from: classes6.dex */
public interface vk7 extends Serializable, Supplier {
    Object apply();

    @Override // java.util.function.Supplier
    default Object get() {
        return apply();
    }
}
