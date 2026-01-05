package p001o;

import android.os.RemoteException;
import com.google.android.gms.tasks.TaskCompletionSource;

/* loaded from: classes3.dex */
public final class tjj extends ujj {

    /* renamed from: b */
    public final /* synthetic */ String f47316b;

    /* renamed from: c */
    public final /* synthetic */ TaskCompletionSource f47317c;

    /* renamed from: d */
    public final /* synthetic */ fkj f47318d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tjj(fkj fkjVar, TaskCompletionSource taskCompletionSource, String str, TaskCompletionSource taskCompletionSource2) {
        super(taskCompletionSource);
        this.f47318d = fkjVar;
        this.f47316b = str;
        this.f47317c = taskCompletionSource2;
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [android.os.IInterface, o.tij] */
    @Override // p001o.ujj
    /* renamed from: a */
    public final void mo19307a() {
        try {
            ?? M46893e = this.f47318d.f23569a.m46893e();
            fkj fkjVar = this.f47318d;
            M46893e.x0(fkjVar.f23570b, fkj.m26973b(fkjVar, this.f47316b), new ckj(this.f47318d, this.f47317c, this.f47316b));
        } catch (RemoteException e) {
            fkj.f23567e.m48397b(e, "requestUpdateInfo(%s)", this.f47316b);
            this.f47317c.trySetException(new RuntimeException(e));
        }
    }
}
