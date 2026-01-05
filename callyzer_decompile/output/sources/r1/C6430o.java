package r1;

import androidx.compose.foundation.lazy.layout.C0248b;
import java.util.List;
import n1.AbstractC4941a;
import s1.C6729x;
import s4.C6745a;
import s4.EnumC6757m;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: r1.o */
/* loaded from: classes.dex */
public final class C6430o implements s1.a0 {

    /* renamed from: a */
    public final C6427l f31003a;

    /* renamed from: b */
    public final C6729x f31004b;

    /* renamed from: c */
    public final int f31005c;

    /* renamed from: d */
    public final /* synthetic */ C6729x f31006d;

    /* renamed from: e */
    public final /* synthetic */ C6440y f31007e;

    /* renamed from: f */
    public final /* synthetic */ int f31008f;

    /* renamed from: g */
    public final /* synthetic */ int f31009g;

    /* renamed from: h */
    public final /* synthetic */ long f31010h;

    public C6430o(C6427l c6427l, C6729x c6729x, int i10, C6440y c6440y, int i11, int i12, long j6) {
        this.f31006d = c6729x;
        this.f31007e = c6440y;
        this.f31008f = i11;
        this.f31009g = i12;
        this.f31010h = j6;
        this.f31003a = c6427l;
        this.f31004b = c6729x;
        this.f31005c = i10;
    }

    /* renamed from: a */
    public final C6434s m12426a(int i10, int i11, int i12, int i13, long j6) {
        int iM12919j;
        C6427l c6427l = this.f31003a;
        Object objMo12102b = c6427l.mo12102b(i10);
        Object objM12886j = c6427l.f30988b.m12886j(i10);
        List listM12875b = this.f31004b.m12875b(i10, j6);
        if (C6745a.m12916g(j6)) {
            iM12919j = C6745a.m12920k(j6);
        } else {
            if (!C6745a.m12915f(j6)) {
                AbstractC4941a.m9884a("does not have fixed height");
            }
            iM12919j = C6745a.m12919j(j6);
        }
        int i14 = iM12919j;
        EnumC6757m layoutDirection = this.f31006d.f32165b.getLayoutDirection();
        C0248b c0248b = this.f31007e.f31086m;
        return new C6434s(i10, objMo12102b, i14, i13, layoutDirection, this.f31008f, this.f31009g, listM12875b, this.f31010h, objM12886j, c0248b, j6, i11, i12);
    }
}
