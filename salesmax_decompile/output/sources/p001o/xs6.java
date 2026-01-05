package p001o;

import java.util.Random;

/* loaded from: classes6.dex */
public final class xs6 extends d9 {

    /* renamed from: c */
    public final C18240a f54226c = new C18240a();

    /* renamed from: o.xs6$a */
    public static final class C18240a extends ThreadLocal {
        @Override // java.lang.ThreadLocal
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Random initialValue() {
            return new Random();
        }
    }

    @Override // p001o.d9
    /* renamed from: j */
    public Random mo18509j() {
        Object obj = this.f54226c.get();
        sq8.m48648g(obj, "get(...)");
        return (Random) obj;
    }
}
