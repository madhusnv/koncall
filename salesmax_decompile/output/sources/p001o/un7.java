package p001o;

/* loaded from: classes4.dex */
public class un7 implements qcb {

    /* renamed from: a */
    public static final un7 f49162a = new un7();

    /* renamed from: c */
    public static un7 m51804c() {
        return f49162a;
    }

    @Override // p001o.qcb
    /* renamed from: a */
    public ocb mo45094a(Class cls) {
        if (!vn7.class.isAssignableFrom(cls)) {
            throw new IllegalArgumentException("Unsupported message type: " + cls.getName());
        }
        try {
            return (ocb) vn7.m53044p(cls.asSubclass(vn7.class)).m53052i();
        } catch (Exception e) {
            throw new RuntimeException("Unable to get message info for " + cls.getName(), e);
        }
    }

    @Override // p001o.qcb
    /* renamed from: b */
    public boolean mo45095b(Class cls) {
        return vn7.class.isAssignableFrom(cls);
    }
}
