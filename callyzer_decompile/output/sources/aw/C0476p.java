package aw;

import com.websoptimization.callyzerbiz.workManager.RecordingCompressManager;
import tx.C7263w;
import tx.InterfaceC7264x;
import uw.AbstractC7557a;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: aw.p */
/* loaded from: classes3.dex */
public final class C0476p extends AbstractC7557a implements InterfaceC7264x {

    /* renamed from: b */
    public final /* synthetic */ int f3410b = 0;

    /* renamed from: c */
    public final /* synthetic */ Object f3411c;

    /* JADX WARN: Illegal instructions before constructor call */
    public C0476p(RecordingCompressManager recordingCompressManager) {
        C7263w c7263w = C7263w.f34688a;
        this.f3411c = recordingCompressManager;
        super(c7263w);
    }

    @Override // tx.InterfaceC7264x
    /* renamed from: P */
    public final void mo1477P(Throwable th2) {
        switch (this.f3410b) {
            case 0:
                ((RecordingCompressManager) this.f3411c).f7453b.m16234i("############ Exception caught on Coroutine ########", th2);
                break;
            default:
                ((rn.h0) this.f3411c).f31531m.m16234i("############ Exception caught on CallRecordingUseCase ########", th2);
                break;
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public C0476p(rn.h0 h0Var) {
        C7263w c7263w = C7263w.f34688a;
        this.f3411c = h0Var;
        super(c7263w);
    }
}
