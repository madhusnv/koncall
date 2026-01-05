package mq;

import qw.C6364n;
import vw.EnumC7794a;
import ww.AbstractC8193c;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes3.dex */
public final class t0 extends AbstractC8193c {

    /* renamed from: a */
    public int f24318a;

    /* renamed from: b */
    public int f24319b;

    /* renamed from: c */
    public Object f24320c;

    /* renamed from: d */
    public /* synthetic */ Object f24321d;

    /* renamed from: e */
    public final /* synthetic */ a1 f24322e;

    /* renamed from: f */
    public int f24323f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t0(a1 a1Var, AbstractC8193c abstractC8193c) {
        super(abstractC8193c);
        this.f24322e = a1Var;
    }

    @Override // ww.AbstractC8191a
    public final Object invokeSuspend(Object obj) {
        this.f24321d = obj;
        this.f24323f |= Integer.MIN_VALUE;
        Object objM9788e = a1.m9788e(this.f24322e, 0, 0, this);
        return objM9788e == EnumC7794a.COROUTINE_SUSPENDED ? objM9788e : new C6364n(objM9788e);
    }
}
