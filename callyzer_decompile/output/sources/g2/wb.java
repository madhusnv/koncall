package g2;

import aw.C0480t;
import ex.InterfaceC2139c;
import java.util.ArrayList;
import kotlin.jvm.internal.AbstractC4155m;
import kotlin.jvm.internal.C4165w;
import rw.AbstractC6663m;
import uw.InterfaceC7559c;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class wb extends AbstractC4155m implements InterfaceC2139c {

    /* renamed from: a */
    public final /* synthetic */ C4165w f13166a;

    /* renamed from: b */
    public final /* synthetic */ float f13167b;

    /* renamed from: c */
    public final /* synthetic */ ArrayList f13168c;

    /* renamed from: d */
    public final /* synthetic */ ArrayList f13169d;

    /* renamed from: e */
    public final /* synthetic */ ArrayList f13170e;

    /* renamed from: f */
    public final /* synthetic */ w9 f13171f;

    /* renamed from: g */
    public final /* synthetic */ t3.l0 f13172g;

    /* renamed from: h */
    public final /* synthetic */ int f13173h;

    /* renamed from: j */
    public final /* synthetic */ ArrayList f13174j;

    /* renamed from: k */
    public final /* synthetic */ int f13175k;

    /* renamed from: l */
    public final /* synthetic */ int f13176l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wb(C4165w c4165w, float f6, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, w9 w9Var, t3.l0 l0Var, int i10, ArrayList arrayList4, int i11, int i12) {
        super(1);
        this.f13166a = c4165w;
        this.f13167b = f6;
        this.f13168c = arrayList;
        this.f13169d = arrayList2;
        this.f13170e = arrayList3;
        this.f13171f = w9Var;
        this.f13172g = l0Var;
        this.f13173h = i10;
        this.f13174j = arrayList4;
        this.f13175k = i11;
        this.f13176l = i12;
    }

    @Override // ex.InterfaceC2139c
    public final Object invoke(Object obj) {
        t3.l0 l0Var;
        ArrayList arrayList;
        int i10;
        int i11;
        t3.v0 v0Var = (t3.v0) obj;
        float f6 = this.f13167b;
        C4165w c4165w = this.f13166a;
        c4165w.f21161a = f6;
        ArrayList arrayList2 = this.f13168c;
        int size = arrayList2.size();
        int i12 = 0;
        while (true) {
            l0Var = this.f13172g;
            arrayList = this.f13174j;
            if (i12 >= size) {
                break;
            }
            t3.v0.m13319g(v0Var, (t3.w0) arrayList2.get(i12), l0Var.e0(c4165w.f21161a), 0);
            c4165w.f21161a += ((sb) arrayList.get(i12)).f12719b;
            i12++;
        }
        ArrayList arrayList3 = this.f13169d;
        int size2 = arrayList3.size();
        int i13 = 0;
        while (true) {
            i10 = this.f13176l;
            if (i13 >= size2) {
                break;
            }
            t3.w0 w0Var = (t3.w0) arrayList3.get(i13);
            t3.v0.m13319g(v0Var, w0Var, 0, i10 - w0Var.f34031b);
            i13++;
        }
        ArrayList arrayList4 = this.f13170e;
        int size3 = arrayList4.size();
        int i14 = 0;
        while (true) {
            i11 = this.f13175k;
            if (i14 >= size3) {
                break;
            }
            t3.w0 w0Var2 = (t3.w0) arrayList4.get(i14);
            t3.v0.m13319g(v0Var, w0Var2, Math.max(0, (l0Var.e0(((sb) arrayList.get(i11)).f12719b) - w0Var2.f34030a) / 2), i10 - w0Var2.f34031b);
            i14++;
        }
        w9 w9Var = this.f13171f;
        i1.p1 p1Var = w9Var.f13157a;
        Integer num = w9Var.f13159c;
        if (num == null || num.intValue() != i11) {
            w9Var.f13159c = Integer.valueOf(i11);
            sb sbVar = (sb) AbstractC6663m.m12744H(arrayList, i11);
            if (sbVar != null) {
                sb sbVar2 = (sb) AbstractC6663m.m12750N(arrayList);
                int iE0 = l0Var.e0(sbVar2.f12718a + sbVar2.f12719b) + this.f13173h;
                int iM8526f = iE0 - p1Var.f16956d.m8526f();
                int iE02 = l0Var.e0(sbVar.f12718a) - ((iM8526f / 2) - (l0Var.e0(sbVar.f12719b) / 2));
                int i15 = iE0 - iM8526f;
                if (i15 < 0) {
                    i15 = 0;
                }
                int iM11912c = pg.w9.m11912c(iE02, 0, i15);
                if (p1Var.f16953a.m8526f() != iM11912c) {
                    tx.c0.m13502y(w9Var.f13158b, null, null, new C0480t(w9Var, iM11912c, (InterfaceC7559c) null, 3), 3);
                }
            }
        }
        return qw.a0.f30746a;
    }
}
