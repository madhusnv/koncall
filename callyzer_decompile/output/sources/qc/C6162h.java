package qc;

import ic.InterfaceC3227e;
import ww.AbstractC8193c;
import zb.InterfaceC8914h;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: qc.h */
/* loaded from: classes.dex */
public final class C6162h extends AbstractC8193c {

    /* renamed from: a */
    public InterfaceC8914h f30028a;

    /* renamed from: b */
    public String f30029b;

    /* renamed from: c */
    public InterfaceC3227e f30030c;

    /* renamed from: d */
    public InterfaceC3227e f30031d;

    /* renamed from: e */
    public /* synthetic */ Object f30032e;

    /* renamed from: f */
    public final /* synthetic */ AbstractC6163i f30033f;

    /* renamed from: g */
    public int f30034g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6162h(AbstractC6163i abstractC6163i, AbstractC8193c abstractC8193c) {
        super(abstractC8193c);
        this.f30033f = abstractC6163i;
    }

    @Override // ww.AbstractC8191a
    public final Object invokeSuspend(Object obj) {
        this.f30032e = obj;
        this.f30034g |= Integer.MIN_VALUE;
        return AbstractC6163i.m12199a(this.f30033f, null, this);
    }
}
