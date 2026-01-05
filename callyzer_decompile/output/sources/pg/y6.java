package pg;

import fy.InterfaceC2401a;
import hy.InterfaceC3055f;
import iy.InterfaceC3364a;
import iy.InterfaceC3366c;
import kotlin.jvm.internal.AbstractC4154l;
import kotlinx.serialization.SerializationException;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public abstract class y6 implements InterfaceC3366c, InterfaceC3364a {

    /* renamed from: a */
    public static final /* synthetic */ int f29122a = 0;

    @Override // iy.InterfaceC3366c
    /* renamed from: A */
    public abstract short mo7696A();

    @Override // iy.InterfaceC3366c
    /* renamed from: B */
    public float mo7697B() {
        m11944E();
        throw null;
    }

    @Override // iy.InterfaceC3364a
    /* renamed from: C */
    public char mo7678C(jy.r0 descriptor, int i10) {
        AbstractC4154l.m8923f(descriptor, "descriptor");
        return mo7702g();
    }

    @Override // iy.InterfaceC3366c
    /* renamed from: D */
    public double mo7698D() {
        m11944E();
        throw null;
    }

    /* renamed from: E */
    public void m11944E() {
        throw new SerializationException(kotlin.jvm.internal.a0.m8901a(getClass()) + " can't retrieve untyped values");
    }

    /* renamed from: b */
    public void mo7680b(InterfaceC3055f descriptor) {
        AbstractC4154l.m8923f(descriptor, "descriptor");
    }

    @Override // iy.InterfaceC3366c
    /* renamed from: c */
    public InterfaceC3364a mo7699c(InterfaceC3055f descriptor) {
        AbstractC4154l.m8923f(descriptor, "descriptor");
        return this;
    }

    @Override // iy.InterfaceC3364a
    /* renamed from: d */
    public String mo7681d(InterfaceC3055f descriptor, int i10) {
        AbstractC4154l.m8923f(descriptor, "descriptor");
        return mo7705n();
    }

    @Override // iy.InterfaceC3366c
    /* renamed from: e */
    public InterfaceC3366c mo7700e(InterfaceC3055f descriptor) {
        AbstractC4154l.m8923f(descriptor, "descriptor");
        return this;
    }

    @Override // iy.InterfaceC3366c
    /* renamed from: f */
    public boolean mo7701f() {
        m11944E();
        throw null;
    }

    @Override // iy.InterfaceC3366c
    /* renamed from: g */
    public char mo7702g() {
        m11944E();
        throw null;
    }

    @Override // iy.InterfaceC3364a
    /* renamed from: h */
    public boolean mo7682h(InterfaceC3055f descriptor, int i10) {
        AbstractC4154l.m8923f(descriptor, "descriptor");
        return mo7701f();
    }

    @Override // iy.InterfaceC3366c
    /* renamed from: i */
    public int mo7703i(InterfaceC3055f enumDescriptor) {
        AbstractC4154l.m8923f(enumDescriptor, "enumDescriptor");
        m11944E();
        throw null;
    }

    @Override // iy.InterfaceC3366c
    /* renamed from: k */
    public abstract int mo7704k();

    @Override // iy.InterfaceC3364a
    /* renamed from: l */
    public byte mo7683l(jy.r0 descriptor, int i10) {
        AbstractC4154l.m8923f(descriptor, "descriptor");
        return mo7709x();
    }

    @Override // iy.InterfaceC3364a
    /* renamed from: m */
    public int mo7684m(InterfaceC3055f descriptor, int i10) {
        AbstractC4154l.m8923f(descriptor, "descriptor");
        return mo7704k();
    }

    @Override // iy.InterfaceC3366c
    /* renamed from: n */
    public String mo7705n() {
        m11944E();
        throw null;
    }

    @Override // iy.InterfaceC3366c
    /* renamed from: p */
    public abstract long mo7706p();

    @Override // iy.InterfaceC3366c
    /* renamed from: q */
    public boolean mo7707q() {
        return true;
    }

    @Override // iy.InterfaceC3364a
    /* renamed from: r */
    public InterfaceC3366c mo7686r(jy.r0 descriptor, int i10) {
        AbstractC4154l.m8923f(descriptor, "descriptor");
        return mo7700e(descriptor.mo7284i(i10));
    }

    @Override // iy.InterfaceC3364a
    /* renamed from: s */
    public Object mo7687s(InterfaceC3055f descriptor, int i10, InterfaceC2401a deserializer, Object obj) {
        AbstractC4154l.m8923f(descriptor, "descriptor");
        AbstractC4154l.m8923f(deserializer, "deserializer");
        if (deserializer.getDescriptor().mo7278c() || mo7707q()) {
            return mo7708v(deserializer);
        }
        return null;
    }

    @Override // iy.InterfaceC3364a
    /* renamed from: t */
    public float mo7688t(jy.r0 descriptor, int i10) {
        AbstractC4154l.m8923f(descriptor, "descriptor");
        return mo7697B();
    }

    /* renamed from: u */
    public Object mo7689u(InterfaceC3055f descriptor, int i10, InterfaceC2401a deserializer, Object obj) {
        AbstractC4154l.m8923f(descriptor, "descriptor");
        AbstractC4154l.m8923f(deserializer, "deserializer");
        return mo7708v(deserializer);
    }

    @Override // iy.InterfaceC3366c
    /* renamed from: v */
    public Object mo7708v(InterfaceC2401a deserializer) {
        AbstractC4154l.m8923f(deserializer, "deserializer");
        return deserializer.deserialize(this);
    }

    @Override // iy.InterfaceC3364a
    /* renamed from: w */
    public short mo7690w(jy.r0 descriptor, int i10) {
        AbstractC4154l.m8923f(descriptor, "descriptor");
        return mo7696A();
    }

    @Override // iy.InterfaceC3366c
    /* renamed from: x */
    public abstract byte mo7709x();

    @Override // iy.InterfaceC3364a
    /* renamed from: y */
    public long mo7691y(InterfaceC3055f descriptor, int i10) {
        AbstractC4154l.m8923f(descriptor, "descriptor");
        return mo7706p();
    }

    @Override // iy.InterfaceC3364a
    /* renamed from: z */
    public double mo7692z(jy.r0 descriptor, int i10) {
        AbstractC4154l.m8923f(descriptor, "descriptor");
        return mo7698D();
    }
}
