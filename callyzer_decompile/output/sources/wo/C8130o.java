package wo;

import com.websoptimization.callyzerbiz.data.model.request.SyncCallLogRequest;
import im.i1;
import mm.C4802m;
import ww.AbstractC8193c;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: wo.o */
/* loaded from: classes3.dex */
public final class C8130o extends AbstractC8193c {

    /* renamed from: a */
    public C4802m f38928a;

    /* renamed from: b */
    public SyncCallLogRequest f38929b;

    /* renamed from: c */
    public i1 f38930c;

    /* renamed from: d */
    public int f38931d;

    /* renamed from: e */
    public /* synthetic */ Object f38932e;

    /* renamed from: f */
    public final /* synthetic */ C8134s f38933f;

    /* renamed from: g */
    public int f38934g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C8130o(C8134s c8134s, AbstractC8193c abstractC8193c) {
        super(abstractC8193c);
        this.f38933f = c8134s;
    }

    @Override // ww.AbstractC8191a
    public final Object invokeSuspend(Object obj) {
        this.f38932e = obj;
        this.f38934g |= Integer.MIN_VALUE;
        return this.f38933f.m15314r(null, 0, null, null, this);
    }
}
