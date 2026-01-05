package xm;

import com.websoptimization.callyzerbiz.data.model.db.SyncCallLogCallRecording;
import com.websoptimization.callyzerbiz.data.model.request.CallRecordingSyncRequest;
import com.websoptimization.callyzerbiz.data.model.response.CallRecordingResponse;
import java.util.Iterator;
import ww.AbstractC8193c;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes3.dex */
public final class h1 extends AbstractC8193c {

    /* renamed from: a */
    public CallRecordingSyncRequest f40364a;

    /* renamed from: b */
    public Iterator f40365b;

    /* renamed from: c */
    public CallRecordingResponse f40366c;

    /* renamed from: d */
    public SyncCallLogCallRecording f40367d;

    /* renamed from: e */
    public int f40368e;

    /* renamed from: f */
    public int f40369f;

    /* renamed from: g */
    public /* synthetic */ Object f40370g;

    /* renamed from: h */
    public final /* synthetic */ x1 f40371h;

    /* renamed from: j */
    public int f40372j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h1(x1 x1Var, AbstractC8193c abstractC8193c) {
        super(abstractC8193c);
        this.f40371h = x1Var;
    }

    @Override // ww.AbstractC8191a
    public final Object invokeSuspend(Object obj) {
        this.f40370g = obj;
        this.f40372j |= Integer.MIN_VALUE;
        return this.f40371h.m15672v(null, null, this);
    }
}
