package xd;

import bt.C0778w;
import uw.InterfaceC7559c;
import ww.AbstractC8193c;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: xd.m */
/* loaded from: classes.dex */
public final class C8342m extends AbstractC8193c {

    /* renamed from: a */
    public /* synthetic */ Object f39955a;

    /* renamed from: b */
    public int f39956b;

    /* renamed from: c */
    public final /* synthetic */ C0778w f39957c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C8342m(C0778w c0778w, InterfaceC7559c interfaceC7559c) {
        super(interfaceC7559c);
        this.f39957c = c0778w;
    }

    @Override // ww.AbstractC8191a
    public final Object invokeSuspend(Object obj) {
        this.f39955a = obj;
        this.f39956b |= Integer.MIN_VALUE;
        return this.f39957c.emit(null, this);
    }
}
