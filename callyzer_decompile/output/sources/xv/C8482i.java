package xv;

import al.C0182j;
import b00.AbstractC0517b;
import b00.C0522g;
import c9.C0922q;
import com.websoptimization.callyzerbiz.workManager.CallNotesTemplatesWorkManager;
import d9.C1664i;
import ex.InterfaceC2141e;
import java.io.IOException;
import java.util.LinkedHashSet;
import kotlin.jvm.internal.AbstractC4154l;
import og.od;
import qw.a0;
import rw.AbstractC6663m;
import t8.C7059e;
import t8.EnumC7068n;
import t8.EnumC7078x;
import tx.InterfaceC7266z;
import u8.C7368p;
import uw.InterfaceC7559c;
import vw.EnumC7794a;
import ww.AbstractC8199i;
import zd.C8940d;
import zo.C9000c;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: xv.i */
/* loaded from: classes3.dex */
public final class C8482i extends AbstractC8199i implements InterfaceC2141e {

    /* renamed from: a */
    public final /* synthetic */ int f41317a;

    /* renamed from: b */
    public final /* synthetic */ Object f41318b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C8482i(Object obj, InterfaceC7559c interfaceC7559c, int i10) {
        super(2, interfaceC7559c);
        this.f41317a = i10;
        this.f41318b = obj;
    }

    @Override // ww.AbstractC8191a
    public final InterfaceC7559c create(Object obj, InterfaceC7559c interfaceC7559c) {
        switch (this.f41317a) {
            case 0:
                return new C8482i((C8489p) this.f41318b, interfaceC7559c, 0);
            default:
                return new C8482i((C8940d) this.f41318b, interfaceC7559c, 1);
        }
    }

    @Override // ex.InterfaceC2141e
    public final Object invoke(Object obj, Object obj2) {
        InterfaceC7266z interfaceC7266z = (InterfaceC7266z) obj;
        InterfaceC7559c interfaceC7559c = (InterfaceC7559c) obj2;
        switch (this.f41317a) {
            case 0:
                C8482i c8482i = (C8482i) create(interfaceC7266z, interfaceC7559c);
                a0 a0Var = a0.f30746a;
                c8482i.invokeSuspend(a0Var);
                return a0Var;
            default:
                return ((C8482i) create(interfaceC7266z, interfaceC7559c)).invokeSuspend(a0.f30746a);
        }
    }

    @Override // ww.AbstractC8191a
    public final Object invokeSuspend(Object obj) {
        switch (this.f41317a) {
            case 0:
                EnumC7794a enumC7794a = EnumC7794a.COROUTINE_SUSPENDED;
                od.m10798c(obj);
                if (!((C8489p) this.f41318b).f41358f.m16468d("callNoteTemplatesFetchType")) {
                    C9000c c9000c = ((C8489p) this.f41318b).f41358f;
                    EnumC7068n workPolicy = EnumC7068n.REPLACE;
                    synchronized (c9000c) {
                        AbstractC4154l.m8923f(workPolicy, "workPolicy");
                        C0182j c0182j = new C0182j(CallNotesTemplatesWorkManager.class);
                        c0182j.m410a("callNoteTemplatesFetchType");
                        EnumC7078x enumC7078x = EnumC7078x.NOT_REQUIRED;
                        LinkedHashSet linkedHashSet = new LinkedHashSet();
                        EnumC7078x networkType = EnumC7078x.CONNECTED;
                        AbstractC4154l.m8923f(networkType, "networkType");
                        ((C0922q) c0182j.f556c).f5631j = new C7059e(new C1664i(null), networkType, false, false, false, false, -1L, -1L, AbstractC6663m.g0(linkedHashSet));
                        C7368p.m13783g(c9000c.f43353a).m13355c("callNoteTemplatesFetchType", workPolicy, c0182j.m411b());
                    }
                }
                return a0.f30746a;
            default:
                EnumC7794a enumC7794a2 = EnumC7794a.COROUTINE_SUSPENDED;
                od.m10798c(obj);
                C8940d c8940d = (C8940d) this.f41318b;
                synchronized (c8940d) {
                    if (!c8940d.f42938m || c8940d.f42939n) {
                        return a0.f30746a;
                    }
                    try {
                        c8940d.m16416R();
                    } catch (IOException unused) {
                        c8940d.f42940p = true;
                    }
                    try {
                        if (c8940d.f42935j >= 2000) {
                            c8940d.m16417U();
                        }
                    } catch (IOException unused2) {
                        c8940d.f42941q = true;
                        c8940d.f42936k = AbstractC0517b.m1523b(new C0522g());
                    }
                    return a0.f30746a;
                }
        }
    }
}
