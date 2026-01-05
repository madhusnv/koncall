package p001o;

import android.os.Bundle;
import com.google.android.gms.tasks.TaskCompletionSource;

/* loaded from: classes3.dex */
public abstract class xjj extends uij {

    /* renamed from: a */
    public final sjj f53858a;

    /* renamed from: f */
    public final TaskCompletionSource f53859f;

    /* renamed from: g */
    public final /* synthetic */ fkj f53860g;

    public xjj(fkj fkjVar, sjj sjjVar, TaskCompletionSource taskCompletionSource) {
        this.f53860g = fkjVar;
        this.f53858a = sjjVar;
        this.f53859f = taskCompletionSource;
    }

    public void s0(Bundle bundle) {
        this.f53860g.f23569a.m46896u(this.f53859f);
        this.f53858a.m48398c("onRequestInfo", new Object[0]);
    }

    @Override // p001o.zij
    public void zzb(Bundle bundle) {
        this.f53860g.f23569a.m46896u(this.f53859f);
        this.f53858a.m48398c("onCompleteUpdate", new Object[0]);
    }
}
