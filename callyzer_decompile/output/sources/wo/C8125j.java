package wo;

import qw.C6364n;
import uw.InterfaceC7559c;
import vw.EnumC7794a;
import ww.AbstractC8193c;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: wo.j */
/* loaded from: classes3.dex */
public final class C8125j extends AbstractC8193c {

    /* renamed from: a */
    public String f38891a;

    /* renamed from: b */
    public C8134s f38892b;

    /* renamed from: c */
    public int f38893c;

    /* renamed from: d */
    public /* synthetic */ Object f38894d;

    /* renamed from: e */
    public final /* synthetic */ C8134s f38895e;

    /* renamed from: f */
    public int f38896f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C8125j(C8134s c8134s, InterfaceC7559c interfaceC7559c) {
        super(interfaceC7559c);
        this.f38895e = c8134s;
    }

    @Override // ww.AbstractC8191a
    public final Object invokeSuspend(Object obj) {
        this.f38894d = obj;
        this.f38896f |= Integer.MIN_VALUE;
        Object objM15311n = this.f38895e.m15311n(null, null, null, null, this);
        return objM15311n == EnumC7794a.COROUTINE_SUSPENDED ? objM15311n : new C6364n(objM15311n);
    }
}
