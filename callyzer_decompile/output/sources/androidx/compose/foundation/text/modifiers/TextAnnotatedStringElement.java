package androidx.compose.foundation.text.modifiers;

import a2.C0038k;
import com.sun.mail.util.AbstractC1452a;
import d3.InterfaceC1566t;
import ex.InterfaceC2139c;
import g4.C2492h;
import g4.o0;
import java.util.List;
import k4.InterfaceC3987h;
import kotlin.jvm.internal.AbstractC4154l;
import v3.a1;
import w2.AbstractC7878q;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class TextAnnotatedStringElement extends a1 {

    /* renamed from: a */
    public final C2492h f2043a;

    /* renamed from: b */
    public final o0 f2044b;

    /* renamed from: c */
    public final InterfaceC3987h f2045c;

    /* renamed from: d */
    public final InterfaceC2139c f2046d;

    /* renamed from: e */
    public final int f2047e;

    /* renamed from: f */
    public final boolean f2048f;

    /* renamed from: g */
    public final int f2049g;

    /* renamed from: h */
    public final int f2050h;

    /* renamed from: j */
    public final List f2051j;

    /* renamed from: k */
    public final InterfaceC2139c f2052k;

    /* renamed from: l */
    public final InterfaceC1566t f2053l;

    /* renamed from: m */
    public final InterfaceC2139c f2054m;

    public TextAnnotatedStringElement(C2492h c2492h, o0 o0Var, InterfaceC3987h interfaceC3987h, InterfaceC2139c interfaceC2139c, int i10, boolean z6, int i11, int i12, List list, InterfaceC2139c interfaceC2139c2, InterfaceC1566t interfaceC1566t, InterfaceC2139c interfaceC2139c3) {
        this.f2043a = c2492h;
        this.f2044b = o0Var;
        this.f2045c = interfaceC3987h;
        this.f2046d = interfaceC2139c;
        this.f2047e = i10;
        this.f2048f = z6;
        this.f2049g = i11;
        this.f2050h = i12;
        this.f2051j = list;
        this.f2052k = interfaceC2139c2;
        this.f2053l = interfaceC1566t;
        this.f2054m = interfaceC2139c3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TextAnnotatedStringElement)) {
            return false;
        }
        TextAnnotatedStringElement textAnnotatedStringElement = (TextAnnotatedStringElement) obj;
        return AbstractC4154l.m8918a(this.f2053l, textAnnotatedStringElement.f2053l) && AbstractC4154l.m8918a(this.f2043a, textAnnotatedStringElement.f2043a) && AbstractC4154l.m8918a(this.f2044b, textAnnotatedStringElement.f2044b) && AbstractC4154l.m8918a(this.f2051j, textAnnotatedStringElement.f2051j) && AbstractC4154l.m8918a(this.f2045c, textAnnotatedStringElement.f2045c) && this.f2046d == textAnnotatedStringElement.f2046d && this.f2054m == textAnnotatedStringElement.f2054m && this.f2047e == textAnnotatedStringElement.f2047e && this.f2048f == textAnnotatedStringElement.f2048f && this.f2049g == textAnnotatedStringElement.f2049g && this.f2050h == textAnnotatedStringElement.f2050h && this.f2052k == textAnnotatedStringElement.f2052k;
    }

    @Override // v3.a1
    /* renamed from: h */
    public final AbstractC7878q mo621h() {
        C0038k c0038k = new C0038k();
        c0038k.f166q = this.f2043a;
        c0038k.f167r = this.f2044b;
        c0038k.f168s = this.f2045c;
        c0038k.f169t = this.f2046d;
        c0038k.f170v = this.f2047e;
        c0038k.f171w = this.f2048f;
        c0038k.f172x = this.f2049g;
        c0038k.f173y = this.f2050h;
        c0038k.f174z = this.f2051j;
        c0038k.f159B = this.f2052k;
        c0038k.f160C = this.f2053l;
        c0038k.f161D = this.f2054m;
        return c0038k;
    }

    public final int hashCode() {
        int iHashCode = (this.f2045c.hashCode() + ((this.f2044b.hashCode() + (this.f2043a.hashCode() * 31)) * 31)) * 31;
        InterfaceC2139c interfaceC2139c = this.f2046d;
        int iM4558e = (((AbstractC1452a.m4558e(AbstractC1452a.m4556c(this.f2047e, (iHashCode + (interfaceC2139c != null ? interfaceC2139c.hashCode() : 0)) * 31, 31), 31, this.f2048f) + this.f2049g) * 31) + this.f2050h) * 31;
        List list = this.f2051j;
        int iHashCode2 = (iM4558e + (list != null ? list.hashCode() : 0)) * 31;
        InterfaceC2139c interfaceC2139c2 = this.f2052k;
        int iHashCode3 = (iHashCode2 + (interfaceC2139c2 != null ? interfaceC2139c2.hashCode() : 0)) * 961;
        InterfaceC1566t interfaceC1566t = this.f2053l;
        int iHashCode4 = (iHashCode3 + (interfaceC1566t != null ? interfaceC1566t.hashCode() : 0)) * 31;
        InterfaceC2139c interfaceC2139c3 = this.f2054m;
        return iHashCode4 + (interfaceC2139c3 != null ? interfaceC2139c3.hashCode() : 0);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0024  */
    @Override // v3.a1
    /* renamed from: i */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void mo622i(w2.AbstractC7878q r15) {
        /*
            Method dump skipped, instructions count: 284
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.modifiers.TextAnnotatedStringElement.mo622i(w2.q):void");
    }
}
