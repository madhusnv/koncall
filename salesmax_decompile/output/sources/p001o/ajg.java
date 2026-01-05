package p001o;

import java.util.ArrayList;
import p001o.jo3;

/* loaded from: classes6.dex */
public abstract class ajg implements w75, jo3 {

    /* renamed from: a */
    public final ArrayList f14852a = new ArrayList();

    /* renamed from: b */
    public boolean f14853b;

    /* renamed from: o.ajg$a */
    public static final class C12197a extends kf9 implements uk7 {

        /* renamed from: b */
        public final /* synthetic */ bn5 f14855b;

        /* renamed from: c */
        public final /* synthetic */ Object f14856c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C12197a(bn5 bn5Var, Object obj) {
            super(0);
            this.f14855b = bn5Var;
            this.f14856c = obj;
        }

        @Override // p001o.uk7
        public final Object invoke() {
            ajg ajgVar = ajg.this;
            bn5 bn5Var = this.f14855b;
            return (bn5Var.getDescriptor().mo16760b() || ajgVar.mo20417D()) ? ajgVar.m17221I(bn5Var, this.f14856c) : ajgVar.mo17241i();
        }
    }

    /* renamed from: o.ajg$b */
    public static final class C12198b extends kf9 implements uk7 {

        /* renamed from: b */
        public final /* synthetic */ bn5 f14858b;

        /* renamed from: c */
        public final /* synthetic */ Object f14859c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C12198b(bn5 bn5Var, Object obj) {
            super(0);
            this.f14858b = bn5Var;
            this.f14859c = obj;
        }

        @Override // p001o.uk7
        public final Object invoke() {
            return ajg.this.m17221I(this.f14858b, this.f14859c);
        }
    }

    @Override // p001o.jo3
    /* renamed from: A */
    public final double mo17214A(uef uefVar, int i) {
        sq8.m48649h(uefVar, "descriptor");
        return mo17225M(mo17234V(uefVar, i));
    }

    @Override // p001o.w75
    /* renamed from: B */
    public final String mo17215B() {
        return mo17232T(m17235W());
    }

    @Override // p001o.w75
    /* renamed from: C */
    public abstract Object mo17216C(bn5 bn5Var);

    @Override // p001o.jo3
    /* renamed from: E */
    public final float mo17217E(uef uefVar, int i) {
        sq8.m48649h(uefVar, "descriptor");
        return mo17227O(mo17234V(uefVar, i));
    }

    @Override // p001o.jo3
    /* renamed from: F */
    public final int mo17218F(uef uefVar, int i) {
        sq8.m48649h(uefVar, "descriptor");
        return mo17229Q(mo17234V(uefVar, i));
    }

    @Override // p001o.w75
    /* renamed from: G */
    public final byte mo17219G() {
        return mo17223K(m17235W());
    }

    @Override // p001o.jo3
    /* renamed from: H */
    public final long mo17220H(uef uefVar, int i) {
        sq8.m48649h(uefVar, "descriptor");
        return mo17230R(mo17234V(uefVar, i));
    }

    /* renamed from: I */
    public Object m17221I(bn5 bn5Var, Object obj) {
        sq8.m48649h(bn5Var, "deserializer");
        return mo17216C(bn5Var);
    }

    /* renamed from: J */
    public abstract boolean mo17222J(Object obj);

    /* renamed from: K */
    public abstract byte mo17223K(Object obj);

    /* renamed from: L */
    public abstract char mo17224L(Object obj);

    /* renamed from: M */
    public abstract double mo17225M(Object obj);

    /* renamed from: N */
    public abstract int mo17226N(Object obj, uef uefVar);

    /* renamed from: O */
    public abstract float mo17227O(Object obj);

    /* renamed from: P */
    public w75 mo17228P(Object obj, uef uefVar) {
        sq8.m48649h(uefVar, "inlineDescriptor");
        m17236X(obj);
        return this;
    }

    /* renamed from: Q */
    public abstract int mo17229Q(Object obj);

    /* renamed from: R */
    public abstract long mo17230R(Object obj);

    /* renamed from: S */
    public abstract short mo17231S(Object obj);

    /* renamed from: T */
    public abstract String mo17232T(Object obj);

    /* renamed from: U */
    public final Object m17233U() {
        return kh3.s0(this.f14852a);
    }

    /* renamed from: V */
    public abstract Object mo17234V(uef uefVar, int i);

    /* renamed from: W */
    public final Object m17235W() {
        ArrayList arrayList = this.f14852a;
        Object objRemove = arrayList.remove(ch3.m21248m(arrayList));
        this.f14853b = true;
        return objRemove;
    }

