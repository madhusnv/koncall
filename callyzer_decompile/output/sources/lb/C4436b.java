package lb;

import uc.C7394a;
import ww.AbstractC8193c;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: lb.b */
/* loaded from: classes.dex */
public final class C4436b extends AbstractC8193c {

    /* renamed from: a */
    public C7394a f22158a;

    /* renamed from: b */
    public /* synthetic */ Object f22159b;

    /* renamed from: c */
    public final /* synthetic */ C4435a f22160c;

    /* renamed from: d */
    public int f22161d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4436b(C4435a c4435a, AbstractC8193c abstractC8193c) {
        super(abstractC8193c);
        this.f22160c = c4435a;
    }

    @Override // ww.AbstractC8191a
    public final Object invokeSuspend(Object obj) {
        this.f22159b = obj;
        this.f22161d |= Integer.MIN_VALUE;
        return this.f22160c.modifyBeforeDeserialization(null, this);
    }
}
