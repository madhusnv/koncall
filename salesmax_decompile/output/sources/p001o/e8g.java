package p001o;

import java.util.Iterator;
import java.util.stream.IntStream;

/* loaded from: classes6.dex */
public abstract class e8g {

    /* renamed from: o.e8g$a */
    public static final class C13129a implements ief {

        /* renamed from: a */
        public final /* synthetic */ IntStream f21167a;

        public C13129a(IntStream intStream) {
            this.f21167a = intStream;
        }

        @Override // p001o.ief
        public Iterator iterator() {
            Iterator<Integer> it = this.f21167a.iterator();
            sq8.m48648g(it, "iterator(...)");
            return it;
        }
    }

    /* renamed from: a */
    public static final ief m24524a(IntStream intStream) {
        sq8.m48649h(intStream, "<this>");
        return new C13129a(intStream);
    }
}
