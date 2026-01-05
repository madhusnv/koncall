package p001o;

/* loaded from: classes2.dex */
public final class n94 extends o94 {

    /* renamed from: c */
    public final String f36584c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n94(String str, CharSequence charSequence) {
        super(str, charSequence);
        sq8.m48649h(str, "type");
        this.f36584c = str;
        if (!(mo28285a().length() > 0)) {
            throw new IllegalArgumentException("type must not be empty".toString());
        }
    }

    @Override // p001o.o94
    /* renamed from: a */
    public String mo28285a() {
        return this.f36584c;
    }
}
