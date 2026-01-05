package aw;

import com.websoptimization.callyzerbiz.workManager.RetrieveWebSubscriptionWorkManager;
import ww.AbstractC8193c;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: aw.z */
/* loaded from: classes3.dex */
public final class C0486z extends AbstractC8193c {

    /* renamed from: a */
    public /* synthetic */ Object f3467a;

    /* renamed from: b */
    public final /* synthetic */ RetrieveWebSubscriptionWorkManager f3468b;

    /* renamed from: c */
    public int f3469c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0486z(RetrieveWebSubscriptionWorkManager retrieveWebSubscriptionWorkManager, AbstractC8193c abstractC8193c) {
        super(abstractC8193c);
        this.f3468b = retrieveWebSubscriptionWorkManager;
    }

    @Override // ww.AbstractC8191a
    public final Object invokeSuspend(Object obj) {
        this.f3467a = obj;
        this.f3469c |= Integer.MIN_VALUE;
        return RetrieveWebSubscriptionWorkManager.m5051a(this.f3468b, this);
    }
}
