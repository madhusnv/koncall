package p001o;

import android.os.Bundle;
import com.google.android.gms.tasks.TaskCompletionSource;

/* loaded from: classes3.dex */
public final class ckj extends xjj {

    /* renamed from: h */
    public final String f18277h;

    /* renamed from: i */
    public final /* synthetic */ fkj f18278i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ckj(fkj fkjVar, TaskCompletionSource taskCompletionSource, String str) {
        super(fkjVar, new sjj("OnRequestInstallCallback"), taskCompletionSource);
        this.f18278i = fkjVar;
        this.f18277h = str;
    }

    @Override // p001o.xjj, p001o.zij
    public final void s0(Bundle bundle) {
        super.s0(bundle);
        if (bundle.getInt("error.code", -2) != 0) {
            this.f53859f.trySetException(new yj8(bundle.getInt("error.code", -2)));
        } else {
            this.f53859f.trySetResult(fkj.m26974d(this.f18278i, bundle, this.f18277h));
        }
    }
}
