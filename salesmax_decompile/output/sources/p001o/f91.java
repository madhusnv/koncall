package p001o;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes2.dex */
public final class f91 {

    /* renamed from: i */
    public static final C13367a f22967i = new C13367a(null);

    /* renamed from: a */
    public final s7f f22968a;

    /* renamed from: b */
    public final ji0 f22969b;

    /* renamed from: c */
    public final pfc f22970c;

    /* renamed from: d */
    public final vg9 f22971d;

    /* renamed from: e */
    public final kl6 f22972e;

    /* renamed from: f */
    public final ik7 f22973f;

    /* renamed from: g */
    public final String f22974g;

    /* renamed from: h */
    public final zi4 f22975h;

    /* renamed from: o.f91$a */
    public static final class C13367a {
        public C13367a() {
        }

        public /* synthetic */ C13367a(id5 id5Var) {
            this();
        }

        /* renamed from: b */
        public static /* synthetic */ f91 m26296b(C13367a c13367a, ji0 ji0Var, String str, int i, Object obj) {
            if ((i & 2) != 0) {
                str = null;
            }
            return c13367a.m26297a(ji0Var, str);
        }

        /* renamed from: a */
        public final f91 m26297a(ji0 ji0Var, String str) {
            sq8.m48649h(ji0Var, "apiMeta");
            return i91.m31758c(r9d.f43250a.m46382a(), ji0Var, str);
        }
    }

    public f91(s7f s7fVar, ji0 ji0Var, pfc pfcVar, vg9 vg9Var, kl6 kl6Var, ik7 ik7Var, String str, zi4 zi4Var) {
        sq8.m48649h(s7fVar, "sdkMetadata");
        sq8.m48649h(ji0Var, "apiMetadata");
        sq8.m48649h(pfcVar, "osMetadata");
        sq8.m48649h(vg9Var, "languageMetadata");
        this.f22968a = s7fVar;
        this.f22969b = ji0Var;
        this.f22970c = pfcVar;
        this.f22971d = vg9Var;
        this.f22972e = kl6Var;
        this.f22973f = ik7Var;
        this.f22974g = str;
        this.f22975h = zi4Var;
    }

    /* renamed from: a */
    public final f91 m26292a(s7f s7fVar, ji0 ji0Var, pfc pfcVar, vg9 vg9Var, kl6 kl6Var, ik7 ik7Var, String str, zi4 zi4Var) {
        sq8.m48649h(s7fVar, "sdkMetadata");
        sq8.m48649h(ji0Var, "apiMetadata");
        sq8.m48649h(pfcVar, "osMetadata");
        sq8.m48649h(vg9Var, "languageMetadata");
        return new f91(s7fVar, ji0Var, pfcVar, vg9Var, kl6Var, ik7Var, str, zi4Var);
    }

    /* renamed from: c */
    public final zi4 m26293c() {
        return this.f22975h;
    }

    /* renamed from: d */
    public final String m26294d() {
        return String.valueOf(this.f22968a);
    }

    /* renamed from: e */
    public final String m26295e() {
        Map mapM59482c;
        List listM59483d;
        List listM59483d2;
        Map mapM59482c2;
        List listM18961c = bh3.m18961c();
        listM18961c.add(this.f22968a);
        zi4 zi4Var = this.f22975h;
        if (zi4Var != null && (mapM59482c2 = zi4Var.m59482c()) != null) {
            if (!mapM59482c2.containsKey("internal")) {
                mapM59482c2 = null;
            }
            if (mapM59482c2 != null) {
                listM18961c.add("md/internal");
            }
        }
        listM18961c.add(i91.m31760e("ua", "2.1", null, 4, null));
        listM18961c.add(this.f22969b);
        listM18961c.add(this.f22970c);
        listM18961c.add(this.f22971d);
        kl6 kl6Var = this.f22972e;
        if (kl6Var != null) {
            listM18961c.add(kl6Var);
        }
        zi4 zi4Var2 = this.f22975h;
        if (zi4Var2 != null && (listM59483d2 = zi4Var2.m59483d()) != null) {
            ArrayList arrayList = new ArrayList();
            Iterator it = listM59483d2.iterator();
            while (it.hasNext()) {
                it.next();
            }
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                listM18961c.add(it2.next());
            }
        }
        String str = this.f22974g;
        if (str != null) {
            listM18961c.add(i91.m31760e("app", str, null, 4, null));
        }
        zi4 zi4Var3 = this.f22975h;
        if (zi4Var3 != null && (listM59483d = zi4Var3.m59483d()) != null) {
            ArrayList arrayList2 = new ArrayList();
            Iterator it3 = listM59483d.iterator();
            while (it3.hasNext()) {
                it3.next();
            }
            Iterator it4 = arrayList2.iterator();
            while (it4.hasNext()) {
                listM18961c.add(it4.next());
            }
        }
        ik7 ik7Var = this.f22973f;
        if (ik7Var != null) {
            listM18961c.add(ik7Var);
        }
        zi4 zi4Var4 = this.f22975h;
        if (zi4Var4 != null && (mapM59482c = zi4Var4.m59482c()) != null) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Map.Entry entry : mapM59482c.entrySet()) {
                if (!sq8.m48644c((String) entry.getKey(), "internal")) {
                    linkedHashMap.put(entry.getKey(), entry.getValue());
                }
            }
            listM18961c.add(w50.m53971c(w50.m53970b(linkedHashMap)));
        }
        return kh3.p0(bh3.m18959a(listM18961c), " ", null, null, 0, null, null, 62, null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f91)) {
            return false;
        }
        f91 f91Var = (f91) obj;
        return sq8.m48644c(this.f22968a, f91Var.f22968a) && sq8.m48644c(this.f22969b, f91Var.f22969b) && sq8.m48644c(this.f22970c, f91Var.f22970c) && sq8.m48644c(this.f22971d, f91Var.f22971d) && sq8.m48644c(this.f22972e, f91Var.f22972e) && sq8.m48644c(this.f22973f, f91Var.f22973f) && sq8.m48644c(this.f22974g, f91Var.f22974g) && sq8.m48644c(this.f22975h, f91Var.f22975h);
    }

    public int hashCode() {
        int iHashCode = ((((((this.f22968a.hashCode() * 31) + this.f22969b.hashCode()) * 31) + this.f22970c.hashCode()) * 31) + this.f22971d.hashCode()) * 31;
        kl6 kl6Var = this.f22972e;
        int iHashCode2 = (iHashCode + (kl6Var == null ? 0 : kl6Var.hashCode())) * 31;
        ik7 ik7Var = this.f22973f;
        int iHashCode3 = (iHashCode2 + (ik7Var == null ? 0 : ik7Var.hashCode())) * 31;
        String str = this.f22974g;
        int iHashCode4 = (iHashCode3 + (str == null ? 0 : str.hashCode())) * 31;
        zi4 zi4Var = this.f22975h;
        return iHashCode4 + (zi4Var != null ? zi4Var.hashCode() : 0);
    }

    public String toString() {
        return "AwsUserAgentMetadata(sdkMetadata=" + this.f22968a + ", apiMetadata=" + this.f22969b + ", osMetadata=" + this.f22970c + ", languageMetadata=" + this.f22971d + ", execEnvMetadata=" + this.f22972e + ", frameworkMetadata=" + this.f22973f + ", appId=" + this.f22974g + ", customMetadata=" + this.f22975h + ')';
    }
}
