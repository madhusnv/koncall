package androidx.compose.foundation.text.modifiers;

import a2.C0041n;
import com.sun.mail.util.AbstractC1452a;
import d3.InterfaceC1566t;
import g4.o0;
import k4.InterfaceC3987h;
import kotlin.jvm.internal.AbstractC4154l;
import v3.a1;
import w2.AbstractC7878q;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class TextStringSimpleElement extends a1 {

    /* renamed from: a */
    public final String f2055a;

    /* renamed from: b */
    public final o0 f2056b;

    /* renamed from: c */
    public final InterfaceC3987h f2057c;

    /* renamed from: d */
    public final int f2058d;

    /* renamed from: e */
    public final boolean f2059e;

    /* renamed from: f */
    public final int f2060f;

    /* renamed from: g */
    public final int f2061g;

    /* renamed from: h */
    public final InterfaceC1566t f2062h;

    public TextStringSimpleElement(String str, o0 o0Var, InterfaceC3987h interfaceC3987h, int i10, boolean z6, int i11, int i12, InterfaceC1566t interfaceC1566t) {
        this.f2055a = str;
        this.f2056b = o0Var;
        this.f2057c = interfaceC3987h;
        this.f2058d = i10;
        this.f2059e = z6;
        this.f2060f = i11;
        this.f2061g = i12;
        this.f2062h = interfaceC1566t;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TextStringSimpleElement)) {
            return false;
        }
        TextStringSimpleElement textStringSimpleElement = (TextStringSimpleElement) obj;
        return AbstractC4154l.m8918a(this.f2062h, textStringSimpleElement.f2062h) && AbstractC4154l.m8918a(this.f2055a, textStringSimpleElement.f2055a) && AbstractC4154l.m8918a(this.f2056b, textStringSimpleElement.f2056b) && AbstractC4154l.m8918a(this.f2057c, textStringSimpleElement.f2057c) && this.f2058d == textStringSimpleElement.f2058d && this.f2059e == textStringSimpleElement.f2059e && this.f2060f == textStringSimpleElement.f2060f && this.f2061g == textStringSimpleElement.f2061g;
    }

    @Override // v3.a1
    /* renamed from: h */
    public final AbstractC7878q mo621h() {
        C0041n c0041n = new C0041n();
        c0041n.f184q = this.f2055a;
        c0041n.f185r = this.f2056b;
        c0041n.f186s = this.f2057c;
        c0041n.f187t = this.f2058d;
        c0041n.f188v = this.f2059e;
        c0041n.f189w = this.f2060f;
        c0041n.f190x = this.f2061g;
        c0041n.f191y = this.f2062h;
        return c0041n;
    }

    public final int hashCode() {
        int iM4558e = (((AbstractC1452a.m4558e(AbstractC1452a.m4556c(this.f2058d, (this.f2057c.hashCode() + ((this.f2056b.hashCode() + (this.f2055a.hashCode() * 31)) * 31)) * 31, 31), 31, this.f2059e) + this.f2060f) * 31) + this.f2061g) * 31;
        InterfaceC1566t interfaceC1566t = this.f2062h;
        return iM4558e + (interfaceC1566t != null ? interfaceC1566t.hashCode() : 0);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0026  */
    @Override // v3.a1
    /* renamed from: i */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void mo622i(w2.AbstractC7878q r12) {
        /*
            r11 = this;
            a2.n r12 = (a2.C0041n) r12
            d3.t r0 = r12.f191y
            d3.t r1 = r11.f2062h
            boolean r0 = kotlin.jvm.internal.AbstractC4154l.m8918a(r1, r0)
            r12.f191y = r1
            r1 = 0
            r2 = 1
            g4.o0 r3 = r11.f2056b
            if (r0 == 0) goto L26
            g4.o0 r0 = r12.f185r
            if (r3 == r0) goto L21
            g4.g0 r4 = r3.f13688a
            g4.g0 r0 = r0.f13688a
            boolean r0 = r4.m6432b(r0)
            if (r0 == 0) goto L26
            goto L24
        L21:
            r3.getClass()
        L24:
            r0 = r1
            goto L27
        L26:
            r0 = r2
        L27:
            java.lang.String r4 = r12.f184q
            java.lang.String r5 = r11.f2055a
            boolean r4 = kotlin.jvm.internal.AbstractC4154l.m8918a(r4, r5)
            if (r4 == 0) goto L32
            goto L38
        L32:
            r12.f184q = r5
            r1 = 0
            r12.f183D = r1
            r1 = r2
        L38:
            g4.o0 r4 = r12.f185r
            boolean r4 = r4.m6464c(r3)
            r4 = r4 ^ r2
            r12.f185r = r3
            int r3 = r12.f190x
            int r5 = r11.f2061g
            if (r3 == r5) goto L4a
            r12.f190x = r5
            r4 = r2
        L4a:
            int r3 = r12.f189w
            int r5 = r11.f2060f
            if (r3 == r5) goto L53
            r12.f189w = r5
            r4 = r2
        L53:
            boolean r3 = r12.f188v
            boolean r5 = r11.f2059e
            if (r3 == r5) goto L5c
            r12.f188v = r5
            r4 = r2
        L5c:
            k4.h r3 = r12.f186s
            k4.h r5 = r11.f2057c
            boolean r3 = kotlin.jvm.internal.AbstractC4154l.m8918a(r3, r5)
            if (r3 != 0) goto L69
            r12.f186s = r5
            r4 = r2
        L69:
            int r3 = r12.f187t
            int r5 = r11.f2058d
            if (r3 != r5) goto L71
            r2 = r4
            goto L73
        L71:
            r12.f187t = r5
        L73:
            if (r1 != 0) goto L77
            if (r2 == 0) goto L9a
        L77:
            a2.f r3 = r12.L0()
            java.lang.String r4 = r12.f184q
            g4.o0 r5 = r12.f185r
            k4.h r6 = r12.f186s
            int r7 = r12.f187t
            boolean r8 = r12.f188v
            int r9 = r12.f189w
            int r10 = r12.f190x
            r3.f131a = r4
            r3.f132b = r5
            r3.f133c = r6
            r3.f134d = r7
            r3.f135e = r8
            r3.f136f = r9
            r3.f137g = r10
            r3.m143b()
        L9a:
            boolean r3 = r12.f37683p
            if (r3 != 0) goto L9f
            goto Lb9
        L9f:
            if (r1 != 0) goto La7
            if (r0 == 0) goto Laa
            a2.m r3 = r12.f182C
            if (r3 == 0) goto Laa
        La7:
            v3.AbstractC7634f.m14554o(r12)
        Laa:
            if (r1 != 0) goto Lae
            if (r2 == 0) goto Lb4
        Lae:
            v3.AbstractC7634f.m14553n(r12)
            v3.AbstractC7634f.m14552m(r12)
        Lb4:
            if (r0 == 0) goto Lb9
            v3.AbstractC7634f.m14552m(r12)
        Lb9:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.modifiers.TextStringSimpleElement.mo622i(w2.q):void");
    }
}
