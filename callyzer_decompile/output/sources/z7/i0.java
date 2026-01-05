package z7;

import al.C0182j;
import android.database.SQLException;
import b8.C0620o;
import bq.C0733m;
import ex.InterfaceC2141e;
import java.util.Set;
import java.util.concurrent.locks.ReentrantLock;
import og.od;
import rw.C6670t;
import uw.InterfaceC7559c;
import vw.EnumC7794a;
import ww.AbstractC8199i;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class i0 extends AbstractC8199i implements InterfaceC2141e {

    /* renamed from: a */
    public final /* synthetic */ int f42743a;

    /* renamed from: b */
    public int f42744b;

    /* renamed from: c */
    public /* synthetic */ Object f42745c;

    /* renamed from: d */
    public final /* synthetic */ n0 f42746d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ i0(n0 n0Var, InterfaceC7559c interfaceC7559c, int i10) {
        super(2, interfaceC7559c);
        this.f42743a = i10;
        this.f42746d = n0Var;
    }

    @Override // ww.AbstractC8191a
    public final InterfaceC7559c create(Object obj, InterfaceC7559c interfaceC7559c) {
        switch (this.f42743a) {
            case 0:
                i0 i0Var = new i0(this.f42746d, interfaceC7559c, 0);
                i0Var.f42745c = obj;
                return i0Var;
            case 1:
                i0 i0Var2 = new i0(this.f42746d, interfaceC7559c, 1);
                i0Var2.f42745c = obj;
                return i0Var2;
            default:
                i0 i0Var3 = new i0(this.f42746d, interfaceC7559c, 2);
                i0Var3.f42745c = obj;
                return i0Var3;
        }
    }

    @Override // ex.InterfaceC2141e
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f42743a) {
        }
        return ((i0) create((e0) obj, (InterfaceC7559c) obj2)).invokeSuspend(qw.a0.f30746a);
    }

    @Override // ww.AbstractC8191a
    public final Object invokeSuspend(Object obj) {
        e0 e0Var;
        Object objMo1783d;
        Object objMo1782c;
        e0 e0Var2;
        Object objMo1783d2;
        EnumC8885n[] enumC8885nArr;
        EnumC8885n enumC8885n;
        switch (this.f42743a) {
            case 0:
                EnumC7794a enumC7794a = EnumC7794a.COROUTINE_SUSPENDED;
                int i10 = this.f42744b;
                if (i10 != 0) {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    od.m10798c(obj);
                    return obj;
                }
                od.m10798c(obj);
                C0620o c0620o = (C0620o) this.f42745c;
                this.f42744b = 1;
                Object objM16377a = n0.m16377a(this.f42746d, c0620o, this);
                return objM16377a == enumC7794a ? enumC7794a : objM16377a;
            case 1:
                EnumC7794a enumC7794a2 = EnumC7794a.COROUTINE_SUSPENDED;
                int i11 = this.f42744b;
                try {
                    if (i11 == 0) {
                        od.m10798c(obj);
                        e0Var = (e0) this.f42745c;
                        this.f42745c = e0Var;
                        this.f42744b = 1;
                        objMo1783d = e0Var.mo1783d(this);
                        if (objMo1783d == enumC7794a2) {
                            return enumC7794a2;
                        }
                    } else {
                        if (i11 != 1) {
                            if (i11 != 2) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            od.m10798c(obj);
                            objMo1782c = obj;
                            return (Set) objMo1782c;
                        }
                        e0Var = (e0) this.f42745c;
                        od.m10798c(obj);
                        objMo1783d = obj;
                    }
                    if (!((Boolean) objMo1783d).booleanValue()) {
                        d0 d0Var = d0.IMMEDIATE;
                        i0 i0Var = new i0(this.f42746d, null, 0);
                        this.f42745c = null;
                        this.f42744b = 2;
                        objMo1782c = e0Var.mo1782c(d0Var, i0Var, this);
                        if (objMo1782c == enumC7794a2) {
                            return enumC7794a2;
                        }
                        return (Set) objMo1782c;
                    }
                } catch (SQLException unused) {
                }
                return C6670t.f31945a;
            default:
                EnumC7794a enumC7794a3 = EnumC7794a.COROUTINE_SUSPENDED;
                int i12 = this.f42744b;
                qw.a0 a0Var = qw.a0.f30746a;
                boolean z6 = true;
                if (i12 == 0) {
                    od.m10798c(obj);
                    e0Var2 = (e0) this.f42745c;
                    this.f42745c = e0Var2;
                    this.f42744b = 1;
                    objMo1783d2 = e0Var2.mo1783d(this);
                    if (objMo1783d2 == enumC7794a3) {
                        return enumC7794a3;
                    }
                } else {
                    if (i12 != 1) {
                        if (i12 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        od.m10798c(obj);
                        return a0Var;
                    }
                    e0Var2 = (e0) this.f42745c;
                    od.m10798c(obj);
                    objMo1783d2 = obj;
                }
                if (!((Boolean) objMo1783d2).booleanValue()) {
                    n0 n0Var = this.f42746d;
                    C0182j c0182j = n0Var.f42791h;
                    long[] jArr = (long[]) c0182j.f556c;
                    ReentrantLock reentrantLock = (ReentrantLock) c0182j.f555b;
                    reentrantLock.lock();
                    try {
                        if (c0182j.f554a) {
                            boolean z10 = false;
                            c0182j.f554a = false;
                            int length = jArr.length;
                            enumC8885nArr = new EnumC8885n[length];
                            int i13 = 0;
                            boolean z11 = false;
                            while (i13 < length) {
                                if (jArr[i13] <= 0) {
                                    z6 = z10;
                                }
                                boolean[] zArr = (boolean[]) c0182j.f557d;
                                if (z6 != zArr[i13]) {
                                    zArr[i13] = z6;
                                    enumC8885n = z6 ? EnumC8885n.ADD : EnumC8885n.REMOVE;
                                    z11 = true;
                                } else {
                                    enumC8885n = EnumC8885n.NO_OP;
                                }
                                enumC8885nArr[i13] = enumC8885n;
                                i13++;
                                z6 = true;
                                z10 = false;
                            }
                            if (!z11) {
                                enumC8885nArr = null;
                            }
                            reentrantLock.unlock();
                        } else {
                            reentrantLock.unlock();
                            enumC8885nArr = null;
                        }
                        if (enumC8885nArr != null) {
                            d0 d0Var2 = d0.IMMEDIATE;
                            C0733m c0733m = new C0733m(enumC8885nArr, n0Var, e0Var2, (InterfaceC7559c) null);
                            this.f42745c = null;
                            this.f42744b = 2;
                            if (e0Var2.mo1782c(d0Var2, c0733m, this) == enumC7794a3) {
                                return enumC7794a3;
                            }
                        }
                    } catch (Throwable th2) {
                        reentrantLock.unlock();
                        throw th2;
                    }
                }
                return a0Var;
        }
    }
}
