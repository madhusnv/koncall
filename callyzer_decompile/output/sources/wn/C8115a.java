package wn;

import bt.C0778w;
import uw.InterfaceC7559c;
import ww.AbstractC8193c;

/* renamed from: wn.a */
/* loaded from: classes3.dex */
public final class C8115a extends AbstractC8193c {

    /* renamed from: a */
    public /* synthetic */ Object f38844a;

    /* renamed from: b */
    public int f38845b;

    /* renamed from: c */
    public final /* synthetic */ C0778w f38846c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C8115a(C0778w c0778w, InterfaceC7559c interfaceC7559c) {
        super(interfaceC7559c);
        this.f38846c = c0778w;
    }

    @Override // ww.AbstractC8191a
    public final Object invokeSuspend(Object obj) {
        this.f38844a = obj;
        this.f38845b |= Integer.MIN_VALUE;
        return this.f38846c.emit(null, this);
    }
}
