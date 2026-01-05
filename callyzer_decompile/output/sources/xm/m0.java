package xm;

import com.websoptimization.callyzerbiz.data.model.response.CallSyncSubscriptionExpiredResponse;
import mm.C4802m;
import ww.AbstractC8193c;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes3.dex */
public final class m0 extends AbstractC8193c {

    /* renamed from: a */
    public CallSyncSubscriptionExpiredResponse f40557a;

    /* renamed from: b */
    public C4802m f40558b;

    /* renamed from: c */
    public /* synthetic */ Object f40559c;

    /* renamed from: d */
    public final /* synthetic */ x1 f40560d;

    /* renamed from: e */
    public int f40561e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m0(x1 x1Var, AbstractC8193c abstractC8193c) {
        super(abstractC8193c);
        this.f40560d = x1Var;
    }

    @Override // ww.AbstractC8191a
    public final Object invokeSuspend(Object obj) {
        this.f40559c = obj;
        this.f40561e |= Integer.MIN_VALUE;
        return x1.m15642b(this.f40560d, null, null, this);
    }
}
