package uw;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import qw.C6363m;
import vw.EnumC7794a;
import ww.InterfaceC8194d;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: uw.j */
/* loaded from: classes3.dex */
public final class C7566j implements InterfaceC7559c, InterfaceC8194d {

    /* renamed from: b */
    public static final AtomicReferenceFieldUpdater f36441b = AtomicReferenceFieldUpdater.newUpdater(C7566j.class, Object.class, "result");

    /* renamed from: a */
    public final InterfaceC7559c f36442a;
    private volatile Object result;

    public C7566j(InterfaceC7559c interfaceC7559c, EnumC7794a enumC7794a) {
        this.f36442a = interfaceC7559c;
        this.result = enumC7794a;
    }

    /* renamed from: a */
    public final Object m14303a() {
        Object obj = this.result;
        EnumC7794a enumC7794a = EnumC7794a.UNDECIDED;
        if (obj == enumC7794a) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f36441b;
            EnumC7794a enumC7794a2 = EnumC7794a.COROUTINE_SUSPENDED;
            while (!atomicReferenceFieldUpdater.compareAndSet(this, enumC7794a, enumC7794a2)) {
                if (atomicReferenceFieldUpdater.get(this) != enumC7794a) {
                    obj = this.result;
                }
            }
            return EnumC7794a.COROUTINE_SUSPENDED;
        }
        if (obj == EnumC7794a.RESUMED) {
            return EnumC7794a.COROUTINE_SUSPENDED;
        }
        if (obj instanceof C6363m) {
            throw ((C6363m) obj).f30757a;
        }
        return obj;
    }

    @Override // ww.InterfaceC8194d
    public final InterfaceC8194d getCallerFrame() {
        InterfaceC7559c interfaceC7559c = this.f36442a;
        if (interfaceC7559c instanceof InterfaceC8194d) {
            return (InterfaceC8194d) interfaceC7559c;
        }
        return null;
    }

    @Override // uw.InterfaceC7559c
    public final InterfaceC7564h getContext() {
        return this.f36442a.getContext();
    }

    @Override // uw.InterfaceC7559c
    public final void resumeWith(Object obj) {
        while (true) {
            Object obj2 = this.result;
            EnumC7794a enumC7794a = EnumC7794a.UNDECIDED;
            if (obj2 == enumC7794a) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f36441b;
                while (!atomicReferenceFieldUpdater.compareAndSet(this, enumC7794a, obj)) {
                    if (atomicReferenceFieldUpdater.get(this) != enumC7794a) {
                        break;
                    }
                }
                return;
            }
            EnumC7794a enumC7794a2 = EnumC7794a.COROUTINE_SUSPENDED;
            if (obj2 != enumC7794a2) {
                throw new IllegalStateException("Already resumed");
            }
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = f36441b;
            EnumC7794a enumC7794a3 = EnumC7794a.RESUMED;
            while (!atomicReferenceFieldUpdater2.compareAndSet(this, enumC7794a2, enumC7794a3)) {
                if (atomicReferenceFieldUpdater2.get(this) != enumC7794a2) {
                    break;
                }
            }
            this.f36442a.resumeWith(obj);
            return;
        }
    }

    public final String toString() {
        return "SafeContinuation for " + this.f36442a;
    }

    public C7566j(InterfaceC7559c interfaceC7559c) {
        EnumC7794a enumC7794a = EnumC7794a.UNDECIDED;
        this.f36442a = interfaceC7559c;
        this.result = enumC7794a;
    }
}
