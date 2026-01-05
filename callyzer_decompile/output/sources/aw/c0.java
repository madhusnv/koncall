package aw;

import com.websoptimization.callyzerbiz.workManager.SubmitContactUsFormWorkManager;
import ww.AbstractC8193c;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes3.dex */
public final class c0 extends AbstractC8193c {

    /* renamed from: a */
    public /* synthetic */ Object f3329a;

    /* renamed from: b */
    public final /* synthetic */ SubmitContactUsFormWorkManager f3330b;

    /* renamed from: c */
    public int f3331c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c0(SubmitContactUsFormWorkManager submitContactUsFormWorkManager, AbstractC8193c abstractC8193c) {
        super(abstractC8193c);
        this.f3330b = submitContactUsFormWorkManager;
    }

    @Override // ww.AbstractC8191a
    public final Object invokeSuspend(Object obj) {
        this.f3329a = obj;
        this.f3331c |= Integer.MIN_VALUE;
        return this.f3330b.doWork(this);
    }
}
