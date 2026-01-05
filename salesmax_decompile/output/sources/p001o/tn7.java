package p001o;

/* loaded from: classes6.dex */
public class tn7 implements pcb {

    /* renamed from: a */
    public static final tn7 f47461a = new tn7();

    /* renamed from: c */
    public static tn7 m50235c() {
        return f47461a;
    }

    @Override // p001o.pcb
    /* renamed from: a */
    public ncb mo43342a(Class cls) {
        if (!wn7.class.isAssignableFrom(cls)) {
            throw new IllegalArgumentException("Unsupported message type: " + cls.getName());
        }
        try {
            return (ncb) wn7.getDefaultInstance(cls.asSubclass(wn7.class)).buildMessageInfo();
        } catch (Exception e) {
            throw new RuntimeException("Unable to get message info for " + cls.getName(), e);
        }
    }

    @Override // p001o.pcb
    /* renamed from: b */
    public boolean mo43343b(Class cls) {
        return wn7.class.isAssignableFrom(cls);
    }
}