    /* renamed from: X */
    public final void m17236X(Object obj) {
        this.f14852a.add(obj);
    }

    /* renamed from: Y */
    public final Object m17237Y(Object obj, uk7 uk7Var) {
        m17236X(obj);
        Object objInvoke = uk7Var.invoke();
        if (!this.f14853b) {
            m17235W();
        }
        this.f14853b = false;
        return objInvoke;
    }

    @Override // p001o.w75
    /* renamed from: e */
    public final int mo17238e(uef uefVar) {
        sq8.m48649h(uefVar, "enumDescriptor");
        return mo17226N(m17235W(), uefVar);
    }

    @Override // p001o.jo3
    /* renamed from: g */
    public final w75 mo17239g(uef uefVar, int i) {
        sq8.m48649h(uefVar, "descriptor");
        return mo17228P(mo17234V(uefVar, i), uefVar.mo16765g(i));
    }

    @Override // p001o.w75
    /* renamed from: h */
    public final int mo17240h() {
        return mo17229Q(m17235W());
    }

    @Override // p001o.w75
    /* renamed from: i */
    public final Void mo17241i() {
        return null;
    }

    @Override // p001o.jo3
    /* renamed from: j */
    public final byte mo17242j(uef uefVar, int i) {
        sq8.m48649h(uefVar, "descriptor");
        return mo17223K(mo17234V(uefVar, i));
    }

    @Override // p001o.w75
    /* renamed from: l */
    public final long mo17243l() {
        return mo17230R(m17235W());
    }

    @Override // p001o.jo3
    /* renamed from: m */
    public final Object mo17244m(uef uefVar, int i, bn5 bn5Var, Object obj) {
        sq8.m48649h(uefVar, "descriptor");
        sq8.m48649h(bn5Var, "deserializer");
        return m17237Y(mo17234V(uefVar, i), new C12197a(bn5Var, obj));
    }

    @Override // p001o.jo3
    /* renamed from: n */
    public boolean mo17245n() {
        return jo3.C14621a.m34147b(this);
    }

    @Override // p001o.jo3
    /* renamed from: o */
    public final short mo17246o(uef uefVar, int i) {
        sq8.m48649h(uefVar, "descriptor");
        return mo17231S(mo17234V(uefVar, i));
    }

    @Override // p001o.jo3
    /* renamed from: p */
    public final String mo17247p(uef uefVar, int i) {
        sq8.m48649h(uefVar, "descriptor");
        return mo17232T(mo17234V(uefVar, i));
    }

    @Override // p001o.jo3
    /* renamed from: q */
    public int mo17248q(uef uefVar) {
        return jo3.C14621a.m34146a(this, uefVar);
    }

    @Override // p001o.jo3
    /* renamed from: r */
    public final char mo17249r(uef uefVar, int i) {
        sq8.m48649h(uefVar, "descriptor");
        return mo17224L(mo17234V(uefVar, i));
    }

    @Override // p001o.w75
    /* renamed from: s */
    public final short mo17250s() {
        return mo17231S(m17235W());
    }

    @Override // p001o.w75
    /* renamed from: t */
    public final float mo17251t() {
        return mo17227O(m17235W());
    }

    @Override // p001o.jo3
    /* renamed from: u */
    public final Object mo17252u(uef uefVar, int i, bn5 bn5Var, Object obj) {
        sq8.m48649h(uefVar, "descriptor");
        sq8.m48649h(bn5Var, "deserializer");
        return m17237Y(mo17234V(uefVar, i), new C12198b(bn5Var, obj));
    }

    @Override // p001o.jo3
    /* renamed from: v */
    public final boolean mo17253v(uef uefVar, int i) {
        sq8.m48649h(uefVar, "descriptor");
        return mo17222J(mo17234V(uefVar, i));
    }

    @Override // p001o.w75
    /* renamed from: w */
    public final double mo17254w() {
        return mo17225M(m17235W());
    }

    @Override // p001o.w75
    /* renamed from: x */
    public final boolean mo17255x() {
        return mo17222J(m17235W());
    }

    @Override // p001o.w75
    /* renamed from: y */
    public final char mo17256y() {
        return mo17224L(m17235W());
    }

    @Override // p001o.w75
    /* renamed from: z */
    public w75 mo17257z(uef uefVar) {
        sq8.m48649h(uefVar, "descriptor");
        return mo17228P(m17235W(), uefVar);
    }
}
