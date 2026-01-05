package wo;

import com.websoptimization.callyzerbiz.data.model.request.SyncCallLogRequest;
import com.websoptimization.callyzerbiz.data.model.response.SyncResponse;
import j$.time.LocalDateTime;
import kotlin.jvm.internal.C4166x;
import mm.C4802m;
import ww.AbstractC8193c;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: wo.k */
/* loaded from: classes3.dex */
public final class C8126k extends AbstractC8193c {

    /* renamed from: a */
    public C4802m f38897a;

    /* renamed from: b */
    public LocalDateTime f38898b;

    /* renamed from: c */
    public LocalDateTime f38899c;

    /* renamed from: d */
    public SyncResponse f38900d;

    /* renamed from: e */
    public C4166x f38901e;

    /* renamed from: f */
    public SyncCallLogRequest f38902f;

    /* renamed from: g */
    public int f38903g;

    /* renamed from: h */
    public /* synthetic */ Object f38904h;

    /* renamed from: j */
    public final /* synthetic */ C8134s f38905j;

    /* renamed from: k */
    public int f38906k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C8126k(C8134s c8134s, AbstractC8193c abstractC8193c) {
        super(abstractC8193c);
        this.f38905j = c8134s;
    }

    @Override // ww.AbstractC8191a
    public final Object invokeSuspend(Object obj) {
        this.f38904h = obj;
        this.f38906k |= Integer.MIN_VALUE;
        return C8134s.m15298b(this.f38905j, null, null, null, this);
    }
}
