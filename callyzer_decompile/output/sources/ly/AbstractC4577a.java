package ly;

import al.C0174b;
import fy.C2403c;
import fy.InterfaceC2401a;
import hy.AbstractC3054e;
import hy.C3052c;
import hy.C3059j;
import hy.C3060k;
import hy.InterfaceC3055f;
import i0.m0;
import iy.InterfaceC3364a;
import iy.InterfaceC3366c;
import java.util.ArrayList;
import java.util.NoSuchElementException;
import jy.C3889z;
import jy.r0;
import kotlin.jvm.internal.AbstractC4154l;
import kotlin.jvm.internal.a0;
import kotlinx.serialization.SerializationException;
import kotlinx.serialization.json.internal.JsonDecodingException;
import ky.AbstractC4271c;
import ky.AbstractC4281m;
import ky.AbstractC4282n;
import ky.C4273e;
import ky.C4278j;
import ky.C4286r;
import ky.C4291w;
import ky.C4294z;
import ky.InterfaceC4279k;
import ky.d0;
import nx.AbstractC5185w;
import og.pe;
import og.qf;
import pg.AbstractC5942w;
import rw.AbstractC6663m;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: ly.a */
/* loaded from: classes3.dex */
public abstract class AbstractC4577a implements InterfaceC4279k, InterfaceC3366c, InterfaceC3364a {

    /* renamed from: a */
    public final ArrayList f22701a = new ArrayList();

    /* renamed from: b */
    public boolean f22702b;

    /* renamed from: c */
    public final AbstractC4271c f22703c;

    /* renamed from: d */
    public final String f22704d;

    /* renamed from: e */
    public final C4278j f22705e;

    public AbstractC4577a(AbstractC4271c abstractC4271c, String str) {
        this.f22703c = abstractC4271c;
        this.f22704d = str;
        this.f22705e = abstractC4271c.f21667a;
    }

    @Override // iy.InterfaceC3366c
    /* renamed from: A */
    public final short mo7696A() {
        return m9410O(m9415T());
    }

    @Override // iy.InterfaceC3366c
    /* renamed from: B */
    public final float mo7697B() {
        return m9406K(m9415T());
    }

    @Override // iy.InterfaceC3364a
    /* renamed from: C */
    public final char mo7678C(r0 descriptor, int i10) {
        AbstractC4154l.m8923f(descriptor, "descriptor");
        return m9404I(m9413R(descriptor, i10));
    }

    @Override // iy.InterfaceC3366c
    /* renamed from: D */
    public final double mo7698D() {
        return m9405J(m9415T());
    }

    /* renamed from: E */
    public abstract AbstractC4281m mo9400E(String str);

    /* renamed from: F */
    public final AbstractC4281m m9401F() {
        AbstractC4281m abstractC4281mMo9400E;
        String str = (String) AbstractC6663m.m12751O(this.f22701a);
        return (str == null || (abstractC4281mMo9400E = mo9400E(str)) == null) ? mo9414S() : abstractC4281mMo9400E;
    }

    /* renamed from: G */
    public final boolean m9402G(Object obj) {
        String tag = (String) obj;
        AbstractC4154l.m8923f(tag, "tag");
        AbstractC4281m abstractC4281mMo9400E = mo9400E(tag);
        if (!(abstractC4281mMo9400E instanceof d0)) {
            throw AbstractC4585i.m9423d(-1, abstractC4281mMo9400E.toString(), "Expected " + a0.m8901a(d0.class).m8914c() + ", but had " + a0.m8901a(abstractC4281mMo9400E.getClass()).m8914c() + " as the serialized body of boolean at element: " + m9417V(tag));
        }
        d0 d0Var = (d0) abstractC4281mMo9400E;
        try {
            C3889z c3889z = AbstractC4282n.f21688a;
            String strMo8989b = d0Var.mo8989b();
            String[] strArr = AbstractC4600x.f22768a;
            AbstractC4154l.m8923f(strMo8989b, "<this>");
            Boolean bool = strMo8989b.equalsIgnoreCase("true") ? Boolean.TRUE : strMo8989b.equalsIgnoreCase("false") ? Boolean.FALSE : null;
            if (bool != null) {
                return bool.booleanValue();
            }
            m9418W(d0Var, "boolean", tag);
            throw null;
        } catch (IllegalArgumentException unused) {
            m9418W(d0Var, "boolean", tag);
            throw null;
        }
    }

