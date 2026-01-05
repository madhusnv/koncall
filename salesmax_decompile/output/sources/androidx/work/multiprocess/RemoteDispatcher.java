package androidx.work.multiprocess;

import android.annotation.SuppressLint;

@SuppressLint({"LambdaLast"})
/* loaded from: classes2.dex */
public interface RemoteDispatcher<T> {
    void execute(T t, IWorkManagerImplCallback iWorkManagerImplCallback);
}
