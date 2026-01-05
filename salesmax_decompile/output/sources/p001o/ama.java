package p001o;

import android.graphics.Rect;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes3.dex */
public class ama {

    /* renamed from: c */
    public Map f14975c;

    /* renamed from: d */
    public Map f14976d;

    /* renamed from: e */
    public Map f14977e;

    /* renamed from: f */
    public List f14978f;

    /* renamed from: g */
    public d0g f14979g;

    /* renamed from: h */
    public rla f14980h;

    /* renamed from: i */
    public List f14981i;

    /* renamed from: j */
    public Rect f14982j;

    /* renamed from: k */
    public float f14983k;

    /* renamed from: l */
    public float f14984l;

    /* renamed from: m */
    public float f14985m;

    /* renamed from: n */
    public boolean f14986n;

    /* renamed from: a */
    public final f3d f14973a = new f3d();

    /* renamed from: b */
    public final HashSet f14974b = new HashSet();

    /* renamed from: o */
    public int f14987o = 0;

    /* renamed from: a */
    public void m17437a(String str) {
        rja.m46866c(str);
        this.f14974b.add(str);
    }

    /* renamed from: b */
    public Rect m17438b() {
        return this.f14982j;
    }

    /* renamed from: c */
    public d0g m17439c() {
        return this.f14979g;
    }

    /* renamed from: d */
    public float m17440d() {
        return (long) ((m17441e() / this.f14985m) * 1000.0f);
    }

    /* renamed from: e */
    public float m17441e() {
        return this.f14984l - this.f14983k;
    }

    /* renamed from: f */
    public float m17442f() {
        return this.f14984l;
    }

    /* renamed from: g */
    public Map m17443g() {
        return this.f14977e;
    }

    /* renamed from: h */
    public float m17444h(float f) {
        return zeb.m59356k(this.f14983k, this.f14984l, f);
    }

    /* renamed from: i */
    public float m17445i() {
        return this.f14985m;
    }

    /* renamed from: j */
    public Map m17446j() {
        return this.f14976d;
    }

    /* renamed from: k */
    public List m17447k() {
        return this.f14981i;
    }

    /* renamed from: l */
    public psa m17448l(String str) {
        int size = this.f14978f.size();
        for (int i = 0; i < size; i++) {
            psa psaVar = (psa) this.f14978f.get(i);
            if (psaVar.m44132a(str)) {
                return psaVar;
            }
        }
        return null;
    }

    /* renamed from: m */
    public int m17449m() {
        return this.f14987o;
    }

    /* renamed from: n */
    public f3d m17450n() {
        return this.f14973a;
    }

    /* renamed from: o */
    public List m17451o(String str) {
        return (List) this.f14975c.get(str);
    }

    /* renamed from: p */
    public float m17452p() {
        return this.f14983k;
    }

    /* renamed from: q */
    public boolean m17453q() {
        return this.f14986n;
    }

    /* renamed from: r */
    public void m17454r(int i) {
        this.f14987o += i;
    }

    /* renamed from: s */
    public void m17455s(Rect rect, float f, float f2, float f3, List list, rla rlaVar, Map map, Map map2, d0g d0gVar, Map map3, List list2) {
        this.f14982j = rect;
        this.f14983k = f;
        this.f14984l = f2;
        this.f14985m = f3;
        this.f14981i = list;
        this.f14980h = rlaVar;
        this.f14975c = map;
        this.f14976d = map2;
        this.f14979g = d0gVar;
        this.f14977e = map3;
        this.f14978f = list2;
    }

    /* renamed from: t */
    public gh9 m17456t(long j) {
        return (gh9) this.f14980h.m46932c(j);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("LottieComposition:\n");
        Iterator it = this.f14981i.iterator();
        while (it.hasNext()) {
            sb.append(((gh9) it.next()).m28699y("\t"));
        }
        return sb.toString();
    }

    /* renamed from: u */
    public void m17457u(boolean z) {
        this.f14986n = z;
    }

    /* renamed from: v */
    public void m17458v(boolean z) {
        this.f14973a.m26040b(z);
    }
}
