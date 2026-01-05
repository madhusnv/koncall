package xm;

import com.websoptimization.callyzerbiz.data.model.request.SyncCallLogRequest;
import dy.InterfaceC1853a;
import ww.AbstractC8193c;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes3.dex */
public final class r1 extends AbstractC8193c {

    /* renamed from: a */
    public SyncCallLogRequest f40767a;

    /* renamed from: b */
    public InterfaceC1853a f40768b;

    /* renamed from: c */
    public int f40769c;

    /* renamed from: d */
    public /* synthetic */ Object f40770d;

    /* renamed from: e */
    public final /* synthetic */ x1 f40771e;

    /* renamed from: f */
    public int f40772f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r1(x1 x1Var, AbstractC8193c abstractC8193c) {
        super(abstractC8193c);
        this.f40771e = x1Var;
    }

    @Override // ww.AbstractC8191a
    public final Object invokeSuspend(Object obj) {
        this.f40770d = obj;
        this.f40772f |= Integer.MIN_VALUE;
        return this.f40771e.m15654E(null, this);
    }
}
