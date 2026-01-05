package be;

import android.content.ContentResolver;
import android.content.Context;
import android.net.Uri;
import com.google.android.gms.internal.measurement.c4;
import ee.C2033a;
import ex.InterfaceC2137a;
import ex.InterfaceC2139c;
import ex.InterfaceC2141e;
import ge.C2577i;
import ge.C2580l;
import h1.k0;
import h1.m0;
import h2.C2819x;
import i1.b1;
import i1.y0;
import kotlin.jvm.internal.C4168z;
import qw.a0;
import uw.InterfaceC7559c;
import vx.C7806h;
import wd.C7995c;
import ww.AbstractC8199i;
import wx.InterfaceC8210k;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: be.d */
/* loaded from: classes.dex */
public final class C0649d extends AbstractC8199i implements InterfaceC2141e {

    /* renamed from: a */
    public final /* synthetic */ int f4145a = 6;

    /* renamed from: b */
    public int f4146b;

    /* renamed from: c */
    public Object f4147c;

    /* renamed from: d */
    public /* synthetic */ Object f4148d;

    /* renamed from: e */
    public Object f4149e;

    /* renamed from: f */
    public final /* synthetic */ Object f4150f;

    /* renamed from: g */
    public Object f4151g;

    /* renamed from: h */
    public Object f4152h;

    /* renamed from: j */
    public Object f4153j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0649d(ContentResolver contentResolver, Uri uri, c4 c4Var, C7806h c7806h, Context context, InterfaceC7559c interfaceC7559c) {
        super(2, interfaceC7559c);
        this.f4151g = contentResolver;
        this.f4152h = uri;
        this.f4153j = c4Var;
        this.f4148d = c7806h;
        this.f4150f = context;
    }

    /* JADX WARN: Type inference failed for: r2v3, types: [ex.c, ww.i] */
    /* JADX WARN: Type inference failed for: r2v5, types: [ex.c, ww.i] */
    /* JADX WARN: Type inference failed for: r2v7, types: [ex.c, ww.i] */
    @Override // ww.AbstractC8191a
    public final InterfaceC7559c create(Object obj, InterfaceC7559c interfaceC7559c) {
        switch (this.f4145a) {
            case 0:
                return new C0649d((C0653h) this.f4147c, (C4168z) this.f4151g, (C4168z) this.f4152h, (C2577i) this.f4148d, this.f4149e, (C4168z) this.f4153j, (C7995c) this.f4150f, interfaceC7559c);
            case 1:
                return new C0649d((C0653h) this.f4147c, (C2577i) this.f4148d, this.f4149e, (C2580l) this.f4151g, (C7995c) this.f4150f, (C2033a) this.f4152h, (C0655j) this.f4153j, interfaceC7559c);
            case 2:
                C0649d c0649d = new C0649d((k0) this.f4153j, (m0) this.f4148d, (InterfaceC2139c) this.f4150f, interfaceC7559c);
                c0649d.f4152h = obj;
                return c0649d;
            case 3:
                C0649d c0649d2 = new C0649d((y0) this.f4153j, (C2819x) this.f4148d, (InterfaceC2139c) this.f4150f, interfaceC7559c);
                c0649d2.f4152h = obj;
                return c0649d2;
            case 4:
                C0649d c0649d3 = new C0649d((y0) this.f4153j, (b1) this.f4148d, (InterfaceC2139c) this.f4150f, interfaceC7559c);
                c0649d3.f4152h = obj;
                return c0649d3;
            case 5:
                C0649d c0649d4 = new C0649d((InterfaceC2137a) this.f4150f, interfaceC7559c);
                c0649d4.f4148d = obj;
                return c0649d4;
            default:
                C0649d c0649d5 = new C0649d((ContentResolver) this.f4151g, (Uri) this.f4152h, (c4) this.f4153j, (C7806h) this.f4148d, (Context) this.f4150f, interfaceC7559c);
                c0649d5.f4149e = obj;
                return c0649d5;
        }
    }

