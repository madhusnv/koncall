package k2;

import kotlin.jvm.internal.AbstractC4154l;
import n2.InterfaceC4946e;
import p2.C5790b;
import p2.C5799k;
import q2.C6099a;
import q2.C6100b;
import r2.C6443b;
import uw.InterfaceC7563g;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class s0 implements InterfaceC7563g, d2 {

    /* renamed from: b */
    public static final /* synthetic */ s0 f20543b = new s0(0);

    /* renamed from: c */
    public static final s0 f20544c = new s0(1);

    /* renamed from: d */
    public static final s0 f20545d = new s0(2);

    /* renamed from: e */
    public static final s0 f20546e = new s0(3);

    /* renamed from: f */
    public static final s0 f20547f = new s0(4);

    /* renamed from: a */
    public final /* synthetic */ int f20548a;

    public /* synthetic */ s0(int i10) {
        this.f20548a = i10;
    }

    /* renamed from: b */
    public static final void m8656b(s0 s0Var) {
        wx.m1 m1Var;
        InterfaceC4946e interfaceC4946e;
        C6100b c6100b;
        wx.m1 m1Var2 = q1.f20516x;
        do {
            m1Var = q1.f20516x;
            interfaceC4946e = (InterfaceC4946e) m1Var.getValue();
            c6100b = (C6100b) interfaceC4946e;
            C5790b c5790bM11341d = c6100b.f29798c;
            C6099a c6099a = (C6099a) c5790bM11341d.get(s0Var);
            if (c6099a != null) {
                Object obj = c6099a.f29793a;
                Object obj2 = c6099a.f29794b;
                C5799k c5799k = c5790bM11341d.f28377a;
                C5799k c5799kM11369v = c5799k.m11369v(s0Var != null ? s0Var.hashCode() : 0, s0Var, 0);
                if (c5799k != c5799kM11369v) {
                    c5790bM11341d = c5799kM11369v == null ? C5790b.f28376c : new C5790b(c5799kM11369v, c5790bM11341d.f28378b - 1);
                }
                C6443b c6443b = C6443b.f31098a;
                if (obj != c6443b) {
                    Object obj3 = c5790bM11341d.get(obj);
                    AbstractC4154l.m8920c(obj3);
                    c5790bM11341d = c5790bM11341d.m11341d(obj, new C6099a(((C6099a) obj3).f29793a, obj2));
                }
                if (obj2 != c6443b) {
                    Object obj4 = c5790bM11341d.get(obj2);
                    AbstractC4154l.m8920c(obj4);
                    c5790bM11341d = c5790bM11341d.m11341d(obj2, new C6099a(obj, ((C6099a) obj4).f29794b));
                }
                Object obj5 = obj != c6443b ? c6100b.f29796a : obj2;
                if (obj2 != c6443b) {
                    obj = c6100b.f29797b;
                }
                c6100b = new C6100b(obj5, obj, c5790bM11341d);
            }
            if (interfaceC4946e == c6100b) {
                return;
            }
        } while (!m1Var.m15397i(interfaceC4946e, c6100b));
    }

    @Override // k2.d2
    /* renamed from: a */
    public boolean mo8534a(Object obj, Object obj2) {
        switch (this.f20548a) {
            case 1:
                return false;
            case 2:
                return obj == obj2;
            default:
                return AbstractC4154l.m8918a(obj, obj2);
        }
    }

    public String toString() {
        switch (this.f20548a) {
            case 1:
                return "NeverEqualPolicy";
            case 2:
                return "ReferentialEqualityPolicy";
            case 3:
            case 5:
            default:
                return super.toString();
            case 4:
                return "StructuralEqualityPolicy";
            case 6:
                return "Empty";
        }
    }
}
