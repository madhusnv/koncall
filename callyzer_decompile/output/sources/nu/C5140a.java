package nu;

import ex.InterfaceC2141e;
import hp.C2995b;
import io.C3328c;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import lp.C4504f;
import mm.C4802m;
import og.od;
import qw.a0;
import rw.AbstractC6663m;
import rw.AbstractC6664n;
import tx.InterfaceC7266z;
import tx.c0;
import uw.InterfaceC7559c;
import vw.EnumC7794a;
import ww.AbstractC8199i;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: nu.a */
/* loaded from: classes3.dex */
public final class C5140a extends AbstractC8199i implements InterfaceC2141e {

    /* renamed from: a */
    public final /* synthetic */ int f25182a;

    /* renamed from: b */
    public int f25183b;

    /* renamed from: c */
    public /* synthetic */ Object f25184c;

    /* renamed from: d */
    public final /* synthetic */ List f25185d;

    /* renamed from: e */
    public final /* synthetic */ C3328c f25186e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C5140a(List list, C3328c c3328c, InterfaceC7559c interfaceC7559c, int i10) {
        super(2, interfaceC7559c);
        this.f25182a = i10;
        this.f25185d = list;
        this.f25186e = c3328c;
    }

    @Override // ww.AbstractC8191a
    public final InterfaceC7559c create(Object obj, InterfaceC7559c interfaceC7559c) {
        switch (this.f25182a) {
            case 0:
                C5140a c5140a = new C5140a(this.f25185d, this.f25186e, interfaceC7559c, 0);
                c5140a.f25184c = obj;
                return c5140a;
            default:
                C5140a c5140a2 = new C5140a(this.f25185d, this.f25186e, interfaceC7559c, 1);
                c5140a2.f25184c = obj;
                return c5140a2;
        }
    }

    @Override // ex.InterfaceC2141e
    public final Object invoke(Object obj, Object obj2) {
        InterfaceC7266z interfaceC7266z = (InterfaceC7266z) obj;
        InterfaceC7559c interfaceC7559c = (InterfaceC7559c) obj2;
        switch (this.f25182a) {
        }
        return ((C5140a) create(interfaceC7266z, interfaceC7559c)).invokeSuspend(a0.f30746a);
    }

    @Override // ww.AbstractC8191a
    public final Object invokeSuspend(Object obj) {
        switch (this.f25182a) {
            case 0:
                InterfaceC7266z interfaceC7266z = (InterfaceC7266z) this.f25184c;
                EnumC7794a enumC7794a = EnumC7794a.COROUTINE_SUSPENDED;
                int i10 = this.f25183b;
                if (i10 == 0) {
                    od.m10798c(obj);
                    List list = this.f25185d;
                    ArrayList arrayList = new ArrayList(AbstractC6664n.m12768r(list, 10));
                    Iterator it = list.iterator();
                    while (true) {
                        InterfaceC7559c interfaceC7559c = null;
                        if (it.hasNext()) {
                            arrayList.add(c0.m13482e(interfaceC7266z, null, new C2995b((C4802m) it.next(), this.f25186e, interfaceC7559c, 27), 3));
                        } else {
                            this.f25184c = null;
                            this.f25183b = 1;
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
                return AbstractC6663m.m12740D((Iterable) obj);
            default:
                InterfaceC7266z interfaceC7266z2 = (InterfaceC7266z) this.f25184c;
                EnumC7794a enumC7794a2 = EnumC7794a.COROUTINE_SUSPENDED;
                int i11 = this.f25183b;
                if (i11 != 0) {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    od.m10798c(obj);
                    return obj;
                }
                od.m10798c(obj);
                List list2 = this.f25185d;
                ArrayList arrayList2 = new ArrayList(AbstractC6664n.m12768r(list2, 10));
                Iterator it2 = list2.iterator();
                while (it2.hasNext()) {
                    arrayList2.add(c0.m13482e(interfaceC7266z2, null, new C4504f(this.f25186e, (C4802m) it2.next(), null, 17), 3));
                }
                this.f25184c = null;
                this.f25183b = 1;
                Object objM13483f = c0.m13483f(arrayList2, this);
                return objM13483f == enumC7794a2 ? enumC7794a2 : objM13483f;
        }
    }
}
