package lu;

import al.C0182j;
import android.content.Context;
import android.content.res.Resources;
import ex.InterfaceC2139c;
import ex.InterfaceC2141e;
import im.InterfaceC3307i;
import iu.AbstractC3353e;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import k2.w0;
import l4.d0;
import mt.EnumC4872a;
import np.C5128f;
import o6.b1;
import org.bouncycastle.iana.AEADAlgorithm;
import p005f.C2162k;
import pp.C5995k;
import pt.C6032f;
import qr.C6294r;
import qu.C6324e;
import qv.C6338m;
import qw.a0;
import rn.h0;
import rr.C6610j;
import rv.AbstractC6650z;
import rv.p0;
import rv.v0;
import s6.C6763b;
import sb.InterfaceC6777d;
import sp.C6883f;
import su.C6952k;
import tb.C7096g;
import tb.l0;
import tt.C7224g;
import tx.C7251k;
import tx.InterfaceC7266z;
import u2.C7320q;
import up.C7494g;
import uw.InterfaceC7559c;
import v7.AbstractC7685c;
import wc.e0;
import wo.C8134s;
import wp.C8141g;
import wu.C8186a;
import ww.AbstractC8199i;
import yv.C8801p;
import yv.C8805t;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: lu.k */
/* loaded from: classes3.dex */
public final class C4525k extends AbstractC8199i implements InterfaceC2141e {

    /* renamed from: a */
    public final /* synthetic */ int f22492a;

    /* renamed from: b */
    public /* synthetic */ Object f22493b;

    /* renamed from: c */
    public final /* synthetic */ Object f22494c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C4525k(Object obj, Object obj2, InterfaceC7559c interfaceC7559c, int i10) {
        super(2, interfaceC7559c);
        this.f22492a = i10;
        this.f22493b = obj;
        this.f22494c = obj2;
    }

    @Override // ww.AbstractC8191a
    public final InterfaceC7559c create(Object obj, InterfaceC7559c interfaceC7559c) {
        switch (this.f22492a) {
            case 0:
                return new C4525k((C6324e) this.f22493b, (w0) this.f22494c, interfaceC7559c, 0);
            case 1:
                return new C4525k((ArrayList) this.f22493b, (C5128f) this.f22494c, interfaceC7559c, 1);
            case 2:
                C4525k c4525k = new C4525k((b1) this.f22494c, interfaceC7559c, 2);
                c4525k.f22493b = obj;
                return c4525k;
            case 3:
                return new C4525k((C5995k) this.f22493b, (Integer) this.f22494c, interfaceC7559c, 3);
            case 4:
                C4525k c4525k2 = new C4525k((Context) this.f22494c, interfaceC7559c, 4);
                c4525k2.f22493b = obj;
                return c4525k2;
            case 5:
                return new C4525k((ArrayList) this.f22493b, (C5995k) this.f22494c, interfaceC7559c, 5);
            case 6:
                return new C4525k((C2162k) this.f22493b, (Context) this.f22494c, interfaceC7559c, 6);
            case 7:
                C4525k c4525k3 = new C4525k((C6032f) this.f22494c, interfaceC7559c, 7);
                c4525k3.f22493b = obj;
                return c4525k3;
            case 8:
                C4525k c4525k4 = new C4525k((C6294r) this.f22494c, interfaceC7559c, 8);
                c4525k4.f22493b = obj;
                return c4525k4;
            case 9:
                return new C4525k((InterfaceC2139c) this.f22493b, (InterfaceC2139c) this.f22494c, interfaceC7559c, 9);
            case 10:
                C4525k c4525k5 = new C4525k((C6338m) this.f22494c, interfaceC7559c, 10);
                c4525k5.f22493b = obj;
                return c4525k5;
            case 11:
                C4525k c4525k6 = new C4525k((Set) this.f22494c, interfaceC7559c, 11);
                c4525k6.f22493b = obj;
                return c4525k6;
            case 12:
                return new C4525k((h0) this.f22493b, (C7251k) this.f22494c, interfaceC7559c, 12);
            case 13:
                return new C4525k((InterfaceC7266z) this.f22493b, (C0182j) this.f22494c, interfaceC7559c, 13);
            case 14:
                return new C4525k((C6610j) this.f22493b, (List) this.f22494c, interfaceC7559c, 14);
            case AEADAlgorithm.AEAD_AES_SIV_CMAC_256 /* 15 */:
                return new C4525k((AbstractC6650z) this.f22493b, (p0) this.f22494c, interfaceC7559c, 15);
            case 16:
                return new C4525k((v0) this.f22493b, (String) this.f22494c, interfaceC7559c, 16);
            case 17:
                C4525k c4525k7 = new C4525k((C6883f) this.f22494c, interfaceC7559c, 17);
                c4525k7.f22493b = obj;
                return c4525k7;
            case 18:
                return new C4525k((C7320q) this.f22493b, (ArrayList) this.f22494c, interfaceC7559c, 18);
            case 19:
                C4525k c4525k8 = new C4525k((C6952k) this.f22494c, interfaceC7559c, 19);
                c4525k8.f22493b = obj;
                return c4525k8;
            case 20:
                return new C4525k((d0) this.f22493b, (e0) this.f22494c, interfaceC7559c, 20);
            case 21:
                return new C4525k((C7096g) this.f22493b, (l0) this.f22494c, interfaceC7559c, 21);
            case 22:
                C4525k c4525k9 = new C4525k((C7224g) this.f22494c, interfaceC7559c, 22);
                c4525k9.f22493b = obj;
                return c4525k9;
            case 23:
                return new C4525k((String) this.f22493b, (byte[]) this.f22494c, interfaceC7559c, 23);
            case 24:
                C4525k c4525k10 = new C4525k((C7494g) this.f22494c, interfaceC7559c, 24);
                c4525k10.f22493b = obj;
                return c4525k10;
            case 25:
                C4525k c4525k11 = new C4525k((AbstractC7685c) this.f22494c, interfaceC7559c, 25);
                c4525k11.f22493b = obj;
                return c4525k11;
            case 26:
                return new C4525k((C8134s) this.f22493b, (InterfaceC3307i) this.f22494c, interfaceC7559c, 26);
            case 27:
                return new C4525k((ArrayList) this.f22493b, (C8134s) this.f22494c, interfaceC7559c, 27);
            case 28:
                C4525k c4525k12 = new C4525k((C8141g) this.f22494c, interfaceC7559c, 28);
                c4525k12.f22493b = obj;
                return c4525k12;
            default:
                return new C4525k((C8186a) this.f22493b, (C8805t) this.f22494c, interfaceC7559c, 29);
        }
    }

