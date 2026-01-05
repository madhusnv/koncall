package p001o;

import com.amplifyframework.storage.s3.transfer.TransferTable;
import java.io.File;
import java.util.HashMap;
import java.util.Map;
import p001o.mjb;

/* loaded from: classes5.dex */
public final class rgb {

    /* renamed from: m */
    public static final C16611a f43588m = new C16611a(null);

    /* renamed from: n */
    public static final Map f43589n = isa.m32683j(vyh.m53620a("embedding.weight", "embed.weight"), vyh.m53620a("dense1.weight", "fc1.weight"), vyh.m53620a("dense2.weight", "fc2.weight"), vyh.m53620a("dense3.weight", "fc3.weight"), vyh.m53620a("dense1.bias", "fc1.bias"), vyh.m53620a("dense2.bias", "fc2.bias"), vyh.m53620a("dense3.bias", "fc3.bias"));

    /* renamed from: a */
    public final gna f43590a;

    /* renamed from: b */
    public final gna f43591b;

    /* renamed from: c */
    public final gna f43592c;

    /* renamed from: d */
    public final gna f43593d;

    /* renamed from: e */
    public final gna f43594e;

    /* renamed from: f */
    public final gna f43595f;

    /* renamed from: g */
    public final gna f43596g;

    /* renamed from: h */
    public final gna f43597h;

    /* renamed from: i */
    public final gna f43598i;

    /* renamed from: j */
    public final gna f43599j;

    /* renamed from: k */
    public final gna f43600k;

    /* renamed from: l */
    public final Map f43601l;

    /* renamed from: o.rgb$a */
    public static final class C16611a {
        public C16611a() {
        }

        public /* synthetic */ C16611a(id5 id5Var) {
            this();
        }

        /* renamed from: a */
        public final rgb m46731a(File file) {
            sq8.m48649h(file, TransferTable.COLUMN_FILE);
            Map mapM46732b = m46732b(file);
            id5 id5Var = null;
            if (mapM46732b == null) {
                return null;
            }
            try {
                return new rgb(mapM46732b, id5Var);
            } catch (Exception unused) {
                return null;
            }
        }

        /* renamed from: b */
        public final Map m46732b(File file) {
            Map mapM32649c = iri.m32649c(file);
            if (mapM32649c == null) {
                return null;
            }
            HashMap map = new HashMap();
            Map mapM46729a = rgb.m46729a();
            for (Map.Entry entry : mapM32649c.entrySet()) {
                String str = (String) entry.getKey();
                if (mapM46729a.containsKey(entry.getKey()) && (str = (String) mapM46729a.get(entry.getKey())) == null) {
                    return null;
                }
                map.put(str, entry.getValue());
            }
            return map;
        }
    }

    public /* synthetic */ rgb(Map map, id5 id5Var) {
        this(map);
    }

    /* renamed from: a */
    public static final /* synthetic */ Map m46729a() {
        if (a94.m16694d(rgb.class)) {
            return null;
        }
        try {
            return f43589n;
        } catch (Throwable th) {
            a94.m16692b(th, rgb.class);
            return null;
        }
    }

