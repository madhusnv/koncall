package e1;

import ex.InterfaceC2141e;
import mx.C4912h;
import og.od;
import uw.InterfaceC7559c;
import vw.EnumC7794a;
import ww.AbstractC8198h;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class g0 extends AbstractC8198h implements InterfaceC2141e {

    /* renamed from: b */
    public h0 f8980b;

    /* renamed from: c */
    public i0 f8981c;

    /* renamed from: d */
    public long[] f8982d;

    /* renamed from: e */
    public int f8983e;

    /* renamed from: f */
    public int f8984f;

    /* renamed from: g */
    public /* synthetic */ Object f8985g;

    /* renamed from: h */
    public final /* synthetic */ i0 f8986h;

    /* renamed from: j */
    public final /* synthetic */ h0 f8987j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g0(i0 i0Var, h0 h0Var, InterfaceC7559c interfaceC7559c) {
        super(2, interfaceC7559c);
        this.f8986h = i0Var;
        this.f8987j = h0Var;
    }

    @Override // ww.AbstractC8191a
    public final InterfaceC7559c create(Object obj, InterfaceC7559c interfaceC7559c) {
        g0 g0Var = new g0(this.f8986h, this.f8987j, interfaceC7559c);
        g0Var.f8985g = obj;
        return g0Var;
    }

    @Override // ex.InterfaceC2141e
    public final Object invoke(Object obj, Object obj2) {
        return ((g0) create((C4912h) obj, (InterfaceC7559c) obj2)).invokeSuspend(qw.a0.f30746a);
    }

    @Override // ww.AbstractC8191a
    public final Object invokeSuspend(Object obj) {
        i0 i0Var;
        long[] jArr;
        int i10;
        h0 h0Var;
        C4912h c4912h;
        EnumC7794a enumC7794a = EnumC7794a.COROUTINE_SUSPENDED;
        int i11 = this.f8984f;
        if (i11 == 0) {
            od.m10798c(obj);
            C4912h c4912h2 = (C4912h) this.f8985g;
            i0Var = this.f8986h;
            f0 f0Var = i0Var.f8996b;
            jArr = f0Var.f8963c;
            i10 = f0Var.f8965e;
            h0Var = this.f8987j;
            c4912h = c4912h2;
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            int i12 = this.f8983e;
            long[] jArr2 = this.f8982d;
            i0 i0Var2 = this.f8981c;
            h0Var = this.f8980b;
            c4912h = (C4912h) this.f8985g;
            od.m10798c(obj);
            i10 = i12;
            i0Var = i0Var2;
            jArr = jArr2;
        }
        while (i10 != Integer.MAX_VALUE) {
            int i13 = (int) ((jArr[i10] >> 31) & 2147483647L);
            h0Var.f8991b = i10;
            Object obj2 = i0Var.f8996b.f8962b[i10];
            this.f8985g = c4912h;
            this.f8980b = h0Var;
            this.f8981c = i0Var;
            this.f8982d = jArr;
            this.f8983e = i13;
            this.f8984f = 1;
            if (c4912h.m9805d(obj2, this) == enumC7794a) {
                return enumC7794a;
            }
            i10 = i13;
        }
        return qw.a0.f30746a;
    }
}
