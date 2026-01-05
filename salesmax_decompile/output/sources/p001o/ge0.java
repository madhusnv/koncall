package p001o;

import android.os.Looper;
import java.util.List;
import kotlinx.coroutines.internal.MainDispatcherFactory;

/* loaded from: classes6.dex */
public final class ge0 implements MainDispatcherFactory {
    @Override // kotlinx.coroutines.internal.MainDispatcherFactory
    /* renamed from: a */
    public String mo16252a() {
        return "For tests Dispatchers.setMain from kotlinx-coroutines-test module can be used";
    }

    @Override // kotlinx.coroutines.internal.MainDispatcherFactory
    /* renamed from: b */
    public jpa mo16253b(List list) {
        Looper mainLooper = Looper.getMainLooper();
        if (mainLooper != null) {
            return new pw7(rw7.m47208a(mainLooper, true), null, 2, null);
        }
        throw new IllegalStateException("The main looper is not available");
    }

    @Override // kotlinx.coroutines.internal.MainDispatcherFactory
    /* renamed from: c */
    public int mo16254c() {
        return 1073741823;
    }
}
