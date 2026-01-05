package lp;

import android.content.Context;
import android.content.Intent;
import b00.InterfaceC0527l;
import bq.C0732l;
import bq.C0733m;
import c9.C0914i;
import com.websoptimization.callyzerbiz.data.model.request.FetchUpdatedCallNoteRequest;
import ex.InterfaceC2137a;
import ex.InterfaceC2139c;
import ex.InterfaceC2141e;
import h1.C2772c;
import im.InterfaceC3307i;
import io.C3328c;
import k4.C4001v;
import kotlin.jvm.internal.AbstractC4154l;
import mm.C4802m;
import mq.a1;
import mq.h0;
import no.C5122i;
import np.C5128f;
import o6.C5302d;
import o6.C5321w;
import og.od;
import org.bouncycastle.iana.AEADAlgorithm;
import os.C5731i;
import ov.C5757h;
import pc.C5894v;
import pp.AbstractC5993i;
import pp.C5995k;
import pt.C6032f;
import pu.EnumC6039g;
import q1.C6097y;
import qq.C6276b;
import qu.C6324e;
import qw.a0;
import rt.C6617a;
import ss.z0;
import tx.InterfaceC7266z;
import tx.c0;
import ur.AbstractC7523p;
import ur.AbstractC7524q;
import ur.C7508a;
import ur.C7509b;
import ur.C7514g;
import ur.C7518k;
import uw.InterfaceC7559c;
import vw.EnumC7794a;
import ww.AbstractC8199i;
import yx.C8810d;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: lp.f */
/* loaded from: classes3.dex */
public final class C4504f extends AbstractC8199i implements InterfaceC2141e {

    /* renamed from: a */
    public final /* synthetic */ int f22398a;

    /* renamed from: b */
    public int f22399b;

    /* renamed from: c */
    public Object f22400c;

    /* renamed from: d */
    public final /* synthetic */ Object f22401d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C4504f(InterfaceC2141e interfaceC2141e, C5302d c5302d, InterfaceC7559c interfaceC7559c) {
        super(2, interfaceC7559c);
        this.f22398a = 18;
        this.f22400c = (AbstractC8199i) interfaceC2141e;
        this.f22401d = c5302d;
    }

