package jy;

import fy.InterfaceC2401a;
import hy.InterfaceC3055f;
import iy.InterfaceC3364a;
import iy.InterfaceC3366c;
import iy.InterfaceC3367d;
import java.lang.annotation.Annotation;
import java.util.Arrays;
import kotlin.jvm.internal.AbstractC4154l;
import kotlinx.serialization.SerializationException;
import mm.AbstractC4801l;
import og.nd;
import qw.C6366p;
import qw.EnumC6359i;
import rw.AbstractC6662l;
import rw.C6668r;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: jy.u */
/* loaded from: classes3.dex */
public final class C3884u implements InterfaceC2401a {

    /* renamed from: a */
    public final /* synthetic */ int f19967a = 1;

    /* renamed from: b */
    public final Object f19968b;

    /* renamed from: c */
    public Object f19969c;

    /* renamed from: d */
    public final Object f19970d;

    public C3884u(String str, Object objectInstance) {
        AbstractC4154l.m8923f(objectInstance, "objectInstance");
        this.f19968b = objectInstance;
        this.f19969c = C6668r.f31943a;
        this.f19970d = nd.m10781b(EnumC6359i.PUBLICATION, new bt.i0(20, str, this));
    }

    @Override // fy.InterfaceC2401a
    public final Object deserialize(InterfaceC3366c interfaceC3366c) {
        switch (this.f19967a) {
            case 0:
                Enum[] enumArr = (Enum[]) this.f19968b;
                int iMo7703i = interfaceC3366c.mo7703i(getDescriptor());
                if (iMo7703i >= 0 && iMo7703i < enumArr.length) {
                    return enumArr[iMo7703i];
                }
                throw new SerializationException(iMo7703i + " is not among valid " + getDescriptor().mo7277a() + " enum values, values size is " + enumArr.length);
            default:
                InterfaceC3055f descriptor = getDescriptor();
                InterfaceC3364a interfaceC3364aMo7699c = interfaceC3366c.mo7699c(descriptor);
                int iMo7685o = interfaceC3364aMo7699c.mo7685o(getDescriptor());
                if (iMo7685o != -1) {
                    throw new SerializationException(AbstractC4801l.m9730d(iMo7685o, "Unexpected index "));
                }
                interfaceC3364aMo7699c.mo7680b(descriptor);
                return this.f19968b;
        }
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, qw.g] */
    @Override // fy.InterfaceC2401a
    public final InterfaceC3055f getDescriptor() {
        switch (this.f19967a) {
            case 0:
                return (InterfaceC3055f) ((C6366p) this.f19970d).getValue();
            default:
                return (InterfaceC3055f) this.f19970d.getValue();
        }
    }

    @Override // fy.InterfaceC2401a
    public final void serialize(InterfaceC3367d interfaceC3367d, Object value) {
        switch (this.f19967a) {
            case 0:
                Enum value2 = (Enum) value;
                AbstractC4154l.m8923f(value2, "value");
                Enum[] enumArr = (Enum[]) this.f19968b;
                int iM12698A = AbstractC6662l.m12698A(enumArr, value2);
                if (iM12698A != -1) {
                    interfaceC3367d.mo7720m(getDescriptor(), iM12698A);
                    return;
                }
                StringBuilder sb2 = new StringBuilder();
                sb2.append(value2);
                sb2.append(" is not a valid enum ");
                sb2.append(getDescriptor().mo7277a());
                sb2.append(", must be one of ");
                String string = Arrays.toString(enumArr);
                AbstractC4154l.m8922e(string, "toString(...)");
                sb2.append(string);
                throw new SerializationException(sb2.toString());
            default:
                AbstractC4154l.m8923f(value, "value");
                interfaceC3367d.mo7711c(getDescriptor()).mo7693b(getDescriptor());
                return;
        }
    }

    public String toString() {
        switch (this.f19967a) {
            case 0:
                return "kotlinx.serialization.internal.EnumSerializer<" + getDescriptor().mo7277a() + '>';
            default:
                return super.toString();
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C3884u(Object objectInstance, Annotation[] annotationArr) {
        this("empty", objectInstance);
        AbstractC4154l.m8923f(objectInstance, "objectInstance");
        this.f19969c = AbstractC6662l.m12711a(annotationArr);
    }

    public C3884u(String str, Enum[] values) {
        AbstractC4154l.m8923f(values, "values");
        this.f19968b = values;
        this.f19970d = nd.m10782c(new bt.i0(19, this, str));
    }
}
