package p001o;

/* loaded from: classes6.dex */
public abstract class jgg extends o64 implements bm7 {
    private final int arity;

    public jgg(int i, n64 n64Var) {
        super(n64Var);
        this.arity = i;
    }

    @Override // p001o.bm7
    public int getArity() {
        return this.arity;
    }

    @Override // p001o.vb1
    public String toString() {
        if (getCompletion() != null) {
            return super.toString();
        }
        String strM35694g = kge.m35694g(this);
        sq8.m48648g(strM35694g, "renderLambdaToString(...)");
        return strM35694g;
    }
}
