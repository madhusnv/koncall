package yd;

import dy.InterfaceC1857e;
import ww.AbstractC8193c;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: yd.c */
/* loaded from: classes.dex */
public final class C8620c extends AbstractC8193c {

    /* renamed from: a */
    public Object f41886a;

    /* renamed from: b */
    public InterfaceC1857e f41887b;

    /* renamed from: c */
    public /* synthetic */ Object f41888c;

    /* renamed from: d */
    public final /* synthetic */ C8621d f41889d;

    /* renamed from: e */
    public int f41890e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C8620c(C8621d c8621d, AbstractC8193c abstractC8193c) {
        super(abstractC8193c);
        this.f41889d = c8621d;
    }

    @Override // ww.AbstractC8191a
    public final Object invokeSuspend(Object obj) {
        this.f41888c = obj;
        this.f41890e |= Integer.MIN_VALUE;
        return this.f41889d.m15960b(this);
    }
}
