package p001o;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import p001o.ge2;

/* loaded from: classes2.dex */
public abstract class yc2 {

    /* renamed from: o.yc2$a */
    public static final class C18375a implements xc2 {

        /* renamed from: a */
        public final List f55208a;

        public C18375a(List list) {
            if (list == null || list.isEmpty()) {
                throw new IllegalArgumentException("Cannot set an empty CaptureStage list.");
            }
            this.f55208a = Collections.unmodifiableList(new ArrayList(list));
        }

        @Override // p001o.xc2
        /* renamed from: a */
        public List mo55965a() {
            return this.f55208a;
        }
    }

    /* renamed from: a */
    public static xc2 m57490a(ge2... ge2VarArr) {
        return new C18375a(Arrays.asList(ge2VarArr));
    }

    /* renamed from: b */
    public static xc2 m57491b() {
        return m57490a(new ge2.C13691a());
    }
}
