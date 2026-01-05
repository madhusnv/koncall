package p001o;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;

/* loaded from: classes3.dex */
public final class qdc {

    /* renamed from: d */
    public static final C16351a f41717d = new C16351a(null);

    /* renamed from: e */
    public static final qdc f41718e = rdc.f43406a;

    /* renamed from: a */
    public final f01 f41719a;

    /* renamed from: b */
    public final Map f41720b;

    /* renamed from: c */
    public final pb8 f41721c;

    /* renamed from: o.qdc$a */
    public static final class C16351a {

        /* renamed from: o.qdc$a$a */
        public static final class a implements f01 {

            /* renamed from: a */
            public final /* synthetic */ c01[] f41722a;

            public a(c01[] c01VarArr) {
                this.f41722a = c01VarArr;
            }

            @Override // p001o.f01
            /* renamed from: a */
            public final Object mo18118a(zdc zdcVar, n64 n64Var) {
                c01[] c01VarArr = this.f41722a;
                ArrayList arrayList = new ArrayList(c01VarArr.length);
                for (c01 c01Var : c01VarArr) {
                    arrayList.add(xz0.m56985b(c01Var.mo19992a(), null, 2, null));
                }
                return arrayList;
            }
        }

        public C16351a() {
        }

        public /* synthetic */ C16351a(id5 id5Var) {
            this();
        }

        /* renamed from: a */
        public final qdc m45207a(pb8 pb8Var, c01... c01VarArr) {
            sq8.m48649h(pb8Var, "identityProviderConfig");
            sq8.m48649h(c01VarArr, "authSchemes");
            a aVar = new a(c01VarArr);
            LinkedHashMap linkedHashMap = new LinkedHashMap(bce.m18601d(hsa.m31055e(c01VarArr.length), 16));
            for (c01 c01Var : c01VarArr) {
                linkedHashMap.put(d01.m22166d(c01Var.mo19992a()), c01Var);
            }
            return new qdc(aVar, linkedHashMap, pb8Var);
        }

        /* renamed from: b */
        public final qdc m45208b() {
            return qdc.f41718e;
        }
    }

    public qdc(f01 f01Var, Map map, pb8 pb8Var) {
        sq8.m48649h(f01Var, "authSchemeResolver");
        sq8.m48649h(map, "configuredAuthSchemes");
        sq8.m48649h(pb8Var, "identityProviderConfig");
        this.f41719a = f01Var;
        this.f41720b = map;
        this.f41721c = pb8Var;
    }

    /* renamed from: b */
    public final f01 m45204b() {
        return this.f41719a;
    }

    /* renamed from: c */
    public final Map m45205c() {
        return this.f41720b;
    }

    /* renamed from: d */
    public final pb8 m45206d() {
        return this.f41721c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qdc)) {
            return false;
        }
        qdc qdcVar = (qdc) obj;
        return sq8.m48644c(this.f41719a, qdcVar.f41719a) && sq8.m48644c(this.f41720b, qdcVar.f41720b) && sq8.m48644c(this.f41721c, qdcVar.f41721c);
    }

    public int hashCode() {
        return (((this.f41719a.hashCode() * 31) + this.f41720b.hashCode()) * 31) + this.f41721c.hashCode();
    }

    public String toString() {
        return "OperationAuthConfig(authSchemeResolver=" + this.f41719a + ", configuredAuthSchemes=" + this.f41720b + ", identityProviderConfig=" + this.f41721c + ')';
    }
}
