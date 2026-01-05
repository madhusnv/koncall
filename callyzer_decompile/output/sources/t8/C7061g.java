package t8;

import androidx.work.CoroutineWorker;
import ex.InterfaceC2141e;
import og.od;
import tx.InterfaceC7266z;
import uw.InterfaceC7559c;
import vw.EnumC7794a;
import ww.AbstractC8199i;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: t8.g */
/* loaded from: classes.dex */
public final class C7061g extends AbstractC8199i implements InterfaceC2141e {

    /* renamed from: a */
    public final /* synthetic */ int f34152a;

    /* renamed from: b */
    public int f34153b;

    /* renamed from: c */
    public final /* synthetic */ CoroutineWorker f34154c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C7061g(CoroutineWorker coroutineWorker, InterfaceC7559c interfaceC7559c, int i10) {
        super(2, interfaceC7559c);
        this.f34152a = i10;
        this.f34154c = coroutineWorker;
    }

    @Override // ww.AbstractC8191a
    public final InterfaceC7559c create(Object obj, InterfaceC7559c interfaceC7559c) {
        switch (this.f34152a) {
            case 0:
                return new C7061g(this.f34154c, interfaceC7559c, 0);
            default:
                return new C7061g(this.f34154c, interfaceC7559c, 1);
        }
    }

    @Override // ex.InterfaceC2141e
    public final Object invoke(Object obj, Object obj2) {
        InterfaceC7266z interfaceC7266z = (InterfaceC7266z) obj;
        InterfaceC7559c interfaceC7559c = (InterfaceC7559c) obj2;
        switch (this.f34152a) {
        }
        return ((C7061g) create(interfaceC7266z, interfaceC7559c)).invokeSuspend(qw.a0.f30746a);
    }

    @Override // ww.AbstractC8191a
    public final Object invokeSuspend(Object obj) {
        switch (this.f34152a) {
            case 0:
                EnumC7794a enumC7794a = EnumC7794a.COROUTINE_SUSPENDED;
                int i10 = this.f34153b;
                if (i10 != 0) {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    od.m10798c(obj);
                    return obj;
                }
                od.m10798c(obj);
                this.f34153b = 1;
                Object foregroundInfo = this.f34154c.getForegroundInfo(this);
                return foregroundInfo == enumC7794a ? enumC7794a : foregroundInfo;
            default:
                EnumC7794a enumC7794a2 = EnumC7794a.COROUTINE_SUSPENDED;
                int i11 = this.f34153b;
                if (i11 != 0) {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    od.m10798c(obj);
                    return obj;
                }
                od.m10798c(obj);
                this.f34153b = 1;
                Object objDoWork = this.f34154c.doWork(this);
                return objDoWork == enumC7794a2 ? enumC7794a2 : objDoWork;
        }
    }
}
