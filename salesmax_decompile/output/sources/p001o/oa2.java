package p001o;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;

/* loaded from: classes2.dex */
public final class oa2 {

    /* renamed from: c */
    public static final oa2 f37989c = new C15741a().m41868b(0).m41867a();

    /* renamed from: d */
    public static final oa2 f37990d = new C15741a().m41868b(1).m41867a();

    /* renamed from: a */
    public final LinkedHashSet f37991a;

    /* renamed from: b */
    public final String f37992b;

    /* renamed from: o.oa2$a */
    public static final class C15741a {

        /* renamed from: a */
        public final LinkedHashSet f37993a = new LinkedHashSet();

        /* renamed from: b */
        public String f37994b;

        /* renamed from: a */
        public oa2 m41867a() {
            return new oa2(this.f37993a, this.f37994b);
        }

        /* renamed from: b */
        public C15741a m41868b(int i) {
            fgd.m26666j(i != -1, "The specified lens facing is invalid.");
            this.f37993a.add(new uba(i));
            return this;
        }
    }

    public oa2(LinkedHashSet linkedHashSet, String str) {
        this.f37991a = linkedHashSet;
        this.f37992b = str;
    }

    /* renamed from: a */
    public LinkedHashSet m41862a(LinkedHashSet linkedHashSet) {
        ArrayList arrayList = new ArrayList();
        Iterator it = linkedHashSet.iterator();
        while (it.hasNext()) {
            arrayList.add(((v92) it.next()).mo28113a());
        }
        List listM41863b = m41863b(arrayList);
        LinkedHashSet linkedHashSet2 = new LinkedHashSet();
        Iterator it2 = linkedHashSet.iterator();
        while (it2.hasNext()) {
            v92 v92Var = (v92) it2.next();
            if (listM41863b.contains(v92Var.mo28113a())) {
                linkedHashSet2.add(v92Var);
            }
        }
        return linkedHashSet2;
    }

    /* renamed from: b */
    public List m41863b(List list) {
        List arrayList = new ArrayList(list);
        Iterator it = this.f37991a.iterator();
        while (it.hasNext()) {
            arrayList = ((r92) it.next()).mo46366a(Collections.unmodifiableList(arrayList));
        }
        arrayList.retainAll(list);
        return arrayList;
    }

    /* renamed from: c */
    public LinkedHashSet m41864c() {
        return this.f37991a;
    }

    /* renamed from: d */
    public Integer m41865d() {
        Iterator it = this.f37991a.iterator();
        Integer num = null;
        while (it.hasNext()) {
            r92 r92Var = (r92) it.next();
            if (r92Var instanceof uba) {
                Integer numValueOf = Integer.valueOf(((uba) r92Var).m51335b());
                if (num == null) {
                    num = numValueOf;
                } else if (!num.equals(numValueOf)) {
                    throw new IllegalStateException("Multiple conflicting lens facing requirements exist.");
                }
            }
        }
        return num;
    }

    /* renamed from: e */
    public v92 m41866e(LinkedHashSet linkedHashSet) {
        Iterator it = m41862a(linkedHashSet).iterator();
        if (it.hasNext()) {
            return (v92) it.next();
        }
        throw new IllegalArgumentException("No available camera can be found");
    }
}
