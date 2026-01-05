package aw;

import com.websoptimization.callyzerbiz.workManager.RecordingFindManager;
import ww.AbstractC8193c;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: aw.s */
/* loaded from: classes3.dex */
public final class C0479s extends AbstractC8193c {

    /* renamed from: a */
    public boolean f3433a;

    /* renamed from: b */
    public /* synthetic */ Object f3434b;

    /* renamed from: c */
    public final /* synthetic */ RecordingFindManager f3435c;

    /* renamed from: d */
    public int f3436d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0479s(RecordingFindManager recordingFindManager, AbstractC8193c abstractC8193c) {
        super(abstractC8193c);
        this.f3435c = recordingFindManager;
    }

    @Override // ww.AbstractC8191a
    public final Object invokeSuspend(Object obj) {
        this.f3434b = obj;
        this.f3436d |= Integer.MIN_VALUE;
        return this.f3435c.doWork(this);
    }
}
