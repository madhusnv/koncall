package p001o;

/* loaded from: classes2.dex */
public abstract class o94 extends Exception {

    /* renamed from: a */
    public final String f37960a;

    /* renamed from: b */
    public final CharSequence f37961b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o94(String str, CharSequence charSequence) {
        super(charSequence != null ? charSequence.toString() : null);
        sq8.m48649h(str, "type");
        this.f37960a = str;
        this.f37961b = charSequence;
    }

    /* renamed from: a */
    public String mo28285a() {
        return this.f37960a;
    }
}