    @Override // ex.InterfaceC2141e
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f4145a) {
        }
        return ((C0649d) create((InterfaceC8210k) obj, (InterfaceC7559c) obj2)).invokeSuspend(a0.f30746a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:108:0x0251, code lost:
    
        if (r11.emit(r2, r23) == r0) goto L109;
     */
    /* JADX WARN: Finally extract failed */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Path cross not found for [B:77:0x01bd, B:87:0x01ed], limit reached: 415 */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0274 A[LOOP:0: B:70:0x019c->B:125:0x0274, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0078 A[Catch: all -> 0x002d, TRY_LEAVE, TryCatch #9 {all -> 0x002d, blocks: (B:9:0x0027, B:20:0x005e, B:24:0x0070, B:26:0x0078, B:16:0x0040, B:19:0x0055), top: B:380:0x0019 }] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:323:0x05bf  */
    /* JADX WARN: Removed duplicated region for block: B:391:0x019e A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:399:0x0215 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0203  */
    /* JADX WARN: Type inference failed for: r12v3, types: [java.lang.Object, java.util.Collection] */
    /* JADX WARN: Type inference failed for: r2v16, types: [dy.a, int] */
    /* JADX WARN: Type inference failed for: r2v33, types: [dy.a, int] */
    /* JADX WARN: Type inference failed for: r2v50, types: [dy.a, int] */
    /* JADX WARN: Type inference failed for: r4v12, types: [ex.c] */
    /* JADX WARN: Type inference failed for: r4v19 */
    /* JADX WARN: Type inference failed for: r4v26, types: [ex.c] */
    /* JADX WARN: Type inference failed for: r4v33 */
    /* JADX WARN: Type inference failed for: r4v38, types: [ex.c] */
    /* JADX WARN: Type inference failed for: r4v45 */
    /* JADX WARN: Type inference failed for: r4v82 */
    /* JADX WARN: Type inference failed for: r4v83 */
    /* JADX WARN: Type inference failed for: r4v84 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:108:0x0251 -> B:110:0x0254). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:124:0x0272 -> B:110:0x0254). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:29:0x009d -> B:20:0x005e). Please report as a decompilation issue!!! */
    @Override // ww.AbstractC8191a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r24) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 1700
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: be.C0649d.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0649d(C0653h c0653h, C2577i c2577i, Object obj, C2580l c2580l, C7995c c7995c, C2033a c2033a, C0655j c0655j, InterfaceC7559c interfaceC7559c) {
        super(2, interfaceC7559c);
        this.f4147c = c0653h;
        this.f4148d = c2577i;
        this.f4149e = obj;
        this.f4151g = c2580l;
        this.f4150f = c7995c;
        this.f4152h = c2033a;
        this.f4153j = c0655j;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0649d(C0653h c0653h, C4168z c4168z, C4168z c4168z2, C2577i c2577i, Object obj, C4168z c4168z3, C7995c c7995c, InterfaceC7559c interfaceC7559c) {
        super(2, interfaceC7559c);
        this.f4147c = c0653h;
        this.f4151g = c4168z;
        this.f4152h = c4168z2;
        this.f4148d = c2577i;
        this.f4149e = obj;
        this.f4153j = c4168z3;
        this.f4150f = c7995c;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0649d(InterfaceC2137a interfaceC2137a, InterfaceC7559c interfaceC7559c) {
        super(2, interfaceC7559c);
        this.f4150f = interfaceC2137a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C0649d(k0 k0Var, m0 m0Var, InterfaceC2139c interfaceC2139c, InterfaceC7559c interfaceC7559c) {
        super(2, interfaceC7559c);
        this.f4153j = k0Var;
        this.f4148d = m0Var;
        this.f4150f = (AbstractC8199i) interfaceC2139c;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C0649d(y0 y0Var, C2819x c2819x, InterfaceC2139c interfaceC2139c, InterfaceC7559c interfaceC7559c) {
        super(2, interfaceC7559c);
        this.f4153j = y0Var;
        this.f4148d = c2819x;
        this.f4150f = (AbstractC8199i) interfaceC2139c;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C0649d(y0 y0Var, b1 b1Var, InterfaceC2139c interfaceC2139c, InterfaceC7559c interfaceC7559c) {
        super(2, interfaceC7559c);
        this.f4153j = y0Var;
        this.f4148d = b1Var;
        this.f4150f = (AbstractC8199i) interfaceC2139c;
    }
}
