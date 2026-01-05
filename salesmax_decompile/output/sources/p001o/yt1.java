package p001o;

import java.util.Optional;
import java.util.function.Consumer;

/* loaded from: classes.dex */
public abstract /* synthetic */ class yt1 {
    /* renamed from: a */
    public static /* synthetic */ void m58188a(Optional optional, Consumer consumer, Runnable runnable) {
        if (optional.isPresent()) {
            consumer.accept(optional.get());
        } else {
            runnable.run();
        }
    }
}
