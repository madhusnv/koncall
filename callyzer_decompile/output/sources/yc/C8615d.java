package yc;

import sc.C6788h;
import wc.InterfaceC7971e;
import ww.AbstractC8193c;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: yc.d */
/* loaded from: classes.dex */
public final class C8615d extends AbstractC8193c {

    /* renamed from: a */
    public InterfaceC7971e f41879a;

    /* renamed from: b */
    public /* synthetic */ Object f41880b;

    /* renamed from: c */
    public final /* synthetic */ C6788h f41881c;

    /* renamed from: d */
    public int f41882d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C8615d(C6788h c6788h, AbstractC8193c abstractC8193c) {
        super(abstractC8193c);
        this.f41881c = c6788h;
    }

    @Override // ww.AbstractC8191a
    public final Object invokeSuspend(Object obj) {
        this.f41880b = obj;
        this.f41882d |= Integer.MIN_VALUE;
        return this.f41881c.mo12192a(null, null, this);
    }
}
