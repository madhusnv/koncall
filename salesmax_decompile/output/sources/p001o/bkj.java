package p001o;

import com.google.android.gms.tasks.TaskCompletionSource;

/* loaded from: classes3.dex */
public final class bkj extends ujj {

    /* renamed from: b */
    public final /* synthetic */ TaskCompletionSource f16466b;

    /* renamed from: c */
    public final /* synthetic */ ujj f16467c;

    /* renamed from: d */
    public final /* synthetic */ rkj f16468d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bkj(rkj rkjVar, TaskCompletionSource taskCompletionSource, TaskCompletionSource taskCompletionSource2, ujj ujjVar) {
        super(taskCompletionSource);
        this.f16468d = rkjVar;
        this.f16466b = taskCompletionSource2;
        this.f16467c = ujjVar;
    }

    @Override // p001o.ujj
    /* renamed from: a */
    public final void mo19307a() {
        synchronized (this.f16468d.f43746f) {
            rkj.m46887n(this.f16468d, this.f16466b);
            if (this.f16468d.f43751k.getAndIncrement() > 0) {
                this.f16468d.f43742b.m48398c("Already connected to the service.", new Object[0]);
            }
            rkj.m46889p(this.f16468d, this.f16467c);
        }
    }
}
