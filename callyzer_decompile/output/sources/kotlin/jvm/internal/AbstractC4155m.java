package kotlin.jvm.internal;

import java.io.Serializable;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: kotlin.jvm.internal.m */
/* loaded from: classes3.dex */
public abstract class AbstractC4155m implements InterfaceC4150h, Serializable {
    private final int arity;

    public AbstractC4155m(int i10) {
        this.arity = i10;
    }

    @Override // kotlin.jvm.internal.InterfaceC4150h
    public int getArity() {
        return this.arity;
    }

    public String toString() {
        a0.f21154a.getClass();
        String strM8902a = b0.m8902a(this);
        AbstractC4154l.m8922e(strM8902a, "renderLambdaToString(...)");
        return strM8902a;
    }
}
