package qv;

import android.content.Context;
import com.websoptimization.callyzerbiz.R;
import ex.InterfaceC2141e;
import im.p1;
import iu.C3349a;
import og.od;
import pg.f9;
import pg.y8;
import qw.a0;
import tx.InterfaceC7266z;
import uw.InterfaceC7559c;
import vw.EnumC7794a;
import ww.AbstractC8199i;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: qv.k */
/* loaded from: classes3.dex */
public final class C6336k extends AbstractC8199i implements InterfaceC2141e {

    /* renamed from: a */
    public final /* synthetic */ int f30714a;

    /* renamed from: b */
    public final /* synthetic */ C6338m f30715b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C6336k(C6338m c6338m, InterfaceC7559c interfaceC7559c, int i10) {
        super(2, interfaceC7559c);
        this.f30714a = i10;
        this.f30715b = c6338m;
    }

    @Override // ww.AbstractC8191a
    public final InterfaceC7559c create(Object obj, InterfaceC7559c interfaceC7559c) {
        switch (this.f30714a) {
            case 0:
                return new C6336k(this.f30715b, interfaceC7559c, 0);
            default:
                return new C6336k(this.f30715b, interfaceC7559c, 1);
        }
    }

    @Override // ex.InterfaceC2141e
    public final Object invoke(Object obj, Object obj2) {
        InterfaceC7266z interfaceC7266z = (InterfaceC7266z) obj;
        InterfaceC7559c interfaceC7559c = (InterfaceC7559c) obj2;
        switch (this.f30714a) {
            case 0:
                C6336k c6336k = (C6336k) create(interfaceC7266z, interfaceC7559c);
                a0 a0Var = a0.f30746a;
                c6336k.invokeSuspend(a0Var);
                return a0Var;
            default:
                C6336k c6336k2 = (C6336k) create(interfaceC7266z, interfaceC7559c);
                a0 a0Var2 = a0.f30746a;
                c6336k2.invokeSuspend(a0Var2);
                return a0Var2;
        }
    }

    @Override // ww.AbstractC8191a
    public final Object invokeSuspend(Object obj) {
        int i10 = this.f30714a;
        a0 a0Var = a0.f30746a;
        C6338m c6338m = this.f30715b;
        switch (i10) {
            case 0:
                EnumC7794a enumC7794a = EnumC7794a.COROUTINE_SUSPENDED;
                od.m10798c(obj);
                Context context = c6338m.f30719b;
                y8.m11950e(context, f9.m11628b(context, R.string.log_file_upload_successful));
                c6338m.f30722e.m9337b(p1.LOG_FILE_UPLOAD_STATE, C3349a.f17731a);
                break;
            default:
                EnumC7794a enumC7794a2 = EnumC7794a.COROUTINE_SUSPENDED;
                od.m10798c(obj);
                Context context2 = c6338m.f30719b;
                y8.m11950e(context2, f9.m11628b(context2, R.string.log_file_upload_failed));
                break;
        }
        return a0Var;
    }
}
