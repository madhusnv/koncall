package aw;

import com.websoptimization.callyzerbiz.workManager.RetrieveWebSubscriptionWorkManager;
import java.util.Iterator;
import ww.AbstractC8193c;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: aw.y */
/* loaded from: classes3.dex */
public final class C0485y extends AbstractC8193c {

    /* renamed from: a */
    public Iterator f3462a;

    /* renamed from: b */
    public int f3463b;

    /* renamed from: c */
    public /* synthetic */ Object f3464c;

    /* renamed from: d */
    public final /* synthetic */ RetrieveWebSubscriptionWorkManager f3465d;

    /* renamed from: e */
    public int f3466e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0485y(RetrieveWebSubscriptionWorkManager retrieveWebSubscriptionWorkManager, AbstractC8193c abstractC8193c) {
        super(abstractC8193c);
        this.f3465d = retrieveWebSubscriptionWorkManager;
    }

    @Override // ww.AbstractC8191a
    public final Object invokeSuspend(Object obj) {
        this.f3464c = obj;
        this.f3466e |= Integer.MIN_VALUE;
        return this.f3465d.doWork(this);
    }
}
