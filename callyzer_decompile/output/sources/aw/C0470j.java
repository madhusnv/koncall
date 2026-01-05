package aw;

import com.websoptimization.callyzerbiz.workManager.RecordingCompressManager;
import ex.InterfaceC2141e;
import km.C4120o;
import kn.C4121a;
import mm.AbstractC4801l;
import og.od;
import pn.C5979e;
import tx.InterfaceC7266z;
import uw.InterfaceC7559c;
import vw.EnumC7794a;
import ww.AbstractC8199i;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: aw.j */
/* loaded from: classes3.dex */
public final class C0470j extends AbstractC8199i implements InterfaceC2141e {

    /* renamed from: a */
    public final /* synthetic */ int f3380a;

    /* renamed from: b */
    public int f3381b;

    /* renamed from: c */
    public final /* synthetic */ RecordingCompressManager f3382c;

    /* renamed from: d */
    public final /* synthetic */ C4121a f3383d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0470j(RecordingCompressManager recordingCompressManager, C4121a c4121a, InterfaceC7559c interfaceC7559c, int i10) {
        super(2, interfaceC7559c);
        this.f3380a = i10;
        this.f3382c = recordingCompressManager;
        this.f3383d = c4121a;
    }

    @Override // ww.AbstractC8191a
    public final InterfaceC7559c create(Object obj, InterfaceC7559c interfaceC7559c) {
        switch (this.f3380a) {
            case 0:
                return new C0470j(this.f3382c, this.f3383d, interfaceC7559c, 0);
            case 1:
                return new C0470j(this.f3382c, this.f3383d, interfaceC7559c, 1);
            case 2:
                return new C0470j(this.f3382c, this.f3383d, interfaceC7559c, 2);
            case 3:
                return new C0470j(this.f3382c, this.f3383d, interfaceC7559c, 3);
            default:
                return new C0470j(this.f3382c, this.f3383d, interfaceC7559c, 4);
        }
    }

    @Override // ex.InterfaceC2141e
    public final Object invoke(Object obj, Object obj2) {
        InterfaceC7266z interfaceC7266z = (InterfaceC7266z) obj;
        InterfaceC7559c interfaceC7559c = (InterfaceC7559c) obj2;
        switch (this.f3380a) {
        }
        return ((C0470j) create(interfaceC7266z, interfaceC7559c)).invokeSuspend(qw.a0.f30746a);
    }

    @Override // ww.AbstractC8191a
    public final Object invokeSuspend(Object obj) throws Throwable {
        switch (this.f3380a) {
            case 0:
                EnumC7794a enumC7794a = EnumC7794a.COROUTINE_SUSPENDED;
                int i10 = this.f3381b;
                if (i10 == 0) {
                    od.m10798c(obj);
                    C4121a c4121a = this.f3383d;
                    String str = c4121a.f21058e;
                    if (str == null) {
                        str = "";
                    }
                    this.f3381b = 1;
                    if (this.f3382c.m5044c(c4121a, str, null, this) == enumC7794a) {
                        return enumC7794a;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    od.m10798c(obj);
                }
                return qw.a0.f30746a;
            case 1:
                EnumC7794a enumC7794a2 = EnumC7794a.COROUTINE_SUSPENDED;
                int i11 = this.f3381b;
                if (i11 != 0) {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    od.m10798c(obj);
                    return obj;
                }
                od.m10798c(obj);
                C5979e c5979e = this.f3382c.f7455d;
                int i12 = this.f3383d.f21054a.f23832a;
                this.f3381b = 1;
                Object objM15662k = c5979e.f29231a.m15662k(i12, this);
                return objM15662k == enumC7794a2 ? enumC7794a2 : objM15662k;
            case 2:
                EnumC7794a enumC7794a3 = EnumC7794a.COROUTINE_SUSPENDED;
                int i13 = this.f3381b;
                if (i13 != 0) {
                    if (i13 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    od.m10798c(obj);
                    return obj;
                }
                od.m10798c(obj);
                C5979e c5979e2 = this.f3382c.f7455d;
                int i14 = this.f3383d.f21054a.f23832a;
                this.f3381b = 1;
                Object objM15662k2 = c5979e2.f29231a.m15662k(i14, this);
                return objM15662k2 == enumC7794a3 ? enumC7794a3 : objM15662k2;
            case 3:
                EnumC7794a enumC7794a4 = EnumC7794a.COROUTINE_SUSPENDED;
                int i15 = this.f3381b;
                if (i15 != 0) {
                    if (i15 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    od.m10798c(obj);
                    return obj;
                }
                od.m10798c(obj);
                rn.h0 h0Var = this.f3382c.f7454c;
                int i16 = this.f3383d.f21054a.f23832a;
                this.f3381b = 1;
                Object objM8883e = ((C4120o) h0Var.f31523e.f40819d.f10585a).m8883e(AbstractC4801l.m9730d(i16, "compress_retry_count_for_id_"), this);
                return objM8883e == enumC7794a4 ? enumC7794a4 : objM8883e;
            default:
                EnumC7794a enumC7794a5 = EnumC7794a.COROUTINE_SUSPENDED;
                int i17 = this.f3381b;
                if (i17 != 0) {
                    if (i17 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    od.m10798c(obj);
                    return obj;
                }
                od.m10798c(obj);
                this.f3381b = 1;
                Object objM5043b = RecordingCompressManager.m5043b(this.f3382c, this.f3383d, this);
                return objM5043b == enumC7794a5 ? enumC7794a5 : objM5043b;
        }
    }
}