    /* renamed from: H */
    public final byte m9403H(Object obj) {
        String tag = (String) obj;
        AbstractC4154l.m8923f(tag, "tag");
        AbstractC4281m abstractC4281mMo9400E = mo9400E(tag);
        if (!(abstractC4281mMo9400E instanceof d0)) {
            throw AbstractC4585i.m9423d(-1, abstractC4281mMo9400E.toString(), "Expected " + a0.m8901a(d0.class).m8914c() + ", but had " + a0.m8901a(abstractC4281mMo9400E.getClass()).m8914c() + " as the serialized body of byte at element: " + m9417V(tag));
        }
        d0 d0Var = (d0) abstractC4281mMo9400E;
        try {
            int iM8991a = AbstractC4282n.m8991a(d0Var);
            Byte bValueOf = (-128 > iM8991a || iM8991a > 127) ? null : Byte.valueOf((byte) iM8991a);
            if (bValueOf != null) {
                return bValueOf.byteValue();
            }
            m9418W(d0Var, "byte", tag);
            throw null;
        } catch (IllegalArgumentException unused) {
            m9418W(d0Var, "byte", tag);
            throw null;
        }
    }

    /* renamed from: I */
    public final char m9404I(Object obj) {
        String tag = (String) obj;
        AbstractC4154l.m8923f(tag, "tag");
        AbstractC4281m abstractC4281mMo9400E = mo9400E(tag);
        if (!(abstractC4281mMo9400E instanceof d0)) {
            throw AbstractC4585i.m9423d(-1, abstractC4281mMo9400E.toString(), "Expected " + a0.m8901a(d0.class).m8914c() + ", but had " + a0.m8901a(abstractC4281mMo9400E.getClass()).m8914c() + " as the serialized body of char at element: " + m9417V(tag));
        }
        d0 d0Var = (d0) abstractC4281mMo9400E;
        try {
            String strMo8989b = d0Var.mo8989b();
            AbstractC4154l.m8923f(strMo8989b, "<this>");
            int length = strMo8989b.length();
            if (length == 0) {
                throw new NoSuchElementException("Char sequence is empty.");
            }
            if (length == 1) {
                return strMo8989b.charAt(0);
            }
            throw new IllegalArgumentException("Char sequence has more than one element.");
        } catch (IllegalArgumentException unused) {
            m9418W(d0Var, "char", tag);
            throw null;
        }
    }

    /* renamed from: J */
    public final double m9405J(Object obj) throws NumberFormatException {
        String tag = (String) obj;
        AbstractC4154l.m8923f(tag, "tag");
        AbstractC4281m abstractC4281mMo9400E = mo9400E(tag);
        if (!(abstractC4281mMo9400E instanceof d0)) {
            throw AbstractC4585i.m9423d(-1, abstractC4281mMo9400E.toString(), "Expected " + a0.m8901a(d0.class).m8914c() + ", but had " + a0.m8901a(abstractC4281mMo9400E.getClass()).m8914c() + " as the serialized body of double at element: " + m9417V(tag));
        }
        d0 d0Var = (d0) abstractC4281mMo9400E;
        try {
            C3889z c3889z = AbstractC4282n.f21688a;
            double d2 = Double.parseDouble(d0Var.mo8989b());
            C4278j c4278j = this.f22703c.f21667a;
            if (Double.isInfinite(d2) || Double.isNaN(d2)) {
                throw AbstractC4585i.m9420a(Double.valueOf(d2), tag, m9401F().toString());
            }
            return d2;
        } catch (IllegalArgumentException unused) {
            m9418W(d0Var, "double", tag);
            throw null;
        }
    }

