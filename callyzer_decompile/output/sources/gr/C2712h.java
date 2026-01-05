package gr;

import im.EnumC3310l;
import uw.InterfaceC7559c;
import ww.AbstractC8193c;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: gr.h */
/* loaded from: classes3.dex */
public final class C2712h extends AbstractC8193c {

    /* renamed from: a */
    public EnumC3310l f15123a;

    /* renamed from: b */
    public /* synthetic */ Object f15124b;

    /* renamed from: c */
    public final /* synthetic */ C2713i f15125c;

    /* renamed from: d */
    public int f15126d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2712h(C2713i c2713i, InterfaceC7559c interfaceC7559c) {
        super(interfaceC7559c);
        this.f15125c = c2713i;
    }

    @Override // ww.AbstractC8191a
    public final Object invokeSuspend(Object obj) {
        this.f15124b = obj;
        this.f15126d |= Integer.MIN_VALUE;
        return C2713i.m6712e(this.f15125c, null, this);
    }
}
