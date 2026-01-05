package z1;

import c9.C0910e;
import d4.InterfaceC1596x;
import ex.InterfaceC2139c;
import g4.C2492h;
import g4.n0;
import i0.m0;
import java.util.List;
import k2.e1;
import kotlin.jvm.internal.AbstractC4154l;
import kotlin.jvm.internal.AbstractC4155m;
import l4.C4356a;
import l4.C4364i;
import l4.C4381z;
import l4.h0;
import og.pe;
import og.yf;
import qw.a0;
import x1.c0;
import x1.r1;
import x1.v0;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: z1.e */
/* loaded from: classes.dex */
public final class C8845e extends AbstractC4155m implements InterfaceC2139c {

    /* renamed from: a */
    public final /* synthetic */ int f42567a;

    /* renamed from: b */
    public final /* synthetic */ C8846f f42568b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C8845e(C8846f c8846f, int i10) {
        super(1);
        this.f42567a = i10;
        this.f42568b = c8846f;
    }

    @Override // ex.InterfaceC2139c
    public final Object invoke(Object obj) {
        int i10 = this.f42567a;
        boolean z6 = false;
        C8846f c8846f = this.f42568b;
        switch (i10) {
            case 0:
                e1 e1Var = c8846f.f42573v.f39722t;
                Boolean bool = Boolean.TRUE;
                e1Var.setValue(bool);
                c8846f.f42573v.f39721s.setValue(bool);
                C8846f.O0(c8846f, c8846f.f42573v, ((C2492h) obj).f13620b, c8846f.f42574w, c8846f.f42575x);
                return bool;
            case 1:
                List list = (List) obj;
                if (c8846f.f42573v.m15480d() != null) {
                    r1 r1VarM15480d = c8846f.f42573v.m15480d();
                    AbstractC4154l.m8920c(r1VarM15480d);
                    list.add(r1VarM15480d.f39668a);
                    z6 = true;
                }
                return Boolean.valueOf(z6);
            case 2:
                C8846f.O0(c8846f, c8846f.f42573v, ((C2492h) obj).f13620b, c8846f.f42574w, c8846f.f42575x);
                return Boolean.TRUE;
            default:
                C2492h replacement = (C2492h) obj;
                if (c8846f.f42574w || !c8846f.f42575x) {
                    return Boolean.FALSE;
                }
                h0 h0Var = c8846f.f42573v.f39707e;
                a0 a0Var = null;
                if (h0Var != null) {
                    List listM10834i = pe.m10834i(new C4364i(), new C4356a(replacement, 1));
                    v0 v0Var = c8846f.f42573v;
                    C0910e c0910e = v0Var.f39706d;
                    c0 c0Var = v0Var.f39724v;
                    C4381z c4381zM2607q = c0910e.m2607q(listM10834i);
                    h0Var.m9112a(null, c4381zM2607q);
                    c0Var.invoke(c4381zM2607q);
                    a0Var = a0.f30746a;
                }
                if (a0Var == null) {
                    C4381z c4381z = c8846f.f42572t;
                    String str = c4381z.f21945a.f13620b;
                    long j6 = c4381z.f21946b;
                    int i11 = n0.f13685c;
                    int i12 = (int) (j6 >> 32);
                    int i13 = (int) (j6 & 4294967295L);
                    AbstractC4154l.m8923f(str, "<this>");
                    AbstractC4154l.m8923f(replacement, "replacement");
                    if (i13 < i12) {
                        throw new IndexOutOfBoundsException(m0.m7377j(i13, i12, "End index (", ") is less than start index (", ")."));
                    }
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append((CharSequence) str, 0, i12);
                    sb2.append((CharSequence) replacement);
                    sb2.append((CharSequence) str, i13, str.length());
                    String string = sb2.toString();
                    int length = replacement.f13620b.length() + ((int) (c8846f.f42572t.f21946b >> 32));
                    c8846f.f42573v.f39724v.invoke(new C4381z(string, 4, yf.m11072a(length, length)));
                }
                return Boolean.TRUE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C8845e(C8846f c8846f, InterfaceC1596x interfaceC1596x) {
        super(1);
        this.f42567a = 3;
        this.f42568b = c8846f;
    }
}
