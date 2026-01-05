package retrofit2;

import p001o.bre;
import p001o.nmh;
import p001o.ule;

/* loaded from: classes6.dex */
public interface Call<T> extends Cloneable {
    void cancel();

    /* renamed from: clone */
    Call<T> mo69004clone();

    void enqueue(Callback<T> callback);

    bre execute();

    boolean isCanceled();

    boolean isExecuted();

    ule request();

    nmh timeout();
}
