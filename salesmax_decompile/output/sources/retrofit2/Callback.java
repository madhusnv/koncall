package retrofit2;

import p001o.bre;

/* loaded from: classes6.dex */
public interface Callback<T> {
    void onFailure(Call<T> call, Throwable th);

    void onResponse(Call<T> call, bre breVar);
}
