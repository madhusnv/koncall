package p001o;

/* loaded from: classes6.dex */
public abstract class p16 {
    /* renamed from: a */
    public static final double m42863a(double d, o16 o16Var, o16 o16Var2) {
        sq8.m48649h(o16Var, "sourceUnit");
        sq8.m48649h(o16Var2, "targetUnit");
        long jConvert = o16Var2.getTimeUnit$kotlin_stdlib().convert(1L, o16Var.getTimeUnit$kotlin_stdlib());
        return jConvert > 0 ? d * jConvert : d / o16Var.getTimeUnit$kotlin_stdlib().convert(1L, o16Var2.getTimeUnit$kotlin_stdlib());
    }

    /* renamed from: b */
    public static final long m42864b(long j, o16 o16Var, o16 o16Var2) {
        sq8.m48649h(o16Var, "sourceUnit");
        sq8.m48649h(o16Var2, "targetUnit");
        return o16Var2.getTimeUnit$kotlin_stdlib().convert(j, o16Var.getTimeUnit$kotlin_stdlib());
    }

    /* renamed from: c */
    public static final long m42865c(long j, o16 o16Var, o16 o16Var2) {
        sq8.m48649h(o16Var, "sourceUnit");
        sq8.m48649h(o16Var2, "targetUnit");
        return o16Var2.getTimeUnit$kotlin_stdlib().convert(j, o16Var.getTimeUnit$kotlin_stdlib());
    }
}
