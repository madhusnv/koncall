package aw;

import com.websoptimization.callyzerbiz.workManager.RecordingCompressManager;
import ww.AbstractC8193c;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: aw.l */
/* loaded from: classes3.dex */
public final class C0472l extends AbstractC8193c {

    /* renamed from: a */
    public /* synthetic */ Object f3387a;

    /* renamed from: b */
    public final /* synthetic */ RecordingCompressManager f3388b;

    /* renamed from: c */
    public int f3389c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0472l(RecordingCompressManager recordingCompressManager, AbstractC8193c abstractC8193c) {
        super(abstractC8193c);
        this.f3388b = recordingCompressManager;
    }

    @Override // ww.AbstractC8191a
    public final Object invokeSuspend(Object obj) {
        this.f3387a = obj;
        this.f3389c |= Integer.MIN_VALUE;
        return this.f3388b.doWork(this);
    }
}
