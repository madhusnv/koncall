package ap;

import com.websoptimization.callyzerbiz.services.ReSyncNotificationActionService;
import dt.C1804j;
import ex.InterfaceC2141e;
import h2.C2810o;
import java.util.concurrent.atomic.AtomicInteger;
import ks.c0;
import kx.C4266h;
import mq.h0;
import pt.C6032f;
import q1.C6097y;
import qw.a0;
import rv.AbstractC6650z;
import rv.p0;
import tx.InterfaceC7266z;
import uw.InterfaceC7559c;
import vx.C7806h;
import ww.AbstractC8199i;
import wx.InterfaceC8209j;
import xm.y5;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: ap.h */
/* loaded from: classes3.dex */
public final class C0395h extends AbstractC8199i implements InterfaceC2141e {

    /* renamed from: a */
    public final /* synthetic */ int f3088a;

    /* renamed from: b */
    public Object f3089b;

    /* renamed from: c */
    public int f3090c;

    /* renamed from: d */
    public int f3091d;

    /* renamed from: e */
    public Object f3092e;

    /* renamed from: f */
    public Object f3093f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0395h(int i10, Object obj, InterfaceC7559c interfaceC7559c, boolean z6) {
        super(2, interfaceC7559c);
        this.f3088a = i10;
        this.f3089b = obj;
    }

    @Override // ww.AbstractC8191a
    public final InterfaceC7559c create(Object obj, InterfaceC7559c interfaceC7559c) {
        switch (this.f3088a) {
            case 0:
                return new C0395h((ReSyncNotificationActionService) this.f3093f, interfaceC7559c, 0);
            case 1:
                return new C0395h((C1804j) this.f3093f, interfaceC7559c, 1);
            case 2:
                return new C0395h((C6097y) this.f3092e, this.f3091d, (C4266h) this.f3093f, (C2810o) this.f3089b, interfaceC7559c, 2);
            case 3:
                C0395h c0395h = new C0395h(3, (c0) this.f3089b, interfaceC7559c, false);
                c0395h.f3093f = obj;
                return c0395h;
            case 4:
                return new C0395h(4, (h0) this.f3089b, interfaceC7559c, false);
            case 5:
                return new C0395h((C6032f) this.f3092e, (String) this.f3093f, (String) this.f3089b, this.f3091d, interfaceC7559c);
            case 6:
                return new C0395h((p0) this.f3093f, (AbstractC6650z) this.f3089b, interfaceC7559c);
            case 7:
                return new C0395h(7, (y5) this.f3089b, interfaceC7559c, false);
            default:
                return new C0395h((InterfaceC8209j[]) this.f3092e, this.f3091d, (AtomicInteger) this.f3093f, (C7806h) this.f3089b, interfaceC7559c, 8);
        }
    }

    @Override // ex.InterfaceC2141e
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f3088a) {
        }
        return ((C0395h) create((InterfaceC7266z) obj, (InterfaceC7559c) obj2)).invokeSuspend(a0.f30746a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:102:0x02e6 A[LOOP:1: B:71:0x0148->B:102:0x02e6, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:145:0x03ba  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x03dc  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x03df  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x0416  */
    /* JADX WARN: Removed duplicated region for block: B:213:0x050a  */
    /* JADX WARN: Removed duplicated region for block: B:220:0x0533  */
    /* JADX WARN: Removed duplicated region for block: B:227:0x0567 A[LOOP:7: B:225:0x0561->B:227:0x0567, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:239:0x05a1  */
    /* JADX WARN: Removed duplicated region for block: B:241:0x05a7  */
    /* JADX WARN: Removed duplicated region for block: B:243:0x05b8  */
    /* JADX WARN: Removed duplicated region for block: B:245:0x060f  */
    /* JADX WARN: Removed duplicated region for block: B:250:0x0644  */
    /* JADX WARN: Removed duplicated region for block: B:279:0x06d3  */
    /* JADX WARN: Removed duplicated region for block: B:310:0x074d A[Catch: Exception -> 0x071c, TryCatch #2 {Exception -> 0x071c, blocks: (B:293:0x0718, B:308:0x0747, B:310:0x074d, B:312:0x0757, B:315:0x0766, B:316:0x076b, B:299:0x0726, B:307:0x073c, B:302:0x072f, B:304:0x0733, B:317:0x076c, B:318:0x0771), top: B:330:0x0708 }] */
    /* JADX WARN: Removed duplicated region for block: B:339:0x0198 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0288  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x029b A[LOOP:0: B:97:0x029b->B:338:?, LOOP_START] */
    /* JADX WARN: Type inference failed for: r2v23, types: [int] */
    /* JADX WARN: Type inference failed for: r2v24, types: [dy.a] */
    /* JADX WARN: Type inference failed for: r2v28, types: [dy.a] */
    /* JADX WARN: Type inference failed for: r2v56, types: [int] */
    /* JADX WARN: Type inference failed for: r2v57, types: [dy.a] */
    /* JADX WARN: Type inference failed for: r2v61, types: [dy.a] */
    /* JADX WARN: Type inference failed for: r2v70 */
    /* JADX WARN: Type inference failed for: r2v71 */
    /* JADX WARN: Type inference failed for: r2v73 */
    /* JADX WARN: Type inference failed for: r2v74 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:284:0x06ee -> B:285:0x06f3). Please report as a decompilation issue!!! */
    @Override // ww.AbstractC8191a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r43) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 1948
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ap.C0395h.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0395h(Object obj, int i10, Object obj2, Object obj3, InterfaceC7559c interfaceC7559c, int i11) {
        super(2, interfaceC7559c);
        this.f3088a = i11;
        this.f3092e = obj;
        this.f3091d = i10;
        this.f3093f = obj2;
        this.f3089b = obj3;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0395h(Object obj, InterfaceC7559c interfaceC7559c, int i10) {
        super(2, interfaceC7559c);
        this.f3088a = i10;
        this.f3093f = obj;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0395h(C6032f c6032f, String str, String str2, int i10, InterfaceC7559c interfaceC7559c) {
        super(2, interfaceC7559c);
        this.f3088a = 5;
        this.f3092e = c6032f;
        this.f3093f = str;
        this.f3089b = str2;
        this.f3091d = i10;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0395h(p0 p0Var, AbstractC6650z abstractC6650z, InterfaceC7559c interfaceC7559c) {
        super(2, interfaceC7559c);
        this.f3088a = 6;
        this.f3093f = p0Var;
        this.f3089b = abstractC6650z;
    }
}
