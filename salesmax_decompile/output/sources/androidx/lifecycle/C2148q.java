package androidx.lifecycle;

import androidx.lifecycle.AbstractC2139h;
import androidx.lifecycle.C2128b;
import java.lang.reflect.InvocationTargetException;
import p001o.xca;

/* renamed from: androidx.lifecycle.q */
/* loaded from: classes2.dex */
public class C2148q implements InterfaceC2142k {

    /* renamed from: a */
    public final Object f7714a;

    /* renamed from: b */
    public final C2128b.a f7715b;

    public C2148q(Object obj) {
        this.f7714a = obj;
        this.f7715b = C2128b.f7646c.m6499c(obj.getClass());
    }

    @Override // androidx.lifecycle.InterfaceC2142k
    /* renamed from: o */
    public void mo3717o(xca xcaVar, AbstractC2139h.a aVar) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        this.f7715b.m6503a(xcaVar, aVar, this.f7714a);
    }
}
