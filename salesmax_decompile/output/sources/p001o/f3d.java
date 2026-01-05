package p001o;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* loaded from: classes3.dex */
public class f3d {

    /* renamed from: a */
    public boolean f22625a = false;

    /* renamed from: b */
    public final Set f22626b = new ap0();

    /* renamed from: c */
    public final Map f22627c = new HashMap();

    /* renamed from: d */
    public final Comparator f22628d = new C13319a();

    /* renamed from: o.f3d$a */
    public class C13319a implements Comparator {
        public C13319a() {
        }

        @Override // java.util.Comparator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(iwc iwcVar, iwc iwcVar2) {
            float fFloatValue = ((Float) iwcVar.f29292b).floatValue();
            float fFloatValue2 = ((Float) iwcVar2.f29292b).floatValue();
            if (fFloatValue2 > fFloatValue) {
                return 1;
            }
            return fFloatValue > fFloatValue2 ? -1 : 0;
        }
    }

    /* renamed from: a */
    public void m26039a(String str, float f) {
        if (this.f22625a) {
            x0b x0bVar = (x0b) this.f22627c.get(str);
            if (x0bVar == null) {
                x0bVar = new x0b();
                this.f22627c.put(str, x0bVar);
            }
            x0bVar.m55524a(f);
            if (str.equals("__container")) {
                Iterator it = this.f22626b.iterator();
                if (it.hasNext()) {
                    tq.m50332a(it.next());
                    throw null;
                }
            }
        }
    }

    /* renamed from: b */
    public void m26040b(boolean z) {
        this.f22625a = z;
    }
}
