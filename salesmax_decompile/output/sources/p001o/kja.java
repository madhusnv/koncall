package p001o;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes5.dex */
public final class kja {

    /* renamed from: c */
    public static final kja f32308c = new C14847a().m35782a();

    /* renamed from: a */
    public final String f32309a;

    /* renamed from: b */
    public final List f32310b;

    /* renamed from: o.kja$a */
    public static final class C14847a {

        /* renamed from: a */
        public String f32311a = "";

        /* renamed from: b */
        public List f32312b = new ArrayList();

        /* renamed from: a */
        public kja m35782a() {
            return new kja(this.f32311a, Collections.unmodifiableList(this.f32312b));
        }

        /* renamed from: b */
        public C14847a m35783b(List list) {
            this.f32312b = list;
            return this;
        }

        /* renamed from: c */
        public C14847a m35784c(String str) {
            this.f32311a = str;
            return this;
        }
    }

    public kja(String str, List list) {
        this.f32309a = str;
        this.f32310b = list;
    }

    /* renamed from: c */
    public static C14847a m35779c() {
        return new C14847a();
    }

    /* renamed from: a */
    public List m35780a() {
        return this.f32310b;
    }

    /* renamed from: b */
    public String m35781b() {
        return this.f32309a;
    }
}
