package p001o;

import java.io.Serializable;
import java.util.Objects;
import java.util.function.BiFunction;
import java.util.function.Function;

/* loaded from: classes6.dex */
public interface ll7 extends Serializable, BiFunction {
    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: n */
    /* synthetic */ default Object m37426n(Function function, Object obj, Object obj2) {
        return function.apply(apply(obj, obj2));
    }

    Object apply(Object obj, Object obj2);

    @Override // java.util.function.BiFunction
    default ll7 andThen(Function function) {
        Objects.requireNonNull(function, "after is null");
        return new il7(this, function);
    }
}
