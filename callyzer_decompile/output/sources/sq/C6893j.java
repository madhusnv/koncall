package sq;

import android.content.Intent;
import ex.InterfaceC2141e;
import og.od;
import p005f.C2162k;
import tx.InterfaceC7266z;
import uw.InterfaceC7559c;
import vw.EnumC7794a;
import ww.AbstractC8199i;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: sq.j */
/* loaded from: classes3.dex */
public final class C6893j extends AbstractC8199i implements InterfaceC2141e {

    /* renamed from: a */
    public final /* synthetic */ int f32960a;

    /* renamed from: b */
    public final /* synthetic */ C2162k f32961b;

    /* renamed from: c */
    public final /* synthetic */ Intent f32962c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C6893j(C2162k c2162k, Intent intent, InterfaceC7559c interfaceC7559c, int i10) {
        super(2, interfaceC7559c);
        this.f32960a = i10;
        this.f32961b = c2162k;
        this.f32962c = intent;
    }

    @Override // ww.AbstractC8191a
    public final InterfaceC7559c create(Object obj, InterfaceC7559c interfaceC7559c) {
        switch (this.f32960a) {
            case 0:
                return new C6893j(this.f32961b, this.f32962c, interfaceC7559c, 0);
            default:
                return new C6893j(this.f32961b, this.f32962c, interfaceC7559c, 1);
        }
    }

    @Override // ex.InterfaceC2141e
    public final Object invoke(Object obj, Object obj2) {
        InterfaceC7266z interfaceC7266z = (InterfaceC7266z) obj;
        InterfaceC7559c interfaceC7559c = (InterfaceC7559c) obj2;
        switch (this.f32960a) {
            case 0:
                C6893j c6893j = (C6893j) create(interfaceC7266z, interfaceC7559c);
                qw.a0 a0Var = qw.a0.f30746a;
                c6893j.invokeSuspend(a0Var);
                return a0Var;
            default:
                C6893j c6893j2 = (C6893j) create(interfaceC7266z, interfaceC7559c);
                qw.a0 a0Var2 = qw.a0.f30746a;
                c6893j2.invokeSuspend(a0Var2);
                return a0Var2;
        }
    }

    @Override // ww.AbstractC8191a
    public final Object invokeSuspend(Object obj) {
        int i10 = this.f32960a;
        qw.a0 a0Var = qw.a0.f30746a;
        Intent intent = this.f32962c;
        C2162k c2162k = this.f32961b;
        switch (i10) {
            case 0:
                EnumC7794a enumC7794a = EnumC7794a.COROUTINE_SUSPENDED;
                od.m10798c(obj);
                c2162k.mo1274a(intent);
                break;
            default:
                EnumC7794a enumC7794a2 = EnumC7794a.COROUTINE_SUSPENDED;
                od.m10798c(obj);
                c2162k.mo1274a(intent);
                break;
        }
        return a0Var;
    }
}
