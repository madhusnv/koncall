package p001o;

import java.util.Objects;
import java.util.Spliterator;
import java.util.Spliterators;
import java.util.function.Consumer;
import java.util.function.Supplier;

/* loaded from: classes6.dex */
public interface uri extends Iterable {
    default Object B2(Supplier supplier) {
        Objects.requireNonNull(supplier, "supplier is null");
        return isEmpty() ? supplier.get() : get();
    }

    /* renamed from: C */
    default Object m51980C(Object obj) {
        return isEmpty() ? obj : get();
    }

    /* renamed from: Q */
    default Object m51981Q() {
        if (isEmpty()) {
            return null;
        }
        return get();
    }

    @Override // java.lang.Iterable
    default void forEach(Consumer consumer) {
        Objects.requireNonNull(consumer, "action is null");
        b69 it = iterator();
        while (it.hasNext()) {
            consumer.accept(it.next());
        }
    }

    Object get();

    boolean isEmpty();

    @Override // java.lang.Iterable
    b69 iterator();

    @Override // java.lang.Iterable
    default Spliterator spliterator() {
        return Spliterators.spliterator(iterator(), isEmpty() ? 0L : 1L, 17488);
    }
}
