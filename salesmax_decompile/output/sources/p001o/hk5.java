package p001o;

import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes3.dex */
public abstract class hk5 {

    /* renamed from: o.hk5$a */
    public static final class C13986a extends o64 {

        /* renamed from: a */
        public Object f27069a;

        /* renamed from: b */
        public Object f27070b;

        /* renamed from: c */
        public Object f27071c;

        /* renamed from: d */
        public Object f27072d;

        /* renamed from: e */
        public Object f27073e;

        /* renamed from: f */
        public Object f27074f;

        /* renamed from: g */
        public Object f27075g;

        /* renamed from: h */
        public /* synthetic */ Object f27076h;

        /* renamed from: q */
        public int f27077q;

        public C13986a(n64 n64Var) {
            super(n64Var);
        }

        @Override // p001o.vb1
        public final Object invokeSuspend(Object obj) {
            this.f27076h = obj;
            this.f27077q |= Integer.MIN_VALUE;
            return hk5.m30679a(null, this);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:20:0x007a -> B:21:0x0094). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:26:0x00b7 -> B:27:0x00bd). Please report as a decompilation issue!!! */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object m30679a(ek5 ek5Var, n64 n64Var) {
        C13986a c13986a;
        xx7 xx7Var;
        Iterator it;
        Object obj;
        C13986a c13986a2;
        xx7 xx7Var2;
        if (n64Var instanceof C13986a) {
            c13986a = (C13986a) n64Var;
            int i = c13986a.f27077q;
            if ((i & Integer.MIN_VALUE) != 0) {
                c13986a.f27077q = i - Integer.MIN_VALUE;
            } else {
                c13986a = new C13986a(n64Var);
            }
        }
        Object obj2 = c13986a.f27076h;
        Object objM51918f = uq8.m51918f();
        int i2 = c13986a.f27077q;
        if (i2 == 0) {
            wre.m54934b(obj2);
            if (ek5Var instanceof g66) {
                return ux7.f49593b.m52099a();
            }
            xx7Var = new xx7();
            it = ek5Var.mo17772b().iterator();
            obj = objM51918f;
            c13986a2 = c13986a;
            xx7Var2 = xx7Var;
            if (it.hasNext()) {
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            xx7 xx7Var3 = (xx7) c13986a.f27075g;
            String str = (String) c13986a.f27074f;
            Iterator it2 = (Iterator) c13986a.f27073e;
            String str2 = (String) c13986a.f27072d;
            Iterator it3 = (Iterator) c13986a.f27071c;
            xx7 xx7Var4 = (xx7) c13986a.f27070b;
            xx7 xx7Var5 = (xx7) c13986a.f27069a;
            wre.m54934b(obj2);
            c13986a2 = c13986a;
            xx7Var2 = xx7Var4;
            Iterator it4 = it2;
            Object obj3 = objM51918f;
            xx7Var3.m59796c(str, obj2);
            str = str2;
            it = it3;
            Iterator it5 = it4;
            xx7Var = xx7Var5;
            if (it5.hasNext()) {
                ck5 ck5Var = (ck5) it5.next();
                c13986a2.f27069a = xx7Var;
                c13986a2.f27070b = xx7Var2;
                c13986a2.f27071c = it;
                c13986a2.f27072d = str;
                c13986a2.f27073e = it5;
                c13986a2.f27074f = str;
                c13986a2.f27075g = xx7Var2;
                c13986a2.f27077q = 1;
                Object objMo21334s = ck5Var.mo21334s(c13986a2);
                if (objMo21334s == obj3) {
                    return obj3;
                }
                xx7Var5 = xx7Var;
                it4 = it5;
                obj2 = objMo21334s;
                it3 = it;
                xx7Var3 = xx7Var2;
                str2 = str;
                xx7Var3.m59796c(str, obj2);
                str = str2;
                it = it3;
                Iterator it52 = it4;
                xx7Var = xx7Var5;
                if (it52.hasNext()) {
                    obj = obj3;
                    if (it.hasNext()) {
                        return xx7Var.m56937t();
                    }
                    Map.Entry entry = (Map.Entry) it.next();
                    String str3 = (String) entry.getKey();
                    Iterator it6 = ((List) entry.getValue()).iterator();
                    obj3 = obj;
                    str = str3;
                    it52 = it6;
                    if (it52.hasNext()) {
                    }
                }
            }
        }
    }
}
