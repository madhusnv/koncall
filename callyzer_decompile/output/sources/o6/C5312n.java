package o6;

import bt.C0778w;
import uw.InterfaceC7559c;
import ww.AbstractC8193c;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: o6.n */
/* loaded from: classes.dex */
public final class C5312n extends AbstractC8193c {

    /* renamed from: a */
    public /* synthetic */ Object f26091a;

    /* renamed from: b */
    public int f26092b;

    /* renamed from: c */
    public final /* synthetic */ C0778w f26093c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5312n(C0778w c0778w, InterfaceC7559c interfaceC7559c) {
        super(interfaceC7559c);
        this.f26093c = c0778w;
    }

    @Override // ww.AbstractC8191a
    public final Object invokeSuspend(Object obj) {
        this.f26091a = obj;
        this.f26092b |= Integer.MIN_VALUE;
        return this.f26093c.emit(null, this);
    }
}
