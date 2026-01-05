package aw;

import com.websoptimization.callyzerbiz.workManager.RecordingCompressManager;
import java.io.File;
import kn.C4121a;
import ww.AbstractC8193c;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: aw.h */
/* loaded from: classes3.dex */
public final class C0468h extends AbstractC8193c {

    /* renamed from: a */
    public C4121a f3363a;

    /* renamed from: b */
    public String f3364b;

    /* renamed from: c */
    public File f3365c;

    /* renamed from: d */
    public /* synthetic */ Object f3366d;

    /* renamed from: e */
    public final /* synthetic */ RecordingCompressManager f3367e;

    /* renamed from: f */
    public int f3368f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0468h(RecordingCompressManager recordingCompressManager, AbstractC8193c abstractC8193c) {
        super(abstractC8193c);
        this.f3367e = recordingCompressManager;
    }

    @Override // ww.AbstractC8191a
    public final Object invokeSuspend(Object obj) {
        this.f3366d = obj;
        this.f3368f |= Integer.MIN_VALUE;
        return this.f3367e.m5044c(null, null, null, this);
    }
}
