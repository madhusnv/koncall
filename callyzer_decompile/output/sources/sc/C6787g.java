package sc;

import wc.InterfaceC7971e;
import ww.AbstractC8193c;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: sc.g */
/* loaded from: classes.dex */
public final class C6787g extends AbstractC8193c {

    /* renamed from: a */
    public C6802v f32285a;

    /* renamed from: b */
    public InterfaceC7971e f32286b;

    /* renamed from: c */
    public /* synthetic */ Object f32287c;

    /* renamed from: d */
    public final /* synthetic */ C6788h f32288d;

    /* renamed from: e */
    public int f32289e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6787g(C6788h c6788h, AbstractC8193c abstractC8193c) {
        super(abstractC8193c);
        this.f32288d = c6788h;
    }

    @Override // ww.AbstractC8191a
    public final Object invokeSuspend(Object obj) {
        this.f32287c = obj;
        this.f32289e |= Integer.MIN_VALUE;
        return this.f32288d.m12979b(null, null, this);
    }
}
