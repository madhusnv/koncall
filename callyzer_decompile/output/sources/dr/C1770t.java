package dr;

import a9.C0073l;
import com.websoptimization.callyzerbiz.MainActivity;
import com.websoptimization.callyzerbiz.data.model.response.LeadNoteSaveResponse;
import ct.C1502a;
import dt.C1813s;
import ep.C2088f;
import eq.C2100l;
import er.AbstractC2111k;
import ex.InterfaceC2137a;
import ex.InterfaceC2139c;
import ex.InterfaceC2141e;
import f2.C2179b;
import f2.C2193p;
import fk.C2309o;
import fk.a1;
import fk.h1;
import fk.k0;
import fu.C2375c;
import fv.C2386k;
import g2.l5;
import g2.qa;
import g2.u5;
import g2.x5;
import gj.C2619a;
import gp.C2703n;
import gr.C2713i;
import gs.C2721g;
import gs.C2728n;
import h1.InterfaceC2779j;
import im.InterfaceC3307i;
import im.m0;
import java.util.ArrayList;
import m1.InterfaceC4628j;
import og.id;
import org.bouncycastle.iana.AEADAlgorithm;
import q1.C6097y;
import s6.C6765d;
import tq.EnumC7204p;
import tx.InterfaceC7266z;
import ur.AbstractC7523p;
import uw.InterfaceC7559c;
import w3.InterfaceC7888f;
import ww.AbstractC8199i;
import wx.InterfaceC8209j;
import z7.AbstractC8894w;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: dr.t */
/* loaded from: classes3.dex */
public final class C1770t extends AbstractC8199i implements InterfaceC2141e {

    /* renamed from: a */
    public final /* synthetic */ int f8590a;

    /* renamed from: b */
    public int f8591b;

    /* renamed from: c */
    public Object f8592c;

    /* renamed from: d */
    public final /* synthetic */ Object f8593d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C1770t(Object obj, Object obj2, InterfaceC7559c interfaceC7559c, int i10) {
        super(2, interfaceC7559c);
        this.f8590a = i10;
        this.f8592c = obj;
        this.f8593d = obj2;
    }

