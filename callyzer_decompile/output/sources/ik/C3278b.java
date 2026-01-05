package ik;

import dy.InterfaceC1853a;
import ww.AbstractC8193c;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: ik.b */
/* loaded from: classes.dex */
public final class C3278b extends AbstractC8193c {

    /* renamed from: a */
    public Object f17475a;

    /* renamed from: b */
    public InterfaceC1853a f17476b;

    /* renamed from: c */
    public /* synthetic */ Object f17477c;

    /* renamed from: d */
    public final /* synthetic */ C3280d f17478d;

    /* renamed from: e */
    public int f17479e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3278b(C3280d c3280d, AbstractC8193c abstractC8193c) {
        super(abstractC8193c);
        this.f17478d = c3280d;
    }

    @Override // ww.AbstractC8191a
    public final Object invokeSuspend(Object obj) {
        this.f17477c = obj;
        this.f17479e |= Integer.MIN_VALUE;
        return this.f17478d.mo7629b(this);
    }
}
