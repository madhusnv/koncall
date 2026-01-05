package an;

import androidx.compose.material3.internal.AbstractC0257a;
import aq.C0406i;
import c9.C0925t;
import com.amplifyframework.storage.s3.transfer.TransferTable;
import da.AbstractC1678a;
import ec.InterfaceC2004b;
import ex.InterfaceC2139c;
import ex.InterfaceC2143g;
import h2.C2803h;
import i9.C3208z;
import ja.C3617k;
import java.util.List;
import nm.C5107b;
import og.od;
import org.slf4j.helpers.AbstractC5722k;
import ud.InterfaceC7411o;
import uw.InterfaceC7559c;
import vw.EnumC7794a;
import ww.AbstractC8199i;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes3.dex */
public final class u2 extends AbstractC8199i implements InterfaceC2139c {

    /* renamed from: a */
    public final /* synthetic */ int f1429a;

    /* renamed from: b */
    public int f1430b;

    /* renamed from: c */
    public final /* synthetic */ Object f1431c;

    /* renamed from: d */
    public final /* synthetic */ Object f1432d;

    /* renamed from: e */
    public final /* synthetic */ Object f1433e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ u2(Object obj, Object obj2, Object obj3, InterfaceC7559c interfaceC7559c, int i10) {
        super(1, interfaceC7559c);
        this.f1429a = i10;
        this.f1431c = obj;
        this.f1432d = obj2;
        this.f1433e = obj3;
    }

    @Override // ww.AbstractC8191a
    public final InterfaceC7559c create(InterfaceC7559c interfaceC7559c) {
        switch (this.f1429a) {
            case 0:
                return new u2((h3) this.f1431c, (List) this.f1432d, (StringBuilder) this.f1433e, interfaceC7559c, 0);
            case 1:
                return new u2((h3) this.f1431c, (C5107b) this.f1432d, (String) this.f1433e, interfaceC7559c, 1);
            case 2:
                return new u2((C0925t) this.f1431c, this.f1432d, (InterfaceC2143g) this.f1433e, interfaceC7559c, 2);
            default:
                return new u2((C3208z) this.f1431c, (C3617k) this.f1432d, (InterfaceC2004b) this.f1433e, interfaceC7559c, 3);
        }
    }

    @Override // ex.InterfaceC2139c
    public final Object invoke(Object obj) {
        InterfaceC7559c interfaceC7559c = (InterfaceC7559c) obj;
        switch (this.f1429a) {
        }
        return ((u2) create(interfaceC7559c)).invokeSuspend(qw.a0.f30746a);
    }

    @Override // ww.AbstractC8191a
    public final Object invokeSuspend(Object obj) {
        switch (this.f1429a) {
            case 0:
                EnumC7794a enumC7794a = EnumC7794a.COROUTINE_SUSPENDED;
                int i10 = this.f1430b;
                if (i10 == 0) {
                    od.m10798c(obj);
                    h3 h3Var = (h3) this.f1431c;
                    List list = (List) this.f1432d;
                    StringBuilder sb2 = (StringBuilder) this.f1433e;
                    this.f1430b = 1;
                    h3Var.getClass();
                    if (h3.m466n(h3Var, list, sb2, this) == enumC7794a) {
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
                int i11 = this.f1430b;
                if (i11 == 0) {
                    od.m10798c(obj);
                    h3 h3Var2 = (h3) this.f1431c;
                    C5107b c5107b = (C5107b) this.f1432d;
                    String str = (String) this.f1433e;
                    this.f1430b = 1;
                    h3Var2.getClass();
                    if (h3.m473u(h3Var2, c5107b, str, this) == enumC7794a2) {
                        return enumC7794a2;
                    }
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    od.m10798c(obj);
                }
                return qw.a0.f30746a;
            case 2:
                C0925t c0925t = (C0925t) this.f1431c;
                EnumC7794a enumC7794a3 = EnumC7794a.COROUTINE_SUSPENDED;
                int i12 = this.f1430b;
                if (i12 == 0) {
                    od.m10798c(obj);
                    c0925t.m2692u(this.f1432d);
                    C2803h c2803h = new C2803h(c0925t, 1);
                    C0406i c0406i = new C0406i((InterfaceC2143g) this.f1433e, c0925t, (InterfaceC7559c) null, 29);
                    this.f1430b = 1;
                    if (AbstractC0257a.m704a(c2803h, c0406i, this) == enumC7794a3) {
                        return enumC7794a3;
                    }
                } else {
                    if (i12 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    od.m10798c(obj);
                }
                return qw.a0.f30746a;
            default:
                C3208z c3208z = (C3208z) this.f1431c;
                EnumC7794a enumC7794a4 = EnumC7794a.COROUTINE_SUSPENDED;
                int i13 = this.f1430b;
                if (i13 == 0) {
                    od.m10798c(obj);
                    String strM8168a = c3208z.f17315a;
                    if (strM8168a == null) {
                        C3617k c3617k = (C3617k) this.f1432d;
                        strM8168a = c3617k != null ? c3617k.m8168a(TransferTable.COLUMN_REGION, null) : null;
                        if (strM8168a == null && (strM8168a = (String) ((InterfaceC2004b) this.f1433e).mo1864e(AbstractC1678a.f8214a)) == null) {
                            InterfaceC7411o interfaceC7411o = c3208z.f17316b;
                            this.f1430b = 1;
                            obj = AbstractC5722k.m11279c(interfaceC7411o, null, this, 2);
                            if (obj == enumC7794a4) {
                                return enumC7794a4;
                            }
                        }
                    }
                    return strM8168a;
                }
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                od.m10798c(obj);
                return (String) obj;
        }
    }
}
