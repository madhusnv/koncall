package p001o;

import com.amplifyframework.storage.s3.transfer.TransferTable;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import p001o.vv5;

/* loaded from: classes3.dex */
public final class oa9 implements tff, gfa, yra, l9g {

    /* renamed from: b */
    public static final C15743a f38003b = new C15743a(null);

    /* renamed from: c */
    public static final Set f38004c = nif.m40668i(Double.valueOf(Double.NEGATIVE_INFINITY), Double.valueOf(Double.POSITIVE_INFINITY), Double.valueOf(Double.NaN));

    /* renamed from: d */
    public static final Set f38005d = nif.m40668i(Float.valueOf(Float.NEGATIVE_INFINITY), Float.valueOf(Float.POSITIVE_INFINITY), Float.valueOf(Float.NaN));

    /* renamed from: a */
    public final sa9 f38006a = ta9.m49650b(false, 1, null);

    /* renamed from: o.oa9$a */
    public static final class C15743a {
        public C15743a() {
        }

        public /* synthetic */ C15743a(id5 id5Var) {
            this();
        }
    }

    @Override // p001o.tff
    /* renamed from: a */
    public byte[] mo41870a() {
        byte[] bArrMo43171a = this.f38006a.mo43171a();
        if (bArrMo43171a != null) {
            return bArrMo43171a;
        }
        throw new hff("Serializer payload is empty");
    }

    @Override // p001o.l9g
    /* renamed from: b */
    public void mo26539b(h7f h7fVar, vv5 vv5Var) {
        sq8.m48649h(h7fVar, "descriptor");
        this.f38006a.mo43177g(z89.m58938a(h7fVar));
        m41875t(vv5Var);
    }

    @Override // p001o.l9g
    /* renamed from: c */
    public void mo26540c(h7f h7fVar, xk7 xk7Var) {
        sq8.m48649h(h7fVar, "descriptor");
        sq8.m48649h(xk7Var, "block");
        this.f38006a.mo43177g(z89.m58938a(h7fVar));
        gfa gfaVarMo41873o = mo41873o(h7fVar);
        xk7Var.invoke(gfaVarMo41873o);
        gfaVarMo41873o.mo21110f();
    }

    @Override // p001o.zhd
    /* renamed from: d */
    public void mo21108d(String str) {
        sq8.m48649h(str, "value");
        this.f38006a.mo43178h(str);
    }

    @Override // p001o.zhd
    /* renamed from: e */
    public void mo21109e(c8f c8fVar) {
        sq8.m48649h(c8fVar, "value");
        c8fVar.mo20495a(this);
    }

    @Override // p001o.gfa
    /* renamed from: f */
    public void mo21110f() {
        this.f38006a.endArray();
    }

    @Override // p001o.l9g
    /* renamed from: g */
    public void mo26541g(h7f h7fVar, String str) {
        sq8.m48649h(h7fVar, "descriptor");
        sq8.m48649h(str, "value");
        this.f38006a.mo43177g(z89.m58938a(h7fVar));
        mo21108d(str);
    }

    @Override // p001o.tff
    /* renamed from: h */
    public l9g mo41871h(h7f h7fVar) {
        sq8.m48649h(h7fVar, "descriptor");
        this.f38006a.beginObject();
        return this;
    }

    @Override // p001o.l9g
    /* renamed from: i */
    public void mo26542i(h7f h7fVar, boolean z) {
        sq8.m48649h(h7fVar, "descriptor");
        this.f38006a.mo43177g(z89.m58938a(h7fVar));
        m41874s(z);
    }

    @Override // p001o.l9g
    /* renamed from: j */
    public void mo26543j() {
        this.f38006a.endObject();
    }

    @Override // p001o.yra
    /* renamed from: k */
    public void mo33675k(String str, String str2) {
        sq8.m48649h(str, TransferTable.COLUMN_KEY);
        this.f38006a.mo43177g(str);
        if (str2 != null) {
            mo21108d(str2);
        } else {
            this.f38006a.mo43176f();
        }
    }

