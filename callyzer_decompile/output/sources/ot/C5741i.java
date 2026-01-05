package ot;

import bt.C0778w;
import uw.InterfaceC7559c;
import ww.AbstractC8193c;

/* renamed from: ot.i */
/* loaded from: classes3.dex */
public final class C5741i extends AbstractC8193c {

    /* renamed from: a */
    public /* synthetic */ Object f28289a;

    /* renamed from: b */
    public int f28290b;

    /* renamed from: c */
    public final /* synthetic */ C0778w f28291c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5741i(C0778w c0778w, InterfaceC7559c interfaceC7559c) {
        super(interfaceC7559c);
        this.f28291c = c0778w;
    }

    @Override // ww.AbstractC8191a
    public final Object invokeSuspend(Object obj) {
        this.f28289a = obj;
        this.f28290b |= Integer.MIN_VALUE;
        return this.f28291c.emit(null, this);
    }
}
