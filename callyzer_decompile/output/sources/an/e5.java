package an;

import android.content.Context;
import android.content.SharedPreferences;
import ex.InterfaceC2139c;
import ia.C3215g;
import is.C3348b;
import ja.C3616j;
import java.io.IOException;
import java.util.Iterator;
import java.util.Set;
import kb.C4039c;
import l4.C4367l;
import lv.C4531c;
import og.od;
import pg.z7;
import q6.AbstractC6129a;
import q6.C6131c;
import rw.C6668r;
import rw.C6669s;
import ud.InterfaceC7411o;
import uw.InterfaceC7559c;
import vw.EnumC7794a;
import ww.AbstractC8199i;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes3.dex */
public final class e5 extends AbstractC8199i implements InterfaceC2139c {

    /* renamed from: a */
    public final /* synthetic */ int f785a;

    /* renamed from: b */
    public int f786b;

    /* renamed from: c */
    public final /* synthetic */ Object f787c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e5(Object obj, InterfaceC7559c interfaceC7559c, int i10) {
        super(1, interfaceC7559c);
        this.f785a = i10;
        this.f787c = obj;
    }

    @Override // ww.AbstractC8191a
    public final InterfaceC7559c create(InterfaceC7559c interfaceC7559c) {
        switch (this.f785a) {
            case 0:
                return new e5((g5) this.f787c, interfaceC7559c, 0);
            case 1:
                return new e5((C4367l) this.f787c, interfaceC7559c, 1);
            case 2:
                return new e5((C3215g) this.f787c, interfaceC7559c, 2);
            case 3:
                return new e5((ks.c0) this.f787c, interfaceC7559c, 3);
            case 4:
                return new e5((ks.q0) this.f787c, interfaceC7559c, 4);
            case 5:
                return new e5((C6131c) this.f787c, interfaceC7559c, 5);
            default:
                return new e5((C4039c) this.f787c, interfaceC7559c, 6);
        }
    }

    @Override // ex.InterfaceC2139c
    public final Object invoke(Object obj) {
        InterfaceC7559c interfaceC7559c = (InterfaceC7559c) obj;
        switch (this.f785a) {
        }
        return ((e5) create(interfaceC7559c)).invokeSuspend(qw.a0.f30746a);
    }

