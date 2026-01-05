package p001o;

import java.util.Arrays;

/* loaded from: classes6.dex */
public final class li6 implements dc9 {

    /* renamed from: a */
    public final Enum[] f33890a;

    /* renamed from: b */
    public uef f33891b;

    /* renamed from: c */
    public final gi9 f33892c;

    /* renamed from: o.li6$a */
    public static final class C15081a extends kf9 implements uk7 {

        /* renamed from: b */
        public final /* synthetic */ String f33894b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C15081a(String str) {
            super(0);
            this.f33894b = str;
        }

        @Override // p001o.uk7
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final uef invoke() {
            uef uefVar = li6.this.f33891b;
            return uefVar == null ? li6.this.m37305c(this.f33894b) : uefVar;
        }
    }

    public li6(String str, Enum[] enumArr) {
        sq8.m48649h(str, "serialName");
        sq8.m48649h(enumArr, "values");
        this.f33890a = enumArr;
        this.f33892c = si9.m48360a(new C15081a(str));
    }

    /* renamed from: c */
    public final uef m37305c(String str) {
        fi6 fi6Var = new fi6(str, this.f33890a.length);
        for (Enum r0 : this.f33890a) {
            ubd.m51337l(fi6Var, r0.name(), false, 2, null);
        }
        return fi6Var;
    }

    @Override // p001o.bn5
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public Enum deserialize(w75 w75Var) {
        sq8.m48649h(w75Var, "decoder");
        int iMo17238e = w75Var.mo17238e(getDescriptor());
        boolean z = false;
        if (iMo17238e >= 0 && iMo17238e < this.f33890a.length) {
            z = true;
        }
        if (z) {
            return this.f33890a[iMo17238e];
        }
        throw new gff(iMo17238e + " is not among valid " + getDescriptor().mo16766h() + " enum values, values size is " + this.f33890a.length);
    }

    @Override // p001o.iff
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public void serialize(h76 h76Var, Enum r4) {
        sq8.m48649h(h76Var, "encoder");
        sq8.m48649h(r4, "value");
        int iK0 = gp0.k0(this.f33890a, r4);
        if (iK0 != -1) {
            h76Var.mo29879m(getDescriptor(), iK0);
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(r4);
        sb.append(" is not a valid enum ");
        sb.append(getDescriptor().mo16766h());
        sb.append(", must be one of ");
        String string = Arrays.toString(this.f33890a);
        sq8.m48648g(string, "toString(...)");
        sb.append(string);
        throw new gff(sb.toString());
    }

    @Override // p001o.dc9, p001o.iff, p001o.bn5
    public uef getDescriptor() {
        return (uef) this.f33892c.getValue();
    }

    public String toString() {
        return "kotlinx.serialization.internal.EnumSerializer<" + getDescriptor().mo16766h() + '>';
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public li6(String str, Enum[] enumArr, uef uefVar) {
        this(str, enumArr);
        sq8.m48649h(str, "serialName");
        sq8.m48649h(enumArr, "values");
        sq8.m48649h(uefVar, "descriptor");
        this.f33891b = uefVar;
    }
}
