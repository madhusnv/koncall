package nu;

import bu.C0782a;
import ex.InterfaceC2141e;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import mm.C4802m;
import o6.C5307i;
import og.ma;
import og.od;
import qw.a0;
import rw.AbstractC6664n;
import tx.InterfaceC7266z;
import tx.c0;
import uw.InterfaceC7559c;
import vw.EnumC7794a;
import ww.AbstractC8199i;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: nu.c */
/* loaded from: classes3.dex */
public final class C5142c extends AbstractC8199i implements InterfaceC2141e {

    /* renamed from: a */
    public final /* synthetic */ int f25191a;

    /* renamed from: b */
    public int f25192b;

    /* renamed from: c */
    public /* synthetic */ Object f25193c;

    /* renamed from: d */
    public final /* synthetic */ List f25194d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C5142c(List list, InterfaceC7559c interfaceC7559c, int i10) {
        super(2, interfaceC7559c);
        this.f25191a = i10;
        this.f25194d = list;
    }

    @Override // ww.AbstractC8191a
    public final InterfaceC7559c create(Object obj, InterfaceC7559c interfaceC7559c) {
        switch (this.f25191a) {
            case 0:
                C5142c c5142c = new C5142c(this.f25194d, interfaceC7559c, 0);
                c5142c.f25193c = obj;
                return c5142c;
            default:
                C5142c c5142c2 = new C5142c(this.f25194d, interfaceC7559c, 1);
                c5142c2.f25193c = obj;
                return c5142c2;
        }
    }

    @Override // ex.InterfaceC2141e
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f25191a) {
            case 0:
                return ((C5142c) create((InterfaceC7266z) obj, (InterfaceC7559c) obj2)).invokeSuspend(a0.f30746a);
            default:
                return ((C5142c) create((C5307i) obj, (InterfaceC7559c) obj2)).invokeSuspend(a0.f30746a);
        }
    }

    @Override // ww.AbstractC8191a
    public final Object invokeSuspend(Object obj) {
        switch (this.f25191a) {
            case 0:
                InterfaceC7266z interfaceC7266z = (InterfaceC7266z) this.f25193c;
                EnumC7794a enumC7794a = EnumC7794a.COROUTINE_SUSPENDED;
                int i10 = this.f25192b;
                boolean z6 = true;
                if (i10 == 0) {
                    od.m10798c(obj);
                    List list = this.f25194d;
                    ArrayList arrayList = new ArrayList(AbstractC6664n.m12768r(list, 10));
                    Iterator it = list.iterator();
                    while (true) {
                        InterfaceC7559c interfaceC7559c = null;
                        if (it.hasNext()) {
                            arrayList.add(c0.m13482e(interfaceC7266z, null, new C0782a((C4802m) it.next(), interfaceC7559c, 12), 3));
                        } else {
                            this.f25193c = null;
                            this.f25192b = 1;
                            obj = c0.m13483f(arrayList, this);
                            if (obj == enumC7794a) {
                                return enumC7794a;
                            }
                        }
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    od.m10798c(obj);
                }
                Iterable iterable = (Iterable) obj;
                if ((iterable instanceof Collection) && ((Collection) iterable).isEmpty()) {
                    z6 = false;
                } else {
                    Iterator it2 = iterable.iterator();
                    while (it2.hasNext()) {
                        if (((Boolean) it2.next()).booleanValue()) {
                        }
                    }
                    z6 = false;
                }
                return Boolean.valueOf(z6);
            default:
                EnumC7794a enumC7794a2 = EnumC7794a.COROUTINE_SUSPENDED;
                int i11 = this.f25192b;
                if (i11 == 0) {
                    od.m10798c(obj);
                    C5307i c5307i = (C5307i) this.f25193c;
                    this.f25192b = 1;
                    if (ma.m10759a(this.f25194d, c5307i, this) == enumC7794a2) {
                        return enumC7794a2;
                    }
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    od.m10798c(obj);
                }
                return a0.f30746a;
        }
    }
}
