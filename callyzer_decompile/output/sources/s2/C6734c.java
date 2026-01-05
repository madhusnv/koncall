package s2;

import b2.C0543a;
import ex.InterfaceC2141e;
import ex.InterfaceC2142f;
import ex.InterfaceC2143g;
import g2.v3;
import java.util.ArrayList;
import k1.l1;
import k2.C3966o;
import k2.InterfaceC3962k;
import k2.n1;
import kotlin.jvm.internal.AbstractC4154l;
import kotlin.jvm.internal.d0;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: s2.c */
/* loaded from: classes.dex */
public final class C6734c implements InterfaceC6733b {

    /* renamed from: a */
    public final int f32172a;

    /* renamed from: b */
    public final boolean f32173b;

    /* renamed from: c */
    public Object f32174c;

    /* renamed from: d */
    public n1 f32175d;

    /* renamed from: e */
    public ArrayList f32176e;

    public C6734c(Object obj, boolean z6, int i10) {
        this.f32172a = i10;
        this.f32173b = z6;
        this.f32174c = obj;
    }

    /* renamed from: a */
    public final Object m12888a(Object obj, Object obj2, InterfaceC3962k interfaceC3962k, int i10) {
        C3966o c3966o = (C3966o) interfaceC3962k;
        c3966o.a0(this.f32172a);
        m12891e(c3966o);
        int iM12899a = c3966o.m8614g(this) ? AbstractC6740i.m12899a(2, 2) : AbstractC6740i.m12899a(1, 2);
        Object obj3 = this.f32174c;
        AbstractC4154l.m8921d(obj3, "null cannot be cast to non-null type kotlin.Function4<@[ParameterName(name = \"p1\")] kotlin.Any?, @[ParameterName(name = \"p2\")] kotlin.Any?, @[ParameterName(name = \"c\")] androidx.compose.runtime.Composer, @[ParameterName(name = \"changed\")] kotlin.Int, kotlin.Any?>");
        d0.m8907d(4, obj3);
        Object objMo1450c = ((InterfaceC2143g) obj3).mo1450c(obj, obj2, c3966o, Integer.valueOf(iM12899a | i10));
        n1 n1VarM8628u = c3966o.m8628u();
        if (n1VarM8628u != null) {
            n1VarM8628u.f20443d = new C0543a(this, obj, obj2, i10);
        }
        return objMo1450c;
    }

    /* renamed from: b */
    public final Object m12889b(Object obj, InterfaceC3962k interfaceC3962k, int i10) {
        C3966o c3966o = (C3966o) interfaceC3962k;
        c3966o.a0(this.f32172a);
        m12891e(c3966o);
        int iM12899a = c3966o.m8614g(this) ? AbstractC6740i.m12899a(2, 1) : AbstractC6740i.m12899a(1, 1);
        Object obj2 = this.f32174c;
        AbstractC4154l.m8921d(obj2, "null cannot be cast to non-null type kotlin.Function3<@[ParameterName(name = \"p1\")] kotlin.Any?, @[ParameterName(name = \"c\")] androidx.compose.runtime.Composer, @[ParameterName(name = \"changed\")] kotlin.Int, kotlin.Any?>");
        d0.m8907d(3, obj2);
        Object objInvoke = ((InterfaceC2142f) obj2).invoke(obj, c3966o, Integer.valueOf(iM12899a | i10));
        n1 n1VarM8628u = c3966o.m8628u();
        if (n1VarM8628u != null) {
            n1VarM8628u.f20443d = new v3(this, obj, i10, 8);
        }
        return objInvoke;
    }

    @Override // ex.InterfaceC2143g
    /* renamed from: c */
    public final /* bridge */ /* synthetic */ Object mo1450c(Object obj, Object obj2, Object obj3, Object obj4) {
        return m12888a(obj, obj2, (InterfaceC3962k) obj3, ((Number) obj4).intValue());
    }

    /* renamed from: d */
    public final Object m12890d(InterfaceC3962k interfaceC3962k, int i10) {
        C3966o c3966o = (C3966o) interfaceC3962k;
        c3966o.a0(this.f32172a);
        m12891e(c3966o);
        int iM12899a = i10 | (c3966o.m8614g(this) ? AbstractC6740i.m12899a(2, 0) : AbstractC6740i.m12899a(1, 0));
        Object obj = this.f32174c;
        AbstractC4154l.m8921d(obj, "null cannot be cast to non-null type kotlin.Function2<@[ParameterName(name = \"c\")] androidx.compose.runtime.Composer, @[ParameterName(name = \"changed\")] kotlin.Int, kotlin.Any?>");
        d0.m8907d(2, obj);
        Object objInvoke = ((InterfaceC2141e) obj).invoke(c3966o, Integer.valueOf(iM12899a));
        n1 n1VarM8628u = c3966o.m8628u();
        if (n1VarM8628u != null) {
            n1VarM8628u.f20443d = new l1(2, this, C6734c.class, "invoke", "invoke(Landroidx/compose/runtime/Composer;I)Ljava/lang/Object;", 8, 1);
        }
        return objInvoke;
    }

    /* renamed from: e */
    public final void m12891e(InterfaceC3962k interfaceC3962k) {
        C3966o c3966o;
        n1 n1VarM8633z;
        if (!this.f32173b || (n1VarM8633z = (c3966o = (C3966o) interfaceC3962k).m8633z()) == null) {
            return;
        }
        c3966o.getClass();
        n1VarM8633z.f20440a |= 1;
        if (AbstractC6740i.m12903e(this.f32175d, n1VarM8633z)) {
            this.f32175d = n1VarM8633z;
            return;
        }
        ArrayList arrayList = this.f32176e;
        if (arrayList == null) {
            ArrayList arrayList2 = new ArrayList();
            this.f32176e = arrayList2;
            arrayList2.add(n1VarM8633z);
            return;
        }
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            if (AbstractC6740i.m12903e((n1) arrayList.get(i10), n1VarM8633z)) {
                arrayList.set(i10, n1VarM8633z);
                return;
            }
        }
        arrayList.add(n1VarM8633z);
    }

    @Override // ex.InterfaceC2141e
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return m12890d((InterfaceC3962k) obj, ((Number) obj2).intValue());
    }

    @Override // ex.InterfaceC2142f
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        return m12889b(obj, (InterfaceC3962k) obj2, ((Number) obj3).intValue());
    }
}
