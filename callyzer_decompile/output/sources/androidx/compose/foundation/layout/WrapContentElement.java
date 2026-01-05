package androidx.compose.foundation.layout;

import com.sun.mail.util.AbstractC1452a;
import ex.InterfaceC2141e;
import kotlin.jvm.internal.AbstractC4154l;
import kotlin.jvm.internal.AbstractC4155m;
import o1.EnumC5267z;
import o1.b2;
import v3.a1;
import w2.AbstractC7878q;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
final class WrapContentElement extends a1 {

    /* renamed from: a */
    public final EnumC5267z f1963a;

    /* renamed from: b */
    public final AbstractC4155m f1964b;

    /* renamed from: c */
    public final Object f1965c;

    /* JADX WARN: Multi-variable type inference failed */
    public WrapContentElement(EnumC5267z enumC5267z, InterfaceC2141e interfaceC2141e, Object obj) {
        this.f1963a = enumC5267z;
        this.f1964b = (AbstractC4155m) interfaceC2141e;
        this.f1965c = obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || WrapContentElement.class != obj.getClass()) {
            return false;
        }
        WrapContentElement wrapContentElement = (WrapContentElement) obj;
        return this.f1963a == wrapContentElement.f1963a && AbstractC4154l.m8918a(this.f1965c, wrapContentElement.f1965c);
    }

    @Override // v3.a1
    /* renamed from: h */
    public final AbstractC7878q mo621h() {
        b2 b2Var = new b2();
        b2Var.f25704q = this.f1963a;
        b2Var.f25705r = this.f1964b;
        return b2Var;
    }

    public final int hashCode() {
        return this.f1965c.hashCode() + AbstractC1452a.m4558e(this.f1963a.hashCode() * 31, 31, false);
    }

    @Override // v3.a1
    /* renamed from: i */
    public final void mo622i(AbstractC7878q abstractC7878q) {
        b2 b2Var = (b2) abstractC7878q;
        b2Var.f25704q = this.f1963a;
        b2Var.f25705r = this.f1964b;
    }
}
