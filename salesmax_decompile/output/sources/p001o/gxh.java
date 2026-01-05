package p001o;

import java.util.Objects;
import java.util.Spliterator;
import java.util.Spliterators;
import java.util.function.BiFunction;

/* loaded from: classes6.dex */
public interface gxh extends uri {
    default boolean F1() {
        return false;
    }

    default boolean I2() {
        return false;
    }

    default Object c3(Object obj, BiFunction biFunction) {
        Objects.requireNonNull(biFunction, "f is null");
        b69 it = iterator();
        while (it.hasNext()) {
            obj = biFunction.apply(obj, it.next());
        }
        return obj;
    }

    /* renamed from: h */
    boolean mo18197h();

    @Override // p001o.uri, java.lang.Iterable
    b69 iterator();

    int length();

    @Override // p001o.uri, java.lang.Iterable
    default Spliterator spliterator() {
        int i = F1() ? 1025 : 1024;
        if (I2()) {
            i |= 20;
        }
        if (mo18198t()) {
            i |= 16;
        }
        if (mo18197h()) {
            return Spliterators.spliterator(iterator(), length(), i | 16448);
        }
        return Spliterators.spliteratorUnknownSize(iterator(), i);
    }

    /* renamed from: t */
    boolean mo18198t();
}
