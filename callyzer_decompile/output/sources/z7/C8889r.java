package z7;

import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.AbstractC4154l;
import uw.C7565i;
import uw.InterfaceC7564h;
import z1.C8849i;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: z7.r */
/* loaded from: classes.dex */
public final class C8889r extends d7.d0 {

    /* renamed from: l */
    public final AbstractC8894w f42804l;

    /* renamed from: m */
    public final C8849i f42805m;

    /* renamed from: n */
    public final a0 f42806n;

    /* renamed from: o */
    public final AtomicBoolean f42807o;

    /* renamed from: p */
    public final AtomicBoolean f42808p;

    /* renamed from: q */
    public final AtomicBoolean f42809q;

    /* renamed from: r */
    public final InterfaceC7564h f42810r;

    /* renamed from: s */
    public final Callable f42811s;

    public C8889r(AbstractC8894w abstractC8894w, C8849i container, String[] strArr, Callable callable) {
        InterfaceC7564h interfaceC7564h;
        AbstractC4154l.m8923f(container, "container");
        this.f42804l = abstractC8894w;
        this.f42805m = container;
        this.f42806n = new a0(strArr, this);
        this.f42807o = new AtomicBoolean(true);
        this.f42808p = new AtomicBoolean(false);
        this.f42809q = new AtomicBoolean(false);
        if (abstractC8894w.m16393p()) {
            interfaceC7564h = abstractC8894w.f42832b;
            if (interfaceC7564h == null) {
                AbstractC4154l.m8928k("transactionContext");
                throw null;
            }
        } else {
            interfaceC7564h = C7565i.f36440a;
        }
        this.f42810r = interfaceC7564h;
        this.f42811s = callable;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00bd A[Catch: all -> 0x002e, Exception -> 0x0031, TRY_ENTER, TRY_LEAVE, TryCatch #2 {Exception -> 0x0031, blocks: (B:12:0x0029, B:44:0x00bd), top: B:65:0x0029, outer: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00d8 A[Catch: all -> 0x002e, TRY_LEAVE, TryCatch #1 {all -> 0x002e, blocks: (B:12:0x0029, B:42:0x00b5, B:44:0x00bd, B:51:0x00d8, B:48:0x00ce, B:49:0x00d5), top: B:64:0x0021, inners: #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r2v0, types: [int] */
    /* JADX WARN: Type inference failed for: r2v17, types: [d7.d0, z7.r] */
    /* JADX WARN: Type inference failed for: r2v18, types: [z7.r] */
    /* JADX WARN: Type inference failed for: r2v19 */
    /* JADX WARN: Type inference failed for: r2v20 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:41:0x00b3 -> B:42:0x00b5). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:55:0x00e7 -> B:56:0x00e8). Please report as a decompilation issue!!! */
    /* renamed from: l */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object m16384l(z7.C8889r r12, ww.AbstractC8193c r13) {
        /*
            Method dump skipped, instructions count: 248
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: z7.C8889r.m16384l(z7.r, ww.c):java.lang.Object");
    }

    @Override // d7.d0
    /* renamed from: g */
    public final void mo5317g() {
        C8849i c8849i = this.f42805m;
        c8849i.getClass();
        ((Set) c8849i.f42584c).add(this);
        tx.c0.m13502y(this.f42804l.m16390i(), this.f42810r, null, new C8897z(this, null, 1), 2);
    }

    @Override // d7.d0
    /* renamed from: h */
    public final void mo5318h() {
        C8849i c8849i = this.f42805m;
        c8849i.getClass();
        ((Set) c8849i.f42584c).remove(this);
    }
}
