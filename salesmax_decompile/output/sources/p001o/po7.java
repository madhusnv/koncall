package p001o;

/* loaded from: classes2.dex */
public final class po7 extends qo7 {

    /* renamed from: c */
    public final String f40332c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public po7(String str, CharSequence charSequence) {
        super(str, charSequence);
        sq8.m48649h(str, "type");
        this.f40332c = str;
        if (!(mo43965a().length() > 0)) {
            throw new IllegalArgumentException("type must not be empty".toString());
        }
    }

    @Override // p001o.qo7
    /* renamed from: a */
    public String mo43965a() {
        return this.f40332c;
    }
}