    /* renamed from: K */
    public final float m9406K(Object obj) throws NumberFormatException {
        String tag = (String) obj;
        AbstractC4154l.m8923f(tag, "tag");
        AbstractC4281m abstractC4281mMo9400E = mo9400E(tag);
        if (!(abstractC4281mMo9400E instanceof d0)) {
            throw AbstractC4585i.m9423d(-1, abstractC4281mMo9400E.toString(), "Expected " + a0.m8901a(d0.class).m8914c() + ", but had " + a0.m8901a(abstractC4281mMo9400E.getClass()).m8914c() + " as the serialized body of float at element: " + m9417V(tag));
        }
        d0 d0Var = (d0) abstractC4281mMo9400E;
        try {
            C3889z c3889z = AbstractC4282n.f21688a;
            float f6 = Float.parseFloat(d0Var.mo8989b());
            C4278j c4278j = this.f22703c.f21667a;
            if (Float.isInfinite(f6) || Float.isNaN(f6)) {
                throw AbstractC4585i.m9420a(Float.valueOf(f6), tag, m9401F().toString());
            }
            return f6;
        } catch (IllegalArgumentException unused) {
            m9418W(d0Var, "float", tag);
            throw null;
        }
    }

    /* renamed from: L */
    public final InterfaceC3366c m9407L(Object obj, InterfaceC3055f inlineDescriptor) {
        String tag = (String) obj;
        AbstractC4154l.m8923f(tag, "tag");
        AbstractC4154l.m8923f(inlineDescriptor, "inlineDescriptor");
        if (!AbstractC4598v.m9445a(inlineDescriptor)) {
            this.f22701a.add(tag);
            return this;
        }
        AbstractC4281m abstractC4281mMo9400E = mo9400E(tag);
        String strMo7277a = inlineDescriptor.mo7277a();
        if (abstractC4281mMo9400E instanceof d0) {
            String source = ((d0) abstractC4281mMo9400E).mo8989b();
            AbstractC4271c json = this.f22703c;
            AbstractC4154l.m8923f(json, "json");
            AbstractC4154l.m8923f(source, "source");
            return new C4583g(new C4599w(source), json);
        }
        throw AbstractC4585i.m9423d(-1, abstractC4281mMo9400E.toString(), "Expected " + a0.m8901a(d0.class).m8914c() + ", but had " + a0.m8901a(abstractC4281mMo9400E.getClass()).m8914c() + " as the serialized body of " + strMo7277a + " at element: " + m9417V(tag));
    }

    /* renamed from: M */
    public final int m9408M(Object obj) {
        String tag = (String) obj;
        AbstractC4154l.m8923f(tag, "tag");
        AbstractC4281m abstractC4281mMo9400E = mo9400E(tag);
        if (abstractC4281mMo9400E instanceof d0) {
            d0 d0Var = (d0) abstractC4281mMo9400E;
            try {
                return AbstractC4282n.m8991a(d0Var);
            } catch (IllegalArgumentException unused) {
                m9418W(d0Var, "int", tag);
                throw null;
            }
        }
        throw AbstractC4585i.m9423d(-1, abstractC4281mMo9400E.toString(), "Expected " + a0.m8901a(d0.class).m8914c() + ", but had " + a0.m8901a(abstractC4281mMo9400E.getClass()).m8914c() + " as the serialized body of int at element: " + m9417V(tag));
    }

    /* renamed from: N */
    public final long m9409N(Object obj) {
        String tag = (String) obj;
        AbstractC4154l.m8923f(tag, "tag");
        AbstractC4281m abstractC4281mMo9400E = mo9400E(tag);
        if (abstractC4281mMo9400E instanceof d0) {
            d0 d0Var = (d0) abstractC4281mMo9400E;
            try {
                C3889z c3889z = AbstractC4282n.f21688a;
                try {
                    return new C4599w(d0Var.mo8989b()).m9457i();
                } catch (JsonDecodingException e2) {
                    throw new NumberFormatException(e2.getMessage());
                }
            } catch (IllegalArgumentException unused) {
                m9418W(d0Var, "long", tag);
                throw null;
            }
        }
        throw AbstractC4585i.m9423d(-1, abstractC4281mMo9400E.toString(), "Expected " + a0.m8901a(d0.class).m8914c() + ", but had " + a0.m8901a(abstractC4281mMo9400E.getClass()).m8914c() + " as the serialized body of long at element: " + m9417V(tag));
    }

