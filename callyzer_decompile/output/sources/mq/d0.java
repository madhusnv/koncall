package mq;

import dy.InterfaceC1853a;
import ww.AbstractC8193c;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes3.dex */
public final class d0 extends AbstractC8193c {

    /* renamed from: a */
    public InterfaceC1853a f24195a;

    /* renamed from: b */
    public int f24196b;

    /* renamed from: c */
    public /* synthetic */ Object f24197c;

    /* renamed from: d */
    public final /* synthetic */ h0 f24198d;

    /* renamed from: e */
    public int f24199e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d0(h0 h0Var, AbstractC8193c abstractC8193c) {
        super(abstractC8193c);
        this.f24198d = h0Var;
    }

    @Override // ww.AbstractC8191a
    public final Object invokeSuspend(Object obj) {
        this.f24197c = obj;
        this.f24199e |= Integer.MIN_VALUE;
        return h0.m9795g(this.f24198d, this);
    }
}