    /* JADX WARN: Type inference failed for: r1v21, types: [ex.c, ww.i] */
    @Override // ww.AbstractC8191a
    public final InterfaceC7559c create(Object obj, InterfaceC7559c interfaceC7559c) {
        switch (this.f8590a) {
            case 0:
                return new C1770t((ArrayList) this.f8592c, (C1775y) this.f8593d, interfaceC7559c, 0);
            case 1:
                return new C1770t((C6097y) this.f8592c, (C2721g) this.f8593d, interfaceC7559c, 1);
            case 2:
                return new C1770t((C2728n) this.f8592c, (InterfaceC2139c) this.f8593d, interfaceC7559c, 2);
            case 3:
                return new C1770t((C1813s) this.f8592c, (C1502a) this.f8593d, interfaceC7559c, 3);
            case 4:
                return new C1770t((C1813s) this.f8592c, (EnumC7204p) this.f8593d, interfaceC7559c, 4);
            case 5:
                return new C1770t((InterfaceC3307i) this.f8592c, (C2088f) this.f8593d, interfaceC7559c, 5);
            case 6:
                return new C1770t((AbstractC7523p) this.f8592c, (C2088f) this.f8593d, interfaceC7559c, 6);
            case 7:
                return new C1770t((C2100l) this.f8592c, (AbstractC7523p) this.f8593d, interfaceC7559c, 7);
            case 8:
                C1770t c1770t = new C1770t((C2179b) this.f8593d, interfaceC7559c, 8);
                c1770t.f8592c = obj;
                return c1770t;
            case 9:
                return new C1770t((C2193p) this.f8592c, (InterfaceC2779j) this.f8593d, interfaceC7559c, 9);
            case 10:
                return new C1770t((AbstractC8894w) this.f8592c, (InterfaceC2139c) this.f8593d, interfaceC7559c);
            case 11:
                return new C1770t((C2309o) this.f8592c, (a1) this.f8593d, interfaceC7559c, 11);
            case 12:
                return new C1770t((h1) this.f8592c, (k0) this.f8593d, interfaceC7559c, 12);
            case 13:
                return new C1770t((C0073l) this.f8592c, (m0) this.f8593d, interfaceC7559c, 13);
            case 14:
                return new C1770t((C2703n) this.f8592c, (InterfaceC2139c) this.f8593d, interfaceC7559c, 14);
            case AEADAlgorithm.AEAD_AES_SIV_CMAC_256 /* 15 */:
                return new C1770t((C2375c) this.f8593d, interfaceC7559c, 15);
            case 16:
                return new C1770t((C2386k) this.f8592c, (LeadNoteSaveResponse) this.f8593d, interfaceC7559c, 16);
            case 17:
                return new C1770t((C2386k) this.f8592c, (id) this.f8593d, interfaceC7559c, 17);
            case 18:
                return new C1770t((C2386k) this.f8592c, (C1502a) this.f8593d, interfaceC7559c, 18);
            case 19:
                C1770t c1770t2 = new C1770t((l5) this.f8593d, interfaceC7559c, 19);
                c1770t2.f8592c = obj;
                return c1770t2;
            case 20:
                return new C1770t((x5) this.f8592c, (u5) this.f8593d, interfaceC7559c, 20);
            case 21:
                return new C1770t((x5) this.f8592c, (InterfaceC4628j) this.f8593d, interfaceC7559c, 21);
            case 22:
                C1770t c1770t3 = new C1770t((InterfaceC2137a) this.f8593d, interfaceC7559c, 22);
                c1770t3.f8592c = obj;
                return c1770t3;
            case 23:
                return new C1770t((qa) this.f8592c, (InterfaceC7888f) this.f8593d, interfaceC7559c, 23);
            case 24:
                return new C1770t((C2619a) this.f8592c, (InterfaceC2139c) this.f8593d, interfaceC7559c, 24);
            case 25:
                return new C1770t((C2619a) this.f8592c, (C6765d) this.f8593d, interfaceC7559c, 25);
            case 26:
                return new C1770t((InterfaceC8209j) this.f8592c, (MainActivity) this.f8593d, interfaceC7559c, 26);
            case 27:
                C1770t c1770t4 = new C1770t((C2703n) this.f8593d, interfaceC7559c, 27);
                c1770t4.f8592c = obj;
                return c1770t4;
            case 28:
                return new C1770t((ArrayList) this.f8592c, (C2703n) this.f8593d, interfaceC7559c, 28);
            default:
                return new C1770t((AbstractC2111k) this.f8592c, (C2713i) this.f8593d, interfaceC7559c, 29);
        }
    }

    @Override // ex.InterfaceC2141e
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f8590a) {
        }
        return ((C1770t) create((InterfaceC7266z) obj, (InterfaceC7559c) obj2)).invokeSuspend(qw.a0.f30746a);
    }

    /* JADX WARN: Removed duplicated region for block: B:143:0x02f9  */
    /* JADX WARN: Removed duplicated region for block: B:340:0x06e4  */
    /* JADX WARN: Removed duplicated region for block: B:341:0x06e9  */
    /* JADX WARN: Removed duplicated region for block: B:345:0x06f7  */
    /* JADX WARN: Removed duplicated region for block: B:346:0x0701  */
    /* JADX WARN: Removed duplicated region for block: B:581:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r3v35, types: [ex.c, ww.i] */
    @Override // ww.AbstractC8191a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r35) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 2908
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: dr.C1770t.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C1770t(Object obj, InterfaceC7559c interfaceC7559c, int i10) {
        super(2, interfaceC7559c);
        this.f8590a = i10;
        this.f8593d = obj;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C1770t(AbstractC8894w abstractC8894w, InterfaceC2139c interfaceC2139c, InterfaceC7559c interfaceC7559c) {
        super(2, interfaceC7559c);
        this.f8590a = 10;
        this.f8592c = abstractC8894w;
        this.f8593d = (AbstractC8199i) interfaceC2139c;
    }
}
