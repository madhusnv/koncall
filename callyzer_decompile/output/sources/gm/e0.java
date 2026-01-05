package gm;

import android.content.Context;
import aq.C0406i;
import bv.C0784b;
import com.websoptimization.callyzerbiz.NotePopUpActivity;
import com.websoptimization.callyzerbiz.R;
import ex.InterfaceC2139c;
import ex.InterfaceC2141e;
import h1.s1;
import java.util.Iterator;
import java.util.List;
import k2.b1;
import k2.e1;
import k2.h2;
import k2.w0;
import kotlin.jvm.internal.AbstractC4154l;
import kq.AbstractC4179i;
import kq.C4175e;
import kq.C4176f;
import l7.C4409i;
import lq.C4506a;
import mq.i0;
import n7.C4964i;
import og.od;
import t1.C6979d;
import tx.InterfaceC7266z;
import uw.InterfaceC7559c;
import vw.EnumC7794a;
import w3.l1;
import w3.p2;
import ww.AbstractC8199i;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes3.dex */
public final class e0 extends AbstractC8199i implements InterfaceC2141e {

    /* renamed from: a */
    public final /* synthetic */ int f14240a;

    /* renamed from: b */
    public final /* synthetic */ Object f14241b;

    /* renamed from: c */
    public final /* synthetic */ Object f14242c;

    /* renamed from: d */
    public final /* synthetic */ Object f14243d;

    /* renamed from: e */
    public final /* synthetic */ Object f14244e;

    /* renamed from: f */
    public final /* synthetic */ Object f14245f;

    /* renamed from: g */
    public final /* synthetic */ Object f14246g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e0(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, InterfaceC7559c interfaceC7559c, int i10) {
        super(2, interfaceC7559c);
        this.f14240a = i10;
        this.f14241b = obj;
        this.f14242c = obj2;
        this.f14243d = obj3;
        this.f14244e = obj4;
        this.f14245f = obj5;
        this.f14246g = obj6;
    }

    @Override // ww.AbstractC8191a
    public final InterfaceC7559c create(Object obj, InterfaceC7559c interfaceC7559c) {
        switch (this.f14240a) {
            case 0:
                return new e0((InterfaceC7266z) this.f14241b, (w0) this.f14242c, (C0784b) this.f14245f, (b1) this.f14246g, (w0) this.f14243d, (w0) this.f14244e, interfaceC7559c);
            case 1:
                return new e0((C6979d) this.f14241b, (Context) this.f14242c, (InterfaceC2139c) this.f14243d, (p2) this.f14244e, (i0) this.f14245f, (h2) this.f14246g, interfaceC7559c, 1);
            default:
                return new e0((s1) this.f14241b, (l7.a0) this.f14242c, (C4409i) this.f14243d, (e1.c0) this.f14244e, (h2) this.f14245f, (C4964i) this.f14246g, interfaceC7559c, 2);
        }
    }

    @Override // ex.InterfaceC2141e
    public final Object invoke(Object obj, Object obj2) {
        InterfaceC7266z interfaceC7266z = (InterfaceC7266z) obj;
        InterfaceC7559c interfaceC7559c = (InterfaceC7559c) obj2;
        switch (this.f14240a) {
            case 0:
                e0 e0Var = (e0) create(interfaceC7266z, interfaceC7559c);
                qw.a0 a0Var = qw.a0.f30746a;
                e0Var.invokeSuspend(a0Var);
                return a0Var;
            case 1:
                e0 e0Var2 = (e0) create(interfaceC7266z, interfaceC7559c);
                qw.a0 a0Var2 = qw.a0.f30746a;
                e0Var2.invokeSuspend(a0Var2);
                return a0Var2;
            default:
                e0 e0Var3 = (e0) create(interfaceC7266z, interfaceC7559c);
                qw.a0 a0Var3 = qw.a0.f30746a;
                e0Var3.invokeSuspend(a0Var3);
                return a0Var3;
        }
    }

