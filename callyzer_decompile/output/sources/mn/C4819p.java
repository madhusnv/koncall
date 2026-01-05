package mn;

import java.io.Serializable;
import qw.C6364n;
import vw.EnumC7794a;
import ww.AbstractC8193c;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: mn.p */
/* loaded from: classes3.dex */
public final class C4819p extends AbstractC8193c {

    /* renamed from: a */
    public /* synthetic */ Object f24046a;

    /* renamed from: b */
    public final /* synthetic */ g0 f24047b;

    /* renamed from: c */
    public int f24048c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4819p(g0 g0Var, AbstractC8193c abstractC8193c) {
        super(abstractC8193c);
        this.f24047b = g0Var;
    }

    @Override // ww.AbstractC8191a
    public final Object invokeSuspend(Object obj) {
        this.f24046a = obj;
        this.f24048c |= Integer.MIN_VALUE;
        Serializable serializableM9764h = this.f24047b.m9764h(false, null, null, false, null, null, 0, this);
        return serializableM9764h == EnumC7794a.COROUTINE_SUSPENDED ? serializableM9764h : new C6364n(serializableM9764h);
    }
}
