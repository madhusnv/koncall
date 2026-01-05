package p001o;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes6.dex */
public abstract class kth {

    /* renamed from: o.kth$b */
    public static final class C14925b {

        /* renamed from: c */
        public static final kth f32709c = kth.m36231c(Collections.emptyList());

        /* renamed from: a */
        public final kth f32710a;

        /* renamed from: b */
        public ArrayList f32711b;

        /* renamed from: b */
        public kth m36234b() {
            ArrayList arrayList = this.f32711b;
            return arrayList == null ? this.f32710a : kth.m36231c(arrayList);
        }

        public C14925b(kth kthVar) {
            kri.m36136b(kthVar, "parent");
            this.f32710a = kthVar;
            this.f32711b = null;
        }
    }

    /* renamed from: b */
    public static C14925b m36230b() {
        return new C14925b();
    }

    /* renamed from: c */
    public static kth m36231c(List list) {
        kri.m36137c(list.size() <= 32, "Invalid size");
        return new y51(Collections.unmodifiableList(list));
    }

    /* renamed from: d */
    public abstract List mo36232d();
}
