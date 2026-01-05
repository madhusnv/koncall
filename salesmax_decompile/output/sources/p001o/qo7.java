package p001o;

/* loaded from: classes2.dex */
public abstract class qo7 extends Exception {

    /* renamed from: a */
    public final String f42240a;

    /* renamed from: b */
    public final CharSequence f42241b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qo7(String str, CharSequence charSequence) {
        super(charSequence != null ? charSequence.toString() : null);
        sq8.m48649h(str, "type");
        this.f42240a = str;
        this.f42241b = charSequence;
    }

    /* renamed from: a */
    public String mo43965a() {
        return this.f42240a;
    }
}
