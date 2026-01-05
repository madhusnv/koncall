package p001o;

import java.util.concurrent.Executor;
import java.util.concurrent.Future;

/* loaded from: classes3.dex */
public interface zfa extends Future {
    void addListener(Runnable runnable, Executor executor);
}
