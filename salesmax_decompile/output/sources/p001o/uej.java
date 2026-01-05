package p001o;

/* loaded from: classes3.dex */
public abstract class uej {
    /* renamed from: a */
    public static final void m51500a(tej tejVar, Number number) {
        sq8.m48649h(tejVar, "<this>");
        sq8.m48649h(number, "text");
        tejVar.text(number.toString());
    }

    /* renamed from: b */
    public static final tej m51501b(boolean z) {
        return new km1(z);
    }

    /* renamed from: c */
    public static /* synthetic */ tej m51502c(boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        return m51501b(z);
    }
}
