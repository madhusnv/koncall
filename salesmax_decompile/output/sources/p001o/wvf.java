package p001o;

/* loaded from: classes3.dex */
public final class wvf implements zja {

    /* renamed from: b */
    public static final wvf f52764b = new wvf();

    /* renamed from: c */
    public static final boolean f52765c;

    static {
        boolean z;
        try {
            yja.m57897l("version_check").mo20740m(wba.DEBUG);
            z = true;
        } catch (NoSuchMethodError unused) {
            yja.m57896k(wvf.class).warn("falling back to SLF4J 1.x compatible binding");
            z = false;
        }
        f52765c = z;
    }

    @Override // p001o.zja
    /* renamed from: a */
    public qja mo33391a(String str) {
        sq8.m48649h(str, "name");
        vja vjaVarM57897l = yja.m57897l(str);
        if (f52765c) {
            sq8.m48646e(vjaVarM57897l);
            return new uvf(vjaVarM57897l);
        }
        sq8.m48646e(vjaVarM57897l);
        return new qvf(vjaVarM57897l);
    }
}