    @Override // ww.AbstractC8191a
    public final Object invokeSuspend(Object obj) {
        char c2;
        int i10;
        int i11 = this.f14240a;
        qw.a0 a0Var = qw.a0.f30746a;
        Object obj2 = this.f14244e;
        Object obj3 = this.f14245f;
        Object obj4 = this.f14243d;
        Object obj5 = this.f14241b;
        Object obj6 = this.f14246g;
        Object obj7 = this.f14242c;
        switch (i11) {
            case 0:
                EnumC7794a enumC7794a = EnumC7794a.COROUTINE_SUSPENDED;
                od.m10798c(obj);
                InterfaceC7266z interfaceC7266z = (InterfaceC7266z) obj5;
                C0784b c0784b = (C0784b) obj3;
                tx.c0.m13502y(interfaceC7266z, null, null, new aw.d0((w0) obj7, c0784b, (b1) obj6, (w0) obj4, null, 4), 3);
                tx.c0.m13502y(interfaceC7266z, null, null, new C0406i(c0784b, (w0) obj7, (b1) obj6, null, 21), 3);
                int i12 = NotePopUpActivity.f7268g;
                ((w0) obj2).setValue(Boolean.TRUE);
                break;
            case 1:
                Context context = (Context) obj7;
                EnumC7794a enumC7794a2 = EnumC7794a.COROUTINE_SUSPENDED;
                od.m10798c(obj);
                C6979d c6979d = (C6979d) obj5;
                AbstractC4179i abstractC4179i = (AbstractC4179i) ((C4506a) ((h2) obj6).getValue()).f22414a.get(c6979d.m13263j());
                ((InterfaceC2139c) obj4).invoke(abstractC4179i instanceof C4175e ? context.getString(R.string.never_attended_showcase_msg) : abstractC4179i instanceof C4176f ? context.getString(R.string.not_picked_up_showcase_msg) : null);
                p2 p2Var = (p2) obj2;
                if (p2Var != null) {
                    ((l1) p2Var).m14975a();
                }
                ((i0) obj3).f24289c = c6979d.m13263j();
                break;
            default:
                EnumC7794a enumC7794a3 = EnumC7794a.COROUTINE_SUSPENDED;
                od.m10798c(obj);
                s1 s1Var = (s1) obj5;
                Object objMo345y = s1Var.f15588a.mo345y();
                e1 e1Var = s1Var.f15591d;
                if (AbstractC4154l.m8918a(objMo345y, e1Var.getValue()) && (((l7.a0) obj7).f21996b.m12172g() == null || AbstractC4154l.m8918a(e1Var.getValue(), (C4409i) obj4))) {
                    C4964i c4964i = (C4964i) obj6;
                    Iterator it = ((List) ((h2) obj3).getValue()).iterator();
                    while (it.hasNext()) {
                        c4964i.m9225b().m9217c((C4409i) it.next());
                    }
                    e1.c0 c0Var = (e1.c0) obj2;
                    long[] jArr = c0Var.f8940a;
                    int length = jArr.length - 2;
                    if (length >= 0) {
                        int i13 = 0;
                        while (true) {
                            long j6 = jArr[i13];
                            char c10 = 7;
                            if ((((~j6) << 7) & j6 & (-9187201950435737472L)) != -9187201950435737472L) {
                                int i14 = 8 - ((~(i13 - length)) >>> 31);
                                int i15 = 0;
                                while (i15 < i14) {
                                    if ((j6 & 255) < 128) {
                                        int i16 = (i13 << 3) + i15;
                                        Object obj8 = c0Var.f8941b[i16];
                                        float f6 = c0Var.f8942c[i16];
                                        if (AbstractC4154l.m8918a((String) obj8, ((C4409i) e1Var.getValue()).f22050f)) {
                                            c2 = c10;
                                            i10 = i15;
                                        } else {
                                            c0Var.f8944e--;
                                            long[] jArr2 = c0Var.f8940a;
                                            int i17 = c0Var.f8943d;
                                            int i18 = i16 >> 3;
                                            int i19 = (i16 & 7) << 3;
                                            c2 = c10;
                                            i10 = i15;
                                            long j10 = (jArr2[i18] & (~(255 << i19))) | (254 << i19);
                                            jArr2[i18] = j10;
                                            jArr2[(((i16 - 7) & i17) + (i17 & 7)) >> 3] = j10;
                                            c0Var.f8941b[i16] = null;
                                        }
                                    } else {
                                        c2 = c10;
                                        i10 = i15;
                                    }
                                    j6 >>= 8;
                                    i15 = i10 + 1;
                                    c10 = c2;
                                }
                                if (i14 != 8) {
                                    break;
                                }
                            }
                            if (i13 == length) {
                                break;
                            } else {
                                i13++;
                            }
                        }
                    }
                }
                break;
        }
        return a0Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e0(InterfaceC7266z interfaceC7266z, w0 w0Var, C0784b c0784b, b1 b1Var, w0 w0Var2, w0 w0Var3, InterfaceC7559c interfaceC7559c) {
        super(2, interfaceC7559c);
        this.f14240a = 0;
        this.f14241b = interfaceC7266z;
        this.f14242c = w0Var;
        this.f14245f = c0784b;
        this.f14246g = b1Var;
        this.f14243d = w0Var2;
        this.f14244e = w0Var3;
    }
}