    /* renamed from: d */
    private final Object m9338d(Object obj) {
        AbstractC7523p abstractC7523p = (AbstractC7523p) this.f22400c;
        C5995k c5995k = (C5995k) this.f22401d;
        C8810d c8810d = c5995k.f29300k;
        EnumC7794a enumC7794a = EnumC7794a.COROUTINE_SUSPENDED;
        int i10 = this.f22399b;
        if (i10 == 0) {
            od.m10798c(obj);
            InterfaceC7559c interfaceC7559c = null;
            if (abstractC7523p instanceof C7518k) {
                c0.m13502y(c8810d, null, null, new C0732l(abstractC7523p, c5995k, interfaceC7559c, 12, false), 3);
            } else if (abstractC7523p instanceof C7514g) {
                C7514g c7514g = (C7514g) abstractC7523p;
                int i11 = c7514g.f36216a;
                int i12 = AbstractC5993i.f29290a[c7514g.f36217b.ordinal()];
                if (i12 == 1) {
                    c5995k.f29309t.m12320q(i11);
                } else if (i12 == 2) {
                    c5995k.f29310u.m12316q(i11);
                } else if (i12 == 3) {
                    c5995k.f29311v.m12324q(i11);
                }
                this.f22399b = 1;
                if (C5995k.m12028j(c5995k, this) == enumC7794a) {
                    return enumC7794a;
                }
            } else if (AbstractC4154l.m8918a(abstractC7523p, C7508a.f36203a)) {
                c5995k.m14294g();
            } else if (abstractC7523p instanceof C7509b) {
                c0.m13502y(c8810d, null, null, new C0733m((AbstractC7524q) c5995k, interfaceC7559c, 9, false), 3);
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            od.m10798c(obj);
        }
        return a0.f30746a;
    }

    /* JADX WARN: Type inference failed for: r0v37, types: [ex.e, ww.i] */
    @Override // ww.AbstractC8191a
    public final InterfaceC7559c create(Object obj, InterfaceC7559c interfaceC7559c) {
        switch (this.f22398a) {
            case 0:
                return new C4504f((AbstractC7523p) this.f22400c, (C4505g) this.f22401d, interfaceC7559c, 0);
            case 1:
                return new C4504f((C6097y) this.f22400c, (InterfaceC2139c) this.f22401d, interfaceC7559c, 1);
            case 2:
                return new C4504f((C5731i) this.f22400c, (l7.a0) this.f22401d, interfaceC7559c, 2);
            case 3:
                return new C4504f((EnumC6039g) this.f22400c, (C2772c) this.f22401d, interfaceC7559c, 3);
            case 4:
                return new C4504f((C6324e) this.f22400c, (InterfaceC2139c) this.f22401d, interfaceC7559c, 4);
            case 5:
                return new C4504f((C5128f) this.f22400c, (l7.a0) this.f22401d, interfaceC7559c, 5);
            case 6:
                return new C4504f((InterfaceC3307i) this.f22400c, (h0) this.f22401d, interfaceC7559c, 6);
            case 7:
                return new C4504f((h0) this.f22400c, (C6617a) this.f22401d, interfaceC7559c, 7);
            case 8:
                return new C4504f((a1) this.f22401d, interfaceC7559c, 8);
            case 9:
                return new C4504f((InterfaceC3307i) this.f22400c, (a1) this.f22401d, interfaceC7559c, 9);
            case 10:
                return new C4504f((a1) this.f22400c, (C6617a) this.f22401d, interfaceC7559c, 10);
            case 11:
                return new C4504f((C5757h) this.f22400c, (InterfaceC2137a) this.f22401d, interfaceC7559c, 11);
            case 12:
                return new C4504f((C5122i) this.f22400c, (FetchUpdatedCallNoteRequest) this.f22401d, interfaceC7559c, 12);
            case 13:
                C4504f c4504f = new C4504f((C5122i) this.f22401d, interfaceC7559c, 13);
                c4504f.f22400c = obj;
                return c4504f;
            case 14:
                return new C4504f((AbstractC7523p) this.f22400c, (C5128f) this.f22401d, interfaceC7559c, 14);
            case AEADAlgorithm.AEAD_AES_SIV_CMAC_256 /* 15 */:
                return new C4504f((C6276b) this.f22400c, (Intent) this.f22401d, interfaceC7559c, 15);
            case 16:
                return new C4504f((C6276b) this.f22400c, (Context) this.f22401d, interfaceC7559c, 16);
            case 17:
                return new C4504f((C3328c) this.f22400c, (C4802m) this.f22401d, interfaceC7559c, 17);
            case 18:
                return new C4504f((InterfaceC2141e) this.f22400c, (C5302d) this.f22401d, interfaceC7559c);
            case 19:
                C4504f c4504f2 = new C4504f((C5321w) this.f22401d, interfaceC7559c, 19);
                c4504f2.f22400c = obj;
                return c4504f2;
            case 20:
                return new C4504f((C0914i) this.f22401d, interfaceC7559c, 20);
            case 21:
                return new C4504f((InterfaceC3307i) this.f22400c, (C5731i) this.f22401d, interfaceC7559c, 21);
            case 22:
                return new C4504f((C6032f) this.f22400c, (Context) this.f22401d, interfaceC7559c, 22);
            case 23:
                return new C4504f((C4001v) this.f22400c, (String) this.f22401d, interfaceC7559c, 23);
            case 24:
                return new C4504f((C5894v) this.f22400c, (InterfaceC0527l) this.f22401d, interfaceC7559c, 24);
            case 25:
                return new C4504f((C5995k) this.f22401d, interfaceC7559c, 25);
            case 26:
                return new C4504f((InterfaceC3307i) this.f22400c, (C5995k) this.f22401d, interfaceC7559c, 26);
            case 27:
                C4504f c4504f3 = new C4504f((C5995k) this.f22401d, interfaceC7559c, 27);
                c4504f3.f22400c = obj;
                return c4504f3;
            case 28:
                return new C4504f((AbstractC7523p) this.f22400c, (C5995k) this.f22401d, interfaceC7559c, 28);
            default:
                return new C4504f((z0) this.f22400c, (l7.a0) this.f22401d, interfaceC7559c, 29);
        }
    }

    @Override // ex.InterfaceC2141e
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f22398a) {
        }
        return ((C4504f) create((InterfaceC7266z) obj, (InterfaceC7559c) obj2)).invokeSuspend(a0.f30746a);
    }

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:185:0x03c5  */
    /* JADX WARN: Removed duplicated region for block: B:417:0x079e  */
    /* JADX WARN: Removed duplicated region for block: B:420:0x07b4  */
    /* JADX WARN: Removed duplicated region for block: B:541:0x09bc  */
    /* JADX WARN: Removed duplicated region for block: B:663:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:664:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:693:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r11v0, types: [uw.c] */
    /* JADX WARN: Type inference failed for: r11v8 */
    /* JADX WARN: Type inference failed for: r1v118, types: [vw.a] */
    /* JADX WARN: Type inference failed for: r1v120, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r2v116, types: [ex.e, ww.i] */
    /* JADX WARN: Type inference failed for: r8v0, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r8v16 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:181:0x03b6 -> B:183:0x03b9). Please report as a decompilation issue!!! */
    @Override // ww.AbstractC8191a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r30) {
        /*
            Method dump skipped, instructions count: 2874
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: lp.C4504f.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C4504f(Object obj, Object obj2, InterfaceC7559c interfaceC7559c, int i10) {
        super(2, interfaceC7559c);
        this.f22398a = i10;
        this.f22400c = obj;
        this.f22401d = obj2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C4504f(Object obj, InterfaceC7559c interfaceC7559c, int i10) {
        super(2, interfaceC7559c);
        this.f22398a = i10;
        this.f22401d = obj;
    }
}
