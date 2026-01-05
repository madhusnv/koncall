package ks;

import ex.InterfaceC2141e;
import java.util.List;
import tq.EnumC7204p;
import uw.InterfaceC7559c;
import ww.AbstractC8199i;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes3.dex */
public final class e0 extends AbstractC8199i implements InterfaceC2141e {

    /* renamed from: a */
    public final /* synthetic */ int f21397a;

    /* renamed from: b */
    public /* synthetic */ Object f21398b;

    /* renamed from: c */
    public final /* synthetic */ q0 f21399c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e0(q0 q0Var, InterfaceC7559c interfaceC7559c, int i10) {
        super(2, interfaceC7559c);
        this.f21397a = i10;
        this.f21399c = q0Var;
    }

    @Override // ww.AbstractC8191a
    public final InterfaceC7559c create(Object obj, InterfaceC7559c interfaceC7559c) {
        switch (this.f21397a) {
            case 0:
                e0 e0Var = new e0(this.f21399c, interfaceC7559c, 0);
                e0Var.f21398b = obj;
                return e0Var;
            case 1:
                e0 e0Var2 = new e0(this.f21399c, interfaceC7559c, 1);
                e0Var2.f21398b = obj;
                return e0Var2;
            default:
                e0 e0Var3 = new e0(this.f21399c, interfaceC7559c, 2);
                e0Var3.f21398b = obj;
                return e0Var3;
        }
    }

    @Override // ex.InterfaceC2141e
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f21397a) {
            case 0:
                return ((e0) create((EnumC7204p) obj, (InterfaceC7559c) obj2)).invokeSuspend(qw.a0.f30746a);
            case 1:
                e0 e0Var = (e0) create((im.m0) obj, (InterfaceC7559c) obj2);
                qw.a0 a0Var = qw.a0.f30746a;
                e0Var.invokeSuspend(a0Var);
                return a0Var;
            default:
                e0 e0Var2 = (e0) create((List) obj, (InterfaceC7559c) obj2);
                qw.a0 a0Var2 = qw.a0.f30746a;
                e0Var2.invokeSuspend(a0Var2);
                return a0Var2;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x01a8  */
    @Override // ww.AbstractC8191a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r26) {
        /*
            Method dump skipped, instructions count: 442
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ks.e0.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