    @Override // p001o.yra
    /* renamed from: l */
    public void mo33676l() {
        this.f38006a.endObject();
    }

    @Override // p001o.tff
    /* renamed from: m */
    public yra mo41872m(h7f h7fVar) {
        sq8.m48649h(h7fVar, "descriptor");
        this.f38006a.beginObject();
        return this;
    }

    @Override // p001o.l9g
    /* renamed from: n */
    public void mo26544n(h7f h7fVar, c8f c8fVar) {
        sq8.m48649h(h7fVar, "descriptor");
        sq8.m48649h(c8fVar, "value");
        this.f38006a.mo43177g(z89.m58938a(h7fVar));
        c8fVar.mo20495a(this);
    }

    @Override // p001o.tff
    /* renamed from: o */
    public gfa mo41873o(h7f h7fVar) {
        sq8.m48649h(h7fVar, "descriptor");
        this.f38006a.beginArray();
        return this;
    }

    @Override // p001o.l9g
    /* renamed from: p */
    public void mo26545p(h7f h7fVar, float f) {
        sq8.m48649h(h7fVar, "descriptor");
        this.f38006a.mo43177g(z89.m58938a(h7fVar));
        m41876u(f);
    }

    @Override // p001o.l9g
    /* renamed from: q */
    public void mo26546q(h7f h7fVar, int i) {
        sq8.m48649h(h7fVar, "descriptor");
        this.f38006a.mo43177g(z89.m58938a(h7fVar));
        m41877v(i);
    }

    @Override // p001o.l9g
    /* renamed from: r */
    public void mo26547r(h7f h7fVar, xk7 xk7Var) {
        sq8.m48649h(h7fVar, "descriptor");
        sq8.m48649h(xk7Var, "block");
        this.f38006a.mo43177g(z89.m58938a(h7fVar));
        yra yraVarMo41872m = mo41872m(h7fVar);
        xk7Var.invoke(yraVarMo41872m);
        yraVarMo41872m.mo33676l();
    }

    /* renamed from: s */
    public void m41874s(boolean z) {
        this.f38006a.mo43174d(z);
    }

    /* renamed from: t */
    public void m41875t(vv5 vv5Var) {
        if (vv5Var instanceof vv5.C17678d) {
            this.f38006a.mo43172b(((vv5.C17678d) vv5Var).m53479n());
            return;
        }
        if (vv5Var instanceof vv5.C17679e) {
            this.f38006a.mo43178h(((vv5.C17679e) vv5Var).m53480n());
            return;
        }
        if (vv5Var instanceof vv5.C17675a) {
            this.f38006a.mo43174d(((vv5.C17675a) vv5Var).m53461n());
            return;
        }
        if (vv5Var == null) {
            this.f38006a.mo43176f();
            return;
        }
        if (vv5Var instanceof vv5.C17676b) {
            this.f38006a.beginArray();
            Iterator it = ((vv5.C17676b) vv5Var).m53465v().iterator();
            while (it.hasNext()) {
                m41875t((vv5) it.next());
            }
            this.f38006a.endArray();
            return;
        }
        if (!(vv5Var instanceof vv5.C17677c)) {
            throw new szb();
        }
        this.f38006a.beginObject();
        for (Map.Entry entry : ((vv5.C17677c) vv5Var).m53471B().entrySet()) {
            this.f38006a.mo43177g((String) entry.getKey());
            m41875t((vv5) entry.getValue());
        }
        this.f38006a.endObject();
    }

    /* renamed from: u */
    public void m41876u(float f) {
        if (f38005d.contains(Float.valueOf(f))) {
            this.f38006a.mo43178h(String.valueOf(f));
        } else {
            this.f38006a.mo43175e(f);
        }
    }

    /* renamed from: v */
    public void m41877v(int i) {
        this.f38006a.mo43173c(i);
    }
}
