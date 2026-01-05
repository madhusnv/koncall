package p001o;

import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import p001o.lmh;

/* loaded from: classes2.dex */
public final class sbd extends d7 {

    /* renamed from: h */
    public final int f45136h;

    /* renamed from: i */
    public final int f45137i;

    /* renamed from: j */
    public final int[] f45138j;

    /* renamed from: k */
    public final int[] f45139k;

    /* renamed from: l */
    public final lmh[] f45140l;

    /* renamed from: m */
    public final Object[] f45141m;

    /* renamed from: n */
    public final HashMap f45142n;

    /* renamed from: o.sbd$a */
    public class C16796a extends uf7 {

        /* renamed from: f */
        public final lmh.C15106c f45143f;

        public C16796a(lmh lmhVar) {
            super(lmhVar);
            this.f45143f = new lmh.C15106c();
        }

        @Override // p001o.uf7, p001o.lmh
        /* renamed from: g */
        public lmh.C15105b mo6950g(int i, lmh.C15105b c15105b, boolean z) {
            lmh.C15105b c15105bMo6950g = super.mo6950g(i, c15105b, z);
            if (super.m37476n(c15105bMo6950g.f34059c, this.f45143f).m37504f()) {
                c15105bMo6950g.m37498t(c15105b.f34057a, c15105b.f34058b, c15105b.f34059c, c15105b.f34060d, c15105b.f34061e, rv.f44094g, true);
            } else {
                c15105bMo6950g.f34062f = true;
            }
            return c15105bMo6950g;
        }
    }

    public sbd(Collection collection, crf crfVar) {
        this(m48136G(collection), m48137H(collection), crfVar);
    }

    /* renamed from: G */
    public static lmh[] m48136G(Collection collection) {
        lmh[] lmhVarArr = new lmh[collection.size()];
        Iterator it = collection.iterator();
        int i = 0;
        while (it.hasNext()) {
            lmhVarArr[i] = ((g9b) it.next()).mo7201b();
            i++;
        }
        return lmhVarArr;
    }

    /* renamed from: H */
    public static Object[] m48137H(Collection collection) {
        Object[] objArr = new Object[collection.size()];
        Iterator it = collection.iterator();
        int i = 0;
        while (it.hasNext()) {
            objArr[i] = ((g9b) it.next()).mo7200a();
            i++;
        }
        return objArr;
    }

    @Override // p001o.d7
    /* renamed from: A */
    public int mo22373A(int i) {
        return this.f45139k[i];
    }

    @Override // p001o.d7
    /* renamed from: D */
    public lmh mo22376D(int i) {
        return this.f45140l[i];
    }

    /* renamed from: E */
    public sbd m48138E(crf crfVar) {
        lmh[] lmhVarArr = new lmh[this.f45140l.length];
        int i = 0;
        while (true) {
            lmh[] lmhVarArr2 = this.f45140l;
            if (i >= lmhVarArr2.length) {
                return new sbd(lmhVarArr, this.f45141m, crfVar);
            }
            lmhVarArr[i] = new C16796a(lmhVarArr2[i]);
            i++;
        }
    }

    /* renamed from: F */
    public List m48139F() {
        return Arrays.asList(this.f45140l);
    }

    @Override // p001o.lmh
    /* renamed from: i */
    public int mo6951i() {
        return this.f45137i;
    }

    @Override // p001o.lmh
    /* renamed from: p */
    public int mo6954p() {
        return this.f45136h;
    }

    @Override // p001o.d7
    /* renamed from: s */
    public int mo22382s(Object obj) {
        Integer num = (Integer) this.f45142n.get(obj);
        if (num == null) {
            return -1;
        }
        return num.intValue();
    }

    @Override // p001o.d7
    /* renamed from: t */
    public int mo22383t(int i) {
        return sqi.m48727f(this.f45138j, i + 1, false, false);
    }

    @Override // p001o.d7
    /* renamed from: u */
    public int mo22384u(int i) {
        return sqi.m48727f(this.f45139k, i + 1, false, false);
    }

    @Override // p001o.d7
    /* renamed from: x */
    public Object mo22385x(int i) {
        return this.f45141m[i];
    }

    @Override // p001o.d7
    /* renamed from: z */
    public int mo22386z(int i) {
        return this.f45138j[i];
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sbd(lmh[] lmhVarArr, Object[] objArr, crf crfVar) {
        super(false, crfVar);
        int i = 0;
        int length = lmhVarArr.length;
        this.f45140l = lmhVarArr;
        this.f45138j = new int[length];
        this.f45139k = new int[length];
        this.f45141m = objArr;
        this.f45142n = new HashMap();
        int length2 = lmhVarArr.length;
        int iMo6954p = 0;
        int iMo6951i = 0;
        int i2 = 0;
        while (i < length2) {
            lmh lmhVar = lmhVarArr[i];
            this.f45140l[i2] = lmhVar;
            this.f45139k[i2] = iMo6954p;
            this.f45138j[i2] = iMo6951i;
            iMo6954p += lmhVar.mo6954p();
            iMo6951i += this.f45140l[i2].mo6951i();
            this.f45142n.put(objArr[i2], Integer.valueOf(i2));
            i++;
            i2++;
        }
        this.f45136h = iMo6954p;
        this.f45137i = iMo6951i;
    }
}