    @Override // ww.AbstractC8191a
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objM9139s;
        Object objM11964a;
        Object value;
        Object value2;
        Context context;
        String str;
        switch (this.f785a) {
            case 0:
                EnumC7794a enumC7794a = EnumC7794a.COROUTINE_SUSPENDED;
                int i10 = this.f786b;
                if (i10 != 0) {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    od.m10798c(obj);
                    return obj;
                }
                od.m10798c(obj);
                g5 g5Var = (g5) this.f787c;
                this.f786b = 1;
                g5Var.getClass();
                Object objM447c = g5.m447c(g5Var, this);
                return objM447c == enumC7794a ? enumC7794a : objM447c;
            case 1:
                EnumC7794a enumC7794a2 = EnumC7794a.COROUTINE_SUSPENDED;
                int i11 = this.f786b;
                if (i11 == 0) {
                    od.m10798c(obj);
                    C4367l c4367l = (C4367l) this.f787c;
                    this.f786b = 1;
                    objM9139s = c4367l.m9139s(this);
                    if (objM9139s == enumC7794a2) {
                        return enumC7794a2;
                    }
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    od.m10798c(obj);
                    objM9139s = obj;
                }
                return ((C3616j) objM9139s).m8167a();
            case 2:
                EnumC7794a enumC7794a3 = EnumC7794a.COROUTINE_SUSPENDED;
                int i12 = this.f786b;
                if (i12 == 0) {
                    od.m10798c(obj);
                    InterfaceC7411o interfaceC7411o = ((C3215g) this.f787c).f17336a;
                    this.f786b = 1;
                    objM11964a = z7.m11964a(interfaceC7411o, this);
                    if (objM11964a == enumC7794a3) {
                        return enumC7794a3;
                    }
                } else {
                    if (i12 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    od.m10798c(obj);
                    objM11964a = obj;
                }
                return ((C3616j) objM11964a).m8167a();
            case 3:
                ks.c0 c0Var = (ks.c0) this.f787c;
                EnumC7794a enumC7794a4 = EnumC7794a.COROUTINE_SUSPENDED;
                int i13 = this.f786b;
                if (i13 == 0) {
                    od.m10798c(obj);
                    wx.m1 m1Var = c0Var.f21359A;
                    do {
                        value = m1Var.getValue();
                    } while (!m1Var.m15397i(value, C3348b.m7669a((C3348b) value, C6668r.f31943a, false, 0, null, 0, false, false, false, null, null, false, null, null, null, null, null, false, null, 1048570)));
                    C4531c c4531c = c0Var.f21364F;
                    this.f786b = 1;
                    if (c4531c.m9381e(this) == enumC7794a4) {
                        return enumC7794a4;
                    }
                } else {
                    if (i13 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    od.m10798c(obj);
                }
                return qw.a0.f30746a;
            case 4:
                ks.q0 q0Var = (ks.q0) this.f787c;
                EnumC7794a enumC7794a5 = EnumC7794a.COROUTINE_SUSPENDED;
                int i14 = this.f786b;
                if (i14 == 0) {
                    od.m10798c(obj);
                    wx.m1 m1Var2 = q0Var.f21512w;
                    do {
                        value2 = m1Var2.getValue();
                    } while (!m1Var2.m15397i(value2, C3348b.m7669a((C3348b) value2, C6668r.f31943a, false, 0, null, 0, false, false, false, null, null, false, null, null, null, null, null, false, C6669s.f31944a, 524282)));
                    C4531c c4531c2 = q0Var.f21494E;
                    this.f786b = 1;
                    if (c4531c2.m9381e(this) == enumC7794a5) {
                        return enumC7794a5;
                    }
                } else {
                    if (i14 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    od.m10798c(obj);
                }
                return qw.a0.f30746a;
            case 5:
                EnumC7794a enumC7794a6 = EnumC7794a.COROUTINE_SUSPENDED;
                int i15 = this.f786b;
                qw.a0 a0Var = qw.a0.f30746a;
                if (i15 == 0) {
                    od.m10798c(obj);
                    C6131c c6131c = (C6131c) this.f787c;
                    this.f786b = 1;
                    SharedPreferences.Editor editorEdit = ((SharedPreferences) c6131c.f29885e.getValue()).edit();
                    Set set = c6131c.f29886f;
                    if (set == null) {
                        editorEdit.clear();
                    } else {
                        Iterator it = set.iterator();
                        while (it.hasNext()) {
                            editorEdit.remove((String) it.next());
                        }
                    }
                    if (!editorEdit.commit()) {
                        throw new IOException("Unable to delete migrated keys from SharedPreferences.");
                    }
                    if (((SharedPreferences) c6131c.f29885e.getValue()).getAll().isEmpty() && (context = c6131c.f29883c) != null && (str = c6131c.f29884d) != null) {
                        AbstractC6129a.m12161a(context, str);
                    }
                    if (set != null) {
                        set.clear();
                    }
                    if (a0Var == enumC7794a6) {
                        return enumC7794a6;
                    }
                } else {
                    if (i15 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    od.m10798c(obj);
                }
                return a0Var;
            default:
                EnumC7794a enumC7794a7 = EnumC7794a.COROUTINE_SUSPENDED;
                int i16 = this.f786b;
                if (i16 != 0) {
                    if (i16 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    od.m10798c(obj);
                    return obj;
                }
                od.m10798c(obj);
                C4039c c4039c = (C4039c) this.f787c;
                this.f786b = 1;
                Object objInvoke = c4039c.invoke(this);
                return objInvoke == enumC7794a7 ? enumC7794a7 : objInvoke;
        }
    }
}
