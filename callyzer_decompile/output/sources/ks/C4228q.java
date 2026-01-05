package ks;

import ex.InterfaceC2141e;
import im.InterfaceC3307i;
import java.util.List;
import tq.EnumC7204p;
import uw.InterfaceC7559c;
import ww.AbstractC8199i;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: ks.q */
/* loaded from: classes3.dex */
public final class C4228q extends AbstractC8199i implements InterfaceC2141e {

    /* renamed from: a */
    public final /* synthetic */ int f21487a;

    /* renamed from: b */
    public /* synthetic */ Object f21488b;

    /* renamed from: c */
    public final /* synthetic */ c0 f21489c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C4228q(c0 c0Var, InterfaceC7559c interfaceC7559c, int i10) {
        super(2, interfaceC7559c);
        this.f21487a = i10;
        this.f21489c = c0Var;
    }

    @Override // ww.AbstractC8191a
    public final InterfaceC7559c create(Object obj, InterfaceC7559c interfaceC7559c) {
        switch (this.f21487a) {
            case 0:
                C4228q c4228q = new C4228q(this.f21489c, interfaceC7559c, 0);
                c4228q.f21488b = obj;
                return c4228q;
            case 1:
                C4228q c4228q2 = new C4228q(this.f21489c, interfaceC7559c, 1);
                c4228q2.f21488b = obj;
                return c4228q2;
            default:
                C4228q c4228q3 = new C4228q(this.f21489c, interfaceC7559c, 2);
                c4228q3.f21488b = obj;
                return c4228q3;
        }
    }

    @Override // ex.InterfaceC2141e
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f21487a) {
            case 0:
                return ((C4228q) create((EnumC7204p) obj, (InterfaceC7559c) obj2)).invokeSuspend(qw.a0.f30746a);
            case 1:
                C4228q c4228q = (C4228q) create((InterfaceC3307i) obj, (InterfaceC7559c) obj2);
                qw.a0 a0Var = qw.a0.f30746a;
                c4228q.invokeSuspend(a0Var);
                return a0Var;
            default:
                C4228q c4228q2 = (C4228q) create((List) obj, (InterfaceC7559c) obj2);
                qw.a0 a0Var2 = qw.a0.f30746a;
                c4228q2.invokeSuspend(a0Var2);
                return a0Var2;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x00e0  */
    @Override // ww.AbstractC8191a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r26) {
        /*
            Method dump skipped, instructions count: 242
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ks.C4228q.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
