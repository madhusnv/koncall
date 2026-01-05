package ww;

import kotlin.jvm.internal.AbstractC4154l;
import kotlin.jvm.internal.InterfaceC4150h;
import kotlin.jvm.internal.a0;
import kotlin.jvm.internal.b0;
import uw.InterfaceC7559c;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: ww.i */
/* loaded from: classes3.dex */
public abstract class AbstractC8199i extends AbstractC8193c implements InterfaceC4150h {
    private final int arity;

    public AbstractC8199i(int i10, InterfaceC7559c interfaceC7559c) {
        super(interfaceC7559c);
        this.arity = i10;
    }

    @Override // kotlin.jvm.internal.InterfaceC4150h
    public int getArity() {
        return this.arity;
    }

    @Override // ww.AbstractC8191a
    public String toString() {
        if (getCompletion() != null) {
            return super.toString();
        }
        a0.f21154a.getClass();
        String strM8902a = b0.m8902a(this);
        AbstractC4154l.m8922e(strM8902a, "renderLambdaToString(...)");
        return strM8902a;
    }
}