    /* renamed from: O */
    public final short m9410O(Object obj) {
        String tag = (String) obj;
        AbstractC4154l.m8923f(tag, "tag");
        AbstractC4281m abstractC4281mMo9400E = mo9400E(tag);
        if (!(abstractC4281mMo9400E instanceof d0)) {
            throw AbstractC4585i.m9423d(-1, abstractC4281mMo9400E.toString(), "Expected " + a0.m8901a(d0.class).m8914c() + ", but had " + a0.m8901a(abstractC4281mMo9400E.getClass()).m8914c() + " as the serialized body of short at element: " + m9417V(tag));
        }
        d0 d0Var = (d0) abstractC4281mMo9400E;
        try {
            int iM8991a = AbstractC4282n.m8991a(d0Var);
            Short shValueOf = (-32768 > iM8991a || iM8991a > 32767) ? null : Short.valueOf((short) iM8991a);
            if (shValueOf != null) {
                return shValueOf.shortValue();
            }
            m9418W(d0Var, "short", tag);
            throw null;
        } catch (IllegalArgumentException unused) {
            m9418W(d0Var, "short", tag);
            throw null;
        }
    }

    /* renamed from: P */
    public final String m9411P(Object obj) {
        String tag = (String) obj;
        AbstractC4154l.m8923f(tag, "tag");
        AbstractC4281m abstractC4281mMo9400E = mo9400E(tag);
        if (!(abstractC4281mMo9400E instanceof d0)) {
            throw AbstractC4585i.m9423d(-1, abstractC4281mMo9400E.toString(), "Expected " + a0.m8901a(d0.class).m8914c() + ", but had " + a0.m8901a(abstractC4281mMo9400E.getClass()).m8914c() + " as the serialized body of string at element: " + m9417V(tag));
        }
        d0 d0Var = (d0) abstractC4281mMo9400E;
        if (!(d0Var instanceof C4286r)) {
            StringBuilder sbM7383p = m0.m7383p("Expected string value for a non-null key '", tag, "', got null literal instead at element: ");
            sbM7383p.append(m9417V(tag));
            throw AbstractC4585i.m9423d(-1, m9401F().toString(), sbM7383p.toString());
        }
        C4286r c4286r = (C4286r) d0Var;
        if (c4286r.f21692a) {
            return c4286r.f21693b;
        }
        C4278j c4278j = this.f22703c.f21667a;
        StringBuilder sbM7383p2 = m0.m7383p("String literal for key '", tag, "' should be quoted at element: ");
        sbM7383p2.append(m9417V(tag));
        sbM7383p2.append(".\nUse 'isLenient = true' in 'Json {}' builder to accept non-compliant JSON.");
        throw AbstractC4585i.m9423d(-1, m9401F().toString(), sbM7383p2.toString());
    }

    /* renamed from: Q */
    public String mo9412Q(InterfaceC3055f descriptor, int i10) {
        AbstractC4154l.m8923f(descriptor, "descriptor");
        return descriptor.mo7282g(i10);
    }

    /* renamed from: R */
    public final String m9413R(InterfaceC3055f interfaceC3055f, int i10) {
        AbstractC4154l.m8923f(interfaceC3055f, "<this>");
        String nestedName = mo9412Q(interfaceC3055f, i10);
        AbstractC4154l.m8923f(nestedName, "nestedName");
        return nestedName;
    }

    /* renamed from: S */
    public abstract AbstractC4281m mo9414S();

    /* renamed from: T */
    public final Object m9415T() {
        ArrayList arrayList = this.f22701a;
        Object objRemove = arrayList.remove(pe.m10832g(arrayList));
        this.f22702b = true;
        return objRemove;
    }

    /* renamed from: U */
    public final String m9416U() {
        ArrayList arrayList = this.f22701a;
        return arrayList.isEmpty() ? "$" : AbstractC6663m.m12748L(arrayList, ".", "$.", null, null, 60);
    }

