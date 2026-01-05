package g2;

import ex.InterfaceC2141e;
import g4.C2492h;
import h2.AbstractC2808m;
import java.util.Arrays;
import java.util.List;
import k2.C3953b;
import k2.C3966o;
import k2.InterfaceC3962k;
import kotlin.jvm.internal.AbstractC4155m;
import s1.InterfaceC6728w;
import s2.C6734c;
import w2.InterfaceC7879r;
import x1.AbstractC8256f;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class v3 extends AbstractC4155m implements InterfaceC2141e {

    /* renamed from: a */
    public final /* synthetic */ int f12980a;

    /* renamed from: b */
    public final /* synthetic */ int f12981b;

    /* renamed from: c */
    public final /* synthetic */ Object f12982c;

    /* renamed from: d */
    public final /* synthetic */ Object f12983d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v3(int i10, Object obj, InterfaceC6728w interfaceC6728w) {
        super(2);
        this.f12980a = 7;
        this.f12982c = interfaceC6728w;
        this.f12981b = i10;
        this.f12983d = obj;
    }

    @Override // ex.InterfaceC2141e
    public final Object invoke(Object obj, Object obj2) {
        int i10 = this.f12980a;
        qw.a0 a0Var = qw.a0.f30746a;
        int i11 = this.f12981b;
        Object obj3 = this.f12983d;
        Object obj4 = this.f12982c;
        switch (i10) {
            case 0:
                ((Number) obj2).intValue();
                f4.m6150j((u2) obj4, (AbstractC2808m) obj3, (InterfaceC3962k) obj, C3953b.m8496A(i11 | 1));
                break;
            case 1:
                ((Number) obj2).intValue();
                C6734c c6734c = i2.f11782a;
                p9.m6243g((qa) obj4, (InterfaceC7879r) obj3, (InterfaceC3962k) obj, C3953b.m8496A(i11 | 1));
                break;
            case 2:
                ((Number) obj2).intValue();
                rb.m6297d((InterfaceC2141e) obj4, (InterfaceC2141e) obj3, (InterfaceC3962k) obj, C3953b.m8496A(i11 | 1));
                break;
            case 3:
                ((Number) obj2).intValue();
                sc.m6306a((g4.o0) obj4, (InterfaceC2141e) obj3, (InterfaceC3962k) obj, C3953b.m8496A(i11 | 1));
                break;
            case 4:
                ((Number) obj2).intValue();
                ((h1.s1) obj4).m6852a(obj3, (InterfaceC3962k) obj, C3953b.m8496A(i11 | 1));
                break;
            case 5:
                ((Number) obj2).intValue();
                k2.m1[] m1VarArr = (k2.m1[]) obj4;
                C3953b.m8499b((k2.m1[]) Arrays.copyOf(m1VarArr, m1VarArr.length), (InterfaceC2141e) obj3, (InterfaceC3962k) obj, C3953b.m8496A(i11 | 1));
                break;
            case 6:
                ((Number) obj2).intValue();
                C3953b.m8498a((k2.m1) obj4, (InterfaceC2141e) obj3, (InterfaceC3962k) obj, C3953b.m8496A(i11 | 1));
                break;
            case 7:
                InterfaceC3962k interfaceC3962k = (InterfaceC3962k) obj;
                int iIntValue = ((Number) obj2).intValue();
                C3966o c3966o = (C3966o) interfaceC3962k;
                if (!c3966o.m8598P(iIntValue & 1, (iIntValue & 3) != 2)) {
                    c3966o.m8601S();
                    break;
                } else {
                    ((InterfaceC6728w) obj4).mo12105e(i11, obj3, c3966o);
                    break;
                }
            case 8:
                ((Number) obj2).intValue();
                ((C6734c) obj4).m12889b(obj3, (InterfaceC3962k) obj, C3953b.m8496A(i11) | 1);
                break;
            case 9:
                ((Number) obj2).intValue();
                pg.r6.m11846b((InterfaceC7879r) obj4, (InterfaceC2141e) obj3, (InterfaceC3962k) obj, C3953b.m8496A(i11 | 1));
                break;
            case 10:
                ((Number) obj2).intValue();
                AbstractC8256f.m15433a((C2492h) obj4, (List) obj3, (InterfaceC3962k) obj, C3953b.m8496A(i11 | 1));
                break;
            default:
                ((Number) obj2).intValue();
                x1.r0.m15446f((b2.y0) obj4, (C6734c) obj3, (InterfaceC3962k) obj, C3953b.m8496A(i11 | 1));
                break;
        }
        return a0Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v3(qa qaVar, InterfaceC7879r interfaceC7879r, int i10) {
        super(2);
        this.f12980a = 1;
        C6734c c6734c = i2.f11782a;
        this.f12982c = qaVar;
        this.f12983d = interfaceC7879r;
        this.f12981b = i10;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ v3(Object obj, Object obj2, int i10, int i11) {
        super(2);
        this.f12980a = i11;
        this.f12982c = obj;
        this.f12983d = obj2;
        this.f12981b = i10;
    }
}
