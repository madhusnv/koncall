package p001o;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import p001o.uyb;

/* loaded from: classes2.dex */
public final class kld {

    /* renamed from: c */
    public static final C14859a f32379c = new C14859a(null);

    /* renamed from: a */
    public final iba f32380a;

    /* renamed from: b */
    public final List f32381b;

    /* renamed from: o.kld$a */
    public static final class C14859a {
        public C14859a() {
        }

        public /* synthetic */ C14859a(id5 id5Var) {
            this();
        }

        /* JADX WARN: Code restructure failed: missing block: B:28:0x009f, code lost:
        
            p001o.jh3.m33831T(r0);
         */
        /* JADX WARN: Code restructure failed: missing block: B:29:0x00a4, code lost:
        
            if (r3 == null) goto L32;
         */
        /* JADX WARN: Code restructure failed: missing block: B:31:0x00a9, code lost:
        
            return new p001o.kld(r3, r0);
         */
        /* JADX WARN: Code restructure failed: missing block: B:33:0x00b5, code lost:
        
            throw new java.lang.IllegalStateException("Required value was null.".toString());
         */
        /* renamed from: a */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final kld m35840a(r81 r81Var) {
            String str;
            iba ibaVarM37438f;
            sq8.m48649h(r81Var, "config");
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            ArrayList arrayList = new ArrayList();
            String strM53205b = r81Var.m46332a().m53205b();
            while (true) {
                vq3 vq3Var = (vq3) r81Var.m46333b().get(strM53205b);
                if (vq3Var == null) {
                    if (linkedHashSet.isEmpty()) {
                        str = "could not find source profile " + strM53205b;
                    } else {
                        str = "could not find source profile " + strM53205b + " referenced from " + ((String) kh3.q0(linkedHashSet));
                    }
                    throw new n2e(str, null, 2, null);
                }
                if (!linkedHashSet.add(strM53205b)) {
                    throw new n2e("profile formed an infinite loop: " + kh3.p0(linkedHashSet, " -> ", null, null, 0, null, null, 62, null) + " -> " + strM53205b, null, 2, null);
                }
                if (linkedHashSet.size() > 1 && (ibaVarM37438f = lld.m37444l(vq3Var)) != null) {
                    break;
                }
                iue iueVarM37441i = lld.m37441i(vq3Var);
                if (iueVarM37441i == null) {
                    ibaVarM37438f = lld.m37438f(vq3Var, r81Var);
                    break;
                }
                arrayList.add(iueVarM37441i);
                uyb uybVarM37437e = lld.m37437e(vq3Var);
                if (uybVarM37437e instanceof uyb.C17486b) {
                    ibaVarM37438f = lld.m37438f(vq3Var, r81Var);
                    break;
                }
                if (!(uybVarM37437e instanceof uyb.C17485a)) {
                    throw new szb();
                }
                strM53205b = ((uyb.C17485a) uybVarM37437e).m52158a();
            }
        }
    }

    public kld(iba ibaVar, List list) {
        sq8.m48649h(ibaVar, "leaf");
        sq8.m48649h(list, "roles");
        this.f32380a = ibaVar;
        this.f32381b = list;
    }

    /* renamed from: a */
    public final iba m35838a() {
        return this.f32380a;
    }

    /* renamed from: b */
    public final List m35839b() {
        return this.f32381b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kld)) {
            return false;
        }
        kld kldVar = (kld) obj;
        return sq8.m48644c(this.f32380a, kldVar.f32380a) && sq8.m48644c(this.f32381b, kldVar.f32381b);
    }

    public int hashCode() {
        return (this.f32380a.hashCode() * 31) + this.f32381b.hashCode();
    }

    public String toString() {
        return "ProfileChain(leaf=" + this.f32380a + ", roles=" + this.f32381b + ')';
    }
}
