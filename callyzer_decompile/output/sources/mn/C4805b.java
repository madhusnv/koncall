package mn;

import ex.InterfaceC2141e;
import gn.x2;
import j$.time.LocalDateTime;
import java.util.List;
import og.od;
import tx.InterfaceC7266z;
import uw.InterfaceC7559c;
import vw.EnumC7794a;
import wj.C8090p;
import ww.AbstractC8199i;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: mn.b */
/* loaded from: classes3.dex */
public final class C4805b extends AbstractC8199i implements InterfaceC2141e {

    /* renamed from: a */
    public final /* synthetic */ int f23928a;

    /* renamed from: b */
    public int f23929b;

    /* renamed from: c */
    public final /* synthetic */ C4812i f23930c;

    /* renamed from: d */
    public final /* synthetic */ LocalDateTime f23931d;

    /* renamed from: e */
    public final /* synthetic */ LocalDateTime f23932e;

    /* renamed from: f */
    public final /* synthetic */ boolean f23933f;

    /* renamed from: g */
    public final /* synthetic */ String f23934g;

    /* renamed from: h */
    public final /* synthetic */ List f23935h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C4805b(C4812i c4812i, LocalDateTime localDateTime, LocalDateTime localDateTime2, boolean z6, String str, List list, InterfaceC7559c interfaceC7559c, int i10) {
        super(2, interfaceC7559c);
        this.f23928a = i10;
        this.f23930c = c4812i;
        this.f23931d = localDateTime;
        this.f23932e = localDateTime2;
        this.f23933f = z6;
        this.f23934g = str;
        this.f23935h = list;
    }

    @Override // ww.AbstractC8191a
    public final InterfaceC7559c create(Object obj, InterfaceC7559c interfaceC7559c) {
        switch (this.f23928a) {
            case 0:
                return new C4805b(this.f23930c, this.f23931d, this.f23932e, this.f23933f, this.f23934g, this.f23935h, interfaceC7559c, 0);
            case 1:
                return new C4805b(this.f23930c, this.f23931d, this.f23932e, this.f23933f, this.f23934g, this.f23935h, interfaceC7559c, 1);
            default:
                return new C4805b(this.f23930c, this.f23931d, this.f23932e, this.f23933f, this.f23934g, this.f23935h, interfaceC7559c, 2);
        }
    }

    @Override // ex.InterfaceC2141e
    public final Object invoke(Object obj, Object obj2) {
        InterfaceC7266z interfaceC7266z = (InterfaceC7266z) obj;
        InterfaceC7559c interfaceC7559c = (InterfaceC7559c) obj2;
        switch (this.f23928a) {
        }
        return ((C4805b) create(interfaceC7266z, interfaceC7559c)).invokeSuspend(qw.a0.f30746a);
    }

    @Override // ww.AbstractC8191a
    public final Object invokeSuspend(Object obj) {
        switch (this.f23928a) {
            case 0:
                EnumC7794a enumC7794a = EnumC7794a.COROUTINE_SUSPENDED;
                int i10 = this.f23929b;
                if (i10 != 0) {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    od.m10798c(obj);
                    return obj;
                }
                od.m10798c(obj);
                C8090p c8090p = this.f23930c.f24017b;
                this.f23929b = 1;
                Object objM6657C = ((x2) c8090p.f38723a).m6657C(this.f23934g, this.f23931d, this.f23932e, this.f23935h, this, this.f23933f);
                return objM6657C == enumC7794a ? enumC7794a : objM6657C;
            case 1:
                EnumC7794a enumC7794a2 = EnumC7794a.COROUTINE_SUSPENDED;
                int i11 = this.f23929b;
                if (i11 != 0) {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    od.m10798c(obj);
                    return obj;
                }
                od.m10798c(obj);
                C8090p c8090p2 = this.f23930c.f24017b;
                this.f23929b = 1;
                Object objM6660F = ((x2) c8090p2.f38723a).m6660F(this.f23934g, this.f23931d, this.f23932e, this.f23935h, this, this.f23933f);
                return objM6660F == enumC7794a2 ? enumC7794a2 : objM6660F;
            default:
                EnumC7794a enumC7794a3 = EnumC7794a.COROUTINE_SUSPENDED;
                int i12 = this.f23929b;
                if (i12 != 0) {
                    if (i12 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    od.m10798c(obj);
                    return obj;
                }
                od.m10798c(obj);
                C8090p c8090p3 = this.f23930c.f24017b;
                this.f23929b = 1;
                Object objM6673S = ((x2) c8090p3.f38723a).m6673S(this.f23934g, this.f23931d, this.f23932e, this.f23935h, this, this.f23933f);
                return objM6673S == enumC7794a3 ? enumC7794a3 : objM6673S;
        }
    }
}
