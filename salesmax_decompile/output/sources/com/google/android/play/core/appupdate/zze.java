package com.google.android.play.core.appupdate;

import android.os.Bundle;
import android.os.ResultReceiver;
import com.google.android.gms.tasks.TaskCompletionSource;

/* loaded from: classes3.dex */
final class zze extends ResultReceiver {

    /* renamed from: a */
    public final /* synthetic */ TaskCompletionSource f13284a;

    @Override // android.os.ResultReceiver
    public final void onReceiveResult(int i, Bundle bundle) {
        if (i == 1) {
            this.f13284a.trySetResult(-1);
        } else if (i != 2) {
            this.f13284a.trySetResult(1);
        } else {
            this.f13284a.trySetResult(0);
        }
    }
}
