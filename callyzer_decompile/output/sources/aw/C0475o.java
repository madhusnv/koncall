package aw;

import android.media.MediaExtractor;
import com.websoptimization.callyzerbiz.workManager.RecordingCompressManager;
import kn.C4121a;
import kotlin.jvm.internal.C4168z;
import ww.AbstractC8193c;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: aw.o */
/* loaded from: classes3.dex */
public final class C0475o extends AbstractC8193c {

    /* renamed from: a */
    public C4121a f3402a;

    /* renamed from: b */
    public C4168z f3403b;

    /* renamed from: c */
    public MediaExtractor f3404c;

    /* renamed from: d */
    public Exception f3405d;

    /* renamed from: e */
    public int f3406e;

    /* renamed from: f */
    public /* synthetic */ Object f3407f;

    /* renamed from: g */
    public final /* synthetic */ RecordingCompressManager f3408g;

    /* renamed from: h */
    public int f3409h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0475o(RecordingCompressManager recordingCompressManager, AbstractC8193c abstractC8193c) {
        super(abstractC8193c);
        this.f3408g = recordingCompressManager;
    }

    @Override // ww.AbstractC8191a
    public final Object invokeSuspend(Object obj) {
        this.f3407f = obj;
        this.f3409h |= Integer.MIN_VALUE;
        return RecordingCompressManager.m5043b(this.f3408g, null, this);
    }
}
