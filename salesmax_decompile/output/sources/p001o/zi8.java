package p001o;

import p001o.yn7;

/* loaded from: classes6.dex */
public abstract class zi8 {

    /* renamed from: o.zi8$a */
    public static final class C18652a implements yn7 {

        /* renamed from: a */
        public final /* synthetic */ dc9 f57254a;

        public C18652a(dc9 dc9Var) {
            this.f57254a = dc9Var;
        }

        @Override // p001o.yn7
        public dc9[] childSerializers() {
            return new dc9[]{this.f57254a};
        }

        @Override // p001o.bn5
        public Object deserialize(w75 w75Var) {
            sq8.m48649h(w75Var, "decoder");
            throw new IllegalStateException("unsupported".toString());
        }

        @Override // p001o.dc9, p001o.iff, p001o.bn5
        public uef getDescriptor() {
            throw new IllegalStateException("unsupported".toString());
        }

        @Override // p001o.iff
        public void serialize(h76 h76Var, Object obj) {
            sq8.m48649h(h76Var, "encoder");
            throw new IllegalStateException("unsupported".toString());
        }

        @Override // p001o.yn7
        public dc9[] typeParametersSerializers() {
            return yn7.C18436a.m58011a(this);
        }
    }

    /* renamed from: a */
    public static final uef m59498a(String str, dc9 dc9Var) {
        sq8.m48649h(str, "name");
        sq8.m48649h(dc9Var, "primitiveSerializer");
        return new yi8(str, new C18652a(dc9Var));
    }
}
