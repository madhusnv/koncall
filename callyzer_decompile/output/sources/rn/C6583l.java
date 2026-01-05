package rn;

import com.amplifyframework.kotlin.storage.Storage;
import com.amplifyframework.storage.StoragePath;
import ex.InterfaceC2141e;
import kotlin.jvm.internal.C4164v;
import og.od;
import uw.InterfaceC7559c;
import vw.EnumC7794a;
import ww.AbstractC8199i;
import yv.C8801p;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: rn.l */
/* loaded from: classes3.dex */
public final class C6583l extends AbstractC8199i implements InterfaceC2141e {

    /* renamed from: a */
    public /* synthetic */ Object f31569a;

    /* renamed from: b */
    public final /* synthetic */ C4164v f31570b;

    /* renamed from: c */
    public final /* synthetic */ h0 f31571c;

    /* renamed from: d */
    public final /* synthetic */ Storage.InProgressStorageOperation f31572d;

    /* renamed from: e */
    public final /* synthetic */ tx.g0 f31573e;

    /* renamed from: f */
    public final /* synthetic */ StoragePath f31574f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6583l(Storage.InProgressStorageOperation inProgressStorageOperation, StoragePath storagePath, C4164v c4164v, h0 h0Var, tx.g0 g0Var, InterfaceC7559c interfaceC7559c) {
        super(2, interfaceC7559c);
        this.f31570b = c4164v;
        this.f31571c = h0Var;
        this.f31572d = inProgressStorageOperation;
        this.f31573e = g0Var;
        this.f31574f = storagePath;
    }

    @Override // ww.AbstractC8191a
    public final InterfaceC7559c create(Object obj, InterfaceC7559c interfaceC7559c) {
        tx.g0 g0Var = this.f31573e;
        C6583l c6583l = new C6583l(this.f31572d, this.f31574f, this.f31570b, this.f31571c, g0Var, interfaceC7559c);
        c6583l.f31569a = obj;
        return c6583l;
    }

    @Override // ex.InterfaceC2141e
    public final Object invoke(Object obj, Object obj2) {
        C6583l c6583l = (C6583l) create((C8801p) obj, (InterfaceC7559c) obj2);
        qw.a0 a0Var = qw.a0.f30746a;
        c6583l.invokeSuspend(a0Var);
        return a0Var;
    }

    @Override // ww.AbstractC8191a
    public final Object invokeSuspend(Object obj) {
        C8801p c8801p = (C8801p) this.f31569a;
        EnumC7794a enumC7794a = EnumC7794a.COROUTINE_SUSPENDED;
        od.m10798c(obj);
        if (!c8801p.f42464a && this.f31570b.f21160a) {
            h0 h0Var = this.f31571c;
            h0Var.m12616i("fileUploadOperation: manual cancelled ", null);
            this.f31572d.cancel();
            this.f31573e.mo13510j(null);
            h0Var.m12616i(" >>> fileUploadOperation manual cancelled for file path:-" + this.f31574f + " \n", null);
        }
        return qw.a0.f30746a;
    }
}
