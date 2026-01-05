package fk;

import uw.InterfaceC7559c;
import ww.AbstractC8193c;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class g1 extends AbstractC8193c {

    /* renamed from: a */
    public String f10396a;

    /* renamed from: b */
    public d1 f10397b;

    /* renamed from: c */
    public /* synthetic */ Object f10398c;

    /* renamed from: d */
    public final /* synthetic */ h1 f10399d;

    /* renamed from: e */
    public int f10400e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g1(h1 h1Var, InterfaceC7559c interfaceC7559c) {
        super(interfaceC7559c);
        this.f10399d = h1Var;
    }

    @Override // ww.AbstractC8191a
    public final Object invokeSuspend(Object obj) {
        this.f10398c = obj;
        this.f10400e |= Integer.MIN_VALUE;
        return h1.m5971a(this.f10399d, null, null, this);
    }
}
