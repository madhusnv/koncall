package p001o;

/* loaded from: classes2.dex */
public final class vcf extends kf9 implements nl7 {

    /* renamed from: a */
    public static final vcf f50125a = new vcf();

    public vcf() {
        super(2);
    }

    @Override // p001o.nl7
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final bb invoke(bb bbVar, bb bbVar2) {
        String strM18512b;
        tl7 tl7VarM18511a;
        sq8.m48649h(bbVar2, "childValue");
        if (bbVar == null || (strM18512b = bbVar.m18512b()) == null) {
            strM18512b = bbVar2.m18512b();
        }
        if (bbVar == null || (tl7VarM18511a = bbVar.m18511a()) == null) {
            tl7VarM18511a = bbVar2.m18511a();
        }
        return new bb(strM18512b, tl7VarM18511a);
    }
}
