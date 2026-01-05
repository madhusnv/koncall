package k1;

import ex.InterfaceC2139c;
import ex.InterfaceC2141e;
import kotlin.jvm.internal.C4168z;
import tx.InterfaceC7266z;
import uw.InterfaceC7559c;
import ww.AbstractC8199i;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class e0 extends AbstractC8199i implements InterfaceC2141e {

    /* renamed from: a */
    public final /* synthetic */ int f20066a = 1;

    /* renamed from: b */
    public C4168z f20067b;

    /* renamed from: c */
    public C4168z f20068c;

    /* renamed from: d */
    public int f20069d;

    /* renamed from: e */
    public /* synthetic */ Object f20070e;

    /* renamed from: f */
    public final /* synthetic */ f0 f20071f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e0(f0 f0Var, InterfaceC7559c interfaceC7559c) {
        super(2, interfaceC7559c);
        this.f20071f = f0Var;
    }

    @Override // ww.AbstractC8191a
    public final InterfaceC7559c create(Object obj, InterfaceC7559c interfaceC7559c) {
        switch (this.f20066a) {
            case 0:
                e0 e0Var = new e0(this.f20068c, this.f20071f, interfaceC7559c);
                e0Var.f20070e = obj;
                return e0Var;
            default:
                e0 e0Var2 = new e0(this.f20071f, interfaceC7559c);
                e0Var2.f20070e = obj;
                return e0Var2;
        }
    }

    @Override // ex.InterfaceC2141e
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f20066a) {
            case 0:
                return ((e0) create((InterfaceC2139c) obj, (InterfaceC7559c) obj2)).invokeSuspend(qw.a0.f30746a);
            default:
                return ((e0) create((InterfaceC7266z) obj, (InterfaceC7559c) obj2)).invokeSuspend(qw.a0.f30746a);
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(7:36|37|(1:94)|16|89|40|(2:46|(2:48|(1:95)))(2:42|(2:44|91))) */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00c6, code lost:
    
        r1 = r5;
     */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00b6 A[Catch: CancellationException -> 0x00c6, TryCatch #2 {CancellationException -> 0x00c6, blocks: (B:40:0x00b0, B:42:0x00b6, B:46:0x00c8, B:48:0x00cc), top: B:89:0x00b0 }] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00c8 A[Catch: CancellationException -> 0x00c6, TryCatch #2 {CancellationException -> 0x00c6, blocks: (B:40:0x00b0, B:42:0x00b6, B:46:0x00c8, B:48:0x00cc), top: B:89:0x00b0 }] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:94:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:96:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:32:0x0087 -> B:21:0x005b). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:43:0x00c3 -> B:21:0x005b). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:47:0x00ca -> B:21:0x005b). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:49:0x00d7 -> B:21:0x005b). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:52:0x00e5 -> B:13:0x002c). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:78:0x013b -> B:79:0x013c). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:80:0x0140 -> B:81:0x0141). Please report as a decompilation issue!!! */
    @Override // ww.AbstractC8191a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r7) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 352
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: k1.e0.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e0(C4168z c4168z, f0 f0Var, InterfaceC7559c interfaceC7559c) {
        super(2, interfaceC7559c);
        this.f20068c = c4168z;
        this.f20071f = f0Var;
    }
}
