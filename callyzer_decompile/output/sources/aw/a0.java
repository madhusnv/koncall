package aw;

import com.websoptimization.callyzerbiz.workManager.RetrieveWebSubscriptionWorkManager;
import kotlin.jvm.internal.C4164v;
import mm.C4802m;
import ww.AbstractC8193c;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes3.dex */
public final class a0 extends AbstractC8193c {

    /* renamed from: a */
    public C4802m f3307a;

    /* renamed from: b */
    public C4164v f3308b;

    /* renamed from: c */
    public C4802m f3309c;

    /* renamed from: d */
    public /* synthetic */ Object f3310d;

    /* renamed from: e */
    public final /* synthetic */ RetrieveWebSubscriptionWorkManager f3311e;

    /* renamed from: f */
    public int f3312f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a0(RetrieveWebSubscriptionWorkManager retrieveWebSubscriptionWorkManager, AbstractC8193c abstractC8193c) {
        super(abstractC8193c);
        this.f3311e = retrieveWebSubscriptionWorkManager;
    }

    @Override // ww.AbstractC8191a
    public final Object invokeSuspend(Object obj) {
        this.f3310d = obj;
        this.f3312f |= Integer.MIN_VALUE;
        return this.f3311e.m5053c(null, this);
    }
}
