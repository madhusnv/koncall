package g2;

import ex.InterfaceC2139c;
import java.util.Collection;
import kotlin.jvm.internal.AbstractC4154l;
import kotlin.jvm.internal.AbstractC4155m;
import kx.C4265g;
import kx.C4266h;
import og.pe;
import r1.C6426k;
import r1.C6432q;
import r1.C6440y;
import s2.C6734c;
import tx.InterfaceC7266z;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class y3 extends AbstractC4155m implements InterfaceC2139c {

    /* renamed from: a */
    public final /* synthetic */ C4266h f13292a;

    /* renamed from: b */
    public final /* synthetic */ C6440y f13293b;

    /* renamed from: c */
    public final /* synthetic */ InterfaceC7266z f13294c;

    /* renamed from: d */
    public final /* synthetic */ String f13295d;

    /* renamed from: e */
    public final /* synthetic */ String f13296e;

    /* renamed from: f */
    public final /* synthetic */ int f13297f;

    /* renamed from: g */
    public final /* synthetic */ int f13298g;

    /* renamed from: h */
    public final /* synthetic */ InterfaceC2139c f13299h;

    /* renamed from: j */
    public final /* synthetic */ z9 f13300j;

    /* renamed from: k */
    public final /* synthetic */ u2 f13301k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y3(C4266h c4266h, C6440y c6440y, InterfaceC7266z interfaceC7266z, String str, String str2, int i10, int i11, InterfaceC2139c interfaceC2139c, z9 z9Var, u2 u2Var) {
        super(1);
        this.f13292a = c4266h;
        this.f13293b = c6440y;
        this.f13294c = interfaceC7266z;
        this.f13295d = str;
        this.f13296e = str2;
        this.f13297f = i10;
        this.f13298g = i11;
        this.f13299h = interfaceC2139c;
        this.f13300j = z9Var;
        this.f13301k = u2Var;
    }

    @Override // ex.InterfaceC2139c
    public final Object invoke(Object obj) {
        int size;
        C6426k c6426k = (C6426k) obj;
        Iterable iterable = this.f13292a;
        AbstractC4154l.m8923f(iterable, "<this>");
        if (iterable instanceof Collection) {
            size = ((Collection) iterable).size();
        } else {
            C4265g it = iterable.iterator();
            int i10 = 0;
            while (it.f21651c) {
                it.next();
                i10++;
                if (i10 < 0) {
                    pe.m10841p();
                    throw null;
                }
            }
            size = i10;
        }
        c6426k.m12425n(size, C6432q.f31015c, new C6734c(new x3(this.f13292a, this.f13293b, this.f13294c, this.f13295d, this.f13296e, this.f13297f, this.f13298g, this.f13299h, this.f13300j, this.f13301k), true, 1040623618));
        return qw.a0.f30746a;
    }
}
