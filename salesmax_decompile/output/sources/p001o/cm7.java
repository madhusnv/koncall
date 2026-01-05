package p001o;

/* loaded from: classes6.dex */
public abstract class cm7 extends y22 implements bm7, rb9 {
    private final int arity;
    private final int flags;

    public cm7(int i, Object obj, Class cls, String str, String str2, int i2) {
        super(obj, cls, str, str2, (i2 & 1) == 1);
        this.arity = i;
        this.flags = i2 >> 1;
    }

    @Override // p001o.y22
    public nb9 computeReflected() {
        return kge.m35688a(this);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof cm7) {
            cm7 cm7Var = (cm7) obj;
            return getName().equals(cm7Var.getName()) && getSignature().equals(cm7Var.getSignature()) && this.flags == cm7Var.flags && this.arity == cm7Var.arity && sq8.m48644c(getBoundReceiver(), cm7Var.getBoundReceiver()) && sq8.m48644c(getOwner(), cm7Var.getOwner());
        }
        if (obj instanceof rb9) {
            return obj.equals(compute());
        }
        return false;
    }

    @Override // p001o.bm7
    public int getArity() {
        return this.arity;
    }

    public int hashCode() {
        return (((getOwner() == null ? 0 : getOwner().hashCode() * 31) + getName().hashCode()) * 31) + getSignature().hashCode();
    }

    @Override // p001o.rb9
    public boolean isExternal() {
        return getReflected().isExternal();
    }

    @Override // p001o.rb9
    public boolean isInfix() {
        return getReflected().isInfix();
    }

    @Override // p001o.rb9
    public boolean isInline() {
        return getReflected().isInline();
    }

    @Override // p001o.rb9
    public boolean isOperator() {
        return getReflected().isOperator();
    }

    @Override // p001o.y22, p001o.nb9, p001o.rb9
    public boolean isSuspend() {
        return getReflected().isSuspend();
    }

    public String toString() {
        nb9 nb9VarCompute = compute();
        if (nb9VarCompute != this) {
            return nb9VarCompute.toString();
        }
        if ("<init>".equals(getName())) {
            return "constructor (Kotlin reflection is not available)";
        }
        return "function " + getName() + " (Kotlin reflection is not available)";
    }

    @Override // p001o.y22
    public rb9 getReflected() {
        return (rb9) super.getReflected();
    }
}
