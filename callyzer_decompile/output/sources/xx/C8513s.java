package xx;

import ex.InterfaceC2142f;
import kotlin.jvm.internal.AbstractC4154l;
import nx.AbstractC5179q;
import qw.C6364n;
import qw.a0;
import sq.C6885b;
import tx.c0;
import uw.C7565i;
import uw.InterfaceC7559c;
import uw.InterfaceC7564h;
import vr.C7734b;
import vw.EnumC7794a;
import ww.AbstractC8193c;
import ww.InterfaceC8194d;
import wx.InterfaceC8210k;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: xx.s */
/* loaded from: classes3.dex */
public final class C8513s extends AbstractC8193c implements InterfaceC8210k {

    /* renamed from: a */
    public final InterfaceC8210k f41434a;

    /* renamed from: b */
    public final InterfaceC7564h f41435b;

    /* renamed from: c */
    public final int f41436c;

    /* renamed from: d */
    public InterfaceC7564h f41437d;

    /* renamed from: e */
    public InterfaceC7559c f41438e;

    public C8513s(InterfaceC8210k interfaceC8210k, InterfaceC7564h interfaceC7564h) {
        super(C8511q.f41432a, C7565i.f36440a);
        this.f41434a = interfaceC8210k;
        this.f41435b = interfaceC7564h;
        this.f41436c = ((Number) interfaceC7564h.A0(0, new C7734b(21))).intValue();
    }

    /* renamed from: d */
    public final Object m15791d(InterfaceC7559c interfaceC7559c, Object obj) {
        InterfaceC7564h context = interfaceC7559c.getContext();
        c0.m13490m(context);
        InterfaceC7564h interfaceC7564h = this.f41437d;
        if (interfaceC7564h != context) {
            if (interfaceC7564h instanceof C8509o) {
                throw new IllegalStateException(AbstractC5179q.m10122d("\n            Flow exception transparency is violated:\n                Previous 'emit' call has thrown exception " + ((C8509o) interfaceC7564h).f41431b + ", but then emission attempt of value '" + obj + "' has been detected.\n                Emissions from 'catch' blocks are prohibited in order to avoid unspecified behaviour, 'Flow.catch' operator can be used instead.\n                For a more detailed explanation, please refer to Flow documentation.\n            ").toString());
            }
            if (((Number) context.A0(0, new C6885b(16, this))).intValue() != this.f41436c) {
                throw new IllegalStateException(("Flow invariant is violated:\n\t\tFlow was collected in " + this.f41435b + ",\n\t\tbut emission happened in " + context + ".\n\t\tPlease refer to 'flow' documentation or use 'flowOn' instead").toString());
            }
            this.f41437d = context;
        }
        this.f41438e = interfaceC7559c;
        InterfaceC2142f interfaceC2142f = AbstractC8515u.f41440a;
        InterfaceC8210k interfaceC8210k = this.f41434a;
        AbstractC4154l.m8921d(interfaceC8210k, "null cannot be cast to non-null type kotlinx.coroutines.flow.FlowCollector<kotlin.Any?>");
        Object objInvoke = interfaceC2142f.invoke(interfaceC8210k, obj, this);
        if (!AbstractC4154l.m8918a(objInvoke, EnumC7794a.COROUTINE_SUSPENDED)) {
            this.f41438e = null;
        }
        return objInvoke;
    }

    @Override // wx.InterfaceC8210k
    public final Object emit(Object obj, InterfaceC7559c interfaceC7559c) {
        try {
            Object objM15791d = m15791d(interfaceC7559c, obj);
            return objM15791d == EnumC7794a.COROUTINE_SUSPENDED ? objM15791d : a0.f30746a;
        } catch (Throwable th2) {
            this.f41437d = new C8509o(th2, interfaceC7559c.getContext());
            throw th2;
        }
    }

    @Override // ww.AbstractC8191a, ww.InterfaceC8194d
    public final InterfaceC8194d getCallerFrame() {
        InterfaceC7559c interfaceC7559c = this.f41438e;
        if (interfaceC7559c instanceof InterfaceC8194d) {
            return (InterfaceC8194d) interfaceC7559c;
        }
        return null;
    }

    @Override // ww.AbstractC8193c, uw.InterfaceC7559c
    public final InterfaceC7564h getContext() {
        InterfaceC7564h interfaceC7564h = this.f41437d;
        return interfaceC7564h == null ? C7565i.f36440a : interfaceC7564h;
    }

    @Override // ww.AbstractC8191a
    public final StackTraceElement getStackTraceElement() {
        return null;
    }

    @Override // ww.AbstractC8191a
    public final Object invokeSuspend(Object obj) {
        Throwable thM12363a = C6364n.m12363a(obj);
        if (thM12363a != null) {
            this.f41437d = new C8509o(thM12363a, getContext());
        }
        InterfaceC7559c interfaceC7559c = this.f41438e;
        if (interfaceC7559c != null) {
            interfaceC7559c.resumeWith(obj);
        }
        return EnumC7794a.COROUTINE_SUSPENDED;
    }
}
