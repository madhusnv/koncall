package p001o;

/* loaded from: classes6.dex */
public abstract class e79 {

    /* renamed from: a */
    public static final lgg f21108a = new lgg("COMPLETING_ALREADY");

    /* renamed from: b */
    public static final lgg f21109b = new lgg("COMPLETING_WAITING_CHILDREN");

    /* renamed from: c */
    public static final lgg f21110c = new lgg("COMPLETING_RETRY");

    /* renamed from: d */
    public static final lgg f21111d = new lgg("TOO_LATE_TO_CANCEL");

    /* renamed from: e */
    public static final lgg f21112e = new lgg("SEALED");

    /* renamed from: f */
    public static final z56 f21113f = new z56(false);

    /* renamed from: g */
    public static final z56 f21114g = new z56(true);

    /* renamed from: g */
    public static final Object m24480g(Object obj) {
        return obj instanceof oh8 ? new qh8((oh8) obj) : obj;
    }

    /* renamed from: h */
    public static final Object m24481h(Object obj) {
        oh8 oh8Var;
        qh8 qh8Var = obj instanceof qh8 ? (qh8) obj : null;
        return (qh8Var == null || (oh8Var = qh8Var.f42008a) == null) ? obj : oh8Var;
    }
}
