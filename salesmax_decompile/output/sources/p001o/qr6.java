package p001o;

/* loaded from: classes5.dex */
public final class qr6 extends ur6 {

    /* renamed from: d */
    public static final C16448a f42332d = new C16448a(null);

    /* renamed from: b */
    public final int f42333b;

    /* renamed from: c */
    public final String f42334c;

    /* renamed from: o.qr6$a */
    public static final class C16448a {
        public C16448a() {
        }

        public /* synthetic */ C16448a(id5 id5Var) {
            this();
        }
    }

    public qr6(String str, int i, String str2) {
        super(str);
        this.f42333b = i;
        this.f42334c = str2;
    }

    @Override // p001o.ur6, java.lang.Throwable
    public String toString() {
        String str = "{FacebookDialogException: errorCode: " + this.f42333b + ", message: " + getMessage() + ", url: " + this.f42334c + "}";
        sq8.m48648g(str, "StringBuilder()\n        …(\"}\")\n        .toString()");
        return str;
    }
}
