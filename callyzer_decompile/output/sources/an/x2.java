package an;

import ex.InterfaceC2139c;
import j$.time.LocalDateTime;
import og.od;
import uw.InterfaceC7559c;
import vw.EnumC7794a;
import ww.AbstractC8199i;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes3.dex */
public final class x2 extends AbstractC8199i implements InterfaceC2139c {

    /* renamed from: a */
    public final /* synthetic */ int f1522a;

    /* renamed from: b */
    public int f1523b;

    /* renamed from: c */
    public final /* synthetic */ h3 f1524c;

    /* renamed from: d */
    public final /* synthetic */ int f1525d;

    /* renamed from: e */
    public final /* synthetic */ LocalDateTime f1526e;

    /* renamed from: f */
    public final /* synthetic */ String f1527f;

    /* renamed from: g */
    public final /* synthetic */ LocalDateTime f1528g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ x2(h3 h3Var, int i10, LocalDateTime localDateTime, String str, LocalDateTime localDateTime2, InterfaceC7559c interfaceC7559c, int i11) {
        super(1, interfaceC7559c);
        this.f1522a = i11;
        this.f1524c = h3Var;
        this.f1525d = i10;
        this.f1526e = localDateTime;
        this.f1527f = str;
        this.f1528g = localDateTime2;
    }

    @Override // ww.AbstractC8191a
    public final InterfaceC7559c create(InterfaceC7559c interfaceC7559c) {
        switch (this.f1522a) {
            case 0:
                return new x2(this.f1524c, this.f1525d, this.f1526e, this.f1527f, this.f1528g, interfaceC7559c, 0);
            default:
                return new x2(this.f1524c, this.f1525d, this.f1526e, this.f1527f, this.f1528g, interfaceC7559c, 1);
        }
    }

    @Override // ex.InterfaceC2139c
    public final Object invoke(Object obj) {
        InterfaceC7559c interfaceC7559c = (InterfaceC7559c) obj;
        switch (this.f1522a) {
        }
        return ((x2) create(interfaceC7559c)).invokeSuspend(qw.a0.f30746a);
    }

    @Override // ww.AbstractC8191a
    public final Object invokeSuspend(Object obj) {
        switch (this.f1522a) {
            case 0:
                EnumC7794a enumC7794a = EnumC7794a.COROUTINE_SUSPENDED;
                int i10 = this.f1523b;
                if (i10 != 0) {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    od.m10798c(obj);
                    return obj;
                }
                od.m10798c(obj);
                this.f1523b = 1;
                h3 h3Var = this.f1524c;
                h3Var.getClass();
                Object objM470r = h3.m470r(h3Var, this.f1525d, this.f1526e, this.f1527f, this.f1528g, this);
                return objM470r == enumC7794a ? enumC7794a : objM470r;
            default:
                EnumC7794a enumC7794a2 = EnumC7794a.COROUTINE_SUSPENDED;
                int i11 = this.f1523b;
                if (i11 != 0) {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    od.m10798c(obj);
                    return obj;
                }
                od.m10798c(obj);
                this.f1523b = 1;
                h3 h3Var2 = this.f1524c;
                h3Var2.getClass();
                Object objM472t = h3.m472t(h3Var2, this.f1525d, this.f1526e, this.f1527f, this.f1528g, this);
                return objM472t == enumC7794a2 ? enumC7794a2 : objM472t;
        }
    }
}
