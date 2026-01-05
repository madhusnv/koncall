package oa;

import qw.C6364n;
import vw.EnumC7794a;
import ww.AbstractC8193c;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: oa.a */
/* loaded from: classes.dex */
public final class C5329a extends AbstractC8193c {

    /* renamed from: a */
    public /* synthetic */ Object f26222a;

    /* renamed from: b */
    public final /* synthetic */ C5331c f26223b;

    /* renamed from: c */
    public int f26224c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5329a(C5331c c5331c, AbstractC8193c abstractC8193c) {
        super(abstractC8193c);
        this.f26223b = c5331c;
    }

    @Override // ww.AbstractC8191a
    public final Object invokeSuspend(Object obj) {
        this.f26222a = obj;
        this.f26224c |= Integer.MIN_VALUE;
        Object objMo16556modifyBeforeAttemptCompletiongIAlus = this.f26223b.mo16556modifyBeforeAttemptCompletiongIAlus(null, this);
        return objMo16556modifyBeforeAttemptCompletiongIAlus == EnumC7794a.COROUTINE_SUSPENDED ? objMo16556modifyBeforeAttemptCompletiongIAlus : new C6364n(objMo16556modifyBeforeAttemptCompletiongIAlus);
    }
}
