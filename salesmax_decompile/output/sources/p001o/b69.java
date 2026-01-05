package p001o;

import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.function.BiFunction;

/* loaded from: classes6.dex */
public interface b69 extends Iterator, gxh {

    /* renamed from: o.b69$a */
    public static class C12286a extends y7 {

        /* renamed from: a */
        public boolean f15593a = true;

        /* renamed from: b */
        public final /* synthetic */ Object f15594b;

        public C12286a(Object obj) {
            this.f15594b = obj;
        }

        @Override // p001o.y7
        /* renamed from: b */
        public Object mo18199b() {
            this.f15593a = false;
            return this.f15594b;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f15593a;
        }
    }

    /* renamed from: c */
    static b69 m18196c() {
        return c69.f17406a;
    }

    static b69 of(Object obj) {
        return new C12286a(obj);
    }

    static /* synthetic */ Integer v2(Integer num, Object obj) {
        return Integer.valueOf(num.intValue() + 1);
    }

    default String P0() {
        return "Iterator";
    }

    default Object P2() {
        if (hasNext()) {
            return next();
        }
        throw new NoSuchElementException("head() on empty iterator");
    }

    @Override // p001o.uri
    default Object get() {
        return P2();
    }

    @Override // p001o.gxh
    /* renamed from: h */
    default boolean mo18197h() {
        return false;
    }

    @Override // p001o.uri
    default boolean isEmpty() {
        return !hasNext();
    }

    @Override // java.lang.Iterable
    default b69 iterator() {
        return this;
    }

    @Override // p001o.gxh
    default int length() {
        return ((Integer) c3(0, new BiFunction() { // from class: o.a69
            @Override // java.util.function.BiFunction
            public final Object apply(Object obj, Object obj2) {
                return b69.v2((Integer) obj, obj2);
            }
        })).intValue();
    }

    @Override // p001o.gxh
    /* renamed from: t */
    default boolean mo18198t() {
        return true;
    }
}
