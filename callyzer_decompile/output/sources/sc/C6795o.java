package sc;

import wc.InterfaceC7971e;
import ww.AbstractC8193c;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: sc.o */
/* loaded from: classes.dex */
public final class C6795o extends AbstractC8193c {

    /* renamed from: a */
    public C6802v f32302a;

    /* renamed from: b */
    public InterfaceC7971e f32303b;

    /* renamed from: c */
    public /* synthetic */ Object f32304c;

    /* renamed from: d */
    public final /* synthetic */ C6788h f32305d;

    /* renamed from: e */
    public int f32306e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6795o(C6788h c6788h, AbstractC8193c abstractC8193c) {
        super(abstractC8193c);
        this.f32305d = c6788h;
    }

    @Override // ww.AbstractC8191a
    public final Object invokeSuspend(Object obj) {
        this.f32304c = obj;
        this.f32306e |= Integer.MIN_VALUE;
        return this.f32305d.m12979b(null, null, this);
    }
}
