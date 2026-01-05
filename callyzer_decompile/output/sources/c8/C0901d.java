package c8;

import l8.InterfaceC4427a;
import ww.AbstractC8193c;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: c8.d */
/* loaded from: classes.dex */
public final class C0901d extends AbstractC8193c {

    /* renamed from: a */
    public C0902e f5554a;

    /* renamed from: b */
    public InterfaceC4427a f5555b;

    /* renamed from: c */
    public /* synthetic */ Object f5556c;

    /* renamed from: d */
    public final /* synthetic */ C0902e f5557d;

    /* renamed from: e */
    public int f5558e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0901d(C0902e c0902e, AbstractC8193c abstractC8193c) {
        super(abstractC8193c);
        this.f5557d = c0902e;
    }

    @Override // ww.AbstractC8191a
    public final Object invokeSuspend(Object obj) {
        this.f5556c = obj;
        this.f5558e |= Integer.MIN_VALUE;
        return this.f5557d.m2541e(null, null, this);
    }
}