    /* renamed from: V */
    public final String m9417V(String currentTag) {
        AbstractC4154l.m8923f(currentTag, "currentTag");
        return m9416U() + '.' + currentTag;
    }

    /* renamed from: W */
    public final void m9418W(d0 d0Var, String str, String str2) {
        throw AbstractC4585i.m9423d(-1, m9401F().toString(), "Failed to parse literal '" + d0Var + "' as " + (AbstractC5185w.m10138t(str, "i", false) ? "an " : "a ").concat(str) + " value at element: " + m9417V(str2));
    }

    @Override // iy.InterfaceC3364a
    /* renamed from: a */
    public final C0174b mo7679a() {
        return this.f22703c.f21668b;
    }

    @Override // iy.InterfaceC3364a
    /* renamed from: b */
    public void mo7680b(InterfaceC3055f descriptor) {
        AbstractC4154l.m8923f(descriptor, "descriptor");
    }

    @Override // iy.InterfaceC3366c
    /* renamed from: c */
    public InterfaceC3364a mo7699c(InterfaceC3055f descriptor) {
        AbstractC4154l.m8923f(descriptor, "descriptor");
        AbstractC4281m abstractC4281mM9401F = m9401F();
        AbstractC5942w abstractC5942wMo7280e = descriptor.mo7280e();
        boolean zM8918a = AbstractC4154l.m8918a(abstractC5942wMo7280e, C3060k.f16414c);
        AbstractC4271c abstractC4271c = this.f22703c;
        if (zM8918a || (abstractC5942wMo7280e instanceof C3052c)) {
            String strMo7277a = descriptor.mo7277a();
            if (abstractC4281mM9401F instanceof C4273e) {
                return new C4589m(abstractC4271c, (C4273e) abstractC4281mM9401F);
            }
            throw AbstractC4585i.m9423d(-1, abstractC4281mM9401F.toString(), "Expected " + a0.m8901a(C4273e.class).m8914c() + ", but had " + a0.m8901a(abstractC4281mM9401F.getClass()).m8914c() + " as the serialized body of " + strMo7277a + " at element: " + m9416U());
        }
        if (!AbstractC4154l.m8918a(abstractC5942wMo7280e, C3060k.f16415d)) {
            String strMo7277a2 = descriptor.mo7277a();
            if (abstractC4281mM9401F instanceof C4294z) {
                return new C4588l(abstractC4271c, (C4294z) abstractC4281mM9401F, this.f22704d, 8);
            }
            throw AbstractC4585i.m9423d(-1, abstractC4281mM9401F.toString(), "Expected " + a0.m8901a(C4294z.class).m8914c() + ", but had " + a0.m8901a(abstractC4281mM9401F.getClass()).m8914c() + " as the serialized body of " + strMo7277a2 + " at element: " + m9416U());
        }
        InterfaceC3055f interfaceC3055fM9426g = AbstractC4585i.m9426g(descriptor.mo7284i(0), abstractC4271c.f21668b);
        AbstractC5942w abstractC5942wMo7280e2 = interfaceC3055fM9426g.mo7280e();
        if (!(abstractC5942wMo7280e2 instanceof AbstractC3054e) && !AbstractC4154l.m8918a(abstractC5942wMo7280e2, C3059j.f16412b)) {
            throw AbstractC4585i.m9422c(interfaceC3055fM9426g);
        }
        String strMo7277a3 = descriptor.mo7277a();
        if (abstractC4281mM9401F instanceof C4294z) {
            return new C4590n(abstractC4271c, (C4294z) abstractC4281mM9401F);
        }
        throw AbstractC4585i.m9423d(-1, abstractC4281mM9401F.toString(), "Expected " + a0.m8901a(C4294z.class).m8914c() + ", but had " + a0.m8901a(abstractC4281mM9401F.getClass()).m8914c() + " as the serialized body of " + strMo7277a3 + " at element: " + m9416U());
    }

    @Override // iy.InterfaceC3364a
    /* renamed from: d */
    public final String mo7681d(InterfaceC3055f descriptor, int i10) {
        AbstractC4154l.m8923f(descriptor, "descriptor");
        return m9411P(m9413R(descriptor, i10));
    }

