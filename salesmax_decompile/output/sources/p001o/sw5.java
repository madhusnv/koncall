package p001o;

/* loaded from: classes2.dex */
public final class sw5 {

    /* renamed from: a */
    public final int f46017a;

    /* renamed from: b */
    public final int f46018b;

    /* renamed from: c */
    public final String f46019c;

    public sw5(int i, int i2, String str) {
        this.f46017a = i;
        this.f46018b = i2;
        this.f46019c = str;
    }

    /* renamed from: a */
    public static sw5 m48957a(zwc zwcVar) {
        String str;
        zwcVar.m60018V(2);
        int iM60004H = zwcVar.m60004H();
        int i = iM60004H >> 1;
        int iM60004H2 = ((zwcVar.m60004H() >> 3) & 31) | ((iM60004H & 1) << 5);
        if (i == 4 || i == 5 || i == 7) {
            str = "dvhe";
        } else if (i == 8) {
            str = "hev1";
        } else {
            if (i != 9) {
                return null;
            }
            str = "avc3";
        }
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(".0");
        sb.append(i);
        sb.append(iM60004H2 >= 10 ? "." : ".0");
        sb.append(iM60004H2);
        return new sw5(i, iM60004H2, sb.toString());
    }
}
