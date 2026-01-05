package nb;

import android.content.Context;
import android.net.Uri;
import ao.AbstractC0366e;
import com.websoptimization.callyzerbiz.domain.model.FCMData;
import ex.InterfaceC2141e;
import gb.InterfaceC2556f;
import kotlin.jvm.internal.C4166x;
import mb.v0;
import qq.C6276b;
import qw.a0;
import rn.h0;
import tx.InterfaceC7266z;
import uw.InterfaceC7559c;
import wm.C8114j;
import ww.AbstractC8199i;
import wx.InterfaceC8210k;
import yn.C8716n;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: nb.a */
/* loaded from: classes.dex */
public final class C4989a extends AbstractC8199i implements InterfaceC2141e {

    /* renamed from: a */
    public final /* synthetic */ int f24728a;

    /* renamed from: b */
    public int f24729b;

    /* renamed from: c */
    public int f24730c;

    /* renamed from: d */
    public Object f24731d;

    /* renamed from: e */
    public Object f24732e;

    /* renamed from: f */
    public final /* synthetic */ Object f24733f;

    /* renamed from: g */
    public final /* synthetic */ Object f24734g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C4989a(Object obj, Object obj2, InterfaceC7559c interfaceC7559c, int i10) {
        super(2, interfaceC7559c);
        this.f24728a = i10;
        this.f24733f = obj;
        this.f24734g = obj2;
    }

    @Override // ww.AbstractC8191a
    public final InterfaceC7559c create(Object obj, InterfaceC7559c interfaceC7559c) {
        switch (this.f24728a) {
            case 0:
                C4989a c4989a = new C4989a((v0) this.f24733f, (InterfaceC2556f) this.f24734g, interfaceC7559c, 0);
                c4989a.f24732e = obj;
                return c4989a;
            case 1:
                return new C4989a((C6276b) this.f24733f, (Uri) this.f24734g, interfaceC7559c, 1);
            case 2:
                return new C4989a((h0) this.f24733f, (Uri) this.f24734g, this.f24730c, interfaceC7559c);
            case 3:
                C4989a c4989a2 = new C4989a((C8114j) this.f24731d, (Context) this.f24733f, this.f24730c, (C4166x) this.f24734g, interfaceC7559c);
                c4989a2.f24732e = obj;
                return c4989a2;
            default:
                return new C4989a((FCMData) this.f24733f, (C8716n) this.f24734g, interfaceC7559c, 4);
        }
    }

    @Override // ex.InterfaceC2141e
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f24728a) {
            case 0:
                return ((C4989a) create((InterfaceC8210k) obj, (InterfaceC7559c) obj2)).invokeSuspend(a0.f30746a);
            case 1:
                return ((C4989a) create((InterfaceC7266z) obj, (InterfaceC7559c) obj2)).invokeSuspend(a0.f30746a);
            case 2:
                return ((C4989a) create((InterfaceC7266z) obj, (InterfaceC7559c) obj2)).invokeSuspend(a0.f30746a);
            case 3:
                return ((C4989a) create((AbstractC0366e) obj, (InterfaceC7559c) obj2)).invokeSuspend(a0.f30746a);
            default:
                return ((C4989a) create((InterfaceC7266z) obj, (InterfaceC7559c) obj2)).invokeSuspend(a0.f30746a);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:163:0x047f, code lost:
    
        if (r0 == r15) goto L164;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x0135, code lost:
    
        if (tx.c0.m13489l(1000, r27) != r8) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0166, code lost:
    
        if (tx.c0.m13489l(1000, r27) == r8) goto L62;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x0194, code lost:
    
        if (tx.c0.m13489l(1000, r27) == r8) goto L62;
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x027a, code lost:
    
        if (r4 != r8) goto L77;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Path cross not found for [B:219:0x05e3, B:222:0x05eb], limit reached: 243 */
    /* JADX WARN: Removed duplicated region for block: B:226:0x05fd  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0083 A[Catch: Exception -> 0x0036, TryCatch #2 {Exception -> 0x0036, blocks: (B:8:0x002f, B:25:0x009b, B:20:0x007d, B:22:0x0083, B:27:0x00a3, B:15:0x0042, B:16:0x0062, B:18:0x0068, B:19:0x0076), top: B:232:0x0021 }] */
    /* JADX WARN: Removed duplicated region for block: B:255:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00a3 A[Catch: Exception -> 0x0036, TRY_LEAVE, TryCatch #2 {Exception -> 0x0036, blocks: (B:8:0x002f, B:25:0x009b, B:20:0x007d, B:22:0x0083, B:27:0x00a3, B:15:0x0042, B:16:0x0062, B:18:0x0068, B:19:0x0076), top: B:232:0x0021 }] */
    /* JADX WARN: Type inference failed for: r2v48 */
    /* JADX WARN: Type inference failed for: r2v49 */
    /* JADX WARN: Type inference failed for: r2v53 */
    /* JADX WARN: Type inference failed for: r2v57 */
    /* JADX WARN: Type inference failed for: r2v63 */
    /* JADX WARN: Type inference failed for: r9v20, types: [java.lang.StringBuilder] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:226:0x05fd -> B:213:0x05a2). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:23:0x0097 -> B:25:0x009b). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:62:0x0196 -> B:235:0x01b5). Please report as a decompilation issue!!! */
    @Override // ww.AbstractC8191a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r28) throws java.lang.SecurityException, java.io.IOException, java.lang.IllegalArgumentException {
        /*
            Method dump skipped, instructions count: 1548
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: nb.C4989a.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4989a(h0 h0Var, Uri uri, int i10, InterfaceC7559c interfaceC7559c) {
        super(2, interfaceC7559c);
        this.f24728a = 2;
        this.f24733f = h0Var;
        this.f24734g = uri;
        this.f24730c = i10;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4989a(C8114j c8114j, Context context, int i10, C4166x c4166x, InterfaceC7559c interfaceC7559c) {
        super(2, interfaceC7559c);
        this.f24728a = 3;
        this.f24731d = c8114j;
        this.f24733f = context;
        this.f24730c = i10;
        this.f24734g = c4166x;
    }
}