    @Override // iy.InterfaceC3366c
    /* renamed from: e */
    public final InterfaceC3366c mo7700e(InterfaceC3055f descriptor) {
        AbstractC4154l.m8923f(descriptor, "descriptor");
        if (AbstractC6663m.m12751O(this.f22701a) != null) {
            return m9407L(m9415T(), descriptor);
        }
        return new C4587k(this.f22703c, mo9414S(), this.f22704d).mo7700e(descriptor);
    }

    @Override // iy.InterfaceC3366c
    /* renamed from: f */
    public final boolean mo7701f() {
        return m9402G(m9415T());
    }

    @Override // iy.InterfaceC3366c
    /* renamed from: g */
    public final char mo7702g() {
        return m9404I(m9415T());
    }

    @Override // iy.InterfaceC3364a
    /* renamed from: h */
    public final boolean mo7682h(InterfaceC3055f descriptor, int i10) {
        AbstractC4154l.m8923f(descriptor, "descriptor");
        return m9402G(m9413R(descriptor, i10));
    }

    @Override // iy.InterfaceC3366c
    /* renamed from: i */
    public final int mo7703i(InterfaceC3055f enumDescriptor) {
        AbstractC4154l.m8923f(enumDescriptor, "enumDescriptor");
        String tag = (String) m9415T();
        AbstractC4154l.m8923f(tag, "tag");
        AbstractC4281m abstractC4281mMo9400E = mo9400E(tag);
        String strMo7277a = enumDescriptor.mo7277a();
        if (abstractC4281mMo9400E instanceof d0) {
            return AbstractC4585i.m9431l(enumDescriptor, this.f22703c, ((d0) abstractC4281mMo9400E).mo8989b(), "");
        }
        throw AbstractC4585i.m9423d(-1, abstractC4281mMo9400E.toString(), "Expected " + a0.m8901a(d0.class).m8914c() + ", but had " + a0.m8901a(abstractC4281mMo9400E.getClass()).m8914c() + " as the serialized body of " + strMo7277a + " at element: " + m9417V(tag));
    }

    @Override // ky.InterfaceC4279k
    /* renamed from: j */
    public final AbstractC4281m mo8990j() {
        return m9401F();
    }

    @Override // iy.InterfaceC3366c
    /* renamed from: k */
    public final int mo7704k() {
        return m9408M(m9415T());
    }

    @Override // iy.InterfaceC3364a
    /* renamed from: l */
    public final byte mo7683l(r0 descriptor, int i10) {
        AbstractC4154l.m8923f(descriptor, "descriptor");
        return m9403H(m9413R(descriptor, i10));
    }

    @Override // iy.InterfaceC3364a
    /* renamed from: m */
    public final int mo7684m(InterfaceC3055f descriptor, int i10) {
        AbstractC4154l.m8923f(descriptor, "descriptor");
        return m9408M(m9413R(descriptor, i10));
    }

    @Override // iy.InterfaceC3366c
    /* renamed from: n */
    public final String mo7705n() {
        return m9411P(m9415T());
    }

    @Override // iy.InterfaceC3366c
    /* renamed from: p */
    public final long mo7706p() {
        return m9409N(m9415T());
    }

    @Override // iy.InterfaceC3366c
    /* renamed from: q */
    public boolean mo7707q() {
        return !(m9401F() instanceof C4291w);
    }

    @Override // iy.InterfaceC3364a
    /* renamed from: r */
    public final InterfaceC3366c mo7686r(r0 descriptor, int i10) {
        AbstractC4154l.m8923f(descriptor, "descriptor");
        return m9407L(m9413R(descriptor, i10), descriptor.mo7284i(i10));
    }

    @Override // iy.InterfaceC3364a
    /* renamed from: s */
    public final Object mo7687s(InterfaceC3055f descriptor, int i10, InterfaceC2401a deserializer, Object obj) {
        AbstractC4154l.m8923f(descriptor, "descriptor");
        AbstractC4154l.m8923f(deserializer, "deserializer");
        this.f22701a.add(m9413R(descriptor, i10));
        Object objMo7708v = (deserializer.getDescriptor().mo7278c() || mo7707q()) ? mo7708v(deserializer) : null;
        if (!this.f22702b) {
            m9415T();
        }
        this.f22702b = false;
        return objMo7708v;
    }

