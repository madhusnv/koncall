package kb;

import gb.InterfaceC2556f;
import ww.AbstractC8193c;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: kb.b */
/* loaded from: classes.dex */
public final class C4038b extends AbstractC8193c {

    /* renamed from: a */
    public InterfaceC2556f f20861a;

    /* renamed from: b */
    public Object f20862b;

    /* renamed from: c */
    public /* synthetic */ Object f20863c;

    /* renamed from: d */
    public final /* synthetic */ C4040d f20864d;

    /* renamed from: e */
    public int f20865e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4038b(C4040d c4040d, AbstractC8193c abstractC8193c) {
        super(abstractC8193c);
        this.f20864d = c4040d;
    }

    @Override // ww.AbstractC8191a
    public final Object invokeSuspend(Object obj) {
        this.f20863c = obj;
        this.f20865e |= Integer.MIN_VALUE;
        return this.f20864d.resolve(null, this);
    }
}
