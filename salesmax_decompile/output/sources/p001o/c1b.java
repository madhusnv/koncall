package p001o;

import java.util.Map;
import p001o.q8d;

/* loaded from: classes2.dex */
public interface c1b extends rq8 {

    /* renamed from: o.c1b$a */
    public static final class C12533a implements b1b {

        /* renamed from: a */
        public final int f17117a;

        /* renamed from: b */
        public final int f17118b;

        /* renamed from: c */
        public final Map f17119c;

        /* renamed from: d */
        public final /* synthetic */ int f17120d;

        /* renamed from: e */
        public final /* synthetic */ c1b f17121e;

        /* renamed from: f */
        public final /* synthetic */ xk7 f17122f;

        public C12533a(int i, int i2, Map map, c1b c1bVar, xk7 xk7Var) {
            this.f17120d = i;
            this.f17121e = c1bVar;
            this.f17122f = xk7Var;
            this.f17117a = i;
            this.f17118b = i2;
            this.f17119c = map;
        }

        @Override // p001o.b1b
        /* renamed from: a */
        public void mo18090a() {
            q8d.AbstractC16323a.a aVar = q8d.AbstractC16323a.f41476a;
            int i = this.f17120d;
            qh9 layoutDirection = this.f17121e.getLayoutDirection();
            c1b c1bVar = this.f17121e;
            vla vlaVar = c1bVar instanceof vla ? (vla) c1bVar : null;
            xk7 xk7Var = this.f17122f;
            mh9 mh9Var = q8d.AbstractC16323a.f41479d;
            int iMo44993l = aVar.mo44993l();
            qh9 qh9VarMo44992k = aVar.mo44992k();
            di9 di9Var = q8d.AbstractC16323a.f41480e;
            q8d.AbstractC16323a.f41478c = i;
            q8d.AbstractC16323a.f41477b = layoutDirection;
            boolean zM45002y = aVar.m45002y(vlaVar);
            xk7Var.invoke(aVar);
            if (vlaVar != null) {
                vlaVar.i0(zM45002y);
            }
            q8d.AbstractC16323a.f41478c = iMo44993l;
            q8d.AbstractC16323a.f41477b = qh9VarMo44992k;
            q8d.AbstractC16323a.f41479d = mh9Var;
            q8d.AbstractC16323a.f41480e = di9Var;
        }

        @Override // p001o.b1b
        /* renamed from: b */
        public Map mo18091b() {
            return this.f17119c;
        }

        @Override // p001o.b1b
        public int getHeight() {
            return this.f17118b;
        }

        @Override // p001o.b1b
        public int getWidth() {
            return this.f17117a;
        }
    }

    /* renamed from: u */
    static /* synthetic */ b1b m20067u(c1b c1bVar, int i, int i2, Map map, xk7 xk7Var, int i3, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: layout");
        }
        if ((i3 & 4) != 0) {
            map = isa.m32681h();
        }
        return c1bVar.m20068g(i, i2, map, xk7Var);
    }

    /* renamed from: g */
    default b1b m20068g(int i, int i2, Map map, xk7 xk7Var) {
        sq8.m48649h(map, "alignmentLines");
        sq8.m48649h(xk7Var, "placementBlock");
        return new C12533a(i, i2, map, this, xk7Var);
    }
}