    @Override // ex.InterfaceC2141e
    public final Object invoke(Object obj, Object obj2) throws Resources.NotFoundException, IOException {
        switch (this.f22492a) {
            case 0:
                C4525k c4525k = (C4525k) create((InterfaceC7266z) obj, (InterfaceC7559c) obj2);
                a0 a0Var = a0.f30746a;
                c4525k.invokeSuspend(a0Var);
                return a0Var;
            case 1:
                C4525k c4525k2 = (C4525k) create((InterfaceC7266z) obj, (InterfaceC7559c) obj2);
                a0 a0Var2 = a0.f30746a;
                c4525k2.invokeSuspend(a0Var2);
                return a0Var2;
            case 2:
                return ((C4525k) create((b1) obj, (InterfaceC7559c) obj2)).invokeSuspend(a0.f30746a);
            case 3:
                C4525k c4525k3 = (C4525k) create((InterfaceC7266z) obj, (InterfaceC7559c) obj2);
                a0 a0Var3 = a0.f30746a;
                c4525k3.invokeSuspend(a0Var3);
                return a0Var3;
            case 4:
                C4525k c4525k4 = (C4525k) create((EnumC4872a) obj, (InterfaceC7559c) obj2);
                a0 a0Var4 = a0.f30746a;
                c4525k4.invokeSuspend(a0Var4);
                return a0Var4;
            case 5:
                C4525k c4525k5 = (C4525k) create((InterfaceC7266z) obj, (InterfaceC7559c) obj2);
                a0 a0Var5 = a0.f30746a;
                c4525k5.invokeSuspend(a0Var5);
                return a0Var5;
            case 6:
                C4525k c4525k6 = (C4525k) create((InterfaceC7266z) obj, (InterfaceC7559c) obj2);
                a0 a0Var6 = a0.f30746a;
                c4525k6.invokeSuspend(a0Var6);
                return a0Var6;
            case 7:
                C4525k c4525k7 = (C4525k) create((C8801p) obj, (InterfaceC7559c) obj2);
                a0 a0Var7 = a0.f30746a;
                c4525k7.invokeSuspend(a0Var7);
                return a0Var7;
            case 8:
                C4525k c4525k8 = (C4525k) create(obj, (InterfaceC7559c) obj2);
                a0 a0Var8 = a0.f30746a;
                c4525k8.invokeSuspend(a0Var8);
                return a0Var8;
            case 9:
                C4525k c4525k9 = (C4525k) create((InterfaceC7266z) obj, (InterfaceC7559c) obj2);
                a0 a0Var9 = a0.f30746a;
                c4525k9.invokeSuspend(a0Var9);
                return a0Var9;
            case 10:
                C4525k c4525k10 = (C4525k) create((AbstractC3353e) obj, (InterfaceC7559c) obj2);
                a0 a0Var10 = a0.f30746a;
                c4525k10.invokeSuspend(a0Var10);
                return a0Var10;
            case 11:
                return ((C4525k) create((C6763b) obj, (InterfaceC7559c) obj2)).invokeSuspend(a0.f30746a);
            case 12:
                C4525k c4525k11 = (C4525k) create((List) obj, (InterfaceC7559c) obj2);
                a0 a0Var11 = a0.f30746a;
                c4525k11.invokeSuspend(a0Var11);
                return a0Var11;
            case 13:
                C4525k c4525k12 = (C4525k) create((a0) obj, (InterfaceC7559c) obj2);
                a0 a0Var12 = a0.f30746a;
                c4525k12.invokeSuspend(a0Var12);
                return a0Var12;
            case 14:
                C4525k c4525k13 = (C4525k) create((InterfaceC7266z) obj, (InterfaceC7559c) obj2);
                a0 a0Var13 = a0.f30746a;
                c4525k13.invokeSuspend(a0Var13);
                return a0Var13;
            case AEADAlgorithm.AEAD_AES_SIV_CMAC_256 /* 15 */:
                C4525k c4525k14 = (C4525k) create((InterfaceC7266z) obj, (InterfaceC7559c) obj2);
                a0 a0Var14 = a0.f30746a;
                c4525k14.invokeSuspend(a0Var14);
                return a0Var14;
            case 16:
                C4525k c4525k15 = (C4525k) create((InterfaceC7266z) obj, (InterfaceC7559c) obj2);
                a0 a0Var15 = a0.f30746a;
                c4525k15.invokeSuspend(a0Var15);
                return a0Var15;
            case 17:
                C4525k c4525k16 = (C4525k) create((InterfaceC3307i) obj, (InterfaceC7559c) obj2);
                a0 a0Var16 = a0.f30746a;
                c4525k16.invokeSuspend(a0Var16);
                return a0Var16;
            case 18:
                C4525k c4525k17 = (C4525k) create((InterfaceC7266z) obj, (InterfaceC7559c) obj2);
                a0 a0Var17 = a0.f30746a;
                c4525k17.invokeSuspend(a0Var17);
                return a0Var17;
            case 19:
                C4525k c4525k18 = (C4525k) create((C8801p) obj, (InterfaceC7559c) obj2);
                a0 a0Var18 = a0.f30746a;
                c4525k18.invokeSuspend(a0Var18);
                return a0Var18;
            case 20:
                return ((C4525k) create((InterfaceC7266z) obj, (InterfaceC7559c) obj2)).invokeSuspend(a0.f30746a);
            case 21:
                return ((C4525k) create((InterfaceC6777d) obj, (InterfaceC7559c) obj2)).invokeSuspend(a0.f30746a);
            case 22:
                C4525k c4525k19 = (C4525k) create((C8801p) obj, (InterfaceC7559c) obj2);
                a0 a0Var19 = a0.f30746a;
                c4525k19.invokeSuspend(a0Var19);
                return a0Var19;
            case 23:
                C4525k c4525k20 = (C4525k) create((InterfaceC7266z) obj, (InterfaceC7559c) obj2);
                a0 a0Var20 = a0.f30746a;
                c4525k20.invokeSuspend(a0Var20);
                return a0Var20;
            case 24:
                C4525k c4525k21 = (C4525k) create((InterfaceC3307i) obj, (InterfaceC7559c) obj2);
                a0 a0Var21 = a0.f30746a;
                c4525k21.invokeSuspend(a0Var21);
                return a0Var21;
            case 25:
                ((C4525k) create((InterfaceC7266z) obj, (InterfaceC7559c) obj2)).invokeSuspend(a0.f30746a);
                throw null;
            case 26:
                C4525k c4525k22 = (C4525k) create((InterfaceC7266z) obj, (InterfaceC7559c) obj2);
                a0 a0Var22 = a0.f30746a;
                c4525k22.invokeSuspend(a0Var22);
                return a0Var22;
            case 27:
                C4525k c4525k23 = (C4525k) create((InterfaceC7266z) obj, (InterfaceC7559c) obj2);
                a0 a0Var23 = a0.f30746a;
                c4525k23.invokeSuspend(a0Var23);
                return a0Var23;
            case 28:
                C4525k c4525k24 = (C4525k) create((InterfaceC3307i) obj, (InterfaceC7559c) obj2);
                a0 a0Var24 = a0.f30746a;
                c4525k24.invokeSuspend(a0Var24);
                return a0Var24;
            default:
                C4525k c4525k25 = (C4525k) create((InterfaceC7266z) obj, (InterfaceC7559c) obj2);
                a0 a0Var25 = a0.f30746a;
                c4525k25.invokeSuspend(a0Var25);
                return a0Var25;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
     */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0171  */
    @Override // ww.AbstractC8191a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r40) throws android.content.res.Resources.NotFoundException, java.io.IOException {
        /*
            Method dump skipped, instructions count: 2440
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: lu.C4525k.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C4525k(Object obj, InterfaceC7559c interfaceC7559c, int i10) {
        super(2, interfaceC7559c);
        this.f22492a = i10;
        this.f22494c = obj;
    }
}