    /* renamed from: b */
    public final gna m46730b(gna gnaVar, String[] strArr, String str) {
        if (a94.m16694d(this)) {
            return null;
        }
        try {
            sq8.m48649h(gnaVar, "dense");
            sq8.m48649h(strArr, "texts");
            sq8.m48649h(str, "task");
            gna gnaVarM28515c = gec.m28515c(gec.m28517e(strArr, 128, this.f43590a), this.f43591b);
            gec.m28513a(gnaVarM28515c, this.f43594e);
            gec.m28521i(gnaVarM28515c);
            gna gnaVarM28515c2 = gec.m28515c(gnaVarM28515c, this.f43592c);
            gec.m28513a(gnaVarM28515c2, this.f43595f);
            gec.m28521i(gnaVarM28515c2);
            gna gnaVarM28519g = gec.m28519g(gnaVarM28515c2, 2);
            gna gnaVarM28515c3 = gec.m28515c(gnaVarM28519g, this.f43593d);
            gec.m28513a(gnaVarM28515c3, this.f43596g);
            gec.m28521i(gnaVarM28515c3);
            gna gnaVarM28519g2 = gec.m28519g(gnaVarM28515c, gnaVarM28515c.m29152b(1));
            gna gnaVarM28519g3 = gec.m28519g(gnaVarM28519g, gnaVarM28519g.m29152b(1));
            gna gnaVarM28519g4 = gec.m28519g(gnaVarM28515c3, gnaVarM28515c3.m29152b(1));
            gec.m28518f(gnaVarM28519g2, 1);
            gec.m28518f(gnaVarM28519g3, 1);
            gec.m28518f(gnaVarM28519g4, 1);
            gna gnaVarM28516d = gec.m28516d(gec.m28514b(new gna[]{gnaVarM28519g2, gnaVarM28519g3, gnaVarM28519g4, gnaVar}), this.f43597h, this.f43599j);
            gec.m28521i(gnaVarM28516d);
            gna gnaVarM28516d2 = gec.m28516d(gnaVarM28516d, this.f43598i, this.f43600k);
            gec.m28521i(gnaVarM28516d2);
            gna gnaVar2 = (gna) this.f43601l.get(str + ".weight");
            gna gnaVar3 = (gna) this.f43601l.get(str + ".bias");
            if (gnaVar2 != null && gnaVar3 != null) {
                gna gnaVarM28516d3 = gec.m28516d(gnaVarM28516d2, gnaVar2, gnaVar3);
                gec.m28522j(gnaVarM28516d3);
                return gnaVarM28516d3;
            }
            return null;
        } catch (Throwable th) {
            a94.m16692b(th, this);
            return null;
        }
    }

    public rgb(Map map) {
        Object obj = map.get("embed.weight");
        if (obj == null) {
            throw new IllegalStateException("Required value was null.".toString());
        }
        this.f43590a = (gna) obj;
        Object obj2 = map.get("convs.0.weight");
        if (obj2 == null) {
            throw new IllegalStateException("Required value was null.".toString());
        }
        this.f43591b = gec.m28524l((gna) obj2);
        Object obj3 = map.get("convs.1.weight");
        if (obj3 == null) {
            throw new IllegalStateException("Required value was null.".toString());
        }
        this.f43592c = gec.m28524l((gna) obj3);
        Object obj4 = map.get("convs.2.weight");
        if (obj4 == null) {
            throw new IllegalStateException("Required value was null.".toString());
        }
        this.f43593d = gec.m28524l((gna) obj4);
        Object obj5 = map.get("convs.0.bias");
        if (obj5 == null) {
            throw new IllegalStateException("Required value was null.".toString());
        }
        this.f43594e = (gna) obj5;
        Object obj6 = map.get("convs.1.bias");
        if (obj6 == null) {
            throw new IllegalStateException("Required value was null.".toString());
        }
        this.f43595f = (gna) obj6;
        Object obj7 = map.get("convs.2.bias");
        if (obj7 == null) {
            throw new IllegalStateException("Required value was null.".toString());
        }
        this.f43596g = (gna) obj7;
        Object obj8 = map.get("fc1.weight");
        if (obj8 == null) {
            throw new IllegalStateException("Required value was null.".toString());
        }
        this.f43597h = gec.m28523k((gna) obj8);
        Object obj9 = map.get("fc2.weight");
        if (obj9 == null) {
            throw new IllegalStateException("Required value was null.".toString());
        }
        this.f43598i = gec.m28523k((gna) obj9);
        Object obj10 = map.get("fc1.bias");
        if (obj10 == null) {
            throw new IllegalStateException("Required value was null.".toString());
        }
        this.f43599j = (gna) obj10;
        Object obj11 = map.get("fc2.bias");
        if (obj11 == null) {
            throw new IllegalStateException("Required value was null.".toString());
        }
        this.f43600k = (gna) obj11;
        this.f43601l = new HashMap();
        for (String str : nif.m40668i(mjb.EnumC15341a.MTML_INTEGRITY_DETECT.toKey(), mjb.EnumC15341a.MTML_APP_EVENT_PREDICTION.toKey())) {
            String str2 = str + ".weight";
            String str3 = str + ".bias";
            gna gnaVar = (gna) map.get(str2);
            gna gnaVar2 = (gna) map.get(str3);
            if (gnaVar != null) {
                this.f43601l.put(str2, gec.m28523k(gnaVar));
            }
            if (gnaVar2 != null) {
                this.f43601l.put(str3, gnaVar2);
            }
        }
    }
}
