package rn;

import com.amplifyframework.kotlin.storage.Storage;
import com.amplifyframework.storage.StoragePath;
import ex.InterfaceC2141e;
import kotlin.jvm.internal.C4164v;
import og.od;
import tx.InterfaceC7266z;
import uw.InterfaceC7559c;
import vw.EnumC7794a;
import ww.AbstractC8199i;
import wx.c1;
import wx.w0;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: rn.m */
/* loaded from: classes3.dex */
public final class C6584m extends AbstractC8199i implements InterfaceC2141e {

    /* renamed from: a */
    public int f31581a;

    /* renamed from: b */
    public final /* synthetic */ h0 f31582b;

    /* renamed from: c */
    public final /* synthetic */ C4164v f31583c;

    /* renamed from: d */
    public final /* synthetic */ Storage.InProgressStorageOperation f31584d;

    /* renamed from: e */
    public final /* synthetic */ tx.g0 f31585e;

    /* renamed from: f */
    public final /* synthetic */ StoragePath f31586f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6584m(Storage.InProgressStorageOperation inProgressStorageOperation, StoragePath storagePath, C4164v c4164v, h0 h0Var, tx.g0 g0Var, InterfaceC7559c interfaceC7559c) {
        super(2, interfaceC7559c);
        this.f31582b = h0Var;
        this.f31583c = c4164v;
        this.f31584d = inProgressStorageOperation;
        this.f31585e = g0Var;
        this.f31586f = storagePath;
    }

    @Override // ww.AbstractC8191a
    public final InterfaceC7559c create(Object obj, InterfaceC7559c interfaceC7559c) {
        tx.g0 g0Var = this.f31585e;
        return new C6584m(this.f31584d, this.f31586f, this.f31583c, this.f31582b, g0Var, interfaceC7559c);
    }

    @Override // ex.InterfaceC2141e
    public final Object invoke(Object obj, Object obj2) {
        return ((C6584m) create((InterfaceC7266z) obj, (InterfaceC7559c) obj2)).invokeSuspend(qw.a0.f30746a);
    }

    @Override // ww.AbstractC8191a
    public final Object invokeSuspend(Object obj) {
        EnumC7794a enumC7794a = EnumC7794a.COROUTINE_SUSPENDED;
        int i10 = this.f31581a;
        if (i10 == 0) {
            od.m10798c(obj);
            h0 h0Var = this.f31582b;
            w0 w0Var = h0Var.f31525g.f42471f;
            C6583l c6583l = new C6583l(this.f31584d, this.f31586f, this.f31583c, h0Var, this.f31585e, null);
            this.f31581a = 1;
            if (c1.m15379j(w0Var, c6583l, this) == enumC7794a) {
                return enumC7794a;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            od.m10798c(obj);
        }
        return qw.a0.f30746a;
    }
}
