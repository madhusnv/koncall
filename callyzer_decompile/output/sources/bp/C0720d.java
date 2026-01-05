package bp;

import a9.C0065d;
import android.content.Context;
import android.view.View;
import aq.C0403f;
import bt.o0;
import c6.C0885o;
import c6.n0;
import c6.v0;
import d7.AbstractC1646r;
import d7.C1639l;
import d7.InterfaceC1649u;
import ex.InterfaceC2139c;
import ex.InterfaceC2141e;
import h1.g0;
import h1.l1;
import h1.m1;
import h1.p1;
import h1.s1;
import java.lang.reflect.Field;
import java.util.Iterator;
import java.util.List;
import k2.e0;
import k2.h2;
import k2.w0;
import kotlin.jvm.internal.AbstractC4154l;
import l1.C4327p;
import l7.C4409i;
import m1.C4632n;
import m1.C4633o;
import m1.InterfaceC4630l;
import mw.C4903k;
import n7.C4964i;
import n7.C4966k;
import o1.w1;
import org.bouncycastle.iana.AEADAlgorithm;
import s1.t0;
import w3.p0;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: bp.d */
/* loaded from: classes3.dex */
public final class C0720d implements e0 {

    /* renamed from: a */
    public final /* synthetic */ int f4540a;

    /* renamed from: b */
    public final /* synthetic */ Object f4541b;

    /* renamed from: c */
    public final /* synthetic */ Object f4542c;

    public /* synthetic */ C0720d(int i10, Object obj, Object obj2) {
        this.f4540a = i10;
        this.f4541b = obj;
        this.f4542c = obj2;
    }

    @Override // k2.e0
    public final void dispose() {
        int i10 = this.f4540a;
        Object obj = this.f4542c;
        Object obj2 = this.f4541b;
        switch (i10) {
            case 0:
                ((AbstractC1646r) obj2).mo5346d((C0717a) obj);
                break;
            case 1:
                ((View) obj2).getViewTreeObserver().removeOnGlobalLayoutListener((o0) obj);
                break;
            case 2:
                ((g0) obj2).f15419a.m9514l((h1.e0) obj);
                break;
            case 3:
                ((s1) obj2).f15597j.remove((s1) obj);
                break;
            case 4:
                s1 s1Var = (s1) obj2;
                s1Var.getClass();
                l1 l1Var = (l1) ((m1) obj).f15516b.getValue();
                if (l1Var != null) {
                    s1Var.f15596i.remove(l1Var.f15507a);
                    break;
                }
                break;
            case 5:
                ((s1) obj2).f15596i.remove((p1) obj);
                break;
            case 6:
                ((InterfaceC1649u) obj2).getLifecycle().mo5346d((C1639l) obj);
                break;
            case 7:
                C4327p c4327p = ((C4903k) obj2).f24439a;
                InterfaceC2141e composable = (InterfaceC2141e) obj;
                AbstractC4154l.m8923f(composable, "composable");
                ((C0403f) c4327p.f21788b).invoke(composable, Boolean.FALSE);
                break;
            case 8:
                ((C4409i) obj2).f22052h.f29901j.mo5346d((C4966k) obj);
                break;
            case 9:
                Iterator it = ((List) ((h2) obj2).getValue()).iterator();
                while (it.hasNext()) {
                    ((C4964i) obj).m9225b().m9217c((C4409i) it.next());
                }
                break;
            case 10:
                w1 w1Var = (w1) obj2;
                View view = (View) obj;
                int i11 = w1Var.f25883t - 1;
                w1Var.f25883t = i11;
                if (i11 == 0) {
                    Field field = v0.f5527a;
                    n0.m2460l(view, null);
                    v0.m2530l(view, null);
                    view.removeOnAttachStateChangeListener(w1Var.f25884u);
                    break;
                }
                break;
            case 11:
                ((Context) obj2).unregisterReceiver((C0065d) obj);
                break;
            case 12:
                ((t0) obj2).f32137c.m5591k(obj);
                break;
            case 13:
                ((InterfaceC1649u) obj2).getLifecycle().mo5346d((C0717a) obj);
                break;
            case 14:
                ((InterfaceC1649u) obj2).getLifecycle().mo5346d((C0717a) obj);
                break;
            case AEADAlgorithm.AEAD_AES_SIV_CMAC_256 /* 15 */:
                ((Context) obj2).getApplicationContext().unregisterComponentCallbacks((w3.o0) obj);
                break;
            case 16:
                ((Context) obj2).getApplicationContext().unregisterComponentCallbacks((p0) obj);
                break;
            case 17:
                w0 w0Var = (w0) obj2;
                C4633o c4633o = (C4633o) w0Var.getValue();
                if (c4633o != null) {
                    C4632n c4632n = new C4632n(c4633o);
                    InterfaceC4630l interfaceC4630l = (InterfaceC4630l) obj;
                    if (interfaceC4630l != null) {
                        interfaceC4630l.mo9502b(c4632n);
                    }
                    w0Var.setValue(null);
                    break;
                }
                break;
            case 18:
                ((x1.s1) obj2).f39679c.remove((InterfaceC2139c) obj);
                break;
            default:
                ((InterfaceC1649u) obj2).getLifecycle().mo5346d((C0885o) obj);
                break;
        }
    }
}
