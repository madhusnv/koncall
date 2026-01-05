package re;

import java.util.LinkedList;
import java.util.Set;
import l4.d0;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: re.b */
/* loaded from: classes.dex */
public final class C6495b {

    /* renamed from: a */
    public final String f31198a;

    /* renamed from: b */
    public final C6495b f31199b;

    /* renamed from: c */
    public final String f31200c;

    /* renamed from: d */
    public final C6495b[] f31201d;

    /* renamed from: e */
    public final d0[] f31202e;

    public C6495b(Throwable th2, Set set) {
        set.add(th2);
        this.f31198a = th2.getMessage();
        if (th2.getCause() == null || set.contains(th2.getCause())) {
            this.f31199b = null;
        } else {
            this.f31199b = new C6495b(th2.getCause(), set);
        }
        this.f31200c = th2.getClass().getName();
        Throwable[] suppressed = th2.getSuppressed();
        LinkedList linkedList = new LinkedList();
        int length = suppressed.length;
        for (int i10 = 0; i10 < length; i10++) {
            if (!set.contains(suppressed[i10])) {
                linkedList.add(new C6495b(suppressed[i10], set));
            }
        }
        this.f31201d = (C6495b[]) linkedList.toArray(new C6495b[0]);
        StackTraceElement[] stackTrace = th2.getStackTrace();
        this.f31202e = new d0[stackTrace.length];
        int length2 = stackTrace.length;
        for (int i11 = 0; i11 < length2; i11++) {
            this.f31202e[i11] = new d0(14, stackTrace[i11]);
        }
    }
}
