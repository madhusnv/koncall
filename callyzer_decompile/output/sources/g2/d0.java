package g2;

import androidx.compose.ui.layout.AbstractC0264a;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.AbstractC4154l;
import qw.C6361k;
import rw.AbstractC6674x;
import s4.C6745a;
import t3.AbstractC7016c;
import t3.C7027n;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class d0 implements t3.j0 {

    /* renamed from: a */
    public final /* synthetic */ k2.a1 f11349a;

    /* renamed from: b */
    public final /* synthetic */ k2.a1 f11350b;

    /* renamed from: c */
    public final /* synthetic */ k2.a1 f11351c;

    /* renamed from: d */
    public final /* synthetic */ k2.a1 f11352d;

    public d0(k2.a1 a1Var, k2.a1 a1Var2, k2.a1 a1Var3, k2.a1 a1Var4) {
        this.f11349a = a1Var;
        this.f11350b = a1Var2;
        this.f11351c = a1Var3;
        this.f11352d = a1Var4;
    }

    @Override // t3.j0
    /* renamed from: measure-3p2s80s */
    public final t3.k0 mo16554measure3p2s80s(t3.l0 l0Var, List list, long j6) {
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            t3.i0 i0Var = (t3.i0) list.get(i10);
            if (AbstractC4154l.m8918a(AbstractC0264a.m720a(i0Var), "badge")) {
                t3.w0 w0VarMo13314z = i0Var.mo13314z(C6745a.m12911b(j6, 0, 0, 0, 0, 11));
                int size2 = list.size();
                for (int i11 = 0; i11 < size2; i11++) {
                    t3.i0 i0Var2 = (t3.i0) list.get(i11);
                    if (AbstractC4154l.m8918a(AbstractC0264a.m720a(i0Var2), "anchor")) {
                        t3.w0 w0VarMo13314z2 = i0Var2.mo13314z(j6);
                        C7027n c7027n = AbstractC7016c.f33966a;
                        int iD0 = w0VarMo13314z2.d0(c7027n);
                        C7027n c7027n2 = AbstractC7016c.f33967b;
                        return l0Var.g0(w0VarMo13314z2.f34030a, w0VarMo13314z2.f34031b, AbstractC6674x.m12778f(new C6361k(c7027n, Integer.valueOf(iD0)), new C6361k(c7027n2, Integer.valueOf(w0VarMo13314z2.d0(c7027n2)))), new c0(w0VarMo13314z, l0Var, w0VarMo13314z2, this.f11349a, this.f11350b, this.f11351c, this.f11352d));
                    }
                }
                throw new NoSuchElementException("Collection contains no element matching the predicate.");
            }
        }
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    }
}
