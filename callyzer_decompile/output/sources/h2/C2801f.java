package h2;

import b8.C0614i;
import uw.InterfaceC7559c;
import ww.AbstractC8193c;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: h2.f */
/* loaded from: classes.dex */
public final class C2801f extends AbstractC8193c {

    /* renamed from: a */
    public C0614i f15699a;

    /* renamed from: b */
    public Object f15700b;

    /* renamed from: c */
    public /* synthetic */ Object f15701c;

    /* renamed from: d */
    public final /* synthetic */ C0614i f15702d;

    /* renamed from: e */
    public int f15703e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2801f(C0614i c0614i, InterfaceC7559c interfaceC7559c) {
        super(interfaceC7559c);
        this.f15702d = c0614i;
    }

    @Override // ww.AbstractC8191a
    public final Object invokeSuspend(Object obj) {
        this.f15701c = obj;
        this.f15703e |= Integer.MIN_VALUE;
        return this.f15702d.emit(null, this);
    }
}
