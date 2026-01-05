package ps;

import al.C0182j;
import androidx.fragment.app.C0348m;
import du.AbstractC1839u;
import ex.InterfaceC2139c;
import ex.InterfaceC2141e;
import im.InterfaceC3307i;
import java.util.ArrayList;
import java.util.List;
import kn.C4121a;
import mm.C4791b;
import mm.C4802m;
import nt.C5138b;
import og.c1;
import org.bouncycastle.iana.AEADAlgorithm;
import p020v.x0;
import p3.InterfaceC5822t;
import pt.C6032f;
import qn.C6263l;
import qq.C6276b;
import qu.C6324e;
import rn.q0;
import rt.C6620d;
import rv.p0;
import rv.v0;
import sp.C6883f;
import ss.z0;
import su.C6952k;
import t1.AbstractC7000y;
import tb.C7096g;
import tb.l0;
import tt.C7224g;
import tx.InterfaceC7266z;
import u1.C7303e;
import up.C7494g;
import ur.AbstractC7524q;
import uw.InterfaceC7559c;
import wu.C8186a;
import ww.AbstractC8199i;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes3.dex */
public final class c0 extends AbstractC8199i implements InterfaceC2141e {

    /* renamed from: a */
    public final /* synthetic */ int f29337a;

    /* renamed from: b */
    public int f29338b;

    /* renamed from: c */
    public Object f29339c;

    /* renamed from: d */
    public Object f29340d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c0(Object obj, Object obj2, InterfaceC7559c interfaceC7559c, int i10) {
        super(2, interfaceC7559c);
        this.f29337a = i10;
        this.f29339c = obj;
        this.f29340d = obj2;
    }

    @Override // ww.AbstractC8191a
    public final InterfaceC7559c create(Object obj, InterfaceC7559c interfaceC7559c) {
        switch (this.f29337a) {
            case 0:
                return new c0((C8186a) this.f29339c, (z0) this.f29340d, interfaceC7559c, 0);
            case 1:
                return new c0((C6032f) this.f29339c, (C5138b) this.f29340d, interfaceC7559c, 1);
            case 2:
                return new c0((C6032f) this.f29339c, (c1) this.f29340d, interfaceC7559c, 2);
            case 3:
                return new c0((C6263l) this.f29339c, (C4802m) this.f29340d, interfaceC7559c, 3);
            case 4:
                return new c0((C6263l) this.f29339c, (List) this.f29340d, interfaceC7559c, 4);
            case 5:
                return new c0((C6276b) this.f29340d, interfaceC7559c, 5);
            case 6:
                return new c0((AbstractC7524q) this.f29339c, (l7.a0) this.f29340d, interfaceC7559c, 6);
            case 7:
                return new c0((C6324e) this.f29339c, (String) this.f29340d, interfaceC7559c, 7);
            case 8:
                return new c0((v0) this.f29339c, (InterfaceC2139c) this.f29340d, interfaceC7559c, 8);
            case 9:
                return new c0((x0) this.f29339c, (C4802m) this.f29340d, interfaceC7559c, 9);
            case 10:
                c0 c0Var = new c0((rn.h0) this.f29340d, interfaceC7559c, 10);
                c0Var.f29339c = obj;
                return c0Var;
            case 11:
                return new c0((C4791b) this.f29339c, (rn.h0) this.f29340d, interfaceC7559c, 11);
            case 12:
                return new c0((rn.h0) this.f29339c, (C4121a) this.f29340d, interfaceC7559c, 12);
            case 13:
                return new c0((q0) this.f29339c, (C4121a) this.f29340d, interfaceC7559c, 13);
            case 14:
                c0 c0Var2 = new c0((C0182j) this.f29340d, interfaceC7559c, 14);
                c0Var2.f29339c = obj;
                return c0Var2;
            case AEADAlgorithm.AEAD_AES_SIV_CMAC_256 /* 15 */:
                return new c0((C6883f) this.f29339c, (l7.a0) this.f29340d, interfaceC7559c, 15);
            case 16:
                return new c0((p0) this.f29340d, interfaceC7559c, 16);
            case 17:
                return new c0((p0) this.f29340d, interfaceC7559c, 17);
            case 18:
                return new c0((p0) this.f29339c, (ArrayList) this.f29340d, interfaceC7559c, 18);
            case 19:
                c0 c0Var3 = new c0((v0) this.f29340d, interfaceC7559c, 19);
                c0Var3.f29339c = obj;
                return c0Var3;
            case 20:
                return new c0((InterfaceC3307i) this.f29339c, (C6883f) this.f29340d, interfaceC7559c, 20);
            case 21:
                return new c0((z0) this.f29339c, interfaceC7559c);
            case 22:
                return new c0((z0) this.f29340d, (String) this.f29339c, interfaceC7559c);
            case 23:
                return new c0((C6952k) this.f29339c, (AbstractC1839u) this.f29340d, interfaceC7559c, 23);
            case 24:
                return new c0((InterfaceC5822t) this.f29339c, (AbstractC7000y) this.f29340d, interfaceC7559c, 24);
            case 25:
                return new c0((l0) this.f29339c, (C7096g) this.f29340d, interfaceC7559c, 25);
            case 26:
                return new c0((C7494g) this.f29339c, (l7.a0) this.f29340d, interfaceC7559c, 26);
            case 27:
                c0 c0Var4 = new c0((C7224g) this.f29340d, interfaceC7559c, 27);
                c0Var4.f29339c = obj;
                return c0Var4;
            case 28:
                return new c0((C7224g) this.f29339c, (C6620d) this.f29340d, interfaceC7559c, 28);
            default:
                return new c0((C7303e) this.f29339c, (C0348m) this.f29340d, interfaceC7559c, 29);
        }
    }

    @Override // ex.InterfaceC2141e
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f29337a) {
        }
        return ((c0) create((InterfaceC7266z) obj, (InterfaceC7559c) obj2)).invokeSuspend(qw.a0.f30746a);
    }

    /* JADX WARN: Removed duplicated region for block: B:110:0x0240  */
    /* JADX WARN: Removed duplicated region for block: B:538:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:553:? A[RETURN, SYNTHETIC] */
    @Override // ww.AbstractC8191a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r41) {
        /*
            Method dump skipped, instructions count: 2754
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ps.c0.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c0(Object obj, InterfaceC7559c interfaceC7559c, int i10) {
        super(2, interfaceC7559c);
        this.f29337a = i10;
        this.f29340d = obj;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c0(z0 z0Var, String str, InterfaceC7559c interfaceC7559c) {
        super(2, interfaceC7559c);
        this.f29337a = 22;
        this.f29340d = z0Var;
        this.f29339c = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c0(z0 z0Var, InterfaceC7559c interfaceC7559c) {
        super(2, interfaceC7559c);
        this.f29337a = 21;
        this.f29339c = z0Var;
    }
}
