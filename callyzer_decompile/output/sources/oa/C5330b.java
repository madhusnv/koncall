package oa;

import qw.C6364n;
import vw.EnumC7794a;
import ww.AbstractC8193c;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: oa.b */
/* loaded from: classes.dex */
public final class C5330b extends AbstractC8193c {

    /* renamed from: a */
    public /* synthetic */ Object f26225a;

    /* renamed from: b */
    public final /* synthetic */ C5331c f26226b;

    /* renamed from: c */
    public int f26227c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5330b(C5331c c5331c, AbstractC8193c abstractC8193c) {
        super(abstractC8193c);
        this.f26226b = c5331c;
    }

    @Override // ww.AbstractC8191a
    public final Object invokeSuspend(Object obj) {
        this.f26225a = obj;
        this.f26227c |= Integer.MIN_VALUE;
        Object objMo16557modifyBeforeCompletiongIAlus = this.f26226b.mo16557modifyBeforeCompletiongIAlus(null, this);
        return objMo16557modifyBeforeCompletiongIAlus == EnumC7794a.COROUTINE_SUSPENDED ? objMo16557modifyBeforeCompletiongIAlus : new C6364n(objMo16557modifyBeforeCompletiongIAlus);
    }
}
