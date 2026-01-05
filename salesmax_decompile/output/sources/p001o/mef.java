package p001o;

import java.util.Iterator;

/* loaded from: classes6.dex */
public abstract class mef {

    /* renamed from: o.mef$a */
    public static final class C15300a implements ief {

        /* renamed from: a */
        public final /* synthetic */ nl7 f35293a;

        public C15300a(nl7 nl7Var) {
            this.f35293a = nl7Var;
        }

        @Override // p001o.ief
        public Iterator iterator() {
            return mef.m38853a(this.f35293a);
        }
    }

    /* renamed from: a */
    public static final Iterator m38853a(nl7 nl7Var) {
        sq8.m48649h(nl7Var, "block");
        jef jefVar = new jef();
        jefVar.m33665o(tq8.m50334a(nl7Var, jefVar, jefVar));
        return jefVar;
    }

    /* renamed from: b */
    public static final ief m38854b(nl7 nl7Var) {
        sq8.m48649h(nl7Var, "block");
        return new C15300a(nl7Var);
    }
}