    @Override // iy.InterfaceC3364a
    /* renamed from: t */
    public final float mo7688t(r0 descriptor, int i10) {
        AbstractC4154l.m8923f(descriptor, "descriptor");
        return m9406K(m9413R(descriptor, i10));
    }

    @Override // iy.InterfaceC3364a
    /* renamed from: u */
    public final Object mo7689u(InterfaceC3055f descriptor, int i10, InterfaceC2401a deserializer, Object obj) {
        AbstractC4154l.m8923f(descriptor, "descriptor");
        AbstractC4154l.m8923f(deserializer, "deserializer");
        this.f22701a.add(m9413R(descriptor, i10));
        AbstractC4154l.m8923f(deserializer, "deserializer");
        Object objMo7708v = mo7708v(deserializer);
        if (!this.f22702b) {
            m9415T();
        }
        this.f22702b = false;
        return objMo7708v;
    }

    @Override // iy.InterfaceC3366c
    /* renamed from: v */
    public final Object mo7708v(InterfaceC2401a deserializer) {
        AbstractC4154l.m8923f(deserializer, "deserializer");
        if (!(deserializer instanceof C2403c)) {
            return deserializer.deserialize(this);
        }
        AbstractC4271c abstractC4271c = this.f22703c;
        C4278j c4278j = abstractC4271c.f21667a;
        C2403c c2403c = (C2403c) deserializer;
        String strM9428i = AbstractC4585i.m9428i(c2403c.getDescriptor(), abstractC4271c);
        AbstractC4281m abstractC4281mM9401F = m9401F();
        String strMo7277a = c2403c.getDescriptor().mo7277a();
        if (!(abstractC4281mM9401F instanceof C4294z)) {
            throw AbstractC4585i.m9423d(-1, abstractC4281mM9401F.toString(), "Expected " + a0.m8901a(C4294z.class).m8914c() + ", but had " + a0.m8901a(abstractC4281mM9401F.getClass()).m8914c() + " as the serialized body of " + strMo7277a + " at element: " + m9416U());
        }
        C4294z c4294z = (C4294z) abstractC4281mM9401F;
        AbstractC4281m abstractC4281m = (AbstractC4281m) c4294z.get(strM9428i);
        String strMo8989b = null;
        if (abstractC4281m != null) {
            d0 d0VarM8992b = AbstractC4282n.m8992b(abstractC4281m);
            if (!(d0VarM8992b instanceof C4291w)) {
                strMo8989b = d0VarM8992b.mo8989b();
            }
        }
        try {
            return AbstractC4585i.m9435p(abstractC4271c, strM9428i, c4294z, qf.m10863a((C2403c) deserializer, this, strMo8989b));
        } catch (SerializationException e2) {
            String message = e2.getMessage();
            AbstractC4154l.m8920c(message);
            throw AbstractC4585i.m9423d(-1, c4294z.toString(), message);
        }
    }

    @Override // iy.InterfaceC3364a
    /* renamed from: w */
    public final short mo7690w(r0 descriptor, int i10) {
        AbstractC4154l.m8923f(descriptor, "descriptor");
        return m9410O(m9413R(descriptor, i10));
    }

    @Override // iy.InterfaceC3366c
    /* renamed from: x */
    public final byte mo7709x() {
        return m9403H(m9415T());
    }

    @Override // iy.InterfaceC3364a
    /* renamed from: y */
    public final long mo7691y(InterfaceC3055f descriptor, int i10) {
        AbstractC4154l.m8923f(descriptor, "descriptor");
        return m9409N(m9413R(descriptor, i10));
    }

    @Override // iy.InterfaceC3364a
    /* renamed from: z */
    public final double mo7692z(r0 descriptor, int i10) {
        AbstractC4154l.m8923f(descriptor, "descriptor");
        return m9405J(m9413R(descriptor, i10));
    }
}
