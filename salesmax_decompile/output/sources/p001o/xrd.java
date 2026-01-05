package p001o;

/* loaded from: classes6.dex */
public abstract class xrd extends y22 implements ac9 {
    private final boolean syntheticJavaProperty;

    public xrd(Object obj, Class cls, String str, String str2, int i) {
        super(obj, cls, str, str2, (i & 1) == 1);
        this.syntheticJavaProperty = (i & 2) == 2;
    }

    @Override // p001o.y22
    public nb9 compute() {
        return this.syntheticJavaProperty ? this : super.compute();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof xrd) {
            xrd xrdVar = (xrd) obj;
            return getOwner().equals(xrdVar.getOwner()) && getName().equals(xrdVar.getName()) && getSignature().equals(xrdVar.getSignature()) && sq8.m48644c(getBoundReceiver(), xrdVar.getBoundReceiver());
        }
        if (obj instanceof ac9) {
            return obj.equals(compute());
        }
        return false;
    }

    public int hashCode() {
        return (((getOwner().hashCode() * 31) + getName().hashCode()) * 31) + getSignature().hashCode();
    }

    @Override // p001o.ac9
    public boolean isConst() {
        return getReflected().isConst();
    }

    @Override // p001o.ac9
    public boolean isLateinit() {
        return getReflected().isLateinit();
    }

    public String toString() {
        nb9 nb9VarCompute = compute();
        if (nb9VarCompute != this) {
            return nb9VarCompute.toString();
        }
        return "property " + getName() + " (Kotlin reflection is not available)";
    }

    @Override // p001o.y22
    public ac9 getReflected() {
        if (this.syntheticJavaProperty) {
            throw new UnsupportedOperationException("Kotlin reflection is not yet supported for synthetic Java properties. Please follow/upvote https://youtrack.jetbrains.com/issue/KT-55980");
        }
        return (ac9) super.getReflected();
    }
}
