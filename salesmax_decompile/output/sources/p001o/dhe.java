package p001o;

import com.bumptech.glide.load.ImageHeaderParser;
import com.bumptech.glide.load.data.C10733b;
import com.bumptech.glide.load.data.InterfaceC10732a;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes5.dex */
public class dhe {

    /* renamed from: a */
    public final ijb f19854a;

    /* renamed from: b */
    public final l76 f19855b;

    /* renamed from: c */
    public final joe f19856c;

    /* renamed from: d */
    public final moe f19857d;

    /* renamed from: e */
    public final C10733b f19858e;

    /* renamed from: f */
    public final iuh f19859f;

    /* renamed from: g */
    public final id8 f19860g;

    /* renamed from: h */
    public final hkb f19861h = new hkb();

    /* renamed from: i */
    public final vga f19862i = new vga();

    /* renamed from: j */
    public final ged f19863j;

    /* renamed from: o.dhe$a */
    public static class C12916a extends RuntimeException {
        public C12916a(String str) {
            super(str);
        }
    }

    /* renamed from: o.dhe$b */
    public static final class C12917b extends C12916a {
        public C12917b() {
            super("Failed to find image header parser.");
        }
    }

    /* renamed from: o.dhe$c */
    public static class C12918c extends C12916a {
        public C12918c(Object obj) {
            super("Failed to find any ModelLoaders registered for model class: " + obj.getClass());
        }

        public C12918c(Object obj, List list) {
            super("Found ModelLoaders for model class: " + list + ", but none that handle this specific model instance: " + obj);
        }

        public C12918c(Class cls, Class cls2) {
            super("Failed to find any ModelLoaders for model: " + cls + " and data: " + cls2);
        }
    }

    /* renamed from: o.dhe$d */
    public static class C12919d extends C12916a {
        public C12919d(Class cls) {
            super("Failed to find result encoder for resource class: " + cls + ", you may need to consider registering a new Encoder for the requested type or DiskCacheStrategy.DATA/DiskCacheStrategy.NONE if caching your transformed resource is unnecessary.");
        }
    }

    /* renamed from: o.dhe$e */
    public static class C12920e extends C12916a {
        public C12920e(Class cls) {
            super("Failed to find source encoder for data class: " + cls);
        }
    }

    public dhe() {
        ged gedVarM39604e = ms6.m39604e();
        this.f19863j = gedVarM39604e;
        this.f19854a = new ijb(gedVarM39604e);
        this.f19855b = new l76();
        this.f19856c = new joe();
        this.f19857d = new moe();
        this.f19858e = new C10733b();
        this.f19859f = new iuh();
        this.f19860g = new id8();
        m23135r(Arrays.asList("Animation", "Bitmap", "BitmapDrawable"));
    }

    /* renamed from: a */
    public dhe m23118a(Class cls, Class cls2, hjb hjbVar) {
        this.f19854a.m32208a(cls, cls2, hjbVar);
        return this;
    }

    /* renamed from: b */
    public dhe m23119b(Class cls, Class cls2, ioe ioeVar) {
        m23122e("legacy_append", cls, cls2, ioeVar);
        return this;
    }

    /* renamed from: c */
    public dhe m23120c(Class cls, i76 i76Var) {
        this.f19855b.m36652a(cls, i76Var);
        return this;
    }

    /* renamed from: d */
    public dhe m23121d(Class cls, loe loeVar) {
        this.f19857d.m39465a(cls, loeVar);
        return this;
    }

    /* renamed from: e */
    public dhe m23122e(String str, Class cls, Class cls2, ioe ioeVar) {
        this.f19856c.m34164a(str, ioeVar, cls, cls2);
        return this;
    }

    /* renamed from: f */
    public final List m23123f(Class cls, Class cls2, Class cls3) {
        ArrayList arrayList = new ArrayList();
        for (Class cls4 : this.f19856c.m34167d(cls, cls2)) {
            for (Class cls5 : this.f19859f.m32854b(cls4, cls3)) {
                arrayList.add(new v75(cls, cls4, cls5, this.f19856c.m34165b(cls, cls4), this.f19859f.m32853a(cls4, cls5), this.f19863j));
            }
        }
        return arrayList;
    }

    /* renamed from: g */
    public List m23124g() {
        List listM31920b = this.f19860g.m31920b();
        if (listM31920b.isEmpty()) {
            throw new C12917b();
        }
        return listM31920b;
    }

    /* renamed from: h */
    public uga m23125h(Class cls, Class cls2, Class cls3) {
        uga ugaVarM52749a = this.f19862i.m52749a(cls, cls2, cls3);
        if (this.f19862i.m52751c(ugaVarM52749a)) {
            return null;
        }
        if (ugaVarM52749a == null) {
            List listM23123f = m23123f(cls, cls2, cls3);
            ugaVarM52749a = listM23123f.isEmpty() ? null : new uga(cls, cls2, cls3, listM23123f, this.f19863j);
            this.f19862i.m52752d(cls, cls2, cls3, ugaVarM52749a);
        }
        return ugaVarM52749a;
    }

    /* renamed from: i */
    public List m23126i(Object obj) {
        return this.f19854a.m32210d(obj);
    }

    /* renamed from: j */
    public List m23127j(Class cls, Class cls2, Class cls3) {
        List listM30704a = this.f19861h.m30704a(cls, cls2, cls3);
        if (listM30704a == null) {
            listM30704a = new ArrayList();
            Iterator it = this.f19854a.m32209c(cls).iterator();
            while (it.hasNext()) {
                for (Class cls4 : this.f19856c.m34167d((Class) it.next(), cls2)) {
                    if (!this.f19859f.m32854b(cls4, cls3).isEmpty() && !listM30704a.contains(cls4)) {
                        listM30704a.add(cls4);
                    }
                }
            }
            this.f19861h.m30705b(cls, cls2, cls3, Collections.unmodifiableList(listM30704a));
        }
        return listM30704a;
    }

    /* renamed from: k */
    public loe m23128k(zne zneVar) {
        loe loeVarM39466b = this.f19857d.m39466b(zneVar.mo19620k());
        if (loeVarM39466b != null) {
            return loeVarM39466b;
        }
        throw new C12919d(zneVar.mo19620k());
    }

    /* renamed from: l */
    public InterfaceC10732a m23129l(Object obj) {
        return this.f19858e.m12706a(obj);
    }

    /* renamed from: m */
    public i76 m23130m(Object obj) {
        i76 i76VarM36653b = this.f19855b.m36653b(obj.getClass());
        if (i76VarM36653b != null) {
            return i76VarM36653b;
        }
        throw new C12920e(obj.getClass());
    }

    /* renamed from: n */
    public boolean m23131n(zne zneVar) {
        return this.f19857d.m39466b(zneVar.mo19620k()) != null;
    }

    /* renamed from: o */
    public dhe m23132o(ImageHeaderParser imageHeaderParser) {
        this.f19860g.m31919a(imageHeaderParser);
        return this;
    }

    /* renamed from: p */
    public dhe m23133p(InterfaceC10732a.a aVar) {
        this.f19858e.m12707b(aVar);
        return this;
    }

    /* renamed from: q */
    public dhe m23134q(Class cls, Class cls2, jpe jpeVar) {
        this.f19859f.m32855c(cls, cls2, jpeVar);
        return this;
    }

    /* renamed from: r */
    public final dhe m23135r(List list) {
        ArrayList arrayList = new ArrayList(list.size());
        arrayList.add("legacy_prepend_all");
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add((String) it.next());
        }
        arrayList.add("legacy_append");
        this.f19856c.m34168e(arrayList);
        return this;
    }
}
