package p001o;

import java.io.Serializable;

/* loaded from: classes6.dex */
public abstract class kf9 implements bm7, Serializable {
    private final int arity;

    public kf9(int i) {
        this.arity = i;
    }

    @Override // p001o.bm7
    public int getArity() {
        return this.arity;
    }

    public String toString() {
        String strM35695h = kge.m35695h(this);
        sq8.m48648g(strM35695h, "renderLambdaToString(...)");
        return strM35695h;
    }
}
