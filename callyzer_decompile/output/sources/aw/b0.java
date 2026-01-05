package aw;

import com.websoptimization.callyzerbiz.workManager.RetrieveWebSubscriptionWorkManager;
import ww.AbstractC8193c;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes3.dex */
public final class b0 extends AbstractC8193c {

    /* renamed from: a */
    public Object f3316a;

    /* renamed from: b */
    public Throwable f3317b;

    /* renamed from: c */
    public int f3318c;

    /* renamed from: d */
    public /* synthetic */ Object f3319d;

    /* renamed from: e */
    public final /* synthetic */ RetrieveWebSubscriptionWorkManager f3320e;

    /* renamed from: f */
    public int f3321f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b0(RetrieveWebSubscriptionWorkManager retrieveWebSubscriptionWorkManager, AbstractC8193c abstractC8193c) {
        super(abstractC8193c);
        this.f3320e = retrieveWebSubscriptionWorkManager;
    }

    @Override // ww.AbstractC8191a
    public final Object invokeSuspend(Object obj) {
        this.f3319d = obj;
        this.f3321f |= Integer.MIN_VALUE;
        return RetrieveWebSubscriptionWorkManager.m5052b(this.f3320e, this);
    }
}
